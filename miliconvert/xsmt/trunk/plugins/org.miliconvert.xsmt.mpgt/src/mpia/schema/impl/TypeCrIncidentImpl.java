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
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCrIncident;

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
 * An implementation of the model object '<em><b>Type Cr Incident</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getDateIncident <em>Date Incident</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getIncident <em>Incident</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getConcerneMissionMissionGenie <em>Concerne Mission Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getConcerneObstacleObstacle <em>Concerne Obstacle Obstacle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getConcerneOuvrageGenieOuvrageGenie <em>Concerne Ouvrage Genie Ouvrage Genie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCrIncidentImpl#getConcerneTravailAideDeploiementTravailAideDeploiement <em>Concerne Travail Aide Deploiement Travail Aide Deploiement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCrIncidentImpl extends EObjectImpl implements TypeCrIncident {
	/**
	 * The default value of the '{@link #getDateIncident() <em>Date Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateIncident()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_INCIDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateIncident() <em>Date Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateIncident()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateIncident = DATE_INCIDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncident() <em>Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncident()
	 * @generated
	 * @ordered
	 */
	protected static final String INCIDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncident() <em>Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncident()
	 * @generated
	 * @ordered
	 */
	protected String incident = INCIDENT_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteRendantCompteUnite() <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRendantCompteUnite;

	/**
	 * The cached value of the '{@link #getConcerneMissionMissionGenie() <em>Concerne Mission Mission Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneMissionMissionGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneMissionMissionGenie;

	/**
	 * The cached value of the '{@link #getConcerneObstacleObstacle() <em>Concerne Obstacle Obstacle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneObstacleObstacle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneObstacleObstacle;

	/**
	 * The cached value of the '{@link #getConcerneOuvrageGenieOuvrageGenie() <em>Concerne Ouvrage Genie Ouvrage Genie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneOuvrageGenieOuvrageGenie()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneOuvrageGenieOuvrageGenie;

	/**
	 * The cached value of the '{@link #getConcerneTravailAideDeploiementTravailAideDeploiement() <em>Concerne Travail Aide Deploiement Travail Aide Deploiement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTravailAideDeploiementTravailAideDeploiement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> concerneTravailAideDeploiementTravailAideDeploiement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCrIncidentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCrIncident();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateIncident() {
		return dateIncident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateIncident(XMLGregorianCalendar newDateIncident) {
		XMLGregorianCalendar oldDateIncident = dateIncident;
		dateIncident = newDateIncident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_INCIDENT__DATE_INCIDENT, oldDateIncident, dateIncident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncident() {
		return incident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncident(String newIncident) {
		String oldIncident = incident;
		incident = newIncident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_INCIDENT__INCIDENT, oldIncident, incident));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_INCIDENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_INCIDENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRendantCompteUnite() {
		return aPourUniteRendantCompteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRendantCompteUnite = aPourUniteRendantCompteUnite;
		aPourUniteRendantCompteUnite = newAPourUniteRendantCompteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, oldAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite) {
		if (newAPourUniteRendantCompteUnite != aPourUniteRendantCompteUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)aPourUniteRendantCompteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			if (newAPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)newAPourUniteRendantCompteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			msgs = basicSetAPourUniteRendantCompteUnite(newAPourUniteRendantCompteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE, newAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneMissionMissionGenie() {
		if (concerneMissionMissionGenie == null) {
			concerneMissionMissionGenie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_MISSION_MISSION_GENIE);
		}
		return concerneMissionMissionGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneObstacleObstacle() {
		if (concerneObstacleObstacle == null) {
			concerneObstacleObstacle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OBSTACLE_OBSTACLE);
		}
		return concerneObstacleObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneOuvrageGenieOuvrageGenie() {
		if (concerneOuvrageGenieOuvrageGenie == null) {
			concerneOuvrageGenieOuvrageGenie = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OUVRAGE_GENIE_OUVRAGE_GENIE);
		}
		return concerneOuvrageGenieOuvrageGenie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getConcerneTravailAideDeploiementTravailAideDeploiement() {
		if (concerneTravailAideDeploiementTravailAideDeploiement == null) {
			concerneTravailAideDeploiementTravailAideDeploiement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT);
		}
		return concerneTravailAideDeploiementTravailAideDeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return basicSetAPourUniteRendantCompteUnite(null, msgs);
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_MISSION_MISSION_GENIE:
				return ((InternalEList<?>)getConcerneMissionMissionGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OBSTACLE_OBSTACLE:
				return ((InternalEList<?>)getConcerneObstacleObstacle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OUVRAGE_GENIE_OUVRAGE_GENIE:
				return ((InternalEList<?>)getConcerneOuvrageGenieOuvrageGenie()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				return ((InternalEList<?>)getConcerneTravailAideDeploiementTravailAideDeploiement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CR_INCIDENT__DATE_INCIDENT:
				return getDateIncident();
			case SchemaPackage.TYPE_CR_INCIDENT__INCIDENT:
				return getIncident();
			case SchemaPackage.TYPE_CR_INCIDENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CR_INCIDENT__CE:
				return getCE();
			case SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return getAPourUniteRendantCompteUnite();
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_MISSION_MISSION_GENIE:
				return getConcerneMissionMissionGenie();
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OBSTACLE_OBSTACLE:
				return getConcerneObstacleObstacle();
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OUVRAGE_GENIE_OUVRAGE_GENIE:
				return getConcerneOuvrageGenieOuvrageGenie();
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				return getConcerneTravailAideDeploiementTravailAideDeploiement();
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
			case SchemaPackage.TYPE_CR_INCIDENT__DATE_INCIDENT:
				setDateIncident((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__INCIDENT:
				setIncident((String)newValue);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_MISSION_MISSION_GENIE:
				getConcerneMissionMissionGenie().clear();
				getConcerneMissionMissionGenie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OBSTACLE_OBSTACLE:
				getConcerneObstacleObstacle().clear();
				getConcerneObstacleObstacle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OUVRAGE_GENIE_OUVRAGE_GENIE:
				getConcerneOuvrageGenieOuvrageGenie().clear();
				getConcerneOuvrageGenieOuvrageGenie().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				getConcerneTravailAideDeploiementTravailAideDeploiement().clear();
				getConcerneTravailAideDeploiementTravailAideDeploiement().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CR_INCIDENT__DATE_INCIDENT:
				setDateIncident(DATE_INCIDENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__INCIDENT:
				setIncident(INCIDENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_MISSION_MISSION_GENIE:
				getConcerneMissionMissionGenie().clear();
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OBSTACLE_OBSTACLE:
				getConcerneObstacleObstacle().clear();
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OUVRAGE_GENIE_OUVRAGE_GENIE:
				getConcerneOuvrageGenieOuvrageGenie().clear();
				return;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				getConcerneTravailAideDeploiementTravailAideDeploiement().clear();
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
			case SchemaPackage.TYPE_CR_INCIDENT__DATE_INCIDENT:
				return DATE_INCIDENT_EDEFAULT == null ? dateIncident != null : !DATE_INCIDENT_EDEFAULT.equals(dateIncident);
			case SchemaPackage.TYPE_CR_INCIDENT__INCIDENT:
				return INCIDENT_EDEFAULT == null ? incident != null : !INCIDENT_EDEFAULT.equals(incident);
			case SchemaPackage.TYPE_CR_INCIDENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CR_INCIDENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CR_INCIDENT__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return aPourUniteRendantCompteUnite != null;
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_MISSION_MISSION_GENIE:
				return concerneMissionMissionGenie != null && !concerneMissionMissionGenie.isEmpty();
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OBSTACLE_OBSTACLE:
				return concerneObstacleObstacle != null && !concerneObstacleObstacle.isEmpty();
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_OUVRAGE_GENIE_OUVRAGE_GENIE:
				return concerneOuvrageGenieOuvrageGenie != null && !concerneOuvrageGenieOuvrageGenie.isEmpty();
			case SchemaPackage.TYPE_CR_INCIDENT__CONCERNE_TRAVAIL_AIDE_DEPLOIEMENT_TRAVAIL_AIDE_DEPLOIEMENT:
				return concerneTravailAideDeploiementTravailAideDeploiement != null && !concerneTravailAideDeploiementTravailAideDeploiement.isEmpty();
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
		result.append(" (dateIncident: ");
		result.append(dateIncident);
		result.append(", incident: ");
		result.append(incident);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCrIncidentImpl
