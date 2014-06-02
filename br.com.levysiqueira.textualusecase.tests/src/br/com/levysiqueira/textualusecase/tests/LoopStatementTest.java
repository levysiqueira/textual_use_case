/**
 */
package br.com.levysiqueira.textualusecase.tests;

import br.com.levysiqueira.textualusecase.LoopStatement;
import br.com.levysiqueira.textualusecase.TextualUseCaseFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopStatementTest extends StatementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoopStatementTest.class);
	}

	/**
	 * Constructs a new Loop Statement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopStatementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loop Statement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LoopStatement getFixture() {
		return (LoopStatement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextualUseCaseFactory.eINSTANCE.createLoopStatement());
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

} //LoopStatementTest
