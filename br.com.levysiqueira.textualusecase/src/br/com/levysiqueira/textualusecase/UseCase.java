/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getName <em>Name</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getAlternativeFlow <em>Alternative Flow</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getBasicFlow <em>Basic Flow</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getActor <em>Actor</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getDescription <em>Description</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getUseCaseModel <em>Use Case Model</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.UseCase#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends EObject {
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
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.UseCase#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Alternative Flow</b></em>' containment reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.AlternativeFlow}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Flow</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Flow</em>' containment reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_AlternativeFlow()
	 * @see br.com.levysiqueira.textualusecase.AlternativeFlow#getUseCase
	 * @model opposite="useCase" containment="true" ordered="false"
	 * @generated
	 */
	EList<AlternativeFlow> getAlternativeFlow();

	/**
	 * Returns the value of the '<em><b>Basic Flow</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.BasicFlow#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Flow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Flow</em>' containment reference.
	 * @see #setBasicFlow(BasicFlow)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_BasicFlow()
	 * @see br.com.levysiqueira.textualusecase.BasicFlow#getUseCase
	 * @model opposite="useCase" containment="true" required="true" ordered="false"
	 * @generated
	 */
	BasicFlow getBasicFlow();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.UseCase#getBasicFlow <em>Basic Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Flow</em>' containment reference.
	 * @see #getBasicFlow()
	 * @generated
	 */
	void setBasicFlow(BasicFlow value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.Actor}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Actor#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_Actor()
	 * @see br.com.levysiqueira.textualusecase.Actor#getUseCase
	 * @model opposite="useCase" required="true" ordered="false"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference.
	 * @see #setPostCondition(Condition)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_PostCondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Condition getPostCondition();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.UseCase#getPostCondition <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Condition</em>' containment reference.
	 * @see #getPostCondition()
	 * @generated
	 */
	void setPostCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' containment reference.
	 * @see #setPreCondition(Condition)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_PreCondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Condition getPreCondition();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.UseCase#getPreCondition <em>Pre Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Condition</em>' containment reference.
	 * @see #getPreCondition()
	 * @generated
	 */
	void setPreCondition(Condition value);

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
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.UseCase#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Use Case Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.UseCaseModel#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case Model</em>' container reference.
	 * @see #setUseCaseModel(UseCaseModel)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_UseCaseModel()
	 * @see br.com.levysiqueira.textualusecase.UseCaseModel#getUseCase
	 * @model opposite="useCase" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCaseModel getUseCaseModel();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.UseCase#getUseCaseModel <em>Use Case Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case Model</em>' container reference.
	 * @see #getUseCaseModel()
	 * @generated
	 */
	void setUseCaseModel(UseCaseModel value);

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.Include}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Include#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getUseCase_Includes()
	 * @see br.com.levysiqueira.textualusecase.Include#getUseCase
	 * @model opposite="useCase"
	 * @generated
	 */
	EList<Include> getIncludes();

} // UseCase
