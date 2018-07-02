/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeQuantiteMaintenir;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Quantite Maintenir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaintenirImpl#getQuantiteAMaintenir <em>Quantite AMaintenir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaintenirImpl#getQuantiteStockAMaintenir <em>Quantite Stock AMaintenir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaintenirImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaintenirImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteMaintenirImpl#getAmaintenirParUnite <em>Amaintenir Par Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeQuantiteMaintenirImpl extends EObjectImpl implements TypeQuantiteMaintenir {
	/**
	 * The default value of the '{@link #getQuantiteAMaintenir() <em>Quantite AMaintenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteAMaintenir()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_AMAINTENIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteAMaintenir() <em>Quantite AMaintenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteAMaintenir()
	 * @generated
	 * @ordered
	 */
	protected long quantiteAMaintenir = QUANTITE_AMAINTENIR_EDEFAULT;

	/**
	 * This is true if the Quantite AMaintenir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteAMaintenirESet;

	/**
	 * The default value of the '{@link #getQuantiteStockAMaintenir() <em>Quantite Stock AMaintenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteStockAMaintenir()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_STOCK_AMAINTENIR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteStockAMaintenir() <em>Quantite Stock AMaintenir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteStockAMaintenir()
	 * @generated
	 * @ordered
	 */
	protected long quantiteStockAMaintenir = QUANTITE_STOCK_AMAINTENIR_EDEFAULT;

	/**
	 * This is true if the Quantite Stock AMaintenir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteStockAMaintenirESet;

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
	 * The cached value of the '{@link #getAmaintenirParUnite() <em>Amaintenir Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmaintenirParUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT amaintenirParUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeQuantiteMaintenirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeQuantiteMaintenir();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteAMaintenir() {
		return quantiteAMaintenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteAMaintenir(long newQuantiteAMaintenir) {
		long oldQuantiteAMaintenir = quantiteAMaintenir;
		quantiteAMaintenir = newQuantiteAMaintenir;
		boolean oldQuantiteAMaintenirESet = quantiteAMaintenirESet;
		quantiteAMaintenirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_AMAINTENIR, oldQuantiteAMaintenir, quantiteAMaintenir, !oldQuantiteAMaintenirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteAMaintenir() {
		long oldQuantiteAMaintenir = quantiteAMaintenir;
		boolean oldQuantiteAMaintenirESet = quantiteAMaintenirESet;
		quantiteAMaintenir = QUANTITE_AMAINTENIR_EDEFAULT;
		quantiteAMaintenirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_AMAINTENIR, oldQuantiteAMaintenir, QUANTITE_AMAINTENIR_EDEFAULT, oldQuantiteAMaintenirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteAMaintenir() {
		return quantiteAMaintenirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteStockAMaintenir() {
		return quantiteStockAMaintenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteStockAMaintenir(long newQuantiteStockAMaintenir) {
		long oldQuantiteStockAMaintenir = quantiteStockAMaintenir;
		quantiteStockAMaintenir = newQuantiteStockAMaintenir;
		boolean oldQuantiteStockAMaintenirESet = quantiteStockAMaintenirESet;
		quantiteStockAMaintenirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_STOCK_AMAINTENIR, oldQuantiteStockAMaintenir, quantiteStockAMaintenir, !oldQuantiteStockAMaintenirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteStockAMaintenir() {
		long oldQuantiteStockAMaintenir = quantiteStockAMaintenir;
		boolean oldQuantiteStockAMaintenirESet = quantiteStockAMaintenirESet;
		quantiteStockAMaintenir = QUANTITE_STOCK_AMAINTENIR_EDEFAULT;
		quantiteStockAMaintenirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_STOCK_AMAINTENIR, oldQuantiteStockAMaintenir, QUANTITE_STOCK_AMAINTENIR_EDEFAULT, oldQuantiteStockAMaintenirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteStockAMaintenir() {
		return quantiteStockAMaintenirESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MAINTENIR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MAINTENIR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAmaintenirParUnite() {
		return amaintenirParUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmaintenirParUnite(TypeAssociationEXT newAmaintenirParUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAmaintenirParUnite = amaintenirParUnite;
		amaintenirParUnite = newAmaintenirParUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE, oldAmaintenirParUnite, newAmaintenirParUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmaintenirParUnite(TypeAssociationEXT newAmaintenirParUnite) {
		if (newAmaintenirParUnite != amaintenirParUnite) {
			NotificationChain msgs = null;
			if (amaintenirParUnite != null)
				msgs = ((InternalEObject)amaintenirParUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE, null, msgs);
			if (newAmaintenirParUnite != null)
				msgs = ((InternalEObject)newAmaintenirParUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE, null, msgs);
			msgs = basicSetAmaintenirParUnite(newAmaintenirParUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE, newAmaintenirParUnite, newAmaintenirParUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE:
				return basicSetAmaintenirParUnite(null, msgs);
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
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_AMAINTENIR:
				return new Long(getQuantiteAMaintenir());
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_STOCK_AMAINTENIR:
				return new Long(getQuantiteStockAMaintenir());
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__CE:
				return getCE();
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE:
				return getAmaintenirParUnite();
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
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_AMAINTENIR:
				setQuantiteAMaintenir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_STOCK_AMAINTENIR:
				setQuantiteStockAMaintenir(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE:
				setAmaintenirParUnite((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_AMAINTENIR:
				unsetQuantiteAMaintenir();
				return;
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_STOCK_AMAINTENIR:
				unsetQuantiteStockAMaintenir();
				return;
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE:
				setAmaintenirParUnite((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_AMAINTENIR:
				return isSetQuantiteAMaintenir();
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__QUANTITE_STOCK_AMAINTENIR:
				return isSetQuantiteStockAMaintenir();
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_QUANTITE_MAINTENIR__AMAINTENIR_PAR_UNITE:
				return amaintenirParUnite != null;
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
		result.append(" (quantiteAMaintenir: ");
		if (quantiteAMaintenirESet) result.append(quantiteAMaintenir); else result.append("<unset>");
		result.append(", quantiteStockAMaintenir: ");
		if (quantiteStockAMaintenirESet) result.append(quantiteStockAMaintenir); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeQuantiteMaintenirImpl
