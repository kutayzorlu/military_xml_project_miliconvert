/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Elt Ctrl Type Elt Ctrl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEltCtrlTypeEltCtrl#getAssocieCommeObjetElementControle <em>Associe Comme Objet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEltCtrlTypeEltCtrl#getAssocieCommeTypeTypeElementControle <em>Associe Comme Type Type Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlTypeEltCtrl()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEltCtrlTypeEltCtrl' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEltCtrlTypeEltCtrl extends TypeAssociationInstanceObjetType {
	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Element Controle</em>' containment reference.
	 * @see #setAssocieCommeObjetElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlTypeEltCtrl_AssocieCommeObjetElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourType_AssociationEltCtrlTypeEltCtrl' target_entity='type_ElementControle'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_ElementControle'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltCtrlTypeEltCtrl#getAssocieCommeObjetElementControle <em>Associe Comme Objet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Element Controle</em>' containment reference.
	 * @see #getAssocieCommeObjetElementControle()
	 * @generated
	 */
	void setAssocieCommeObjetElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type Element Controle</em>' containment reference.
	 * @see #setAssocieCommeTypeTypeElementControle(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlTypeEltCtrl_AssocieCommeTypeTypeElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeElementControle'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypeElementControle'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeTypeTypeElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltCtrlTypeEltCtrl#getAssocieCommeTypeTypeElementControle <em>Associe Comme Type Type Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Element Controle</em>' containment reference.
	 * @see #getAssocieCommeTypeTypeElementControle()
	 * @generated
	 */
	void setAssocieCommeTypeTypeElementControle(TypeAssociationEXT value);

} // TypeAssociationEltCtrlTypeEltCtrl
