/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelUXOExposition;
import mpia.schema.TypeDictionaryDicoEtatOperationnelUXOQualificatif;
import mpia.schema.TypeEtatOperationnelUXO;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel UXO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelUXOImpl#getQualificatif <em>Qualificatif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelUXOImpl#getExposition <em>Exposition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelUXOImpl extends EObjectImpl implements TypeEtatOperationnelUXO {
	/**
	 * The default value of the '{@link #getQualificatif() <em>Qualificatif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatif()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelUXOQualificatif QUALIFICATIF_EDEFAULT = TypeDictionaryDicoEtatOperationnelUXOQualificatif.INTACT;

	/**
	 * The cached value of the '{@link #getQualificatif() <em>Qualificatif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatif()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelUXOQualificatif qualificatif = QUALIFICATIF_EDEFAULT;

	/**
	 * This is true if the Qualificatif attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifESet;

	/**
	 * The default value of the '{@link #getExposition() <em>Exposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelUXOExposition EXPOSITION_EDEFAULT = TypeDictionaryDicoEtatOperationnelUXOExposition.FULEXP;

	/**
	 * The cached value of the '{@link #getExposition() <em>Exposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelUXOExposition exposition = EXPOSITION_EDEFAULT;

	/**
	 * This is true if the Exposition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expositionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelUXOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelUXO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelUXOQualificatif getQualificatif() {
		return qualificatif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatif(TypeDictionaryDicoEtatOperationnelUXOQualificatif newQualificatif) {
		TypeDictionaryDicoEtatOperationnelUXOQualificatif oldQualificatif = qualificatif;
		qualificatif = newQualificatif == null ? QUALIFICATIF_EDEFAULT : newQualificatif;
		boolean oldQualificatifESet = qualificatifESet;
		qualificatifESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__QUALIFICATIF, oldQualificatif, qualificatif, !oldQualificatifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatif() {
		TypeDictionaryDicoEtatOperationnelUXOQualificatif oldQualificatif = qualificatif;
		boolean oldQualificatifESet = qualificatifESet;
		qualificatif = QUALIFICATIF_EDEFAULT;
		qualificatifESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__QUALIFICATIF, oldQualificatif, QUALIFICATIF_EDEFAULT, oldQualificatifESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatif() {
		return qualificatifESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelUXOExposition getExposition() {
		return exposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposition(TypeDictionaryDicoEtatOperationnelUXOExposition newExposition) {
		TypeDictionaryDicoEtatOperationnelUXOExposition oldExposition = exposition;
		exposition = newExposition == null ? EXPOSITION_EDEFAULT : newExposition;
		boolean oldExpositionESet = expositionESet;
		expositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__EXPOSITION, oldExposition, exposition, !oldExpositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExposition() {
		TypeDictionaryDicoEtatOperationnelUXOExposition oldExposition = exposition;
		boolean oldExpositionESet = expositionESet;
		exposition = EXPOSITION_EDEFAULT;
		expositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__EXPOSITION, oldExposition, EXPOSITION_EDEFAULT, oldExpositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExposition() {
		return expositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__QUALIFICATIF:
				return getQualificatif();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__EXPOSITION:
				return getExposition();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__QUALIFICATIF:
				setQualificatif((TypeDictionaryDicoEtatOperationnelUXOQualificatif)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__EXPOSITION:
				setExposition((TypeDictionaryDicoEtatOperationnelUXOExposition)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__QUALIFICATIF:
				unsetQualificatif();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__EXPOSITION:
				unsetExposition();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__QUALIFICATIF:
				return isSetQualificatif();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_UXO__EXPOSITION:
				return isSetExposition();
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
		result.append(" (qualificatif: ");
		if (qualificatifESet) result.append(qualificatif); else result.append("<unset>");
		result.append(", exposition: ");
		if (expositionESet) result.append(exposition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelUXOImpl
