/**
 */
package br.com.levysiqueira.textualusecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.Include#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends Step {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.UseCase#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' reference.
	 * @see #setUseCase(UseCase)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getInclude_UseCase()
	 * @see br.com.levysiqueira.textualusecase.UseCase#getIncludes
	 * @model opposite="includes" required="true"
	 * @generated
	 */
	UseCase getUseCase();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Include#getUseCase <em>Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' reference.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(UseCase value);

} // Include
