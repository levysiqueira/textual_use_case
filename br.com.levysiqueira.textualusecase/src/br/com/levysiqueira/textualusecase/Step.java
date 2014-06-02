/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.statement <> null  xor self.flowOfEvents <> null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.Step#getAlternativeFlow <em>Alternative Flow</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.Step#getStatement <em>Statement</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.Step#getName <em>Name</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.Step#getFlowOfEvents <em>Flow Of Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Alternative Flow</b></em>' reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.AlternativeFlow}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getBranchingStep <em>Branching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Flow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Flow</em>' reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getStep_AlternativeFlow()
	 * @see br.com.levysiqueira.textualusecase.AlternativeFlow#getBranchingStep
	 * @model opposite="branchingStep" ordered="false"
	 * @generated
	 */
	EList<AlternativeFlow> getAlternativeFlow();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Statement#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' container reference.
	 * @see #setStatement(Statement)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getStep_Statement()
	 * @see br.com.levysiqueira.textualusecase.Statement#getSteps
	 * @model opposite="steps" transient="false" ordered="false"
	 * @generated
	 */
	Statement getStatement();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Step#getStatement <em>Statement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' container reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(Statement value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Changed "order" to EString to allow referencing
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getStep_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Flow Of Events</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.FlowOfEvents#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Of Events</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Of Events</em>' container reference.
	 * @see #setFlowOfEvents(FlowOfEvents)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getStep_FlowOfEvents()
	 * @see br.com.levysiqueira.textualusecase.FlowOfEvents#getSteps
	 * @model opposite="steps" transient="false" ordered="false"
	 * @generated
	 */
	FlowOfEvents getFlowOfEvents();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Step#getFlowOfEvents <em>Flow Of Events</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Of Events</em>' container reference.
	 * @see #getFlowOfEvents()
	 * @generated
	 */
	void setFlowOfEvents(FlowOfEvents value);

} // Step
