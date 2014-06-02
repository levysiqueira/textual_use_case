/**
 */
package br.com.levysiqueira.textualusecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.extensionPoint.flowOfEvents <> self
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getBranchingStep <em>Branching Step</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getCondition <em>Condition</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAlternativeFlow()
 * @model
 * @generated
 */
public interface AlternativeFlow extends FlowOfEvents {
	/**
	 * Returns the value of the '<em><b>Branching Step</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Step#getAlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Branching Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branching Step</em>' reference.
	 * @see #setBranchingStep(Step)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAlternativeFlow_BranchingStep()
	 * @see br.com.levysiqueira.textualusecase.Step#getAlternativeFlow
	 * @model opposite="alternativeFlow" required="true" ordered="false"
	 * @generated
	 */
	Step getBranchingStep();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getBranchingStep <em>Branching Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branching Step</em>' reference.
	 * @see #getBranchingStep()
	 * @generated
	 */
	void setBranchingStep(Step value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAlternativeFlow_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.UseCase#getAlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Case</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' container reference.
	 * @see #setUseCase(UseCase)
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getAlternativeFlow_UseCase()
	 * @see br.com.levysiqueira.textualusecase.UseCase#getAlternativeFlow
	 * @model opposite="alternativeFlow" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCase getUseCase();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getUseCase <em>Use Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' container reference.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(UseCase value);

} // AlternativeFlow
