/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Porteur Systeme Arme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePorteurSystemeArme#getNumeroImmatriculation <em>Numero Immatriculation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePorteurSystemeArme()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PorteurSystemeArme' kind='elementOnly'"
 * @generated
 */
public interface TypePorteurSystemeArme extends TypeMateriel {
	/**
	 * Returns the value of the '<em><b>Numero Immatriculation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Immatriculation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Immatriculation</em>' attribute.
	 * @see #setNumeroImmatriculation(String)
	 * @see mpia.schema.SchemaPackage#getTypePorteurSystemeArme_NumeroImmatriculation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='NumeroImmatriculation'"
	 * @generated
	 */
	String getNumeroImmatriculation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePorteurSystemeArme#getNumeroImmatriculation <em>Numero Immatriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Immatriculation</em>' attribute.
	 * @see #getNumeroImmatriculation()
	 * @generated
	 */
	void setNumeroImmatriculation(String value);

} // TypePorteurSystemeArme
