<?xml version="1.0" encoding="UTF-8"?>
<workflow:Workflow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://mdelab/workflow/1.0" xmlns:workflow.components="http://mdelab/workflow/components/1.0" xmi:id="_iH3Z8EkbEeKay8Q5jKlH_Q" name="generate operational rules">
  <components xsi:type="workflow.components:WorkflowDelegation" xmi:id="_pCfhQHQyEeK12vtRnZvYFQ" name="validate TGG" workflowURI="validate TGG.workflow"/>
  <components xsi:type="workflow.components:WorkflowDelegation" xmi:id="_iH3Z8UkbEeKay8Q5jKlH_Q" name="generate operational rules" workflowURI="platform:/plugin/de.mdelab.mltgg.mote2.generator/model/generateOperationalRules.workflow">
    <propertyValues xmi:id="_iH3Z80kbEeKay8Q5jKlH_Q" name="inputTGGURI" defaultValue="${inputTGGURI}"/>
    <propertyValues xmi:id="_iH3Z9EkbEeKay8Q5jKlH_Q" name="corrMetamodelURI" defaultValue="${corrMetamodelURI}"/>
    <propertyValues xmi:id="_iH3Z9UkbEeKay8Q5jKlH_Q" name="corrMetamodelNsURI" defaultValue="${corrMetamodelNsURI}"/>
    <propertyValues xmi:id="_iH3Z9kkbEeKay8Q5jKlH_Q" name="javaBasePackage" defaultValue="${javaBasePackage}"/>
    <propertyValues xmi:id="_iH3Z90kbEeKay8Q5jKlH_Q" name="projectName" defaultValue="${projectName}"/>
  </components>
  <propertiesFiles xmi:id="__xIIYEkcEeKay8Q5jKlH_Q" fileURI="generation.properties"/>
</workflow:Workflow>
