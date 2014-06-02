/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.AlternativeFlow;
import br.com.levysiqueira.textualusecase.Condition;
import br.com.levysiqueira.textualusecase.Step;
import br.com.levysiqueira.textualusecase.TextualUseCasePackage;
import br.com.levysiqueira.textualusecase.UseCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alternative Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.AlternativeFlowImpl#getBranchingStep <em>Branching Step</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.AlternativeFlowImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.AlternativeFlowImpl#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlternativeFlowImpl extends FlowOfEventsImpl implements AlternativeFlow {
	/**
	 * The cached value of the '{@link #getBranchingStep() <em>Branching Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchingStep()
	 * @generated
	 * @ordered
	 */
	protected Step branchingStep;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlternativeFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualUseCasePackage.Literals.ALTERNATIVE_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getBranchingStep() {
		if (branchingStep != null && branchingStep.eIsProxy()) {
			InternalEObject oldBranchingStep = (InternalEObject)branchingStep;
			branchingStep = (Step)eResolveProxy(oldBranchingStep);
			if (branchingStep != oldBranchingStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP, oldBranchingStep, branchingStep));
			}
		}
		return branchingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetBranchingStep() {
		return branchingStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranchingStep(Step newBranchingStep, NotificationChain msgs) {
		Step oldBranchingStep = branchingStep;
		branchingStep = newBranchingStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP, oldBranchingStep, newBranchingStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBranchingStep(Step newBranchingStep) {
		if (newBranchingStep != branchingStep) {
			NotificationChain msgs = null;
			if (branchingStep != null)
				msgs = ((InternalEObject)branchingStep).eInverseRemove(this, TextualUseCasePackage.STEP__ALTERNATIVE_FLOW, Step.class, msgs);
			if (newBranchingStep != null)
				msgs = ((InternalEObject)newBranchingStep).eInverseAdd(this, TextualUseCasePackage.STEP__ALTERNATIVE_FLOW, Step.class, msgs);
			msgs = basicSetBranchingStep(newBranchingStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP, newBranchingStep, newBranchingStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase() {
		if (eContainerFeatureID() != TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE) return null;
		return (UseCase)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCase(UseCase newUseCase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUseCase, TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCase(UseCase newUseCase) {
		if (newUseCase != eInternalContainer() || (eContainerFeatureID() != TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE && newUseCase != null)) {
			if (EcoreUtil.isAncestor(this, newUseCase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUseCase != null)
				msgs = ((InternalEObject)newUseCase).eInverseAdd(this, TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW, UseCase.class, msgs);
			msgs = basicSetUseCase(newUseCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE, newUseCase, newUseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP:
				if (branchingStep != null)
					msgs = ((InternalEObject)branchingStep).eInverseRemove(this, TextualUseCasePackage.STEP__ALTERNATIVE_FLOW, Step.class, msgs);
				return basicSetBranchingStep((Step)otherEnd, msgs);
			case TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUseCase((UseCase)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP:
				return basicSetBranchingStep(null, msgs);
			case TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION:
				return basicSetCondition(null, msgs);
			case TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE:
				return basicSetUseCase(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE:
				return eInternalContainer().eInverseRemove(this, TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW, UseCase.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP:
				if (resolve) return getBranchingStep();
				return basicGetBranchingStep();
			case TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION:
				return getCondition();
			case TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE:
				return getUseCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP:
				setBranchingStep((Step)newValue);
				return;
			case TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION:
				setCondition((Condition)newValue);
				return;
			case TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE:
				setUseCase((UseCase)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP:
				setBranchingStep((Step)null);
				return;
			case TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION:
				setCondition((Condition)null);
				return;
			case TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE:
				setUseCase((UseCase)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP:
				return branchingStep != null;
			case TextualUseCasePackage.ALTERNATIVE_FLOW__CONDITION:
				return condition != null;
			case TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE:
				return getUseCase() != null;
		}
		return super.eIsSet(featureID);
	}

} //AlternativeFlowImpl
