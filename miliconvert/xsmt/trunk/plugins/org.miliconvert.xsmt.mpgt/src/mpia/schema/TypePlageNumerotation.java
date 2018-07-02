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
 * A representation of the model object '<em><b>Type Plage Numerotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlageNumerotation#getDebutPlage <em>Debut Plage</em>}</li>
 *   <li>{@link mpia.schema.TypePlageNumerotation#getFinPlage <em>Fin Plage</em>}</li>
 *   <li>{@link mpia.schema.TypePlageNumerotation#getCellule <em>Cellule</em>}</li>
 *   <li>{@link mpia.schema.TypePlageNumerotation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePlageNumerotation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePlageNumerotation#getEstAttribueeAUnite <em>Est Attribuee AUnite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlageNumerotation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PlageNumerotation' kind='elementOnly'"
 * @generated
 */
public interface TypePlageNumerotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Debut Plage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Plage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Plage</em>' attribute.
	 * @see #setDebutPlage(String)
	 * @see mpia.schema.SchemaPackage#getTypePlageNumerotation_DebutPlage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06" required="true"
	 *        extendedMetaData="kind='element' name='DebutPlage'"
	 * @generated
	 */
	String getDebutPlage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlageNumerotation#getDebutPlage <em>Debut Plage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Plage</em>' attribute.
	 * @see #getDebutPlage()
	 * @generated
	 */
	void setDebutPlage(String value);

	/**
	 * Returns the value of the '<em><b>Fin Plage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Plage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Plage</em>' attribute.
	 * @see #setFinPlage(String)
	 * @see mpia.schema.SchemaPackage#getTypePlageNumerotation_FinPlage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06" required="true"
	 *        extendedMetaData="kind='element' name='FinPlage'"
	 * @generated
	 */
	String getFinPlage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlageNumerotation#getFinPlage <em>Fin Plage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Plage</em>' attribute.
	 * @see #getFinPlage()
	 * @generated
	 */
	void setFinPlage(String value);

	/**
	 * Returns the value of the '<em><b>Cellule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cellule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellule</em>' attribute.
	 * @see #setCellule(String)
	 * @see mpia.schema.SchemaPackage#getTypePlageNumerotation_Cellule()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='Cellule'"
	 * @generated
	 */
	String getCellule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlageNumerotation#getCellule <em>Cellule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellule</em>' attribute.
	 * @see #getCellule()
	 * @generated
	 */
	void setCellule(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypePlageNumerotation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlageNumerotation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePlageNumerotation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlageNumerotation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Attribuee AUnite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Attribuee AUnite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Attribuee AUnite</em>' containment reference.
	 * @see #setEstAttribueeAUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePlageNumerotation_EstAttribueeAUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EstAttribueeA_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getEstAttribueeAUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlageNumerotation#getEstAttribueeAUnite <em>Est Attribuee AUnite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Attribuee AUnite</em>' containment reference.
	 * @see #getEstAttribueeAUnite()
	 * @generated
	 */
	void setEstAttribueeAUnite(TypeAssociationEXT value);

} // TypePlageNumerotation
