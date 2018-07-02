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
import mpia.schema.TypeCRplanFeux;
import mpia.schema.TypeDictionaryDicoPlanFeuxEtatPlanification;
import mpia.schema.TypePlanFeux;
import mpia.schema.TypeUniteParticipante;

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
 * An implementation of the model object '<em><b>Type Plan Feux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getEtatPlanification <em>Etat Planification</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getEvaluationPlan <em>Evaluation Plan</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getDebutActivation <em>Debut Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getFinActivation <em>Fin Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getHeureH <em>Heure H</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getEstObjetAssociationMesureCoordinationPlanFeux <em>Est Objet Association Mesure Coordination Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getAPourCompteRenduCRplanFeux <em>APour Compte Rendu CRplan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getAPourListesObjectifsCandidatsListeObjectifsCandidats <em>APour Listes Objectifs Candidats Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getAPourZonesObjectifsAutreElementControle <em>APour Zones Objectifs Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getAPourListesObjectifsPlanifiesListeObjectifsPlanifies <em>APour Listes Objectifs Planifies Liste Objectifs Planifies</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getAPourParticipantsUniteParticipante <em>APour Participants Unite Participante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getPrevoitReservationUnite <em>Prevoit Reservation Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getEstObjetAssociationUnitePlanFeux <em>Est Objet Association Unite Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getAPourBilanTirsASSassocieBilanTirsASS <em>APour Bilan Tirs AS Sassocie Bilan Tirs ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getAPourInterventionGeneraleInterventionGenerale <em>APour Intervention Generale Intervention Generale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePlanFeuxImpl#getAPourPolitiqueTirPolitiqueTir <em>APour Politique Tir Politique Tir</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePlanFeuxImpl extends TypeActiviteImpl implements TypePlanFeux {
	/**
	 * The default value of the '{@link #getEtatPlanification() <em>Etat Planification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPlanification()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPlanFeuxEtatPlanification ETAT_PLANIFICATION_EDEFAULT = TypeDictionaryDicoPlanFeuxEtatPlanification.TOEVALU;

	/**
	 * The cached value of the '{@link #getEtatPlanification() <em>Etat Planification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPlanification()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPlanFeuxEtatPlanification etatPlanification = ETAT_PLANIFICATION_EDEFAULT;

	/**
	 * This is true if the Etat Planification attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatPlanificationESet;

	/**
	 * The default value of the '{@link #getEvaluationPlan() <em>Evaluation Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationPlan()
	 * @generated
	 * @ordered
	 */
	protected static final String EVALUATION_PLAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluationPlan() <em>Evaluation Plan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationPlan()
	 * @generated
	 * @ordered
	 */
	protected String evaluationPlan = EVALUATION_PLAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebutActivation() <em>Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutActivation() <em>Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutActivation = DEBUT_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinActivation() <em>Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinActivation() <em>Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finActivation = FIN_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureH() <em>Heure H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureH()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureH() <em>Heure H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureH()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureH = HEURE_H_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationMesureCoordinationPlanFeux() <em>Est Objet Association Mesure Coordination Plan Feux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationMesureCoordinationPlanFeux()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationMesureCoordinationPlanFeux;

	/**
	 * The cached value of the '{@link #getAPourCompteRenduCRplanFeux() <em>APour Compte Rendu CRplan Feux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCompteRenduCRplanFeux()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCRplanFeux> aPourCompteRenduCRplanFeux;

	/**
	 * The cached value of the '{@link #getAPourListesObjectifsCandidatsListeObjectifsCandidats() <em>APour Listes Objectifs Candidats Liste Objectifs Candidats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourListesObjectifsCandidatsListeObjectifsCandidats()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourListesObjectifsCandidatsListeObjectifsCandidats;

	/**
	 * The cached value of the '{@link #getAPourZonesObjectifsAutreElementControle() <em>APour Zones Objectifs Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonesObjectifsAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZonesObjectifsAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourListesObjectifsPlanifiesListeObjectifsPlanifies() <em>APour Listes Objectifs Planifies Liste Objectifs Planifies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourListesObjectifsPlanifiesListeObjectifsPlanifies()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourListesObjectifsPlanifiesListeObjectifsPlanifies;

	/**
	 * The cached value of the '{@link #getAPourParticipantsUniteParticipante() <em>APour Participants Unite Participante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourParticipantsUniteParticipante()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeUniteParticipante> aPourParticipantsUniteParticipante;

	/**
	 * The cached value of the '{@link #getPrevoitReservationUnite() <em>Prevoit Reservation Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevoitReservationUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> prevoitReservationUnite;

	/**
	 * The cached value of the '{@link #getEstObjetAssociationUnitePlanFeux() <em>Est Objet Association Unite Plan Feux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstObjetAssociationUnitePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estObjetAssociationUnitePlanFeux;

	/**
	 * The cached value of the '{@link #getAPourBilanTirsASSassocieBilanTirsASS() <em>APour Bilan Tirs AS Sassocie Bilan Tirs ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBilanTirsASSassocieBilanTirsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourBilanTirsASSassocieBilanTirsASS;

	/**
	 * The cached value of the '{@link #getAPourInterventionGeneraleInterventionGenerale() <em>APour Intervention Generale Intervention Generale</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourInterventionGeneraleInterventionGenerale()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourInterventionGeneraleInterventionGenerale;

	/**
	 * The cached value of the '{@link #getAPourPolitiqueTirPolitiqueTir() <em>APour Politique Tir Politique Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPolitiqueTirPolitiqueTir()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourPolitiqueTirPolitiqueTir;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePlanFeuxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePlanFeux();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPlanFeuxEtatPlanification getEtatPlanification() {
		return etatPlanification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatPlanification(TypeDictionaryDicoPlanFeuxEtatPlanification newEtatPlanification) {
		TypeDictionaryDicoPlanFeuxEtatPlanification oldEtatPlanification = etatPlanification;
		etatPlanification = newEtatPlanification == null ? ETAT_PLANIFICATION_EDEFAULT : newEtatPlanification;
		boolean oldEtatPlanificationESet = etatPlanificationESet;
		etatPlanificationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_FEUX__ETAT_PLANIFICATION, oldEtatPlanification, etatPlanification, !oldEtatPlanificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatPlanification() {
		TypeDictionaryDicoPlanFeuxEtatPlanification oldEtatPlanification = etatPlanification;
		boolean oldEtatPlanificationESet = etatPlanificationESet;
		etatPlanification = ETAT_PLANIFICATION_EDEFAULT;
		etatPlanificationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PLAN_FEUX__ETAT_PLANIFICATION, oldEtatPlanification, ETAT_PLANIFICATION_EDEFAULT, oldEtatPlanificationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatPlanification() {
		return etatPlanificationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvaluationPlan() {
		return evaluationPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationPlan(String newEvaluationPlan) {
		String oldEvaluationPlan = evaluationPlan;
		evaluationPlan = newEvaluationPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_FEUX__EVALUATION_PLAN, oldEvaluationPlan, evaluationPlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutActivation() {
		return debutActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutActivation(XMLGregorianCalendar newDebutActivation) {
		XMLGregorianCalendar oldDebutActivation = debutActivation;
		debutActivation = newDebutActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_FEUX__DEBUT_ACTIVATION, oldDebutActivation, debutActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinActivation() {
		return finActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinActivation(XMLGregorianCalendar newFinActivation) {
		XMLGregorianCalendar oldFinActivation = finActivation;
		finActivation = newFinActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_FEUX__FIN_ACTIVATION, oldFinActivation, finActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureH() {
		return heureH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureH(XMLGregorianCalendar newHeureH) {
		XMLGregorianCalendar oldHeureH = heureH;
		heureH = newHeureH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_FEUX__HEURE_H, oldHeureH, heureH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationMesureCoordinationPlanFeux() {
		if (estObjetAssociationMesureCoordinationPlanFeux == null) {
			estObjetAssociationMesureCoordinationPlanFeux = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX);
		}
		return estObjetAssociationMesureCoordinationPlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCRplanFeux> getAPourCompteRenduCRplanFeux() {
		if (aPourCompteRenduCRplanFeux == null) {
			aPourCompteRenduCRplanFeux = new EObjectContainmentEList<TypeCRplanFeux>(TypeCRplanFeux.class, this, SchemaPackage.TYPE_PLAN_FEUX__APOUR_COMPTE_RENDU_CRPLAN_FEUX);
		}
		return aPourCompteRenduCRplanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourListesObjectifsCandidatsListeObjectifsCandidats() {
		if (aPourListesObjectifsCandidatsListeObjectifsCandidats == null) {
			aPourListesObjectifsCandidatsListeObjectifsCandidats = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS);
		}
		return aPourListesObjectifsCandidatsListeObjectifsCandidats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZonesObjectifsAutreElementControle() {
		if (aPourZonesObjectifsAutreElementControle == null) {
			aPourZonesObjectifsAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_FEUX__APOUR_ZONES_OBJECTIFS_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZonesObjectifsAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourListesObjectifsPlanifiesListeObjectifsPlanifies() {
		if (aPourListesObjectifsPlanifiesListeObjectifsPlanifies == null) {
			aPourListesObjectifsPlanifiesListeObjectifsPlanifies = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_PLANIFIES_LISTE_OBJECTIFS_PLANIFIES);
		}
		return aPourListesObjectifsPlanifiesListeObjectifsPlanifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeUniteParticipante> getAPourParticipantsUniteParticipante() {
		if (aPourParticipantsUniteParticipante == null) {
			aPourParticipantsUniteParticipante = new EObjectContainmentEList<TypeUniteParticipante>(TypeUniteParticipante.class, this, SchemaPackage.TYPE_PLAN_FEUX__APOUR_PARTICIPANTS_UNITE_PARTICIPANTE);
		}
		return aPourParticipantsUniteParticipante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getPrevoitReservationUnite() {
		if (prevoitReservationUnite == null) {
			prevoitReservationUnite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_FEUX__PREVOIT_RESERVATION_UNITE);
		}
		return prevoitReservationUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstObjetAssociationUnitePlanFeux() {
		if (estObjetAssociationUnitePlanFeux == null) {
			estObjetAssociationUnitePlanFeux = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_UNITE_PLAN_FEUX);
		}
		return estObjetAssociationUnitePlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourBilanTirsASSassocieBilanTirsASS() {
		if (aPourBilanTirsASSassocieBilanTirsASS == null) {
			aPourBilanTirsASSassocieBilanTirsASS = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_FEUX__APOUR_BILAN_TIRS_AS_SASSOCIE_BILAN_TIRS_ASS);
		}
		return aPourBilanTirsASSassocieBilanTirsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourInterventionGeneraleInterventionGenerale() {
		if (aPourInterventionGeneraleInterventionGenerale == null) {
			aPourInterventionGeneraleInterventionGenerale = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PLAN_FEUX__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE);
		}
		return aPourInterventionGeneraleInterventionGenerale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourPolitiqueTirPolitiqueTir() {
		return aPourPolitiqueTirPolitiqueTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPolitiqueTirPolitiqueTir(TypeAssociation newAPourPolitiqueTirPolitiqueTir, NotificationChain msgs) {
		TypeAssociation oldAPourPolitiqueTirPolitiqueTir = aPourPolitiqueTirPolitiqueTir;
		aPourPolitiqueTirPolitiqueTir = newAPourPolitiqueTirPolitiqueTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR, oldAPourPolitiqueTirPolitiqueTir, newAPourPolitiqueTirPolitiqueTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPolitiqueTirPolitiqueTir(TypeAssociation newAPourPolitiqueTirPolitiqueTir) {
		if (newAPourPolitiqueTirPolitiqueTir != aPourPolitiqueTirPolitiqueTir) {
			NotificationChain msgs = null;
			if (aPourPolitiqueTirPolitiqueTir != null)
				msgs = ((InternalEObject)aPourPolitiqueTirPolitiqueTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR, null, msgs);
			if (newAPourPolitiqueTirPolitiqueTir != null)
				msgs = ((InternalEObject)newAPourPolitiqueTirPolitiqueTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR, null, msgs);
			msgs = basicSetAPourPolitiqueTirPolitiqueTir(newAPourPolitiqueTirPolitiqueTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR, newAPourPolitiqueTirPolitiqueTir, newAPourPolitiqueTirPolitiqueTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return ((InternalEList<?>)getEstObjetAssociationMesureCoordinationPlanFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_COMPTE_RENDU_CRPLAN_FEUX:
				return ((InternalEList<?>)getAPourCompteRenduCRplanFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				return ((InternalEList<?>)getAPourListesObjectifsCandidatsListeObjectifsCandidats()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_ZONES_OBJECTIFS_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZonesObjectifsAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_PLANIFIES_LISTE_OBJECTIFS_PLANIFIES:
				return ((InternalEList<?>)getAPourListesObjectifsPlanifiesListeObjectifsPlanifies()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_PARTICIPANTS_UNITE_PARTICIPANTE:
				return ((InternalEList<?>)getAPourParticipantsUniteParticipante()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__PREVOIT_RESERVATION_UNITE:
				return ((InternalEList<?>)getPrevoitReservationUnite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_UNITE_PLAN_FEUX:
				return ((InternalEList<?>)getEstObjetAssociationUnitePlanFeux()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_BILAN_TIRS_AS_SASSOCIE_BILAN_TIRS_ASS:
				return ((InternalEList<?>)getAPourBilanTirsASSassocieBilanTirsASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return ((InternalEList<?>)getAPourInterventionGeneraleInterventionGenerale()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR:
				return basicSetAPourPolitiqueTirPolitiqueTir(null, msgs);
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
			case SchemaPackage.TYPE_PLAN_FEUX__ETAT_PLANIFICATION:
				return getEtatPlanification();
			case SchemaPackage.TYPE_PLAN_FEUX__EVALUATION_PLAN:
				return getEvaluationPlan();
			case SchemaPackage.TYPE_PLAN_FEUX__DEBUT_ACTIVATION:
				return getDebutActivation();
			case SchemaPackage.TYPE_PLAN_FEUX__FIN_ACTIVATION:
				return getFinActivation();
			case SchemaPackage.TYPE_PLAN_FEUX__HEURE_H:
				return getHeureH();
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return getEstObjetAssociationMesureCoordinationPlanFeux();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_COMPTE_RENDU_CRPLAN_FEUX:
				return getAPourCompteRenduCRplanFeux();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				return getAPourListesObjectifsCandidatsListeObjectifsCandidats();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_ZONES_OBJECTIFS_AUTRE_ELEMENT_CONTROLE:
				return getAPourZonesObjectifsAutreElementControle();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_PLANIFIES_LISTE_OBJECTIFS_PLANIFIES:
				return getAPourListesObjectifsPlanifiesListeObjectifsPlanifies();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_PARTICIPANTS_UNITE_PARTICIPANTE:
				return getAPourParticipantsUniteParticipante();
			case SchemaPackage.TYPE_PLAN_FEUX__PREVOIT_RESERVATION_UNITE:
				return getPrevoitReservationUnite();
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_UNITE_PLAN_FEUX:
				return getEstObjetAssociationUnitePlanFeux();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_BILAN_TIRS_AS_SASSOCIE_BILAN_TIRS_ASS:
				return getAPourBilanTirsASSassocieBilanTirsASS();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return getAPourInterventionGeneraleInterventionGenerale();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR:
				return getAPourPolitiqueTirPolitiqueTir();
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
			case SchemaPackage.TYPE_PLAN_FEUX__ETAT_PLANIFICATION:
				setEtatPlanification((TypeDictionaryDicoPlanFeuxEtatPlanification)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__EVALUATION_PLAN:
				setEvaluationPlan((String)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__DEBUT_ACTIVATION:
				setDebutActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__FIN_ACTIVATION:
				setFinActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__HEURE_H:
				setHeureH((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				getEstObjetAssociationMesureCoordinationPlanFeux().clear();
				getEstObjetAssociationMesureCoordinationPlanFeux().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_COMPTE_RENDU_CRPLAN_FEUX:
				getAPourCompteRenduCRplanFeux().clear();
				getAPourCompteRenduCRplanFeux().addAll((Collection<? extends TypeCRplanFeux>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				getAPourListesObjectifsCandidatsListeObjectifsCandidats().clear();
				getAPourListesObjectifsCandidatsListeObjectifsCandidats().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_ZONES_OBJECTIFS_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesObjectifsAutreElementControle().clear();
				getAPourZonesObjectifsAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_PLANIFIES_LISTE_OBJECTIFS_PLANIFIES:
				getAPourListesObjectifsPlanifiesListeObjectifsPlanifies().clear();
				getAPourListesObjectifsPlanifiesListeObjectifsPlanifies().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_PARTICIPANTS_UNITE_PARTICIPANTE:
				getAPourParticipantsUniteParticipante().clear();
				getAPourParticipantsUniteParticipante().addAll((Collection<? extends TypeUniteParticipante>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__PREVOIT_RESERVATION_UNITE:
				getPrevoitReservationUnite().clear();
				getPrevoitReservationUnite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_UNITE_PLAN_FEUX:
				getEstObjetAssociationUnitePlanFeux().clear();
				getEstObjetAssociationUnitePlanFeux().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_BILAN_TIRS_AS_SASSOCIE_BILAN_TIRS_ASS:
				getAPourBilanTirsASSassocieBilanTirsASS().clear();
				getAPourBilanTirsASSassocieBilanTirsASS().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				getAPourInterventionGeneraleInterventionGenerale().clear();
				getAPourInterventionGeneraleInterventionGenerale().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR:
				setAPourPolitiqueTirPolitiqueTir((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_PLAN_FEUX__ETAT_PLANIFICATION:
				unsetEtatPlanification();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__EVALUATION_PLAN:
				setEvaluationPlan(EVALUATION_PLAN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__DEBUT_ACTIVATION:
				setDebutActivation(DEBUT_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__FIN_ACTIVATION:
				setFinActivation(FIN_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__HEURE_H:
				setHeureH(HEURE_H_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				getEstObjetAssociationMesureCoordinationPlanFeux().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_COMPTE_RENDU_CRPLAN_FEUX:
				getAPourCompteRenduCRplanFeux().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				getAPourListesObjectifsCandidatsListeObjectifsCandidats().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_ZONES_OBJECTIFS_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesObjectifsAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_PLANIFIES_LISTE_OBJECTIFS_PLANIFIES:
				getAPourListesObjectifsPlanifiesListeObjectifsPlanifies().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_PARTICIPANTS_UNITE_PARTICIPANTE:
				getAPourParticipantsUniteParticipante().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__PREVOIT_RESERVATION_UNITE:
				getPrevoitReservationUnite().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_UNITE_PLAN_FEUX:
				getEstObjetAssociationUnitePlanFeux().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_BILAN_TIRS_AS_SASSOCIE_BILAN_TIRS_ASS:
				getAPourBilanTirsASSassocieBilanTirsASS().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				getAPourInterventionGeneraleInterventionGenerale().clear();
				return;
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR:
				setAPourPolitiqueTirPolitiqueTir((TypeAssociation)null);
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
			case SchemaPackage.TYPE_PLAN_FEUX__ETAT_PLANIFICATION:
				return isSetEtatPlanification();
			case SchemaPackage.TYPE_PLAN_FEUX__EVALUATION_PLAN:
				return EVALUATION_PLAN_EDEFAULT == null ? evaluationPlan != null : !EVALUATION_PLAN_EDEFAULT.equals(evaluationPlan);
			case SchemaPackage.TYPE_PLAN_FEUX__DEBUT_ACTIVATION:
				return DEBUT_ACTIVATION_EDEFAULT == null ? debutActivation != null : !DEBUT_ACTIVATION_EDEFAULT.equals(debutActivation);
			case SchemaPackage.TYPE_PLAN_FEUX__FIN_ACTIVATION:
				return FIN_ACTIVATION_EDEFAULT == null ? finActivation != null : !FIN_ACTIVATION_EDEFAULT.equals(finActivation);
			case SchemaPackage.TYPE_PLAN_FEUX__HEURE_H:
				return HEURE_H_EDEFAULT == null ? heureH != null : !HEURE_H_EDEFAULT.equals(heureH);
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_MESURE_COORDINATION_PLAN_FEUX:
				return estObjetAssociationMesureCoordinationPlanFeux != null && !estObjetAssociationMesureCoordinationPlanFeux.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_COMPTE_RENDU_CRPLAN_FEUX:
				return aPourCompteRenduCRplanFeux != null && !aPourCompteRenduCRplanFeux.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_CANDIDATS_LISTE_OBJECTIFS_CANDIDATS:
				return aPourListesObjectifsCandidatsListeObjectifsCandidats != null && !aPourListesObjectifsCandidatsListeObjectifsCandidats.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_ZONES_OBJECTIFS_AUTRE_ELEMENT_CONTROLE:
				return aPourZonesObjectifsAutreElementControle != null && !aPourZonesObjectifsAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_LISTES_OBJECTIFS_PLANIFIES_LISTE_OBJECTIFS_PLANIFIES:
				return aPourListesObjectifsPlanifiesListeObjectifsPlanifies != null && !aPourListesObjectifsPlanifiesListeObjectifsPlanifies.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_PARTICIPANTS_UNITE_PARTICIPANTE:
				return aPourParticipantsUniteParticipante != null && !aPourParticipantsUniteParticipante.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__PREVOIT_RESERVATION_UNITE:
				return prevoitReservationUnite != null && !prevoitReservationUnite.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__EST_OBJET_ASSOCIATION_UNITE_PLAN_FEUX:
				return estObjetAssociationUnitePlanFeux != null && !estObjetAssociationUnitePlanFeux.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_BILAN_TIRS_AS_SASSOCIE_BILAN_TIRS_ASS:
				return aPourBilanTirsASSassocieBilanTirsASS != null && !aPourBilanTirsASSassocieBilanTirsASS.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_INTERVENTION_GENERALE_INTERVENTION_GENERALE:
				return aPourInterventionGeneraleInterventionGenerale != null && !aPourInterventionGeneraleInterventionGenerale.isEmpty();
			case SchemaPackage.TYPE_PLAN_FEUX__APOUR_POLITIQUE_TIR_POLITIQUE_TIR:
				return aPourPolitiqueTirPolitiqueTir != null;
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
		result.append(" (etatPlanification: ");
		if (etatPlanificationESet) result.append(etatPlanification); else result.append("<unset>");
		result.append(", evaluationPlan: ");
		result.append(evaluationPlan);
		result.append(", debutActivation: ");
		result.append(debutActivation);
		result.append(", finActivation: ");
		result.append(finActivation);
		result.append(", heureH: ");
		result.append(heureH);
		result.append(')');
		return result.toString();
	}

} //TypePlanFeuxImpl
