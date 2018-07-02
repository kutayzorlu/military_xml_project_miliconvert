/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autre Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreSite#getCaracAutreSiteCaracteristiqueAutreSite <em>Carac Autre Site Caracteristique Autre Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreSite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreSite' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreSite extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Carac Autre Site Caracteristique Autre Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carac Autre Site Caracteristique Autre Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carac Autre Site Caracteristique Autre Site</em>' containment reference.
	 * @see #setCaracAutreSiteCaracteristiqueAutreSite(TypeCaracteristiqueAutreSite)
	 * @see mpia.schema.SchemaPackage#getTypeAutreSite_CaracAutreSiteCaracteristiqueAutreSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CaracteristiqueAutreSite'"
	 *        extendedMetaData="kind='element' name='CaracAutreSite_CaracteristiqueAutreSite'"
	 * @generated
	 */
	TypeCaracteristiqueAutreSite getCaracAutreSiteCaracteristiqueAutreSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreSite#getCaracAutreSiteCaracteristiqueAutreSite <em>Carac Autre Site Caracteristique Autre Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carac Autre Site Caracteristique Autre Site</em>' containment reference.
	 * @see #getCaracAutreSiteCaracteristiqueAutreSite()
	 * @generated
	 */
	void setCaracAutreSiteCaracteristiqueAutreSite(TypeCaracteristiqueAutreSite value);

} // TypeAutreSite
