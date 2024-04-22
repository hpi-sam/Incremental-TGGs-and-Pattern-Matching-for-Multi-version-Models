/**
 */
package de.mdelab.migmm.history.modisco.java.adapted.java_adapted.util;

import de.mdelab.migmm.history.AttributeWithHistory;
import de.mdelab.migmm.history.ContainmentEdgeWithHistory;
import de.mdelab.migmm.history.EdgeWithHistory;
import de.mdelab.migmm.history.ElementWithHistory;

import de.mdelab.migmm.history.NodeWithHistory;
import de.mdelab.migmm.history.modisco.java.adapted.java_adapted.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.mdelab.migmm.history.modisco.java.adapted.java_adapted.Java_adaptedPackage
 * @generated
 */
public class Java_adaptedSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Java_adaptedPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Java_adaptedSwitch() {
		if (modelPackage == null) {
			modelPackage = Java_adaptedPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED: {
				AbstractMethodDeclaration_adapted abstractMethodDeclaration_adapted = (AbstractMethodDeclaration_adapted)theEObject;
				T result = caseAbstractMethodDeclaration_adapted(abstractMethodDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(abstractMethodDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(abstractMethodDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(abstractMethodDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(abstractMethodDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(abstractMethodDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED: {
				AbstractMethodInvocation_adapted abstractMethodInvocation_adapted = (AbstractMethodInvocation_adapted)theEObject;
				T result = caseAbstractMethodInvocation_adapted(abstractMethodInvocation_adapted);
				if (result == null) result = caseASTNode_adapted(abstractMethodInvocation_adapted);
				if (result == null) result = caseNodeWithHistory(abstractMethodInvocation_adapted);
				if (result == null) result = caseElementWithHistory(abstractMethodInvocation_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED: {
				AbstractTypeDeclaration_adapted abstractTypeDeclaration_adapted = (AbstractTypeDeclaration_adapted)theEObject;
				T result = caseAbstractTypeDeclaration_adapted(abstractTypeDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(abstractTypeDeclaration_adapted);
				if (result == null) result = caseType_adapted(abstractTypeDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(abstractTypeDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(abstractTypeDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(abstractTypeDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(abstractTypeDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_TYPE_QUALIFIED_EXPRESSION_ADAPTED: {
				AbstractTypeQualifiedExpression_adapted abstractTypeQualifiedExpression_adapted = (AbstractTypeQualifiedExpression_adapted)theEObject;
				T result = caseAbstractTypeQualifiedExpression_adapted(abstractTypeQualifiedExpression_adapted);
				if (result == null) result = caseExpression_adapted(abstractTypeQualifiedExpression_adapted);
				if (result == null) result = caseASTNode_adapted(abstractTypeQualifiedExpression_adapted);
				if (result == null) result = caseNodeWithHistory(abstractTypeQualifiedExpression_adapted);
				if (result == null) result = caseElementWithHistory(abstractTypeQualifiedExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED: {
				AbstractVariablesContainer_adapted abstractVariablesContainer_adapted = (AbstractVariablesContainer_adapted)theEObject;
				T result = caseAbstractVariablesContainer_adapted(abstractVariablesContainer_adapted);
				if (result == null) result = caseASTNode_adapted(abstractVariablesContainer_adapted);
				if (result == null) result = caseNodeWithHistory(abstractVariablesContainer_adapted);
				if (result == null) result = caseElementWithHistory(abstractVariablesContainer_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_ADAPTED: {
				Annotation_adapted annotation_adapted = (Annotation_adapted)theEObject;
				T result = caseAnnotation_adapted(annotation_adapted);
				if (result == null) result = caseExpression_adapted(annotation_adapted);
				if (result == null) result = caseASTNode_adapted(annotation_adapted);
				if (result == null) result = caseNodeWithHistory(annotation_adapted);
				if (result == null) result = caseElementWithHistory(annotation_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARCHIVE_ADAPTED: {
				Archive_adapted archive_adapted = (Archive_adapted)theEObject;
				T result = caseArchive_adapted(archive_adapted);
				if (result == null) result = caseNamedElement_adapted(archive_adapted);
				if (result == null) result = caseASTNode_adapted(archive_adapted);
				if (result == null) result = caseNodeWithHistory(archive_adapted);
				if (result == null) result = caseElementWithHistory(archive_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED: {
				AssertStatement_adapted assertStatement_adapted = (AssertStatement_adapted)theEObject;
				T result = caseAssertStatement_adapted(assertStatement_adapted);
				if (result == null) result = caseStatement_adapted(assertStatement_adapted);
				if (result == null) result = caseASTNode_adapted(assertStatement_adapted);
				if (result == null) result = caseNodeWithHistory(assertStatement_adapted);
				if (result == null) result = caseElementWithHistory(assertStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.AST_NODE_ADAPTED: {
				ASTNode_adapted astNode_adapted = (ASTNode_adapted)theEObject;
				T result = caseASTNode_adapted(astNode_adapted);
				if (result == null) result = caseNodeWithHistory(astNode_adapted);
				if (result == null) result = caseElementWithHistory(astNode_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED: {
				AnnotationMemberValuePair_adapted annotationMemberValuePair_adapted = (AnnotationMemberValuePair_adapted)theEObject;
				T result = caseAnnotationMemberValuePair_adapted(annotationMemberValuePair_adapted);
				if (result == null) result = caseNamedElement_adapted(annotationMemberValuePair_adapted);
				if (result == null) result = caseASTNode_adapted(annotationMemberValuePair_adapted);
				if (result == null) result = caseNodeWithHistory(annotationMemberValuePair_adapted);
				if (result == null) result = caseElementWithHistory(annotationMemberValuePair_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_TYPE_DECLARATION_ADAPTED: {
				AnnotationTypeDeclaration_adapted annotationTypeDeclaration_adapted = (AnnotationTypeDeclaration_adapted)theEObject;
				T result = caseAnnotationTypeDeclaration_adapted(annotationTypeDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(annotationTypeDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(annotationTypeDeclaration_adapted);
				if (result == null) result = caseType_adapted(annotationTypeDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(annotationTypeDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(annotationTypeDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(annotationTypeDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(annotationTypeDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED: {
				AnnotationTypeMemberDeclaration_adapted annotationTypeMemberDeclaration_adapted = (AnnotationTypeMemberDeclaration_adapted)theEObject;
				T result = caseAnnotationTypeMemberDeclaration_adapted(annotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(annotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(annotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(annotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(annotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(annotationTypeMemberDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED: {
				AnonymousClassDeclaration_adapted anonymousClassDeclaration_adapted = (AnonymousClassDeclaration_adapted)theEObject;
				T result = caseAnonymousClassDeclaration_adapted(anonymousClassDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(anonymousClassDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(anonymousClassDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(anonymousClassDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED: {
				ArrayAccess_adapted arrayAccess_adapted = (ArrayAccess_adapted)theEObject;
				T result = caseArrayAccess_adapted(arrayAccess_adapted);
				if (result == null) result = caseExpression_adapted(arrayAccess_adapted);
				if (result == null) result = caseASTNode_adapted(arrayAccess_adapted);
				if (result == null) result = caseNodeWithHistory(arrayAccess_adapted);
				if (result == null) result = caseElementWithHistory(arrayAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED: {
				ArrayCreation_adapted arrayCreation_adapted = (ArrayCreation_adapted)theEObject;
				T result = caseArrayCreation_adapted(arrayCreation_adapted);
				if (result == null) result = caseExpression_adapted(arrayCreation_adapted);
				if (result == null) result = caseASTNode_adapted(arrayCreation_adapted);
				if (result == null) result = caseNodeWithHistory(arrayCreation_adapted);
				if (result == null) result = caseElementWithHistory(arrayCreation_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED: {
				ArrayInitializer_adapted arrayInitializer_adapted = (ArrayInitializer_adapted)theEObject;
				T result = caseArrayInitializer_adapted(arrayInitializer_adapted);
				if (result == null) result = caseExpression_adapted(arrayInitializer_adapted);
				if (result == null) result = caseASTNode_adapted(arrayInitializer_adapted);
				if (result == null) result = caseNodeWithHistory(arrayInitializer_adapted);
				if (result == null) result = caseElementWithHistory(arrayInitializer_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED: {
				ArrayLengthAccess_adapted arrayLengthAccess_adapted = (ArrayLengthAccess_adapted)theEObject;
				T result = caseArrayLengthAccess_adapted(arrayLengthAccess_adapted);
				if (result == null) result = caseExpression_adapted(arrayLengthAccess_adapted);
				if (result == null) result = caseASTNode_adapted(arrayLengthAccess_adapted);
				if (result == null) result = caseNodeWithHistory(arrayLengthAccess_adapted);
				if (result == null) result = caseElementWithHistory(arrayLengthAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED: {
				ArrayType_adapted arrayType_adapted = (ArrayType_adapted)theEObject;
				T result = caseArrayType_adapted(arrayType_adapted);
				if (result == null) result = caseType_adapted(arrayType_adapted);
				if (result == null) result = caseNamedElement_adapted(arrayType_adapted);
				if (result == null) result = caseASTNode_adapted(arrayType_adapted);
				if (result == null) result = caseNodeWithHistory(arrayType_adapted);
				if (result == null) result = caseElementWithHistory(arrayType_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED: {
				Assignment_adapted assignment_adapted = (Assignment_adapted)theEObject;
				T result = caseAssignment_adapted(assignment_adapted);
				if (result == null) result = caseExpression_adapted(assignment_adapted);
				if (result == null) result = caseASTNode_adapted(assignment_adapted);
				if (result == null) result = caseNodeWithHistory(assignment_adapted);
				if (result == null) result = caseElementWithHistory(assignment_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED: {
				BodyDeclaration_adapted bodyDeclaration_adapted = (BodyDeclaration_adapted)theEObject;
				T result = caseBodyDeclaration_adapted(bodyDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(bodyDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(bodyDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(bodyDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(bodyDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BOOLEAN_LITERAL_ADAPTED: {
				BooleanLiteral_adapted booleanLiteral_adapted = (BooleanLiteral_adapted)theEObject;
				T result = caseBooleanLiteral_adapted(booleanLiteral_adapted);
				if (result == null) result = caseExpression_adapted(booleanLiteral_adapted);
				if (result == null) result = caseASTNode_adapted(booleanLiteral_adapted);
				if (result == null) result = caseNodeWithHistory(booleanLiteral_adapted);
				if (result == null) result = caseElementWithHistory(booleanLiteral_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BLOCK_COMMENT_ADAPTED: {
				BlockComment_adapted blockComment_adapted = (BlockComment_adapted)theEObject;
				T result = caseBlockComment_adapted(blockComment_adapted);
				if (result == null) result = caseComment_adapted(blockComment_adapted);
				if (result == null) result = caseASTNode_adapted(blockComment_adapted);
				if (result == null) result = caseNodeWithHistory(blockComment_adapted);
				if (result == null) result = caseElementWithHistory(blockComment_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BLOCK_ADAPTED: {
				Block_adapted block_adapted = (Block_adapted)theEObject;
				T result = caseBlock_adapted(block_adapted);
				if (result == null) result = caseStatement_adapted(block_adapted);
				if (result == null) result = caseASTNode_adapted(block_adapted);
				if (result == null) result = caseNodeWithHistory(block_adapted);
				if (result == null) result = caseElementWithHistory(block_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BREAK_STATEMENT_ADAPTED: {
				BreakStatement_adapted breakStatement_adapted = (BreakStatement_adapted)theEObject;
				T result = caseBreakStatement_adapted(breakStatement_adapted);
				if (result == null) result = caseStatement_adapted(breakStatement_adapted);
				if (result == null) result = caseASTNode_adapted(breakStatement_adapted);
				if (result == null) result = caseNodeWithHistory(breakStatement_adapted);
				if (result == null) result = caseElementWithHistory(breakStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED: {
				CastExpression_adapted castExpression_adapted = (CastExpression_adapted)theEObject;
				T result = caseCastExpression_adapted(castExpression_adapted);
				if (result == null) result = caseExpression_adapted(castExpression_adapted);
				if (result == null) result = caseASTNode_adapted(castExpression_adapted);
				if (result == null) result = caseNodeWithHistory(castExpression_adapted);
				if (result == null) result = caseElementWithHistory(castExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED: {
				CatchClause_adapted catchClause_adapted = (CatchClause_adapted)theEObject;
				T result = caseCatchClause_adapted(catchClause_adapted);
				if (result == null) result = caseStatement_adapted(catchClause_adapted);
				if (result == null) result = caseASTNode_adapted(catchClause_adapted);
				if (result == null) result = caseNodeWithHistory(catchClause_adapted);
				if (result == null) result = caseElementWithHistory(catchClause_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CHARACTER_LITERAL_ADAPTED: {
				CharacterLiteral_adapted characterLiteral_adapted = (CharacterLiteral_adapted)theEObject;
				T result = caseCharacterLiteral_adapted(characterLiteral_adapted);
				if (result == null) result = caseExpression_adapted(characterLiteral_adapted);
				if (result == null) result = caseASTNode_adapted(characterLiteral_adapted);
				if (result == null) result = caseNodeWithHistory(characterLiteral_adapted);
				if (result == null) result = caseElementWithHistory(characterLiteral_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_FILE_ADAPTED: {
				ClassFile_adapted classFile_adapted = (ClassFile_adapted)theEObject;
				T result = caseClassFile_adapted(classFile_adapted);
				if (result == null) result = caseNamedElement_adapted(classFile_adapted);
				if (result == null) result = caseASTNode_adapted(classFile_adapted);
				if (result == null) result = caseNodeWithHistory(classFile_adapted);
				if (result == null) result = caseElementWithHistory(classFile_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED: {
				ClassInstanceCreation_adapted classInstanceCreation_adapted = (ClassInstanceCreation_adapted)theEObject;
				T result = caseClassInstanceCreation_adapted(classInstanceCreation_adapted);
				if (result == null) result = caseExpression_adapted(classInstanceCreation_adapted);
				if (result == null) result = caseAbstractMethodInvocation_adapted(classInstanceCreation_adapted);
				if (result == null) result = caseASTNode_adapted(classInstanceCreation_adapted);
				if (result == null) result = caseNodeWithHistory(classInstanceCreation_adapted);
				if (result == null) result = caseElementWithHistory(classInstanceCreation_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CONSTRUCTOR_DECLARATION_ADAPTED: {
				ConstructorDeclaration_adapted constructorDeclaration_adapted = (ConstructorDeclaration_adapted)theEObject;
				T result = caseConstructorDeclaration_adapted(constructorDeclaration_adapted);
				if (result == null) result = caseAbstractMethodDeclaration_adapted(constructorDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(constructorDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(constructorDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(constructorDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(constructorDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(constructorDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED: {
				ConditionalExpression_adapted conditionalExpression_adapted = (ConditionalExpression_adapted)theEObject;
				T result = caseConditionalExpression_adapted(conditionalExpression_adapted);
				if (result == null) result = caseExpression_adapted(conditionalExpression_adapted);
				if (result == null) result = caseASTNode_adapted(conditionalExpression_adapted);
				if (result == null) result = caseNodeWithHistory(conditionalExpression_adapted);
				if (result == null) result = caseElementWithHistory(conditionalExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CONSTRUCTOR_INVOCATION_ADAPTED: {
				ConstructorInvocation_adapted constructorInvocation_adapted = (ConstructorInvocation_adapted)theEObject;
				T result = caseConstructorInvocation_adapted(constructorInvocation_adapted);
				if (result == null) result = caseStatement_adapted(constructorInvocation_adapted);
				if (result == null) result = caseAbstractMethodInvocation_adapted(constructorInvocation_adapted);
				if (result == null) result = caseASTNode_adapted(constructorInvocation_adapted);
				if (result == null) result = caseNodeWithHistory(constructorInvocation_adapted);
				if (result == null) result = caseElementWithHistory(constructorInvocation_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_DECLARATION_ADAPTED: {
				ClassDeclaration_adapted classDeclaration_adapted = (ClassDeclaration_adapted)theEObject;
				T result = caseClassDeclaration_adapted(classDeclaration_adapted);
				if (result == null) result = caseTypeDeclaration_adapted(classDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(classDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(classDeclaration_adapted);
				if (result == null) result = caseType_adapted(classDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(classDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(classDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(classDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(classDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMMENT_ADAPTED: {
				Comment_adapted comment_adapted = (Comment_adapted)theEObject;
				T result = caseComment_adapted(comment_adapted);
				if (result == null) result = caseASTNode_adapted(comment_adapted);
				if (result == null) result = caseNodeWithHistory(comment_adapted);
				if (result == null) result = caseElementWithHistory(comment_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED: {
				CompilationUnit_adapted compilationUnit_adapted = (CompilationUnit_adapted)theEObject;
				T result = caseCompilationUnit_adapted(compilationUnit_adapted);
				if (result == null) result = caseNamedElement_adapted(compilationUnit_adapted);
				if (result == null) result = caseASTNode_adapted(compilationUnit_adapted);
				if (result == null) result = caseNodeWithHistory(compilationUnit_adapted);
				if (result == null) result = caseElementWithHistory(compilationUnit_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CONTINUE_STATEMENT_ADAPTED: {
				ContinueStatement_adapted continueStatement_adapted = (ContinueStatement_adapted)theEObject;
				T result = caseContinueStatement_adapted(continueStatement_adapted);
				if (result == null) result = caseStatement_adapted(continueStatement_adapted);
				if (result == null) result = caseASTNode_adapted(continueStatement_adapted);
				if (result == null) result = caseNodeWithHistory(continueStatement_adapted);
				if (result == null) result = caseElementWithHistory(continueStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.DO_STATEMENT_ADAPTED: {
				DoStatement_adapted doStatement_adapted = (DoStatement_adapted)theEObject;
				T result = caseDoStatement_adapted(doStatement_adapted);
				if (result == null) result = caseStatement_adapted(doStatement_adapted);
				if (result == null) result = caseASTNode_adapted(doStatement_adapted);
				if (result == null) result = caseNodeWithHistory(doStatement_adapted);
				if (result == null) result = caseElementWithHistory(doStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.EMPTY_STATEMENT_ADAPTED: {
				EmptyStatement_adapted emptyStatement_adapted = (EmptyStatement_adapted)theEObject;
				T result = caseEmptyStatement_adapted(emptyStatement_adapted);
				if (result == null) result = caseStatement_adapted(emptyStatement_adapted);
				if (result == null) result = caseASTNode_adapted(emptyStatement_adapted);
				if (result == null) result = caseNodeWithHistory(emptyStatement_adapted);
				if (result == null) result = caseElementWithHistory(emptyStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENHANCED_FOR_STATEMENT_ADAPTED: {
				EnhancedForStatement_adapted enhancedForStatement_adapted = (EnhancedForStatement_adapted)theEObject;
				T result = caseEnhancedForStatement_adapted(enhancedForStatement_adapted);
				if (result == null) result = caseStatement_adapted(enhancedForStatement_adapted);
				if (result == null) result = caseASTNode_adapted(enhancedForStatement_adapted);
				if (result == null) result = caseNodeWithHistory(enhancedForStatement_adapted);
				if (result == null) result = caseElementWithHistory(enhancedForStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED: {
				EnumConstantDeclaration_adapted enumConstantDeclaration_adapted = (EnumConstantDeclaration_adapted)theEObject;
				T result = caseEnumConstantDeclaration_adapted(enumConstantDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(enumConstantDeclaration_adapted);
				if (result == null) result = caseVariableDeclaration_adapted(enumConstantDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(enumConstantDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(enumConstantDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(enumConstantDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(enumConstantDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED: {
				EnumDeclaration_adapted enumDeclaration_adapted = (EnumDeclaration_adapted)theEObject;
				T result = caseEnumDeclaration_adapted(enumDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(enumDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(enumDeclaration_adapted);
				if (result == null) result = caseType_adapted(enumDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(enumDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(enumDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(enumDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(enumDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.EXPRESSION_ADAPTED: {
				Expression_adapted expression_adapted = (Expression_adapted)theEObject;
				T result = caseExpression_adapted(expression_adapted);
				if (result == null) result = caseASTNode_adapted(expression_adapted);
				if (result == null) result = caseNodeWithHistory(expression_adapted);
				if (result == null) result = caseElementWithHistory(expression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.EXPRESSION_STATEMENT_ADAPTED: {
				ExpressionStatement_adapted expressionStatement_adapted = (ExpressionStatement_adapted)theEObject;
				T result = caseExpressionStatement_adapted(expressionStatement_adapted);
				if (result == null) result = caseStatement_adapted(expressionStatement_adapted);
				if (result == null) result = caseASTNode_adapted(expressionStatement_adapted);
				if (result == null) result = caseNodeWithHistory(expressionStatement_adapted);
				if (result == null) result = caseElementWithHistory(expressionStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED: {
				FieldAccess_adapted fieldAccess_adapted = (FieldAccess_adapted)theEObject;
				T result = caseFieldAccess_adapted(fieldAccess_adapted);
				if (result == null) result = caseExpression_adapted(fieldAccess_adapted);
				if (result == null) result = caseASTNode_adapted(fieldAccess_adapted);
				if (result == null) result = caseNodeWithHistory(fieldAccess_adapted);
				if (result == null) result = caseElementWithHistory(fieldAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FIELD_DECLARATION_ADAPTED: {
				FieldDeclaration_adapted fieldDeclaration_adapted = (FieldDeclaration_adapted)theEObject;
				T result = caseFieldDeclaration_adapted(fieldDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(fieldDeclaration_adapted);
				if (result == null) result = caseAbstractVariablesContainer_adapted(fieldDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(fieldDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(fieldDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(fieldDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(fieldDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED: {
				ForStatement_adapted forStatement_adapted = (ForStatement_adapted)theEObject;
				T result = caseForStatement_adapted(forStatement_adapted);
				if (result == null) result = caseStatement_adapted(forStatement_adapted);
				if (result == null) result = caseASTNode_adapted(forStatement_adapted);
				if (result == null) result = caseNodeWithHistory(forStatement_adapted);
				if (result == null) result = caseElementWithHistory(forStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED: {
				IfStatement_adapted ifStatement_adapted = (IfStatement_adapted)theEObject;
				T result = caseIfStatement_adapted(ifStatement_adapted);
				if (result == null) result = caseStatement_adapted(ifStatement_adapted);
				if (result == null) result = caseASTNode_adapted(ifStatement_adapted);
				if (result == null) result = caseNodeWithHistory(ifStatement_adapted);
				if (result == null) result = caseElementWithHistory(ifStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED: {
				ImportDeclaration_adapted importDeclaration_adapted = (ImportDeclaration_adapted)theEObject;
				T result = caseImportDeclaration_adapted(importDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(importDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(importDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(importDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED: {
				InfixExpression_adapted infixExpression_adapted = (InfixExpression_adapted)theEObject;
				T result = caseInfixExpression_adapted(infixExpression_adapted);
				if (result == null) result = caseExpression_adapted(infixExpression_adapted);
				if (result == null) result = caseASTNode_adapted(infixExpression_adapted);
				if (result == null) result = caseNodeWithHistory(infixExpression_adapted);
				if (result == null) result = caseElementWithHistory(infixExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INITIALIZER_ADAPTED: {
				Initializer_adapted initializer_adapted = (Initializer_adapted)theEObject;
				T result = caseInitializer_adapted(initializer_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(initializer_adapted);
				if (result == null) result = caseNamedElement_adapted(initializer_adapted);
				if (result == null) result = caseASTNode_adapted(initializer_adapted);
				if (result == null) result = caseNodeWithHistory(initializer_adapted);
				if (result == null) result = caseElementWithHistory(initializer_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED: {
				InstanceofExpression_adapted instanceofExpression_adapted = (InstanceofExpression_adapted)theEObject;
				T result = caseInstanceofExpression_adapted(instanceofExpression_adapted);
				if (result == null) result = caseExpression_adapted(instanceofExpression_adapted);
				if (result == null) result = caseASTNode_adapted(instanceofExpression_adapted);
				if (result == null) result = caseNodeWithHistory(instanceofExpression_adapted);
				if (result == null) result = caseElementWithHistory(instanceofExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INTERFACE_DECLARATION_ADAPTED: {
				InterfaceDeclaration_adapted interfaceDeclaration_adapted = (InterfaceDeclaration_adapted)theEObject;
				T result = caseInterfaceDeclaration_adapted(interfaceDeclaration_adapted);
				if (result == null) result = caseTypeDeclaration_adapted(interfaceDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(interfaceDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(interfaceDeclaration_adapted);
				if (result == null) result = caseType_adapted(interfaceDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(interfaceDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(interfaceDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(interfaceDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(interfaceDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.JAVADOC_ADAPTED: {
				Javadoc_adapted javadoc_adapted = (Javadoc_adapted)theEObject;
				T result = caseJavadoc_adapted(javadoc_adapted);
				if (result == null) result = caseComment_adapted(javadoc_adapted);
				if (result == null) result = caseASTNode_adapted(javadoc_adapted);
				if (result == null) result = caseNodeWithHistory(javadoc_adapted);
				if (result == null) result = caseElementWithHistory(javadoc_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED: {
				LabeledStatement_adapted labeledStatement_adapted = (LabeledStatement_adapted)theEObject;
				T result = caseLabeledStatement_adapted(labeledStatement_adapted);
				if (result == null) result = caseNamedElement_adapted(labeledStatement_adapted);
				if (result == null) result = caseStatement_adapted(labeledStatement_adapted);
				if (result == null) result = caseASTNode_adapted(labeledStatement_adapted);
				if (result == null) result = caseNodeWithHistory(labeledStatement_adapted);
				if (result == null) result = caseElementWithHistory(labeledStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.LINE_COMMENT_ADAPTED: {
				LineComment_adapted lineComment_adapted = (LineComment_adapted)theEObject;
				T result = caseLineComment_adapted(lineComment_adapted);
				if (result == null) result = caseComment_adapted(lineComment_adapted);
				if (result == null) result = caseASTNode_adapted(lineComment_adapted);
				if (result == null) result = caseNodeWithHistory(lineComment_adapted);
				if (result == null) result = caseElementWithHistory(lineComment_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ADAPTED: {
				Manifest_adapted manifest_adapted = (Manifest_adapted)theEObject;
				T result = caseManifest_adapted(manifest_adapted);
				if (result == null) result = caseNodeWithHistory(manifest_adapted);
				if (result == null) result = caseElementWithHistory(manifest_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED: {
				ManifestAttribute_adapted manifestAttribute_adapted = (ManifestAttribute_adapted)theEObject;
				T result = caseManifestAttribute_adapted(manifestAttribute_adapted);
				if (result == null) result = caseNodeWithHistory(manifestAttribute_adapted);
				if (result == null) result = caseElementWithHistory(manifestAttribute_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED: {
				ManifestEntry_adapted manifestEntry_adapted = (ManifestEntry_adapted)theEObject;
				T result = caseManifestEntry_adapted(manifestEntry_adapted);
				if (result == null) result = caseNodeWithHistory(manifestEntry_adapted);
				if (result == null) result = caseElementWithHistory(manifestEntry_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MEMBER_REF_ADAPTED: {
				MemberRef_adapted memberRef_adapted = (MemberRef_adapted)theEObject;
				T result = caseMemberRef_adapted(memberRef_adapted);
				if (result == null) result = caseASTNode_adapted(memberRef_adapted);
				if (result == null) result = caseNodeWithHistory(memberRef_adapted);
				if (result == null) result = caseElementWithHistory(memberRef_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED: {
				MethodDeclaration_adapted methodDeclaration_adapted = (MethodDeclaration_adapted)theEObject;
				T result = caseMethodDeclaration_adapted(methodDeclaration_adapted);
				if (result == null) result = caseAbstractMethodDeclaration_adapted(methodDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(methodDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(methodDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(methodDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(methodDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(methodDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_INVOCATION_ADAPTED: {
				MethodInvocation_adapted methodInvocation_adapted = (MethodInvocation_adapted)theEObject;
				T result = caseMethodInvocation_adapted(methodInvocation_adapted);
				if (result == null) result = caseExpression_adapted(methodInvocation_adapted);
				if (result == null) result = caseAbstractMethodInvocation_adapted(methodInvocation_adapted);
				if (result == null) result = caseASTNode_adapted(methodInvocation_adapted);
				if (result == null) result = caseNodeWithHistory(methodInvocation_adapted);
				if (result == null) result = caseElementWithHistory(methodInvocation_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_REF_ADAPTED: {
				MethodRef_adapted methodRef_adapted = (MethodRef_adapted)theEObject;
				T result = caseMethodRef_adapted(methodRef_adapted);
				if (result == null) result = caseASTNode_adapted(methodRef_adapted);
				if (result == null) result = caseNodeWithHistory(methodRef_adapted);
				if (result == null) result = caseElementWithHistory(methodRef_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED: {
				MethodRefParameter_adapted methodRefParameter_adapted = (MethodRefParameter_adapted)theEObject;
				T result = caseMethodRefParameter_adapted(methodRefParameter_adapted);
				if (result == null) result = caseASTNode_adapted(methodRefParameter_adapted);
				if (result == null) result = caseNodeWithHistory(methodRefParameter_adapted);
				if (result == null) result = caseElementWithHistory(methodRefParameter_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODEL_ADAPTED: {
				Model_adapted model_adapted = (Model_adapted)theEObject;
				T result = caseModel_adapted(model_adapted);
				if (result == null) result = caseNodeWithHistory(model_adapted);
				if (result == null) result = caseElementWithHistory(model_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED: {
				Modifier_adapted modifier_adapted = (Modifier_adapted)theEObject;
				T result = caseModifier_adapted(modifier_adapted);
				if (result == null) result = caseASTNode_adapted(modifier_adapted);
				if (result == null) result = caseNodeWithHistory(modifier_adapted);
				if (result == null) result = caseElementWithHistory(modifier_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED: {
				NamedElement_adapted namedElement_adapted = (NamedElement_adapted)theEObject;
				T result = caseNamedElement_adapted(namedElement_adapted);
				if (result == null) result = caseASTNode_adapted(namedElement_adapted);
				if (result == null) result = caseNodeWithHistory(namedElement_adapted);
				if (result == null) result = caseElementWithHistory(namedElement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.NAMESPACE_ACCESS_ADAPTED: {
				NamespaceAccess_adapted namespaceAccess_adapted = (NamespaceAccess_adapted)theEObject;
				T result = caseNamespaceAccess_adapted(namespaceAccess_adapted);
				if (result == null) result = caseASTNode_adapted(namespaceAccess_adapted);
				if (result == null) result = caseNodeWithHistory(namespaceAccess_adapted);
				if (result == null) result = caseElementWithHistory(namespaceAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.NUMBER_LITERAL_ADAPTED: {
				NumberLiteral_adapted numberLiteral_adapted = (NumberLiteral_adapted)theEObject;
				T result = caseNumberLiteral_adapted(numberLiteral_adapted);
				if (result == null) result = caseExpression_adapted(numberLiteral_adapted);
				if (result == null) result = caseASTNode_adapted(numberLiteral_adapted);
				if (result == null) result = caseNodeWithHistory(numberLiteral_adapted);
				if (result == null) result = caseElementWithHistory(numberLiteral_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.NULL_LITERAL_ADAPTED: {
				NullLiteral_adapted nullLiteral_adapted = (NullLiteral_adapted)theEObject;
				T result = caseNullLiteral_adapted(nullLiteral_adapted);
				if (result == null) result = caseExpression_adapted(nullLiteral_adapted);
				if (result == null) result = caseASTNode_adapted(nullLiteral_adapted);
				if (result == null) result = caseNodeWithHistory(nullLiteral_adapted);
				if (result == null) result = caseElementWithHistory(nullLiteral_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ADAPTED: {
				Package_adapted package_adapted = (Package_adapted)theEObject;
				T result = casePackage_adapted(package_adapted);
				if (result == null) result = caseNamedElement_adapted(package_adapted);
				if (result == null) result = caseASTNode_adapted(package_adapted);
				if (result == null) result = caseNodeWithHistory(package_adapted);
				if (result == null) result = caseElementWithHistory(package_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED: {
				PackageAccess_adapted packageAccess_adapted = (PackageAccess_adapted)theEObject;
				T result = casePackageAccess_adapted(packageAccess_adapted);
				if (result == null) result = caseNamespaceAccess_adapted(packageAccess_adapted);
				if (result == null) result = caseASTNode_adapted(packageAccess_adapted);
				if (result == null) result = caseNodeWithHistory(packageAccess_adapted);
				if (result == null) result = caseElementWithHistory(packageAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED: {
				ParameterizedType_adapted parameterizedType_adapted = (ParameterizedType_adapted)theEObject;
				T result = caseParameterizedType_adapted(parameterizedType_adapted);
				if (result == null) result = caseType_adapted(parameterizedType_adapted);
				if (result == null) result = caseNamedElement_adapted(parameterizedType_adapted);
				if (result == null) result = caseASTNode_adapted(parameterizedType_adapted);
				if (result == null) result = caseNodeWithHistory(parameterizedType_adapted);
				if (result == null) result = caseElementWithHistory(parameterizedType_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PARENTHESIZED_EXPRESSION_ADAPTED: {
				ParenthesizedExpression_adapted parenthesizedExpression_adapted = (ParenthesizedExpression_adapted)theEObject;
				T result = caseParenthesizedExpression_adapted(parenthesizedExpression_adapted);
				if (result == null) result = caseExpression_adapted(parenthesizedExpression_adapted);
				if (result == null) result = caseASTNode_adapted(parenthesizedExpression_adapted);
				if (result == null) result = caseNodeWithHistory(parenthesizedExpression_adapted);
				if (result == null) result = caseElementWithHistory(parenthesizedExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED: {
				PostfixExpression_adapted postfixExpression_adapted = (PostfixExpression_adapted)theEObject;
				T result = casePostfixExpression_adapted(postfixExpression_adapted);
				if (result == null) result = caseExpression_adapted(postfixExpression_adapted);
				if (result == null) result = caseASTNode_adapted(postfixExpression_adapted);
				if (result == null) result = caseNodeWithHistory(postfixExpression_adapted);
				if (result == null) result = caseElementWithHistory(postfixExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PREFIX_EXPRESSION_ADAPTED: {
				PrefixExpression_adapted prefixExpression_adapted = (PrefixExpression_adapted)theEObject;
				T result = casePrefixExpression_adapted(prefixExpression_adapted);
				if (result == null) result = caseExpression_adapted(prefixExpression_adapted);
				if (result == null) result = caseASTNode_adapted(prefixExpression_adapted);
				if (result == null) result = caseNodeWithHistory(prefixExpression_adapted);
				if (result == null) result = caseElementWithHistory(prefixExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_ADAPTED: {
				PrimitiveType_adapted primitiveType_adapted = (PrimitiveType_adapted)theEObject;
				T result = casePrimitiveType_adapted(primitiveType_adapted);
				if (result == null) result = caseType_adapted(primitiveType_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveType_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveType_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveType_adapted);
				if (result == null) result = caseElementWithHistory(primitiveType_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_BOOLEAN_ADAPTED: {
				PrimitiveTypeBoolean_adapted primitiveTypeBoolean_adapted = (PrimitiveTypeBoolean_adapted)theEObject;
				T result = casePrimitiveTypeBoolean_adapted(primitiveTypeBoolean_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeBoolean_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeBoolean_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeBoolean_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeBoolean_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeBoolean_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeBoolean_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_BYTE_ADAPTED: {
				PrimitiveTypeByte_adapted primitiveTypeByte_adapted = (PrimitiveTypeByte_adapted)theEObject;
				T result = casePrimitiveTypeByte_adapted(primitiveTypeByte_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeByte_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeByte_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeByte_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeByte_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeByte_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeByte_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_CHAR_ADAPTED: {
				PrimitiveTypeChar_adapted primitiveTypeChar_adapted = (PrimitiveTypeChar_adapted)theEObject;
				T result = casePrimitiveTypeChar_adapted(primitiveTypeChar_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeChar_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeChar_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeChar_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeChar_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeChar_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeChar_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_DOUBLE_ADAPTED: {
				PrimitiveTypeDouble_adapted primitiveTypeDouble_adapted = (PrimitiveTypeDouble_adapted)theEObject;
				T result = casePrimitiveTypeDouble_adapted(primitiveTypeDouble_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeDouble_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeDouble_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeDouble_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeDouble_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeDouble_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeDouble_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_SHORT_ADAPTED: {
				PrimitiveTypeShort_adapted primitiveTypeShort_adapted = (PrimitiveTypeShort_adapted)theEObject;
				T result = casePrimitiveTypeShort_adapted(primitiveTypeShort_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeShort_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeShort_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeShort_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeShort_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeShort_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeShort_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_FLOAT_ADAPTED: {
				PrimitiveTypeFloat_adapted primitiveTypeFloat_adapted = (PrimitiveTypeFloat_adapted)theEObject;
				T result = casePrimitiveTypeFloat_adapted(primitiveTypeFloat_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeFloat_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeFloat_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeFloat_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeFloat_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeFloat_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeFloat_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_INT_ADAPTED: {
				PrimitiveTypeInt_adapted primitiveTypeInt_adapted = (PrimitiveTypeInt_adapted)theEObject;
				T result = casePrimitiveTypeInt_adapted(primitiveTypeInt_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeInt_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeInt_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeInt_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeInt_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeInt_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeInt_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_LONG_ADAPTED: {
				PrimitiveTypeLong_adapted primitiveTypeLong_adapted = (PrimitiveTypeLong_adapted)theEObject;
				T result = casePrimitiveTypeLong_adapted(primitiveTypeLong_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeLong_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeLong_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeLong_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeLong_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeLong_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeLong_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PRIMITIVE_TYPE_VOID_ADAPTED: {
				PrimitiveTypeVoid_adapted primitiveTypeVoid_adapted = (PrimitiveTypeVoid_adapted)theEObject;
				T result = casePrimitiveTypeVoid_adapted(primitiveTypeVoid_adapted);
				if (result == null) result = casePrimitiveType_adapted(primitiveTypeVoid_adapted);
				if (result == null) result = caseType_adapted(primitiveTypeVoid_adapted);
				if (result == null) result = caseNamedElement_adapted(primitiveTypeVoid_adapted);
				if (result == null) result = caseASTNode_adapted(primitiveTypeVoid_adapted);
				if (result == null) result = caseNodeWithHistory(primitiveTypeVoid_adapted);
				if (result == null) result = caseElementWithHistory(primitiveTypeVoid_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.RETURN_STATEMENT_ADAPTED: {
				ReturnStatement_adapted returnStatement_adapted = (ReturnStatement_adapted)theEObject;
				T result = caseReturnStatement_adapted(returnStatement_adapted);
				if (result == null) result = caseStatement_adapted(returnStatement_adapted);
				if (result == null) result = caseASTNode_adapted(returnStatement_adapted);
				if (result == null) result = caseNodeWithHistory(returnStatement_adapted);
				if (result == null) result = caseElementWithHistory(returnStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED: {
				SingleVariableAccess_adapted singleVariableAccess_adapted = (SingleVariableAccess_adapted)theEObject;
				T result = caseSingleVariableAccess_adapted(singleVariableAccess_adapted);
				if (result == null) result = caseExpression_adapted(singleVariableAccess_adapted);
				if (result == null) result = caseASTNode_adapted(singleVariableAccess_adapted);
				if (result == null) result = caseNodeWithHistory(singleVariableAccess_adapted);
				if (result == null) result = caseElementWithHistory(singleVariableAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED: {
				SingleVariableDeclaration_adapted singleVariableDeclaration_adapted = (SingleVariableDeclaration_adapted)theEObject;
				T result = caseSingleVariableDeclaration_adapted(singleVariableDeclaration_adapted);
				if (result == null) result = caseVariableDeclaration_adapted(singleVariableDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(singleVariableDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(singleVariableDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(singleVariableDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(singleVariableDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.STATEMENT_ADAPTED: {
				Statement_adapted statement_adapted = (Statement_adapted)theEObject;
				T result = caseStatement_adapted(statement_adapted);
				if (result == null) result = caseASTNode_adapted(statement_adapted);
				if (result == null) result = caseNodeWithHistory(statement_adapted);
				if (result == null) result = caseElementWithHistory(statement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.STRING_LITERAL_ADAPTED: {
				StringLiteral_adapted stringLiteral_adapted = (StringLiteral_adapted)theEObject;
				T result = caseStringLiteral_adapted(stringLiteral_adapted);
				if (result == null) result = caseExpression_adapted(stringLiteral_adapted);
				if (result == null) result = caseASTNode_adapted(stringLiteral_adapted);
				if (result == null) result = caseNodeWithHistory(stringLiteral_adapted);
				if (result == null) result = caseElementWithHistory(stringLiteral_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SUPER_CONSTRUCTOR_INVOCATION_ADAPTED: {
				SuperConstructorInvocation_adapted superConstructorInvocation_adapted = (SuperConstructorInvocation_adapted)theEObject;
				T result = caseSuperConstructorInvocation_adapted(superConstructorInvocation_adapted);
				if (result == null) result = caseStatement_adapted(superConstructorInvocation_adapted);
				if (result == null) result = caseAbstractMethodInvocation_adapted(superConstructorInvocation_adapted);
				if (result == null) result = caseASTNode_adapted(superConstructorInvocation_adapted);
				if (result == null) result = caseNodeWithHistory(superConstructorInvocation_adapted);
				if (result == null) result = caseElementWithHistory(superConstructorInvocation_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SUPER_FIELD_ACCESS_ADAPTED: {
				SuperFieldAccess_adapted superFieldAccess_adapted = (SuperFieldAccess_adapted)theEObject;
				T result = caseSuperFieldAccess_adapted(superFieldAccess_adapted);
				if (result == null) result = caseAbstractTypeQualifiedExpression_adapted(superFieldAccess_adapted);
				if (result == null) result = caseExpression_adapted(superFieldAccess_adapted);
				if (result == null) result = caseASTNode_adapted(superFieldAccess_adapted);
				if (result == null) result = caseNodeWithHistory(superFieldAccess_adapted);
				if (result == null) result = caseElementWithHistory(superFieldAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SUPER_METHOD_INVOCATION_ADAPTED: {
				SuperMethodInvocation_adapted superMethodInvocation_adapted = (SuperMethodInvocation_adapted)theEObject;
				T result = caseSuperMethodInvocation_adapted(superMethodInvocation_adapted);
				if (result == null) result = caseAbstractTypeQualifiedExpression_adapted(superMethodInvocation_adapted);
				if (result == null) result = caseAbstractMethodInvocation_adapted(superMethodInvocation_adapted);
				if (result == null) result = caseExpression_adapted(superMethodInvocation_adapted);
				if (result == null) result = caseASTNode_adapted(superMethodInvocation_adapted);
				if (result == null) result = caseNodeWithHistory(superMethodInvocation_adapted);
				if (result == null) result = caseElementWithHistory(superMethodInvocation_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED: {
				SwitchCase_adapted switchCase_adapted = (SwitchCase_adapted)theEObject;
				T result = caseSwitchCase_adapted(switchCase_adapted);
				if (result == null) result = caseStatement_adapted(switchCase_adapted);
				if (result == null) result = caseASTNode_adapted(switchCase_adapted);
				if (result == null) result = caseNodeWithHistory(switchCase_adapted);
				if (result == null) result = caseElementWithHistory(switchCase_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED: {
				SwitchStatement_adapted switchStatement_adapted = (SwitchStatement_adapted)theEObject;
				T result = caseSwitchStatement_adapted(switchStatement_adapted);
				if (result == null) result = caseStatement_adapted(switchStatement_adapted);
				if (result == null) result = caseASTNode_adapted(switchStatement_adapted);
				if (result == null) result = caseNodeWithHistory(switchStatement_adapted);
				if (result == null) result = caseElementWithHistory(switchStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED: {
				SynchronizedStatement_adapted synchronizedStatement_adapted = (SynchronizedStatement_adapted)theEObject;
				T result = caseSynchronizedStatement_adapted(synchronizedStatement_adapted);
				if (result == null) result = caseStatement_adapted(synchronizedStatement_adapted);
				if (result == null) result = caseASTNode_adapted(synchronizedStatement_adapted);
				if (result == null) result = caseNodeWithHistory(synchronizedStatement_adapted);
				if (result == null) result = caseElementWithHistory(synchronizedStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED: {
				TagElement_adapted tagElement_adapted = (TagElement_adapted)theEObject;
				T result = caseTagElement_adapted(tagElement_adapted);
				if (result == null) result = caseASTNode_adapted(tagElement_adapted);
				if (result == null) result = caseNodeWithHistory(tagElement_adapted);
				if (result == null) result = caseElementWithHistory(tagElement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TEXT_ELEMENT_ADAPTED: {
				TextElement_adapted textElement_adapted = (TextElement_adapted)theEObject;
				T result = caseTextElement_adapted(textElement_adapted);
				if (result == null) result = caseASTNode_adapted(textElement_adapted);
				if (result == null) result = caseNodeWithHistory(textElement_adapted);
				if (result == null) result = caseElementWithHistory(textElement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.THIS_EXPRESSION_ADAPTED: {
				ThisExpression_adapted thisExpression_adapted = (ThisExpression_adapted)theEObject;
				T result = caseThisExpression_adapted(thisExpression_adapted);
				if (result == null) result = caseAbstractTypeQualifiedExpression_adapted(thisExpression_adapted);
				if (result == null) result = caseExpression_adapted(thisExpression_adapted);
				if (result == null) result = caseASTNode_adapted(thisExpression_adapted);
				if (result == null) result = caseNodeWithHistory(thisExpression_adapted);
				if (result == null) result = caseElementWithHistory(thisExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.THROW_STATEMENT_ADAPTED: {
				ThrowStatement_adapted throwStatement_adapted = (ThrowStatement_adapted)theEObject;
				T result = caseThrowStatement_adapted(throwStatement_adapted);
				if (result == null) result = caseStatement_adapted(throwStatement_adapted);
				if (result == null) result = caseASTNode_adapted(throwStatement_adapted);
				if (result == null) result = caseNodeWithHistory(throwStatement_adapted);
				if (result == null) result = caseElementWithHistory(throwStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED: {
				TryStatement_adapted tryStatement_adapted = (TryStatement_adapted)theEObject;
				T result = caseTryStatement_adapted(tryStatement_adapted);
				if (result == null) result = caseStatement_adapted(tryStatement_adapted);
				if (result == null) result = caseASTNode_adapted(tryStatement_adapted);
				if (result == null) result = caseNodeWithHistory(tryStatement_adapted);
				if (result == null) result = caseElementWithHistory(tryStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_ADAPTED: {
				Type_adapted type_adapted = (Type_adapted)theEObject;
				T result = caseType_adapted(type_adapted);
				if (result == null) result = caseNamedElement_adapted(type_adapted);
				if (result == null) result = caseASTNode_adapted(type_adapted);
				if (result == null) result = caseNodeWithHistory(type_adapted);
				if (result == null) result = caseElementWithHistory(type_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_ACCESS_ADAPTED: {
				TypeAccess_adapted typeAccess_adapted = (TypeAccess_adapted)theEObject;
				T result = caseTypeAccess_adapted(typeAccess_adapted);
				if (result == null) result = caseExpression_adapted(typeAccess_adapted);
				if (result == null) result = caseNamespaceAccess_adapted(typeAccess_adapted);
				if (result == null) result = caseASTNode_adapted(typeAccess_adapted);
				if (result == null) result = caseNodeWithHistory(typeAccess_adapted);
				if (result == null) result = caseElementWithHistory(typeAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_DECLARATION_ADAPTED: {
				TypeDeclaration_adapted typeDeclaration_adapted = (TypeDeclaration_adapted)theEObject;
				T result = caseTypeDeclaration_adapted(typeDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(typeDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(typeDeclaration_adapted);
				if (result == null) result = caseType_adapted(typeDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(typeDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(typeDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(typeDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(typeDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_DECLARATION_STATEMENT_ADAPTED: {
				TypeDeclarationStatement_adapted typeDeclarationStatement_adapted = (TypeDeclarationStatement_adapted)theEObject;
				T result = caseTypeDeclarationStatement_adapted(typeDeclarationStatement_adapted);
				if (result == null) result = caseStatement_adapted(typeDeclarationStatement_adapted);
				if (result == null) result = caseASTNode_adapted(typeDeclarationStatement_adapted);
				if (result == null) result = caseNodeWithHistory(typeDeclarationStatement_adapted);
				if (result == null) result = caseElementWithHistory(typeDeclarationStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_LITERAL_ADAPTED: {
				TypeLiteral_adapted typeLiteral_adapted = (TypeLiteral_adapted)theEObject;
				T result = caseTypeLiteral_adapted(typeLiteral_adapted);
				if (result == null) result = caseExpression_adapted(typeLiteral_adapted);
				if (result == null) result = caseASTNode_adapted(typeLiteral_adapted);
				if (result == null) result = caseNodeWithHistory(typeLiteral_adapted);
				if (result == null) result = caseElementWithHistory(typeLiteral_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_PARAMETER_ADAPTED: {
				TypeParameter_adapted typeParameter_adapted = (TypeParameter_adapted)theEObject;
				T result = caseTypeParameter_adapted(typeParameter_adapted);
				if (result == null) result = caseType_adapted(typeParameter_adapted);
				if (result == null) result = caseNamedElement_adapted(typeParameter_adapted);
				if (result == null) result = caseASTNode_adapted(typeParameter_adapted);
				if (result == null) result = caseNodeWithHistory(typeParameter_adapted);
				if (result == null) result = caseElementWithHistory(typeParameter_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_ITEM_ADAPTED: {
				UnresolvedItem_adapted unresolvedItem_adapted = (UnresolvedItem_adapted)theEObject;
				T result = caseUnresolvedItem_adapted(unresolvedItem_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedItem_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedItem_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedItem_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedItem_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED: {
				UnresolvedItemAccess_adapted unresolvedItemAccess_adapted = (UnresolvedItemAccess_adapted)theEObject;
				T result = caseUnresolvedItemAccess_adapted(unresolvedItemAccess_adapted);
				if (result == null) result = caseExpression_adapted(unresolvedItemAccess_adapted);
				if (result == null) result = caseNamespaceAccess_adapted(unresolvedItemAccess_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedItemAccess_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedItemAccess_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedItemAccess_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_ANNOTATION_DECLARATION_ADAPTED: {
				UnresolvedAnnotationDeclaration_adapted unresolvedAnnotationDeclaration_adapted = (UnresolvedAnnotationDeclaration_adapted)theEObject;
				T result = caseUnresolvedAnnotationDeclaration_adapted(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseAnnotationTypeDeclaration_adapted(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseType_adapted(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedAnnotationDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED: {
				UnresolvedAnnotationTypeMemberDeclaration_adapted unresolvedAnnotationTypeMemberDeclaration_adapted = (UnresolvedAnnotationTypeMemberDeclaration_adapted)theEObject;
				T result = caseUnresolvedAnnotationTypeMemberDeclaration_adapted(unresolvedAnnotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseAnnotationTypeMemberDeclaration_adapted(unresolvedAnnotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedAnnotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(unresolvedAnnotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedAnnotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedAnnotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedAnnotationTypeMemberDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedAnnotationTypeMemberDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_CLASS_DECLARATION_ADAPTED: {
				UnresolvedClassDeclaration_adapted unresolvedClassDeclaration_adapted = (UnresolvedClassDeclaration_adapted)theEObject;
				T result = caseUnresolvedClassDeclaration_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseClassDeclaration_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseTypeDeclaration_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseType_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedClassDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedClassDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_ENUM_DECLARATION_ADAPTED: {
				UnresolvedEnumDeclaration_adapted unresolvedEnumDeclaration_adapted = (UnresolvedEnumDeclaration_adapted)theEObject;
				T result = caseUnresolvedEnumDeclaration_adapted(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseEnumDeclaration_adapted(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseType_adapted(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedEnumDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedEnumDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_INTERFACE_DECLARATION_ADAPTED: {
				UnresolvedInterfaceDeclaration_adapted unresolvedInterfaceDeclaration_adapted = (UnresolvedInterfaceDeclaration_adapted)theEObject;
				T result = caseUnresolvedInterfaceDeclaration_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseInterfaceDeclaration_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseTypeDeclaration_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseType_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedInterfaceDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_LABELED_STATEMENT_ADAPTED: {
				UnresolvedLabeledStatement_adapted unresolvedLabeledStatement_adapted = (UnresolvedLabeledStatement_adapted)theEObject;
				T result = caseUnresolvedLabeledStatement_adapted(unresolvedLabeledStatement_adapted);
				if (result == null) result = caseLabeledStatement_adapted(unresolvedLabeledStatement_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedLabeledStatement_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedLabeledStatement_adapted);
				if (result == null) result = caseStatement_adapted(unresolvedLabeledStatement_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedLabeledStatement_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedLabeledStatement_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedLabeledStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_METHOD_DECLARATION_ADAPTED: {
				UnresolvedMethodDeclaration_adapted unresolvedMethodDeclaration_adapted = (UnresolvedMethodDeclaration_adapted)theEObject;
				T result = caseUnresolvedMethodDeclaration_adapted(unresolvedMethodDeclaration_adapted);
				if (result == null) result = caseMethodDeclaration_adapted(unresolvedMethodDeclaration_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedMethodDeclaration_adapted);
				if (result == null) result = caseAbstractMethodDeclaration_adapted(unresolvedMethodDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(unresolvedMethodDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedMethodDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedMethodDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedMethodDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedMethodDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_SINGLE_VARIABLE_DECLARATION_ADAPTED: {
				UnresolvedSingleVariableDeclaration_adapted unresolvedSingleVariableDeclaration_adapted = (UnresolvedSingleVariableDeclaration_adapted)theEObject;
				T result = caseUnresolvedSingleVariableDeclaration_adapted(unresolvedSingleVariableDeclaration_adapted);
				if (result == null) result = caseSingleVariableDeclaration_adapted(unresolvedSingleVariableDeclaration_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedSingleVariableDeclaration_adapted);
				if (result == null) result = caseVariableDeclaration_adapted(unresolvedSingleVariableDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedSingleVariableDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedSingleVariableDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedSingleVariableDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedSingleVariableDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_TYPE_ADAPTED: {
				UnresolvedType_adapted unresolvedType_adapted = (UnresolvedType_adapted)theEObject;
				T result = caseUnresolvedType_adapted(unresolvedType_adapted);
				if (result == null) result = caseType_adapted(unresolvedType_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedType_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedType_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedType_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedType_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedType_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_TYPE_DECLARATION_ADAPTED: {
				UnresolvedTypeDeclaration_adapted unresolvedTypeDeclaration_adapted = (UnresolvedTypeDeclaration_adapted)theEObject;
				T result = caseUnresolvedTypeDeclaration_adapted(unresolvedTypeDeclaration_adapted);
				if (result == null) result = caseAbstractTypeDeclaration_adapted(unresolvedTypeDeclaration_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedTypeDeclaration_adapted);
				if (result == null) result = caseBodyDeclaration_adapted(unresolvedTypeDeclaration_adapted);
				if (result == null) result = caseType_adapted(unresolvedTypeDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedTypeDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedTypeDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedTypeDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedTypeDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_VARIABLE_DECLARATION_FRAGMENT_ADAPTED: {
				UnresolvedVariableDeclarationFragment_adapted unresolvedVariableDeclarationFragment_adapted = (UnresolvedVariableDeclarationFragment_adapted)theEObject;
				T result = caseUnresolvedVariableDeclarationFragment_adapted(unresolvedVariableDeclarationFragment_adapted);
				if (result == null) result = caseVariableDeclarationFragment_adapted(unresolvedVariableDeclarationFragment_adapted);
				if (result == null) result = caseUnresolvedItem_adapted(unresolvedVariableDeclarationFragment_adapted);
				if (result == null) result = caseVariableDeclaration_adapted(unresolvedVariableDeclarationFragment_adapted);
				if (result == null) result = caseNamedElement_adapted(unresolvedVariableDeclarationFragment_adapted);
				if (result == null) result = caseASTNode_adapted(unresolvedVariableDeclarationFragment_adapted);
				if (result == null) result = caseNodeWithHistory(unresolvedVariableDeclarationFragment_adapted);
				if (result == null) result = caseElementWithHistory(unresolvedVariableDeclarationFragment_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED: {
				VariableDeclaration_adapted variableDeclaration_adapted = (VariableDeclaration_adapted)theEObject;
				T result = caseVariableDeclaration_adapted(variableDeclaration_adapted);
				if (result == null) result = caseNamedElement_adapted(variableDeclaration_adapted);
				if (result == null) result = caseASTNode_adapted(variableDeclaration_adapted);
				if (result == null) result = caseNodeWithHistory(variableDeclaration_adapted);
				if (result == null) result = caseElementWithHistory(variableDeclaration_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED: {
				VariableDeclarationExpression_adapted variableDeclarationExpression_adapted = (VariableDeclarationExpression_adapted)theEObject;
				T result = caseVariableDeclarationExpression_adapted(variableDeclarationExpression_adapted);
				if (result == null) result = caseExpression_adapted(variableDeclarationExpression_adapted);
				if (result == null) result = caseAbstractVariablesContainer_adapted(variableDeclarationExpression_adapted);
				if (result == null) result = caseASTNode_adapted(variableDeclarationExpression_adapted);
				if (result == null) result = caseNodeWithHistory(variableDeclarationExpression_adapted);
				if (result == null) result = caseElementWithHistory(variableDeclarationExpression_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED: {
				VariableDeclarationFragment_adapted variableDeclarationFragment_adapted = (VariableDeclarationFragment_adapted)theEObject;
				T result = caseVariableDeclarationFragment_adapted(variableDeclarationFragment_adapted);
				if (result == null) result = caseVariableDeclaration_adapted(variableDeclarationFragment_adapted);
				if (result == null) result = caseNamedElement_adapted(variableDeclarationFragment_adapted);
				if (result == null) result = caseASTNode_adapted(variableDeclarationFragment_adapted);
				if (result == null) result = caseNodeWithHistory(variableDeclarationFragment_adapted);
				if (result == null) result = caseElementWithHistory(variableDeclarationFragment_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_STATEMENT_ADAPTED: {
				VariableDeclarationStatement_adapted variableDeclarationStatement_adapted = (VariableDeclarationStatement_adapted)theEObject;
				T result = caseVariableDeclarationStatement_adapted(variableDeclarationStatement_adapted);
				if (result == null) result = caseStatement_adapted(variableDeclarationStatement_adapted);
				if (result == null) result = caseAbstractVariablesContainer_adapted(variableDeclarationStatement_adapted);
				if (result == null) result = caseASTNode_adapted(variableDeclarationStatement_adapted);
				if (result == null) result = caseNodeWithHistory(variableDeclarationStatement_adapted);
				if (result == null) result = caseElementWithHistory(variableDeclarationStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED: {
				WildCardType_adapted wildCardType_adapted = (WildCardType_adapted)theEObject;
				T result = caseWildCardType_adapted(wildCardType_adapted);
				if (result == null) result = caseType_adapted(wildCardType_adapted);
				if (result == null) result = caseNamedElement_adapted(wildCardType_adapted);
				if (result == null) result = caseASTNode_adapted(wildCardType_adapted);
				if (result == null) result = caseNodeWithHistory(wildCardType_adapted);
				if (result == null) result = caseElementWithHistory(wildCardType_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.WHILE_STATEMENT_ADAPTED: {
				WhileStatement_adapted whileStatement_adapted = (WhileStatement_adapted)theEObject;
				T result = caseWhileStatement_adapted(whileStatement_adapted);
				if (result == null) result = caseStatement_adapted(whileStatement_adapted);
				if (result == null) result = caseASTNode_adapted(whileStatement_adapted);
				if (result == null) result = caseNodeWithHistory(whileStatement_adapted);
				if (result == null) result = caseElementWithHistory(whileStatement_adapted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_BODY_ITEM: {
				AbstractMethodDeclaration_adapted_bodyItem abstractMethodDeclaration_adapted_bodyItem = (AbstractMethodDeclaration_adapted_bodyItem)theEObject;
				T result = caseAbstractMethodDeclaration_adapted_bodyItem(abstractMethodDeclaration_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractMethodDeclaration_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodDeclaration_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(abstractMethodDeclaration_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_PARAMETERS_ITEM: {
				AbstractMethodDeclaration_adapted_parametersItem abstractMethodDeclaration_adapted_parametersItem = (AbstractMethodDeclaration_adapted_parametersItem)theEObject;
				T result = caseAbstractMethodDeclaration_adapted_parametersItem(abstractMethodDeclaration_adapted_parametersItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractMethodDeclaration_adapted_parametersItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodDeclaration_adapted_parametersItem);
				if (result == null) result = caseElementWithHistory(abstractMethodDeclaration_adapted_parametersItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_THROWN_EXCEPTIONS_ITEM: {
				AbstractMethodDeclaration_adapted_thrownExceptionsItem abstractMethodDeclaration_adapted_thrownExceptionsItem = (AbstractMethodDeclaration_adapted_thrownExceptionsItem)theEObject;
				T result = caseAbstractMethodDeclaration_adapted_thrownExceptionsItem(abstractMethodDeclaration_adapted_thrownExceptionsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractMethodDeclaration_adapted_thrownExceptionsItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodDeclaration_adapted_thrownExceptionsItem);
				if (result == null) result = caseElementWithHistory(abstractMethodDeclaration_adapted_thrownExceptionsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM: {
				AbstractMethodDeclaration_adapted_typeParametersItem abstractMethodDeclaration_adapted_typeParametersItem = (AbstractMethodDeclaration_adapted_typeParametersItem)theEObject;
				T result = caseAbstractMethodDeclaration_adapted_typeParametersItem(abstractMethodDeclaration_adapted_typeParametersItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractMethodDeclaration_adapted_typeParametersItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodDeclaration_adapted_typeParametersItem);
				if (result == null) result = caseElementWithHistory(abstractMethodDeclaration_adapted_typeParametersItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_IN_DOC_COMMENTS_ITEM: {
				AbstractMethodDeclaration_adapted_usagesInDocCommentsItem abstractMethodDeclaration_adapted_usagesInDocCommentsItem = (AbstractMethodDeclaration_adapted_usagesInDocCommentsItem)theEObject;
				T result = caseAbstractMethodDeclaration_adapted_usagesInDocCommentsItem(abstractMethodDeclaration_adapted_usagesInDocCommentsItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodDeclaration_adapted_usagesInDocCommentsItem);
				if (result == null) result = caseElementWithHistory(abstractMethodDeclaration_adapted_usagesInDocCommentsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_DECLARATION_ADAPTED_USAGES_ITEM: {
				AbstractMethodDeclaration_adapted_usagesItem abstractMethodDeclaration_adapted_usagesItem = (AbstractMethodDeclaration_adapted_usagesItem)theEObject;
				T result = caseAbstractMethodDeclaration_adapted_usagesItem(abstractMethodDeclaration_adapted_usagesItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodDeclaration_adapted_usagesItem);
				if (result == null) result = caseElementWithHistory(abstractMethodDeclaration_adapted_usagesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED_METHOD_ITEM: {
				AbstractMethodInvocation_adapted_methodItem abstractMethodInvocation_adapted_methodItem = (AbstractMethodInvocation_adapted_methodItem)theEObject;
				T result = caseAbstractMethodInvocation_adapted_methodItem(abstractMethodInvocation_adapted_methodItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodInvocation_adapted_methodItem);
				if (result == null) result = caseElementWithHistory(abstractMethodInvocation_adapted_methodItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED_ARGUMENTS_ITEM: {
				AbstractMethodInvocation_adapted_argumentsItem abstractMethodInvocation_adapted_argumentsItem = (AbstractMethodInvocation_adapted_argumentsItem)theEObject;
				T result = caseAbstractMethodInvocation_adapted_argumentsItem(abstractMethodInvocation_adapted_argumentsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractMethodInvocation_adapted_argumentsItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodInvocation_adapted_argumentsItem);
				if (result == null) result = caseElementWithHistory(abstractMethodInvocation_adapted_argumentsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_METHOD_INVOCATION_ADAPTED_TYPE_ARGUMENTS_ITEM: {
				AbstractMethodInvocation_adapted_typeArgumentsItem abstractMethodInvocation_adapted_typeArgumentsItem = (AbstractMethodInvocation_adapted_typeArgumentsItem)theEObject;
				T result = caseAbstractMethodInvocation_adapted_typeArgumentsItem(abstractMethodInvocation_adapted_typeArgumentsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractMethodInvocation_adapted_typeArgumentsItem);
				if (result == null) result = caseEdgeWithHistory(abstractMethodInvocation_adapted_typeArgumentsItem);
				if (result == null) result = caseElementWithHistory(abstractMethodInvocation_adapted_typeArgumentsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM: {
				AbstractTypeDeclaration_adapted_bodyDeclarationsItem abstractTypeDeclaration_adapted_bodyDeclarationsItem = (AbstractTypeDeclaration_adapted_bodyDeclarationsItem)theEObject;
				T result = caseAbstractTypeDeclaration_adapted_bodyDeclarationsItem(abstractTypeDeclaration_adapted_bodyDeclarationsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractTypeDeclaration_adapted_bodyDeclarationsItem);
				if (result == null) result = caseEdgeWithHistory(abstractTypeDeclaration_adapted_bodyDeclarationsItem);
				if (result == null) result = caseElementWithHistory(abstractTypeDeclaration_adapted_bodyDeclarationsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_BEFORE_BODY_ITEM: {
				AbstractTypeDeclaration_adapted_commentsBeforeBodyItem abstractTypeDeclaration_adapted_commentsBeforeBodyItem = (AbstractTypeDeclaration_adapted_commentsBeforeBodyItem)theEObject;
				T result = caseAbstractTypeDeclaration_adapted_commentsBeforeBodyItem(abstractTypeDeclaration_adapted_commentsBeforeBodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractTypeDeclaration_adapted_commentsBeforeBodyItem);
				if (result == null) result = caseEdgeWithHistory(abstractTypeDeclaration_adapted_commentsBeforeBodyItem);
				if (result == null) result = caseElementWithHistory(abstractTypeDeclaration_adapted_commentsBeforeBodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_COMMENTS_AFTER_BODY_ITEM: {
				AbstractTypeDeclaration_adapted_commentsAfterBodyItem abstractTypeDeclaration_adapted_commentsAfterBodyItem = (AbstractTypeDeclaration_adapted_commentsAfterBodyItem)theEObject;
				T result = caseAbstractTypeDeclaration_adapted_commentsAfterBodyItem(abstractTypeDeclaration_adapted_commentsAfterBodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractTypeDeclaration_adapted_commentsAfterBodyItem);
				if (result == null) result = caseEdgeWithHistory(abstractTypeDeclaration_adapted_commentsAfterBodyItem);
				if (result == null) result = caseElementWithHistory(abstractTypeDeclaration_adapted_commentsAfterBodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_PACKAGE_ITEM: {
				AbstractTypeDeclaration_adapted_packageItem abstractTypeDeclaration_adapted_packageItem = (AbstractTypeDeclaration_adapted_packageItem)theEObject;
				T result = caseAbstractTypeDeclaration_adapted_packageItem(abstractTypeDeclaration_adapted_packageItem);
				if (result == null) result = caseEdgeWithHistory(abstractTypeDeclaration_adapted_packageItem);
				if (result == null) result = caseElementWithHistory(abstractTypeDeclaration_adapted_packageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_TYPE_DECLARATION_ADAPTED_SUPER_INTERFACES_ITEM: {
				AbstractTypeDeclaration_adapted_superInterfacesItem abstractTypeDeclaration_adapted_superInterfacesItem = (AbstractTypeDeclaration_adapted_superInterfacesItem)theEObject;
				T result = caseAbstractTypeDeclaration_adapted_superInterfacesItem(abstractTypeDeclaration_adapted_superInterfacesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractTypeDeclaration_adapted_superInterfacesItem);
				if (result == null) result = caseEdgeWithHistory(abstractTypeDeclaration_adapted_superInterfacesItem);
				if (result == null) result = caseElementWithHistory(abstractTypeDeclaration_adapted_superInterfacesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_TYPE_QUALIFIED_EXPRESSION_ADAPTED_QUALIFIER_ITEM: {
				AbstractTypeQualifiedExpression_adapted_qualifierItem abstractTypeQualifiedExpression_adapted_qualifierItem = (AbstractTypeQualifiedExpression_adapted_qualifierItem)theEObject;
				T result = caseAbstractTypeQualifiedExpression_adapted_qualifierItem(abstractTypeQualifiedExpression_adapted_qualifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractTypeQualifiedExpression_adapted_qualifierItem);
				if (result == null) result = caseEdgeWithHistory(abstractTypeQualifiedExpression_adapted_qualifierItem);
				if (result == null) result = caseElementWithHistory(abstractTypeQualifiedExpression_adapted_qualifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_TYPE_ITEM: {
				AbstractVariablesContainer_adapted_typeItem abstractVariablesContainer_adapted_typeItem = (AbstractVariablesContainer_adapted_typeItem)theEObject;
				T result = caseAbstractVariablesContainer_adapted_typeItem(abstractVariablesContainer_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractVariablesContainer_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(abstractVariablesContainer_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(abstractVariablesContainer_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ABSTRACT_VARIABLES_CONTAINER_ADAPTED_FRAGMENTS_ITEM: {
				AbstractVariablesContainer_adapted_fragmentsItem abstractVariablesContainer_adapted_fragmentsItem = (AbstractVariablesContainer_adapted_fragmentsItem)theEObject;
				T result = caseAbstractVariablesContainer_adapted_fragmentsItem(abstractVariablesContainer_adapted_fragmentsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(abstractVariablesContainer_adapted_fragmentsItem);
				if (result == null) result = caseEdgeWithHistory(abstractVariablesContainer_adapted_fragmentsItem);
				if (result == null) result = caseElementWithHistory(abstractVariablesContainer_adapted_fragmentsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_ADAPTED_TYPE_ITEM: {
				Annotation_adapted_typeItem annotation_adapted_typeItem = (Annotation_adapted_typeItem)theEObject;
				T result = caseAnnotation_adapted_typeItem(annotation_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(annotation_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(annotation_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(annotation_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_ADAPTED_VALUES_ITEM: {
				Annotation_adapted_valuesItem annotation_adapted_valuesItem = (Annotation_adapted_valuesItem)theEObject;
				T result = caseAnnotation_adapted_valuesItem(annotation_adapted_valuesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(annotation_adapted_valuesItem);
				if (result == null) result = caseEdgeWithHistory(annotation_adapted_valuesItem);
				if (result == null) result = caseElementWithHistory(annotation_adapted_valuesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARCHIVE_ADAPTED_ORIGINAL_FILE_PATH_VALUE: {
				Archive_adapted_originalFilePathValue archive_adapted_originalFilePathValue = (Archive_adapted_originalFilePathValue)theEObject;
				T result = caseArchive_adapted_originalFilePathValue(archive_adapted_originalFilePathValue);
				if (result == null) result = caseAttributeWithHistory(archive_adapted_originalFilePathValue);
				if (result == null) result = caseElementWithHistory(archive_adapted_originalFilePathValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARCHIVE_ADAPTED_CLASS_FILES_ITEM: {
				Archive_adapted_classFilesItem archive_adapted_classFilesItem = (Archive_adapted_classFilesItem)theEObject;
				T result = caseArchive_adapted_classFilesItem(archive_adapted_classFilesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(archive_adapted_classFilesItem);
				if (result == null) result = caseEdgeWithHistory(archive_adapted_classFilesItem);
				if (result == null) result = caseElementWithHistory(archive_adapted_classFilesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARCHIVE_ADAPTED_MANIFEST_ITEM: {
				Archive_adapted_manifestItem archive_adapted_manifestItem = (Archive_adapted_manifestItem)theEObject;
				T result = caseArchive_adapted_manifestItem(archive_adapted_manifestItem);
				if (result == null) result = caseContainmentEdgeWithHistory(archive_adapted_manifestItem);
				if (result == null) result = caseEdgeWithHistory(archive_adapted_manifestItem);
				if (result == null) result = caseElementWithHistory(archive_adapted_manifestItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED_MESSAGE_ITEM: {
				AssertStatement_adapted_messageItem assertStatement_adapted_messageItem = (AssertStatement_adapted_messageItem)theEObject;
				T result = caseAssertStatement_adapted_messageItem(assertStatement_adapted_messageItem);
				if (result == null) result = caseContainmentEdgeWithHistory(assertStatement_adapted_messageItem);
				if (result == null) result = caseEdgeWithHistory(assertStatement_adapted_messageItem);
				if (result == null) result = caseElementWithHistory(assertStatement_adapted_messageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ASSERT_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				AssertStatement_adapted_expressionItem assertStatement_adapted_expressionItem = (AssertStatement_adapted_expressionItem)theEObject;
				T result = caseAssertStatement_adapted_expressionItem(assertStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(assertStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(assertStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(assertStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.AST_NODE_ADAPTED_COMMENTS_ITEM: {
				ASTNode_adapted_commentsItem astNode_adapted_commentsItem = (ASTNode_adapted_commentsItem)theEObject;
				T result = caseASTNode_adapted_commentsItem(astNode_adapted_commentsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(astNode_adapted_commentsItem);
				if (result == null) result = caseEdgeWithHistory(astNode_adapted_commentsItem);
				if (result == null) result = caseElementWithHistory(astNode_adapted_commentsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_COMPILATION_UNIT_ITEM: {
				ASTNode_adapted_originalCompilationUnitItem astNode_adapted_originalCompilationUnitItem = (ASTNode_adapted_originalCompilationUnitItem)theEObject;
				T result = caseASTNode_adapted_originalCompilationUnitItem(astNode_adapted_originalCompilationUnitItem);
				if (result == null) result = caseEdgeWithHistory(astNode_adapted_originalCompilationUnitItem);
				if (result == null) result = caseElementWithHistory(astNode_adapted_originalCompilationUnitItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.AST_NODE_ADAPTED_ORIGINAL_CLASS_FILE_ITEM: {
				ASTNode_adapted_originalClassFileItem astNode_adapted_originalClassFileItem = (ASTNode_adapted_originalClassFileItem)theEObject;
				T result = caseASTNode_adapted_originalClassFileItem(astNode_adapted_originalClassFileItem);
				if (result == null) result = caseEdgeWithHistory(astNode_adapted_originalClassFileItem);
				if (result == null) result = caseElementWithHistory(astNode_adapted_originalClassFileItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED_MEMBER_ITEM: {
				AnnotationMemberValuePair_adapted_memberItem annotationMemberValuePair_adapted_memberItem = (AnnotationMemberValuePair_adapted_memberItem)theEObject;
				T result = caseAnnotationMemberValuePair_adapted_memberItem(annotationMemberValuePair_adapted_memberItem);
				if (result == null) result = caseEdgeWithHistory(annotationMemberValuePair_adapted_memberItem);
				if (result == null) result = caseElementWithHistory(annotationMemberValuePair_adapted_memberItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_MEMBER_VALUE_PAIR_ADAPTED_VALUE_ITEM: {
				AnnotationMemberValuePair_adapted_valueItem annotationMemberValuePair_adapted_valueItem = (AnnotationMemberValuePair_adapted_valueItem)theEObject;
				T result = caseAnnotationMemberValuePair_adapted_valueItem(annotationMemberValuePair_adapted_valueItem);
				if (result == null) result = caseContainmentEdgeWithHistory(annotationMemberValuePair_adapted_valueItem);
				if (result == null) result = caseEdgeWithHistory(annotationMemberValuePair_adapted_valueItem);
				if (result == null) result = caseElementWithHistory(annotationMemberValuePair_adapted_valueItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_DEFAULT_ITEM: {
				AnnotationTypeMemberDeclaration_adapted_defaultItem annotationTypeMemberDeclaration_adapted_defaultItem = (AnnotationTypeMemberDeclaration_adapted_defaultItem)theEObject;
				T result = caseAnnotationTypeMemberDeclaration_adapted_defaultItem(annotationTypeMemberDeclaration_adapted_defaultItem);
				if (result == null) result = caseContainmentEdgeWithHistory(annotationTypeMemberDeclaration_adapted_defaultItem);
				if (result == null) result = caseEdgeWithHistory(annotationTypeMemberDeclaration_adapted_defaultItem);
				if (result == null) result = caseElementWithHistory(annotationTypeMemberDeclaration_adapted_defaultItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_TYPE_ITEM: {
				AnnotationTypeMemberDeclaration_adapted_typeItem annotationTypeMemberDeclaration_adapted_typeItem = (AnnotationTypeMemberDeclaration_adapted_typeItem)theEObject;
				T result = caseAnnotationTypeMemberDeclaration_adapted_typeItem(annotationTypeMemberDeclaration_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(annotationTypeMemberDeclaration_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(annotationTypeMemberDeclaration_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(annotationTypeMemberDeclaration_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANNOTATION_TYPE_MEMBER_DECLARATION_ADAPTED_USAGES_ITEM: {
				AnnotationTypeMemberDeclaration_adapted_usagesItem annotationTypeMemberDeclaration_adapted_usagesItem = (AnnotationTypeMemberDeclaration_adapted_usagesItem)theEObject;
				T result = caseAnnotationTypeMemberDeclaration_adapted_usagesItem(annotationTypeMemberDeclaration_adapted_usagesItem);
				if (result == null) result = caseEdgeWithHistory(annotationTypeMemberDeclaration_adapted_usagesItem);
				if (result == null) result = caseElementWithHistory(annotationTypeMemberDeclaration_adapted_usagesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_BODY_DECLARATIONS_ITEM: {
				AnonymousClassDeclaration_adapted_bodyDeclarationsItem anonymousClassDeclaration_adapted_bodyDeclarationsItem = (AnonymousClassDeclaration_adapted_bodyDeclarationsItem)theEObject;
				T result = caseAnonymousClassDeclaration_adapted_bodyDeclarationsItem(anonymousClassDeclaration_adapted_bodyDeclarationsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(anonymousClassDeclaration_adapted_bodyDeclarationsItem);
				if (result == null) result = caseEdgeWithHistory(anonymousClassDeclaration_adapted_bodyDeclarationsItem);
				if (result == null) result = caseElementWithHistory(anonymousClassDeclaration_adapted_bodyDeclarationsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ANONYMOUS_CLASS_DECLARATION_ADAPTED_CLASS_INSTANCE_CREATION_ITEM: {
				AnonymousClassDeclaration_adapted_classInstanceCreationItem anonymousClassDeclaration_adapted_classInstanceCreationItem = (AnonymousClassDeclaration_adapted_classInstanceCreationItem)theEObject;
				T result = caseAnonymousClassDeclaration_adapted_classInstanceCreationItem(anonymousClassDeclaration_adapted_classInstanceCreationItem);
				if (result == null) result = caseEdgeWithHistory(anonymousClassDeclaration_adapted_classInstanceCreationItem);
				if (result == null) result = caseElementWithHistory(anonymousClassDeclaration_adapted_classInstanceCreationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED_ARRAY_ITEM: {
				ArrayAccess_adapted_arrayItem arrayAccess_adapted_arrayItem = (ArrayAccess_adapted_arrayItem)theEObject;
				T result = caseArrayAccess_adapted_arrayItem(arrayAccess_adapted_arrayItem);
				if (result == null) result = caseContainmentEdgeWithHistory(arrayAccess_adapted_arrayItem);
				if (result == null) result = caseEdgeWithHistory(arrayAccess_adapted_arrayItem);
				if (result == null) result = caseElementWithHistory(arrayAccess_adapted_arrayItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_ACCESS_ADAPTED_INDEX_ITEM: {
				ArrayAccess_adapted_indexItem arrayAccess_adapted_indexItem = (ArrayAccess_adapted_indexItem)theEObject;
				T result = caseArrayAccess_adapted_indexItem(arrayAccess_adapted_indexItem);
				if (result == null) result = caseContainmentEdgeWithHistory(arrayAccess_adapted_indexItem);
				if (result == null) result = caseEdgeWithHistory(arrayAccess_adapted_indexItem);
				if (result == null) result = caseElementWithHistory(arrayAccess_adapted_indexItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_DIMENSIONS_ITEM: {
				ArrayCreation_adapted_dimensionsItem arrayCreation_adapted_dimensionsItem = (ArrayCreation_adapted_dimensionsItem)theEObject;
				T result = caseArrayCreation_adapted_dimensionsItem(arrayCreation_adapted_dimensionsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(arrayCreation_adapted_dimensionsItem);
				if (result == null) result = caseEdgeWithHistory(arrayCreation_adapted_dimensionsItem);
				if (result == null) result = caseElementWithHistory(arrayCreation_adapted_dimensionsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_INITIALIZER_ITEM: {
				ArrayCreation_adapted_initializerItem arrayCreation_adapted_initializerItem = (ArrayCreation_adapted_initializerItem)theEObject;
				T result = caseArrayCreation_adapted_initializerItem(arrayCreation_adapted_initializerItem);
				if (result == null) result = caseContainmentEdgeWithHistory(arrayCreation_adapted_initializerItem);
				if (result == null) result = caseEdgeWithHistory(arrayCreation_adapted_initializerItem);
				if (result == null) result = caseElementWithHistory(arrayCreation_adapted_initializerItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_CREATION_ADAPTED_TYPE_ITEM: {
				ArrayCreation_adapted_typeItem arrayCreation_adapted_typeItem = (ArrayCreation_adapted_typeItem)theEObject;
				T result = caseArrayCreation_adapted_typeItem(arrayCreation_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(arrayCreation_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(arrayCreation_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(arrayCreation_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_INITIALIZER_ADAPTED_EXPRESSIONS_ITEM: {
				ArrayInitializer_adapted_expressionsItem arrayInitializer_adapted_expressionsItem = (ArrayInitializer_adapted_expressionsItem)theEObject;
				T result = caseArrayInitializer_adapted_expressionsItem(arrayInitializer_adapted_expressionsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(arrayInitializer_adapted_expressionsItem);
				if (result == null) result = caseEdgeWithHistory(arrayInitializer_adapted_expressionsItem);
				if (result == null) result = caseElementWithHistory(arrayInitializer_adapted_expressionsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_LENGTH_ACCESS_ADAPTED_ARRAY_ITEM: {
				ArrayLengthAccess_adapted_arrayItem arrayLengthAccess_adapted_arrayItem = (ArrayLengthAccess_adapted_arrayItem)theEObject;
				T result = caseArrayLengthAccess_adapted_arrayItem(arrayLengthAccess_adapted_arrayItem);
				if (result == null) result = caseContainmentEdgeWithHistory(arrayLengthAccess_adapted_arrayItem);
				if (result == null) result = caseEdgeWithHistory(arrayLengthAccess_adapted_arrayItem);
				if (result == null) result = caseElementWithHistory(arrayLengthAccess_adapted_arrayItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED_DIMENSIONS_VALUE: {
				ArrayType_adapted_dimensionsValue arrayType_adapted_dimensionsValue = (ArrayType_adapted_dimensionsValue)theEObject;
				T result = caseArrayType_adapted_dimensionsValue(arrayType_adapted_dimensionsValue);
				if (result == null) result = caseAttributeWithHistory(arrayType_adapted_dimensionsValue);
				if (result == null) result = caseElementWithHistory(arrayType_adapted_dimensionsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ARRAY_TYPE_ADAPTED_ELEMENT_TYPE_ITEM: {
				ArrayType_adapted_elementTypeItem arrayType_adapted_elementTypeItem = (ArrayType_adapted_elementTypeItem)theEObject;
				T result = caseArrayType_adapted_elementTypeItem(arrayType_adapted_elementTypeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(arrayType_adapted_elementTypeItem);
				if (result == null) result = caseEdgeWithHistory(arrayType_adapted_elementTypeItem);
				if (result == null) result = caseElementWithHistory(arrayType_adapted_elementTypeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_LEFT_HAND_SIDE_ITEM: {
				Assignment_adapted_leftHandSideItem assignment_adapted_leftHandSideItem = (Assignment_adapted_leftHandSideItem)theEObject;
				T result = caseAssignment_adapted_leftHandSideItem(assignment_adapted_leftHandSideItem);
				if (result == null) result = caseContainmentEdgeWithHistory(assignment_adapted_leftHandSideItem);
				if (result == null) result = caseEdgeWithHistory(assignment_adapted_leftHandSideItem);
				if (result == null) result = caseElementWithHistory(assignment_adapted_leftHandSideItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_OPERATOR_VALUE: {
				Assignment_adapted_operatorValue assignment_adapted_operatorValue = (Assignment_adapted_operatorValue)theEObject;
				T result = caseAssignment_adapted_operatorValue(assignment_adapted_operatorValue);
				if (result == null) result = caseAttributeWithHistory(assignment_adapted_operatorValue);
				if (result == null) result = caseElementWithHistory(assignment_adapted_operatorValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ASSIGNMENT_ADAPTED_RIGHT_HAND_SIDE_ITEM: {
				Assignment_adapted_rightHandSideItem assignment_adapted_rightHandSideItem = (Assignment_adapted_rightHandSideItem)theEObject;
				T result = caseAssignment_adapted_rightHandSideItem(assignment_adapted_rightHandSideItem);
				if (result == null) result = caseContainmentEdgeWithHistory(assignment_adapted_rightHandSideItem);
				if (result == null) result = caseEdgeWithHistory(assignment_adapted_rightHandSideItem);
				if (result == null) result = caseElementWithHistory(assignment_adapted_rightHandSideItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ABSTRACT_TYPE_DECLARATION_ITEM: {
				BodyDeclaration_adapted_abstractTypeDeclarationItem bodyDeclaration_adapted_abstractTypeDeclarationItem = (BodyDeclaration_adapted_abstractTypeDeclarationItem)theEObject;
				T result = caseBodyDeclaration_adapted_abstractTypeDeclarationItem(bodyDeclaration_adapted_abstractTypeDeclarationItem);
				if (result == null) result = caseEdgeWithHistory(bodyDeclaration_adapted_abstractTypeDeclarationItem);
				if (result == null) result = caseElementWithHistory(bodyDeclaration_adapted_abstractTypeDeclarationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANNOTATIONS_ITEM: {
				BodyDeclaration_adapted_annotationsItem bodyDeclaration_adapted_annotationsItem = (BodyDeclaration_adapted_annotationsItem)theEObject;
				T result = caseBodyDeclaration_adapted_annotationsItem(bodyDeclaration_adapted_annotationsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(bodyDeclaration_adapted_annotationsItem);
				if (result == null) result = caseEdgeWithHistory(bodyDeclaration_adapted_annotationsItem);
				if (result == null) result = caseElementWithHistory(bodyDeclaration_adapted_annotationsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_OWNER_ITEM: {
				BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem bodyDeclaration_adapted_anonymousClassDeclarationOwnerItem = (BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem)theEObject;
				T result = caseBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem(bodyDeclaration_adapted_anonymousClassDeclarationOwnerItem);
				if (result == null) result = caseEdgeWithHistory(bodyDeclaration_adapted_anonymousClassDeclarationOwnerItem);
				if (result == null) result = caseElementWithHistory(bodyDeclaration_adapted_anonymousClassDeclarationOwnerItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BODY_DECLARATION_ADAPTED_MODIFIER_ITEM: {
				BodyDeclaration_adapted_modifierItem bodyDeclaration_adapted_modifierItem = (BodyDeclaration_adapted_modifierItem)theEObject;
				T result = caseBodyDeclaration_adapted_modifierItem(bodyDeclaration_adapted_modifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(bodyDeclaration_adapted_modifierItem);
				if (result == null) result = caseEdgeWithHistory(bodyDeclaration_adapted_modifierItem);
				if (result == null) result = caseElementWithHistory(bodyDeclaration_adapted_modifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BOOLEAN_LITERAL_ADAPTED_VALUE_VALUE: {
				BooleanLiteral_adapted_valueValue booleanLiteral_adapted_valueValue = (BooleanLiteral_adapted_valueValue)theEObject;
				T result = caseBooleanLiteral_adapted_valueValue(booleanLiteral_adapted_valueValue);
				if (result == null) result = caseAttributeWithHistory(booleanLiteral_adapted_valueValue);
				if (result == null) result = caseElementWithHistory(booleanLiteral_adapted_valueValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BLOCK_ADAPTED_STATEMENTS_ITEM: {
				Block_adapted_statementsItem block_adapted_statementsItem = (Block_adapted_statementsItem)theEObject;
				T result = caseBlock_adapted_statementsItem(block_adapted_statementsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(block_adapted_statementsItem);
				if (result == null) result = caseEdgeWithHistory(block_adapted_statementsItem);
				if (result == null) result = caseElementWithHistory(block_adapted_statementsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.BREAK_STATEMENT_ADAPTED_LABEL_ITEM: {
				BreakStatement_adapted_labelItem breakStatement_adapted_labelItem = (BreakStatement_adapted_labelItem)theEObject;
				T result = caseBreakStatement_adapted_labelItem(breakStatement_adapted_labelItem);
				if (result == null) result = caseEdgeWithHistory(breakStatement_adapted_labelItem);
				if (result == null) result = caseElementWithHistory(breakStatement_adapted_labelItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED_EXPRESSION_ITEM: {
				CastExpression_adapted_expressionItem castExpression_adapted_expressionItem = (CastExpression_adapted_expressionItem)theEObject;
				T result = caseCastExpression_adapted_expressionItem(castExpression_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(castExpression_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(castExpression_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(castExpression_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CAST_EXPRESSION_ADAPTED_TYPE_ITEM: {
				CastExpression_adapted_typeItem castExpression_adapted_typeItem = (CastExpression_adapted_typeItem)theEObject;
				T result = caseCastExpression_adapted_typeItem(castExpression_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(castExpression_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(castExpression_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(castExpression_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED_EXCEPTION_ITEM: {
				CatchClause_adapted_exceptionItem catchClause_adapted_exceptionItem = (CatchClause_adapted_exceptionItem)theEObject;
				T result = caseCatchClause_adapted_exceptionItem(catchClause_adapted_exceptionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(catchClause_adapted_exceptionItem);
				if (result == null) result = caseEdgeWithHistory(catchClause_adapted_exceptionItem);
				if (result == null) result = caseElementWithHistory(catchClause_adapted_exceptionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CATCH_CLAUSE_ADAPTED_BODY_ITEM: {
				CatchClause_adapted_bodyItem catchClause_adapted_bodyItem = (CatchClause_adapted_bodyItem)theEObject;
				T result = caseCatchClause_adapted_bodyItem(catchClause_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(catchClause_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(catchClause_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(catchClause_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CHARACTER_LITERAL_ADAPTED_ESCAPED_VALUE_VALUE: {
				CharacterLiteral_adapted_escapedValueValue characterLiteral_adapted_escapedValueValue = (CharacterLiteral_adapted_escapedValueValue)theEObject;
				T result = caseCharacterLiteral_adapted_escapedValueValue(characterLiteral_adapted_escapedValueValue);
				if (result == null) result = caseAttributeWithHistory(characterLiteral_adapted_escapedValueValue);
				if (result == null) result = caseElementWithHistory(characterLiteral_adapted_escapedValueValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_ORIGINAL_FILE_PATH_VALUE: {
				ClassFile_adapted_originalFilePathValue classFile_adapted_originalFilePathValue = (ClassFile_adapted_originalFilePathValue)theEObject;
				T result = caseClassFile_adapted_originalFilePathValue(classFile_adapted_originalFilePathValue);
				if (result == null) result = caseAttributeWithHistory(classFile_adapted_originalFilePathValue);
				if (result == null) result = caseElementWithHistory(classFile_adapted_originalFilePathValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_TYPE_ITEM: {
				ClassFile_adapted_typeItem classFile_adapted_typeItem = (ClassFile_adapted_typeItem)theEObject;
				T result = caseClassFile_adapted_typeItem(classFile_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(classFile_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(classFile_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_ATTACHED_SOURCE_ITEM: {
				ClassFile_adapted_attachedSourceItem classFile_adapted_attachedSourceItem = (ClassFile_adapted_attachedSourceItem)theEObject;
				T result = caseClassFile_adapted_attachedSourceItem(classFile_adapted_attachedSourceItem);
				if (result == null) result = caseEdgeWithHistory(classFile_adapted_attachedSourceItem);
				if (result == null) result = caseElementWithHistory(classFile_adapted_attachedSourceItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_FILE_ADAPTED_PACKAGE_ITEM: {
				ClassFile_adapted_packageItem classFile_adapted_packageItem = (ClassFile_adapted_packageItem)theEObject;
				T result = caseClassFile_adapted_packageItem(classFile_adapted_packageItem);
				if (result == null) result = caseEdgeWithHistory(classFile_adapted_packageItem);
				if (result == null) result = caseElementWithHistory(classFile_adapted_packageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM: {
				ClassInstanceCreation_adapted_anonymousClassDeclarationItem classInstanceCreation_adapted_anonymousClassDeclarationItem = (ClassInstanceCreation_adapted_anonymousClassDeclarationItem)theEObject;
				T result = caseClassInstanceCreation_adapted_anonymousClassDeclarationItem(classInstanceCreation_adapted_anonymousClassDeclarationItem);
				if (result == null) result = caseContainmentEdgeWithHistory(classInstanceCreation_adapted_anonymousClassDeclarationItem);
				if (result == null) result = caseEdgeWithHistory(classInstanceCreation_adapted_anonymousClassDeclarationItem);
				if (result == null) result = caseElementWithHistory(classInstanceCreation_adapted_anonymousClassDeclarationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_EXPRESSION_ITEM: {
				ClassInstanceCreation_adapted_expressionItem classInstanceCreation_adapted_expressionItem = (ClassInstanceCreation_adapted_expressionItem)theEObject;
				T result = caseClassInstanceCreation_adapted_expressionItem(classInstanceCreation_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(classInstanceCreation_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(classInstanceCreation_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(classInstanceCreation_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_INSTANCE_CREATION_ADAPTED_TYPE_ITEM: {
				ClassInstanceCreation_adapted_typeItem classInstanceCreation_adapted_typeItem = (ClassInstanceCreation_adapted_typeItem)theEObject;
				T result = caseClassInstanceCreation_adapted_typeItem(classInstanceCreation_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(classInstanceCreation_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(classInstanceCreation_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(classInstanceCreation_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_ELSE_EXPRESSION_ITEM: {
				ConditionalExpression_adapted_elseExpressionItem conditionalExpression_adapted_elseExpressionItem = (ConditionalExpression_adapted_elseExpressionItem)theEObject;
				T result = caseConditionalExpression_adapted_elseExpressionItem(conditionalExpression_adapted_elseExpressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(conditionalExpression_adapted_elseExpressionItem);
				if (result == null) result = caseEdgeWithHistory(conditionalExpression_adapted_elseExpressionItem);
				if (result == null) result = caseElementWithHistory(conditionalExpression_adapted_elseExpressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_EXPRESSION_ITEM: {
				ConditionalExpression_adapted_expressionItem conditionalExpression_adapted_expressionItem = (ConditionalExpression_adapted_expressionItem)theEObject;
				T result = caseConditionalExpression_adapted_expressionItem(conditionalExpression_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(conditionalExpression_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(conditionalExpression_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(conditionalExpression_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CONDITIONAL_EXPRESSION_ADAPTED_THEN_EXPRESSION_ITEM: {
				ConditionalExpression_adapted_thenExpressionItem conditionalExpression_adapted_thenExpressionItem = (ConditionalExpression_adapted_thenExpressionItem)theEObject;
				T result = caseConditionalExpression_adapted_thenExpressionItem(conditionalExpression_adapted_thenExpressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(conditionalExpression_adapted_thenExpressionItem);
				if (result == null) result = caseEdgeWithHistory(conditionalExpression_adapted_thenExpressionItem);
				if (result == null) result = caseElementWithHistory(conditionalExpression_adapted_thenExpressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CLASS_DECLARATION_ADAPTED_SUPER_CLASS_ITEM: {
				ClassDeclaration_adapted_superClassItem classDeclaration_adapted_superClassItem = (ClassDeclaration_adapted_superClassItem)theEObject;
				T result = caseClassDeclaration_adapted_superClassItem(classDeclaration_adapted_superClassItem);
				if (result == null) result = caseContainmentEdgeWithHistory(classDeclaration_adapted_superClassItem);
				if (result == null) result = caseEdgeWithHistory(classDeclaration_adapted_superClassItem);
				if (result == null) result = caseElementWithHistory(classDeclaration_adapted_superClassItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMMENT_ADAPTED_CONTENT_VALUE: {
				Comment_adapted_contentValue comment_adapted_contentValue = (Comment_adapted_contentValue)theEObject;
				T result = caseComment_adapted_contentValue(comment_adapted_contentValue);
				if (result == null) result = caseAttributeWithHistory(comment_adapted_contentValue);
				if (result == null) result = caseElementWithHistory(comment_adapted_contentValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMMENT_ADAPTED_ENCLOSED_BY_PARENT_VALUE: {
				Comment_adapted_enclosedByParentValue comment_adapted_enclosedByParentValue = (Comment_adapted_enclosedByParentValue)theEObject;
				T result = caseComment_adapted_enclosedByParentValue(comment_adapted_enclosedByParentValue);
				if (result == null) result = caseAttributeWithHistory(comment_adapted_enclosedByParentValue);
				if (result == null) result = caseElementWithHistory(comment_adapted_enclosedByParentValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMMENT_ADAPTED_PREFIX_OF_PARENT_VALUE: {
				Comment_adapted_prefixOfParentValue comment_adapted_prefixOfParentValue = (Comment_adapted_prefixOfParentValue)theEObject;
				T result = caseComment_adapted_prefixOfParentValue(comment_adapted_prefixOfParentValue);
				if (result == null) result = caseAttributeWithHistory(comment_adapted_prefixOfParentValue);
				if (result == null) result = caseElementWithHistory(comment_adapted_prefixOfParentValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_ORIGINAL_FILE_PATH_VALUE: {
				CompilationUnit_adapted_originalFilePathValue compilationUnit_adapted_originalFilePathValue = (CompilationUnit_adapted_originalFilePathValue)theEObject;
				T result = caseCompilationUnit_adapted_originalFilePathValue(compilationUnit_adapted_originalFilePathValue);
				if (result == null) result = caseAttributeWithHistory(compilationUnit_adapted_originalFilePathValue);
				if (result == null) result = caseElementWithHistory(compilationUnit_adapted_originalFilePathValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_COMMENT_LIST_ITEM: {
				CompilationUnit_adapted_commentListItem compilationUnit_adapted_commentListItem = (CompilationUnit_adapted_commentListItem)theEObject;
				T result = caseCompilationUnit_adapted_commentListItem(compilationUnit_adapted_commentListItem);
				if (result == null) result = caseEdgeWithHistory(compilationUnit_adapted_commentListItem);
				if (result == null) result = caseElementWithHistory(compilationUnit_adapted_commentListItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_IMPORTS_ITEM: {
				CompilationUnit_adapted_importsItem compilationUnit_adapted_importsItem = (CompilationUnit_adapted_importsItem)theEObject;
				T result = caseCompilationUnit_adapted_importsItem(compilationUnit_adapted_importsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(compilationUnit_adapted_importsItem);
				if (result == null) result = caseEdgeWithHistory(compilationUnit_adapted_importsItem);
				if (result == null) result = caseElementWithHistory(compilationUnit_adapted_importsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_PACKAGE_ITEM: {
				CompilationUnit_adapted_packageItem compilationUnit_adapted_packageItem = (CompilationUnit_adapted_packageItem)theEObject;
				T result = caseCompilationUnit_adapted_packageItem(compilationUnit_adapted_packageItem);
				if (result == null) result = caseEdgeWithHistory(compilationUnit_adapted_packageItem);
				if (result == null) result = caseElementWithHistory(compilationUnit_adapted_packageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.COMPILATION_UNIT_ADAPTED_TYPES_ITEM: {
				CompilationUnit_adapted_typesItem compilationUnit_adapted_typesItem = (CompilationUnit_adapted_typesItem)theEObject;
				T result = caseCompilationUnit_adapted_typesItem(compilationUnit_adapted_typesItem);
				if (result == null) result = caseEdgeWithHistory(compilationUnit_adapted_typesItem);
				if (result == null) result = caseElementWithHistory(compilationUnit_adapted_typesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.CONTINUE_STATEMENT_ADAPTED_LABEL_ITEM: {
				ContinueStatement_adapted_labelItem continueStatement_adapted_labelItem = (ContinueStatement_adapted_labelItem)theEObject;
				T result = caseContinueStatement_adapted_labelItem(continueStatement_adapted_labelItem);
				if (result == null) result = caseEdgeWithHistory(continueStatement_adapted_labelItem);
				if (result == null) result = caseElementWithHistory(continueStatement_adapted_labelItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.DO_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				DoStatement_adapted_expressionItem doStatement_adapted_expressionItem = (DoStatement_adapted_expressionItem)theEObject;
				T result = caseDoStatement_adapted_expressionItem(doStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(doStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(doStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(doStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.DO_STATEMENT_ADAPTED_BODY_ITEM: {
				DoStatement_adapted_bodyItem doStatement_adapted_bodyItem = (DoStatement_adapted_bodyItem)theEObject;
				T result = caseDoStatement_adapted_bodyItem(doStatement_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(doStatement_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(doStatement_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(doStatement_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENHANCED_FOR_STATEMENT_ADAPTED_BODY_ITEM: {
				EnhancedForStatement_adapted_bodyItem enhancedForStatement_adapted_bodyItem = (EnhancedForStatement_adapted_bodyItem)theEObject;
				T result = caseEnhancedForStatement_adapted_bodyItem(enhancedForStatement_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(enhancedForStatement_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(enhancedForStatement_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(enhancedForStatement_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENHANCED_FOR_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				EnhancedForStatement_adapted_expressionItem enhancedForStatement_adapted_expressionItem = (EnhancedForStatement_adapted_expressionItem)theEObject;
				T result = caseEnhancedForStatement_adapted_expressionItem(enhancedForStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(enhancedForStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(enhancedForStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(enhancedForStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENHANCED_FOR_STATEMENT_ADAPTED_PARAMETER_ITEM: {
				EnhancedForStatement_adapted_parameterItem enhancedForStatement_adapted_parameterItem = (EnhancedForStatement_adapted_parameterItem)theEObject;
				T result = caseEnhancedForStatement_adapted_parameterItem(enhancedForStatement_adapted_parameterItem);
				if (result == null) result = caseContainmentEdgeWithHistory(enhancedForStatement_adapted_parameterItem);
				if (result == null) result = caseEdgeWithHistory(enhancedForStatement_adapted_parameterItem);
				if (result == null) result = caseElementWithHistory(enhancedForStatement_adapted_parameterItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ANONYMOUS_CLASS_DECLARATION_ITEM: {
				EnumConstantDeclaration_adapted_anonymousClassDeclarationItem enumConstantDeclaration_adapted_anonymousClassDeclarationItem = (EnumConstantDeclaration_adapted_anonymousClassDeclarationItem)theEObject;
				T result = caseEnumConstantDeclaration_adapted_anonymousClassDeclarationItem(enumConstantDeclaration_adapted_anonymousClassDeclarationItem);
				if (result == null) result = caseContainmentEdgeWithHistory(enumConstantDeclaration_adapted_anonymousClassDeclarationItem);
				if (result == null) result = caseEdgeWithHistory(enumConstantDeclaration_adapted_anonymousClassDeclarationItem);
				if (result == null) result = caseElementWithHistory(enumConstantDeclaration_adapted_anonymousClassDeclarationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENUM_CONSTANT_DECLARATION_ADAPTED_ARGUMENTS_ITEM: {
				EnumConstantDeclaration_adapted_argumentsItem enumConstantDeclaration_adapted_argumentsItem = (EnumConstantDeclaration_adapted_argumentsItem)theEObject;
				T result = caseEnumConstantDeclaration_adapted_argumentsItem(enumConstantDeclaration_adapted_argumentsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(enumConstantDeclaration_adapted_argumentsItem);
				if (result == null) result = caseEdgeWithHistory(enumConstantDeclaration_adapted_argumentsItem);
				if (result == null) result = caseElementWithHistory(enumConstantDeclaration_adapted_argumentsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.ENUM_DECLARATION_ADAPTED_ENUM_CONSTANTS_ITEM: {
				EnumDeclaration_adapted_enumConstantsItem enumDeclaration_adapted_enumConstantsItem = (EnumDeclaration_adapted_enumConstantsItem)theEObject;
				T result = caseEnumDeclaration_adapted_enumConstantsItem(enumDeclaration_adapted_enumConstantsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(enumDeclaration_adapted_enumConstantsItem);
				if (result == null) result = caseEdgeWithHistory(enumDeclaration_adapted_enumConstantsItem);
				if (result == null) result = caseElementWithHistory(enumDeclaration_adapted_enumConstantsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.EXPRESSION_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				ExpressionStatement_adapted_expressionItem expressionStatement_adapted_expressionItem = (ExpressionStatement_adapted_expressionItem)theEObject;
				T result = caseExpressionStatement_adapted_expressionItem(expressionStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(expressionStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(expressionStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(expressionStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED_FIELD_ITEM: {
				FieldAccess_adapted_fieldItem fieldAccess_adapted_fieldItem = (FieldAccess_adapted_fieldItem)theEObject;
				T result = caseFieldAccess_adapted_fieldItem(fieldAccess_adapted_fieldItem);
				if (result == null) result = caseContainmentEdgeWithHistory(fieldAccess_adapted_fieldItem);
				if (result == null) result = caseEdgeWithHistory(fieldAccess_adapted_fieldItem);
				if (result == null) result = caseElementWithHistory(fieldAccess_adapted_fieldItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FIELD_ACCESS_ADAPTED_EXPRESSION_ITEM: {
				FieldAccess_adapted_expressionItem fieldAccess_adapted_expressionItem = (FieldAccess_adapted_expressionItem)theEObject;
				T result = caseFieldAccess_adapted_expressionItem(fieldAccess_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(fieldAccess_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(fieldAccess_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(fieldAccess_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				ForStatement_adapted_expressionItem forStatement_adapted_expressionItem = (ForStatement_adapted_expressionItem)theEObject;
				T result = caseForStatement_adapted_expressionItem(forStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(forStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(forStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(forStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_UPDATERS_ITEM: {
				ForStatement_adapted_updatersItem forStatement_adapted_updatersItem = (ForStatement_adapted_updatersItem)theEObject;
				T result = caseForStatement_adapted_updatersItem(forStatement_adapted_updatersItem);
				if (result == null) result = caseContainmentEdgeWithHistory(forStatement_adapted_updatersItem);
				if (result == null) result = caseEdgeWithHistory(forStatement_adapted_updatersItem);
				if (result == null) result = caseElementWithHistory(forStatement_adapted_updatersItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_INITIALIZERS_ITEM: {
				ForStatement_adapted_initializersItem forStatement_adapted_initializersItem = (ForStatement_adapted_initializersItem)theEObject;
				T result = caseForStatement_adapted_initializersItem(forStatement_adapted_initializersItem);
				if (result == null) result = caseContainmentEdgeWithHistory(forStatement_adapted_initializersItem);
				if (result == null) result = caseEdgeWithHistory(forStatement_adapted_initializersItem);
				if (result == null) result = caseElementWithHistory(forStatement_adapted_initializersItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.FOR_STATEMENT_ADAPTED_BODY_ITEM: {
				ForStatement_adapted_bodyItem forStatement_adapted_bodyItem = (ForStatement_adapted_bodyItem)theEObject;
				T result = caseForStatement_adapted_bodyItem(forStatement_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(forStatement_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(forStatement_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(forStatement_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				IfStatement_adapted_expressionItem ifStatement_adapted_expressionItem = (IfStatement_adapted_expressionItem)theEObject;
				T result = caseIfStatement_adapted_expressionItem(ifStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(ifStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(ifStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(ifStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_THEN_STATEMENT_ITEM: {
				IfStatement_adapted_thenStatementItem ifStatement_adapted_thenStatementItem = (IfStatement_adapted_thenStatementItem)theEObject;
				T result = caseIfStatement_adapted_thenStatementItem(ifStatement_adapted_thenStatementItem);
				if (result == null) result = caseContainmentEdgeWithHistory(ifStatement_adapted_thenStatementItem);
				if (result == null) result = caseEdgeWithHistory(ifStatement_adapted_thenStatementItem);
				if (result == null) result = caseElementWithHistory(ifStatement_adapted_thenStatementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.IF_STATEMENT_ADAPTED_ELSE_STATEMENT_ITEM: {
				IfStatement_adapted_elseStatementItem ifStatement_adapted_elseStatementItem = (IfStatement_adapted_elseStatementItem)theEObject;
				T result = caseIfStatement_adapted_elseStatementItem(ifStatement_adapted_elseStatementItem);
				if (result == null) result = caseContainmentEdgeWithHistory(ifStatement_adapted_elseStatementItem);
				if (result == null) result = caseEdgeWithHistory(ifStatement_adapted_elseStatementItem);
				if (result == null) result = caseElementWithHistory(ifStatement_adapted_elseStatementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED_STATIC_VALUE: {
				ImportDeclaration_adapted_staticValue importDeclaration_adapted_staticValue = (ImportDeclaration_adapted_staticValue)theEObject;
				T result = caseImportDeclaration_adapted_staticValue(importDeclaration_adapted_staticValue);
				if (result == null) result = caseAttributeWithHistory(importDeclaration_adapted_staticValue);
				if (result == null) result = caseElementWithHistory(importDeclaration_adapted_staticValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.IMPORT_DECLARATION_ADAPTED_IMPORTED_ELEMENT_ITEM: {
				ImportDeclaration_adapted_importedElementItem importDeclaration_adapted_importedElementItem = (ImportDeclaration_adapted_importedElementItem)theEObject;
				T result = caseImportDeclaration_adapted_importedElementItem(importDeclaration_adapted_importedElementItem);
				if (result == null) result = caseEdgeWithHistory(importDeclaration_adapted_importedElementItem);
				if (result == null) result = caseElementWithHistory(importDeclaration_adapted_importedElementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_OPERATOR_VALUE: {
				InfixExpression_adapted_operatorValue infixExpression_adapted_operatorValue = (InfixExpression_adapted_operatorValue)theEObject;
				T result = caseInfixExpression_adapted_operatorValue(infixExpression_adapted_operatorValue);
				if (result == null) result = caseAttributeWithHistory(infixExpression_adapted_operatorValue);
				if (result == null) result = caseElementWithHistory(infixExpression_adapted_operatorValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_RIGHT_OPERAND_ITEM: {
				InfixExpression_adapted_rightOperandItem infixExpression_adapted_rightOperandItem = (InfixExpression_adapted_rightOperandItem)theEObject;
				T result = caseInfixExpression_adapted_rightOperandItem(infixExpression_adapted_rightOperandItem);
				if (result == null) result = caseContainmentEdgeWithHistory(infixExpression_adapted_rightOperandItem);
				if (result == null) result = caseEdgeWithHistory(infixExpression_adapted_rightOperandItem);
				if (result == null) result = caseElementWithHistory(infixExpression_adapted_rightOperandItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM: {
				InfixExpression_adapted_leftOperandItem infixExpression_adapted_leftOperandItem = (InfixExpression_adapted_leftOperandItem)theEObject;
				T result = caseInfixExpression_adapted_leftOperandItem(infixExpression_adapted_leftOperandItem);
				if (result == null) result = caseContainmentEdgeWithHistory(infixExpression_adapted_leftOperandItem);
				if (result == null) result = caseEdgeWithHistory(infixExpression_adapted_leftOperandItem);
				if (result == null) result = caseElementWithHistory(infixExpression_adapted_leftOperandItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INFIX_EXPRESSION_ADAPTED_EXTENDED_OPERANDS_ITEM: {
				InfixExpression_adapted_extendedOperandsItem infixExpression_adapted_extendedOperandsItem = (InfixExpression_adapted_extendedOperandsItem)theEObject;
				T result = caseInfixExpression_adapted_extendedOperandsItem(infixExpression_adapted_extendedOperandsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(infixExpression_adapted_extendedOperandsItem);
				if (result == null) result = caseEdgeWithHistory(infixExpression_adapted_extendedOperandsItem);
				if (result == null) result = caseElementWithHistory(infixExpression_adapted_extendedOperandsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INITIALIZER_ADAPTED_BODY_ITEM: {
				Initializer_adapted_bodyItem initializer_adapted_bodyItem = (Initializer_adapted_bodyItem)theEObject;
				T result = caseInitializer_adapted_bodyItem(initializer_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(initializer_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(initializer_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(initializer_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED_RIGHT_OPERAND_ITEM: {
				InstanceofExpression_adapted_rightOperandItem instanceofExpression_adapted_rightOperandItem = (InstanceofExpression_adapted_rightOperandItem)theEObject;
				T result = caseInstanceofExpression_adapted_rightOperandItem(instanceofExpression_adapted_rightOperandItem);
				if (result == null) result = caseContainmentEdgeWithHistory(instanceofExpression_adapted_rightOperandItem);
				if (result == null) result = caseEdgeWithHistory(instanceofExpression_adapted_rightOperandItem);
				if (result == null) result = caseElementWithHistory(instanceofExpression_adapted_rightOperandItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.INSTANCEOF_EXPRESSION_ADAPTED_LEFT_OPERAND_ITEM: {
				InstanceofExpression_adapted_leftOperandItem instanceofExpression_adapted_leftOperandItem = (InstanceofExpression_adapted_leftOperandItem)theEObject;
				T result = caseInstanceofExpression_adapted_leftOperandItem(instanceofExpression_adapted_leftOperandItem);
				if (result == null) result = caseContainmentEdgeWithHistory(instanceofExpression_adapted_leftOperandItem);
				if (result == null) result = caseEdgeWithHistory(instanceofExpression_adapted_leftOperandItem);
				if (result == null) result = caseElementWithHistory(instanceofExpression_adapted_leftOperandItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.JAVADOC_ADAPTED_TAGS_ITEM: {
				Javadoc_adapted_tagsItem javadoc_adapted_tagsItem = (Javadoc_adapted_tagsItem)theEObject;
				T result = caseJavadoc_adapted_tagsItem(javadoc_adapted_tagsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(javadoc_adapted_tagsItem);
				if (result == null) result = caseEdgeWithHistory(javadoc_adapted_tagsItem);
				if (result == null) result = caseElementWithHistory(javadoc_adapted_tagsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_BODY_ITEM: {
				LabeledStatement_adapted_bodyItem labeledStatement_adapted_bodyItem = (LabeledStatement_adapted_bodyItem)theEObject;
				T result = caseLabeledStatement_adapted_bodyItem(labeledStatement_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(labeledStatement_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(labeledStatement_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(labeledStatement_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_BREAK_STATEMENTS_ITEM: {
				LabeledStatement_adapted_usagesInBreakStatementsItem labeledStatement_adapted_usagesInBreakStatementsItem = (LabeledStatement_adapted_usagesInBreakStatementsItem)theEObject;
				T result = caseLabeledStatement_adapted_usagesInBreakStatementsItem(labeledStatement_adapted_usagesInBreakStatementsItem);
				if (result == null) result = caseEdgeWithHistory(labeledStatement_adapted_usagesInBreakStatementsItem);
				if (result == null) result = caseElementWithHistory(labeledStatement_adapted_usagesInBreakStatementsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.LABELED_STATEMENT_ADAPTED_USAGES_IN_CONTINUE_STATEMENTS_ITEM: {
				LabeledStatement_adapted_usagesInContinueStatementsItem labeledStatement_adapted_usagesInContinueStatementsItem = (LabeledStatement_adapted_usagesInContinueStatementsItem)theEObject;
				T result = caseLabeledStatement_adapted_usagesInContinueStatementsItem(labeledStatement_adapted_usagesInContinueStatementsItem);
				if (result == null) result = caseEdgeWithHistory(labeledStatement_adapted_usagesInContinueStatementsItem);
				if (result == null) result = caseElementWithHistory(labeledStatement_adapted_usagesInContinueStatementsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ADAPTED_MAIN_ATTRIBUTES_ITEM: {
				Manifest_adapted_mainAttributesItem manifest_adapted_mainAttributesItem = (Manifest_adapted_mainAttributesItem)theEObject;
				T result = caseManifest_adapted_mainAttributesItem(manifest_adapted_mainAttributesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(manifest_adapted_mainAttributesItem);
				if (result == null) result = caseEdgeWithHistory(manifest_adapted_mainAttributesItem);
				if (result == null) result = caseElementWithHistory(manifest_adapted_mainAttributesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ADAPTED_ENTRY_ATTRIBUTES_ITEM: {
				Manifest_adapted_entryAttributesItem manifest_adapted_entryAttributesItem = (Manifest_adapted_entryAttributesItem)theEObject;
				T result = caseManifest_adapted_entryAttributesItem(manifest_adapted_entryAttributesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(manifest_adapted_entryAttributesItem);
				if (result == null) result = caseEdgeWithHistory(manifest_adapted_entryAttributesItem);
				if (result == null) result = caseElementWithHistory(manifest_adapted_entryAttributesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED_KEY_VALUE: {
				ManifestAttribute_adapted_keyValue manifestAttribute_adapted_keyValue = (ManifestAttribute_adapted_keyValue)theEObject;
				T result = caseManifestAttribute_adapted_keyValue(manifestAttribute_adapted_keyValue);
				if (result == null) result = caseAttributeWithHistory(manifestAttribute_adapted_keyValue);
				if (result == null) result = caseElementWithHistory(manifestAttribute_adapted_keyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ATTRIBUTE_ADAPTED_VALUE_VALUE: {
				ManifestAttribute_adapted_valueValue manifestAttribute_adapted_valueValue = (ManifestAttribute_adapted_valueValue)theEObject;
				T result = caseManifestAttribute_adapted_valueValue(manifestAttribute_adapted_valueValue);
				if (result == null) result = caseAttributeWithHistory(manifestAttribute_adapted_valueValue);
				if (result == null) result = caseElementWithHistory(manifestAttribute_adapted_valueValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_NAME_VALUE: {
				ManifestEntry_adapted_nameValue manifestEntry_adapted_nameValue = (ManifestEntry_adapted_nameValue)theEObject;
				T result = caseManifestEntry_adapted_nameValue(manifestEntry_adapted_nameValue);
				if (result == null) result = caseAttributeWithHistory(manifestEntry_adapted_nameValue);
				if (result == null) result = caseElementWithHistory(manifestEntry_adapted_nameValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MANIFEST_ENTRY_ADAPTED_ATTRIBUTES_ITEM: {
				ManifestEntry_adapted_attributesItem manifestEntry_adapted_attributesItem = (ManifestEntry_adapted_attributesItem)theEObject;
				T result = caseManifestEntry_adapted_attributesItem(manifestEntry_adapted_attributesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(manifestEntry_adapted_attributesItem);
				if (result == null) result = caseEdgeWithHistory(manifestEntry_adapted_attributesItem);
				if (result == null) result = caseElementWithHistory(manifestEntry_adapted_attributesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MEMBER_REF_ADAPTED_MEMBER_ITEM: {
				MemberRef_adapted_memberItem memberRef_adapted_memberItem = (MemberRef_adapted_memberItem)theEObject;
				T result = caseMemberRef_adapted_memberItem(memberRef_adapted_memberItem);
				if (result == null) result = caseEdgeWithHistory(memberRef_adapted_memberItem);
				if (result == null) result = caseElementWithHistory(memberRef_adapted_memberItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MEMBER_REF_ADAPTED_QUALIFIER_ITEM: {
				MemberRef_adapted_qualifierItem memberRef_adapted_qualifierItem = (MemberRef_adapted_qualifierItem)theEObject;
				T result = caseMemberRef_adapted_qualifierItem(memberRef_adapted_qualifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(memberRef_adapted_qualifierItem);
				if (result == null) result = caseEdgeWithHistory(memberRef_adapted_qualifierItem);
				if (result == null) result = caseElementWithHistory(memberRef_adapted_qualifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_EXTRA_ARRAY_DIMENSIONS_VALUE: {
				MethodDeclaration_adapted_extraArrayDimensionsValue methodDeclaration_adapted_extraArrayDimensionsValue = (MethodDeclaration_adapted_extraArrayDimensionsValue)theEObject;
				T result = caseMethodDeclaration_adapted_extraArrayDimensionsValue(methodDeclaration_adapted_extraArrayDimensionsValue);
				if (result == null) result = caseAttributeWithHistory(methodDeclaration_adapted_extraArrayDimensionsValue);
				if (result == null) result = caseElementWithHistory(methodDeclaration_adapted_extraArrayDimensionsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_RETURN_TYPE_ITEM: {
				MethodDeclaration_adapted_returnTypeItem methodDeclaration_adapted_returnTypeItem = (MethodDeclaration_adapted_returnTypeItem)theEObject;
				T result = caseMethodDeclaration_adapted_returnTypeItem(methodDeclaration_adapted_returnTypeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(methodDeclaration_adapted_returnTypeItem);
				if (result == null) result = caseEdgeWithHistory(methodDeclaration_adapted_returnTypeItem);
				if (result == null) result = caseElementWithHistory(methodDeclaration_adapted_returnTypeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINED_METHOD_DECLARATION_ITEM: {
				MethodDeclaration_adapted_redefinedMethodDeclarationItem methodDeclaration_adapted_redefinedMethodDeclarationItem = (MethodDeclaration_adapted_redefinedMethodDeclarationItem)theEObject;
				T result = caseMethodDeclaration_adapted_redefinedMethodDeclarationItem(methodDeclaration_adapted_redefinedMethodDeclarationItem);
				if (result == null) result = caseEdgeWithHistory(methodDeclaration_adapted_redefinedMethodDeclarationItem);
				if (result == null) result = caseElementWithHistory(methodDeclaration_adapted_redefinedMethodDeclarationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_DECLARATION_ADAPTED_REDEFINITIONS_ITEM: {
				MethodDeclaration_adapted_redefinitionsItem methodDeclaration_adapted_redefinitionsItem = (MethodDeclaration_adapted_redefinitionsItem)theEObject;
				T result = caseMethodDeclaration_adapted_redefinitionsItem(methodDeclaration_adapted_redefinitionsItem);
				if (result == null) result = caseEdgeWithHistory(methodDeclaration_adapted_redefinitionsItem);
				if (result == null) result = caseElementWithHistory(methodDeclaration_adapted_redefinitionsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_INVOCATION_ADAPTED_EXPRESSION_ITEM: {
				MethodInvocation_adapted_expressionItem methodInvocation_adapted_expressionItem = (MethodInvocation_adapted_expressionItem)theEObject;
				T result = caseMethodInvocation_adapted_expressionItem(methodInvocation_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(methodInvocation_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(methodInvocation_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(methodInvocation_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_REF_ADAPTED_METHOD_ITEM: {
				MethodRef_adapted_methodItem methodRef_adapted_methodItem = (MethodRef_adapted_methodItem)theEObject;
				T result = caseMethodRef_adapted_methodItem(methodRef_adapted_methodItem);
				if (result == null) result = caseEdgeWithHistory(methodRef_adapted_methodItem);
				if (result == null) result = caseElementWithHistory(methodRef_adapted_methodItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_REF_ADAPTED_QUALIFIER_ITEM: {
				MethodRef_adapted_qualifierItem methodRef_adapted_qualifierItem = (MethodRef_adapted_qualifierItem)theEObject;
				T result = caseMethodRef_adapted_qualifierItem(methodRef_adapted_qualifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(methodRef_adapted_qualifierItem);
				if (result == null) result = caseEdgeWithHistory(methodRef_adapted_qualifierItem);
				if (result == null) result = caseElementWithHistory(methodRef_adapted_qualifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_REF_ADAPTED_PARAMETERS_ITEM: {
				MethodRef_adapted_parametersItem methodRef_adapted_parametersItem = (MethodRef_adapted_parametersItem)theEObject;
				T result = caseMethodRef_adapted_parametersItem(methodRef_adapted_parametersItem);
				if (result == null) result = caseContainmentEdgeWithHistory(methodRef_adapted_parametersItem);
				if (result == null) result = caseEdgeWithHistory(methodRef_adapted_parametersItem);
				if (result == null) result = caseElementWithHistory(methodRef_adapted_parametersItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED_NAME_VALUE: {
				MethodRefParameter_adapted_nameValue methodRefParameter_adapted_nameValue = (MethodRefParameter_adapted_nameValue)theEObject;
				T result = caseMethodRefParameter_adapted_nameValue(methodRefParameter_adapted_nameValue);
				if (result == null) result = caseAttributeWithHistory(methodRefParameter_adapted_nameValue);
				if (result == null) result = caseElementWithHistory(methodRefParameter_adapted_nameValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED_VARARGS_VALUE: {
				MethodRefParameter_adapted_varargsValue methodRefParameter_adapted_varargsValue = (MethodRefParameter_adapted_varargsValue)theEObject;
				T result = caseMethodRefParameter_adapted_varargsValue(methodRefParameter_adapted_varargsValue);
				if (result == null) result = caseAttributeWithHistory(methodRefParameter_adapted_varargsValue);
				if (result == null) result = caseElementWithHistory(methodRefParameter_adapted_varargsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.METHOD_REF_PARAMETER_ADAPTED_TYPE_ITEM: {
				MethodRefParameter_adapted_typeItem methodRefParameter_adapted_typeItem = (MethodRefParameter_adapted_typeItem)theEObject;
				T result = caseMethodRefParameter_adapted_typeItem(methodRefParameter_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(methodRefParameter_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(methodRefParameter_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(methodRefParameter_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODEL_ADAPTED_NAME_VALUE: {
				Model_adapted_nameValue model_adapted_nameValue = (Model_adapted_nameValue)theEObject;
				T result = caseModel_adapted_nameValue(model_adapted_nameValue);
				if (result == null) result = caseAttributeWithHistory(model_adapted_nameValue);
				if (result == null) result = caseElementWithHistory(model_adapted_nameValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODEL_ADAPTED_OWNED_ELEMENTS_ITEM: {
				Model_adapted_ownedElementsItem model_adapted_ownedElementsItem = (Model_adapted_ownedElementsItem)theEObject;
				T result = caseModel_adapted_ownedElementsItem(model_adapted_ownedElementsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(model_adapted_ownedElementsItem);
				if (result == null) result = caseEdgeWithHistory(model_adapted_ownedElementsItem);
				if (result == null) result = caseElementWithHistory(model_adapted_ownedElementsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODEL_ADAPTED_ORPHAN_TYPES_ITEM: {
				Model_adapted_orphanTypesItem model_adapted_orphanTypesItem = (Model_adapted_orphanTypesItem)theEObject;
				T result = caseModel_adapted_orphanTypesItem(model_adapted_orphanTypesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(model_adapted_orphanTypesItem);
				if (result == null) result = caseEdgeWithHistory(model_adapted_orphanTypesItem);
				if (result == null) result = caseElementWithHistory(model_adapted_orphanTypesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODEL_ADAPTED_UNRESOLVED_ITEMS_ITEM: {
				Model_adapted_unresolvedItemsItem model_adapted_unresolvedItemsItem = (Model_adapted_unresolvedItemsItem)theEObject;
				T result = caseModel_adapted_unresolvedItemsItem(model_adapted_unresolvedItemsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(model_adapted_unresolvedItemsItem);
				if (result == null) result = caseEdgeWithHistory(model_adapted_unresolvedItemsItem);
				if (result == null) result = caseElementWithHistory(model_adapted_unresolvedItemsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODEL_ADAPTED_COMPILATION_UNITS_ITEM: {
				Model_adapted_compilationUnitsItem model_adapted_compilationUnitsItem = (Model_adapted_compilationUnitsItem)theEObject;
				T result = caseModel_adapted_compilationUnitsItem(model_adapted_compilationUnitsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(model_adapted_compilationUnitsItem);
				if (result == null) result = caseEdgeWithHistory(model_adapted_compilationUnitsItem);
				if (result == null) result = caseElementWithHistory(model_adapted_compilationUnitsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODEL_ADAPTED_CLASS_FILES_ITEM: {
				Model_adapted_classFilesItem model_adapted_classFilesItem = (Model_adapted_classFilesItem)theEObject;
				T result = caseModel_adapted_classFilesItem(model_adapted_classFilesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(model_adapted_classFilesItem);
				if (result == null) result = caseEdgeWithHistory(model_adapted_classFilesItem);
				if (result == null) result = caseElementWithHistory(model_adapted_classFilesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODEL_ADAPTED_ARCHIVES_ITEM: {
				Model_adapted_archivesItem model_adapted_archivesItem = (Model_adapted_archivesItem)theEObject;
				T result = caseModel_adapted_archivesItem(model_adapted_archivesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(model_adapted_archivesItem);
				if (result == null) result = caseEdgeWithHistory(model_adapted_archivesItem);
				if (result == null) result = caseElementWithHistory(model_adapted_archivesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_VISIBILITY_VALUE: {
				Modifier_adapted_visibilityValue modifier_adapted_visibilityValue = (Modifier_adapted_visibilityValue)theEObject;
				T result = caseModifier_adapted_visibilityValue(modifier_adapted_visibilityValue);
				if (result == null) result = caseAttributeWithHistory(modifier_adapted_visibilityValue);
				if (result == null) result = caseElementWithHistory(modifier_adapted_visibilityValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_INHERITANCE_VALUE: {
				Modifier_adapted_inheritanceValue modifier_adapted_inheritanceValue = (Modifier_adapted_inheritanceValue)theEObject;
				T result = caseModifier_adapted_inheritanceValue(modifier_adapted_inheritanceValue);
				if (result == null) result = caseAttributeWithHistory(modifier_adapted_inheritanceValue);
				if (result == null) result = caseElementWithHistory(modifier_adapted_inheritanceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_STATIC_VALUE: {
				Modifier_adapted_staticValue modifier_adapted_staticValue = (Modifier_adapted_staticValue)theEObject;
				T result = caseModifier_adapted_staticValue(modifier_adapted_staticValue);
				if (result == null) result = caseAttributeWithHistory(modifier_adapted_staticValue);
				if (result == null) result = caseElementWithHistory(modifier_adapted_staticValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_TRANSIENT_VALUE: {
				Modifier_adapted_transientValue modifier_adapted_transientValue = (Modifier_adapted_transientValue)theEObject;
				T result = caseModifier_adapted_transientValue(modifier_adapted_transientValue);
				if (result == null) result = caseAttributeWithHistory(modifier_adapted_transientValue);
				if (result == null) result = caseElementWithHistory(modifier_adapted_transientValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_VOLATILE_VALUE: {
				Modifier_adapted_volatileValue modifier_adapted_volatileValue = (Modifier_adapted_volatileValue)theEObject;
				T result = caseModifier_adapted_volatileValue(modifier_adapted_volatileValue);
				if (result == null) result = caseAttributeWithHistory(modifier_adapted_volatileValue);
				if (result == null) result = caseElementWithHistory(modifier_adapted_volatileValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_NATIVE_VALUE: {
				Modifier_adapted_nativeValue modifier_adapted_nativeValue = (Modifier_adapted_nativeValue)theEObject;
				T result = caseModifier_adapted_nativeValue(modifier_adapted_nativeValue);
				if (result == null) result = caseAttributeWithHistory(modifier_adapted_nativeValue);
				if (result == null) result = caseElementWithHistory(modifier_adapted_nativeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_STRICTFP_VALUE: {
				Modifier_adapted_strictfpValue modifier_adapted_strictfpValue = (Modifier_adapted_strictfpValue)theEObject;
				T result = caseModifier_adapted_strictfpValue(modifier_adapted_strictfpValue);
				if (result == null) result = caseAttributeWithHistory(modifier_adapted_strictfpValue);
				if (result == null) result = caseElementWithHistory(modifier_adapted_strictfpValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_SYNCHRONIZED_VALUE: {
				Modifier_adapted_synchronizedValue modifier_adapted_synchronizedValue = (Modifier_adapted_synchronizedValue)theEObject;
				T result = caseModifier_adapted_synchronizedValue(modifier_adapted_synchronizedValue);
				if (result == null) result = caseAttributeWithHistory(modifier_adapted_synchronizedValue);
				if (result == null) result = caseElementWithHistory(modifier_adapted_synchronizedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_BODY_DECLARATION_ITEM: {
				Modifier_adapted_bodyDeclarationItem modifier_adapted_bodyDeclarationItem = (Modifier_adapted_bodyDeclarationItem)theEObject;
				T result = caseModifier_adapted_bodyDeclarationItem(modifier_adapted_bodyDeclarationItem);
				if (result == null) result = caseEdgeWithHistory(modifier_adapted_bodyDeclarationItem);
				if (result == null) result = caseElementWithHistory(modifier_adapted_bodyDeclarationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_SINGLE_VARIABLE_DECLARATION_ITEM: {
				Modifier_adapted_singleVariableDeclarationItem modifier_adapted_singleVariableDeclarationItem = (Modifier_adapted_singleVariableDeclarationItem)theEObject;
				T result = caseModifier_adapted_singleVariableDeclarationItem(modifier_adapted_singleVariableDeclarationItem);
				if (result == null) result = caseEdgeWithHistory(modifier_adapted_singleVariableDeclarationItem);
				if (result == null) result = caseElementWithHistory(modifier_adapted_singleVariableDeclarationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_STATEMENT_ITEM: {
				Modifier_adapted_variableDeclarationStatementItem modifier_adapted_variableDeclarationStatementItem = (Modifier_adapted_variableDeclarationStatementItem)theEObject;
				T result = caseModifier_adapted_variableDeclarationStatementItem(modifier_adapted_variableDeclarationStatementItem);
				if (result == null) result = caseEdgeWithHistory(modifier_adapted_variableDeclarationStatementItem);
				if (result == null) result = caseElementWithHistory(modifier_adapted_variableDeclarationStatementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.MODIFIER_ADAPTED_VARIABLE_DECLARATION_EXPRESSION_ITEM: {
				Modifier_adapted_variableDeclarationExpressionItem modifier_adapted_variableDeclarationExpressionItem = (Modifier_adapted_variableDeclarationExpressionItem)theEObject;
				T result = caseModifier_adapted_variableDeclarationExpressionItem(modifier_adapted_variableDeclarationExpressionItem);
				if (result == null) result = caseEdgeWithHistory(modifier_adapted_variableDeclarationExpressionItem);
				if (result == null) result = caseElementWithHistory(modifier_adapted_variableDeclarationExpressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_NAME_VALUE: {
				NamedElement_adapted_nameValue namedElement_adapted_nameValue = (NamedElement_adapted_nameValue)theEObject;
				T result = caseNamedElement_adapted_nameValue(namedElement_adapted_nameValue);
				if (result == null) result = caseAttributeWithHistory(namedElement_adapted_nameValue);
				if (result == null) result = caseElementWithHistory(namedElement_adapted_nameValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_PROXY_VALUE: {
				NamedElement_adapted_proxyValue namedElement_adapted_proxyValue = (NamedElement_adapted_proxyValue)theEObject;
				T result = caseNamedElement_adapted_proxyValue(namedElement_adapted_proxyValue);
				if (result == null) result = caseAttributeWithHistory(namedElement_adapted_proxyValue);
				if (result == null) result = caseElementWithHistory(namedElement_adapted_proxyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.NAMED_ELEMENT_ADAPTED_USAGES_IN_IMPORTS_ITEM: {
				NamedElement_adapted_usagesInImportsItem namedElement_adapted_usagesInImportsItem = (NamedElement_adapted_usagesInImportsItem)theEObject;
				T result = caseNamedElement_adapted_usagesInImportsItem(namedElement_adapted_usagesInImportsItem);
				if (result == null) result = caseEdgeWithHistory(namedElement_adapted_usagesInImportsItem);
				if (result == null) result = caseElementWithHistory(namedElement_adapted_usagesInImportsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.NUMBER_LITERAL_ADAPTED_TOKEN_VALUE_VALUE: {
				NumberLiteral_adapted_tokenValueValue numberLiteral_adapted_tokenValueValue = (NumberLiteral_adapted_tokenValueValue)theEObject;
				T result = caseNumberLiteral_adapted_tokenValueValue(numberLiteral_adapted_tokenValueValue);
				if (result == null) result = caseAttributeWithHistory(numberLiteral_adapted_tokenValueValue);
				if (result == null) result = caseElementWithHistory(numberLiteral_adapted_tokenValueValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_ELEMENTS_ITEM: {
				Package_adapted_ownedElementsItem package_adapted_ownedElementsItem = (Package_adapted_ownedElementsItem)theEObject;
				T result = casePackage_adapted_ownedElementsItem(package_adapted_ownedElementsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(package_adapted_ownedElementsItem);
				if (result == null) result = caseEdgeWithHistory(package_adapted_ownedElementsItem);
				if (result == null) result = caseElementWithHistory(package_adapted_ownedElementsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ADAPTED_MODEL_ITEM: {
				Package_adapted_modelItem package_adapted_modelItem = (Package_adapted_modelItem)theEObject;
				T result = casePackage_adapted_modelItem(package_adapted_modelItem);
				if (result == null) result = caseEdgeWithHistory(package_adapted_modelItem);
				if (result == null) result = caseElementWithHistory(package_adapted_modelItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ADAPTED_OWNED_PACKAGES_ITEM: {
				Package_adapted_ownedPackagesItem package_adapted_ownedPackagesItem = (Package_adapted_ownedPackagesItem)theEObject;
				T result = casePackage_adapted_ownedPackagesItem(package_adapted_ownedPackagesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(package_adapted_ownedPackagesItem);
				if (result == null) result = caseEdgeWithHistory(package_adapted_ownedPackagesItem);
				if (result == null) result = caseElementWithHistory(package_adapted_ownedPackagesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ADAPTED_PACKAGE_ITEM: {
				Package_adapted_packageItem package_adapted_packageItem = (Package_adapted_packageItem)theEObject;
				T result = casePackage_adapted_packageItem(package_adapted_packageItem);
				if (result == null) result = caseEdgeWithHistory(package_adapted_packageItem);
				if (result == null) result = caseElementWithHistory(package_adapted_packageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ADAPTED_USAGES_IN_PACKAGE_ACCESS_ITEM: {
				Package_adapted_usagesInPackageAccessItem package_adapted_usagesInPackageAccessItem = (Package_adapted_usagesInPackageAccessItem)theEObject;
				T result = casePackage_adapted_usagesInPackageAccessItem(package_adapted_usagesInPackageAccessItem);
				if (result == null) result = caseEdgeWithHistory(package_adapted_usagesInPackageAccessItem);
				if (result == null) result = caseElementWithHistory(package_adapted_usagesInPackageAccessItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED_PACKAGE_ITEM: {
				PackageAccess_adapted_packageItem packageAccess_adapted_packageItem = (PackageAccess_adapted_packageItem)theEObject;
				T result = casePackageAccess_adapted_packageItem(packageAccess_adapted_packageItem);
				if (result == null) result = caseEdgeWithHistory(packageAccess_adapted_packageItem);
				if (result == null) result = caseElementWithHistory(packageAccess_adapted_packageItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PACKAGE_ACCESS_ADAPTED_QUALIFIER_ITEM: {
				PackageAccess_adapted_qualifierItem packageAccess_adapted_qualifierItem = (PackageAccess_adapted_qualifierItem)theEObject;
				T result = casePackageAccess_adapted_qualifierItem(packageAccess_adapted_qualifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(packageAccess_adapted_qualifierItem);
				if (result == null) result = caseEdgeWithHistory(packageAccess_adapted_qualifierItem);
				if (result == null) result = caseElementWithHistory(packageAccess_adapted_qualifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ITEM: {
				ParameterizedType_adapted_typeItem parameterizedType_adapted_typeItem = (ParameterizedType_adapted_typeItem)theEObject;
				T result = caseParameterizedType_adapted_typeItem(parameterizedType_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(parameterizedType_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(parameterizedType_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(parameterizedType_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PARAMETERIZED_TYPE_ADAPTED_TYPE_ARGUMENTS_ITEM: {
				ParameterizedType_adapted_typeArgumentsItem parameterizedType_adapted_typeArgumentsItem = (ParameterizedType_adapted_typeArgumentsItem)theEObject;
				T result = caseParameterizedType_adapted_typeArgumentsItem(parameterizedType_adapted_typeArgumentsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(parameterizedType_adapted_typeArgumentsItem);
				if (result == null) result = caseEdgeWithHistory(parameterizedType_adapted_typeArgumentsItem);
				if (result == null) result = caseElementWithHistory(parameterizedType_adapted_typeArgumentsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PARENTHESIZED_EXPRESSION_ADAPTED_EXPRESSION_ITEM: {
				ParenthesizedExpression_adapted_expressionItem parenthesizedExpression_adapted_expressionItem = (ParenthesizedExpression_adapted_expressionItem)theEObject;
				T result = caseParenthesizedExpression_adapted_expressionItem(parenthesizedExpression_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(parenthesizedExpression_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(parenthesizedExpression_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(parenthesizedExpression_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED_OPERATOR_VALUE: {
				PostfixExpression_adapted_operatorValue postfixExpression_adapted_operatorValue = (PostfixExpression_adapted_operatorValue)theEObject;
				T result = casePostfixExpression_adapted_operatorValue(postfixExpression_adapted_operatorValue);
				if (result == null) result = caseAttributeWithHistory(postfixExpression_adapted_operatorValue);
				if (result == null) result = caseElementWithHistory(postfixExpression_adapted_operatorValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.POSTFIX_EXPRESSION_ADAPTED_OPERAND_ITEM: {
				PostfixExpression_adapted_operandItem postfixExpression_adapted_operandItem = (PostfixExpression_adapted_operandItem)theEObject;
				T result = casePostfixExpression_adapted_operandItem(postfixExpression_adapted_operandItem);
				if (result == null) result = caseContainmentEdgeWithHistory(postfixExpression_adapted_operandItem);
				if (result == null) result = caseEdgeWithHistory(postfixExpression_adapted_operandItem);
				if (result == null) result = caseElementWithHistory(postfixExpression_adapted_operandItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PREFIX_EXPRESSION_ADAPTED_OPERATOR_VALUE: {
				PrefixExpression_adapted_operatorValue prefixExpression_adapted_operatorValue = (PrefixExpression_adapted_operatorValue)theEObject;
				T result = casePrefixExpression_adapted_operatorValue(prefixExpression_adapted_operatorValue);
				if (result == null) result = caseAttributeWithHistory(prefixExpression_adapted_operatorValue);
				if (result == null) result = caseElementWithHistory(prefixExpression_adapted_operatorValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.PREFIX_EXPRESSION_ADAPTED_OPERAND_ITEM: {
				PrefixExpression_adapted_operandItem prefixExpression_adapted_operandItem = (PrefixExpression_adapted_operandItem)theEObject;
				T result = casePrefixExpression_adapted_operandItem(prefixExpression_adapted_operandItem);
				if (result == null) result = caseContainmentEdgeWithHistory(prefixExpression_adapted_operandItem);
				if (result == null) result = caseEdgeWithHistory(prefixExpression_adapted_operandItem);
				if (result == null) result = caseElementWithHistory(prefixExpression_adapted_operandItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.RETURN_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				ReturnStatement_adapted_expressionItem returnStatement_adapted_expressionItem = (ReturnStatement_adapted_expressionItem)theEObject;
				T result = caseReturnStatement_adapted_expressionItem(returnStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(returnStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(returnStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(returnStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED_VARIABLE_ITEM: {
				SingleVariableAccess_adapted_variableItem singleVariableAccess_adapted_variableItem = (SingleVariableAccess_adapted_variableItem)theEObject;
				T result = caseSingleVariableAccess_adapted_variableItem(singleVariableAccess_adapted_variableItem);
				if (result == null) result = caseEdgeWithHistory(singleVariableAccess_adapted_variableItem);
				if (result == null) result = caseElementWithHistory(singleVariableAccess_adapted_variableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_ACCESS_ADAPTED_QUALIFIER_ITEM: {
				SingleVariableAccess_adapted_qualifierItem singleVariableAccess_adapted_qualifierItem = (SingleVariableAccess_adapted_qualifierItem)theEObject;
				T result = caseSingleVariableAccess_adapted_qualifierItem(singleVariableAccess_adapted_qualifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(singleVariableAccess_adapted_qualifierItem);
				if (result == null) result = caseEdgeWithHistory(singleVariableAccess_adapted_qualifierItem);
				if (result == null) result = caseElementWithHistory(singleVariableAccess_adapted_qualifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_MODIFIER_ITEM: {
				SingleVariableDeclaration_adapted_modifierItem singleVariableDeclaration_adapted_modifierItem = (SingleVariableDeclaration_adapted_modifierItem)theEObject;
				T result = caseSingleVariableDeclaration_adapted_modifierItem(singleVariableDeclaration_adapted_modifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(singleVariableDeclaration_adapted_modifierItem);
				if (result == null) result = caseEdgeWithHistory(singleVariableDeclaration_adapted_modifierItem);
				if (result == null) result = caseElementWithHistory(singleVariableDeclaration_adapted_modifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_VARARGS_VALUE: {
				SingleVariableDeclaration_adapted_varargsValue singleVariableDeclaration_adapted_varargsValue = (SingleVariableDeclaration_adapted_varargsValue)theEObject;
				T result = caseSingleVariableDeclaration_adapted_varargsValue(singleVariableDeclaration_adapted_varargsValue);
				if (result == null) result = caseAttributeWithHistory(singleVariableDeclaration_adapted_varargsValue);
				if (result == null) result = caseElementWithHistory(singleVariableDeclaration_adapted_varargsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_TYPE_ITEM: {
				SingleVariableDeclaration_adapted_typeItem singleVariableDeclaration_adapted_typeItem = (SingleVariableDeclaration_adapted_typeItem)theEObject;
				T result = caseSingleVariableDeclaration_adapted_typeItem(singleVariableDeclaration_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(singleVariableDeclaration_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(singleVariableDeclaration_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(singleVariableDeclaration_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ANNOTATIONS_ITEM: {
				SingleVariableDeclaration_adapted_annotationsItem singleVariableDeclaration_adapted_annotationsItem = (SingleVariableDeclaration_adapted_annotationsItem)theEObject;
				T result = caseSingleVariableDeclaration_adapted_annotationsItem(singleVariableDeclaration_adapted_annotationsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(singleVariableDeclaration_adapted_annotationsItem);
				if (result == null) result = caseEdgeWithHistory(singleVariableDeclaration_adapted_annotationsItem);
				if (result == null) result = caseElementWithHistory(singleVariableDeclaration_adapted_annotationsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_METHOD_DECLARATION_ITEM: {
				SingleVariableDeclaration_adapted_methodDeclarationItem singleVariableDeclaration_adapted_methodDeclarationItem = (SingleVariableDeclaration_adapted_methodDeclarationItem)theEObject;
				T result = caseSingleVariableDeclaration_adapted_methodDeclarationItem(singleVariableDeclaration_adapted_methodDeclarationItem);
				if (result == null) result = caseEdgeWithHistory(singleVariableDeclaration_adapted_methodDeclarationItem);
				if (result == null) result = caseElementWithHistory(singleVariableDeclaration_adapted_methodDeclarationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_CATCH_CLAUSE_ITEM: {
				SingleVariableDeclaration_adapted_catchClauseItem singleVariableDeclaration_adapted_catchClauseItem = (SingleVariableDeclaration_adapted_catchClauseItem)theEObject;
				T result = caseSingleVariableDeclaration_adapted_catchClauseItem(singleVariableDeclaration_adapted_catchClauseItem);
				if (result == null) result = caseEdgeWithHistory(singleVariableDeclaration_adapted_catchClauseItem);
				if (result == null) result = caseElementWithHistory(singleVariableDeclaration_adapted_catchClauseItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SINGLE_VARIABLE_DECLARATION_ADAPTED_ENHANCED_FOR_STATEMENT_ITEM: {
				SingleVariableDeclaration_adapted_enhancedForStatementItem singleVariableDeclaration_adapted_enhancedForStatementItem = (SingleVariableDeclaration_adapted_enhancedForStatementItem)theEObject;
				T result = caseSingleVariableDeclaration_adapted_enhancedForStatementItem(singleVariableDeclaration_adapted_enhancedForStatementItem);
				if (result == null) result = caseEdgeWithHistory(singleVariableDeclaration_adapted_enhancedForStatementItem);
				if (result == null) result = caseElementWithHistory(singleVariableDeclaration_adapted_enhancedForStatementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.STRING_LITERAL_ADAPTED_ESCAPED_VALUE_VALUE: {
				StringLiteral_adapted_escapedValueValue stringLiteral_adapted_escapedValueValue = (StringLiteral_adapted_escapedValueValue)theEObject;
				T result = caseStringLiteral_adapted_escapedValueValue(stringLiteral_adapted_escapedValueValue);
				if (result == null) result = caseAttributeWithHistory(stringLiteral_adapted_escapedValueValue);
				if (result == null) result = caseElementWithHistory(stringLiteral_adapted_escapedValueValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SUPER_CONSTRUCTOR_INVOCATION_ADAPTED_EXPRESSION_ITEM: {
				SuperConstructorInvocation_adapted_expressionItem superConstructorInvocation_adapted_expressionItem = (SuperConstructorInvocation_adapted_expressionItem)theEObject;
				T result = caseSuperConstructorInvocation_adapted_expressionItem(superConstructorInvocation_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(superConstructorInvocation_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(superConstructorInvocation_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(superConstructorInvocation_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SUPER_FIELD_ACCESS_ADAPTED_FIELD_ITEM: {
				SuperFieldAccess_adapted_fieldItem superFieldAccess_adapted_fieldItem = (SuperFieldAccess_adapted_fieldItem)theEObject;
				T result = caseSuperFieldAccess_adapted_fieldItem(superFieldAccess_adapted_fieldItem);
				if (result == null) result = caseContainmentEdgeWithHistory(superFieldAccess_adapted_fieldItem);
				if (result == null) result = caseEdgeWithHistory(superFieldAccess_adapted_fieldItem);
				if (result == null) result = caseElementWithHistory(superFieldAccess_adapted_fieldItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED_DEFAULT_VALUE: {
				SwitchCase_adapted_defaultValue switchCase_adapted_defaultValue = (SwitchCase_adapted_defaultValue)theEObject;
				T result = caseSwitchCase_adapted_defaultValue(switchCase_adapted_defaultValue);
				if (result == null) result = caseAttributeWithHistory(switchCase_adapted_defaultValue);
				if (result == null) result = caseElementWithHistory(switchCase_adapted_defaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SWITCH_CASE_ADAPTED_EXPRESSION_ITEM: {
				SwitchCase_adapted_expressionItem switchCase_adapted_expressionItem = (SwitchCase_adapted_expressionItem)theEObject;
				T result = caseSwitchCase_adapted_expressionItem(switchCase_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(switchCase_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(switchCase_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(switchCase_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				SwitchStatement_adapted_expressionItem switchStatement_adapted_expressionItem = (SwitchStatement_adapted_expressionItem)theEObject;
				T result = caseSwitchStatement_adapted_expressionItem(switchStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(switchStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(switchStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(switchStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SWITCH_STATEMENT_ADAPTED_STATEMENTS_ITEM: {
				SwitchStatement_adapted_statementsItem switchStatement_adapted_statementsItem = (SwitchStatement_adapted_statementsItem)theEObject;
				T result = caseSwitchStatement_adapted_statementsItem(switchStatement_adapted_statementsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(switchStatement_adapted_statementsItem);
				if (result == null) result = caseEdgeWithHistory(switchStatement_adapted_statementsItem);
				if (result == null) result = caseElementWithHistory(switchStatement_adapted_statementsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED_BODY_ITEM: {
				SynchronizedStatement_adapted_bodyItem synchronizedStatement_adapted_bodyItem = (SynchronizedStatement_adapted_bodyItem)theEObject;
				T result = caseSynchronizedStatement_adapted_bodyItem(synchronizedStatement_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(synchronizedStatement_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(synchronizedStatement_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(synchronizedStatement_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.SYNCHRONIZED_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				SynchronizedStatement_adapted_expressionItem synchronizedStatement_adapted_expressionItem = (SynchronizedStatement_adapted_expressionItem)theEObject;
				T result = caseSynchronizedStatement_adapted_expressionItem(synchronizedStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(synchronizedStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(synchronizedStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(synchronizedStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED_TAG_NAME_VALUE: {
				TagElement_adapted_tagNameValue tagElement_adapted_tagNameValue = (TagElement_adapted_tagNameValue)theEObject;
				T result = caseTagElement_adapted_tagNameValue(tagElement_adapted_tagNameValue);
				if (result == null) result = caseAttributeWithHistory(tagElement_adapted_tagNameValue);
				if (result == null) result = caseElementWithHistory(tagElement_adapted_tagNameValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TAG_ELEMENT_ADAPTED_FRAGMENTS_ITEM: {
				TagElement_adapted_fragmentsItem tagElement_adapted_fragmentsItem = (TagElement_adapted_fragmentsItem)theEObject;
				T result = caseTagElement_adapted_fragmentsItem(tagElement_adapted_fragmentsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(tagElement_adapted_fragmentsItem);
				if (result == null) result = caseEdgeWithHistory(tagElement_adapted_fragmentsItem);
				if (result == null) result = caseElementWithHistory(tagElement_adapted_fragmentsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TEXT_ELEMENT_ADAPTED_TEXT_VALUE: {
				TextElement_adapted_textValue textElement_adapted_textValue = (TextElement_adapted_textValue)theEObject;
				T result = caseTextElement_adapted_textValue(textElement_adapted_textValue);
				if (result == null) result = caseAttributeWithHistory(textElement_adapted_textValue);
				if (result == null) result = caseElementWithHistory(textElement_adapted_textValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.THROW_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				ThrowStatement_adapted_expressionItem throwStatement_adapted_expressionItem = (ThrowStatement_adapted_expressionItem)theEObject;
				T result = caseThrowStatement_adapted_expressionItem(throwStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(throwStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(throwStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(throwStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_BODY_ITEM: {
				TryStatement_adapted_bodyItem tryStatement_adapted_bodyItem = (TryStatement_adapted_bodyItem)theEObject;
				T result = caseTryStatement_adapted_bodyItem(tryStatement_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(tryStatement_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(tryStatement_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(tryStatement_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_FINALLY_ITEM: {
				TryStatement_adapted_finallyItem tryStatement_adapted_finallyItem = (TryStatement_adapted_finallyItem)theEObject;
				T result = caseTryStatement_adapted_finallyItem(tryStatement_adapted_finallyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(tryStatement_adapted_finallyItem);
				if (result == null) result = caseEdgeWithHistory(tryStatement_adapted_finallyItem);
				if (result == null) result = caseElementWithHistory(tryStatement_adapted_finallyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TRY_STATEMENT_ADAPTED_CATCH_CLAUSES_ITEM: {
				TryStatement_adapted_catchClausesItem tryStatement_adapted_catchClausesItem = (TryStatement_adapted_catchClausesItem)theEObject;
				T result = caseTryStatement_adapted_catchClausesItem(tryStatement_adapted_catchClausesItem);
				if (result == null) result = caseContainmentEdgeWithHistory(tryStatement_adapted_catchClausesItem);
				if (result == null) result = caseEdgeWithHistory(tryStatement_adapted_catchClausesItem);
				if (result == null) result = caseElementWithHistory(tryStatement_adapted_catchClausesItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_ADAPTED_USAGES_IN_TYPE_ACCESS_ITEM: {
				Type_adapted_usagesInTypeAccessItem type_adapted_usagesInTypeAccessItem = (Type_adapted_usagesInTypeAccessItem)theEObject;
				T result = caseType_adapted_usagesInTypeAccessItem(type_adapted_usagesInTypeAccessItem);
				if (result == null) result = caseEdgeWithHistory(type_adapted_usagesInTypeAccessItem);
				if (result == null) result = caseElementWithHistory(type_adapted_usagesInTypeAccessItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_ACCESS_ADAPTED_TYPE_ITEM: {
				TypeAccess_adapted_typeItem typeAccess_adapted_typeItem = (TypeAccess_adapted_typeItem)theEObject;
				T result = caseTypeAccess_adapted_typeItem(typeAccess_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(typeAccess_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(typeAccess_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_ACCESS_ADAPTED_QUALIFIER_ITEM: {
				TypeAccess_adapted_qualifierItem typeAccess_adapted_qualifierItem = (TypeAccess_adapted_qualifierItem)theEObject;
				T result = caseTypeAccess_adapted_qualifierItem(typeAccess_adapted_qualifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(typeAccess_adapted_qualifierItem);
				if (result == null) result = caseEdgeWithHistory(typeAccess_adapted_qualifierItem);
				if (result == null) result = caseElementWithHistory(typeAccess_adapted_qualifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_DECLARATION_ADAPTED_TYPE_PARAMETERS_ITEM: {
				TypeDeclaration_adapted_typeParametersItem typeDeclaration_adapted_typeParametersItem = (TypeDeclaration_adapted_typeParametersItem)theEObject;
				T result = caseTypeDeclaration_adapted_typeParametersItem(typeDeclaration_adapted_typeParametersItem);
				if (result == null) result = caseContainmentEdgeWithHistory(typeDeclaration_adapted_typeParametersItem);
				if (result == null) result = caseEdgeWithHistory(typeDeclaration_adapted_typeParametersItem);
				if (result == null) result = caseElementWithHistory(typeDeclaration_adapted_typeParametersItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_DECLARATION_STATEMENT_ADAPTED_DECLARATION_ITEM: {
				TypeDeclarationStatement_adapted_declarationItem typeDeclarationStatement_adapted_declarationItem = (TypeDeclarationStatement_adapted_declarationItem)theEObject;
				T result = caseTypeDeclarationStatement_adapted_declarationItem(typeDeclarationStatement_adapted_declarationItem);
				if (result == null) result = caseContainmentEdgeWithHistory(typeDeclarationStatement_adapted_declarationItem);
				if (result == null) result = caseEdgeWithHistory(typeDeclarationStatement_adapted_declarationItem);
				if (result == null) result = caseElementWithHistory(typeDeclarationStatement_adapted_declarationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_LITERAL_ADAPTED_TYPE_ITEM: {
				TypeLiteral_adapted_typeItem typeLiteral_adapted_typeItem = (TypeLiteral_adapted_typeItem)theEObject;
				T result = caseTypeLiteral_adapted_typeItem(typeLiteral_adapted_typeItem);
				if (result == null) result = caseContainmentEdgeWithHistory(typeLiteral_adapted_typeItem);
				if (result == null) result = caseEdgeWithHistory(typeLiteral_adapted_typeItem);
				if (result == null) result = caseElementWithHistory(typeLiteral_adapted_typeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.TYPE_PARAMETER_ADAPTED_BOUNDS_ITEM: {
				TypeParameter_adapted_boundsItem typeParameter_adapted_boundsItem = (TypeParameter_adapted_boundsItem)theEObject;
				T result = caseTypeParameter_adapted_boundsItem(typeParameter_adapted_boundsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(typeParameter_adapted_boundsItem);
				if (result == null) result = caseEdgeWithHistory(typeParameter_adapted_boundsItem);
				if (result == null) result = caseElementWithHistory(typeParameter_adapted_boundsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_ELEMENT_ITEM: {
				UnresolvedItemAccess_adapted_elementItem unresolvedItemAccess_adapted_elementItem = (UnresolvedItemAccess_adapted_elementItem)theEObject;
				T result = caseUnresolvedItemAccess_adapted_elementItem(unresolvedItemAccess_adapted_elementItem);
				if (result == null) result = caseEdgeWithHistory(unresolvedItemAccess_adapted_elementItem);
				if (result == null) result = caseElementWithHistory(unresolvedItemAccess_adapted_elementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.UNRESOLVED_ITEM_ACCESS_ADAPTED_QUALIFIER_ITEM: {
				UnresolvedItemAccess_adapted_qualifierItem unresolvedItemAccess_adapted_qualifierItem = (UnresolvedItemAccess_adapted_qualifierItem)theEObject;
				T result = caseUnresolvedItemAccess_adapted_qualifierItem(unresolvedItemAccess_adapted_qualifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(unresolvedItemAccess_adapted_qualifierItem);
				if (result == null) result = caseEdgeWithHistory(unresolvedItemAccess_adapted_qualifierItem);
				if (result == null) result = caseElementWithHistory(unresolvedItemAccess_adapted_qualifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_EXTRA_ARRAY_DIMENSIONS_VALUE: {
				VariableDeclaration_adapted_extraArrayDimensionsValue variableDeclaration_adapted_extraArrayDimensionsValue = (VariableDeclaration_adapted_extraArrayDimensionsValue)theEObject;
				T result = caseVariableDeclaration_adapted_extraArrayDimensionsValue(variableDeclaration_adapted_extraArrayDimensionsValue);
				if (result == null) result = caseAttributeWithHistory(variableDeclaration_adapted_extraArrayDimensionsValue);
				if (result == null) result = caseElementWithHistory(variableDeclaration_adapted_extraArrayDimensionsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_INITIALIZER_ITEM: {
				VariableDeclaration_adapted_initializerItem variableDeclaration_adapted_initializerItem = (VariableDeclaration_adapted_initializerItem)theEObject;
				T result = caseVariableDeclaration_adapted_initializerItem(variableDeclaration_adapted_initializerItem);
				if (result == null) result = caseContainmentEdgeWithHistory(variableDeclaration_adapted_initializerItem);
				if (result == null) result = caseEdgeWithHistory(variableDeclaration_adapted_initializerItem);
				if (result == null) result = caseElementWithHistory(variableDeclaration_adapted_initializerItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_ADAPTED_USAGE_IN_VARIABLE_ACCESS_ITEM: {
				VariableDeclaration_adapted_usageInVariableAccessItem variableDeclaration_adapted_usageInVariableAccessItem = (VariableDeclaration_adapted_usageInVariableAccessItem)theEObject;
				T result = caseVariableDeclaration_adapted_usageInVariableAccessItem(variableDeclaration_adapted_usageInVariableAccessItem);
				if (result == null) result = caseEdgeWithHistory(variableDeclaration_adapted_usageInVariableAccessItem);
				if (result == null) result = caseElementWithHistory(variableDeclaration_adapted_usageInVariableAccessItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED_MODIFIER_ITEM: {
				VariableDeclarationExpression_adapted_modifierItem variableDeclarationExpression_adapted_modifierItem = (VariableDeclarationExpression_adapted_modifierItem)theEObject;
				T result = caseVariableDeclarationExpression_adapted_modifierItem(variableDeclarationExpression_adapted_modifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(variableDeclarationExpression_adapted_modifierItem);
				if (result == null) result = caseEdgeWithHistory(variableDeclarationExpression_adapted_modifierItem);
				if (result == null) result = caseElementWithHistory(variableDeclarationExpression_adapted_modifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_EXPRESSION_ADAPTED_ANNOTATIONS_ITEM: {
				VariableDeclarationExpression_adapted_annotationsItem variableDeclarationExpression_adapted_annotationsItem = (VariableDeclarationExpression_adapted_annotationsItem)theEObject;
				T result = caseVariableDeclarationExpression_adapted_annotationsItem(variableDeclarationExpression_adapted_annotationsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(variableDeclarationExpression_adapted_annotationsItem);
				if (result == null) result = caseEdgeWithHistory(variableDeclarationExpression_adapted_annotationsItem);
				if (result == null) result = caseElementWithHistory(variableDeclarationExpression_adapted_annotationsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_FRAGMENT_ADAPTED_VARIABLES_CONTAINER_ITEM: {
				VariableDeclarationFragment_adapted_variablesContainerItem variableDeclarationFragment_adapted_variablesContainerItem = (VariableDeclarationFragment_adapted_variablesContainerItem)theEObject;
				T result = caseVariableDeclarationFragment_adapted_variablesContainerItem(variableDeclarationFragment_adapted_variablesContainerItem);
				if (result == null) result = caseEdgeWithHistory(variableDeclarationFragment_adapted_variablesContainerItem);
				if (result == null) result = caseElementWithHistory(variableDeclarationFragment_adapted_variablesContainerItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_STATEMENT_ADAPTED_EXTRA_ARRAY_DIMENSIONS_VALUE: {
				VariableDeclarationStatement_adapted_extraArrayDimensionsValue variableDeclarationStatement_adapted_extraArrayDimensionsValue = (VariableDeclarationStatement_adapted_extraArrayDimensionsValue)theEObject;
				T result = caseVariableDeclarationStatement_adapted_extraArrayDimensionsValue(variableDeclarationStatement_adapted_extraArrayDimensionsValue);
				if (result == null) result = caseAttributeWithHistory(variableDeclarationStatement_adapted_extraArrayDimensionsValue);
				if (result == null) result = caseElementWithHistory(variableDeclarationStatement_adapted_extraArrayDimensionsValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_STATEMENT_ADAPTED_MODIFIER_ITEM: {
				VariableDeclarationStatement_adapted_modifierItem variableDeclarationStatement_adapted_modifierItem = (VariableDeclarationStatement_adapted_modifierItem)theEObject;
				T result = caseVariableDeclarationStatement_adapted_modifierItem(variableDeclarationStatement_adapted_modifierItem);
				if (result == null) result = caseContainmentEdgeWithHistory(variableDeclarationStatement_adapted_modifierItem);
				if (result == null) result = caseEdgeWithHistory(variableDeclarationStatement_adapted_modifierItem);
				if (result == null) result = caseElementWithHistory(variableDeclarationStatement_adapted_modifierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.VARIABLE_DECLARATION_STATEMENT_ADAPTED_ANNOTATIONS_ITEM: {
				VariableDeclarationStatement_adapted_annotationsItem variableDeclarationStatement_adapted_annotationsItem = (VariableDeclarationStatement_adapted_annotationsItem)theEObject;
				T result = caseVariableDeclarationStatement_adapted_annotationsItem(variableDeclarationStatement_adapted_annotationsItem);
				if (result == null) result = caseContainmentEdgeWithHistory(variableDeclarationStatement_adapted_annotationsItem);
				if (result == null) result = caseEdgeWithHistory(variableDeclarationStatement_adapted_annotationsItem);
				if (result == null) result = caseElementWithHistory(variableDeclarationStatement_adapted_annotationsItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_UPPER_BOUND_VALUE: {
				WildCardType_adapted_upperBoundValue wildCardType_adapted_upperBoundValue = (WildCardType_adapted_upperBoundValue)theEObject;
				T result = caseWildCardType_adapted_upperBoundValue(wildCardType_adapted_upperBoundValue);
				if (result == null) result = caseAttributeWithHistory(wildCardType_adapted_upperBoundValue);
				if (result == null) result = caseElementWithHistory(wildCardType_adapted_upperBoundValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.WILD_CARD_TYPE_ADAPTED_BOUND_ITEM: {
				WildCardType_adapted_boundItem wildCardType_adapted_boundItem = (WildCardType_adapted_boundItem)theEObject;
				T result = caseWildCardType_adapted_boundItem(wildCardType_adapted_boundItem);
				if (result == null) result = caseContainmentEdgeWithHistory(wildCardType_adapted_boundItem);
				if (result == null) result = caseEdgeWithHistory(wildCardType_adapted_boundItem);
				if (result == null) result = caseElementWithHistory(wildCardType_adapted_boundItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.WHILE_STATEMENT_ADAPTED_EXPRESSION_ITEM: {
				WhileStatement_adapted_expressionItem whileStatement_adapted_expressionItem = (WhileStatement_adapted_expressionItem)theEObject;
				T result = caseWhileStatement_adapted_expressionItem(whileStatement_adapted_expressionItem);
				if (result == null) result = caseContainmentEdgeWithHistory(whileStatement_adapted_expressionItem);
				if (result == null) result = caseEdgeWithHistory(whileStatement_adapted_expressionItem);
				if (result == null) result = caseElementWithHistory(whileStatement_adapted_expressionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Java_adaptedPackage.WHILE_STATEMENT_ADAPTED_BODY_ITEM: {
				WhileStatement_adapted_bodyItem whileStatement_adapted_bodyItem = (WhileStatement_adapted_bodyItem)theEObject;
				T result = caseWhileStatement_adapted_bodyItem(whileStatement_adapted_bodyItem);
				if (result == null) result = caseContainmentEdgeWithHistory(whileStatement_adapted_bodyItem);
				if (result == null) result = caseEdgeWithHistory(whileStatement_adapted_bodyItem);
				if (result == null) result = caseElementWithHistory(whileStatement_adapted_bodyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration_adapted(AbstractMethodDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocation_adapted(AbstractMethodInvocation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration_adapted(AbstractTypeDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Qualified Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Qualified Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeQualifiedExpression_adapted(AbstractTypeQualifiedExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variables Container adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variables Container adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariablesContainer_adapted(AbstractVariablesContainer_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation_adapted(Annotation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive_adapted(Archive_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertStatement_adapted(AssertStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode_adapted(ASTNode_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Pair adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Pair adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValuePair_adapted(AnnotationMemberValuePair_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeDeclaration_adapted(AnnotationTypeDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeMemberDeclaration_adapted(AnnotationTypeMemberDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassDeclaration_adapted(AnonymousClassDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAccess_adapted(ArrayAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Creation adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Creation adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayCreation_adapted(ArrayCreation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Initializer adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Initializer adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitializer_adapted(ArrayInitializer_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Length Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Length Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayLengthAccess_adapted(ArrayLengthAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType_adapted(ArrayType_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment_adapted(Assignment_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration_adapted(BodyDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral_adapted(BooleanLiteral_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Comment adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Comment adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockComment_adapted(BlockComment_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_adapted(Block_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakStatement_adapted(BreakStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastExpression_adapted(CastExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Clause adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Clause adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchClause_adapted(CatchClause_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Literal adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Literal adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterLiteral_adapted(CharacterLiteral_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class File adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class File adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassFile_adapted(ClassFile_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation_adapted(ClassInstanceCreation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorDeclaration_adapted(ConstructorDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression_adapted(ConditionalExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Invocation adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Invocation adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorInvocation_adapted(ConstructorInvocation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDeclaration_adapted(ClassDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment_adapted(Comment_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit_adapted(CompilationUnit_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinueStatement_adapted(ContinueStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoStatement_adapted(DoStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptyStatement_adapted(EmptyStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enhanced For Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enhanced For Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnhancedForStatement_adapted(EnhancedForStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Constant Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Constant Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumConstantDeclaration_adapted(EnumConstantDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDeclaration_adapted(EnumDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression_adapted(Expression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement_adapted(ExpressionStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccess_adapted(FieldAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldDeclaration_adapted(FieldDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement_adapted(ForStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement_adapted(IfStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDeclaration_adapted(ImportDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfixExpression_adapted(InfixExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializer_adapted(Initializer_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanceof Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanceof Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceofExpression_adapted(InstanceofExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDeclaration_adapted(InterfaceDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Javadoc adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Javadoc adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavadoc_adapted(Javadoc_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledStatement_adapted(LabeledStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Comment adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Comment adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineComment_adapted(LineComment_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifest_adapted(Manifest_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Attribute adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Attribute adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestAttribute_adapted(ManifestAttribute_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Entry adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Entry adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestEntry_adapted(ManifestEntry_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Ref adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Ref adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberRef_adapted(MemberRef_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration_adapted(MethodDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocation_adapted(MethodInvocation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRef_adapted(MethodRef_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref Parameter adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref Parameter adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRefParameter_adapted(MethodRefParameter_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_adapted(Model_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted(Modifier_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement_adapted(NamedElement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceAccess_adapted(NamespaceAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral_adapted(NumberLiteral_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullLiteral_adapted(NullLiteral_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage_adapted(Package_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAccess_adapted(PackageAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType_adapted(ParameterizedType_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesized Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesizedExpression_adapted(ParenthesizedExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostfixExpression_adapted(PostfixExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixExpression_adapted(PrefixExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType_adapted(PrimitiveType_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Boolean adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Boolean adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeBoolean_adapted(PrimitiveTypeBoolean_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Byte adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Byte adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeByte_adapted(PrimitiveTypeByte_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Char adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Char adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeChar_adapted(PrimitiveTypeChar_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Double adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Double adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeDouble_adapted(PrimitiveTypeDouble_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Short adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Short adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeShort_adapted(PrimitiveTypeShort_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Float adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Float adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeFloat_adapted(PrimitiveTypeFloat_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Int adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Int adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeInt_adapted(PrimitiveTypeInt_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Long adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Long adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeLong_adapted(PrimitiveTypeLong_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type Void adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type Void adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypeVoid_adapted(PrimitiveTypeVoid_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement_adapted(ReturnStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableAccess_adapted(SingleVariableAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration_adapted(SingleVariableDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement_adapted(Statement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral_adapted(StringLiteral_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Constructor Invocation adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Constructor Invocation adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConstructorInvocation_adapted(SuperConstructorInvocation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Field Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Field Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperFieldAccess_adapted(SuperFieldAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Method Invocation adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Method Invocation adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperMethodInvocation_adapted(SuperMethodInvocation_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase_adapted(SwitchCase_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatement_adapted(SwitchStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizedStatement_adapted(SynchronizedStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Element adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Element adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagElement_adapted(TagElement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Element adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElement_adapted(TextElement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThisExpression_adapted(ThisExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowStatement_adapted(ThrowStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryStatement_adapted(TryStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType_adapted(Type_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess_adapted(TypeAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration_adapted(TypeDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclarationStatement_adapted(TypeDeclarationStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Literal adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Literal adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLiteral_adapted(TypeLiteral_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter_adapted(TypeParameter_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Item adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Item adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedItem_adapted(UnresolvedItem_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Item Access adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Item Access adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedItemAccess_adapted(UnresolvedItemAccess_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Annotation Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Annotation Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedAnnotationDeclaration_adapted(UnresolvedAnnotationDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Annotation Type Member Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Annotation Type Member Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedAnnotationTypeMemberDeclaration_adapted(UnresolvedAnnotationTypeMemberDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Class Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Class Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedClassDeclaration_adapted(UnresolvedClassDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Enum Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Enum Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedEnumDeclaration_adapted(UnresolvedEnumDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Interface Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Interface Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedInterfaceDeclaration_adapted(UnresolvedInterfaceDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Labeled Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Labeled Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedLabeledStatement_adapted(UnresolvedLabeledStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Method Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Method Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedMethodDeclaration_adapted(UnresolvedMethodDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Single Variable Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Single Variable Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedSingleVariableDeclaration_adapted(UnresolvedSingleVariableDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedType_adapted(UnresolvedType_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Type Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Type Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedTypeDeclaration_adapted(UnresolvedTypeDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Variable Declaration Fragment adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Variable Declaration Fragment adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedVariableDeclarationFragment_adapted(UnresolvedVariableDeclarationFragment_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration_adapted(VariableDeclaration_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Expression adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Expression adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationExpression_adapted(VariableDeclarationExpression_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Fragment adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Fragment adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationFragment_adapted(VariableDeclarationFragment_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationStatement_adapted(VariableDeclarationStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wild Card Type adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wild Card Type adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildCardType_adapted(WildCardType_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement adapted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement adapted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement_adapted(WhileStatement_adapted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration_adapted_bodyItem(AbstractMethodDeclaration_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted parameters Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted parameters Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration_adapted_parametersItem(AbstractMethodDeclaration_adapted_parametersItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted thrown Exceptions Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted thrown Exceptions Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration_adapted_thrownExceptionsItem(AbstractMethodDeclaration_adapted_thrownExceptionsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted type Parameters Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted type Parameters Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration_adapted_typeParametersItem(AbstractMethodDeclaration_adapted_typeParametersItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted usages In Doc Comments Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted usages In Doc Comments Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration_adapted_usagesInDocCommentsItem(AbstractMethodDeclaration_adapted_usagesInDocCommentsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted usages Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Declaration adapted usages Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodDeclaration_adapted_usagesItem(AbstractMethodDeclaration_adapted_usagesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation adapted method Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation adapted method Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocation_adapted_methodItem(AbstractMethodInvocation_adapted_methodItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation adapted arguments Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation adapted arguments Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocation_adapted_argumentsItem(AbstractMethodInvocation_adapted_argumentsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Method Invocation adapted type Arguments Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Method Invocation adapted type Arguments Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMethodInvocation_adapted_typeArgumentsItem(AbstractMethodInvocation_adapted_typeArgumentsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted body Declarations Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted body Declarations Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration_adapted_bodyDeclarationsItem(AbstractTypeDeclaration_adapted_bodyDeclarationsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted comments Before Body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted comments Before Body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration_adapted_commentsBeforeBodyItem(AbstractTypeDeclaration_adapted_commentsBeforeBodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted comments After Body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted comments After Body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration_adapted_commentsAfterBodyItem(AbstractTypeDeclaration_adapted_commentsAfterBodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted package Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted package Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration_adapted_packageItem(AbstractTypeDeclaration_adapted_packageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted super Interfaces Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Declaration adapted super Interfaces Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeDeclaration_adapted_superInterfacesItem(AbstractTypeDeclaration_adapted_superInterfacesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type Qualified Expression adapted qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type Qualified Expression adapted qualifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTypeQualifiedExpression_adapted_qualifierItem(AbstractTypeQualifiedExpression_adapted_qualifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variables Container adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variables Container adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariablesContainer_adapted_typeItem(AbstractVariablesContainer_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variables Container adapted fragments Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variables Container adapted fragments Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariablesContainer_adapted_fragmentsItem(AbstractVariablesContainer_adapted_fragmentsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation_adapted_typeItem(Annotation_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation adapted values Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation adapted values Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation_adapted_valuesItem(Annotation_adapted_valuesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive adapted original File Path Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive adapted original File Path Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive_adapted_originalFilePathValue(Archive_adapted_originalFilePathValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive adapted class Files Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive adapted class Files Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive_adapted_classFilesItem(Archive_adapted_classFilesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archive adapted manifest Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archive adapted manifest Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchive_adapted_manifestItem(Archive_adapted_manifestItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Statement adapted message Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Statement adapted message Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertStatement_adapted_messageItem(AssertStatement_adapted_messageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assert Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assert Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertStatement_adapted_expressionItem(AssertStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node adapted comments Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node adapted comments Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode_adapted_commentsItem(ASTNode_adapted_commentsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node adapted original Compilation Unit Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node adapted original Compilation Unit Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode_adapted_originalCompilationUnitItem(ASTNode_adapted_originalCompilationUnitItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AST Node adapted original Class File Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AST Node adapted original Class File Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASTNode_adapted_originalClassFileItem(ASTNode_adapted_originalClassFileItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Pair adapted member Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Pair adapted member Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValuePair_adapted_memberItem(AnnotationMemberValuePair_adapted_memberItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Member Value Pair adapted value Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Member Value Pair adapted value Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationMemberValuePair_adapted_valueItem(AnnotationMemberValuePair_adapted_valueItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration adapted default Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration adapted default Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeMemberDeclaration_adapted_defaultItem(AnnotationTypeMemberDeclaration_adapted_defaultItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeMemberDeclaration_adapted_typeItem(AnnotationTypeMemberDeclaration_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration adapted usages Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type Member Declaration adapted usages Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationTypeMemberDeclaration_adapted_usagesItem(AnnotationTypeMemberDeclaration_adapted_usagesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Declaration adapted body Declarations Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Declaration adapted body Declarations Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassDeclaration_adapted_bodyDeclarationsItem(AnonymousClassDeclaration_adapted_bodyDeclarationsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Class Declaration adapted class Instance Creation Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Class Declaration adapted class Instance Creation Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousClassDeclaration_adapted_classInstanceCreationItem(AnonymousClassDeclaration_adapted_classInstanceCreationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Access adapted array Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Access adapted array Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAccess_adapted_arrayItem(ArrayAccess_adapted_arrayItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Access adapted index Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Access adapted index Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAccess_adapted_indexItem(ArrayAccess_adapted_indexItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Creation adapted dimensions Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Creation adapted dimensions Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayCreation_adapted_dimensionsItem(ArrayCreation_adapted_dimensionsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Creation adapted initializer Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Creation adapted initializer Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayCreation_adapted_initializerItem(ArrayCreation_adapted_initializerItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Creation adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Creation adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayCreation_adapted_typeItem(ArrayCreation_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Initializer adapted expressions Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Initializer adapted expressions Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayInitializer_adapted_expressionsItem(ArrayInitializer_adapted_expressionsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Length Access adapted array Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Length Access adapted array Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayLengthAccess_adapted_arrayItem(ArrayLengthAccess_adapted_arrayItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type adapted dimensions Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type adapted dimensions Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType_adapted_dimensionsValue(ArrayType_adapted_dimensionsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type adapted element Type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type adapted element Type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType_adapted_elementTypeItem(ArrayType_adapted_elementTypeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment adapted left Hand Side Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment adapted left Hand Side Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment_adapted_leftHandSideItem(Assignment_adapted_leftHandSideItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment adapted operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment adapted operator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment_adapted_operatorValue(Assignment_adapted_operatorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment adapted right Hand Side Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment adapted right Hand Side Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment_adapted_rightHandSideItem(Assignment_adapted_rightHandSideItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration adapted abstract Type Declaration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration adapted abstract Type Declaration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration_adapted_abstractTypeDeclarationItem(BodyDeclaration_adapted_abstractTypeDeclarationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration adapted annotations Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration adapted annotations Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration_adapted_annotationsItem(BodyDeclaration_adapted_annotationsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration adapted anonymous Class Declaration Owner Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration adapted anonymous Class Declaration Owner Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration_adapted_anonymousClassDeclarationOwnerItem(BodyDeclaration_adapted_anonymousClassDeclarationOwnerItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Declaration adapted modifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Declaration adapted modifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyDeclaration_adapted_modifierItem(BodyDeclaration_adapted_modifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal adapted value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal adapted value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral_adapted_valueValue(BooleanLiteral_adapted_valueValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block adapted statements Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block adapted statements Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock_adapted_statementsItem(Block_adapted_statementsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement adapted label Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement adapted label Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreakStatement_adapted_labelItem(BreakStatement_adapted_labelItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastExpression_adapted_expressionItem(CastExpression_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastExpression_adapted_typeItem(CastExpression_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Clause adapted exception Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Clause adapted exception Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchClause_adapted_exceptionItem(CatchClause_adapted_exceptionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Clause adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Clause adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchClause_adapted_bodyItem(CatchClause_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Literal adapted escaped Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Literal adapted escaped Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterLiteral_adapted_escapedValueValue(CharacterLiteral_adapted_escapedValueValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class File adapted original File Path Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class File adapted original File Path Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassFile_adapted_originalFilePathValue(ClassFile_adapted_originalFilePathValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class File adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class File adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassFile_adapted_typeItem(ClassFile_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class File adapted attached Source Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class File adapted attached Source Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassFile_adapted_attachedSourceItem(ClassFile_adapted_attachedSourceItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class File adapted package Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class File adapted package Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassFile_adapted_packageItem(ClassFile_adapted_packageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation adapted anonymous Class Declaration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation adapted anonymous Class Declaration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation_adapted_anonymousClassDeclarationItem(ClassInstanceCreation_adapted_anonymousClassDeclarationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation_adapted_expressionItem(ClassInstanceCreation_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Instance Creation adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Instance Creation adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassInstanceCreation_adapted_typeItem(ClassInstanceCreation_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression adapted else Expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression adapted else Expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression_adapted_elseExpressionItem(ConditionalExpression_adapted_elseExpressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression_adapted_expressionItem(ConditionalExpression_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression adapted then Expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression adapted then Expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalExpression_adapted_thenExpressionItem(ConditionalExpression_adapted_thenExpressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Declaration adapted super Class Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Declaration adapted super Class Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassDeclaration_adapted_superClassItem(ClassDeclaration_adapted_superClassItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment adapted content Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment adapted content Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment_adapted_contentValue(Comment_adapted_contentValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment adapted enclosed By Parent Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment adapted enclosed By Parent Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment_adapted_enclosedByParentValue(Comment_adapted_enclosedByParentValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment adapted prefix Of Parent Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment adapted prefix Of Parent Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment_adapted_prefixOfParentValue(Comment_adapted_prefixOfParentValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit adapted original File Path Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit adapted original File Path Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit_adapted_originalFilePathValue(CompilationUnit_adapted_originalFilePathValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit adapted comment List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit adapted comment List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit_adapted_commentListItem(CompilationUnit_adapted_commentListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit adapted imports Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit adapted imports Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit_adapted_importsItem(CompilationUnit_adapted_importsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit adapted package Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit adapted package Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit_adapted_packageItem(CompilationUnit_adapted_packageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compilation Unit adapted types Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compilation Unit adapted types Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompilationUnit_adapted_typesItem(CompilationUnit_adapted_typesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Statement adapted label Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Statement adapted label Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinueStatement_adapted_labelItem(ContinueStatement_adapted_labelItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoStatement_adapted_expressionItem(DoStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Statement adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Statement adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoStatement_adapted_bodyItem(DoStatement_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enhanced For Statement adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enhanced For Statement adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnhancedForStatement_adapted_bodyItem(EnhancedForStatement_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enhanced For Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enhanced For Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnhancedForStatement_adapted_expressionItem(EnhancedForStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enhanced For Statement adapted parameter Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enhanced For Statement adapted parameter Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnhancedForStatement_adapted_parameterItem(EnhancedForStatement_adapted_parameterItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Constant Declaration adapted anonymous Class Declaration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Constant Declaration adapted anonymous Class Declaration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumConstantDeclaration_adapted_anonymousClassDeclarationItem(EnumConstantDeclaration_adapted_anonymousClassDeclarationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Constant Declaration adapted arguments Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Constant Declaration adapted arguments Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumConstantDeclaration_adapted_argumentsItem(EnumConstantDeclaration_adapted_argumentsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Declaration adapted enum Constants Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Declaration adapted enum Constants Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumDeclaration_adapted_enumConstantsItem(EnumDeclaration_adapted_enumConstantsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement_adapted_expressionItem(ExpressionStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access adapted field Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access adapted field Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccess_adapted_fieldItem(FieldAccess_adapted_fieldItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Access adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Access adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldAccess_adapted_expressionItem(FieldAccess_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement_adapted_expressionItem(ForStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement adapted updaters Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement adapted updaters Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement_adapted_updatersItem(ForStatement_adapted_updatersItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement adapted initializers Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement adapted initializers Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement_adapted_initializersItem(ForStatement_adapted_initializersItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForStatement_adapted_bodyItem(ForStatement_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement_adapted_expressionItem(IfStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement adapted then Statement Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement adapted then Statement Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement_adapted_thenStatementItem(IfStatement_adapted_thenStatementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement adapted else Statement Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement adapted else Statement Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement_adapted_elseStatementItem(IfStatement_adapted_elseStatementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Declaration adapted static Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Declaration adapted static Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDeclaration_adapted_staticValue(ImportDeclaration_adapted_staticValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Declaration adapted imported Element Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Declaration adapted imported Element Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDeclaration_adapted_importedElementItem(ImportDeclaration_adapted_importedElementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Expression adapted operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Expression adapted operator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfixExpression_adapted_operatorValue(InfixExpression_adapted_operatorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Expression adapted right Operand Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Expression adapted right Operand Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfixExpression_adapted_rightOperandItem(InfixExpression_adapted_rightOperandItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Expression adapted left Operand Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Expression adapted left Operand Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfixExpression_adapted_leftOperandItem(InfixExpression_adapted_leftOperandItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infix Expression adapted extended Operands Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infix Expression adapted extended Operands Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfixExpression_adapted_extendedOperandsItem(InfixExpression_adapted_extendedOperandsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initializer adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initializer adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializer_adapted_bodyItem(Initializer_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanceof Expression adapted right Operand Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanceof Expression adapted right Operand Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceofExpression_adapted_rightOperandItem(InstanceofExpression_adapted_rightOperandItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanceof Expression adapted left Operand Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanceof Expression adapted left Operand Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceofExpression_adapted_leftOperandItem(InstanceofExpression_adapted_leftOperandItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Javadoc adapted tags Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Javadoc adapted tags Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavadoc_adapted_tagsItem(Javadoc_adapted_tagsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Statement adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Statement adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledStatement_adapted_bodyItem(LabeledStatement_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Statement adapted usages In Break Statements Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Statement adapted usages In Break Statements Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledStatement_adapted_usagesInBreakStatementsItem(LabeledStatement_adapted_usagesInBreakStatementsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labeled Statement adapted usages In Continue Statements Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labeled Statement adapted usages In Continue Statements Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabeledStatement_adapted_usagesInContinueStatementsItem(LabeledStatement_adapted_usagesInContinueStatementsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest adapted main Attributes Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest adapted main Attributes Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifest_adapted_mainAttributesItem(Manifest_adapted_mainAttributesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest adapted entry Attributes Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest adapted entry Attributes Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifest_adapted_entryAttributesItem(Manifest_adapted_entryAttributesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Attribute adapted key Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Attribute adapted key Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestAttribute_adapted_keyValue(ManifestAttribute_adapted_keyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Attribute adapted value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Attribute adapted value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestAttribute_adapted_valueValue(ManifestAttribute_adapted_valueValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Entry adapted name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Entry adapted name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestEntry_adapted_nameValue(ManifestEntry_adapted_nameValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest Entry adapted attributes Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest Entry adapted attributes Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifestEntry_adapted_attributesItem(ManifestEntry_adapted_attributesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Ref adapted member Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Ref adapted member Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberRef_adapted_memberItem(MemberRef_adapted_memberItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Ref adapted qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Ref adapted qualifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberRef_adapted_qualifierItem(MemberRef_adapted_qualifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration adapted extra Array Dimensions Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration adapted extra Array Dimensions Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration_adapted_extraArrayDimensionsValue(MethodDeclaration_adapted_extraArrayDimensionsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration adapted return Type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration adapted return Type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration_adapted_returnTypeItem(MethodDeclaration_adapted_returnTypeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration adapted redefined Method Declaration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration adapted redefined Method Declaration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration_adapted_redefinedMethodDeclarationItem(MethodDeclaration_adapted_redefinedMethodDeclarationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration adapted redefinitions Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration adapted redefinitions Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodDeclaration_adapted_redefinitionsItem(MethodDeclaration_adapted_redefinitionsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Invocation adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Invocation adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodInvocation_adapted_expressionItem(MethodInvocation_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref adapted method Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref adapted method Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRef_adapted_methodItem(MethodRef_adapted_methodItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref adapted qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref adapted qualifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRef_adapted_qualifierItem(MethodRef_adapted_qualifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref adapted parameters Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref adapted parameters Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRef_adapted_parametersItem(MethodRef_adapted_parametersItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref Parameter adapted name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref Parameter adapted name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRefParameter_adapted_nameValue(MethodRefParameter_adapted_nameValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref Parameter adapted varargs Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref Parameter adapted varargs Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRefParameter_adapted_varargsValue(MethodRefParameter_adapted_varargsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Ref Parameter adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Ref Parameter adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodRefParameter_adapted_typeItem(MethodRefParameter_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model adapted name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model adapted name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_adapted_nameValue(Model_adapted_nameValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model adapted owned Elements Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model adapted owned Elements Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_adapted_ownedElementsItem(Model_adapted_ownedElementsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model adapted orphan Types Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model adapted orphan Types Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_adapted_orphanTypesItem(Model_adapted_orphanTypesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model adapted unresolved Items Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model adapted unresolved Items Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_adapted_unresolvedItemsItem(Model_adapted_unresolvedItemsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model adapted compilation Units Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model adapted compilation Units Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_adapted_compilationUnitsItem(Model_adapted_compilationUnitsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model adapted class Files Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model adapted class Files Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_adapted_classFilesItem(Model_adapted_classFilesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model adapted archives Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model adapted archives Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel_adapted_archivesItem(Model_adapted_archivesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted visibility Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted visibility Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_visibilityValue(Modifier_adapted_visibilityValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted inheritance Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted inheritance Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_inheritanceValue(Modifier_adapted_inheritanceValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted static Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted static Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_staticValue(Modifier_adapted_staticValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted transient Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted transient Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_transientValue(Modifier_adapted_transientValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted volatile Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted volatile Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_volatileValue(Modifier_adapted_volatileValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted native Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted native Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_nativeValue(Modifier_adapted_nativeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted strictfp Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted strictfp Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_strictfpValue(Modifier_adapted_strictfpValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted synchronized Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted synchronized Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_synchronizedValue(Modifier_adapted_synchronizedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted body Declaration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted body Declaration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_bodyDeclarationItem(Modifier_adapted_bodyDeclarationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted single Variable Declaration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted single Variable Declaration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_singleVariableDeclarationItem(Modifier_adapted_singleVariableDeclarationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted variable Declaration Statement Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted variable Declaration Statement Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_variableDeclarationStatementItem(Modifier_adapted_variableDeclarationStatementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier adapted variable Declaration Expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier adapted variable Declaration Expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier_adapted_variableDeclarationExpressionItem(Modifier_adapted_variableDeclarationExpressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element adapted name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element adapted name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement_adapted_nameValue(NamedElement_adapted_nameValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element adapted proxy Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element adapted proxy Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement_adapted_proxyValue(NamedElement_adapted_proxyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element adapted usages In Imports Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element adapted usages In Imports Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement_adapted_usagesInImportsItem(NamedElement_adapted_usagesInImportsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal adapted token Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal adapted token Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral_adapted_tokenValueValue(NumberLiteral_adapted_tokenValueValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package adapted owned Elements Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package adapted owned Elements Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage_adapted_ownedElementsItem(Package_adapted_ownedElementsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package adapted model Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package adapted model Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage_adapted_modelItem(Package_adapted_modelItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package adapted owned Packages Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package adapted owned Packages Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage_adapted_ownedPackagesItem(Package_adapted_ownedPackagesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package adapted package Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package adapted package Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage_adapted_packageItem(Package_adapted_packageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package adapted usages In Package Access Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package adapted usages In Package Access Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage_adapted_usagesInPackageAccessItem(Package_adapted_usagesInPackageAccessItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Access adapted package Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Access adapted package Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAccess_adapted_packageItem(PackageAccess_adapted_packageItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Access adapted qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Access adapted qualifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageAccess_adapted_qualifierItem(PackageAccess_adapted_qualifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType_adapted_typeItem(ParameterizedType_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Type adapted type Arguments Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Type adapted type Arguments Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterizedType_adapted_typeArgumentsItem(ParameterizedType_adapted_typeArgumentsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parenthesized Expression adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parenthesized Expression adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParenthesizedExpression_adapted_expressionItem(ParenthesizedExpression_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Expression adapted operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Expression adapted operator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostfixExpression_adapted_operatorValue(PostfixExpression_adapted_operatorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Expression adapted operand Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Expression adapted operand Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostfixExpression_adapted_operandItem(PostfixExpression_adapted_operandItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Expression adapted operator Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Expression adapted operator Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixExpression_adapted_operatorValue(PrefixExpression_adapted_operatorValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Expression adapted operand Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Expression adapted operand Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixExpression_adapted_operandItem(PrefixExpression_adapted_operandItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnStatement_adapted_expressionItem(ReturnStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Access adapted variable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Access adapted variable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableAccess_adapted_variableItem(SingleVariableAccess_adapted_variableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Access adapted qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Access adapted qualifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableAccess_adapted_qualifierItem(SingleVariableAccess_adapted_qualifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted modifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted modifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration_adapted_modifierItem(SingleVariableDeclaration_adapted_modifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted varargs Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted varargs Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration_adapted_varargsValue(SingleVariableDeclaration_adapted_varargsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration_adapted_typeItem(SingleVariableDeclaration_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted annotations Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted annotations Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration_adapted_annotationsItem(SingleVariableDeclaration_adapted_annotationsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted method Declaration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted method Declaration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration_adapted_methodDeclarationItem(SingleVariableDeclaration_adapted_methodDeclarationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted catch Clause Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted catch Clause Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration_adapted_catchClauseItem(SingleVariableDeclaration_adapted_catchClauseItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted enhanced For Statement Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Variable Declaration adapted enhanced For Statement Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleVariableDeclaration_adapted_enhancedForStatementItem(SingleVariableDeclaration_adapted_enhancedForStatementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal adapted escaped Value Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal adapted escaped Value Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral_adapted_escapedValueValue(StringLiteral_adapted_escapedValueValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Constructor Invocation adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Constructor Invocation adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperConstructorInvocation_adapted_expressionItem(SuperConstructorInvocation_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Field Access adapted field Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Field Access adapted field Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperFieldAccess_adapted_fieldItem(SuperFieldAccess_adapted_fieldItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case adapted default Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case adapted default Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase_adapted_defaultValue(SwitchCase_adapted_defaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase_adapted_expressionItem(SwitchCase_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatement_adapted_expressionItem(SwitchStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement adapted statements Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement adapted statements Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatement_adapted_statementsItem(SwitchStatement_adapted_statementsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized Statement adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized Statement adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizedStatement_adapted_bodyItem(SynchronizedStatement_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Synchronized Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Synchronized Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSynchronizedStatement_adapted_expressionItem(SynchronizedStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Element adapted tag Name Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Element adapted tag Name Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagElement_adapted_tagNameValue(TagElement_adapted_tagNameValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Element adapted fragments Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Element adapted fragments Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagElement_adapted_fragmentsItem(TagElement_adapted_fragmentsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Element adapted text Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element adapted text Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElement_adapted_textValue(TextElement_adapted_textValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowStatement_adapted_expressionItem(ThrowStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Statement adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Statement adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryStatement_adapted_bodyItem(TryStatement_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Statement adapted finally Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Statement adapted finally Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryStatement_adapted_finallyItem(TryStatement_adapted_finallyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Statement adapted catch Clauses Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Statement adapted catch Clauses Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryStatement_adapted_catchClausesItem(TryStatement_adapted_catchClausesItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type adapted usages In Type Access Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type adapted usages In Type Access Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType_adapted_usagesInTypeAccessItem(Type_adapted_usagesInTypeAccessItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess_adapted_typeItem(TypeAccess_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Access adapted qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Access adapted qualifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAccess_adapted_qualifierItem(TypeAccess_adapted_qualifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration adapted type Parameters Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration adapted type Parameters Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration_adapted_typeParametersItem(TypeDeclaration_adapted_typeParametersItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration Statement adapted declaration Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration Statement adapted declaration Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclarationStatement_adapted_declarationItem(TypeDeclarationStatement_adapted_declarationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Literal adapted type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Literal adapted type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeLiteral_adapted_typeItem(TypeLiteral_adapted_typeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter adapted bounds Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter adapted bounds Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter_adapted_boundsItem(TypeParameter_adapted_boundsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Item Access adapted element Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Item Access adapted element Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedItemAccess_adapted_elementItem(UnresolvedItemAccess_adapted_elementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unresolved Item Access adapted qualifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unresolved Item Access adapted qualifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnresolvedItemAccess_adapted_qualifierItem(UnresolvedItemAccess_adapted_qualifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration adapted extra Array Dimensions Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration adapted extra Array Dimensions Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration_adapted_extraArrayDimensionsValue(VariableDeclaration_adapted_extraArrayDimensionsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration adapted initializer Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration adapted initializer Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration_adapted_initializerItem(VariableDeclaration_adapted_initializerItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration adapted usage In Variable Access Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration adapted usage In Variable Access Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration_adapted_usageInVariableAccessItem(VariableDeclaration_adapted_usageInVariableAccessItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Expression adapted modifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Expression adapted modifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationExpression_adapted_modifierItem(VariableDeclarationExpression_adapted_modifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Expression adapted annotations Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Expression adapted annotations Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationExpression_adapted_annotationsItem(VariableDeclarationExpression_adapted_annotationsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Fragment adapted variables Container Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Fragment adapted variables Container Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationFragment_adapted_variablesContainerItem(VariableDeclarationFragment_adapted_variablesContainerItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Statement adapted extra Array Dimensions Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Statement adapted extra Array Dimensions Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationStatement_adapted_extraArrayDimensionsValue(VariableDeclarationStatement_adapted_extraArrayDimensionsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Statement adapted modifier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Statement adapted modifier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationStatement_adapted_modifierItem(VariableDeclarationStatement_adapted_modifierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Statement adapted annotations Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Statement adapted annotations Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclarationStatement_adapted_annotationsItem(VariableDeclarationStatement_adapted_annotationsItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wild Card Type adapted upper Bound Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wild Card Type adapted upper Bound Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildCardType_adapted_upperBoundValue(WildCardType_adapted_upperBoundValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wild Card Type adapted bound Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wild Card Type adapted bound Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildCardType_adapted_boundItem(WildCardType_adapted_boundItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement adapted expression Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement adapted expression Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement_adapted_expressionItem(WhileStatement_adapted_expressionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement adapted body Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement adapted body Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileStatement_adapted_bodyItem(WhileStatement_adapted_bodyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementWithHistory(ElementWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeWithHistory(NodeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeWithHistory(EdgeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containment Edge With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containment Edge With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainmentEdgeWithHistory(ContainmentEdgeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute With History</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute With History</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeWithHistory(AttributeWithHistory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Java_adaptedSwitch
