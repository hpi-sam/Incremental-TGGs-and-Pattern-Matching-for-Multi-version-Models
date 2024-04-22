/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.HistoryPackage;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedFactory;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.modisco.java.emf.JavaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Java_adaptedPackageImpl extends EPackageImpl implements Java_adaptedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "java_adapted.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeQualifiedExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractVariablesContainer_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archive_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNode_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValuePair_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeMemberDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayCreation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializer_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayLengthAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayType_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignment_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteral_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockComment_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchClause_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterLiteral_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classFile_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInstanceCreation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorInvocation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comment_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnit_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emptyStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enhancedForStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstantDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializer_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceofExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javadoc_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineComment_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifest_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestAttribute_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestEntry_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberRef_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRef_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRefParameter_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberLiteral_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullLiteral_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesizedExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postfixExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveType_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeBoolean_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeByte_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeChar_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeDouble_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeShort_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeFloat_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeInt_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeLong_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeVoid_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteral_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superConstructorInvocation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superFieldAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superMethodInvocation_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCase_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizedStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagElement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thisExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass type_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLiteral_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedItem_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedItemAccess_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedAnnotationDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedAnnotationTypeMemberDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedClassDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedEnumDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedInterfaceDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedLabeledStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedMethodDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedSingleVariableDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedType_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedTypeDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedVariableDeclarationFragment_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclaration_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationExpression_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationFragment_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wildCardType_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatement_adaptedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDeclaration_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDeclaration_adapted_parametersItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDeclaration_adapted_thrownExceptionsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDeclaration_adapted_typeParametersItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDeclaration_adapted_usagesInDocCommentsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodDeclaration_adapted_usagesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocation_adapted_methodItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocation_adapted_argumentsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMethodInvocation_adapted_typeArgumentsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeDeclaration_adapted_bodyDeclarationsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeDeclaration_adapted_commentsBeforeBodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeDeclaration_adapted_commentsAfterBodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeDeclaration_adapted_packageItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeDeclaration_adapted_superInterfacesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeQualifiedExpression_adapted_qualifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractVariablesContainer_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractVariablesContainer_adapted_fragmentsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotation_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotation_adapted_valuesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archive_adapted_originalFilePathValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archive_adapted_classFilesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass archive_adapted_manifestItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertStatement_adapted_messageItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNode_adapted_commentsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNode_adapted_originalCompilationUnitItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass astNode_adapted_originalClassFileItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValuePair_adapted_memberItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationMemberValuePair_adapted_valueItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeMemberDeclaration_adapted_defaultItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeMemberDeclaration_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeMemberDeclaration_adapted_usagesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassDeclaration_adapted_bodyDeclarationsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousClassDeclaration_adapted_classInstanceCreationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAccess_adapted_arrayItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayAccess_adapted_indexItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayCreation_adapted_dimensionsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayCreation_adapted_initializerItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayCreation_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayInitializer_adapted_expressionsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayLengthAccess_adapted_arrayItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayType_adapted_dimensionsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayType_adapted_elementTypeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignment_adapted_leftHandSideItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignment_adapted_operatorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignment_adapted_rightHandSideItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyDeclaration_adapted_abstractTypeDeclarationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyDeclaration_adapted_annotationsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyDeclaration_adapted_anonymousClassDeclarationOwnerItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyDeclaration_adapted_modifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteral_adapted_valueValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_adapted_statementsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakStatement_adapted_labelItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpression_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castExpression_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchClause_adapted_exceptionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchClause_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterLiteral_adapted_escapedValueValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classFile_adapted_originalFilePathValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classFile_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classFile_adapted_attachedSourceItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classFile_adapted_packageItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInstanceCreation_adapted_anonymousClassDeclarationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInstanceCreation_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classInstanceCreation_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpression_adapted_elseExpressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpression_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalExpression_adapted_thenExpressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclaration_adapted_superClassItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comment_adapted_contentValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comment_adapted_enclosedByParentValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comment_adapted_prefixOfParentValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnit_adapted_originalFilePathValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnit_adapted_commentListItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnit_adapted_importsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnit_adapted_packageItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compilationUnit_adapted_typesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueStatement_adapted_labelItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doStatement_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enhancedForStatement_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enhancedForStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enhancedForStatement_adapted_parameterItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstantDeclaration_adapted_anonymousClassDeclarationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumConstantDeclaration_adapted_argumentsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumDeclaration_adapted_enumConstantsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccess_adapted_fieldItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldAccess_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatement_adapted_updatersItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatement_adapted_initializersItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forStatement_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatement_adapted_thenStatementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifStatement_adapted_elseStatementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importDeclaration_adapted_staticValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importDeclaration_adapted_importedElementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixExpression_adapted_operatorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixExpression_adapted_rightOperandItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixExpression_adapted_leftOperandItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infixExpression_adapted_extendedOperandsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializer_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceofExpression_adapted_rightOperandItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceofExpression_adapted_leftOperandItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javadoc_adapted_tagsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledStatement_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledStatement_adapted_usagesInBreakStatementsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledStatement_adapted_usagesInContinueStatementsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifest_adapted_mainAttributesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifest_adapted_entryAttributesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestAttribute_adapted_keyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestAttribute_adapted_valueValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestEntry_adapted_nameValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestEntry_adapted_attributesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberRef_adapted_memberItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberRef_adapted_qualifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclaration_adapted_extraArrayDimensionsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclaration_adapted_returnTypeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclaration_adapted_redefinedMethodDeclarationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodDeclaration_adapted_redefinitionsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodInvocation_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRef_adapted_methodItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRef_adapted_qualifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRef_adapted_parametersItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRefParameter_adapted_nameValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRefParameter_adapted_varargsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodRefParameter_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_adapted_nameValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_adapted_ownedElementsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_adapted_orphanTypesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_adapted_unresolvedItemsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_adapted_compilationUnitsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_adapted_classFilesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass model_adapted_archivesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_visibilityValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_inheritanceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_staticValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_transientValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_volatileValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_nativeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_strictfpValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_synchronizedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_bodyDeclarationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_singleVariableDeclarationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_variableDeclarationStatementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifier_adapted_variableDeclarationExpressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElement_adapted_nameValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElement_adapted_proxyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElement_adapted_usagesInImportsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberLiteral_adapted_tokenValueValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package_adapted_ownedElementsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package_adapted_modelItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package_adapted_ownedPackagesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package_adapted_packageItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package_adapted_usagesInPackageAccessItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageAccess_adapted_packageItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageAccess_adapted_qualifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedType_adapted_typeArgumentsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parenthesizedExpression_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postfixExpression_adapted_operatorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postfixExpression_adapted_operandItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixExpression_adapted_operatorValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefixExpression_adapted_operandItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableAccess_adapted_variableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableAccess_adapted_qualifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclaration_adapted_modifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclaration_adapted_varargsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclaration_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclaration_adapted_annotationsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclaration_adapted_methodDeclarationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclaration_adapted_catchClauseItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleVariableDeclaration_adapted_enhancedForStatementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteral_adapted_escapedValueValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superConstructorInvocation_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superFieldAccess_adapted_fieldItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCase_adapted_defaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCase_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchStatement_adapted_statementsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizedStatement_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizedStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagElement_adapted_tagNameValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagElement_adapted_fragmentsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElement_adapted_textValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryStatement_adapted_bodyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryStatement_adapted_finallyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tryStatement_adapted_catchClausesItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass type_adapted_usagesInTypeAccessItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeAccess_adapted_qualifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclaration_adapted_typeParametersItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationStatement_adapted_declarationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeLiteral_adapted_typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeParameter_adapted_boundsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedItemAccess_adapted_elementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unresolvedItemAccess_adapted_qualifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclaration_adapted_extraArrayDimensionsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclaration_adapted_initializerItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclaration_adapted_usageInVariableAccessItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationExpression_adapted_modifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationExpression_adapted_annotationsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationFragment_adapted_variablesContainerItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationStatement_adapted_extraArrayDimensionsValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationStatement_adapted_modifierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationStatement_adapted_annotationsItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wildCardType_adapted_upperBoundValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wildCardType_adapted_boundItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatement_adapted_expressionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileStatement_adapted_bodyItemEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Java_adaptedPackageImpl() {
		super(eNS_URI, Java_adaptedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Java_adaptedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Java_adaptedPackage init() {
		if (isInited) return (Java_adaptedPackage)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJava_adaptedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Java_adaptedPackageImpl theJava_adaptedPackage = registeredJava_adaptedPackage instanceof Java_adaptedPackageImpl ? (Java_adaptedPackageImpl)registeredJava_adaptedPackage : new Java_adaptedPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		HistoryPackage.eINSTANCE.eClass();
		JavaPackage.eINSTANCE.eClass();

		// Load packages
		theJava_adaptedPackage.loadPackage();

		// Fix loaded packages
		theJava_adaptedPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theJava_adaptedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Java_adaptedPackage.eNS_URI, theJava_adaptedPackage);
		return theJava_adaptedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodDeclaration_adapted() {
		if (abstractMethodDeclaration_adaptedEClass == null) {
			abstractMethodDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(0);
		}
		return abstractMethodDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_Body() {
        return (EReference)getAbstractMethodDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_Parameters() {
        return (EReference)getAbstractMethodDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_ThrownExceptions() {
        return (EReference)getAbstractMethodDeclaration_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_TypeParameters() {
        return (EReference)getAbstractMethodDeclaration_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_UsagesInDocComments() {
        return (EReference)getAbstractMethodDeclaration_adapted().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_Usages() {
        return (EReference)getAbstractMethodDeclaration_adapted().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodInvocation_adapted() {
		if (abstractMethodInvocation_adaptedEClass == null) {
			abstractMethodInvocation_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(1);
		}
		return abstractMethodInvocation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocation_adapted_Method() {
        return (EReference)getAbstractMethodInvocation_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocation_adapted_Arguments() {
        return (EReference)getAbstractMethodInvocation_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocation_adapted_TypeArguments() {
        return (EReference)getAbstractMethodInvocation_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeDeclaration_adapted() {
		if (abstractTypeDeclaration_adaptedEClass == null) {
			abstractTypeDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(2);
		}
		return abstractTypeDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_BodyDeclarations() {
        return (EReference)getAbstractTypeDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_CommentsBeforeBody() {
        return (EReference)getAbstractTypeDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_CommentsAfterBody() {
        return (EReference)getAbstractTypeDeclaration_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_Package() {
        return (EReference)getAbstractTypeDeclaration_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_SuperInterfaces() {
        return (EReference)getAbstractTypeDeclaration_adapted().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeQualifiedExpression_adapted() {
		if (abstractTypeQualifiedExpression_adaptedEClass == null) {
			abstractTypeQualifiedExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(3);
		}
		return abstractTypeQualifiedExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeQualifiedExpression_adapted_Qualifier() {
        return (EReference)getAbstractTypeQualifiedExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractVariablesContainer_adapted() {
		if (abstractVariablesContainer_adaptedEClass == null) {
			abstractVariablesContainer_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(4);
		}
		return abstractVariablesContainer_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractVariablesContainer_adapted_Type() {
        return (EReference)getAbstractVariablesContainer_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractVariablesContainer_adapted_Fragments() {
        return (EReference)getAbstractVariablesContainer_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation_adapted() {
		if (annotation_adaptedEClass == null) {
			annotation_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(5);
		}
		return annotation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_adapted_Type() {
        return (EReference)getAnnotation_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_adapted_Values() {
        return (EReference)getAnnotation_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchive_adapted() {
		if (archive_adaptedEClass == null) {
			archive_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(6);
		}
		return archive_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchive_adapted_OriginalFilePath() {
        return (EReference)getArchive_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchive_adapted_ClassFiles() {
        return (EReference)getArchive_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchive_adapted_Manifest() {
        return (EReference)getArchive_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertStatement_adapted() {
		if (assertStatement_adaptedEClass == null) {
			assertStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(7);
		}
		return assertStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertStatement_adapted_Message() {
        return (EReference)getAssertStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertStatement_adapted_Expression() {
        return (EReference)getAssertStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASTNode_adapted() {
		if (astNode_adaptedEClass == null) {
			astNode_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(8);
		}
		return astNode_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNode_adapted_Comments() {
        return (EReference)getASTNode_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNode_adapted_OriginalCompilationUnit() {
        return (EReference)getASTNode_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNode_adapted_OriginalClassFile() {
        return (EReference)getASTNode_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValuePair_adapted() {
		if (annotationMemberValuePair_adaptedEClass == null) {
			annotationMemberValuePair_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(9);
		}
		return annotationMemberValuePair_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValuePair_adapted_Member() {
        return (EReference)getAnnotationMemberValuePair_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValuePair_adapted_Value() {
        return (EReference)getAnnotationMemberValuePair_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeDeclaration_adapted() {
		if (annotationTypeDeclaration_adaptedEClass == null) {
			annotationTypeDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(10);
		}
		return annotationTypeDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeMemberDeclaration_adapted() {
		if (annotationTypeMemberDeclaration_adaptedEClass == null) {
			annotationTypeMemberDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(11);
		}
		return annotationTypeMemberDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeMemberDeclaration_adapted_Default() {
        return (EReference)getAnnotationTypeMemberDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeMemberDeclaration_adapted_Type() {
        return (EReference)getAnnotationTypeMemberDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeMemberDeclaration_adapted_Usages() {
        return (EReference)getAnnotationTypeMemberDeclaration_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassDeclaration_adapted() {
		if (anonymousClassDeclaration_adaptedEClass == null) {
			anonymousClassDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(12);
		}
		return anonymousClassDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassDeclaration_adapted_BodyDeclarations() {
        return (EReference)getAnonymousClassDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassDeclaration_adapted_ClassInstanceCreation() {
        return (EReference)getAnonymousClassDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayAccess_adapted() {
		if (arrayAccess_adaptedEClass == null) {
			arrayAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(13);
		}
		return arrayAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayAccess_adapted_Array() {
        return (EReference)getArrayAccess_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayAccess_adapted_Index() {
        return (EReference)getArrayAccess_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayCreation_adapted() {
		if (arrayCreation_adaptedEClass == null) {
			arrayCreation_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(14);
		}
		return arrayCreation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayCreation_adapted_Dimensions() {
        return (EReference)getArrayCreation_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayCreation_adapted_Initializer() {
        return (EReference)getArrayCreation_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayCreation_adapted_Type() {
        return (EReference)getArrayCreation_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayInitializer_adapted() {
		if (arrayInitializer_adaptedEClass == null) {
			arrayInitializer_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(15);
		}
		return arrayInitializer_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayInitializer_adapted_Expressions() {
        return (EReference)getArrayInitializer_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayLengthAccess_adapted() {
		if (arrayLengthAccess_adaptedEClass == null) {
			arrayLengthAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(16);
		}
		return arrayLengthAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayLengthAccess_adapted_Array() {
        return (EReference)getArrayLengthAccess_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayType_adapted() {
		if (arrayType_adaptedEClass == null) {
			arrayType_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(17);
		}
		return arrayType_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayType_adapted_Dimensions() {
        return (EReference)getArrayType_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayType_adapted_ElementType() {
        return (EReference)getArrayType_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment_adapted() {
		if (assignment_adaptedEClass == null) {
			assignment_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(18);
		}
		return assignment_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_adapted_LeftHandSide() {
        return (EReference)getAssignment_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_adapted_Operator() {
        return (EReference)getAssignment_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_adapted_RightHandSide() {
        return (EReference)getAssignment_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBodyDeclaration_adapted() {
		if (bodyDeclaration_adaptedEClass == null) {
			bodyDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(19);
		}
		return bodyDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyDeclaration_adapted_AbstractTypeDeclaration() {
        return (EReference)getBodyDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyDeclaration_adapted_Annotations() {
        return (EReference)getBodyDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyDeclaration_adapted_AnonymousClassDeclarationOwner() {
        return (EReference)getBodyDeclaration_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyDeclaration_adapted_Modifier() {
        return (EReference)getBodyDeclaration_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteral_adapted() {
		if (booleanLiteral_adaptedEClass == null) {
			booleanLiteral_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(20);
		}
		return booleanLiteral_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBooleanLiteral_adapted_Value() {
        return (EReference)getBooleanLiteral_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockComment_adapted() {
		if (blockComment_adaptedEClass == null) {
			blockComment_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(21);
		}
		return blockComment_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_adapted() {
		if (block_adaptedEClass == null) {
			block_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(22);
		}
		return block_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_adapted_Statements() {
        return (EReference)getBlock_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBreakStatement_adapted() {
		if (breakStatement_adaptedEClass == null) {
			breakStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(23);
		}
		return breakStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBreakStatement_adapted_Label() {
        return (EReference)getBreakStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCastExpression_adapted() {
		if (castExpression_adaptedEClass == null) {
			castExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(24);
		}
		return castExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCastExpression_adapted_Expression() {
        return (EReference)getCastExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCastExpression_adapted_Type() {
        return (EReference)getCastExpression_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatchClause_adapted() {
		if (catchClause_adaptedEClass == null) {
			catchClause_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(25);
		}
		return catchClause_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatchClause_adapted_Exception() {
        return (EReference)getCatchClause_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatchClause_adapted_Body() {
        return (EReference)getCatchClause_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacterLiteral_adapted() {
		if (characterLiteral_adaptedEClass == null) {
			characterLiteral_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(26);
		}
		return characterLiteral_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCharacterLiteral_adapted_EscapedValue() {
        return (EReference)getCharacterLiteral_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassFile_adapted() {
		if (classFile_adaptedEClass == null) {
			classFile_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(27);
		}
		return classFile_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassFile_adapted_OriginalFilePath() {
        return (EReference)getClassFile_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassFile_adapted_Type() {
        return (EReference)getClassFile_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassFile_adapted_AttachedSource() {
        return (EReference)getClassFile_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassFile_adapted_Package() {
        return (EReference)getClassFile_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInstanceCreation_adapted() {
		if (classInstanceCreation_adaptedEClass == null) {
			classInstanceCreation_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(28);
		}
		return classInstanceCreation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation_adapted_AnonymousClassDeclaration() {
        return (EReference)getClassInstanceCreation_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation_adapted_Expression() {
        return (EReference)getClassInstanceCreation_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation_adapted_Type() {
        return (EReference)getClassInstanceCreation_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorDeclaration_adapted() {
		if (constructorDeclaration_adaptedEClass == null) {
			constructorDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(29);
		}
		return constructorDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalExpression_adapted() {
		if (conditionalExpression_adaptedEClass == null) {
			conditionalExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(30);
		}
		return conditionalExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_adapted_ElseExpression() {
        return (EReference)getConditionalExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_adapted_Expression() {
        return (EReference)getConditionalExpression_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_adapted_ThenExpression() {
        return (EReference)getConditionalExpression_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorInvocation_adapted() {
		if (constructorInvocation_adaptedEClass == null) {
			constructorInvocation_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(31);
		}
		return constructorInvocation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDeclaration_adapted() {
		if (classDeclaration_adaptedEClass == null) {
			classDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(32);
		}
		return classDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDeclaration_adapted_SuperClass() {
        return (EReference)getClassDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment_adapted() {
		if (comment_adaptedEClass == null) {
			comment_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(33);
		}
		return comment_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_adapted_Content() {
        return (EReference)getComment_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_adapted_EnclosedByParent() {
        return (EReference)getComment_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_adapted_PrefixOfParent() {
        return (EReference)getComment_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit_adapted() {
		if (compilationUnit_adaptedEClass == null) {
			compilationUnit_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(34);
		}
		return compilationUnit_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_OriginalFilePath() {
        return (EReference)getCompilationUnit_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_CommentList() {
        return (EReference)getCompilationUnit_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_Imports() {
        return (EReference)getCompilationUnit_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_Package() {
        return (EReference)getCompilationUnit_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_Types() {
        return (EReference)getCompilationUnit_adapted().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinueStatement_adapted() {
		if (continueStatement_adaptedEClass == null) {
			continueStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(35);
		}
		return continueStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContinueStatement_adapted_Label() {
        return (EReference)getContinueStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoStatement_adapted() {
		if (doStatement_adaptedEClass == null) {
			doStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(36);
		}
		return doStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoStatement_adapted_Expression() {
        return (EReference)getDoStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoStatement_adapted_Body() {
        return (EReference)getDoStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmptyStatement_adapted() {
		if (emptyStatement_adaptedEClass == null) {
			emptyStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(37);
		}
		return emptyStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnhancedForStatement_adapted() {
		if (enhancedForStatement_adaptedEClass == null) {
			enhancedForStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(38);
		}
		return enhancedForStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnhancedForStatement_adapted_Body() {
        return (EReference)getEnhancedForStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnhancedForStatement_adapted_Expression() {
        return (EReference)getEnhancedForStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnhancedForStatement_adapted_Parameter() {
        return (EReference)getEnhancedForStatement_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumConstantDeclaration_adapted() {
		if (enumConstantDeclaration_adaptedEClass == null) {
			enumConstantDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(39);
		}
		return enumConstantDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumConstantDeclaration_adapted_AnonymousClassDeclaration() {
        return (EReference)getEnumConstantDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumConstantDeclaration_adapted_Arguments() {
        return (EReference)getEnumConstantDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumDeclaration_adapted() {
		if (enumDeclaration_adaptedEClass == null) {
			enumDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(40);
		}
		return enumDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumDeclaration_adapted_EnumConstants() {
        return (EReference)getEnumDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression_adapted() {
		if (expression_adaptedEClass == null) {
			expression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(41);
		}
		return expression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionStatement_adapted() {
		if (expressionStatement_adaptedEClass == null) {
			expressionStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(42);
		}
		return expressionStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionStatement_adapted_Expression() {
        return (EReference)getExpressionStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccess_adapted() {
		if (fieldAccess_adaptedEClass == null) {
			fieldAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(43);
		}
		return fieldAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccess_adapted_Field() {
        return (EReference)getFieldAccess_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccess_adapted_Expression() {
        return (EReference)getFieldAccess_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldDeclaration_adapted() {
		if (fieldDeclaration_adaptedEClass == null) {
			fieldDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(44);
		}
		return fieldDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForStatement_adapted() {
		if (forStatement_adaptedEClass == null) {
			forStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(45);
		}
		return forStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForStatement_adapted_Expression() {
        return (EReference)getForStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForStatement_adapted_Updaters() {
        return (EReference)getForStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForStatement_adapted_Initializers() {
        return (EReference)getForStatement_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForStatement_adapted_Body() {
        return (EReference)getForStatement_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfStatement_adapted() {
		if (ifStatement_adaptedEClass == null) {
			ifStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(46);
		}
		return ifStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_adapted_Expression() {
        return (EReference)getIfStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_adapted_ThenStatement() {
        return (EReference)getIfStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_adapted_ElseStatement() {
        return (EReference)getIfStatement_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportDeclaration_adapted() {
		if (importDeclaration_adaptedEClass == null) {
			importDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(47);
		}
		return importDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportDeclaration_adapted_Static() {
        return (EReference)getImportDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportDeclaration_adapted_ImportedElement() {
        return (EReference)getImportDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfixExpression_adapted() {
		if (infixExpression_adaptedEClass == null) {
			infixExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(48);
		}
		return infixExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfixExpression_adapted_Operator() {
        return (EReference)getInfixExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfixExpression_adapted_RightOperand() {
        return (EReference)getInfixExpression_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfixExpression_adapted_LeftOperand() {
        return (EReference)getInfixExpression_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfixExpression_adapted_ExtendedOperands() {
        return (EReference)getInfixExpression_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitializer_adapted() {
		if (initializer_adaptedEClass == null) {
			initializer_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(49);
		}
		return initializer_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitializer_adapted_Body() {
        return (EReference)getInitializer_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceofExpression_adapted() {
		if (instanceofExpression_adaptedEClass == null) {
			instanceofExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(50);
		}
		return instanceofExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceofExpression_adapted_RightOperand() {
        return (EReference)getInstanceofExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceofExpression_adapted_LeftOperand() {
        return (EReference)getInstanceofExpression_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceDeclaration_adapted() {
		if (interfaceDeclaration_adaptedEClass == null) {
			interfaceDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(51);
		}
		return interfaceDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavadoc_adapted() {
		if (javadoc_adaptedEClass == null) {
			javadoc_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(52);
		}
		return javadoc_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJavadoc_adapted_Tags() {
        return (EReference)getJavadoc_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledStatement_adapted() {
		if (labeledStatement_adaptedEClass == null) {
			labeledStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(53);
		}
		return labeledStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeledStatement_adapted_Body() {
        return (EReference)getLabeledStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeledStatement_adapted_UsagesInBreakStatements() {
        return (EReference)getLabeledStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeledStatement_adapted_UsagesInContinueStatements() {
        return (EReference)getLabeledStatement_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineComment_adapted() {
		if (lineComment_adaptedEClass == null) {
			lineComment_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(54);
		}
		return lineComment_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifest_adapted() {
		if (manifest_adaptedEClass == null) {
			manifest_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(55);
		}
		return manifest_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifest_adapted_MainAttributes() {
        return (EReference)getManifest_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifest_adapted_EntryAttributes() {
        return (EReference)getManifest_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifestAttribute_adapted() {
		if (manifestAttribute_adaptedEClass == null) {
			manifestAttribute_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(56);
		}
		return manifestAttribute_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifestAttribute_adapted_Key() {
        return (EReference)getManifestAttribute_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifestAttribute_adapted_Value() {
        return (EReference)getManifestAttribute_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifestEntry_adapted() {
		if (manifestEntry_adaptedEClass == null) {
			manifestEntry_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(57);
		}
		return manifestEntry_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifestEntry_adapted_Name() {
        return (EReference)getManifestEntry_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifestEntry_adapted_Attributes() {
        return (EReference)getManifestEntry_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberRef_adapted() {
		if (memberRef_adaptedEClass == null) {
			memberRef_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(58);
		}
		return memberRef_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberRef_adapted_Member() {
        return (EReference)getMemberRef_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberRef_adapted_Qualifier() {
        return (EReference)getMemberRef_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDeclaration_adapted() {
		if (methodDeclaration_adaptedEClass == null) {
			methodDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(59);
		}
		return methodDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDeclaration_adapted_ExtraArrayDimensions() {
        return (EReference)getMethodDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDeclaration_adapted_ReturnType() {
        return (EReference)getMethodDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDeclaration_adapted_RedefinedMethodDeclaration() {
        return (EReference)getMethodDeclaration_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDeclaration_adapted_Redefinitions() {
        return (EReference)getMethodDeclaration_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodInvocation_adapted() {
		if (methodInvocation_adaptedEClass == null) {
			methodInvocation_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(60);
		}
		return methodInvocation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation_adapted_Expression() {
        return (EReference)getMethodInvocation_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodRef_adapted() {
		if (methodRef_adaptedEClass == null) {
			methodRef_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(61);
		}
		return methodRef_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRef_adapted_Method() {
        return (EReference)getMethodRef_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRef_adapted_Qualifier() {
        return (EReference)getMethodRef_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRef_adapted_Parameters() {
        return (EReference)getMethodRef_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodRefParameter_adapted() {
		if (methodRefParameter_adaptedEClass == null) {
			methodRefParameter_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(62);
		}
		return methodRefParameter_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRefParameter_adapted_Name() {
        return (EReference)getMethodRefParameter_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRefParameter_adapted_Varargs() {
        return (EReference)getMethodRefParameter_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRefParameter_adapted_Type() {
        return (EReference)getMethodRefParameter_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_adapted() {
		if (model_adaptedEClass == null) {
			model_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(63);
		}
		return model_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_Name() {
        return (EReference)getModel_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_OwnedElements() {
        return (EReference)getModel_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_OrphanTypes() {
        return (EReference)getModel_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_UnresolvedItems() {
        return (EReference)getModel_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_CompilationUnits() {
        return (EReference)getModel_adapted().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_ClassFiles() {
        return (EReference)getModel_adapted().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_Archives() {
        return (EReference)getModel_adapted().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted() {
		if (modifier_adaptedEClass == null) {
			modifier_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(64);
		}
		return modifier_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_Visibility() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_Inheritance() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_Static() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_Transient() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_Volatile() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_Native() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_Strictfp() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_Synchronized() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_BodyDeclaration() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_SingleVariableDeclaration() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_VariableDeclarationStatement() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_VariableDeclarationExpression() {
        return (EReference)getModifier_adapted().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement_adapted() {
		if (namedElement_adaptedEClass == null) {
			namedElement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(65);
		}
		return namedElement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedElement_adapted_Name() {
        return (EReference)getNamedElement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedElement_adapted_Proxy() {
        return (EReference)getNamedElement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedElement_adapted_UsagesInImports() {
        return (EReference)getNamedElement_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespaceAccess_adapted() {
		if (namespaceAccess_adaptedEClass == null) {
			namespaceAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(66);
		}
		return namespaceAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberLiteral_adapted() {
		if (numberLiteral_adaptedEClass == null) {
			numberLiteral_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(67);
		}
		return numberLiteral_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNumberLiteral_adapted_TokenValue() {
        return (EReference)getNumberLiteral_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullLiteral_adapted() {
		if (nullLiteral_adaptedEClass == null) {
			nullLiteral_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(68);
		}
		return nullLiteral_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage_adapted() {
		if (package_adaptedEClass == null) {
			package_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(69);
		}
		return package_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_OwnedElements() {
        return (EReference)getPackage_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_Model() {
        return (EReference)getPackage_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_OwnedPackages() {
        return (EReference)getPackage_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_Package() {
        return (EReference)getPackage_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_UsagesInPackageAccess() {
        return (EReference)getPackage_adapted().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageAccess_adapted() {
		if (packageAccess_adaptedEClass == null) {
			packageAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(70);
		}
		return packageAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageAccess_adapted_Package() {
        return (EReference)getPackageAccess_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageAccess_adapted_Qualifier() {
        return (EReference)getPackageAccess_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType_adapted() {
		if (parameterizedType_adaptedEClass == null) {
			parameterizedType_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(71);
		}
		return parameterizedType_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedType_adapted_Type() {
        return (EReference)getParameterizedType_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedType_adapted_TypeArguments() {
        return (EReference)getParameterizedType_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParenthesizedExpression_adapted() {
		if (parenthesizedExpression_adaptedEClass == null) {
			parenthesizedExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(72);
		}
		return parenthesizedExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParenthesizedExpression_adapted_Expression() {
        return (EReference)getParenthesizedExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostfixExpression_adapted() {
		if (postfixExpression_adaptedEClass == null) {
			postfixExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(73);
		}
		return postfixExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostfixExpression_adapted_Operator() {
        return (EReference)getPostfixExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostfixExpression_adapted_Operand() {
        return (EReference)getPostfixExpression_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrefixExpression_adapted() {
		if (prefixExpression_adaptedEClass == null) {
			prefixExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(74);
		}
		return prefixExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrefixExpression_adapted_Operator() {
        return (EReference)getPrefixExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrefixExpression_adapted_Operand() {
        return (EReference)getPrefixExpression_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType_adapted() {
		if (primitiveType_adaptedEClass == null) {
			primitiveType_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(75);
		}
		return primitiveType_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeBoolean_adapted() {
		if (primitiveTypeBoolean_adaptedEClass == null) {
			primitiveTypeBoolean_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(76);
		}
		return primitiveTypeBoolean_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeByte_adapted() {
		if (primitiveTypeByte_adaptedEClass == null) {
			primitiveTypeByte_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(77);
		}
		return primitiveTypeByte_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeChar_adapted() {
		if (primitiveTypeChar_adaptedEClass == null) {
			primitiveTypeChar_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(78);
		}
		return primitiveTypeChar_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeDouble_adapted() {
		if (primitiveTypeDouble_adaptedEClass == null) {
			primitiveTypeDouble_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(79);
		}
		return primitiveTypeDouble_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeShort_adapted() {
		if (primitiveTypeShort_adaptedEClass == null) {
			primitiveTypeShort_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(80);
		}
		return primitiveTypeShort_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeFloat_adapted() {
		if (primitiveTypeFloat_adaptedEClass == null) {
			primitiveTypeFloat_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(81);
		}
		return primitiveTypeFloat_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeInt_adapted() {
		if (primitiveTypeInt_adaptedEClass == null) {
			primitiveTypeInt_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(82);
		}
		return primitiveTypeInt_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeLong_adapted() {
		if (primitiveTypeLong_adaptedEClass == null) {
			primitiveTypeLong_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(83);
		}
		return primitiveTypeLong_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypeVoid_adapted() {
		if (primitiveTypeVoid_adaptedEClass == null) {
			primitiveTypeVoid_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(84);
		}
		return primitiveTypeVoid_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnStatement_adapted() {
		if (returnStatement_adaptedEClass == null) {
			returnStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(85);
		}
		return returnStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnStatement_adapted_Expression() {
        return (EReference)getReturnStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableAccess_adapted() {
		if (singleVariableAccess_adaptedEClass == null) {
			singleVariableAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(86);
		}
		return singleVariableAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableAccess_adapted_Variable() {
        return (EReference)getSingleVariableAccess_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableAccess_adapted_Qualifier() {
        return (EReference)getSingleVariableAccess_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableDeclaration_adapted() {
		if (singleVariableDeclaration_adaptedEClass == null) {
			singleVariableDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(87);
		}
		return singleVariableDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_Modifier() {
        return (EReference)getSingleVariableDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_Varargs() {
        return (EReference)getSingleVariableDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_Type() {
        return (EReference)getSingleVariableDeclaration_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_Annotations() {
        return (EReference)getSingleVariableDeclaration_adapted().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_MethodDeclaration() {
        return (EReference)getSingleVariableDeclaration_adapted().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_CatchClause() {
        return (EReference)getSingleVariableDeclaration_adapted().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_EnhancedForStatement() {
        return (EReference)getSingleVariableDeclaration_adapted().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatement_adapted() {
		if (statement_adaptedEClass == null) {
			statement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(88);
		}
		return statement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteral_adapted() {
		if (stringLiteral_adaptedEClass == null) {
			stringLiteral_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(89);
		}
		return stringLiteral_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStringLiteral_adapted_EscapedValue() {
        return (EReference)getStringLiteral_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperConstructorInvocation_adapted() {
		if (superConstructorInvocation_adaptedEClass == null) {
			superConstructorInvocation_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(90);
		}
		return superConstructorInvocation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation_adapted_Expression() {
        return (EReference)getSuperConstructorInvocation_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperFieldAccess_adapted() {
		if (superFieldAccess_adaptedEClass == null) {
			superFieldAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(91);
		}
		return superFieldAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperFieldAccess_adapted_Field() {
        return (EReference)getSuperFieldAccess_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperMethodInvocation_adapted() {
		if (superMethodInvocation_adaptedEClass == null) {
			superMethodInvocation_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(92);
		}
		return superMethodInvocation_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchCase_adapted() {
		if (switchCase_adaptedEClass == null) {
			switchCase_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(93);
		}
		return switchCase_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchCase_adapted_Default() {
        return (EReference)getSwitchCase_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchCase_adapted_Expression() {
        return (EReference)getSwitchCase_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchStatement_adapted() {
		if (switchStatement_adaptedEClass == null) {
			switchStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(94);
		}
		return switchStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchStatement_adapted_Expression() {
        return (EReference)getSwitchStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchStatement_adapted_Statements() {
        return (EReference)getSwitchStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynchronizedStatement_adapted() {
		if (synchronizedStatement_adaptedEClass == null) {
			synchronizedStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(95);
		}
		return synchronizedStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSynchronizedStatement_adapted_Body() {
        return (EReference)getSynchronizedStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSynchronizedStatement_adapted_Expression() {
        return (EReference)getSynchronizedStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagElement_adapted() {
		if (tagElement_adaptedEClass == null) {
			tagElement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(96);
		}
		return tagElement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagElement_adapted_TagName() {
        return (EReference)getTagElement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagElement_adapted_Fragments() {
        return (EReference)getTagElement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextElement_adapted() {
		if (textElement_adaptedEClass == null) {
			textElement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(97);
		}
		return textElement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextElement_adapted_Text() {
        return (EReference)getTextElement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThisExpression_adapted() {
		if (thisExpression_adaptedEClass == null) {
			thisExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(98);
		}
		return thisExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThrowStatement_adapted() {
		if (throwStatement_adaptedEClass == null) {
			throwStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(99);
		}
		return throwStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThrowStatement_adapted_Expression() {
        return (EReference)getThrowStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTryStatement_adapted() {
		if (tryStatement_adaptedEClass == null) {
			tryStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(100);
		}
		return tryStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTryStatement_adapted_Body() {
        return (EReference)getTryStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTryStatement_adapted_Finally() {
        return (EReference)getTryStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTryStatement_adapted_CatchClauses() {
        return (EReference)getTryStatement_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType_adapted() {
		if (type_adaptedEClass == null) {
			type_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(101);
		}
		return type_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_adapted_UsagesInTypeAccess() {
        return (EReference)getType_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess_adapted() {
		if (typeAccess_adaptedEClass == null) {
			typeAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(102);
		}
		return typeAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess_adapted_Type() {
        return (EReference)getTypeAccess_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess_adapted_Qualifier() {
        return (EReference)getTypeAccess_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeDeclaration_adapted() {
		if (typeDeclaration_adaptedEClass == null) {
			typeDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(103);
		}
		return typeDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeDeclaration_adapted_TypeParameters() {
        return (EReference)getTypeDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeDeclarationStatement_adapted() {
		if (typeDeclarationStatement_adaptedEClass == null) {
			typeDeclarationStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(104);
		}
		return typeDeclarationStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeDeclarationStatement_adapted_Declaration() {
        return (EReference)getTypeDeclarationStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeLiteral_adapted() {
		if (typeLiteral_adaptedEClass == null) {
			typeLiteral_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(105);
		}
		return typeLiteral_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeLiteral_adapted_Type() {
        return (EReference)getTypeLiteral_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter_adapted() {
		if (typeParameter_adaptedEClass == null) {
			typeParameter_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(106);
		}
		return typeParameter_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter_adapted_Bounds() {
        return (EReference)getTypeParameter_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedItem_adapted() {
		if (unresolvedItem_adaptedEClass == null) {
			unresolvedItem_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(107);
		}
		return unresolvedItem_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedItemAccess_adapted() {
		if (unresolvedItemAccess_adaptedEClass == null) {
			unresolvedItemAccess_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(108);
		}
		return unresolvedItemAccess_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedItemAccess_adapted_Element() {
        return (EReference)getUnresolvedItemAccess_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedItemAccess_adapted_Qualifier() {
        return (EReference)getUnresolvedItemAccess_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedAnnotationDeclaration_adapted() {
		if (unresolvedAnnotationDeclaration_adaptedEClass == null) {
			unresolvedAnnotationDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(109);
		}
		return unresolvedAnnotationDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedAnnotationTypeMemberDeclaration_adapted() {
		if (unresolvedAnnotationTypeMemberDeclaration_adaptedEClass == null) {
			unresolvedAnnotationTypeMemberDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(110);
		}
		return unresolvedAnnotationTypeMemberDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedClassDeclaration_adapted() {
		if (unresolvedClassDeclaration_adaptedEClass == null) {
			unresolvedClassDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(111);
		}
		return unresolvedClassDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedEnumDeclaration_adapted() {
		if (unresolvedEnumDeclaration_adaptedEClass == null) {
			unresolvedEnumDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(112);
		}
		return unresolvedEnumDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedInterfaceDeclaration_adapted() {
		if (unresolvedInterfaceDeclaration_adaptedEClass == null) {
			unresolvedInterfaceDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(113);
		}
		return unresolvedInterfaceDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedLabeledStatement_adapted() {
		if (unresolvedLabeledStatement_adaptedEClass == null) {
			unresolvedLabeledStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(114);
		}
		return unresolvedLabeledStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedMethodDeclaration_adapted() {
		if (unresolvedMethodDeclaration_adaptedEClass == null) {
			unresolvedMethodDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(115);
		}
		return unresolvedMethodDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedSingleVariableDeclaration_adapted() {
		if (unresolvedSingleVariableDeclaration_adaptedEClass == null) {
			unresolvedSingleVariableDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(116);
		}
		return unresolvedSingleVariableDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedType_adapted() {
		if (unresolvedType_adaptedEClass == null) {
			unresolvedType_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(117);
		}
		return unresolvedType_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedTypeDeclaration_adapted() {
		if (unresolvedTypeDeclaration_adaptedEClass == null) {
			unresolvedTypeDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(118);
		}
		return unresolvedTypeDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedVariableDeclarationFragment_adapted() {
		if (unresolvedVariableDeclarationFragment_adaptedEClass == null) {
			unresolvedVariableDeclarationFragment_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(119);
		}
		return unresolvedVariableDeclarationFragment_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclaration_adapted() {
		if (variableDeclaration_adaptedEClass == null) {
			variableDeclaration_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(120);
		}
		return variableDeclaration_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclaration_adapted_ExtraArrayDimensions() {
        return (EReference)getVariableDeclaration_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclaration_adapted_Initializer() {
        return (EReference)getVariableDeclaration_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclaration_adapted_UsageInVariableAccess() {
        return (EReference)getVariableDeclaration_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationExpression_adapted() {
		if (variableDeclarationExpression_adaptedEClass == null) {
			variableDeclarationExpression_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(121);
		}
		return variableDeclarationExpression_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationExpression_adapted_Modifier() {
        return (EReference)getVariableDeclarationExpression_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationExpression_adapted_Annotations() {
        return (EReference)getVariableDeclarationExpression_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationFragment_adapted() {
		if (variableDeclarationFragment_adaptedEClass == null) {
			variableDeclarationFragment_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(122);
		}
		return variableDeclarationFragment_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragment_adapted_VariablesContainer() {
        return (EReference)getVariableDeclarationFragment_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationStatement_adapted() {
		if (variableDeclarationStatement_adaptedEClass == null) {
			variableDeclarationStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(123);
		}
		return variableDeclarationStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationStatement_adapted_ExtraArrayDimensions() {
        return (EReference)getVariableDeclarationStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationStatement_adapted_Modifier() {
        return (EReference)getVariableDeclarationStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationStatement_adapted_Annotations() {
        return (EReference)getVariableDeclarationStatement_adapted().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWildCardType_adapted() {
		if (wildCardType_adaptedEClass == null) {
			wildCardType_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(124);
		}
		return wildCardType_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWildCardType_adapted_UpperBound() {
        return (EReference)getWildCardType_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWildCardType_adapted_Bound() {
        return (EReference)getWildCardType_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhileStatement_adapted() {
		if (whileStatement_adaptedEClass == null) {
			whileStatement_adaptedEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(125);
		}
		return whileStatement_adaptedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhileStatement_adapted_Expression() {
        return (EReference)getWhileStatement_adapted().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhileStatement_adapted_Body() {
        return (EReference)getWhileStatement_adapted().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodDeclaration_adapted_bodyItem() {
		if (abstractMethodDeclaration_adapted_bodyItemEClass == null) {
			abstractMethodDeclaration_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(126);
		}
		return abstractMethodDeclaration_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_bodyItem_Body() {
        return (EReference)getAbstractMethodDeclaration_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodDeclaration_adapted_parametersItem() {
		if (abstractMethodDeclaration_adapted_parametersItemEClass == null) {
			abstractMethodDeclaration_adapted_parametersItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(127);
		}
		return abstractMethodDeclaration_adapted_parametersItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_parametersItem_Parameters() {
        return (EReference)getAbstractMethodDeclaration_adapted_parametersItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodDeclaration_adapted_thrownExceptionsItem() {
		if (abstractMethodDeclaration_adapted_thrownExceptionsItemEClass == null) {
			abstractMethodDeclaration_adapted_thrownExceptionsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(128);
		}
		return abstractMethodDeclaration_adapted_thrownExceptionsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_thrownExceptionsItem_ThrownExceptions() {
        return (EReference)getAbstractMethodDeclaration_adapted_thrownExceptionsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodDeclaration_adapted_typeParametersItem() {
		if (abstractMethodDeclaration_adapted_typeParametersItemEClass == null) {
			abstractMethodDeclaration_adapted_typeParametersItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(129);
		}
		return abstractMethodDeclaration_adapted_typeParametersItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_typeParametersItem_TypeParameters() {
        return (EReference)getAbstractMethodDeclaration_adapted_typeParametersItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodDeclaration_adapted_usagesInDocCommentsItem() {
		if (abstractMethodDeclaration_adapted_usagesInDocCommentsItemEClass == null) {
			abstractMethodDeclaration_adapted_usagesInDocCommentsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(130);
		}
		return abstractMethodDeclaration_adapted_usagesInDocCommentsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_usagesInDocCommentsItem_UsagesInDocComments() {
        return (EReference)getAbstractMethodDeclaration_adapted_usagesInDocCommentsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodDeclaration_adapted_usagesItem() {
		if (abstractMethodDeclaration_adapted_usagesItemEClass == null) {
			abstractMethodDeclaration_adapted_usagesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(131);
		}
		return abstractMethodDeclaration_adapted_usagesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodDeclaration_adapted_usagesItem_Usages() {
        return (EReference)getAbstractMethodDeclaration_adapted_usagesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodInvocation_adapted_methodItem() {
		if (abstractMethodInvocation_adapted_methodItemEClass == null) {
			abstractMethodInvocation_adapted_methodItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(132);
		}
		return abstractMethodInvocation_adapted_methodItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocation_adapted_methodItem_Method() {
        return (EReference)getAbstractMethodInvocation_adapted_methodItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodInvocation_adapted_argumentsItem() {
		if (abstractMethodInvocation_adapted_argumentsItemEClass == null) {
			abstractMethodInvocation_adapted_argumentsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(133);
		}
		return abstractMethodInvocation_adapted_argumentsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocation_adapted_argumentsItem_Arguments() {
        return (EReference)getAbstractMethodInvocation_adapted_argumentsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractMethodInvocation_adapted_typeArgumentsItem() {
		if (abstractMethodInvocation_adapted_typeArgumentsItemEClass == null) {
			abstractMethodInvocation_adapted_typeArgumentsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(134);
		}
		return abstractMethodInvocation_adapted_typeArgumentsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractMethodInvocation_adapted_typeArgumentsItem_TypeArguments() {
        return (EReference)getAbstractMethodInvocation_adapted_typeArgumentsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeDeclaration_adapted_bodyDeclarationsItem() {
		if (abstractTypeDeclaration_adapted_bodyDeclarationsItemEClass == null) {
			abstractTypeDeclaration_adapted_bodyDeclarationsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(135);
		}
		return abstractTypeDeclaration_adapted_bodyDeclarationsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_bodyDeclarationsItem_BodyDeclarations() {
        return (EReference)getAbstractTypeDeclaration_adapted_bodyDeclarationsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeDeclaration_adapted_commentsBeforeBodyItem() {
		if (abstractTypeDeclaration_adapted_commentsBeforeBodyItemEClass == null) {
			abstractTypeDeclaration_adapted_commentsBeforeBodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(136);
		}
		return abstractTypeDeclaration_adapted_commentsBeforeBodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_commentsBeforeBodyItem_CommentsBeforeBody() {
        return (EReference)getAbstractTypeDeclaration_adapted_commentsBeforeBodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeDeclaration_adapted_commentsAfterBodyItem() {
		if (abstractTypeDeclaration_adapted_commentsAfterBodyItemEClass == null) {
			abstractTypeDeclaration_adapted_commentsAfterBodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(137);
		}
		return abstractTypeDeclaration_adapted_commentsAfterBodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_commentsAfterBodyItem_CommentsAfterBody() {
        return (EReference)getAbstractTypeDeclaration_adapted_commentsAfterBodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeDeclaration_adapted_packageItem() {
		if (abstractTypeDeclaration_adapted_packageItemEClass == null) {
			abstractTypeDeclaration_adapted_packageItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(138);
		}
		return abstractTypeDeclaration_adapted_packageItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_packageItem_Package() {
        return (EReference)getAbstractTypeDeclaration_adapted_packageItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeDeclaration_adapted_superInterfacesItem() {
		if (abstractTypeDeclaration_adapted_superInterfacesItemEClass == null) {
			abstractTypeDeclaration_adapted_superInterfacesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(139);
		}
		return abstractTypeDeclaration_adapted_superInterfacesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeDeclaration_adapted_superInterfacesItem_SuperInterfaces() {
        return (EReference)getAbstractTypeDeclaration_adapted_superInterfacesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTypeQualifiedExpression_adapted_qualifierItem() {
		if (abstractTypeQualifiedExpression_adapted_qualifierItemEClass == null) {
			abstractTypeQualifiedExpression_adapted_qualifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(140);
		}
		return abstractTypeQualifiedExpression_adapted_qualifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractTypeQualifiedExpression_adapted_qualifierItem_Qualifier() {
        return (EReference)getAbstractTypeQualifiedExpression_adapted_qualifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractVariablesContainer_adapted_typeItem() {
		if (abstractVariablesContainer_adapted_typeItemEClass == null) {
			abstractVariablesContainer_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(141);
		}
		return abstractVariablesContainer_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractVariablesContainer_adapted_typeItem_Type() {
        return (EReference)getAbstractVariablesContainer_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractVariablesContainer_adapted_fragmentsItem() {
		if (abstractVariablesContainer_adapted_fragmentsItemEClass == null) {
			abstractVariablesContainer_adapted_fragmentsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(142);
		}
		return abstractVariablesContainer_adapted_fragmentsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractVariablesContainer_adapted_fragmentsItem_Fragments() {
        return (EReference)getAbstractVariablesContainer_adapted_fragmentsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation_adapted_typeItem() {
		if (annotation_adapted_typeItemEClass == null) {
			annotation_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(143);
		}
		return annotation_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_adapted_typeItem_Type() {
        return (EReference)getAnnotation_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation_adapted_valuesItem() {
		if (annotation_adapted_valuesItemEClass == null) {
			annotation_adapted_valuesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(144);
		}
		return annotation_adapted_valuesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_adapted_valuesItem_Values() {
        return (EReference)getAnnotation_adapted_valuesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchive_adapted_originalFilePathValue() {
		if (archive_adapted_originalFilePathValueEClass == null) {
			archive_adapted_originalFilePathValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(145);
		}
		return archive_adapted_originalFilePathValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArchive_adapted_originalFilePathValue_Value() {
        return (EAttribute)getArchive_adapted_originalFilePathValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchive_adapted_classFilesItem() {
		if (archive_adapted_classFilesItemEClass == null) {
			archive_adapted_classFilesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(146);
		}
		return archive_adapted_classFilesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchive_adapted_classFilesItem_ClassFiles() {
        return (EReference)getArchive_adapted_classFilesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchive_adapted_manifestItem() {
		if (archive_adapted_manifestItemEClass == null) {
			archive_adapted_manifestItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(147);
		}
		return archive_adapted_manifestItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchive_adapted_manifestItem_Manifest() {
        return (EReference)getArchive_adapted_manifestItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertStatement_adapted_messageItem() {
		if (assertStatement_adapted_messageItemEClass == null) {
			assertStatement_adapted_messageItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(148);
		}
		return assertStatement_adapted_messageItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertStatement_adapted_messageItem_Message() {
        return (EReference)getAssertStatement_adapted_messageItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssertStatement_adapted_expressionItem() {
		if (assertStatement_adapted_expressionItemEClass == null) {
			assertStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(149);
		}
		return assertStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssertStatement_adapted_expressionItem_Expression() {
        return (EReference)getAssertStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASTNode_adapted_commentsItem() {
		if (astNode_adapted_commentsItemEClass == null) {
			astNode_adapted_commentsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(150);
		}
		return astNode_adapted_commentsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNode_adapted_commentsItem_Comments() {
        return (EReference)getASTNode_adapted_commentsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASTNode_adapted_originalCompilationUnitItem() {
		if (astNode_adapted_originalCompilationUnitItemEClass == null) {
			astNode_adapted_originalCompilationUnitItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(151);
		}
		return astNode_adapted_originalCompilationUnitItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNode_adapted_originalCompilationUnitItem_OriginalCompilationUnit() {
        return (EReference)getASTNode_adapted_originalCompilationUnitItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASTNode_adapted_originalClassFileItem() {
		if (astNode_adapted_originalClassFileItemEClass == null) {
			astNode_adapted_originalClassFileItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(152);
		}
		return astNode_adapted_originalClassFileItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getASTNode_adapted_originalClassFileItem_OriginalClassFile() {
        return (EReference)getASTNode_adapted_originalClassFileItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValuePair_adapted_memberItem() {
		if (annotationMemberValuePair_adapted_memberItemEClass == null) {
			annotationMemberValuePair_adapted_memberItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(153);
		}
		return annotationMemberValuePair_adapted_memberItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValuePair_adapted_memberItem_Member() {
        return (EReference)getAnnotationMemberValuePair_adapted_memberItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMemberValuePair_adapted_valueItem() {
		if (annotationMemberValuePair_adapted_valueItemEClass == null) {
			annotationMemberValuePair_adapted_valueItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(154);
		}
		return annotationMemberValuePair_adapted_valueItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationMemberValuePair_adapted_valueItem_Value() {
        return (EReference)getAnnotationMemberValuePair_adapted_valueItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeMemberDeclaration_adapted_defaultItem() {
		if (annotationTypeMemberDeclaration_adapted_defaultItemEClass == null) {
			annotationTypeMemberDeclaration_adapted_defaultItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(155);
		}
		return annotationTypeMemberDeclaration_adapted_defaultItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeMemberDeclaration_adapted_defaultItem_Default() {
        return (EReference)getAnnotationTypeMemberDeclaration_adapted_defaultItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeMemberDeclaration_adapted_typeItem() {
		if (annotationTypeMemberDeclaration_adapted_typeItemEClass == null) {
			annotationTypeMemberDeclaration_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(156);
		}
		return annotationTypeMemberDeclaration_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeMemberDeclaration_adapted_typeItem_Type() {
        return (EReference)getAnnotationTypeMemberDeclaration_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationTypeMemberDeclaration_adapted_usagesItem() {
		if (annotationTypeMemberDeclaration_adapted_usagesItemEClass == null) {
			annotationTypeMemberDeclaration_adapted_usagesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(157);
		}
		return annotationTypeMemberDeclaration_adapted_usagesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationTypeMemberDeclaration_adapted_usagesItem_Usages() {
        return (EReference)getAnnotationTypeMemberDeclaration_adapted_usagesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassDeclaration_adapted_bodyDeclarationsItem() {
		if (anonymousClassDeclaration_adapted_bodyDeclarationsItemEClass == null) {
			anonymousClassDeclaration_adapted_bodyDeclarationsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(158);
		}
		return anonymousClassDeclaration_adapted_bodyDeclarationsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassDeclaration_adapted_bodyDeclarationsItem_BodyDeclarations() {
        return (EReference)getAnonymousClassDeclaration_adapted_bodyDeclarationsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousClassDeclaration_adapted_classInstanceCreationItem() {
		if (anonymousClassDeclaration_adapted_classInstanceCreationItemEClass == null) {
			anonymousClassDeclaration_adapted_classInstanceCreationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(159);
		}
		return anonymousClassDeclaration_adapted_classInstanceCreationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousClassDeclaration_adapted_classInstanceCreationItem_ClassInstanceCreation() {
        return (EReference)getAnonymousClassDeclaration_adapted_classInstanceCreationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayAccess_adapted_arrayItem() {
		if (arrayAccess_adapted_arrayItemEClass == null) {
			arrayAccess_adapted_arrayItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(160);
		}
		return arrayAccess_adapted_arrayItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayAccess_adapted_arrayItem_Array() {
        return (EReference)getArrayAccess_adapted_arrayItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayAccess_adapted_indexItem() {
		if (arrayAccess_adapted_indexItemEClass == null) {
			arrayAccess_adapted_indexItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(161);
		}
		return arrayAccess_adapted_indexItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayAccess_adapted_indexItem_Index() {
        return (EReference)getArrayAccess_adapted_indexItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayCreation_adapted_dimensionsItem() {
		if (arrayCreation_adapted_dimensionsItemEClass == null) {
			arrayCreation_adapted_dimensionsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(162);
		}
		return arrayCreation_adapted_dimensionsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayCreation_adapted_dimensionsItem_Dimensions() {
        return (EReference)getArrayCreation_adapted_dimensionsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayCreation_adapted_initializerItem() {
		if (arrayCreation_adapted_initializerItemEClass == null) {
			arrayCreation_adapted_initializerItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(163);
		}
		return arrayCreation_adapted_initializerItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayCreation_adapted_initializerItem_Initializer() {
        return (EReference)getArrayCreation_adapted_initializerItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayCreation_adapted_typeItem() {
		if (arrayCreation_adapted_typeItemEClass == null) {
			arrayCreation_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(164);
		}
		return arrayCreation_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayCreation_adapted_typeItem_Type() {
        return (EReference)getArrayCreation_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayInitializer_adapted_expressionsItem() {
		if (arrayInitializer_adapted_expressionsItemEClass == null) {
			arrayInitializer_adapted_expressionsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(165);
		}
		return arrayInitializer_adapted_expressionsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayInitializer_adapted_expressionsItem_Expressions() {
        return (EReference)getArrayInitializer_adapted_expressionsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayLengthAccess_adapted_arrayItem() {
		if (arrayLengthAccess_adapted_arrayItemEClass == null) {
			arrayLengthAccess_adapted_arrayItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(166);
		}
		return arrayLengthAccess_adapted_arrayItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayLengthAccess_adapted_arrayItem_Array() {
        return (EReference)getArrayLengthAccess_adapted_arrayItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayType_adapted_dimensionsValue() {
		if (arrayType_adapted_dimensionsValueEClass == null) {
			arrayType_adapted_dimensionsValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(167);
		}
		return arrayType_adapted_dimensionsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayType_adapted_dimensionsValue_Value() {
        return (EAttribute)getArrayType_adapted_dimensionsValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayType_adapted_elementTypeItem() {
		if (arrayType_adapted_elementTypeItemEClass == null) {
			arrayType_adapted_elementTypeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(168);
		}
		return arrayType_adapted_elementTypeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayType_adapted_elementTypeItem_ElementType() {
        return (EReference)getArrayType_adapted_elementTypeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment_adapted_leftHandSideItem() {
		if (assignment_adapted_leftHandSideItemEClass == null) {
			assignment_adapted_leftHandSideItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(169);
		}
		return assignment_adapted_leftHandSideItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_adapted_leftHandSideItem_LeftHandSide() {
        return (EReference)getAssignment_adapted_leftHandSideItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment_adapted_operatorValue() {
		if (assignment_adapted_operatorValueEClass == null) {
			assignment_adapted_operatorValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(170);
		}
		return assignment_adapted_operatorValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssignment_adapted_operatorValue_Value() {
        return (EAttribute)getAssignment_adapted_operatorValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssignment_adapted_rightHandSideItem() {
		if (assignment_adapted_rightHandSideItemEClass == null) {
			assignment_adapted_rightHandSideItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(171);
		}
		return assignment_adapted_rightHandSideItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssignment_adapted_rightHandSideItem_RightHandSide() {
        return (EReference)getAssignment_adapted_rightHandSideItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBodyDeclaration_adapted_abstractTypeDeclarationItem() {
		if (bodyDeclaration_adapted_abstractTypeDeclarationItemEClass == null) {
			bodyDeclaration_adapted_abstractTypeDeclarationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(172);
		}
		return bodyDeclaration_adapted_abstractTypeDeclarationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyDeclaration_adapted_abstractTypeDeclarationItem_AbstractTypeDeclaration() {
        return (EReference)getBodyDeclaration_adapted_abstractTypeDeclarationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBodyDeclaration_adapted_annotationsItem() {
		if (bodyDeclaration_adapted_annotationsItemEClass == null) {
			bodyDeclaration_adapted_annotationsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(173);
		}
		return bodyDeclaration_adapted_annotationsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyDeclaration_adapted_annotationsItem_Annotations() {
        return (EReference)getBodyDeclaration_adapted_annotationsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem() {
		if (bodyDeclaration_adapted_anonymousClassDeclarationOwnerItemEClass == null) {
			bodyDeclaration_adapted_anonymousClassDeclarationOwnerItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(174);
		}
		return bodyDeclaration_adapted_anonymousClassDeclarationOwnerItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem_AnonymousClassDeclarationOwner() {
        return (EReference)getBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBodyDeclaration_adapted_modifierItem() {
		if (bodyDeclaration_adapted_modifierItemEClass == null) {
			bodyDeclaration_adapted_modifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(175);
		}
		return bodyDeclaration_adapted_modifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBodyDeclaration_adapted_modifierItem_Modifier() {
        return (EReference)getBodyDeclaration_adapted_modifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteral_adapted_valueValue() {
		if (booleanLiteral_adapted_valueValueEClass == null) {
			booleanLiteral_adapted_valueValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(176);
		}
		return booleanLiteral_adapted_valueValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanLiteral_adapted_valueValue_Value() {
        return (EAttribute)getBooleanLiteral_adapted_valueValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_adapted_statementsItem() {
		if (block_adapted_statementsItemEClass == null) {
			block_adapted_statementsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(177);
		}
		return block_adapted_statementsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_adapted_statementsItem_Statements() {
        return (EReference)getBlock_adapted_statementsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBreakStatement_adapted_labelItem() {
		if (breakStatement_adapted_labelItemEClass == null) {
			breakStatement_adapted_labelItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(178);
		}
		return breakStatement_adapted_labelItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBreakStatement_adapted_labelItem_Label() {
        return (EReference)getBreakStatement_adapted_labelItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCastExpression_adapted_expressionItem() {
		if (castExpression_adapted_expressionItemEClass == null) {
			castExpression_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(179);
		}
		return castExpression_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCastExpression_adapted_expressionItem_Expression() {
        return (EReference)getCastExpression_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCastExpression_adapted_typeItem() {
		if (castExpression_adapted_typeItemEClass == null) {
			castExpression_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(180);
		}
		return castExpression_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCastExpression_adapted_typeItem_Type() {
        return (EReference)getCastExpression_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatchClause_adapted_exceptionItem() {
		if (catchClause_adapted_exceptionItemEClass == null) {
			catchClause_adapted_exceptionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(181);
		}
		return catchClause_adapted_exceptionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatchClause_adapted_exceptionItem_Exception() {
        return (EReference)getCatchClause_adapted_exceptionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCatchClause_adapted_bodyItem() {
		if (catchClause_adapted_bodyItemEClass == null) {
			catchClause_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(182);
		}
		return catchClause_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCatchClause_adapted_bodyItem_Body() {
        return (EReference)getCatchClause_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCharacterLiteral_adapted_escapedValueValue() {
		if (characterLiteral_adapted_escapedValueValueEClass == null) {
			characterLiteral_adapted_escapedValueValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(183);
		}
		return characterLiteral_adapted_escapedValueValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCharacterLiteral_adapted_escapedValueValue_Value() {
        return (EAttribute)getCharacterLiteral_adapted_escapedValueValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassFile_adapted_originalFilePathValue() {
		if (classFile_adapted_originalFilePathValueEClass == null) {
			classFile_adapted_originalFilePathValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(184);
		}
		return classFile_adapted_originalFilePathValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClassFile_adapted_originalFilePathValue_Value() {
        return (EAttribute)getClassFile_adapted_originalFilePathValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassFile_adapted_typeItem() {
		if (classFile_adapted_typeItemEClass == null) {
			classFile_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(185);
		}
		return classFile_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassFile_adapted_typeItem_Type() {
        return (EReference)getClassFile_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassFile_adapted_attachedSourceItem() {
		if (classFile_adapted_attachedSourceItemEClass == null) {
			classFile_adapted_attachedSourceItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(186);
		}
		return classFile_adapted_attachedSourceItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassFile_adapted_attachedSourceItem_AttachedSource() {
        return (EReference)getClassFile_adapted_attachedSourceItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassFile_adapted_packageItem() {
		if (classFile_adapted_packageItemEClass == null) {
			classFile_adapted_packageItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(187);
		}
		return classFile_adapted_packageItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassFile_adapted_packageItem_Package() {
        return (EReference)getClassFile_adapted_packageItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInstanceCreation_adapted_anonymousClassDeclarationItem() {
		if (classInstanceCreation_adapted_anonymousClassDeclarationItemEClass == null) {
			classInstanceCreation_adapted_anonymousClassDeclarationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(188);
		}
		return classInstanceCreation_adapted_anonymousClassDeclarationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation_adapted_anonymousClassDeclarationItem_AnonymousClassDeclaration() {
        return (EReference)getClassInstanceCreation_adapted_anonymousClassDeclarationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInstanceCreation_adapted_expressionItem() {
		if (classInstanceCreation_adapted_expressionItemEClass == null) {
			classInstanceCreation_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(189);
		}
		return classInstanceCreation_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation_adapted_expressionItem_Expression() {
        return (EReference)getClassInstanceCreation_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassInstanceCreation_adapted_typeItem() {
		if (classInstanceCreation_adapted_typeItemEClass == null) {
			classInstanceCreation_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(190);
		}
		return classInstanceCreation_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassInstanceCreation_adapted_typeItem_Type() {
        return (EReference)getClassInstanceCreation_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalExpression_adapted_elseExpressionItem() {
		if (conditionalExpression_adapted_elseExpressionItemEClass == null) {
			conditionalExpression_adapted_elseExpressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(191);
		}
		return conditionalExpression_adapted_elseExpressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_adapted_elseExpressionItem_ElseExpression() {
        return (EReference)getConditionalExpression_adapted_elseExpressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalExpression_adapted_expressionItem() {
		if (conditionalExpression_adapted_expressionItemEClass == null) {
			conditionalExpression_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(192);
		}
		return conditionalExpression_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_adapted_expressionItem_Expression() {
        return (EReference)getConditionalExpression_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalExpression_adapted_thenExpressionItem() {
		if (conditionalExpression_adapted_thenExpressionItemEClass == null) {
			conditionalExpression_adapted_thenExpressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(193);
		}
		return conditionalExpression_adapted_thenExpressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionalExpression_adapted_thenExpressionItem_ThenExpression() {
        return (EReference)getConditionalExpression_adapted_thenExpressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassDeclaration_adapted_superClassItem() {
		if (classDeclaration_adapted_superClassItemEClass == null) {
			classDeclaration_adapted_superClassItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(194);
		}
		return classDeclaration_adapted_superClassItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassDeclaration_adapted_superClassItem_SuperClass() {
        return (EReference)getClassDeclaration_adapted_superClassItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment_adapted_contentValue() {
		if (comment_adapted_contentValueEClass == null) {
			comment_adapted_contentValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(195);
		}
		return comment_adapted_contentValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_adapted_contentValue_Value() {
        return (EAttribute)getComment_adapted_contentValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment_adapted_enclosedByParentValue() {
		if (comment_adapted_enclosedByParentValueEClass == null) {
			comment_adapted_enclosedByParentValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(196);
		}
		return comment_adapted_enclosedByParentValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_adapted_enclosedByParentValue_Value() {
        return (EAttribute)getComment_adapted_enclosedByParentValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment_adapted_prefixOfParentValue() {
		if (comment_adapted_prefixOfParentValueEClass == null) {
			comment_adapted_prefixOfParentValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(197);
		}
		return comment_adapted_prefixOfParentValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComment_adapted_prefixOfParentValue_Value() {
        return (EAttribute)getComment_adapted_prefixOfParentValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit_adapted_originalFilePathValue() {
		if (compilationUnit_adapted_originalFilePathValueEClass == null) {
			compilationUnit_adapted_originalFilePathValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(198);
		}
		return compilationUnit_adapted_originalFilePathValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompilationUnit_adapted_originalFilePathValue_Value() {
        return (EAttribute)getCompilationUnit_adapted_originalFilePathValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit_adapted_commentListItem() {
		if (compilationUnit_adapted_commentListItemEClass == null) {
			compilationUnit_adapted_commentListItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(199);
		}
		return compilationUnit_adapted_commentListItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_commentListItem_CommentList() {
        return (EReference)getCompilationUnit_adapted_commentListItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit_adapted_importsItem() {
		if (compilationUnit_adapted_importsItemEClass == null) {
			compilationUnit_adapted_importsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(200);
		}
		return compilationUnit_adapted_importsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_importsItem_Imports() {
        return (EReference)getCompilationUnit_adapted_importsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit_adapted_packageItem() {
		if (compilationUnit_adapted_packageItemEClass == null) {
			compilationUnit_adapted_packageItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(201);
		}
		return compilationUnit_adapted_packageItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_packageItem_Package() {
        return (EReference)getCompilationUnit_adapted_packageItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompilationUnit_adapted_typesItem() {
		if (compilationUnit_adapted_typesItemEClass == null) {
			compilationUnit_adapted_typesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(202);
		}
		return compilationUnit_adapted_typesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompilationUnit_adapted_typesItem_Types() {
        return (EReference)getCompilationUnit_adapted_typesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinueStatement_adapted_labelItem() {
		if (continueStatement_adapted_labelItemEClass == null) {
			continueStatement_adapted_labelItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(203);
		}
		return continueStatement_adapted_labelItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContinueStatement_adapted_labelItem_Label() {
        return (EReference)getContinueStatement_adapted_labelItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoStatement_adapted_expressionItem() {
		if (doStatement_adapted_expressionItemEClass == null) {
			doStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(204);
		}
		return doStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoStatement_adapted_expressionItem_Expression() {
        return (EReference)getDoStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoStatement_adapted_bodyItem() {
		if (doStatement_adapted_bodyItemEClass == null) {
			doStatement_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(205);
		}
		return doStatement_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoStatement_adapted_bodyItem_Body() {
        return (EReference)getDoStatement_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnhancedForStatement_adapted_bodyItem() {
		if (enhancedForStatement_adapted_bodyItemEClass == null) {
			enhancedForStatement_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(206);
		}
		return enhancedForStatement_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnhancedForStatement_adapted_bodyItem_Body() {
        return (EReference)getEnhancedForStatement_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnhancedForStatement_adapted_expressionItem() {
		if (enhancedForStatement_adapted_expressionItemEClass == null) {
			enhancedForStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(207);
		}
		return enhancedForStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnhancedForStatement_adapted_expressionItem_Expression() {
        return (EReference)getEnhancedForStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnhancedForStatement_adapted_parameterItem() {
		if (enhancedForStatement_adapted_parameterItemEClass == null) {
			enhancedForStatement_adapted_parameterItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(208);
		}
		return enhancedForStatement_adapted_parameterItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnhancedForStatement_adapted_parameterItem_Parameter() {
        return (EReference)getEnhancedForStatement_adapted_parameterItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumConstantDeclaration_adapted_anonymousClassDeclarationItem() {
		if (enumConstantDeclaration_adapted_anonymousClassDeclarationItemEClass == null) {
			enumConstantDeclaration_adapted_anonymousClassDeclarationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(209);
		}
		return enumConstantDeclaration_adapted_anonymousClassDeclarationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumConstantDeclaration_adapted_anonymousClassDeclarationItem_AnonymousClassDeclaration() {
        return (EReference)getEnumConstantDeclaration_adapted_anonymousClassDeclarationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumConstantDeclaration_adapted_argumentsItem() {
		if (enumConstantDeclaration_adapted_argumentsItemEClass == null) {
			enumConstantDeclaration_adapted_argumentsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(210);
		}
		return enumConstantDeclaration_adapted_argumentsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumConstantDeclaration_adapted_argumentsItem_Arguments() {
        return (EReference)getEnumConstantDeclaration_adapted_argumentsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumDeclaration_adapted_enumConstantsItem() {
		if (enumDeclaration_adapted_enumConstantsItemEClass == null) {
			enumDeclaration_adapted_enumConstantsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(211);
		}
		return enumDeclaration_adapted_enumConstantsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumDeclaration_adapted_enumConstantsItem_EnumConstants() {
        return (EReference)getEnumDeclaration_adapted_enumConstantsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionStatement_adapted_expressionItem() {
		if (expressionStatement_adapted_expressionItemEClass == null) {
			expressionStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(212);
		}
		return expressionStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionStatement_adapted_expressionItem_Expression() {
        return (EReference)getExpressionStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccess_adapted_fieldItem() {
		if (fieldAccess_adapted_fieldItemEClass == null) {
			fieldAccess_adapted_fieldItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(213);
		}
		return fieldAccess_adapted_fieldItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccess_adapted_fieldItem_Field() {
        return (EReference)getFieldAccess_adapted_fieldItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFieldAccess_adapted_expressionItem() {
		if (fieldAccess_adapted_expressionItemEClass == null) {
			fieldAccess_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(214);
		}
		return fieldAccess_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFieldAccess_adapted_expressionItem_Expression() {
        return (EReference)getFieldAccess_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForStatement_adapted_expressionItem() {
		if (forStatement_adapted_expressionItemEClass == null) {
			forStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(215);
		}
		return forStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForStatement_adapted_expressionItem_Expression() {
        return (EReference)getForStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForStatement_adapted_updatersItem() {
		if (forStatement_adapted_updatersItemEClass == null) {
			forStatement_adapted_updatersItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(216);
		}
		return forStatement_adapted_updatersItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForStatement_adapted_updatersItem_Updaters() {
        return (EReference)getForStatement_adapted_updatersItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForStatement_adapted_initializersItem() {
		if (forStatement_adapted_initializersItemEClass == null) {
			forStatement_adapted_initializersItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(217);
		}
		return forStatement_adapted_initializersItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForStatement_adapted_initializersItem_Initializers() {
        return (EReference)getForStatement_adapted_initializersItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForStatement_adapted_bodyItem() {
		if (forStatement_adapted_bodyItemEClass == null) {
			forStatement_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(218);
		}
		return forStatement_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForStatement_adapted_bodyItem_Body() {
        return (EReference)getForStatement_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfStatement_adapted_expressionItem() {
		if (ifStatement_adapted_expressionItemEClass == null) {
			ifStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(219);
		}
		return ifStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_adapted_expressionItem_Expression() {
        return (EReference)getIfStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfStatement_adapted_thenStatementItem() {
		if (ifStatement_adapted_thenStatementItemEClass == null) {
			ifStatement_adapted_thenStatementItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(220);
		}
		return ifStatement_adapted_thenStatementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_adapted_thenStatementItem_ThenStatement() {
        return (EReference)getIfStatement_adapted_thenStatementItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfStatement_adapted_elseStatementItem() {
		if (ifStatement_adapted_elseStatementItemEClass == null) {
			ifStatement_adapted_elseStatementItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(221);
		}
		return ifStatement_adapted_elseStatementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfStatement_adapted_elseStatementItem_ElseStatement() {
        return (EReference)getIfStatement_adapted_elseStatementItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportDeclaration_adapted_staticValue() {
		if (importDeclaration_adapted_staticValueEClass == null) {
			importDeclaration_adapted_staticValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(222);
		}
		return importDeclaration_adapted_staticValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImportDeclaration_adapted_staticValue_Value() {
        return (EAttribute)getImportDeclaration_adapted_staticValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImportDeclaration_adapted_importedElementItem() {
		if (importDeclaration_adapted_importedElementItemEClass == null) {
			importDeclaration_adapted_importedElementItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(223);
		}
		return importDeclaration_adapted_importedElementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getImportDeclaration_adapted_importedElementItem_ImportedElement() {
        return (EReference)getImportDeclaration_adapted_importedElementItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfixExpression_adapted_operatorValue() {
		if (infixExpression_adapted_operatorValueEClass == null) {
			infixExpression_adapted_operatorValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(224);
		}
		return infixExpression_adapted_operatorValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInfixExpression_adapted_operatorValue_Value() {
        return (EAttribute)getInfixExpression_adapted_operatorValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfixExpression_adapted_rightOperandItem() {
		if (infixExpression_adapted_rightOperandItemEClass == null) {
			infixExpression_adapted_rightOperandItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(225);
		}
		return infixExpression_adapted_rightOperandItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfixExpression_adapted_rightOperandItem_RightOperand() {
        return (EReference)getInfixExpression_adapted_rightOperandItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfixExpression_adapted_leftOperandItem() {
		if (infixExpression_adapted_leftOperandItemEClass == null) {
			infixExpression_adapted_leftOperandItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(226);
		}
		return infixExpression_adapted_leftOperandItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfixExpression_adapted_leftOperandItem_LeftOperand() {
        return (EReference)getInfixExpression_adapted_leftOperandItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInfixExpression_adapted_extendedOperandsItem() {
		if (infixExpression_adapted_extendedOperandsItemEClass == null) {
			infixExpression_adapted_extendedOperandsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(227);
		}
		return infixExpression_adapted_extendedOperandsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInfixExpression_adapted_extendedOperandsItem_ExtendedOperands() {
        return (EReference)getInfixExpression_adapted_extendedOperandsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitializer_adapted_bodyItem() {
		if (initializer_adapted_bodyItemEClass == null) {
			initializer_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(228);
		}
		return initializer_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInitializer_adapted_bodyItem_Body() {
        return (EReference)getInitializer_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceofExpression_adapted_rightOperandItem() {
		if (instanceofExpression_adapted_rightOperandItemEClass == null) {
			instanceofExpression_adapted_rightOperandItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(229);
		}
		return instanceofExpression_adapted_rightOperandItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceofExpression_adapted_rightOperandItem_RightOperand() {
        return (EReference)getInstanceofExpression_adapted_rightOperandItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstanceofExpression_adapted_leftOperandItem() {
		if (instanceofExpression_adapted_leftOperandItemEClass == null) {
			instanceofExpression_adapted_leftOperandItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(230);
		}
		return instanceofExpression_adapted_leftOperandItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstanceofExpression_adapted_leftOperandItem_LeftOperand() {
        return (EReference)getInstanceofExpression_adapted_leftOperandItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavadoc_adapted_tagsItem() {
		if (javadoc_adapted_tagsItemEClass == null) {
			javadoc_adapted_tagsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(231);
		}
		return javadoc_adapted_tagsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJavadoc_adapted_tagsItem_Tags() {
        return (EReference)getJavadoc_adapted_tagsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledStatement_adapted_bodyItem() {
		if (labeledStatement_adapted_bodyItemEClass == null) {
			labeledStatement_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(232);
		}
		return labeledStatement_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeledStatement_adapted_bodyItem_Body() {
        return (EReference)getLabeledStatement_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledStatement_adapted_usagesInBreakStatementsItem() {
		if (labeledStatement_adapted_usagesInBreakStatementsItemEClass == null) {
			labeledStatement_adapted_usagesInBreakStatementsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(233);
		}
		return labeledStatement_adapted_usagesInBreakStatementsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeledStatement_adapted_usagesInBreakStatementsItem_UsagesInBreakStatements() {
        return (EReference)getLabeledStatement_adapted_usagesInBreakStatementsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabeledStatement_adapted_usagesInContinueStatementsItem() {
		if (labeledStatement_adapted_usagesInContinueStatementsItemEClass == null) {
			labeledStatement_adapted_usagesInContinueStatementsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(234);
		}
		return labeledStatement_adapted_usagesInContinueStatementsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabeledStatement_adapted_usagesInContinueStatementsItem_UsagesInContinueStatements() {
        return (EReference)getLabeledStatement_adapted_usagesInContinueStatementsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifest_adapted_mainAttributesItem() {
		if (manifest_adapted_mainAttributesItemEClass == null) {
			manifest_adapted_mainAttributesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(235);
		}
		return manifest_adapted_mainAttributesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifest_adapted_mainAttributesItem_MainAttributes() {
        return (EReference)getManifest_adapted_mainAttributesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifest_adapted_entryAttributesItem() {
		if (manifest_adapted_entryAttributesItemEClass == null) {
			manifest_adapted_entryAttributesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(236);
		}
		return manifest_adapted_entryAttributesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifest_adapted_entryAttributesItem_EntryAttributes() {
        return (EReference)getManifest_adapted_entryAttributesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifestAttribute_adapted_keyValue() {
		if (manifestAttribute_adapted_keyValueEClass == null) {
			manifestAttribute_adapted_keyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(237);
		}
		return manifestAttribute_adapted_keyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManifestAttribute_adapted_keyValue_Value() {
        return (EAttribute)getManifestAttribute_adapted_keyValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifestAttribute_adapted_valueValue() {
		if (manifestAttribute_adapted_valueValueEClass == null) {
			manifestAttribute_adapted_valueValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(238);
		}
		return manifestAttribute_adapted_valueValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManifestAttribute_adapted_valueValue_Value() {
        return (EAttribute)getManifestAttribute_adapted_valueValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifestEntry_adapted_nameValue() {
		if (manifestEntry_adapted_nameValueEClass == null) {
			manifestEntry_adapted_nameValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(239);
		}
		return manifestEntry_adapted_nameValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getManifestEntry_adapted_nameValue_Value() {
        return (EAttribute)getManifestEntry_adapted_nameValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManifestEntry_adapted_attributesItem() {
		if (manifestEntry_adapted_attributesItemEClass == null) {
			manifestEntry_adapted_attributesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(240);
		}
		return manifestEntry_adapted_attributesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getManifestEntry_adapted_attributesItem_Attributes() {
        return (EReference)getManifestEntry_adapted_attributesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberRef_adapted_memberItem() {
		if (memberRef_adapted_memberItemEClass == null) {
			memberRef_adapted_memberItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(241);
		}
		return memberRef_adapted_memberItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberRef_adapted_memberItem_Member() {
        return (EReference)getMemberRef_adapted_memberItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberRef_adapted_qualifierItem() {
		if (memberRef_adapted_qualifierItemEClass == null) {
			memberRef_adapted_qualifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(242);
		}
		return memberRef_adapted_qualifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberRef_adapted_qualifierItem_Qualifier() {
        return (EReference)getMemberRef_adapted_qualifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDeclaration_adapted_extraArrayDimensionsValue() {
		if (methodDeclaration_adapted_extraArrayDimensionsValueEClass == null) {
			methodDeclaration_adapted_extraArrayDimensionsValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(243);
		}
		return methodDeclaration_adapted_extraArrayDimensionsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodDeclaration_adapted_extraArrayDimensionsValue_Value() {
        return (EAttribute)getMethodDeclaration_adapted_extraArrayDimensionsValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDeclaration_adapted_returnTypeItem() {
		if (methodDeclaration_adapted_returnTypeItemEClass == null) {
			methodDeclaration_adapted_returnTypeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(244);
		}
		return methodDeclaration_adapted_returnTypeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDeclaration_adapted_returnTypeItem_ReturnType() {
        return (EReference)getMethodDeclaration_adapted_returnTypeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDeclaration_adapted_redefinedMethodDeclarationItem() {
		if (methodDeclaration_adapted_redefinedMethodDeclarationItemEClass == null) {
			methodDeclaration_adapted_redefinedMethodDeclarationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(245);
		}
		return methodDeclaration_adapted_redefinedMethodDeclarationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDeclaration_adapted_redefinedMethodDeclarationItem_RedefinedMethodDeclaration() {
        return (EReference)getMethodDeclaration_adapted_redefinedMethodDeclarationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodDeclaration_adapted_redefinitionsItem() {
		if (methodDeclaration_adapted_redefinitionsItemEClass == null) {
			methodDeclaration_adapted_redefinitionsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(246);
		}
		return methodDeclaration_adapted_redefinitionsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodDeclaration_adapted_redefinitionsItem_Redefinitions() {
        return (EReference)getMethodDeclaration_adapted_redefinitionsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodInvocation_adapted_expressionItem() {
		if (methodInvocation_adapted_expressionItemEClass == null) {
			methodInvocation_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(247);
		}
		return methodInvocation_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodInvocation_adapted_expressionItem_Expression() {
        return (EReference)getMethodInvocation_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodRef_adapted_methodItem() {
		if (methodRef_adapted_methodItemEClass == null) {
			methodRef_adapted_methodItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(248);
		}
		return methodRef_adapted_methodItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRef_adapted_methodItem_Method() {
        return (EReference)getMethodRef_adapted_methodItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodRef_adapted_qualifierItem() {
		if (methodRef_adapted_qualifierItemEClass == null) {
			methodRef_adapted_qualifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(249);
		}
		return methodRef_adapted_qualifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRef_adapted_qualifierItem_Qualifier() {
        return (EReference)getMethodRef_adapted_qualifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodRef_adapted_parametersItem() {
		if (methodRef_adapted_parametersItemEClass == null) {
			methodRef_adapted_parametersItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(250);
		}
		return methodRef_adapted_parametersItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRef_adapted_parametersItem_Parameters() {
        return (EReference)getMethodRef_adapted_parametersItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodRefParameter_adapted_nameValue() {
		if (methodRefParameter_adapted_nameValueEClass == null) {
			methodRefParameter_adapted_nameValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(251);
		}
		return methodRefParameter_adapted_nameValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodRefParameter_adapted_nameValue_Value() {
        return (EAttribute)getMethodRefParameter_adapted_nameValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodRefParameter_adapted_varargsValue() {
		if (methodRefParameter_adapted_varargsValueEClass == null) {
			methodRefParameter_adapted_varargsValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(252);
		}
		return methodRefParameter_adapted_varargsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodRefParameter_adapted_varargsValue_Value() {
        return (EAttribute)getMethodRefParameter_adapted_varargsValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodRefParameter_adapted_typeItem() {
		if (methodRefParameter_adapted_typeItemEClass == null) {
			methodRefParameter_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(253);
		}
		return methodRefParameter_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodRefParameter_adapted_typeItem_Type() {
        return (EReference)getMethodRefParameter_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_adapted_nameValue() {
		if (model_adapted_nameValueEClass == null) {
			model_adapted_nameValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(254);
		}
		return model_adapted_nameValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_adapted_nameValue_Value() {
        return (EAttribute)getModel_adapted_nameValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_adapted_ownedElementsItem() {
		if (model_adapted_ownedElementsItemEClass == null) {
			model_adapted_ownedElementsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(255);
		}
		return model_adapted_ownedElementsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_ownedElementsItem_OwnedElements() {
        return (EReference)getModel_adapted_ownedElementsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_adapted_orphanTypesItem() {
		if (model_adapted_orphanTypesItemEClass == null) {
			model_adapted_orphanTypesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(256);
		}
		return model_adapted_orphanTypesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_orphanTypesItem_OrphanTypes() {
        return (EReference)getModel_adapted_orphanTypesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_adapted_unresolvedItemsItem() {
		if (model_adapted_unresolvedItemsItemEClass == null) {
			model_adapted_unresolvedItemsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(257);
		}
		return model_adapted_unresolvedItemsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_unresolvedItemsItem_UnresolvedItems() {
        return (EReference)getModel_adapted_unresolvedItemsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_adapted_compilationUnitsItem() {
		if (model_adapted_compilationUnitsItemEClass == null) {
			model_adapted_compilationUnitsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(258);
		}
		return model_adapted_compilationUnitsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_compilationUnitsItem_CompilationUnits() {
        return (EReference)getModel_adapted_compilationUnitsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_adapted_classFilesItem() {
		if (model_adapted_classFilesItemEClass == null) {
			model_adapted_classFilesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(259);
		}
		return model_adapted_classFilesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_classFilesItem_ClassFiles() {
        return (EReference)getModel_adapted_classFilesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel_adapted_archivesItem() {
		if (model_adapted_archivesItemEClass == null) {
			model_adapted_archivesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(260);
		}
		return model_adapted_archivesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_adapted_archivesItem_Archives() {
        return (EReference)getModel_adapted_archivesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_visibilityValue() {
		if (modifier_adapted_visibilityValueEClass == null) {
			modifier_adapted_visibilityValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(261);
		}
		return modifier_adapted_visibilityValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_adapted_visibilityValue_Value() {
        return (EAttribute)getModifier_adapted_visibilityValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_inheritanceValue() {
		if (modifier_adapted_inheritanceValueEClass == null) {
			modifier_adapted_inheritanceValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(262);
		}
		return modifier_adapted_inheritanceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_adapted_inheritanceValue_Value() {
        return (EAttribute)getModifier_adapted_inheritanceValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_staticValue() {
		if (modifier_adapted_staticValueEClass == null) {
			modifier_adapted_staticValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(263);
		}
		return modifier_adapted_staticValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_adapted_staticValue_Value() {
        return (EAttribute)getModifier_adapted_staticValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_transientValue() {
		if (modifier_adapted_transientValueEClass == null) {
			modifier_adapted_transientValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(264);
		}
		return modifier_adapted_transientValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_adapted_transientValue_Value() {
        return (EAttribute)getModifier_adapted_transientValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_volatileValue() {
		if (modifier_adapted_volatileValueEClass == null) {
			modifier_adapted_volatileValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(265);
		}
		return modifier_adapted_volatileValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_adapted_volatileValue_Value() {
        return (EAttribute)getModifier_adapted_volatileValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_nativeValue() {
		if (modifier_adapted_nativeValueEClass == null) {
			modifier_adapted_nativeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(266);
		}
		return modifier_adapted_nativeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_adapted_nativeValue_Value() {
        return (EAttribute)getModifier_adapted_nativeValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_strictfpValue() {
		if (modifier_adapted_strictfpValueEClass == null) {
			modifier_adapted_strictfpValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(267);
		}
		return modifier_adapted_strictfpValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_adapted_strictfpValue_Value() {
        return (EAttribute)getModifier_adapted_strictfpValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_synchronizedValue() {
		if (modifier_adapted_synchronizedValueEClass == null) {
			modifier_adapted_synchronizedValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(268);
		}
		return modifier_adapted_synchronizedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_adapted_synchronizedValue_Value() {
        return (EAttribute)getModifier_adapted_synchronizedValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_bodyDeclarationItem() {
		if (modifier_adapted_bodyDeclarationItemEClass == null) {
			modifier_adapted_bodyDeclarationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(269);
		}
		return modifier_adapted_bodyDeclarationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_bodyDeclarationItem_BodyDeclaration() {
        return (EReference)getModifier_adapted_bodyDeclarationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_singleVariableDeclarationItem() {
		if (modifier_adapted_singleVariableDeclarationItemEClass == null) {
			modifier_adapted_singleVariableDeclarationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(270);
		}
		return modifier_adapted_singleVariableDeclarationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_singleVariableDeclarationItem_SingleVariableDeclaration() {
        return (EReference)getModifier_adapted_singleVariableDeclarationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_variableDeclarationStatementItem() {
		if (modifier_adapted_variableDeclarationStatementItemEClass == null) {
			modifier_adapted_variableDeclarationStatementItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(271);
		}
		return modifier_adapted_variableDeclarationStatementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_variableDeclarationStatementItem_VariableDeclarationStatement() {
        return (EReference)getModifier_adapted_variableDeclarationStatementItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier_adapted_variableDeclarationExpressionItem() {
		if (modifier_adapted_variableDeclarationExpressionItemEClass == null) {
			modifier_adapted_variableDeclarationExpressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(272);
		}
		return modifier_adapted_variableDeclarationExpressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_adapted_variableDeclarationExpressionItem_VariableDeclarationExpression() {
        return (EReference)getModifier_adapted_variableDeclarationExpressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement_adapted_nameValue() {
		if (namedElement_adapted_nameValueEClass == null) {
			namedElement_adapted_nameValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(273);
		}
		return namedElement_adapted_nameValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_adapted_nameValue_Value() {
        return (EAttribute)getNamedElement_adapted_nameValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement_adapted_proxyValue() {
		if (namedElement_adapted_proxyValueEClass == null) {
			namedElement_adapted_proxyValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(274);
		}
		return namedElement_adapted_proxyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_adapted_proxyValue_Value() {
        return (EAttribute)getNamedElement_adapted_proxyValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement_adapted_usagesInImportsItem() {
		if (namedElement_adapted_usagesInImportsItemEClass == null) {
			namedElement_adapted_usagesInImportsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(275);
		}
		return namedElement_adapted_usagesInImportsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedElement_adapted_usagesInImportsItem_UsagesInImports() {
        return (EReference)getNamedElement_adapted_usagesInImportsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberLiteral_adapted_tokenValueValue() {
		if (numberLiteral_adapted_tokenValueValueEClass == null) {
			numberLiteral_adapted_tokenValueValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(276);
		}
		return numberLiteral_adapted_tokenValueValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumberLiteral_adapted_tokenValueValue_Value() {
        return (EAttribute)getNumberLiteral_adapted_tokenValueValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage_adapted_ownedElementsItem() {
		if (package_adapted_ownedElementsItemEClass == null) {
			package_adapted_ownedElementsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(277);
		}
		return package_adapted_ownedElementsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_ownedElementsItem_OwnedElements() {
        return (EReference)getPackage_adapted_ownedElementsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage_adapted_modelItem() {
		if (package_adapted_modelItemEClass == null) {
			package_adapted_modelItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(278);
		}
		return package_adapted_modelItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_modelItem_Model() {
        return (EReference)getPackage_adapted_modelItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage_adapted_ownedPackagesItem() {
		if (package_adapted_ownedPackagesItemEClass == null) {
			package_adapted_ownedPackagesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(279);
		}
		return package_adapted_ownedPackagesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_ownedPackagesItem_OwnedPackages() {
        return (EReference)getPackage_adapted_ownedPackagesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage_adapted_packageItem() {
		if (package_adapted_packageItemEClass == null) {
			package_adapted_packageItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(280);
		}
		return package_adapted_packageItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_packageItem_Package() {
        return (EReference)getPackage_adapted_packageItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackage_adapted_usagesInPackageAccessItem() {
		if (package_adapted_usagesInPackageAccessItemEClass == null) {
			package_adapted_usagesInPackageAccessItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(281);
		}
		return package_adapted_usagesInPackageAccessItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackage_adapted_usagesInPackageAccessItem_UsagesInPackageAccess() {
        return (EReference)getPackage_adapted_usagesInPackageAccessItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageAccess_adapted_packageItem() {
		if (packageAccess_adapted_packageItemEClass == null) {
			packageAccess_adapted_packageItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(282);
		}
		return packageAccess_adapted_packageItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageAccess_adapted_packageItem_Package() {
        return (EReference)getPackageAccess_adapted_packageItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPackageAccess_adapted_qualifierItem() {
		if (packageAccess_adapted_qualifierItemEClass == null) {
			packageAccess_adapted_qualifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(283);
		}
		return packageAccess_adapted_qualifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPackageAccess_adapted_qualifierItem_Qualifier() {
        return (EReference)getPackageAccess_adapted_qualifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType_adapted_typeItem() {
		if (parameterizedType_adapted_typeItemEClass == null) {
			parameterizedType_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(284);
		}
		return parameterizedType_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedType_adapted_typeItem_Type() {
        return (EReference)getParameterizedType_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterizedType_adapted_typeArgumentsItem() {
		if (parameterizedType_adapted_typeArgumentsItemEClass == null) {
			parameterizedType_adapted_typeArgumentsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(285);
		}
		return parameterizedType_adapted_typeArgumentsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterizedType_adapted_typeArgumentsItem_TypeArguments() {
        return (EReference)getParameterizedType_adapted_typeArgumentsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParenthesizedExpression_adapted_expressionItem() {
		if (parenthesizedExpression_adapted_expressionItemEClass == null) {
			parenthesizedExpression_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(286);
		}
		return parenthesizedExpression_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParenthesizedExpression_adapted_expressionItem_Expression() {
        return (EReference)getParenthesizedExpression_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostfixExpression_adapted_operatorValue() {
		if (postfixExpression_adapted_operatorValueEClass == null) {
			postfixExpression_adapted_operatorValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(287);
		}
		return postfixExpression_adapted_operatorValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostfixExpression_adapted_operatorValue_Value() {
        return (EAttribute)getPostfixExpression_adapted_operatorValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostfixExpression_adapted_operandItem() {
		if (postfixExpression_adapted_operandItemEClass == null) {
			postfixExpression_adapted_operandItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(288);
		}
		return postfixExpression_adapted_operandItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostfixExpression_adapted_operandItem_Operand() {
        return (EReference)getPostfixExpression_adapted_operandItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrefixExpression_adapted_operatorValue() {
		if (prefixExpression_adapted_operatorValueEClass == null) {
			prefixExpression_adapted_operatorValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(289);
		}
		return prefixExpression_adapted_operatorValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrefixExpression_adapted_operatorValue_Value() {
        return (EAttribute)getPrefixExpression_adapted_operatorValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrefixExpression_adapted_operandItem() {
		if (prefixExpression_adapted_operandItemEClass == null) {
			prefixExpression_adapted_operandItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(290);
		}
		return prefixExpression_adapted_operandItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrefixExpression_adapted_operandItem_Operand() {
        return (EReference)getPrefixExpression_adapted_operandItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnStatement_adapted_expressionItem() {
		if (returnStatement_adapted_expressionItemEClass == null) {
			returnStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(291);
		}
		return returnStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnStatement_adapted_expressionItem_Expression() {
        return (EReference)getReturnStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableAccess_adapted_variableItem() {
		if (singleVariableAccess_adapted_variableItemEClass == null) {
			singleVariableAccess_adapted_variableItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(292);
		}
		return singleVariableAccess_adapted_variableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableAccess_adapted_variableItem_Variable() {
        return (EReference)getSingleVariableAccess_adapted_variableItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableAccess_adapted_qualifierItem() {
		if (singleVariableAccess_adapted_qualifierItemEClass == null) {
			singleVariableAccess_adapted_qualifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(293);
		}
		return singleVariableAccess_adapted_qualifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableAccess_adapted_qualifierItem_Qualifier() {
        return (EReference)getSingleVariableAccess_adapted_qualifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableDeclaration_adapted_modifierItem() {
		if (singleVariableDeclaration_adapted_modifierItemEClass == null) {
			singleVariableDeclaration_adapted_modifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(294);
		}
		return singleVariableDeclaration_adapted_modifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_modifierItem_Modifier() {
        return (EReference)getSingleVariableDeclaration_adapted_modifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableDeclaration_adapted_varargsValue() {
		if (singleVariableDeclaration_adapted_varargsValueEClass == null) {
			singleVariableDeclaration_adapted_varargsValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(295);
		}
		return singleVariableDeclaration_adapted_varargsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSingleVariableDeclaration_adapted_varargsValue_Value() {
        return (EAttribute)getSingleVariableDeclaration_adapted_varargsValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableDeclaration_adapted_typeItem() {
		if (singleVariableDeclaration_adapted_typeItemEClass == null) {
			singleVariableDeclaration_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(296);
		}
		return singleVariableDeclaration_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_typeItem_Type() {
        return (EReference)getSingleVariableDeclaration_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableDeclaration_adapted_annotationsItem() {
		if (singleVariableDeclaration_adapted_annotationsItemEClass == null) {
			singleVariableDeclaration_adapted_annotationsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(297);
		}
		return singleVariableDeclaration_adapted_annotationsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_annotationsItem_Annotations() {
        return (EReference)getSingleVariableDeclaration_adapted_annotationsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableDeclaration_adapted_methodDeclarationItem() {
		if (singleVariableDeclaration_adapted_methodDeclarationItemEClass == null) {
			singleVariableDeclaration_adapted_methodDeclarationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(298);
		}
		return singleVariableDeclaration_adapted_methodDeclarationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_methodDeclarationItem_MethodDeclaration() {
        return (EReference)getSingleVariableDeclaration_adapted_methodDeclarationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableDeclaration_adapted_catchClauseItem() {
		if (singleVariableDeclaration_adapted_catchClauseItemEClass == null) {
			singleVariableDeclaration_adapted_catchClauseItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(299);
		}
		return singleVariableDeclaration_adapted_catchClauseItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_catchClauseItem_CatchClause() {
        return (EReference)getSingleVariableDeclaration_adapted_catchClauseItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleVariableDeclaration_adapted_enhancedForStatementItem() {
		if (singleVariableDeclaration_adapted_enhancedForStatementItemEClass == null) {
			singleVariableDeclaration_adapted_enhancedForStatementItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(300);
		}
		return singleVariableDeclaration_adapted_enhancedForStatementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleVariableDeclaration_adapted_enhancedForStatementItem_EnhancedForStatement() {
        return (EReference)getSingleVariableDeclaration_adapted_enhancedForStatementItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteral_adapted_escapedValueValue() {
		if (stringLiteral_adapted_escapedValueValueEClass == null) {
			stringLiteral_adapted_escapedValueValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(301);
		}
		return stringLiteral_adapted_escapedValueValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringLiteral_adapted_escapedValueValue_Value() {
        return (EAttribute)getStringLiteral_adapted_escapedValueValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperConstructorInvocation_adapted_expressionItem() {
		if (superConstructorInvocation_adapted_expressionItemEClass == null) {
			superConstructorInvocation_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(302);
		}
		return superConstructorInvocation_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperConstructorInvocation_adapted_expressionItem_Expression() {
        return (EReference)getSuperConstructorInvocation_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperFieldAccess_adapted_fieldItem() {
		if (superFieldAccess_adapted_fieldItemEClass == null) {
			superFieldAccess_adapted_fieldItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(303);
		}
		return superFieldAccess_adapted_fieldItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSuperFieldAccess_adapted_fieldItem_Field() {
        return (EReference)getSuperFieldAccess_adapted_fieldItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchCase_adapted_defaultValue() {
		if (switchCase_adapted_defaultValueEClass == null) {
			switchCase_adapted_defaultValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(304);
		}
		return switchCase_adapted_defaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwitchCase_adapted_defaultValue_Value() {
        return (EAttribute)getSwitchCase_adapted_defaultValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchCase_adapted_expressionItem() {
		if (switchCase_adapted_expressionItemEClass == null) {
			switchCase_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(305);
		}
		return switchCase_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchCase_adapted_expressionItem_Expression() {
        return (EReference)getSwitchCase_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchStatement_adapted_expressionItem() {
		if (switchStatement_adapted_expressionItemEClass == null) {
			switchStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(306);
		}
		return switchStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchStatement_adapted_expressionItem_Expression() {
        return (EReference)getSwitchStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwitchStatement_adapted_statementsItem() {
		if (switchStatement_adapted_statementsItemEClass == null) {
			switchStatement_adapted_statementsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(307);
		}
		return switchStatement_adapted_statementsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwitchStatement_adapted_statementsItem_Statements() {
        return (EReference)getSwitchStatement_adapted_statementsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynchronizedStatement_adapted_bodyItem() {
		if (synchronizedStatement_adapted_bodyItemEClass == null) {
			synchronizedStatement_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(308);
		}
		return synchronizedStatement_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSynchronizedStatement_adapted_bodyItem_Body() {
        return (EReference)getSynchronizedStatement_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSynchronizedStatement_adapted_expressionItem() {
		if (synchronizedStatement_adapted_expressionItemEClass == null) {
			synchronizedStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(309);
		}
		return synchronizedStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSynchronizedStatement_adapted_expressionItem_Expression() {
        return (EReference)getSynchronizedStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagElement_adapted_tagNameValue() {
		if (tagElement_adapted_tagNameValueEClass == null) {
			tagElement_adapted_tagNameValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(310);
		}
		return tagElement_adapted_tagNameValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagElement_adapted_tagNameValue_Value() {
        return (EAttribute)getTagElement_adapted_tagNameValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagElement_adapted_fragmentsItem() {
		if (tagElement_adapted_fragmentsItemEClass == null) {
			tagElement_adapted_fragmentsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(311);
		}
		return tagElement_adapted_fragmentsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagElement_adapted_fragmentsItem_Fragments() {
        return (EReference)getTagElement_adapted_fragmentsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextElement_adapted_textValue() {
		if (textElement_adapted_textValueEClass == null) {
			textElement_adapted_textValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(312);
		}
		return textElement_adapted_textValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextElement_adapted_textValue_Value() {
        return (EAttribute)getTextElement_adapted_textValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThrowStatement_adapted_expressionItem() {
		if (throwStatement_adapted_expressionItemEClass == null) {
			throwStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(313);
		}
		return throwStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThrowStatement_adapted_expressionItem_Expression() {
        return (EReference)getThrowStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTryStatement_adapted_bodyItem() {
		if (tryStatement_adapted_bodyItemEClass == null) {
			tryStatement_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(314);
		}
		return tryStatement_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTryStatement_adapted_bodyItem_Body() {
        return (EReference)getTryStatement_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTryStatement_adapted_finallyItem() {
		if (tryStatement_adapted_finallyItemEClass == null) {
			tryStatement_adapted_finallyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(315);
		}
		return tryStatement_adapted_finallyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTryStatement_adapted_finallyItem_Finally() {
        return (EReference)getTryStatement_adapted_finallyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTryStatement_adapted_catchClausesItem() {
		if (tryStatement_adapted_catchClausesItemEClass == null) {
			tryStatement_adapted_catchClausesItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(316);
		}
		return tryStatement_adapted_catchClausesItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTryStatement_adapted_catchClausesItem_CatchClauses() {
        return (EReference)getTryStatement_adapted_catchClausesItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType_adapted_usagesInTypeAccessItem() {
		if (type_adapted_usagesInTypeAccessItemEClass == null) {
			type_adapted_usagesInTypeAccessItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(317);
		}
		return type_adapted_usagesInTypeAccessItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getType_adapted_usagesInTypeAccessItem_UsagesInTypeAccess() {
        return (EReference)getType_adapted_usagesInTypeAccessItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess_adapted_typeItem() {
		if (typeAccess_adapted_typeItemEClass == null) {
			typeAccess_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(318);
		}
		return typeAccess_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess_adapted_typeItem_Type() {
        return (EReference)getTypeAccess_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeAccess_adapted_qualifierItem() {
		if (typeAccess_adapted_qualifierItemEClass == null) {
			typeAccess_adapted_qualifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(319);
		}
		return typeAccess_adapted_qualifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeAccess_adapted_qualifierItem_Qualifier() {
        return (EReference)getTypeAccess_adapted_qualifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeDeclaration_adapted_typeParametersItem() {
		if (typeDeclaration_adapted_typeParametersItemEClass == null) {
			typeDeclaration_adapted_typeParametersItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(320);
		}
		return typeDeclaration_adapted_typeParametersItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeDeclaration_adapted_typeParametersItem_TypeParameters() {
        return (EReference)getTypeDeclaration_adapted_typeParametersItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeDeclarationStatement_adapted_declarationItem() {
		if (typeDeclarationStatement_adapted_declarationItemEClass == null) {
			typeDeclarationStatement_adapted_declarationItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(321);
		}
		return typeDeclarationStatement_adapted_declarationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeDeclarationStatement_adapted_declarationItem_Declaration() {
        return (EReference)getTypeDeclarationStatement_adapted_declarationItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeLiteral_adapted_typeItem() {
		if (typeLiteral_adapted_typeItemEClass == null) {
			typeLiteral_adapted_typeItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(322);
		}
		return typeLiteral_adapted_typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeLiteral_adapted_typeItem_Type() {
        return (EReference)getTypeLiteral_adapted_typeItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeParameter_adapted_boundsItem() {
		if (typeParameter_adapted_boundsItemEClass == null) {
			typeParameter_adapted_boundsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(323);
		}
		return typeParameter_adapted_boundsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeParameter_adapted_boundsItem_Bounds() {
        return (EReference)getTypeParameter_adapted_boundsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedItemAccess_adapted_elementItem() {
		if (unresolvedItemAccess_adapted_elementItemEClass == null) {
			unresolvedItemAccess_adapted_elementItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(324);
		}
		return unresolvedItemAccess_adapted_elementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedItemAccess_adapted_elementItem_Element() {
        return (EReference)getUnresolvedItemAccess_adapted_elementItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnresolvedItemAccess_adapted_qualifierItem() {
		if (unresolvedItemAccess_adapted_qualifierItemEClass == null) {
			unresolvedItemAccess_adapted_qualifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(325);
		}
		return unresolvedItemAccess_adapted_qualifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnresolvedItemAccess_adapted_qualifierItem_Qualifier() {
        return (EReference)getUnresolvedItemAccess_adapted_qualifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclaration_adapted_extraArrayDimensionsValue() {
		if (variableDeclaration_adapted_extraArrayDimensionsValueEClass == null) {
			variableDeclaration_adapted_extraArrayDimensionsValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(326);
		}
		return variableDeclaration_adapted_extraArrayDimensionsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableDeclaration_adapted_extraArrayDimensionsValue_Value() {
        return (EAttribute)getVariableDeclaration_adapted_extraArrayDimensionsValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclaration_adapted_initializerItem() {
		if (variableDeclaration_adapted_initializerItemEClass == null) {
			variableDeclaration_adapted_initializerItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(327);
		}
		return variableDeclaration_adapted_initializerItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclaration_adapted_initializerItem_Initializer() {
        return (EReference)getVariableDeclaration_adapted_initializerItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclaration_adapted_usageInVariableAccessItem() {
		if (variableDeclaration_adapted_usageInVariableAccessItemEClass == null) {
			variableDeclaration_adapted_usageInVariableAccessItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(328);
		}
		return variableDeclaration_adapted_usageInVariableAccessItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclaration_adapted_usageInVariableAccessItem_UsageInVariableAccess() {
        return (EReference)getVariableDeclaration_adapted_usageInVariableAccessItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationExpression_adapted_modifierItem() {
		if (variableDeclarationExpression_adapted_modifierItemEClass == null) {
			variableDeclarationExpression_adapted_modifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(329);
		}
		return variableDeclarationExpression_adapted_modifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationExpression_adapted_modifierItem_Modifier() {
        return (EReference)getVariableDeclarationExpression_adapted_modifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationExpression_adapted_annotationsItem() {
		if (variableDeclarationExpression_adapted_annotationsItemEClass == null) {
			variableDeclarationExpression_adapted_annotationsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(330);
		}
		return variableDeclarationExpression_adapted_annotationsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationExpression_adapted_annotationsItem_Annotations() {
        return (EReference)getVariableDeclarationExpression_adapted_annotationsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationFragment_adapted_variablesContainerItem() {
		if (variableDeclarationFragment_adapted_variablesContainerItemEClass == null) {
			variableDeclarationFragment_adapted_variablesContainerItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(331);
		}
		return variableDeclarationFragment_adapted_variablesContainerItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationFragment_adapted_variablesContainerItem_VariablesContainer() {
        return (EReference)getVariableDeclarationFragment_adapted_variablesContainerItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationStatement_adapted_extraArrayDimensionsValue() {
		if (variableDeclarationStatement_adapted_extraArrayDimensionsValueEClass == null) {
			variableDeclarationStatement_adapted_extraArrayDimensionsValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(332);
		}
		return variableDeclarationStatement_adapted_extraArrayDimensionsValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableDeclarationStatement_adapted_extraArrayDimensionsValue_Value() {
        return (EAttribute)getVariableDeclarationStatement_adapted_extraArrayDimensionsValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationStatement_adapted_modifierItem() {
		if (variableDeclarationStatement_adapted_modifierItemEClass == null) {
			variableDeclarationStatement_adapted_modifierItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(333);
		}
		return variableDeclarationStatement_adapted_modifierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationStatement_adapted_modifierItem_Modifier() {
        return (EReference)getVariableDeclarationStatement_adapted_modifierItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableDeclarationStatement_adapted_annotationsItem() {
		if (variableDeclarationStatement_adapted_annotationsItemEClass == null) {
			variableDeclarationStatement_adapted_annotationsItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(334);
		}
		return variableDeclarationStatement_adapted_annotationsItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableDeclarationStatement_adapted_annotationsItem_Annotations() {
        return (EReference)getVariableDeclarationStatement_adapted_annotationsItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWildCardType_adapted_upperBoundValue() {
		if (wildCardType_adapted_upperBoundValueEClass == null) {
			wildCardType_adapted_upperBoundValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(335);
		}
		return wildCardType_adapted_upperBoundValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWildCardType_adapted_upperBoundValue_Value() {
        return (EAttribute)getWildCardType_adapted_upperBoundValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWildCardType_adapted_boundItem() {
		if (wildCardType_adapted_boundItemEClass == null) {
			wildCardType_adapted_boundItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(336);
		}
		return wildCardType_adapted_boundItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWildCardType_adapted_boundItem_Bound() {
        return (EReference)getWildCardType_adapted_boundItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhileStatement_adapted_expressionItem() {
		if (whileStatement_adapted_expressionItemEClass == null) {
			whileStatement_adapted_expressionItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(337);
		}
		return whileStatement_adapted_expressionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhileStatement_adapted_expressionItem_Expression() {
        return (EReference)getWhileStatement_adapted_expressionItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWhileStatement_adapted_bodyItem() {
		if (whileStatement_adapted_bodyItemEClass == null) {
			whileStatement_adapted_bodyItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Java_adaptedPackage.eNS_URI).getEClassifiers().get(338);
		}
		return whileStatement_adapted_bodyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWhileStatement_adapted_bodyItem_Body() {
        return (EReference)getWhileStatement_adapted_bodyItem().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Java_adaptedFactory getJava_adaptedFactory() {
		return (Java_adaptedFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.mdelab.migmm.history.modisco.java.adapted.java_adapted." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Java_adaptedPackageImpl
