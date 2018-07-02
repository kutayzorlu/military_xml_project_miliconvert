/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoSiteProductionSousType;
import mpia.schema.TypeDictionaryDicoSiteProductionType;
import mpia.schema.TypeSiteProduction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Site Production</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSiteProductionImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteProductionImpl#getProductionJournaliere <em>Production Journaliere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteProductionImpl#getSousType <em>Sous Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSiteProductionImpl#getUniteMesure <em>Unite Mesure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSiteProductionImpl extends EObjectImpl implements TypeSiteProduction {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSiteProductionType TYPE_EDEFAULT = TypeDictionaryDicoSiteProductionType.AGR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSiteProductionType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getProductionJournaliere() <em>Production Journaliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionJournaliere()
	 * @generated
	 * @ordered
	 */
	protected static final double PRODUCTION_JOURNALIERE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProductionJournaliere() <em>Production Journaliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionJournaliere()
	 * @generated
	 * @ordered
	 */
	protected double productionJournaliere = PRODUCTION_JOURNALIERE_EDEFAULT;

	/**
	 * This is true if the Production Journaliere attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean productionJournaliereESet;

	/**
	 * The default value of the '{@link #getSousType() <em>Sous Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSiteProductionSousType SOUS_TYPE_EDEFAULT = TypeDictionaryDicoSiteProductionSousType.AERO;

	/**
	 * The cached value of the '{@link #getSousType() <em>Sous Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSiteProductionSousType sousType = SOUS_TYPE_EDEFAULT;

	/**
	 * This is true if the Sous Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousTypeESet;

	/**
	 * The default value of the '{@link #getUniteMesure() <em>Unite Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesure()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITE_MESURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniteMesure() <em>Unite Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniteMesure()
	 * @generated
	 * @ordered
	 */
	protected String uniteMesure = UNITE_MESURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSiteProductionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSiteProduction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSiteProductionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoSiteProductionType newType) {
		TypeDictionaryDicoSiteProductionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_PRODUCTION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoSiteProductionType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_PRODUCTION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProductionJournaliere() {
		return productionJournaliere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionJournaliere(double newProductionJournaliere) {
		double oldProductionJournaliere = productionJournaliere;
		productionJournaliere = newProductionJournaliere;
		boolean oldProductionJournaliereESet = productionJournaliereESet;
		productionJournaliereESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_PRODUCTION__PRODUCTION_JOURNALIERE, oldProductionJournaliere, productionJournaliere, !oldProductionJournaliereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProductionJournaliere() {
		double oldProductionJournaliere = productionJournaliere;
		boolean oldProductionJournaliereESet = productionJournaliereESet;
		productionJournaliere = PRODUCTION_JOURNALIERE_EDEFAULT;
		productionJournaliereESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_PRODUCTION__PRODUCTION_JOURNALIERE, oldProductionJournaliere, PRODUCTION_JOURNALIERE_EDEFAULT, oldProductionJournaliereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProductionJournaliere() {
		return productionJournaliereESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSiteProductionSousType getSousType() {
		return sousType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousType(TypeDictionaryDicoSiteProductionSousType newSousType) {
		TypeDictionaryDicoSiteProductionSousType oldSousType = sousType;
		sousType = newSousType == null ? SOUS_TYPE_EDEFAULT : newSousType;
		boolean oldSousTypeESet = sousTypeESet;
		sousTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_PRODUCTION__SOUS_TYPE, oldSousType, sousType, !oldSousTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousType() {
		TypeDictionaryDicoSiteProductionSousType oldSousType = sousType;
		boolean oldSousTypeESet = sousTypeESet;
		sousType = SOUS_TYPE_EDEFAULT;
		sousTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SITE_PRODUCTION__SOUS_TYPE, oldSousType, SOUS_TYPE_EDEFAULT, oldSousTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousType() {
		return sousTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniteMesure() {
		return uniteMesure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniteMesure(String newUniteMesure) {
		String oldUniteMesure = uniteMesure;
		uniteMesure = newUniteMesure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SITE_PRODUCTION__UNITE_MESURE, oldUniteMesure, uniteMesure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SITE_PRODUCTION__TYPE:
				return getType();
			case SchemaPackage.TYPE_SITE_PRODUCTION__PRODUCTION_JOURNALIERE:
				return new Double(getProductionJournaliere());
			case SchemaPackage.TYPE_SITE_PRODUCTION__SOUS_TYPE:
				return getSousType();
			case SchemaPackage.TYPE_SITE_PRODUCTION__UNITE_MESURE:
				return getUniteMesure();
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
			case SchemaPackage.TYPE_SITE_PRODUCTION__TYPE:
				setType((TypeDictionaryDicoSiteProductionType)newValue);
				return;
			case SchemaPackage.TYPE_SITE_PRODUCTION__PRODUCTION_JOURNALIERE:
				setProductionJournaliere(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_SITE_PRODUCTION__SOUS_TYPE:
				setSousType((TypeDictionaryDicoSiteProductionSousType)newValue);
				return;
			case SchemaPackage.TYPE_SITE_PRODUCTION__UNITE_MESURE:
				setUniteMesure((String)newValue);
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
			case SchemaPackage.TYPE_SITE_PRODUCTION__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_SITE_PRODUCTION__PRODUCTION_JOURNALIERE:
				unsetProductionJournaliere();
				return;
			case SchemaPackage.TYPE_SITE_PRODUCTION__SOUS_TYPE:
				unsetSousType();
				return;
			case SchemaPackage.TYPE_SITE_PRODUCTION__UNITE_MESURE:
				setUniteMesure(UNITE_MESURE_EDEFAULT);
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
			case SchemaPackage.TYPE_SITE_PRODUCTION__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_SITE_PRODUCTION__PRODUCTION_JOURNALIERE:
				return isSetProductionJournaliere();
			case SchemaPackage.TYPE_SITE_PRODUCTION__SOUS_TYPE:
				return isSetSousType();
			case SchemaPackage.TYPE_SITE_PRODUCTION__UNITE_MESURE:
				return UNITE_MESURE_EDEFAULT == null ? uniteMesure != null : !UNITE_MESURE_EDEFAULT.equals(uniteMesure);
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", productionJournaliere: ");
		if (productionJournaliereESet) result.append(productionJournaliere); else result.append("<unset>");
		result.append(", sousType: ");
		if (sousTypeESet) result.append(sousType); else result.append("<unset>");
		result.append(", uniteMesure: ");
		result.append(uniteMesure);
		result.append(')');
		return result.toString();
	}

} //TypeSiteProductionImpl
