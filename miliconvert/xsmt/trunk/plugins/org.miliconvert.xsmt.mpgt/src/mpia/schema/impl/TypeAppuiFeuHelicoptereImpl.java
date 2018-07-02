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
import mpia.schema.TypeAppuiFeuHelicoptere;
import mpia.schema.TypeDictionaryDicoAppuiFeuHelicoptereCategorie;
import mpia.schema.TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche;

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
 * An implementation of the model object '<em><b>Type Appui Feu Helicoptere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAppuiFeuHelicoptereImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAppuiFeuHelicoptereImpl#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAppuiFeuHelicoptereImpl#getEffectifATransporter <em>Effectif ATransporter</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAppuiFeuHelicoptereImpl#getEstObjetAssociationUniteAppuiFeuHelicoptere <em>Est Objet Association Unite Appui Feu Helicoptere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAppuiFeuHelicoptereImpl#getACommePointLimitePresenceENIAutreElementControle <em>AComme Point Limite Presence ENI Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAppuiFeuHelicoptereImpl#getAPourZoneRecoOuPointRendezVousAutreElementControle <em>APour Zone Reco Ou Point Rendez Vous Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAppuiFeuHelicoptereImpl#getEstDirigeContreObservation <em>Est Dirige Contre Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAppuiFeuHelicoptereImpl extends TypeMissionImpl implements TypeAppuiFeuHelicoptere {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAppuiFeuHelicoptereCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAppuiFeuHelicoptereCategorie.A;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAppuiFeuHelicoptereCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche EFFET_RECHERCHE_EDEFAULT = TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche.D;

	/**
	 * The cached value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche effetRecherche = EFFET_RECHERCHE_EDEFAULT;

	/**
	 * This is true if the Effet Recherche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetRechercheESet;

	/**
	 * The default value of the '{@link #getEffectifATransporter() <em>Effectif ATransporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectifATransporter()
	 * @generated
	 * @ordered
	 */
	protected static final long EFFECTIF_ATRANSPORTER_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEffectifATransporter() <em>Effectif ATransporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectifATransporter()
	 * @generated
	 * @ordered
	 */
	protected long effectifATransporter = EFFECTIF_ATRANSPORTER_EDEFAULT;

	/**
	 * This is true if the Effectif ATransporter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectifATransporterESet;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUniteAppuiFeuHelicoptere() <em>Est Objet Association Unite Appui Feu Helicoptere</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUniteAppuiFeuHelicoptere()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUniteAppuiFeuHelicoptere;

	/**
	 * The cached value of the '{@link #getACommePointLimitePresenceENIAutreElementControle() <em>AComme Point Limite Presence ENI Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointLimitePresenceENIAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePointLimitePresenceENIAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourZoneRecoOuPointRendezVousAutreElementControle() <em>APour Zone Reco Ou Point Rendez Vous Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneRecoOuPointRendezVousAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneRecoOuPointRendezVousAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstDirigeContreObservation() <em>Est Dirige Contre Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDirigeContreObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estDirigeContreObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAppuiFeuHelicoptereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAppuiFeuHelicoptere();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAppuiFeuHelicoptereCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAppuiFeuHelicoptereCategorie newCategorie) {
		TypeDictionaryDicoAppuiFeuHelicoptereCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAppuiFeuHelicoptereCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche getEffetRecherche() {
		return effetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetRecherche(TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche newEffetRecherche) {
		TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche oldEffetRecherche = effetRecherche;
		effetRecherche = newEffetRecherche == null ? EFFET_RECHERCHE_EDEFAULT : newEffetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRechercheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFET_RECHERCHE, oldEffetRecherche, effetRecherche, !oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetRecherche() {
		TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche oldEffetRecherche = effetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRecherche = EFFET_RECHERCHE_EDEFAULT;
		effetRechercheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFET_RECHERCHE, oldEffetRecherche, EFFET_RECHERCHE_EDEFAULT, oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetRecherche() {
		return effetRechercheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEffectifATransporter() {
		return effectifATransporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectifATransporter(long newEffectifATransporter) {
		long oldEffectifATransporter = effectifATransporter;
		effectifATransporter = newEffectifATransporter;
		boolean oldEffectifATransporterESet = effectifATransporterESet;
		effectifATransporterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFECTIF_ATRANSPORTER, oldEffectifATransporter, effectifATransporter, !oldEffectifATransporterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffectifATransporter() {
		long oldEffectifATransporter = effectifATransporter;
		boolean oldEffectifATransporterESet = effectifATransporterESet;
		effectifATransporter = EFFECTIF_ATRANSPORTER_EDEFAULT;
		effectifATransporterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFECTIF_ATRANSPORTER, oldEffectifATransporter, EFFECTIF_ATRANSPORTER_EDEFAULT, oldEffectifATransporterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffectifATransporter() {
		return effectifATransporterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUniteAppuiFeuHelicoptere() {
		if (estObjetAssociationUniteAppuiFeuHelicoptere == null) {
			estObjetAssociationUniteAppuiFeuHelicoptere = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_OBJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE);
		}
		return estObjetAssociationUniteAppuiFeuHelicoptere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePointLimitePresenceENIAutreElementControle() {
		return aCommePointLimitePresenceENIAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePointLimitePresenceENIAutreElementControle(TypeAssociation newACommePointLimitePresenceENIAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommePointLimitePresenceENIAutreElementControle = aCommePointLimitePresenceENIAutreElementControle;
		aCommePointLimitePresenceENIAutreElementControle = newACommePointLimitePresenceENIAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE, oldACommePointLimitePresenceENIAutreElementControle, newACommePointLimitePresenceENIAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePointLimitePresenceENIAutreElementControle(TypeAssociation newACommePointLimitePresenceENIAutreElementControle) {
		if (newACommePointLimitePresenceENIAutreElementControle != aCommePointLimitePresenceENIAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommePointLimitePresenceENIAutreElementControle != null)
				msgs = ((InternalEObject)aCommePointLimitePresenceENIAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommePointLimitePresenceENIAutreElementControle != null)
				msgs = ((InternalEObject)newACommePointLimitePresenceENIAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommePointLimitePresenceENIAutreElementControle(newACommePointLimitePresenceENIAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE, newACommePointLimitePresenceENIAutreElementControle, newACommePointLimitePresenceENIAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneRecoOuPointRendezVousAutreElementControle() {
		return aPourZoneRecoOuPointRendezVousAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneRecoOuPointRendezVousAutreElementControle(TypeAssociation newAPourZoneRecoOuPointRendezVousAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneRecoOuPointRendezVousAutreElementControle = aPourZoneRecoOuPointRendezVousAutreElementControle;
		aPourZoneRecoOuPointRendezVousAutreElementControle = newAPourZoneRecoOuPointRendezVousAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, oldAPourZoneRecoOuPointRendezVousAutreElementControle, newAPourZoneRecoOuPointRendezVousAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneRecoOuPointRendezVousAutreElementControle(TypeAssociation newAPourZoneRecoOuPointRendezVousAutreElementControle) {
		if (newAPourZoneRecoOuPointRendezVousAutreElementControle != aPourZoneRecoOuPointRendezVousAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneRecoOuPointRendezVousAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneRecoOuPointRendezVousAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneRecoOuPointRendezVousAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneRecoOuPointRendezVousAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneRecoOuPointRendezVousAutreElementControle(newAPourZoneRecoOuPointRendezVousAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE, newAPourZoneRecoOuPointRendezVousAutreElementControle, newAPourZoneRecoOuPointRendezVousAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstDirigeContreObservation() {
		if (estDirigeContreObservation == null) {
			estDirigeContreObservation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_DIRIGE_CONTRE_OBSERVATION);
		}
		return estDirigeContreObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_OBJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return ((InternalEList<?>)getEstObjetAssociationUniteAppuiFeuHelicoptere()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommePointLimitePresenceENIAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneRecoOuPointRendezVousAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_DIRIGE_CONTRE_OBSERVATION:
				return ((InternalEList<?>)getEstDirigeContreObservation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFET_RECHERCHE:
				return getEffetRecherche();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFECTIF_ATRANSPORTER:
				return new Long(getEffectifATransporter());
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_OBJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return getEstObjetAssociationUniteAppuiFeuHelicoptere();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE:
				return getACommePointLimitePresenceENIAutreElementControle();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneRecoOuPointRendezVousAutreElementControle();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_DIRIGE_CONTRE_OBSERVATION:
				return getEstDirigeContreObservation();
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
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__CATEGORIE:
				setCategorie((TypeDictionaryDicoAppuiFeuHelicoptereCategorie)newValue);
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFET_RECHERCHE:
				setEffetRecherche((TypeDictionaryDicoAppuiFeuHelicoptereEffetRecherche)newValue);
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFECTIF_ATRANSPORTER:
				setEffectifATransporter(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_OBJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				getEstObjetAssociationUniteAppuiFeuHelicoptere().clear();
				getEstObjetAssociationUniteAppuiFeuHelicoptere().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE:
				setACommePointLimitePresenceENIAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneRecoOuPointRendezVousAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_DIRIGE_CONTRE_OBSERVATION:
				getEstDirigeContreObservation().clear();
				getEstDirigeContreObservation().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFET_RECHERCHE:
				unsetEffetRecherche();
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFECTIF_ATRANSPORTER:
				unsetEffectifATransporter();
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_OBJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				getEstObjetAssociationUniteAppuiFeuHelicoptere().clear();
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE:
				setACommePointLimitePresenceENIAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneRecoOuPointRendezVousAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_DIRIGE_CONTRE_OBSERVATION:
				getEstDirigeContreObservation().clear();
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
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFET_RECHERCHE:
				return isSetEffetRecherche();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EFFECTIF_ATRANSPORTER:
				return isSetEffectifATransporter();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_OBJET_ASSOCIATION_UNITE_APPUI_FEU_HELICOPTERE:
				return estObjetAssociationUniteAppuiFeuHelicoptere != null && !estObjetAssociationUniteAppuiFeuHelicoptere.isEmpty();
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__ACOMME_POINT_LIMITE_PRESENCE_ENI_AUTRE_ELEMENT_CONTROLE:
				return aCommePointLimitePresenceENIAutreElementControle != null;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__APOUR_ZONE_RECO_OU_POINT_RENDEZ_VOUS_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneRecoOuPointRendezVousAutreElementControle != null;
			case SchemaPackage.TYPE_APPUI_FEU_HELICOPTERE__EST_DIRIGE_CONTRE_OBSERVATION:
				return estDirigeContreObservation != null && !estDirigeContreObservation.isEmpty();
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
		result.append(", effetRecherche: ");
		if (effetRechercheESet) result.append(effetRecherche); else result.append("<unset>");
		result.append(", effectifATransporter: ");
		if (effectifATransporterESet) result.append(effectifATransporter); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAppuiFeuHelicoptereImpl
