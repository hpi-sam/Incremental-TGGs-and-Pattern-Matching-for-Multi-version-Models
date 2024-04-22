package de.mdelab.migmm.history.adapter;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.ecore.OCLExpression;

import de.mdelab.expressions.interpreter.core.variables.VariablesScope;
import de.mdelab.migmm.history.HistoryPackage;
import de.mdelab.mlexpressions.MLExpression;
import de.mdelab.mlexpressions.MLStringExpression;
import de.mdelab.mlexpressions.MlexpressionsFactory;
import de.mdelab.mlsdm.Activity;
import de.mdelab.mlsdm.ActivityEdge;
import de.mdelab.mlsdm.ActivityNode;
import de.mdelab.mlsdm.interpreter.facade.MLSDMMetamodelFacadeFactory;
import de.mdelab.mlsdm.interpreter.notifications.MLSDMNotificationEmitter;
import de.mdelab.mlsdm.interpreter.searchModel.patternMatcher.expressions.MLSDMOCLExpressionAnalyzer;
import de.mdelab.mlstorypatterns.AbstractStoryPatternLink;
import de.mdelab.mlstorypatterns.AbstractStoryPatternObject;
import de.mdelab.mlstorypatterns.StoryPattern;
import de.mdelab.mltgg.AttributeAssignment;
import de.mdelab.mltgg.CorrespondenceDomain;
import de.mdelab.mltgg.CorrespondenceLink;
import de.mdelab.mltgg.CorrespondenceNode;
import de.mdelab.mltgg.LeftModelDomain;
import de.mdelab.mltgg.MltggFactory;
import de.mdelab.mltgg.ModelDomain;
import de.mdelab.mltgg.ModelElement;
import de.mdelab.mltgg.ModelLink;
import de.mdelab.mltgg.ModelObject;
import de.mdelab.mltgg.RightModelDomain;
import de.mdelab.mltgg.RuleParameter;
import de.mdelab.mltgg.TGG;
import de.mdelab.mltgg.TGGModifierEnum;
import de.mdelab.mltgg.TGGRule;
import de.mdelab.mltgg.TGGRuleGroup;
import de.mdelab.sdm.interpreter.core.patternmatcher.searchModelBased.expressions.ExpressionAnalyzerManager;
import de.mdelab.sdm.interpreter.core.variables.NotifierVariablesScope;

public class TGGAdapter {

	private final EClass rootClass;
	private final EStructuralFeature edgeSourceFeature;
	private final EStructuralFeature edgeTargetFeature;
	
	private final ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression> analyzerManager;

	
	public TGGAdapter() throws IOException {
		EPackage historyPackage = HistoryPackage.eINSTANCE;//AdapterUtil.loadEPackage(URI.createPlatformPluginURI("de.mdelab.migmm.history/model/history.ecore", false));
		this.rootClass = (EClass) historyPackage.getEClassifier("History");
		this.edgeSourceFeature = ((EClass) historyPackage.getEClassifier("EdgeWithHistory")).getEStructuralFeature("edgeSource");
		this.edgeTargetFeature = ((EClass) historyPackage.getEClassifier("EdgeWithHistory")).getEStructuralFeature("edgeTarget");
		
		this.analyzerManager = createExpressionAnalyzerManager();
	}

	private ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression> createExpressionAnalyzerManager() {
		ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression> analyzerManager = new ExpressionAnalyzerManager<EClassifier, EStructuralFeature, MLExpression>(MLSDMMetamodelFacadeFactory.INSTANCE.getExpressionFacade());
		analyzerManager.registerExpressionAnalyzer("OCL", new MLSDMOCLExpressionAnalyzer(analyzerManager));
		return analyzerManager;
	}

	public TGG adaptTGG(TGG tgg, Map<EModelElement, EClass> packageMapping, EClass axiomClass) {
		TGG adapted = MltggFactory.eINSTANCE.createTGG();
		adapted.setName(getAdaptedName(tgg.getName()));
		adapted.setTggID(getAdaptedName(tgg.getTggID()));
		
		TGGRuleGroup axiomGroup = createAxiom(packageMapping, axiomClass);
		adapted.getRuleGroups().add(axiomGroup);
		
		for(TGGRuleGroup ruleGroup:tgg.getRuleGroups()) {
			TGGRuleGroup adaptedGroup = MltggFactory.eINSTANCE.createTGGRuleGroup();
			adaptedGroup.setEnabled(ruleGroup.isEnabled());
			adaptedGroup.setIsAxiom(false);
			adaptedGroup.setName(getAdaptedName(ruleGroup.getName()));
			adaptedGroup.setRuleGroupID(getAdaptedName(ruleGroup.getRuleGroupID()));
			adaptedGroup.setTgg(adapted);
			
			for(TGGRule rule:ruleGroup.getRules()) {
				TGGRule adaptedRule = createAdaptedRule(rule, packageMapping, axiomClass);
				adaptedRule.setRuleGroup(adaptedGroup);
			}
		}
		
		return adapted;
	}

	private void createAxiomDependencies(TGGRule adaptedRule, Map<EModelElement, EClass> packageMapping, EClass axiomClass) {
		CorrespondenceDomain domain = adaptedRule.getCorrespondenceDomain();
		ModelDomain leftDomain = adaptedRule.getLeftModelDomain();
		ModelDomain rightDomain = adaptedRule.getRightModelDomain();
		
		CorrespondenceNode axiomNode = MltggFactory.eINSTANCE.createCorrespondenceNode();
		axiomNode.setName("corrHistory2History");
		axiomNode.setModifier(TGGModifierEnum.NONE);
		axiomNode.setType(axiomClass);
		domain.getCorrespondenceNodes().add(axiomNode);

		createHistoryLinks(leftDomain, axiomNode, "left");
		createHistoryLinks(rightDomain, axiomNode, "right");
	}

	private void createHistoryLinks(ModelDomain domain, CorrespondenceNode axiomNode, String historyName) {
		ModelObject history = MltggFactory.eINSTANCE.createModelObject();
		history.setName(historyName);
		history.setModifier(TGGModifierEnum.NONE);
		history.setType(rootClass);
		domain.getModelObjects().add(history);
		createCorrespondenceLink(history, axiomNode);

		for(ModelObject o:domain.getModelObjects()) {
			if(o != history) {
				CorrespondenceNode corrNode = o.getIncomingCorrespondenceLink().getSource();
				ModelLink link = MltggFactory.eINSTANCE.createModelLink();
				link.setFeature(rootClass.getEStructuralFeature("ownedElements"));
				link.setModifier(corrNode.getModifier());
				link.setSource(history);
				link.setTarget(o);
				domain.getModelLinks().add(link);
				createCorrespondenceLink(link, corrNode);
			}
		}
	}

	private TGGRuleGroup createAxiom(Map<EModelElement, EClass> packageMapping, EClass axiomClass) {
		TGGRuleGroup group = MltggFactory.eINSTANCE.createTGGRuleGroup();
		group.setIsAxiom(true);
		group.setEnabled(true);
		group.setName("History2History");
		group.setRuleGroupID("History2History2");
		
		TGGRule rule = MltggFactory.eINSTANCE.createTGGRule();
		rule.setEnabled(true);
		rule.setName("History2History");
		rule.setRuleID("History2History");
		group.getRules().add(rule);
		
		LeftModelDomain left = MltggFactory.eINSTANCE.createLeftModelDomain();
		rule.setLeftModelDomain(left);
		RightModelDomain right = MltggFactory.eINSTANCE.createRightModelDomain();
		rule.setRightModelDomain(right);
		CorrespondenceDomain corr = MltggFactory.eINSTANCE.createCorrespondenceDomain();
		rule.setCorrespondenceDomain(corr);

		CorrespondenceNode corrNode = MltggFactory.eINSTANCE.createCorrespondenceNode();
		corrNode.setModifier(TGGModifierEnum.CREATE);
		corrNode.setName("corr");
		corrNode.setType(axiomClass);
		corr.getCorrespondenceNodes().add(corrNode);

		ModelObject leftHistory = MltggFactory.eINSTANCE.createModelObject();
		leftHistory.setName("left");
		leftHistory.setModifier(TGGModifierEnum.CREATE);
		leftHistory.setType(rootClass);
		left.getModelObjects().add(leftHistory);
		rule.getLeftInputElements().add(leftHistory);
		createCorrespondenceLink(leftHistory, corrNode);

		ModelObject rightHistory = MltggFactory.eINSTANCE.createModelObject();
		rightHistory.setName("right");
		rightHistory.setModifier(TGGModifierEnum.CREATE);
		rightHistory.setType(rootClass);
		right.getModelObjects().add(rightHistory);
		rule.getRightInputElements().add(rightHistory);
		createCorrespondenceLink(rightHistory, corrNode);
		
		return group;
	}

