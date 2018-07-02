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
 * A representation of the model object '<em><b>Type Criteres Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCriteresIdentification#getListeActesHostiles <em>Liste Actes Hostiles</em>}</li>
 *   <li>{@link mpia.schema.TypeCriteresIdentification#getMatriceIDCPaAppliquer <em>Matrice IDC Pa Appliquer</em>}</li>
 *   <li>{@link mpia.schema.TypeCriteresIdentification#getAutresCriteresIdentification <em>Autres Criteres Identification</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCriteresIdentification()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CriteresIdentification' kind='elementOnly'"
 * @generated
 */
public interface TypeCriteresIdentification extends EObject {
	/**
	 * Returns the value of the '<em><b>Liste Actes Hostiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Actes Hostiles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Actes Hostiles</em>' attribute.
	 * @see #setListeActesHostiles(String)
	 * @see mpia.schema.SchemaPackage#getTypeCriteresIdentification_ListeActesHostiles()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ListeActesHostiles'"
	 * @generated
	 */
	String getListeActesHostiles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCriteresIdentification#getListeActesHostiles <em>Liste Actes Hostiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Liste Actes Hostiles</em>' attribute.
	 * @see #getListeActesHostiles()
	 * @generated
	 */
	void setListeActesHostiles(String value);

	/**
	 * Returns the value of the '<em><b>Matrice IDC Pa Appliquer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Matrice IDC Pa Appliquer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrice IDC Pa Appliquer</em>' attribute.
	 * @see #setMatriceIDCPaAppliquer(String)
	 * @see mpia.schema.SchemaPackage#getTypeCriteresIdentification_MatriceIDCPaAppliquer()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MatriceIDCPaAppliquer'"
	 * @generated
	 */
	String getMatriceIDCPaAppliquer();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCriteresIdentification#getMatriceIDCPaAppliquer <em>Matrice IDC Pa Appliquer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrice IDC Pa Appliquer</em>' attribute.
	 * @see #getMatriceIDCPaAppliquer()
	 * @generated
	 */
	void setMatriceIDCPaAppliquer(String value);

	/**
	 * Returns the value of the '<em><b>Autres Criteres Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autres Criteres Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autres Criteres Identification</em>' attribute.
	 * @see #setAutresCriteresIdentification(String)
	 * @see mpia.schema.SchemaPackage#getTypeCriteresIdentification_AutresCriteresIdentification()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='AutresCriteresIdentification'"
	 * @generated
	 */
	String getAutresCriteresIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCriteresIdentification#getAutresCriteresIdentification <em>Autres Criteres Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autres Criteres Identification</em>' attribute.
	 * @see #getAutresCriteresIdentification()
	 * @generated
	 */
	void setAutresCriteresIdentification(String value);

} // TypeCriteresIdentification
