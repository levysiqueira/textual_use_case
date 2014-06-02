/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.block.steps->excludes(self)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.Statement#getCondition <em>Condition</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.Statement#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends Step {
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
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getStatement_Condition()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link br.com.levysiqueira.textualusecase.Statement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link br.com.levysiqueira.textualusecase.Step}.
	 * It is bidirectional and its opposite is '{@link br.com.levysiqueira.textualusecase.Step#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#getStatement_Steps()
	 * @see br.com.levysiqueira.textualusecase.Step#getStatement
	 * @model opposite="statement" containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

} // Statement
