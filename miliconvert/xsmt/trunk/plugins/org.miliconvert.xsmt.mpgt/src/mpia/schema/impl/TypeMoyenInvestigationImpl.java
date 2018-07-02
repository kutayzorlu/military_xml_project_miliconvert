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
import mpia.schema.TypeMoyenInvestigation;
import mpia.schema.TypeZoneCouverte;

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
 * An implementation of the model object '<em><b>Type Moyen Investigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getHorairePretSurNouvellePosition <em>Horaire Pret Sur Nouvelle Position</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getDisponibiliteProchaineMission <em>Disponibilite Prochaine Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getIncidentsMiseEnPlace <em>Incidents Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getNombreMissionsPossibles <em>Nombre Missions Possibles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getAPourTypeCapteurMisEnOeuvreTypeCapteur <em>APour Type Capteur Mis En Oeuvre Type Capteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getAPourZoneDeploiementAutreElementControle <em>APour Zone Deploiement Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle <em>APour Zone ACouvrir Ou Ligne AAtteindre Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyenInvestigationImpl#getAPourZoneCouverteZoneCouverte <em>APour Zone Couverte Zone Couverte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyenInvestigationImpl extends EObjectImpl implements TypeMoyenInvestigation {
	/**
	 * The default value of the '{@link #getHorairePretSurNouvellePosition() <em>Horaire Pret Sur Nouvelle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorairePretSurNouvellePosition()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HORAIRE_PRET_SUR_NOUVELLE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorairePretSurNouvellePosition() <em>Horaire Pret Sur Nouvelle Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorairePretSurNouvellePosition()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar horairePretSurNouvellePosition = HORAIRE_PRET_SUR_NOUVELLE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisponibiliteProchaineMission() <em>Disponibilite Prochaine Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibiliteProchaineMission()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DISPONIBILITE_PROCHAINE_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisponibiliteProchaineMission() <em>Disponibilite Prochaine Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibiliteProchaineMission()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar disponibiliteProchaineMission = DISPONIBILITE_PROCHAINE_MISSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncidentsMiseEnPlace() <em>Incidents Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentsMiseEnPlace()
	 * @generated
	 * @ordered
	 */
	protected static final String INCIDENTS_MISE_EN_PLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncidentsMiseEnPlace() <em>Incidents Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncidentsMiseEnPlace()
	 * @generated
	 * @ordered
	 */
	protected String incidentsMiseEnPlace = INCIDENTS_MISE_EN_PLACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreMissionsPossibles() <em>Nombre Missions Possibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMissionsPossibles()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MISSIONS_POSSIBLES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMissionsPossibles() <em>Nombre Missions Possibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMissionsPossibles()
	 * @generated
	 * @ordered
	 */
	protected long nombreMissionsPossibles = NOMBRE_MISSIONS_POSSIBLES_EDEFAULT;

	/**
	 * This is true if the Nombre Missions Possibles attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMissionsPossiblesESet;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourTypeCapteurMisEnOeuvreTypeCapteur() <em>APour Type Capteur Mis En Oeuvre Type Capteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeCapteurMisEnOeuvreTypeCapteur()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourTypeCapteurMisEnOeuvreTypeCapteur;

	/**
	 * The cached value of the '{@link #getAPourZoneDeploiementAutreElementControle() <em>APour Zone Deploiement Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneDeploiementAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneDeploiementAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle() <em>APour Zone ACouvrir Ou Ligne AAtteindre Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneACouvrirOuLigneAAtteindreAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourZoneCouverteZoneCouverte() <em>APour Zone Couverte Zone Couverte</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneCouverteZoneCouverte()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeZoneCouverte> aPourZoneCouverteZoneCouverte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyenInvestigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyenInvestigation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHorairePretSurNouvellePosition() {
		return horairePretSurNouvellePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorairePretSurNouvellePosition(XMLGregorianCalendar newHorairePretSurNouvellePosition) {
		XMLGregorianCalendar oldHorairePretSurNouvellePosition = horairePretSurNouvellePosition;
		horairePretSurNouvellePosition = newHorairePretSurNouvellePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__HORAIRE_PRET_SUR_NOUVELLE_POSITION, oldHorairePretSurNouvellePosition, horairePretSurNouvellePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDisponibiliteProchaineMission() {
		return disponibiliteProchaineMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibiliteProchaineMission(XMLGregorianCalendar newDisponibiliteProchaineMission) {
		XMLGregorianCalendar oldDisponibiliteProchaineMission = disponibiliteProchaineMission;
		disponibiliteProchaineMission = newDisponibiliteProchaineMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__DISPONIBILITE_PROCHAINE_MISSION, oldDisponibiliteProchaineMission, disponibiliteProchaineMission));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncidentsMiseEnPlace() {
		return incidentsMiseEnPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncidentsMiseEnPlace(String newIncidentsMiseEnPlace) {
		String oldIncidentsMiseEnPlace = incidentsMiseEnPlace;
		incidentsMiseEnPlace = newIncidentsMiseEnPlace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__INCIDENTS_MISE_EN_PLACE, oldIncidentsMiseEnPlace, incidentsMiseEnPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMissionsPossibles() {
		return nombreMissionsPossibles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMissionsPossibles(long newNombreMissionsPossibles) {
		long oldNombreMissionsPossibles = nombreMissionsPossibles;
		nombreMissionsPossibles = newNombreMissionsPossibles;
		boolean oldNombreMissionsPossiblesESet = nombreMissionsPossiblesESet;
		nombreMissionsPossiblesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__NOMBRE_MISSIONS_POSSIBLES, oldNombreMissionsPossibles, nombreMissionsPossibles, !oldNombreMissionsPossiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMissionsPossibles() {
		long oldNombreMissionsPossibles = nombreMissionsPossibles;
		boolean oldNombreMissionsPossiblesESet = nombreMissionsPossiblesESet;
		nombreMissionsPossibles = NOMBRE_MISSIONS_POSSIBLES_EDEFAULT;
		nombreMissionsPossiblesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__NOMBRE_MISSIONS_POSSIBLES, oldNombreMissionsPossibles, NOMBRE_MISSIONS_POSSIBLES_EDEFAULT, oldNombreMissionsPossiblesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMissionsPossibles() {
		return nombreMissionsPossiblesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourTypeCapteurMisEnOeuvreTypeCapteur() {
		return aPourTypeCapteurMisEnOeuvreTypeCapteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTypeCapteurMisEnOeuvreTypeCapteur(TypeAssociation newAPourTypeCapteurMisEnOeuvreTypeCapteur, NotificationChain msgs) {
		TypeAssociation oldAPourTypeCapteurMisEnOeuvreTypeCapteur = aPourTypeCapteurMisEnOeuvreTypeCapteur;
		aPourTypeCapteurMisEnOeuvreTypeCapteur = newAPourTypeCapteurMisEnOeuvreTypeCapteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR, oldAPourTypeCapteurMisEnOeuvreTypeCapteur, newAPourTypeCapteurMisEnOeuvreTypeCapteur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTypeCapteurMisEnOeuvreTypeCapteur(TypeAssociation newAPourTypeCapteurMisEnOeuvreTypeCapteur) {
		if (newAPourTypeCapteurMisEnOeuvreTypeCapteur != aPourTypeCapteurMisEnOeuvreTypeCapteur) {
			NotificationChain msgs = null;
			if (aPourTypeCapteurMisEnOeuvreTypeCapteur != null)
				msgs = ((InternalEObject)aPourTypeCapteurMisEnOeuvreTypeCapteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR, null, msgs);
			if (newAPourTypeCapteurMisEnOeuvreTypeCapteur != null)
				msgs = ((InternalEObject)newAPourTypeCapteurMisEnOeuvreTypeCapteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR, null, msgs);
			msgs = basicSetAPourTypeCapteurMisEnOeuvreTypeCapteur(newAPourTypeCapteurMisEnOeuvreTypeCapteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR, newAPourTypeCapteurMisEnOeuvreTypeCapteur, newAPourTypeCapteurMisEnOeuvreTypeCapteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneDeploiementAutreElementControle() {
		return aPourZoneDeploiementAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneDeploiementAutreElementControle(TypeAssociation newAPourZoneDeploiementAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneDeploiementAutreElementControle = aPourZoneDeploiementAutreElementControle;
		aPourZoneDeploiementAutreElementControle = newAPourZoneDeploiementAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE, oldAPourZoneDeploiementAutreElementControle, newAPourZoneDeploiementAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneDeploiementAutreElementControle(TypeAssociation newAPourZoneDeploiementAutreElementControle) {
		if (newAPourZoneDeploiementAutreElementControle != aPourZoneDeploiementAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneDeploiementAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneDeploiementAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneDeploiementAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneDeploiementAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneDeploiementAutreElementControle(newAPourZoneDeploiementAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE, newAPourZoneDeploiementAutreElementControle, newAPourZoneDeploiementAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle() {
		return aPourZoneACouvrirOuLigneAAtteindreAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneACouvrirOuLigneAAtteindreAutreElementControle(TypeAssociation newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneACouvrirOuLigneAAtteindreAutreElementControle = aPourZoneACouvrirOuLigneAAtteindreAutreElementControle;
		aPourZoneACouvrirOuLigneAAtteindreAutreElementControle = newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE, oldAPourZoneACouvrirOuLigneAAtteindreAutreElementControle, newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneACouvrirOuLigneAAtteindreAutreElementControle(TypeAssociation newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle) {
		if (newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle != aPourZoneACouvrirOuLigneAAtteindreAutreElementControle) {
			NotificationChain msgs = null;
			if (aPourZoneACouvrirOuLigneAAtteindreAutreElementControle != null)
				msgs = ((InternalEObject)aPourZoneACouvrirOuLigneAAtteindreAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle != null)
				msgs = ((InternalEObject)newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetAPourZoneACouvrirOuLigneAAtteindreAutreElementControle(newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE, newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle, newAPourZoneACouvrirOuLigneAAtteindreAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeZoneCouverte> getAPourZoneCouverteZoneCouverte() {
		if (aPourZoneCouverteZoneCouverte == null) {
			aPourZoneCouverteZoneCouverte = new EObjectContainmentEList<TypeZoneCouverte>(TypeZoneCouverte.class, this, SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_COUVERTE_ZONE_COUVERTE);
		}
		return aPourZoneCouverteZoneCouverte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				return basicSetAPourTypeCapteurMisEnOeuvreTypeCapteur(null, msgs);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneDeploiementAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE:
				return basicSetAPourZoneACouvrirOuLigneAAtteindreAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_COUVERTE_ZONE_COUVERTE:
				return ((InternalEList<?>)getAPourZoneCouverteZoneCouverte()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__HORAIRE_PRET_SUR_NOUVELLE_POSITION:
				return getHorairePretSurNouvellePosition();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__DISPONIBILITE_PROCHAINE_MISSION:
				return getDisponibiliteProchaineMission();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__INCIDENTS_MISE_EN_PLACE:
				return getIncidentsMiseEnPlace();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__NOMBRE_MISSIONS_POSSIBLES:
				return new Long(getNombreMissionsPossibles());
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				return getAPourTypeCapteurMisEnOeuvreTypeCapteur();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneDeploiementAutreElementControle();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE:
				return getAPourZoneACouvrirOuLigneAAtteindreAutreElementControle();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_COUVERTE_ZONE_COUVERTE:
				return getAPourZoneCouverteZoneCouverte();
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
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__HORAIRE_PRET_SUR_NOUVELLE_POSITION:
				setHorairePretSurNouvellePosition((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__DISPONIBILITE_PROCHAINE_MISSION:
				setDisponibiliteProchaineMission((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__INCIDENTS_MISE_EN_PLACE:
				setIncidentsMiseEnPlace((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__NOMBRE_MISSIONS_POSSIBLES:
				setNombreMissionsPossibles(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				setAPourTypeCapteurMisEnOeuvreTypeCapteur((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneDeploiementAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneACouvrirOuLigneAAtteindreAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_COUVERTE_ZONE_COUVERTE:
				getAPourZoneCouverteZoneCouverte().clear();
				getAPourZoneCouverteZoneCouverte().addAll((Collection<? extends TypeZoneCouverte>)newValue);
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
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__HORAIRE_PRET_SUR_NOUVELLE_POSITION:
				setHorairePretSurNouvellePosition(HORAIRE_PRET_SUR_NOUVELLE_POSITION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__DISPONIBILITE_PROCHAINE_MISSION:
				setDisponibiliteProchaineMission(DISPONIBILITE_PROCHAINE_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__INCIDENTS_MISE_EN_PLACE:
				setIncidentsMiseEnPlace(INCIDENTS_MISE_EN_PLACE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__NOMBRE_MISSIONS_POSSIBLES:
				unsetNombreMissionsPossibles();
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				setAPourTypeCapteurMisEnOeuvreTypeCapteur((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneDeploiementAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE:
				setAPourZoneACouvrirOuLigneAAtteindreAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_COUVERTE_ZONE_COUVERTE:
				getAPourZoneCouverteZoneCouverte().clear();
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
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__HORAIRE_PRET_SUR_NOUVELLE_POSITION:
				return HORAIRE_PRET_SUR_NOUVELLE_POSITION_EDEFAULT == null ? horairePretSurNouvellePosition != null : !HORAIRE_PRET_SUR_NOUVELLE_POSITION_EDEFAULT.equals(horairePretSurNouvellePosition);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__DISPONIBILITE_PROCHAINE_MISSION:
				return DISPONIBILITE_PROCHAINE_MISSION_EDEFAULT == null ? disponibiliteProchaineMission != null : !DISPONIBILITE_PROCHAINE_MISSION_EDEFAULT.equals(disponibiliteProchaineMission);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__INCIDENTS_MISE_EN_PLACE:
				return INCIDENTS_MISE_EN_PLACE_EDEFAULT == null ? incidentsMiseEnPlace != null : !INCIDENTS_MISE_EN_PLACE_EDEFAULT.equals(incidentsMiseEnPlace);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__NOMBRE_MISSIONS_POSSIBLES:
				return isSetNombreMissionsPossibles();
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_TYPE_CAPTEUR_MIS_EN_OEUVRE_TYPE_CAPTEUR:
				return aPourTypeCapteurMisEnOeuvreTypeCapteur != null;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_DEPLOIEMENT_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneDeploiementAutreElementControle != null;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_ACOUVRIR_OU_LIGNE_AATTEINDRE_AUTRE_ELEMENT_CONTROLE:
				return aPourZoneACouvrirOuLigneAAtteindreAutreElementControle != null;
			case SchemaPackage.TYPE_MOYEN_INVESTIGATION__APOUR_ZONE_COUVERTE_ZONE_COUVERTE:
				return aPourZoneCouverteZoneCouverte != null && !aPourZoneCouverteZoneCouverte.isEmpty();
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
		result.append(" (horairePretSurNouvellePosition: ");
		result.append(horairePretSurNouvellePosition);
		result.append(", disponibiliteProchaineMission: ");
		result.append(disponibiliteProchaineMission);
		result.append(", incidentsMiseEnPlace: ");
		result.append(incidentsMiseEnPlace);
		result.append(", nombreMissionsPossibles: ");
		if (nombreMissionsPossiblesESet) result.append(nombreMissionsPossibles); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyenInvestigationImpl
