/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.Actor#getUseCaseModel <em>Use Case Model</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.Actor#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Agent {
	/**
	 * Returns the value of the '<em><b>Use Case Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.UseCaseModel#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case Model</em>' container reference.
	 * @see #setUseCaseModel(UseCaseModel)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getActor_UseCaseModel()
	 * @see br.com.levysiqueira.textualusecase.UseCaseModel#getActor
	 * @model opposite="actor" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCaseModel getUseCaseModel();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Actor#getUseCaseModel <em>Use Case Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case Model</em>' container reference.
	 * @see #getUseCaseModel()
	 * @generated
	 */
	void setUseCaseModel(UseCaseModel value);

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.UseCase}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.UseCase#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getActor_UseCase()
	 * @see br.com.levysiqueira.textualusecase.UseCase#getActor
	 * @model opposite="actor" ordered="false"
	 * @generated
	 */
	EList<UseCase> getUseCase();

} // Actor
