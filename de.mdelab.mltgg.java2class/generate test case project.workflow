<?xml version="1.0" encoding="UTF-8"?>
<workflow:Workflow xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:workflow="http://mdelab/workflow/1.0" xmlns:workflow.components="http://mdelab/workflow/components/1.0" xmi:id="_9RLu0D-SEeKcdevfdpY3iA" name="generate test case project">
  <components xsi:type="workflow.components:WorkflowDelegation" xmi:id="_fmvNcD-5EeKcdevfdpY3iA" name="generate test case project" workflowURI="platform:/plugin/de.mdelab.mltgg.mote2.ui/model/generateTestCaseProject.workflow">
    <propertyValues xmi:id="_jw6u4D-5EeKcdevfdpY3iA" name="projectName" defaultValue="${projectName}.tests"/>
    <propertyValues xmi:id="_9K4V4D-7EeKcdevfdpY3iA" name="inputTGGURI" defaultValue="${inputTGGURI}"/>
  </components>
  <propertiesFiles xmi:id="_RhlSQEkdEeKay8Q5jKlH_Q" fileURI="generation.properties"/>
</workflow:Workflow>
