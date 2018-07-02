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
 * A representation of the model object '<em><b>Type Association Unite Mission Unite Antichar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar#getAPourObjetMissionUniteAntichar <em>APour Objet Mission Unite Antichar</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteMissionUniteAntichar()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationUniteMissionUniteAntichar' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationUniteMissionUniteAntichar extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationUniteMissionUniteAnticharCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationUniteMissionUniteAnticharCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteMissionUniteAnticharCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteMissionUniteAntichar_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationUniteMissionUniteAnticharCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationUniteMissionUniteAnticharCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationUniteMissionUniteAnticharCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteMissionUniteAnticharCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteMissionUniteAnticharCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Unite</em>' containment reference.
	 * @see #setAPourSujetUnite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteMissionUniteAntichar_APourSujetUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationUniteMissionUniteAntichar' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourSujet_Unite'"
	 * @generated
	 */
	TypeAssociation getAPourSujetUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar#getAPourSujetUnite <em>APour Sujet Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Unite</em>' containment reference.
	 * @see #getAPourSujetUnite()
	 * @generated
	 */
	void setAPourSujetUnite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Mission Unite Antichar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Mission Unite Antichar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Mission Unite Antichar</em>' containment reference.
	 * @see #setAPourObjetMissionUniteAntichar(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteMissionUniteAntichar_APourObjetMissionUniteAntichar()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationUniteMissionUniteAntichar' target_entity='type_MissionUniteAntichar'"
	 *        extendedMetaData="kind='element' name='APourObjet_MissionUniteAntichar'"
	 * @generated
	 */
	TypeAssociation getAPourObjetMissionUniteAntichar();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteMissionUniteAntichar#getAPourObjetMissionUniteAntichar <em>APour Objet Mission Unite Antichar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Mission Unite Antichar</em>' containment reference.
	 * @see #getAPourObjetMissionUniteAntichar()
	 * @generated
	 */
	void setAPourObjetMissionUniteAntichar(TypeAssociation value);

} // TypeAssociationUniteMissionUniteAntichar
