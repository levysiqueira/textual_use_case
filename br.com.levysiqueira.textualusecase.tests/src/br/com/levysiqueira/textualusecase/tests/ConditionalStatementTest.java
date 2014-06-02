/**
 */
package br.com.levysiqueira.textualusecase.tests;

import br.com.levysiqueira.textualusecase.ConditionalStatement;
import br.com.levysiqueira.textualusecase.TextualUseCaseFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conditional Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalStatementTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConditionalStatementTest.class);
	}

	/**
	 * Constructs a new Conditional Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conditional Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConditionalStatement getFixture() {
		return (ConditionalStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextualUseCaseFactory.eINSTANCE.createConditionalStatement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ConditionalStatementTest
