/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.Agent#getName <em>Name</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.Agent#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAgent()
 * @model abstract="true"
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAgent_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Agent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.Action}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Action#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAgent_Actions()
	 * @see br.com.levysiqueira.textualusecase.Action#getAgent
	 * @model opposite="agent"
	 * @generated
	 */
	EList<Action> getActions();

} // Agent
