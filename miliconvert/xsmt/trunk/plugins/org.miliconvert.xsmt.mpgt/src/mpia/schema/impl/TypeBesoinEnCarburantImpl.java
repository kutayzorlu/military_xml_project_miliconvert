/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBesoinEnCarburant;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Besoin En Carburant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBesoinEnCarburantImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinEnCarburantImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinEnCarburantImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinEnCarburantImpl#getAPourTypeEssenceTypeConsommable <em>APour Type Essence Type Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinEnCarburantImpl#getAPourLocalisationLocalisation <em>APour Localisation Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBesoinEnCarburantImpl extends EObjectImpl implements TypeBesoinEnCarburant {
	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected long quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

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
	 * The cached value of the '{@link #getAPourTypeEssenceTypeConsommable() <em>APour Type Essence Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeEssenceTypeConsommable()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourTypeEssenceTypeConsommable;

	/**
	 * The cached value of the '{@link #getAPourLocalisationLocalisation() <em>APour Localisation Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation aPourLocalisationLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBesoinEnCarburantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBesoinEnCarburant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(long newQuantite) {
		long oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_EN_CARBURANT__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		long oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BESOIN_EN_CARBURANT__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantite() {
		return quantiteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourTypeEssenceTypeConsommable() {
		return aPourTypeEssenceTypeConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTypeEssenceTypeConsommable(TypeAssociationEXT newAPourTypeEssenceTypeConsommable, NotificationChain msgs) {
		TypeAssociationEXT oldAPourTypeEssenceTypeConsommable = aPourTypeEssenceTypeConsommable;
		aPourTypeEssenceTypeConsommable = newAPourTypeEssenceTypeConsommable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE, oldAPourTypeEssenceTypeConsommable, newAPourTypeEssenceTypeConsommable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTypeEssenceTypeConsommable(TypeAssociationEXT newAPourTypeEssenceTypeConsommable) {
		if (newAPourTypeEssenceTypeConsommable != aPourTypeEssenceTypeConsommable) {
			NotificationChain msgs = null;
			if (aPourTypeEssenceTypeConsommable != null)
				msgs = ((InternalEObject)aPourTypeEssenceTypeConsommable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE, null, msgs);
			if (newAPourTypeEssenceTypeConsommable != null)
				msgs = ((InternalEObject)newAPourTypeEssenceTypeConsommable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE, null, msgs);
			msgs = basicSetAPourTypeEssenceTypeConsommable(newAPourTypeEssenceTypeConsommable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE, newAPourTypeEssenceTypeConsommable, newAPourTypeEssenceTypeConsommable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getAPourLocalisationLocalisation() {
		return aPourLocalisationLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationLocalisation(TypeLocalisation newAPourLocalisationLocalisation, NotificationChain msgs) {
		TypeLocalisation oldAPourLocalisationLocalisation = aPourLocalisationLocalisation;
		aPourLocalisationLocalisation = newAPourLocalisationLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION, oldAPourLocalisationLocalisation, newAPourLocalisationLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationLocalisation(TypeLocalisation newAPourLocalisationLocalisation) {
		if (newAPourLocalisationLocalisation != aPourLocalisationLocalisation) {
			NotificationChain msgs = null;
			if (aPourLocalisationLocalisation != null)
				msgs = ((InternalEObject)aPourLocalisationLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION, null, msgs);
			if (newAPourLocalisationLocalisation != null)
				msgs = ((InternalEObject)newAPourLocalisationLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION, null, msgs);
			msgs = basicSetAPourLocalisationLocalisation(newAPourLocalisationLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION, newAPourLocalisationLocalisation, newAPourLocalisationLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE:
				return basicSetAPourTypeEssenceTypeConsommable(null, msgs);
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION:
				return basicSetAPourLocalisationLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CE:
				return getCE();
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE:
				return getAPourTypeEssenceTypeConsommable();
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION:
				return getAPourLocalisationLocalisation();
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
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE:
				setAPourTypeEssenceTypeConsommable((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION:
				setAPourLocalisationLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE:
				setAPourTypeEssenceTypeConsommable((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION:
				setAPourLocalisationLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_TYPE_ESSENCE_TYPE_CONSOMMABLE:
				return aPourTypeEssenceTypeConsommable != null;
			case SchemaPackage.TYPE_BESOIN_EN_CARBURANT__APOUR_LOCALISATION_LOCALISATION:
				return aPourLocalisationLocalisation != null;
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
		result.append(" (quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeBesoinEnCarburantImpl
