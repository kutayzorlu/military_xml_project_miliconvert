/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsommationAutorisee;
import mpia.schema.TypeDeploiement;
import mpia.schema.TypeDepotACreer;
import mpia.schema.TypeManutentionAEffectuer;
import mpia.schema.TypeMissionRavitaillement;
import mpia.schema.TypeModaliteLivraison;
import mpia.schema.TypeModalitePerception;
import mpia.schema.TypePriorite;
import mpia.schema.TypeRessourceAttendue;
import mpia.schema.TypeRessourcesALivrerOuADistribuer;
import mpia.schema.TypeStockAMaintenir;

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
 * An implementation of the model object '<em><b>Type Mission Ravitaillement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getConsigne <em>Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getACommeConsommationAutoriseeConsommationAutorisee <em>AComme Consommation Autorisee Consommation Autorisee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getACommePrioritesPriorite <em>AComme Priorites Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getACommeDepotACreerDepotACreer <em>AComme Depot ACreer Depot ACreer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getACommeManutentionAEffectuerManutentionAEffectuer <em>AComme Manutention AEffectuer Manutention AEffectuer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getAPourModeLivraisonGuVersTc2ModaliteLivraison <em>APour Mode Livraison Gu Vers Tc2 Modalite Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getAPourModeLivraisonTc2VersTc1ModaliteLivraison <em>APour Mode Livraison Tc2 Vers Tc1 Modalite Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getAPourModePerceptionTc1AupresDeTc2ModalitePerception <em>APour Mode Perception Tc1 Aupres De Tc2 Modalite Perception</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getAPourModePerceptionTc2AupresDeLaGuModalitePerception <em>APour Mode Perception Tc2 Aupres De La Gu Modalite Perception</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getACommeStockAMaintenirStockAMaintenir <em>AComme Stock AMaintenir Stock AMaintenir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getACommeRessourceADistribuerRessourcesALivrerOuADistribuer <em>AComme Ressource ADistribuer Ressources ALivrer Ou ADistribuer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getACommeRessourceALivrerRessourcesALivrerOuADistribuer <em>AComme Ressource ALivrer Ressources ALivrer Ou ADistribuer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getACommeRessourceAttendueRessourceAttendue <em>AComme Ressource Attendue Ressource Attendue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionRavitaillementImpl#getAPourDeploiementLogistiqueDeploiement <em>APour Deploiement Logistique Deploiement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionRavitaillementImpl extends TypeMissionLogistiqueImpl implements TypeMissionRavitaillement {
	/**
	 * The default value of the '{@link #getConsigne() <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigne()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsigne() <em>Consigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigne()
	 * @generated
	 * @ordered
	 */
	protected String consigne = CONSIGNE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeConsommationAutoriseeConsommationAutorisee() <em>AComme Consommation Autorisee Consommation Autorisee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsommationAutoriseeConsommationAutorisee()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeConsommationAutorisee> aCommeConsommationAutoriseeConsommationAutorisee;

	/**
	 * The cached value of the '{@link #getACommePrioritesPriorite() <em>AComme Priorites Priorite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePrioritesPriorite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePriorite> aCommePrioritesPriorite;

	/**
	 * The cached value of the '{@link #getACommeDepotACreerDepotACreer() <em>AComme Depot ACreer Depot ACreer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeDepotACreerDepotACreer()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDepotACreer> aCommeDepotACreerDepotACreer;

	/**
	 * The cached value of the '{@link #getACommeManutentionAEffectuerManutentionAEffectuer() <em>AComme Manutention AEffectuer Manutention AEffectuer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeManutentionAEffectuerManutentionAEffectuer()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeManutentionAEffectuer> aCommeManutentionAEffectuerManutentionAEffectuer;

	/**
	 * The cached value of the '{@link #getAPourModeLivraisonGuVersTc2ModaliteLivraison() <em>APour Mode Livraison Gu Vers Tc2 Modalite Livraison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModeLivraisonGuVersTc2ModaliteLivraison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModaliteLivraison> aPourModeLivraisonGuVersTc2ModaliteLivraison;

	/**
	 * The cached value of the '{@link #getAPourModeLivraisonTc2VersTc1ModaliteLivraison() <em>APour Mode Livraison Tc2 Vers Tc1 Modalite Livraison</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModeLivraisonTc2VersTc1ModaliteLivraison()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModaliteLivraison> aPourModeLivraisonTc2VersTc1ModaliteLivraison;

	/**
	 * The cached value of the '{@link #getAPourModePerceptionTc1AupresDeTc2ModalitePerception() <em>APour Mode Perception Tc1 Aupres De Tc2 Modalite Perception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModePerceptionTc1AupresDeTc2ModalitePerception()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModalitePerception> aPourModePerceptionTc1AupresDeTc2ModalitePerception;

	/**
	 * The cached value of the '{@link #getAPourModePerceptionTc2AupresDeLaGuModalitePerception() <em>APour Mode Perception Tc2 Aupres De La Gu Modalite Perception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModePerceptionTc2AupresDeLaGuModalitePerception()
	 * @generated
	 * @ordered
	 */
	protected TypeModalitePerception aPourModePerceptionTc2AupresDeLaGuModalitePerception;

	/**
	 * The cached value of the '{@link #getACommeStockAMaintenirStockAMaintenir() <em>AComme Stock AMaintenir Stock AMaintenir</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeStockAMaintenirStockAMaintenir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeStockAMaintenir> aCommeStockAMaintenirStockAMaintenir;

	/**
	 * The cached value of the '{@link #getACommeRessourceADistribuerRessourcesALivrerOuADistribuer() <em>AComme Ressource ADistribuer Ressources ALivrer Ou ADistribuer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceADistribuerRessourcesALivrerOuADistribuer()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourcesALivrerOuADistribuer> aCommeRessourceADistribuerRessourcesALivrerOuADistribuer;

	/**
	 * The cached value of the '{@link #getACommeRessourceALivrerRessourcesALivrerOuADistribuer() <em>AComme Ressource ALivrer Ressources ALivrer Ou ADistribuer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceALivrerRessourcesALivrerOuADistribuer()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourcesALivrerOuADistribuer> aCommeRessourceALivrerRessourcesALivrerOuADistribuer;

	/**
	 * The cached value of the '{@link #getACommeRessourceAttendueRessourceAttendue() <em>AComme Ressource Attendue Ressource Attendue</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeRessourceAttendueRessourceAttendue()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceAttendue> aCommeRessourceAttendueRessourceAttendue;

	/**
	 * The cached value of the '{@link #getAPourDeploiementLogistiqueDeploiement() <em>APour Deploiement Logistique Deploiement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDeploiementLogistiqueDeploiement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeDeploiement> aPourDeploiementLogistiqueDeploiement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionRavitaillementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionRavitaillement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsigne() {
		return consigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigne(String newConsigne) {
		String oldConsigne = consigne;
		consigne = newConsigne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__CONSIGNE, oldConsigne, consigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeConsommationAutorisee> getACommeConsommationAutoriseeConsommationAutorisee() {
		if (aCommeConsommationAutoriseeConsommationAutorisee == null) {
			aCommeConsommationAutoriseeConsommationAutorisee = new EObjectContainmentEList<TypeConsommationAutorisee>(TypeConsommationAutorisee.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_CONSOMMATION_AUTORISEE_CONSOMMATION_AUTORISEE);
		}
		return aCommeConsommationAutoriseeConsommationAutorisee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePriorite> getACommePrioritesPriorite() {
		if (aCommePrioritesPriorite == null) {
			aCommePrioritesPriorite = new EObjectContainmentEList<TypePriorite>(TypePriorite.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_PRIORITES_PRIORITE);
		}
		return aCommePrioritesPriorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDepotACreer> getACommeDepotACreerDepotACreer() {
		if (aCommeDepotACreerDepotACreer == null) {
			aCommeDepotACreerDepotACreer = new EObjectContainmentEList<TypeDepotACreer>(TypeDepotACreer.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_DEPOT_ACREER_DEPOT_ACREER);
		}
		return aCommeDepotACreerDepotACreer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeManutentionAEffectuer> getACommeManutentionAEffectuerManutentionAEffectuer() {
		if (aCommeManutentionAEffectuerManutentionAEffectuer == null) {
			aCommeManutentionAEffectuerManutentionAEffectuer = new EObjectContainmentEList<TypeManutentionAEffectuer>(TypeManutentionAEffectuer.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_MANUTENTION_AEFFECTUER_MANUTENTION_AEFFECTUER);
		}
		return aCommeManutentionAEffectuerManutentionAEffectuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeModaliteLivraison> getAPourModeLivraisonGuVersTc2ModaliteLivraison() {
		if (aPourModeLivraisonGuVersTc2ModaliteLivraison == null) {
			aPourModeLivraisonGuVersTc2ModaliteLivraison = new EObjectContainmentEList<TypeModaliteLivraison>(TypeModaliteLivraison.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_GU_VERS_TC2_MODALITE_LIVRAISON);
		}
		return aPourModeLivraisonGuVersTc2ModaliteLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeModaliteLivraison> getAPourModeLivraisonTc2VersTc1ModaliteLivraison() {
		if (aPourModeLivraisonTc2VersTc1ModaliteLivraison == null) {
			aPourModeLivraisonTc2VersTc1ModaliteLivraison = new EObjectContainmentEList<TypeModaliteLivraison>(TypeModaliteLivraison.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_TC2_VERS_TC1_MODALITE_LIVRAISON);
		}
		return aPourModeLivraisonTc2VersTc1ModaliteLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeModalitePerception> getAPourModePerceptionTc1AupresDeTc2ModalitePerception() {
		if (aPourModePerceptionTc1AupresDeTc2ModalitePerception == null) {
			aPourModePerceptionTc1AupresDeTc2ModalitePerception = new EObjectContainmentEList<TypeModalitePerception>(TypeModalitePerception.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC1_AUPRES_DE_TC2_MODALITE_PERCEPTION);
		}
		return aPourModePerceptionTc1AupresDeTc2ModalitePerception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModalitePerception getAPourModePerceptionTc2AupresDeLaGuModalitePerception() {
		return aPourModePerceptionTc2AupresDeLaGuModalitePerception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourModePerceptionTc2AupresDeLaGuModalitePerception(TypeModalitePerception newAPourModePerceptionTc2AupresDeLaGuModalitePerception, NotificationChain msgs) {
		TypeModalitePerception oldAPourModePerceptionTc2AupresDeLaGuModalitePerception = aPourModePerceptionTc2AupresDeLaGuModalitePerception;
		aPourModePerceptionTc2AupresDeLaGuModalitePerception = newAPourModePerceptionTc2AupresDeLaGuModalitePerception;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION, oldAPourModePerceptionTc2AupresDeLaGuModalitePerception, newAPourModePerceptionTc2AupresDeLaGuModalitePerception);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourModePerceptionTc2AupresDeLaGuModalitePerception(TypeModalitePerception newAPourModePerceptionTc2AupresDeLaGuModalitePerception) {
		if (newAPourModePerceptionTc2AupresDeLaGuModalitePerception != aPourModePerceptionTc2AupresDeLaGuModalitePerception) {
			NotificationChain msgs = null;
			if (aPourModePerceptionTc2AupresDeLaGuModalitePerception != null)
				msgs = ((InternalEObject)aPourModePerceptionTc2AupresDeLaGuModalitePerception).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION, null, msgs);
			if (newAPourModePerceptionTc2AupresDeLaGuModalitePerception != null)
				msgs = ((InternalEObject)newAPourModePerceptionTc2AupresDeLaGuModalitePerception).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION, null, msgs);
			msgs = basicSetAPourModePerceptionTc2AupresDeLaGuModalitePerception(newAPourModePerceptionTc2AupresDeLaGuModalitePerception, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION, newAPourModePerceptionTc2AupresDeLaGuModalitePerception, newAPourModePerceptionTc2AupresDeLaGuModalitePerception));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeStockAMaintenir> getACommeStockAMaintenirStockAMaintenir() {
		if (aCommeStockAMaintenirStockAMaintenir == null) {
			aCommeStockAMaintenirStockAMaintenir = new EObjectContainmentEList<TypeStockAMaintenir>(TypeStockAMaintenir.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_STOCK_AMAINTENIR_STOCK_AMAINTENIR);
		}
		return aCommeStockAMaintenirStockAMaintenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourcesALivrerOuADistribuer> getACommeRessourceADistribuerRessourcesALivrerOuADistribuer() {
		if (aCommeRessourceADistribuerRessourcesALivrerOuADistribuer == null) {
			aCommeRessourceADistribuerRessourcesALivrerOuADistribuer = new EObjectContainmentEList<TypeRessourcesALivrerOuADistribuer>(TypeRessourcesALivrerOuADistribuer.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ADISTRIBUER_RESSOURCES_ALIVRER_OU_ADISTRIBUER);
		}
		return aCommeRessourceADistribuerRessourcesALivrerOuADistribuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourcesALivrerOuADistribuer> getACommeRessourceALivrerRessourcesALivrerOuADistribuer() {
		if (aCommeRessourceALivrerRessourcesALivrerOuADistribuer == null) {
			aCommeRessourceALivrerRessourcesALivrerOuADistribuer = new EObjectContainmentEList<TypeRessourcesALivrerOuADistribuer>(TypeRessourcesALivrerOuADistribuer.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ALIVRER_RESSOURCES_ALIVRER_OU_ADISTRIBUER);
		}
		return aCommeRessourceALivrerRessourcesALivrerOuADistribuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceAttendue> getACommeRessourceAttendueRessourceAttendue() {
		if (aCommeRessourceAttendueRessourceAttendue == null) {
			aCommeRessourceAttendueRessourceAttendue = new EObjectContainmentEList<TypeRessourceAttendue>(TypeRessourceAttendue.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ATTENDUE_RESSOURCE_ATTENDUE);
		}
		return aCommeRessourceAttendueRessourceAttendue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeDeploiement> getAPourDeploiementLogistiqueDeploiement() {
		if (aPourDeploiementLogistiqueDeploiement == null) {
			aPourDeploiementLogistiqueDeploiement = new EObjectContainmentEList<TypeDeploiement>(TypeDeploiement.class, this, SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_DEPLOIEMENT_LOGISTIQUE_DEPLOIEMENT);
		}
		return aPourDeploiementLogistiqueDeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_CONSOMMATION_AUTORISEE_CONSOMMATION_AUTORISEE:
				return ((InternalEList<?>)getACommeConsommationAutoriseeConsommationAutorisee()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_PRIORITES_PRIORITE:
				return ((InternalEList<?>)getACommePrioritesPriorite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_DEPOT_ACREER_DEPOT_ACREER:
				return ((InternalEList<?>)getACommeDepotACreerDepotACreer()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_MANUTENTION_AEFFECTUER_MANUTENTION_AEFFECTUER:
				return ((InternalEList<?>)getACommeManutentionAEffectuerManutentionAEffectuer()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_GU_VERS_TC2_MODALITE_LIVRAISON:
				return ((InternalEList<?>)getAPourModeLivraisonGuVersTc2ModaliteLivraison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_TC2_VERS_TC1_MODALITE_LIVRAISON:
				return ((InternalEList<?>)getAPourModeLivraisonTc2VersTc1ModaliteLivraison()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC1_AUPRES_DE_TC2_MODALITE_PERCEPTION:
				return ((InternalEList<?>)getAPourModePerceptionTc1AupresDeTc2ModalitePerception()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION:
				return basicSetAPourModePerceptionTc2AupresDeLaGuModalitePerception(null, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_STOCK_AMAINTENIR_STOCK_AMAINTENIR:
				return ((InternalEList<?>)getACommeStockAMaintenirStockAMaintenir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ADISTRIBUER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				return ((InternalEList<?>)getACommeRessourceADistribuerRessourcesALivrerOuADistribuer()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ALIVRER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				return ((InternalEList<?>)getACommeRessourceALivrerRessourcesALivrerOuADistribuer()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ATTENDUE_RESSOURCE_ATTENDUE:
				return ((InternalEList<?>)getACommeRessourceAttendueRessourceAttendue()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_DEPLOIEMENT_LOGISTIQUE_DEPLOIEMENT:
				return ((InternalEList<?>)getAPourDeploiementLogistiqueDeploiement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__CONSIGNE:
				return getConsigne();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_CONSOMMATION_AUTORISEE_CONSOMMATION_AUTORISEE:
				return getACommeConsommationAutoriseeConsommationAutorisee();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_PRIORITES_PRIORITE:
				return getACommePrioritesPriorite();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_DEPOT_ACREER_DEPOT_ACREER:
				return getACommeDepotACreerDepotACreer();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_MANUTENTION_AEFFECTUER_MANUTENTION_AEFFECTUER:
				return getACommeManutentionAEffectuerManutentionAEffectuer();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_GU_VERS_TC2_MODALITE_LIVRAISON:
				return getAPourModeLivraisonGuVersTc2ModaliteLivraison();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_TC2_VERS_TC1_MODALITE_LIVRAISON:
				return getAPourModeLivraisonTc2VersTc1ModaliteLivraison();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC1_AUPRES_DE_TC2_MODALITE_PERCEPTION:
				return getAPourModePerceptionTc1AupresDeTc2ModalitePerception();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION:
				return getAPourModePerceptionTc2AupresDeLaGuModalitePerception();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_STOCK_AMAINTENIR_STOCK_AMAINTENIR:
				return getACommeStockAMaintenirStockAMaintenir();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ADISTRIBUER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				return getACommeRessourceADistribuerRessourcesALivrerOuADistribuer();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ALIVRER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				return getACommeRessourceALivrerRessourcesALivrerOuADistribuer();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ATTENDUE_RESSOURCE_ATTENDUE:
				return getACommeRessourceAttendueRessourceAttendue();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_DEPLOIEMENT_LOGISTIQUE_DEPLOIEMENT:
				return getAPourDeploiementLogistiqueDeploiement();
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
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__CONSIGNE:
				setConsigne((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_CONSOMMATION_AUTORISEE_CONSOMMATION_AUTORISEE:
				getACommeConsommationAutoriseeConsommationAutorisee().clear();
				getACommeConsommationAutoriseeConsommationAutorisee().addAll((Collection<? extends TypeConsommationAutorisee>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_PRIORITES_PRIORITE:
				getACommePrioritesPriorite().clear();
				getACommePrioritesPriorite().addAll((Collection<? extends TypePriorite>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_DEPOT_ACREER_DEPOT_ACREER:
				getACommeDepotACreerDepotACreer().clear();
				getACommeDepotACreerDepotACreer().addAll((Collection<? extends TypeDepotACreer>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_MANUTENTION_AEFFECTUER_MANUTENTION_AEFFECTUER:
				getACommeManutentionAEffectuerManutentionAEffectuer().clear();
				getACommeManutentionAEffectuerManutentionAEffectuer().addAll((Collection<? extends TypeManutentionAEffectuer>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_GU_VERS_TC2_MODALITE_LIVRAISON:
				getAPourModeLivraisonGuVersTc2ModaliteLivraison().clear();
				getAPourModeLivraisonGuVersTc2ModaliteLivraison().addAll((Collection<? extends TypeModaliteLivraison>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_TC2_VERS_TC1_MODALITE_LIVRAISON:
				getAPourModeLivraisonTc2VersTc1ModaliteLivraison().clear();
				getAPourModeLivraisonTc2VersTc1ModaliteLivraison().addAll((Collection<? extends TypeModaliteLivraison>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC1_AUPRES_DE_TC2_MODALITE_PERCEPTION:
				getAPourModePerceptionTc1AupresDeTc2ModalitePerception().clear();
				getAPourModePerceptionTc1AupresDeTc2ModalitePerception().addAll((Collection<? extends TypeModalitePerception>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION:
				setAPourModePerceptionTc2AupresDeLaGuModalitePerception((TypeModalitePerception)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_STOCK_AMAINTENIR_STOCK_AMAINTENIR:
				getACommeStockAMaintenirStockAMaintenir().clear();
				getACommeStockAMaintenirStockAMaintenir().addAll((Collection<? extends TypeStockAMaintenir>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ADISTRIBUER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				getACommeRessourceADistribuerRessourcesALivrerOuADistribuer().clear();
				getACommeRessourceADistribuerRessourcesALivrerOuADistribuer().addAll((Collection<? extends TypeRessourcesALivrerOuADistribuer>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ALIVRER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				getACommeRessourceALivrerRessourcesALivrerOuADistribuer().clear();
				getACommeRessourceALivrerRessourcesALivrerOuADistribuer().addAll((Collection<? extends TypeRessourcesALivrerOuADistribuer>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ATTENDUE_RESSOURCE_ATTENDUE:
				getACommeRessourceAttendueRessourceAttendue().clear();
				getACommeRessourceAttendueRessourceAttendue().addAll((Collection<? extends TypeRessourceAttendue>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_DEPLOIEMENT_LOGISTIQUE_DEPLOIEMENT:
				getAPourDeploiementLogistiqueDeploiement().clear();
				getAPourDeploiementLogistiqueDeploiement().addAll((Collection<? extends TypeDeploiement>)newValue);
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
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__CONSIGNE:
				setConsigne(CONSIGNE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_CONSOMMATION_AUTORISEE_CONSOMMATION_AUTORISEE:
				getACommeConsommationAutoriseeConsommationAutorisee().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_PRIORITES_PRIORITE:
				getACommePrioritesPriorite().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_DEPOT_ACREER_DEPOT_ACREER:
				getACommeDepotACreerDepotACreer().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_MANUTENTION_AEFFECTUER_MANUTENTION_AEFFECTUER:
				getACommeManutentionAEffectuerManutentionAEffectuer().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_GU_VERS_TC2_MODALITE_LIVRAISON:
				getAPourModeLivraisonGuVersTc2ModaliteLivraison().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_TC2_VERS_TC1_MODALITE_LIVRAISON:
				getAPourModeLivraisonTc2VersTc1ModaliteLivraison().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC1_AUPRES_DE_TC2_MODALITE_PERCEPTION:
				getAPourModePerceptionTc1AupresDeTc2ModalitePerception().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION:
				setAPourModePerceptionTc2AupresDeLaGuModalitePerception((TypeModalitePerception)null);
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_STOCK_AMAINTENIR_STOCK_AMAINTENIR:
				getACommeStockAMaintenirStockAMaintenir().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ADISTRIBUER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				getACommeRessourceADistribuerRessourcesALivrerOuADistribuer().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ALIVRER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				getACommeRessourceALivrerRessourcesALivrerOuADistribuer().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ATTENDUE_RESSOURCE_ATTENDUE:
				getACommeRessourceAttendueRessourceAttendue().clear();
				return;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_DEPLOIEMENT_LOGISTIQUE_DEPLOIEMENT:
				getAPourDeploiementLogistiqueDeploiement().clear();
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
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__CONSIGNE:
				return CONSIGNE_EDEFAULT == null ? consigne != null : !CONSIGNE_EDEFAULT.equals(consigne);
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_CONSOMMATION_AUTORISEE_CONSOMMATION_AUTORISEE:
				return aCommeConsommationAutoriseeConsommationAutorisee != null && !aCommeConsommationAutoriseeConsommationAutorisee.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_PRIORITES_PRIORITE:
				return aCommePrioritesPriorite != null && !aCommePrioritesPriorite.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_DEPOT_ACREER_DEPOT_ACREER:
				return aCommeDepotACreerDepotACreer != null && !aCommeDepotACreerDepotACreer.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_MANUTENTION_AEFFECTUER_MANUTENTION_AEFFECTUER:
				return aCommeManutentionAEffectuerManutentionAEffectuer != null && !aCommeManutentionAEffectuerManutentionAEffectuer.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_GU_VERS_TC2_MODALITE_LIVRAISON:
				return aPourModeLivraisonGuVersTc2ModaliteLivraison != null && !aPourModeLivraisonGuVersTc2ModaliteLivraison.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_LIVRAISON_TC2_VERS_TC1_MODALITE_LIVRAISON:
				return aPourModeLivraisonTc2VersTc1ModaliteLivraison != null && !aPourModeLivraisonTc2VersTc1ModaliteLivraison.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC1_AUPRES_DE_TC2_MODALITE_PERCEPTION:
				return aPourModePerceptionTc1AupresDeTc2ModalitePerception != null && !aPourModePerceptionTc1AupresDeTc2ModalitePerception.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_MODE_PERCEPTION_TC2_AUPRES_DE_LA_GU_MODALITE_PERCEPTION:
				return aPourModePerceptionTc2AupresDeLaGuModalitePerception != null;
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_STOCK_AMAINTENIR_STOCK_AMAINTENIR:
				return aCommeStockAMaintenirStockAMaintenir != null && !aCommeStockAMaintenirStockAMaintenir.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ADISTRIBUER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				return aCommeRessourceADistribuerRessourcesALivrerOuADistribuer != null && !aCommeRessourceADistribuerRessourcesALivrerOuADistribuer.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ALIVRER_RESSOURCES_ALIVRER_OU_ADISTRIBUER:
				return aCommeRessourceALivrerRessourcesALivrerOuADistribuer != null && !aCommeRessourceALivrerRessourcesALivrerOuADistribuer.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__ACOMME_RESSOURCE_ATTENDUE_RESSOURCE_ATTENDUE:
				return aCommeRessourceAttendueRessourceAttendue != null && !aCommeRessourceAttendueRessourceAttendue.isEmpty();
			case SchemaPackage.TYPE_MISSION_RAVITAILLEMENT__APOUR_DEPLOIEMENT_LOGISTIQUE_DEPLOIEMENT:
				return aPourDeploiementLogistiqueDeploiement != null && !aPourDeploiementLogistiqueDeploiement.isEmpty();
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
		result.append(" (consigne: ");
		result.append(consigne);
		result.append(')');
		return result.toString();
	}

} //TypeMissionRavitaillementImpl
