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
 * A representation of the model object '<em><b>Type Comptage Par Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeComptageParActivite#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeComptageParActivite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeComptageParActivite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeComptageParActivite#getAPourRaisonActivite <em>APour Raison Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeComptageParActivite#getEstDetailleParComptage <em>Est Detaille Par Comptage</em>}</li>
 *   <li>{@link mpia.schema.TypeComptageParActivite#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeComptageParActivite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ComptageParActivite' kind='elementOnly'"
 * @generated
 */
public interface TypeComptageParActivite extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeComptageParActivite_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptageParActivite#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeComptageParActivite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptageParActivite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeComptageParActivite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptageParActivite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Raison Activite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Raison Activite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Raison Activite</em>' containment reference.
	 * @see #setAPourRaisonActivite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeComptageParActivite_APourRaisonActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='APourRaison_Activite'"
	 * @generated
	 */
	TypeAssociation getAPourRaisonActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptageParActivite#getAPourRaisonActivite <em>APour Raison Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Raison Activite</em>' containment reference.
	 * @see #getAPourRaisonActivite()
	 * @generated
	 */
	void setAPourRaisonActivite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Detaille Par Comptage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeComptage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Detaille Par Comptage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Detaille Par Comptage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeComptageParActivite_EstDetailleParComptage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Comptage'"
	 *        extendedMetaData="kind='element' name='EstDetaillePar_Comptage'"
	 * @generated
	 */
	EList<TypeComptage> getEstDetailleParComptage();

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
	 * @see mpia.schema.SchemaPackage#getTypeComptageParActivite_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptageParActivite#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeComptageParActivite
