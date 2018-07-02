/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationActiviteCapacite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Activite Capacite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteCapaciteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteCapaciteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteCapaciteImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteCapaciteImpl#getAssocieCommeActiviteActivite <em>Associe Comme Activite Activite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationActiviteCapaciteImpl#getAssocieCommeCapaciteCapacite <em>Associe Comme Capacite Capacite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationActiviteCapaciteImpl extends EObjectImpl implements TypeAssociationActiviteCapacite {
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
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected double quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeActiviteActivite() <em>Associe Comme Activite Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeActiviteActivite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeActiviteActivite;

	/**
	 * The cached value of the '{@link #getAssocieCommeCapaciteCapacite() <em>Associe Comme Capacite Capacite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeCapaciteCapacite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeCapaciteCapacite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationActiviteCapaciteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationActiviteCapacite();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(double newQuantite) {
		double oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		double oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
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
	public TypeAssociation getAssocieCommeActiviteActivite() {
		return associeCommeActiviteActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeActiviteActivite(TypeAssociation newAssocieCommeActiviteActivite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeActiviteActivite = associeCommeActiviteActivite;
		associeCommeActiviteActivite = newAssocieCommeActiviteActivite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE, oldAssocieCommeActiviteActivite, newAssocieCommeActiviteActivite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeActiviteActivite(TypeAssociation newAssocieCommeActiviteActivite) {
		if (newAssocieCommeActiviteActivite != associeCommeActiviteActivite) {
			NotificationChain msgs = null;
			if (associeCommeActiviteActivite != null)
				msgs = ((InternalEObject)associeCommeActiviteActivite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE, null, msgs);
			if (newAssocieCommeActiviteActivite != null)
				msgs = ((InternalEObject)newAssocieCommeActiviteActivite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE, null, msgs);
			msgs = basicSetAssocieCommeActiviteActivite(newAssocieCommeActiviteActivite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE, newAssocieCommeActiviteActivite, newAssocieCommeActiviteActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeCapaciteCapacite() {
		return associeCommeCapaciteCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeCapaciteCapacite(TypeAssociation newAssocieCommeCapaciteCapacite, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeCapaciteCapacite = associeCommeCapaciteCapacite;
		associeCommeCapaciteCapacite = newAssocieCommeCapaciteCapacite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE, oldAssocieCommeCapaciteCapacite, newAssocieCommeCapaciteCapacite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeCapaciteCapacite(TypeAssociation newAssocieCommeCapaciteCapacite) {
		if (newAssocieCommeCapaciteCapacite != associeCommeCapaciteCapacite) {
			NotificationChain msgs = null;
			if (associeCommeCapaciteCapacite != null)
				msgs = ((InternalEObject)associeCommeCapaciteCapacite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE, null, msgs);
			if (newAssocieCommeCapaciteCapacite != null)
				msgs = ((InternalEObject)newAssocieCommeCapaciteCapacite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE, null, msgs);
			msgs = basicSetAssocieCommeCapaciteCapacite(newAssocieCommeCapaciteCapacite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE, newAssocieCommeCapaciteCapacite, newAssocieCommeCapaciteCapacite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				return basicSetAssocieCommeActiviteActivite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE:
				return basicSetAssocieCommeCapaciteCapacite(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__QUANTITE:
				return new Double(getQuantite());
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				return getAssocieCommeActiviteActivite();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE:
				return getAssocieCommeCapaciteCapacite();
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__QUANTITE:
				setQuantite(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				setAssocieCommeActiviteActivite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE:
				setAssocieCommeCapaciteCapacite((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				setAssocieCommeActiviteActivite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE:
				setAssocieCommeCapaciteCapacite((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_ACTIVITE_ACTIVITE:
				return associeCommeActiviteActivite != null;
			case SchemaPackage.TYPE_ASSOCIATION_ACTIVITE_CAPACITE__ASSOCIE_COMME_CAPACITE_CAPACITE:
				return associeCommeCapaciteCapacite != null;
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
		result.append(" (cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationActiviteCapaciteImpl
