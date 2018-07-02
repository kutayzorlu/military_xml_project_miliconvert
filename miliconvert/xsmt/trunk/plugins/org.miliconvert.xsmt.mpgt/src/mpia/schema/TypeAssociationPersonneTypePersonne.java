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
 * A representation of the model object '<em><b>Type Association Personne Type Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPersonneTypePersonne#getAssocieCommeTypeTypePersonne <em>Associe Comme Type Type Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonneTypePersonne#getAssocieCommeObjetPersonne <em>Associe Comme Objet Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneTypePersonne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPersonneTypePersonne' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPersonneTypePersonne extends TypeAssociationInstanceObjetType {
	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type Personne</em>' containment reference.
	 * @see #setAssocieCommeTypeTypePersonne(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneTypePersonne_AssocieCommeTypeTypePersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypePersonne'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypePersonne'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeTypeTypePersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneTypePersonne#getAssocieCommeTypeTypePersonne <em>Associe Comme Type Type Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Personne</em>' containment reference.
	 * @see #getAssocieCommeTypeTypePersonne()
	 * @generated
	 */
	void setAssocieCommeTypeTypePersonne(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Personne</em>' containment reference.
	 * @see #setAssocieCommeObjetPersonne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneTypePersonne_AssocieCommeObjetPersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourType_AssociationPersonneTypePersonne' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Personne'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneTypePersonne#getAssocieCommeObjetPersonne <em>Associe Comme Objet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Personne</em>' containment reference.
	 * @see #getAssocieCommeObjetPersonne()
	 * @generated
	 */
	void setAssocieCommeObjetPersonne(TypeAssociation value);

} // TypeAssociationPersonneTypePersonne
