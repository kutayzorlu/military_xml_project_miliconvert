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

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBesoinEnCarburant;
import mpia.schema.TypeDepannageEvacuation;
import mpia.schema.TypeDictionaryDicoDepannageEvacuationCategorie;
import mpia.schema.TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral;
import mpia.schema.TypeDictionaryDicoDepannageEvacuationEquipageDisponible;
import mpia.schema.TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation;
import mpia.schema.TypeDictionaryDicoDepannageEvacuationSoutienNecessaire;
import mpia.schema.TypeDictionaryDicoDepannageEvacuationTypeCompteRendu;
import mpia.schema.TypeMoyenDepannage;

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
 * An implementation of the model object '<em><b>Type Depannage Evacuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getSoutienNecessaire <em>Soutien Necessaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getDateDemande <em>Date Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getCodeEtatGeneral <em>Code Etat General</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getDiagnosticSommaire <em>Diagnostic Sommaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getEquipageDisponible <em>Equipage Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getPossibiliteEvacuation <em>Possibilite Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getMoyensSupplementairesDemandes <em>Moyens Supplementaires Demandes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getMotifAnnulation <em>Motif Annulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getTypeCompteRendu <em>Type Compte Rendu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getAPourUniteExecutanteUnite <em>APour Unite Executante Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getEstObjetAssociationDepEvacuationDepEvacuation <em>Est Objet Association Dep Evacuation Dep Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getEstSujetAssociationDepEvacuationDepEvacuation <em>Est Sujet Association Dep Evacuation Dep Evacuation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getAPourAtelierUnite <em>APour Atelier Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getAPourLieuRendezVousAutreElementControle <em>APour Lieu Rendez Vous Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getNecessiteMoyenDepannage <em>Necessite Moyen Depannage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getAPourBesoinEnCarburantBesoinEnCarburant <em>APour Besoin En Carburant Besoin En Carburant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDepannageEvacuationImpl#getDoitTenirCompteObstacle <em>Doit Tenir Compte Obstacle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDepannageEvacuationImpl extends TypeActiviteImpl implements TypeDepannageEvacuation {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDepannageEvacuationCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoDepannageEvacuationCategorie.REQUST;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDepannageEvacuationCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSoutienNecessaire() <em>Soutien Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoutienNecessaire()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDepannageEvacuationSoutienNecessaire SOUTIEN_NECESSAIRE_EDEFAULT = TypeDictionaryDicoDepannageEvacuationSoutienNecessaire.RECV;

	/**
	 * The cached value of the '{@link #getSoutienNecessaire() <em>Soutien Necessaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoutienNecessaire()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDepannageEvacuationSoutienNecessaire soutienNecessaire = SOUTIEN_NECESSAIRE_EDEFAULT;

	/**
	 * This is true if the Soutien Necessaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean soutienNecessaireESet;

	/**
	 * The default value of the '{@link #getDateDemande() <em>Date Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDemande()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEMANDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDemande() <em>Date Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDemande()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDemande = DATE_DEMANDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodeEtatGeneral() <em>Code Etat General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeEtatGeneral()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral CODE_ETAT_GENERAL_EDEFAULT = TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral.X;

	/**
	 * The cached value of the '{@link #getCodeEtatGeneral() <em>Code Etat General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeEtatGeneral()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral codeEtatGeneral = CODE_ETAT_GENERAL_EDEFAULT;

	/**
	 * This is true if the Code Etat General attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeEtatGeneralESet;

	/**
	 * The default value of the '{@link #getDiagnosticSommaire() <em>Diagnostic Sommaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticSommaire()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGNOSTIC_SOMMAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnosticSommaire() <em>Diagnostic Sommaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticSommaire()
	 * @generated
	 * @ordered
	 */
	protected String diagnosticSommaire = DIAGNOSTIC_SOMMAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEquipageDisponible() <em>Equipage Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipageDisponible()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDepannageEvacuationEquipageDisponible EQUIPAGE_DISPONIBLE_EDEFAULT = TypeDictionaryDicoDepannageEvacuationEquipageDisponible.OUI;

	/**
	 * The cached value of the '{@link #getEquipageDisponible() <em>Equipage Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquipageDisponible()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDepannageEvacuationEquipageDisponible equipageDisponible = EQUIPAGE_DISPONIBLE_EDEFAULT;

	/**
	 * This is true if the Equipage Disponible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean equipageDisponibleESet;

	/**
	 * The default value of the '{@link #getPossibiliteEvacuation() <em>Possibilite Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibiliteEvacuation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation POSSIBILITE_EVACUATION_EDEFAULT = TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation.D;

	/**
	 * The cached value of the '{@link #getPossibiliteEvacuation() <em>Possibilite Evacuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibiliteEvacuation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation possibiliteEvacuation = POSSIBILITE_EVACUATION_EDEFAULT;

	/**
	 * This is true if the Possibilite Evacuation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean possibiliteEvacuationESet;

	/**
	 * The default value of the '{@link #getMoyensSupplementairesDemandes() <em>Moyens Supplementaires Demandes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensSupplementairesDemandes()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_SUPPLEMENTAIRES_DEMANDES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyensSupplementairesDemandes() <em>Moyens Supplementaires Demandes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyensSupplementairesDemandes()
	 * @generated
	 * @ordered
	 */
	protected String moyensSupplementairesDemandes = MOYENS_SUPPLEMENTAIRES_DEMANDES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotifAnnulation() <em>Motif Annulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotifAnnulation()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTIF_ANNULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotifAnnulation() <em>Motif Annulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotifAnnulation()
	 * @generated
	 * @ordered
	 */
	protected String motifAnnulation = MOTIF_ANNULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeCompteRendu() <em>Type Compte Rendu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCompteRendu()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDepannageEvacuationTypeCompteRendu TYPE_COMPTE_RENDU_EDEFAULT = TypeDictionaryDicoDepannageEvacuationTypeCompteRendu.REP;

	/**
	 * The cached value of the '{@link #getTypeCompteRendu() <em>Type Compte Rendu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCompteRendu()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDepannageEvacuationTypeCompteRendu typeCompteRendu = TYPE_COMPTE_RENDU_EDEFAULT;

	/**
	 * This is true if the Type Compte Rendu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCompteRenduESet;

	/**
	 * The cached value of the '{@link #getAPourUniteConcerneeUnite() <em>APour Unite Concernee Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteConcerneeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteConcerneeUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteExecutanteUnite() <em>APour Unite Executante Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteExecutanteUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourUniteExecutanteUnite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationDepEvacuationDepEvacuation() <em>Est Objet Association Dep Evacuation Dep Evacuation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationDepEvacuationDepEvacuation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationDepEvacuationDepEvacuation;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationDepEvacuationDepEvacuation() <em>Est Sujet Association Dep Evacuation Dep Evacuation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationDepEvacuationDepEvacuation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationDepEvacuationDepEvacuation;

	/**
	 * The cached value of the '{@link #getAPourAtelierUnite() <em>APour Atelier Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAtelierUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourAtelierUnite;

	/**
	 * The cached value of the '{@link #getAPourLieuRendezVousAutreElementControle() <em>APour Lieu Rendez Vous Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLieuRendezVousAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourLieuRendezVousAutreElementControle;

	/**
	 * The cached value of the '{@link #getNecessiteMoyenDepannage() <em>Necessite Moyen Depannage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNecessiteMoyenDepannage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyenDepannage> necessiteMoyenDepannage;

	/**
	 * The cached value of the '{@link #getAPourBesoinEnCarburantBesoinEnCarburant() <em>APour Besoin En Carburant Besoin En Carburant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBesoinEnCarburantBesoinEnCarburant()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBesoinEnCarburant> aPourBesoinEnCarburantBesoinEnCarburant;

	/**
	 * The cached value of the '{@link #getDoitTenirCompteObstacle() <em>Doit Tenir Compte Obstacle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoitTenirCompteObstacle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> doitTenirCompteObstacle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDepannageEvacuationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDepannageEvacuation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDepannageEvacuationCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoDepannageEvacuationCategorie newCategorie) {
		TypeDictionaryDicoDepannageEvacuationCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoDepannageEvacuationCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoDepannageEvacuationSoutienNecessaire getSoutienNecessaire() {
		return soutienNecessaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoutienNecessaire(TypeDictionaryDicoDepannageEvacuationSoutienNecessaire newSoutienNecessaire) {
		TypeDictionaryDicoDepannageEvacuationSoutienNecessaire oldSoutienNecessaire = soutienNecessaire;
		soutienNecessaire = newSoutienNecessaire == null ? SOUTIEN_NECESSAIRE_EDEFAULT : newSoutienNecessaire;
		boolean oldSoutienNecessaireESet = soutienNecessaireESet;
		soutienNecessaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__SOUTIEN_NECESSAIRE, oldSoutienNecessaire, soutienNecessaire, !oldSoutienNecessaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoutienNecessaire() {
		TypeDictionaryDicoDepannageEvacuationSoutienNecessaire oldSoutienNecessaire = soutienNecessaire;
		boolean oldSoutienNecessaireESet = soutienNecessaireESet;
		soutienNecessaire = SOUTIEN_NECESSAIRE_EDEFAULT;
		soutienNecessaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__SOUTIEN_NECESSAIRE, oldSoutienNecessaire, SOUTIEN_NECESSAIRE_EDEFAULT, oldSoutienNecessaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoutienNecessaire() {
		return soutienNecessaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDemande() {
		return dateDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDemande(XMLGregorianCalendar newDateDemande) {
		XMLGregorianCalendar oldDateDemande = dateDemande;
		dateDemande = newDateDemande;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DATE_DEMANDE, oldDateDemande, dateDemande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral getCodeEtatGeneral() {
		return codeEtatGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeEtatGeneral(TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral newCodeEtatGeneral) {
		TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral oldCodeEtatGeneral = codeEtatGeneral;
		codeEtatGeneral = newCodeEtatGeneral == null ? CODE_ETAT_GENERAL_EDEFAULT : newCodeEtatGeneral;
		boolean oldCodeEtatGeneralESet = codeEtatGeneralESet;
		codeEtatGeneralESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CODE_ETAT_GENERAL, oldCodeEtatGeneral, codeEtatGeneral, !oldCodeEtatGeneralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodeEtatGeneral() {
		TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral oldCodeEtatGeneral = codeEtatGeneral;
		boolean oldCodeEtatGeneralESet = codeEtatGeneralESet;
		codeEtatGeneral = CODE_ETAT_GENERAL_EDEFAULT;
		codeEtatGeneralESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CODE_ETAT_GENERAL, oldCodeEtatGeneral, CODE_ETAT_GENERAL_EDEFAULT, oldCodeEtatGeneralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodeEtatGeneral() {
		return codeEtatGeneralESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagnosticSommaire() {
		return diagnosticSommaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticSommaire(String newDiagnosticSommaire) {
		String oldDiagnosticSommaire = diagnosticSommaire;
		diagnosticSommaire = newDiagnosticSommaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DIAGNOSTIC_SOMMAIRE, oldDiagnosticSommaire, diagnosticSommaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDepannageEvacuationEquipageDisponible getEquipageDisponible() {
		return equipageDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquipageDisponible(TypeDictionaryDicoDepannageEvacuationEquipageDisponible newEquipageDisponible) {
		TypeDictionaryDicoDepannageEvacuationEquipageDisponible oldEquipageDisponible = equipageDisponible;
		equipageDisponible = newEquipageDisponible == null ? EQUIPAGE_DISPONIBLE_EDEFAULT : newEquipageDisponible;
		boolean oldEquipageDisponibleESet = equipageDisponibleESet;
		equipageDisponibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EQUIPAGE_DISPONIBLE, oldEquipageDisponible, equipageDisponible, !oldEquipageDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEquipageDisponible() {
		TypeDictionaryDicoDepannageEvacuationEquipageDisponible oldEquipageDisponible = equipageDisponible;
		boolean oldEquipageDisponibleESet = equipageDisponibleESet;
		equipageDisponible = EQUIPAGE_DISPONIBLE_EDEFAULT;
		equipageDisponibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EQUIPAGE_DISPONIBLE, oldEquipageDisponible, EQUIPAGE_DISPONIBLE_EDEFAULT, oldEquipageDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEquipageDisponible() {
		return equipageDisponibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation getPossibiliteEvacuation() {
		return possibiliteEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossibiliteEvacuation(TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation newPossibiliteEvacuation) {
		TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation oldPossibiliteEvacuation = possibiliteEvacuation;
		possibiliteEvacuation = newPossibiliteEvacuation == null ? POSSIBILITE_EVACUATION_EDEFAULT : newPossibiliteEvacuation;
		boolean oldPossibiliteEvacuationESet = possibiliteEvacuationESet;
		possibiliteEvacuationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__POSSIBILITE_EVACUATION, oldPossibiliteEvacuation, possibiliteEvacuation, !oldPossibiliteEvacuationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPossibiliteEvacuation() {
		TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation oldPossibiliteEvacuation = possibiliteEvacuation;
		boolean oldPossibiliteEvacuationESet = possibiliteEvacuationESet;
		possibiliteEvacuation = POSSIBILITE_EVACUATION_EDEFAULT;
		possibiliteEvacuationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__POSSIBILITE_EVACUATION, oldPossibiliteEvacuation, POSSIBILITE_EVACUATION_EDEFAULT, oldPossibiliteEvacuationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPossibiliteEvacuation() {
		return possibiliteEvacuationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyensSupplementairesDemandes() {
		return moyensSupplementairesDemandes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyensSupplementairesDemandes(String newMoyensSupplementairesDemandes) {
		String oldMoyensSupplementairesDemandes = moyensSupplementairesDemandes;
		moyensSupplementairesDemandes = newMoyensSupplementairesDemandes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOYENS_SUPPLEMENTAIRES_DEMANDES, oldMoyensSupplementairesDemandes, moyensSupplementairesDemandes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotifAnnulation() {
		return motifAnnulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotifAnnulation(String newMotifAnnulation) {
		String oldMotifAnnulation = motifAnnulation;
		motifAnnulation = newMotifAnnulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOTIF_ANNULATION, oldMotifAnnulation, motifAnnulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDepannageEvacuationTypeCompteRendu getTypeCompteRendu() {
		return typeCompteRendu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCompteRendu(TypeDictionaryDicoDepannageEvacuationTypeCompteRendu newTypeCompteRendu) {
		TypeDictionaryDicoDepannageEvacuationTypeCompteRendu oldTypeCompteRendu = typeCompteRendu;
		typeCompteRendu = newTypeCompteRendu == null ? TYPE_COMPTE_RENDU_EDEFAULT : newTypeCompteRendu;
		boolean oldTypeCompteRenduESet = typeCompteRenduESet;
		typeCompteRenduESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__TYPE_COMPTE_RENDU, oldTypeCompteRendu, typeCompteRendu, !oldTypeCompteRenduESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCompteRendu() {
		TypeDictionaryDicoDepannageEvacuationTypeCompteRendu oldTypeCompteRendu = typeCompteRendu;
		boolean oldTypeCompteRenduESet = typeCompteRenduESet;
		typeCompteRendu = TYPE_COMPTE_RENDU_EDEFAULT;
		typeCompteRenduESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__TYPE_COMPTE_RENDU, oldTypeCompteRendu, TYPE_COMPTE_RENDU_EDEFAULT, oldTypeCompteRenduESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCompteRendu() {
		return typeCompteRenduESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteConcerneeUnite() {
		if (aPourUniteConcerneeUnite == null) {
			aPourUniteConcerneeUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_CONCERNEE_UNITE);
		}
		return aPourUniteConcerneeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourUniteExecutanteUnite() {
		if (aPourUniteExecutanteUnite == null) {
			aPourUniteExecutanteUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_EXECUTANTE_UNITE);
		}
		return aPourUniteExecutanteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationDepEvacuationDepEvacuation() {
		if (estObjetAssociationDepEvacuationDepEvacuation == null) {
			estObjetAssociationDepEvacuationDepEvacuation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_OBJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION);
		}
		return estObjetAssociationDepEvacuationDepEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationDepEvacuationDepEvacuation() {
		if (estSujetAssociationDepEvacuationDepEvacuation == null) {
			estSujetAssociationDepEvacuationDepEvacuation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_SUJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION);
		}
		return estSujetAssociationDepEvacuationDepEvacuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourAtelierUnite() {
		return aPourAtelierUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourAtelierUnite(TypeAssociation newAPourAtelierUnite, NotificationChain msgs) {
		TypeAssociation oldAPourAtelierUnite = aPourAtelierUnite;
		aPourAtelierUnite = newAPourAtelierUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE, oldAPourAtelierUnite, newAPourAtelierUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourAtelierUnite(TypeAssociation newAPourAtelierUnite) {
		if (newAPourAtelierUnite != aPourAtelierUnite) {
			NotificationChain msgs = null;
			if (aPourAtelierUnite != null)
				msgs = ((InternalEObject)aPourAtelierUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE, null, msgs);
			if (newAPourAtelierUnite != null)
				msgs = ((InternalEObject)newAPourAtelierUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE, null, msgs);
			msgs = basicSetAPourAtelierUnite(newAPourAtelierUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE, newAPourAtelierUnite, newAPourAtelierUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourLieuRendezVousAutreElementControle() {
		return aPourLieuRendezVousAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLieuRendezVousAutreElementControle(TypeAssociation newAPourLieuRendezVousAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourLieuRendezVousAutreElementControle = aPourLieuRendezVousAutreElementControle;
		aPourLieuRendezVousAutreElementControle = newAPourLieuRendezVousAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, oldAPourLieuRendezVousAutreElementControle, newAPourLieuRendezVousAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLieuRendezVousAutreElementControle(TypeAssociation newAPourLieuRendezVousAutreElementControle) {
		if (newAPourLieuRendezVousAutreElementControle != aPourLieuRendezVousAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourLieuRendezVousAutreElementControle != null)
				msgs = ((InternalEObject)aPourLieuRendezVousAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourLieuRendezVousAutreElementControle != null)
				msgs = ((InternalEObject)newAPourLieuRendezVousAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourLieuRendezVousAutreElementControle(newAPourLieuRendezVousAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, newAPourLieuRendezVousAutreElementControle, newAPourLieuRendezVousAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyenDepannage> getNecessiteMoyenDepannage() {
		if (necessiteMoyenDepannage == null) {
			necessiteMoyenDepannage = new EObjectContainmentEList<TypeMoyenDepannage>(TypeMoyenDepannage.class, this, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__NECESSITE_MOYEN_DEPANNAGE);
		}
		return necessiteMoyenDepannage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBesoinEnCarburant> getAPourBesoinEnCarburantBesoinEnCarburant() {
		if (aPourBesoinEnCarburantBesoinEnCarburant == null) {
			aPourBesoinEnCarburantBesoinEnCarburant = new EObjectContainmentEList<TypeBesoinEnCarburant>(TypeBesoinEnCarburant.class, this, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_BESOIN_EN_CARBURANT_BESOIN_EN_CARBURANT);
		}
		return aPourBesoinEnCarburantBesoinEnCarburant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDoitTenirCompteObstacle() {
		if (doitTenirCompteObstacle == null) {
			doitTenirCompteObstacle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DOIT_TENIR_COMPTE_OBSTACLE);
		}
		return doitTenirCompteObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_CONCERNEE_UNITE:
				return ((InternalEList<?>)getAPourUniteConcerneeUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_EXECUTANTE_UNITE:
				return ((InternalEList<?>)getAPourUniteExecutanteUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_OBJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return ((InternalEList<?>)getEstObjetAssociationDepEvacuationDepEvacuation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_SUJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return ((InternalEList<?>)getEstSujetAssociationDepEvacuationDepEvacuation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE:
				return basicSetAPourAtelierUnite(null, msgs);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourLieuRendezVousAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__NECESSITE_MOYEN_DEPANNAGE:
				return ((InternalEList<?>)getNecessiteMoyenDepannage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_BESOIN_EN_CARBURANT_BESOIN_EN_CARBURANT:
				return ((InternalEList<?>)getAPourBesoinEnCarburantBesoinEnCarburant()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DOIT_TENIR_COMPTE_OBSTACLE:
				return ((InternalEList<?>)getDoitTenirCompteObstacle()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__SOUTIEN_NECESSAIRE:
				return getSoutienNecessaire();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DATE_DEMANDE:
				return getDateDemande();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CODE_ETAT_GENERAL:
				return getCodeEtatGeneral();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DIAGNOSTIC_SOMMAIRE:
				return getDiagnosticSommaire();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EQUIPAGE_DISPONIBLE:
				return getEquipageDisponible();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__POSSIBILITE_EVACUATION:
				return getPossibiliteEvacuation();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOYENS_SUPPLEMENTAIRES_DEMANDES:
				return getMoyensSupplementairesDemandes();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOTIF_ANNULATION:
				return getMotifAnnulation();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__TYPE_COMPTE_RENDU:
				return getTypeCompteRendu();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_CONCERNEE_UNITE:
				return getAPourUniteConcerneeUnite();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_EXECUTANTE_UNITE:
				return getAPourUniteExecutanteUnite();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_OBJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return getEstObjetAssociationDepEvacuationDepEvacuation();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_SUJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return getEstSujetAssociationDepEvacuationDepEvacuation();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE:
				return getAPourAtelierUnite();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return getAPourLieuRendezVousAutreElementControle();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__NECESSITE_MOYEN_DEPANNAGE:
				return getNecessiteMoyenDepannage();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_BESOIN_EN_CARBURANT_BESOIN_EN_CARBURANT:
				return getAPourBesoinEnCarburantBesoinEnCarburant();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DOIT_TENIR_COMPTE_OBSTACLE:
				return getDoitTenirCompteObstacle();
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
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CATEGORIE:
				setCategorie((TypeDictionaryDicoDepannageEvacuationCategorie)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__SOUTIEN_NECESSAIRE:
				setSoutienNecessaire((TypeDictionaryDicoDepannageEvacuationSoutienNecessaire)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DATE_DEMANDE:
				setDateDemande((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CODE_ETAT_GENERAL:
				setCodeEtatGeneral((TypeDictionaryDicoDepannageEvacuationCodeEtatGeneral)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DIAGNOSTIC_SOMMAIRE:
				setDiagnosticSommaire((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EQUIPAGE_DISPONIBLE:
				setEquipageDisponible((TypeDictionaryDicoDepannageEvacuationEquipageDisponible)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__POSSIBILITE_EVACUATION:
				setPossibiliteEvacuation((TypeDictionaryDicoDepannageEvacuationPossibiliteEvacuation)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOYENS_SUPPLEMENTAIRES_DEMANDES:
				setMoyensSupplementairesDemandes((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOTIF_ANNULATION:
				setMotifAnnulation((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__TYPE_COMPTE_RENDU:
				setTypeCompteRendu((TypeDictionaryDicoDepannageEvacuationTypeCompteRendu)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				getAPourUniteConcerneeUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				getAPourUniteExecutanteUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_OBJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				getEstObjetAssociationDepEvacuationDepEvacuation().clear();
				getEstObjetAssociationDepEvacuationDepEvacuation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_SUJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				getEstSujetAssociationDepEvacuationDepEvacuation().clear();
				getEstSujetAssociationDepEvacuationDepEvacuation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE:
				setAPourAtelierUnite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuRendezVousAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__NECESSITE_MOYEN_DEPANNAGE:
				getNecessiteMoyenDepannage().clear();
				getNecessiteMoyenDepannage().addAll((Collection<? extends TypeMoyenDepannage>)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_BESOIN_EN_CARBURANT_BESOIN_EN_CARBURANT:
				getAPourBesoinEnCarburantBesoinEnCarburant().clear();
				getAPourBesoinEnCarburantBesoinEnCarburant().addAll((Collection<? extends TypeBesoinEnCarburant>)newValue);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DOIT_TENIR_COMPTE_OBSTACLE:
				getDoitTenirCompteObstacle().clear();
				getDoitTenirCompteObstacle().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__SOUTIEN_NECESSAIRE:
				unsetSoutienNecessaire();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DATE_DEMANDE:
				setDateDemande(DATE_DEMANDE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CODE_ETAT_GENERAL:
				unsetCodeEtatGeneral();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DIAGNOSTIC_SOMMAIRE:
				setDiagnosticSommaire(DIAGNOSTIC_SOMMAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EQUIPAGE_DISPONIBLE:
				unsetEquipageDisponible();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__POSSIBILITE_EVACUATION:
				unsetPossibiliteEvacuation();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOYENS_SUPPLEMENTAIRES_DEMANDES:
				setMoyensSupplementairesDemandes(MOYENS_SUPPLEMENTAIRES_DEMANDES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOTIF_ANNULATION:
				setMotifAnnulation(MOTIF_ANNULATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__TYPE_COMPTE_RENDU:
				unsetTypeCompteRendu();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_CONCERNEE_UNITE:
				getAPourUniteConcerneeUnite().clear();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_EXECUTANTE_UNITE:
				getAPourUniteExecutanteUnite().clear();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_OBJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				getEstObjetAssociationDepEvacuationDepEvacuation().clear();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_SUJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				getEstSujetAssociationDepEvacuationDepEvacuation().clear();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE:
				setAPourAtelierUnite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				setAPourLieuRendezVousAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__NECESSITE_MOYEN_DEPANNAGE:
				getNecessiteMoyenDepannage().clear();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_BESOIN_EN_CARBURANT_BESOIN_EN_CARBURANT:
				getAPourBesoinEnCarburantBesoinEnCarburant().clear();
				return;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DOIT_TENIR_COMPTE_OBSTACLE:
				getDoitTenirCompteObstacle().clear();
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
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__SOUTIEN_NECESSAIRE:
				return isSetSoutienNecessaire();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DATE_DEMANDE:
				return DATE_DEMANDE_EDEFAULT == null ? dateDemande != null : !DATE_DEMANDE_EDEFAULT.equals(dateDemande);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__CODE_ETAT_GENERAL:
				return isSetCodeEtatGeneral();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DIAGNOSTIC_SOMMAIRE:
				return DIAGNOSTIC_SOMMAIRE_EDEFAULT == null ? diagnosticSommaire != null : !DIAGNOSTIC_SOMMAIRE_EDEFAULT.equals(diagnosticSommaire);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EQUIPAGE_DISPONIBLE:
				return isSetEquipageDisponible();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__POSSIBILITE_EVACUATION:
				return isSetPossibiliteEvacuation();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOYENS_SUPPLEMENTAIRES_DEMANDES:
				return MOYENS_SUPPLEMENTAIRES_DEMANDES_EDEFAULT == null ? moyensSupplementairesDemandes != null : !MOYENS_SUPPLEMENTAIRES_DEMANDES_EDEFAULT.equals(moyensSupplementairesDemandes);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__MOTIF_ANNULATION:
				return MOTIF_ANNULATION_EDEFAULT == null ? motifAnnulation != null : !MOTIF_ANNULATION_EDEFAULT.equals(motifAnnulation);
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__TYPE_COMPTE_RENDU:
				return isSetTypeCompteRendu();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_CONCERNEE_UNITE:
				return aPourUniteConcerneeUnite != null && !aPourUniteConcerneeUnite.isEmpty();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_UNITE_EXECUTANTE_UNITE:
				return aPourUniteExecutanteUnite != null && !aPourUniteExecutanteUnite.isEmpty();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_OBJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return estObjetAssociationDepEvacuationDepEvacuation != null && !estObjetAssociationDepEvacuationDepEvacuation.isEmpty();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__EST_SUJET_ASSOCIATION_DEP_EVACUATION_DEP_EVACUATION:
				return estSujetAssociationDepEvacuationDepEvacuation != null && !estSujetAssociationDepEvacuationDepEvacuation.isEmpty();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_ATELIER_UNITE:
				return aPourAtelierUnite != null;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_LIEU_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return aPourLieuRendezVousAutreElementControle != null;
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__NECESSITE_MOYEN_DEPANNAGE:
				return necessiteMoyenDepannage != null && !necessiteMoyenDepannage.isEmpty();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__APOUR_BESOIN_EN_CARBURANT_BESOIN_EN_CARBURANT:
				return aPourBesoinEnCarburantBesoinEnCarburant != null && !aPourBesoinEnCarburantBesoinEnCarburant.isEmpty();
			case SchemaPackage.TYPE_DEPANNAGE_EVACUATION__DOIT_TENIR_COMPTE_OBSTACLE:
				return doitTenirCompteObstacle != null && !doitTenirCompteObstacle.isEmpty();
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
		result.append(", soutienNecessaire: ");
		if (soutienNecessaireESet) result.append(soutienNecessaire); else result.append("<unset>");
		result.append(", dateDemande: ");
		result.append(dateDemande);
		result.append(", codeEtatGeneral: ");
		if (codeEtatGeneralESet) result.append(codeEtatGeneral); else result.append("<unset>");
		result.append(", diagnosticSommaire: ");
		result.append(diagnosticSommaire);
		result.append(", equipageDisponible: ");
		if (equipageDisponibleESet) result.append(equipageDisponible); else result.append("<unset>");
		result.append(", possibiliteEvacuation: ");
		if (possibiliteEvacuationESet) result.append(possibiliteEvacuation); else result.append("<unset>");
		result.append(", moyensSupplementairesDemandes: ");
		result.append(moyensSupplementairesDemandes);
		result.append(", motifAnnulation: ");
		result.append(motifAnnulation);
		result.append(", typeCompteRendu: ");
		if (typeCompteRenduESet) result.append(typeCompteRendu); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeDepannageEvacuationImpl
