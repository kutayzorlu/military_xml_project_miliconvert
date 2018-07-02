/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationEntiteOrgEntiteOrg;
import mpia.schema.TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie;
import mpia.schema.TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie;
import mpia.schema.TypeModaliteSoutienLogistique;

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
 * An implementation of the model object '<em><b>Type Association Entite Org Entite Org</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#isPresencePC <em>Presence PC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#getAPourSujetEntiteOrganisationnelle <em>APour Sujet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#getAPourObjetEntiteOrganisationnelle <em>APour Objet Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique <em>APour Modalite Soutien Logistique Modalite Soutien Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#getEstReferenceeDansArticulation <em>Est Referencee Dans Articulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#getEstSpecifieePourAction <em>Est Specifiee Pour Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationEntiteOrgEntiteOrgImpl#getEstCadreProfil <em>Est Cadre Profil</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationEntiteOrgEntiteOrgImpl extends TypeAssociationInstanceObjetInstanceObjetImpl implements TypeAssociationEntiteOrgEntiteOrg {
	/**
	 * The default value of the '{@link #isPresencePC() <em>Presence PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPresencePC()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESENCE_PC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPresencePC() <em>Presence PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPresencePC()
	 * @generated
	 * @ordered
	 */
	protected boolean presencePC = PRESENCE_PC_EDEFAULT;

	/**
	 * This is true if the Presence PC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean presencePCESet;

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
	 * The cached value of the '{@link #getAPourSujetEntiteOrganisationnelle() <em>APour Sujet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSujetEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourSujetEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getAPourObjetEntiteOrganisationnelle() <em>APour Objet Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourObjetEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourObjetEntiteOrganisationnelle;

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
	 * The cached value of the '{@link #getEstReferenceeDansArticulation() <em>Est Referencee Dans Articulation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstReferenceeDansArticulation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estReferenceeDansArticulation;

	/**
	 * The cached value of the '{@link #getEstSpecifieePourAction() <em>Est Specifiee Pour Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSpecifieePourAction()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estSpecifieePourAction;

	/**
	 * The cached value of the '{@link #getEstCadreProfil() <em>Est Cadre Profil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCadreProfil()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estCadreProfil;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationEntiteOrgEntiteOrgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationEntiteOrgEntiteOrg();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPresencePC() {
		return presencePC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresencePC(boolean newPresencePC) {
		boolean oldPresencePC = presencePC;
		presencePC = newPresencePC;
		boolean oldPresencePCESet = presencePCESet;
		presencePCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__PRESENCE_PC, oldPresencePC, presencePC, !oldPresencePCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPresencePC() {
		boolean oldPresencePC = presencePC;
		boolean oldPresencePCESet = presencePCESet;
		presencePC = PRESENCE_PC_EDEFAULT;
		presencePCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__PRESENCE_PC, oldPresencePC, PRESENCE_PC_EDEFAULT, oldPresencePCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPresencePC() {
		return presencePCESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociationEXT getAPourSujetEntiteOrganisationnelle() {
		return aPourSujetEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSujetEntiteOrganisationnelle(TypeAssociationEXT newAPourSujetEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAPourSujetEntiteOrganisationnelle = aPourSujetEntiteOrganisationnelle;
		aPourSujetEntiteOrganisationnelle = newAPourSujetEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, oldAPourSujetEntiteOrganisationnelle, newAPourSujetEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSujetEntiteOrganisationnelle(TypeAssociationEXT newAPourSujetEntiteOrganisationnelle) {
		if (newAPourSujetEntiteOrganisationnelle != aPourSujetEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourSujetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourSujetEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourSujetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourSujetEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourSujetEntiteOrganisationnelle(newAPourSujetEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE, newAPourSujetEntiteOrganisationnelle, newAPourSujetEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourObjetEntiteOrganisationnelle() {
		return aPourObjetEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourObjetEntiteOrganisationnelle(TypeAssociationEXT newAPourObjetEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAPourObjetEntiteOrganisationnelle = aPourObjetEntiteOrganisationnelle;
		aPourObjetEntiteOrganisationnelle = newAPourObjetEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE, oldAPourObjetEntiteOrganisationnelle, newAPourObjetEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourObjetEntiteOrganisationnelle(TypeAssociationEXT newAPourObjetEntiteOrganisationnelle) {
		if (newAPourObjetEntiteOrganisationnelle != aPourObjetEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourObjetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourObjetEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourObjetEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourObjetEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourObjetEntiteOrganisationnelle(newAPourObjetEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE, newAPourObjetEntiteOrganisationnelle, newAPourObjetEntiteOrganisationnelle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE, oldAPourModaliteSoutienLogistiqueModaliteSoutienLogistique, newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique);
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
				msgs = ((InternalEObject)aPourModaliteSoutienLogistiqueModaliteSoutienLogistique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE, null, msgs);
			if (newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique != null)
				msgs = ((InternalEObject)newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE, null, msgs);
			msgs = basicSetAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE, newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique, newAPourModaliteSoutienLogistiqueModaliteSoutienLogistique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstReferenceeDansArticulation() {
		if (estReferenceeDansArticulation == null) {
			estReferenceeDansArticulation = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_REFERENCEE_DANS_ARTICULATION);
		}
		return estReferenceeDansArticulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstSpecifieePourAction() {
		return estSpecifieePourAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstSpecifieePourAction(TypeAssociation newEstSpecifieePourAction, NotificationChain msgs) {
		TypeAssociation oldEstSpecifieePourAction = estSpecifieePourAction;
		estSpecifieePourAction = newEstSpecifieePourAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION, oldEstSpecifieePourAction, newEstSpecifieePourAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstSpecifieePourAction(TypeAssociation newEstSpecifieePourAction) {
		if (newEstSpecifieePourAction != estSpecifieePourAction) {
			NotificationChain msgs = null;
			if (estSpecifieePourAction != null)
				msgs = ((InternalEObject)estSpecifieePourAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION, null, msgs);
			if (newEstSpecifieePourAction != null)
				msgs = ((InternalEObject)newEstSpecifieePourAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION, null, msgs);
			msgs = basicSetEstSpecifieePourAction(newEstSpecifieePourAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION, newEstSpecifieePourAction, newEstSpecifieePourAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstCadreProfil() {
		return estCadreProfil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstCadreProfil(TypeAssociation newEstCadreProfil, NotificationChain msgs) {
		TypeAssociation oldEstCadreProfil = estCadreProfil;
		estCadreProfil = newEstCadreProfil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL, oldEstCadreProfil, newEstCadreProfil);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstCadreProfil(TypeAssociation newEstCadreProfil) {
		if (newEstCadreProfil != estCadreProfil) {
			NotificationChain msgs = null;
			if (estCadreProfil != null)
				msgs = ((InternalEObject)estCadreProfil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL, null, msgs);
			if (newEstCadreProfil != null)
				msgs = ((InternalEObject)newEstCadreProfil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL, null, msgs);
			msgs = basicSetEstCadreProfil(newEstCadreProfil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL, newEstCadreProfil, newEstCadreProfil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourSujetEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourObjetEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				return basicSetAPourModaliteSoutienLogistiqueModaliteSoutienLogistique(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_REFERENCEE_DANS_ARTICULATION:
				return ((InternalEList<?>)getEstReferenceeDansArticulation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION:
				return basicSetEstSpecifieePourAction(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL:
				return basicSetEstCadreProfil(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__PRESENCE_PC:
				return isPresencePC() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return getAPourSujetEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE:
				return getAPourObjetEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				return getAPourModaliteSoutienLogistiqueModaliteSoutienLogistique();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_REFERENCEE_DANS_ARTICULATION:
				return getEstReferenceeDansArticulation();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION:
				return getEstSpecifieePourAction();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL:
				return getEstCadreProfil();
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__PRESENCE_PC:
				setPresencePC(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoAssociationInstanceObjetInstanceObjetSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssociationEntiteOrgEntiteOrgCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				setAPourSujetEntiteOrganisationnelle((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE:
				setAPourObjetEntiteOrganisationnelle((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				setAPourModaliteSoutienLogistiqueModaliteSoutienLogistique((TypeModaliteSoutienLogistique)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_REFERENCEE_DANS_ARTICULATION:
				getEstReferenceeDansArticulation().clear();
				getEstReferenceeDansArticulation().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION:
				setEstSpecifieePourAction((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL:
				setEstCadreProfil((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__PRESENCE_PC:
				unsetPresencePC();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				setAPourSujetEntiteOrganisationnelle((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE:
				setAPourObjetEntiteOrganisationnelle((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				setAPourModaliteSoutienLogistiqueModaliteSoutienLogistique((TypeModaliteSoutienLogistique)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_REFERENCEE_DANS_ARTICULATION:
				getEstReferenceeDansArticulation().clear();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION:
				setEstSpecifieePourAction((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL:
				setEstCadreProfil((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__PRESENCE_PC:
				return isSetPresencePC();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_SUJET_ENTITE_ORGANISATIONNELLE:
				return aPourSujetEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_OBJET_ENTITE_ORGANISATIONNELLE:
				return aPourObjetEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__APOUR_MODALITE_SOUTIEN_LOGISTIQUE_MODALITE_SOUTIEN_LOGISTIQUE:
				return aPourModaliteSoutienLogistiqueModaliteSoutienLogistique != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_REFERENCEE_DANS_ARTICULATION:
				return estReferenceeDansArticulation != null && !estReferenceeDansArticulation.isEmpty();
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_SPECIFIEE_POUR_ACTION:
				return estSpecifieePourAction != null;
			case SchemaPackage.TYPE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG__EST_CADRE_PROFIL:
				return estCadreProfil != null;
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
		result.append(" (presencePC: ");
		if (presencePCESet) result.append(presencePC); else result.append("<unset>");
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationEntiteOrgEntiteOrgImpl
