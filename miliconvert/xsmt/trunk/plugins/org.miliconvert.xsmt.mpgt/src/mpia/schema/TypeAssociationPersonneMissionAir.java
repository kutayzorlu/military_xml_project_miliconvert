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
 * A representation of the model object '<em><b>Type Association Personne Mission Air</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPersonneMissionAir#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonneMissionAir#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonneMissionAir#getAPourObjetMissionAir <em>APour Objet Mission Air</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneMissionAir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPersonneMissionAir' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPersonneMissionAir extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationPersonneMissionAirCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonneMissionAirCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneMissionAirCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneMissionAir_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationPersonneMissionAirCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneMissionAir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonneMissionAirCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationPersonneMissionAirCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationPersonneMissionAir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneMissionAirCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationPersonneMissionAir#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneMissionAirCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Personne</em>' containment reference.
	 * @see #setAPourSujetPersonne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneMissionAir_APourSujetPersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationPersonneMissionAir' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='APourSujet_Personne'"
	 * @generated
	 */
	TypeAssociation getAPourSujetPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneMissionAir#getAPourSujetPersonne <em>APour Sujet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Personne</em>' containment reference.
	 * @see #getAPourSujetPersonne()
	 * @generated
	 */
	void setAPourSujetPersonne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Mission Air</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Mission Air</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Mission Air</em>' containment reference.
	 * @see #setAPourObjetMissionAir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneMissionAir_APourObjetMissionAir()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationPersonneMissionAir' target_entity='type_MissionAir'"
	 *        extendedMetaData="kind='element' name='APourObjet_MissionAir'"
	 * @generated
	 */
	TypeAssociation getAPourObjetMissionAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneMissionAir#getAPourObjetMissionAir <em>APour Objet Mission Air</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Mission Air</em>' containment reference.
	 * @see #getAPourObjetMissionAir()
	 * @generated
	 */
	void setAPourObjetMissionAir(TypeAssociation value);

} // TypeAssociationPersonneMissionAir
