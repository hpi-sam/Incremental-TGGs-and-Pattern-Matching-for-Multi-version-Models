package de.mdelab.mlsdm.interpreter.searchModel.history;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.expressions.interpreter.core.ExpressionInterpreterManager;
import de.mdelab.expressions.interpreter.core.ExpressionsInterpreterException;
import de.mdelab.expressions.interpreter.core.variables.Variable;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.Interval;
import de.mdelab.mlexpressions.MLExpression;
import de.mdelab.mlsdm.Activity;
import de.mdelab.mlsdm.ActivityEdge;
import de.mdelab.mlsdm.ActivityNode;
import de.mdelab.mlsdm.interpreter.searchModel.MLSDMSearchModelBasedInterpreter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMSearchModelBasedMatcher;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMSearchModelBuilder;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.strategy.MLSDMStrategyFactory;
import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.facade.MetamodelFacadeFactory;
import de.mdelab.sdm.interpreter.core.notifications.NotificationEmitter;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.MatchMultipleNodesMatchingTransaction;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.MatchSingleNodeMatchingTransaction;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.MatchingAction;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.PatternConstraint;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.PatternNode;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.SearchModelMatchingTransaction;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.expressions.ExpressionAnalyzerManager;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.strategy.OrderProducingSelectionStrategy;
import de.mdelab.sdm.interpreter.core.variables.NotifierVariablesScope;

public class MLSDMHistoryAwareMatcher extends MLSDMSearchModelBasedMatcher {

	private static final String MATCHING_INTERVAL_VARIABLE_NAME = "_matchingInterval";
	protected LinkedList<Interval> matchingIntervalStack = new LinkedList<Interval>();
	protected LinkedList<List<Interval>> elementIntervalStack = new LinkedList<List<Interval>>();
	
	public MLSDMHistoryAwareMatcher(StoryPattern storyPattern,
			NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> variablesScope,
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> facadeFactory,
			ExpressionInterpreterManager<EClassifier, EStructuralFeature, MLExpression> expressionInterpreterManager,
			ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression> expressionAnalyzerManager,
			MLSDMReferenceIndex referenceAdapter,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> notificationEmitter,
			Map<String, Object> interpreterParameters) throws SDMException {
		super(storyPattern, variablesScope, facadeFactory, expressionInterpreterManager, expressionAnalyzerManager,
				interpreterParameters.containsKey(MLSDMSearchModelBasedInterpreter.STRATEGY_FACTORY) ? (MLSDMStrategyFactory) interpreterParameters.get(MLSDMSearchModelBasedInterpreter.STRATEGY_FACTORY) : DEFAULT_FACTORY,
				referenceAdapter, notificationEmitter, interpreterParameters, new MLSDMSearchModelBuilder());
	}
	
	public MLSDMHistoryAwareMatcher(StoryPattern storyPattern,
			NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> variablesScope,
			MetamodelFacadeFactory<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> facadeFactory,
			ExpressionInterpreterManager<EClassifier, EStructuralFeature, MLExpression> expressionInterpreterManager,
			ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression> expressionAnalyzerManager,
			MLSDMStrategyFactory strategyFactory,
			MLSDMReferenceIndex referenceAdapter,
			NotificationEmitter<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> notificationEmitter,
			Map<String, Object> interpreterParameters) throws SDMException {
		super(storyPattern, variablesScope, facadeFactory, expressionInterpreterManager, expressionAnalyzerManager, strategyFactory, referenceAdapter, notificationEmitter, interpreterParameters, new MLSDMSearchModelBuilder());
	}
	
	protected Interval getMatchingInterval(AbstractStoryPatternObject spo, Object targetInstance) {
		if(!(targetInstance instanceof ElementWithHistory)) {
			return null;
		}
		else if(isNewlyHandled(spo)) {
			return ((ElementWithHistory)targetInstance).getUnhandled();
		}
		else {
			return ((ElementWithHistory)targetInstance).getValidIn();
		}
	}

	private boolean isNewlyHandled(AbstractStoryPatternObject spo) {
		return !spo.getAnnotations().isEmpty();
	}
	
	@Override
	protected void initializeMatcher() {
		super.initializeMatcher();
		matchingIntervalStack.push(null);
		elementIntervalStack.push(Collections.emptyList());
	}

