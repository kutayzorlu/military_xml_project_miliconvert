/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Organisation Ramassage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeOrganisationRamassage#getOrganisationTriage <em>Organisation Triage</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationRamassage#getReleveEtCondMedicalPrimaire <em>Releve Et Cond Medical Primaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeOrganisationRamassage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_OrganisationRamassage' kind='elementOnly'"
 * @generated
 */
public interface TypeOrganisationRamassage extends EObject {
	/**
	 * Returns the value of the '<em><b>Organisation Triage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation Triage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation Triage</em>' attribute.
	 * @see #setOrganisationTriage(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationRamassage_OrganisationTriage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='OrganisationTriage'"
	 * @generated
	 */
	String getOrganisationTriage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationRamassage#getOrganisationTriage <em>Organisation Triage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation Triage</em>' attribute.
	 * @see #getOrganisationTriage()
	 * @generated
	 */
	void setOrganisationTriage(String value);

	/**
	 * Returns the value of the '<em><b>Releve Et Cond Medical Primaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releve Et Cond Medical Primaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releve Et Cond Medical Primaire</em>' attribute.
	 * @see #setReleveEtCondMedicalPrimaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationRamassage_ReleveEtCondMedicalPrimaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='ReleveEtCondMedicalPrimaire'"
	 * @generated
	 */
	String getReleveEtCondMedicalPrimaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationRamassage#getReleveEtCondMedicalPrimaire <em>Releve Et Cond Medical Primaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Releve Et Cond Medical Primaire</em>' attribute.
	 * @see #getReleveEtCondMedicalPrimaire()
	 * @generated
	 */
	void setReleveEtCondMedicalPrimaire(String value);

} // TypeOrganisationRamassage
