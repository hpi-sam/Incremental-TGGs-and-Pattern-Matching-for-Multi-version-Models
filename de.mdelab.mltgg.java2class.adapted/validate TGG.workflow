<?xml version="1.0" encoding="UTF-8"?>
<workflow:Workflow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://mdelab/workflow/1.0" xmlns:workflow.components="http://mdelab/workflow/components/1.0" xmi:id="_iW9JYEkcEeKay8Q5jKlH_Q" name="generate operational rules">
  <components xsi:type="workflow.components:WorkflowDelegation" xmi:id="_iW9JYUkcEeKay8Q5jKlH_Q" name="workflowDelegation" workflowURI="platform:/plugin/de.mdelab.mltgg.mote2.generator/model/validateTGG.workflow">
    <propertyValues xmi:id="_iW9JY0kcEeKay8Q5jKlH_Q" name="inputTGGURI" defaultValue="${inputTGGURI}"/>
    <propertyValues xmi:id="_iW9JZEkcEeKay8Q5jKlH_Q" name="corrMetamodelURI" defaultValue="${corrMetamodelURI}"/>
    <propertyValues xmi:id="_iW9JZUkcEeKay8Q5jKlH_Q" name="corrMetamodelNsURI" defaultValue="${corrMetamodelNsURI}"/>
  </components>
  <propertiesFiles xmi:id="_pykmYEkcEeKay8Q5jKlH_Q" fileURI="generation.properties"/>
</workflow:Workflow>