	@Override
	protected boolean analyzeStoryPatternObjects(boolean secondRun)
			throws SDMException {
		/*
		 * analyze all story pattern objects
		 */
		for (final PatternNode<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> patternNode : searchModel.getPatternNodes())
		{
			if(patternNode.isBound()) {
				continue;
			}
			
			AbstractStoryPatternObject spo = patternNode.getSpo();
			
			boolean bound = this.spoFacade.isBound(spo);

			if (!bound && this.spoFacade.isMaybeBound(spo))
			{
				/*
				 * Check if a variable exists with that name
				 */
				bound = secondRun ? boundMask.contains(spo) : this.getVariablesScope().variableExists(this.spoFacade.getName(spo));
			}

			if (bound)
			{
				if(!secondRun) {
					boundMask.add(spo);
				}
				
				/*
				 * Check if there is an assignment expression
				 */
				final MLExpression assignmentExpression = this.spoFacade.getAssignmentExpression(spo);

				Variable<EClassifier> variable = null;

				if (assignmentExpression != null)
				{
					/*
					 * Evaluate the expression
					 */
					Variable<EClassifier> result;
					try {
						result = this.getExpressionInterpreterManager().evaluateExpression(
								this.spoFacade.getAssignmentExpression(spo), null, null, this.getVariablesScope());
					} catch ( final ExpressionsInterpreterException ex ) {
						throw new SDMException( ex );
					}

					if (result != null)
					{
						/*
						 * Create a new variable with the name and classifier of
						 * the story pattern object
						 */
						variable = this.getVariablesScope().createVariable(this.spoFacade.getName(spo), this.spoFacade.getClassifier(spo),
								result.getValue());
					}
					else
					{
						throw new SDMException("The expression '" + this.spoFacade.getAssignmentExpression(spo)
								+ "' could not be evaluated.");
					}
				}
				else
				{
					variable = this.getVariablesScope().getVariable(this.spoFacade.getName(spo));

					if (variable == null)
					{
						/*
						 * There is no variable with that name.
						 */
						this.getNotificationEmitter().storyPatternObjectNotBound(spo, this.getVariablesScope(), this);

						return false;
					}
				}

				/*
				 * Check that the type of the existing variable matches the type
				 * of the story pattern object and check isomorphism
				 */

				if ((variable.getValue() != null) && this.checkTypeConstraint(variable.getValue(), spo)
						&& this.checkIsomorphism(variable.getValue()))
				{
					MatchSingleNodeMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> transaction =
								new MatchSingleNodeMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>(boundSPOConstraint, this);
					transaction.setSPO(spo);
					transaction.setTargetInstance(variable.getValue());
					transaction.setValid(true);
					transaction.addPatternNode(patternNode);

					Interval currentInterval = matchingIntervalStack.peek();
					Interval transactionInterval = getMatchingInterval(transaction);
					Interval nextInterval = intersect(currentInterval, transactionInterval);
					
					if(isValidMatchingInterval(nextInterval)) {
						transaction.commit();
						pushToStacks(transaction, nextInterval);

						selectionStrategy.update(transaction.getAffectedPatternNodes(), true);
					}
					else {
						/*
						 * Interval constraint is not satisfied
						 */
						this.getNotificationEmitter().storyPatternObjectNotBound(spo, this.getVariablesScope(), this);

						return false;
					}
				}
				else
				{
					/*
					 * Constraints are not satisfied or instance object already
					 * bound.
					 */
					this.getNotificationEmitter().storyPatternObjectNotBound(spo, this.getVariablesScope(), this);

					return false;
				}
			}
			else
			{
				/*
				 * Delete existing variables of unbound story pattern objects
				 */
				this.getVariablesScope().deleteVariable(this.spoFacade.getName(spo));
			}
		}

		return true;
	}
	
