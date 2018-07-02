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
 * A representation of the model object '<em><b>Type Association Conflit3 DMission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationConflit3DMissionAerienne#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConflit3DMissionAerienne#getAssocieCommeObjetMissionAerienne <em>Associe Comme Objet Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConflit3DMissionAerienne#getAssocieCommeSujetConflit3D <em>Associe Comme Sujet Conflit3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationConflit3DMissionAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationConflit3DMissionAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationConflit3DMissionAerienne extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConflit3DMissionAerienne_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleUARCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConflit3DMissionAerienne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationConflit3DMissionAerienne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationConflit3DMissionAerienne#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Mission Aerienne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Mission Aerienne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Mission Aerienne</em>' containment reference.
	 * @see #setAssocieCommeObjetMissionAerienne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConflit3DMissionAerienne_AssocieCommeObjetMissionAerienne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationConflit3DMissionAerienne' target_entity='type_MissionAerienne'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_MissionAerienne'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetMissionAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConflit3DMissionAerienne#getAssocieCommeObjetMissionAerienne <em>Associe Comme Objet Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Mission Aerienne</em>' containment reference.
	 * @see #getAssocieCommeObjetMissionAerienne()
	 * @generated
	 */
	void setAssocieCommeObjetMissionAerienne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Conflit3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Conflit3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Conflit3 D</em>' containment reference.
	 * @see #setAssocieCommeSujetConflit3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConflit3DMissionAerienne_AssocieCommeSujetConflit3D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationConflit3DMissionAerienne' target_entity='type_Conflit3D'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_Conflit3D'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetConflit3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConflit3DMissionAerienne#getAssocieCommeSujetConflit3D <em>Associe Comme Sujet Conflit3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Conflit3 D</em>' containment reference.
	 * @see #getAssocieCommeSujetConflit3D()
	 * @generated
	 */
	void setAssocieCommeSujetConflit3D(TypeAssociation value);

} // TypeAssociationConflit3DMissionAerienne
