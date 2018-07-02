/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsommationExplosifs;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Consommation Explosifs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsommationExplosifsImpl#getPourcentage <em>Pourcentage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationExplosifsImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationExplosifsImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationExplosifsImpl#getACommeTypeExplosifsTypeMateriel <em>AComme Type Explosifs Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsommationExplosifsImpl extends EObjectImpl implements TypeConsommationExplosifs {
	/**
	 * The default value of the '{@link #getPourcentage() <em>Pourcentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentage()
	 * @generated
	 * @ordered
	 */
	protected static final long POURCENTAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPourcentage() <em>Pourcentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentage()
	 * @generated
	 * @ordered
	 */
	protected long pourcentage = POURCENTAGE_EDEFAULT;

	/**
	 * This is true if the Pourcentage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageESet;

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
	 * The cached value of the '{@link #getACommeTypeExplosifsTypeMateriel() <em>AComme Type Explosifs Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeExplosifsTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeTypeExplosifsTypeMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsommationExplosifsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsommationExplosifs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPourcentage() {
		return pourcentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentage(long newPourcentage) {
		long oldPourcentage = pourcentage;
		pourcentage = newPourcentage;
		boolean oldPourcentageESet = pourcentageESet;
		pourcentageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__POURCENTAGE, oldPourcentage, pourcentage, !oldPourcentageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentage() {
		long oldPourcentage = pourcentage;
		boolean oldPourcentageESet = pourcentageESet;
		pourcentage = POURCENTAGE_EDEFAULT;
		pourcentageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__POURCENTAGE, oldPourcentage, POURCENTAGE_EDEFAULT, oldPourcentageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentage() {
		return pourcentageESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeTypeExplosifsTypeMateriel() {
		return aCommeTypeExplosifsTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeTypeExplosifsTypeMateriel(TypeAssociationEXT newACommeTypeExplosifsTypeMateriel, NotificationChain msgs) {
		TypeAssociationEXT oldACommeTypeExplosifsTypeMateriel = aCommeTypeExplosifsTypeMateriel;
		aCommeTypeExplosifsTypeMateriel = newACommeTypeExplosifsTypeMateriel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL, oldACommeTypeExplosifsTypeMateriel, newACommeTypeExplosifsTypeMateriel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeTypeExplosifsTypeMateriel(TypeAssociationEXT newACommeTypeExplosifsTypeMateriel) {
		if (newACommeTypeExplosifsTypeMateriel != aCommeTypeExplosifsTypeMateriel) {
			NotificationChain msgs = null;
			if (aCommeTypeExplosifsTypeMateriel != null)
				msgs = ((InternalEObject)aCommeTypeExplosifsTypeMateriel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL, null, msgs);
			if (newACommeTypeExplosifsTypeMateriel != null)
				msgs = ((InternalEObject)newACommeTypeExplosifsTypeMateriel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL, null, msgs);
			msgs = basicSetACommeTypeExplosifsTypeMateriel(newACommeTypeExplosifsTypeMateriel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL, newACommeTypeExplosifsTypeMateriel, newACommeTypeExplosifsTypeMateriel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL:
				return basicSetACommeTypeExplosifsTypeMateriel(null, msgs);
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
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__POURCENTAGE:
				return new Long(getPourcentage());
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CE:
				return getCE();
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL:
				return getACommeTypeExplosifsTypeMateriel();
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
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__POURCENTAGE:
				setPourcentage(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL:
				setACommeTypeExplosifsTypeMateriel((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__POURCENTAGE:
				unsetPourcentage();
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL:
				setACommeTypeExplosifsTypeMateriel((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__POURCENTAGE:
				return isSetPourcentage();
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CONSOMMATION_EXPLOSIFS__ACOMME_TYPE_EXPLOSIFS_TYPE_MATERIEL:
				return aCommeTypeExplosifsTypeMateriel != null;
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
		result.append(" (pourcentage: ");
		if (pourcentageESet) result.append(pourcentage); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeConsommationExplosifsImpl
