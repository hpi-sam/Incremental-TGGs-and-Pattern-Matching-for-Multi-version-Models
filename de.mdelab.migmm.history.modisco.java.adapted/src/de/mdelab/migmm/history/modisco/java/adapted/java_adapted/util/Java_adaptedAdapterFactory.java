/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.util;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.ContainmentEdgeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;

import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage
 * @generated
 */
public class Java_adaptedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Java_adaptedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java_adaptedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Java_adaptedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Java_adaptedSwitch<Adapter> modelSwitch =
		new Java_adaptedSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractMethodDeclaration_adapted(AbstractMethodDeclaration_adapted object) {
				return createAbstractMethodDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseAbstractMethodInvocation_adapted(AbstractMethodInvocation_adapted object) {
				return createAbstractMethodInvocation_adaptedAdapter();
			}
			@Override
			public Adapter caseAbstractTypeDeclaration_adapted(AbstractTypeDeclaration_adapted object) {
				return createAbstractTypeDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseAbstractTypeQualifiedExpression_adapted(AbstractTypeQualifiedExpression_adapted object) {
				return createAbstractTypeQualifiedExpression_adaptedAdapter();
			}
			@Override
			public Adapter caseAbstractVariablesContainer_adapted(AbstractVariablesContainer_adapted object) {
				return createAbstractVariablesContainer_adaptedAdapter();
			}
			@Override
			public Adapter caseAnnotation_adapted(Annotation_adapted object) {
				return createAnnotation_adaptedAdapter();
			}
			@Override
			public Adapter caseArchive_adapted(Archive_adapted object) {
				return createArchive_adaptedAdapter();
			}
			@Override
			public Adapter caseAssertStatement_adapted(AssertStatement_adapted object) {
				return createAssertStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseASTNode_adapted(ASTNode_adapted object) {
				return createASTNode_adaptedAdapter();
			}
			@Override
			public Adapter caseAnnotationMemberValuePair_adapted(AnnotationMemberValuePair_adapted object) {
				return createAnnotationMemberValuePair_adaptedAdapter();
			}
			@Override
			public Adapter caseAnnotationTypeDeclaration_adapted(AnnotationTypeDeclaration_adapted object) {
				return createAnnotationTypeDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseAnnotationTypeMemberDeclaration_adapted(AnnotationTypeMemberDeclaration_adapted object) {
				return createAnnotationTypeMemberDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseAnonymousClassDeclaration_adapted(AnonymousClassDeclaration_adapted object) {
				return createAnonymousClassDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseArrayAccess_adapted(ArrayAccess_adapted object) {
				return createArrayAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseArrayCreation_adapted(ArrayCreation_adapted object) {
				return createArrayCreation_adaptedAdapter();
			}
			@Override
			public Adapter caseArrayInitializer_adapted(ArrayInitializer_adapted object) {
				return createArrayInitializer_adaptedAdapter();
			}
			@Override
			public Adapter caseArrayLengthAccess_adapted(ArrayLengthAccess_adapted object) {
				return createArrayLengthAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseArrayType_adapted(ArrayType_adapted object) {
				return createArrayType_adaptedAdapter();
			}
			@Override
			public Adapter caseAssignment_adapted(Assignment_adapted object) {
				return createAssignment_adaptedAdapter();
			}
			@Override
			public Adapter caseBodyDeclaration_adapted(BodyDeclaration_adapted object) {
				return createBodyDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral_adapted(BooleanLiteral_adapted object) {
				return createBooleanLiteral_adaptedAdapter();
			}
			@Override
			public Adapter caseBlockComment_adapted(BlockComment_adapted object) {
				return createBlockComment_adaptedAdapter();
			}
			@Override
			public Adapter caseBlock_adapted(Block_adapted object) {
				return createBlock_adaptedAdapter();
			}
			@Override
			public Adapter caseBreakStatement_adapted(BreakStatement_adapted object) {
				return createBreakStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseCastExpression_adapted(CastExpression_adapted object) {
				return createCastExpression_adaptedAdapter();
			}
			@Override
			public Adapter caseCatchClause_adapted(CatchClause_adapted object) {
				return createCatchClause_adaptedAdapter();
			}
			@Override
			public Adapter caseCharacterLiteral_adapted(CharacterLiteral_adapted object) {
				return createCharacterLiteral_adaptedAdapter();
			}
			@Override
			public Adapter caseClassFile_adapted(ClassFile_adapted object) {
				return createClassFile_adaptedAdapter();
			}
			@Override
			public Adapter caseClassInstanceCreation_adapted(ClassInstanceCreation_adapted object) {
				return createClassInstanceCreation_adaptedAdapter();
			}
			@Override
			public Adapter caseConstructorDeclaration_adapted(ConstructorDeclaration_adapted object) {
				return createConstructorDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseConditionalExpression_adapted(ConditionalExpression_adapted object) {
				return createConditionalExpression_adaptedAdapter();
			}
			@Override
			public Adapter caseConstructorInvocation_adapted(ConstructorInvocation_adapted object) {
				return createConstructorInvocation_adaptedAdapter();
			}
			@Override
			public Adapter caseClassDeclaration_adapted(ClassDeclaration_adapted object) {
				return createClassDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseComment_adapted(Comment_adapted object) {
				return createComment_adaptedAdapter();
			}
			@Override
			public Adapter caseCompilationUnit_adapted(CompilationUnit_adapted object) {
				return createCompilationUnit_adaptedAdapter();
			}
			@Override
			public Adapter caseContinueStatement_adapted(ContinueStatement_adapted object) {
				return createContinueStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseDoStatement_adapted(DoStatement_adapted object) {
				return createDoStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseEmptyStatement_adapted(EmptyStatement_adapted object) {
				return createEmptyStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseEnhancedForStatement_adapted(EnhancedForStatement_adapted object) {
				return createEnhancedForStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseEnumConstantDeclaration_adapted(EnumConstantDeclaration_adapted object) {
				return createEnumConstantDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseEnumDeclaration_adapted(EnumDeclaration_adapted object) {
				return createEnumDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseExpression_adapted(Expression_adapted object) {
				return createExpression_adaptedAdapter();
			}
			@Override
			public Adapter caseExpressionStatement_adapted(ExpressionStatement_adapted object) {
				return createExpressionStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseFieldAccess_adapted(FieldAccess_adapted object) {
				return createFieldAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseFieldDeclaration_adapted(FieldDeclaration_adapted object) {
				return createFieldDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseForStatement_adapted(ForStatement_adapted object) {
				return createForStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseIfStatement_adapted(IfStatement_adapted object) {
				return createIfStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseImportDeclaration_adapted(ImportDeclaration_adapted object) {
				return createImportDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseInfixExpression_adapted(InfixExpression_adapted object) {
				return createInfixExpression_adaptedAdapter();
			}
			@Override
			public Adapter caseInitializer_adapted(Initializer_adapted object) {
				return createInitializer_adaptedAdapter();
			}
			@Override
			public Adapter caseInstanceofExpression_adapted(InstanceofExpression_adapted object) {
				return createInstanceofExpression_adaptedAdapter();
			}
			@Override
			public Adapter caseInterfaceDeclaration_adapted(InterfaceDeclaration_adapted object) {
				return createInterfaceDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseJavadoc_adapted(Javadoc_adapted object) {
				return createJavadoc_adaptedAdapter();
			}
			@Override
			public Adapter caseLabeledStatement_adapted(LabeledStatement_adapted object) {
				return createLabeledStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseLineComment_adapted(LineComment_adapted object) {
				return createLineComment_adaptedAdapter();
			}
			@Override
			public Adapter caseManifest_adapted(Manifest_adapted object) {
				return createManifest_adaptedAdapter();
			}
			@Override
			public Adapter caseManifestAttribute_adapted(ManifestAttribute_adapted object) {
				return createManifestAttribute_adaptedAdapter();
			}
			@Override
			public Adapter caseManifestEntry_adapted(ManifestEntry_adapted object) {
				return createManifestEntry_adaptedAdapter();
			}
			@Override
			public Adapter caseMemberRef_adapted(MemberRef_adapted object) {
				return createMemberRef_adaptedAdapter();
			}
			@Override
			public Adapter caseMethodDeclaration_adapted(MethodDeclaration_adapted object) {
				return createMethodDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseMethodInvocation_adapted(MethodInvocation_adapted object) {
				return createMethodInvocation_adaptedAdapter();
			}
			@Override
			public Adapter caseMethodRef_adapted(MethodRef_adapted object) {
				return createMethodRef_adaptedAdapter();
			}
			@Override
			public Adapter caseMethodRefParameter_adapted(MethodRefParameter_adapted object) {
				return createMethodRefParameter_adaptedAdapter();
			}
			@Override
			public Adapter caseModel_adapted(Model_adapted object) {
				return createModel_adaptedAdapter();
			}
			@Override
			public Adapter caseModifier_adapted(Modifier_adapted object) {
				return createModifier_adaptedAdapter();
			}
			@Override
			public Adapter caseNamedElement_adapted(NamedElement_adapted object) {
				return createNamedElement_adaptedAdapter();
			}
			@Override
			public Adapter caseNamespaceAccess_adapted(NamespaceAccess_adapted object) {
				return createNamespaceAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseNumberLiteral_adapted(NumberLiteral_adapted object) {
				return createNumberLiteral_adaptedAdapter();
			}
			@Override
			public Adapter caseNullLiteral_adapted(NullLiteral_adapted object) {
				return createNullLiteral_adaptedAdapter();
			}
			@Override
			public Adapter casePackage_adapted(Package_adapted object) {
				return createPackage_adaptedAdapter();
			}
			@Override
			public Adapter casePackageAccess_adapted(PackageAccess_adapted object) {
				return createPackageAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseParameterizedType_adapted(ParameterizedType_adapted object) {
				return createParameterizedType_adaptedAdapter();
			}
			@Override
			public Adapter caseParenthesizedExpression_adapted(ParenthesizedExpression_adapted object) {
				return createParenthesizedExpression_adaptedAdapter();
			}
			@Override
			public Adapter casePostfixExpression_adapted(PostfixExpression_adapted object) {
				return createPostfixExpression_adaptedAdapter();
			}
			@Override
			public Adapter casePrefixExpression_adapted(PrefixExpression_adapted object) {
				return createPrefixExpression_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveType_adapted(PrimitiveType_adapted object) {
				return createPrimitiveType_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeBoolean_adapted(PrimitiveTypeBoolean_adapted object) {
				return createPrimitiveTypeBoolean_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeByte_adapted(PrimitiveTypeByte_adapted object) {
				return createPrimitiveTypeByte_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeChar_adapted(PrimitiveTypeChar_adapted object) {
				return createPrimitiveTypeChar_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeDouble_adapted(PrimitiveTypeDouble_adapted object) {
				return createPrimitiveTypeDouble_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeShort_adapted(PrimitiveTypeShort_adapted object) {
				return createPrimitiveTypeShort_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeFloat_adapted(PrimitiveTypeFloat_adapted object) {
				return createPrimitiveTypeFloat_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeInt_adapted(PrimitiveTypeInt_adapted object) {
				return createPrimitiveTypeInt_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeLong_adapted(PrimitiveTypeLong_adapted object) {
				return createPrimitiveTypeLong_adaptedAdapter();
			}
			@Override
			public Adapter casePrimitiveTypeVoid_adapted(PrimitiveTypeVoid_adapted object) {
				return createPrimitiveTypeVoid_adaptedAdapter();
			}
			@Override
			public Adapter caseReturnStatement_adapted(ReturnStatement_adapted object) {
				return createReturnStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseSingleVariableAccess_adapted(SingleVariableAccess_adapted object) {
				return createSingleVariableAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration_adapted(SingleVariableDeclaration_adapted object) {
				return createSingleVariableDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseStatement_adapted(Statement_adapted object) {
				return createStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseStringLiteral_adapted(StringLiteral_adapted object) {
				return createStringLiteral_adaptedAdapter();
			}
			@Override
			public Adapter caseSuperConstructorInvocation_adapted(SuperConstructorInvocation_adapted object) {
				return createSuperConstructorInvocation_adaptedAdapter();
			}
			@Override
			public Adapter caseSuperFieldAccess_adapted(SuperFieldAccess_adapted object) {
				return createSuperFieldAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseSuperMethodInvocation_adapted(SuperMethodInvocation_adapted object) {
				return createSuperMethodInvocation_adaptedAdapter();
			}
			@Override
			public Adapter caseSwitchCase_adapted(SwitchCase_adapted object) {
				return createSwitchCase_adaptedAdapter();
			}
			@Override
			public Adapter caseSwitchStatement_adapted(SwitchStatement_adapted object) {
				return createSwitchStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseSynchronizedStatement_adapted(SynchronizedStatement_adapted object) {
				return createSynchronizedStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseTagElement_adapted(TagElement_adapted object) {
				return createTagElement_adaptedAdapter();
			}
			@Override
			public Adapter caseTextElement_adapted(TextElement_adapted object) {
				return createTextElement_adaptedAdapter();
			}
			@Override
			public Adapter caseThisExpression_adapted(ThisExpression_adapted object) {
				return createThisExpression_adaptedAdapter();
			}
			@Override
			public Adapter caseThrowStatement_adapted(ThrowStatement_adapted object) {
				return createThrowStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseTryStatement_adapted(TryStatement_adapted object) {
				return createTryStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseType_adapted(Type_adapted object) {
				return createType_adaptedAdapter();
			}
			@Override
			public Adapter caseTypeAccess_adapted(TypeAccess_adapted object) {
				return createTypeAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseTypeDeclaration_adapted(TypeDeclaration_adapted object) {
				return createTypeDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseTypeDeclarationStatement_adapted(TypeDeclarationStatement_adapted object) {
				return createTypeDeclarationStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseTypeLiteral_adapted(TypeLiteral_adapted object) {
				return createTypeLiteral_adaptedAdapter();
			}
			@Override
			public Adapter caseTypeParameter_adapted(TypeParameter_adapted object) {
				return createTypeParameter_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedItem_adapted(UnresolvedItem_adapted object) {
				return createUnresolvedItem_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedItemAccess_adapted(UnresolvedItemAccess_adapted object) {
				return createUnresolvedItemAccess_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedAnnotationDeclaration_adapted(UnresolvedAnnotationDeclaration_adapted object) {
				return createUnresolvedAnnotationDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedAnnotationTypeMemberDeclaration_adapted(UnresolvedAnnotationTypeMemberDeclaration_adapted object) {
				return createUnresolvedAnnotationTypeMemberDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedClassDeclaration_adapted(UnresolvedClassDeclaration_adapted object) {
				return createUnresolvedClassDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedEnumDeclaration_adapted(UnresolvedEnumDeclaration_adapted object) {
				return createUnresolvedEnumDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedInterfaceDeclaration_adapted(UnresolvedInterfaceDeclaration_adapted object) {
				return createUnresolvedInterfaceDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedLabeledStatement_adapted(UnresolvedLabeledStatement_adapted object) {
				return createUnresolvedLabeledStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedMethodDeclaration_adapted(UnresolvedMethodDeclaration_adapted object) {
				return createUnresolvedMethodDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedSingleVariableDeclaration_adapted(UnresolvedSingleVariableDeclaration_adapted object) {
				return createUnresolvedSingleVariableDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedType_adapted(UnresolvedType_adapted object) {
				return createUnresolvedType_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedTypeDeclaration_adapted(UnresolvedTypeDeclaration_adapted object) {
				return createUnresolvedTypeDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseUnresolvedVariableDeclarationFragment_adapted(UnresolvedVariableDeclarationFragment_adapted object) {
				return createUnresolvedVariableDeclarationFragment_adaptedAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration_adapted(VariableDeclaration_adapted object) {
				return createVariableDeclaration_adaptedAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationExpression_adapted(VariableDeclarationExpression_adapted object) {
				return createVariableDeclarationExpression_adaptedAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationFragment_adapted(VariableDeclarationFragment_adapted object) {
				return createVariableDeclarationFragment_adaptedAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationStatement_adapted(VariableDeclarationStatement_adapted object) {
				return createVariableDeclarationStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseWildCardType_adapted(WildCardType_adapted object) {
				return createWildCardType_adaptedAdapter();
			}
			@Override
			public Adapter caseWhileStatement_adapted(WhileStatement_adapted object) {
				return createWhileStatement_adaptedAdapter();
			}
			@Override
			public Adapter caseAbstractMethodDeclaration_adapted_bodyItem(AbstractMethodDeclaration_adapted_bodyItem object) {
				return createAbstractMethodDeclaration_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseAbstractMethodDeclaration_adapted_parametersItem(AbstractMethodDeclaration_adapted_parametersItem object) {
				return createAbstractMethodDeclaration_adapted_parametersItemAdapter();
			}
			@Override
			public Adapter caseAbstractMethodDeclaration_adapted_thrownExceptionsItem(AbstractMethodDeclaration_adapted_thrownExceptionsItem object) {
				return createAbstractMethodDeclaration_adapted_thrownExceptionsItemAdapter();
			}
			@Override
			public Adapter caseAbstractMethodDeclaration_adapted_typeParametersItem(AbstractMethodDeclaration_adapted_typeParametersItem object) {
				return createAbstractMethodDeclaration_adapted_typeParametersItemAdapter();
			}
			@Override
			public Adapter caseAbstractMethodDeclaration_adapted_usagesInDocCommentsItem(AbstractMethodDeclaration_adapted_usagesInDocCommentsItem object) {
				return createAbstractMethodDeclaration_adapted_usagesInDocCommentsItemAdapter();
			}
			@Override
			public Adapter caseAbstractMethodDeclaration_adapted_usagesItem(AbstractMethodDeclaration_adapted_usagesItem object) {
				return createAbstractMethodDeclaration_adapted_usagesItemAdapter();
			}
			@Override
			public Adapter caseAbstractMethodInvocation_adapted_methodItem(AbstractMethodInvocation_adapted_methodItem object) {
				return createAbstractMethodInvocation_adapted_methodItemAdapter();
			}
			@Override
			public Adapter caseAbstractMethodInvocation_adapted_argumentsItem(AbstractMethodInvocation_adapted_argumentsItem object) {
				return createAbstractMethodInvocation_adapted_argumentsItemAdapter();
			}
			@Override
			public Adapter caseAbstractMethodInvocation_adapted_typeArgumentsItem(AbstractMethodInvocation_adapted_typeArgumentsItem object) {
				return createAbstractMethodInvocation_adapted_typeArgumentsItemAdapter();
			}
			@Override
			public Adapter caseAbstractTypeDeclaration_adapted_bodyDeclarationsItem(AbstractTypeDeclaration_adapted_bodyDeclarationsItem object) {
				return createAbstractTypeDeclaration_adapted_bodyDeclarationsItemAdapter();
			}
			@Override
			public Adapter caseAbstractTypeDeclaration_adapted_commentsBeforeBodyItem(AbstractTypeDeclaration_adapted_commentsBeforeBodyItem object) {
				return createAbstractTypeDeclaration_adapted_commentsBeforeBodyItemAdapter();
			}
			@Override
			public Adapter caseAbstractTypeDeclaration_adapted_commentsAfterBodyItem(AbstractTypeDeclaration_adapted_commentsAfterBodyItem object) {
				return createAbstractTypeDeclaration_adapted_commentsAfterBodyItemAdapter();
			}
			@Override
			public Adapter caseAbstractTypeDeclaration_adapted_packageItem(AbstractTypeDeclaration_adapted_packageItem object) {
				return createAbstractTypeDeclaration_adapted_packageItemAdapter();
			}
			@Override
			public Adapter caseAbstractTypeDeclaration_adapted_superInterfacesItem(AbstractTypeDeclaration_adapted_superInterfacesItem object) {
				return createAbstractTypeDeclaration_adapted_superInterfacesItemAdapter();
			}
			@Override
			public Adapter caseAbstractTypeQualifiedExpression_adapted_qualifierItem(AbstractTypeQualifiedExpression_adapted_qualifierItem object) {
				return createAbstractTypeQualifiedExpression_adapted_qualifierItemAdapter();
			}
			@Override
			public Adapter caseAbstractVariablesContainer_adapted_typeItem(AbstractVariablesContainer_adapted_typeItem object) {
				return createAbstractVariablesContainer_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseAbstractVariablesContainer_adapted_fragmentsItem(AbstractVariablesContainer_adapted_fragmentsItem object) {
				return createAbstractVariablesContainer_adapted_fragmentsItemAdapter();
			}
			@Override
			public Adapter caseAnnotation_adapted_typeItem(Annotation_adapted_typeItem object) {
				return createAnnotation_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseAnnotation_adapted_valuesItem(Annotation_adapted_valuesItem object) {
				return createAnnotation_adapted_valuesItemAdapter();
			}
			@Override
			public Adapter caseArchive_adapted_originalFilePathValue(Archive_adapted_originalFilePathValue object) {
				return createArchive_adapted_originalFilePathValueAdapter();
			}
			@Override
			public Adapter caseArchive_adapted_classFilesItem(Archive_adapted_classFilesItem object) {
				return createArchive_adapted_classFilesItemAdapter();
			}
			@Override
			public Adapter caseArchive_adapted_manifestItem(Archive_adapted_manifestItem object) {
				return createArchive_adapted_manifestItemAdapter();
			}
			@Override
			public Adapter caseAssertStatement_adapted_messageItem(AssertStatement_adapted_messageItem object) {
				return createAssertStatement_adapted_messageItemAdapter();
			}
			@Override
			public Adapter caseAssertStatement_adapted_expressionItem(AssertStatement_adapted_expressionItem object) {
				return createAssertStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseASTNode_adapted_commentsItem(ASTNode_adapted_commentsItem object) {
				return createASTNode_adapted_commentsItemAdapter();
			}
			@Override
			public Adapter caseASTNode_adapted_originalCompilationUnitItem(ASTNode_adapted_originalCompilationUnitItem object) {
				return createASTNode_adapted_originalCompilationUnitItemAdapter();
			}
			@Override
			public Adapter caseASTNode_adapted_originalClassFileItem(ASTNode_adapted_originalClassFileItem object) {
				return createASTNode_adapted_originalClassFileItemAdapter();
			}
			@Override
			public Adapter caseAnnotationMemberValuePair_adapted_memberItem(AnnotationMemberValuePair_adapted_memberItem object) {
				return createAnnotationMemberValuePair_adapted_memberItemAdapter();
			}
			@Override
			public Adapter caseAnnotationMemberValuePair_adapted_valueItem(AnnotationMemberValuePair_adapted_valueItem object) {
				return createAnnotationMemberValuePair_adapted_valueItemAdapter();
			}
			@Override
			public Adapter caseAnnotationTypeMemberDeclaration_adapted_defaultItem(AnnotationTypeMemberDeclaration_adapted_defaultItem object) {
				return createAnnotationTypeMemberDeclaration_adapted_defaultItemAdapter();
			}
			@Override
			public Adapter caseAnnotationTypeMemberDeclaration_adapted_typeItem(AnnotationTypeMemberDeclaration_adapted_typeItem object) {
				return createAnnotationTypeMemberDeclaration_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseAnnotationTypeMemberDeclaration_adapted_usagesItem(AnnotationTypeMemberDeclaration_adapted_usagesItem object) {
				return createAnnotationTypeMemberDeclaration_adapted_usagesItemAdapter();
			}
			@Override
			public Adapter caseAnonymousClassDeclaration_adapted_bodyDeclarationsItem(AnonymousClassDeclaration_adapted_bodyDeclarationsItem object) {
				return createAnonymousClassDeclaration_adapted_bodyDeclarationsItemAdapter();
			}
			@Override
			public Adapter caseAnonymousClassDeclaration_adapted_classInstanceCreationItem(AnonymousClassDeclaration_adapted_classInstanceCreationItem object) {
				return createAnonymousClassDeclaration_adapted_classInstanceCreationItemAdapter();
			}
			@Override
			public Adapter caseArrayAccess_adapted_arrayItem(ArrayAccess_adapted_arrayItem object) {
				return createArrayAccess_adapted_arrayItemAdapter();
			}
			@Override
			public Adapter caseArrayAccess_adapted_indexItem(ArrayAccess_adapted_indexItem object) {
				return createArrayAccess_adapted_indexItemAdapter();
			}
			@Override
			public Adapter caseArrayCreation_adapted_dimensionsItem(ArrayCreation_adapted_dimensionsItem object) {
				return createArrayCreation_adapted_dimensionsItemAdapter();
			}
			@Override
			public Adapter caseArrayCreation_adapted_initializerItem(ArrayCreation_adapted_initializerItem object) {
				return createArrayCreation_adapted_initializerItemAdapter();
			}
			@Override
			public Adapter caseArrayCreation_adapted_typeItem(ArrayCreation_adapted_typeItem object) {
				return createArrayCreation_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseArrayInitializer_adapted_expressionsItem(ArrayInitializer_adapted_expressionsItem object) {
				return createArrayInitializer_adapted_expressionsItemAdapter();
			}
			@Override
			public Adapter caseArrayLengthAccess_adapted_arrayItem(ArrayLengthAccess_adapted_arrayItem object) {
				return createArrayLengthAccess_adapted_arrayItemAdapter();
			}
			@Override
			public Adapter caseArrayType_adapted_dimensionsValue(ArrayType_adapted_dimensionsValue object) {
				return createArrayType_adapted_dimensionsValueAdapter();
			}
			@Override
			public Adapter caseArrayType_adapted_elementTypeItem(ArrayType_adapted_elementTypeItem object) {
				return createArrayType_adapted_elementTypeItemAdapter();
			}
			@Override
			public Adapter caseAssignment_adapted_leftHandSideItem(Assignment_adapted_leftHandSideItem object) {
				return createAssignment_adapted_leftHandSideItemAdapter();
			}
			@Override
			public Adapter caseAssignment_adapted_operatorValue(Assignment_adapted_operatorValue object) {
				return createAssignment_adapted_operatorValueAdapter();
			}
			@Override
			public Adapter caseAssignment_adapted_rightHandSideItem(Assignment_adapted_rightHandSideItem object) {
				return createAssignment_adapted_rightHandSideItemAdapter();
			}
			@Override
			public Adapter caseBodyDeclaration_adapted_abstractTypeDeclarationItem(BodyDeclaration_adapted_abstractTypeDeclarationItem object) {
				return createBodyDeclaration_adapted_abstractTypeDeclarationItemAdapter();
			}
			@Override
			public Adapter caseBodyDeclaration_adapted_annotationsItem(BodyDeclaration_adapted_annotationsItem object) {
				return createBodyDeclaration_adapted_annotationsItemAdapter();
			}
			@Override
			public Adapter caseBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem(BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem object) {
				return createBodyDeclaration_adapted_anonymousClassDeclarationOwnerItemAdapter();
			}
			@Override
			public Adapter caseBodyDeclaration_adapted_modifierItem(BodyDeclaration_adapted_modifierItem object) {
				return createBodyDeclaration_adapted_modifierItemAdapter();
			}
			@Override
			public Adapter caseBooleanLiteral_adapted_valueValue(BooleanLiteral_adapted_valueValue object) {
				return createBooleanLiteral_adapted_valueValueAdapter();
			}
			@Override
			public Adapter caseBlock_adapted_statementsItem(Block_adapted_statementsItem object) {
				return createBlock_adapted_statementsItemAdapter();
			}
			@Override
			public Adapter caseBreakStatement_adapted_labelItem(BreakStatement_adapted_labelItem object) {
				return createBreakStatement_adapted_labelItemAdapter();
			}
			@Override
			public Adapter caseCastExpression_adapted_expressionItem(CastExpression_adapted_expressionItem object) {
				return createCastExpression_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseCastExpression_adapted_typeItem(CastExpression_adapted_typeItem object) {
				return createCastExpression_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseCatchClause_adapted_exceptionItem(CatchClause_adapted_exceptionItem object) {
				return createCatchClause_adapted_exceptionItemAdapter();
			}
			@Override
			public Adapter caseCatchClause_adapted_bodyItem(CatchClause_adapted_bodyItem object) {
				return createCatchClause_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseCharacterLiteral_adapted_escapedValueValue(CharacterLiteral_adapted_escapedValueValue object) {
				return createCharacterLiteral_adapted_escapedValueValueAdapter();
			}
			@Override
			public Adapter caseClassFile_adapted_originalFilePathValue(ClassFile_adapted_originalFilePathValue object) {
				return createClassFile_adapted_originalFilePathValueAdapter();
			}
			@Override
			public Adapter caseClassFile_adapted_typeItem(ClassFile_adapted_typeItem object) {
				return createClassFile_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseClassFile_adapted_attachedSourceItem(ClassFile_adapted_attachedSourceItem object) {
				return createClassFile_adapted_attachedSourceItemAdapter();
			}
			@Override
			public Adapter caseClassFile_adapted_packageItem(ClassFile_adapted_packageItem object) {
				return createClassFile_adapted_packageItemAdapter();
			}
			@Override
			public Adapter caseClassInstanceCreation_adapted_anonymousClassDeclarationItem(ClassInstanceCreation_adapted_anonymousClassDeclarationItem object) {
				return createClassInstanceCreation_adapted_anonymousClassDeclarationItemAdapter();
			}
			@Override
			public Adapter caseClassInstanceCreation_adapted_expressionItem(ClassInstanceCreation_adapted_expressionItem object) {
				return createClassInstanceCreation_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseClassInstanceCreation_adapted_typeItem(ClassInstanceCreation_adapted_typeItem object) {
				return createClassInstanceCreation_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseConditionalExpression_adapted_elseExpressionItem(ConditionalExpression_adapted_elseExpressionItem object) {
				return createConditionalExpression_adapted_elseExpressionItemAdapter();
			}
			@Override
			public Adapter caseConditionalExpression_adapted_expressionItem(ConditionalExpression_adapted_expressionItem object) {
				return createConditionalExpression_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseConditionalExpression_adapted_thenExpressionItem(ConditionalExpression_adapted_thenExpressionItem object) {
				return createConditionalExpression_adapted_thenExpressionItemAdapter();
			}
			@Override
			public Adapter caseClassDeclaration_adapted_superClassItem(ClassDeclaration_adapted_superClassItem object) {
				return createClassDeclaration_adapted_superClassItemAdapter();
			}
			@Override
			public Adapter caseComment_adapted_contentValue(Comment_adapted_contentValue object) {
				return createComment_adapted_contentValueAdapter();
			}
			@Override
			public Adapter caseComment_adapted_enclosedByParentValue(Comment_adapted_enclosedByParentValue object) {
				return createComment_adapted_enclosedByParentValueAdapter();
			}
			@Override
			public Adapter caseComment_adapted_prefixOfParentValue(Comment_adapted_prefixOfParentValue object) {
				return createComment_adapted_prefixOfParentValueAdapter();
			}
			@Override
			public Adapter caseCompilationUnit_adapted_originalFilePathValue(CompilationUnit_adapted_originalFilePathValue object) {
				return createCompilationUnit_adapted_originalFilePathValueAdapter();
			}
			@Override
			public Adapter caseCompilationUnit_adapted_commentListItem(CompilationUnit_adapted_commentListItem object) {
				return createCompilationUnit_adapted_commentListItemAdapter();
			}
			@Override
			public Adapter caseCompilationUnit_adapted_importsItem(CompilationUnit_adapted_importsItem object) {
				return createCompilationUnit_adapted_importsItemAdapter();
			}
			@Override
			public Adapter caseCompilationUnit_adapted_packageItem(CompilationUnit_adapted_packageItem object) {
				return createCompilationUnit_adapted_packageItemAdapter();
			}
			@Override
			public Adapter caseCompilationUnit_adapted_typesItem(CompilationUnit_adapted_typesItem object) {
				return createCompilationUnit_adapted_typesItemAdapter();
			}
			@Override
			public Adapter caseContinueStatement_adapted_labelItem(ContinueStatement_adapted_labelItem object) {
				return createContinueStatement_adapted_labelItemAdapter();
			}
			@Override
			public Adapter caseDoStatement_adapted_expressionItem(DoStatement_adapted_expressionItem object) {
				return createDoStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseDoStatement_adapted_bodyItem(DoStatement_adapted_bodyItem object) {
				return createDoStatement_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseEnhancedForStatement_adapted_bodyItem(EnhancedForStatement_adapted_bodyItem object) {
				return createEnhancedForStatement_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseEnhancedForStatement_adapted_expressionItem(EnhancedForStatement_adapted_expressionItem object) {
				return createEnhancedForStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseEnhancedForStatement_adapted_parameterItem(EnhancedForStatement_adapted_parameterItem object) {
				return createEnhancedForStatement_adapted_parameterItemAdapter();
			}
			@Override
			public Adapter caseEnumConstantDeclaration_adapted_anonymousClassDeclarationItem(EnumConstantDeclaration_adapted_anonymousClassDeclarationItem object) {
				return createEnumConstantDeclaration_adapted_anonymousClassDeclarationItemAdapter();
			}
			@Override
			public Adapter caseEnumConstantDeclaration_adapted_argumentsItem(EnumConstantDeclaration_adapted_argumentsItem object) {
				return createEnumConstantDeclaration_adapted_argumentsItemAdapter();
			}
			@Override
			public Adapter caseEnumDeclaration_adapted_enumConstantsItem(EnumDeclaration_adapted_enumConstantsItem object) {
				return createEnumDeclaration_adapted_enumConstantsItemAdapter();
			}
			@Override
			public Adapter caseExpressionStatement_adapted_expressionItem(ExpressionStatement_adapted_expressionItem object) {
				return createExpressionStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseFieldAccess_adapted_fieldItem(FieldAccess_adapted_fieldItem object) {
				return createFieldAccess_adapted_fieldItemAdapter();
			}
			@Override
			public Adapter caseFieldAccess_adapted_expressionItem(FieldAccess_adapted_expressionItem object) {
				return createFieldAccess_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseForStatement_adapted_expressionItem(ForStatement_adapted_expressionItem object) {
				return createForStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseForStatement_adapted_updatersItem(ForStatement_adapted_updatersItem object) {
				return createForStatement_adapted_updatersItemAdapter();
			}
			@Override
			public Adapter caseForStatement_adapted_initializersItem(ForStatement_adapted_initializersItem object) {
				return createForStatement_adapted_initializersItemAdapter();
			}
			@Override
			public Adapter caseForStatement_adapted_bodyItem(ForStatement_adapted_bodyItem object) {
				return createForStatement_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseIfStatement_adapted_expressionItem(IfStatement_adapted_expressionItem object) {
				return createIfStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseIfStatement_adapted_thenStatementItem(IfStatement_adapted_thenStatementItem object) {
				return createIfStatement_adapted_thenStatementItemAdapter();
			}
			@Override
			public Adapter caseIfStatement_adapted_elseStatementItem(IfStatement_adapted_elseStatementItem object) {
				return createIfStatement_adapted_elseStatementItemAdapter();
			}
			@Override
			public Adapter caseImportDeclaration_adapted_staticValue(ImportDeclaration_adapted_staticValue object) {
				return createImportDeclaration_adapted_staticValueAdapter();
			}
			@Override
			public Adapter caseImportDeclaration_adapted_importedElementItem(ImportDeclaration_adapted_importedElementItem object) {
				return createImportDeclaration_adapted_importedElementItemAdapter();
			}
			@Override
			public Adapter caseInfixExpression_adapted_operatorValue(InfixExpression_adapted_operatorValue object) {
				return createInfixExpression_adapted_operatorValueAdapter();
			}
			@Override
			public Adapter caseInfixExpression_adapted_rightOperandItem(InfixExpression_adapted_rightOperandItem object) {
				return createInfixExpression_adapted_rightOperandItemAdapter();
			}
			@Override
			public Adapter caseInfixExpression_adapted_leftOperandItem(InfixExpression_adapted_leftOperandItem object) {
				return createInfixExpression_adapted_leftOperandItemAdapter();
			}
			@Override
			public Adapter caseInfixExpression_adapted_extendedOperandsItem(InfixExpression_adapted_extendedOperandsItem object) {
				return createInfixExpression_adapted_extendedOperandsItemAdapter();
			}
			@Override
			public Adapter caseInitializer_adapted_bodyItem(Initializer_adapted_bodyItem object) {
				return createInitializer_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseInstanceofExpression_adapted_rightOperandItem(InstanceofExpression_adapted_rightOperandItem object) {
				return createInstanceofExpression_adapted_rightOperandItemAdapter();
			}
			@Override
			public Adapter caseInstanceofExpression_adapted_leftOperandItem(InstanceofExpression_adapted_leftOperandItem object) {
				return createInstanceofExpression_adapted_leftOperandItemAdapter();
			}
			@Override
			public Adapter caseJavadoc_adapted_tagsItem(Javadoc_adapted_tagsItem object) {
				return createJavadoc_adapted_tagsItemAdapter();
			}
			@Override
			public Adapter caseLabeledStatement_adapted_bodyItem(LabeledStatement_adapted_bodyItem object) {
				return createLabeledStatement_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseLabeledStatement_adapted_usagesInBreakStatementsItem(LabeledStatement_adapted_usagesInBreakStatementsItem object) {
				return createLabeledStatement_adapted_usagesInBreakStatementsItemAdapter();
			}
			@Override
			public Adapter caseLabeledStatement_adapted_usagesInContinueStatementsItem(LabeledStatement_adapted_usagesInContinueStatementsItem object) {
				return createLabeledStatement_adapted_usagesInContinueStatementsItemAdapter();
			}
			@Override
			public Adapter caseManifest_adapted_mainAttributesItem(Manifest_adapted_mainAttributesItem object) {
				return createManifest_adapted_mainAttributesItemAdapter();
			}
			@Override
			public Adapter caseManifest_adapted_entryAttributesItem(Manifest_adapted_entryAttributesItem object) {
				return createManifest_adapted_entryAttributesItemAdapter();
			}
			@Override
			public Adapter caseManifestAttribute_adapted_keyValue(ManifestAttribute_adapted_keyValue object) {
				return createManifestAttribute_adapted_keyValueAdapter();
			}
			@Override
			public Adapter caseManifestAttribute_adapted_valueValue(ManifestAttribute_adapted_valueValue object) {
				return createManifestAttribute_adapted_valueValueAdapter();
			}
			@Override
			public Adapter caseManifestEntry_adapted_nameValue(ManifestEntry_adapted_nameValue object) {
				return createManifestEntry_adapted_nameValueAdapter();
			}
			@Override
			public Adapter caseManifestEntry_adapted_attributesItem(ManifestEntry_adapted_attributesItem object) {
				return createManifestEntry_adapted_attributesItemAdapter();
			}
			@Override
			public Adapter caseMemberRef_adapted_memberItem(MemberRef_adapted_memberItem object) {
				return createMemberRef_adapted_memberItemAdapter();
			}
			@Override
			public Adapter caseMemberRef_adapted_qualifierItem(MemberRef_adapted_qualifierItem object) {
				return createMemberRef_adapted_qualifierItemAdapter();
			}
			@Override
			public Adapter caseMethodDeclaration_adapted_extraArrayDimensionsValue(MethodDeclaration_adapted_extraArrayDimensionsValue object) {
				return createMethodDeclaration_adapted_extraArrayDimensionsValueAdapter();
			}
			@Override
			public Adapter caseMethodDeclaration_adapted_returnTypeItem(MethodDeclaration_adapted_returnTypeItem object) {
				return createMethodDeclaration_adapted_returnTypeItemAdapter();
			}
			@Override
			public Adapter caseMethodDeclaration_adapted_redefinedMethodDeclarationItem(MethodDeclaration_adapted_redefinedMethodDeclarationItem object) {
				return createMethodDeclaration_adapted_redefinedMethodDeclarationItemAdapter();
			}
			@Override
			public Adapter caseMethodDeclaration_adapted_redefinitionsItem(MethodDeclaration_adapted_redefinitionsItem object) {
				return createMethodDeclaration_adapted_redefinitionsItemAdapter();
			}
			@Override
			public Adapter caseMethodInvocation_adapted_expressionItem(MethodInvocation_adapted_expressionItem object) {
				return createMethodInvocation_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseMethodRef_adapted_methodItem(MethodRef_adapted_methodItem object) {
				return createMethodRef_adapted_methodItemAdapter();
			}
			@Override
			public Adapter caseMethodRef_adapted_qualifierItem(MethodRef_adapted_qualifierItem object) {
				return createMethodRef_adapted_qualifierItemAdapter();
			}
			@Override
			public Adapter caseMethodRef_adapted_parametersItem(MethodRef_adapted_parametersItem object) {
				return createMethodRef_adapted_parametersItemAdapter();
			}
			@Override
			public Adapter caseMethodRefParameter_adapted_nameValue(MethodRefParameter_adapted_nameValue object) {
				return createMethodRefParameter_adapted_nameValueAdapter();
			}
			@Override
			public Adapter caseMethodRefParameter_adapted_varargsValue(MethodRefParameter_adapted_varargsValue object) {
				return createMethodRefParameter_adapted_varargsValueAdapter();
			}
			@Override
			public Adapter caseMethodRefParameter_adapted_typeItem(MethodRefParameter_adapted_typeItem object) {
				return createMethodRefParameter_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseModel_adapted_nameValue(Model_adapted_nameValue object) {
				return createModel_adapted_nameValueAdapter();
			}
			@Override
			public Adapter caseModel_adapted_ownedElementsItem(Model_adapted_ownedElementsItem object) {
				return createModel_adapted_ownedElementsItemAdapter();
			}
			@Override
			public Adapter caseModel_adapted_orphanTypesItem(Model_adapted_orphanTypesItem object) {
				return createModel_adapted_orphanTypesItemAdapter();
			}
			@Override
			public Adapter caseModel_adapted_unresolvedItemsItem(Model_adapted_unresolvedItemsItem object) {
				return createModel_adapted_unresolvedItemsItemAdapter();
			}
			@Override
			public Adapter caseModel_adapted_compilationUnitsItem(Model_adapted_compilationUnitsItem object) {
				return createModel_adapted_compilationUnitsItemAdapter();
			}
			@Override
			public Adapter caseModel_adapted_classFilesItem(Model_adapted_classFilesItem object) {
				return createModel_adapted_classFilesItemAdapter();
			}
			@Override
			public Adapter caseModel_adapted_archivesItem(Model_adapted_archivesItem object) {
				return createModel_adapted_archivesItemAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_visibilityValue(Modifier_adapted_visibilityValue object) {
				return createModifier_adapted_visibilityValueAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_inheritanceValue(Modifier_adapted_inheritanceValue object) {
				return createModifier_adapted_inheritanceValueAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_staticValue(Modifier_adapted_staticValue object) {
				return createModifier_adapted_staticValueAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_transientValue(Modifier_adapted_transientValue object) {
				return createModifier_adapted_transientValueAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_volatileValue(Modifier_adapted_volatileValue object) {
				return createModifier_adapted_volatileValueAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_nativeValue(Modifier_adapted_nativeValue object) {
				return createModifier_adapted_nativeValueAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_strictfpValue(Modifier_adapted_strictfpValue object) {
				return createModifier_adapted_strictfpValueAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_synchronizedValue(Modifier_adapted_synchronizedValue object) {
				return createModifier_adapted_synchronizedValueAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_bodyDeclarationItem(Modifier_adapted_bodyDeclarationItem object) {
				return createModifier_adapted_bodyDeclarationItemAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_singleVariableDeclarationItem(Modifier_adapted_singleVariableDeclarationItem object) {
				return createModifier_adapted_singleVariableDeclarationItemAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_variableDeclarationStatementItem(Modifier_adapted_variableDeclarationStatementItem object) {
				return createModifier_adapted_variableDeclarationStatementItemAdapter();
			}
			@Override
			public Adapter caseModifier_adapted_variableDeclarationExpressionItem(Modifier_adapted_variableDeclarationExpressionItem object) {
				return createModifier_adapted_variableDeclarationExpressionItemAdapter();
			}
			@Override
			public Adapter caseNamedElement_adapted_nameValue(NamedElement_adapted_nameValue object) {
				return createNamedElement_adapted_nameValueAdapter();
			}
			@Override
			public Adapter caseNamedElement_adapted_proxyValue(NamedElement_adapted_proxyValue object) {
				return createNamedElement_adapted_proxyValueAdapter();
			}
			@Override
			public Adapter caseNamedElement_adapted_usagesInImportsItem(NamedElement_adapted_usagesInImportsItem object) {
				return createNamedElement_adapted_usagesInImportsItemAdapter();
			}
			@Override
			public Adapter caseNumberLiteral_adapted_tokenValueValue(NumberLiteral_adapted_tokenValueValue object) {
				return createNumberLiteral_adapted_tokenValueValueAdapter();
			}
			@Override
			public Adapter casePackage_adapted_ownedElementsItem(Package_adapted_ownedElementsItem object) {
				return createPackage_adapted_ownedElementsItemAdapter();
			}
			@Override
			public Adapter casePackage_adapted_modelItem(Package_adapted_modelItem object) {
				return createPackage_adapted_modelItemAdapter();
			}
			@Override
			public Adapter casePackage_adapted_ownedPackagesItem(Package_adapted_ownedPackagesItem object) {
				return createPackage_adapted_ownedPackagesItemAdapter();
			}
			@Override
			public Adapter casePackage_adapted_packageItem(Package_adapted_packageItem object) {
				return createPackage_adapted_packageItemAdapter();
			}
			@Override
			public Adapter casePackage_adapted_usagesInPackageAccessItem(Package_adapted_usagesInPackageAccessItem object) {
				return createPackage_adapted_usagesInPackageAccessItemAdapter();
			}
			@Override
			public Adapter casePackageAccess_adapted_packageItem(PackageAccess_adapted_packageItem object) {
				return createPackageAccess_adapted_packageItemAdapter();
			}
			@Override
			public Adapter casePackageAccess_adapted_qualifierItem(PackageAccess_adapted_qualifierItem object) {
				return createPackageAccess_adapted_qualifierItemAdapter();
			}
			@Override
			public Adapter caseParameterizedType_adapted_typeItem(ParameterizedType_adapted_typeItem object) {
				return createParameterizedType_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseParameterizedType_adapted_typeArgumentsItem(ParameterizedType_adapted_typeArgumentsItem object) {
				return createParameterizedType_adapted_typeArgumentsItemAdapter();
			}
			@Override
			public Adapter caseParenthesizedExpression_adapted_expressionItem(ParenthesizedExpression_adapted_expressionItem object) {
				return createParenthesizedExpression_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter casePostfixExpression_adapted_operatorValue(PostfixExpression_adapted_operatorValue object) {
				return createPostfixExpression_adapted_operatorValueAdapter();
			}
			@Override
			public Adapter casePostfixExpression_adapted_operandItem(PostfixExpression_adapted_operandItem object) {
				return createPostfixExpression_adapted_operandItemAdapter();
			}
			@Override
			public Adapter casePrefixExpression_adapted_operatorValue(PrefixExpression_adapted_operatorValue object) {
				return createPrefixExpression_adapted_operatorValueAdapter();
			}
			@Override
			public Adapter casePrefixExpression_adapted_operandItem(PrefixExpression_adapted_operandItem object) {
				return createPrefixExpression_adapted_operandItemAdapter();
			}
			@Override
			public Adapter caseReturnStatement_adapted_expressionItem(ReturnStatement_adapted_expressionItem object) {
				return createReturnStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseSingleVariableAccess_adapted_variableItem(SingleVariableAccess_adapted_variableItem object) {
				return createSingleVariableAccess_adapted_variableItemAdapter();
			}
			@Override
			public Adapter caseSingleVariableAccess_adapted_qualifierItem(SingleVariableAccess_adapted_qualifierItem object) {
				return createSingleVariableAccess_adapted_qualifierItemAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration_adapted_modifierItem(SingleVariableDeclaration_adapted_modifierItem object) {
				return createSingleVariableDeclaration_adapted_modifierItemAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration_adapted_varargsValue(SingleVariableDeclaration_adapted_varargsValue object) {
				return createSingleVariableDeclaration_adapted_varargsValueAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration_adapted_typeItem(SingleVariableDeclaration_adapted_typeItem object) {
				return createSingleVariableDeclaration_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration_adapted_annotationsItem(SingleVariableDeclaration_adapted_annotationsItem object) {
				return createSingleVariableDeclaration_adapted_annotationsItemAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration_adapted_methodDeclarationItem(SingleVariableDeclaration_adapted_methodDeclarationItem object) {
				return createSingleVariableDeclaration_adapted_methodDeclarationItemAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration_adapted_catchClauseItem(SingleVariableDeclaration_adapted_catchClauseItem object) {
				return createSingleVariableDeclaration_adapted_catchClauseItemAdapter();
			}
			@Override
			public Adapter caseSingleVariableDeclaration_adapted_enhancedForStatementItem(SingleVariableDeclaration_adapted_enhancedForStatementItem object) {
				return createSingleVariableDeclaration_adapted_enhancedForStatementItemAdapter();
			}
			@Override
			public Adapter caseStringLiteral_adapted_escapedValueValue(StringLiteral_adapted_escapedValueValue object) {
				return createStringLiteral_adapted_escapedValueValueAdapter();
			}
			@Override
			public Adapter caseSuperConstructorInvocation_adapted_expressionItem(SuperConstructorInvocation_adapted_expressionItem object) {
				return createSuperConstructorInvocation_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseSuperFieldAccess_adapted_fieldItem(SuperFieldAccess_adapted_fieldItem object) {
				return createSuperFieldAccess_adapted_fieldItemAdapter();
			}
			@Override
			public Adapter caseSwitchCase_adapted_defaultValue(SwitchCase_adapted_defaultValue object) {
				return createSwitchCase_adapted_defaultValueAdapter();
			}
			@Override
			public Adapter caseSwitchCase_adapted_expressionItem(SwitchCase_adapted_expressionItem object) {
				return createSwitchCase_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseSwitchStatement_adapted_expressionItem(SwitchStatement_adapted_expressionItem object) {
				return createSwitchStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseSwitchStatement_adapted_statementsItem(SwitchStatement_adapted_statementsItem object) {
				return createSwitchStatement_adapted_statementsItemAdapter();
			}
			@Override
			public Adapter caseSynchronizedStatement_adapted_bodyItem(SynchronizedStatement_adapted_bodyItem object) {
				return createSynchronizedStatement_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseSynchronizedStatement_adapted_expressionItem(SynchronizedStatement_adapted_expressionItem object) {
				return createSynchronizedStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseTagElement_adapted_tagNameValue(TagElement_adapted_tagNameValue object) {
				return createTagElement_adapted_tagNameValueAdapter();
			}
			@Override
			public Adapter caseTagElement_adapted_fragmentsItem(TagElement_adapted_fragmentsItem object) {
				return createTagElement_adapted_fragmentsItemAdapter();
			}
			@Override
			public Adapter caseTextElement_adapted_textValue(TextElement_adapted_textValue object) {
				return createTextElement_adapted_textValueAdapter();
			}
			@Override
			public Adapter caseThrowStatement_adapted_expressionItem(ThrowStatement_adapted_expressionItem object) {
				return createThrowStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseTryStatement_adapted_bodyItem(TryStatement_adapted_bodyItem object) {
				return createTryStatement_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseTryStatement_adapted_finallyItem(TryStatement_adapted_finallyItem object) {
				return createTryStatement_adapted_finallyItemAdapter();
			}
			@Override
			public Adapter caseTryStatement_adapted_catchClausesItem(TryStatement_adapted_catchClausesItem object) {
				return createTryStatement_adapted_catchClausesItemAdapter();
			}
			@Override
			public Adapter caseType_adapted_usagesInTypeAccessItem(Type_adapted_usagesInTypeAccessItem object) {
				return createType_adapted_usagesInTypeAccessItemAdapter();
			}
			@Override
			public Adapter caseTypeAccess_adapted_typeItem(TypeAccess_adapted_typeItem object) {
				return createTypeAccess_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseTypeAccess_adapted_qualifierItem(TypeAccess_adapted_qualifierItem object) {
				return createTypeAccess_adapted_qualifierItemAdapter();
			}
			@Override
			public Adapter caseTypeDeclaration_adapted_typeParametersItem(TypeDeclaration_adapted_typeParametersItem object) {
				return createTypeDeclaration_adapted_typeParametersItemAdapter();
			}
			@Override
			public Adapter caseTypeDeclarationStatement_adapted_declarationItem(TypeDeclarationStatement_adapted_declarationItem object) {
				return createTypeDeclarationStatement_adapted_declarationItemAdapter();
			}
			@Override
			public Adapter caseTypeLiteral_adapted_typeItem(TypeLiteral_adapted_typeItem object) {
				return createTypeLiteral_adapted_typeItemAdapter();
			}
			@Override
			public Adapter caseTypeParameter_adapted_boundsItem(TypeParameter_adapted_boundsItem object) {
				return createTypeParameter_adapted_boundsItemAdapter();
			}
			@Override
			public Adapter caseUnresolvedItemAccess_adapted_elementItem(UnresolvedItemAccess_adapted_elementItem object) {
				return createUnresolvedItemAccess_adapted_elementItemAdapter();
			}
			@Override
			public Adapter caseUnresolvedItemAccess_adapted_qualifierItem(UnresolvedItemAccess_adapted_qualifierItem object) {
				return createUnresolvedItemAccess_adapted_qualifierItemAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration_adapted_extraArrayDimensionsValue(VariableDeclaration_adapted_extraArrayDimensionsValue object) {
				return createVariableDeclaration_adapted_extraArrayDimensionsValueAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration_adapted_initializerItem(VariableDeclaration_adapted_initializerItem object) {
				return createVariableDeclaration_adapted_initializerItemAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration_adapted_usageInVariableAccessItem(VariableDeclaration_adapted_usageInVariableAccessItem object) {
				return createVariableDeclaration_adapted_usageInVariableAccessItemAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationExpression_adapted_modifierItem(VariableDeclarationExpression_adapted_modifierItem object) {
				return createVariableDeclarationExpression_adapted_modifierItemAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationExpression_adapted_annotationsItem(VariableDeclarationExpression_adapted_annotationsItem object) {
				return createVariableDeclarationExpression_adapted_annotationsItemAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationFragment_adapted_variablesContainerItem(VariableDeclarationFragment_adapted_variablesContainerItem object) {
				return createVariableDeclarationFragment_adapted_variablesContainerItemAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationStatement_adapted_extraArrayDimensionsValue(VariableDeclarationStatement_adapted_extraArrayDimensionsValue object) {
				return createVariableDeclarationStatement_adapted_extraArrayDimensionsValueAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationStatement_adapted_modifierItem(VariableDeclarationStatement_adapted_modifierItem object) {
				return createVariableDeclarationStatement_adapted_modifierItemAdapter();
			}
			@Override
			public Adapter caseVariableDeclarationStatement_adapted_annotationsItem(VariableDeclarationStatement_adapted_annotationsItem object) {
				return createVariableDeclarationStatement_adapted_annotationsItemAdapter();
			}
			@Override
			public Adapter caseWildCardType_adapted_upperBoundValue(WildCardType_adapted_upperBoundValue object) {
				return createWildCardType_adapted_upperBoundValueAdapter();
			}
			@Override
			public Adapter caseWildCardType_adapted_boundItem(WildCardType_adapted_boundItem object) {
				return createWildCardType_adapted_boundItemAdapter();
			}
			@Override
			public Adapter caseWhileStatement_adapted_expressionItem(WhileStatement_adapted_expressionItem object) {
				return createWhileStatement_adapted_expressionItemAdapter();
			}
			@Override
			public Adapter caseWhileStatement_adapted_bodyItem(WhileStatement_adapted_bodyItem object) {
				return createWhileStatement_adapted_bodyItemAdapter();
			}
			@Override
			public Adapter caseElementWithHistory(ElementWithHistory object) {
				return createElementWithHistoryAdapter();
			}
			@Override
			public Adapter caseNodeWithHistory(NodeWithHistory object) {
				return createNodeWithHistoryAdapter();
			}
			@Override
			public Adapter caseEdgeWithHistory(EdgeWithHistory object) {
				return createEdgeWithHistoryAdapter();
			}
			@Override
			public Adapter caseContainmentEdgeWithHistory(ContainmentEdgeWithHistory object) {
				return createContainmentEdgeWithHistoryAdapter();
			}
			@Override
			public Adapter caseAttributeWithHistory(AttributeWithHistory object) {
				return createAttributeWithHistoryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted <em>Abstract Method Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted
	 * @generated
	 */
	public Adapter createAbstractMethodDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted <em>Abstract Method Invocation adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted
	 * @generated
	 */
	public Adapter createAbstractMethodInvocation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted <em>Abstract Type Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted
	 * @generated
	 */
	public Adapter createAbstractTypeDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeQualifiedExpression_adapted <em>Abstract Type Qualified Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeQualifiedExpression_adapted
	 * @generated
	 */
	public Adapter createAbstractTypeQualifiedExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted <em>Abstract Variables Container adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted
	 * @generated
	 */
	public Adapter createAbstractVariablesContainer_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted <em>Annotation adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted
	 * @generated
	 */
	public Adapter createAnnotation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted <em>Archive adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted
	 * @generated
	 */
	public Adapter createArchive_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted <em>Assert Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted
	 * @generated
	 */
	public Adapter createAssertStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted <em>AST Node adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted
	 * @generated
	 */
	public Adapter createASTNode_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted <em>Annotation Member Value Pair adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted
	 * @generated
	 */
	public Adapter createAnnotationMemberValuePair_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeDeclaration_adapted <em>Annotation Type Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeDeclaration_adapted
	 * @generated
	 */
	public Adapter createAnnotationTypeDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted <em>Annotation Type Member Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted
	 * @generated
	 */
	public Adapter createAnnotationTypeMemberDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted <em>Anonymous Class Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted
	 * @generated
	 */
	public Adapter createAnonymousClassDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted <em>Array Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted
	 * @generated
	 */
	public Adapter createArrayAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted <em>Array Creation adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted
	 * @generated
	 */
	public Adapter createArrayCreation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayInitializer_adapted <em>Array Initializer adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayInitializer_adapted
	 * @generated
	 */
	public Adapter createArrayInitializer_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayLengthAccess_adapted <em>Array Length Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayLengthAccess_adapted
	 * @generated
	 */
	public Adapter createArrayLengthAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted <em>Array Type adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted
	 * @generated
	 */
	public Adapter createArrayType_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted <em>Assignment adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted
	 * @generated
	 */
	public Adapter createAssignment_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted <em>Body Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted
	 * @generated
	 */
	public Adapter createBodyDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BooleanLiteral_adapted <em>Boolean Literal adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BooleanLiteral_adapted
	 * @generated
	 */
	public Adapter createBooleanLiteral_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BlockComment_adapted <em>Block Comment adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BlockComment_adapted
	 * @generated
	 */
	public Adapter createBlockComment_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Block_adapted <em>Block adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Block_adapted
	 * @generated
	 */
	public Adapter createBlock_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BreakStatement_adapted <em>Break Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BreakStatement_adapted
	 * @generated
	 */
	public Adapter createBreakStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted <em>Cast Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted
	 * @generated
	 */
	public Adapter createCastExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted <em>Catch Clause adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted
	 * @generated
	 */
	public Adapter createCatchClause_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CharacterLiteral_adapted <em>Character Literal adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CharacterLiteral_adapted
	 * @generated
	 */
	public Adapter createCharacterLiteral_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted <em>Class File adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted
	 * @generated
	 */
	public Adapter createClassFile_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted <em>Class Instance Creation adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted
	 * @generated
	 */
	public Adapter createClassInstanceCreation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConstructorDeclaration_adapted <em>Constructor Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConstructorDeclaration_adapted
	 * @generated
	 */
	public Adapter createConstructorDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted <em>Conditional Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted
	 * @generated
	 */
	public Adapter createConditionalExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConstructorInvocation_adapted <em>Constructor Invocation adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConstructorInvocation_adapted
	 * @generated
	 */
	public Adapter createConstructorInvocation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassDeclaration_adapted <em>Class Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassDeclaration_adapted
	 * @generated
	 */
	public Adapter createClassDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted <em>Comment adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted
	 * @generated
	 */
	public Adapter createComment_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted <em>Compilation Unit adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted
	 * @generated
	 */
	public Adapter createCompilationUnit_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ContinueStatement_adapted <em>Continue Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ContinueStatement_adapted
	 * @generated
	 */
	public Adapter createContinueStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.DoStatement_adapted <em>Do Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.DoStatement_adapted
	 * @generated
	 */
	public Adapter createDoStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EmptyStatement_adapted <em>Empty Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EmptyStatement_adapted
	 * @generated
	 */
	public Adapter createEmptyStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted <em>Enhanced For Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted
	 * @generated
	 */
	public Adapter createEnhancedForStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted <em>Enum Constant Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted
	 * @generated
	 */
	public Adapter createEnumConstantDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted <em>Enum Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted
	 * @generated
	 */
	public Adapter createEnumDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted <em>Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Expression_adapted
	 * @generated
	 */
	public Adapter createExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ExpressionStatement_adapted <em>Expression Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ExpressionStatement_adapted
	 * @generated
	 */
	public Adapter createExpressionStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted <em>Field Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted
	 * @generated
	 */
	public Adapter createFieldAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldDeclaration_adapted <em>Field Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldDeclaration_adapted
	 * @generated
	 */
	public Adapter createFieldDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted <em>For Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted
	 * @generated
	 */
	public Adapter createForStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted <em>If Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted
	 * @generated
	 */
	public Adapter createIfStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted <em>Import Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted
	 * @generated
	 */
	public Adapter createImportDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted <em>Infix Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted
	 * @generated
	 */
	public Adapter createInfixExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Initializer_adapted <em>Initializer adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Initializer_adapted
	 * @generated
	 */
	public Adapter createInitializer_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted <em>Instanceof Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted
	 * @generated
	 */
	public Adapter createInstanceofExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InterfaceDeclaration_adapted <em>Interface Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InterfaceDeclaration_adapted
	 * @generated
	 */
	public Adapter createInterfaceDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Javadoc_adapted <em>Javadoc adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Javadoc_adapted
	 * @generated
	 */
	public Adapter createJavadoc_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted <em>Labeled Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted
	 * @generated
	 */
	public Adapter createLabeledStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LineComment_adapted <em>Line Comment adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LineComment_adapted
	 * @generated
	 */
	public Adapter createLineComment_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted <em>Manifest adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted
	 * @generated
	 */
	public Adapter createManifest_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted <em>Manifest Attribute adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted
	 * @generated
	 */
	public Adapter createManifestAttribute_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted <em>Manifest Entry adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted
	 * @generated
	 */
	public Adapter createManifestEntry_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted <em>Member Ref adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted
	 * @generated
	 */
	public Adapter createMemberRef_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted <em>Method Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted
	 * @generated
	 */
	public Adapter createMethodDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodInvocation_adapted <em>Method Invocation adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodInvocation_adapted
	 * @generated
	 */
	public Adapter createMethodInvocation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted <em>Method Ref adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted
	 * @generated
	 */
	public Adapter createMethodRef_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted <em>Method Ref Parameter adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted
	 * @generated
	 */
	public Adapter createMethodRefParameter_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted <em>Model adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted
	 * @generated
	 */
	public Adapter createModel_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted <em>Modifier adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted
	 * @generated
	 */
	public Adapter createModifier_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted <em>Named Element adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted
	 * @generated
	 */
	public Adapter createNamedElement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamespaceAccess_adapted <em>Namespace Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamespaceAccess_adapted
	 * @generated
	 */
	public Adapter createNamespaceAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NumberLiteral_adapted <em>Number Literal adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NumberLiteral_adapted
	 * @generated
	 */
	public Adapter createNumberLiteral_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NullLiteral_adapted <em>Null Literal adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NullLiteral_adapted
	 * @generated
	 */
	public Adapter createNullLiteral_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted <em>Package adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted
	 * @generated
	 */
	public Adapter createPackage_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted <em>Package Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted
	 * @generated
	 */
	public Adapter createPackageAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted <em>Parameterized Type adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted
	 * @generated
	 */
	public Adapter createParameterizedType_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParenthesizedExpression_adapted <em>Parenthesized Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParenthesizedExpression_adapted
	 * @generated
	 */
	public Adapter createParenthesizedExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted <em>Postfix Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted
	 * @generated
	 */
	public Adapter createPostfixExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrefixExpression_adapted <em>Prefix Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrefixExpression_adapted
	 * @generated
	 */
	public Adapter createPrefixExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveType_adapted <em>Primitive Type adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveType_adapted
	 * @generated
	 */
	public Adapter createPrimitiveType_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeBoolean_adapted <em>Primitive Type Boolean adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeBoolean_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeBoolean_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeByte_adapted <em>Primitive Type Byte adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeByte_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeByte_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeChar_adapted <em>Primitive Type Char adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeChar_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeChar_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeDouble_adapted <em>Primitive Type Double adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeDouble_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeDouble_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeShort_adapted <em>Primitive Type Short adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeShort_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeShort_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeFloat_adapted <em>Primitive Type Float adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeFloat_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeFloat_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeInt_adapted <em>Primitive Type Int adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeInt_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeInt_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeLong_adapted <em>Primitive Type Long adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeLong_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeLong_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeVoid_adapted <em>Primitive Type Void adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrimitiveTypeVoid_adapted
	 * @generated
	 */
	public Adapter createPrimitiveTypeVoid_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ReturnStatement_adapted <em>Return Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ReturnStatement_adapted
	 * @generated
	 */
	public Adapter createReturnStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted <em>Single Variable Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted
	 * @generated
	 */
	public Adapter createSingleVariableAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted <em>Single Variable Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted
	 * @generated
	 */
	public Adapter createSingleVariableDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Statement_adapted <em>Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Statement_adapted
	 * @generated
	 */
	public Adapter createStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.StringLiteral_adapted <em>String Literal adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.StringLiteral_adapted
	 * @generated
	 */
	public Adapter createStringLiteral_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperConstructorInvocation_adapted <em>Super Constructor Invocation adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperConstructorInvocation_adapted
	 * @generated
	 */
	public Adapter createSuperConstructorInvocation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperFieldAccess_adapted <em>Super Field Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperFieldAccess_adapted
	 * @generated
	 */
	public Adapter createSuperFieldAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperMethodInvocation_adapted <em>Super Method Invocation adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperMethodInvocation_adapted
	 * @generated
	 */
	public Adapter createSuperMethodInvocation_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted <em>Switch Case adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted
	 * @generated
	 */
	public Adapter createSwitchCase_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted <em>Switch Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted
	 * @generated
	 */
	public Adapter createSwitchStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted <em>Synchronized Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted
	 * @generated
	 */
	public Adapter createSynchronizedStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted <em>Tag Element adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted
	 * @generated
	 */
	public Adapter createTagElement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TextElement_adapted <em>Text Element adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TextElement_adapted
	 * @generated
	 */
	public Adapter createTextElement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ThisExpression_adapted <em>This Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ThisExpression_adapted
	 * @generated
	 */
	public Adapter createThisExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ThrowStatement_adapted <em>Throw Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ThrowStatement_adapted
	 * @generated
	 */
	public Adapter createThrowStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted <em>Try Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted
	 * @generated
	 */
	public Adapter createTryStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Type_adapted <em>Type adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Type_adapted
	 * @generated
	 */
	public Adapter createType_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted <em>Type Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted
	 * @generated
	 */
	public Adapter createTypeAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclaration_adapted <em>Type Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclaration_adapted
	 * @generated
	 */
	public Adapter createTypeDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclarationStatement_adapted <em>Type Declaration Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclarationStatement_adapted
	 * @generated
	 */
	public Adapter createTypeDeclarationStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeLiteral_adapted <em>Type Literal adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeLiteral_adapted
	 * @generated
	 */
	public Adapter createTypeLiteral_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeParameter_adapted <em>Type Parameter adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeParameter_adapted
	 * @generated
	 */
	public Adapter createTypeParameter_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItem_adapted <em>Unresolved Item adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItem_adapted
	 * @generated
	 */
	public Adapter createUnresolvedItem_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted <em>Unresolved Item Access adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted
	 * @generated
	 */
	public Adapter createUnresolvedItemAccess_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedAnnotationDeclaration_adapted <em>Unresolved Annotation Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedAnnotationDeclaration_adapted
	 * @generated
	 */
	public Adapter createUnresolvedAnnotationDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedAnnotationTypeMemberDeclaration_adapted <em>Unresolved Annotation Type Member Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedAnnotationTypeMemberDeclaration_adapted
	 * @generated
	 */
	public Adapter createUnresolvedAnnotationTypeMemberDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedClassDeclaration_adapted <em>Unresolved Class Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedClassDeclaration_adapted
	 * @generated
	 */
	public Adapter createUnresolvedClassDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedEnumDeclaration_adapted <em>Unresolved Enum Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedEnumDeclaration_adapted
	 * @generated
	 */
	public Adapter createUnresolvedEnumDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedInterfaceDeclaration_adapted <em>Unresolved Interface Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedInterfaceDeclaration_adapted
	 * @generated
	 */
	public Adapter createUnresolvedInterfaceDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedLabeledStatement_adapted <em>Unresolved Labeled Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedLabeledStatement_adapted
	 * @generated
	 */
	public Adapter createUnresolvedLabeledStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedMethodDeclaration_adapted <em>Unresolved Method Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedMethodDeclaration_adapted
	 * @generated
	 */
	public Adapter createUnresolvedMethodDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedSingleVariableDeclaration_adapted <em>Unresolved Single Variable Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedSingleVariableDeclaration_adapted
	 * @generated
	 */
	public Adapter createUnresolvedSingleVariableDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedType_adapted <em>Unresolved Type adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedType_adapted
	 * @generated
	 */
	public Adapter createUnresolvedType_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedTypeDeclaration_adapted <em>Unresolved Type Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedTypeDeclaration_adapted
	 * @generated
	 */
	public Adapter createUnresolvedTypeDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedVariableDeclarationFragment_adapted <em>Unresolved Variable Declaration Fragment adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedVariableDeclarationFragment_adapted
	 * @generated
	 */
	public Adapter createUnresolvedVariableDeclarationFragment_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted <em>Variable Declaration adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted
	 * @generated
	 */
	public Adapter createVariableDeclaration_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted <em>Variable Declaration Expression adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted
	 * @generated
	 */
	public Adapter createVariableDeclarationExpression_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted <em>Variable Declaration Fragment adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted
	 * @generated
	 */
	public Adapter createVariableDeclarationFragment_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted <em>Variable Declaration Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted
	 * @generated
	 */
	public Adapter createVariableDeclarationStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted <em>Wild Card Type adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted
	 * @generated
	 */
	public Adapter createWildCardType_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WhileStatement_adapted <em>While Statement adapted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WhileStatement_adapted
	 * @generated
	 */
	public Adapter createWhileStatement_adaptedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_bodyItem <em>Abstract Method Declaration adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_bodyItem
	 * @generated
	 */
	public Adapter createAbstractMethodDeclaration_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_parametersItem <em>Abstract Method Declaration adapted parameters Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_parametersItem
	 * @generated
	 */
	public Adapter createAbstractMethodDeclaration_adapted_parametersItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_thrownExceptionsItem <em>Abstract Method Declaration adapted thrown Exceptions Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_thrownExceptionsItem
	 * @generated
	 */
	public Adapter createAbstractMethodDeclaration_adapted_thrownExceptionsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_typeParametersItem <em>Abstract Method Declaration adapted type Parameters Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_typeParametersItem
	 * @generated
	 */
	public Adapter createAbstractMethodDeclaration_adapted_typeParametersItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesInDocCommentsItem <em>Abstract Method Declaration adapted usages In Doc Comments Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesInDocCommentsItem
	 * @generated
	 */
	public Adapter createAbstractMethodDeclaration_adapted_usagesInDocCommentsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesItem <em>Abstract Method Declaration adapted usages Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodDeclaration_adapted_usagesItem
	 * @generated
	 */
	public Adapter createAbstractMethodDeclaration_adapted_usagesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_methodItem <em>Abstract Method Invocation adapted method Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_methodItem
	 * @generated
	 */
	public Adapter createAbstractMethodInvocation_adapted_methodItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_argumentsItem <em>Abstract Method Invocation adapted arguments Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_argumentsItem
	 * @generated
	 */
	public Adapter createAbstractMethodInvocation_adapted_argumentsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_typeArgumentsItem <em>Abstract Method Invocation adapted type Arguments Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractMethodInvocation_adapted_typeArgumentsItem
	 * @generated
	 */
	public Adapter createAbstractMethodInvocation_adapted_typeArgumentsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_bodyDeclarationsItem <em>Abstract Type Declaration adapted body Declarations Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_bodyDeclarationsItem
	 * @generated
	 */
	public Adapter createAbstractTypeDeclaration_adapted_bodyDeclarationsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsBeforeBodyItem <em>Abstract Type Declaration adapted comments Before Body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsBeforeBodyItem
	 * @generated
	 */
	public Adapter createAbstractTypeDeclaration_adapted_commentsBeforeBodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsAfterBodyItem <em>Abstract Type Declaration adapted comments After Body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_commentsAfterBodyItem
	 * @generated
	 */
	public Adapter createAbstractTypeDeclaration_adapted_commentsAfterBodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_packageItem <em>Abstract Type Declaration adapted package Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_packageItem
	 * @generated
	 */
	public Adapter createAbstractTypeDeclaration_adapted_packageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_superInterfacesItem <em>Abstract Type Declaration adapted super Interfaces Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeDeclaration_adapted_superInterfacesItem
	 * @generated
	 */
	public Adapter createAbstractTypeDeclaration_adapted_superInterfacesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeQualifiedExpression_adapted_qualifierItem <em>Abstract Type Qualified Expression adapted qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractTypeQualifiedExpression_adapted_qualifierItem
	 * @generated
	 */
	public Adapter createAbstractTypeQualifiedExpression_adapted_qualifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_typeItem <em>Abstract Variables Container adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_typeItem
	 * @generated
	 */
	public Adapter createAbstractVariablesContainer_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_fragmentsItem <em>Abstract Variables Container adapted fragments Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AbstractVariablesContainer_adapted_fragmentsItem
	 * @generated
	 */
	public Adapter createAbstractVariablesContainer_adapted_fragmentsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted_typeItem <em>Annotation adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted_typeItem
	 * @generated
	 */
	public Adapter createAnnotation_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted_valuesItem <em>Annotation adapted values Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Annotation_adapted_valuesItem
	 * @generated
	 */
	public Adapter createAnnotation_adapted_valuesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_originalFilePathValue <em>Archive adapted original File Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_originalFilePathValue
	 * @generated
	 */
	public Adapter createArchive_adapted_originalFilePathValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_classFilesItem <em>Archive adapted class Files Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_classFilesItem
	 * @generated
	 */
	public Adapter createArchive_adapted_classFilesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_manifestItem <em>Archive adapted manifest Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Archive_adapted_manifestItem
	 * @generated
	 */
	public Adapter createArchive_adapted_manifestItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted_messageItem <em>Assert Statement adapted message Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted_messageItem
	 * @generated
	 */
	public Adapter createAssertStatement_adapted_messageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted_expressionItem <em>Assert Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AssertStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createAssertStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_commentsItem <em>AST Node adapted comments Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_commentsItem
	 * @generated
	 */
	public Adapter createASTNode_adapted_commentsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalCompilationUnitItem <em>AST Node adapted original Compilation Unit Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalCompilationUnitItem
	 * @generated
	 */
	public Adapter createASTNode_adapted_originalCompilationUnitItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalClassFileItem <em>AST Node adapted original Class File Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ASTNode_adapted_originalClassFileItem
	 * @generated
	 */
	public Adapter createASTNode_adapted_originalClassFileItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted_memberItem <em>Annotation Member Value Pair adapted member Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted_memberItem
	 * @generated
	 */
	public Adapter createAnnotationMemberValuePair_adapted_memberItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted_valueItem <em>Annotation Member Value Pair adapted value Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationMemberValuePair_adapted_valueItem
	 * @generated
	 */
	public Adapter createAnnotationMemberValuePair_adapted_valueItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_defaultItem <em>Annotation Type Member Declaration adapted default Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_defaultItem
	 * @generated
	 */
	public Adapter createAnnotationTypeMemberDeclaration_adapted_defaultItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_typeItem <em>Annotation Type Member Declaration adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_typeItem
	 * @generated
	 */
	public Adapter createAnnotationTypeMemberDeclaration_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_usagesItem <em>Annotation Type Member Declaration adapted usages Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnnotationTypeMemberDeclaration_adapted_usagesItem
	 * @generated
	 */
	public Adapter createAnnotationTypeMemberDeclaration_adapted_usagesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_bodyDeclarationsItem <em>Anonymous Class Declaration adapted body Declarations Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_bodyDeclarationsItem
	 * @generated
	 */
	public Adapter createAnonymousClassDeclaration_adapted_bodyDeclarationsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_classInstanceCreationItem <em>Anonymous Class Declaration adapted class Instance Creation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.AnonymousClassDeclaration_adapted_classInstanceCreationItem
	 * @generated
	 */
	public Adapter createAnonymousClassDeclaration_adapted_classInstanceCreationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted_arrayItem <em>Array Access adapted array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted_arrayItem
	 * @generated
	 */
	public Adapter createArrayAccess_adapted_arrayItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted_indexItem <em>Array Access adapted index Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayAccess_adapted_indexItem
	 * @generated
	 */
	public Adapter createArrayAccess_adapted_indexItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_dimensionsItem <em>Array Creation adapted dimensions Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_dimensionsItem
	 * @generated
	 */
	public Adapter createArrayCreation_adapted_dimensionsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_initializerItem <em>Array Creation adapted initializer Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_initializerItem
	 * @generated
	 */
	public Adapter createArrayCreation_adapted_initializerItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_typeItem <em>Array Creation adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayCreation_adapted_typeItem
	 * @generated
	 */
	public Adapter createArrayCreation_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayInitializer_adapted_expressionsItem <em>Array Initializer adapted expressions Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayInitializer_adapted_expressionsItem
	 * @generated
	 */
	public Adapter createArrayInitializer_adapted_expressionsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayLengthAccess_adapted_arrayItem <em>Array Length Access adapted array Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayLengthAccess_adapted_arrayItem
	 * @generated
	 */
	public Adapter createArrayLengthAccess_adapted_arrayItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted_dimensionsValue <em>Array Type adapted dimensions Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted_dimensionsValue
	 * @generated
	 */
	public Adapter createArrayType_adapted_dimensionsValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted_elementTypeItem <em>Array Type adapted element Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ArrayType_adapted_elementTypeItem
	 * @generated
	 */
	public Adapter createArrayType_adapted_elementTypeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_leftHandSideItem <em>Assignment adapted left Hand Side Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_leftHandSideItem
	 * @generated
	 */
	public Adapter createAssignment_adapted_leftHandSideItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_operatorValue <em>Assignment adapted operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_operatorValue
	 * @generated
	 */
	public Adapter createAssignment_adapted_operatorValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_rightHandSideItem <em>Assignment adapted right Hand Side Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Assignment_adapted_rightHandSideItem
	 * @generated
	 */
	public Adapter createAssignment_adapted_rightHandSideItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_abstractTypeDeclarationItem <em>Body Declaration adapted abstract Type Declaration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_abstractTypeDeclarationItem
	 * @generated
	 */
	public Adapter createBodyDeclaration_adapted_abstractTypeDeclarationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_annotationsItem <em>Body Declaration adapted annotations Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_annotationsItem
	 * @generated
	 */
	public Adapter createBodyDeclaration_adapted_annotationsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem <em>Body Declaration adapted anonymous Class Declaration Owner Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem
	 * @generated
	 */
	public Adapter createBodyDeclaration_adapted_anonymousClassDeclarationOwnerItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_modifierItem <em>Body Declaration adapted modifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BodyDeclaration_adapted_modifierItem
	 * @generated
	 */
	public Adapter createBodyDeclaration_adapted_modifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BooleanLiteral_adapted_valueValue <em>Boolean Literal adapted value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BooleanLiteral_adapted_valueValue
	 * @generated
	 */
	public Adapter createBooleanLiteral_adapted_valueValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Block_adapted_statementsItem <em>Block adapted statements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Block_adapted_statementsItem
	 * @generated
	 */
	public Adapter createBlock_adapted_statementsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BreakStatement_adapted_labelItem <em>Break Statement adapted label Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.BreakStatement_adapted_labelItem
	 * @generated
	 */
	public Adapter createBreakStatement_adapted_labelItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted_expressionItem <em>Cast Expression adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted_expressionItem
	 * @generated
	 */
	public Adapter createCastExpression_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted_typeItem <em>Cast Expression adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CastExpression_adapted_typeItem
	 * @generated
	 */
	public Adapter createCastExpression_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted_exceptionItem <em>Catch Clause adapted exception Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted_exceptionItem
	 * @generated
	 */
	public Adapter createCatchClause_adapted_exceptionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted_bodyItem <em>Catch Clause adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CatchClause_adapted_bodyItem
	 * @generated
	 */
	public Adapter createCatchClause_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CharacterLiteral_adapted_escapedValueValue <em>Character Literal adapted escaped Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CharacterLiteral_adapted_escapedValueValue
	 * @generated
	 */
	public Adapter createCharacterLiteral_adapted_escapedValueValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_originalFilePathValue <em>Class File adapted original File Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_originalFilePathValue
	 * @generated
	 */
	public Adapter createClassFile_adapted_originalFilePathValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_typeItem <em>Class File adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_typeItem
	 * @generated
	 */
	public Adapter createClassFile_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_attachedSourceItem <em>Class File adapted attached Source Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_attachedSourceItem
	 * @generated
	 */
	public Adapter createClassFile_adapted_attachedSourceItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_packageItem <em>Class File adapted package Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassFile_adapted_packageItem
	 * @generated
	 */
	public Adapter createClassFile_adapted_packageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_anonymousClassDeclarationItem <em>Class Instance Creation adapted anonymous Class Declaration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_anonymousClassDeclarationItem
	 * @generated
	 */
	public Adapter createClassInstanceCreation_adapted_anonymousClassDeclarationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_expressionItem <em>Class Instance Creation adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_expressionItem
	 * @generated
	 */
	public Adapter createClassInstanceCreation_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_typeItem <em>Class Instance Creation adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassInstanceCreation_adapted_typeItem
	 * @generated
	 */
	public Adapter createClassInstanceCreation_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_elseExpressionItem <em>Conditional Expression adapted else Expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_elseExpressionItem
	 * @generated
	 */
	public Adapter createConditionalExpression_adapted_elseExpressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_expressionItem <em>Conditional Expression adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_expressionItem
	 * @generated
	 */
	public Adapter createConditionalExpression_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_thenExpressionItem <em>Conditional Expression adapted then Expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ConditionalExpression_adapted_thenExpressionItem
	 * @generated
	 */
	public Adapter createConditionalExpression_adapted_thenExpressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassDeclaration_adapted_superClassItem <em>Class Declaration adapted super Class Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ClassDeclaration_adapted_superClassItem
	 * @generated
	 */
	public Adapter createClassDeclaration_adapted_superClassItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_contentValue <em>Comment adapted content Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_contentValue
	 * @generated
	 */
	public Adapter createComment_adapted_contentValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_enclosedByParentValue <em>Comment adapted enclosed By Parent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_enclosedByParentValue
	 * @generated
	 */
	public Adapter createComment_adapted_enclosedByParentValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_prefixOfParentValue <em>Comment adapted prefix Of Parent Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Comment_adapted_prefixOfParentValue
	 * @generated
	 */
	public Adapter createComment_adapted_prefixOfParentValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_originalFilePathValue <em>Compilation Unit adapted original File Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_originalFilePathValue
	 * @generated
	 */
	public Adapter createCompilationUnit_adapted_originalFilePathValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_commentListItem <em>Compilation Unit adapted comment List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_commentListItem
	 * @generated
	 */
	public Adapter createCompilationUnit_adapted_commentListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_importsItem <em>Compilation Unit adapted imports Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_importsItem
	 * @generated
	 */
	public Adapter createCompilationUnit_adapted_importsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_packageItem <em>Compilation Unit adapted package Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_packageItem
	 * @generated
	 */
	public Adapter createCompilationUnit_adapted_packageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_typesItem <em>Compilation Unit adapted types Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.CompilationUnit_adapted_typesItem
	 * @generated
	 */
	public Adapter createCompilationUnit_adapted_typesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ContinueStatement_adapted_labelItem <em>Continue Statement adapted label Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ContinueStatement_adapted_labelItem
	 * @generated
	 */
	public Adapter createContinueStatement_adapted_labelItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.DoStatement_adapted_expressionItem <em>Do Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.DoStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createDoStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.DoStatement_adapted_bodyItem <em>Do Statement adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.DoStatement_adapted_bodyItem
	 * @generated
	 */
	public Adapter createDoStatement_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted_bodyItem <em>Enhanced For Statement adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted_bodyItem
	 * @generated
	 */
	public Adapter createEnhancedForStatement_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted_expressionItem <em>Enhanced For Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createEnhancedForStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted_parameterItem <em>Enhanced For Statement adapted parameter Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnhancedForStatement_adapted_parameterItem
	 * @generated
	 */
	public Adapter createEnhancedForStatement_adapted_parameterItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_anonymousClassDeclarationItem <em>Enum Constant Declaration adapted anonymous Class Declaration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_anonymousClassDeclarationItem
	 * @generated
	 */
	public Adapter createEnumConstantDeclaration_adapted_anonymousClassDeclarationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_argumentsItem <em>Enum Constant Declaration adapted arguments Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumConstantDeclaration_adapted_argumentsItem
	 * @generated
	 */
	public Adapter createEnumConstantDeclaration_adapted_argumentsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted_enumConstantsItem <em>Enum Declaration adapted enum Constants Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.EnumDeclaration_adapted_enumConstantsItem
	 * @generated
	 */
	public Adapter createEnumDeclaration_adapted_enumConstantsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ExpressionStatement_adapted_expressionItem <em>Expression Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ExpressionStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createExpressionStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted_fieldItem <em>Field Access adapted field Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted_fieldItem
	 * @generated
	 */
	public Adapter createFieldAccess_adapted_fieldItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted_expressionItem <em>Field Access adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.FieldAccess_adapted_expressionItem
	 * @generated
	 */
	public Adapter createFieldAccess_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_expressionItem <em>For Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createForStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_updatersItem <em>For Statement adapted updaters Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_updatersItem
	 * @generated
	 */
	public Adapter createForStatement_adapted_updatersItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_initializersItem <em>For Statement adapted initializers Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_initializersItem
	 * @generated
	 */
	public Adapter createForStatement_adapted_initializersItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_bodyItem <em>For Statement adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ForStatement_adapted_bodyItem
	 * @generated
	 */
	public Adapter createForStatement_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_expressionItem <em>If Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createIfStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_thenStatementItem <em>If Statement adapted then Statement Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_thenStatementItem
	 * @generated
	 */
	public Adapter createIfStatement_adapted_thenStatementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_elseStatementItem <em>If Statement adapted else Statement Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.IfStatement_adapted_elseStatementItem
	 * @generated
	 */
	public Adapter createIfStatement_adapted_elseStatementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted_staticValue <em>Import Declaration adapted static Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted_staticValue
	 * @generated
	 */
	public Adapter createImportDeclaration_adapted_staticValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted_importedElementItem <em>Import Declaration adapted imported Element Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ImportDeclaration_adapted_importedElementItem
	 * @generated
	 */
	public Adapter createImportDeclaration_adapted_importedElementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_operatorValue <em>Infix Expression adapted operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_operatorValue
	 * @generated
	 */
	public Adapter createInfixExpression_adapted_operatorValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_rightOperandItem <em>Infix Expression adapted right Operand Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_rightOperandItem
	 * @generated
	 */
	public Adapter createInfixExpression_adapted_rightOperandItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_leftOperandItem <em>Infix Expression adapted left Operand Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_leftOperandItem
	 * @generated
	 */
	public Adapter createInfixExpression_adapted_leftOperandItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_extendedOperandsItem <em>Infix Expression adapted extended Operands Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InfixExpression_adapted_extendedOperandsItem
	 * @generated
	 */
	public Adapter createInfixExpression_adapted_extendedOperandsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Initializer_adapted_bodyItem <em>Initializer adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Initializer_adapted_bodyItem
	 * @generated
	 */
	public Adapter createInitializer_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted_rightOperandItem <em>Instanceof Expression adapted right Operand Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted_rightOperandItem
	 * @generated
	 */
	public Adapter createInstanceofExpression_adapted_rightOperandItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted_leftOperandItem <em>Instanceof Expression adapted left Operand Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.InstanceofExpression_adapted_leftOperandItem
	 * @generated
	 */
	public Adapter createInstanceofExpression_adapted_leftOperandItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Javadoc_adapted_tagsItem <em>Javadoc adapted tags Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Javadoc_adapted_tagsItem
	 * @generated
	 */
	public Adapter createJavadoc_adapted_tagsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_bodyItem <em>Labeled Statement adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_bodyItem
	 * @generated
	 */
	public Adapter createLabeledStatement_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInBreakStatementsItem <em>Labeled Statement adapted usages In Break Statements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInBreakStatementsItem
	 * @generated
	 */
	public Adapter createLabeledStatement_adapted_usagesInBreakStatementsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInContinueStatementsItem <em>Labeled Statement adapted usages In Continue Statements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.LabeledStatement_adapted_usagesInContinueStatementsItem
	 * @generated
	 */
	public Adapter createLabeledStatement_adapted_usagesInContinueStatementsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_mainAttributesItem <em>Manifest adapted main Attributes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_mainAttributesItem
	 * @generated
	 */
	public Adapter createManifest_adapted_mainAttributesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_entryAttributesItem <em>Manifest adapted entry Attributes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Manifest_adapted_entryAttributesItem
	 * @generated
	 */
	public Adapter createManifest_adapted_entryAttributesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted_keyValue <em>Manifest Attribute adapted key Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted_keyValue
	 * @generated
	 */
	public Adapter createManifestAttribute_adapted_keyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted_valueValue <em>Manifest Attribute adapted value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestAttribute_adapted_valueValue
	 * @generated
	 */
	public Adapter createManifestAttribute_adapted_valueValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_nameValue <em>Manifest Entry adapted name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_nameValue
	 * @generated
	 */
	public Adapter createManifestEntry_adapted_nameValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_attributesItem <em>Manifest Entry adapted attributes Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ManifestEntry_adapted_attributesItem
	 * @generated
	 */
	public Adapter createManifestEntry_adapted_attributesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted_memberItem <em>Member Ref adapted member Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted_memberItem
	 * @generated
	 */
	public Adapter createMemberRef_adapted_memberItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted_qualifierItem <em>Member Ref adapted qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MemberRef_adapted_qualifierItem
	 * @generated
	 */
	public Adapter createMemberRef_adapted_qualifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_extraArrayDimensionsValue <em>Method Declaration adapted extra Array Dimensions Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_extraArrayDimensionsValue
	 * @generated
	 */
	public Adapter createMethodDeclaration_adapted_extraArrayDimensionsValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_returnTypeItem <em>Method Declaration adapted return Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_returnTypeItem
	 * @generated
	 */
	public Adapter createMethodDeclaration_adapted_returnTypeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinedMethodDeclarationItem <em>Method Declaration adapted redefined Method Declaration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinedMethodDeclarationItem
	 * @generated
	 */
	public Adapter createMethodDeclaration_adapted_redefinedMethodDeclarationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinitionsItem <em>Method Declaration adapted redefinitions Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodDeclaration_adapted_redefinitionsItem
	 * @generated
	 */
	public Adapter createMethodDeclaration_adapted_redefinitionsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodInvocation_adapted_expressionItem <em>Method Invocation adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodInvocation_adapted_expressionItem
	 * @generated
	 */
	public Adapter createMethodInvocation_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_methodItem <em>Method Ref adapted method Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_methodItem
	 * @generated
	 */
	public Adapter createMethodRef_adapted_methodItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_qualifierItem <em>Method Ref adapted qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_qualifierItem
	 * @generated
	 */
	public Adapter createMethodRef_adapted_qualifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_parametersItem <em>Method Ref adapted parameters Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRef_adapted_parametersItem
	 * @generated
	 */
	public Adapter createMethodRef_adapted_parametersItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_nameValue <em>Method Ref Parameter adapted name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_nameValue
	 * @generated
	 */
	public Adapter createMethodRefParameter_adapted_nameValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_varargsValue <em>Method Ref Parameter adapted varargs Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_varargsValue
	 * @generated
	 */
	public Adapter createMethodRefParameter_adapted_varargsValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_typeItem <em>Method Ref Parameter adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.MethodRefParameter_adapted_typeItem
	 * @generated
	 */
	public Adapter createMethodRefParameter_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_nameValue <em>Model adapted name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_nameValue
	 * @generated
	 */
	public Adapter createModel_adapted_nameValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_ownedElementsItem <em>Model adapted owned Elements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_ownedElementsItem
	 * @generated
	 */
	public Adapter createModel_adapted_ownedElementsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_orphanTypesItem <em>Model adapted orphan Types Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_orphanTypesItem
	 * @generated
	 */
	public Adapter createModel_adapted_orphanTypesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_unresolvedItemsItem <em>Model adapted unresolved Items Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_unresolvedItemsItem
	 * @generated
	 */
	public Adapter createModel_adapted_unresolvedItemsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_compilationUnitsItem <em>Model adapted compilation Units Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_compilationUnitsItem
	 * @generated
	 */
	public Adapter createModel_adapted_compilationUnitsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_classFilesItem <em>Model adapted class Files Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_classFilesItem
	 * @generated
	 */
	public Adapter createModel_adapted_classFilesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_archivesItem <em>Model adapted archives Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Model_adapted_archivesItem
	 * @generated
	 */
	public Adapter createModel_adapted_archivesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_visibilityValue <em>Modifier adapted visibility Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_visibilityValue
	 * @generated
	 */
	public Adapter createModifier_adapted_visibilityValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_inheritanceValue <em>Modifier adapted inheritance Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_inheritanceValue
	 * @generated
	 */
	public Adapter createModifier_adapted_inheritanceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_staticValue <em>Modifier adapted static Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_staticValue
	 * @generated
	 */
	public Adapter createModifier_adapted_staticValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_transientValue <em>Modifier adapted transient Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_transientValue
	 * @generated
	 */
	public Adapter createModifier_adapted_transientValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_volatileValue <em>Modifier adapted volatile Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_volatileValue
	 * @generated
	 */
	public Adapter createModifier_adapted_volatileValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_nativeValue <em>Modifier adapted native Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_nativeValue
	 * @generated
	 */
	public Adapter createModifier_adapted_nativeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_strictfpValue <em>Modifier adapted strictfp Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_strictfpValue
	 * @generated
	 */
	public Adapter createModifier_adapted_strictfpValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_synchronizedValue <em>Modifier adapted synchronized Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_synchronizedValue
	 * @generated
	 */
	public Adapter createModifier_adapted_synchronizedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_bodyDeclarationItem <em>Modifier adapted body Declaration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_bodyDeclarationItem
	 * @generated
	 */
	public Adapter createModifier_adapted_bodyDeclarationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_singleVariableDeclarationItem <em>Modifier adapted single Variable Declaration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_singleVariableDeclarationItem
	 * @generated
	 */
	public Adapter createModifier_adapted_singleVariableDeclarationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationStatementItem <em>Modifier adapted variable Declaration Statement Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationStatementItem
	 * @generated
	 */
	public Adapter createModifier_adapted_variableDeclarationStatementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationExpressionItem <em>Modifier adapted variable Declaration Expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Modifier_adapted_variableDeclarationExpressionItem
	 * @generated
	 */
	public Adapter createModifier_adapted_variableDeclarationExpressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_nameValue <em>Named Element adapted name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_nameValue
	 * @generated
	 */
	public Adapter createNamedElement_adapted_nameValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_proxyValue <em>Named Element adapted proxy Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_proxyValue
	 * @generated
	 */
	public Adapter createNamedElement_adapted_proxyValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_usagesInImportsItem <em>Named Element adapted usages In Imports Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NamedElement_adapted_usagesInImportsItem
	 * @generated
	 */
	public Adapter createNamedElement_adapted_usagesInImportsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NumberLiteral_adapted_tokenValueValue <em>Number Literal adapted token Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.NumberLiteral_adapted_tokenValueValue
	 * @generated
	 */
	public Adapter createNumberLiteral_adapted_tokenValueValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedElementsItem <em>Package adapted owned Elements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedElementsItem
	 * @generated
	 */
	public Adapter createPackage_adapted_ownedElementsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_modelItem <em>Package adapted model Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_modelItem
	 * @generated
	 */
	public Adapter createPackage_adapted_modelItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedPackagesItem <em>Package adapted owned Packages Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_ownedPackagesItem
	 * @generated
	 */
	public Adapter createPackage_adapted_ownedPackagesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_packageItem <em>Package adapted package Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_packageItem
	 * @generated
	 */
	public Adapter createPackage_adapted_packageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_usagesInPackageAccessItem <em>Package adapted usages In Package Access Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Package_adapted_usagesInPackageAccessItem
	 * @generated
	 */
	public Adapter createPackage_adapted_usagesInPackageAccessItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted_packageItem <em>Package Access adapted package Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted_packageItem
	 * @generated
	 */
	public Adapter createPackageAccess_adapted_packageItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted_qualifierItem <em>Package Access adapted qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PackageAccess_adapted_qualifierItem
	 * @generated
	 */
	public Adapter createPackageAccess_adapted_qualifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted_typeItem <em>Parameterized Type adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted_typeItem
	 * @generated
	 */
	public Adapter createParameterizedType_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted_typeArgumentsItem <em>Parameterized Type adapted type Arguments Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParameterizedType_adapted_typeArgumentsItem
	 * @generated
	 */
	public Adapter createParameterizedType_adapted_typeArgumentsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParenthesizedExpression_adapted_expressionItem <em>Parenthesized Expression adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ParenthesizedExpression_adapted_expressionItem
	 * @generated
	 */
	public Adapter createParenthesizedExpression_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted_operatorValue <em>Postfix Expression adapted operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted_operatorValue
	 * @generated
	 */
	public Adapter createPostfixExpression_adapted_operatorValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted_operandItem <em>Postfix Expression adapted operand Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PostfixExpression_adapted_operandItem
	 * @generated
	 */
	public Adapter createPostfixExpression_adapted_operandItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrefixExpression_adapted_operatorValue <em>Prefix Expression adapted operator Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrefixExpression_adapted_operatorValue
	 * @generated
	 */
	public Adapter createPrefixExpression_adapted_operatorValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrefixExpression_adapted_operandItem <em>Prefix Expression adapted operand Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.PrefixExpression_adapted_operandItem
	 * @generated
	 */
	public Adapter createPrefixExpression_adapted_operandItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ReturnStatement_adapted_expressionItem <em>Return Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ReturnStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createReturnStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted_variableItem <em>Single Variable Access adapted variable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted_variableItem
	 * @generated
	 */
	public Adapter createSingleVariableAccess_adapted_variableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted_qualifierItem <em>Single Variable Access adapted qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableAccess_adapted_qualifierItem
	 * @generated
	 */
	public Adapter createSingleVariableAccess_adapted_qualifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_modifierItem <em>Single Variable Declaration adapted modifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_modifierItem
	 * @generated
	 */
	public Adapter createSingleVariableDeclaration_adapted_modifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_varargsValue <em>Single Variable Declaration adapted varargs Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_varargsValue
	 * @generated
	 */
	public Adapter createSingleVariableDeclaration_adapted_varargsValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_typeItem <em>Single Variable Declaration adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_typeItem
	 * @generated
	 */
	public Adapter createSingleVariableDeclaration_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_annotationsItem <em>Single Variable Declaration adapted annotations Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_annotationsItem
	 * @generated
	 */
	public Adapter createSingleVariableDeclaration_adapted_annotationsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_methodDeclarationItem <em>Single Variable Declaration adapted method Declaration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_methodDeclarationItem
	 * @generated
	 */
	public Adapter createSingleVariableDeclaration_adapted_methodDeclarationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_catchClauseItem <em>Single Variable Declaration adapted catch Clause Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_catchClauseItem
	 * @generated
	 */
	public Adapter createSingleVariableDeclaration_adapted_catchClauseItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_enhancedForStatementItem <em>Single Variable Declaration adapted enhanced For Statement Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SingleVariableDeclaration_adapted_enhancedForStatementItem
	 * @generated
	 */
	public Adapter createSingleVariableDeclaration_adapted_enhancedForStatementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.StringLiteral_adapted_escapedValueValue <em>String Literal adapted escaped Value Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.StringLiteral_adapted_escapedValueValue
	 * @generated
	 */
	public Adapter createStringLiteral_adapted_escapedValueValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperConstructorInvocation_adapted_expressionItem <em>Super Constructor Invocation adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperConstructorInvocation_adapted_expressionItem
	 * @generated
	 */
	public Adapter createSuperConstructorInvocation_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperFieldAccess_adapted_fieldItem <em>Super Field Access adapted field Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SuperFieldAccess_adapted_fieldItem
	 * @generated
	 */
	public Adapter createSuperFieldAccess_adapted_fieldItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted_defaultValue <em>Switch Case adapted default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted_defaultValue
	 * @generated
	 */
	public Adapter createSwitchCase_adapted_defaultValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted_expressionItem <em>Switch Case adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchCase_adapted_expressionItem
	 * @generated
	 */
	public Adapter createSwitchCase_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted_expressionItem <em>Switch Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createSwitchStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted_statementsItem <em>Switch Statement adapted statements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SwitchStatement_adapted_statementsItem
	 * @generated
	 */
	public Adapter createSwitchStatement_adapted_statementsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted_bodyItem <em>Synchronized Statement adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted_bodyItem
	 * @generated
	 */
	public Adapter createSynchronizedStatement_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted_expressionItem <em>Synchronized Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.SynchronizedStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createSynchronizedStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_tagNameValue <em>Tag Element adapted tag Name Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_tagNameValue
	 * @generated
	 */
	public Adapter createTagElement_adapted_tagNameValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_fragmentsItem <em>Tag Element adapted fragments Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TagElement_adapted_fragmentsItem
	 * @generated
	 */
	public Adapter createTagElement_adapted_fragmentsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TextElement_adapted_textValue <em>Text Element adapted text Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TextElement_adapted_textValue
	 * @generated
	 */
	public Adapter createTextElement_adapted_textValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ThrowStatement_adapted_expressionItem <em>Throw Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.ThrowStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createThrowStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_bodyItem <em>Try Statement adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_bodyItem
	 * @generated
	 */
	public Adapter createTryStatement_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_finallyItem <em>Try Statement adapted finally Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_finallyItem
	 * @generated
	 */
	public Adapter createTryStatement_adapted_finallyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_catchClausesItem <em>Try Statement adapted catch Clauses Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TryStatement_adapted_catchClausesItem
	 * @generated
	 */
	public Adapter createTryStatement_adapted_catchClausesItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Type_adapted_usagesInTypeAccessItem <em>Type adapted usages In Type Access Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Type_adapted_usagesInTypeAccessItem
	 * @generated
	 */
	public Adapter createType_adapted_usagesInTypeAccessItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted_typeItem <em>Type Access adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted_typeItem
	 * @generated
	 */
	public Adapter createTypeAccess_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted_qualifierItem <em>Type Access adapted qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeAccess_adapted_qualifierItem
	 * @generated
	 */
	public Adapter createTypeAccess_adapted_qualifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclaration_adapted_typeParametersItem <em>Type Declaration adapted type Parameters Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclaration_adapted_typeParametersItem
	 * @generated
	 */
	public Adapter createTypeDeclaration_adapted_typeParametersItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclarationStatement_adapted_declarationItem <em>Type Declaration Statement adapted declaration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeDeclarationStatement_adapted_declarationItem
	 * @generated
	 */
	public Adapter createTypeDeclarationStatement_adapted_declarationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeLiteral_adapted_typeItem <em>Type Literal adapted type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeLiteral_adapted_typeItem
	 * @generated
	 */
	public Adapter createTypeLiteral_adapted_typeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeParameter_adapted_boundsItem <em>Type Parameter adapted bounds Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.TypeParameter_adapted_boundsItem
	 * @generated
	 */
	public Adapter createTypeParameter_adapted_boundsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_elementItem <em>Unresolved Item Access adapted element Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_elementItem
	 * @generated
	 */
	public Adapter createUnresolvedItemAccess_adapted_elementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_qualifierItem <em>Unresolved Item Access adapted qualifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.UnresolvedItemAccess_adapted_qualifierItem
	 * @generated
	 */
	public Adapter createUnresolvedItemAccess_adapted_qualifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_extraArrayDimensionsValue <em>Variable Declaration adapted extra Array Dimensions Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_extraArrayDimensionsValue
	 * @generated
	 */
	public Adapter createVariableDeclaration_adapted_extraArrayDimensionsValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_initializerItem <em>Variable Declaration adapted initializer Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_initializerItem
	 * @generated
	 */
	public Adapter createVariableDeclaration_adapted_initializerItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_usageInVariableAccessItem <em>Variable Declaration adapted usage In Variable Access Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclaration_adapted_usageInVariableAccessItem
	 * @generated
	 */
	public Adapter createVariableDeclaration_adapted_usageInVariableAccessItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted_modifierItem <em>Variable Declaration Expression adapted modifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted_modifierItem
	 * @generated
	 */
	public Adapter createVariableDeclarationExpression_adapted_modifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted_annotationsItem <em>Variable Declaration Expression adapted annotations Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationExpression_adapted_annotationsItem
	 * @generated
	 */
	public Adapter createVariableDeclarationExpression_adapted_annotationsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted_variablesContainerItem <em>Variable Declaration Fragment adapted variables Container Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationFragment_adapted_variablesContainerItem
	 * @generated
	 */
	public Adapter createVariableDeclarationFragment_adapted_variablesContainerItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_extraArrayDimensionsValue <em>Variable Declaration Statement adapted extra Array Dimensions Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_extraArrayDimensionsValue
	 * @generated
	 */
	public Adapter createVariableDeclarationStatement_adapted_extraArrayDimensionsValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_modifierItem <em>Variable Declaration Statement adapted modifier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_modifierItem
	 * @generated
	 */
	public Adapter createVariableDeclarationStatement_adapted_modifierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_annotationsItem <em>Variable Declaration Statement adapted annotations Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.VariableDeclarationStatement_adapted_annotationsItem
	 * @generated
	 */
	public Adapter createVariableDeclarationStatement_adapted_annotationsItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_upperBoundValue <em>Wild Card Type adapted upper Bound Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_upperBoundValue
	 * @generated
	 */
	public Adapter createWildCardType_adapted_upperBoundValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_boundItem <em>Wild Card Type adapted bound Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WildCardType_adapted_boundItem
	 * @generated
	 */
	public Adapter createWildCardType_adapted_boundItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WhileStatement_adapted_expressionItem <em>While Statement adapted expression Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WhileStatement_adapted_expressionItem
	 * @generated
	 */
	public Adapter createWhileStatement_adapted_expressionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WhileStatement_adapted_bodyItem <em>While Statement adapted body Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.WhileStatement_adapted_bodyItem
	 * @generated
	 */
	public Adapter createWhileStatement_adapted_bodyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.ElementWithHistory <em>Element With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.ElementWithHistory
	 * @generated
	 */
	public Adapter createElementWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.NodeWithHistory <em>Node With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.NodeWithHistory
	 * @generated
	 */
	public Adapter createNodeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.EdgeWithHistory <em>Edge With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.EdgeWithHistory
	 * @generated
	 */
	public Adapter createEdgeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.ContainmentEdgeWithHistory <em>Containment Edge With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.ContainmentEdgeWithHistory
	 * @generated
	 */
	public Adapter createContainmentEdgeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.mdelab.migmm.history.AttributeWithHistory <em>Attribute With History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.mdelab.migmm.history.AttributeWithHistory
	 * @generated
	 */
	public Adapter createAttributeWithHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Java_adaptedAdapterFactory