	@Override
	protected boolean doFindNextMatch() {
		boolean match = true;
		PatternConstraint<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> nextPatternConstraint = selectionStrategy.popPatternConstraint();
		while((nextPatternConstraint) != null) {
			SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> transaction = executeActiveAction(nextPatternConstraint);
			
			Interval nextInterval = null;
			
			if(transaction.isValid()) {
				Interval currentInterval = matchingIntervalStack.peek();
				Interval transactionInterval = getMatchingInterval(transaction);
				nextInterval = intersect(currentInterval, transactionInterval);

				while(transaction.isValid() && !isValidMatchingInterval(nextInterval)) {
					transaction = executeActiveAction(nextPatternConstraint);

					transactionInterval = getMatchingInterval(transaction);
					nextInterval = intersect(currentInterval, transactionInterval);
				}
			}
			
			if(transaction.isValid() && isValidMatchingInterval(nextInterval)) {
				transaction.commit();
				pushToStacks(transaction, nextInterval);
				
				/*
				 * Update selection strategy based only on pattern nodes for which
				 * new mappings have been created and only recompute matching costs
				 * if unbound pattern nodes exist.
				 */				
				if(searchModel.getBoundPatternNodeNumber() + transaction.getAffectedPatternNodes().size()
						== searchModel.getPatternNodes().size()) {
					if(selectionStrategy.checkRemainingConstraints()) {
						selectionStrategy.update(transaction.getAffectedPatternNodes(), false);
						break;
					}
					else {
						rollBackStackTops();
						selectionStrategy.rollBackLastPop(false);
					}
				}
				else {
					selectionStrategy.update(transaction.getAffectedPatternNodes(), true);
				}
			}
			else {
				/*
				 * Invalid transaction means the current match has no valid continuation.
				 */
				selectionStrategy.rollBackLastPop(true);
				matchingHistory.get(nextPatternConstraint).clear();
				
				if(matchingStack.isEmpty()) {
					/*
					 * No previous transaction to roll back means no more matches can be found.
					 */
					match = false;
					break;
				}
				else {
					/*
					 * Roll back to the state of the search before executing the last matching
					 * action.
					 */
					SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> last = rollBackLastBindingTransaction();
					if(!last.createsBinding() || last.getPatternConstraint() == boundSPOConstraint) {
						last.getPatternConstraint().unsetMatchState();
						match = false;
						break;
					}
				}
			}
			
			nextPatternConstraint = selectionStrategy.popPatternConstraint();
		}
		
		if(match) {
			/*
			 * Set matchingInterval variable
			 */
			Interval matchingInterval = matchingIntervalStack.peek();
			getVariablesScope().createVariable(MATCHING_INTERVAL_VARIABLE_NAME, matchingInterval.eClass(), matchingInterval);
			
			/*
			 * Record first successful matching order
			 */
			if(firstSuccessfulMatchingOrder == null && selectionStrategy.isOrderProducing()) {
				firstSuccessfulMatchingOrder = new ArrayList<MatchingAction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>>();
				for(PatternConstraint<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> c:
							((OrderProducingSelectionStrategy<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>) selectionStrategy).getMatchingOrder()) {
					firstSuccessfulMatchingOrder.add(c.getActiveAction());
				}
				/*
				 * Add pattern constraints for which an explicit check was executed at
				 * the end
				 */
				for(PatternConstraint<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> c:
					searchModel.getPatternConstraints()) {
					if(!c.isActive()) {
						firstSuccessfulMatchingOrder.add(c.getExplicitCheckAction());
					}
				}
			}
		}
		return match;
	}

	private SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> executeActiveAction(
			PatternConstraint<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> nextPatternConstraint) {
		try {
			return nextPatternConstraint.executeActiveAction();
		}
		catch (Exception e){	//TODO be more specific (Thomas' exception type); also does not work for NACs...
			return invalidTransaction;
		}
	}

	private Interval intersect(Interval interval1, Interval interval2) {
		if(interval1 == null) {
			return interval2;
		}
		else if(interval2 == null) {
			return interval1;
		}
		else {
			return interval1.intersect(interval2);
		}
	}

	private void pushToStacks(
			SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> transaction,
			Interval interval) {
		matchingStack.push(transaction);
		matchingIntervalStack.push(interval);
		elementIntervalStack.push(getElementIntervals(transaction));
	}

	protected boolean rollBackInvalidMatchingTransactions() {
		boolean rolledBack = false;
		for(Iterator<SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>> it = matchingStack.descendingIterator(); it.hasNext();) {
			SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> transaction = it.next();
			if(!transaction.checkValidity()) {
				rollBackTo(transaction);
				rolledBack = true;
				break;
			}
		}

		//check interval stacks for consistency with current model state
		Iterator<List<Interval>> elementIntervalIterator = elementIntervalStack.descendingIterator();
		Iterator<Interval> matchingIntervalIterator = matchingIntervalStack.descendingIterator();
		Iterator<SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>> transactionIterator = matchingStack.descendingIterator();
		SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> breakTransaction = null;
		Interval lastValidInterval = null;
		while(transactionIterator.hasNext()) {
			breakTransaction = transactionIterator.next();

			List<Interval> oldElementIntervals = elementIntervalIterator.next();
			Interval matchingInterval = matchingIntervalIterator.next();
			
			if(intervalsChanged(oldElementIntervals, getElementIntervals(breakTransaction))) {
				elementIntervalIterator.remove();
				matchingIntervalIterator.remove();
				break;
			}
			else {
				lastValidInterval = matchingInterval;
			}
		}
		
		//remove inconsistent interval stack elements
		while(elementIntervalIterator.hasNext()) {
			elementIntervalIterator.next();
			matchingIntervalIterator.next();
			
			elementIntervalIterator.remove();
			matchingIntervalIterator.remove();
		}

		//if anything changed: recompute interval stacks starting with breakTransaction
		if(matchingIntervalStack.size() < matchingStack.size()) {
			Interval breakInterval = getMatchingInterval(breakTransaction);
			Interval newInterval = intersect(lastValidInterval, breakInterval);
			
			if(newInterval.isEmpty()) {
				plainRollBackTo(breakTransaction);
				rolledBack = true;
			}
			else {
				matchingIntervalStack.push(newInterval);
				elementIntervalStack.push(getElementIntervals(breakTransaction));
				
				while(transactionIterator.hasNext()) {
					SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> transaction = transactionIterator.next();
					
					Interval currentInterval = matchingIntervalStack.peek();
					Interval transactionInterval = getMatchingInterval(transaction);
					Interval nextInterval = intersect(currentInterval, transactionInterval);
					
					if(nextInterval.isEmpty()) {
						plainRollBackTo(transaction);
						rolledBack = true;
						break;
					}
					else {
						matchingIntervalStack.push(nextInterval);
						elementIntervalStack.push(getElementIntervals(transaction));
					}
				}
			}
			
		}
		
		return rolledBack;
	}
	
