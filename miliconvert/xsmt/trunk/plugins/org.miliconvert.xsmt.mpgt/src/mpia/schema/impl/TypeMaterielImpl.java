/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme;
import mpia.schema.TypeDictionaryDicoMaterielStatut;
import mpia.schema.TypeEtatOperationnelMateriel;
import mpia.schema.TypeMateriel;
import mpia.schema.TypeTypeSousSysteme;

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
 * An implementation of the model object '<em><b>Type Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getNumeroSerie <em>Numero Serie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getIdentification <em>Identification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getStatut <em>Statut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getSuiviMines <em>Suivi Mines</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getSignatureEnveloppe <em>Signature Enveloppe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getAPourTypeAssociationMaterielTypeMateriel <em>APour Type Association Materiel Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getAPourEtatEtatOperationnelMateriel <em>APour Etat Etat Operationnel Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstObjetAssociationEntiteOrgMateriel <em>Est Objet Association Entite Org Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getAPourChargementChargementMateriel <em>APour Chargement Chargement Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getAPourSousSystemeEnPanneTypeSousSysteme <em>APour Sous Systeme En Panne Type Sous Systeme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getAPourSituationRadiationSituationRadiation <em>APour Situation Radiation Situation Radiation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstSujetAssociationMaterielEvenement <em>Est Sujet Association Materiel Evenement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstSujetAssociationMaterielSite <em>Est Sujet Association Materiel Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstSujetAssociationMaterielPersonne <em>Est Sujet Association Materiel Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstObjetAssociationMaterielMateriel <em>Est Objet Association Materiel Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstSujetAssociationMaterielMateriel <em>Est Sujet Association Materiel Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstSujetAssociationMaterielEltCtrl <em>Est Sujet Association Materiel Elt Ctrl</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstObjetAssociationEltCtrlMateriel <em>Est Objet Association Elt Ctrl Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstSujetAssociationMaterielEltTopo <em>Est Sujet Association Materiel Elt Topo</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstObjetAssociationSiteMateriel <em>Est Objet Association Site Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstObjetAssociationPersonneMateriel <em>Est Objet Association Personne Materiel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstSujetAssociationMaterielObjetInconnu <em>Est Sujet Association Materiel Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMaterielImpl#getEstSujetAssociationMaterielMeteorologie <em>Est Sujet Association Materiel Meteorologie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeMaterielImpl extends TypeInstanceObjetImpl implements TypeMateriel {
	/**
	 * The default value of the '{@link #getNumeroSerie() <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerie()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_SERIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroSerie() <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerie()
	 * @generated
	 * @ordered
	 */
	protected String numeroSerie = NUMERO_SERIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentification() <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentification() <em>Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentification()
	 * @generated
	 * @ordered
	 */
	protected String identification = IDENTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEntitePolitiqueTrigramme NATIONALITE_EDEFAULT = TypeDictionaryDicoEntitePolitiqueTrigramme.ATG;

	/**
	 * The cached value of the '{@link #getNationalite() <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNationalite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEntitePolitiqueTrigramme nationalite = NATIONALITE_EDEFAULT;

	/**
	 * This is true if the Nationalite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nationaliteESet;

	/**
	 * The default value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMaterielStatut STATUT_EDEFAULT = TypeDictionaryDicoMaterielStatut.CIV;

	/**
	 * The cached value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMaterielStatut statut = STATUT_EDEFAULT;

	/**
	 * This is true if the Statut attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statutESet;

	/**
	 * The default value of the '{@link #getSuiviMines() <em>Suivi Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuiviMines()
	 * @generated
	 * @ordered
	 */
	protected static final String SUIVI_MINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuiviMines() <em>Suivi Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuiviMines()
	 * @generated
	 * @ordered
	 */
	protected String suiviMines = SUIVI_MINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignatureEnveloppe() <em>Signature Enveloppe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureEnveloppe()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_ENVELOPPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignatureEnveloppe() <em>Signature Enveloppe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureEnveloppe()
	 * @generated
	 * @ordered
	 */
	protected String signatureEnveloppe = SIGNATURE_ENVELOPPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourTypeAssociationMaterielTypeMateriel() <em>APour Type Association Materiel Type Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeAssociationMaterielTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourTypeAssociationMaterielTypeMateriel;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatOperationnelMateriel() <em>APour Etat Etat Operationnel Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatOperationnelMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatOperationnelMateriel> aPourEtatEtatOperationnelMateriel;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEntiteOrgMateriel() <em>Est Objet Association Entite Org Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEntiteOrgMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEntiteOrgMateriel;

	/**
	 * The cached value of the '{@link #getAPourChargementChargementMateriel() <em>APour Chargement Chargement Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourChargementChargementMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourChargementChargementMateriel;

	/**
	 * The cached value of the '{@link #getAPourSousSystemeEnPanneTypeSousSysteme() <em>APour Sous Systeme En Panne Type Sous Systeme</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSousSystemeEnPanneTypeSousSysteme()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeSousSysteme> aPourSousSystemeEnPanneTypeSousSysteme;

	/**
	 * The cached value of the '{@link #getAPourSituationRadiationSituationRadiation() <em>APour Situation Radiation Situation Radiation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSituationRadiationSituationRadiation()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSituationRadiationSituationRadiation;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMaterielEvenement() <em>Est Sujet Association Materiel Evenement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMaterielEvenement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMaterielEvenement;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMaterielSite() <em>Est Sujet Association Materiel Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMaterielSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMaterielSite;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMaterielPersonne() <em>Est Sujet Association Materiel Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMaterielPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMaterielPersonne;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMaterielMateriel() <em>Est Objet Association Materiel Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMaterielMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMaterielMateriel;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMaterielMateriel() <em>Est Sujet Association Materiel Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMaterielMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMaterielMateriel;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMaterielEltCtrl() <em>Est Sujet Association Materiel Elt Ctrl</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMaterielEltCtrl()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMaterielEltCtrl;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationEltCtrlMateriel() <em>Est Objet Association Elt Ctrl Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationEltCtrlMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationEltCtrlMateriel;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMaterielEltTopo() <em>Est Sujet Association Materiel Elt Topo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMaterielEltTopo()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMaterielEltTopo;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationSiteMateriel() <em>Est Objet Association Site Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationSiteMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationSiteMateriel;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationPersonneMateriel() <em>Est Objet Association Personne Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationPersonneMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationPersonneMateriel;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMaterielObjetInconnu() <em>Est Sujet Association Materiel Objet Inconnu</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMaterielObjetInconnu()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMaterielObjetInconnu;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationMaterielMeteorologie() <em>Est Sujet Association Materiel Meteorologie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationMaterielMeteorologie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationMaterielMeteorologie;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroSerie() {
		return numeroSerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroSerie(String newNumeroSerie) {
		String oldNumeroSerie = numeroSerie;
		numeroSerie = newNumeroSerie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MATERIEL__NUMERO_SERIE, oldNumeroSerie, numeroSerie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentification() {
		return identification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentification(String newIdentification) {
		String oldIdentification = identification;
		identification = newIdentification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MATERIEL__IDENTIFICATION, oldIdentification, identification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite() {
		return nationalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme newNationalite) {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		nationalite = newNationalite == null ? NATIONALITE_EDEFAULT : newNationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationaliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MATERIEL__NATIONALITE, oldNationalite, nationalite, !oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNationalite() {
		TypeDictionaryDicoEntitePolitiqueTrigramme oldNationalite = nationalite;
		boolean oldNationaliteESet = nationaliteESet;
		nationalite = NATIONALITE_EDEFAULT;
		nationaliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MATERIEL__NATIONALITE, oldNationalite, NATIONALITE_EDEFAULT, oldNationaliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNationalite() {
		return nationaliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMaterielStatut getStatut() {
		return statut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatut(TypeDictionaryDicoMaterielStatut newStatut) {
		TypeDictionaryDicoMaterielStatut oldStatut = statut;
		statut = newStatut == null ? STATUT_EDEFAULT : newStatut;
		boolean oldStatutESet = statutESet;
		statutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MATERIEL__STATUT, oldStatut, statut, !oldStatutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatut() {
		TypeDictionaryDicoMaterielStatut oldStatut = statut;
		boolean oldStatutESet = statutESet;
		statut = STATUT_EDEFAULT;
		statutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MATERIEL__STATUT, oldStatut, STATUT_EDEFAULT, oldStatutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatut() {
		return statutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuiviMines() {
		return suiviMines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuiviMines(String newSuiviMines) {
		String oldSuiviMines = suiviMines;
		suiviMines = newSuiviMines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MATERIEL__SUIVI_MINES, oldSuiviMines, suiviMines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignatureEnveloppe() {
		return signatureEnveloppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignatureEnveloppe(String newSignatureEnveloppe) {
		String oldSignatureEnveloppe = signatureEnveloppe;
		signatureEnveloppe = newSignatureEnveloppe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MATERIEL__SIGNATURE_ENVELOPPE, oldSignatureEnveloppe, signatureEnveloppe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourTypeAssociationMaterielTypeMateriel() {
		if (aPourTypeAssociationMaterielTypeMateriel == null) {
			aPourTypeAssociationMaterielTypeMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__APOUR_TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL);
		}
		return aPourTypeAssociationMaterielTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatOperationnelMateriel> getAPourEtatEtatOperationnelMateriel() {
		if (aPourEtatEtatOperationnelMateriel == null) {
			aPourEtatEtatOperationnelMateriel = new EObjectContainmentEList<TypeEtatOperationnelMateriel>(TypeEtatOperationnelMateriel.class, this, SchemaPackage.TYPE_MATERIEL__APOUR_ETAT_ETAT_OPERATIONNEL_MATERIEL);
		}
		return aPourEtatEtatOperationnelMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEntiteOrgMateriel() {
		if (estObjetAssociationEntiteOrgMateriel == null) {
			estObjetAssociationEntiteOrgMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ENTITE_ORG_MATERIEL);
		}
		return estObjetAssociationEntiteOrgMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourChargementChargementMateriel() {
		if (aPourChargementChargementMateriel == null) {
			aPourChargementChargementMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__APOUR_CHARGEMENT_CHARGEMENT_MATERIEL);
		}
		return aPourChargementChargementMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeSousSysteme> getAPourSousSystemeEnPanneTypeSousSysteme() {
		if (aPourSousSystemeEnPanneTypeSousSysteme == null) {
			aPourSousSystemeEnPanneTypeSousSysteme = new EObjectContainmentEList<TypeTypeSousSysteme>(TypeTypeSousSysteme.class, this, SchemaPackage.TYPE_MATERIEL__APOUR_SOUS_SYSTEME_EN_PANNE_TYPE_SOUS_SYSTEME);
		}
		return aPourSousSystemeEnPanneTypeSousSysteme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSituationRadiationSituationRadiation() {
		return aPourSituationRadiationSituationRadiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSituationRadiationSituationRadiation(TypeAssociation newAPourSituationRadiationSituationRadiation, NotificationChain msgs) {
		TypeAssociation oldAPourSituationRadiationSituationRadiation = aPourSituationRadiationSituationRadiation;
		aPourSituationRadiationSituationRadiation = newAPourSituationRadiationSituationRadiation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION, oldAPourSituationRadiationSituationRadiation, newAPourSituationRadiationSituationRadiation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSituationRadiationSituationRadiation(TypeAssociation newAPourSituationRadiationSituationRadiation) {
		if (newAPourSituationRadiationSituationRadiation != aPourSituationRadiationSituationRadiation) {
			NotificationChain msgs = null;
			if (aPourSituationRadiationSituationRadiation != null)
				msgs = ((InternalEObject)aPourSituationRadiationSituationRadiation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION, null, msgs);
			if (newAPourSituationRadiationSituationRadiation != null)
				msgs = ((InternalEObject)newAPourSituationRadiationSituationRadiation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION, null, msgs);
			msgs = basicSetAPourSituationRadiationSituationRadiation(newAPourSituationRadiationSituationRadiation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION, newAPourSituationRadiationSituationRadiation, newAPourSituationRadiationSituationRadiation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMaterielEvenement() {
		if (estSujetAssociationMaterielEvenement == null) {
			estSujetAssociationMaterielEvenement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_EVENEMENT);
		}
		return estSujetAssociationMaterielEvenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMaterielSite() {
		if (estSujetAssociationMaterielSite == null) {
			estSujetAssociationMaterielSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_SITE);
		}
		return estSujetAssociationMaterielSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMaterielPersonne() {
		if (estSujetAssociationMaterielPersonne == null) {
			estSujetAssociationMaterielPersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_PERSONNE);
		}
		return estSujetAssociationMaterielPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMaterielMateriel() {
		if (estObjetAssociationMaterielMateriel == null) {
			estObjetAssociationMaterielMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_MATERIEL_MATERIEL);
		}
		return estObjetAssociationMaterielMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMaterielMateriel() {
		if (estSujetAssociationMaterielMateriel == null) {
			estSujetAssociationMaterielMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_MATERIEL);
		}
		return estSujetAssociationMaterielMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMaterielEltCtrl() {
		if (estSujetAssociationMaterielEltCtrl == null) {
			estSujetAssociationMaterielEltCtrl = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_CTRL);
		}
		return estSujetAssociationMaterielEltCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationEltCtrlMateriel() {
		if (estObjetAssociationEltCtrlMateriel == null) {
			estObjetAssociationEltCtrlMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ELT_CTRL_MATERIEL);
		}
		return estObjetAssociationEltCtrlMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMaterielEltTopo() {
		if (estSujetAssociationMaterielEltTopo == null) {
			estSujetAssociationMaterielEltTopo = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_TOPO);
		}
		return estSujetAssociationMaterielEltTopo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationSiteMateriel() {
		if (estObjetAssociationSiteMateriel == null) {
			estObjetAssociationSiteMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_SITE_MATERIEL);
		}
		return estObjetAssociationSiteMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationPersonneMateriel() {
		if (estObjetAssociationPersonneMateriel == null) {
			estObjetAssociationPersonneMateriel = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_PERSONNE_MATERIEL);
		}
		return estObjetAssociationPersonneMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMaterielObjetInconnu() {
		if (estSujetAssociationMaterielObjetInconnu == null) {
			estSujetAssociationMaterielObjetInconnu = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_OBJET_INCONNU);
		}
		return estSujetAssociationMaterielObjetInconnu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationMaterielMeteorologie() {
		if (estSujetAssociationMaterielMeteorologie == null) {
			estSujetAssociationMaterielMeteorologie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_METEOROLOGIE);
		}
		return estSujetAssociationMaterielMeteorologie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MATERIEL__APOUR_TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				return ((InternalEList<?>)getAPourTypeAssociationMaterielTypeMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__APOUR_ETAT_ETAT_OPERATIONNEL_MATERIEL:
				return ((InternalEList<?>)getAPourEtatEtatOperationnelMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				return ((InternalEList<?>)getEstObjetAssociationEntiteOrgMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__APOUR_CHARGEMENT_CHARGEMENT_MATERIEL:
				return ((InternalEList<?>)getAPourChargementChargementMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__APOUR_SOUS_SYSTEME_EN_PANNE_TYPE_SOUS_SYSTEME:
				return ((InternalEList<?>)getAPourSousSystemeEnPanneTypeSousSysteme()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION:
				return basicSetAPourSituationRadiationSituationRadiation(null, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_EVENEMENT:
				return ((InternalEList<?>)getEstSujetAssociationMaterielEvenement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_SITE:
				return ((InternalEList<?>)getEstSujetAssociationMaterielSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_PERSONNE:
				return ((InternalEList<?>)getEstSujetAssociationMaterielPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_MATERIEL_MATERIEL:
				return ((InternalEList<?>)getEstObjetAssociationMaterielMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_MATERIEL:
				return ((InternalEList<?>)getEstSujetAssociationMaterielMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				return ((InternalEList<?>)getEstSujetAssociationMaterielEltCtrl()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				return ((InternalEList<?>)getEstObjetAssociationEltCtrlMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				return ((InternalEList<?>)getEstSujetAssociationMaterielEltTopo()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_SITE_MATERIEL:
				return ((InternalEList<?>)getEstObjetAssociationSiteMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_PERSONNE_MATERIEL:
				return ((InternalEList<?>)getEstObjetAssociationPersonneMateriel()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return ((InternalEList<?>)getEstSujetAssociationMaterielObjetInconnu()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				return ((InternalEList<?>)getEstSujetAssociationMaterielMeteorologie()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MATERIEL__NUMERO_SERIE:
				return getNumeroSerie();
			case SchemaPackage.TYPE_MATERIEL__IDENTIFICATION:
				return getIdentification();
			case SchemaPackage.TYPE_MATERIEL__NATIONALITE:
				return getNationalite();
			case SchemaPackage.TYPE_MATERIEL__STATUT:
				return getStatut();
			case SchemaPackage.TYPE_MATERIEL__SUIVI_MINES:
				return getSuiviMines();
			case SchemaPackage.TYPE_MATERIEL__SIGNATURE_ENVELOPPE:
				return getSignatureEnveloppe();
			case SchemaPackage.TYPE_MATERIEL__APOUR_TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				return getAPourTypeAssociationMaterielTypeMateriel();
			case SchemaPackage.TYPE_MATERIEL__APOUR_ETAT_ETAT_OPERATIONNEL_MATERIEL:
				return getAPourEtatEtatOperationnelMateriel();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				return getEstObjetAssociationEntiteOrgMateriel();
			case SchemaPackage.TYPE_MATERIEL__APOUR_CHARGEMENT_CHARGEMENT_MATERIEL:
				return getAPourChargementChargementMateriel();
			case SchemaPackage.TYPE_MATERIEL__APOUR_SOUS_SYSTEME_EN_PANNE_TYPE_SOUS_SYSTEME:
				return getAPourSousSystemeEnPanneTypeSousSysteme();
			case SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION:
				return getAPourSituationRadiationSituationRadiation();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_EVENEMENT:
				return getEstSujetAssociationMaterielEvenement();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_SITE:
				return getEstSujetAssociationMaterielSite();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_PERSONNE:
				return getEstSujetAssociationMaterielPersonne();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_MATERIEL_MATERIEL:
				return getEstObjetAssociationMaterielMateriel();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_MATERIEL:
				return getEstSujetAssociationMaterielMateriel();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				return getEstSujetAssociationMaterielEltCtrl();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				return getEstObjetAssociationEltCtrlMateriel();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				return getEstSujetAssociationMaterielEltTopo();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_SITE_MATERIEL:
				return getEstObjetAssociationSiteMateriel();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_PERSONNE_MATERIEL:
				return getEstObjetAssociationPersonneMateriel();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return getEstSujetAssociationMaterielObjetInconnu();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				return getEstSujetAssociationMaterielMeteorologie();
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
			case SchemaPackage.TYPE_MATERIEL__NUMERO_SERIE:
				setNumeroSerie((String)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__IDENTIFICATION:
				setIdentification((String)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__NATIONALITE:
				setNationalite((TypeDictionaryDicoEntitePolitiqueTrigramme)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__STATUT:
				setStatut((TypeDictionaryDicoMaterielStatut)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__SUIVI_MINES:
				setSuiviMines((String)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__SIGNATURE_ENVELOPPE:
				setSignatureEnveloppe((String)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				getAPourTypeAssociationMaterielTypeMateriel().clear();
				getAPourTypeAssociationMaterielTypeMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_ETAT_ETAT_OPERATIONNEL_MATERIEL:
				getAPourEtatEtatOperationnelMateriel().clear();
				getAPourEtatEtatOperationnelMateriel().addAll((Collection<? extends TypeEtatOperationnelMateriel>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				getEstObjetAssociationEntiteOrgMateriel().clear();
				getEstObjetAssociationEntiteOrgMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_CHARGEMENT_CHARGEMENT_MATERIEL:
				getAPourChargementChargementMateriel().clear();
				getAPourChargementChargementMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_SOUS_SYSTEME_EN_PANNE_TYPE_SOUS_SYSTEME:
				getAPourSousSystemeEnPanneTypeSousSysteme().clear();
				getAPourSousSystemeEnPanneTypeSousSysteme().addAll((Collection<? extends TypeTypeSousSysteme>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION:
				setAPourSituationRadiationSituationRadiation((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_EVENEMENT:
				getEstSujetAssociationMaterielEvenement().clear();
				getEstSujetAssociationMaterielEvenement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_SITE:
				getEstSujetAssociationMaterielSite().clear();
				getEstSujetAssociationMaterielSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_PERSONNE:
				getEstSujetAssociationMaterielPersonne().clear();
				getEstSujetAssociationMaterielPersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_MATERIEL_MATERIEL:
				getEstObjetAssociationMaterielMateriel().clear();
				getEstObjetAssociationMaterielMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_MATERIEL:
				getEstSujetAssociationMaterielMateriel().clear();
				getEstSujetAssociationMaterielMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				getEstSujetAssociationMaterielEltCtrl().clear();
				getEstSujetAssociationMaterielEltCtrl().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				getEstObjetAssociationEltCtrlMateriel().clear();
				getEstObjetAssociationEltCtrlMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				getEstSujetAssociationMaterielEltTopo().clear();
				getEstSujetAssociationMaterielEltTopo().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_SITE_MATERIEL:
				getEstObjetAssociationSiteMateriel().clear();
				getEstObjetAssociationSiteMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_PERSONNE_MATERIEL:
				getEstObjetAssociationPersonneMateriel().clear();
				getEstObjetAssociationPersonneMateriel().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				getEstSujetAssociationMaterielObjetInconnu().clear();
				getEstSujetAssociationMaterielObjetInconnu().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				getEstSujetAssociationMaterielMeteorologie().clear();
				getEstSujetAssociationMaterielMeteorologie().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MATERIEL__NUMERO_SERIE:
				setNumeroSerie(NUMERO_SERIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MATERIEL__IDENTIFICATION:
				setIdentification(IDENTIFICATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MATERIEL__NATIONALITE:
				unsetNationalite();
				return;
			case SchemaPackage.TYPE_MATERIEL__STATUT:
				unsetStatut();
				return;
			case SchemaPackage.TYPE_MATERIEL__SUIVI_MINES:
				setSuiviMines(SUIVI_MINES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MATERIEL__SIGNATURE_ENVELOPPE:
				setSignatureEnveloppe(SIGNATURE_ENVELOPPE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				getAPourTypeAssociationMaterielTypeMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_ETAT_ETAT_OPERATIONNEL_MATERIEL:
				getAPourEtatEtatOperationnelMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				getEstObjetAssociationEntiteOrgMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_CHARGEMENT_CHARGEMENT_MATERIEL:
				getAPourChargementChargementMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_SOUS_SYSTEME_EN_PANNE_TYPE_SOUS_SYSTEME:
				getAPourSousSystemeEnPanneTypeSousSysteme().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION:
				setAPourSituationRadiationSituationRadiation((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_EVENEMENT:
				getEstSujetAssociationMaterielEvenement().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_SITE:
				getEstSujetAssociationMaterielSite().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_PERSONNE:
				getEstSujetAssociationMaterielPersonne().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_MATERIEL_MATERIEL:
				getEstObjetAssociationMaterielMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_MATERIEL:
				getEstSujetAssociationMaterielMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				getEstSujetAssociationMaterielEltCtrl().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				getEstObjetAssociationEltCtrlMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				getEstSujetAssociationMaterielEltTopo().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_SITE_MATERIEL:
				getEstObjetAssociationSiteMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_PERSONNE_MATERIEL:
				getEstObjetAssociationPersonneMateriel().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				getEstSujetAssociationMaterielObjetInconnu().clear();
				return;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				getEstSujetAssociationMaterielMeteorologie().clear();
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
			case SchemaPackage.TYPE_MATERIEL__NUMERO_SERIE:
				return NUMERO_SERIE_EDEFAULT == null ? numeroSerie != null : !NUMERO_SERIE_EDEFAULT.equals(numeroSerie);
			case SchemaPackage.TYPE_MATERIEL__IDENTIFICATION:
				return IDENTIFICATION_EDEFAULT == null ? identification != null : !IDENTIFICATION_EDEFAULT.equals(identification);
			case SchemaPackage.TYPE_MATERIEL__NATIONALITE:
				return isSetNationalite();
			case SchemaPackage.TYPE_MATERIEL__STATUT:
				return isSetStatut();
			case SchemaPackage.TYPE_MATERIEL__SUIVI_MINES:
				return SUIVI_MINES_EDEFAULT == null ? suiviMines != null : !SUIVI_MINES_EDEFAULT.equals(suiviMines);
			case SchemaPackage.TYPE_MATERIEL__SIGNATURE_ENVELOPPE:
				return SIGNATURE_ENVELOPPE_EDEFAULT == null ? signatureEnveloppe != null : !SIGNATURE_ENVELOPPE_EDEFAULT.equals(signatureEnveloppe);
			case SchemaPackage.TYPE_MATERIEL__APOUR_TYPE_ASSOCIATION_MATERIEL_TYPE_MATERIEL:
				return aPourTypeAssociationMaterielTypeMateriel != null && !aPourTypeAssociationMaterielTypeMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__APOUR_ETAT_ETAT_OPERATIONNEL_MATERIEL:
				return aPourEtatEtatOperationnelMateriel != null && !aPourEtatEtatOperationnelMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ENTITE_ORG_MATERIEL:
				return estObjetAssociationEntiteOrgMateriel != null && !estObjetAssociationEntiteOrgMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__APOUR_CHARGEMENT_CHARGEMENT_MATERIEL:
				return aPourChargementChargementMateriel != null && !aPourChargementChargementMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__APOUR_SOUS_SYSTEME_EN_PANNE_TYPE_SOUS_SYSTEME:
				return aPourSousSystemeEnPanneTypeSousSysteme != null && !aPourSousSystemeEnPanneTypeSousSysteme.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__APOUR_SITUATION_RADIATION_SITUATION_RADIATION:
				return aPourSituationRadiationSituationRadiation != null;
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_EVENEMENT:
				return estSujetAssociationMaterielEvenement != null && !estSujetAssociationMaterielEvenement.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_SITE:
				return estSujetAssociationMaterielSite != null && !estSujetAssociationMaterielSite.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_PERSONNE:
				return estSujetAssociationMaterielPersonne != null && !estSujetAssociationMaterielPersonne.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_MATERIEL_MATERIEL:
				return estObjetAssociationMaterielMateriel != null && !estObjetAssociationMaterielMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_MATERIEL:
				return estSujetAssociationMaterielMateriel != null && !estSujetAssociationMaterielMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_CTRL:
				return estSujetAssociationMaterielEltCtrl != null && !estSujetAssociationMaterielEltCtrl.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_ELT_CTRL_MATERIEL:
				return estObjetAssociationEltCtrlMateriel != null && !estObjetAssociationEltCtrlMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_ELT_TOPO:
				return estSujetAssociationMaterielEltTopo != null && !estSujetAssociationMaterielEltTopo.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_SITE_MATERIEL:
				return estObjetAssociationSiteMateriel != null && !estObjetAssociationSiteMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_OBJET_ASSOCIATION_PERSONNE_MATERIEL:
				return estObjetAssociationPersonneMateriel != null && !estObjetAssociationPersonneMateriel.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_OBJET_INCONNU:
				return estSujetAssociationMaterielObjetInconnu != null && !estSujetAssociationMaterielObjetInconnu.isEmpty();
			case SchemaPackage.TYPE_MATERIEL__EST_SUJET_ASSOCIATION_MATERIEL_METEOROLOGIE:
				return estSujetAssociationMaterielMeteorologie != null && !estSujetAssociationMaterielMeteorologie.isEmpty();
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
		result.append(" (numeroSerie: ");
		result.append(numeroSerie);
		result.append(", identification: ");
		result.append(identification);
		result.append(", nationalite: ");
		if (nationaliteESet) result.append(nationalite); else result.append("<unset>");
		result.append(", statut: ");
		if (statutESet) result.append(statut); else result.append("<unset>");
		result.append(", suiviMines: ");
		result.append(suiviMines);
		result.append(", signatureEnveloppe: ");
		result.append(signatureEnveloppe);
		result.append(')');
		return result.toString();
	}

} //TypeMaterielImpl
