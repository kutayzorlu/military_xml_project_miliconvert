/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne;
import mpia.schema.TypeTypeMissionAerienne;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Mission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeMissionAerienneImpl#getTypeMissionAerienne <em>Type Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMissionAerienneImpl#getAutreTypeMissionAerienne <em>Autre Type Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMissionAerienneImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeMissionAerienneImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeMissionAerienneImpl extends EObjectImpl implements TypeTypeMissionAerienne {
	/**
	 * The default value of the '{@link #getTypeMissionAerienne() <em>Type Mission Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne TYPE_MISSION_AERIENNE_EDEFAULT = TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne.COMBAT;

	/**
	 * The cached value of the '{@link #getTypeMissionAerienne() <em>Type Mission Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne typeMissionAerienne = TYPE_MISSION_AERIENNE_EDEFAULT;

	/**
	 * This is true if the Type Mission Aerienne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionAerienneESet;

	/**
	 * The default value of the '{@link #getAutreTypeMissionAerienne() <em>Autre Type Mission Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_TYPE_MISSION_AERIENNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreTypeMissionAerienne() <em>Autre Type Mission Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreTypeMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected String autreTypeMissionAerienne = AUTRE_TYPE_MISSION_AERIENNE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeMissionAerienneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeMissionAerienne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne getTypeMissionAerienne() {
		return typeMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionAerienne(TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne newTypeMissionAerienne) {
		TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne oldTypeMissionAerienne = typeMissionAerienne;
		typeMissionAerienne = newTypeMissionAerienne == null ? TYPE_MISSION_AERIENNE_EDEFAULT : newTypeMissionAerienne;
		boolean oldTypeMissionAerienneESet = typeMissionAerienneESet;
		typeMissionAerienneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__TYPE_MISSION_AERIENNE, oldTypeMissionAerienne, typeMissionAerienne, !oldTypeMissionAerienneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionAerienne() {
		TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne oldTypeMissionAerienne = typeMissionAerienne;
		boolean oldTypeMissionAerienneESet = typeMissionAerienneESet;
		typeMissionAerienne = TYPE_MISSION_AERIENNE_EDEFAULT;
		typeMissionAerienneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__TYPE_MISSION_AERIENNE, oldTypeMissionAerienne, TYPE_MISSION_AERIENNE_EDEFAULT, oldTypeMissionAerienneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionAerienne() {
		return typeMissionAerienneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreTypeMissionAerienne() {
		return autreTypeMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreTypeMissionAerienne(String newAutreTypeMissionAerienne) {
		String oldAutreTypeMissionAerienne = autreTypeMissionAerienne;
		autreTypeMissionAerienne = newAutreTypeMissionAerienne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__AUTRE_TYPE_MISSION_AERIENNE, oldAutreTypeMissionAerienne, autreTypeMissionAerienne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__TYPE_MISSION_AERIENNE:
				return getTypeMissionAerienne();
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__AUTRE_TYPE_MISSION_AERIENNE:
				return getAutreTypeMissionAerienne();
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CE:
				return getCE();
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
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__TYPE_MISSION_AERIENNE:
				setTypeMissionAerienne((TypeDictionaryDicoTypeMissionAerienneTypeMissionAerienne)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__AUTRE_TYPE_MISSION_AERIENNE:
				setAutreTypeMissionAerienne((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__TYPE_MISSION_AERIENNE:
				unsetTypeMissionAerienne();
				return;
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__AUTRE_TYPE_MISSION_AERIENNE:
				setAutreTypeMissionAerienne(AUTRE_TYPE_MISSION_AERIENNE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__TYPE_MISSION_AERIENNE:
				return isSetTypeMissionAerienne();
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__AUTRE_TYPE_MISSION_AERIENNE:
				return AUTRE_TYPE_MISSION_AERIENNE_EDEFAULT == null ? autreTypeMissionAerienne != null : !AUTRE_TYPE_MISSION_AERIENNE_EDEFAULT.equals(autreTypeMissionAerienne);
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TYPE_MISSION_AERIENNE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (typeMissionAerienne: ");
		if (typeMissionAerienneESet) result.append(typeMissionAerienne); else result.append("<unset>");
		result.append(", autreTypeMissionAerienne: ");
		result.append(autreTypeMissionAerienne);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTypeMissionAerienneImpl
