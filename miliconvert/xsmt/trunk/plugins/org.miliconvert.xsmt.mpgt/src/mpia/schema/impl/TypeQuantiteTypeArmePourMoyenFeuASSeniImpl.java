/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeQuantiteTypeArmePourMoyenFeuASSeni;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Quantite Type Arme Pour Moyen Feu AS Seni</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeArmePourMoyenFeuASSeniImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeArmePourMoyenFeuASSeniImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeArmePourMoyenFeuASSeniImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeQuantiteTypeArmePourMoyenFeuASSeniImpl#getConcerneTypeArme <em>Concerne Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeQuantiteTypeArmePourMoyenFeuASSeniImpl extends EObjectImpl implements TypeQuantiteTypeArmePourMoyenFeuASSeni {
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
	 * The cached value of the '{@link #getConcerneTypeArme() <em>Concerne Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT concerneTypeArme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeQuantiteTypeArmePourMoyenFeuASSeniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeQuantiteTypeArmePourMoyenFeuASSeni();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getConcerneTypeArme() {
		return concerneTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeArme(TypeAssociationEXT newConcerneTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldConcerneTypeArme = concerneTypeArme;
		concerneTypeArme = newConcerneTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME, oldConcerneTypeArme, newConcerneTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeArme(TypeAssociationEXT newConcerneTypeArme) {
		if (newConcerneTypeArme != concerneTypeArme) {
			NotificationChain msgs = null;
			if (concerneTypeArme != null)
				msgs = ((InternalEObject)concerneTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME, null, msgs);
			if (newConcerneTypeArme != null)
				msgs = ((InternalEObject)newConcerneTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME, null, msgs);
			msgs = basicSetConcerneTypeArme(newConcerneTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME, newConcerneTypeArme, newConcerneTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME:
				return basicSetConcerneTypeArme(null, msgs);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CTE:
				return getCTE();
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CE:
				return getCE();
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME:
				return getConcerneTypeArme();
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME:
				setConcerneTypeArme((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME:
				setConcerneTypeArme((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_QUANTITE_TYPE_ARME_POUR_MOYEN_FEU_AS_SENI__CONCERNE_TYPE_ARME:
				return concerneTypeArme != null;
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

} //TypeQuantiteTypeArmePourMoyenFeuASSeniImpl
