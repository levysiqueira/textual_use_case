/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualUseCaseFactoryImpl extends EFactoryImpl implements TextualUseCaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TextualUseCaseFactory init() {
		try {
			TextualUseCaseFactory theTextualUseCaseFactory = (TextualUseCaseFactory)EPackage.Registry.INSTANCE.getEFactory(TextualUseCasePackage.eNS_URI);
			if (theTextualUseCaseFactory != null) {
				return theTextualUseCaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TextualUseCaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualUseCaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TextualUseCasePackage.USE_CASE_MODEL: return createUseCaseModel();
			case TextualUseCasePackage.USE_CASE: return createUseCase();
			case TextualUseCasePackage.ALTERNATIVE_FLOW: return createAlternativeFlow();
			case TextualUseCasePackage.CONDITION: return createCondition();
			case TextualUseCasePackage.BASIC_FLOW: return createBasicFlow();
			case TextualUseCasePackage.ACTOR: return createActor();
			case TextualUseCasePackage.SUBJECT: return createSubject();
			case TextualUseCasePackage.ACTION: return createAction();
			case TextualUseCasePackage.CONDITIONAL_STATEMENT: return createConditionalStatement();
			case TextualUseCasePackage.LOOP_STATEMENT: return createLoopStatement();
			case TextualUseCasePackage.INCLUDE: return createInclude();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseModel createUseCaseModel() {
		UseCaseModelImpl useCaseModel = new UseCaseModelImpl();
		return useCaseModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeFlow createAlternativeFlow() {
		AlternativeFlowImpl alternativeFlow = new AlternativeFlowImpl();
		return alternativeFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFlow createBasicFlow() {
		BasicFlowImpl basicFlow = new BasicFlowImpl();
		return basicFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject createSubject() {
		SubjectImpl subject = new SubjectImpl();
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalStatement createConditionalStatement() {
		ConditionalStatementImpl conditionalStatement = new ConditionalStatementImpl();
		return conditionalStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopStatement createLoopStatement() {
		LoopStatementImpl loopStatement = new LoopStatementImpl();
		return loopStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualUseCasePackage getTextualUseCasePackage() {
		return (TextualUseCasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TextualUseCasePackage getPackage() {
		return TextualUseCasePackage.eINSTANCE;
	}

} //TextualUseCaseFactoryImpl
