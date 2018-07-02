/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Planification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanification#getDateDescription <em>Date Description</em>}</li>
 *   <li>{@link mpia.schema.TypePlanification#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanification#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanification#getDefinieJalon <em>Definie Jalon</em>}</li>
 *   <li>{@link mpia.schema.TypePlanification#getDefinieTache <em>Definie Tache</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanification()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Planification' kind='elementOnly'"
 * @generated
 */
public interface TypePlanification extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Description</em>' attribute.
	 * @see #setDateDescription(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePlanification_DateDescription()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDescription'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanification#getDateDescription <em>Date Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Description</em>' attribute.
	 * @see #getDateDescription()
	 * @generated
	 */
	void setDateDescription(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypePlanification_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanification#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePlanification_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanification#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Definie Jalon</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeJalon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definie Jalon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definie Jalon</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanification_DefinieJalon()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Jalon'"
	 *        extendedMetaData="kind='element' name='Definie_Jalon'"
	 * @generated
	 */
	EList<TypeJalon> getDefinieJalon();

	/**
	 * Returns the value of the '<em><b>Definie Tache</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTache}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definie Tache</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definie Tache</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanification_DefinieTache()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Tache'"
	 *        extendedMetaData="kind='element' name='Definie_Tache'"
	 * @generated
	 */
	EList<TypeTache> getDefinieTache();

} // TypePlanification
