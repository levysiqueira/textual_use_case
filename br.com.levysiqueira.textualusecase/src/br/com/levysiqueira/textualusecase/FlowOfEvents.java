/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Of Events</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.FlowOfEvents#getSteps <em>Steps</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.FlowOfEvents#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getFlowOfEvents()
 * @model abstract="true"
 * @generated
 */
public interface FlowOfEvents extends EObject {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.Step}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Step#getFlowOfEvents <em>Flow Of Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getFlowOfEvents_Steps()
	 * @see br.com.levysiqueira.textualusecase.Step#getFlowOfEvents
	 * @model opposite="flowOfEvents" containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getFlowOfEvents_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.FlowOfEvents#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FlowOfEvents
