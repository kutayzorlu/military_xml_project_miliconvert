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
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMissionNiveauConfirmation;
import mpia.schema.TypeMission;

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
 * An implementation of the model object '<em><b>Type Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getNiveauConfirmation <em>Niveau Confirmation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getButAAtteindre <em>But AAtteindre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getACommeArticulationArticulation <em>AComme Articulation Articulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getAPourZoneDeploiementAutreElementControle <em>APour Zone Deploiement Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getACommeCoordinationMissionEtLogistiqueArticulation <em>AComme Coordination Mission Et Logistique Articulation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionImpl#getACommeFaitRechercheFaitRenseignement <em>AComme Fait Recherche Fait Renseignement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeMissionImpl extends TypeActiviteImpl implements TypeMission {
	/**
	 * The default value of the '{@link #getNiveauConfirmation() <em>Niveau Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauConfirmation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMissionNiveauConfirmation NIVEAU_CONFIRMATION_EDEFAULT = TypeDictionaryDicoMissionNiveauConfirmation.A;

	/**
	 * The cached value of the '{@link #getNiveauConfirmation() <em>Niveau Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauConfirmation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMissionNiveauConfirmation niveauConfirmation = NIVEAU_CONFIRMATION_EDEFAULT;

	/**
	 * This is true if the Niveau Confirmation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauConfirmationESet;

	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree duree;

	/**
	 * The default value of the '{@link #getButAAtteindre() <em>But AAtteindre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButAAtteindre()
	 * @generated
	 * @ordered
	 */
	protected static final String BUT_AATTEINDRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getButAAtteindre() <em>But AAtteindre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButAAtteindre()
	 * @generated
	 * @ordered
	 */
	protected String butAAtteindre = BUT_AATTEINDRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getACommeArticulationArticulation() <em>AComme Articulation Articulation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeArticulationArticulation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeArticulationArticulation;

	/**
	 * The cached value of the '{@link #getAPourZoneDeploiementAutreElementControle() <em>APour Zone Deploiement Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneDeploiementAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZoneDeploiementAutreElementControle;

	/**
	 * The cached value of the '{@link #getACommeCoordinationMissionEtLogistiqueArticulation() <em>AComme Coordination Mission Et Logistique Articulation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeCoordinationMissionEtLogistiqueArticulation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeCoordinationMissionEtLogistiqueArticulation;

	/**
	 * The cached value of the '{@link #getACommeFaitRechercheFaitRenseignement() <em>AComme Fait Recherche Fait Renseignement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeFaitRechercheFaitRenseignement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeFaitRechercheFaitRenseignement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMission();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMissionNiveauConfirmation getNiveauConfirmation() {
		return niveauConfirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauConfirmation(TypeDictionaryDicoMissionNiveauConfirmation newNiveauConfirmation) {
		TypeDictionaryDicoMissionNiveauConfirmation oldNiveauConfirmation = niveauConfirmation;
		niveauConfirmation = newNiveauConfirmation == null ? NIVEAU_CONFIRMATION_EDEFAULT : newNiveauConfirmation;
		boolean oldNiveauConfirmationESet = niveauConfirmationESet;
		niveauConfirmationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION__NIVEAU_CONFIRMATION, oldNiveauConfirmation, niveauConfirmation, !oldNiveauConfirmationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauConfirmation() {
		TypeDictionaryDicoMissionNiveauConfirmation oldNiveauConfirmation = niveauConfirmation;
		boolean oldNiveauConfirmationESet = niveauConfirmationESet;
		niveauConfirmation = NIVEAU_CONFIRMATION_EDEFAULT;
		niveauConfirmationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MISSION__NIVEAU_CONFIRMATION, oldNiveauConfirmation, NIVEAU_CONFIRMATION_EDEFAULT, oldNiveauConfirmationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauConfirmation() {
		return niveauConfirmationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(XMLGregorianCalendar newDateFin) {
		XMLGregorianCalendar oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuree(TypeDataTypeDuree newDuree, NotificationChain msgs) {
		TypeDataTypeDuree oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION__DUREE, oldDuree, newDuree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(TypeDataTypeDuree newDuree) {
		if (newDuree != duree) {
			NotificationChain msgs = null;
			if (duree != null)
				msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION__DUREE, null, msgs);
			if (newDuree != null)
				msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION__DUREE, null, msgs);
			msgs = basicSetDuree(newDuree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION__DUREE, newDuree, newDuree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getButAAtteindre() {
		return butAAtteindre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButAAtteindre(String newButAAtteindre) {
		String oldButAAtteindre = butAAtteindre;
		butAAtteindre = newButAAtteindre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION__BUT_AATTEINDRE, oldButAAtteindre, butAAtteindre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeArticulationArticulation() {
		if (aCommeArticulationArticulation == null) {
			aCommeArticulationArticulation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION__ACOMME_ARTICULATION_ARTICULATION);
		}
		return aCommeArticulationArticulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZoneDeploiementAutreElementControle() {
		if (aPourZoneDeploiementAutreElementControle == null) {
			aPourZoneDeploiementAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZoneDeploiementAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeCoordinationMissionEtLogistiqueArticulation() {
		if (aCommeCoordinationMissionEtLogistiqueArticulation == null) {
			aCommeCoordinationMissionEtLogistiqueArticulation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION__ACOMME_COORDINATION_MISSION_ET_LOGISTIQUE_ARTICULATION);
		}
		return aCommeCoordinationMissionEtLogistiqueArticulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeFaitRechercheFaitRenseignement() {
		if (aCommeFaitRechercheFaitRenseignement == null) {
			aCommeFaitRechercheFaitRenseignement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_MISSION__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT);
		}
		return aCommeFaitRechercheFaitRenseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION__DUREE:
				return basicSetDuree(null, msgs);
			case SchemaPackage.TYPE_MISSION__ACOMME_ARTICULATION_ARTICULATION:
				return ((InternalEList<?>)getACommeArticulationArticulation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZoneDeploiementAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION__ACOMME_COORDINATION_MISSION_ET_LOGISTIQUE_ARTICULATION:
				return ((InternalEList<?>)getACommeCoordinationMissionEtLogistiqueArticulation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MISSION__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				return ((InternalEList<?>)getACommeFaitRechercheFaitRenseignement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MISSION__NIVEAU_CONFIRMATION:
				return getNiveauConfirmation();
			case SchemaPackage.TYPE_MISSION__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_MISSION__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_MISSION__DUREE:
				return getDuree();
			case SchemaPackage.TYPE_MISSION__BUT_AATTEINDRE:
				return getButAAtteindre();
			case SchemaPackage.TYPE_MISSION__ACOMME_ARTICULATION_ARTICULATION:
				return getACommeArticulationArticulation();
			case SchemaPackage.TYPE_MISSION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneDeploiementAutreElementControle();
			case SchemaPackage.TYPE_MISSION__ACOMME_COORDINATION_MISSION_ET_LOGISTIQUE_ARTICULATION:
				return getACommeCoordinationMissionEtLogistiqueArticulation();
			case SchemaPackage.TYPE_MISSION__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				return getACommeFaitRechercheFaitRenseignement();
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
			case SchemaPackage.TYPE_MISSION__NIVEAU_CONFIRMATION:
				setNiveauConfirmation((TypeDictionaryDicoMissionNiveauConfirmation)newValue);
				return;
			case SchemaPackage.TYPE_MISSION__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MISSION__DUREE:
				setDuree((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_MISSION__BUT_AATTEINDRE:
				setButAAtteindre((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION__ACOMME_ARTICULATION_ARTICULATION:
				getACommeArticulationArticulation().clear();
				getACommeArticulationArticulation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneDeploiementAutreElementControle().clear();
				getAPourZoneDeploiementAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION__ACOMME_COORDINATION_MISSION_ET_LOGISTIQUE_ARTICULATION:
				getACommeCoordinationMissionEtLogistiqueArticulation().clear();
				getACommeCoordinationMissionEtLogistiqueArticulation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_MISSION__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				getACommeFaitRechercheFaitRenseignement().clear();
				getACommeFaitRechercheFaitRenseignement().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_MISSION__NIVEAU_CONFIRMATION:
				unsetNiveauConfirmation();
				return;
			case SchemaPackage.TYPE_MISSION__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION__DUREE:
				setDuree((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_MISSION__BUT_AATTEINDRE:
				setButAAtteindre(BUT_AATTEINDRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION__ACOMME_ARTICULATION_ARTICULATION:
				getACommeArticulationArticulation().clear();
				return;
			case SchemaPackage.TYPE_MISSION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				getAPourZoneDeploiementAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_MISSION__ACOMME_COORDINATION_MISSION_ET_LOGISTIQUE_ARTICULATION:
				getACommeCoordinationMissionEtLogistiqueArticulation().clear();
				return;
			case SchemaPackage.TYPE_MISSION__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				getACommeFaitRechercheFaitRenseignement().clear();
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
			case SchemaPackage.TYPE_MISSION__NIVEAU_CONFIRMATION:
				return isSetNiveauConfirmation();
			case SchemaPackage.TYPE_MISSION__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_MISSION__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_MISSION__DUREE:
				return duree != null;
			case SchemaPackage.TYPE_MISSION__BUT_AATTEINDRE:
				return BUT_AATTEINDRE_EDEFAULT == null ? butAAtteindre != null : !BUT_AATTEINDRE_EDEFAULT.equals(butAAtteindre);
			case SchemaPackage.TYPE_MISSION__ACOMME_ARTICULATION_ARTICULATION:
				return aCommeArticulationArticulation != null && !aCommeArticulationArticulation.isEmpty();
			case SchemaPackage.TYPE_MISSION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneDeploiementAutreElementControle != null && !aPourZoneDeploiementAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_MISSION__ACOMME_COORDINATION_MISSION_ET_LOGISTIQUE_ARTICULATION:
				return aCommeCoordinationMissionEtLogistiqueArticulation != null && !aCommeCoordinationMissionEtLogistiqueArticulation.isEmpty();
			case SchemaPackage.TYPE_MISSION__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				return aCommeFaitRechercheFaitRenseignement != null && !aCommeFaitRechercheFaitRenseignement.isEmpty();
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
		result.append(" (niveauConfirmation: ");
		if (niveauConfirmationESet) result.append(niveauConfirmation); else result.append("<unset>");
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", butAAtteindre: ");
		result.append(butAAtteindre);
		result.append(')');
		return result.toString();
	}

} //TypeMissionImpl
