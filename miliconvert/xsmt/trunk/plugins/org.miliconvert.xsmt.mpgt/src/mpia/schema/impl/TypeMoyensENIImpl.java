/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMoyensENI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Moyens ENI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIImpl#getNombreAeronefs <em>Nombre Aeronefs</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensENIImpl#getACommeTypeAeronefMisEnOeuvreTypeAeronef <em>AComme Type Aeronef Mis En Oeuvre Type Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyensENIImpl extends EObjectImpl implements TypeMoyensENI {
	/**
	 * The default value of the '{@link #getNombreAeronefs() <em>Nombre Aeronefs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAeronefs()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_AERONEFS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreAeronefs() <em>Nombre Aeronefs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreAeronefs()
	 * @generated
	 * @ordered
	 */
	protected long nombreAeronefs = NOMBRE_AERONEFS_EDEFAULT;

	/**
	 * This is true if the Nombre Aeronefs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreAeronefsESet;

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
	 * The cached value of the '{@link #getACommeTypeAeronefMisEnOeuvreTypeAeronef() <em>AComme Type Aeronef Mis En Oeuvre Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeAeronefMisEnOeuvreTypeAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeTypeAeronefMisEnOeuvreTypeAeronef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyensENIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyensENI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreAeronefs() {
		return nombreAeronefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreAeronefs(long newNombreAeronefs) {
		long oldNombreAeronefs = nombreAeronefs;
		nombreAeronefs = newNombreAeronefs;
		boolean oldNombreAeronefsESet = nombreAeronefsESet;
		nombreAeronefsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_ENI__NOMBRE_AERONEFS, oldNombreAeronefs, nombreAeronefs, !oldNombreAeronefsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreAeronefs() {
		long oldNombreAeronefs = nombreAeronefs;
		boolean oldNombreAeronefsESet = nombreAeronefsESet;
		nombreAeronefs = NOMBRE_AERONEFS_EDEFAULT;
		nombreAeronefsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_ENI__NOMBRE_AERONEFS, oldNombreAeronefs, NOMBRE_AERONEFS_EDEFAULT, oldNombreAeronefsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreAeronefs() {
		return nombreAeronefsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_ENI__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_ENI__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeTypeAeronefMisEnOeuvreTypeAeronef() {
		return aCommeTypeAeronefMisEnOeuvreTypeAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeTypeAeronefMisEnOeuvreTypeAeronef(TypeAssociationEXT newACommeTypeAeronefMisEnOeuvreTypeAeronef, NotificationChain msgs) {
		TypeAssociationEXT oldACommeTypeAeronefMisEnOeuvreTypeAeronef = aCommeTypeAeronefMisEnOeuvreTypeAeronef;
		aCommeTypeAeronefMisEnOeuvreTypeAeronef = newACommeTypeAeronefMisEnOeuvreTypeAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF, oldACommeTypeAeronefMisEnOeuvreTypeAeronef, newACommeTypeAeronefMisEnOeuvreTypeAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeTypeAeronefMisEnOeuvreTypeAeronef(TypeAssociationEXT newACommeTypeAeronefMisEnOeuvreTypeAeronef) {
		if (newACommeTypeAeronefMisEnOeuvreTypeAeronef != aCommeTypeAeronefMisEnOeuvreTypeAeronef) {
			NotificationChain msgs = null;
			if (aCommeTypeAeronefMisEnOeuvreTypeAeronef != null)
				msgs = ((InternalEObject)aCommeTypeAeronefMisEnOeuvreTypeAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF, null, msgs);
			if (newACommeTypeAeronefMisEnOeuvreTypeAeronef != null)
				msgs = ((InternalEObject)newACommeTypeAeronefMisEnOeuvreTypeAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF, null, msgs);
			msgs = basicSetACommeTypeAeronefMisEnOeuvreTypeAeronef(newACommeTypeAeronefMisEnOeuvreTypeAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF, newACommeTypeAeronefMisEnOeuvreTypeAeronef, newACommeTypeAeronefMisEnOeuvreTypeAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF:
				return basicSetACommeTypeAeronefMisEnOeuvreTypeAeronef(null, msgs);
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
			case SchemaPackage.TYPE_MOYENS_ENI__NOMBRE_AERONEFS:
				return new Long(getNombreAeronefs());
			case SchemaPackage.TYPE_MOYENS_ENI__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYENS_ENI__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF:
				return getACommeTypeAeronefMisEnOeuvreTypeAeronef();
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
			case SchemaPackage.TYPE_MOYENS_ENI__NOMBRE_AERONEFS:
				setNombreAeronefs(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_ENI__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_ENI__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF:
				setACommeTypeAeronefMisEnOeuvreTypeAeronef((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_MOYENS_ENI__NOMBRE_AERONEFS:
				unsetNombreAeronefs();
				return;
			case SchemaPackage.TYPE_MOYENS_ENI__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_ENI__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF:
				setACommeTypeAeronefMisEnOeuvreTypeAeronef((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_MOYENS_ENI__NOMBRE_AERONEFS:
				return isSetNombreAeronefs();
			case SchemaPackage.TYPE_MOYENS_ENI__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYENS_ENI__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYENS_ENI__ACOMME_TYPE_AERONEF_MIS_EN_OEUVRE_TYPE_AERONEF:
				return aCommeTypeAeronefMisEnOeuvreTypeAeronef != null;
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
		result.append(" (nombreAeronefs: ");
		if (nombreAeronefsESet) result.append(nombreAeronefs); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyensENIImpl
