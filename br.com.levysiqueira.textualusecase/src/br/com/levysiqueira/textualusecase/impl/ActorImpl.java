/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.Actor;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.ActorImpl#getUseCaseModel <em>Use Case Model</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.ActorImpl#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends AgentImpl implements Actor {
	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualUseCasePackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseModel getUseCaseModel() {
		if (eContainerFeatureID() != TextualUseCasePackage.ACTOR__USE_CASE_MODEL) return null;
		return (UseCaseModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCaseModel(UseCaseModel newUseCaseModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUseCaseModel, TextualUseCasePackage.ACTOR__USE_CASE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCaseModel(UseCaseModel newUseCaseModel) {
		if (newUseCaseModel != eInternalContainer() || (eContainerFeatureID() != TextualUseCasePackage.ACTOR__USE_CASE_MODEL && newUseCaseModel != null)) {
			if (EcoreUtil.isAncestor(this, newUseCaseModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUseCaseModel != null)
				msgs = ((InternalEObject)newUseCaseModel).eInverseAdd(this, TextualUseCasePackage.USE_CASE_MODEL__ACTOR, UseCaseModel.class, msgs);
			msgs = basicSetUseCaseModel(newUseCaseModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.ACTOR__USE_CASE_MODEL, newUseCaseModel, newUseCaseModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCase() {
		if (useCase == null) {
			useCase = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this, TextualUseCasePackage.ACTOR__USE_CASE, TextualUseCasePackage.USE_CASE__ACTOR);
		}
		return useCase;
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
			case TextualUseCasePackage.ACTOR__USE_CASE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUseCaseModel((UseCaseModel)otherEnd, msgs);
			case TextualUseCasePackage.ACTOR__USE_CASE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUseCase()).basicAdd(otherEnd, msgs);
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
			case TextualUseCasePackage.ACTOR__USE_CASE_MODEL:
				return basicSetUseCaseModel(null, msgs);
			case TextualUseCasePackage.ACTOR__USE_CASE:
				return ((InternalEList<?>)getUseCase()).basicRemove(otherEnd, msgs);
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
			case TextualUseCasePackage.ACTOR__USE_CASE_MODEL:
				return eInternalContainer().eInverseRemove(this, TextualUseCasePackage.USE_CASE_MODEL__ACTOR, UseCaseModel.class, msgs);
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
			case TextualUseCasePackage.ACTOR__USE_CASE_MODEL:
				return getUseCaseModel();
			case TextualUseCasePackage.ACTOR__USE_CASE:
				return getUseCase();
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
			case TextualUseCasePackage.ACTOR__USE_CASE_MODEL:
				setUseCaseModel((UseCaseModel)newValue);
				return;
			case TextualUseCasePackage.ACTOR__USE_CASE:
				getUseCase().clear();
				getUseCase().addAll((Collection<? extends UseCase>)newValue);
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
			case TextualUseCasePackage.ACTOR__USE_CASE_MODEL:
				setUseCaseModel((UseCaseModel)null);
				return;
			case TextualUseCasePackage.ACTOR__USE_CASE:
				getUseCase().clear();
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
			case TextualUseCasePackage.ACTOR__USE_CASE_MODEL:
				return getUseCaseModel() != null;
			case TextualUseCasePackage.ACTOR__USE_CASE:
				return useCase != null && !useCase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
