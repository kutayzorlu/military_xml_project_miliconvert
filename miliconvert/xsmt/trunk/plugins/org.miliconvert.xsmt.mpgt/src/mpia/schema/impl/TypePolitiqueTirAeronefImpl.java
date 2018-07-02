/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir;
import mpia.schema.TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse;
import mpia.schema.TypePolitiqueTirAeronef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Politique Tir Aeronef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirAeronefImpl#getTypeAeronefAvecVitesse <em>Type Aeronef Avec Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirAeronefImpl#getMecanismeTir <em>Mecanisme Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirAeronefImpl#isVitesseRapide <em>Vitesse Rapide</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirAeronefImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirAeronefImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePolitiqueTirAeronefImpl#getAAppliquerParSystemeArmeTypeArme <em>AAppliquer Par Systeme Arme Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePolitiqueTirAeronefImpl extends EObjectImpl implements TypePolitiqueTirAeronef {
	/**
	 * The default value of the '{@link #getTypeAeronefAvecVitesse() <em>Type Aeronef Avec Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAeronefAvecVitesse()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse TYPE_AERONEF_AVEC_VITESSE_EDEFAULT = TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse.SAC;

	/**
	 * The cached value of the '{@link #getTypeAeronefAvecVitesse() <em>Type Aeronef Avec Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAeronefAvecVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse typeAeronefAvecVitesse = TYPE_AERONEF_AVEC_VITESSE_EDEFAULT;

	/**
	 * This is true if the Type Aeronef Avec Vitesse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeAeronefAvecVitesseESet;

	/**
	 * The default value of the '{@link #getMecanismeTir() <em>Mecanisme Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMecanismeTir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir MECANISME_TIR_EDEFAULT = TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir.SBS;

	/**
	 * The cached value of the '{@link #getMecanismeTir() <em>Mecanisme Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMecanismeTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir mecanismeTir = MECANISME_TIR_EDEFAULT;

	/**
	 * This is true if the Mecanisme Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mecanismeTirESet;

	/**
	 * The default value of the '{@link #isVitesseRapide() <em>Vitesse Rapide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVitesseRapide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VITESSE_RAPIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVitesseRapide() <em>Vitesse Rapide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVitesseRapide()
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseRapide = VITESSE_RAPIDE_EDEFAULT;

	/**
	 * This is true if the Vitesse Rapide attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseRapideESet;

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
	 * The cached value of the '{@link #getAAppliquerParSystemeArmeTypeArme() <em>AAppliquer Par Systeme Arme Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAAppliquerParSystemeArmeTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aAppliquerParSystemeArmeTypeArme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePolitiqueTirAeronefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePolitiqueTirAeronef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse getTypeAeronefAvecVitesse() {
		return typeAeronefAvecVitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAeronefAvecVitesse(TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse newTypeAeronefAvecVitesse) {
		TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse oldTypeAeronefAvecVitesse = typeAeronefAvecVitesse;
		typeAeronefAvecVitesse = newTypeAeronefAvecVitesse == null ? TYPE_AERONEF_AVEC_VITESSE_EDEFAULT : newTypeAeronefAvecVitesse;
		boolean oldTypeAeronefAvecVitesseESet = typeAeronefAvecVitesseESet;
		typeAeronefAvecVitesseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__TYPE_AERONEF_AVEC_VITESSE, oldTypeAeronefAvecVitesse, typeAeronefAvecVitesse, !oldTypeAeronefAvecVitesseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeAeronefAvecVitesse() {
		TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse oldTypeAeronefAvecVitesse = typeAeronefAvecVitesse;
		boolean oldTypeAeronefAvecVitesseESet = typeAeronefAvecVitesseESet;
		typeAeronefAvecVitesse = TYPE_AERONEF_AVEC_VITESSE_EDEFAULT;
		typeAeronefAvecVitesseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__TYPE_AERONEF_AVEC_VITESSE, oldTypeAeronefAvecVitesse, TYPE_AERONEF_AVEC_VITESSE_EDEFAULT, oldTypeAeronefAvecVitesseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeAeronefAvecVitesse() {
		return typeAeronefAvecVitesseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir getMecanismeTir() {
		return mecanismeTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMecanismeTir(TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir newMecanismeTir) {
		TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir oldMecanismeTir = mecanismeTir;
		mecanismeTir = newMecanismeTir == null ? MECANISME_TIR_EDEFAULT : newMecanismeTir;
		boolean oldMecanismeTirESet = mecanismeTirESet;
		mecanismeTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__MECANISME_TIR, oldMecanismeTir, mecanismeTir, !oldMecanismeTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMecanismeTir() {
		TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir oldMecanismeTir = mecanismeTir;
		boolean oldMecanismeTirESet = mecanismeTirESet;
		mecanismeTir = MECANISME_TIR_EDEFAULT;
		mecanismeTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__MECANISME_TIR, oldMecanismeTir, MECANISME_TIR_EDEFAULT, oldMecanismeTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMecanismeTir() {
		return mecanismeTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVitesseRapide() {
		return vitesseRapide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseRapide(boolean newVitesseRapide) {
		boolean oldVitesseRapide = vitesseRapide;
		vitesseRapide = newVitesseRapide;
		boolean oldVitesseRapideESet = vitesseRapideESet;
		vitesseRapideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__VITESSE_RAPIDE, oldVitesseRapide, vitesseRapide, !oldVitesseRapideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseRapide() {
		boolean oldVitesseRapide = vitesseRapide;
		boolean oldVitesseRapideESet = vitesseRapideESet;
		vitesseRapide = VITESSE_RAPIDE_EDEFAULT;
		vitesseRapideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__VITESSE_RAPIDE, oldVitesseRapide, VITESSE_RAPIDE_EDEFAULT, oldVitesseRapideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseRapide() {
		return vitesseRapideESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAAppliquerParSystemeArmeTypeArme() {
		return aAppliquerParSystemeArmeTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAAppliquerParSystemeArmeTypeArme(TypeAssociationEXT newAAppliquerParSystemeArmeTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldAAppliquerParSystemeArmeTypeArme = aAppliquerParSystemeArmeTypeArme;
		aAppliquerParSystemeArmeTypeArme = newAAppliquerParSystemeArmeTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME, oldAAppliquerParSystemeArmeTypeArme, newAAppliquerParSystemeArmeTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAAppliquerParSystemeArmeTypeArme(TypeAssociationEXT newAAppliquerParSystemeArmeTypeArme) {
		if (newAAppliquerParSystemeArmeTypeArme != aAppliquerParSystemeArmeTypeArme) {
			NotificationChain msgs = null;
			if (aAppliquerParSystemeArmeTypeArme != null)
				msgs = ((InternalEObject)aAppliquerParSystemeArmeTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME, null, msgs);
			if (newAAppliquerParSystemeArmeTypeArme != null)
				msgs = ((InternalEObject)newAAppliquerParSystemeArmeTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME, null, msgs);
			msgs = basicSetAAppliquerParSystemeArmeTypeArme(newAAppliquerParSystemeArmeTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME, newAAppliquerParSystemeArmeTypeArme, newAAppliquerParSystemeArmeTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				return basicSetAAppliquerParSystemeArmeTypeArme(null, msgs);
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
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__TYPE_AERONEF_AVEC_VITESSE:
				return getTypeAeronefAvecVitesse();
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__MECANISME_TIR:
				return getMecanismeTir();
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__VITESSE_RAPIDE:
				return isVitesseRapide() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CE:
				return getCE();
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				return getAAppliquerParSystemeArmeTypeArme();
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
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__TYPE_AERONEF_AVEC_VITESSE:
				setTypeAeronefAvecVitesse((TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__MECANISME_TIR:
				setMecanismeTir((TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__VITESSE_RAPIDE:
				setVitesseRapide(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				setAAppliquerParSystemeArmeTypeArme((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__TYPE_AERONEF_AVEC_VITESSE:
				unsetTypeAeronefAvecVitesse();
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__MECANISME_TIR:
				unsetMecanismeTir();
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__VITESSE_RAPIDE:
				unsetVitesseRapide();
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				setAAppliquerParSystemeArmeTypeArme((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__TYPE_AERONEF_AVEC_VITESSE:
				return isSetTypeAeronefAvecVitesse();
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__MECANISME_TIR:
				return isSetMecanismeTir();
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__VITESSE_RAPIDE:
				return isSetVitesseRapide();
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_POLITIQUE_TIR_AERONEF__AAPPLIQUER_PAR_SYSTEME_ARME_TYPE_ARME:
				return aAppliquerParSystemeArmeTypeArme != null;
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
		result.append(" (typeAeronefAvecVitesse: ");
		if (typeAeronefAvecVitesseESet) result.append(typeAeronefAvecVitesse); else result.append("<unset>");
		result.append(", mecanismeTir: ");
		if (mecanismeTirESet) result.append(mecanismeTir); else result.append("<unset>");
		result.append(", vitesseRapide: ");
		if (vitesseRapideESet) result.append(vitesseRapide); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePolitiqueTirAeronefImpl
