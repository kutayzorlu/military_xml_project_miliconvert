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
import mpia.schema.TypeModalitesRavitaillement;
import mpia.schema.TypeMoyenPourSoutienMedical;
import mpia.schema.TypeMoyensNiveau4;
import mpia.schema.TypeNiveauAMaintenir;
import mpia.schema.TypeOrganisationEvacuations;
import mpia.schema.TypeOrganisationRamassage;
import mpia.schema.TypeOrganisationSoutienMedical;
import mpia.schema.TypeOrganisationTraitement;
import mpia.schema.TypeOrganisationTriage;
import mpia.schema.TypeReactionsMentalesAuCombat;
import mpia.schema.TypeTriage;

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
 * An implementation of the model object '<em><b>Type Organisation Soutien Medical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getMesuresHygiene <em>Mesures Hygiene</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getReactionsMentalesModalites <em>Reactions Mentales Modalites</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getReactionsMentalesConceptGen <em>Reactions Mentales Concept Gen</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getRisquesParticuliers <em>Risques Particuliers</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getOrganiseEvacuationSelonOrganisationEvacuations <em>Organise Evacuation Selon Organisation Evacuations</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getOrganiseRamassageSelonOrganisationRamassage <em>Organise Ramassage Selon Organisation Ramassage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getAPourModalitesRavitaillementModalitesRavitaillement <em>APour Modalites Ravitaillement Modalites Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getAPourMoyensNiveau2MoyenPourSoutienMedical <em>APour Moyens Niveau2 Moyen Pour Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getAPourMoyensNiveau3MoyenPourSoutienMedical <em>APour Moyens Niveau3 Moyen Pour Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getAPourMoyensNiveau4MoyensNiveau4 <em>APour Moyens Niveau4 Moyens Niveau4</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getDoitMaintenirNiveauAMaintenir <em>Doit Maintenir Niveau AMaintenir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getOrganiseTraitementSelonOrganisationTraitement <em>Organise Traitement Selon Organisation Traitement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getOrganiseTriageSelonOrganisationTriage <em>Organise Triage Selon Organisation Triage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getAPourMoyensNiveau1Unite <em>APour Moyens Niveau1 Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getAPourPosteDeSecoursAutreSite <em>APour Poste De Secours Autre Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getAPourReactionsAuCombatReactionsMentalesAuCombat <em>APour Reactions Au Combat Reactions Mentales Au Combat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationSoutienMedicalImpl#getAPourTriageTriage <em>APour Triage Triage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOrganisationSoutienMedicalImpl extends EObjectImpl implements TypeOrganisationSoutienMedical {
	/**
	 * The default value of the '{@link #getMesuresHygiene() <em>Mesures Hygiene</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresHygiene()
	 * @generated
	 * @ordered
	 */
	protected static final String MESURES_HYGIENE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMesuresHygiene() <em>Mesures Hygiene</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMesuresHygiene()
	 * @generated
	 * @ordered
	 */
	protected String mesuresHygiene = MESURES_HYGIENE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactionsMentalesModalites() <em>Reactions Mentales Modalites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionsMentalesModalites()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTIONS_MENTALES_MODALITES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReactionsMentalesModalites() <em>Reactions Mentales Modalites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionsMentalesModalites()
	 * @generated
	 * @ordered
	 */
	protected String reactionsMentalesModalites = REACTIONS_MENTALES_MODALITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getReactionsMentalesConceptGen() <em>Reactions Mentales Concept Gen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionsMentalesConceptGen()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTIONS_MENTALES_CONCEPT_GEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReactionsMentalesConceptGen() <em>Reactions Mentales Concept Gen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionsMentalesConceptGen()
	 * @generated
	 * @ordered
	 */
	protected String reactionsMentalesConceptGen = REACTIONS_MENTALES_CONCEPT_GEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRisquesParticuliers() <em>Risques Particuliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisquesParticuliers()
	 * @generated
	 * @ordered
	 */
	protected static final String RISQUES_PARTICULIERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRisquesParticuliers() <em>Risques Particuliers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisquesParticuliers()
	 * @generated
	 * @ordered
	 */
	protected String risquesParticuliers = RISQUES_PARTICULIERS_EDEFAULT;

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
	 * The cached value of the '{@link #getOrganiseEvacuationSelonOrganisationEvacuations() <em>Organise Evacuation Selon Organisation Evacuations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganiseEvacuationSelonOrganisationEvacuations()
	 * @generated
	 * @ordered
	 */
	protected TypeOrganisationEvacuations organiseEvacuationSelonOrganisationEvacuations;

	/**
	 * The cached value of the '{@link #getOrganiseRamassageSelonOrganisationRamassage() <em>Organise Ramassage Selon Organisation Ramassage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganiseRamassageSelonOrganisationRamassage()
	 * @generated
	 * @ordered
	 */
	protected TypeOrganisationRamassage organiseRamassageSelonOrganisationRamassage;

	/**
	 * The cached value of the '{@link #getAPourModalitesRavitaillementModalitesRavitaillement() <em>APour Modalites Ravitaillement Modalites Ravitaillement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourModalitesRavitaillementModalitesRavitaillement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeModalitesRavitaillement> aPourModalitesRavitaillementModalitesRavitaillement;

	/**
	 * The cached value of the '{@link #getAPourMoyensNiveau2MoyenPourSoutienMedical() <em>APour Moyens Niveau2 Moyen Pour Soutien Medical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensNiveau2MoyenPourSoutienMedical()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyenPourSoutienMedical> aPourMoyensNiveau2MoyenPourSoutienMedical;

	/**
	 * The cached value of the '{@link #getAPourMoyensNiveau3MoyenPourSoutienMedical() <em>APour Moyens Niveau3 Moyen Pour Soutien Medical</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensNiveau3MoyenPourSoutienMedical()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyenPourSoutienMedical> aPourMoyensNiveau3MoyenPourSoutienMedical;

	/**
	 * The cached value of the '{@link #getAPourMoyensNiveau4MoyensNiveau4() <em>APour Moyens Niveau4 Moyens Niveau4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensNiveau4MoyensNiveau4()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyensNiveau4> aPourMoyensNiveau4MoyensNiveau4;

	/**
	 * The cached value of the '{@link #getDoitMaintenirNiveauAMaintenir() <em>Doit Maintenir Niveau AMaintenir</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoitMaintenirNiveauAMaintenir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeNiveauAMaintenir> doitMaintenirNiveauAMaintenir;

	/**
	 * The cached value of the '{@link #getOrganiseTraitementSelonOrganisationTraitement() <em>Organise Traitement Selon Organisation Traitement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganiseTraitementSelonOrganisationTraitement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeOrganisationTraitement> organiseTraitementSelonOrganisationTraitement;

	/**
	 * The cached value of the '{@link #getOrganiseTriageSelonOrganisationTriage() <em>Organise Triage Selon Organisation Triage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganiseTriageSelonOrganisationTriage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeOrganisationTriage> organiseTriageSelonOrganisationTriage;

	/**
	 * The cached value of the '{@link #getAPourMoyensNiveau1Unite() <em>APour Moyens Niveau1 Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensNiveau1Unite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourMoyensNiveau1Unite;

	/**
	 * The cached value of the '{@link #getAPourPosteDeSecoursAutreSite() <em>APour Poste De Secours Autre Site</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPosteDeSecoursAutreSite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourPosteDeSecoursAutreSite;

	/**
	 * The cached value of the '{@link #getAPourReactionsAuCombatReactionsMentalesAuCombat() <em>APour Reactions Au Combat Reactions Mentales Au Combat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourReactionsAuCombatReactionsMentalesAuCombat()
	 * @generated
	 * @ordered
	 */
	protected TypeReactionsMentalesAuCombat aPourReactionsAuCombatReactionsMentalesAuCombat;

	/**
	 * The cached value of the '{@link #getAPourTriageTriage() <em>APour Triage Triage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTriageTriage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTriage> aPourTriageTriage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOrganisationSoutienMedicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOrganisationSoutienMedical();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMesuresHygiene() {
		return mesuresHygiene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMesuresHygiene(String newMesuresHygiene) {
		String oldMesuresHygiene = mesuresHygiene;
		mesuresHygiene = newMesuresHygiene;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__MESURES_HYGIENE, oldMesuresHygiene, mesuresHygiene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReactionsMentalesModalites() {
		return reactionsMentalesModalites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactionsMentalesModalites(String newReactionsMentalesModalites) {
		String oldReactionsMentalesModalites = reactionsMentalesModalites;
		reactionsMentalesModalites = newReactionsMentalesModalites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_MODALITES, oldReactionsMentalesModalites, reactionsMentalesModalites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReactionsMentalesConceptGen() {
		return reactionsMentalesConceptGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactionsMentalesConceptGen(String newReactionsMentalesConceptGen) {
		String oldReactionsMentalesConceptGen = reactionsMentalesConceptGen;
		reactionsMentalesConceptGen = newReactionsMentalesConceptGen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_CONCEPT_GEN, oldReactionsMentalesConceptGen, reactionsMentalesConceptGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRisquesParticuliers() {
		return risquesParticuliers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRisquesParticuliers(String newRisquesParticuliers) {
		String oldRisquesParticuliers = risquesParticuliers;
		risquesParticuliers = newRisquesParticuliers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__RISQUES_PARTICULIERS, oldRisquesParticuliers, risquesParticuliers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOrganisationEvacuations getOrganiseEvacuationSelonOrganisationEvacuations() {
		return organiseEvacuationSelonOrganisationEvacuations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganiseEvacuationSelonOrganisationEvacuations(TypeOrganisationEvacuations newOrganiseEvacuationSelonOrganisationEvacuations, NotificationChain msgs) {
		TypeOrganisationEvacuations oldOrganiseEvacuationSelonOrganisationEvacuations = organiseEvacuationSelonOrganisationEvacuations;
		organiseEvacuationSelonOrganisationEvacuations = newOrganiseEvacuationSelonOrganisationEvacuations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS, oldOrganiseEvacuationSelonOrganisationEvacuations, newOrganiseEvacuationSelonOrganisationEvacuations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganiseEvacuationSelonOrganisationEvacuations(TypeOrganisationEvacuations newOrganiseEvacuationSelonOrganisationEvacuations) {
		if (newOrganiseEvacuationSelonOrganisationEvacuations != organiseEvacuationSelonOrganisationEvacuations) {
			NotificationChain msgs = null;
			if (organiseEvacuationSelonOrganisationEvacuations != null)
				msgs = ((InternalEObject)organiseEvacuationSelonOrganisationEvacuations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS, null, msgs);
			if (newOrganiseEvacuationSelonOrganisationEvacuations != null)
				msgs = ((InternalEObject)newOrganiseEvacuationSelonOrganisationEvacuations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS, null, msgs);
			msgs = basicSetOrganiseEvacuationSelonOrganisationEvacuations(newOrganiseEvacuationSelonOrganisationEvacuations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS, newOrganiseEvacuationSelonOrganisationEvacuations, newOrganiseEvacuationSelonOrganisationEvacuations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeOrganisationRamassage getOrganiseRamassageSelonOrganisationRamassage() {
		return organiseRamassageSelonOrganisationRamassage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganiseRamassageSelonOrganisationRamassage(TypeOrganisationRamassage newOrganiseRamassageSelonOrganisationRamassage, NotificationChain msgs) {
		TypeOrganisationRamassage oldOrganiseRamassageSelonOrganisationRamassage = organiseRamassageSelonOrganisationRamassage;
		organiseRamassageSelonOrganisationRamassage = newOrganiseRamassageSelonOrganisationRamassage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE, oldOrganiseRamassageSelonOrganisationRamassage, newOrganiseRamassageSelonOrganisationRamassage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganiseRamassageSelonOrganisationRamassage(TypeOrganisationRamassage newOrganiseRamassageSelonOrganisationRamassage) {
		if (newOrganiseRamassageSelonOrganisationRamassage != organiseRamassageSelonOrganisationRamassage) {
			NotificationChain msgs = null;
			if (organiseRamassageSelonOrganisationRamassage != null)
				msgs = ((InternalEObject)organiseRamassageSelonOrganisationRamassage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE, null, msgs);
			if (newOrganiseRamassageSelonOrganisationRamassage != null)
				msgs = ((InternalEObject)newOrganiseRamassageSelonOrganisationRamassage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE, null, msgs);
			msgs = basicSetOrganiseRamassageSelonOrganisationRamassage(newOrganiseRamassageSelonOrganisationRamassage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE, newOrganiseRamassageSelonOrganisationRamassage, newOrganiseRamassageSelonOrganisationRamassage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeModalitesRavitaillement> getAPourModalitesRavitaillementModalitesRavitaillement() {
		if (aPourModalitesRavitaillementModalitesRavitaillement == null) {
			aPourModalitesRavitaillementModalitesRavitaillement = new EObjectContainmentEList<TypeModalitesRavitaillement>(TypeModalitesRavitaillement.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MODALITES_RAVITAILLEMENT_MODALITES_RAVITAILLEMENT);
		}
		return aPourModalitesRavitaillementModalitesRavitaillement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyenPourSoutienMedical> getAPourMoyensNiveau2MoyenPourSoutienMedical() {
		if (aPourMoyensNiveau2MoyenPourSoutienMedical == null) {
			aPourMoyensNiveau2MoyenPourSoutienMedical = new EObjectContainmentEList<TypeMoyenPourSoutienMedical>(TypeMoyenPourSoutienMedical.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU2_MOYEN_POUR_SOUTIEN_MEDICAL);
		}
		return aPourMoyensNiveau2MoyenPourSoutienMedical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyenPourSoutienMedical> getAPourMoyensNiveau3MoyenPourSoutienMedical() {
		if (aPourMoyensNiveau3MoyenPourSoutienMedical == null) {
			aPourMoyensNiveau3MoyenPourSoutienMedical = new EObjectContainmentEList<TypeMoyenPourSoutienMedical>(TypeMoyenPourSoutienMedical.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU3_MOYEN_POUR_SOUTIEN_MEDICAL);
		}
		return aPourMoyensNiveau3MoyenPourSoutienMedical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensNiveau4> getAPourMoyensNiveau4MoyensNiveau4() {
		if (aPourMoyensNiveau4MoyensNiveau4 == null) {
			aPourMoyensNiveau4MoyensNiveau4 = new EObjectContainmentEList<TypeMoyensNiveau4>(TypeMoyensNiveau4.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU4_MOYENS_NIVEAU4);
		}
		return aPourMoyensNiveau4MoyensNiveau4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeNiveauAMaintenir> getDoitMaintenirNiveauAMaintenir() {
		if (doitMaintenirNiveauAMaintenir == null) {
			doitMaintenirNiveauAMaintenir = new EObjectContainmentEList<TypeNiveauAMaintenir>(TypeNiveauAMaintenir.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__DOIT_MAINTENIR_NIVEAU_AMAINTENIR);
		}
		return doitMaintenirNiveauAMaintenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOrganisationTraitement> getOrganiseTraitementSelonOrganisationTraitement() {
		if (organiseTraitementSelonOrganisationTraitement == null) {
			organiseTraitementSelonOrganisationTraitement = new EObjectContainmentEList<TypeOrganisationTraitement>(TypeOrganisationTraitement.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRAITEMENT_SELON_ORGANISATION_TRAITEMENT);
		}
		return organiseTraitementSelonOrganisationTraitement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeOrganisationTriage> getOrganiseTriageSelonOrganisationTriage() {
		if (organiseTriageSelonOrganisationTriage == null) {
			organiseTriageSelonOrganisationTriage = new EObjectContainmentEList<TypeOrganisationTriage>(TypeOrganisationTriage.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRIAGE_SELON_ORGANISATION_TRIAGE);
		}
		return organiseTriageSelonOrganisationTriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourMoyensNiveau1Unite() {
		if (aPourMoyensNiveau1Unite == null) {
			aPourMoyensNiveau1Unite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU1_UNITE);
		}
		return aPourMoyensNiveau1Unite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourPosteDeSecoursAutreSite() {
		if (aPourPosteDeSecoursAutreSite == null) {
			aPourPosteDeSecoursAutreSite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_POSTE_DE_SECOURS_AUTRE_SITE);
		}
		return aPourPosteDeSecoursAutreSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReactionsMentalesAuCombat getAPourReactionsAuCombatReactionsMentalesAuCombat() {
		return aPourReactionsAuCombatReactionsMentalesAuCombat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourReactionsAuCombatReactionsMentalesAuCombat(TypeReactionsMentalesAuCombat newAPourReactionsAuCombatReactionsMentalesAuCombat, NotificationChain msgs) {
		TypeReactionsMentalesAuCombat oldAPourReactionsAuCombatReactionsMentalesAuCombat = aPourReactionsAuCombatReactionsMentalesAuCombat;
		aPourReactionsAuCombatReactionsMentalesAuCombat = newAPourReactionsAuCombatReactionsMentalesAuCombat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT, oldAPourReactionsAuCombatReactionsMentalesAuCombat, newAPourReactionsAuCombatReactionsMentalesAuCombat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourReactionsAuCombatReactionsMentalesAuCombat(TypeReactionsMentalesAuCombat newAPourReactionsAuCombatReactionsMentalesAuCombat) {
		if (newAPourReactionsAuCombatReactionsMentalesAuCombat != aPourReactionsAuCombatReactionsMentalesAuCombat) {
			NotificationChain msgs = null;
			if (aPourReactionsAuCombatReactionsMentalesAuCombat != null)
				msgs = ((InternalEObject)aPourReactionsAuCombatReactionsMentalesAuCombat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT, null, msgs);
			if (newAPourReactionsAuCombatReactionsMentalesAuCombat != null)
				msgs = ((InternalEObject)newAPourReactionsAuCombatReactionsMentalesAuCombat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT, null, msgs);
			msgs = basicSetAPourReactionsAuCombatReactionsMentalesAuCombat(newAPourReactionsAuCombatReactionsMentalesAuCombat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT, newAPourReactionsAuCombatReactionsMentalesAuCombat, newAPourReactionsAuCombatReactionsMentalesAuCombat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTriage> getAPourTriageTriage() {
		if (aPourTriageTriage == null) {
			aPourTriageTriage = new EObjectContainmentEList<TypeTriage>(TypeTriage.class, this, SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_TRIAGE_TRIAGE);
		}
		return aPourTriageTriage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS:
				return basicSetOrganiseEvacuationSelonOrganisationEvacuations(null, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE:
				return basicSetOrganiseRamassageSelonOrganisationRamassage(null, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MODALITES_RAVITAILLEMENT_MODALITES_RAVITAILLEMENT:
				return ((InternalEList<?>)getAPourModalitesRavitaillementModalitesRavitaillement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU2_MOYEN_POUR_SOUTIEN_MEDICAL:
				return ((InternalEList<?>)getAPourMoyensNiveau2MoyenPourSoutienMedical()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU3_MOYEN_POUR_SOUTIEN_MEDICAL:
				return ((InternalEList<?>)getAPourMoyensNiveau3MoyenPourSoutienMedical()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU4_MOYENS_NIVEAU4:
				return ((InternalEList<?>)getAPourMoyensNiveau4MoyensNiveau4()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__DOIT_MAINTENIR_NIVEAU_AMAINTENIR:
				return ((InternalEList<?>)getDoitMaintenirNiveauAMaintenir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRAITEMENT_SELON_ORGANISATION_TRAITEMENT:
				return ((InternalEList<?>)getOrganiseTraitementSelonOrganisationTraitement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRIAGE_SELON_ORGANISATION_TRIAGE:
				return ((InternalEList<?>)getOrganiseTriageSelonOrganisationTriage()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU1_UNITE:
				return ((InternalEList<?>)getAPourMoyensNiveau1Unite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_POSTE_DE_SECOURS_AUTRE_SITE:
				return ((InternalEList<?>)getAPourPosteDeSecoursAutreSite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT:
				return basicSetAPourReactionsAuCombatReactionsMentalesAuCombat(null, msgs);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_TRIAGE_TRIAGE:
				return ((InternalEList<?>)getAPourTriageTriage()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__MESURES_HYGIENE:
				return getMesuresHygiene();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_MODALITES:
				return getReactionsMentalesModalites();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_CONCEPT_GEN:
				return getReactionsMentalesConceptGen();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__RISQUES_PARTICULIERS:
				return getRisquesParticuliers();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CE:
				return getCE();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS:
				return getOrganiseEvacuationSelonOrganisationEvacuations();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE:
				return getOrganiseRamassageSelonOrganisationRamassage();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MODALITES_RAVITAILLEMENT_MODALITES_RAVITAILLEMENT:
				return getAPourModalitesRavitaillementModalitesRavitaillement();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU2_MOYEN_POUR_SOUTIEN_MEDICAL:
				return getAPourMoyensNiveau2MoyenPourSoutienMedical();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU3_MOYEN_POUR_SOUTIEN_MEDICAL:
				return getAPourMoyensNiveau3MoyenPourSoutienMedical();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU4_MOYENS_NIVEAU4:
				return getAPourMoyensNiveau4MoyensNiveau4();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__DOIT_MAINTENIR_NIVEAU_AMAINTENIR:
				return getDoitMaintenirNiveauAMaintenir();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRAITEMENT_SELON_ORGANISATION_TRAITEMENT:
				return getOrganiseTraitementSelonOrganisationTraitement();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRIAGE_SELON_ORGANISATION_TRIAGE:
				return getOrganiseTriageSelonOrganisationTriage();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU1_UNITE:
				return getAPourMoyensNiveau1Unite();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_POSTE_DE_SECOURS_AUTRE_SITE:
				return getAPourPosteDeSecoursAutreSite();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT:
				return getAPourReactionsAuCombatReactionsMentalesAuCombat();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_TRIAGE_TRIAGE:
				return getAPourTriageTriage();
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
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__MESURES_HYGIENE:
				setMesuresHygiene((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_MODALITES:
				setReactionsMentalesModalites((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_CONCEPT_GEN:
				setReactionsMentalesConceptGen((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__RISQUES_PARTICULIERS:
				setRisquesParticuliers((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS:
				setOrganiseEvacuationSelonOrganisationEvacuations((TypeOrganisationEvacuations)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE:
				setOrganiseRamassageSelonOrganisationRamassage((TypeOrganisationRamassage)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MODALITES_RAVITAILLEMENT_MODALITES_RAVITAILLEMENT:
				getAPourModalitesRavitaillementModalitesRavitaillement().clear();
				getAPourModalitesRavitaillementModalitesRavitaillement().addAll((Collection<? extends TypeModalitesRavitaillement>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU2_MOYEN_POUR_SOUTIEN_MEDICAL:
				getAPourMoyensNiveau2MoyenPourSoutienMedical().clear();
				getAPourMoyensNiveau2MoyenPourSoutienMedical().addAll((Collection<? extends TypeMoyenPourSoutienMedical>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU3_MOYEN_POUR_SOUTIEN_MEDICAL:
				getAPourMoyensNiveau3MoyenPourSoutienMedical().clear();
				getAPourMoyensNiveau3MoyenPourSoutienMedical().addAll((Collection<? extends TypeMoyenPourSoutienMedical>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU4_MOYENS_NIVEAU4:
				getAPourMoyensNiveau4MoyensNiveau4().clear();
				getAPourMoyensNiveau4MoyensNiveau4().addAll((Collection<? extends TypeMoyensNiveau4>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__DOIT_MAINTENIR_NIVEAU_AMAINTENIR:
				getDoitMaintenirNiveauAMaintenir().clear();
				getDoitMaintenirNiveauAMaintenir().addAll((Collection<? extends TypeNiveauAMaintenir>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRAITEMENT_SELON_ORGANISATION_TRAITEMENT:
				getOrganiseTraitementSelonOrganisationTraitement().clear();
				getOrganiseTraitementSelonOrganisationTraitement().addAll((Collection<? extends TypeOrganisationTraitement>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRIAGE_SELON_ORGANISATION_TRIAGE:
				getOrganiseTriageSelonOrganisationTriage().clear();
				getOrganiseTriageSelonOrganisationTriage().addAll((Collection<? extends TypeOrganisationTriage>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU1_UNITE:
				getAPourMoyensNiveau1Unite().clear();
				getAPourMoyensNiveau1Unite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_POSTE_DE_SECOURS_AUTRE_SITE:
				getAPourPosteDeSecoursAutreSite().clear();
				getAPourPosteDeSecoursAutreSite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT:
				setAPourReactionsAuCombatReactionsMentalesAuCombat((TypeReactionsMentalesAuCombat)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_TRIAGE_TRIAGE:
				getAPourTriageTriage().clear();
				getAPourTriageTriage().addAll((Collection<? extends TypeTriage>)newValue);
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
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__MESURES_HYGIENE:
				setMesuresHygiene(MESURES_HYGIENE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_MODALITES:
				setReactionsMentalesModalites(REACTIONS_MENTALES_MODALITES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_CONCEPT_GEN:
				setReactionsMentalesConceptGen(REACTIONS_MENTALES_CONCEPT_GEN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__RISQUES_PARTICULIERS:
				setRisquesParticuliers(RISQUES_PARTICULIERS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS:
				setOrganiseEvacuationSelonOrganisationEvacuations((TypeOrganisationEvacuations)null);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE:
				setOrganiseRamassageSelonOrganisationRamassage((TypeOrganisationRamassage)null);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MODALITES_RAVITAILLEMENT_MODALITES_RAVITAILLEMENT:
				getAPourModalitesRavitaillementModalitesRavitaillement().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU2_MOYEN_POUR_SOUTIEN_MEDICAL:
				getAPourMoyensNiveau2MoyenPourSoutienMedical().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU3_MOYEN_POUR_SOUTIEN_MEDICAL:
				getAPourMoyensNiveau3MoyenPourSoutienMedical().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU4_MOYENS_NIVEAU4:
				getAPourMoyensNiveau4MoyensNiveau4().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__DOIT_MAINTENIR_NIVEAU_AMAINTENIR:
				getDoitMaintenirNiveauAMaintenir().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRAITEMENT_SELON_ORGANISATION_TRAITEMENT:
				getOrganiseTraitementSelonOrganisationTraitement().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRIAGE_SELON_ORGANISATION_TRIAGE:
				getOrganiseTriageSelonOrganisationTriage().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU1_UNITE:
				getAPourMoyensNiveau1Unite().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_POSTE_DE_SECOURS_AUTRE_SITE:
				getAPourPosteDeSecoursAutreSite().clear();
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT:
				setAPourReactionsAuCombatReactionsMentalesAuCombat((TypeReactionsMentalesAuCombat)null);
				return;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_TRIAGE_TRIAGE:
				getAPourTriageTriage().clear();
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
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__MESURES_HYGIENE:
				return MESURES_HYGIENE_EDEFAULT == null ? mesuresHygiene != null : !MESURES_HYGIENE_EDEFAULT.equals(mesuresHygiene);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_MODALITES:
				return REACTIONS_MENTALES_MODALITES_EDEFAULT == null ? reactionsMentalesModalites != null : !REACTIONS_MENTALES_MODALITES_EDEFAULT.equals(reactionsMentalesModalites);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__REACTIONS_MENTALES_CONCEPT_GEN:
				return REACTIONS_MENTALES_CONCEPT_GEN_EDEFAULT == null ? reactionsMentalesConceptGen != null : !REACTIONS_MENTALES_CONCEPT_GEN_EDEFAULT.equals(reactionsMentalesConceptGen);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__RISQUES_PARTICULIERS:
				return RISQUES_PARTICULIERS_EDEFAULT == null ? risquesParticuliers != null : !RISQUES_PARTICULIERS_EDEFAULT.equals(risquesParticuliers);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_EVACUATION_SELON_ORGANISATION_EVACUATIONS:
				return organiseEvacuationSelonOrganisationEvacuations != null;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_RAMASSAGE_SELON_ORGANISATION_RAMASSAGE:
				return organiseRamassageSelonOrganisationRamassage != null;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MODALITES_RAVITAILLEMENT_MODALITES_RAVITAILLEMENT:
				return aPourModalitesRavitaillementModalitesRavitaillement != null && !aPourModalitesRavitaillementModalitesRavitaillement.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU2_MOYEN_POUR_SOUTIEN_MEDICAL:
				return aPourMoyensNiveau2MoyenPourSoutienMedical != null && !aPourMoyensNiveau2MoyenPourSoutienMedical.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU3_MOYEN_POUR_SOUTIEN_MEDICAL:
				return aPourMoyensNiveau3MoyenPourSoutienMedical != null && !aPourMoyensNiveau3MoyenPourSoutienMedical.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU4_MOYENS_NIVEAU4:
				return aPourMoyensNiveau4MoyensNiveau4 != null && !aPourMoyensNiveau4MoyensNiveau4.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__DOIT_MAINTENIR_NIVEAU_AMAINTENIR:
				return doitMaintenirNiveauAMaintenir != null && !doitMaintenirNiveauAMaintenir.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRAITEMENT_SELON_ORGANISATION_TRAITEMENT:
				return organiseTraitementSelonOrganisationTraitement != null && !organiseTraitementSelonOrganisationTraitement.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__ORGANISE_TRIAGE_SELON_ORGANISATION_TRIAGE:
				return organiseTriageSelonOrganisationTriage != null && !organiseTriageSelonOrganisationTriage.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_MOYENS_NIVEAU1_UNITE:
				return aPourMoyensNiveau1Unite != null && !aPourMoyensNiveau1Unite.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_POSTE_DE_SECOURS_AUTRE_SITE:
				return aPourPosteDeSecoursAutreSite != null && !aPourPosteDeSecoursAutreSite.isEmpty();
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_REACTIONS_AU_COMBAT_REACTIONS_MENTALES_AU_COMBAT:
				return aPourReactionsAuCombatReactionsMentalesAuCombat != null;
			case SchemaPackage.TYPE_ORGANISATION_SOUTIEN_MEDICAL__APOUR_TRIAGE_TRIAGE:
				return aPourTriageTriage != null && !aPourTriageTriage.isEmpty();
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
		result.append(" (mesuresHygiene: ");
		result.append(mesuresHygiene);
		result.append(", reactionsMentalesModalites: ");
		result.append(reactionsMentalesModalites);
		result.append(", reactionsMentalesConceptGen: ");
		result.append(reactionsMentalesConceptGen);
		result.append(", risquesParticuliers: ");
		result.append(risquesParticuliers);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeOrganisationSoutienMedicalImpl
