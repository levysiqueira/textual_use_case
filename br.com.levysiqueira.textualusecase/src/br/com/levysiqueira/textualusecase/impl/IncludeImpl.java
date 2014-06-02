/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.Include;
import br.com.levysiqueira.textualusecase.TextualUseCasePackage;
import br.com.levysiqueira.textualusecase.UseCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.IncludeImpl#getUseCase <em>Use Case</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeImpl extends StepImpl implements Include {
	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase useCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualUseCasePackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUseCase() {
		if (useCase != null && useCase.eIsProxy()) {
			InternalEObject oldUseCase = (InternalEObject)useCase;
			useCase = (UseCase)eResolveProxy(oldUseCase);
			if (useCase != oldUseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TextualUseCasePackage.INCLUDE__USE_CASE, oldUseCase, useCase));
			}
		}
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetUseCase() {
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseCase(UseCase newUseCase, NotificationChain msgs) {
		UseCase oldUseCase = useCase;
		useCase = newUseCase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.INCLUDE__USE_CASE, oldUseCase, newUseCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCase(UseCase newUseCase) {
		if (newUseCase != useCase) {
			NotificationChain msgs = null;
			if (useCase != null)
				msgs = ((InternalEObject)useCase).eInverseRemove(this, TextualUseCasePackage.USE_CASE__INCLUDES, UseCase.class, msgs);
			if (newUseCase != null)
				msgs = ((InternalEObject)newUseCase).eInverseAdd(this, TextualUseCasePackage.USE_CASE__INCLUDES, UseCase.class, msgs);
			msgs = basicSetUseCase(newUseCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.INCLUDE__USE_CASE, newUseCase, newUseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TextualUseCasePackage.INCLUDE__USE_CASE:
				if (useCase != null)
					msgs = ((InternalEObject)useCase).eInverseRemove(this, TextualUseCasePackage.USE_CASE__INCLUDES, UseCase.class, msgs);
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
			case TextualUseCasePackage.INCLUDE__USE_CASE:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TextualUseCasePackage.INCLUDE__USE_CASE:
				if (resolve) return getUseCase();
				return basicGetUseCase();
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
			case TextualUseCasePackage.INCLUDE__USE_CASE:
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
			case TextualUseCasePackage.INCLUDE__USE_CASE:
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
			case TextualUseCasePackage.INCLUDE__USE_CASE:
				return useCase != null;
		}
		return super.eIsSet(featureID);
	}

} //IncludeImpl
