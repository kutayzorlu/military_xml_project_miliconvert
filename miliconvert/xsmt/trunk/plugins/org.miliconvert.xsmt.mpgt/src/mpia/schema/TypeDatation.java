/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Datation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDatation#getGDH <em>GDH</em>}</li>
 *   <li>{@link mpia.schema.TypeDatation#getDecalage <em>Decalage</em>}</li>
 *   <li>{@link mpia.schema.TypeDatation#getInstantReference <em>Instant Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDatation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Datation' kind='elementOnly'"
 * @generated
 */
public interface TypeDatation extends EObject {
	/**
	 * Returns the value of the '<em><b>GDH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH</em>' attribute.
	 * @see #setGDH(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDatation_GDH()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDH'"
	 * @generated
	 */
	XMLGregorianCalendar getGDH();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDatation#getGDH <em>GDH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH</em>' attribute.
	 * @see #getGDH()
	 * @generated
	 */
	void setGDH(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Decalage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decalage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decalage</em>' containment reference.
	 * @see #setDecalage(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeDatation_Decalage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Decalage'"
	 * @generated
	 */
	TypeDataTypeDuree getDecalage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDatation#getDecalage <em>Decalage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decalage</em>' containment reference.
	 * @see #getDecalage()
	 * @generated
	 */
	void setDecalage(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Instant Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instant Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instant Reference</em>' attribute.
	 * @see #setInstantReference(String)
	 * @see mpia.schema.SchemaPackage#getTypeDatation_InstantReference()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='InstantReference'"
	 * @generated
	 */
	String getInstantReference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDatation#getInstantReference <em>Instant Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instant Reference</em>' attribute.
	 * @see #getInstantReference()
	 * @generated
	 */
	void setInstantReference(String value);

} // TypeDatation
