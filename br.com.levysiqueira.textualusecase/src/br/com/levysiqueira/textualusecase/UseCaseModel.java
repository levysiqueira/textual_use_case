/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCaseModel#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCaseModel#getActor <em>Actor</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCaseModel#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCaseModel()
 * @model
 * @generated
 */
public interface UseCaseModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.UseCase}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.UseCase#getUseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' containment reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCaseModel_UseCase()
	 * @see br.com.levysiqueira.textualusecase.UseCase#getUseCaseModel
	 * @model opposite="useCaseModel" containment="true" ordered="false"
	 * @generated
	 */
	EList<UseCase> getUseCase();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.Actor}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Actor#getUseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCaseModel_Actor()
	 * @see br.com.levysiqueira.textualusecase.Actor#getUseCaseModel
	 * @model opposite="useCaseModel" containment="true" ordered="false"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Subject#getUseCasemodel <em>Use Casemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Subject)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCaseModel_Subject()
	 * @see br.com.levysiqueira.textualusecase.Subject#getUseCasemodel
	 * @model opposite="useCasemodel" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Subject getSubject();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.UseCaseModel#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Subject value);

} // UseCaseModel
