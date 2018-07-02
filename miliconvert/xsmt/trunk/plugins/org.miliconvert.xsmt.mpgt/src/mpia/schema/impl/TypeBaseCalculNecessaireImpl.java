/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBaseCalculNecessaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Base Calcul Necessaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBaseCalculNecessaireImpl#getDureeEmploi <em>Duree Emploi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBaseCalculNecessaireImpl#getNbreGroupe <em>Nbre Groupe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBaseCalculNecessaireImpl extends EObjectImpl implements TypeBaseCalculNecessaire {
	/**
	 * The cached value of the '{@link #getDureeEmploi() <em>Duree Emploi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeEmploi()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeEmploi;

	/**
	 * The default value of the '{@link #getNbreGroupe() <em>Nbre Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbreGroupe()
	 * @generated
	 * @ordered
	 */
	protected static final long NBRE_GROUPE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbreGroupe() <em>Nbre Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbreGroupe()
	 * @generated
	 * @ordered
	 */
	protected long nbreGroupe = NBRE_GROUPE_EDEFAULT;

	/**
	 * This is true if the Nbre Groupe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbreGroupeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBaseCalculNecessaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBaseCalculNecessaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeEmploi() {
		return dureeEmploi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeEmploi(TypeDataTypeDuree newDureeEmploi, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeEmploi = dureeEmploi;
		dureeEmploi = newDureeEmploi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI, oldDureeEmploi, newDureeEmploi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeEmploi(TypeDataTypeDuree newDureeEmploi) {
		if (newDureeEmploi != dureeEmploi) {
			NotificationChain msgs = null;
			if (dureeEmploi != null)
				msgs = ((InternalEObject)dureeEmploi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI, null, msgs);
			if (newDureeEmploi != null)
				msgs = ((InternalEObject)newDureeEmploi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI, null, msgs);
			msgs = basicSetDureeEmploi(newDureeEmploi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI, newDureeEmploi, newDureeEmploi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbreGroupe() {
		return nbreGroupe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbreGroupe(long newNbreGroupe) {
		long oldNbreGroupe = nbreGroupe;
		nbreGroupe = newNbreGroupe;
		boolean oldNbreGroupeESet = nbreGroupeESet;
		nbreGroupeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__NBRE_GROUPE, oldNbreGroupe, nbreGroupe, !oldNbreGroupeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbreGroupe() {
		long oldNbreGroupe = nbreGroupe;
		boolean oldNbreGroupeESet = nbreGroupeESet;
		nbreGroupe = NBRE_GROUPE_EDEFAULT;
		nbreGroupeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__NBRE_GROUPE, oldNbreGroupe, NBRE_GROUPE_EDEFAULT, oldNbreGroupeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbreGroupe() {
		return nbreGroupeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI:
				return basicSetDureeEmploi(null, msgs);
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
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI:
				return getDureeEmploi();
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__NBRE_GROUPE:
				return new Long(getNbreGroupe());
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
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI:
				setDureeEmploi((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__NBRE_GROUPE:
				setNbreGroupe(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI:
				setDureeEmploi((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__NBRE_GROUPE:
				unsetNbreGroupe();
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
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__DUREE_EMPLOI:
				return dureeEmploi != null;
			case SchemaPackage.TYPE_BASE_CALCUL_NECESSAIRE__NBRE_GROUPE:
				return isSetNbreGroupe();
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
		result.append(" (nbreGroupe: ");
		if (nbreGroupeESet) result.append(nbreGroupe); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeBaseCalculNecessaireImpl
