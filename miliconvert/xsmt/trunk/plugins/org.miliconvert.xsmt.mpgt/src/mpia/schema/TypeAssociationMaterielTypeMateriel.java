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
 * A representation of the model object '<em><b>Type Association Materiel Type Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMaterielTypeMateriel#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielTypeMateriel#getAssocieCommeObjetMateriel <em>Associe Comme Objet Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielTypeMateriel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMaterielTypeMateriel' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMaterielTypeMateriel extends TypeAssociationInstanceObjetType {
	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type Materiel</em>' containment reference.
	 * @see #setAssocieCommeTypeTypeMateriel(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielTypeMateriel_AssocieCommeTypeTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeTypeTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielTypeMateriel#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Materiel</em>' containment reference.
	 * @see #getAssocieCommeTypeTypeMateriel()
	 * @generated
	 */
	void setAssocieCommeTypeTypeMateriel(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Materiel</em>' containment reference.
	 * @see #setAssocieCommeObjetMateriel(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielTypeMateriel_AssocieCommeObjetMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourType_AssociationMaterielTypeMateriel' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Materiel'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielTypeMateriel#getAssocieCommeObjetMateriel <em>Associe Comme Objet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Materiel</em>' containment reference.
	 * @see #getAssocieCommeObjetMateriel()
	 * @generated
	 */
	void setAssocieCommeObjetMateriel(TypeAssociation value);

} // TypeAssociationMaterielTypeMateriel
