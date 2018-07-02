/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Effectif Ou Engin Affecte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEffectifOuEnginAffecte#getNomAAffecter <em>Nom AAffecter</em>}</li>
 *   <li>{@link mpia.schema.TypeEffectifOuEnginAffecte#getNomLogiqueAffecte <em>Nom Logique Affecte</em>}</li>
 *   <li>{@link mpia.schema.TypeEffectifOuEnginAffecte#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffectifOuEnginAffecte#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffectifOuEnginAffecte#getEstAffecteUnite <em>Est Affecte Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEffectifOuEnginAffecte()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EffectifOuEnginAffecte' kind='elementOnly'"
 * @generated
 */
public interface TypeEffectifOuEnginAffecte extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom AAffecter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom AAffecter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom AAffecter</em>' attribute.
	 * @see #setNomAAffecter(String)
	 * @see mpia.schema.SchemaPackage#getTypeEffectifOuEnginAffecte_NomAAffecter()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='NomAAffecter'"
	 * @generated
	 */
	String getNomAAffecter();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffectifOuEnginAffecte#getNomAAffecter <em>Nom AAffecter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom AAffecter</em>' attribute.
	 * @see #getNomAAffecter()
	 * @generated
	 */
	void setNomAAffecter(String value);

	/**
	 * Returns the value of the '<em><b>Nom Logique Affecte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Logique Affecte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Logique Affecte</em>' attribute.
	 * @see #setNomLogiqueAffecte(String)
	 * @see mpia.schema.SchemaPackage#getTypeEffectifOuEnginAffecte_NomLogiqueAffecte()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NomLogiqueAffecte'"
	 * @generated
	 */
	String getNomLogiqueAffecte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffectifOuEnginAffecte#getNomLogiqueAffecte <em>Nom Logique Affecte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Logique Affecte</em>' attribute.
	 * @see #getNomLogiqueAffecte()
	 * @generated
	 */
	void setNomLogiqueAffecte(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEffectifOuEnginAffecte_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffectifOuEnginAffecte#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEffectifOuEnginAffecte_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffectifOuEnginAffecte#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Affecte Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Affecte Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Affecte Unite</em>' containment reference.
	 * @see #setEstAffecteUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeEffectifOuEnginAffecte_EstAffecteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EstAffecte_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getEstAffecteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffectifOuEnginAffecte#getEstAffecteUnite <em>Est Affecte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Affecte Unite</em>' containment reference.
	 * @see #getEstAffecteUnite()
	 * @generated
	 */
	void setEstAffecteUnite(TypeAssociationEXT value);

} // TypeEffectifOuEnginAffecte
