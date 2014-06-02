/**
 */
package br.com.levysiqueira.textualusecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.Subject#getUseCasemodel <em>Use Casemodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getSubject()
 * @model
 * @generated
 */
public interface Subject extends Agent {
	/**
	 * Returns the value of the '<em><b>Use Casemodel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.UseCaseModel#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Casemodel</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Casemodel</em>' container reference.
	 * @see #setUseCasemodel(UseCaseModel)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getSubject_UseCasemodel()
	 * @see br.com.levysiqueira.textualusecase.UseCaseModel#getSubject
	 * @model opposite="subject" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCaseModel getUseCasemodel();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Subject#getUseCasemodel <em>Use Casemodel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Casemodel</em>' container reference.
	 * @see #getUseCasemodel()
	 * @generated
	 */
	void setUseCasemodel(UseCaseModel value);

} // Subject
