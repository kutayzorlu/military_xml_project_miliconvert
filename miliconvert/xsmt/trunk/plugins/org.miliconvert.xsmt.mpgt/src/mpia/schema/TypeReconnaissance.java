/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reconnaissance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeReconnaissance#getDateDepartEnReconnaissance <em>Date Depart En Reconnaissance</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeReconnaissance()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Reconnaissance' kind='elementOnly'"
 * @generated
 */
public interface TypeReconnaissance extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Depart En Reconnaissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Depart En Reconnaissance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Depart En Reconnaissance</em>' attribute.
	 * @see #setDateDepartEnReconnaissance(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeReconnaissance_DateDepartEnReconnaissance()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDepartEnReconnaissance'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDepartEnReconnaissance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReconnaissance#getDateDepartEnReconnaissance <em>Date Depart En Reconnaissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Depart En Reconnaissance</em>' attribute.
	 * @see #getDateDepartEnReconnaissance()
	 * @generated
	 */
	void setDateDepartEnReconnaissance(XMLGregorianCalendar value);

} // TypeReconnaissance
