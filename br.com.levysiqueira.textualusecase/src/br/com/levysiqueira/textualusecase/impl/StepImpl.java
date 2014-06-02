/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.AlternativeFlow;
import br.com.levysiqueira.textualusecase.FlowOfEvents;
import br.com.levysiqueira.textualusecase.Statement;
import br.com.levysiqueira.textualusecase.Step;
import br.com.levysiqueira.textualusecase.TextualUseCasePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.StepImpl#getAlternativeFlow <em>Alternative Flow</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.StepImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.StepImpl#getFlowOfEvents <em>Flow Of Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class StepImpl extends MinimalEObjectImpl.Container implements Step {
	/**
	 * The cached value of the '{@link #getAlternativeFlow() <em>Alternative Flow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<AlternativeFlow> alternativeFlow;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualUseCasePackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlternativeFlow> getAlternativeFlow() {
		if (alternativeFlow == null) {
			alternativeFlow = new EObjectWithInverseResolvingEList<AlternativeFlow>(AlternativeFlow.class, this, TextualUseCasePackage.STEP__ALTERNATIVE_FLOW, TextualUseCasePackage.ALTERNATIVE_FLOW__BRANCHING_STEP);
		}
		return alternativeFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getStatement() {
		if (eContainerFeatureID() != TextualUseCasePackage.STEP__STATEMENT) return null;
		return (Statement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStatement, TextualUseCasePackage.STEP__STATEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(Statement newStatement) {
		if (newStatement != eInternalContainer() || (eContainerFeatureID() != TextualUseCasePackage.STEP__STATEMENT && newStatement != null)) {
			if (EcoreUtil.isAncestor(this, newStatement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStatement != null)
				msgs = ((InternalEObject)newStatement).eInverseAdd(this, TextualUseCasePackage.STATEMENT__STEPS, Statement.class, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.STEP__STATEMENT, newStatement, newStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowOfEvents getFlowOfEvents() {
		if (eContainerFeatureID() != TextualUseCasePackage.STEP__FLOW_OF_EVENTS) return null;
		return (FlowOfEvents)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlowOfEvents(FlowOfEvents newFlowOfEvents, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFlowOfEvents, TextualUseCasePackage.STEP__FLOW_OF_EVENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowOfEvents(FlowOfEvents newFlowOfEvents) {
		if (newFlowOfEvents != eInternalContainer() || (eContainerFeatureID() != TextualUseCasePackage.STEP__FLOW_OF_EVENTS && newFlowOfEvents != null)) {
			if (EcoreUtil.isAncestor(this, newFlowOfEvents))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFlowOfEvents != null)
				msgs = ((InternalEObject)newFlowOfEvents).eInverseAdd(this, TextualUseCasePackage.FLOW_OF_EVENTS__STEPS, FlowOfEvents.class, msgs);
			msgs = basicSetFlowOfEvents(newFlowOfEvents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.STEP__FLOW_OF_EVENTS, newFlowOfEvents, newFlowOfEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualUseCasePackage.STEP__ALTERNATIVE_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeFlow()).basicAdd(otherEnd, msgs);
			case TextualUseCasePackage.STEP__STATEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStatement((Statement)otherEnd, msgs);
			case TextualUseCasePackage.STEP__FLOW_OF_EVENTS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFlowOfEvents((FlowOfEvents)otherEnd, msgs);
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
			case TextualUseCasePackage.STEP__ALTERNATIVE_FLOW:
				return ((InternalEList<?>)getAlternativeFlow()).basicRemove(otherEnd, msgs);
			case TextualUseCasePackage.STEP__STATEMENT:
				return basicSetStatement(null, msgs);
			case TextualUseCasePackage.STEP__FLOW_OF_EVENTS:
				return basicSetFlowOfEvents(null, msgs);
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
			case TextualUseCasePackage.STEP__STATEMENT:
				return eInternalContainer().eInverseRemove(this, TextualUseCasePackage.STATEMENT__STEPS, Statement.class, msgs);
			case TextualUseCasePackage.STEP__FLOW_OF_EVENTS:
				return eInternalContainer().eInverseRemove(this, TextualUseCasePackage.FLOW_OF_EVENTS__STEPS, FlowOfEvents.class, msgs);
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
			case TextualUseCasePackage.STEP__ALTERNATIVE_FLOW:
				return getAlternativeFlow();
			case TextualUseCasePackage.STEP__STATEMENT:
				return getStatement();
			case TextualUseCasePackage.STEP__NAME:
				return getName();
			case TextualUseCasePackage.STEP__FLOW_OF_EVENTS:
				return getFlowOfEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TextualUseCasePackage.STEP__ALTERNATIVE_FLOW:
				getAlternativeFlow().clear();
				getAlternativeFlow().addAll((Collection<? extends AlternativeFlow>)newValue);
				return;
			case TextualUseCasePackage.STEP__STATEMENT:
				setStatement((Statement)newValue);
				return;
			case TextualUseCasePackage.STEP__NAME:
				setName((String)newValue);
				return;
			case TextualUseCasePackage.STEP__FLOW_OF_EVENTS:
				setFlowOfEvents((FlowOfEvents)newValue);
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
			case TextualUseCasePackage.STEP__ALTERNATIVE_FLOW:
				getAlternativeFlow().clear();
				return;
			case TextualUseCasePackage.STEP__STATEMENT:
				setStatement((Statement)null);
				return;
			case TextualUseCasePackage.STEP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextualUseCasePackage.STEP__FLOW_OF_EVENTS:
				setFlowOfEvents((FlowOfEvents)null);
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
			case TextualUseCasePackage.STEP__ALTERNATIVE_FLOW:
				return alternativeFlow != null && !alternativeFlow.isEmpty();
			case TextualUseCasePackage.STEP__STATEMENT:
				return getStatement() != null;
			case TextualUseCasePackage.STEP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextualUseCasePackage.STEP__FLOW_OF_EVENTS:
				return getFlowOfEvents() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StepImpl
