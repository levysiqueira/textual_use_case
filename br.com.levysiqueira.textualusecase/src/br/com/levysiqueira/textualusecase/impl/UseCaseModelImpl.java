/**
 */
package br.com.levysiqueira.textualusecase.impl;

import br.com.levysiqueira.textualusecase.Actor;
import br.com.levysiqueira.textualusecase.Subject;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseModelImpl#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseModelImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link br.com.levysiqueira.textualusecase.impl.UseCaseModelImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UseCaseModelImpl extends MinimalEObjectImpl.Container implements UseCaseModel {
	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCase;

	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actor;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Subject subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TextualUseCasePackage.Literals.USE_CASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCase() {
		if (useCase == null) {
			useCase = new EObjectContainmentWithInverseEList<UseCase>(UseCase.class, this, TextualUseCasePackage.USE_CASE_MODEL__USE_CASE, TextualUseCasePackage.USE_CASE__USE_CASE_MODEL);
		}
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActor() {
		if (actor == null) {
			actor = new EObjectContainmentWithInverseEList<Actor>(Actor.class, this, TextualUseCasePackage.USE_CASE_MODEL__ACTOR, TextualUseCasePackage.ACTOR__USE_CASE_MODEL);
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subject getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Subject newSubject, NotificationChain msgs) {
		Subject oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE_MODEL__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Subject newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, TextualUseCasePackage.SUBJECT__USE_CASEMODEL, Subject.class, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, TextualUseCasePackage.SUBJECT__USE_CASEMODEL, Subject.class, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TextualUseCasePackage.USE_CASE_MODEL__SUBJECT, newSubject, newSubject));
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
			case TextualUseCasePackage.USE_CASE_MODEL__USE_CASE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUseCase()).basicAdd(otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE_MODEL__ACTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActor()).basicAdd(otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE_MODEL__SUBJECT:
				if (subject != null)
					msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TextualUseCasePackage.USE_CASE_MODEL__SUBJECT, null, msgs);
				return basicSetSubject((Subject)otherEnd, msgs);
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
			case TextualUseCasePackage.USE_CASE_MODEL__USE_CASE:
				return ((InternalEList<?>)getUseCase()).basicRemove(otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE_MODEL__ACTOR:
				return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
			case TextualUseCasePackage.USE_CASE_MODEL__SUBJECT:
				return basicSetSubject(null, msgs);
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
			case TextualUseCasePackage.USE_CASE_MODEL__USE_CASE:
				return getUseCase();
			case TextualUseCasePackage.USE_CASE_MODEL__ACTOR:
				return getActor();
			case TextualUseCasePackage.USE_CASE_MODEL__SUBJECT:
				return getSubject();
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
			case TextualUseCasePackage.USE_CASE_MODEL__USE_CASE:
				getUseCase().clear();
				getUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case TextualUseCasePackage.USE_CASE_MODEL__ACTOR:
				getActor().clear();
				getActor().addAll((Collection<? extends Actor>)newValue);
				return;
			case TextualUseCasePackage.USE_CASE_MODEL__SUBJECT:
				setSubject((Subject)newValue);
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
			case TextualUseCasePackage.USE_CASE_MODEL__USE_CASE:
				getUseCase().clear();
				return;
			case TextualUseCasePackage.USE_CASE_MODEL__ACTOR:
				getActor().clear();
				return;
			case TextualUseCasePackage.USE_CASE_MODEL__SUBJECT:
				setSubject((Subject)null);
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
			case TextualUseCasePackage.USE_CASE_MODEL__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case TextualUseCasePackage.USE_CASE_MODEL__ACTOR:
				return actor != null && !actor.isEmpty();
			case TextualUseCasePackage.USE_CASE_MODEL__SUBJECT:
				return subject != null;
		}
		return super.eIsSet(featureID);
	}

} //UseCaseModelImpl
