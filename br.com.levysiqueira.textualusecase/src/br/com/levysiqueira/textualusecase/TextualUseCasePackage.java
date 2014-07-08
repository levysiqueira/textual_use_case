/**
 */
package br.com.levysiqueira.textualusecase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.com.levysiqueira.textualusecase.TextualUseCaseFactory
 * @model kind="package"
 * @generated
 */
public interface TextualUseCasePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textualusecase";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.levysiqueira.com.br/TextualUseCase";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "br.com.levysiqueira.textualusecase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TextualUseCasePackage eINSTANCE = br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl.init();

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.UseCaseModelImpl <em>Use Case Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.UseCaseModelImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getUseCaseModel()
	 * @generated
	 */
	int USE_CASE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__USE_CASE = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL__SUBJECT = 2;

	/**
	 * The number of structural features of the '<em>Use Case Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Use Case Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl <em>Use Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.UseCaseImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getUseCase()
	 * @generated
	 */
	int USE_CASE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alternative Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ALTERNATIVE_FLOW = 1;

	/**
	 * The feature id for the '<em><b>Basic Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__BASIC_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__ACTOR = 3;

	/**
	 * The feature id for the '<em><b>Post Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__POST_CONDITION = 4;

	/**
	 * The feature id for the '<em><b>Pre Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__PRE_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Use Case Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__USE_CASE_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE__INCLUDES = 8;

	/**
	 * The number of structural features of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Use Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.FlowOfEventsImpl <em>Flow Of Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.FlowOfEventsImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getFlowOfEvents()
	 * @generated
	 */
	int FLOW_OF_EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OF_EVENTS__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OF_EVENTS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Flow Of Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OF_EVENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Flow Of Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OF_EVENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.AlternativeFlowImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getAlternativeFlow()
	 * @generated
	 */
	int ALTERNATIVE_FLOW = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__STEPS = FLOW_OF_EVENTS__STEPS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__NAME = FLOW_OF_EVENTS__NAME;

	/**
	 * The feature id for the '<em><b>Branching Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__BRANCHING_STEP = FLOW_OF_EVENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__CONDITION = FLOW_OF_EVENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW__USE_CASE = FLOW_OF_EVENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_FEATURE_COUNT = FLOW_OF_EVENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Alternative Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FLOW_OPERATION_COUNT = FLOW_OF_EVENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.StepImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 4;

	/**
	 * The feature id for the '<em><b>Alternative Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ALTERNATIVE_FLOW = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Flow Of Events</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__FLOW_OF_EVENTS = 3;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.AgentImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.StatementImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 6;

	/**
	 * The feature id for the '<em><b>Alternative Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__ALTERNATIVE_FLOW = STEP__ALTERNATIVE_FLOW;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__STATEMENT = STEP__STATEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Flow Of Events</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__FLOW_OF_EVENTS = STEP__FLOW_OF_EVENTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__CONDITION = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__STEPS = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.ConditionImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.BasicFlowImpl <em>Basic Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.BasicFlowImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getBasicFlow()
	 * @generated
	 */
	int BASIC_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW__STEPS = FLOW_OF_EVENTS__STEPS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW__NAME = FLOW_OF_EVENTS__NAME;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW__USE_CASE = FLOW_OF_EVENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW_FEATURE_COUNT = FLOW_OF_EVENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FLOW_OPERATION_COUNT = FLOW_OF_EVENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.ActorImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTIONS = AGENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Use Case Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__USE_CASE_MODEL = AGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__USE_CASE = AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = AGENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.SubjectImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NAME = AGENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__ACTIONS = AGENT__ACTIONS;

	/**
	 * The feature id for the '<em><b>Use Casemodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__USE_CASEMODEL = AGENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = AGENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = AGENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.ActionImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 11;

	/**
	 * The feature id for the '<em><b>Alternative Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ALTERNATIVE_FLOW = STEP__ALTERNATIVE_FLOW;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STATEMENT = STEP__STATEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Flow Of Events</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FLOW_OF_EVENTS = STEP__FLOW_OF_EVENTS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__AGENT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.ConditionalStatementImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getConditionalStatement()
	 * @generated
	 */
	int CONDITIONAL_STATEMENT = 12;

	/**
	 * The feature id for the '<em><b>Alternative Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__ALTERNATIVE_FLOW = STATEMENT__ALTERNATIVE_FLOW;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__STATEMENT = STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Flow Of Events</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__FLOW_OF_EVENTS = STATEMENT__FLOW_OF_EVENTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__CONDITION = STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT__STEPS = STATEMENT__STEPS;

	/**
	 * The number of structural features of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Conditional Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.LoopStatementImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getLoopStatement()
	 * @generated
	 */
	int LOOP_STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>Alternative Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__ALTERNATIVE_FLOW = STATEMENT__ALTERNATIVE_FLOW;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__STATEMENT = STATEMENT__STATEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__NAME = STATEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Flow Of Events</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__FLOW_OF_EVENTS = STATEMENT__FLOW_OF_EVENTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__CONDITION = STATEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT__STEPS = STATEMENT__STEPS;

	/**
	 * The number of structural features of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loop Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.com.levysiqueira.textualusecase.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.com.levysiqueira.textualusecase.impl.IncludeImpl
	 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 14;

	/**
	 * The feature id for the '<em><b>Alternative Flow</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__ALTERNATIVE_FLOW = STEP__ALTERNATIVE_FLOW;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__STATEMENT = STEP__STATEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__NAME = STEP__NAME;

	/**
	 * The feature id for the '<em><b>Flow Of Events</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__FLOW_OF_EVENTS = STEP__FLOW_OF_EVENTS;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__USE_CASE = STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_OPERATION_COUNT = STEP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.UseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case Model</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCaseModel
	 * @generated
	 */
	EClass getUseCaseModel();

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.levysiqueira.textualusecase.UseCaseModel#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Case</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCaseModel#getUseCase()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_UseCase();

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.levysiqueira.textualusecase.UseCaseModel#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actor</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCaseModel#getActor()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Actor();

	/**
	 * Returns the meta object for the containment reference '{@link br.com.levysiqueira.textualusecase.UseCaseModel#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCaseModel#getSubject()
	 * @see #getUseCaseModel()
	 * @generated
	 */
	EReference getUseCaseModel_Subject();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Case</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase
	 * @generated
	 */
	EClass getUseCase();

	/**
	 * Returns the meta object for the attribute '{@link br.com.levysiqueira.textualusecase.UseCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getName()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.levysiqueira.textualusecase.UseCase#getAlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternative Flow</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getAlternativeFlow()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_AlternativeFlow();

	/**
	 * Returns the meta object for the containment reference '{@link br.com.levysiqueira.textualusecase.UseCase#getBasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Flow</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getBasicFlow()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_BasicFlow();

	/**
	 * Returns the meta object for the reference list '{@link br.com.levysiqueira.textualusecase.UseCase#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actor</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getActor()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Actor();

	/**
	 * Returns the meta object for the containment reference '{@link br.com.levysiqueira.textualusecase.UseCase#getPostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Post Condition</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getPostCondition()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_PostCondition();

	/**
	 * Returns the meta object for the containment reference '{@link br.com.levysiqueira.textualusecase.UseCase#getPreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre Condition</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getPreCondition()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_PreCondition();

	/**
	 * Returns the meta object for the attribute '{@link br.com.levysiqueira.textualusecase.UseCase#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getDescription()
	 * @see #getUseCase()
	 * @generated
	 */
	EAttribute getUseCase_Description();

	/**
	 * Returns the meta object for the container reference '{@link br.com.levysiqueira.textualusecase.UseCase#getUseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Use Case Model</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getUseCaseModel()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_UseCaseModel();

	/**
	 * Returns the meta object for the reference list '{@link br.com.levysiqueira.textualusecase.UseCase#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Includes</em>'.
	 * @see br.com.levysiqueira.textualusecase.UseCase#getIncludes()
	 * @see #getUseCase()
	 * @generated
	 */
	EReference getUseCase_Includes();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.AlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Flow</em>'.
	 * @see br.com.levysiqueira.textualusecase.AlternativeFlow
	 * @generated
	 */
	EClass getAlternativeFlow();

	/**
	 * Returns the meta object for the reference '{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getBranchingStep <em>Branching Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Branching Step</em>'.
	 * @see br.com.levysiqueira.textualusecase.AlternativeFlow#getBranchingStep()
	 * @see #getAlternativeFlow()
	 * @generated
	 */
	EReference getAlternativeFlow_BranchingStep();

	/**
	 * Returns the meta object for the containment reference '{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see br.com.levysiqueira.textualusecase.AlternativeFlow#getCondition()
	 * @see #getAlternativeFlow()
	 * @generated
	 */
	EReference getAlternativeFlow_Condition();

	/**
	 * Returns the meta object for the container reference '{@link br.com.levysiqueira.textualusecase.AlternativeFlow#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Use Case</em>'.
	 * @see br.com.levysiqueira.textualusecase.AlternativeFlow#getUseCase()
	 * @see #getAlternativeFlow()
	 * @generated
	 */
	EReference getAlternativeFlow_UseCase();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.FlowOfEvents <em>Flow Of Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Of Events</em>'.
	 * @see br.com.levysiqueira.textualusecase.FlowOfEvents
	 * @generated
	 */
	EClass getFlowOfEvents();

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.levysiqueira.textualusecase.FlowOfEvents#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see br.com.levysiqueira.textualusecase.FlowOfEvents#getSteps()
	 * @see #getFlowOfEvents()
	 * @generated
	 */
	EReference getFlowOfEvents_Steps();

	/**
	 * Returns the meta object for the attribute '{@link br.com.levysiqueira.textualusecase.FlowOfEvents#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.levysiqueira.textualusecase.FlowOfEvents#getName()
	 * @see #getFlowOfEvents()
	 * @generated
	 */
	EAttribute getFlowOfEvents_Name();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see br.com.levysiqueira.textualusecase.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the reference list '{@link br.com.levysiqueira.textualusecase.Step#getAlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative Flow</em>'.
	 * @see br.com.levysiqueira.textualusecase.Step#getAlternativeFlow()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_AlternativeFlow();

	/**
	 * Returns the meta object for the container reference '{@link br.com.levysiqueira.textualusecase.Step#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Statement</em>'.
	 * @see br.com.levysiqueira.textualusecase.Step#getStatement()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Statement();

	/**
	 * Returns the meta object for the attribute '{@link br.com.levysiqueira.textualusecase.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.levysiqueira.textualusecase.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the container reference '{@link br.com.levysiqueira.textualusecase.Step#getFlowOfEvents <em>Flow Of Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Flow Of Events</em>'.
	 * @see br.com.levysiqueira.textualusecase.Step#getFlowOfEvents()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_FlowOfEvents();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see br.com.levysiqueira.textualusecase.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link br.com.levysiqueira.textualusecase.Agent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.com.levysiqueira.textualusecase.Agent#getName()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_Name();

	/**
	 * Returns the meta object for the reference list '{@link br.com.levysiqueira.textualusecase.Agent#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see br.com.levysiqueira.textualusecase.Agent#getActions()
	 * @see #getAgent()
	 * @generated
	 */
	EReference getAgent_Actions();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see br.com.levysiqueira.textualusecase.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the containment reference '{@link br.com.levysiqueira.textualusecase.Statement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see br.com.levysiqueira.textualusecase.Statement#getCondition()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link br.com.levysiqueira.textualusecase.Statement#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see br.com.levysiqueira.textualusecase.Statement#getSteps()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Steps();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see br.com.levysiqueira.textualusecase.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link br.com.levysiqueira.textualusecase.Condition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see br.com.levysiqueira.textualusecase.Condition#getExpression()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Expression();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.BasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Flow</em>'.
	 * @see br.com.levysiqueira.textualusecase.BasicFlow
	 * @generated
	 */
	EClass getBasicFlow();

	/**
	 * Returns the meta object for the container reference '{@link br.com.levysiqueira.textualusecase.BasicFlow#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Use Case</em>'.
	 * @see br.com.levysiqueira.textualusecase.BasicFlow#getUseCase()
	 * @see #getBasicFlow()
	 * @generated
	 */
	EReference getBasicFlow_UseCase();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see br.com.levysiqueira.textualusecase.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the container reference '{@link br.com.levysiqueira.textualusecase.Actor#getUseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Use Case Model</em>'.
	 * @see br.com.levysiqueira.textualusecase.Actor#getUseCaseModel()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_UseCaseModel();

	/**
	 * Returns the meta object for the reference list '{@link br.com.levysiqueira.textualusecase.Actor#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Case</em>'.
	 * @see br.com.levysiqueira.textualusecase.Actor#getUseCase()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_UseCase();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see br.com.levysiqueira.textualusecase.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the container reference '{@link br.com.levysiqueira.textualusecase.Subject#getUseCasemodel <em>Use Casemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Use Casemodel</em>'.
	 * @see br.com.levysiqueira.textualusecase.Subject#getUseCasemodel()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_UseCasemodel();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see br.com.levysiqueira.textualusecase.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link br.com.levysiqueira.textualusecase.Action#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see br.com.levysiqueira.textualusecase.Action#getDescription()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Description();

	/**
	 * Returns the meta object for the reference '{@link br.com.levysiqueira.textualusecase.Action#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see br.com.levysiqueira.textualusecase.Action#getAgent()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Agent();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Statement</em>'.
	 * @see br.com.levysiqueira.textualusecase.ConditionalStatement
	 * @generated
	 */
	EClass getConditionalStatement();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Statement</em>'.
	 * @see br.com.levysiqueira.textualusecase.LoopStatement
	 * @generated
	 */
	EClass getLoopStatement();

	/**
	 * Returns the meta object for class '{@link br.com.levysiqueira.textualusecase.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see br.com.levysiqueira.textualusecase.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the reference '{@link br.com.levysiqueira.textualusecase.Include#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use Case</em>'.
	 * @see br.com.levysiqueira.textualusecase.Include#getUseCase()
	 * @see #getInclude()
	 * @generated
	 */
	EReference getInclude_UseCase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TextualUseCaseFactory getTextualUseCaseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.UseCaseModelImpl <em>Use Case Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.UseCaseModelImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getUseCaseModel()
		 * @generated
		 */
		EClass USE_CASE_MODEL = eINSTANCE.getUseCaseModel();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__USE_CASE = eINSTANCE.getUseCaseModel_UseCase();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__ACTOR = eINSTANCE.getUseCaseModel_Actor();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE_MODEL__SUBJECT = eINSTANCE.getUseCaseModel_Subject();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl <em>Use Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.UseCaseImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getUseCase()
		 * @generated
		 */
		EClass USE_CASE = eINSTANCE.getUseCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__NAME = eINSTANCE.getUseCase_Name();

		/**
		 * The meta object literal for the '<em><b>Alternative Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__ALTERNATIVE_FLOW = eINSTANCE.getUseCase_AlternativeFlow();

		/**
		 * The meta object literal for the '<em><b>Basic Flow</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__BASIC_FLOW = eINSTANCE.getUseCase_BasicFlow();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__ACTOR = eINSTANCE.getUseCase_Actor();

		/**
		 * The meta object literal for the '<em><b>Post Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__POST_CONDITION = eINSTANCE.getUseCase_PostCondition();

		/**
		 * The meta object literal for the '<em><b>Pre Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__PRE_CONDITION = eINSTANCE.getUseCase_PreCondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USE_CASE__DESCRIPTION = eINSTANCE.getUseCase_Description();

		/**
		 * The meta object literal for the '<em><b>Use Case Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__USE_CASE_MODEL = eINSTANCE.getUseCase_UseCaseModel();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CASE__INCLUDES = eINSTANCE.getUseCase_Includes();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.AlternativeFlowImpl <em>Alternative Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.AlternativeFlowImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getAlternativeFlow()
		 * @generated
		 */
		EClass ALTERNATIVE_FLOW = eINSTANCE.getAlternativeFlow();

		/**
		 * The meta object literal for the '<em><b>Branching Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_FLOW__BRANCHING_STEP = eINSTANCE.getAlternativeFlow_BranchingStep();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_FLOW__CONDITION = eINSTANCE.getAlternativeFlow_Condition();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE_FLOW__USE_CASE = eINSTANCE.getAlternativeFlow_UseCase();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.FlowOfEventsImpl <em>Flow Of Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.FlowOfEventsImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getFlowOfEvents()
		 * @generated
		 */
		EClass FLOW_OF_EVENTS = eINSTANCE.getFlowOfEvents();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_OF_EVENTS__STEPS = eINSTANCE.getFlowOfEvents_Steps();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_OF_EVENTS__NAME = eINSTANCE.getFlowOfEvents_Name();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.StepImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Alternative Flow</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ALTERNATIVE_FLOW = eINSTANCE.getStep_AlternativeFlow();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__STATEMENT = eINSTANCE.getStep_Statement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Flow Of Events</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__FLOW_OF_EVENTS = eINSTANCE.getStep_FlowOfEvents();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.AgentImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGENT__ACTIONS = eINSTANCE.getAgent_Actions();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.StatementImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__CONDITION = eINSTANCE.getStatement_Condition();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__STEPS = eINSTANCE.getStatement_Steps();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.ConditionImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__EXPRESSION = eINSTANCE.getCondition_Expression();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.BasicFlowImpl <em>Basic Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.BasicFlowImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getBasicFlow()
		 * @generated
		 */
		EClass BASIC_FLOW = eINSTANCE.getBasicFlow();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_FLOW__USE_CASE = eINSTANCE.getBasicFlow_UseCase();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.ActorImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Use Case Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__USE_CASE_MODEL = eINSTANCE.getActor_UseCaseModel();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__USE_CASE = eINSTANCE.getActor_UseCase();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.SubjectImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Use Casemodel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__USE_CASEMODEL = eINSTANCE.getSubject_UseCasemodel();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.ActionImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DESCRIPTION = eINSTANCE.getAction_Description();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__AGENT = eINSTANCE.getAction_Agent();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.ConditionalStatementImpl <em>Conditional Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.ConditionalStatementImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getConditionalStatement()
		 * @generated
		 */
		EClass CONDITIONAL_STATEMENT = eINSTANCE.getConditionalStatement();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.LoopStatementImpl <em>Loop Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.LoopStatementImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getLoopStatement()
		 * @generated
		 */
		EClass LOOP_STATEMENT = eINSTANCE.getLoopStatement();

		/**
		 * The meta object literal for the '{@link br.com.levysiqueira.textualusecase.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.com.levysiqueira.textualusecase.impl.IncludeImpl
		 * @see br.com.levysiqueira.textualusecase.impl.TextualUseCasePackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE__USE_CASE = eINSTANCE.getInclude_UseCase();

	}

} //TextualUseCasePackage
