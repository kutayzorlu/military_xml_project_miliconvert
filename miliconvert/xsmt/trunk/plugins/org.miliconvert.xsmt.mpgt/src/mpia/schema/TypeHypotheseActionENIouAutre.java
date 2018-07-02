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
 * A representation of the model object '<em><b>Type Hypothese Action EN Iou Autre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeHypotheseActionENIouAutre#getComporteAction <em>Comporte Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeHypotheseActionENIouAutre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_HypotheseActionENIouAutre' kind='elementOnly'"
 * @generated
 */
public interface TypeHypotheseActionENIouAutre extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Comporte Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comporte Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comporte Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeHypotheseActionENIouAutre_ComporteAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='Comporte_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getComporteAction();

} // TypeHypotheseActionENIouAutre
