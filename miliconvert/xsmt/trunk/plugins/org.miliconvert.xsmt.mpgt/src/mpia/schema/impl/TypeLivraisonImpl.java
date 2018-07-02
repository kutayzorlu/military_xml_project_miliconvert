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
import mpia.schema.TypeDictionaryDicoLivraisonCategorie;
import mpia.schema.TypeDictionaryDicoLivraisonTypeChaineLogistique;
import mpia.schema.TypeLivraison;

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
 * An implementation of the model object '<em><b>Type Livraison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getTypeChaineLogistique <em>Type Chaine Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getDateRecompletement <em>Date Recompletement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getDateRecompletementOrdonne <em>Date Recompletement Ordonne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getDecisionAutorite <em>Decision Autorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getDateLivraison <em>Date Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#isDernierePrevisionDemande <em>Derniere Prevision Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#isDernierePrevisionOrdre <em>Derniere Prevision Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getEstDecritParLigneLivraison <em>Est Decrit Par Ligne Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getEstObjetAssociationUniteLivraison <em>Est Objet Association Unite Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getEstObjetAssociationLivraisonLivaison <em>Est Objet Association Livraison Livaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getEstSujetAssociationLivraisonLivaison <em>Est Sujet Association Livraison Livaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeLivraisonImpl#getAPourConvoiFaisantMouvementConvoi <em>APour Convoi Faisant Mouvement Convoi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeLivraisonImpl extends TypeActiviteImpl implements TypeLivraison {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLivraisonCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoLivraisonCategorie.DEL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLivraisonCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getTypeChaineLogistique() <em>Type Chaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeChaineLogistique()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLivraisonTypeChaineLogistique TYPE_CHAINE_LOGISTIQUE_EDEFAULT = TypeDictionaryDicoLivraisonTypeChaineLogistique.SPL;

	/**
	 * The cached value of the '{@link #getTypeChaineLogistique() <em>Type Chaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeChaineLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLivraisonTypeChaineLogistique typeChaineLogistique = TYPE_CHAINE_LOGISTIQUE_EDEFAULT;

	/**
	 * This is true if the Type Chaine Logistique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeChaineLogistiqueESet;

	/**
	 * The default value of the '{@link #getDateRecompletement() <em>Date Recompletement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRecompletement()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_RECOMPLETEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateRecompletement() <em>Date Recompletement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRecompletement()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateRecompletement = DATE_RECOMPLETEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateRecompletementOrdonne() <em>Date Recompletement Ordonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRecompletementOrdonne()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_RECOMPLETEMENT_ORDONNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateRecompletementOrdonne() <em>Date Recompletement Ordonne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateRecompletementOrdonne()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateRecompletementOrdonne = DATE_RECOMPLETEMENT_ORDONNE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecisionAutorite() <em>Decision Autorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionAutorite()
	 * @generated
	 * @ordered
	 */
	protected static final String DECISION_AUTORITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecisionAutorite() <em>Decision Autorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionAutorite()
	 * @generated
	 * @ordered
	 */
	protected String decisionAutorite = DECISION_AUTORITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLivraison() <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLivraison()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_LIVRAISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLivraison() <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLivraison()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateLivraison = DATE_LIVRAISON_EDEFAULT;

	/**
	 * The default value of the '{@link #isDernierePrevisionDemande() <em>Derniere Prevision Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDernierePrevisionDemande()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERNIERE_PREVISION_DEMANDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDernierePrevisionDemande() <em>Derniere Prevision Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDernierePrevisionDemande()
	 * @generated
	 * @ordered
	 */
	protected boolean dernierePrevisionDemande = DERNIERE_PREVISION_DEMANDE_EDEFAULT;

	/**
	 * This is true if the Derniere Prevision Demande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dernierePrevisionDemandeESet;

	/**
	 * The default value of the '{@link #isDernierePrevisionOrdre() <em>Derniere Prevision Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDernierePrevisionOrdre()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERNIERE_PREVISION_ORDRE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDernierePrevisionOrdre() <em>Derniere Prevision Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDernierePrevisionOrdre()
	 * @generated
	 * @ordered
	 */
	protected boolean dernierePrevisionOrdre = DERNIERE_PREVISION_ORDRE_EDEFAULT;

	/**
	 * This is true if the Derniere Prevision Ordre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dernierePrevisionOrdreESet;

	/**
	 * The cached value of the '{@link #getEstDecritParLigneLivraison() <em>Est Decrit Par Ligne Livraison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDecritParLigneLivraison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estDecritParLigneLivraison;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteLivraison() <em>Est Objet Association Unite Livraison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteLivraison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteLivraison;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationLivraisonLivaison() <em>Est Objet Association Livraison Livaison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationLivraisonLivaison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationLivraisonLivaison;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationLivraisonLivaison() <em>Est Sujet Association Livraison Livaison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationLivraisonLivaison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationLivraisonLivaison;

	/**
	 * The cached value of the '{@link #getAPourConvoiFaisantMouvementConvoi() <em>APour Convoi Faisant Mouvement Convoi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConvoiFaisantMouvementConvoi()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourConvoiFaisantMouvementConvoi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeLivraisonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeLivraison();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLivraisonCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoLivraisonCategorie newCategorie) {
		TypeDictionaryDicoLivraisonCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIVRAISON__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoLivraisonCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIVRAISON__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoLivraisonTypeChaineLogistique getTypeChaineLogistique() {
		return typeChaineLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeChaineLogistique(TypeDictionaryDicoLivraisonTypeChaineLogistique newTypeChaineLogistique) {
		TypeDictionaryDicoLivraisonTypeChaineLogistique oldTypeChaineLogistique = typeChaineLogistique;
		typeChaineLogistique = newTypeChaineLogistique == null ? TYPE_CHAINE_LOGISTIQUE_EDEFAULT : newTypeChaineLogistique;
		boolean oldTypeChaineLogistiqueESet = typeChaineLogistiqueESet;
		typeChaineLogistiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIVRAISON__TYPE_CHAINE_LOGISTIQUE, oldTypeChaineLogistique, typeChaineLogistique, !oldTypeChaineLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeChaineLogistique() {
		TypeDictionaryDicoLivraisonTypeChaineLogistique oldTypeChaineLogistique = typeChaineLogistique;
		boolean oldTypeChaineLogistiqueESet = typeChaineLogistiqueESet;
		typeChaineLogistique = TYPE_CHAINE_LOGISTIQUE_EDEFAULT;
		typeChaineLogistiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIVRAISON__TYPE_CHAINE_LOGISTIQUE, oldTypeChaineLogistique, TYPE_CHAINE_LOGISTIQUE_EDEFAULT, oldTypeChaineLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeChaineLogistique() {
		return typeChaineLogistiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateRecompletement() {
		return dateRecompletement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateRecompletement(XMLGregorianCalendar newDateRecompletement) {
		XMLGregorianCalendar oldDateRecompletement = dateRecompletement;
		dateRecompletement = newDateRecompletement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT, oldDateRecompletement, dateRecompletement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateRecompletementOrdonne() {
		return dateRecompletementOrdonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateRecompletementOrdonne(XMLGregorianCalendar newDateRecompletementOrdonne) {
		XMLGregorianCalendar oldDateRecompletementOrdonne = dateRecompletementOrdonne;
		dateRecompletementOrdonne = newDateRecompletementOrdonne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT_ORDONNE, oldDateRecompletementOrdonne, dateRecompletementOrdonne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecisionAutorite() {
		return decisionAutorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecisionAutorite(String newDecisionAutorite) {
		String oldDecisionAutorite = decisionAutorite;
		decisionAutorite = newDecisionAutorite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIVRAISON__DECISION_AUTORITE, oldDecisionAutorite, decisionAutorite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateLivraison() {
		return dateLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLivraison(XMLGregorianCalendar newDateLivraison) {
		XMLGregorianCalendar oldDateLivraison = dateLivraison;
		dateLivraison = newDateLivraison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIVRAISON__DATE_LIVRAISON, oldDateLivraison, dateLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDernierePrevisionDemande() {
		return dernierePrevisionDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDernierePrevisionDemande(boolean newDernierePrevisionDemande) {
		boolean oldDernierePrevisionDemande = dernierePrevisionDemande;
		dernierePrevisionDemande = newDernierePrevisionDemande;
		boolean oldDernierePrevisionDemandeESet = dernierePrevisionDemandeESet;
		dernierePrevisionDemandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_DEMANDE, oldDernierePrevisionDemande, dernierePrevisionDemande, !oldDernierePrevisionDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDernierePrevisionDemande() {
		boolean oldDernierePrevisionDemande = dernierePrevisionDemande;
		boolean oldDernierePrevisionDemandeESet = dernierePrevisionDemandeESet;
		dernierePrevisionDemande = DERNIERE_PREVISION_DEMANDE_EDEFAULT;
		dernierePrevisionDemandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_DEMANDE, oldDernierePrevisionDemande, DERNIERE_PREVISION_DEMANDE_EDEFAULT, oldDernierePrevisionDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDernierePrevisionDemande() {
		return dernierePrevisionDemandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDernierePrevisionOrdre() {
		return dernierePrevisionOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDernierePrevisionOrdre(boolean newDernierePrevisionOrdre) {
		boolean oldDernierePrevisionOrdre = dernierePrevisionOrdre;
		dernierePrevisionOrdre = newDernierePrevisionOrdre;
		boolean oldDernierePrevisionOrdreESet = dernierePrevisionOrdreESet;
		dernierePrevisionOrdreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_ORDRE, oldDernierePrevisionOrdre, dernierePrevisionOrdre, !oldDernierePrevisionOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDernierePrevisionOrdre() {
		boolean oldDernierePrevisionOrdre = dernierePrevisionOrdre;
		boolean oldDernierePrevisionOrdreESet = dernierePrevisionOrdreESet;
		dernierePrevisionOrdre = DERNIERE_PREVISION_ORDRE_EDEFAULT;
		dernierePrevisionOrdreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_ORDRE, oldDernierePrevisionOrdre, DERNIERE_PREVISION_ORDRE_EDEFAULT, oldDernierePrevisionOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDernierePrevisionOrdre() {
		return dernierePrevisionOrdreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstDecritParLigneLivraison() {
		if (estDecritParLigneLivraison == null) {
			estDecritParLigneLivraison = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LIVRAISON__EST_DECRIT_PAR_LIGNE_LIVRAISON);
		}
		return estDecritParLigneLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteLivraison() {
		if (estObjetAssociationUniteLivraison == null) {
			estObjetAssociationUniteLivraison = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_UNITE_LIVRAISON);
		}
		return estObjetAssociationUniteLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationLivraisonLivaison() {
		if (estObjetAssociationLivraisonLivaison == null) {
			estObjetAssociationLivraisonLivaison = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_LIVRAISON_LIVAISON);
		}
		return estObjetAssociationLivraisonLivaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationLivraisonLivaison() {
		if (estSujetAssociationLivraisonLivaison == null) {
			estSujetAssociationLivraisonLivaison = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LIVRAISON__EST_SUJET_ASSOCIATION_LIVRAISON_LIVAISON);
		}
		return estSujetAssociationLivraisonLivaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourConvoiFaisantMouvementConvoi() {
		if (aPourConvoiFaisantMouvementConvoi == null) {
			aPourConvoiFaisantMouvementConvoi = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_LIVRAISON__APOUR_CONVOI_FAISANT_MOUVEMENT_CONVOI);
		}
		return aPourConvoiFaisantMouvementConvoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_LIVRAISON__EST_DECRIT_PAR_LIGNE_LIVRAISON:
				return ((InternalEList<?>)getEstDecritParLigneLivraison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_UNITE_LIVRAISON:
				return ((InternalEList<?>)getEstObjetAssociationUniteLivraison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_LIVRAISON_LIVAISON:
				return ((InternalEList<?>)getEstObjetAssociationLivraisonLivaison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LIVRAISON__EST_SUJET_ASSOCIATION_LIVRAISON_LIVAISON:
				return ((InternalEList<?>)getEstSujetAssociationLivraisonLivaison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_LIVRAISON__APOUR_CONVOI_FAISANT_MOUVEMENT_CONVOI:
				return ((InternalEList<?>)getAPourConvoiFaisantMouvementConvoi()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_LIVRAISON__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_LIVRAISON__TYPE_CHAINE_LOGISTIQUE:
				return getTypeChaineLogistique();
			case SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT:
				return getDateRecompletement();
			case SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT_ORDONNE:
				return getDateRecompletementOrdonne();
			case SchemaPackage.TYPE_LIVRAISON__DECISION_AUTORITE:
				return getDecisionAutorite();
			case SchemaPackage.TYPE_LIVRAISON__DATE_LIVRAISON:
				return getDateLivraison();
			case SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_DEMANDE:
				return isDernierePrevisionDemande() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_ORDRE:
				return isDernierePrevisionOrdre() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_LIVRAISON__EST_DECRIT_PAR_LIGNE_LIVRAISON:
				return getEstDecritParLigneLivraison();
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_UNITE_LIVRAISON:
				return getEstObjetAssociationUniteLivraison();
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_LIVRAISON_LIVAISON:
				return getEstObjetAssociationLivraisonLivaison();
			case SchemaPackage.TYPE_LIVRAISON__EST_SUJET_ASSOCIATION_LIVRAISON_LIVAISON:
				return getEstSujetAssociationLivraisonLivaison();
			case SchemaPackage.TYPE_LIVRAISON__APOUR_CONVOI_FAISANT_MOUVEMENT_CONVOI:
				return getAPourConvoiFaisantMouvementConvoi();
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
			case SchemaPackage.TYPE_LIVRAISON__CATEGORIE:
				setCategorie((TypeDictionaryDicoLivraisonCategorie)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__TYPE_CHAINE_LOGISTIQUE:
				setTypeChaineLogistique((TypeDictionaryDicoLivraisonTypeChaineLogistique)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT:
				setDateRecompletement((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT_ORDONNE:
				setDateRecompletementOrdonne((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DECISION_AUTORITE:
				setDecisionAutorite((String)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DATE_LIVRAISON:
				setDateLivraison((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_DEMANDE:
				setDernierePrevisionDemande(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_ORDRE:
				setDernierePrevisionOrdre(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_LIVRAISON__EST_DECRIT_PAR_LIGNE_LIVRAISON:
				getEstDecritParLigneLivraison().clear();
				getEstDecritParLigneLivraison().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_UNITE_LIVRAISON:
				getEstObjetAssociationUniteLivraison().clear();
				getEstObjetAssociationUniteLivraison().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_LIVRAISON_LIVAISON:
				getEstObjetAssociationLivraisonLivaison().clear();
				getEstObjetAssociationLivraisonLivaison().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__EST_SUJET_ASSOCIATION_LIVRAISON_LIVAISON:
				getEstSujetAssociationLivraisonLivaison().clear();
				getEstSujetAssociationLivraisonLivaison().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_LIVRAISON__APOUR_CONVOI_FAISANT_MOUVEMENT_CONVOI:
				getAPourConvoiFaisantMouvementConvoi().clear();
				getAPourConvoiFaisantMouvementConvoi().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_LIVRAISON__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_LIVRAISON__TYPE_CHAINE_LOGISTIQUE:
				unsetTypeChaineLogistique();
				return;
			case SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT:
				setDateRecompletement(DATE_RECOMPLETEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT_ORDONNE:
				setDateRecompletementOrdonne(DATE_RECOMPLETEMENT_ORDONNE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DECISION_AUTORITE:
				setDecisionAutorite(DECISION_AUTORITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DATE_LIVRAISON:
				setDateLivraison(DATE_LIVRAISON_EDEFAULT);
				return;
			case SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_DEMANDE:
				unsetDernierePrevisionDemande();
				return;
			case SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_ORDRE:
				unsetDernierePrevisionOrdre();
				return;
			case SchemaPackage.TYPE_LIVRAISON__EST_DECRIT_PAR_LIGNE_LIVRAISON:
				getEstDecritParLigneLivraison().clear();
				return;
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_UNITE_LIVRAISON:
				getEstObjetAssociationUniteLivraison().clear();
				return;
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_LIVRAISON_LIVAISON:
				getEstObjetAssociationLivraisonLivaison().clear();
				return;
			case SchemaPackage.TYPE_LIVRAISON__EST_SUJET_ASSOCIATION_LIVRAISON_LIVAISON:
				getEstSujetAssociationLivraisonLivaison().clear();
				return;
			case SchemaPackage.TYPE_LIVRAISON__APOUR_CONVOI_FAISANT_MOUVEMENT_CONVOI:
				getAPourConvoiFaisantMouvementConvoi().clear();
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
			case SchemaPackage.TYPE_LIVRAISON__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_LIVRAISON__TYPE_CHAINE_LOGISTIQUE:
				return isSetTypeChaineLogistique();
			case SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT:
				return DATE_RECOMPLETEMENT_EDEFAULT == null ? dateRecompletement != null : !DATE_RECOMPLETEMENT_EDEFAULT.equals(dateRecompletement);
			case SchemaPackage.TYPE_LIVRAISON__DATE_RECOMPLETEMENT_ORDONNE:
				return DATE_RECOMPLETEMENT_ORDONNE_EDEFAULT == null ? dateRecompletementOrdonne != null : !DATE_RECOMPLETEMENT_ORDONNE_EDEFAULT.equals(dateRecompletementOrdonne);
			case SchemaPackage.TYPE_LIVRAISON__DECISION_AUTORITE:
				return DECISION_AUTORITE_EDEFAULT == null ? decisionAutorite != null : !DECISION_AUTORITE_EDEFAULT.equals(decisionAutorite);
			case SchemaPackage.TYPE_LIVRAISON__DATE_LIVRAISON:
				return DATE_LIVRAISON_EDEFAULT == null ? dateLivraison != null : !DATE_LIVRAISON_EDEFAULT.equals(dateLivraison);
			case SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_DEMANDE:
				return isSetDernierePrevisionDemande();
			case SchemaPackage.TYPE_LIVRAISON__DERNIERE_PREVISION_ORDRE:
				return isSetDernierePrevisionOrdre();
			case SchemaPackage.TYPE_LIVRAISON__EST_DECRIT_PAR_LIGNE_LIVRAISON:
				return estDecritParLigneLivraison != null && !estDecritParLigneLivraison.isEmpty();
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_UNITE_LIVRAISON:
				return estObjetAssociationUniteLivraison != null && !estObjetAssociationUniteLivraison.isEmpty();
			case SchemaPackage.TYPE_LIVRAISON__EST_OBJET_ASSOCIATION_LIVRAISON_LIVAISON:
				return estObjetAssociationLivraisonLivaison != null && !estObjetAssociationLivraisonLivaison.isEmpty();
			case SchemaPackage.TYPE_LIVRAISON__EST_SUJET_ASSOCIATION_LIVRAISON_LIVAISON:
				return estSujetAssociationLivraisonLivaison != null && !estSujetAssociationLivraisonLivaison.isEmpty();
			case SchemaPackage.TYPE_LIVRAISON__APOUR_CONVOI_FAISANT_MOUVEMENT_CONVOI:
				return aPourConvoiFaisantMouvementConvoi != null && !aPourConvoiFaisantMouvementConvoi.isEmpty();
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
		result.append(", typeChaineLogistique: ");
		if (typeChaineLogistiqueESet) result.append(typeChaineLogistique); else result.append("<unset>");
		result.append(", dateRecompletement: ");
		result.append(dateRecompletement);
		result.append(", dateRecompletementOrdonne: ");
		result.append(dateRecompletementOrdonne);
		result.append(", decisionAutorite: ");
		result.append(decisionAutorite);
		result.append(", dateLivraison: ");
		result.append(dateLivraison);
		result.append(", dernierePrevisionDemande: ");
		if (dernierePrevisionDemandeESet) result.append(dernierePrevisionDemande); else result.append("<unset>");
		result.append(", dernierePrevisionOrdre: ");
		if (dernierePrevisionOrdreESet) result.append(dernierePrevisionOrdre); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeLivraisonImpl
