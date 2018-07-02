/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLigneRechange;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ligne Rechange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLigneRechangeImpl#getCodeNNORechange <em>Code NNO Rechange</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneRechangeImpl#getQuantiteDemandee <em>Quantite Demandee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneRechangeImpl#getQuantiteAllouee <em>Quantite Allouee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneRechangeImpl#getIntituleRechange <em>Intitule Rechange</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneRechangeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLigneRechangeImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLigneRechangeImpl extends EObjectImpl implements TypeLigneRechange {
	/**
	 * The default value of the '{@link #getCodeNNORechange() <em>Code NNO Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeNNORechange()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_NNO_RECHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeNNORechange() <em>Code NNO Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeNNORechange()
	 * @generated
	 * @ordered
	 */
	protected String codeNNORechange = CODE_NNO_RECHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantiteDemandee() <em>Quantite Demandee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDemandee()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_DEMANDEE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteDemandee() <em>Quantite Demandee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDemandee()
	 * @generated
	 * @ordered
	 */
	protected long quantiteDemandee = QUANTITE_DEMANDEE_EDEFAULT;

	/**
	 * This is true if the Quantite Demandee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteDemandeeESet;

	/**
	 * The default value of the '{@link #getQuantiteAllouee() <em>Quantite Allouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteAllouee()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_ALLOUEE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteAllouee() <em>Quantite Allouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteAllouee()
	 * @generated
	 * @ordered
	 */
	protected long quantiteAllouee = QUANTITE_ALLOUEE_EDEFAULT;

	/**
	 * This is true if the Quantite Allouee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteAlloueeESet;

	/**
	 * The default value of the '{@link #getIntituleRechange() <em>Intitule Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleRechange()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_RECHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntituleRechange() <em>Intitule Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleRechange()
	 * @generated
	 * @ordered
	 */
	protected String intituleRechange = INTITULE_RECHANGE_EDEFAULT;

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
	protected TypeLigneRechangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLigneRechange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeNNORechange() {
		return codeNNORechange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeNNORechange(String newCodeNNORechange) {
		String oldCodeNNORechange = codeNNORechange;
		codeNNORechange = newCodeNNORechange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_RECHANGE__CODE_NNO_RECHANGE, oldCodeNNORechange, codeNNORechange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteDemandee() {
		return quantiteDemandee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteDemandee(long newQuantiteDemandee) {
		long oldQuantiteDemandee = quantiteDemandee;
		quantiteDemandee = newQuantiteDemandee;
		boolean oldQuantiteDemandeeESet = quantiteDemandeeESet;
		quantiteDemandeeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_DEMANDEE, oldQuantiteDemandee, quantiteDemandee, !oldQuantiteDemandeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteDemandee() {
		long oldQuantiteDemandee = quantiteDemandee;
		boolean oldQuantiteDemandeeESet = quantiteDemandeeESet;
		quantiteDemandee = QUANTITE_DEMANDEE_EDEFAULT;
		quantiteDemandeeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_DEMANDEE, oldQuantiteDemandee, QUANTITE_DEMANDEE_EDEFAULT, oldQuantiteDemandeeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteDemandee() {
		return quantiteDemandeeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteAllouee() {
		return quantiteAllouee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteAllouee(long newQuantiteAllouee) {
		long oldQuantiteAllouee = quantiteAllouee;
		quantiteAllouee = newQuantiteAllouee;
		boolean oldQuantiteAlloueeESet = quantiteAlloueeESet;
		quantiteAlloueeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_ALLOUEE, oldQuantiteAllouee, quantiteAllouee, !oldQuantiteAlloueeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteAllouee() {
		long oldQuantiteAllouee = quantiteAllouee;
		boolean oldQuantiteAlloueeESet = quantiteAlloueeESet;
		quantiteAllouee = QUANTITE_ALLOUEE_EDEFAULT;
		quantiteAlloueeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_ALLOUEE, oldQuantiteAllouee, QUANTITE_ALLOUEE_EDEFAULT, oldQuantiteAlloueeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteAllouee() {
		return quantiteAlloueeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntituleRechange() {
		return intituleRechange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntituleRechange(String newIntituleRechange) {
		String oldIntituleRechange = intituleRechange;
		intituleRechange = newIntituleRechange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_RECHANGE__INTITULE_RECHANGE, oldIntituleRechange, intituleRechange));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_RECHANGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIGNE_RECHANGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CODE_NNO_RECHANGE:
				return getCodeNNORechange();
			case SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_DEMANDEE:
				return new Long(getQuantiteDemandee());
			case SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_ALLOUEE:
				return new Long(getQuantiteAllouee());
			case SchemaPackage.TYPE_LIGNE_RECHANGE__INTITULE_RECHANGE:
				return getIntituleRechange();
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CE:
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
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CODE_NNO_RECHANGE:
				setCodeNNORechange((String)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_DEMANDEE:
				setQuantiteDemandee(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_ALLOUEE:
				setQuantiteAllouee(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__INTITULE_RECHANGE:
				setIntituleRechange((String)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CE:
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
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CODE_NNO_RECHANGE:
				setCodeNNORechange(CODE_NNO_RECHANGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_DEMANDEE:
				unsetQuantiteDemandee();
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_ALLOUEE:
				unsetQuantiteAllouee();
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__INTITULE_RECHANGE:
				setIntituleRechange(INTITULE_RECHANGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CE:
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
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CODE_NNO_RECHANGE:
				return CODE_NNO_RECHANGE_EDEFAULT == null ? codeNNORechange != null : !CODE_NNO_RECHANGE_EDEFAULT.equals(codeNNORechange);
			case SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_DEMANDEE:
				return isSetQuantiteDemandee();
			case SchemaPackage.TYPE_LIGNE_RECHANGE__QUANTITE_ALLOUEE:
				return isSetQuantiteAllouee();
			case SchemaPackage.TYPE_LIGNE_RECHANGE__INTITULE_RECHANGE:
				return INTITULE_RECHANGE_EDEFAULT == null ? intituleRechange != null : !INTITULE_RECHANGE_EDEFAULT.equals(intituleRechange);
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_LIGNE_RECHANGE__CE:
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
		result.append(" (codeNNORechange: ");
		result.append(codeNNORechange);
		result.append(", quantiteDemandee: ");
		if (quantiteDemandeeESet) result.append(quantiteDemandee); else result.append("<unset>");
		result.append(", quantiteAllouee: ");
		if (quantiteAlloueeESet) result.append(quantiteAllouee); else result.append("<unset>");
		result.append(", intituleRechange: ");
		result.append(intituleRechange);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeLigneRechangeImpl
