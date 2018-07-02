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
 * A representation of the model object '<em><b>Type Association Unite Appui Feu Helicoptere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere#getAPourObjetAppuiFeuHelicoptere <em>APour Objet Appui Feu Helicoptere</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteAppuiFeuHelicoptere()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationUniteAppuiFeuHelicoptere' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationUniteAppuiFeuHelicoptere extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationUniteAppuiFeuHelicoptereCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationUniteAppuiFeuHelicoptereCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteAppuiFeuHelicoptereCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteAppuiFeuHelicoptere_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationUniteAppuiFeuHelicoptereCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationUniteAppuiFeuHelicoptereCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationUniteAppuiFeuHelicoptereCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteAppuiFeuHelicoptereCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteAppuiFeuHelicoptereCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteAppuiFeuHelicoptere_APourSujetUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationUniteAppuiFeuHelicoptere' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourSujet_Unite'"
	 * @generated
	 */
	TypeAssociation getAPourSujetUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere#getAPourSujetUnite <em>APour Sujet Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Unite</em>' containment reference.
	 * @see #getAPourSujetUnite()
	 * @generated
	 */
	void setAPourSujetUnite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Appui Feu Helicoptere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Appui Feu Helicoptere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Appui Feu Helicoptere</em>' containment reference.
	 * @see #setAPourObjetAppuiFeuHelicoptere(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteAppuiFeuHelicoptere_APourObjetAppuiFeuHelicoptere()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationUniteAppuiFeuHelicoptere' target_entity='type_AppuiFeuHelicoptere'"
	 *        extendedMetaData="kind='element' name='APourObjet_AppuiFeuHelicoptere'"
	 * @generated
	 */
	TypeAssociation getAPourObjetAppuiFeuHelicoptere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteAppuiFeuHelicoptere#getAPourObjetAppuiFeuHelicoptere <em>APour Objet Appui Feu Helicoptere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Appui Feu Helicoptere</em>' containment reference.
	 * @see #getAPourObjetAppuiFeuHelicoptere()
	 * @generated
	 */
	void setAPourObjetAppuiFeuHelicoptere(TypeAssociation value);

} // TypeAssociationUniteAppuiFeuHelicoptere
