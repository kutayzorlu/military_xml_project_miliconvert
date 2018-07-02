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
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeComportement;
import mpia.schema.TypeConstatDestruction;
import mpia.schema.TypeConstatForce;
import mpia.schema.TypeConstatPopulation;
import mpia.schema.TypeConstatTerrain;
import mpia.schema.TypeDictionaryDicoObservationMouvement;
import mpia.schema.TypeDictionaryDicoTypeVecteur;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeObservation;
import mpia.schema.TypeQuantiteTypeObserve;

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
 * An implementation of the model object '<em><b>Type Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getFormationAppartenance <em>Formation Appartenance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#isNegative <em>Negative</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getDistanceAvecObservateur <em>Distance Avec Observateur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getMouvement <em>Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getPrecisionLocalisation <em>Precision Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getCap <em>Cap</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getTypeVecteur <em>Type Vecteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getAPourComportementComportement <em>APour Comportement Comportement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getADonneLieuConstatDestruction <em>ADonne Lieu Constat Destruction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getADonneLieuConstatPopulation <em>ADonne Lieu Constat Population</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getADonneLieuConstatTerrain <em>ADonne Lieu Constat Terrain</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getADonneLieuConstatForce <em>ADonne Lieu Constat Force</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getAPourSourceRapport <em>APour Source Rapport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getFaitReferenceAuFaitFaitRenseignement <em>Fait Reference Au Fait Fait Renseignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getACommeInstanceObjetObserveeInstanceObjet <em>AComme Instance Objet Observee Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getACommeLocalisationElementObserveLocalisation <em>AComme Localisation Element Observe Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getACommeQuantiteTypeObserveQuantiteTypeObserve <em>AComme Quantite Type Observe Quantite Type Observe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getAPourActiviteActivitePosture <em>APour Activite Activite Posture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getACommeOrigineRenseignementUnite <em>AComme Origine Renseignement Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getACommeTypeSourceTypeUnite <em>AComme Type Source Type Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getAPourTypeCapteurMisEnOeuvreTypeCapteur <em>APour Type Capteur Mis En Oeuvre Type Capteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getEstSujetAssociationObservationObservation <em>Est Sujet Association Observation Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getAPourZoneObserveeAutreElementControle <em>APour Zone Observee Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObservationImpl#getEstObjetAssociationObservationObservation <em>Est Objet Association Observation Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObservationImpl extends TypeRacineOperationnelleImpl implements TypeObservation {
	/**
	 * The default value of the '{@link #getFormationAppartenance() <em>Formation Appartenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormationAppartenance()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMATION_APPARTENANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormationAppartenance() <em>Formation Appartenance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormationAppartenance()
	 * @generated
	 * @ordered
	 */
	protected String formationAppartenance = FORMATION_APPARTENANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean negative = NEGATIVE_EDEFAULT;

	/**
	 * This is true if the Negative attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean negativeESet;

	/**
	 * The cached value of the '{@link #getDistanceAvecObservateur() <em>Distance Avec Observateur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceAvecObservateur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceAvecObservateur;

	/**
	 * The default value of the '{@link #getMouvement() <em>Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouvement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoObservationMouvement MOUVEMENT_EDEFAULT = TypeDictionaryDicoObservationMouvement.A;

	/**
	 * The cached value of the '{@link #getMouvement() <em>Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoObservationMouvement mouvement = MOUVEMENT_EDEFAULT;

	/**
	 * This is true if the Mouvement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mouvementESet;

	/**
	 * The default value of the '{@link #getPrecisionLocalisation() <em>Precision Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLocalisation()
	 * @generated
	 * @ordered
	 */
	protected static final long PRECISION_LOCALISATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPrecisionLocalisation() <em>Precision Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLocalisation()
	 * @generated
	 * @ordered
	 */
	protected long precisionLocalisation = PRECISION_LOCALISATION_EDEFAULT;

	/**
	 * This is true if the Precision Localisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionLocalisationESet;

	/**
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle cap;

	/**
	 * The default value of the '{@link #getTypeVecteur() <em>Type Vecteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVecteur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeVecteur TYPE_VECTEUR_EDEFAULT = TypeDictionaryDicoTypeVecteur.SAT;

	/**
	 * The cached value of the '{@link #getTypeVecteur() <em>Type Vecteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVecteur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeVecteur typeVecteur = TYPE_VECTEUR_EDEFAULT;

	/**
	 * This is true if the Type Vecteur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeVecteurESet;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

	/**
	 * The cached value of the '{@link #getAPourComportementComportement() <em>APour Comportement Comportement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourComportementComportement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeComportement> aPourComportementComportement;

	/**
	 * The cached value of the '{@link #getADonneLieuConstatDestruction() <em>ADonne Lieu Constat Destruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADonneLieuConstatDestruction()
	 * @generated
	 * @ordered
	 */
	protected TypeConstatDestruction aDonneLieuConstatDestruction;

	/**
	 * The cached value of the '{@link #getADonneLieuConstatPopulation() <em>ADonne Lieu Constat Population</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADonneLieuConstatPopulation()
	 * @generated
	 * @ordered
	 */
	protected TypeConstatPopulation aDonneLieuConstatPopulation;

	/**
	 * The cached value of the '{@link #getADonneLieuConstatTerrain() <em>ADonne Lieu Constat Terrain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADonneLieuConstatTerrain()
	 * @generated
	 * @ordered
	 */
	protected TypeConstatTerrain aDonneLieuConstatTerrain;

	/**
	 * The cached value of the '{@link #getADonneLieuConstatForce() <em>ADonne Lieu Constat Force</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADonneLieuConstatForce()
	 * @generated
	 * @ordered
	 */
	protected TypeConstatForce aDonneLieuConstatForce;

	/**
	 * The cached value of the '{@link #getAPourSourceRapport() <em>APour Source Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSourceRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourSourceRapport;

	/**
	 * The cached value of the '{@link #getFaitReferenceAuFaitFaitRenseignement() <em>Fait Reference Au Fait Fait Renseignement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaitReferenceAuFaitFaitRenseignement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation faitReferenceAuFaitFaitRenseignement;

	/**
	 * The cached value of the '{@link #getACommeInstanceObjetObserveeInstanceObjet() <em>AComme Instance Objet Observee Instance Objet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeInstanceObjetObserveeInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeInstanceObjetObserveeInstanceObjet;

	/**
	 * The cached value of the '{@link #getACommeLocalisationElementObserveLocalisation() <em>AComme Localisation Element Observe Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLocalisationElementObserveLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation aCommeLocalisationElementObserveLocalisation;

	/**
	 * The cached value of the '{@link #getACommeQuantiteTypeObserveQuantiteTypeObserve() <em>AComme Quantite Type Observe Quantite Type Observe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeQuantiteTypeObserveQuantiteTypeObserve()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteTypeObserve> aCommeQuantiteTypeObserveQuantiteTypeObserve;

	/**
	 * The cached value of the '{@link #getAPourActiviteActivitePosture() <em>APour Activite Activite Posture</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourActiviteActivitePosture()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourActiviteActivitePosture;

	/**
	 * The cached value of the '{@link #getACommeOrigineRenseignementUnite() <em>AComme Origine Renseignement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeOrigineRenseignementUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeOrigineRenseignementUnite;

	/**
	 * The cached value of the '{@link #getACommeTypeSourceTypeUnite() <em>AComme Type Source Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeSourceTypeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeTypeSourceTypeUnite;

	/**
	 * The cached value of the '{@link #getAPourTypeCapteurMisEnOeuvreTypeCapteur() <em>APour Type Capteur Mis En Oeuvre Type Capteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeCapteurMisEnOeuvreTypeCapteur()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourTypeCapteurMisEnOeuvreTypeCapteur;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationObservationObservation() <em>Est Sujet Association Observation Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationObservationObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationObservationObservation;

	/**
	 * The cached value of the '{@link #getAPourZoneObserveeAutreElementControle() <em>APour Zone Observee Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneObserveeAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneObserveeAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationObservationObservation() <em>Est Objet Association Observation Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationObservationObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationObservationObservation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormationAppartenance() {
		return formationAppartenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormationAppartenance(String newFormationAppartenance) {
		String oldFormationAppartenance = formationAppartenance;
		formationAppartenance = newFormationAppartenance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__FORMATION_APPARTENANCE, oldFormationAppartenance, formationAppartenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegative() {
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegative(boolean newNegative) {
		boolean oldNegative = negative;
		negative = newNegative;
		boolean oldNegativeESet = negativeESet;
		negativeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__NEGATIVE, oldNegative, negative, !oldNegativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNegative() {
		boolean oldNegative = negative;
		boolean oldNegativeESet = negativeESet;
		negative = NEGATIVE_EDEFAULT;
		negativeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBSERVATION__NEGATIVE, oldNegative, NEGATIVE_EDEFAULT, oldNegativeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNegative() {
		return negativeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceAvecObservateur() {
		return distanceAvecObservateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceAvecObservateur(TypeDataTypeLongueur newDistanceAvecObservateur, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceAvecObservateur = distanceAvecObservateur;
		distanceAvecObservateur = newDistanceAvecObservateur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR, oldDistanceAvecObservateur, newDistanceAvecObservateur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceAvecObservateur(TypeDataTypeLongueur newDistanceAvecObservateur) {
		if (newDistanceAvecObservateur != distanceAvecObservateur) {
			NotificationChain msgs = null;
			if (distanceAvecObservateur != null)
				msgs = ((InternalEObject)distanceAvecObservateur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR, null, msgs);
			if (newDistanceAvecObservateur != null)
				msgs = ((InternalEObject)newDistanceAvecObservateur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR, null, msgs);
			msgs = basicSetDistanceAvecObservateur(newDistanceAvecObservateur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR, newDistanceAvecObservateur, newDistanceAvecObservateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoObservationMouvement getMouvement() {
		return mouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouvement(TypeDictionaryDicoObservationMouvement newMouvement) {
		TypeDictionaryDicoObservationMouvement oldMouvement = mouvement;
		mouvement = newMouvement == null ? MOUVEMENT_EDEFAULT : newMouvement;
		boolean oldMouvementESet = mouvementESet;
		mouvementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__MOUVEMENT, oldMouvement, mouvement, !oldMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMouvement() {
		TypeDictionaryDicoObservationMouvement oldMouvement = mouvement;
		boolean oldMouvementESet = mouvementESet;
		mouvement = MOUVEMENT_EDEFAULT;
		mouvementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBSERVATION__MOUVEMENT, oldMouvement, MOUVEMENT_EDEFAULT, oldMouvementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMouvement() {
		return mouvementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPrecisionLocalisation() {
		return precisionLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionLocalisation(long newPrecisionLocalisation) {
		long oldPrecisionLocalisation = precisionLocalisation;
		precisionLocalisation = newPrecisionLocalisation;
		boolean oldPrecisionLocalisationESet = precisionLocalisationESet;
		precisionLocalisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__PRECISION_LOCALISATION, oldPrecisionLocalisation, precisionLocalisation, !oldPrecisionLocalisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionLocalisation() {
		long oldPrecisionLocalisation = precisionLocalisation;
		boolean oldPrecisionLocalisationESet = precisionLocalisationESet;
		precisionLocalisation = PRECISION_LOCALISATION_EDEFAULT;
		precisionLocalisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBSERVATION__PRECISION_LOCALISATION, oldPrecisionLocalisation, PRECISION_LOCALISATION_EDEFAULT, oldPrecisionLocalisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionLocalisation() {
		return precisionLocalisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCap(TypeDataTypeAngle newCap, NotificationChain msgs) {
		TypeDataTypeAngle oldCap = cap;
		cap = newCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__CAP, oldCap, newCap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCap(TypeDataTypeAngle newCap) {
		if (newCap != cap) {
			NotificationChain msgs = null;
			if (cap != null)
				msgs = ((InternalEObject)cap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__CAP, null, msgs);
			if (newCap != null)
				msgs = ((InternalEObject)newCap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__CAP, null, msgs);
			msgs = basicSetCap(newCap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__CAP, newCap, newCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeVecteur getTypeVecteur() {
		return typeVecteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVecteur(TypeDictionaryDicoTypeVecteur newTypeVecteur) {
		TypeDictionaryDicoTypeVecteur oldTypeVecteur = typeVecteur;
		typeVecteur = newTypeVecteur == null ? TYPE_VECTEUR_EDEFAULT : newTypeVecteur;
		boolean oldTypeVecteurESet = typeVecteurESet;
		typeVecteurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__TYPE_VECTEUR, oldTypeVecteur, typeVecteur, !oldTypeVecteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeVecteur() {
		TypeDictionaryDicoTypeVecteur oldTypeVecteur = typeVecteur;
		boolean oldTypeVecteurESet = typeVecteurESet;
		typeVecteur = TYPE_VECTEUR_EDEFAULT;
		typeVecteurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_OBSERVATION__TYPE_VECTEUR, oldTypeVecteur, TYPE_VECTEUR_EDEFAULT, oldTypeVecteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeVecteur() {
		return typeVecteurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeComportement> getAPourComportementComportement() {
		if (aPourComportementComportement == null) {
			aPourComportementComportement = new EObjectContainmentEList<TypeComportement>(TypeComportement.class, this, SchemaPackage.TYPE_OBSERVATION__APOUR_COMPORTEMENT_COMPORTEMENT);
		}
		return aPourComportementComportement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstatDestruction getADonneLieuConstatDestruction() {
		return aDonneLieuConstatDestruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetADonneLieuConstatDestruction(TypeConstatDestruction newADonneLieuConstatDestruction, NotificationChain msgs) {
		TypeConstatDestruction oldADonneLieuConstatDestruction = aDonneLieuConstatDestruction;
		aDonneLieuConstatDestruction = newADonneLieuConstatDestruction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION, oldADonneLieuConstatDestruction, newADonneLieuConstatDestruction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADonneLieuConstatDestruction(TypeConstatDestruction newADonneLieuConstatDestruction) {
		if (newADonneLieuConstatDestruction != aDonneLieuConstatDestruction) {
			NotificationChain msgs = null;
			if (aDonneLieuConstatDestruction != null)
				msgs = ((InternalEObject)aDonneLieuConstatDestruction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION, null, msgs);
			if (newADonneLieuConstatDestruction != null)
				msgs = ((InternalEObject)newADonneLieuConstatDestruction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION, null, msgs);
			msgs = basicSetADonneLieuConstatDestruction(newADonneLieuConstatDestruction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION, newADonneLieuConstatDestruction, newADonneLieuConstatDestruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstatPopulation getADonneLieuConstatPopulation() {
		return aDonneLieuConstatPopulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetADonneLieuConstatPopulation(TypeConstatPopulation newADonneLieuConstatPopulation, NotificationChain msgs) {
		TypeConstatPopulation oldADonneLieuConstatPopulation = aDonneLieuConstatPopulation;
		aDonneLieuConstatPopulation = newADonneLieuConstatPopulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION, oldADonneLieuConstatPopulation, newADonneLieuConstatPopulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADonneLieuConstatPopulation(TypeConstatPopulation newADonneLieuConstatPopulation) {
		if (newADonneLieuConstatPopulation != aDonneLieuConstatPopulation) {
			NotificationChain msgs = null;
			if (aDonneLieuConstatPopulation != null)
				msgs = ((InternalEObject)aDonneLieuConstatPopulation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION, null, msgs);
			if (newADonneLieuConstatPopulation != null)
				msgs = ((InternalEObject)newADonneLieuConstatPopulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION, null, msgs);
			msgs = basicSetADonneLieuConstatPopulation(newADonneLieuConstatPopulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION, newADonneLieuConstatPopulation, newADonneLieuConstatPopulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstatTerrain getADonneLieuConstatTerrain() {
		return aDonneLieuConstatTerrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetADonneLieuConstatTerrain(TypeConstatTerrain newADonneLieuConstatTerrain, NotificationChain msgs) {
		TypeConstatTerrain oldADonneLieuConstatTerrain = aDonneLieuConstatTerrain;
		aDonneLieuConstatTerrain = newADonneLieuConstatTerrain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN, oldADonneLieuConstatTerrain, newADonneLieuConstatTerrain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADonneLieuConstatTerrain(TypeConstatTerrain newADonneLieuConstatTerrain) {
		if (newADonneLieuConstatTerrain != aDonneLieuConstatTerrain) {
			NotificationChain msgs = null;
			if (aDonneLieuConstatTerrain != null)
				msgs = ((InternalEObject)aDonneLieuConstatTerrain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN, null, msgs);
			if (newADonneLieuConstatTerrain != null)
				msgs = ((InternalEObject)newADonneLieuConstatTerrain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN, null, msgs);
			msgs = basicSetADonneLieuConstatTerrain(newADonneLieuConstatTerrain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN, newADonneLieuConstatTerrain, newADonneLieuConstatTerrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstatForce getADonneLieuConstatForce() {
		return aDonneLieuConstatForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetADonneLieuConstatForce(TypeConstatForce newADonneLieuConstatForce, NotificationChain msgs) {
		TypeConstatForce oldADonneLieuConstatForce = aDonneLieuConstatForce;
		aDonneLieuConstatForce = newADonneLieuConstatForce;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE, oldADonneLieuConstatForce, newADonneLieuConstatForce);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADonneLieuConstatForce(TypeConstatForce newADonneLieuConstatForce) {
		if (newADonneLieuConstatForce != aDonneLieuConstatForce) {
			NotificationChain msgs = null;
			if (aDonneLieuConstatForce != null)
				msgs = ((InternalEObject)aDonneLieuConstatForce).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE, null, msgs);
			if (newADonneLieuConstatForce != null)
				msgs = ((InternalEObject)newADonneLieuConstatForce).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE, null, msgs);
			msgs = basicSetADonneLieuConstatForce(newADonneLieuConstatForce, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE, newADonneLieuConstatForce, newADonneLieuConstatForce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourSourceRapport() {
		return aPourSourceRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSourceRapport(TypeAssociation newAPourSourceRapport, NotificationChain msgs) {
		TypeAssociation oldAPourSourceRapport = aPourSourceRapport;
		aPourSourceRapport = newAPourSourceRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT, oldAPourSourceRapport, newAPourSourceRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSourceRapport(TypeAssociation newAPourSourceRapport) {
		if (newAPourSourceRapport != aPourSourceRapport) {
			NotificationChain msgs = null;
			if (aPourSourceRapport != null)
				msgs = ((InternalEObject)aPourSourceRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT, null, msgs);
			if (newAPourSourceRapport != null)
				msgs = ((InternalEObject)newAPourSourceRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT, null, msgs);
			msgs = basicSetAPourSourceRapport(newAPourSourceRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT, newAPourSourceRapport, newAPourSourceRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getFaitReferenceAuFaitFaitRenseignement() {
		return faitReferenceAuFaitFaitRenseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaitReferenceAuFaitFaitRenseignement(TypeAssociation newFaitReferenceAuFaitFaitRenseignement, NotificationChain msgs) {
		TypeAssociation oldFaitReferenceAuFaitFaitRenseignement = faitReferenceAuFaitFaitRenseignement;
		faitReferenceAuFaitFaitRenseignement = newFaitReferenceAuFaitFaitRenseignement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT, oldFaitReferenceAuFaitFaitRenseignement, newFaitReferenceAuFaitFaitRenseignement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaitReferenceAuFaitFaitRenseignement(TypeAssociation newFaitReferenceAuFaitFaitRenseignement) {
		if (newFaitReferenceAuFaitFaitRenseignement != faitReferenceAuFaitFaitRenseignement) {
			NotificationChain msgs = null;
			if (faitReferenceAuFaitFaitRenseignement != null)
				msgs = ((InternalEObject)faitReferenceAuFaitFaitRenseignement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT, null, msgs);
			if (newFaitReferenceAuFaitFaitRenseignement != null)
				msgs = ((InternalEObject)newFaitReferenceAuFaitFaitRenseignement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT, null, msgs);
			msgs = basicSetFaitReferenceAuFaitFaitRenseignement(newFaitReferenceAuFaitFaitRenseignement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT, newFaitReferenceAuFaitFaitRenseignement, newFaitReferenceAuFaitFaitRenseignement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeInstanceObjetObserveeInstanceObjet() {
		if (aCommeInstanceObjetObserveeInstanceObjet == null) {
			aCommeInstanceObjetObserveeInstanceObjet = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBSERVATION__ACOMME_INSTANCE_OBJET_OBSERVEE_INSTANCE_OBJET);
		}
		return aCommeInstanceObjetObserveeInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getACommeLocalisationElementObserveLocalisation() {
		return aCommeLocalisationElementObserveLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLocalisationElementObserveLocalisation(TypeLocalisation newACommeLocalisationElementObserveLocalisation, NotificationChain msgs) {
		TypeLocalisation oldACommeLocalisationElementObserveLocalisation = aCommeLocalisationElementObserveLocalisation;
		aCommeLocalisationElementObserveLocalisation = newACommeLocalisationElementObserveLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION, oldACommeLocalisationElementObserveLocalisation, newACommeLocalisationElementObserveLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLocalisationElementObserveLocalisation(TypeLocalisation newACommeLocalisationElementObserveLocalisation) {
		if (newACommeLocalisationElementObserveLocalisation != aCommeLocalisationElementObserveLocalisation) {
			NotificationChain msgs = null;
			if (aCommeLocalisationElementObserveLocalisation != null)
				msgs = ((InternalEObject)aCommeLocalisationElementObserveLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION, null, msgs);
			if (newACommeLocalisationElementObserveLocalisation != null)
				msgs = ((InternalEObject)newACommeLocalisationElementObserveLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION, null, msgs);
			msgs = basicSetACommeLocalisationElementObserveLocalisation(newACommeLocalisationElementObserveLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION, newACommeLocalisationElementObserveLocalisation, newACommeLocalisationElementObserveLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteTypeObserve> getACommeQuantiteTypeObserveQuantiteTypeObserve() {
		if (aCommeQuantiteTypeObserveQuantiteTypeObserve == null) {
			aCommeQuantiteTypeObserveQuantiteTypeObserve = new EObjectContainmentEList<TypeQuantiteTypeObserve>(TypeQuantiteTypeObserve.class, this, SchemaPackage.TYPE_OBSERVATION__ACOMME_QUANTITE_TYPE_OBSERVE_QUANTITE_TYPE_OBSERVE);
		}
		return aCommeQuantiteTypeObserveQuantiteTypeObserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourActiviteActivitePosture() {
		if (aPourActiviteActivitePosture == null) {
			aPourActiviteActivitePosture = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBSERVATION__APOUR_ACTIVITE_ACTIVITE_POSTURE);
		}
		return aPourActiviteActivitePosture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeOrigineRenseignementUnite() {
		return aCommeOrigineRenseignementUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeOrigineRenseignementUnite(TypeAssociationEXT newACommeOrigineRenseignementUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeOrigineRenseignementUnite = aCommeOrigineRenseignementUnite;
		aCommeOrigineRenseignementUnite = newACommeOrigineRenseignementUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE, oldACommeOrigineRenseignementUnite, newACommeOrigineRenseignementUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeOrigineRenseignementUnite(TypeAssociationEXT newACommeOrigineRenseignementUnite) {
		if (newACommeOrigineRenseignementUnite != aCommeOrigineRenseignementUnite) {
			NotificationChain msgs = null;
			if (aCommeOrigineRenseignementUnite != null)
				msgs = ((InternalEObject)aCommeOrigineRenseignementUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE, null, msgs);
			if (newACommeOrigineRenseignementUnite != null)
				msgs = ((InternalEObject)newACommeOrigineRenseignementUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE, null, msgs);
			msgs = basicSetACommeOrigineRenseignementUnite(newACommeOrigineRenseignementUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE, newACommeOrigineRenseignementUnite, newACommeOrigineRenseignementUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeTypeSourceTypeUnite() {
		return aCommeTypeSourceTypeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeTypeSourceTypeUnite(TypeAssociationEXT newACommeTypeSourceTypeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldACommeTypeSourceTypeUnite = aCommeTypeSourceTypeUnite;
		aCommeTypeSourceTypeUnite = newACommeTypeSourceTypeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE, oldACommeTypeSourceTypeUnite, newACommeTypeSourceTypeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeTypeSourceTypeUnite(TypeAssociationEXT newACommeTypeSourceTypeUnite) {
		if (newACommeTypeSourceTypeUnite != aCommeTypeSourceTypeUnite) {
			NotificationChain msgs = null;
			if (aCommeTypeSourceTypeUnite != null)
				msgs = ((InternalEObject)aCommeTypeSourceTypeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE, null, msgs);
			if (newACommeTypeSourceTypeUnite != null)
				msgs = ((InternalEObject)newACommeTypeSourceTypeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE, null, msgs);
			msgs = basicSetACommeTypeSourceTypeUnite(newACommeTypeSourceTypeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE, newACommeTypeSourceTypeUnite, newACommeTypeSourceTypeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourTypeCapteurMisEnOeuvreTypeCapteur() {
		return aPourTypeCapteurMisEnOeuvreTypeCapteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTypeCapteurMisEnOeuvreTypeCapteur(TypeAssociationEXT newAPourTypeCapteurMisEnOeuvreTypeCapteur, NotificationChain msgs) {
		TypeAssociationEXT oldAPourTypeCapteurMisEnOeuvreTypeCapteur = aPourTypeCapteurMisEnOeuvreTypeCapteur;
		aPourTypeCapteurMisEnOeuvreTypeCapteur = newAPourTypeCapteurMisEnOeuvreTypeCapteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR, oldAPourTypeCapteurMisEnOeuvreTypeCapteur, newAPourTypeCapteurMisEnOeuvreTypeCapteur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTypeCapteurMisEnOeuvreTypeCapteur(TypeAssociationEXT newAPourTypeCapteurMisEnOeuvreTypeCapteur) {
		if (newAPourTypeCapteurMisEnOeuvreTypeCapteur != aPourTypeCapteurMisEnOeuvreTypeCapteur) {
			NotificationChain msgs = null;
			if (aPourTypeCapteurMisEnOeuvreTypeCapteur != null)
				msgs = ((InternalEObject)aPourTypeCapteurMisEnOeuvreTypeCapteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR, null, msgs);
			if (newAPourTypeCapteurMisEnOeuvreTypeCapteur != null)
				msgs = ((InternalEObject)newAPourTypeCapteurMisEnOeuvreTypeCapteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR, null, msgs);
			msgs = basicSetAPourTypeCapteurMisEnOeuvreTypeCapteur(newAPourTypeCapteurMisEnOeuvreTypeCapteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR, newAPourTypeCapteurMisEnOeuvreTypeCapteur, newAPourTypeCapteurMisEnOeuvreTypeCapteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationObservationObservation() {
		if (estSujetAssociationObservationObservation == null) {
			estSujetAssociationObservationObservation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBSERVATION__EST_SUJET_ASSOCIATION_OBSERVATION_OBSERVATION);
		}
		return estSujetAssociationObservationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneObserveeAutreElementControle() {
		return aPourZoneObserveeAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneObserveeAutreElementControle(TypeAssociation newAPourZoneObserveeAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneObserveeAutreElementControle = aPourZoneObserveeAutreElementControle;
		aPourZoneObserveeAutreElementControle = newAPourZoneObserveeAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE, oldAPourZoneObserveeAutreElementControle, newAPourZoneObserveeAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneObserveeAutreElementControle(TypeAssociation newAPourZoneObserveeAutreElementControle) {
		if (newAPourZoneObserveeAutreElementControle != aPourZoneObserveeAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneObserveeAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneObserveeAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneObserveeAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneObserveeAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneObserveeAutreElementControle(newAPourZoneObserveeAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE, newAPourZoneObserveeAutreElementControle, newAPourZoneObserveeAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationObservationObservation() {
		if (estObjetAssociationObservationObservation == null) {
			estObjetAssociationObservationObservation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_OBSERVATION__EST_OBJET_ASSOCIATION_OBSERVATION_OBSERVATION);
		}
		return estObjetAssociationObservationObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR:
				return basicSetDistanceAvecObservateur(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__CAP:
				return basicSetCap(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__APOUR_COMPORTEMENT_COMPORTEMENT:
				return ((InternalEList<?>)getAPourComportementComportement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION:
				return basicSetADonneLieuConstatDestruction(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION:
				return basicSetADonneLieuConstatPopulation(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN:
				return basicSetADonneLieuConstatTerrain(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE:
				return basicSetADonneLieuConstatForce(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT:
				return basicSetAPourSourceRapport(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT:
				return basicSetFaitReferenceAuFaitFaitRenseignement(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_INSTANCE_OBJET_OBSERVEE_INSTANCE_OBJET:
				return ((InternalEList<?>)getACommeInstanceObjetObserveeInstanceObjet()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION:
				return basicSetACommeLocalisationElementObserveLocalisation(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_QUANTITE_TYPE_OBSERVE_QUANTITE_TYPE_OBSERVE:
				return ((InternalEList<?>)getACommeQuantiteTypeObserveQuantiteTypeObserve()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				return ((InternalEList<?>)getAPourActiviteActivitePosture()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE:
				return basicSetACommeOrigineRenseignementUnite(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE:
				return basicSetACommeTypeSourceTypeUnite(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				return basicSetAPourTypeCapteurMisEnOeuvreTypeCapteur(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__EST_SUJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				return ((InternalEList<?>)getEstSujetAssociationObservationObservation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneObserveeAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_OBSERVATION__EST_OBJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				return ((InternalEList<?>)getEstObjetAssociationObservationObservation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_OBSERVATION__FORMATION_APPARTENANCE:
				return getFormationAppartenance();
			case SchemaPackage.TYPE_OBSERVATION__NEGATIVE:
				return isNegative() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR:
				return getDistanceAvecObservateur();
			case SchemaPackage.TYPE_OBSERVATION__MOUVEMENT:
				return getMouvement();
			case SchemaPackage.TYPE_OBSERVATION__PRECISION_LOCALISATION:
				return new Long(getPrecisionLocalisation());
			case SchemaPackage.TYPE_OBSERVATION__CAP:
				return getCap();
			case SchemaPackage.TYPE_OBSERVATION__TYPE_VECTEUR:
				return getTypeVecteur();
			case SchemaPackage.TYPE_OBSERVATION__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_OBSERVATION__APOUR_COMPORTEMENT_COMPORTEMENT:
				return getAPourComportementComportement();
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION:
				return getADonneLieuConstatDestruction();
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION:
				return getADonneLieuConstatPopulation();
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN:
				return getADonneLieuConstatTerrain();
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE:
				return getADonneLieuConstatForce();
			case SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT:
				return getAPourSourceRapport();
			case SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT:
				return getFaitReferenceAuFaitFaitRenseignement();
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_INSTANCE_OBJET_OBSERVEE_INSTANCE_OBJET:
				return getACommeInstanceObjetObserveeInstanceObjet();
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION:
				return getACommeLocalisationElementObserveLocalisation();
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_QUANTITE_TYPE_OBSERVE_QUANTITE_TYPE_OBSERVE:
				return getACommeQuantiteTypeObserveQuantiteTypeObserve();
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				return getAPourActiviteActivitePosture();
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE:
				return getACommeOrigineRenseignementUnite();
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE:
				return getACommeTypeSourceTypeUnite();
			case SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				return getAPourTypeCapteurMisEnOeuvreTypeCapteur();
			case SchemaPackage.TYPE_OBSERVATION__EST_SUJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				return getEstSujetAssociationObservationObservation();
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneObserveeAutreElementControle();
			case SchemaPackage.TYPE_OBSERVATION__EST_OBJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				return getEstObjetAssociationObservationObservation();
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
			case SchemaPackage.TYPE_OBSERVATION__FORMATION_APPARTENANCE:
				setFormationAppartenance((String)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__NEGATIVE:
				setNegative(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR:
				setDistanceAvecObservateur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__MOUVEMENT:
				setMouvement((TypeDictionaryDicoObservationMouvement)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__PRECISION_LOCALISATION:
				setPrecisionLocalisation(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_OBSERVATION__CAP:
				setCap((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__TYPE_VECTEUR:
				setTypeVecteur((TypeDictionaryDicoTypeVecteur)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_COMPORTEMENT_COMPORTEMENT:
				getAPourComportementComportement().clear();
				getAPourComportementComportement().addAll((Collection<? extends TypeComportement>)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION:
				setADonneLieuConstatDestruction((TypeConstatDestruction)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION:
				setADonneLieuConstatPopulation((TypeConstatPopulation)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN:
				setADonneLieuConstatTerrain((TypeConstatTerrain)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE:
				setADonneLieuConstatForce((TypeConstatForce)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT:
				setAPourSourceRapport((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT:
				setFaitReferenceAuFaitFaitRenseignement((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_INSTANCE_OBJET_OBSERVEE_INSTANCE_OBJET:
				getACommeInstanceObjetObserveeInstanceObjet().clear();
				getACommeInstanceObjetObserveeInstanceObjet().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION:
				setACommeLocalisationElementObserveLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_QUANTITE_TYPE_OBSERVE_QUANTITE_TYPE_OBSERVE:
				getACommeQuantiteTypeObserveQuantiteTypeObserve().clear();
				getACommeQuantiteTypeObserveQuantiteTypeObserve().addAll((Collection<? extends TypeQuantiteTypeObserve>)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				getAPourActiviteActivitePosture().clear();
				getAPourActiviteActivitePosture().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE:
				setACommeOrigineRenseignementUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE:
				setACommeTypeSourceTypeUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				setAPourTypeCapteurMisEnOeuvreTypeCapteur((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__EST_SUJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				getEstSujetAssociationObservationObservation().clear();
				getEstSujetAssociationObservationObservation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneObserveeAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_OBSERVATION__EST_OBJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				getEstObjetAssociationObservationObservation().clear();
				getEstObjetAssociationObservationObservation().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_OBSERVATION__FORMATION_APPARTENANCE:
				setFormationAppartenance(FORMATION_APPARTENANCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBSERVATION__NEGATIVE:
				unsetNegative();
				return;
			case SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR:
				setDistanceAvecObservateur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__MOUVEMENT:
				unsetMouvement();
				return;
			case SchemaPackage.TYPE_OBSERVATION__PRECISION_LOCALISATION:
				unsetPrecisionLocalisation();
				return;
			case SchemaPackage.TYPE_OBSERVATION__CAP:
				setCap((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__TYPE_VECTEUR:
				unsetTypeVecteur();
				return;
			case SchemaPackage.TYPE_OBSERVATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_COMPORTEMENT_COMPORTEMENT:
				getAPourComportementComportement().clear();
				return;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION:
				setADonneLieuConstatDestruction((TypeConstatDestruction)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION:
				setADonneLieuConstatPopulation((TypeConstatPopulation)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN:
				setADonneLieuConstatTerrain((TypeConstatTerrain)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE:
				setADonneLieuConstatForce((TypeConstatForce)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT:
				setAPourSourceRapport((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT:
				setFaitReferenceAuFaitFaitRenseignement((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_INSTANCE_OBJET_OBSERVEE_INSTANCE_OBJET:
				getACommeInstanceObjetObserveeInstanceObjet().clear();
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION:
				setACommeLocalisationElementObserveLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_QUANTITE_TYPE_OBSERVE_QUANTITE_TYPE_OBSERVE:
				getACommeQuantiteTypeObserveQuantiteTypeObserve().clear();
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				getAPourActiviteActivitePosture().clear();
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE:
				setACommeOrigineRenseignementUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE:
				setACommeTypeSourceTypeUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				setAPourTypeCapteurMisEnOeuvreTypeCapteur((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__EST_SUJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				getEstSujetAssociationObservationObservation().clear();
				return;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneObserveeAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_OBSERVATION__EST_OBJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				getEstObjetAssociationObservationObservation().clear();
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
			case SchemaPackage.TYPE_OBSERVATION__FORMATION_APPARTENANCE:
				return FORMATION_APPARTENANCE_EDEFAULT == null ? formationAppartenance != null : !FORMATION_APPARTENANCE_EDEFAULT.equals(formationAppartenance);
			case SchemaPackage.TYPE_OBSERVATION__NEGATIVE:
				return isSetNegative();
			case SchemaPackage.TYPE_OBSERVATION__DISTANCE_AVEC_OBSERVATEUR:
				return distanceAvecObservateur != null;
			case SchemaPackage.TYPE_OBSERVATION__MOUVEMENT:
				return isSetMouvement();
			case SchemaPackage.TYPE_OBSERVATION__PRECISION_LOCALISATION:
				return isSetPrecisionLocalisation();
			case SchemaPackage.TYPE_OBSERVATION__CAP:
				return cap != null;
			case SchemaPackage.TYPE_OBSERVATION__TYPE_VECTEUR:
				return isSetTypeVecteur();
			case SchemaPackage.TYPE_OBSERVATION__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_COMPORTEMENT_COMPORTEMENT:
				return aPourComportementComportement != null && !aPourComportementComportement.isEmpty();
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_DESTRUCTION:
				return aDonneLieuConstatDestruction != null;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_POPULATION:
				return aDonneLieuConstatPopulation != null;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_TERRAIN:
				return aDonneLieuConstatTerrain != null;
			case SchemaPackage.TYPE_OBSERVATION__ADONNE_LIEU_CONSTAT_FORCE:
				return aDonneLieuConstatForce != null;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_SOURCE_RAPPORT:
				return aPourSourceRapport != null;
			case SchemaPackage.TYPE_OBSERVATION__FAIT_REFERENCE_AU_FAIT_FAIT_RENSEIGNEMENT:
				return faitReferenceAuFaitFaitRenseignement != null;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_INSTANCE_OBJET_OBSERVEE_INSTANCE_OBJET:
				return aCommeInstanceObjetObserveeInstanceObjet != null && !aCommeInstanceObjetObserveeInstanceObjet.isEmpty();
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_LOCALISATION_ELEMENT_OBSERVE_LOCALISATION:
				return aCommeLocalisationElementObserveLocalisation != null;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_QUANTITE_TYPE_OBSERVE_QUANTITE_TYPE_OBSERVE:
				return aCommeQuantiteTypeObserveQuantiteTypeObserve != null && !aCommeQuantiteTypeObserveQuantiteTypeObserve.isEmpty();
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ACTIVITE_ACTIVITE_POSTURE:
				return aPourActiviteActivitePosture != null && !aPourActiviteActivitePosture.isEmpty();
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_ORIGINE_RENSEIGNEMENT_UNITE:
				return aCommeOrigineRenseignementUnite != null;
			case SchemaPackage.TYPE_OBSERVATION__ACOMME_TYPE_SOURCE_TYPE_UNITE:
				return aCommeTypeSourceTypeUnite != null;
			case SchemaPackage.TYPE_OBSERVATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				return aPourTypeCapteurMisEnOeuvreTypeCapteur != null;
			case SchemaPackage.TYPE_OBSERVATION__EST_SUJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				return estSujetAssociationObservationObservation != null && !estSujetAssociationObservationObservation.isEmpty();
			case SchemaPackage.TYPE_OBSERVATION__APOUR_ZONE_OBSERVEE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneObserveeAutreElementControle != null;
			case SchemaPackage.TYPE_OBSERVATION__EST_OBJET_ASSOCIATION_OBSERVATION_OBSERVATION:
				return estObjetAssociationObservationObservation != null && !estObjetAssociationObservationObservation.isEmpty();
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
		result.append(" (formationAppartenance: ");
		result.append(formationAppartenance);
		result.append(", negative: ");
		if (negativeESet) result.append(negative); else result.append("<unset>");
		result.append(", mouvement: ");
		if (mouvementESet) result.append(mouvement); else result.append("<unset>");
		result.append(", precisionLocalisation: ");
		if (precisionLocalisationESet) result.append(precisionLocalisation); else result.append("<unset>");
		result.append(", typeVecteur: ");
		if (typeVecteurESet) result.append(typeVecteur); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeObservationImpl
