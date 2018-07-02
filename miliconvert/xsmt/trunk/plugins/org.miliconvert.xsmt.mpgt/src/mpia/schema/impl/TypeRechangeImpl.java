/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoRechangeCategorie;
import mpia.schema.TypeLigneRechange;
import mpia.schema.TypeRechange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Rechange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getCodeNNOMaterielDestinataire <em>Code NNO Materiel Destinataire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getImmatriculationMaterielDestinataire <em>Immatriculation Materiel Destinataire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getIntituleMaterielDestinataire <em>Intitule Materiel Destinataire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getCodeApprovisionnementRattachement <em>Code Approvisionnement Rattachement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getCodeDemandeur <em>Code Demandeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getCodeAtelierBeneficiaire <em>Code Atelier Beneficiaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getAtelierBeneficiaire <em>Atelier Beneficiaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getDemandeParUnite <em>Demande Par Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getAPourUniteApprovisionnementUnite <em>APour Unite Approvisionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRechangeImpl#getApourLigneRechangeLigneRechange <em>Apour Ligne Rechange Ligne Rechange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRechangeImpl extends TypeActiviteImpl implements TypeRechange {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoRechangeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoRechangeCategorie.REQUST;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoRechangeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getCodeNNOMaterielDestinataire() <em>Code NNO Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeNNOMaterielDestinataire()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_NNO_MATERIEL_DESTINATAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeNNOMaterielDestinataire() <em>Code NNO Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeNNOMaterielDestinataire()
	 * @generated
	 * @ordered
	 */
	protected String codeNNOMaterielDestinataire = CODE_NNO_MATERIEL_DESTINATAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImmatriculationMaterielDestinataire() <em>Immatriculation Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmatriculationMaterielDestinataire()
	 * @generated
	 * @ordered
	 */
	protected static final String IMMATRICULATION_MATERIEL_DESTINATAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImmatriculationMaterielDestinataire() <em>Immatriculation Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmatriculationMaterielDestinataire()
	 * @generated
	 * @ordered
	 */
	protected String immatriculationMaterielDestinataire = IMMATRICULATION_MATERIEL_DESTINATAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntituleMaterielDestinataire() <em>Intitule Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleMaterielDestinataire()
	 * @generated
	 * @ordered
	 */
	protected static final String INTITULE_MATERIEL_DESTINATAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntituleMaterielDestinataire() <em>Intitule Materiel Destinataire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntituleMaterielDestinataire()
	 * @generated
	 * @ordered
	 */
	protected String intituleMaterielDestinataire = INTITULE_MATERIEL_DESTINATAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeApprovisionnementRattachement() <em>Code Approvisionnement Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeApprovisionnementRattachement()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_APPROVISIONNEMENT_RATTACHEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeApprovisionnementRattachement() <em>Code Approvisionnement Rattachement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeApprovisionnementRattachement()
	 * @generated
	 * @ordered
	 */
	protected String codeApprovisionnementRattachement = CODE_APPROVISIONNEMENT_RATTACHEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeDemandeur() <em>Code Demandeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeDemandeur()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_DEMANDEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeDemandeur() <em>Code Demandeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeDemandeur()
	 * @generated
	 * @ordered
	 */
	protected String codeDemandeur = CODE_DEMANDEUR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeAtelierBeneficiaire() <em>Code Atelier Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAtelierBeneficiaire()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_ATELIER_BENEFICIAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeAtelierBeneficiaire() <em>Code Atelier Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAtelierBeneficiaire()
	 * @generated
	 * @ordered
	 */
	protected String codeAtelierBeneficiaire = CODE_ATELIER_BENEFICIAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAtelierBeneficiaire() <em>Atelier Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtelierBeneficiaire()
	 * @generated
	 * @ordered
	 */
	protected static final String ATELIER_BENEFICIAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAtelierBeneficiaire() <em>Atelier Beneficiaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtelierBeneficiaire()
	 * @generated
	 * @ordered
	 */
	protected String atelierBeneficiaire = ATELIER_BENEFICIAIRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDemandeParUnite() <em>Demande Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeParUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT demandeParUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteApprovisionnementUnite() <em>APour Unite Approvisionnement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteApprovisionnementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteApprovisionnementUnite;

	/**
	 * The cached value of the '{@link #getApourLigneRechangeLigneRechange() <em>Apour Ligne Rechange Ligne Rechange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApourLigneRechangeLigneRechange()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeLigneRechange> apourLigneRechangeLigneRechange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRechangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRechange();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoRechangeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoRechangeCategorie newCategorie) {
		TypeDictionaryDicoRechangeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoRechangeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RECHANGE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeNNOMaterielDestinataire() {
		return codeNNOMaterielDestinataire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeNNOMaterielDestinataire(String newCodeNNOMaterielDestinataire) {
		String oldCodeNNOMaterielDestinataire = codeNNOMaterielDestinataire;
		codeNNOMaterielDestinataire = newCodeNNOMaterielDestinataire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__CODE_NNO_MATERIEL_DESTINATAIRE, oldCodeNNOMaterielDestinataire, codeNNOMaterielDestinataire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImmatriculationMaterielDestinataire() {
		return immatriculationMaterielDestinataire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmatriculationMaterielDestinataire(String newImmatriculationMaterielDestinataire) {
		String oldImmatriculationMaterielDestinataire = immatriculationMaterielDestinataire;
		immatriculationMaterielDestinataire = newImmatriculationMaterielDestinataire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__IMMATRICULATION_MATERIEL_DESTINATAIRE, oldImmatriculationMaterielDestinataire, immatriculationMaterielDestinataire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntituleMaterielDestinataire() {
		return intituleMaterielDestinataire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntituleMaterielDestinataire(String newIntituleMaterielDestinataire) {
		String oldIntituleMaterielDestinataire = intituleMaterielDestinataire;
		intituleMaterielDestinataire = newIntituleMaterielDestinataire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__INTITULE_MATERIEL_DESTINATAIRE, oldIntituleMaterielDestinataire, intituleMaterielDestinataire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeApprovisionnementRattachement() {
		return codeApprovisionnementRattachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeApprovisionnementRattachement(String newCodeApprovisionnementRattachement) {
		String oldCodeApprovisionnementRattachement = codeApprovisionnementRattachement;
		codeApprovisionnementRattachement = newCodeApprovisionnementRattachement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__CODE_APPROVISIONNEMENT_RATTACHEMENT, oldCodeApprovisionnementRattachement, codeApprovisionnementRattachement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeDemandeur() {
		return codeDemandeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeDemandeur(String newCodeDemandeur) {
		String oldCodeDemandeur = codeDemandeur;
		codeDemandeur = newCodeDemandeur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__CODE_DEMANDEUR, oldCodeDemandeur, codeDemandeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeAtelierBeneficiaire() {
		return codeAtelierBeneficiaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeAtelierBeneficiaire(String newCodeAtelierBeneficiaire) {
		String oldCodeAtelierBeneficiaire = codeAtelierBeneficiaire;
		codeAtelierBeneficiaire = newCodeAtelierBeneficiaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__CODE_ATELIER_BENEFICIAIRE, oldCodeAtelierBeneficiaire, codeAtelierBeneficiaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAtelierBeneficiaire() {
		return atelierBeneficiaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtelierBeneficiaire(String newAtelierBeneficiaire) {
		String oldAtelierBeneficiaire = atelierBeneficiaire;
		atelierBeneficiaire = newAtelierBeneficiaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__ATELIER_BENEFICIAIRE, oldAtelierBeneficiaire, atelierBeneficiaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getDemandeParUnite() {
		return demandeParUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDemandeParUnite(TypeAssociationEXT newDemandeParUnite, NotificationChain msgs) {
		TypeAssociationEXT oldDemandeParUnite = demandeParUnite;
		demandeParUnite = newDemandeParUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE, oldDemandeParUnite, newDemandeParUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDemandeParUnite(TypeAssociationEXT newDemandeParUnite) {
		if (newDemandeParUnite != demandeParUnite) {
			NotificationChain msgs = null;
			if (demandeParUnite != null)
				msgs = ((InternalEObject)demandeParUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE, null, msgs);
			if (newDemandeParUnite != null)
				msgs = ((InternalEObject)newDemandeParUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE, null, msgs);
			msgs = basicSetDemandeParUnite(newDemandeParUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE, newDemandeParUnite, newDemandeParUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteApprovisionnementUnite() {
		return aPourUniteApprovisionnementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteApprovisionnementUnite(TypeAssociationEXT newAPourUniteApprovisionnementUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteApprovisionnementUnite = aPourUniteApprovisionnementUnite;
		aPourUniteApprovisionnementUnite = newAPourUniteApprovisionnementUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE, oldAPourUniteApprovisionnementUnite, newAPourUniteApprovisionnementUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteApprovisionnementUnite(TypeAssociationEXT newAPourUniteApprovisionnementUnite) {
		if (newAPourUniteApprovisionnementUnite != aPourUniteApprovisionnementUnite) {
			NotificationChain msgs = null;
			if (aPourUniteApprovisionnementUnite != null)
				msgs = ((InternalEObject)aPourUniteApprovisionnementUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE, null, msgs);
			if (newAPourUniteApprovisionnementUnite != null)
				msgs = ((InternalEObject)newAPourUniteApprovisionnementUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE, null, msgs);
			msgs = basicSetAPourUniteApprovisionnementUnite(newAPourUniteApprovisionnementUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE, newAPourUniteApprovisionnementUnite, newAPourUniteApprovisionnementUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeLigneRechange> getApourLigneRechangeLigneRechange() {
		if (apourLigneRechangeLigneRechange == null) {
			apourLigneRechangeLigneRechange = new EObjectContainmentEList<TypeLigneRechange>(TypeLigneRechange.class, this, SchemaPackage.TYPE_RECHANGE__APOUR_LIGNE_RECHANGE_LIGNE_RECHANGE);
		}
		return apourLigneRechangeLigneRechange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE:
				return basicSetDemandeParUnite(null, msgs);
			case SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE:
				return basicSetAPourUniteApprovisionnementUnite(null, msgs);
			case SchemaPackage.TYPE_RECHANGE__APOUR_LIGNE_RECHANGE_LIGNE_RECHANGE:
				return ((InternalEList<?>)getApourLigneRechangeLigneRechange()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_RECHANGE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_RECHANGE__CODE_NNO_MATERIEL_DESTINATAIRE:
				return getCodeNNOMaterielDestinataire();
			case SchemaPackage.TYPE_RECHANGE__IMMATRICULATION_MATERIEL_DESTINATAIRE:
				return getImmatriculationMaterielDestinataire();
			case SchemaPackage.TYPE_RECHANGE__INTITULE_MATERIEL_DESTINATAIRE:
				return getIntituleMaterielDestinataire();
			case SchemaPackage.TYPE_RECHANGE__CODE_APPROVISIONNEMENT_RATTACHEMENT:
				return getCodeApprovisionnementRattachement();
			case SchemaPackage.TYPE_RECHANGE__CODE_DEMANDEUR:
				return getCodeDemandeur();
			case SchemaPackage.TYPE_RECHANGE__CODE_ATELIER_BENEFICIAIRE:
				return getCodeAtelierBeneficiaire();
			case SchemaPackage.TYPE_RECHANGE__ATELIER_BENEFICIAIRE:
				return getAtelierBeneficiaire();
			case SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE:
				return getDemandeParUnite();
			case SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE:
				return getAPourUniteApprovisionnementUnite();
			case SchemaPackage.TYPE_RECHANGE__APOUR_LIGNE_RECHANGE_LIGNE_RECHANGE:
				return getApourLigneRechangeLigneRechange();
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
			case SchemaPackage.TYPE_RECHANGE__CATEGORIE:
				setCategorie((TypeDictionaryDicoRechangeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__CODE_NNO_MATERIEL_DESTINATAIRE:
				setCodeNNOMaterielDestinataire((String)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__IMMATRICULATION_MATERIEL_DESTINATAIRE:
				setImmatriculationMaterielDestinataire((String)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__INTITULE_MATERIEL_DESTINATAIRE:
				setIntituleMaterielDestinataire((String)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__CODE_APPROVISIONNEMENT_RATTACHEMENT:
				setCodeApprovisionnementRattachement((String)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__CODE_DEMANDEUR:
				setCodeDemandeur((String)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__CODE_ATELIER_BENEFICIAIRE:
				setCodeAtelierBeneficiaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__ATELIER_BENEFICIAIRE:
				setAtelierBeneficiaire((String)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE:
				setDemandeParUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE:
				setAPourUniteApprovisionnementUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RECHANGE__APOUR_LIGNE_RECHANGE_LIGNE_RECHANGE:
				getApourLigneRechangeLigneRechange().clear();
				getApourLigneRechangeLigneRechange().addAll((Collection<? extends TypeLigneRechange>)newValue);
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
			case SchemaPackage.TYPE_RECHANGE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_RECHANGE__CODE_NNO_MATERIEL_DESTINATAIRE:
				setCodeNNOMaterielDestinataire(CODE_NNO_MATERIEL_DESTINATAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RECHANGE__IMMATRICULATION_MATERIEL_DESTINATAIRE:
				setImmatriculationMaterielDestinataire(IMMATRICULATION_MATERIEL_DESTINATAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RECHANGE__INTITULE_MATERIEL_DESTINATAIRE:
				setIntituleMaterielDestinataire(INTITULE_MATERIEL_DESTINATAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RECHANGE__CODE_APPROVISIONNEMENT_RATTACHEMENT:
				setCodeApprovisionnementRattachement(CODE_APPROVISIONNEMENT_RATTACHEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RECHANGE__CODE_DEMANDEUR:
				setCodeDemandeur(CODE_DEMANDEUR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RECHANGE__CODE_ATELIER_BENEFICIAIRE:
				setCodeAtelierBeneficiaire(CODE_ATELIER_BENEFICIAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RECHANGE__ATELIER_BENEFICIAIRE:
				setAtelierBeneficiaire(ATELIER_BENEFICIAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE:
				setDemandeParUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE:
				setAPourUniteApprovisionnementUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RECHANGE__APOUR_LIGNE_RECHANGE_LIGNE_RECHANGE:
				getApourLigneRechangeLigneRechange().clear();
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
			case SchemaPackage.TYPE_RECHANGE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_RECHANGE__CODE_NNO_MATERIEL_DESTINATAIRE:
				return CODE_NNO_MATERIEL_DESTINATAIRE_EDEFAULT == null ? codeNNOMaterielDestinataire != null : !CODE_NNO_MATERIEL_DESTINATAIRE_EDEFAULT.equals(codeNNOMaterielDestinataire);
			case SchemaPackage.TYPE_RECHANGE__IMMATRICULATION_MATERIEL_DESTINATAIRE:
				return IMMATRICULATION_MATERIEL_DESTINATAIRE_EDEFAULT == null ? immatriculationMaterielDestinataire != null : !IMMATRICULATION_MATERIEL_DESTINATAIRE_EDEFAULT.equals(immatriculationMaterielDestinataire);
			case SchemaPackage.TYPE_RECHANGE__INTITULE_MATERIEL_DESTINATAIRE:
				return INTITULE_MATERIEL_DESTINATAIRE_EDEFAULT == null ? intituleMaterielDestinataire != null : !INTITULE_MATERIEL_DESTINATAIRE_EDEFAULT.equals(intituleMaterielDestinataire);
			case SchemaPackage.TYPE_RECHANGE__CODE_APPROVISIONNEMENT_RATTACHEMENT:
				return CODE_APPROVISIONNEMENT_RATTACHEMENT_EDEFAULT == null ? codeApprovisionnementRattachement != null : !CODE_APPROVISIONNEMENT_RATTACHEMENT_EDEFAULT.equals(codeApprovisionnementRattachement);
			case SchemaPackage.TYPE_RECHANGE__CODE_DEMANDEUR:
				return CODE_DEMANDEUR_EDEFAULT == null ? codeDemandeur != null : !CODE_DEMANDEUR_EDEFAULT.equals(codeDemandeur);
			case SchemaPackage.TYPE_RECHANGE__CODE_ATELIER_BENEFICIAIRE:
				return CODE_ATELIER_BENEFICIAIRE_EDEFAULT == null ? codeAtelierBeneficiaire != null : !CODE_ATELIER_BENEFICIAIRE_EDEFAULT.equals(codeAtelierBeneficiaire);
			case SchemaPackage.TYPE_RECHANGE__ATELIER_BENEFICIAIRE:
				return ATELIER_BENEFICIAIRE_EDEFAULT == null ? atelierBeneficiaire != null : !ATELIER_BENEFICIAIRE_EDEFAULT.equals(atelierBeneficiaire);
			case SchemaPackage.TYPE_RECHANGE__DEMANDE_PAR_UNITE:
				return demandeParUnite != null;
			case SchemaPackage.TYPE_RECHANGE__APOUR_UNITE_APPROVISIONNEMENT_UNITE:
				return aPourUniteApprovisionnementUnite != null;
			case SchemaPackage.TYPE_RECHANGE__APOUR_LIGNE_RECHANGE_LIGNE_RECHANGE:
				return apourLigneRechangeLigneRechange != null && !apourLigneRechangeLigneRechange.isEmpty();
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", codeNNOMaterielDestinataire: ");
		result.append(codeNNOMaterielDestinataire);
		result.append(", immatriculationMaterielDestinataire: ");
		result.append(immatriculationMaterielDestinataire);
		result.append(", intituleMaterielDestinataire: ");
		result.append(intituleMaterielDestinataire);
		result.append(", codeApprovisionnementRattachement: ");
		result.append(codeApprovisionnementRattachement);
		result.append(", codeDemandeur: ");
		result.append(codeDemandeur);
		result.append(", codeAtelierBeneficiaire: ");
		result.append(codeAtelierBeneficiaire);
		result.append(", atelierBeneficiaire: ");
		result.append(atelierBeneficiaire);
		result.append(')');
		return result.toString();
	}

} //TypeRechangeImpl
