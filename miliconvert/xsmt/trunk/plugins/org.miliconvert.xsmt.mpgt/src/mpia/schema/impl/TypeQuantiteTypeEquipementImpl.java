/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeQuantiteTypeEquipement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Quantite Type Equipement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeEquipementImpl#getQuantiteMin <em>Quantite Min</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeEquipementImpl#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeEquipementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeEquipementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeEquipementImpl#getConcerneTypeEquipement <em>Concerne Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeQuantiteTypeEquipementImpl extends EObjectImpl implements TypeQuantiteTypeEquipement {
	/**
	 * The default value of the '{@link #getQuantiteMin() <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMin()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMin() <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMin()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMin = QUANTITE_MIN_EDEFAULT;

	/**
	 * This is true if the Quantite Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMinESet;

	/**
	 * The default value of the '{@link #getQuantiteMax() <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMax()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MAX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMax() <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMax()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMax = QUANTITE_MAX_EDEFAULT;

	/**
	 * This is true if the Quantite Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMaxESet;

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
	 * The cached value of the '{@link #getConcerneTypeEquipement() <em>Concerne Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeEquipement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeQuantiteTypeEquipementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeQuantiteTypeEquipement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMin() {
		return quantiteMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMin(long newQuantiteMin) {
		long oldQuantiteMin = quantiteMin;
		quantiteMin = newQuantiteMin;
		boolean oldQuantiteMinESet = quantiteMinESet;
		quantiteMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MIN, oldQuantiteMin, quantiteMin, !oldQuantiteMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMin() {
		long oldQuantiteMin = quantiteMin;
		boolean oldQuantiteMinESet = quantiteMinESet;
		quantiteMin = QUANTITE_MIN_EDEFAULT;
		quantiteMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MIN, oldQuantiteMin, QUANTITE_MIN_EDEFAULT, oldQuantiteMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMin() {
		return quantiteMinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMax() {
		return quantiteMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMax(long newQuantiteMax) {
		long oldQuantiteMax = quantiteMax;
		quantiteMax = newQuantiteMax;
		boolean oldQuantiteMaxESet = quantiteMaxESet;
		quantiteMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MAX, oldQuantiteMax, quantiteMax, !oldQuantiteMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMax() {
		long oldQuantiteMax = quantiteMax;
		boolean oldQuantiteMaxESet = quantiteMaxESet;
		quantiteMax = QUANTITE_MAX_EDEFAULT;
		quantiteMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MAX, oldQuantiteMax, QUANTITE_MAX_EDEFAULT, oldQuantiteMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMax() {
		return quantiteMaxESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeEquipement() {
		return concerneTypeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeEquipement(TypeAssociationEXT newConcerneTypeEquipement, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeEquipement = concerneTypeEquipement;
		concerneTypeEquipement = newConcerneTypeEquipement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT, oldConcerneTypeEquipement, newConcerneTypeEquipement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeEquipement(TypeAssociationEXT newConcerneTypeEquipement) {
		if (newConcerneTypeEquipement != concerneTypeEquipement) {
			NotificationChain msgs = null;
			if (concerneTypeEquipement != null)
				msgs = ((InternalEObject)concerneTypeEquipement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT, null, msgs);
			if (newConcerneTypeEquipement != null)
				msgs = ((InternalEObject)newConcerneTypeEquipement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT, null, msgs);
			msgs = basicSetConcerneTypeEquipement(newConcerneTypeEquipement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT, newConcerneTypeEquipement, newConcerneTypeEquipement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT:
				return basicSetConcerneTypeEquipement(null, msgs);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MIN:
				return new Long(getQuantiteMin());
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MAX:
				return new Long(getQuantiteMax());
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT:
				return getConcerneTypeEquipement();
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MIN:
				setQuantiteMin(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MAX:
				setQuantiteMax(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT:
				setConcerneTypeEquipement((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MIN:
				unsetQuantiteMin();
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MAX:
				unsetQuantiteMax();
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT:
				setConcerneTypeEquipement((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MIN:
				return isSetQuantiteMin();
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__QUANTITE_MAX:
				return isSetQuantiteMax();
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_QUANTITE_TYPE_EQUIPEMENT__CONCERNE_TYPE_EQUIPEMENT:
				return concerneTypeEquipement != null;
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
		result.append(" (quantiteMin: ");
		if (quantiteMinESet) result.append(quantiteMin); else result.append("<unset>");
		result.append(", quantiteMax: ");
		if (quantiteMaxESet) result.append(quantiteMax); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeQuantiteTypeEquipementImpl
