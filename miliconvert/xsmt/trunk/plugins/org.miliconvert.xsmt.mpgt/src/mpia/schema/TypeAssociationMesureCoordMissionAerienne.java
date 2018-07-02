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
 * A representation of the model object '<em><b>Type Association Mesure Coord Mission Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne#getAPourSujetMesureCoordination <em>APour Sujet Mesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne#getAPourObjetMissionAerienne <em>APour Objet Mission Aerienne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMesureCoordMissionAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMesureCoordMissionAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMesureCoordMissionAerienne extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMesureCoordMissionAerienneCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMesureCoordMissionAerienneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMesureCoordMissionAerienneCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMesureCoordMissionAerienne_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMesureCoordMissionAerienneCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMesureCoordMissionAerienneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMesureCoordMissionAerienneCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMesureCoordMissionAerienneCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMesureCoordMissionAerienneCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Mesure Coordination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Mesure Coordination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Mesure Coordination</em>' containment reference.
	 * @see #setAPourSujetMesureCoordination(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMesureCoordMissionAerienne_APourSujetMesureCoordination()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMesureCoordMissionAerienne' target_entity='type_MesureCoordination'"
	 *        extendedMetaData="kind='element' name='APourSujet_MesureCoordination'"
	 * @generated
	 */
	TypeAssociation getAPourSujetMesureCoordination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne#getAPourSujetMesureCoordination <em>APour Sujet Mesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Mesure Coordination</em>' containment reference.
	 * @see #getAPourSujetMesureCoordination()
	 * @generated
	 */
	void setAPourSujetMesureCoordination(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Mission Aerienne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Mission Aerienne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Mission Aerienne</em>' containment reference.
	 * @see #setAPourObjetMissionAerienne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMesureCoordMissionAerienne_APourObjetMissionAerienne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMesureCoordMissionAerienne' target_entity='type_MissionAerienne'"
	 *        extendedMetaData="kind='element' name='APourObjet_MissionAerienne'"
	 * @generated
	 */
	TypeAssociation getAPourObjetMissionAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMesureCoordMissionAerienne#getAPourObjetMissionAerienne <em>APour Objet Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Mission Aerienne</em>' containment reference.
	 * @see #getAPourObjetMissionAerienne()
	 * @generated
	 */
	void setAPourObjetMissionAerienne(TypeAssociation value);

} // TypeAssociationMesureCoordMissionAerienne