	protected boolean plainRollBackTo(SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> transaction) {
		SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> last = matchingStack.peek();
		boolean bindingRevoked = last.createsBinding();
		
		while(!(matchingStack.size() < 2) && !(last == transaction)){
			super.rollBackLastTransaction(true);
			
			last = matchingStack.peek();
			bindingRevoked = bindingRevoked || last.createsBinding();
		}
	
		super.rollBackLastTransaction(false);
		
		return bindingRevoked;
	}
	
	private boolean intervalsChanged(List<Interval> previousElementIntervals, List<Interval> elementIntervals) {
		for(int i = 0; i < elementIntervals.size(); i++) {
			if(elementIntervals.get(i) != previousElementIntervals.get(i)) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void rollBackLastTransaction(boolean unsetMatchState) {
		super.rollBackLastTransaction(unsetMatchState);
		matchingIntervalStack.pop();
		elementIntervalStack.pop();
	}
	
	private void rollBackStackTops() {
		matchingStack.pop().rollBack();
		matchingIntervalStack.pop();
		elementIntervalStack.pop();
	}

	private boolean isValidMatchingInterval(Interval interval) {
		return interval == null || !interval.isEmpty();
	}

	private Interval getMatchingInterval(
			SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> transaction) {
		if(!transaction.createsBinding()) {
			return null;
		}
		else {
			if(transaction instanceof MatchSingleNodeMatchingTransaction) {
				MatchSingleNodeMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> singleNodeTransaction =
						(MatchSingleNodeMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>) transaction;
				return getMatchingInterval(singleNodeTransaction.getSPO(), singleNodeTransaction.getTargetInstance());
			}
			else {
				MatchMultipleNodesMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> multiNodeTransaction =
						(MatchMultipleNodesMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>) transaction;
				Interval current = null;
				for(MatchSingleNodeMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> singleNodeTransaction : multiNodeTransaction.getSingleNodeTransactions()) {
					Interval next = getMatchingInterval(singleNodeTransaction.getSPO(), singleNodeTransaction.getTargetInstance());
					if(current == null) {
						current = next;
					}
					else if (next != null) {
						current = current.intersect(next);
					}
				}
				return current;
			}
		}
	}

	private List<Interval> getElementIntervals(
			SearchModelMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> transaction) {
		if(!transaction.createsBinding()) {
			return Collections.emptyList();
		}
		else {
			if(transaction instanceof MatchSingleNodeMatchingTransaction) {
				MatchSingleNodeMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> singleNodeTransaction =
						(MatchSingleNodeMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>) transaction;
				return Collections.singletonList(getMatchingInterval(singleNodeTransaction.getSPO(), singleNodeTransaction.getTargetInstance()));
			}
			else {
				MatchMultipleNodesMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> multiNodeTransaction =
						(MatchMultipleNodesMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>) transaction;
				List<Interval> list = new ArrayList<Interval>();
				for(MatchSingleNodeMatchingTransaction<StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> singleNodeTransaction : multiNodeTransaction.getSingleNodeTransactions()) {
					Interval next = getMatchingInterval(singleNodeTransaction.getSPO(), singleNodeTransaction.getTargetInstance());
					list.add(next);
				}
				return list;
			}
		}
	}
	
	@Override
	public void reset() {
		super.reset();
		matchingIntervalStack.clear();
		elementIntervalStack.clear();
	}
}
