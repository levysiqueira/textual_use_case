/**
 */
package br.com.levysiqueira.textualusecase.util;

import br.com.levysiqueira.textualusecase.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.com.levysiqueira.textualusecase.TextualUseCasePackage
 * @generated
 */
public class TextualUseCaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TextualUseCasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualUseCaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TextualUseCasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualUseCaseSwitch<Adapter> modelSwitch =
		new TextualUseCaseSwitch<Adapter>() {
			@Override
			public Adapter caseUseCaseModel(UseCaseModel object) {
				return createUseCaseModelAdapter();
			}
			@Override
			public Adapter caseUseCase(UseCase object) {
				return createUseCaseAdapter();
			}
			@Override
			public Adapter caseAlternativeFlow(AlternativeFlow object) {
				return createAlternativeFlowAdapter();
			}
			@Override
			public Adapter caseFlowOfEvents(FlowOfEvents object) {
				return createFlowOfEventsAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseBasicFlow(BasicFlow object) {
				return createBasicFlowAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseSubject(Subject object) {
				return createSubjectAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseConditionalStatement(ConditionalStatement object) {
				return createConditionalStatementAdapter();
			}
			@Override
			public Adapter caseLoopStatement(LoopStatement object) {
				return createLoopStatementAdapter();
			}
			@Override
			public Adapter caseInclude(Include object) {
				return createIncludeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.UseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.UseCaseModel
	 * @generated
	 */
	public Adapter createUseCaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.UseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.UseCase
	 * @generated
	 */
	public Adapter createUseCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.AlternativeFlow <em>Alternative Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.AlternativeFlow
	 * @generated
	 */
	public Adapter createAlternativeFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.FlowOfEvents <em>Flow Of Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.FlowOfEvents
	 * @generated
	 */
	public Adapter createFlowOfEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.BasicFlow <em>Basic Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.BasicFlow
	 * @generated
	 */
	public Adapter createBasicFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.Subject
	 * @generated
	 */
	public Adapter createSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.ConditionalStatement <em>Conditional Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.ConditionalStatement
	 * @generated
	 */
	public Adapter createConditionalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.LoopStatement <em>Loop Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.LoopStatement
	 * @generated
	 */
	public Adapter createLoopStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.com.levysiqueira.textualusecase.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.com.levysiqueira.textualusecase.Include
	 * @generated
	 */
	public Adapter createIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TextualUseCaseAdapterFactory
