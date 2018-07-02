/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie;
import mpia.schema.TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie;
import mpia.schema.TypeEquipementOuRessourceEnQuantite;
import mpia.schema.TypeModaliteSoutienLogistique;
import mpia.schema.TypePrelevementSubordonneNonIdentifie;

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
 * An implementation of the model object '<em><b>Type Prelevement Subordonne Non Identifie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getDateDebutRenforcement <em>Date Debut Renforcement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getDateFinRenforcement <em>Date Fin Renforcement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getQuantiteMin <em>Quantite Min</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getNomModule <em>Nom Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getEstCaracteriseParTypeUnite <em>Est Caracterise Par Type Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique <em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePrelevementSubordonneNonIdentifieImpl#getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite <em>APour Equipement Ou Ressource Equipement Ou Ressource En Quantite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePrelevementSubordonneNonIdentifieImpl extends TypePrelevementDetachementImpl implements TypePrelevementSubordonneNonIdentifie {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie.CMDCTL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie.COMD;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The cached value of the '{@link #getDateDebutRenforcement() <em>Date Debut Renforcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutRenforcement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDebutRenforcement;

	/**
	 * The cached value of the '{@link #getDateFinRenforcement() <em>Date Fin Renforcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinRenforcement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateFinRenforcement;

	/**
	 * The default value of the '{@link #getQuantiteMin() <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMin()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MIN_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMin() <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMin()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMin = QUANTITE_MIN_EDEFAULT;

	/**
	 * This is true if the Quantite Min attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMinESet;

	/**
	 * The default value of the '{@link #getQuantiteMax() <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMax()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_MAX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteMax() <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteMax()
	 * @generated
	 * @ordered
	 */
	protected long quantiteMax = QUANTITE_MAX_EDEFAULT;

	/**
	 * This is true if the Quantite Max attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteMaxESet;

	/**
	 * The default value of the '{@link #getNomModule() <em>Nom Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomModule()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomModule() <em>Nom Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomModule()
	 * @generated
	 * @ordered
	 */
	protected String nomModule = NOM_MODULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeUniteFournisseurUnite() <em>AComme Unite Fournisseur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteFournisseurUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeUniteFournisseurUnite;

	/**
	 * The cached value of the '{@link #getACommeUniteBeneficiaireUnite() <em>AComme Unite Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeUniteBeneficiaireUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeUniteBeneficiaireUnite;

	/**
	 * The cached value of the '{@link #getEstCaracteriseParTypeUnite() <em>Est Caracterise Par Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCaracteriseParTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estCaracteriseParTypeUnite;

	/**
	 * The cached value of the '{@link #getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique() <em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeModaliteSoutienLogistique aPourModaliteSoutienLogistiqueModaliteSoutienLogistique;

	/**
	 * The cached value of the '{@link #getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite() <em>APour Equipement Ou Ressource Equipement Ou Ressource En Quantite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEquipementOuRessourceEnQuantite> aPourEquipementOuRessourceEquipementOuRessourceEnQuantite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePrelevementSubordonneNonIdentifieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePrelevementSubordonneNonIdentifie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie newCategorie) {
		TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie newSousCategorie) {
		TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDebutRenforcement() {
		return dateDebutRenforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDebutRenforcement(TypeDataTypeDateHeure newDateDebutRenforcement, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDebutRenforcement = dateDebutRenforcement;
		dateDebutRenforcement = newDateDebutRenforcement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT, oldDateDebutRenforcement, newDateDebutRenforcement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutRenforcement(TypeDataTypeDateHeure newDateDebutRenforcement) {
		if (newDateDebutRenforcement != dateDebutRenforcement) {
			NotificationChain msgs = null;
			if (dateDebutRenforcement != null)
				msgs = ((InternalEObject)dateDebutRenforcement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT, null, msgs);
			if (newDateDebutRenforcement != null)
				msgs = ((InternalEObject)newDateDebutRenforcement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT, null, msgs);
			msgs = basicSetDateDebutRenforcement(newDateDebutRenforcement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT, newDateDebutRenforcement, newDateDebutRenforcement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateFinRenforcement() {
		return dateFinRenforcement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateFinRenforcement(TypeDataTypeDateHeure newDateFinRenforcement, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateFinRenforcement = dateFinRenforcement;
		dateFinRenforcement = newDateFinRenforcement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT, oldDateFinRenforcement, newDateFinRenforcement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinRenforcement(TypeDataTypeDateHeure newDateFinRenforcement) {
		if (newDateFinRenforcement != dateFinRenforcement) {
			NotificationChain msgs = null;
			if (dateFinRenforcement != null)
				msgs = ((InternalEObject)dateFinRenforcement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT, null, msgs);
			if (newDateFinRenforcement != null)
				msgs = ((InternalEObject)newDateFinRenforcement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT, null, msgs);
			msgs = basicSetDateFinRenforcement(newDateFinRenforcement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT, newDateFinRenforcement, newDateFinRenforcement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMin() {
		return quantiteMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMin(long newQuantiteMin) {
		long oldQuantiteMin = quantiteMin;
		quantiteMin = newQuantiteMin;
		boolean oldQuantiteMinESet = quantiteMinESet;
		quantiteMinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MIN, oldQuantiteMin, quantiteMin, !oldQuantiteMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMin() {
		long oldQuantiteMin = quantiteMin;
		boolean oldQuantiteMinESet = quantiteMinESet;
		quantiteMin = QUANTITE_MIN_EDEFAULT;
		quantiteMinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MIN, oldQuantiteMin, QUANTITE_MIN_EDEFAULT, oldQuantiteMinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMin() {
		return quantiteMinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteMax() {
		return quantiteMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteMax(long newQuantiteMax) {
		long oldQuantiteMax = quantiteMax;
		quantiteMax = newQuantiteMax;
		boolean oldQuantiteMaxESet = quantiteMaxESet;
		quantiteMaxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MAX, oldQuantiteMax, quantiteMax, !oldQuantiteMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteMax() {
		long oldQuantiteMax = quantiteMax;
		boolean oldQuantiteMaxESet = quantiteMaxESet;
		quantiteMax = QUANTITE_MAX_EDEFAULT;
		quantiteMaxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MAX, oldQuantiteMax, QUANTITE_MAX_EDEFAULT, oldQuantiteMaxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteMax() {
		return quantiteMaxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomModule() {
		return nomModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomModule(String newNomModule) {
		String oldNomModule = nomModule;
		nomModule = newNomModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__NOM_MODULE, oldNomModule, nomModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeUniteFournisseurUnite() {
		return aCommeUniteFournisseurUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteFournisseurUnite(TypeAssociationEXT newACommeUniteFournisseurUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeUniteFournisseurUnite = aCommeUniteFournisseurUnite;
		aCommeUniteFournisseurUnite = newACommeUniteFournisseurUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE, oldACommeUniteFournisseurUnite, newACommeUniteFournisseurUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteFournisseurUnite(TypeAssociationEXT newACommeUniteFournisseurUnite) {
		if (newACommeUniteFournisseurUnite != aCommeUniteFournisseurUnite) {
			NotificationChain msgs = null;
			if (aCommeUniteFournisseurUnite != null)
				msgs = ((InternalEObject)aCommeUniteFournisseurUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE, null, msgs);
			if (newACommeUniteFournisseurUnite != null)
				msgs = ((InternalEObject)newACommeUniteFournisseurUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE, null, msgs);
			msgs = basicSetACommeUniteFournisseurUnite(newACommeUniteFournisseurUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE, newACommeUniteFournisseurUnite, newACommeUniteFournisseurUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeUniteBeneficiaireUnite() {
		return aCommeUniteBeneficiaireUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeUniteBeneficiaireUnite(TypeAssociationEXT newACommeUniteBeneficiaireUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeUniteBeneficiaireUnite = aCommeUniteBeneficiaireUnite;
		aCommeUniteBeneficiaireUnite = newACommeUniteBeneficiaireUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE, oldACommeUniteBeneficiaireUnite, newACommeUniteBeneficiaireUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeUniteBeneficiaireUnite(TypeAssociationEXT newACommeUniteBeneficiaireUnite) {
		if (newACommeUniteBeneficiaireUnite != aCommeUniteBeneficiaireUnite) {
			NotificationChain msgs = null;
			if (aCommeUniteBeneficiaireUnite != null)
				msgs = ((InternalEObject)aCommeUniteBeneficiaireUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE, null, msgs);
			if (newACommeUniteBeneficiaireUnite != null)
				msgs = ((InternalEObject)newACommeUniteBeneficiaireUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE, null, msgs);
			msgs = basicSetACommeUniteBeneficiaireUnite(newACommeUniteBeneficiaireUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE, newACommeUniteBeneficiaireUnite, newACommeUniteBeneficiaireUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstCaracteriseParTypeUnite() {
		return estCaracteriseParTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstCaracteriseParTypeUnite(TypeAssociationEXT newEstCaracteriseParTypeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstCaracteriseParTypeUnite = estCaracteriseParTypeUnite;
		estCaracteriseParTypeUnite = newEstCaracteriseParTypeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE, oldEstCaracteriseParTypeUnite, newEstCaracteriseParTypeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstCaracteriseParTypeUnite(TypeAssociationEXT newEstCaracteriseParTypeUnite) {
		if (newEstCaracteriseParTypeUnite != estCaracteriseParTypeUnite) {
			NotificationChain msgs = null;
			if (estCaracteriseParTypeUnite != null)
				msgs = ((InternalEObject)estCaracteriseParTypeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE, null, msgs);
			if (newEstCaracteriseParTypeUnite != null)
				msgs = ((InternalEObject)newEstCaracteriseParTypeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE, null, msgs);
			msgs = basicSetEstCaracteriseParTypeUnite(newEstCaracteriseParTypeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE, newEstCaracteriseParTypeUnite, newEstCaracteriseParTypeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModaliteSoutienLogistique getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique() {
		return aPourModaliteSoutienLogistiqueModaliteSoutienLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(TypeModaliteSoutienLogistique newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique, NotificationChain msgs) {
		TypeModaliteSoutienLogistique oldAPourModaliteSoutienLogistiqueModaliteSoutienLogistique = aPourModaliteSoutienLogistiqueModaliteSoutienLogistique;
		aPourModaliteSoutienLogistiqueModaliteSoutienLogistique = newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE, oldAPourModaliteSoutienLogistiqueModaliteSoutienLogistique, newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(TypeModaliteSoutienLogistique newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique) {
		if (newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique != aPourModaliteSoutienLogistiqueModaliteSoutienLogistique) {
			NotificationChain msgs = null;
			if (aPourModaliteSoutienLogistiqueModaliteSoutienLogistique != null)
				msgs = ((InternalEObject)aPourModaliteSoutienLogistiqueModaliteSoutienLogistique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE, null, msgs);
			if (newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique != null)
				msgs = ((InternalEObject)newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE, null, msgs);
			msgs = basicSetAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE, newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique, newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEquipementOuRessourceEnQuantite> getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite() {
		if (aPourEquipementOuRessourceEquipementOuRessourceEnQuantite == null) {
			aPourEquipementOuRessourceEquipementOuRessourceEnQuantite = new EObjectContainmentEList<TypeEquipementOuRessourceEnQuantite>(TypeEquipementOuRessourceEnQuantite.class, this, SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_EQUIPEMENT_OU_RESSOURCE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE);
		}
		return aPourEquipementOuRessourceEquipementOuRessourceEnQuantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT:
				return basicSetDateDebutRenforcement(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT:
				return basicSetDateFinRenforcement(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return basicSetACommeUniteFournisseurUnite(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return basicSetACommeUniteBeneficiaireUnite(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE:
				return basicSetEstCaracteriseParTypeUnite(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				return basicSetAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(null, msgs);
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_EQUIPEMENT_OU_RESSOURCE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE:
				return ((InternalEList<?>)getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT:
				return getDateDebutRenforcement();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT:
				return getDateFinRenforcement();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MIN:
				return new Long(getQuantiteMin());
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MAX:
				return new Long(getQuantiteMax());
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__NOM_MODULE:
				return getNomModule();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return getACommeUniteFournisseurUnite();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return getACommeUniteBeneficiaireUnite();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE:
				return getEstCaracteriseParTypeUnite();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				return getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_EQUIPEMENT_OU_RESSOURCE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE:
				return getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite();
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
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT:
				setDateDebutRenforcement((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT:
				setDateFinRenforcement((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MIN:
				setQuantiteMin(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MAX:
				setQuantiteMax(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__NOM_MODULE:
				setNomModule((String)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				setACommeUniteFournisseurUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				setACommeUniteBeneficiaireUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE:
				setEstCaracteriseParTypeUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				setAPourModaliteSoutienLogistiqueModaliteSoutienLogistique((TypeModaliteSoutienLogistique)newValue);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_EQUIPEMENT_OU_RESSOURCE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE:
				getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite().clear();
				getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite().addAll((Collection<? extends TypeEquipementOuRessourceEnQuantite>)newValue);
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
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT:
				setDateDebutRenforcement((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT:
				setDateFinRenforcement((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MIN:
				unsetQuantiteMin();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MAX:
				unsetQuantiteMax();
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__NOM_MODULE:
				setNomModule(NOM_MODULE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				setACommeUniteFournisseurUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				setACommeUniteBeneficiaireUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE:
				setEstCaracteriseParTypeUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				setAPourModaliteSoutienLogistiqueModaliteSoutienLogistique((TypeModaliteSoutienLogistique)null);
				return;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_EQUIPEMENT_OU_RESSOURCE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE:
				getAPourEquipementOuRessourceEquipementOuRessourceEnQuantite().clear();
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
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_DEBUT_RENFORCEMENT:
				return dateDebutRenforcement != null;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__DATE_FIN_RENFORCEMENT:
				return dateFinRenforcement != null;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MIN:
				return isSetQuantiteMin();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__QUANTITE_MAX:
				return isSetQuantiteMax();
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__NOM_MODULE:
				return NOM_MODULE_EDEFAULT == null ? nomModule != null : !NOM_MODULE_EDEFAULT.equals(nomModule);
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_FOURNISSEUR_UNITE:
				return aCommeUniteFournisseurUnite != null;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__ACOMME_UNITE_BENEFICIAIRE_UNITE:
				return aCommeUniteBeneficiaireUnite != null;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__EST_CARACTERISE_PAR_TYPE_UNITE:
				return estCaracteriseParTypeUnite != null;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				return aPourModaliteSoutienLogistiqueModaliteSoutienLogistique != null;
			case SchemaPackage.TYPE_PRELEVEMENT_SUBORDONNE_NON_IDENTIFIE__APOUR_EQUIPEMENT_OU_RESSOURCE_EQUIPEMENT_OU_RESSOURCE_EN_QUANTITE:
				return aPourEquipementOuRessourceEquipementOuRessourceEnQuantite != null && !aPourEquipementOuRessourceEquipementOuRessourceEnQuantite.isEmpty();
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
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", quantiteMin: ");
		if (quantiteMinESet) result.append(quantiteMin); else result.append("<unset>");
		result.append(", quantiteMax: ");
		if (quantiteMaxESet) result.append(quantiteMax); else result.append("<unset>");
		result.append(", nomModule: ");
		result.append(nomModule);
		result.append(')');
		return result.toString();
	}

} //TypePrelevementSubordonneNonIdentifieImpl
