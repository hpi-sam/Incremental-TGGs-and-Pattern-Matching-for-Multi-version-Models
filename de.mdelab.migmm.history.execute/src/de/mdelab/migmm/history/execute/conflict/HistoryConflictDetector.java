package de.mdelab.migmm.history.execute.conflict;

import de.mdelab.expressions.interpreter.core.variables.VariablesScope;
import de.mdelab.migmm.history.ContainmentEdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;
import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.TimingUnit;
import de.mdelab.mlexpressions.MLExpression;
import de.mdelab.mlsdm.Activity;
import de.mdelab.mlsdm.ActivityEdge;
import de.mdelab.mlsdm.ActivityNode;
import de.mdelab.mlsdm.interpreter.MLSDMExpressionInterpreterManager;
import de.mdelab.mlsdm.interpreter.facade.MLSDMMetamodelFacadeFactory;
import de.mdelab.mlsdm.interpreter.notifications.MLSDMNotificationEmitter;
import de.mdelab.mlsdm.interpreter.searchModel.MLSDMSearchModelBasedInterpreter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMReferenceIndex;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.MLSDMSearchModelBasedMatcher;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.expressions.MLSDMAdapterBackedOCLExpressionInterpreter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.expressions.MLSDMOCLExpressionAnalyzer;
import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.sdm.interpreter.core.SDMException;
import de.mdelab.sdm.interpreter.core.patternmatcher.StoryPatternMatcher;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.expressions.ExpressionAnalyzerManager;
import de.mdelab.sdm.interpreter.core.variables.NotifierVariablesScope;
import tggh.TGGNodeWithHistory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class HistoryConflictDetector {

	private static final String PATTERNS_DIR = "Y:/Giese/miGMM/workspace/tggh/de.mdelab.migmm.history.execute/conflict_patterns";

	private static final String DANGLING_EDGE_SOURCE_PATTERN = "dangling_edge_source.mlsp";
	private static final String DANGLING_EDGE_SOURCE_EDGE = "edge";
	private static final String DANGLING_EDGE_SOURCE_NODE = "node";

	private static final String DANGLING_EDGE_TARGET_PATTERN = "dangling_edge_target.mlsp";
	private static final String DANGLING_EDGE_TARGET_EDGE = "edge";
	private static final String DANGLING_EDGE_TARGET_NODE = "node";

	private static final String DOUBLE_CONTAINMENT_PATTERN = "double_containment.mlsp";
	private static final String DOUBLE_CONTAINMENT_CONTAINMENT1= "containment1";
	private static final String DOUBLE_CONTAINMENT_CONTAINMENT2 = "containment2";
	private static final String DOUBLE_CONTAINMENT_NODE = "element";
	
	private static final String INVALID_CORRESPONDENCE_DEPENDENCY_PATTERN = "invalid_correspondence_dependency.mlsp";
	private static final String INVALID_CORRESPONDENCE_DEPENDENCY_PARENT = "parent";
	private static final String INVALID_CORRESPONDENCE_DEPENDENCY_CHILD = "child";

	private static final String REDUNDANT_CORRESPONDENCE_LEFT_PATTERN = "redundant_correspondence_left.mlsp";
	private static final String REDUNDANT_CORRESPONDENCE_LEFT_CORR1= "corr1";
	private static final String REDUNDANT_CORRESPONDENCE_LEFT_CORR2 = "corr2";
	private static final String REDUNDANT_CORRESPONDENCE_LEFT_ELEMENT = "element";
	
	private static final String REDUNDANT_CORRESPONDENCE_RIGHT_PATTERN = "redundant_correspondence_right.mlsp";
	private static final String REDUNDANT_CORRESPONDENCE_RIGHT_CORR1= "corr1";
	private static final String REDUNDANT_CORRESPONDENCE_RIGHT_CORR2 = "corr2";
	private static final String REDUNDANT_CORRESPONDENCE_RIGHT_ELEMENT = "element";
	
	private MLSDMReferenceIndex referenceIndex;
	
	private Collection<StoryPattern> conflictDetectionPatterns;
	
	private StoryPattern danglingEdgeSourcePattern;
	private StoryPattern danglingEdgeTargetPattern;

	private StoryPattern doubleContainmentPattern;
	
	private StoryPattern invalidCorrespondenceDependencyPattern;

	private StoryPattern redundantCorrespondenceLeftPattern;
	private StoryPattern redundantCorrespondenceRightPattern;
	
	private Map<StoryPattern, StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>> matchers;

	public HistoryConflictDetector(MLSDMReferenceIndex referenceIndex) {
		this.referenceIndex = referenceIndex;
		
		loadConflictDetectionPatterns();
		createConflictDetectionMatchers();
	}
	
	private void loadConflictDetectionPatterns() {
		conflictDetectionPatterns = new ArrayList<StoryPattern>();
		
		danglingEdgeSourcePattern = loadStoryPattern(PATTERNS_DIR + "/" + DANGLING_EDGE_SOURCE_PATTERN);
		conflictDetectionPatterns.add(danglingEdgeSourcePattern);
		danglingEdgeTargetPattern = loadStoryPattern(PATTERNS_DIR + "/" + DANGLING_EDGE_TARGET_PATTERN);
		conflictDetectionPatterns.add(danglingEdgeTargetPattern);

		doubleContainmentPattern = loadStoryPattern(PATTERNS_DIR + "/" + DOUBLE_CONTAINMENT_PATTERN);
		conflictDetectionPatterns.add(doubleContainmentPattern);

		invalidCorrespondenceDependencyPattern = loadStoryPattern(PATTERNS_DIR + "/" + INVALID_CORRESPONDENCE_DEPENDENCY_PATTERN);
		conflictDetectionPatterns.add(invalidCorrespondenceDependencyPattern);

		redundantCorrespondenceLeftPattern = loadStoryPattern(PATTERNS_DIR + "/" + REDUNDANT_CORRESPONDENCE_LEFT_PATTERN);
		conflictDetectionPatterns.add(redundantCorrespondenceLeftPattern);
		redundantCorrespondenceRightPattern = loadStoryPattern(PATTERNS_DIR + "/" + REDUNDANT_CORRESPONDENCE_RIGHT_PATTERN);
		conflictDetectionPatterns.add(redundantCorrespondenceRightPattern);
	}

	private StoryPattern loadStoryPattern(String path) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.createResource(URI.createFileURI(path));
		try {
			r.load(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (StoryPattern) r.getContents().get(0);
	}

	private void createConflictDetectionMatchers() {
		matchers = new LinkedHashMap<StoryPattern, StoryPatternMatcher<Activity,ActivityNode,ActivityEdge,StoryPattern,AbstractStoryPatternObject,AbstractStoryPatternLink,EClassifier,EStructuralFeature,MLExpression>>();
		for(StoryPattern pattern:conflictDetectionPatterns) {
			try {
				MLSDMSearchModelBasedMatcher matcher = createMatcher(pattern, referenceIndex);
				matchers.put(pattern, matcher);
			} catch (SDMException e) {
				e.printStackTrace();
			}
		}
	}

	private MLSDMSearchModelBasedMatcher createMatcher(StoryPattern pattern, MLSDMReferenceIndex referenceIndex) throws SDMException {
		MLSDMExpressionInterpreterManager expressionInterpreterManager = new MLSDMExpressionInterpreterManager(HistoryConflictDetector.class.getClassLoader());
		expressionInterpreterManager.registerExpressionInterpreter(new MLSDMAdapterBackedOCLExpressionInterpreter(referenceIndex), "OCL", "1.0");
		
		ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression> expressionAnalyzerManager = new ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression>(MLSDMMetamodelFacadeFactory.INSTANCE.getExpressionFacade());
		expressionAnalyzerManager.registerExpressionAnalyzer("OCL", new MLSDMOCLExpressionAnalyzer());
		
		Map<String, Object> matcherParameters = new HashMap<String, Object>();
		matcherParameters.put(MLSDMSearchModelBasedInterpreter.REFERENCE_ADAPTER, referenceIndex);
		
		return new MLSDMSearchModelBasedMatcher(pattern,
				new NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>(expressionInterpreterManager.getNotificationEmitter()),
				expressionInterpreterManager,
				expressionAnalyzerManager,
				referenceIndex,
				(MLSDMNotificationEmitter) expressionInterpreterManager.getNotificationEmitter());
	}

	public Collection<Conflict> getConflicts() {
		List<Conflict> conflicts = new ArrayList<Conflict>();

		conflicts.addAll(getDanglingEdgeSourceConflicts(referenceIndex));
		conflicts.addAll(getDanglingEdgeTargetConflicts(referenceIndex));

		conflicts.addAll(getDoubleContainmentConflicts(referenceIndex));

		conflicts.addAll(getInvalidCorrespondenceDependencyConflicts(referenceIndex));

		conflicts.addAll(getRedundantCorrespondenceLeftConflicts(referenceIndex));
		conflicts.addAll(getRedundantCorrespondenceRightConflicts(referenceIndex));
		
		return conflicts;
	}

	private Collection<DanglingEdgeConflict> getDanglingEdgeSourceConflicts(MLSDMReferenceIndex referenceIndex) {
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = matchers.get(danglingEdgeSourcePattern);
		Collection<DanglingEdgeConflict> conflicts = new ArrayList<DanglingEdgeConflict>();
		
		try {
			while(matcher.findNextMatch()) {
				DanglingEdgeConflict conflict = getDanglingEdgeSourceConflict(matcher);
				if(isValid(conflict)) {
					conflicts.add(conflict);
				}
			}
		} catch (SDMException e) {
			e.printStackTrace();
		}
		
		matcher.reset();
		
		return conflicts;
	}

	@SuppressWarnings("unchecked")
	private DanglingEdgeConflict getDanglingEdgeSourceConflict(
			StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher) {
		VariablesScope<EClassifier, EStructuralFeature, MLExpression> vs = matcher.getVariablesScope();

		ElementWithHistory edge = (ElementWithHistory) vs.getVariable(DANGLING_EDGE_SOURCE_EDGE).getValue();
		ElementWithHistory node = (ElementWithHistory) vs.getVariable(DANGLING_EDGE_SOURCE_NODE).getValue();
		
		Collection<TimingUnit> pE = (Collection<TimingUnit>) edge.getValidIn().getPresentTiming();
		Collection<TimingUnit> dE = (Collection<TimingUnit>) edge.getValidIn().getDeletedTiming();
		Collection<TimingUnit> dN = (Collection<TimingUnit>) node.getValidIn().getDeletedTiming();
		
		Collection<TimingUnit> p = pE;
		Collection<TimingUnit> d = dN;
		d.removeAll(new LinkedHashSet<TimingUnit>(dE));
		
		if(!p.isEmpty() && !d.isEmpty()) {
			return new DanglingEdgeConflict(edge, node, p, d);
		}
		else {
			return null;
		}
	}

	private Collection<DanglingEdgeConflict> getDanglingEdgeTargetConflicts(MLSDMReferenceIndex referenceIndex) {
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = matchers.get(danglingEdgeTargetPattern);
		Collection<DanglingEdgeConflict> conflicts = new ArrayList<DanglingEdgeConflict>();
		
		try {
			while(matcher.findNextMatch()) {
				DanglingEdgeConflict conflict = getDanglingEdgeTargetConflict(matcher);
				if(isValid(conflict)) {
					conflicts.add(conflict);
				}
			}
		} catch (SDMException e) {
			e.printStackTrace();
		}
		
		matcher.reset();
		
		return conflicts;
	}

	@SuppressWarnings("unchecked")
	private DanglingEdgeConflict getDanglingEdgeTargetConflict(
			StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher) {
		VariablesScope<EClassifier, EStructuralFeature, MLExpression> vs = matcher.getVariablesScope();

		ElementWithHistory edge = (ElementWithHistory) vs.getVariable(DANGLING_EDGE_TARGET_EDGE).getValue();
		ElementWithHistory node = (ElementWithHistory) vs.getVariable(DANGLING_EDGE_TARGET_NODE).getValue();
		
		Collection<TimingUnit> pE = (Collection<TimingUnit>) edge.getValidIn().getPresentTiming();
		Collection<TimingUnit> dE = (Collection<TimingUnit>) edge.getValidIn().getDeletedTiming();
		Collection<TimingUnit> dN = (Collection<TimingUnit>) node.getValidIn().getDeletedTiming();
		
		Collection<TimingUnit> p = pE;
		Collection<TimingUnit> d = dN;
		d.removeAll(new LinkedHashSet<TimingUnit>(dE));
		
		if(!p.isEmpty() && !d.isEmpty()) {
			return new DanglingEdgeConflict(edge, node, p, d);
		}
		else {
			return null;
		}
	}

	private Collection<DoubleContainmentConflict> getDoubleContainmentConflicts(MLSDMReferenceIndex referenceIndex2) {
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = matchers.get(doubleContainmentPattern);
		Collection<DoubleContainmentConflict> conflicts = new ArrayList<DoubleContainmentConflict>();
		
		try {
			while(matcher.findNextMatch()) {
				DoubleContainmentConflict conflict = getDoubleContainmentConflict(matcher);
				if(isValid(conflict)) {
					conflicts.add(conflict);
				}
			}
		} catch (SDMException e) {
			e.printStackTrace();
		}
		
		matcher.reset();
		
		return conflicts;
	}

	@SuppressWarnings("unchecked")
	private DoubleContainmentConflict getDoubleContainmentConflict(
			StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher) {
		VariablesScope<EClassifier, EStructuralFeature, MLExpression> vs = matcher.getVariablesScope();

		ContainmentEdgeWithHistory containment1 = (ContainmentEdgeWithHistory) vs.getVariable(DOUBLE_CONTAINMENT_CONTAINMENT1).getValue();
		ContainmentEdgeWithHistory containment2 = (ContainmentEdgeWithHistory) vs.getVariable(DOUBLE_CONTAINMENT_CONTAINMENT2).getValue();
		EObject node = (NodeWithHistory) vs.getVariable(DOUBLE_CONTAINMENT_NODE).getValue();

		Collection<TimingUnit> p1 = (Collection<TimingUnit>) containment1.getValidIn().getPresentTiming();
		Collection<TimingUnit> x1 = (Collection<TimingUnit>) containment1.getValidIn().getAbsentTiming();
		
		Collection<TimingUnit> p2 = (Collection<TimingUnit>) containment2.getValidIn().getPresentTiming();
		Collection<TimingUnit> x2 = (Collection<TimingUnit>) containment2.getValidIn().getAbsentTiming();

		Collection<TimingUnit> p12 = p1;
		p12.retainAll(x2);

		Collection<TimingUnit> p21 = p2;
		p21.retainAll(x1);
		
		if(!p12.isEmpty() && !p21.isEmpty()) {
			return new DoubleContainmentConflict(containment1, containment2, node, p12, p21);
		}
		else {
			return null;
		}
	}


	private Collection<InvalidCorrespondenceDependencyConflict> getInvalidCorrespondenceDependencyConflicts(
			MLSDMReferenceIndex referenceIndex) {
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = matchers.get(invalidCorrespondenceDependencyPattern);
		Collection<InvalidCorrespondenceDependencyConflict> conflicts = new ArrayList<InvalidCorrespondenceDependencyConflict>();
		
		try {
			while(matcher.findNextMatch()) {
				InvalidCorrespondenceDependencyConflict conflict = getInvalidCorrespondenceDependencyConflict(matcher);
				if(isValid(conflict)) {
					conflicts.add(conflict);
				}
			}
		} catch (SDMException e) {
			e.printStackTrace();
		}
		
		matcher.reset();
		
		return conflicts;
	}

	@SuppressWarnings("unchecked")
	private InvalidCorrespondenceDependencyConflict getInvalidCorrespondenceDependencyConflict(
			StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher) {
		VariablesScope<EClassifier, EStructuralFeature, MLExpression> vs = matcher.getVariablesScope();

		TGGNodeWithHistory child = (TGGNodeWithHistory) vs.getVariable(INVALID_CORRESPONDENCE_DEPENDENCY_CHILD).getValue();
		TGGNodeWithHistory parent = (TGGNodeWithHistory) vs.getVariable(INVALID_CORRESPONDENCE_DEPENDENCY_PARENT).getValue();
		
		Collection<TimingUnit> pC = (Collection<TimingUnit>) parent.getValidIn().getPresentTiming();
		Collection<TimingUnit> dC = (Collection<TimingUnit>) parent.getValidIn().getDeletedTiming();
		Collection<TimingUnit> dP = (Collection<TimingUnit>) child.getValidIn().getDeletedTiming();
		
		Collection<TimingUnit> p = pC;
		Collection<TimingUnit> d = dP;
		d.removeAll(new LinkedHashSet<TimingUnit>(dC));
		
		if(!p.isEmpty() && !d.isEmpty()) {
			return new InvalidCorrespondenceDependencyConflict(parent, child, p, d);
		}
		else {
			return null;
		}
	}

	private Collection<RedundantCorrespondenceConflict> getRedundantCorrespondenceLeftConflicts(MLSDMReferenceIndex referenceIndex2) {
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = matchers.get(redundantCorrespondenceLeftPattern);
		Collection<RedundantCorrespondenceConflict> conflicts = new ArrayList<RedundantCorrespondenceConflict>();
		
		try {
			while(matcher.findNextMatch()) {
				RedundantCorrespondenceConflict conflict = getRedundantCorrespondenceLeftConflict(matcher);
				if(isValid(conflict)) {
					conflicts.add(conflict);
				}
			}
		} catch (SDMException e) {
			e.printStackTrace();
		}
		
		matcher.reset();
		
		return conflicts;
	}

	@SuppressWarnings("unchecked")
	private RedundantCorrespondenceConflict getRedundantCorrespondenceLeftConflict(
			StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher) {
		VariablesScope<EClassifier, EStructuralFeature, MLExpression> vs = matcher.getVariablesScope();

		TGGNodeWithHistory corr1 = (TGGNodeWithHistory) vs.getVariable(REDUNDANT_CORRESPONDENCE_LEFT_CORR1).getValue();
		TGGNodeWithHistory corr2 = (TGGNodeWithHistory) vs.getVariable(REDUNDANT_CORRESPONDENCE_LEFT_CORR2).getValue();
		EObject element = (EObject) vs.getVariable(REDUNDANT_CORRESPONDENCE_LEFT_ELEMENT).getValue();

		Collection<TimingUnit> p1 = (Collection<TimingUnit>) corr1.getValidIn().getPresentTiming();
		Collection<TimingUnit> x1 = (Collection<TimingUnit>) corr1.getValidIn().getAbsentTiming();
		
		Collection<TimingUnit> p2 = (Collection<TimingUnit>) corr2.getValidIn().getPresentTiming();
		Collection<TimingUnit> x2 = (Collection<TimingUnit>) corr2.getValidIn().getAbsentTiming();

		Collection<TimingUnit> p12 = p1;
		p12.retainAll(x2);

		Collection<TimingUnit> p21 = p2;
		p21.retainAll(x1);
		
		if(!p12.isEmpty() && !p21.isEmpty()) {
			return new RedundantCorrespondenceConflict(corr1, corr2, element, p12, p21);
		}
		else {
			return null;
		}
	}

	private Collection<RedundantCorrespondenceConflict> getRedundantCorrespondenceRightConflicts(MLSDMReferenceIndex referenceIndex) {
		StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher = matchers.get(redundantCorrespondenceLeftPattern);
		Collection<RedundantCorrespondenceConflict> conflicts = new ArrayList<RedundantCorrespondenceConflict>();
		
		try {
			while(matcher.findNextMatch()) {
				RedundantCorrespondenceConflict conflict = getRedundantCorrespondenceRightConflict(matcher);
				if(isValid(conflict)) {
					conflicts.add(conflict);
				}
			}
		} catch (SDMException e) {
			e.printStackTrace();
		}
		
		matcher.reset();
		
		return conflicts;
	}

	@SuppressWarnings("unchecked")
	private RedundantCorrespondenceConflict getRedundantCorrespondenceRightConflict(
			StoryPatternMatcher<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> matcher) {
		VariablesScope<EClassifier, EStructuralFeature, MLExpression> vs = matcher.getVariablesScope();

		TGGNodeWithHistory corr1 = (TGGNodeWithHistory) vs.getVariable(REDUNDANT_CORRESPONDENCE_RIGHT_CORR1).getValue();
		TGGNodeWithHistory corr2 = (TGGNodeWithHistory) vs.getVariable(REDUNDANT_CORRESPONDENCE_RIGHT_CORR2).getValue();
		EObject element = (EObject) vs.getVariable(REDUNDANT_CORRESPONDENCE_RIGHT_ELEMENT).getValue();

		Collection<TimingUnit> p1 = (Collection<TimingUnit>) corr1.getValidIn().getPresentTiming();
		Collection<TimingUnit> x1 = (Collection<TimingUnit>) corr1.getValidIn().getAbsentTiming();
		
		Collection<TimingUnit> p2 = (Collection<TimingUnit>) corr2.getValidIn().getPresentTiming();
		Collection<TimingUnit> x2 = (Collection<TimingUnit>) corr2.getValidIn().getAbsentTiming();

		Collection<TimingUnit> p12 = p1;
		p12.retainAll(x2);

		Collection<TimingUnit> p21 = p2;
		p21.retainAll(x1);
		
		if(!p12.isEmpty() && !p21.isEmpty()) {
			return new RedundantCorrespondenceConflict(corr1, corr2, element, p12, p21);
		}
		else {
			return null;
		}
	}
	
	private boolean isValid(Object conflict) {
		return conflict != null;
	}

}
