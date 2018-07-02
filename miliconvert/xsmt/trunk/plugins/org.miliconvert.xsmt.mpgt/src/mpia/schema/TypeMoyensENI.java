/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Moyens ENI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyensENI#getNombreAeronefs <em>Nombre Aeronefs</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENI#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENI#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENI#getACommeTypeAeronefMisEnOeuvreTypeAeronef <em>AComme Type Aeronef Mis En Oeuvre Type Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyensENI()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyensENI' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyensENI extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Aeronefs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Aeronefs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Aeronefs</em>' attribute.
	 * @see #isSetNombreAeronefs()
	 * @see #unsetNombreAeronefs()
	 * @see #setNombreAeronefs(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENI_NombreAeronefs()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreAeronefs'"
	 * @generated
	 */
	long getNombreAeronefs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENI#getNombreAeronefs <em>Nombre Aeronefs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Aeronefs</em>' attribute.
	 * @see #isSetNombreAeronefs()
	 * @see #unsetNombreAeronefs()
	 * @see #getNombreAeronefs()
	 * @generated
	 */
	void setNombreAeronefs(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensENI#getNombreAeronefs <em>Nombre Aeronefs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreAeronefs()
	 * @see #getNombreAeronefs()
	 * @see #setNombreAeronefs(long)
	 * @generated
	 */
	void unsetNombreAeronefs();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensENI#getNombreAeronefs <em>Nombre Aeronefs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Aeronefs</em>' attribute is set.
	 * @see #unsetNombreAeronefs()
	 * @see #getNombreAeronefs()
	 * @see #setNombreAeronefs(long)
	 * @generated
	 */
	boolean isSetNombreAeronefs();

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENI_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENI#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENI_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENI#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Type Aeronef Mis En Oeuvre Type Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Aeronef Mis En Oeuvre Type Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Aeronef Mis En Oeuvre Type Aeronef</em>' containment reference.
	 * @see #setACommeTypeAeronefMisEnOeuvreTypeAeronef(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENI_ACommeTypeAeronefMisEnOeuvreTypeAeronef()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='ACommeTypeAeronefMisEnOeuvre_TypeAeronef'"
	 * @generated
	 */
	TypeAssociationEXT getACommeTypeAeronefMisEnOeuvreTypeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENI#getACommeTypeAeronefMisEnOeuvreTypeAeronef <em>AComme Type Aeronef Mis En Oeuvre Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Type Aeronef Mis En Oeuvre Type Aeronef</em>' containment reference.
	 * @see #getACommeTypeAeronefMisEnOeuvreTypeAeronef()
	 * @generated
	 */
	void setACommeTypeAeronefMisEnOeuvreTypeAeronef(TypeAssociationEXT value);

} // TypeMoyensENI
