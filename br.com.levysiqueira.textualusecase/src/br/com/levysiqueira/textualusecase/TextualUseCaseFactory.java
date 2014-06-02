/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage
 * @generated
 */
public interface TextualUseCaseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextualUseCaseFactory eINSTANCE = br.com.levysiqueira.textualusecase.impl.TextualUseCaseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Use Case Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case Model</em>'.
	 * @generated
	 */
	UseCaseModel createUseCaseModel();

	/**
	 * Returns a new object of class '<em>Use Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Case</em>'.
	 * @generated
	 */
	UseCase createUseCase();

	/**
	 * Returns a new object of class '<em>Alternative Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Flow</em>'.
	 * @generated
	 */
	AlternativeFlow createAlternativeFlow();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Basic Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Flow</em>'.
	 * @generated
	 */
	BasicFlow createBasicFlow();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	Actor createActor();

	/**
	 * Returns a new object of class '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subject</em>'.
	 * @generated
	 */
	Subject createSubject();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Conditional Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Statement</em>'.
	 * @generated
	 */
	ConditionalStatement createConditionalStatement();

	/**
	 * Returns a new object of class '<em>Loop Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop Statement</em>'.
	 * @generated
	 */
	LoopStatement createLoopStatement();

	/**
	 * Returns a new object of class '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Include</em>'.
	 * @generated
	 */
	Include createInclude();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TextualUseCasePackage getTextualUseCasePackage();

} //TextualUseCaseFactory
