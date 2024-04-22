package de.mdelab.migmm.history.tggh.mote2history.impl.sdm;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import tggh.TGGNodeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.migmm.history.tggh.mote2history.Mote2historyPackage;
import de.mdelab.migmm.history.tggh.mote2history.TGGHEngine;
import de.mdelab.migmm.history.timing.DAGInterval;
import de.mdelab.migmm.history.timing.DAGVersion;
import de.mdelab.migmm.history.timing.impl.DAGIntervalImpl;
import de.mdelab.mlsdm.interpreter.MLSDMInterpreter;
import de.mdelab.mlsdm.interpreter.searchModel.history.MLSDMHistoryAwareInterpreter;
import de.mdelab.mltgg.mote2.Mote2Factory;
import de.mdelab.mltgg.mote2.TGGNode;
import de.mdelab.mltgg.mote2.TransformationDirectionEnum;
import de.mdelab.mltgg.mote2.TransformationQueue;
import de.mdelab.mltgg.mote2.helpers.TGGNodeTag;
import de.mdelab.mltgg.mote2.impl.TransformationException;
import de.mdelab.mltgg.mote2.notifications.AxiomExecutedNotification;
import de.mdelab.mltgg.mote2.notifications.ExecutingAxiomNotification;
import de.mdelab.mltgg.mote2.notifications.ExecutingRuleNotification;
import de.mdelab.mltgg.mote2.notifications.RuleExecutedNotification;
import de.mdelab.mltgg.mote2.notifications.TransformationFinishedNotification;
import de.mdelab.mltgg.mote2.notifications.TransformationStartedNotification;
import de.mdelab.mltgg.mote2.operationalTGG.ErrorCodeEnum;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalAxiom;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRule;
import de.mdelab.mltgg.mote2.operationalTGG.OperationalRuleGroup;
import de.mdelab.mltgg.mote2.sdm.MoTE2Sdm;
import de.mdelab.sdm.interpreter.core.SDMException;

public class MoTE2HistorySdm extends MoTE2Sdm implements TGGHEngine {

	private Map<EObject, Collection<TGGNode>> coveringCorrNodes;
	private List<MVMDeletion> pendingDeletions = new ArrayList<MVMDeletion>();
	private List<MVMCreation> pendingCreations = new ArrayList<MVMCreation>();
	private List<MVMMerge> pendingMerges = new ArrayList<MVMMerge>();
	
	@Override
	protected MLSDMInterpreter createSdmInterpreter( final ClassLoader classLoader)
	throws SDMException {
		return new MLSDMHistoryAwareInterpreter( exprInterpreterManager );
	}

	@Override
	public void initModels(final EList<EObject> leftInputElements, final EList<EObject> rightInputElements) throws TransformationException
	{
		assert leftInputElements != null;
		assert rightInputElements != null;

		assert !(leftInputElements.isEmpty() && rightInputElements.isEmpty());

		this.detachChangeListeners();

		/*
		 * Clear existing data structures
		 */
		this.getCoveredLeftElements().clear();
		this.getCoveredRightElements().clear();

		this.getUncoveredLeftElements().clear();
		this.getCoveredRightElements().clear();

		this.getLeftInputElements().clear();
		this.getRightInputElements().clear();

		this.getTggNodes().clear();

		/*
		 * set input elements
		 */
		this.getLeftInputElements().addAll(leftInputElements);
		this.getRightInputElements().addAll(rightInputElements);

		/*
		 * init transformation queues
		 */
		this.setForwardTransformationQueue( Mote2Factory.eINSTANCE.createUniqueFIFOTransformationQueue() );
		this.setBackwardTransformationQueue( Mote2Factory.eINSTANCE.createUniqueFIFOTransformationQueue() );

		/*
		 * Init helper maps
		 */
		this.leftCoveredLinks = new LinkedHashMap<Object, Map<EReference, Map<Object, TGGNode>>>();
		this.leftLinkCoveringTGGNodes = new LinkedHashMap<TGGNode, Map<Object, Map<EReference, Object>>>();

		this.rightCoveredLinks = new LinkedHashMap<Object, Map<EReference, Map<Object, TGGNode>>>();
		this.rightLinkCoveringTGGNodes = new LinkedHashMap<TGGNode, Map<Object, Map<EReference, Object>>>();

		this.inverseLinks = new LinkedHashMap<EReference, Map<EObject, Set<EObject>>>();

		this.coveringCorrNodes = new LinkedHashMap<EObject, Collection<TGGNode>>();
		
		/*
		 * populate maps of uncovered elements and create link proxies
		 */
		for (final EObject eObject : leftInputElements)
		{
			this.initBookkeeping(eObject, this.getUncoveredLeftElements());
		}

		for (final EObject eObject : rightInputElements)
		{
			this.initBookkeeping(eObject, this.getUncoveredRightElements());
		}

		/*
		 * Add EContentAdapters
		 */

		this.leftChangeListener = new MoTE2HistoryChangeListener(this, this.getForwardTransformationQueue(), this.getCoveredLeftElements(),
				this.getUncoveredLeftElements(), TransformationDirectionEnum.FORWARD);

		this.rightChangeListener = new MoTE2HistoryChangeListener(this, this.getBackwardTransformationQueue(), this.getCoveredRightElements(),
				this.getUncoveredRightElements(), TransformationDirectionEnum.BACKWARD);

		this.leftChangeListener.attachAdapter(leftInputElements);
		this.rightChangeListener.attachAdapter(rightInputElements);
	}
	
	@Override
	public void transform(final TransformationDirectionEnum direction, final boolean synchronize, final boolean validate,
			final boolean checkAttributeFormulae, final boolean checkForConflicts, IProgressMonitor progressMonitor)
			throws TransformationException {
		handlePendingDeletions();
		handlePendingMerges();
		handlePendingCreations();
		
//		super.transform(direction, synchronize, validate, checkAttributeFormulae, checkForConflicts, progressMonitor);
		assert this.getOperationalTGG() != null;
		assert direction != null;

		this.notifyReceivers(new TransformationStartedNotification(this, direction, this.getLeftInputElements(), this
				.getRightInputElements()));

		if (progressMonitor == null)
		{
			progressMonitor = new NullProgressMonitor();
		}

		/*
		 * deactivate change listeners during transformation
		 */
		this.leftChangeListener.deactivate();
		this.rightChangeListener.deactivate();

		switch (direction)
		{
			case FORWARD:
			{
				progressMonitor.beginTask("Executing forward transformation...", this.getUncoveredLeftElements().size());
				break;
			}
			case MAPPING:
			{
				progressMonitor.beginTask("Executing mapping transformation...", this.getUncoveredLeftElements().size()
						+ this.getUncoveredRightElements().size());
				break;
			}
			case BACKWARD:
			{
				progressMonitor.beginTask("Executing backward transformation...", this.getUncoveredRightElements().size());
				break;
			}
			default:
				throw new UnsupportedOperationException();
		}

		if (validate)
		{
			switch (direction)
			{
				case FORWARD:
				case MAPPING:
					for (final EObject eObject : this.getLeftInputElements())
					{
						if (!this.validateModel(eObject))
						{
							throw new TransformationException("Left input element '" + eObject + "' is invalid.", null);
						}
					}
				default:
					break;
			}

			switch (direction)
			{
				case MAPPING:
				case BACKWARD:
					for (final EObject eObject : this.getRightInputElements())
					{
						if (!this.validateModel(eObject))
						{
							throw new TransformationException("Right input element '" + eObject + "' is invalid.", null);
						}
					}
				default:
					break;
			}
		}

		this.getOperationalTGG().transformationStarted();

		/*
		 * Execute axiom group
		 */
		if (!synchronize)
		{
			boolean axiomApplied = false;

			for (final OperationalAxiom axiom : this.getOperationalTGG().getOperationalAxiomGroup().getAxioms())
			{
				ErrorCodeEnum errorCode = null;

				this.notifyReceivers(new ExecutingAxiomNotification(this, direction, axiom, this.getLeftInputElements(), this
						.getRightInputElements()));

				// progressMonitor.setTaskName("Executing axiom '" +
				// axiom.getOperationalAxiomGroup().eClass().getName() + "::"
				// + axiom.eClass().getName() + "'...");

				final int noUncoveredLeftElements = this.getUncoveredLeftElements().size();
				final int noUncoveredRightElements = this.getUncoveredRightElements().size();

				switch (direction)
				{
					case FORWARD:
						errorCode = axiom.transformForward(this.getLeftInputElements(), this.getRightInputElements(),
								checkAttributeFormulae);
						this.rightChangeListener.attachAdapter(this.rightInputElements);

						break;

					case BACKWARD:
						errorCode = axiom.transformBackward(this.getLeftInputElements(), this.getRightInputElements(),
								checkAttributeFormulae);
						this.leftChangeListener.attachAdapter(this.leftInputElements);

						break;

					case MAPPING:
						errorCode = axiom.transformMapping(this.getLeftInputElements(), this.getRightInputElements(),
								checkAttributeFormulae);
						break;

					default:
						throw new UnsupportedOperationException();
				}

				this.notifyReceivers(new AxiomExecutedNotification(this, direction, axiom, this.getLeftInputElements(), this
						.getRightInputElements(), errorCode));

				if (errorCode == ErrorCodeEnum.OK)
				{
					axiomApplied = true;
					break;
				}
				else
				{
					switch (errorCode)
					{
						case ATTRIBUTE_FORMULA_VIOLATED:
							throw new TransformationException("Attribute formula of rule '" + axiom.eClass().getName() + "' violated", null);

						case CONFLICT_DETECTED:
							throw new TransformationException("Rule '" + axiom.eClass().getName() + "' is in conflict with another rule.",
									null);

						case INTERNAL_ERROR:
							throw new TransformationException("An internal error occurred while executing rule '"
									+ axiom.eClass().getName() + "'.", null);

						case AXIOM_NOT_APPLICABLE:
							break;

						default:
							throw new UnsupportedOperationException();

					}
				}

				progressMonitor.worked(noUncoveredLeftElements - this.getUncoveredLeftElements().size() + noUncoveredRightElements
						- this.getUncoveredRightElements().size());
			}

			if (!axiomApplied)
			{
				throw new TransformationException("Could not apply the axiom", null);
			}

		}

		/*
		 * Transform new elements
		 */
		TransformationQueue transformationQueue = null;

		switch (direction)
		{
			case FORWARD:
			case MAPPING:
				transformationQueue = this.getForwardTransformationQueue();
				break;
			case BACKWARD:
				transformationQueue = this.getBackwardTransformationQueue();
				break;
			default:
				throw new UnsupportedOperationException();
		}

		while (transformationQueue.size() > 0) {
			if (progressMonitor.isCanceled()) {
				throw new TransformationException("Transformation canceled.", null);
			}

			final TGGNodeTag tggNodeTag = transformationQueue.removeFirst();

			final TGGNode tggNode = tggNodeTag.getTggNode();

			if (tggNode.getCreatedBy() == null) {
				continue;
			}

			ErrorCodeEnum errorCode = null;

			if (tggNode.getCreatedBy() == null) {
				continue;
			}
			
			// DB: In case repair did not work (TggNode to be deleted), we need to re-execute the 
			// rule with predecessors to re-instantiate the objects
			final List<TGGNode> tggNodesToCheck = new ArrayList<TGGNode>();
			tggNodesToCheck.add( tggNode );

			for ( final TGGNode tggNodeToCheck : tggNodesToCheck ) {
				/*
				 * Transform new elements
				 */
				for (final OperationalRuleGroup ruleGroup : this.getOperationalTGG().getOperationalRuleGroups()) {
					if ( ruleGroup.isEnabled() ) {
						for (final OperationalRule rule : ruleGroup.getRules())	{
							if ( rule.isEnabled() ) {
								final EClass tggNodeClass = tggNodeToCheck.eClass();
								
								if (synchronize && rule.getAllInputCorrNodeTypes().contains( tggNodeClass )
										|| rule.getPreferredInputCorrNodeTypes().contains( tggNodeClass ) ) {
									this.notifyReceivers(new ExecutingRuleNotification(this, direction, rule, tggNodeToCheck));
			
									// progressMonitor.setTaskName("Executing rule '"
									// +
									// rule.getOperationalRuleGroup().eClass().getName()
									// +
									// "::"
									// + rule.eClass().getName() + "'...");
			
									final int noUncoveredLeftElements = this.getUncoveredLeftElements().size();
									final int noUncoveredRightElements = this.getUncoveredRightElements().size();
			
									switch ( direction ) {
										case FORWARD:
											errorCode = rule.transformForward(tggNodeToCheck, checkAttributeFormulae, synchronize);
											break;
			
										case BACKWARD:
											errorCode = rule.transformBackward(tggNodeToCheck, checkAttributeFormulae, synchronize);
											break;
			
										case MAPPING:
											errorCode = rule.transformMapping(tggNodeToCheck, checkAttributeFormulae, synchronize);
											break;
			
										default:
											throw new UnsupportedOperationException();
									}
			
									this.notifyReceivers(new RuleExecutedNotification(this, direction, rule, tggNodeToCheck, errorCode));
			
									switch (errorCode) {
										case OK:
											break;
			
										case ATTRIBUTE_FORMULA_VIOLATED:
											throw new TransformationException("Attribute formula of rule '" + rule.eClass().getName() + "' violated.",
													null);
			
										case CONFLICT_DETECTED:
											throw new TransformationException("Rule '" + rule.eClass().getName() + "' detected a conflict.", null);
			
										case INTERNAL_ERROR:
											throw new TransformationException("An internal error occurred while executing rule '"
													+ rule.eClass().getName() + "'.", null);
			
										default:
											throw new UnsupportedOperationException();
									}
			
									progressMonitor.worked(noUncoveredLeftElements - this.getUncoveredLeftElements().size() + noUncoveredRightElements
											- this.getUncoveredRightElements().size());
								}
							}
						}
					}
				}
			}
		}

		this.getOperationalTGG().transformationFinished();

		if (checkForConflicts) {
			final Map<OperationalRule, List<EObject>> conflicts = new LinkedHashMap<OperationalRule, List<EObject>>();
			
			for (final TGGNode n : this.getTggNodes().keySet())	{
				for (final OperationalRuleGroup ruleGroup : this.operationalTGG.getOperationalRuleGroups())	{
					if ( ruleGroup.isEnabled() ) {
						for (final OperationalRule rule : ruleGroup.getRules())	{
							if ( rule.isEnabled() ) {
								EList<EObject> eObjects = null;
		
								switch (direction) {
									case FORWARD: {
										eObjects = rule.conflictCheckForward( n );
										
										break;
									}
									case MAPPING: {
										eObjects = rule.conflictCheckMapping(n);
										
										break;
									}
									case BACKWARD:	{
										eObjects = rule.conflictCheckBackward(n);
										
										break;
									}
									default:
										throw new UnsupportedOperationException();
								}
		
								if (eObjects != null) {
									/*
									 * If the set is empty, the rule transforms only a
									 * single linked and a conflict was detected
									 * regarding this link.
									 */
									conflicts.put( rule, eObjects );
		//							throw new TransformationException(
		//									"Conflict detected: The following elements should have been transformed by rule '" + rule.getRuleID() + 
		//									"' of rule group '" + ruleGroup.getRuleGroupID() + 
		//									"': " + eObjects, null); // TODO use label providers to generate proper text for objects
								}
							}
						}
					}
				}
			}
			
			if ( !conflicts.isEmpty() ) {
				final StringBuilder message = new StringBuilder( "Conflicts detected:" + System.lineSeparator() );
				
				for ( final Map.Entry<OperationalRule, List<EObject>> entry : conflicts.entrySet() ) {
					final OperationalRule rule = entry.getKey();
					message.append( "Rule '" + rule.getRuleID() );
					message.append( "' of rule group '" + rule.getOperationalRuleGroup().getRuleGroupID() );
					message.append( "' should have transformed the folowing elements:"  + System.lineSeparator() );
					
					final List<EObject> elements = entry.getValue();
					
					for ( final EObject element : elements ) {
						message.append( element + System.lineSeparator() );// TODO use label providers to generate proper text for objects
					}
				}
				
				throw new TransformationException( message.toString(), null); 
			}
		}

		if (validate) {
			switch (direction) {
				case FORWARD: {
					for (final EObject eObject : this.getRightInputElements()) {
						if (!this.validateModel(eObject)) {
							throw new TransformationException("Right transformed element '" + eObject + "' is invalid.", null);
						}
					}
					break;
				}
				case BACKWARD: {
					for (final EObject eObject : this.getLeftInputElements()) {
						if (!this.validateModel(eObject)) {
							throw new TransformationException("Left transformed element '" + eObject + "' is invalid.", null);
						}
					}
					break;
				}
				default:
					break;
			}
		}

		this.notifyReceivers(new TransformationFinishedNotification(this, direction, this.getLeftInputElements(), this
				.getRightInputElements()));

		this.leftChangeListener.activate();
		this.rightChangeListener.activate();

		progressMonitor.done();
	}

	private void handlePendingDeletions() {
		rightChangeListener.deactivate();
		for(MVMDeletion deletion:pendingDeletions) {
			Collection<TGGNode> coveringCorrNodes = getCoveringCorrNodes(deletion.element);
			for(TGGNode corrNode:coveringCorrNodes) {
				for(TimingUnit d:deletion.newDts) {
					adaptValidity((TGGNodeWithHistory) corrNode, d, deletion.direction);
				}
			}
		}
		pendingDeletions.clear();
		rightChangeListener.activate();
	}
	
	private void handlePendingMerges() {
		rightChangeListener.deactivate();
		for(MVMMerge merge:pendingMerges) {
			for(Entry<EObject, Collection<TGGNode>> entry:coveringCorrNodes.entrySet()) {
				if(entry.getValue().size() > 1) {
					List<TGGNodeWithHistory> validNodes = new ArrayList<TGGNodeWithHistory>();
					for(TGGNode node:entry.getValue()) {
						if(node instanceof TGGNodeWithHistory && ((TGGNodeWithHistory) node).getValidIn().contains(merge.version)) {
							validNodes.add((TGGNodeWithHistory) node);
						}
					}
					
					if(validNodes.size() > 1) {
						for(int i = 1; i < validNodes.size(); i++) {
							adaptValidity(validNodes.get(i), merge.version, merge.direction);
						}
					}
				}
			}
		}
		pendingMerges.clear();
		rightChangeListener.activate();
	}

	private void handlePendingCreations() {
		rightChangeListener.deactivate();
		for(MVMCreation creation:pendingCreations) {
			if(creation.newElement != null) {
				handleCreation(creation.anchorElement, creation.newElement, creation.direction);
			}
		}
		pendingCreations.clear();
		rightChangeListener.activate();
	}

	@Override
	protected EClass eStaticClass() {
		return Mote2historyPackage.Literals.TGGH_ENGINE;
	}

	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Mote2historyPackage.TGGH_ENGINE___REGISTER_COVERING_CORR_NODE__EOBJECT_TGGNODE:
				registerCoveringCorrNode((EObject)arguments.get(0), (TGGNode)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	
	public Map<EObject, Collection<TGGNode>> getCoveringCorrNodes() {
		return coveringCorrNodes;
	}

	@Override
	public void registerCoveringCorrNode(EObject element, TGGNode corrNode) {
		if(!coveringCorrNodes.containsKey(element)) {
			coveringCorrNodes.put(element, new LinkedHashSet<TGGNode>());
		}
		
		getCoveringCorrNodes().get(element).add(corrNode);
	}

//	public void handleCreation(ElementWithHistory element, TransformationDirectionEnum direction) {
//		if(getCoveringCorrNodes(element).isEmpty()) {
//			element.setUnhandled(DAGIntervalImpl.create((DAGInterval) element.getValidIn()));
//		}
//		enqueueCoveringCorrNodes(element, direction);
//	}

	public void handleCreation(ElementWithHistory anchorElement, ElementWithHistory newElement, TransformationDirectionEnum direction) {
		if(!(anchorElement.eClass() == HistoryPackage.Literals.HISTORY)) {
			enqueueCoveringCorrNodes(anchorElement, direction);
		}
		else {
			newElement.setUnhandled(DAGIntervalImpl.create((DAGInterval) newElement.getValidIn()));
		}
//		registerUnhandledElementVersions((ElementWithHistory) newElement, direction);
//		enqueueCoveringCorrNodes(newElement, direction);
	}

	private void adaptValidity(TGGNodeWithHistory corrNode, TimingUnit newDts, TransformationDirectionEnum direction) {
		DAGInterval validity = (DAGInterval) ((TGGNodeWithHistory) corrNode).getValidIn();
		DAGVersion v = (DAGVersion) newDts;
		
		if(!validity.contains(newDts)) {
			return;
		}
		
		validity.getDts().add(v);
		
		List<EObject> targetNodes = direction == TransformationDirectionEnum.FORWARD ? corrNode.getRightNodes() : corrNode.getLeftNodes();
		for(EObject targetNode:targetNodes) {
			DAGInterval targetValidity = (DAGInterval) ((ElementWithHistory) targetNode).getValidIn();
			targetValidity.getDts().add(v);
		}
		
		List<EObject> sourceNodes = direction == TransformationDirectionEnum.FORWARD ? corrNode.getLeftNodes() : corrNode.getRightNodes();
		for(EObject sourceNode:sourceNodes) {
			ElementWithHistory sourceElement = (ElementWithHistory) sourceNode;
			DAGInterval sourceValidity = (DAGInterval) ((ElementWithHistory) sourceNode).getValidIn();
			if(!sourceValidity.getDts().contains(v)) {
				DAGInterval unhandled;
				if(sourceElement.getUnhandled() != null) {
					unhandled = (DAGInterval) sourceElement.getUnhandled();
					unhandled.getCts().add(v);
				}
				else {
					unhandled = DAGIntervalImpl.create(Collections.singleton(v), Collections.emptySet());
				}
				sourceElement.setUnhandled(sourceElement.getValidIn().intersect(unhandled));
			}
		}
		
		for(TGGNode next:corrNode.getNext()) {
			adaptValidity((TGGNodeWithHistory) next, newDts, direction);
		}
	}

//	private void registerUnhandledElementVersions(ElementWithHistory element, TransformationDirectionEnum direction) {
//		if(isElementWithHistory(element)) {
//			Interval unhandled = computeUnhandledTimingUnits(element);
//			element.setUnhandled(unhandled);
//		}
//	}

	private void enqueueCoveringCorrNodes(ElementWithHistory element, TransformationDirectionEnum direction) {
		TransformationQueue transformationQueue = direction == TransformationDirectionEnum.FORWARD ? getForwardTransformationQueue() : getBackwardTransformationQueue();
		for(TGGNode corrNode:getCoveringCorrNodes(element)) {
			transformationQueue.add(corrNode, true);
		}
	}

//	private Interval computeUnhandledTimingUnits(ElementWithHistory element) {
//		Collection<TGGNode> coveringCorrNodes = getCoveringCorrNodes(element);
//		Interval union = null;
//		for(TGGNode corrNode:coveringCorrNodes) {
//			if(isElementWithHistory(corrNode)) {
//				Interval validIn = ((ElementWithHistory) corrNode).getValidIn();
//				if(union == null) {
//					union = validIn;
//				}
//				else {
//					union = union.union(validIn);
//				}
//			}
//		}
//		return union != null ? element.getValidIn().intersect(union.complement()) : EcoreUtil.copy(element.getValidIn());
//	}

	private boolean isElementWithHistory(Object notifier) {
		return notifier instanceof EObject && ((EObject) notifier).eClass().getEAllSuperTypes().contains(HistoryPackage.Literals.ELEMENT_WITH_HISTORY);
	}

	private Collection<TGGNode> getCoveringCorrNodes(EObject notifier) {
		return coveringCorrNodes.containsKey(notifier) ? coveringCorrNodes.get(notifier) : Collections.emptyList();
	}

	public void registerMerge(DAGVersion successor, TransformationDirectionEnum direction) {
		pendingMerges.add(new MVMMerge(successor, direction));
	}
	
	public void registerDeletion(ElementWithHistory element, Collection<TimingUnit> newDts, TransformationDirectionEnum direction) {
		pendingDeletions.add(new MVMDeletion(element, newDts, direction));
	}

	public void registerCreation(ElementWithHistory element, ElementWithHistory newElement, TransformationDirectionEnum direction) {
		pendingCreations.add(new MVMCreation(element, newElement, direction));
	}

//	private void registerUnhandledSourceVersions(TGGNodeWithHistory corrNode, TransformationDirectionEnum direction) {
//		Collection<EObject> sourceElements = direction == TransformationDirectionEnum.FORWARD ? corrNode.getLeftNodes() : corrNode.getRightNodes();
//		for(EObject element:sourceElements) {
//			if(isElementWithHistory(sourceElements)) {
//				registerUnhandledElementVersions((ElementWithHistory) element, direction);
//			}
//		}
//	}
//
//	private void doAdaptValidity(ElementWithHistory element, Collection<TimingUnit> newDts) {
//		Collection<?> explicitValidity = element.getValidIn().getPresentTiming();
//		for(TimingUnit dts:newDts) {
//			if(explicitValidity.contains(dts)) {
//				((DAGInterval) element.getValidIn()).getDts().add((DAGVersion) dts);
//			}
//		}
//	}
//
//	private boolean containsAny(Interval validity, Collection<TimingUnit> newDts) {
//		Collection<?> explicitValidity = validity.getPresentTiming();
//		for(TimingUnit t:newDts) {
//			if(explicitValidity.contains(t)) {
//				return true;
//			}
//		}
//		return false;
//	}

}
