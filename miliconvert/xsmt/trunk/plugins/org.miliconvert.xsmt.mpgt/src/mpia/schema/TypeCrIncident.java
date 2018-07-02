/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Cr Incident</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCrIncident#getDateIncident <em>Date Incident</em>}</li>
 *   <li>{@link mpia.schema.TypeCrIncident#getIncident <em>Incident</em>}</li>
 *   <li>{@link mpia.schema.TypeCrIncident#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCrIncident#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCrIncident#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCrIncident#getConcerneMissionMissionGenie <em>Concerne Mission Mission Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeCrIncident#getConcerneObstacleObstacle <em>Concerne Obstacle Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeCrIncident#getConcerneOuvrageGenieOuvrageGenie <em>Concerne Ouvrage Genie Ouvrage Genie</em>}</li>
 *   <li>{@link mpia.schema.TypeCrIncident#getConcerneTravailAideDeploiementTravailAideDeploiement <em>Concerne Travail Aide Deploiement Travail Aide Deploiement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCrIncident()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CrIncident' kind='elementOnly'"
 * @generated
 */
public interface TypeCrIncident extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Incident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Incident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Incident</em>' attribute.
	 * @see #setDateIncident(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_DateIncident()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateIncident'"
	 * @generated
	 */
	XMLGregorianCalendar getDateIncident();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrIncident#getDateIncident <em>Date Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Incident</em>' attribute.
	 * @see #getDateIncident()
	 * @generated
	 */
	void setDateIncident(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Incident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incident</em>' attribute.
	 * @see #setIncident(String)
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_Incident()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='Incident'"
	 * @generated
	 */
	String getIncident();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrIncident#getIncident <em>Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incident</em>' attribute.
	 * @see #getIncident()
	 * @generated
	 */
	void setIncident(String value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrIncident#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrIncident#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Rendant Compte Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Rendant Compte Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #setAPourUniteRendantCompteUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_APourUniteRendantCompteUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRendantCompte_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRendantCompteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrIncident#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 */
	void setAPourUniteRendantCompteUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Mission Mission Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Mission Mission Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Mission Mission Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_ConcerneMissionMissionGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MissionGenie'"
	 *        extendedMetaData="kind='element' name='ConcerneMission_MissionGenie'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneMissionMissionGenie();

	/**
	 * Returns the value of the '<em><b>Concerne Obstacle Obstacle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Obstacle Obstacle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Obstacle Obstacle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_ConcerneObstacleObstacle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Obstacle'"
	 *        extendedMetaData="kind='element' name='ConcerneObstacle_Obstacle'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneObstacleObstacle();

	/**
	 * Returns the value of the '<em><b>Concerne Ouvrage Genie Ouvrage Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Ouvrage Genie Ouvrage Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Ouvrage Genie Ouvrage Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_ConcerneOuvrageGenieOuvrageGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_OuvrageGenie'"
	 *        extendedMetaData="kind='element' name='ConcerneOuvrageGenie_OuvrageGenie'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneOuvrageGenieOuvrageGenie();

	/**
	 * Returns the value of the '<em><b>Concerne Travail Aide Deploiement Travail Aide Deploiement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Travail Aide Deploiement Travail Aide Deploiement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Travail Aide Deploiement Travail Aide Deploiement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCrIncident_ConcerneTravailAideDeploiementTravailAideDeploiement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TravailAideDeploiement'"
	 *        extendedMetaData="kind='element' name='ConcerneTravailAideDeploiement_TravailAideDeploiement'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneTravailAideDeploiementTravailAideDeploiement();

} // TypeCrIncident
