/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.Action;
import br.com.levysiqueira.textualusecase.Agent;
import br.com.levysiqueira.textualusecase.TextualUseCasePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.ActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.ActionImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends StepImpl implements Action {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected Agent agent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualUseCasePackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ACTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getAgent() {
		if (agent != null && agent.eIsProxy()) {
			InternalEObject oldAgent = (InternalEObject)agent;
			agent = (Agent)eResolveProxy(oldAgent);
			if (agent != oldAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextualUseCasePackage.ACTION__AGENT, oldAgent, agent));
			}
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(Agent newAgent, NotificationChain msgs) {
		Agent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ACTION__AGENT, oldAgent, newAgent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Agent newAgent) {
		if (newAgent != agent) {
			NotificationChain msgs = null;
			if (agent != null)
				msgs = ((InternalEObject)agent).eInverseRemove(this, TextualUseCasePackage.AGENT__ACTIONS, Agent.class, msgs);
			if (newAgent != null)
				msgs = ((InternalEObject)newAgent).eInverseAdd(this, TextualUseCasePackage.AGENT__ACTIONS, Agent.class, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ACTION__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualUseCasePackage.ACTION__AGENT:
				if (agent != null)
					msgs = ((InternalEObject)agent).eInverseRemove(this, TextualUseCasePackage.AGENT__ACTIONS, Agent.class, msgs);
				return basicSetAgent((Agent)otherEnd, msgs);
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
			case TextualUseCasePackage.ACTION__AGENT:
				return basicSetAgent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextualUseCasePackage.ACTION__DESCRIPTION:
				return getDescription();
			case TextualUseCasePackage.ACTION__AGENT:
				if (resolve) return getAgent();
				return basicGetAgent();
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
			case TextualUseCasePackage.ACTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TextualUseCasePackage.ACTION__AGENT:
				setAgent((Agent)newValue);
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
			case TextualUseCasePackage.ACTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TextualUseCasePackage.ACTION__AGENT:
				setAgent((Agent)null);
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
			case TextualUseCasePackage.ACTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TextualUseCasePackage.ACTION__AGENT:
				return agent != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
