/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Organisation Traitement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeOrganisationTraitement#getCategorieUrgence <em>Categorie Urgence</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationTraitement#getModalitesTechniquesGenerales <em>Modalites Techniques Generales</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationTraitement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationTraitement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganisationTraitement#getAPourLieuTraitementAutreElementControle <em>APour Lieu Traitement Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeOrganisationTraitement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_OrganisationTraitement' kind='elementOnly'"
 * @generated
 */
public interface TypeOrganisationTraitement extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie Urgence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Urgence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Urgence</em>' attribute.
	 * @see #setCategorieUrgence(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationTraitement_CategorieUrgence()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='CategorieUrgence'"
	 * @generated
	 */
	String getCategorieUrgence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationTraitement#getCategorieUrgence <em>Categorie Urgence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Urgence</em>' attribute.
	 * @see #getCategorieUrgence()
	 * @generated
	 */
	void setCategorieUrgence(String value);

	/**
	 * Returns the value of the '<em><b>Modalites Techniques Generales</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Techniques Generales</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Techniques Generales</em>' attribute.
	 * @see #setModalitesTechniquesGenerales(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationTraitement_ModalitesTechniquesGenerales()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='ModalitesTechniquesGenerales'"
	 * @generated
	 */
	String getModalitesTechniquesGenerales();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationTraitement#getModalitesTechniquesGenerales <em>Modalites Techniques Generales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Techniques Generales</em>' attribute.
	 * @see #getModalitesTechniquesGenerales()
	 * @generated
	 */
	void setModalitesTechniquesGenerales(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationTraitement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationTraitement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationTraitement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganisationTraitement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Lieu Traitement Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lieu Traitement Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lieu Traitement Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeOrganisationTraitement_APourLieuTraitementAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieuTraitement_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourLieuTraitementAutreElementControle();

} // TypeOrganisationTraitement
