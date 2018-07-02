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
 * A representation of the model object '<em><b>Type Autre Mission Logistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreMissionLogistique#getEstObjetAssociationUniteAutreMissionLog <em>Est Objet Association Unite Autre Mission Log</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreMissionLogistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreMissionLogistique' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreMissionLogistique extends TypeMissionLogistique {
	/**
	 * Returns the value of the '<em><b>Est Objet Association Unite Autre Mission Log</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Unite Autre Mission Log</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Unite Autre Mission Log</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreMissionLogistique_EstObjetAssociationUniteAutreMissionLog()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_AutreMissionLogistique' target_entity='type_AssociationUniteAutreMissionLog'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationUniteAutreMissionLog'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationUniteAutreMissionLog();

} // TypeAutreMissionLogistique
