/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRactiviteASS;
import mpia.schema.TypeDictionaryDicoTypeMissionASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type CRactivite ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCRactiviteASSImpl#getTypeMissionASS <em>Type Mission ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRactiviteASSImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRactiviteASSImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRactiviteASSImpl#getRealiseeAuProfitUnite <em>Realisee Au Profit Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCRactiviteASSImpl extends EObjectImpl implements TypeCRactiviteASS {
	/**
	 * The default value of the '{@link #getTypeMissionASS() <em>Type Mission ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionASS()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeMissionASS TYPE_MISSION_ASS_EDEFAULT = TypeDictionaryDicoTypeMissionASS.CBATT;

	/**
	 * The cached value of the '{@link #getTypeMissionASS() <em>Type Mission ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMissionASS()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeMissionASS typeMissionASS = TYPE_MISSION_ASS_EDEFAULT;

	/**
	 * This is true if the Type Mission ASS attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMissionASSESet;

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
	 * The cached value of the '{@link #getRealiseeAuProfitUnite() <em>Realisee Au Profit Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealiseeAuProfitUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT realiseeAuProfitUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCRactiviteASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCRactiviteASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeMissionASS getTypeMissionASS() {
		return typeMissionASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMissionASS(TypeDictionaryDicoTypeMissionASS newTypeMissionASS) {
		TypeDictionaryDicoTypeMissionASS oldTypeMissionASS = typeMissionASS;
		typeMissionASS = newTypeMissionASS == null ? TYPE_MISSION_ASS_EDEFAULT : newTypeMissionASS;
		boolean oldTypeMissionASSESet = typeMissionASSESet;
		typeMissionASSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRACTIVITE_ASS__TYPE_MISSION_ASS, oldTypeMissionASS, typeMissionASS, !oldTypeMissionASSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMissionASS() {
		TypeDictionaryDicoTypeMissionASS oldTypeMissionASS = typeMissionASS;
		boolean oldTypeMissionASSESet = typeMissionASSESet;
		typeMissionASS = TYPE_MISSION_ASS_EDEFAULT;
		typeMissionASSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CRACTIVITE_ASS__TYPE_MISSION_ASS, oldTypeMissionASS, TYPE_MISSION_ASS_EDEFAULT, oldTypeMissionASSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMissionASS() {
		return typeMissionASSESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRACTIVITE_ASS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRACTIVITE_ASS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getRealiseeAuProfitUnite() {
		return realiseeAuProfitUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRealiseeAuProfitUnite(TypeAssociationEXT newRealiseeAuProfitUnite, NotificationChain msgs) {
		TypeAssociationEXT oldRealiseeAuProfitUnite = realiseeAuProfitUnite;
		realiseeAuProfitUnite = newRealiseeAuProfitUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE, oldRealiseeAuProfitUnite, newRealiseeAuProfitUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealiseeAuProfitUnite(TypeAssociationEXT newRealiseeAuProfitUnite) {
		if (newRealiseeAuProfitUnite != realiseeAuProfitUnite) {
			NotificationChain msgs = null;
			if (realiseeAuProfitUnite != null)
				msgs = ((InternalEObject)realiseeAuProfitUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE, null, msgs);
			if (newRealiseeAuProfitUnite != null)
				msgs = ((InternalEObject)newRealiseeAuProfitUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE, null, msgs);
			msgs = basicSetRealiseeAuProfitUnite(newRealiseeAuProfitUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE, newRealiseeAuProfitUnite, newRealiseeAuProfitUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE:
				return basicSetRealiseeAuProfitUnite(null, msgs);
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
			case SchemaPackage.TYPE_CRACTIVITE_ASS__TYPE_MISSION_ASS:
				return getTypeMissionASS();
			case SchemaPackage.TYPE_CRACTIVITE_ASS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CRACTIVITE_ASS__CE:
				return getCE();
			case SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE:
				return getRealiseeAuProfitUnite();
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
			case SchemaPackage.TYPE_CRACTIVITE_ASS__TYPE_MISSION_ASS:
				setTypeMissionASS((TypeDictionaryDicoTypeMissionASS)newValue);
				return;
			case SchemaPackage.TYPE_CRACTIVITE_ASS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CRACTIVITE_ASS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE:
				setRealiseeAuProfitUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_CRACTIVITE_ASS__TYPE_MISSION_ASS:
				unsetTypeMissionASS();
				return;
			case SchemaPackage.TYPE_CRACTIVITE_ASS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRACTIVITE_ASS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE:
				setRealiseeAuProfitUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_CRACTIVITE_ASS__TYPE_MISSION_ASS:
				return isSetTypeMissionASS();
			case SchemaPackage.TYPE_CRACTIVITE_ASS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CRACTIVITE_ASS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CRACTIVITE_ASS__REALISEE_AU_PROFIT_UNITE:
				return realiseeAuProfitUnite != null;
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
		result.append(" (typeMissionASS: ");
		if (typeMissionASSESet) result.append(typeMissionASS); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCRactiviteASSImpl
