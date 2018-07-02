/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type RO Epar Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeROEparOrganisation#getResumeReglesEnVigueur <em>Resume Regles En Vigueur</em>}</li>
 *   <li>{@link mpia.schema.TypeROEparOrganisation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeROEparOrganisation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeROEparOrganisation#getAPourRegleActiveeRegleEngagement <em>APour Regle Activee Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeROEparOrganisation#getAPourRegleAnnuleeRegleEngagement <em>APour Regle Annulee Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeROEparOrganisation#getConcerneEntiteOrganisationnelle <em>Concerne Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeROEparOrganisation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ROEparOrganisation' kind='elementOnly'"
 * @generated
 */
public interface TypeROEparOrganisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Resume Regles En Vigueur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resume Regles En Vigueur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resume Regles En Vigueur</em>' attribute.
	 * @see #setResumeReglesEnVigueur(String)
	 * @see mpia.schema.SchemaPackage#getTypeROEparOrganisation_ResumeReglesEnVigueur()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='ResumeReglesEnVigueur'"
	 * @generated
	 */
	String getResumeReglesEnVigueur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeROEparOrganisation#getResumeReglesEnVigueur <em>Resume Regles En Vigueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resume Regles En Vigueur</em>' attribute.
	 * @see #getResumeReglesEnVigueur()
	 * @generated
	 */
	void setResumeReglesEnVigueur(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeROEparOrganisation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeROEparOrganisation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeROEparOrganisation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeROEparOrganisation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Regle Activee Regle Engagement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Regle Activee Regle Engagement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Regle Activee Regle Engagement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeROEparOrganisation_APourRegleActiveeRegleEngagement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_RegleEngagement'"
	 *        extendedMetaData="kind='element' name='APourRegleActivee_RegleEngagement'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourRegleActiveeRegleEngagement();

	/**
	 * Returns the value of the '<em><b>APour Regle Annulee Regle Engagement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Regle Annulee Regle Engagement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Regle Annulee Regle Engagement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeROEparOrganisation_APourRegleAnnuleeRegleEngagement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_RegleEngagement'"
	 *        extendedMetaData="kind='element' name='APourRegleAnnulee_RegleEngagement'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourRegleAnnuleeRegleEngagement();

	/**
	 * Returns the value of the '<em><b>Concerne Entite Organisationnelle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Entite Organisationnelle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Entite Organisationnelle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeROEparOrganisation_ConcerneEntiteOrganisationnelle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntiteOrganisationnelle'"
	 *        extendedMetaData="kind='element' name='Concerne_EntiteOrganisationnelle'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getConcerneEntiteOrganisationnelle();

} // TypeROEparOrganisation
