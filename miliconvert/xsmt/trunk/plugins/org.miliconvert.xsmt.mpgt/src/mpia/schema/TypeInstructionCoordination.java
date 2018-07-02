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
 * A representation of the model object '<em><b>Type Instruction Coordination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeInstructionCoordination#getConditionDestructionOuvrageArt <em>Condition Destruction Ouvrage Art</em>}</li>
 *   <li>{@link mpia.schema.TypeInstructionCoordination#getGDHFourniturePlanMixte <em>GDH Fourniture Plan Mixte</em>}</li>
 *   <li>{@link mpia.schema.TypeInstructionCoordination#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeInstructionCoordination#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeInstructionCoordination#getConcerneUnite <em>Concerne Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeInstructionCoordination#getAPourAutoriteQualifieeUnite <em>APour Autorite Qualifiee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeInstructionCoordination#getAPourZoneObstacleAutreElementControle <em>APour Zone Obstacle Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeInstructionCoordination#getAPourItineraireReserveItineraire <em>APour Itineraire Reserve Itineraire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_InstructionCoordination' kind='elementOnly'"
 * @generated
 */
public interface TypeInstructionCoordination extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition Destruction Ouvrage Art</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Destruction Ouvrage Art</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Destruction Ouvrage Art</em>' attribute.
	 * @see #setConditionDestructionOuvrageArt(String)
	 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination_ConditionDestructionOuvrageArt()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ConditionDestructionOuvrageArt'"
	 * @generated
	 */
	String getConditionDestructionOuvrageArt();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInstructionCoordination#getConditionDestructionOuvrageArt <em>Condition Destruction Ouvrage Art</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Destruction Ouvrage Art</em>' attribute.
	 * @see #getConditionDestructionOuvrageArt()
	 * @generated
	 */
	void setConditionDestructionOuvrageArt(String value);

	/**
	 * Returns the value of the '<em><b>GDH Fourniture Plan Mixte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Fourniture Plan Mixte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Fourniture Plan Mixte</em>' attribute.
	 * @see #setGDHFourniturePlanMixte(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination_GDHFourniturePlanMixte()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHFourniturePlanMixte'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHFourniturePlanMixte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInstructionCoordination#getGDHFourniturePlanMixte <em>GDH Fourniture Plan Mixte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Fourniture Plan Mixte</em>' attribute.
	 * @see #getGDHFourniturePlanMixte()
	 * @generated
	 */
	void setGDHFourniturePlanMixte(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInstructionCoordination#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeInstructionCoordination#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination_ConcerneUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='Concerne_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getConcerneUnite();

	/**
	 * Returns the value of the '<em><b>APour Autorite Qualifiee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Autorite Qualifiee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Autorite Qualifiee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination_APourAutoriteQualifieeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourAutoriteQualifiee_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourAutoriteQualifieeUnite();

	/**
	 * Returns the value of the '<em><b>APour Zone Obstacle Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Obstacle Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Obstacle Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination_APourZoneObstacleAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneObstacle_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZoneObstacleAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Itineraire Reserve Itineraire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Itineraire Reserve Itineraire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Itineraire Reserve Itineraire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstructionCoordination_APourItineraireReserveItineraire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Itineraire'"
	 *        extendedMetaData="kind='element' name='APourItineraireReserve_Itineraire'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourItineraireReserveItineraire();

} // TypeInstructionCoordination