	private TGGRule createAdaptedRule(TGGRule rule, Map<EModelElement, EClass> packageMapping, EClass axiomClass) {
		analyzerManager.setVariablesScope(createDummyVariablesScope(rule));
		
		TGGRule adapted = MltggFactory.eINSTANCE.createTGGRule();
		adapted.setName(getAdaptedName(rule.getName()));
		adapted.setRuleID(getAdaptedName(rule.getRuleID()));
		adapted.setEnabled(rule.isEnabled());
		
		LeftModelDomain left = MltggFactory.eINSTANCE.createLeftModelDomain();
		adapted.setLeftModelDomain(left);
		RightModelDomain right = MltggFactory.eINSTANCE.createRightModelDomain();
		adapted.setRightModelDomain(right);
		CorrespondenceDomain corr = MltggFactory.eINSTANCE.createCorrespondenceDomain();
		adapted.setCorrespondenceDomain(corr);
		
		Map<EObject, EObject> nodeMapping = new HashMap<EObject, EObject>();
		Map<ModelObject, Map<EStructuralFeature, ModelObject>> featureMapping = new HashMap<ModelObject, Map<EStructuralFeature, ModelObject>>();
		
		for(CorrespondenceNode corrNode:rule.getCorrespondenceDomain().getCorrespondenceNodes()) {
			CorrespondenceNode corrNodeAdapted = MltggFactory.eINSTANCE.createCorrespondenceNode();
			corrNodeAdapted.setName(getAdaptedName(corrNode.getName()));
			corrNodeAdapted.setModifier(corrNode.getModifier());
			corrNodeAdapted.setType(packageMapping.get(corrNode.getType()));
			corr.getCorrespondenceNodes().add(corrNodeAdapted);
			
			nodeMapping.put(corrNode, corrNodeAdapted);
		}

		for(ModelObject o:rule.getLeftModelDomain().getModelObjects()) {
			adaptObject(o, left, nodeMapping, packageMapping, featureMapping);
		}

		for(ModelLink link:rule.getLeftModelDomain().getModelLinks()) {
			adaptLink(link, left, nodeMapping, packageMapping);
		}
		
		for(ModelObject o:rule.getRightModelDomain().getModelObjects()) {
			adaptObject(o, right, nodeMapping, packageMapping, featureMapping);
		}

		for(ModelLink link:rule.getRightModelDomain().getModelLinks()) {
			adaptLink(link, right, nodeMapping, packageMapping);
		}
		
		for(MLExpression expression:rule.getAttributeFormulas()) {
			MLExpression adaptedExpression = adaptExpression(expression, null, nodeMapping, featureMapping, packageMapping);
			adapted.getAttributeFormulas().add(adaptedExpression);
		}
		
		for(RuleParameter parameter:rule.getRuleParameters()) {
			adaptRuleParameter(parameter, adapted, nodeMapping, featureMapping, packageMapping);
		}

		createAxiomDependencies(adapted, packageMapping, axiomClass);
		
		return adapted;
	}

	private NotifierVariablesScope<?, ?, ?, ?, ?, ?, EClassifier, EStructuralFeature, MLExpression> createDummyVariablesScope(TGGRule rule) {
		NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression> dummyVariablesScope
			= new NotifierVariablesScope<Activity, ActivityNode, ActivityEdge, StoryPattern, AbstractStoryPatternObject, AbstractStoryPatternLink, EClassifier, EStructuralFeature, MLExpression>(new MLSDMNotificationEmitter());

		for(ModelObject o:rule.getLeftModelDomain().getModelObjects()) {
			dummyVariablesScope.createVariable(o.getName(), o.getType(), null);
		}
		for(ModelObject o:rule.getRightModelDomain().getModelObjects()) {
			dummyVariablesScope.createVariable(o.getName(), o.getType(), null);
		}

		for(RuleParameter p:rule.getRuleParameters()) {
			dummyVariablesScope.createVariable(p.getName(), p.getType(), null);
		}
		
		return dummyVariablesScope;
	}

	private void adaptRuleParameter(RuleParameter parameter, TGGRule adaptedRule, Map<EObject, EObject> nodeMapping,
			Map<ModelObject, Map<EStructuralFeature, ModelObject>> featureMapping,
			Map<EModelElement, EClass> packageMapping) {
		RuleParameter adapted = MltggFactory.eINSTANCE.createRuleParameter();
		adapted.setName(parameter.getName());
		
		EClassifier mappedType = packageMapping.get(parameter.getType());
		EClassifier type = mappedType != null ? mappedType : parameter.getType();
		adapted.setType(type);
		
		MLExpression forwardAdapted = adaptExpression(parameter.getForwardCalculationExpression(), null, nodeMapping, featureMapping, packageMapping);
		adapted.setForwardCalculationExpression(forwardAdapted);
		
		MLExpression backwardAdapted = adaptExpression(parameter.getBackwardCalculationExpression(), null, nodeMapping, featureMapping, packageMapping);
		adapted.setBackwardCalculationExpression(backwardAdapted);
		
		adaptedRule.getRuleParameters().add(adapted);
	}

	private void adaptObject(ModelObject o, ModelDomain modelDomain, Map<EObject, EObject> nodeMapping,
			Map<EModelElement, EClass> packageMapping, Map<ModelObject, Map<EStructuralFeature, ModelObject>> featureMapping) {
		CorrespondenceNode corrNode = (CorrespondenceNode) nodeMapping.get(o.getIncomingCorrespondenceLink().getSource());
		
		EClass adaptedType = packageMapping.get(o.getType());
		
		ModelObject oAdapted = MltggFactory.eINSTANCE.createModelObject();
		oAdapted.setName(getAdaptedName(o.getName()));
		oAdapted.setModifier(o.getModifier());
		oAdapted.setType(adaptedType);
		modelDomain.getModelObjects().add(oAdapted);
		createCorrespondenceLink(oAdapted, corrNode);
		
		nodeMapping.put(o, oAdapted);
		
		for(AttributeAssignment assignment:o.getAttributeAssignments()) {
			EStructuralFeature feature = assignment.getFeature();
			EClass adaptedFeature = packageMapping.get(feature);
			
			ModelObject assignmentObject = getFeatureObject(o, feature, nodeMapping, featureMapping, packageMapping);
			
			AttributeAssignment adaptedAssignment = MltggFactory.eINSTANCE.createAttributeAssignment();
			adaptedAssignment.setFeature(adaptedFeature.getEStructuralFeature("value"));
			adaptedAssignment.setAssignmentExpression(adaptExpression(assignment.getAssignmentExpression(), o, nodeMapping, featureMapping, packageMapping));
			assignmentObject.getAttributeAssignments().add(adaptedAssignment);
		}
	}

	private void adaptLink(ModelLink link, ModelDomain domain, Map<EObject, EObject> nodeMapping,
			Map<EModelElement, EClass> packageMapping) {
		ModelObject source = (ModelObject) nodeMapping.get(link.getSource());
		ModelObject target = (ModelObject) nodeMapping.get(link.getTarget());
		CorrespondenceNode corrNode = (CorrespondenceNode) nodeMapping.get(link.getIncomingCorrespondenceLink().getSource());
		
		EClass linkClass = packageMapping.get(link.getFeature());
		
		ModelObject linkObject = MltggFactory.eINSTANCE.createModelObject();
		linkObject.setName(getAdaptedLinkName(link));
		linkObject.setModifier(link.getModifier());
		linkObject.setType(linkClass);
		domain.getModelObjects().add(linkObject);
		createCorrespondenceLink(linkObject, corrNode);

		ModelLink sourceLink = MltggFactory.eINSTANCE.createModelLink();
		sourceLink.setFeature(getMatchingReference((EClass) source.getType(), linkClass));
		sourceLink.setModifier(link.getModifier());
		sourceLink.setModelDomain(domain);
		sourceLink.setSource(source);
		sourceLink.setTarget(linkObject);
		createCorrespondenceLink(sourceLink, corrNode);
		
		ModelLink targetLink = MltggFactory.eINSTANCE.createModelLink();
		targetLink.setFeature(getMatchingReference(linkClass, (EClass) target.getType()));
		targetLink.setModifier(link.getModifier());
		targetLink.setModelDomain(domain);
		targetLink.setSource(linkObject);
		targetLink.setTarget(target);
		createCorrespondenceLink(targetLink, corrNode);

		ModelLink genericSourceLink = MltggFactory.eINSTANCE.createModelLink();
		genericSourceLink.setFeature(edgeSourceFeature);
		genericSourceLink.setModifier(link.getModifier());
		genericSourceLink.setModelDomain(domain);
		genericSourceLink.setSource(linkObject);
		genericSourceLink.setTarget(source);
		createCorrespondenceLink(genericSourceLink, corrNode);

		ModelLink genericTargetLink = MltggFactory.eINSTANCE.createModelLink();
		genericTargetLink.setFeature(edgeTargetFeature);
		genericTargetLink.setModifier(link.getModifier());
		genericTargetLink.setModelDomain(domain);
		genericTargetLink.setSource(linkObject);
		genericTargetLink.setTarget(target);
		createCorrespondenceLink(genericTargetLink, corrNode);
	}

	private ModelObject getFeatureObject(ModelObject o, EStructuralFeature feature,
			Map<EObject, EObject> nodeMapping, Map<ModelObject, Map<EStructuralFeature, ModelObject>> featureMapping, Map<EModelElement, EClass> packageMapping) {
		if(!featureMapping.containsKey(o)) {
			featureMapping.put(o, new HashMap<EStructuralFeature, ModelObject>());
		}
		Map<EStructuralFeature, ModelObject> oMapping = featureMapping.get(o);
		if(!oMapping.containsKey(feature)) {
			ModelObject oAdapted = (ModelObject) nodeMapping.get(o);
			ModelDomain modelDomain = oAdapted.getModelDomain();
			EClass adaptedType = packageMapping.get(o.getType());
			EClass adaptedFeature = packageMapping.get(feature);
			CorrespondenceNode corrNode = oAdapted.getIncomingCorrespondenceLink().getSource();
			
			ModelObject featureObject = MltggFactory.eINSTANCE.createModelObject();
			featureObject.setName(getFeatureObjectName(oAdapted, feature));
			featureObject.setModifier(o.getModifier());
			featureObject.setType(adaptedFeature);
			modelDomain.getModelObjects().add(featureObject);
			createCorrespondenceLink(featureObject, corrNode);

			ModelLink featureEdge = MltggFactory.eINSTANCE.createModelLink();
			featureEdge.setModifier(o.getModifier());
			featureEdge.setFeature(getMatchingReference(adaptedType, adaptedFeature));
			featureEdge.setSource(oAdapted);
			featureEdge.setTarget(featureObject);
			modelDomain.getModelLinks().add(featureEdge);
			createCorrespondenceLink(featureEdge, corrNode);
			
			oMapping.put(feature, featureObject);
		}
		return oMapping.get(feature);
	}

	private MLExpression adaptExpression(MLExpression expression, ModelObject contextObject, Map<EObject, EObject> nodeMapping, Map<ModelObject, Map<EStructuralFeature, ModelObject>> featureMapping, Map<EModelElement, EClass> packageMapping) {
		if(!(expression instanceof MLStringExpression) || !expression.getExpressionLanguage().equals("OCL")) {
			return null;
		}
		Map<String, ModelObject> modelObjects = createNameMap(nodeMapping.keySet());
		
		EClassifier contextClassifier = contextObject != null ? contextObject.getType() : EcorePackage.Literals.EOBJECT;
		OCLExpression ast = (OCLExpression) analyzerManager.parseAST(expression, contextClassifier);
		
		OCLFeatureAccessLocationVisitor visitor = new OCLFeatureAccessLocationVisitor();
		ast.accept(visitor);
		List<FeatureAccessLocation> featureLocations = visitor.getFeatureLocations();
		Collections.sort(featureLocations, new Comparator<FeatureAccessLocation>() {

			@Override
			public int compare(FeatureAccessLocation arg0, FeatureAccessLocation arg1) {
				return Integer.compare(arg0.getStart(), arg1.getStart());
			}
			
		});
		
		String expressionString = ((MLStringExpression) expression).getExpressionString();
		StringBuffer adaptedExpressionString = new StringBuffer();
		int lastEnd = 0;
		for(FeatureAccessLocation featureLocation:featureLocations) {
			adaptedExpressionString.append(expressionString.substring(lastEnd, featureLocation.getStart()));
			
			ModelObject featureObject;
			if(featureLocation.getVariable().equals("self")) {
				featureObject = getFeatureObject(contextObject, featureLocation.getFeature(), nodeMapping, featureMapping, packageMapping);
			}
			else {
				featureObject = getFeatureObject(modelObjects.get(featureLocation.getVariable()), featureLocation.getFeature(), nodeMapping, featureMapping, packageMapping);
			}
			adaptedExpressionString.append(featureObject.getName());
			adaptedExpressionString.append(featureLocation.getFeature().isMany() ? "->" : ".");
			adaptedExpressionString.append("value");
			
			lastEnd = featureLocation.getEnd();
		}
		if(lastEnd < expressionString.length()) {
			adaptedExpressionString.append(expressionString.substring(lastEnd, expressionString.length()));
		}
		
		MLStringExpression adaptedExpression = MlexpressionsFactory.eINSTANCE.createMLStringExpression();
		adaptedExpression.setExpressionLanguageID(((MLStringExpression) expression).getExpressionLanguage());
		adaptedExpression.setExpressionString(adaptedExpressionString.toString());
		return adaptedExpression;
	}

	private void createCorrespondenceLink(ModelElement o, CorrespondenceNode corrNode) {
		CorrespondenceLink link = MltggFactory.eINSTANCE.createCorrespondenceLink();
		link.setModifier(corrNode.getModifier());
		link.setSource(corrNode);
		link.setTarget(o);
		corrNode.getCorrespondenceDomain().getCorrespondenceLinks().add(link);
	}

	private Map<String, ModelObject> createNameMap(Collection<EObject> objects) {
		Map<String, ModelObject> nameMap = new HashMap<String, ModelObject>();
		for(EObject object:objects) {
			if(object instanceof ModelObject) {
				ModelObject modelObject = (ModelObject) object;
				nameMap.put(modelObject.getName(), modelObject);
			}
		}
		return nameMap;
	}

	private EStructuralFeature getMatchingReference(EClass sourceType, EClass targetType) {
		for(EReference feature:sourceType.getEAllReferences()) {
			if(!(((EClassifier) feature.eContainer()).getEPackage() == HistoryPackage.eINSTANCE) && isSuperType(feature.getEReferenceType(), targetType)) {
				return feature;
			}
		}
		return null;
	}

	private boolean isSuperType(EClass superType, EClass type) {
		return type == superType ||
				type.getEAllSuperTypes().contains(superType);
	}

	private String getAdaptedName(String name) {
		return name + "_adapted";
	}

	private String getAdaptedLinkName(ModelLink link) {
		return getAdaptedName(link.getSource().getName() + "__" + link.getFeature().getName() + "__" + link.getTarget().getName());
	}

	private String getFeatureObjectName(ModelObject oAdapted, EStructuralFeature feature) {
		return oAdapted.getName() + "_" + feature.getName();
	}

}
