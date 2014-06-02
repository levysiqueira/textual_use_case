/**
 */
package br.com.levysiqueira.textualusecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.Action#getDescription <em>Description</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.Action#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAction()
 * @model
 * @generated
 */
public interface Action extends Step {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAction_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Action#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Agent#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(Agent)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAction_Agent()
	 * @see br.com.levysiqueira.textualusecase.Agent#getActions
	 * @model opposite="actions" required="true"
	 * @generated
	 */
	Agent getAgent();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Action#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Agent value);

} // Action
