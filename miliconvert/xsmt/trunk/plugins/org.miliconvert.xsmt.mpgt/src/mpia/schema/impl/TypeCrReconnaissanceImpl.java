/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCrReconnaissance;
import mpia.schema.TypeTypeMoyenManquant;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Cr Reconnaissance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getDateCR <em>Date CR</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getCompteRendu <em>Compte Rendu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#isCapaciteTravaux <em>Capacite Travaux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getDelai <em>Delai</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getDateFinReconnaissance <em>Date Fin Reconnaissance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getNecessiteMoyenTypeMoyenManquant <em>Necessite Moyen Type Moyen Manquant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrReconnaissanceImpl#getAPourZonesReconnuesAutreElementControle <em>APour Zones Reconnues Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCrReconnaissanceImpl extends EObjectImpl implements TypeCrReconnaissance {
	/**
	 * The default value of the '{@link #getDateCR() <em>Date CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCR()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_CR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCR() <em>Date CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCR()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateCR = DATE_CR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompteRendu() <em>Compte Rendu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompteRendu()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPTE_RENDU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompteRendu() <em>Compte Rendu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompteRendu()
	 * @generated
	 * @ordered
	 */
	protected String compteRendu = COMPTE_RENDU_EDEFAULT;

	/**
	 * The default value of the '{@link #isCapaciteTravaux() <em>Capacite Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapaciteTravaux()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAPACITE_TRAVAUX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCapaciteTravaux() <em>Capacite Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCapaciteTravaux()
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteTravaux = CAPACITE_TRAVAUX_EDEFAULT;

	/**
	 * This is true if the Capacite Travaux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteTravauxESet;

	/**
	 * The cached value of the '{@link #getDelai() <em>Delai</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelai()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree delai;

	/**
	 * The default value of the '{@link #getDateFinReconnaissance() <em>Date Fin Reconnaissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinReconnaissance()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_RECONNAISSANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFinReconnaissance() <em>Date Fin Reconnaissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinReconnaissance()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFinReconnaissance = DATE_FIN_RECONNAISSANCE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteRendantCompteUnite() <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRendantCompteUnite;

	/**
	 * The cached value of the '{@link #getNecessiteMoyenTypeMoyenManquant() <em>Necessite Moyen Type Moyen Manquant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNecessiteMoyenTypeMoyenManquant()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeMoyenManquant> necessiteMoyenTypeMoyenManquant;

	/**
	 * The cached value of the '{@link #getAPourZonesReconnuesAutreElementControle() <em>APour Zones Reconnues Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonesReconnuesAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZonesReconnuesAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCrReconnaissanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCrReconnaissance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateCR() {
		return dateCR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCR(XMLGregorianCalendar newDateCR) {
		XMLGregorianCalendar oldDateCR = dateCR;
		dateCR = newDateCR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_CR, oldDateCR, dateCR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompteRendu() {
		return compteRendu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompteRendu(String newCompteRendu) {
		String oldCompteRendu = compteRendu;
		compteRendu = newCompteRendu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__COMPTE_RENDU, oldCompteRendu, compteRendu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCapaciteTravaux() {
		return capaciteTravaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteTravaux(boolean newCapaciteTravaux) {
		boolean oldCapaciteTravaux = capaciteTravaux;
		capaciteTravaux = newCapaciteTravaux;
		boolean oldCapaciteTravauxESet = capaciteTravauxESet;
		capaciteTravauxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__CAPACITE_TRAVAUX, oldCapaciteTravaux, capaciteTravaux, !oldCapaciteTravauxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteTravaux() {
		boolean oldCapaciteTravaux = capaciteTravaux;
		boolean oldCapaciteTravauxESet = capaciteTravauxESet;
		capaciteTravaux = CAPACITE_TRAVAUX_EDEFAULT;
		capaciteTravauxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CR_RECONNAISSANCE__CAPACITE_TRAVAUX, oldCapaciteTravaux, CAPACITE_TRAVAUX_EDEFAULT, oldCapaciteTravauxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteTravaux() {
		return capaciteTravauxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDelai() {
		return delai;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelai(TypeDataTypeDuree newDelai, NotificationChain msgs) {
		TypeDataTypeDuree oldDelai = delai;
		delai = newDelai;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI, oldDelai, newDelai);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelai(TypeDataTypeDuree newDelai) {
		if (newDelai != delai) {
			NotificationChain msgs = null;
			if (delai != null)
				msgs = ((InternalEObject)delai).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI, null, msgs);
			if (newDelai != null)
				msgs = ((InternalEObject)newDelai).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI, null, msgs);
			msgs = basicSetDelai(newDelai, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI, newDelai, newDelai));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFinReconnaissance() {
		return dateFinReconnaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinReconnaissance(XMLGregorianCalendar newDateFinReconnaissance) {
		XMLGregorianCalendar oldDateFinReconnaissance = dateFinReconnaissance;
		dateFinReconnaissance = newDateFinReconnaissance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_FIN_RECONNAISSANCE, oldDateFinReconnaissance, dateFinReconnaissance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRendantCompteUnite() {
		return aPourUniteRendantCompteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRendantCompteUnite = aPourUniteRendantCompteUnite;
		aPourUniteRendantCompteUnite = newAPourUniteRendantCompteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE, oldAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite) {
		if (newAPourUniteRendantCompteUnite != aPourUniteRendantCompteUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)aPourUniteRendantCompteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			if (newAPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)newAPourUniteRendantCompteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			msgs = basicSetAPourUniteRendantCompteUnite(newAPourUniteRendantCompteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE, newAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeMoyenManquant> getNecessiteMoyenTypeMoyenManquant() {
		if (necessiteMoyenTypeMoyenManquant == null) {
			necessiteMoyenTypeMoyenManquant = new EObjectContainmentEList<TypeTypeMoyenManquant>(TypeTypeMoyenManquant.class, this, SchemaPackage.TYPE_CR_RECONNAISSANCE__NECESSITE_MOYEN_TYPE_MOYEN_MANQUANT);
		}
		return necessiteMoyenTypeMoyenManquant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZonesReconnuesAutreElementControle() {
		if (aPourZonesReconnuesAutreElementControle == null) {
			aPourZonesReconnuesAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_ZONES_RECONNUES_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZonesReconnuesAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI:
				return basicSetDelai(null, msgs);
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return basicSetAPourUniteRendantCompteUnite(null, msgs);
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__NECESSITE_MOYEN_TYPE_MOYEN_MANQUANT:
				return ((InternalEList<?>)getNecessiteMoyenTypeMoyenManquant()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_ZONES_RECONNUES_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZonesReconnuesAutreElementControle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_CR:
				return getDateCR();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__COMPTE_RENDU:
				return getCompteRendu();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CAPACITE_TRAVAUX:
				return isCapaciteTravaux() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI:
				return getDelai();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_FIN_RECONNAISSANCE:
				return getDateFinReconnaissance();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CE:
				return getCE();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return getAPourUniteRendantCompteUnite();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__NECESSITE_MOYEN_TYPE_MOYEN_MANQUANT:
				return getNecessiteMoyenTypeMoyenManquant();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_ZONES_RECONNUES_AUTRE_ELEMENT_CONTROLE:
				return getAPourZonesReconnuesAutreElementControle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_CR:
				setDateCR((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__COMPTE_RENDU:
				setCompteRendu((String)newValue);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CAPACITE_TRAVAUX:
				setCapaciteTravaux(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI:
				setDelai((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_FIN_RECONNAISSANCE:
				setDateFinReconnaissance((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__NECESSITE_MOYEN_TYPE_MOYEN_MANQUANT:
				getNecessiteMoyenTypeMoyenManquant().clear();
				getNecessiteMoyenTypeMoyenManquant().addAll((Collection<? extends TypeTypeMoyenManquant>)newValue);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_ZONES_RECONNUES_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesReconnuesAutreElementControle().clear();
				getAPourZonesReconnuesAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_CR:
				setDateCR(DATE_CR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__COMPTE_RENDU:
				setCompteRendu(COMPTE_RENDU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CAPACITE_TRAVAUX:
				unsetCapaciteTravaux();
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI:
				setDelai((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_FIN_RECONNAISSANCE:
				setDateFinReconnaissance(DATE_FIN_RECONNAISSANCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__NECESSITE_MOYEN_TYPE_MOYEN_MANQUANT:
				getNecessiteMoyenTypeMoyenManquant().clear();
				return;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_ZONES_RECONNUES_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesReconnuesAutreElementControle().clear();
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
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_CR:
				return DATE_CR_EDEFAULT == null ? dateCR != null : !DATE_CR_EDEFAULT.equals(dateCR);
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__COMPTE_RENDU:
				return COMPTE_RENDU_EDEFAULT == null ? compteRendu != null : !COMPTE_RENDU_EDEFAULT.equals(compteRendu);
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CAPACITE_TRAVAUX:
				return isSetCapaciteTravaux();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DELAI:
				return delai != null;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__DATE_FIN_RECONNAISSANCE:
				return DATE_FIN_RECONNAISSANCE_EDEFAULT == null ? dateFinReconnaissance != null : !DATE_FIN_RECONNAISSANCE_EDEFAULT.equals(dateFinReconnaissance);
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return aPourUniteRendantCompteUnite != null;
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__NECESSITE_MOYEN_TYPE_MOYEN_MANQUANT:
				return necessiteMoyenTypeMoyenManquant != null && !necessiteMoyenTypeMoyenManquant.isEmpty();
			case SchemaPackage.TYPE_CR_RECONNAISSANCE__APOUR_ZONES_RECONNUES_AUTRE_ELEMENT_CONTROLE:
				return aPourZonesReconnuesAutreElementControle != null && !aPourZonesReconnuesAutreElementControle.isEmpty();
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
		result.append(" (dateCR: ");
		result.append(dateCR);
		result.append(", compteRendu: ");
		result.append(compteRendu);
		result.append(", capaciteTravaux: ");
		if (capaciteTravauxESet) result.append(capaciteTravaux); else result.append("<unset>");
		result.append(", dateFinReconnaissance: ");
		result.append(dateFinReconnaissance);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCrReconnaissanceImpl
