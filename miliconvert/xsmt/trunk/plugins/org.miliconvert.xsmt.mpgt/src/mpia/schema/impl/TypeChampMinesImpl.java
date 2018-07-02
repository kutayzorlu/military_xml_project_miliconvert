/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeChampMines;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Champ Mines</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeChampMinesImpl#getEspacement <em>Espacement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeChampMinesImpl#getDateDestruction <em>Date Destruction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeChampMinesImpl extends TypeObstacleImpl implements TypeChampMines {
	/**
	 * The cached value of the '{@link #getEspacement() <em>Espacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEspacement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur espacement;

	/**
	 * The cached value of the '{@link #getDateDestruction() <em>Date Destruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDestruction()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDestruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeChampMinesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeChampMines();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getEspacement() {
		return espacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEspacement(TypeDataTypeLongueur newEspacement, NotificationChain msgs) {
		TypeDataTypeLongueur oldEspacement = espacement;
		espacement = newEspacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT, oldEspacement, newEspacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEspacement(TypeDataTypeLongueur newEspacement) {
		if (newEspacement != espacement) {
			NotificationChain msgs = null;
			if (espacement != null)
				msgs = ((InternalEObject)espacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT, null, msgs);
			if (newEspacement != null)
				msgs = ((InternalEObject)newEspacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT, null, msgs);
			msgs = basicSetEspacement(newEspacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT, newEspacement, newEspacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDestruction() {
		return dateDestruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDestruction(TypeDataTypeDateHeure newDateDestruction, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDestruction = dateDestruction;
		dateDestruction = newDateDestruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION, oldDateDestruction, newDateDestruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDestruction(TypeDataTypeDateHeure newDateDestruction) {
		if (newDateDestruction != dateDestruction) {
			NotificationChain msgs = null;
			if (dateDestruction != null)
				msgs = ((InternalEObject)dateDestruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION, null, msgs);
			if (newDateDestruction != null)
				msgs = ((InternalEObject)newDateDestruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION, null, msgs);
			msgs = basicSetDateDestruction(newDateDestruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION, newDateDestruction, newDateDestruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT:
				return basicSetEspacement(null, msgs);
			case SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION:
				return basicSetDateDestruction(null, msgs);
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
			case SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT:
				return getEspacement();
			case SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION:
				return getDateDestruction();
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
			case SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT:
				setEspacement((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION:
				setDateDestruction((TypeDataTypeDateHeure)newValue);
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
			case SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT:
				setEspacement((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION:
				setDateDestruction((TypeDataTypeDateHeure)null);
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
			case SchemaPackage.TYPE_CHAMP_MINES__ESPACEMENT:
				return espacement != null;
			case SchemaPackage.TYPE_CHAMP_MINES__DATE_DESTRUCTION:
				return dateDestruction != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeChampMinesImpl
