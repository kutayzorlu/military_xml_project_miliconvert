/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Liste Objectifs Planifies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeListeObjectifsPlanifies#getEstDefinieDansCadrePlanFeux <em>Est Definie Dans Cadre Plan Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeListeObjectifsPlanifies()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ListeObjectifsPlanifies' kind='elementOnly'"
 * @generated
 */
public interface TypeListeObjectifsPlanifies extends TypeListeObjectifs {
	/**
	 * Returns the value of the '<em><b>Est Definie Dans Cadre Plan Feux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Definie Dans Cadre Plan Feux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Definie Dans Cadre Plan Feux</em>' containment reference.
	 * @see #setEstDefinieDansCadrePlanFeux(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeListeObjectifsPlanifies_EstDefinieDansCadrePlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourListesObjectifsPlanifies_ListeObjectifsPlanifies' target_entity='type_PlanFeux'"
	 *        extendedMetaData="kind='element' name='EstDefinieDansCadre_PlanFeux'"
	 * @generated
	 */
	TypeAssociation getEstDefinieDansCadrePlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeObjectifsPlanifies#getEstDefinieDansCadrePlanFeux <em>Est Definie Dans Cadre Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Definie Dans Cadre Plan Feux</em>' containment reference.
	 * @see #getEstDefinieDansCadrePlanFeux()
	 * @generated
	 */
	void setEstDefinieDansCadrePlanFeux(TypeAssociation value);

} // TypeListeObjectifsPlanifies
