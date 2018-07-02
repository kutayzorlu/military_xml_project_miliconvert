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
import mpia.schema.TypeArticulation;

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
 * An implementation of the model object '<em><b>Type Articulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getAPourEntitePlusHautNiveauEntiteOrganisationnelle <em>APour Entite Plus Haut Niveau Entite Organisationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getEstConstitueDeAssociationEntiteOrgEntiteOrg <em>Est Constitue De Association Entite Org Entite Org</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getEstConstitueDeAssociationPersonnePersonne <em>Est Constitue De Association Personne Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getEstConstitueDeAssociationEntiteOrgPersonne <em>Est Constitue De Association Entite Org Personne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getEstSpecifieePourMission <em>Est Specifiee Pour Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getEstSpecifieePourLogistiqueMission <em>Est Specifiee Pour Logistique Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationImpl#getEstSpecifieePourAction <em>Est Specifiee Pour Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeArticulationImpl extends EObjectImpl implements TypeArticulation {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourEntitePlusHautNiveauEntiteOrganisationnelle() <em>APour Entite Plus Haut Niveau Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEntitePlusHautNiveauEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourEntitePlusHautNiveauEntiteOrganisationnelle;

	/**
	 * The cached value of the '{@link #getEstConstitueDeAssociationEntiteOrgEntiteOrg() <em>Est Constitue De Association Entite Org Entite Org</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConstitueDeAssociationEntiteOrgEntiteOrg()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estConstitueDeAssociationEntiteOrgEntiteOrg;

	/**
	 * The cached value of the '{@link #getEstConstitueDeAssociationPersonnePersonne() <em>Est Constitue De Association Personne Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConstitueDeAssociationPersonnePersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estConstitueDeAssociationPersonnePersonne;

	/**
	 * The cached value of the '{@link #getEstConstitueDeAssociationEntiteOrgPersonne() <em>Est Constitue De Association Entite Org Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConstitueDeAssociationEntiteOrgPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estConstitueDeAssociationEntiteOrgPersonne;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * The cached value of the '{@link #getEstSpecifieePourMission() <em>Est Specifiee Pour Mission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSpecifieePourMission()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSpecifieePourMission;

	/**
	 * The cached value of the '{@link #getEstSpecifieePourLogistiqueMission() <em>Est Specifiee Pour Logistique Mission</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSpecifieePourLogistiqueMission()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSpecifieePourLogistiqueMission;

	/**
	 * The cached value of the '{@link #getEstSpecifieePourAction() <em>Est Specifiee Pour Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSpecifieePourAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSpecifieePourAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeArticulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeArticulation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourEntitePlusHautNiveauEntiteOrganisationnelle() {
		return aPourEntitePlusHautNiveauEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourEntitePlusHautNiveauEntiteOrganisationnelle(TypeAssociationEXT newAPourEntitePlusHautNiveauEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldAPourEntitePlusHautNiveauEntiteOrganisationnelle = aPourEntitePlusHautNiveauEntiteOrganisationnelle;
		aPourEntitePlusHautNiveauEntiteOrganisationnelle = newAPourEntitePlusHautNiveauEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE, oldAPourEntitePlusHautNiveauEntiteOrganisationnelle, newAPourEntitePlusHautNiveauEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourEntitePlusHautNiveauEntiteOrganisationnelle(TypeAssociationEXT newAPourEntitePlusHautNiveauEntiteOrganisationnelle) {
		if (newAPourEntitePlusHautNiveauEntiteOrganisationnelle != aPourEntitePlusHautNiveauEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (aPourEntitePlusHautNiveauEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)aPourEntitePlusHautNiveauEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newAPourEntitePlusHautNiveauEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newAPourEntitePlusHautNiveauEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetAPourEntitePlusHautNiveauEntiteOrganisationnelle(newAPourEntitePlusHautNiveauEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE, newAPourEntitePlusHautNiveauEntiteOrganisationnelle, newAPourEntitePlusHautNiveauEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstConstitueDeAssociationEntiteOrgEntiteOrg() {
		if (estConstitueDeAssociationEntiteOrgEntiteOrg == null) {
			estConstitueDeAssociationEntiteOrgEntiteOrg = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG);
		}
		return estConstitueDeAssociationEntiteOrgEntiteOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstConstitueDeAssociationPersonnePersonne() {
		if (estConstitueDeAssociationPersonnePersonne == null) {
			estConstitueDeAssociationPersonnePersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_PERSONNE_PERSONNE);
		}
		return estConstitueDeAssociationPersonnePersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstConstitueDeAssociationEntiteOrgPersonne() {
		if (estConstitueDeAssociationEntiteOrgPersonne == null) {
			estConstitueDeAssociationEntiteOrgPersonne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_PERSONNE);
		}
		return estConstitueDeAssociationEntiteOrgPersonne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSpecifieePourMission() {
		if (estSpecifieePourMission == null) {
			estSpecifieePourMission = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_MISSION);
		}
		return estSpecifieePourMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSpecifieePourLogistiqueMission() {
		if (estSpecifieePourLogistiqueMission == null) {
			estSpecifieePourLogistiqueMission = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_LOGISTIQUE_MISSION);
		}
		return estSpecifieePourLogistiqueMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSpecifieePourAction() {
		if (estSpecifieePourAction == null) {
			estSpecifieePourAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_ACTION);
		}
		return estSpecifieePourAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE:
				return basicSetAPourEntitePlusHautNiveauEntiteOrganisationnelle(null, msgs);
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return ((InternalEList<?>)getEstConstitueDeAssociationEntiteOrgEntiteOrg()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_PERSONNE_PERSONNE:
				return ((InternalEList<?>)getEstConstitueDeAssociationPersonnePersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return ((InternalEList<?>)getEstConstitueDeAssociationEntiteOrgPersonne()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_MISSION:
				return ((InternalEList<?>)getEstSpecifieePourMission()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_LOGISTIQUE_MISSION:
				return ((InternalEList<?>)getEstSpecifieePourLogistiqueMission()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_ACTION:
				return ((InternalEList<?>)getEstSpecifieePourAction()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ARTICULATION__NOM:
				return getNom();
			case SchemaPackage.TYPE_ARTICULATION__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_ARTICULATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ARTICULATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE:
				return getAPourEntitePlusHautNiveauEntiteOrganisationnelle();
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return getEstConstitueDeAssociationEntiteOrgEntiteOrg();
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_PERSONNE_PERSONNE:
				return getEstConstitueDeAssociationPersonnePersonne();
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return getEstConstitueDeAssociationEntiteOrgPersonne();
			case SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_MISSION:
				return getEstSpecifieePourMission();
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_LOGISTIQUE_MISSION:
				return getEstSpecifieePourLogistiqueMission();
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_ACTION:
				return getEstSpecifieePourAction();
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
			case SchemaPackage.TYPE_ARTICULATION__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE:
				setAPourEntitePlusHautNiveauEntiteOrganisationnelle((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				getEstConstitueDeAssociationEntiteOrgEntiteOrg().clear();
				getEstConstitueDeAssociationEntiteOrgEntiteOrg().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_PERSONNE_PERSONNE:
				getEstConstitueDeAssociationPersonnePersonne().clear();
				getEstConstitueDeAssociationPersonnePersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_PERSONNE:
				getEstConstitueDeAssociationEntiteOrgPersonne().clear();
				getEstConstitueDeAssociationEntiteOrgPersonne().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_MISSION:
				getEstSpecifieePourMission().clear();
				getEstSpecifieePourMission().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_LOGISTIQUE_MISSION:
				getEstSpecifieePourLogistiqueMission().clear();
				getEstSpecifieePourLogistiqueMission().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_ACTION:
				getEstSpecifieePourAction().clear();
				getEstSpecifieePourAction().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_ARTICULATION__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE:
				setAPourEntitePlusHautNiveauEntiteOrganisationnelle((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				getEstConstitueDeAssociationEntiteOrgEntiteOrg().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_PERSONNE_PERSONNE:
				getEstConstitueDeAssociationPersonnePersonne().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_PERSONNE:
				getEstConstitueDeAssociationEntiteOrgPersonne().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_MISSION:
				getEstSpecifieePourMission().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_LOGISTIQUE_MISSION:
				getEstSpecifieePourLogistiqueMission().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_ACTION:
				getEstSpecifieePourAction().clear();
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
			case SchemaPackage.TYPE_ARTICULATION__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_ARTICULATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchemaPackage.TYPE_ARTICULATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ARTICULATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ARTICULATION__APOUR_ENTITE_PLUS_HAUT_NIVEAU_ENTITE_ORGANISATIONNELLE:
				return aPourEntitePlusHautNiveauEntiteOrganisationnelle != null;
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_ENTITE_ORG:
				return estConstitueDeAssociationEntiteOrgEntiteOrg != null && !estConstitueDeAssociationEntiteOrgEntiteOrg.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_PERSONNE_PERSONNE:
				return estConstitueDeAssociationPersonnePersonne != null && !estConstitueDeAssociationPersonnePersonne.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION__EST_CONSTITUE_DE_ASSOCIATION_ENTITE_ORG_PERSONNE:
				return estConstitueDeAssociationEntiteOrgPersonne != null && !estConstitueDeAssociationEntiteOrgPersonne.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_MISSION:
				return estSpecifieePourMission != null && !estSpecifieePourMission.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_LOGISTIQUE_MISSION:
				return estSpecifieePourLogistiqueMission != null && !estSpecifieePourLogistiqueMission.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION__EST_SPECIFIEE_POUR_ACTION:
				return estSpecifieePourAction != null && !estSpecifieePourAction.isEmpty();
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", description: ");
		result.append(description);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeArticulationImpl
