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
 * A representation of the model object '<em><b>Type Autre Nom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreNom#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreNom#getEstAutreNomRacineOperationnelle <em>Est Autre Nom Racine Operationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreNom()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreNom' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreNom extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreNomCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreNomCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreNomCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreNom_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreNomCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreNom#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreNomCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAutreNomCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreNom#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreNomCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreNom#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreNomCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Est Autre Nom Racine Operationnelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Autre Nom Racine Operationnelle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Autre Nom Racine Operationnelle</em>' containment reference.
	 * @see #setEstAutreNomRacineOperationnelle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAutreNom_EstAutreNomRacineOperationnelle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourAutreNom_AutreNom' target_entity='type_RacineOperationnelle'"
	 *        extendedMetaData="kind='element' name='EstAutreNom_RacineOperationnelle'"
	 * @generated
	 */
	TypeAssociation getEstAutreNomRacineOperationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreNom#getEstAutreNomRacineOperationnelle <em>Est Autre Nom Racine Operationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Autre Nom Racine Operationnelle</em>' containment reference.
	 * @see #getEstAutreNomRacineOperationnelle()
	 * @generated
	 */
	void setEstAutreNomRacineOperationnelle(TypeAssociation value);

} // TypeAutreNom
