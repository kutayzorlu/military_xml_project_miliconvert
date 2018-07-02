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
 * A representation of the model object '<em><b>Type Element Contexte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeElementContexte#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeElementContexte#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeElementContexte#getAPourEtatEtatElementContexte <em>APour Etat Etat Element Contexte</em>}</li>
 *   <li>{@link mpia.schema.TypeElementContexte#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeElementContexte()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ElementContexte' kind='elementOnly'"
 * @generated
 */
public interface TypeElementContexte extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeElementContexte_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementContexte#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeElementContexte_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementContexte#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Etat Etat Element Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEtatElementContexte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Etat Etat Element Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Etat Etat Element Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementContexte_APourEtatEtatElementContexte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatElementContexte'"
	 *        extendedMetaData="kind='element' name='APourEtat_EtatElementContexte'"
	 * @generated
	 */
	EList<TypeEtatElementContexte> getAPourEtatEtatElementContexte();

	/**
	 * Returns the value of the '<em><b>Est Rapporte Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapporte Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #setEstRapporteParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeElementContexte_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementContexte#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeElementContexte
