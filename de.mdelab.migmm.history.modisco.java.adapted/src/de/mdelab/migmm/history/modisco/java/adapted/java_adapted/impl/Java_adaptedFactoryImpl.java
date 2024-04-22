/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.impl;

import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Java_adaptedFactoryImpl extends EFactoryImpl implements Java_adaptedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Java_adaptedFactory init() {
		try {
			Java_adaptedFactory theJava_adaptedFactory = (Java_adaptedFactory)EPackage.Registry.INSTANCE.getEFactory(Java_adaptedPackage.eNS_URI);
			if (theJava_adaptedFactory != null) {
				return theJava_adaptedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Java_adaptedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java_adaptedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Java_adaptedPackage.ANNOTATION_ADAPTED: return createAnnotation_adapted();
			case Java_adaptedPackage.ARCHIVE_ADAPTED: return createArchive_adapted();
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED: return createAssertStatement_adapted();
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED: return createAnnotationMemberValuePair_adapted();
			case Java_adaptedPackage.ANNOTATION_TYPE_DECLARATION_ADAPTED: return createAnnotationTypeDeclaration_adapted();
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED: return createAnnotationTypeMemberDeclaration_adapted();
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED: return createAnonymousClassDeclaration_adapted();
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED: return createArrayAccess_adapted();
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED: return createArrayCreation_adapted();
			case Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED: return createArrayInitializer_adapted();
			case Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED: return createArrayLengthAccess_adapted();
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED: return createArrayType_adapted();
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED: return createAssignment_adapted();
			case Java_adaptedPackage.BOOLEAN_LITERAL_ADAPTED: return createBooleanLiteral_adapted();
			case Java_adaptedPackage.BLOCK_COMMENT_ADAPTED: return createBlockComment_adapted();
			case Java_adaptedPackage.BLOCK_ADAPTED: return createBlock_adapted();
			case Java_adaptedPackage.BREAK_STATEMENT_ADAPTED: return createBreakStatement_adapted();
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED: return createCastExpression_adapted();
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED: return createCatchClause_adapted();
			case Java_adaptedPackage.CHARACTER_LITERAL_ADAPTED: return createCharacterLiteral_adapted();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED: return createClassFile_adapted();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED: return createClassInstanceCreation_adapted();
			case Java_adaptedPackage.CONSTRUCTOR_DECLARATION_ADAPTED: return createConstructorDeclaration_adapted();
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED: return createConditionalExpression_adapted();
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED: return createConstructorInvocation_adapted();
			case Java_adaptedPackage.CLASS_DECLARATION_ADAPTED: return createClassDeclaration_adapted();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED: return createCompilationUnit_adapted();
			case Java_adaptedPackage.CONTINUE_STATEMENT_ADAPTED: return createContinueStatement_adapted();
			case Java_adaptedPackage.DO_STATEMENT_ADAPTED: return createDoStatement_adapted();
			case Java_adaptedPackage.EMPTY_STATEMENT_ADAPTED: return createEmptyStatement_adapted();
			case Java_adaptedPackage.ENHANCED_FOR_STATEMENT_ADAPTED: return createEnhancedForStatement_adapted();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED: return createEnumConstantDeclaration_adapted();
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED: return createEnumDeclaration_adapted();
			case Java_adaptedPackage.EXPRESSION_STATEMENT_ADAPTED: return createExpressionStatement_adapted();
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED: return createFieldAccess_adapted();
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED: return createFieldDeclaration_adapted();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED: return createForStatement_adapted();
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED: return createIfStatement_adapted();
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED: return createImportDeclaration_adapted();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED: return createInfixExpression_adapted();
			case Java_adaptedPackage.INITIALIZER_ADAPTED: return createInitializer_adapted();
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED: return createInstanceofExpression_adapted();
			case Java_adaptedPackage.INTERFACE_DECLARATION_ADAPTED: return createInterfaceDeclaration_adapted();
			case Java_adaptedPackage.JAVADOC_ADAPTED: return createJavadoc_adapted();
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED: return createLabeledStatement_adapted();
			case Java_adaptedPackage.LINE_COMMENT_ADAPTED: return createLineComment_adapted();
			case Java_adaptedPackage.MANIFEST_ADAPTED: return createManifest_adapted();
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED: return createManifestAttribute_adapted();
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED: return createManifestEntry_adapted();
			case Java_adaptedPackage.MEMBER_REF_ADAPTED: return createMemberRef_adapted();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED: return createMethodDeclaration_adapted();
			case Java_adaptedPackage.METHOD_INVOCATION_ADAPTED: return createMethodInvocation_adapted();
			case Java_adaptedPackage.METHOD_REF_ADAPTED: return createMethodRef_adapted();
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED: return createMethodRefParameter_adapted();
			case Java_adaptedPackage.MODEL_ADAPTED: return createModel_adapted();
			case Java_adaptedPackage.MODIFIER_ADAPTED: return createModifier_adapted();
			case Java_adaptedPackage.NUMBER_LITERAL_ADAPTED: return createNumberLiteral_adapted();
			case Java_adaptedPackage.NULL_LITERAL_ADAPTED: return createNullLiteral_adapted();
			case Java_adaptedPackage.PACKAGE_ADAPTED: return createPackage_adapted();
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED: return createPackageAccess_adapted();
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED: return createParameterizedType_adapted();
			case Java_adaptedPackage.PARENTHESIZED_EXPRESSION_ADAPTED: return createParenthesizedExpression_adapted();
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED: return createPostfixExpression_adapted();
			case Java_adaptedPackage.PREFIX_EXPRESSION_ADAPTED: return createPrefixExpression_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_ADAPTED: return createPrimitiveType_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_BOOLEAN_ADAPTED: return createPrimitiveTypeBoolean_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_BYTE_ADAPTED: return createPrimitiveTypeByte_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_CHAR_ADAPTED: return createPrimitiveTypeChar_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_DOUBLE_ADAPTED: return createPrimitiveTypeDouble_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_SHORT_ADAPTED: return createPrimitiveTypeShort_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_FLOAT_ADAPTED: return createPrimitiveTypeFloat_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_INT_ADAPTED: return createPrimitiveTypeInt_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_LONG_ADAPTED: return createPrimitiveTypeLong_adapted();
			case Java_adaptedPackage.PRIMITIVE_TYPE_VOID_ADAPTED: return createPrimitiveTypeVoid_adapted();
			case Java_adaptedPackage.RETURN_STATEMENT_ADAPTED: return createReturnStatement_adapted();
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED: return createSingleVariableAccess_adapted();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED: return createSingleVariableDeclaration_adapted();
			case Java_adaptedPackage.STRING_LITERAL_ADAPTED: return createStringLiteral_adapted();
			case Java_adaptedPackage.SUPER_CONSTRUCTOR_INVOCATION_ADAPTED: return createSuperConstructorInvocation_adapted();
			case Java_adaptedPackage.SUPER_FIELD_ACCESS_ADAPTED: return createSuperFieldAccess_adapted();
			case Java_adaptedPackage.SUPER_METHOD_INVOCATION_ADAPTED: return createSuperMethodInvocation_adapted();
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED: return createSwitchCase_adapted();
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED: return createSwitchStatement_adapted();
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED: return createSynchronizedStatement_adapted();
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED: return createTagElement_adapted();
			case Java_adaptedPackage.TEXT_ELEMENT_ADAPTED: return createTextElement_adapted();
			case Java_adaptedPackage.THIS_EXPRESSION_ADAPTED: return createThisExpression_adapted();
			case Java_adaptedPackage.THROW_STATEMENT_ADAPTED: return createThrowStatement_adapted();
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED: return createTryStatement_adapted();
			case Java_adaptedPackage.TYPE_ACCESS_ADAPTED: return createTypeAccess_adapted();
			case Java_adaptedPackage.TYPE_DECLARATION_STATEMENT_ADAPTED: return createTypeDeclarationStatement_adapted();
			case Java_adaptedPackage.TYPE_LITERAL_ADAPTED: return createTypeLiteral_adapted();
			case Java_adaptedPackage.TYPE_PARAMETER_ADAPTED: return createTypeParameter_adapted();
			case Java_adaptedPackage.UNRESOLVED_ITEM_ADAPTED: return createUnresolvedItem_adapted();
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED: return createUnresolvedItemAccess_adapted();
			case Java_adaptedPackage.UNRESOLVED_ANNOTATION_DECLARATION_ADAPTED: return createUnresolvedAnnotationDeclaration_adapted();
			case Java_adaptedPackage.UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED: return createUnresolvedAnnotationTypeMemberDeclaration_adapted();
			case Java_adaptedPackage.UNRESOLVED_CLASS_DECLARATION_ADAPTED: return createUnresolvedClassDeclaration_adapted();
			case Java_adaptedPackage.UNRESOLVED_ENUM_DECLARATION_ADAPTED: return createUnresolvedEnumDeclaration_adapted();
			case Java_adaptedPackage.UNRESOLVED_INTERFACE_DECLARATION_ADAPTED: return createUnresolvedInterfaceDeclaration_adapted();
			case Java_adaptedPackage.UNRESOLVED_LABELED_STATEMENT_ADAPTED: return createUnresolvedLabeledStatement_adapted();
			case Java_adaptedPackage.UNRESOLVED_METHOD_DECLARATION_ADAPTED: return createUnresolvedMethodDeclaration_adapted();
			case Java_adaptedPackage.UNRESOLVED_SINGLE_VARIABLE_DECLARATION_ADAPTED: return createUnresolvedSingleVariableDeclaration_adapted();
			case Java_adaptedPackage.UNRESOLVED_TYPE_ADAPTED: return createUnresolvedType_adapted();
			case Java_adaptedPackage.UNRESOLVED_TYPE_DECLARATION_ADAPTED: return createUnresolvedTypeDeclaration_adapted();
			case Java_adaptedPackage.UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT_ADAPTED: return createUnresolvedVariableDeclarationFragment_adapted();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED: return createVariableDeclarationExpression_adapted();
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED: return createVariableDeclarationFragment_adapted();
			case Java_adaptedPackage.VARIABLE_DECLARATION_STATEMENT_ADAPTED: return createVariableDeclarationStatement_adapted();
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED: return createWildCardType_adapted();
			case Java_adaptedPackage.WHILE_STATEMENT_ADAPTED: return createWhileStatement_adapted();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_BODY_ITEM: return createAbstractMethodDeclaration_adapted_bodyItem();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_PARAMETERS_ITEM: return createAbstractMethodDeclaration_adapted_parametersItem();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_THROWN_EXCEPTIONS_ITEM: return createAbstractMethodDeclaration_adapted_thrownExceptionsItem();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM: return createAbstractMethodDeclaration_adapted_typeParametersItem();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_IN_DOC_COMMENTS_ITEM: return createAbstractMethodDeclaration_adapted_usagesInDocCommentsItem();
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_ITEM: return createAbstractMethodDeclaration_adapted_usagesItem();
			case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED_METHOD_ITEM: return createAbstractMethodInvocation_adapted_methodItem();
			case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED_ARGUMENTS_ITEM: return createAbstractMethodInvocation_adapted_argumentsItem();
			case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED_TYPE_ARGUMENTS_ITEM: return createAbstractMethodInvocation_adapted_typeArgumentsItem();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM: return createAbstractTypeDeclaration_adapted_bodyDeclarationsItem();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_BEFORE_BODY_ITEM: return createAbstractTypeDeclaration_adapted_commentsBeforeBodyItem();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_AFTER_BODY_ITEM: return createAbstractTypeDeclaration_adapted_commentsAfterBodyItem();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_PACKAGE_ITEM: return createAbstractTypeDeclaration_adapted_packageItem();
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_SUPER_INTERFACES_ITEM: return createAbstractTypeDeclaration_adapted_superInterfacesItem();
			case Java_adaptedPackage.ABSTRACT_TYPE_QUALIFIED_EXPRESSION_ADAPTED_QUALIFIER_ITEM: return createAbstractTypeQualifiedExpression_adapted_qualifierItem();
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_TYPE_ITEM: return createAbstractVariablesContainer_adapted_typeItem();
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_FRAGMENTS_ITEM: return createAbstractVariablesContainer_adapted_fragmentsItem();
			case Java_adaptedPackage.ANNOTATION_ADAPTED_TYPE_ITEM: return createAnnotation_adapted_typeItem();
			case Java_adaptedPackage.ANNOTATION_ADAPTED_VALUES_ITEM: return createAnnotation_adapted_valuesItem();
			case Java_adaptedPackage.ARCHIVE_ADAPTED_ORIGINAL_FILE_PATH_VALUE: return createArchive_adapted_originalFilePathValue();
			case Java_adaptedPackage.ARCHIVE_ADAPTED_CLASS_FILES_ITEM: return createArchive_adapted_classFilesItem();
			case Java_adaptedPackage.ARCHIVE_ADAPTED_MANIFEST_ITEM: return createArchive_adapted_manifestItem();
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED_MESSAGE_ITEM: return createAssertStatement_adapted_messageItem();
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createAssertStatement_adapted_expressionItem();
			case Java_adaptedPackage.AST_NODE_ADAPTED_COMMENTS_ITEM: return createASTNode_adapted_commentsItem();
			case Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_COMPILATION_UNIT_ITEM: return createASTNode_adapted_originalCompilationUnitItem();
			case Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_CLASS_FILE_ITEM: return createASTNode_adapted_originalClassFileItem();
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED_MEMBER_ITEM: return createAnnotationMemberValuePair_adapted_memberItem();
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED_VALUE_ITEM: return createAnnotationMemberValuePair_adapted_valueItem();
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_DEFAULT_ITEM: return createAnnotationTypeMemberDeclaration_adapted_defaultItem();
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_TYPE_ITEM: return createAnnotationTypeMemberDeclaration_adapted_typeItem();
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_USAGES_ITEM: return createAnnotationTypeMemberDeclaration_adapted_usagesItem();
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM: return createAnonymousClassDeclaration_adapted_bodyDeclarationsItem();
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_CLASS_INSTANCE_CREATION_ITEM: return createAnonymousClassDeclaration_adapted_classInstanceCreationItem();
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED_ARRAY_ITEM: return createArrayAccess_adapted_arrayItem();
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED_INDEX_ITEM: return createArrayAccess_adapted_indexItem();
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_DIMENSIONS_ITEM: return createArrayCreation_adapted_dimensionsItem();
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_INITIALIZER_ITEM: return createArrayCreation_adapted_initializerItem();
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_TYPE_ITEM: return createArrayCreation_adapted_typeItem();
			case Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED_EXPRESSIONS_ITEM: return createArrayInitializer_adapted_expressionsItem();
			case Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED_ARRAY_ITEM: return createArrayLengthAccess_adapted_arrayItem();
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED_DIMENSIONS_VALUE: return createArrayType_adapted_dimensionsValue();
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED_ELEMENT_TYPE_ITEM: return createArrayType_adapted_elementTypeItem();
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_LEFT_HAND_SIDE_ITEM: return createAssignment_adapted_leftHandSideItem();
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_OPERATOR_VALUE: return createAssignment_adapted_operatorValue();
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_RIGHT_HAND_SIDE_ITEM: return createAssignment_adapted_rightHandSideItem();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ABSTRACT_TYPE_DECLARATION_ITEM: return createBodyDeclaration_adapted_abstractTypeDeclarationItem();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANNOTATIONS_ITEM: return createBodyDeclaration_adapted_annotationsItem();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_OWNER_ITEM: return createBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem();
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_MODIFIER_ITEM: return createBodyDeclaration_adapted_modifierItem();
			case Java_adaptedPackage.BOOLEAN_LITERAL_ADAPTED_VALUE_VALUE: return createBooleanLiteral_adapted_valueValue();
			case Java_adaptedPackage.BLOCK_ADAPTED_STATEMENTS_ITEM: return createBlock_adapted_statementsItem();
			case Java_adaptedPackage.BREAK_STATEMENT_ADAPTED_LABEL_ITEM: return createBreakStatement_adapted_labelItem();
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED_EXPRESSION_ITEM: return createCastExpression_adapted_expressionItem();
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED_TYPE_ITEM: return createCastExpression_adapted_typeItem();
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED_EXCEPTION_ITEM: return createCatchClause_adapted_exceptionItem();
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED_BODY_ITEM: return createCatchClause_adapted_bodyItem();
			case Java_adaptedPackage.CHARACTER_LITERAL_ADAPTED_ESCAPED_VALUE_VALUE: return createCharacterLiteral_adapted_escapedValueValue();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_ORIGINAL_FILE_PATH_VALUE: return createClassFile_adapted_originalFilePathValue();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_TYPE_ITEM: return createClassFile_adapted_typeItem();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_ATTACHED_SOURCE_ITEM: return createClassFile_adapted_attachedSourceItem();
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_PACKAGE_ITEM: return createClassFile_adapted_packageItem();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM: return createClassInstanceCreation_adapted_anonymousClassDeclarationItem();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_EXPRESSION_ITEM: return createClassInstanceCreation_adapted_expressionItem();
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_TYPE_ITEM: return createClassInstanceCreation_adapted_typeItem();
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_ELSE_EXPRESSION_ITEM: return createConditionalExpression_adapted_elseExpressionItem();
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_EXPRESSION_ITEM: return createConditionalExpression_adapted_expressionItem();
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_THEN_EXPRESSION_ITEM: return createConditionalExpression_adapted_thenExpressionItem();
			case Java_adaptedPackage.CLASS_DECLARATION_ADAPTED_SUPER_CLASS_ITEM: return createClassDeclaration_adapted_superClassItem();
			case Java_adaptedPackage.COMMENT_ADAPTED_CONTENT_VALUE: return createComment_adapted_contentValue();
			case Java_adaptedPackage.COMMENT_ADAPTED_ENCLOSED_BY_PARENT_VALUE: return createComment_adapted_enclosedByParentValue();
			case Java_adaptedPackage.COMMENT_ADAPTED_PREFIX_OF_PARENT_VALUE: return createComment_adapted_prefixOfParentValue();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_ORIGINAL_FILE_PATH_VALUE: return createCompilationUnit_adapted_originalFilePathValue();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_COMMENT_LIST_ITEM: return createCompilationUnit_adapted_commentListItem();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_IMPORTS_ITEM: return createCompilationUnit_adapted_importsItem();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_PACKAGE_ITEM: return createCompilationUnit_adapted_packageItem();
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_TYPES_ITEM: return createCompilationUnit_adapted_typesItem();
			case Java_adaptedPackage.CONTINUE_STATEMENT_ADAPTED_LABEL_ITEM: return createContinueStatement_adapted_labelItem();
			case Java_adaptedPackage.DO_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createDoStatement_adapted_expressionItem();
			case Java_adaptedPackage.DO_STATEMENT_ADAPTED_BODY_ITEM: return createDoStatement_adapted_bodyItem();
			case Java_adaptedPackage.ENHANCED_FOR_STATEMENT_ADAPTED_BODY_ITEM: return createEnhancedForStatement_adapted_bodyItem();
			case Java_adaptedPackage.ENHANCED_FOR_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createEnhancedForStatement_adapted_expressionItem();
			case Java_adaptedPackage.ENHANCED_FOR_STATEMENT_ADAPTED_PARAMETER_ITEM: return createEnhancedForStatement_adapted_parameterItem();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM: return createEnumConstantDeclaration_adapted_anonymousClassDeclarationItem();
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ARGUMENTS_ITEM: return createEnumConstantDeclaration_adapted_argumentsItem();
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED_ENUM_CONSTANTS_ITEM: return createEnumDeclaration_adapted_enumConstantsItem();
			case Java_adaptedPackage.EXPRESSION_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createExpressionStatement_adapted_expressionItem();
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED_FIELD_ITEM: return createFieldAccess_adapted_fieldItem();
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED_EXPRESSION_ITEM: return createFieldAccess_adapted_expressionItem();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createForStatement_adapted_expressionItem();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_UPDATERS_ITEM: return createForStatement_adapted_updatersItem();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_INITIALIZERS_ITEM: return createForStatement_adapted_initializersItem();
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_BODY_ITEM: return createForStatement_adapted_bodyItem();
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createIfStatement_adapted_expressionItem();
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_THEN_STATEMENT_ITEM: return createIfStatement_adapted_thenStatementItem();
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_ELSE_STATEMENT_ITEM: return createIfStatement_adapted_elseStatementItem();
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED_STATIC_VALUE: return createImportDeclaration_adapted_staticValue();
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED_IMPORTED_ELEMENT_ITEM: return createImportDeclaration_adapted_importedElementItem();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_OPERATOR_VALUE: return createInfixExpression_adapted_operatorValue();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_RIGHT_OPERAND_ITEM: return createInfixExpression_adapted_rightOperandItem();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM: return createInfixExpression_adapted_leftOperandItem();
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_EXTENDED_OPERANDS_ITEM: return createInfixExpression_adapted_extendedOperandsItem();
			case Java_adaptedPackage.INITIALIZER_ADAPTED_BODY_ITEM: return createInitializer_adapted_bodyItem();
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED_RIGHT_OPERAND_ITEM: return createInstanceofExpression_adapted_rightOperandItem();
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM: return createInstanceofExpression_adapted_leftOperandItem();
			case Java_adaptedPackage.JAVADOC_ADAPTED_TAGS_ITEM: return createJavadoc_adapted_tagsItem();
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_BODY_ITEM: return createLabeledStatement_adapted_bodyItem();
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_BREAK_STATEMENTS_ITEM: return createLabeledStatement_adapted_usagesInBreakStatementsItem();
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_CONTINUE_STATEMENTS_ITEM: return createLabeledStatement_adapted_usagesInContinueStatementsItem();
			case Java_adaptedPackage.MANIFEST_ADAPTED_MAIN_ATTRIBUTES_ITEM: return createManifest_adapted_mainAttributesItem();
			case Java_adaptedPackage.MANIFEST_ADAPTED_ENTRY_ATTRIBUTES_ITEM: return createManifest_adapted_entryAttributesItem();
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED_KEY_VALUE: return createManifestAttribute_adapted_keyValue();
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED_VALUE_VALUE: return createManifestAttribute_adapted_valueValue();
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_NAME_VALUE: return createManifestEntry_adapted_nameValue();
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_ATTRIBUTES_ITEM: return createManifestEntry_adapted_attributesItem();
			case Java_adaptedPackage.MEMBER_REF_ADAPTED_MEMBER_ITEM: return createMemberRef_adapted_memberItem();
			case Java_adaptedPackage.MEMBER_REF_ADAPTED_QUALIFIER_ITEM: return createMemberRef_adapted_qualifierItem();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_EXTRA_ARRAY_DIMENSIONS_VALUE: return createMethodDeclaration_adapted_extraArrayDimensionsValue();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_RETURN_TYPE_ITEM: return createMethodDeclaration_adapted_returnTypeItem();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINED_METHOD_DECLARATION_ITEM: return createMethodDeclaration_adapted_redefinedMethodDeclarationItem();
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINITIONS_ITEM: return createMethodDeclaration_adapted_redefinitionsItem();
			case Java_adaptedPackage.METHOD_INVOCATION_ADAPTED_EXPRESSION_ITEM: return createMethodInvocation_adapted_expressionItem();
			case Java_adaptedPackage.METHOD_REF_ADAPTED_METHOD_ITEM: return createMethodRef_adapted_methodItem();
			case Java_adaptedPackage.METHOD_REF_ADAPTED_QUALIFIER_ITEM: return createMethodRef_adapted_qualifierItem();
			case Java_adaptedPackage.METHOD_REF_ADAPTED_PARAMETERS_ITEM: return createMethodRef_adapted_parametersItem();
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED_NAME_VALUE: return createMethodRefParameter_adapted_nameValue();
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED_VARARGS_VALUE: return createMethodRefParameter_adapted_varargsValue();
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED_TYPE_ITEM: return createMethodRefParameter_adapted_typeItem();
			case Java_adaptedPackage.MODEL_ADAPTED_NAME_VALUE: return createModel_adapted_nameValue();
			case Java_adaptedPackage.MODEL_ADAPTED_OWNED_ELEMENTS_ITEM: return createModel_adapted_ownedElementsItem();
			case Java_adaptedPackage.MODEL_ADAPTED_ORPHAN_TYPES_ITEM: return createModel_adapted_orphanTypesItem();
			case Java_adaptedPackage.MODEL_ADAPTED_UNRESOLVED_ITEMS_ITEM: return createModel_adapted_unresolvedItemsItem();
			case Java_adaptedPackage.MODEL_ADAPTED_COMPILATION_UNITS_ITEM: return createModel_adapted_compilationUnitsItem();
			case Java_adaptedPackage.MODEL_ADAPTED_CLASS_FILES_ITEM: return createModel_adapted_classFilesItem();
			case Java_adaptedPackage.MODEL_ADAPTED_ARCHIVES_ITEM: return createModel_adapted_archivesItem();
			case Java_adaptedPackage.MODIFIER_ADAPTED_VISIBILITY_VALUE: return createModifier_adapted_visibilityValue();
			case Java_adaptedPackage.MODIFIER_ADAPTED_INHERITANCE_VALUE: return createModifier_adapted_inheritanceValue();
			case Java_adaptedPackage.MODIFIER_ADAPTED_STATIC_VALUE: return createModifier_adapted_staticValue();
			case Java_adaptedPackage.MODIFIER_ADAPTED_TRANSIENT_VALUE: return createModifier_adapted_transientValue();
			case Java_adaptedPackage.MODIFIER_ADAPTED_VOLATILE_VALUE: return createModifier_adapted_volatileValue();
			case Java_adaptedPackage.MODIFIER_ADAPTED_NATIVE_VALUE: return createModifier_adapted_nativeValue();
			case Java_adaptedPackage.MODIFIER_ADAPTED_STRICTFP_VALUE: return createModifier_adapted_strictfpValue();
			case Java_adaptedPackage.MODIFIER_ADAPTED_SYNCHRONIZED_VALUE: return createModifier_adapted_synchronizedValue();
			case Java_adaptedPackage.MODIFIER_ADAPTED_BODY_DECLARATION_ITEM: return createModifier_adapted_bodyDeclarationItem();
			case Java_adaptedPackage.MODIFIER_ADAPTED_SINGLE_VARIABLE_DECLARATION_ITEM: return createModifier_adapted_singleVariableDeclarationItem();
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_STATEMENT_ITEM: return createModifier_adapted_variableDeclarationStatementItem();
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_EXPRESSION_ITEM: return createModifier_adapted_variableDeclarationExpressionItem();
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_NAME_VALUE: return createNamedElement_adapted_nameValue();
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_PROXY_VALUE: return createNamedElement_adapted_proxyValue();
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_USAGES_IN_IMPORTS_ITEM: return createNamedElement_adapted_usagesInImportsItem();
			case Java_adaptedPackage.NUMBER_LITERAL_ADAPTED_TOKEN_VALUE_VALUE: return createNumberLiteral_adapted_tokenValueValue();
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_ELEMENTS_ITEM: return createPackage_adapted_ownedElementsItem();
			case Java_adaptedPackage.PACKAGE_ADAPTED_MODEL_ITEM: return createPackage_adapted_modelItem();
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_PACKAGES_ITEM: return createPackage_adapted_ownedPackagesItem();
			case Java_adaptedPackage.PACKAGE_ADAPTED_PACKAGE_ITEM: return createPackage_adapted_packageItem();
			case Java_adaptedPackage.PACKAGE_ADAPTED_USAGES_IN_PACKAGE_ACCESS_ITEM: return createPackage_adapted_usagesInPackageAccessItem();
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED_PACKAGE_ITEM: return createPackageAccess_adapted_packageItem();
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED_QUALIFIER_ITEM: return createPackageAccess_adapted_qualifierItem();
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ITEM: return createParameterizedType_adapted_typeItem();
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ARGUMENTS_ITEM: return createParameterizedType_adapted_typeArgumentsItem();
			case Java_adaptedPackage.PARENTHESIZED_EXPRESSION_ADAPTED_EXPRESSION_ITEM: return createParenthesizedExpression_adapted_expressionItem();
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED_OPERATOR_VALUE: return createPostfixExpression_adapted_operatorValue();
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED_OPERAND_ITEM: return createPostfixExpression_adapted_operandItem();
			case Java_adaptedPackage.PREFIX_EXPRESSION_ADAPTED_OPERATOR_VALUE: return createPrefixExpression_adapted_operatorValue();
			case Java_adaptedPackage.PREFIX_EXPRESSION_ADAPTED_OPERAND_ITEM: return createPrefixExpression_adapted_operandItem();
			case Java_adaptedPackage.RETURN_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createReturnStatement_adapted_expressionItem();
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED_VARIABLE_ITEM: return createSingleVariableAccess_adapted_variableItem();
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED_QUALIFIER_ITEM: return createSingleVariableAccess_adapted_qualifierItem();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_MODIFIER_ITEM: return createSingleVariableDeclaration_adapted_modifierItem();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_VARARGS_VALUE: return createSingleVariableDeclaration_adapted_varargsValue();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_TYPE_ITEM: return createSingleVariableDeclaration_adapted_typeItem();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ANNOTATIONS_ITEM: return createSingleVariableDeclaration_adapted_annotationsItem();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_METHOD_DECLARATION_ITEM: return createSingleVariableDeclaration_adapted_methodDeclarationItem();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_CATCH_CLAUSE_ITEM: return createSingleVariableDeclaration_adapted_catchClauseItem();
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ENHANCED_FOR_STATEMENT_ITEM: return createSingleVariableDeclaration_adapted_enhancedForStatementItem();
			case Java_adaptedPackage.STRING_LITERAL_ADAPTED_ESCAPED_VALUE_VALUE: return createStringLiteral_adapted_escapedValueValue();
			case Java_adaptedPackage.SUPER_CONSTRUCTOR_INVOCATION_ADAPTED_EXPRESSION_ITEM: return createSuperConstructorInvocation_adapted_expressionItem();
			case Java_adaptedPackage.SUPER_FIELD_ACCESS_ADAPTED_FIELD_ITEM: return createSuperFieldAccess_adapted_fieldItem();
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED_DEFAULT_VALUE: return createSwitchCase_adapted_defaultValue();
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED_EXPRESSION_ITEM: return createSwitchCase_adapted_expressionItem();
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createSwitchStatement_adapted_expressionItem();
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_STATEMENTS_ITEM: return createSwitchStatement_adapted_statementsItem();
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED_BODY_ITEM: return createSynchronizedStatement_adapted_bodyItem();
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createSynchronizedStatement_adapted_expressionItem();
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED_TAG_NAME_VALUE: return createTagElement_adapted_tagNameValue();
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED_FRAGMENTS_ITEM: return createTagElement_adapted_fragmentsItem();
			case Java_adaptedPackage.TEXT_ELEMENT_ADAPTED_TEXT_VALUE: return createTextElement_adapted_textValue();
			case Java_adaptedPackage.THROW_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createThrowStatement_adapted_expressionItem();
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_BODY_ITEM: return createTryStatement_adapted_bodyItem();
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_FINALLY_ITEM: return createTryStatement_adapted_finallyItem();
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_CATCH_CLAUSES_ITEM: return createTryStatement_adapted_catchClausesItem();
			case Java_adaptedPackage.TYPE_ADAPTED_USAGES_IN_TYPE_ACCESS_ITEM: return createType_adapted_usagesInTypeAccessItem();
			case Java_adaptedPackage.TYPE_ACCESS_ADAPTED_TYPE_ITEM: return createTypeAccess_adapted_typeItem();
			case Java_adaptedPackage.TYPE_ACCESS_ADAPTED_QUALIFIER_ITEM: return createTypeAccess_adapted_qualifierItem();
			case Java_adaptedPackage.TYPE_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM: return createTypeDeclaration_adapted_typeParametersItem();
			case Java_adaptedPackage.TYPE_DECLARATION_STATEMENT_ADAPTED_DECLARATION_ITEM: return createTypeDeclarationStatement_adapted_declarationItem();
			case Java_adaptedPackage.TYPE_LITERAL_ADAPTED_TYPE_ITEM: return createTypeLiteral_adapted_typeItem();
			case Java_adaptedPackage.TYPE_PARAMETER_ADAPTED_BOUNDS_ITEM: return createTypeParameter_adapted_boundsItem();
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_ELEMENT_ITEM: return createUnresolvedItemAccess_adapted_elementItem();
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_QUALIFIER_ITEM: return createUnresolvedItemAccess_adapted_qualifierItem();
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_EXTRA_ARRAY_DIMENSIONS_VALUE: return createVariableDeclaration_adapted_extraArrayDimensionsValue();
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_INITIALIZER_ITEM: return createVariableDeclaration_adapted_initializerItem();
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_USAGE_IN_VARIABLE_ACCESS_ITEM: return createVariableDeclaration_adapted_usageInVariableAccessItem();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED_MODIFIER_ITEM: return createVariableDeclarationExpression_adapted_modifierItem();
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED_ANNOTATIONS_ITEM: return createVariableDeclarationExpression_adapted_annotationsItem();
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED_VARIABLES_CONTAINER_ITEM: return createVariableDeclarationFragment_adapted_variablesContainerItem();
			case Java_adaptedPackage.VARIABLE_DECLARATION_STATEMENT_ADAPTED_EXTRA_ARRAY_DIMENSIONS_VALUE: return createVariableDeclarationStatement_adapted_extraArrayDimensionsValue();
			case Java_adaptedPackage.VARIABLE_DECLARATION_STATEMENT_ADAPTED_MODIFIER_ITEM: return createVariableDeclarationStatement_adapted_modifierItem();
			case Java_adaptedPackage.VARIABLE_DECLARATION_STATEMENT_ADAPTED_ANNOTATIONS_ITEM: return createVariableDeclarationStatement_adapted_annotationsItem();
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_UPPER_BOUND_VALUE: return createWildCardType_adapted_upperBoundValue();
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_BOUND_ITEM: return createWildCardType_adapted_boundItem();
			case Java_adaptedPackage.WHILE_STATEMENT_ADAPTED_EXPRESSION_ITEM: return createWhileStatement_adapted_expressionItem();
			case Java_adaptedPackage.WHILE_STATEMENT_ADAPTED_BODY_ITEM: return createWhileStatement_adapted_bodyItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation_adapted createAnnotation_adapted() {
		Annotation_adaptedImpl annotation_adapted = new Annotation_adaptedImpl();
		return annotation_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Archive_adapted createArchive_adapted() {
		Archive_adaptedImpl archive_adapted = new Archive_adaptedImpl();
		return archive_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertStatement_adapted createAssertStatement_adapted() {
		AssertStatement_adaptedImpl assertStatement_adapted = new AssertStatement_adaptedImpl();
		return assertStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair_adapted createAnnotationMemberValuePair_adapted() {
		AnnotationMemberValuePair_adaptedImpl annotationMemberValuePair_adapted = new AnnotationMemberValuePair_adaptedImpl();
		return annotationMemberValuePair_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeDeclaration_adapted createAnnotationTypeDeclaration_adapted() {
		AnnotationTypeDeclaration_adaptedImpl annotationTypeDeclaration_adapted = new AnnotationTypeDeclaration_adaptedImpl();
		return annotationTypeDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeMemberDeclaration_adapted createAnnotationTypeMemberDeclaration_adapted() {
		AnnotationTypeMemberDeclaration_adaptedImpl annotationTypeMemberDeclaration_adapted = new AnnotationTypeMemberDeclaration_adaptedImpl();
		return annotationTypeMemberDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclaration_adapted createAnonymousClassDeclaration_adapted() {
		AnonymousClassDeclaration_adaptedImpl anonymousClassDeclaration_adapted = new AnonymousClassDeclaration_adaptedImpl();
		return anonymousClassDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAccess_adapted createArrayAccess_adapted() {
		ArrayAccess_adaptedImpl arrayAccess_adapted = new ArrayAccess_adaptedImpl();
		return arrayAccess_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayCreation_adapted createArrayCreation_adapted() {
		ArrayCreation_adaptedImpl arrayCreation_adapted = new ArrayCreation_adaptedImpl();
		return arrayCreation_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializer_adapted createArrayInitializer_adapted() {
		ArrayInitializer_adaptedImpl arrayInitializer_adapted = new ArrayInitializer_adaptedImpl();
		return arrayInitializer_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayLengthAccess_adapted createArrayLengthAccess_adapted() {
		ArrayLengthAccess_adaptedImpl arrayLengthAccess_adapted = new ArrayLengthAccess_adaptedImpl();
		return arrayLengthAccess_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType_adapted createArrayType_adapted() {
		ArrayType_adaptedImpl arrayType_adapted = new ArrayType_adaptedImpl();
		return arrayType_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment_adapted createAssignment_adapted() {
		Assignment_adaptedImpl assignment_adapted = new Assignment_adaptedImpl();
		return assignment_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral_adapted createBooleanLiteral_adapted() {
		BooleanLiteral_adaptedImpl booleanLiteral_adapted = new BooleanLiteral_adaptedImpl();
		return booleanLiteral_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockComment_adapted createBlockComment_adapted() {
		BlockComment_adaptedImpl blockComment_adapted = new BlockComment_adaptedImpl();
		return blockComment_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_adapted createBlock_adapted() {
		Block_adaptedImpl block_adapted = new Block_adaptedImpl();
		return block_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakStatement_adapted createBreakStatement_adapted() {
		BreakStatement_adaptedImpl breakStatement_adapted = new BreakStatement_adaptedImpl();
		return breakStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CastExpression_adapted createCastExpression_adapted() {
		CastExpression_adaptedImpl castExpression_adapted = new CastExpression_adaptedImpl();
		return castExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchClause_adapted createCatchClause_adapted() {
		CatchClause_adaptedImpl catchClause_adapted = new CatchClause_adaptedImpl();
		return catchClause_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterLiteral_adapted createCharacterLiteral_adapted() {
		CharacterLiteral_adaptedImpl characterLiteral_adapted = new CharacterLiteral_adaptedImpl();
		return characterLiteral_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassFile_adapted createClassFile_adapted() {
		ClassFile_adaptedImpl classFile_adapted = new ClassFile_adaptedImpl();
		return classFile_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation_adapted createClassInstanceCreation_adapted() {
		ClassInstanceCreation_adaptedImpl classInstanceCreation_adapted = new ClassInstanceCreation_adaptedImpl();
		return classInstanceCreation_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorDeclaration_adapted createConstructorDeclaration_adapted() {
		ConstructorDeclaration_adaptedImpl constructorDeclaration_adapted = new ConstructorDeclaration_adaptedImpl();
		return constructorDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalExpression_adapted createConditionalExpression_adapted() {
		ConditionalExpression_adaptedImpl conditionalExpression_adapted = new ConditionalExpression_adaptedImpl();
		return conditionalExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorInvocation_adapted createConstructorInvocation_adapted() {
		ConstructorInvocation_adaptedImpl constructorInvocation_adapted = new ConstructorInvocation_adaptedImpl();
		return constructorInvocation_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration_adapted createClassDeclaration_adapted() {
		ClassDeclaration_adaptedImpl classDeclaration_adapted = new ClassDeclaration_adaptedImpl();
		return classDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted createCompilationUnit_adapted() {
		CompilationUnit_adaptedImpl compilationUnit_adapted = new CompilationUnit_adaptedImpl();
		return compilationUnit_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinueStatement_adapted createContinueStatement_adapted() {
		ContinueStatement_adaptedImpl continueStatement_adapted = new ContinueStatement_adaptedImpl();
		return continueStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoStatement_adapted createDoStatement_adapted() {
		DoStatement_adaptedImpl doStatement_adapted = new DoStatement_adaptedImpl();
		return doStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EmptyStatement_adapted createEmptyStatement_adapted() {
		EmptyStatement_adaptedImpl emptyStatement_adapted = new EmptyStatement_adaptedImpl();
		return emptyStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnhancedForStatement_adapted createEnhancedForStatement_adapted() {
		EnhancedForStatement_adaptedImpl enhancedForStatement_adapted = new EnhancedForStatement_adaptedImpl();
		return enhancedForStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumConstantDeclaration_adapted createEnumConstantDeclaration_adapted() {
		EnumConstantDeclaration_adaptedImpl enumConstantDeclaration_adapted = new EnumConstantDeclaration_adaptedImpl();
		return enumConstantDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumDeclaration_adapted createEnumDeclaration_adapted() {
		EnumDeclaration_adaptedImpl enumDeclaration_adapted = new EnumDeclaration_adaptedImpl();
		return enumDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionStatement_adapted createExpressionStatement_adapted() {
		ExpressionStatement_adaptedImpl expressionStatement_adapted = new ExpressionStatement_adaptedImpl();
		return expressionStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess_adapted createFieldAccess_adapted() {
		FieldAccess_adaptedImpl fieldAccess_adapted = new FieldAccess_adaptedImpl();
		return fieldAccess_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldDeclaration_adapted createFieldDeclaration_adapted() {
		FieldDeclaration_adaptedImpl fieldDeclaration_adapted = new FieldDeclaration_adaptedImpl();
		return fieldDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement_adapted createForStatement_adapted() {
		ForStatement_adaptedImpl forStatement_adapted = new ForStatement_adaptedImpl();
		return forStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement_adapted createIfStatement_adapted() {
		IfStatement_adaptedImpl ifStatement_adapted = new IfStatement_adaptedImpl();
		return ifStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportDeclaration_adapted createImportDeclaration_adapted() {
		ImportDeclaration_adaptedImpl importDeclaration_adapted = new ImportDeclaration_adaptedImpl();
		return importDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfixExpression_adapted createInfixExpression_adapted() {
		InfixExpression_adaptedImpl infixExpression_adapted = new InfixExpression_adaptedImpl();
		return infixExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Initializer_adapted createInitializer_adapted() {
		Initializer_adaptedImpl initializer_adapted = new Initializer_adaptedImpl();
		return initializer_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceofExpression_adapted createInstanceofExpression_adapted() {
		InstanceofExpression_adaptedImpl instanceofExpression_adapted = new InstanceofExpression_adaptedImpl();
		return instanceofExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceDeclaration_adapted createInterfaceDeclaration_adapted() {
		InterfaceDeclaration_adaptedImpl interfaceDeclaration_adapted = new InterfaceDeclaration_adaptedImpl();
		return interfaceDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Javadoc_adapted createJavadoc_adapted() {
		Javadoc_adaptedImpl javadoc_adapted = new Javadoc_adaptedImpl();
		return javadoc_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledStatement_adapted createLabeledStatement_adapted() {
		LabeledStatement_adaptedImpl labeledStatement_adapted = new LabeledStatement_adaptedImpl();
		return labeledStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineComment_adapted createLineComment_adapted() {
		LineComment_adaptedImpl lineComment_adapted = new LineComment_adaptedImpl();
		return lineComment_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manifest_adapted createManifest_adapted() {
		Manifest_adaptedImpl manifest_adapted = new Manifest_adaptedImpl();
		return manifest_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestAttribute_adapted createManifestAttribute_adapted() {
		ManifestAttribute_adaptedImpl manifestAttribute_adapted = new ManifestAttribute_adaptedImpl();
		return manifestAttribute_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestEntry_adapted createManifestEntry_adapted() {
		ManifestEntry_adaptedImpl manifestEntry_adapted = new ManifestEntry_adaptedImpl();
		return manifestEntry_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberRef_adapted createMemberRef_adapted() {
		MemberRef_adaptedImpl memberRef_adapted = new MemberRef_adaptedImpl();
		return memberRef_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration_adapted createMethodDeclaration_adapted() {
		MethodDeclaration_adaptedImpl methodDeclaration_adapted = new MethodDeclaration_adaptedImpl();
		return methodDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocation_adapted createMethodInvocation_adapted() {
		MethodInvocation_adaptedImpl methodInvocation_adapted = new MethodInvocation_adaptedImpl();
		return methodInvocation_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRef_adapted createMethodRef_adapted() {
		MethodRef_adaptedImpl methodRef_adapted = new MethodRef_adaptedImpl();
		return methodRef_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRefParameter_adapted createMethodRefParameter_adapted() {
		MethodRefParameter_adaptedImpl methodRefParameter_adapted = new MethodRefParameter_adaptedImpl();
		return methodRefParameter_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_adapted createModel_adapted() {
		Model_adaptedImpl model_adapted = new Model_adaptedImpl();
		return model_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted createModifier_adapted() {
		Modifier_adaptedImpl modifier_adapted = new Modifier_adaptedImpl();
		return modifier_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral_adapted createNumberLiteral_adapted() {
		NumberLiteral_adaptedImpl numberLiteral_adapted = new NumberLiteral_adaptedImpl();
		return numberLiteral_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullLiteral_adapted createNullLiteral_adapted() {
		NullLiteral_adaptedImpl nullLiteral_adapted = new NullLiteral_adaptedImpl();
		return nullLiteral_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package_adapted createPackage_adapted() {
		Package_adaptedImpl package_adapted = new Package_adaptedImpl();
		return package_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageAccess_adapted createPackageAccess_adapted() {
		PackageAccess_adaptedImpl packageAccess_adapted = new PackageAccess_adaptedImpl();
		return packageAccess_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType_adapted createParameterizedType_adapted() {
		ParameterizedType_adaptedImpl parameterizedType_adapted = new ParameterizedType_adaptedImpl();
		return parameterizedType_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParenthesizedExpression_adapted createParenthesizedExpression_adapted() {
		ParenthesizedExpression_adaptedImpl parenthesizedExpression_adapted = new ParenthesizedExpression_adaptedImpl();
		return parenthesizedExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostfixExpression_adapted createPostfixExpression_adapted() {
		PostfixExpression_adaptedImpl postfixExpression_adapted = new PostfixExpression_adaptedImpl();
		return postfixExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixExpression_adapted createPrefixExpression_adapted() {
		PrefixExpression_adaptedImpl prefixExpression_adapted = new PrefixExpression_adaptedImpl();
		return prefixExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType_adapted createPrimitiveType_adapted() {
		PrimitiveType_adaptedImpl primitiveType_adapted = new PrimitiveType_adaptedImpl();
		return primitiveType_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeBoolean_adapted createPrimitiveTypeBoolean_adapted() {
		PrimitiveTypeBoolean_adaptedImpl primitiveTypeBoolean_adapted = new PrimitiveTypeBoolean_adaptedImpl();
		return primitiveTypeBoolean_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeByte_adapted createPrimitiveTypeByte_adapted() {
		PrimitiveTypeByte_adaptedImpl primitiveTypeByte_adapted = new PrimitiveTypeByte_adaptedImpl();
		return primitiveTypeByte_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeChar_adapted createPrimitiveTypeChar_adapted() {
		PrimitiveTypeChar_adaptedImpl primitiveTypeChar_adapted = new PrimitiveTypeChar_adaptedImpl();
		return primitiveTypeChar_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeDouble_adapted createPrimitiveTypeDouble_adapted() {
		PrimitiveTypeDouble_adaptedImpl primitiveTypeDouble_adapted = new PrimitiveTypeDouble_adaptedImpl();
		return primitiveTypeDouble_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeShort_adapted createPrimitiveTypeShort_adapted() {
		PrimitiveTypeShort_adaptedImpl primitiveTypeShort_adapted = new PrimitiveTypeShort_adaptedImpl();
		return primitiveTypeShort_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeFloat_adapted createPrimitiveTypeFloat_adapted() {
		PrimitiveTypeFloat_adaptedImpl primitiveTypeFloat_adapted = new PrimitiveTypeFloat_adaptedImpl();
		return primitiveTypeFloat_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeInt_adapted createPrimitiveTypeInt_adapted() {
		PrimitiveTypeInt_adaptedImpl primitiveTypeInt_adapted = new PrimitiveTypeInt_adaptedImpl();
		return primitiveTypeInt_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeLong_adapted createPrimitiveTypeLong_adapted() {
		PrimitiveTypeLong_adaptedImpl primitiveTypeLong_adapted = new PrimitiveTypeLong_adaptedImpl();
		return primitiveTypeLong_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypeVoid_adapted createPrimitiveTypeVoid_adapted() {
		PrimitiveTypeVoid_adaptedImpl primitiveTypeVoid_adapted = new PrimitiveTypeVoid_adaptedImpl();
		return primitiveTypeVoid_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnStatement_adapted createReturnStatement_adapted() {
		ReturnStatement_adaptedImpl returnStatement_adapted = new ReturnStatement_adaptedImpl();
		return returnStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableAccess_adapted createSingleVariableAccess_adapted() {
		SingleVariableAccess_adaptedImpl singleVariableAccess_adapted = new SingleVariableAccess_adaptedImpl();
		return singleVariableAccess_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted createSingleVariableDeclaration_adapted() {
		SingleVariableDeclaration_adaptedImpl singleVariableDeclaration_adapted = new SingleVariableDeclaration_adaptedImpl();
		return singleVariableDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral_adapted createStringLiteral_adapted() {
		StringLiteral_adaptedImpl stringLiteral_adapted = new StringLiteral_adaptedImpl();
		return stringLiteral_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperConstructorInvocation_adapted createSuperConstructorInvocation_adapted() {
		SuperConstructorInvocation_adaptedImpl superConstructorInvocation_adapted = new SuperConstructorInvocation_adaptedImpl();
		return superConstructorInvocation_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperFieldAccess_adapted createSuperFieldAccess_adapted() {
		SuperFieldAccess_adaptedImpl superFieldAccess_adapted = new SuperFieldAccess_adaptedImpl();
		return superFieldAccess_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperMethodInvocation_adapted createSuperMethodInvocation_adapted() {
		SuperMethodInvocation_adaptedImpl superMethodInvocation_adapted = new SuperMethodInvocation_adaptedImpl();
		return superMethodInvocation_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchCase_adapted createSwitchCase_adapted() {
		SwitchCase_adaptedImpl switchCase_adapted = new SwitchCase_adaptedImpl();
		return switchCase_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchStatement_adapted createSwitchStatement_adapted() {
		SwitchStatement_adaptedImpl switchStatement_adapted = new SwitchStatement_adaptedImpl();
		return switchStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronizedStatement_adapted createSynchronizedStatement_adapted() {
		SynchronizedStatement_adaptedImpl synchronizedStatement_adapted = new SynchronizedStatement_adaptedImpl();
		return synchronizedStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagElement_adapted createTagElement_adapted() {
		TagElement_adaptedImpl tagElement_adapted = new TagElement_adaptedImpl();
		return tagElement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextElement_adapted createTextElement_adapted() {
		TextElement_adaptedImpl textElement_adapted = new TextElement_adaptedImpl();
		return textElement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThisExpression_adapted createThisExpression_adapted() {
		ThisExpression_adaptedImpl thisExpression_adapted = new ThisExpression_adaptedImpl();
		return thisExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrowStatement_adapted createThrowStatement_adapted() {
		ThrowStatement_adaptedImpl throwStatement_adapted = new ThrowStatement_adaptedImpl();
		return throwStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryStatement_adapted createTryStatement_adapted() {
		TryStatement_adaptedImpl tryStatement_adapted = new TryStatement_adaptedImpl();
		return tryStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted createTypeAccess_adapted() {
		TypeAccess_adaptedImpl typeAccess_adapted = new TypeAccess_adaptedImpl();
		return typeAccess_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeclarationStatement_adapted createTypeDeclarationStatement_adapted() {
		TypeDeclarationStatement_adaptedImpl typeDeclarationStatement_adapted = new TypeDeclarationStatement_adaptedImpl();
		return typeDeclarationStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeLiteral_adapted createTypeLiteral_adapted() {
		TypeLiteral_adaptedImpl typeLiteral_adapted = new TypeLiteral_adaptedImpl();
		return typeLiteral_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter_adapted createTypeParameter_adapted() {
		TypeParameter_adaptedImpl typeParameter_adapted = new TypeParameter_adaptedImpl();
		return typeParameter_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItem_adapted createUnresolvedItem_adapted() {
		UnresolvedItem_adaptedImpl unresolvedItem_adapted = new UnresolvedItem_adaptedImpl();
		return unresolvedItem_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItemAccess_adapted createUnresolvedItemAccess_adapted() {
		UnresolvedItemAccess_adaptedImpl unresolvedItemAccess_adapted = new UnresolvedItemAccess_adaptedImpl();
		return unresolvedItemAccess_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedAnnotationDeclaration_adapted createUnresolvedAnnotationDeclaration_adapted() {
		UnresolvedAnnotationDeclaration_adaptedImpl unresolvedAnnotationDeclaration_adapted = new UnresolvedAnnotationDeclaration_adaptedImpl();
		return unresolvedAnnotationDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedAnnotationTypeMemberDeclaration_adapted createUnresolvedAnnotationTypeMemberDeclaration_adapted() {
		UnresolvedAnnotationTypeMemberDeclaration_adaptedImpl unresolvedAnnotationTypeMemberDeclaration_adapted = new UnresolvedAnnotationTypeMemberDeclaration_adaptedImpl();
		return unresolvedAnnotationTypeMemberDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedClassDeclaration_adapted createUnresolvedClassDeclaration_adapted() {
		UnresolvedClassDeclaration_adaptedImpl unresolvedClassDeclaration_adapted = new UnresolvedClassDeclaration_adaptedImpl();
		return unresolvedClassDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedEnumDeclaration_adapted createUnresolvedEnumDeclaration_adapted() {
		UnresolvedEnumDeclaration_adaptedImpl unresolvedEnumDeclaration_adapted = new UnresolvedEnumDeclaration_adaptedImpl();
		return unresolvedEnumDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedInterfaceDeclaration_adapted createUnresolvedInterfaceDeclaration_adapted() {
		UnresolvedInterfaceDeclaration_adaptedImpl unresolvedInterfaceDeclaration_adapted = new UnresolvedInterfaceDeclaration_adaptedImpl();
		return unresolvedInterfaceDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedLabeledStatement_adapted createUnresolvedLabeledStatement_adapted() {
		UnresolvedLabeledStatement_adaptedImpl unresolvedLabeledStatement_adapted = new UnresolvedLabeledStatement_adaptedImpl();
		return unresolvedLabeledStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedMethodDeclaration_adapted createUnresolvedMethodDeclaration_adapted() {
		UnresolvedMethodDeclaration_adaptedImpl unresolvedMethodDeclaration_adapted = new UnresolvedMethodDeclaration_adaptedImpl();
		return unresolvedMethodDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedSingleVariableDeclaration_adapted createUnresolvedSingleVariableDeclaration_adapted() {
		UnresolvedSingleVariableDeclaration_adaptedImpl unresolvedSingleVariableDeclaration_adapted = new UnresolvedSingleVariableDeclaration_adaptedImpl();
		return unresolvedSingleVariableDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedType_adapted createUnresolvedType_adapted() {
		UnresolvedType_adaptedImpl unresolvedType_adapted = new UnresolvedType_adaptedImpl();
		return unresolvedType_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedTypeDeclaration_adapted createUnresolvedTypeDeclaration_adapted() {
		UnresolvedTypeDeclaration_adaptedImpl unresolvedTypeDeclaration_adapted = new UnresolvedTypeDeclaration_adaptedImpl();
		return unresolvedTypeDeclaration_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedVariableDeclarationFragment_adapted createUnresolvedVariableDeclarationFragment_adapted() {
		UnresolvedVariableDeclarationFragment_adaptedImpl unresolvedVariableDeclarationFragment_adapted = new UnresolvedVariableDeclarationFragment_adaptedImpl();
		return unresolvedVariableDeclarationFragment_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationExpression_adapted createVariableDeclarationExpression_adapted() {
		VariableDeclarationExpression_adaptedImpl variableDeclarationExpression_adapted = new VariableDeclarationExpression_adaptedImpl();
		return variableDeclarationExpression_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment_adapted createVariableDeclarationFragment_adapted() {
		VariableDeclarationFragment_adaptedImpl variableDeclarationFragment_adapted = new VariableDeclarationFragment_adaptedImpl();
		return variableDeclarationFragment_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationStatement_adapted createVariableDeclarationStatement_adapted() {
		VariableDeclarationStatement_adaptedImpl variableDeclarationStatement_adapted = new VariableDeclarationStatement_adaptedImpl();
		return variableDeclarationStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WildCardType_adapted createWildCardType_adapted() {
		WildCardType_adaptedImpl wildCardType_adapted = new WildCardType_adaptedImpl();
		return wildCardType_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement_adapted createWhileStatement_adapted() {
		WhileStatement_adaptedImpl whileStatement_adapted = new WhileStatement_adaptedImpl();
		return whileStatement_adapted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDeclaration_adapted_bodyItem createAbstractMethodDeclaration_adapted_bodyItem() {
		AbstractMethodDeclaration_adapted_bodyItemImpl abstractMethodDeclaration_adapted_bodyItem = new AbstractMethodDeclaration_adapted_bodyItemImpl();
		return abstractMethodDeclaration_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDeclaration_adapted_parametersItem createAbstractMethodDeclaration_adapted_parametersItem() {
		AbstractMethodDeclaration_adapted_parametersItemImpl abstractMethodDeclaration_adapted_parametersItem = new AbstractMethodDeclaration_adapted_parametersItemImpl();
		return abstractMethodDeclaration_adapted_parametersItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDeclaration_adapted_thrownExceptionsItem createAbstractMethodDeclaration_adapted_thrownExceptionsItem() {
		AbstractMethodDeclaration_adapted_thrownExceptionsItemImpl abstractMethodDeclaration_adapted_thrownExceptionsItem = new AbstractMethodDeclaration_adapted_thrownExceptionsItemImpl();
		return abstractMethodDeclaration_adapted_thrownExceptionsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDeclaration_adapted_typeParametersItem createAbstractMethodDeclaration_adapted_typeParametersItem() {
		AbstractMethodDeclaration_adapted_typeParametersItemImpl abstractMethodDeclaration_adapted_typeParametersItem = new AbstractMethodDeclaration_adapted_typeParametersItemImpl();
		return abstractMethodDeclaration_adapted_typeParametersItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDeclaration_adapted_usagesInDocCommentsItem createAbstractMethodDeclaration_adapted_usagesInDocCommentsItem() {
		AbstractMethodDeclaration_adapted_usagesInDocCommentsItemImpl abstractMethodDeclaration_adapted_usagesInDocCommentsItem = new AbstractMethodDeclaration_adapted_usagesInDocCommentsItemImpl();
		return abstractMethodDeclaration_adapted_usagesInDocCommentsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodDeclaration_adapted_usagesItem createAbstractMethodDeclaration_adapted_usagesItem() {
		AbstractMethodDeclaration_adapted_usagesItemImpl abstractMethodDeclaration_adapted_usagesItem = new AbstractMethodDeclaration_adapted_usagesItemImpl();
		return abstractMethodDeclaration_adapted_usagesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodInvocation_adapted_methodItem createAbstractMethodInvocation_adapted_methodItem() {
		AbstractMethodInvocation_adapted_methodItemImpl abstractMethodInvocation_adapted_methodItem = new AbstractMethodInvocation_adapted_methodItemImpl();
		return abstractMethodInvocation_adapted_methodItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodInvocation_adapted_argumentsItem createAbstractMethodInvocation_adapted_argumentsItem() {
		AbstractMethodInvocation_adapted_argumentsItemImpl abstractMethodInvocation_adapted_argumentsItem = new AbstractMethodInvocation_adapted_argumentsItemImpl();
		return abstractMethodInvocation_adapted_argumentsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMethodInvocation_adapted_typeArgumentsItem createAbstractMethodInvocation_adapted_typeArgumentsItem() {
		AbstractMethodInvocation_adapted_typeArgumentsItemImpl abstractMethodInvocation_adapted_typeArgumentsItem = new AbstractMethodInvocation_adapted_typeArgumentsItemImpl();
		return abstractMethodInvocation_adapted_typeArgumentsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration_adapted_bodyDeclarationsItem createAbstractTypeDeclaration_adapted_bodyDeclarationsItem() {
		AbstractTypeDeclaration_adapted_bodyDeclarationsItemImpl abstractTypeDeclaration_adapted_bodyDeclarationsItem = new AbstractTypeDeclaration_adapted_bodyDeclarationsItemImpl();
		return abstractTypeDeclaration_adapted_bodyDeclarationsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration_adapted_commentsBeforeBodyItem createAbstractTypeDeclaration_adapted_commentsBeforeBodyItem() {
		AbstractTypeDeclaration_adapted_commentsBeforeBodyItemImpl abstractTypeDeclaration_adapted_commentsBeforeBodyItem = new AbstractTypeDeclaration_adapted_commentsBeforeBodyItemImpl();
		return abstractTypeDeclaration_adapted_commentsBeforeBodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration_adapted_commentsAfterBodyItem createAbstractTypeDeclaration_adapted_commentsAfterBodyItem() {
		AbstractTypeDeclaration_adapted_commentsAfterBodyItemImpl abstractTypeDeclaration_adapted_commentsAfterBodyItem = new AbstractTypeDeclaration_adapted_commentsAfterBodyItemImpl();
		return abstractTypeDeclaration_adapted_commentsAfterBodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration_adapted_packageItem createAbstractTypeDeclaration_adapted_packageItem() {
		AbstractTypeDeclaration_adapted_packageItemImpl abstractTypeDeclaration_adapted_packageItem = new AbstractTypeDeclaration_adapted_packageItemImpl();
		return abstractTypeDeclaration_adapted_packageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeDeclaration_adapted_superInterfacesItem createAbstractTypeDeclaration_adapted_superInterfacesItem() {
		AbstractTypeDeclaration_adapted_superInterfacesItemImpl abstractTypeDeclaration_adapted_superInterfacesItem = new AbstractTypeDeclaration_adapted_superInterfacesItemImpl();
		return abstractTypeDeclaration_adapted_superInterfacesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractTypeQualifiedExpression_adapted_qualifierItem createAbstractTypeQualifiedExpression_adapted_qualifierItem() {
		AbstractTypeQualifiedExpression_adapted_qualifierItemImpl abstractTypeQualifiedExpression_adapted_qualifierItem = new AbstractTypeQualifiedExpression_adapted_qualifierItemImpl();
		return abstractTypeQualifiedExpression_adapted_qualifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractVariablesContainer_adapted_typeItem createAbstractVariablesContainer_adapted_typeItem() {
		AbstractVariablesContainer_adapted_typeItemImpl abstractVariablesContainer_adapted_typeItem = new AbstractVariablesContainer_adapted_typeItemImpl();
		return abstractVariablesContainer_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractVariablesContainer_adapted_fragmentsItem createAbstractVariablesContainer_adapted_fragmentsItem() {
		AbstractVariablesContainer_adapted_fragmentsItemImpl abstractVariablesContainer_adapted_fragmentsItem = new AbstractVariablesContainer_adapted_fragmentsItemImpl();
		return abstractVariablesContainer_adapted_fragmentsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation_adapted_typeItem createAnnotation_adapted_typeItem() {
		Annotation_adapted_typeItemImpl annotation_adapted_typeItem = new Annotation_adapted_typeItemImpl();
		return annotation_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation_adapted_valuesItem createAnnotation_adapted_valuesItem() {
		Annotation_adapted_valuesItemImpl annotation_adapted_valuesItem = new Annotation_adapted_valuesItemImpl();
		return annotation_adapted_valuesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Archive_adapted_originalFilePathValue createArchive_adapted_originalFilePathValue() {
		Archive_adapted_originalFilePathValueImpl archive_adapted_originalFilePathValue = new Archive_adapted_originalFilePathValueImpl();
		return archive_adapted_originalFilePathValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Archive_adapted_classFilesItem createArchive_adapted_classFilesItem() {
		Archive_adapted_classFilesItemImpl archive_adapted_classFilesItem = new Archive_adapted_classFilesItemImpl();
		return archive_adapted_classFilesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Archive_adapted_manifestItem createArchive_adapted_manifestItem() {
		Archive_adapted_manifestItemImpl archive_adapted_manifestItem = new Archive_adapted_manifestItemImpl();
		return archive_adapted_manifestItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertStatement_adapted_messageItem createAssertStatement_adapted_messageItem() {
		AssertStatement_adapted_messageItemImpl assertStatement_adapted_messageItem = new AssertStatement_adapted_messageItemImpl();
		return assertStatement_adapted_messageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssertStatement_adapted_expressionItem createAssertStatement_adapted_expressionItem() {
		AssertStatement_adapted_expressionItemImpl assertStatement_adapted_expressionItem = new AssertStatement_adapted_expressionItemImpl();
		return assertStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNode_adapted_commentsItem createASTNode_adapted_commentsItem() {
		ASTNode_adapted_commentsItemImpl astNode_adapted_commentsItem = new ASTNode_adapted_commentsItemImpl();
		return astNode_adapted_commentsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNode_adapted_originalCompilationUnitItem createASTNode_adapted_originalCompilationUnitItem() {
		ASTNode_adapted_originalCompilationUnitItemImpl astNode_adapted_originalCompilationUnitItem = new ASTNode_adapted_originalCompilationUnitItemImpl();
		return astNode_adapted_originalCompilationUnitItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASTNode_adapted_originalClassFileItem createASTNode_adapted_originalClassFileItem() {
		ASTNode_adapted_originalClassFileItemImpl astNode_adapted_originalClassFileItem = new ASTNode_adapted_originalClassFileItemImpl();
		return astNode_adapted_originalClassFileItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair_adapted_memberItem createAnnotationMemberValuePair_adapted_memberItem() {
		AnnotationMemberValuePair_adapted_memberItemImpl annotationMemberValuePair_adapted_memberItem = new AnnotationMemberValuePair_adapted_memberItemImpl();
		return annotationMemberValuePair_adapted_memberItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationMemberValuePair_adapted_valueItem createAnnotationMemberValuePair_adapted_valueItem() {
		AnnotationMemberValuePair_adapted_valueItemImpl annotationMemberValuePair_adapted_valueItem = new AnnotationMemberValuePair_adapted_valueItemImpl();
		return annotationMemberValuePair_adapted_valueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeMemberDeclaration_adapted_defaultItem createAnnotationTypeMemberDeclaration_adapted_defaultItem() {
		AnnotationTypeMemberDeclaration_adapted_defaultItemImpl annotationTypeMemberDeclaration_adapted_defaultItem = new AnnotationTypeMemberDeclaration_adapted_defaultItemImpl();
		return annotationTypeMemberDeclaration_adapted_defaultItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeMemberDeclaration_adapted_typeItem createAnnotationTypeMemberDeclaration_adapted_typeItem() {
		AnnotationTypeMemberDeclaration_adapted_typeItemImpl annotationTypeMemberDeclaration_adapted_typeItem = new AnnotationTypeMemberDeclaration_adapted_typeItemImpl();
		return annotationTypeMemberDeclaration_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationTypeMemberDeclaration_adapted_usagesItem createAnnotationTypeMemberDeclaration_adapted_usagesItem() {
		AnnotationTypeMemberDeclaration_adapted_usagesItemImpl annotationTypeMemberDeclaration_adapted_usagesItem = new AnnotationTypeMemberDeclaration_adapted_usagesItemImpl();
		return annotationTypeMemberDeclaration_adapted_usagesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclaration_adapted_bodyDeclarationsItem createAnonymousClassDeclaration_adapted_bodyDeclarationsItem() {
		AnonymousClassDeclaration_adapted_bodyDeclarationsItemImpl anonymousClassDeclaration_adapted_bodyDeclarationsItem = new AnonymousClassDeclaration_adapted_bodyDeclarationsItemImpl();
		return anonymousClassDeclaration_adapted_bodyDeclarationsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousClassDeclaration_adapted_classInstanceCreationItem createAnonymousClassDeclaration_adapted_classInstanceCreationItem() {
		AnonymousClassDeclaration_adapted_classInstanceCreationItemImpl anonymousClassDeclaration_adapted_classInstanceCreationItem = new AnonymousClassDeclaration_adapted_classInstanceCreationItemImpl();
		return anonymousClassDeclaration_adapted_classInstanceCreationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAccess_adapted_arrayItem createArrayAccess_adapted_arrayItem() {
		ArrayAccess_adapted_arrayItemImpl arrayAccess_adapted_arrayItem = new ArrayAccess_adapted_arrayItemImpl();
		return arrayAccess_adapted_arrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAccess_adapted_indexItem createArrayAccess_adapted_indexItem() {
		ArrayAccess_adapted_indexItemImpl arrayAccess_adapted_indexItem = new ArrayAccess_adapted_indexItemImpl();
		return arrayAccess_adapted_indexItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayCreation_adapted_dimensionsItem createArrayCreation_adapted_dimensionsItem() {
		ArrayCreation_adapted_dimensionsItemImpl arrayCreation_adapted_dimensionsItem = new ArrayCreation_adapted_dimensionsItemImpl();
		return arrayCreation_adapted_dimensionsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayCreation_adapted_initializerItem createArrayCreation_adapted_initializerItem() {
		ArrayCreation_adapted_initializerItemImpl arrayCreation_adapted_initializerItem = new ArrayCreation_adapted_initializerItemImpl();
		return arrayCreation_adapted_initializerItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayCreation_adapted_typeItem createArrayCreation_adapted_typeItem() {
		ArrayCreation_adapted_typeItemImpl arrayCreation_adapted_typeItem = new ArrayCreation_adapted_typeItemImpl();
		return arrayCreation_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayInitializer_adapted_expressionsItem createArrayInitializer_adapted_expressionsItem() {
		ArrayInitializer_adapted_expressionsItemImpl arrayInitializer_adapted_expressionsItem = new ArrayInitializer_adapted_expressionsItemImpl();
		return arrayInitializer_adapted_expressionsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayLengthAccess_adapted_arrayItem createArrayLengthAccess_adapted_arrayItem() {
		ArrayLengthAccess_adapted_arrayItemImpl arrayLengthAccess_adapted_arrayItem = new ArrayLengthAccess_adapted_arrayItemImpl();
		return arrayLengthAccess_adapted_arrayItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType_adapted_dimensionsValue createArrayType_adapted_dimensionsValue() {
		ArrayType_adapted_dimensionsValueImpl arrayType_adapted_dimensionsValue = new ArrayType_adapted_dimensionsValueImpl();
		return arrayType_adapted_dimensionsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType_adapted_elementTypeItem createArrayType_adapted_elementTypeItem() {
		ArrayType_adapted_elementTypeItemImpl arrayType_adapted_elementTypeItem = new ArrayType_adapted_elementTypeItemImpl();
		return arrayType_adapted_elementTypeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment_adapted_leftHandSideItem createAssignment_adapted_leftHandSideItem() {
		Assignment_adapted_leftHandSideItemImpl assignment_adapted_leftHandSideItem = new Assignment_adapted_leftHandSideItemImpl();
		return assignment_adapted_leftHandSideItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment_adapted_operatorValue createAssignment_adapted_operatorValue() {
		Assignment_adapted_operatorValueImpl assignment_adapted_operatorValue = new Assignment_adapted_operatorValueImpl();
		return assignment_adapted_operatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assignment_adapted_rightHandSideItem createAssignment_adapted_rightHandSideItem() {
		Assignment_adapted_rightHandSideItemImpl assignment_adapted_rightHandSideItem = new Assignment_adapted_rightHandSideItemImpl();
		return assignment_adapted_rightHandSideItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyDeclaration_adapted_abstractTypeDeclarationItem createBodyDeclaration_adapted_abstractTypeDeclarationItem() {
		BodyDeclaration_adapted_abstractTypeDeclarationItemImpl bodyDeclaration_adapted_abstractTypeDeclarationItem = new BodyDeclaration_adapted_abstractTypeDeclarationItemImpl();
		return bodyDeclaration_adapted_abstractTypeDeclarationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyDeclaration_adapted_annotationsItem createBodyDeclaration_adapted_annotationsItem() {
		BodyDeclaration_adapted_annotationsItemImpl bodyDeclaration_adapted_annotationsItem = new BodyDeclaration_adapted_annotationsItemImpl();
		return bodyDeclaration_adapted_annotationsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem createBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem() {
		BodyDeclaration_adapted_anonymousClassDeclarationOwnerItemImpl bodyDeclaration_adapted_anonymousClassDeclarationOwnerItem = new BodyDeclaration_adapted_anonymousClassDeclarationOwnerItemImpl();
		return bodyDeclaration_adapted_anonymousClassDeclarationOwnerItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyDeclaration_adapted_modifierItem createBodyDeclaration_adapted_modifierItem() {
		BodyDeclaration_adapted_modifierItemImpl bodyDeclaration_adapted_modifierItem = new BodyDeclaration_adapted_modifierItemImpl();
		return bodyDeclaration_adapted_modifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanLiteral_adapted_valueValue createBooleanLiteral_adapted_valueValue() {
		BooleanLiteral_adapted_valueValueImpl booleanLiteral_adapted_valueValue = new BooleanLiteral_adapted_valueValueImpl();
		return booleanLiteral_adapted_valueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_adapted_statementsItem createBlock_adapted_statementsItem() {
		Block_adapted_statementsItemImpl block_adapted_statementsItem = new Block_adapted_statementsItemImpl();
		return block_adapted_statementsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BreakStatement_adapted_labelItem createBreakStatement_adapted_labelItem() {
		BreakStatement_adapted_labelItemImpl breakStatement_adapted_labelItem = new BreakStatement_adapted_labelItemImpl();
		return breakStatement_adapted_labelItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CastExpression_adapted_expressionItem createCastExpression_adapted_expressionItem() {
		CastExpression_adapted_expressionItemImpl castExpression_adapted_expressionItem = new CastExpression_adapted_expressionItemImpl();
		return castExpression_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CastExpression_adapted_typeItem createCastExpression_adapted_typeItem() {
		CastExpression_adapted_typeItemImpl castExpression_adapted_typeItem = new CastExpression_adapted_typeItemImpl();
		return castExpression_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchClause_adapted_exceptionItem createCatchClause_adapted_exceptionItem() {
		CatchClause_adapted_exceptionItemImpl catchClause_adapted_exceptionItem = new CatchClause_adapted_exceptionItemImpl();
		return catchClause_adapted_exceptionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatchClause_adapted_bodyItem createCatchClause_adapted_bodyItem() {
		CatchClause_adapted_bodyItemImpl catchClause_adapted_bodyItem = new CatchClause_adapted_bodyItemImpl();
		return catchClause_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterLiteral_adapted_escapedValueValue createCharacterLiteral_adapted_escapedValueValue() {
		CharacterLiteral_adapted_escapedValueValueImpl characterLiteral_adapted_escapedValueValue = new CharacterLiteral_adapted_escapedValueValueImpl();
		return characterLiteral_adapted_escapedValueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassFile_adapted_originalFilePathValue createClassFile_adapted_originalFilePathValue() {
		ClassFile_adapted_originalFilePathValueImpl classFile_adapted_originalFilePathValue = new ClassFile_adapted_originalFilePathValueImpl();
		return classFile_adapted_originalFilePathValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassFile_adapted_typeItem createClassFile_adapted_typeItem() {
		ClassFile_adapted_typeItemImpl classFile_adapted_typeItem = new ClassFile_adapted_typeItemImpl();
		return classFile_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassFile_adapted_attachedSourceItem createClassFile_adapted_attachedSourceItem() {
		ClassFile_adapted_attachedSourceItemImpl classFile_adapted_attachedSourceItem = new ClassFile_adapted_attachedSourceItemImpl();
		return classFile_adapted_attachedSourceItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassFile_adapted_packageItem createClassFile_adapted_packageItem() {
		ClassFile_adapted_packageItemImpl classFile_adapted_packageItem = new ClassFile_adapted_packageItemImpl();
		return classFile_adapted_packageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation_adapted_anonymousClassDeclarationItem createClassInstanceCreation_adapted_anonymousClassDeclarationItem() {
		ClassInstanceCreation_adapted_anonymousClassDeclarationItemImpl classInstanceCreation_adapted_anonymousClassDeclarationItem = new ClassInstanceCreation_adapted_anonymousClassDeclarationItemImpl();
		return classInstanceCreation_adapted_anonymousClassDeclarationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation_adapted_expressionItem createClassInstanceCreation_adapted_expressionItem() {
		ClassInstanceCreation_adapted_expressionItemImpl classInstanceCreation_adapted_expressionItem = new ClassInstanceCreation_adapted_expressionItemImpl();
		return classInstanceCreation_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassInstanceCreation_adapted_typeItem createClassInstanceCreation_adapted_typeItem() {
		ClassInstanceCreation_adapted_typeItemImpl classInstanceCreation_adapted_typeItem = new ClassInstanceCreation_adapted_typeItemImpl();
		return classInstanceCreation_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalExpression_adapted_elseExpressionItem createConditionalExpression_adapted_elseExpressionItem() {
		ConditionalExpression_adapted_elseExpressionItemImpl conditionalExpression_adapted_elseExpressionItem = new ConditionalExpression_adapted_elseExpressionItemImpl();
		return conditionalExpression_adapted_elseExpressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalExpression_adapted_expressionItem createConditionalExpression_adapted_expressionItem() {
		ConditionalExpression_adapted_expressionItemImpl conditionalExpression_adapted_expressionItem = new ConditionalExpression_adapted_expressionItemImpl();
		return conditionalExpression_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalExpression_adapted_thenExpressionItem createConditionalExpression_adapted_thenExpressionItem() {
		ConditionalExpression_adapted_thenExpressionItemImpl conditionalExpression_adapted_thenExpressionItem = new ConditionalExpression_adapted_thenExpressionItemImpl();
		return conditionalExpression_adapted_thenExpressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassDeclaration_adapted_superClassItem createClassDeclaration_adapted_superClassItem() {
		ClassDeclaration_adapted_superClassItemImpl classDeclaration_adapted_superClassItem = new ClassDeclaration_adapted_superClassItemImpl();
		return classDeclaration_adapted_superClassItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment_adapted_contentValue createComment_adapted_contentValue() {
		Comment_adapted_contentValueImpl comment_adapted_contentValue = new Comment_adapted_contentValueImpl();
		return comment_adapted_contentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment_adapted_enclosedByParentValue createComment_adapted_enclosedByParentValue() {
		Comment_adapted_enclosedByParentValueImpl comment_adapted_enclosedByParentValue = new Comment_adapted_enclosedByParentValueImpl();
		return comment_adapted_enclosedByParentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment_adapted_prefixOfParentValue createComment_adapted_prefixOfParentValue() {
		Comment_adapted_prefixOfParentValueImpl comment_adapted_prefixOfParentValue = new Comment_adapted_prefixOfParentValueImpl();
		return comment_adapted_prefixOfParentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted_originalFilePathValue createCompilationUnit_adapted_originalFilePathValue() {
		CompilationUnit_adapted_originalFilePathValueImpl compilationUnit_adapted_originalFilePathValue = new CompilationUnit_adapted_originalFilePathValueImpl();
		return compilationUnit_adapted_originalFilePathValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted_commentListItem createCompilationUnit_adapted_commentListItem() {
		CompilationUnit_adapted_commentListItemImpl compilationUnit_adapted_commentListItem = new CompilationUnit_adapted_commentListItemImpl();
		return compilationUnit_adapted_commentListItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted_importsItem createCompilationUnit_adapted_importsItem() {
		CompilationUnit_adapted_importsItemImpl compilationUnit_adapted_importsItem = new CompilationUnit_adapted_importsItemImpl();
		return compilationUnit_adapted_importsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted_packageItem createCompilationUnit_adapted_packageItem() {
		CompilationUnit_adapted_packageItemImpl compilationUnit_adapted_packageItem = new CompilationUnit_adapted_packageItemImpl();
		return compilationUnit_adapted_packageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompilationUnit_adapted_typesItem createCompilationUnit_adapted_typesItem() {
		CompilationUnit_adapted_typesItemImpl compilationUnit_adapted_typesItem = new CompilationUnit_adapted_typesItemImpl();
		return compilationUnit_adapted_typesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinueStatement_adapted_labelItem createContinueStatement_adapted_labelItem() {
		ContinueStatement_adapted_labelItemImpl continueStatement_adapted_labelItem = new ContinueStatement_adapted_labelItemImpl();
		return continueStatement_adapted_labelItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoStatement_adapted_expressionItem createDoStatement_adapted_expressionItem() {
		DoStatement_adapted_expressionItemImpl doStatement_adapted_expressionItem = new DoStatement_adapted_expressionItemImpl();
		return doStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoStatement_adapted_bodyItem createDoStatement_adapted_bodyItem() {
		DoStatement_adapted_bodyItemImpl doStatement_adapted_bodyItem = new DoStatement_adapted_bodyItemImpl();
		return doStatement_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnhancedForStatement_adapted_bodyItem createEnhancedForStatement_adapted_bodyItem() {
		EnhancedForStatement_adapted_bodyItemImpl enhancedForStatement_adapted_bodyItem = new EnhancedForStatement_adapted_bodyItemImpl();
		return enhancedForStatement_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnhancedForStatement_adapted_expressionItem createEnhancedForStatement_adapted_expressionItem() {
		EnhancedForStatement_adapted_expressionItemImpl enhancedForStatement_adapted_expressionItem = new EnhancedForStatement_adapted_expressionItemImpl();
		return enhancedForStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnhancedForStatement_adapted_parameterItem createEnhancedForStatement_adapted_parameterItem() {
		EnhancedForStatement_adapted_parameterItemImpl enhancedForStatement_adapted_parameterItem = new EnhancedForStatement_adapted_parameterItemImpl();
		return enhancedForStatement_adapted_parameterItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumConstantDeclaration_adapted_anonymousClassDeclarationItem createEnumConstantDeclaration_adapted_anonymousClassDeclarationItem() {
		EnumConstantDeclaration_adapted_anonymousClassDeclarationItemImpl enumConstantDeclaration_adapted_anonymousClassDeclarationItem = new EnumConstantDeclaration_adapted_anonymousClassDeclarationItemImpl();
		return enumConstantDeclaration_adapted_anonymousClassDeclarationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumConstantDeclaration_adapted_argumentsItem createEnumConstantDeclaration_adapted_argumentsItem() {
		EnumConstantDeclaration_adapted_argumentsItemImpl enumConstantDeclaration_adapted_argumentsItem = new EnumConstantDeclaration_adapted_argumentsItemImpl();
		return enumConstantDeclaration_adapted_argumentsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumDeclaration_adapted_enumConstantsItem createEnumDeclaration_adapted_enumConstantsItem() {
		EnumDeclaration_adapted_enumConstantsItemImpl enumDeclaration_adapted_enumConstantsItem = new EnumDeclaration_adapted_enumConstantsItemImpl();
		return enumDeclaration_adapted_enumConstantsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionStatement_adapted_expressionItem createExpressionStatement_adapted_expressionItem() {
		ExpressionStatement_adapted_expressionItemImpl expressionStatement_adapted_expressionItem = new ExpressionStatement_adapted_expressionItemImpl();
		return expressionStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess_adapted_fieldItem createFieldAccess_adapted_fieldItem() {
		FieldAccess_adapted_fieldItemImpl fieldAccess_adapted_fieldItem = new FieldAccess_adapted_fieldItemImpl();
		return fieldAccess_adapted_fieldItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldAccess_adapted_expressionItem createFieldAccess_adapted_expressionItem() {
		FieldAccess_adapted_expressionItemImpl fieldAccess_adapted_expressionItem = new FieldAccess_adapted_expressionItemImpl();
		return fieldAccess_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement_adapted_expressionItem createForStatement_adapted_expressionItem() {
		ForStatement_adapted_expressionItemImpl forStatement_adapted_expressionItem = new ForStatement_adapted_expressionItemImpl();
		return forStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement_adapted_updatersItem createForStatement_adapted_updatersItem() {
		ForStatement_adapted_updatersItemImpl forStatement_adapted_updatersItem = new ForStatement_adapted_updatersItemImpl();
		return forStatement_adapted_updatersItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement_adapted_initializersItem createForStatement_adapted_initializersItem() {
		ForStatement_adapted_initializersItemImpl forStatement_adapted_initializersItem = new ForStatement_adapted_initializersItemImpl();
		return forStatement_adapted_initializersItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForStatement_adapted_bodyItem createForStatement_adapted_bodyItem() {
		ForStatement_adapted_bodyItemImpl forStatement_adapted_bodyItem = new ForStatement_adapted_bodyItemImpl();
		return forStatement_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement_adapted_expressionItem createIfStatement_adapted_expressionItem() {
		IfStatement_adapted_expressionItemImpl ifStatement_adapted_expressionItem = new IfStatement_adapted_expressionItemImpl();
		return ifStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement_adapted_thenStatementItem createIfStatement_adapted_thenStatementItem() {
		IfStatement_adapted_thenStatementItemImpl ifStatement_adapted_thenStatementItem = new IfStatement_adapted_thenStatementItemImpl();
		return ifStatement_adapted_thenStatementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfStatement_adapted_elseStatementItem createIfStatement_adapted_elseStatementItem() {
		IfStatement_adapted_elseStatementItemImpl ifStatement_adapted_elseStatementItem = new IfStatement_adapted_elseStatementItemImpl();
		return ifStatement_adapted_elseStatementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportDeclaration_adapted_staticValue createImportDeclaration_adapted_staticValue() {
		ImportDeclaration_adapted_staticValueImpl importDeclaration_adapted_staticValue = new ImportDeclaration_adapted_staticValueImpl();
		return importDeclaration_adapted_staticValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportDeclaration_adapted_importedElementItem createImportDeclaration_adapted_importedElementItem() {
		ImportDeclaration_adapted_importedElementItemImpl importDeclaration_adapted_importedElementItem = new ImportDeclaration_adapted_importedElementItemImpl();
		return importDeclaration_adapted_importedElementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfixExpression_adapted_operatorValue createInfixExpression_adapted_operatorValue() {
		InfixExpression_adapted_operatorValueImpl infixExpression_adapted_operatorValue = new InfixExpression_adapted_operatorValueImpl();
		return infixExpression_adapted_operatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfixExpression_adapted_rightOperandItem createInfixExpression_adapted_rightOperandItem() {
		InfixExpression_adapted_rightOperandItemImpl infixExpression_adapted_rightOperandItem = new InfixExpression_adapted_rightOperandItemImpl();
		return infixExpression_adapted_rightOperandItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfixExpression_adapted_leftOperandItem createInfixExpression_adapted_leftOperandItem() {
		InfixExpression_adapted_leftOperandItemImpl infixExpression_adapted_leftOperandItem = new InfixExpression_adapted_leftOperandItemImpl();
		return infixExpression_adapted_leftOperandItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfixExpression_adapted_extendedOperandsItem createInfixExpression_adapted_extendedOperandsItem() {
		InfixExpression_adapted_extendedOperandsItemImpl infixExpression_adapted_extendedOperandsItem = new InfixExpression_adapted_extendedOperandsItemImpl();
		return infixExpression_adapted_extendedOperandsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Initializer_adapted_bodyItem createInitializer_adapted_bodyItem() {
		Initializer_adapted_bodyItemImpl initializer_adapted_bodyItem = new Initializer_adapted_bodyItemImpl();
		return initializer_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceofExpression_adapted_rightOperandItem createInstanceofExpression_adapted_rightOperandItem() {
		InstanceofExpression_adapted_rightOperandItemImpl instanceofExpression_adapted_rightOperandItem = new InstanceofExpression_adapted_rightOperandItemImpl();
		return instanceofExpression_adapted_rightOperandItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceofExpression_adapted_leftOperandItem createInstanceofExpression_adapted_leftOperandItem() {
		InstanceofExpression_adapted_leftOperandItemImpl instanceofExpression_adapted_leftOperandItem = new InstanceofExpression_adapted_leftOperandItemImpl();
		return instanceofExpression_adapted_leftOperandItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Javadoc_adapted_tagsItem createJavadoc_adapted_tagsItem() {
		Javadoc_adapted_tagsItemImpl javadoc_adapted_tagsItem = new Javadoc_adapted_tagsItemImpl();
		return javadoc_adapted_tagsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledStatement_adapted_bodyItem createLabeledStatement_adapted_bodyItem() {
		LabeledStatement_adapted_bodyItemImpl labeledStatement_adapted_bodyItem = new LabeledStatement_adapted_bodyItemImpl();
		return labeledStatement_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledStatement_adapted_usagesInBreakStatementsItem createLabeledStatement_adapted_usagesInBreakStatementsItem() {
		LabeledStatement_adapted_usagesInBreakStatementsItemImpl labeledStatement_adapted_usagesInBreakStatementsItem = new LabeledStatement_adapted_usagesInBreakStatementsItemImpl();
		return labeledStatement_adapted_usagesInBreakStatementsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabeledStatement_adapted_usagesInContinueStatementsItem createLabeledStatement_adapted_usagesInContinueStatementsItem() {
		LabeledStatement_adapted_usagesInContinueStatementsItemImpl labeledStatement_adapted_usagesInContinueStatementsItem = new LabeledStatement_adapted_usagesInContinueStatementsItemImpl();
		return labeledStatement_adapted_usagesInContinueStatementsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manifest_adapted_mainAttributesItem createManifest_adapted_mainAttributesItem() {
		Manifest_adapted_mainAttributesItemImpl manifest_adapted_mainAttributesItem = new Manifest_adapted_mainAttributesItemImpl();
		return manifest_adapted_mainAttributesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Manifest_adapted_entryAttributesItem createManifest_adapted_entryAttributesItem() {
		Manifest_adapted_entryAttributesItemImpl manifest_adapted_entryAttributesItem = new Manifest_adapted_entryAttributesItemImpl();
		return manifest_adapted_entryAttributesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestAttribute_adapted_keyValue createManifestAttribute_adapted_keyValue() {
		ManifestAttribute_adapted_keyValueImpl manifestAttribute_adapted_keyValue = new ManifestAttribute_adapted_keyValueImpl();
		return manifestAttribute_adapted_keyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestAttribute_adapted_valueValue createManifestAttribute_adapted_valueValue() {
		ManifestAttribute_adapted_valueValueImpl manifestAttribute_adapted_valueValue = new ManifestAttribute_adapted_valueValueImpl();
		return manifestAttribute_adapted_valueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestEntry_adapted_nameValue createManifestEntry_adapted_nameValue() {
		ManifestEntry_adapted_nameValueImpl manifestEntry_adapted_nameValue = new ManifestEntry_adapted_nameValueImpl();
		return manifestEntry_adapted_nameValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ManifestEntry_adapted_attributesItem createManifestEntry_adapted_attributesItem() {
		ManifestEntry_adapted_attributesItemImpl manifestEntry_adapted_attributesItem = new ManifestEntry_adapted_attributesItemImpl();
		return manifestEntry_adapted_attributesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberRef_adapted_memberItem createMemberRef_adapted_memberItem() {
		MemberRef_adapted_memberItemImpl memberRef_adapted_memberItem = new MemberRef_adapted_memberItemImpl();
		return memberRef_adapted_memberItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MemberRef_adapted_qualifierItem createMemberRef_adapted_qualifierItem() {
		MemberRef_adapted_qualifierItemImpl memberRef_adapted_qualifierItem = new MemberRef_adapted_qualifierItemImpl();
		return memberRef_adapted_qualifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration_adapted_extraArrayDimensionsValue createMethodDeclaration_adapted_extraArrayDimensionsValue() {
		MethodDeclaration_adapted_extraArrayDimensionsValueImpl methodDeclaration_adapted_extraArrayDimensionsValue = new MethodDeclaration_adapted_extraArrayDimensionsValueImpl();
		return methodDeclaration_adapted_extraArrayDimensionsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration_adapted_returnTypeItem createMethodDeclaration_adapted_returnTypeItem() {
		MethodDeclaration_adapted_returnTypeItemImpl methodDeclaration_adapted_returnTypeItem = new MethodDeclaration_adapted_returnTypeItemImpl();
		return methodDeclaration_adapted_returnTypeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration_adapted_redefinedMethodDeclarationItem createMethodDeclaration_adapted_redefinedMethodDeclarationItem() {
		MethodDeclaration_adapted_redefinedMethodDeclarationItemImpl methodDeclaration_adapted_redefinedMethodDeclarationItem = new MethodDeclaration_adapted_redefinedMethodDeclarationItemImpl();
		return methodDeclaration_adapted_redefinedMethodDeclarationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodDeclaration_adapted_redefinitionsItem createMethodDeclaration_adapted_redefinitionsItem() {
		MethodDeclaration_adapted_redefinitionsItemImpl methodDeclaration_adapted_redefinitionsItem = new MethodDeclaration_adapted_redefinitionsItemImpl();
		return methodDeclaration_adapted_redefinitionsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodInvocation_adapted_expressionItem createMethodInvocation_adapted_expressionItem() {
		MethodInvocation_adapted_expressionItemImpl methodInvocation_adapted_expressionItem = new MethodInvocation_adapted_expressionItemImpl();
		return methodInvocation_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRef_adapted_methodItem createMethodRef_adapted_methodItem() {
		MethodRef_adapted_methodItemImpl methodRef_adapted_methodItem = new MethodRef_adapted_methodItemImpl();
		return methodRef_adapted_methodItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRef_adapted_qualifierItem createMethodRef_adapted_qualifierItem() {
		MethodRef_adapted_qualifierItemImpl methodRef_adapted_qualifierItem = new MethodRef_adapted_qualifierItemImpl();
		return methodRef_adapted_qualifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRef_adapted_parametersItem createMethodRef_adapted_parametersItem() {
		MethodRef_adapted_parametersItemImpl methodRef_adapted_parametersItem = new MethodRef_adapted_parametersItemImpl();
		return methodRef_adapted_parametersItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRefParameter_adapted_nameValue createMethodRefParameter_adapted_nameValue() {
		MethodRefParameter_adapted_nameValueImpl methodRefParameter_adapted_nameValue = new MethodRefParameter_adapted_nameValueImpl();
		return methodRefParameter_adapted_nameValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRefParameter_adapted_varargsValue createMethodRefParameter_adapted_varargsValue() {
		MethodRefParameter_adapted_varargsValueImpl methodRefParameter_adapted_varargsValue = new MethodRefParameter_adapted_varargsValueImpl();
		return methodRefParameter_adapted_varargsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodRefParameter_adapted_typeItem createMethodRefParameter_adapted_typeItem() {
		MethodRefParameter_adapted_typeItemImpl methodRefParameter_adapted_typeItem = new MethodRefParameter_adapted_typeItemImpl();
		return methodRefParameter_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_adapted_nameValue createModel_adapted_nameValue() {
		Model_adapted_nameValueImpl model_adapted_nameValue = new Model_adapted_nameValueImpl();
		return model_adapted_nameValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_adapted_ownedElementsItem createModel_adapted_ownedElementsItem() {
		Model_adapted_ownedElementsItemImpl model_adapted_ownedElementsItem = new Model_adapted_ownedElementsItemImpl();
		return model_adapted_ownedElementsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_adapted_orphanTypesItem createModel_adapted_orphanTypesItem() {
		Model_adapted_orphanTypesItemImpl model_adapted_orphanTypesItem = new Model_adapted_orphanTypesItemImpl();
		return model_adapted_orphanTypesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_adapted_unresolvedItemsItem createModel_adapted_unresolvedItemsItem() {
		Model_adapted_unresolvedItemsItemImpl model_adapted_unresolvedItemsItem = new Model_adapted_unresolvedItemsItemImpl();
		return model_adapted_unresolvedItemsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_adapted_compilationUnitsItem createModel_adapted_compilationUnitsItem() {
		Model_adapted_compilationUnitsItemImpl model_adapted_compilationUnitsItem = new Model_adapted_compilationUnitsItemImpl();
		return model_adapted_compilationUnitsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_adapted_classFilesItem createModel_adapted_classFilesItem() {
		Model_adapted_classFilesItemImpl model_adapted_classFilesItem = new Model_adapted_classFilesItemImpl();
		return model_adapted_classFilesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model_adapted_archivesItem createModel_adapted_archivesItem() {
		Model_adapted_archivesItemImpl model_adapted_archivesItem = new Model_adapted_archivesItemImpl();
		return model_adapted_archivesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_visibilityValue createModifier_adapted_visibilityValue() {
		Modifier_adapted_visibilityValueImpl modifier_adapted_visibilityValue = new Modifier_adapted_visibilityValueImpl();
		return modifier_adapted_visibilityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_inheritanceValue createModifier_adapted_inheritanceValue() {
		Modifier_adapted_inheritanceValueImpl modifier_adapted_inheritanceValue = new Modifier_adapted_inheritanceValueImpl();
		return modifier_adapted_inheritanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_staticValue createModifier_adapted_staticValue() {
		Modifier_adapted_staticValueImpl modifier_adapted_staticValue = new Modifier_adapted_staticValueImpl();
		return modifier_adapted_staticValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_transientValue createModifier_adapted_transientValue() {
		Modifier_adapted_transientValueImpl modifier_adapted_transientValue = new Modifier_adapted_transientValueImpl();
		return modifier_adapted_transientValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_volatileValue createModifier_adapted_volatileValue() {
		Modifier_adapted_volatileValueImpl modifier_adapted_volatileValue = new Modifier_adapted_volatileValueImpl();
		return modifier_adapted_volatileValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_nativeValue createModifier_adapted_nativeValue() {
		Modifier_adapted_nativeValueImpl modifier_adapted_nativeValue = new Modifier_adapted_nativeValueImpl();
		return modifier_adapted_nativeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_strictfpValue createModifier_adapted_strictfpValue() {
		Modifier_adapted_strictfpValueImpl modifier_adapted_strictfpValue = new Modifier_adapted_strictfpValueImpl();
		return modifier_adapted_strictfpValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_synchronizedValue createModifier_adapted_synchronizedValue() {
		Modifier_adapted_synchronizedValueImpl modifier_adapted_synchronizedValue = new Modifier_adapted_synchronizedValueImpl();
		return modifier_adapted_synchronizedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_bodyDeclarationItem createModifier_adapted_bodyDeclarationItem() {
		Modifier_adapted_bodyDeclarationItemImpl modifier_adapted_bodyDeclarationItem = new Modifier_adapted_bodyDeclarationItemImpl();
		return modifier_adapted_bodyDeclarationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_singleVariableDeclarationItem createModifier_adapted_singleVariableDeclarationItem() {
		Modifier_adapted_singleVariableDeclarationItemImpl modifier_adapted_singleVariableDeclarationItem = new Modifier_adapted_singleVariableDeclarationItemImpl();
		return modifier_adapted_singleVariableDeclarationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_variableDeclarationStatementItem createModifier_adapted_variableDeclarationStatementItem() {
		Modifier_adapted_variableDeclarationStatementItemImpl modifier_adapted_variableDeclarationStatementItem = new Modifier_adapted_variableDeclarationStatementItemImpl();
		return modifier_adapted_variableDeclarationStatementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier_adapted_variableDeclarationExpressionItem createModifier_adapted_variableDeclarationExpressionItem() {
		Modifier_adapted_variableDeclarationExpressionItemImpl modifier_adapted_variableDeclarationExpressionItem = new Modifier_adapted_variableDeclarationExpressionItemImpl();
		return modifier_adapted_variableDeclarationExpressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement_adapted_nameValue createNamedElement_adapted_nameValue() {
		NamedElement_adapted_nameValueImpl namedElement_adapted_nameValue = new NamedElement_adapted_nameValueImpl();
		return namedElement_adapted_nameValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement_adapted_proxyValue createNamedElement_adapted_proxyValue() {
		NamedElement_adapted_proxyValueImpl namedElement_adapted_proxyValue = new NamedElement_adapted_proxyValueImpl();
		return namedElement_adapted_proxyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement_adapted_usagesInImportsItem createNamedElement_adapted_usagesInImportsItem() {
		NamedElement_adapted_usagesInImportsItemImpl namedElement_adapted_usagesInImportsItem = new NamedElement_adapted_usagesInImportsItemImpl();
		return namedElement_adapted_usagesInImportsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberLiteral_adapted_tokenValueValue createNumberLiteral_adapted_tokenValueValue() {
		NumberLiteral_adapted_tokenValueValueImpl numberLiteral_adapted_tokenValueValue = new NumberLiteral_adapted_tokenValueValueImpl();
		return numberLiteral_adapted_tokenValueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package_adapted_ownedElementsItem createPackage_adapted_ownedElementsItem() {
		Package_adapted_ownedElementsItemImpl package_adapted_ownedElementsItem = new Package_adapted_ownedElementsItemImpl();
		return package_adapted_ownedElementsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package_adapted_modelItem createPackage_adapted_modelItem() {
		Package_adapted_modelItemImpl package_adapted_modelItem = new Package_adapted_modelItemImpl();
		return package_adapted_modelItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package_adapted_ownedPackagesItem createPackage_adapted_ownedPackagesItem() {
		Package_adapted_ownedPackagesItemImpl package_adapted_ownedPackagesItem = new Package_adapted_ownedPackagesItemImpl();
		return package_adapted_ownedPackagesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package_adapted_packageItem createPackage_adapted_packageItem() {
		Package_adapted_packageItemImpl package_adapted_packageItem = new Package_adapted_packageItemImpl();
		return package_adapted_packageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Package_adapted_usagesInPackageAccessItem createPackage_adapted_usagesInPackageAccessItem() {
		Package_adapted_usagesInPackageAccessItemImpl package_adapted_usagesInPackageAccessItem = new Package_adapted_usagesInPackageAccessItemImpl();
		return package_adapted_usagesInPackageAccessItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageAccess_adapted_packageItem createPackageAccess_adapted_packageItem() {
		PackageAccess_adapted_packageItemImpl packageAccess_adapted_packageItem = new PackageAccess_adapted_packageItemImpl();
		return packageAccess_adapted_packageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PackageAccess_adapted_qualifierItem createPackageAccess_adapted_qualifierItem() {
		PackageAccess_adapted_qualifierItemImpl packageAccess_adapted_qualifierItem = new PackageAccess_adapted_qualifierItemImpl();
		return packageAccess_adapted_qualifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType_adapted_typeItem createParameterizedType_adapted_typeItem() {
		ParameterizedType_adapted_typeItemImpl parameterizedType_adapted_typeItem = new ParameterizedType_adapted_typeItemImpl();
		return parameterizedType_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterizedType_adapted_typeArgumentsItem createParameterizedType_adapted_typeArgumentsItem() {
		ParameterizedType_adapted_typeArgumentsItemImpl parameterizedType_adapted_typeArgumentsItem = new ParameterizedType_adapted_typeArgumentsItemImpl();
		return parameterizedType_adapted_typeArgumentsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParenthesizedExpression_adapted_expressionItem createParenthesizedExpression_adapted_expressionItem() {
		ParenthesizedExpression_adapted_expressionItemImpl parenthesizedExpression_adapted_expressionItem = new ParenthesizedExpression_adapted_expressionItemImpl();
		return parenthesizedExpression_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostfixExpression_adapted_operatorValue createPostfixExpression_adapted_operatorValue() {
		PostfixExpression_adapted_operatorValueImpl postfixExpression_adapted_operatorValue = new PostfixExpression_adapted_operatorValueImpl();
		return postfixExpression_adapted_operatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostfixExpression_adapted_operandItem createPostfixExpression_adapted_operandItem() {
		PostfixExpression_adapted_operandItemImpl postfixExpression_adapted_operandItem = new PostfixExpression_adapted_operandItemImpl();
		return postfixExpression_adapted_operandItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixExpression_adapted_operatorValue createPrefixExpression_adapted_operatorValue() {
		PrefixExpression_adapted_operatorValueImpl prefixExpression_adapted_operatorValue = new PrefixExpression_adapted_operatorValueImpl();
		return prefixExpression_adapted_operatorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrefixExpression_adapted_operandItem createPrefixExpression_adapted_operandItem() {
		PrefixExpression_adapted_operandItemImpl prefixExpression_adapted_operandItem = new PrefixExpression_adapted_operandItemImpl();
		return prefixExpression_adapted_operandItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnStatement_adapted_expressionItem createReturnStatement_adapted_expressionItem() {
		ReturnStatement_adapted_expressionItemImpl returnStatement_adapted_expressionItem = new ReturnStatement_adapted_expressionItemImpl();
		return returnStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableAccess_adapted_variableItem createSingleVariableAccess_adapted_variableItem() {
		SingleVariableAccess_adapted_variableItemImpl singleVariableAccess_adapted_variableItem = new SingleVariableAccess_adapted_variableItemImpl();
		return singleVariableAccess_adapted_variableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableAccess_adapted_qualifierItem createSingleVariableAccess_adapted_qualifierItem() {
		SingleVariableAccess_adapted_qualifierItemImpl singleVariableAccess_adapted_qualifierItem = new SingleVariableAccess_adapted_qualifierItemImpl();
		return singleVariableAccess_adapted_qualifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted_modifierItem createSingleVariableDeclaration_adapted_modifierItem() {
		SingleVariableDeclaration_adapted_modifierItemImpl singleVariableDeclaration_adapted_modifierItem = new SingleVariableDeclaration_adapted_modifierItemImpl();
		return singleVariableDeclaration_adapted_modifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted_varargsValue createSingleVariableDeclaration_adapted_varargsValue() {
		SingleVariableDeclaration_adapted_varargsValueImpl singleVariableDeclaration_adapted_varargsValue = new SingleVariableDeclaration_adapted_varargsValueImpl();
		return singleVariableDeclaration_adapted_varargsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted_typeItem createSingleVariableDeclaration_adapted_typeItem() {
		SingleVariableDeclaration_adapted_typeItemImpl singleVariableDeclaration_adapted_typeItem = new SingleVariableDeclaration_adapted_typeItemImpl();
		return singleVariableDeclaration_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted_annotationsItem createSingleVariableDeclaration_adapted_annotationsItem() {
		SingleVariableDeclaration_adapted_annotationsItemImpl singleVariableDeclaration_adapted_annotationsItem = new SingleVariableDeclaration_adapted_annotationsItemImpl();
		return singleVariableDeclaration_adapted_annotationsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted_methodDeclarationItem createSingleVariableDeclaration_adapted_methodDeclarationItem() {
		SingleVariableDeclaration_adapted_methodDeclarationItemImpl singleVariableDeclaration_adapted_methodDeclarationItem = new SingleVariableDeclaration_adapted_methodDeclarationItemImpl();
		return singleVariableDeclaration_adapted_methodDeclarationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted_catchClauseItem createSingleVariableDeclaration_adapted_catchClauseItem() {
		SingleVariableDeclaration_adapted_catchClauseItemImpl singleVariableDeclaration_adapted_catchClauseItem = new SingleVariableDeclaration_adapted_catchClauseItemImpl();
		return singleVariableDeclaration_adapted_catchClauseItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleVariableDeclaration_adapted_enhancedForStatementItem createSingleVariableDeclaration_adapted_enhancedForStatementItem() {
		SingleVariableDeclaration_adapted_enhancedForStatementItemImpl singleVariableDeclaration_adapted_enhancedForStatementItem = new SingleVariableDeclaration_adapted_enhancedForStatementItemImpl();
		return singleVariableDeclaration_adapted_enhancedForStatementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral_adapted_escapedValueValue createStringLiteral_adapted_escapedValueValue() {
		StringLiteral_adapted_escapedValueValueImpl stringLiteral_adapted_escapedValueValue = new StringLiteral_adapted_escapedValueValueImpl();
		return stringLiteral_adapted_escapedValueValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperConstructorInvocation_adapted_expressionItem createSuperConstructorInvocation_adapted_expressionItem() {
		SuperConstructorInvocation_adapted_expressionItemImpl superConstructorInvocation_adapted_expressionItem = new SuperConstructorInvocation_adapted_expressionItemImpl();
		return superConstructorInvocation_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperFieldAccess_adapted_fieldItem createSuperFieldAccess_adapted_fieldItem() {
		SuperFieldAccess_adapted_fieldItemImpl superFieldAccess_adapted_fieldItem = new SuperFieldAccess_adapted_fieldItemImpl();
		return superFieldAccess_adapted_fieldItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchCase_adapted_defaultValue createSwitchCase_adapted_defaultValue() {
		SwitchCase_adapted_defaultValueImpl switchCase_adapted_defaultValue = new SwitchCase_adapted_defaultValueImpl();
		return switchCase_adapted_defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchCase_adapted_expressionItem createSwitchCase_adapted_expressionItem() {
		SwitchCase_adapted_expressionItemImpl switchCase_adapted_expressionItem = new SwitchCase_adapted_expressionItemImpl();
		return switchCase_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchStatement_adapted_expressionItem createSwitchStatement_adapted_expressionItem() {
		SwitchStatement_adapted_expressionItemImpl switchStatement_adapted_expressionItem = new SwitchStatement_adapted_expressionItemImpl();
		return switchStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwitchStatement_adapted_statementsItem createSwitchStatement_adapted_statementsItem() {
		SwitchStatement_adapted_statementsItemImpl switchStatement_adapted_statementsItem = new SwitchStatement_adapted_statementsItemImpl();
		return switchStatement_adapted_statementsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronizedStatement_adapted_bodyItem createSynchronizedStatement_adapted_bodyItem() {
		SynchronizedStatement_adapted_bodyItemImpl synchronizedStatement_adapted_bodyItem = new SynchronizedStatement_adapted_bodyItemImpl();
		return synchronizedStatement_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SynchronizedStatement_adapted_expressionItem createSynchronizedStatement_adapted_expressionItem() {
		SynchronizedStatement_adapted_expressionItemImpl synchronizedStatement_adapted_expressionItem = new SynchronizedStatement_adapted_expressionItemImpl();
		return synchronizedStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagElement_adapted_tagNameValue createTagElement_adapted_tagNameValue() {
		TagElement_adapted_tagNameValueImpl tagElement_adapted_tagNameValue = new TagElement_adapted_tagNameValueImpl();
		return tagElement_adapted_tagNameValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagElement_adapted_fragmentsItem createTagElement_adapted_fragmentsItem() {
		TagElement_adapted_fragmentsItemImpl tagElement_adapted_fragmentsItem = new TagElement_adapted_fragmentsItemImpl();
		return tagElement_adapted_fragmentsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextElement_adapted_textValue createTextElement_adapted_textValue() {
		TextElement_adapted_textValueImpl textElement_adapted_textValue = new TextElement_adapted_textValueImpl();
		return textElement_adapted_textValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThrowStatement_adapted_expressionItem createThrowStatement_adapted_expressionItem() {
		ThrowStatement_adapted_expressionItemImpl throwStatement_adapted_expressionItem = new ThrowStatement_adapted_expressionItemImpl();
		return throwStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryStatement_adapted_bodyItem createTryStatement_adapted_bodyItem() {
		TryStatement_adapted_bodyItemImpl tryStatement_adapted_bodyItem = new TryStatement_adapted_bodyItemImpl();
		return tryStatement_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryStatement_adapted_finallyItem createTryStatement_adapted_finallyItem() {
		TryStatement_adapted_finallyItemImpl tryStatement_adapted_finallyItem = new TryStatement_adapted_finallyItemImpl();
		return tryStatement_adapted_finallyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TryStatement_adapted_catchClausesItem createTryStatement_adapted_catchClausesItem() {
		TryStatement_adapted_catchClausesItemImpl tryStatement_adapted_catchClausesItem = new TryStatement_adapted_catchClausesItemImpl();
		return tryStatement_adapted_catchClausesItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type_adapted_usagesInTypeAccessItem createType_adapted_usagesInTypeAccessItem() {
		Type_adapted_usagesInTypeAccessItemImpl type_adapted_usagesInTypeAccessItem = new Type_adapted_usagesInTypeAccessItemImpl();
		return type_adapted_usagesInTypeAccessItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted_typeItem createTypeAccess_adapted_typeItem() {
		TypeAccess_adapted_typeItemImpl typeAccess_adapted_typeItem = new TypeAccess_adapted_typeItemImpl();
		return typeAccess_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeAccess_adapted_qualifierItem createTypeAccess_adapted_qualifierItem() {
		TypeAccess_adapted_qualifierItemImpl typeAccess_adapted_qualifierItem = new TypeAccess_adapted_qualifierItemImpl();
		return typeAccess_adapted_qualifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeclaration_adapted_typeParametersItem createTypeDeclaration_adapted_typeParametersItem() {
		TypeDeclaration_adapted_typeParametersItemImpl typeDeclaration_adapted_typeParametersItem = new TypeDeclaration_adapted_typeParametersItemImpl();
		return typeDeclaration_adapted_typeParametersItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeDeclarationStatement_adapted_declarationItem createTypeDeclarationStatement_adapted_declarationItem() {
		TypeDeclarationStatement_adapted_declarationItemImpl typeDeclarationStatement_adapted_declarationItem = new TypeDeclarationStatement_adapted_declarationItemImpl();
		return typeDeclarationStatement_adapted_declarationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeLiteral_adapted_typeItem createTypeLiteral_adapted_typeItem() {
		TypeLiteral_adapted_typeItemImpl typeLiteral_adapted_typeItem = new TypeLiteral_adapted_typeItemImpl();
		return typeLiteral_adapted_typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeParameter_adapted_boundsItem createTypeParameter_adapted_boundsItem() {
		TypeParameter_adapted_boundsItemImpl typeParameter_adapted_boundsItem = new TypeParameter_adapted_boundsItemImpl();
		return typeParameter_adapted_boundsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItemAccess_adapted_elementItem createUnresolvedItemAccess_adapted_elementItem() {
		UnresolvedItemAccess_adapted_elementItemImpl unresolvedItemAccess_adapted_elementItem = new UnresolvedItemAccess_adapted_elementItemImpl();
		return unresolvedItemAccess_adapted_elementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnresolvedItemAccess_adapted_qualifierItem createUnresolvedItemAccess_adapted_qualifierItem() {
		UnresolvedItemAccess_adapted_qualifierItemImpl unresolvedItemAccess_adapted_qualifierItem = new UnresolvedItemAccess_adapted_qualifierItemImpl();
		return unresolvedItemAccess_adapted_qualifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration_adapted_extraArrayDimensionsValue createVariableDeclaration_adapted_extraArrayDimensionsValue() {
		VariableDeclaration_adapted_extraArrayDimensionsValueImpl variableDeclaration_adapted_extraArrayDimensionsValue = new VariableDeclaration_adapted_extraArrayDimensionsValueImpl();
		return variableDeclaration_adapted_extraArrayDimensionsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration_adapted_initializerItem createVariableDeclaration_adapted_initializerItem() {
		VariableDeclaration_adapted_initializerItemImpl variableDeclaration_adapted_initializerItem = new VariableDeclaration_adapted_initializerItemImpl();
		return variableDeclaration_adapted_initializerItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclaration_adapted_usageInVariableAccessItem createVariableDeclaration_adapted_usageInVariableAccessItem() {
		VariableDeclaration_adapted_usageInVariableAccessItemImpl variableDeclaration_adapted_usageInVariableAccessItem = new VariableDeclaration_adapted_usageInVariableAccessItemImpl();
		return variableDeclaration_adapted_usageInVariableAccessItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationExpression_adapted_modifierItem createVariableDeclarationExpression_adapted_modifierItem() {
		VariableDeclarationExpression_adapted_modifierItemImpl variableDeclarationExpression_adapted_modifierItem = new VariableDeclarationExpression_adapted_modifierItemImpl();
		return variableDeclarationExpression_adapted_modifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationExpression_adapted_annotationsItem createVariableDeclarationExpression_adapted_annotationsItem() {
		VariableDeclarationExpression_adapted_annotationsItemImpl variableDeclarationExpression_adapted_annotationsItem = new VariableDeclarationExpression_adapted_annotationsItemImpl();
		return variableDeclarationExpression_adapted_annotationsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationFragment_adapted_variablesContainerItem createVariableDeclarationFragment_adapted_variablesContainerItem() {
		VariableDeclarationFragment_adapted_variablesContainerItemImpl variableDeclarationFragment_adapted_variablesContainerItem = new VariableDeclarationFragment_adapted_variablesContainerItemImpl();
		return variableDeclarationFragment_adapted_variablesContainerItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationStatement_adapted_extraArrayDimensionsValue createVariableDeclarationStatement_adapted_extraArrayDimensionsValue() {
		VariableDeclarationStatement_adapted_extraArrayDimensionsValueImpl variableDeclarationStatement_adapted_extraArrayDimensionsValue = new VariableDeclarationStatement_adapted_extraArrayDimensionsValueImpl();
		return variableDeclarationStatement_adapted_extraArrayDimensionsValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationStatement_adapted_modifierItem createVariableDeclarationStatement_adapted_modifierItem() {
		VariableDeclarationStatement_adapted_modifierItemImpl variableDeclarationStatement_adapted_modifierItem = new VariableDeclarationStatement_adapted_modifierItemImpl();
		return variableDeclarationStatement_adapted_modifierItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableDeclarationStatement_adapted_annotationsItem createVariableDeclarationStatement_adapted_annotationsItem() {
		VariableDeclarationStatement_adapted_annotationsItemImpl variableDeclarationStatement_adapted_annotationsItem = new VariableDeclarationStatement_adapted_annotationsItemImpl();
		return variableDeclarationStatement_adapted_annotationsItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WildCardType_adapted_upperBoundValue createWildCardType_adapted_upperBoundValue() {
		WildCardType_adapted_upperBoundValueImpl wildCardType_adapted_upperBoundValue = new WildCardType_adapted_upperBoundValueImpl();
		return wildCardType_adapted_upperBoundValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WildCardType_adapted_boundItem createWildCardType_adapted_boundItem() {
		WildCardType_adapted_boundItemImpl wildCardType_adapted_boundItem = new WildCardType_adapted_boundItemImpl();
		return wildCardType_adapted_boundItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement_adapted_expressionItem createWhileStatement_adapted_expressionItem() {
		WhileStatement_adapted_expressionItemImpl whileStatement_adapted_expressionItem = new WhileStatement_adapted_expressionItemImpl();
		return whileStatement_adapted_expressionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhileStatement_adapted_bodyItem createWhileStatement_adapted_bodyItem() {
		WhileStatement_adapted_bodyItemImpl whileStatement_adapted_bodyItem = new WhileStatement_adapted_bodyItemImpl();
		return whileStatement_adapted_bodyItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Java_adaptedPackage getJava_adaptedPackage() {
		return (Java_adaptedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Java_adaptedPackage getPackage() {
		return Java_adaptedPackage.eINSTANCE;
	}

} //Java_adaptedFactoryImpl
