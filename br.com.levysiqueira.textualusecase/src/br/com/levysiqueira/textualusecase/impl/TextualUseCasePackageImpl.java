/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.Action;
import br.com.levysiqueira.textualusecase.Actor;
import br.com.levysiqueira.textualusecase.Agent;
import br.com.levysiqueira.textualusecase.AlternativeFlow;
import br.com.levysiqueira.textualusecase.BasicFlow;
import br.com.levysiqueira.textualusecase.Condition;
import br.com.levysiqueira.textualusecase.ConditionalStatement;
import br.com.levysiqueira.textualusecase.FlowOfEvents;
import br.com.levysiqueira.textualusecase.Include;
import br.com.levysiqueira.textualusecase.LoopStatement;
import br.com.levysiqueira.textualusecase.Statement;
import br.com.levysiqueira.textualusecase.Step;
import br.com.levysiqueira.textualusecase.Subject;
import br.com.levysiqueira.textualusecase.TextualUseCaseFactory;
import br.com.levysiqueira.textualusecase.TextualUseCasePackage;
import br.com.levysiqueira.textualusecase.UseCase;
import br.com.levysiqueira.textualusecase.UseCaseModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualUseCasePackageImpl extends EPackageImpl implements TextualUseCasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowOfEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TextualUseCasePackageImpl() {
		super(eNS_URI, TextualUseCaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TextualUseCasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TextualUseCasePackage init() {
		if (isInited) return (TextualUseCasePackage)EPackage.Registry.INSTANCE.getEPackage(TextualUseCasePackage.eNS_URI);

		// Obtain or create and register package
		TextualUseCasePackageImpl theTextualUseCasePackage = (TextualUseCasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TextualUseCasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TextualUseCasePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTextualUseCasePackage.createPackageContents();

		// Initialize created meta-data
		theTextualUseCasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTextualUseCasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TextualUseCasePackage.eNS_URI, theTextualUseCasePackage);
		return theTextualUseCasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCaseModel() {
		return useCaseModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCaseModel_UseCase() {
		return (EReference)useCaseModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCaseModel_Actor() {
		return (EReference)useCaseModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCaseModel_Subject() {
		return (EReference)useCaseModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Name() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_AlternativeFlow() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_BasicFlow() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Actor() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_PostCondition() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_PreCondition() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUseCase_Description() {
		return (EAttribute)useCaseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_UseCaseModel() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Includes() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeFlow() {
		return alternativeFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeFlow_BranchingStep() {
		return (EReference)alternativeFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeFlow_Condition() {
		return (EReference)alternativeFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeFlow_UseCase() {
		return (EReference)alternativeFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowOfEvents() {
		return flowOfEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowOfEvents_Steps() {
		return (EReference)flowOfEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowOfEvents_Name() {
		return (EAttribute)flowOfEventsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_AlternativeFlow() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Statement() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Name() {
		return (EAttribute)stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_FlowOfEvents() {
		return (EReference)stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_Name() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAgent_Actions() {
		return (EReference)agentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Condition() {
		return (EReference)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Steps() {
		return (EReference)statementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Expression() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicFlow() {
		return basicFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicFlow_UseCase() {
		return (EReference)basicFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_UseCaseModel() {
		return (EReference)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_UseCase() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubject() {
		return subjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubject_UseCasemodel() {
		return (EReference)subjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Description() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Agent() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalStatement() {
		return conditionalStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopStatement() {
		return loopStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclude_UseCase() {
		return (EReference)includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualUseCaseFactory getTextualUseCaseFactory() {
		return (TextualUseCaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		useCaseModelEClass = createEClass(USE_CASE_MODEL);
		createEReference(useCaseModelEClass, USE_CASE_MODEL__USE_CASE);
		createEReference(useCaseModelEClass, USE_CASE_MODEL__ACTOR);
		createEReference(useCaseModelEClass, USE_CASE_MODEL__SUBJECT);

		useCaseEClass = createEClass(USE_CASE);
		createEAttribute(useCaseEClass, USE_CASE__NAME);
		createEReference(useCaseEClass, USE_CASE__ALTERNATIVE_FLOW);
		createEReference(useCaseEClass, USE_CASE__BASIC_FLOW);
		createEReference(useCaseEClass, USE_CASE__ACTOR);
		createEReference(useCaseEClass, USE_CASE__POST_CONDITION);
		createEReference(useCaseEClass, USE_CASE__PRE_CONDITION);
		createEAttribute(useCaseEClass, USE_CASE__DESCRIPTION);
		createEReference(useCaseEClass, USE_CASE__USE_CASE_MODEL);
		createEReference(useCaseEClass, USE_CASE__INCLUDES);

		alternativeFlowEClass = createEClass(ALTERNATIVE_FLOW);
		createEReference(alternativeFlowEClass, ALTERNATIVE_FLOW__BRANCHING_STEP);
		createEReference(alternativeFlowEClass, ALTERNATIVE_FLOW__CONDITION);
		createEReference(alternativeFlowEClass, ALTERNATIVE_FLOW__USE_CASE);

		flowOfEventsEClass = createEClass(FLOW_OF_EVENTS);
		createEReference(flowOfEventsEClass, FLOW_OF_EVENTS__STEPS);
		createEAttribute(flowOfEventsEClass, FLOW_OF_EVENTS__NAME);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__ALTERNATIVE_FLOW);
		createEReference(stepEClass, STEP__STATEMENT);
		createEAttribute(stepEClass, STEP__NAME);
		createEReference(stepEClass, STEP__FLOW_OF_EVENTS);

		agentEClass = createEClass(AGENT);
		createEAttribute(agentEClass, AGENT__NAME);
		createEReference(agentEClass, AGENT__ACTIONS);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__CONDITION);
		createEReference(statementEClass, STATEMENT__STEPS);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__EXPRESSION);

		basicFlowEClass = createEClass(BASIC_FLOW);
		createEReference(basicFlowEClass, BASIC_FLOW__USE_CASE);

		actorEClass = createEClass(ACTOR);
		createEReference(actorEClass, ACTOR__USE_CASE_MODEL);
		createEReference(actorEClass, ACTOR__USE_CASE);

		subjectEClass = createEClass(SUBJECT);
		createEReference(subjectEClass, SUBJECT__USE_CASEMODEL);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__DESCRIPTION);
		createEReference(actionEClass, ACTION__AGENT);

		conditionalStatementEClass = createEClass(CONDITIONAL_STATEMENT);

		loopStatementEClass = createEClass(LOOP_STATEMENT);

		includeEClass = createEClass(INCLUDE);
		createEReference(includeEClass, INCLUDE__USE_CASE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		alternativeFlowEClass.getESuperTypes().add(this.getFlowOfEvents());
		statementEClass.getESuperTypes().add(this.getStep());
		basicFlowEClass.getESuperTypes().add(this.getFlowOfEvents());
		actorEClass.getESuperTypes().add(this.getAgent());
		subjectEClass.getESuperTypes().add(this.getAgent());
		actionEClass.getESuperTypes().add(this.getStep());
		conditionalStatementEClass.getESuperTypes().add(this.getStatement());
		loopStatementEClass.getESuperTypes().add(this.getStatement());
		includeEClass.getESuperTypes().add(this.getStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(useCaseModelEClass, UseCaseModel.class, "UseCaseModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCaseModel_UseCase(), this.getUseCase(), this.getUseCase_UseCaseModel(), "useCase", null, 0, -1, UseCaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCaseModel_Actor(), this.getActor(), this.getActor_UseCaseModel(), "actor", null, 0, -1, UseCaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCaseModel_Subject(), this.getSubject(), this.getSubject_UseCasemodel(), "subject", null, 1, 1, UseCaseModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUseCase_Name(), ecorePackage.getEString(), "name", null, 1, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_AlternativeFlow(), this.getAlternativeFlow(), this.getAlternativeFlow_UseCase(), "alternativeFlow", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_BasicFlow(), this.getBasicFlow(), this.getBasicFlow_UseCase(), "basicFlow", null, 1, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_Actor(), this.getActor(), this.getActor_UseCase(), "actor", null, 1, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_PostCondition(), this.getCondition(), null, "postCondition", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_PreCondition(), this.getCondition(), null, "preCondition", null, 0, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUseCase_Description(), ecorePackage.getEString(), "description", null, 1, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_UseCaseModel(), this.getUseCaseModel(), this.getUseCaseModel_UseCase(), "useCaseModel", null, 1, 1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_Includes(), this.getInclude(), this.getInclude_UseCase(), "includes", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeFlowEClass, AlternativeFlow.class, "AlternativeFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternativeFlow_BranchingStep(), this.getStep(), this.getStep_AlternativeFlow(), "branchingStep", null, 1, 1, AlternativeFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAlternativeFlow_Condition(), this.getCondition(), null, "condition", null, 1, 1, AlternativeFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAlternativeFlow_UseCase(), this.getUseCase(), this.getUseCase_AlternativeFlow(), "useCase", null, 1, 1, AlternativeFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowOfEventsEClass, FlowOfEvents.class, "FlowOfEvents", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowOfEvents_Steps(), this.getStep(), this.getStep_FlowOfEvents(), "steps", null, 1, -1, FlowOfEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowOfEvents_Name(), ecorePackage.getEString(), "name", "", 0, 1, FlowOfEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_AlternativeFlow(), this.getAlternativeFlow(), this.getAlternativeFlow_BranchingStep(), "alternativeFlow", null, 0, -1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStep_Statement(), this.getStatement(), this.getStatement_Steps(), "statement", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 1, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStep_FlowOfEvents(), this.getFlowOfEvents(), this.getFlowOfEvents_Steps(), "flowOfEvents", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAgent_Actions(), this.getAction(), this.getAction_Agent(), "actions", null, 0, -1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Condition(), this.getCondition(), null, "condition", null, 1, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStatement_Steps(), this.getStep(), this.getStep_Statement(), "steps", null, 1, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(basicFlowEClass, BasicFlow.class, "BasicFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicFlow_UseCase(), this.getUseCase(), this.getUseCase_BasicFlow(), "useCase", null, 1, 1, BasicFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActor_UseCaseModel(), this.getUseCaseModel(), this.getUseCaseModel_Actor(), "useCaseModel", null, 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActor_UseCase(), this.getUseCase(), this.getUseCase_Actor(), "useCase", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(subjectEClass, Subject.class, "Subject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubject_UseCasemodel(), this.getUseCaseModel(), this.getUseCaseModel_Subject(), "useCasemodel", null, 1, 1, Subject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Description(), ecorePackage.getEString(), "description", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_Agent(), this.getAgent(), this.getAgent_Actions(), "agent", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalStatementEClass, ConditionalStatement.class, "ConditionalStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(loopStatementEClass, LoopStatement.class, "LoopStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInclude_UseCase(), this.getUseCase(), this.getUseCase_Includes(), "useCase", null, 1, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TextualUseCasePackageImpl
