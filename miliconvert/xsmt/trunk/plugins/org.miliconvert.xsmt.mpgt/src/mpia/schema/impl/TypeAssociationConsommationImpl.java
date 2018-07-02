/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationConsommation;
import mpia.schema.TypeDictionaryDicoConditionnementUnite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Consommation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommationImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommationImpl#getUniteMesure <em>Unite Mesure</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommationImpl#getAssocieCommeObjetTypeConsommable <em>Associe Comme Objet Type Consommable</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommationImpl#getAssocieCommeSujetTypeEquipement <em>Associe Comme Sujet Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationConsommationImpl extends EObjectImpl implements TypeAssociationConsommation {
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
	 * The default value of the '{@link #getUniteMesure() <em>Unite Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesure()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConditionnementUnite UNITE_MESURE_EDEFAULT = TypeDictionaryDicoConditionnementUnite.CM;

	/**
	 * The cached value of the '{@link #getUniteMesure() <em>Unite Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesure()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConditionnementUnite uniteMesure = UNITE_MESURE_EDEFAULT;

	/**
	 * This is true if the Unite Mesure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteMesureESet;

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
	 * The cached value of the '{@link #getAssocieCommeObjetTypeConsommable() <em>Associe Comme Objet Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeObjetTypeConsommable()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeObjetTypeConsommable;

	/**
	 * The cached value of the '{@link #getAssocieCommeSujetTypeEquipement() <em>Associe Comme Sujet Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeSujetTypeEquipement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeSujetTypeEquipement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationConsommationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationConsommation();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
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
	public TypeDictionaryDicoConditionnementUnite getUniteMesure() {
		return uniteMesure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniteMesure(TypeDictionaryDicoConditionnementUnite newUniteMesure) {
		TypeDictionaryDicoConditionnementUnite oldUniteMesure = uniteMesure;
		uniteMesure = newUniteMesure == null ? UNITE_MESURE_EDEFAULT : newUniteMesure;
		boolean oldUniteMesureESet = uniteMesureESet;
		uniteMesureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__UNITE_MESURE, oldUniteMesure, uniteMesure, !oldUniteMesureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniteMesure() {
		TypeDictionaryDicoConditionnementUnite oldUniteMesure = uniteMesure;
		boolean oldUniteMesureESet = uniteMesureESet;
		uniteMesure = UNITE_MESURE_EDEFAULT;
		uniteMesureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__UNITE_MESURE, oldUniteMesure, UNITE_MESURE_EDEFAULT, oldUniteMesureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniteMesure() {
		return uniteMesureESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeObjetTypeConsommable() {
		return associeCommeObjetTypeConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeObjetTypeConsommable(TypeAssociationEXT newAssocieCommeObjetTypeConsommable, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeObjetTypeConsommable = associeCommeObjetTypeConsommable;
		associeCommeObjetTypeConsommable = newAssocieCommeObjetTypeConsommable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE, oldAssocieCommeObjetTypeConsommable, newAssocieCommeObjetTypeConsommable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeObjetTypeConsommable(TypeAssociationEXT newAssocieCommeObjetTypeConsommable) {
		if (newAssocieCommeObjetTypeConsommable != associeCommeObjetTypeConsommable) {
			NotificationChain msgs = null;
			if (associeCommeObjetTypeConsommable != null)
				msgs = ((InternalEObject)associeCommeObjetTypeConsommable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE, null, msgs);
			if (newAssocieCommeObjetTypeConsommable != null)
				msgs = ((InternalEObject)newAssocieCommeObjetTypeConsommable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE, null, msgs);
			msgs = basicSetAssocieCommeObjetTypeConsommable(newAssocieCommeObjetTypeConsommable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE, newAssocieCommeObjetTypeConsommable, newAssocieCommeObjetTypeConsommable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeSujetTypeEquipement() {
		return associeCommeSujetTypeEquipement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeSujetTypeEquipement(TypeAssociation newAssocieCommeSujetTypeEquipement, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeSujetTypeEquipement = associeCommeSujetTypeEquipement;
		associeCommeSujetTypeEquipement = newAssocieCommeSujetTypeEquipement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT, oldAssocieCommeSujetTypeEquipement, newAssocieCommeSujetTypeEquipement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeSujetTypeEquipement(TypeAssociation newAssocieCommeSujetTypeEquipement) {
		if (newAssocieCommeSujetTypeEquipement != associeCommeSujetTypeEquipement) {
			NotificationChain msgs = null;
			if (associeCommeSujetTypeEquipement != null)
				msgs = ((InternalEObject)associeCommeSujetTypeEquipement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT, null, msgs);
			if (newAssocieCommeSujetTypeEquipement != null)
				msgs = ((InternalEObject)newAssocieCommeSujetTypeEquipement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT, null, msgs);
			msgs = basicSetAssocieCommeSujetTypeEquipement(newAssocieCommeSujetTypeEquipement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT, newAssocieCommeSujetTypeEquipement, newAssocieCommeSujetTypeEquipement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE:
				return basicSetAssocieCommeObjetTypeConsommable(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT:
				return basicSetAssocieCommeSujetTypeEquipement(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__QUANTITE:
				return new Double(getQuantite());
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__UNITE_MESURE:
				return getUniteMesure();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE:
				return getAssocieCommeObjetTypeConsommable();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT:
				return getAssocieCommeSujetTypeEquipement();
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
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__QUANTITE:
				setQuantite(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__UNITE_MESURE:
				setUniteMesure((TypeDictionaryDicoConditionnementUnite)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE:
				setAssocieCommeObjetTypeConsommable((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT:
				setAssocieCommeSujetTypeEquipement((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__UNITE_MESURE:
				unsetUniteMesure();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE:
				setAssocieCommeObjetTypeConsommable((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT:
				setAssocieCommeSujetTypeEquipement((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__UNITE_MESURE:
				return isSetUniteMesure();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_OBJET_TYPE_CONSOMMABLE:
				return associeCommeObjetTypeConsommable != null;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMATION__ASSOCIE_COMME_SUJET_TYPE_EQUIPEMENT:
				return associeCommeSujetTypeEquipement != null;
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
		result.append(", uniteMesure: ");
		if (uniteMesureESet) result.append(uniteMesure); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationConsommationImpl
