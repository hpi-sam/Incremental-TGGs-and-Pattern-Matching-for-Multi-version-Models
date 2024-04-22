package de.mdelab.mlsdm.interpreter.searchModel.history;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.mdelab.expressions.interpreter.core.ExpressionInterpreterManager;
import de.mdelab.mlannotations.MLAnnotation;
import de.mdelab.mlannotations.MLAnnotationDetails;
import de.mdelab.mlannotations.MLStringAnnotationDetails;
import de.mdelab.mlexpressions.MLExpression;
import de.mdelab.mlsdm.Activity;
import de.mdelab.mlsdm.ActivityEdge;
import de.mdelab.mlsdm.ActivityNode;
import de.mdelab.mlsdm.interpreter.searchModel.MLSDMSearchModelBasedInterpreter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.strategy.MLSDMStrategyFactory;
import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.core.variables.NotifierVariablesScope;

public class MLSDMHistoryAwareInterpreter extends MLSDMSearchModelBasedInterpreter {

	private static final Object VERSIONED_KEYWORD = "versioned";

	public MLSDMHistoryAwareInterpreter(
			ExpressionInterpreterManager<EClassifier, EStructuralFeature, MLExpression> expressionInterpreterManager) {
		super(expressionInterpreterManager);
	}

	@Override
	protected StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> createStoryPatternMatcher(
			StoryPattern storyPattern,
			NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> variablesScope)
			throws SDMException {		
		if(requiresVersionedMatching(storyPattern)) {
			if(interpreterParameters.containsKey(STRATEGY_FACTORY)) {
				MLSDMStrategyFactory strategyFactory = (MLSDMStrategyFactory) interpreterParameters.get(STRATEGY_FACTORY);
				return new MLSDMHistoryAwareMatcher(storyPattern,
						variablesScope,
						getFacadeFactory(),
						getExpressionInterpreterManager(),
						expressionAnalyzerManager,
						strategyFactory,
						referenceAdapter,
						getNotificationEmitter(),
						interpreterParameters);
			}
			else {
				return new MLSDMHistoryAwareMatcher(storyPattern,
						variablesScope,
						getFacadeFactory(),
						getExpressionInterpreterManager(),
						expressionAnalyzerManager,
						referenceAdapter,
						getNotificationEmitter(),
						interpreterParameters);
			}
		}
		else {
			return super.createStoryPatternMatcher(storyPattern, variablesScope);
		}
	}

	private boolean requiresVersionedMatching(StoryPattern storyPattern) {
		for(MLAnnotation a:storyPattern.getAnnotations()) {
			for(MLAnnotationDetails details:a.getAnnotationDetails()) {
				if(details instanceof MLStringAnnotationDetails) {
					if(((MLStringAnnotationDetails) details).getStringAnnotation().equals(VERSIONED_KEYWORD)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
