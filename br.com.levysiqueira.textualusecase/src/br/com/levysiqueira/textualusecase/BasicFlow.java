/**
 */
package br.com.levysiqueira.textualusecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.BasicFlow#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getBasicFlow()
 * @model
 * @generated
 */
public interface BasicFlow extends FlowOfEvents {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.UseCase#getBasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' container reference.
	 * @see #setUseCase(UseCase)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getBasicFlow_UseCase()
	 * @see br.com.levysiqueira.textualusecase.UseCase#getBasicFlow
	 * @model opposite="basicFlow" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCase getUseCase();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.BasicFlow#getUseCase <em>Use Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' container reference.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(UseCase value);

} // BasicFlow
