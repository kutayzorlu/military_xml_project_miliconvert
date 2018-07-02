/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Fin Interdiction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeFinInterdiction#getHeureFinInterdiction <em>Heure Fin Interdiction</em>}</li>
 *   <li>{@link mpia.schema.TypeFinInterdiction#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeFinInterdiction#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeFinInterdiction#getConcerneMesureCoordination <em>Concerne Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeFinInterdiction#getConcerneConsigne <em>Concerne Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeFinInterdiction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_FinInterdiction' kind='elementOnly'"
 * @generated
 */
public interface TypeFinInterdiction extends EObject {
	/**
	 * Returns the value of the '<em><b>Heure Fin Interdiction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Fin Interdiction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin Interdiction</em>' attribute.
	 * @see #setHeureFinInterdiction(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeFinInterdiction_HeureFinInterdiction()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureFinInterdiction'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureFinInterdiction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFinInterdiction#getHeureFinInterdiction <em>Heure Fin Interdiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin Interdiction</em>' attribute.
	 * @see #getHeureFinInterdiction()
	 * @generated
	 */
	void setHeureFinInterdiction(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeFinInterdiction_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFinInterdiction#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeFinInterdiction_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFinInterdiction#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Mesure Coordination</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Mesure Coordination</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Mesure Coordination</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeFinInterdiction_ConcerneMesureCoordination()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='Concerne_MesureCoordination'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneMesureCoordination();

	/**
	 * Returns the value of the '<em><b>Concerne Consigne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Consigne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Consigne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeFinInterdiction_ConcerneConsigne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Consigne'"
	 *        extendedMetaData="kind='element' name='Concerne_Consigne'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneConsigne();

} // TypeFinInterdiction
