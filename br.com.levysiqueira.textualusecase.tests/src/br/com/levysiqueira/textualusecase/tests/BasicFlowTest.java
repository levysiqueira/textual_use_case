/**
 */
package br.com.levysiqueira.textualusecase.tests;

import br.com.levysiqueira.textualusecase.BasicFlow;
import br.com.levysiqueira.textualusecase.TextualUseCaseFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Basic Flow</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicFlowTest extends FlowOfEventsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BasicFlowTest.class);
	}

	/**
	 * Constructs a new Basic Flow test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFlowTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Basic Flow test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BasicFlow getFixture() {
		return (BasicFlow)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TextualUseCaseFactory.eINSTANCE.createBasicFlow());
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

} //BasicFlowTest
