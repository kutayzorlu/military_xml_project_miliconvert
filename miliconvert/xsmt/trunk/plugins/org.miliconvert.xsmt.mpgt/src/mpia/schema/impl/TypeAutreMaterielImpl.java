/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutreMateriel;
import mpia.schema.TypeDictionaryDicoTypeMobilite;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autre Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutreMaterielImpl#getMobilite <em>Mobilite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutreMaterielImpl extends TypeMaterielImpl implements TypeAutreMateriel {
	/**
	 * The default value of the '{@link #getMobilite() <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMobilite MOBILITE_EDEFAULT = TypeDictionaryDicoTypeMobilite.AIRBRN;

	/**
	 * The cached value of the '{@link #getMobilite() <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMobilite mobilite = MOBILITE_EDEFAULT;

	/**
	 * This is true if the Mobilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mobiliteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutreMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutreMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMobilite getMobilite() {
		return mobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilite(TypeDictionaryDicoTypeMobilite newMobilite) {
		TypeDictionaryDicoTypeMobilite oldMobilite = mobilite;
		mobilite = newMobilite == null ? MOBILITE_EDEFAULT : newMobilite;
		boolean oldMobiliteESet = mobiliteESet;
		mobiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTRE_MATERIEL__MOBILITE, oldMobilite, mobilite, !oldMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMobilite() {
		TypeDictionaryDicoTypeMobilite oldMobilite = mobilite;
		boolean oldMobiliteESet = mobiliteESet;
		mobilite = MOBILITE_EDEFAULT;
		mobiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTRE_MATERIEL__MOBILITE, oldMobilite, MOBILITE_EDEFAULT, oldMobiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMobilite() {
		return mobiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTRE_MATERIEL__MOBILITE:
				return getMobilite();
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
			case SchemaPackage.TYPE_AUTRE_MATERIEL__MOBILITE:
				setMobilite((TypeDictionaryDicoTypeMobilite)newValue);
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
			case SchemaPackage.TYPE_AUTRE_MATERIEL__MOBILITE:
				unsetMobilite();
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
			case SchemaPackage.TYPE_AUTRE_MATERIEL__MOBILITE:
				return isSetMobilite();
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
		result.append(" (mobilite: ");
		if (mobiliteESet) result.append(mobilite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAutreMaterielImpl
