/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Contexte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeContexte#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 *   <li>{@link mpia.schema.TypeContexte#getFournitContextePourAssocContexteInstanceObjet <em>Fournit Contexte Pour Assoc Contexte Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeContexte#getFournitContextePourAssocActiviteContexte <em>Fournit Contexte Pour Assoc Activite Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeContexte#getEstObjetAssocContexteContexte <em>Est Objet Assoc Contexte Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeContexte#getEstSujetAssocContexteContexte <em>Est Sujet Assoc Contexte Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeContexte#getFournitContextePourAssociationContexteRapport <em>Fournit Contexte Pour Association Contexte Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeContexte#getAPourConstituantElementContexte <em>APour Constituant Element Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeContexte#getIdentifieDonneesPourEvaluation <em>Identifie Donnees Pour Evaluation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeContexte()
 * @model abstract="true"
 *        extendedMetaData="name='type_Contexte' kind='elementOnly'"
 * @generated
 */
public interface TypeContexte extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>APour Degre Classification Degre Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Degre Classification Degre Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #setAPourDegreClassificationDegreClassification(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeContexte_APourDegreClassificationDegreClassification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_DegreClassification'"
	 *        extendedMetaData="kind='element' name='APourDegreClassification_DegreClassification'"
	 * @generated
	 */
	TypeAssociation getAPourDegreClassificationDegreClassification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContexte#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 */
	void setAPourDegreClassificationDegreClassification(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Fournit Contexte Pour Assoc Contexte Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fournit Contexte Pour Assoc Contexte Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fournit Contexte Pour Assoc Contexte Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContexte_FournitContextePourAssocContexteInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeContexte_Contexte' target_entity='type_AssocContexteInstanceObjet'"
	 *        extendedMetaData="kind='element' name='FournitContextePour_AssocContexteInstanceObjet'"
	 * @generated
	 */
	EList<TypeAssociation> getFournitContextePourAssocContexteInstanceObjet();

	/**
	 * Returns the value of the '<em><b>Fournit Contexte Pour Assoc Activite Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fournit Contexte Pour Assoc Activite Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fournit Contexte Pour Assoc Activite Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContexte_FournitContextePourAssocActiviteContexte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeContexte_Contexte' target_entity='type_AssocActiviteContexte'"
	 *        extendedMetaData="kind='element' name='FournitContextePour_AssocActiviteContexte'"
	 * @generated
	 */
	EList<TypeAssociation> getFournitContextePourAssocActiviteContexte();

	/**
	 * Returns the value of the '<em><b>Est Objet Assoc Contexte Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Assoc Contexte Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Assoc Contexte Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContexte_EstObjetAssocContexteContexte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_Contexte' target_entity='type_AssocContexteContexte'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssocContexteContexte'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssocContexteContexte();

	/**
	 * Returns the value of the '<em><b>Est Sujet Assoc Contexte Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Assoc Contexte Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Assoc Contexte Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContexte_EstSujetAssocContexteContexte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Contexte' target_entity='type_AssocContexteContexte'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssocContexteContexte'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssocContexteContexte();

	/**
	 * Returns the value of the '<em><b>Fournit Contexte Pour Association Contexte Rapport</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fournit Contexte Pour Association Contexte Rapport</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fournit Contexte Pour Association Contexte Rapport</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContexte_FournitContextePourAssociationContexteRapport()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeContexte_Contexte' target_entity='type_AssociationContexteRapport'"
	 *        extendedMetaData="kind='element' name='FournitContextePour_AssociationContexteRapport'"
	 * @generated
	 */
	EList<TypeAssociation> getFournitContextePourAssociationContexteRapport();

	/**
	 * Returns the value of the '<em><b>APour Constituant Element Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeElementContexte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Constituant Element Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Constituant Element Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContexte_APourConstituantElementContexte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ElementContexte'"
	 *        extendedMetaData="kind='element' name='APourConstituant_ElementContexte'"
	 * @generated
	 */
	EList<TypeElementContexte> getAPourConstituantElementContexte();

	/**
	 * Returns the value of the '<em><b>Identifie Donnees Pour Evaluation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEvaluation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifie Donnees Pour Evaluation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifie Donnees Pour Evaluation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContexte_IdentifieDonneesPourEvaluation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Evaluation'"
	 *        extendedMetaData="kind='element' name='IdentifieDonneesPour_Evaluation'"
	 * @generated
	 */
	EList<TypeEvaluation> getIdentifieDonneesPourEvaluation();

} // TypeContexte
