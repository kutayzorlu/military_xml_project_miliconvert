/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ouvrage Genie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeOuvrageGenie#getNumeroOuvrage <em>Numero Ouvrage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeOuvrageGenie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_OuvrageGenie' kind='elementOnly'"
 * @generated
 */
public interface TypeOuvrageGenie extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Numero Ouvrage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Ouvrage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Ouvrage</em>' attribute.
	 * @see #setNumeroOuvrage(String)
	 * @see mpia.schema.SchemaPackage#getTypeOuvrageGenie_NumeroOuvrage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroOuvrage'"
	 * @generated
	 */
	String getNumeroOuvrage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOuvrageGenie#getNumeroOuvrage <em>Numero Ouvrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Ouvrage</em>' attribute.
	 * @see #getNumeroOuvrage()
	 * @generated
	 */
	void setNumeroOuvrage(String value);

} // TypeOuvrageGenie
