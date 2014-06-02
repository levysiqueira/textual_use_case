/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.Actor;
import br.com.levysiqueira.textualusecase.AlternativeFlow;
import br.com.levysiqueira.textualusecase.BasicFlow;
import br.com.levysiqueira.textualusecase.Condition;
import br.com.levysiqueira.textualusecase.Include;
import br.com.levysiqueira.textualusecase.TextualUseCasePackage;
import br.com.levysiqueira.textualusecase.UseCase;
import br.com.levysiqueira.textualusecase.UseCaseModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getAlternativeFlow <em>Alternative Flow</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getBasicFlow <em>Basic Flow</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getUseCaseModel <em>Use Case Model</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseImpl extends MinimalEObjectImpl.Container implements UseCase {
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
	 * The cached value of the '{@link #getAlternativeFlow() <em>Alternative Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<AlternativeFlow> alternativeFlow;

	/**
	 * The cached value of the '{@link #getBasicFlow() <em>Basic Flow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicFlow()
	 * @generated
	 * @ordered
	 */
	protected BasicFlow basicFlow;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition postCondition;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition preCondition;

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
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> includes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualUseCasePackage.Literals.USE_CASE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlternativeFlow> getAlternativeFlow() {
		if (alternativeFlow == null) {
			alternativeFlow = new EObjectContainmentWithInverseEList<AlternativeFlow>(AlternativeFlow.class, this, TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW, TextualUseCasePackage.ALTERNATIVE_FLOW__USE_CASE);
		}
		return alternativeFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicFlow getBasicFlow() {
		return basicFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicFlow(BasicFlow newBasicFlow, NotificationChain msgs) {
		BasicFlow oldBasicFlow = basicFlow;
		basicFlow = newBasicFlow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__BASIC_FLOW, oldBasicFlow, newBasicFlow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicFlow(BasicFlow newBasicFlow) {
		if (newBasicFlow != basicFlow) {
			NotificationChain msgs = null;
			if (basicFlow != null)
				msgs = ((InternalEObject)basicFlow).eInverseRemove(this, TextualUseCasePackage.BASIC_FLOW__USE_CASE, BasicFlow.class, msgs);
			if (newBasicFlow != null)
				msgs = ((InternalEObject)newBasicFlow).eInverseAdd(this, TextualUseCasePackage.BASIC_FLOW__USE_CASE, BasicFlow.class, msgs);
			msgs = basicSetBasicFlow(newBasicFlow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__BASIC_FLOW, newBasicFlow, newBasicFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectWithInverseResolvingEList.ManyInverse<Actor>(Actor.class, this, TextualUseCasePackage.USE_CASE__ACTOR, TextualUseCasePackage.ACTOR__USE_CASE);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostCondition(Condition newPostCondition, NotificationChain msgs) {
		Condition oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__POST_CONDITION, oldPostCondition, newPostCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Condition newPostCondition) {
		if (newPostCondition != postCondition) {
			NotificationChain msgs = null;
			if (postCondition != null)
				msgs = ((InternalEObject)postCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextualUseCasePackage.USE_CASE__POST_CONDITION, null, msgs);
			if (newPostCondition != null)
				msgs = ((InternalEObject)newPostCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextualUseCasePackage.USE_CASE__POST_CONDITION, null, msgs);
			msgs = basicSetPostCondition(newPostCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__POST_CONDITION, newPostCondition, newPostCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreCondition(Condition newPreCondition, NotificationChain msgs) {
		Condition oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__PRE_CONDITION, oldPreCondition, newPreCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Condition newPreCondition) {
		if (newPreCondition != preCondition) {
			NotificationChain msgs = null;
			if (preCondition != null)
				msgs = ((InternalEObject)preCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextualUseCasePackage.USE_CASE__PRE_CONDITION, null, msgs);
			if (newPreCondition != null)
				msgs = ((InternalEObject)newPreCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TextualUseCasePackage.USE_CASE__PRE_CONDITION, null, msgs);
			msgs = basicSetPreCondition(newPreCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__PRE_CONDITION, newPreCondition, newPreCondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseModel getUseCaseModel() {
		if (eContainerFeatureID() != TextualUseCasePackage.USE_CASE__USE_CASE_MODEL) return null;
		return (UseCaseModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCaseModel(UseCaseModel newUseCaseModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUseCaseModel, TextualUseCasePackage.USE_CASE__USE_CASE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCaseModel(UseCaseModel newUseCaseModel) {
		if (newUseCaseModel != eInternalContainer() || (eContainerFeatureID() != TextualUseCasePackage.USE_CASE__USE_CASE_MODEL && newUseCaseModel != null)) {
			if (EcoreUtil.isAncestor(this, newUseCaseModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUseCaseModel != null)
				msgs = ((InternalEObject)newUseCaseModel).eInverseAdd(this, TextualUseCasePackage.USE_CASE_MODEL__USE_CASE, UseCaseModel.class, msgs);
			msgs = basicSetUseCaseModel(newUseCaseModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE__USE_CASE_MODEL, newUseCaseModel, newUseCaseModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getIncludes() {
		if (includes == null) {
			includes = new EObjectWithInverseResolvingEList<Include>(Include.class, this, TextualUseCasePackage.USE_CASE__INCLUDES, TextualUseCasePackage.INCLUDE__USE_CASE);
		}
		return includes;
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
			case TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAlternativeFlow()).basicAdd(otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE__BASIC_FLOW:
				if (basicFlow != null)
					msgs = ((InternalEObject)basicFlow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextualUseCasePackage.USE_CASE__BASIC_FLOW, null, msgs);
				return basicSetBasicFlow((BasicFlow)otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE__ACTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActor()).basicAdd(otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE__USE_CASE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUseCaseModel((UseCaseModel)otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE__INCLUDES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncludes()).basicAdd(otherEnd, msgs);
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
			case TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW:
				return ((InternalEList<?>)getAlternativeFlow()).basicRemove(otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE__BASIC_FLOW:
				return basicSetBasicFlow(null, msgs);
			case TextualUseCasePackage.USE_CASE__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE__POST_CONDITION:
				return basicSetPostCondition(null, msgs);
			case TextualUseCasePackage.USE_CASE__PRE_CONDITION:
				return basicSetPreCondition(null, msgs);
			case TextualUseCasePackage.USE_CASE__USE_CASE_MODEL:
				return basicSetUseCaseModel(null, msgs);
			case TextualUseCasePackage.USE_CASE__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
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
			case TextualUseCasePackage.USE_CASE__USE_CASE_MODEL:
				return eInternalContainer().eInverseRemove(this, TextualUseCasePackage.USE_CASE_MODEL__USE_CASE, UseCaseModel.class, msgs);
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
			case TextualUseCasePackage.USE_CASE__NAME:
				return getName();
			case TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW:
				return getAlternativeFlow();
			case TextualUseCasePackage.USE_CASE__BASIC_FLOW:
				return getBasicFlow();
			case TextualUseCasePackage.USE_CASE__ACTOR:
				return getActor();
			case TextualUseCasePackage.USE_CASE__POST_CONDITION:
				return getPostCondition();
			case TextualUseCasePackage.USE_CASE__PRE_CONDITION:
				return getPreCondition();
			case TextualUseCasePackage.USE_CASE__DESCRIPTION:
				return getDescription();
			case TextualUseCasePackage.USE_CASE__USE_CASE_MODEL:
				return getUseCaseModel();
			case TextualUseCasePackage.USE_CASE__INCLUDES:
				return getIncludes();
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
			case TextualUseCasePackage.USE_CASE__NAME:
				setName((String)newValue);
				return;
			case TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW:
				getAlternativeFlow().clear();
				getAlternativeFlow().addAll((Collection<? extends AlternativeFlow>)newValue);
				return;
			case TextualUseCasePackage.USE_CASE__BASIC_FLOW:
				setBasicFlow((BasicFlow)newValue);
				return;
			case TextualUseCasePackage.USE_CASE__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case TextualUseCasePackage.USE_CASE__POST_CONDITION:
				setPostCondition((Condition)newValue);
				return;
			case TextualUseCasePackage.USE_CASE__PRE_CONDITION:
				setPreCondition((Condition)newValue);
				return;
			case TextualUseCasePackage.USE_CASE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TextualUseCasePackage.USE_CASE__USE_CASE_MODEL:
				setUseCaseModel((UseCaseModel)newValue);
				return;
			case TextualUseCasePackage.USE_CASE__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends Include>)newValue);
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
			case TextualUseCasePackage.USE_CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW:
				getAlternativeFlow().clear();
				return;
			case TextualUseCasePackage.USE_CASE__BASIC_FLOW:
				setBasicFlow((BasicFlow)null);
				return;
			case TextualUseCasePackage.USE_CASE__ACTOR:
				getActor().clear();
				return;
			case TextualUseCasePackage.USE_CASE__POST_CONDITION:
				setPostCondition((Condition)null);
				return;
			case TextualUseCasePackage.USE_CASE__PRE_CONDITION:
				setPreCondition((Condition)null);
				return;
			case TextualUseCasePackage.USE_CASE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TextualUseCasePackage.USE_CASE__USE_CASE_MODEL:
				setUseCaseModel((UseCaseModel)null);
				return;
			case TextualUseCasePackage.USE_CASE__INCLUDES:
				getIncludes().clear();
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
			case TextualUseCasePackage.USE_CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TextualUseCasePackage.USE_CASE__ALTERNATIVE_FLOW:
				return alternativeFlow != null && !alternativeFlow.isEmpty();
			case TextualUseCasePackage.USE_CASE__BASIC_FLOW:
				return basicFlow != null;
			case TextualUseCasePackage.USE_CASE__ACTOR:
				return actor != null && !actor.isEmpty();
			case TextualUseCasePackage.USE_CASE__POST_CONDITION:
				return postCondition != null;
			case TextualUseCasePackage.USE_CASE__PRE_CONDITION:
				return preCondition != null;
			case TextualUseCasePackage.USE_CASE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TextualUseCasePackage.USE_CASE__USE_CASE_MODEL:
				return getUseCaseModel() != null;
			case TextualUseCasePackage.USE_CASE__INCLUDES:
				return includes != null && !includes.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //UseCaseImpl
