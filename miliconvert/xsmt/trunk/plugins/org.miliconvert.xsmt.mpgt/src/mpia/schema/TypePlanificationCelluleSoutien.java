/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Planification Cellule Soutien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePlanificationCelluleSoutien#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationCelluleSoutien#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationCelluleSoutien#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationCelluleSoutien#getListeCelluleSoutien <em>Liste Cellule Soutien</em>}</li>
 *   <li>{@link mpia.schema.TypePlanificationCelluleSoutien#getPositionneJalon <em>Positionne Jalon</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePlanificationCelluleSoutien()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PlanificationCelluleSoutien' kind='elementOnly'"
 * @generated
 */
public interface TypePlanificationCelluleSoutien extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypePlanificationCelluleSoutien_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020" required="true"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanificationCelluleSoutien#getNom <em>Nom</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePlanificationCelluleSoutien_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanificationCelluleSoutien#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePlanificationCelluleSoutien_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePlanificationCelluleSoutien#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Liste Cellule Soutien</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCelluleSoutien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liste Cellule Soutien</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liste Cellule Soutien</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationCelluleSoutien_ListeCelluleSoutien()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CelluleSoutien'"
	 *        extendedMetaData="kind='element' name='Liste_CelluleSoutien'"
	 * @generated
	 */
	EList<TypeCelluleSoutien> getListeCelluleSoutien();

	/**
	 * Returns the value of the '<em><b>Positionne Jalon</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeJalon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positionne Jalon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positionne Jalon</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePlanificationCelluleSoutien_PositionneJalon()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Jalon'"
	 *        extendedMetaData="kind='element' name='Positionne_Jalon'"
	 * @generated
	 */
	EList<TypeJalon> getPositionneJalon();

} // TypePlanificationCelluleSoutien
