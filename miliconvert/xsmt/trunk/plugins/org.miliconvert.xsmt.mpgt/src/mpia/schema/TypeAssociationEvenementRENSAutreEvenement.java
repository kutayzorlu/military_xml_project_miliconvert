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
 * A representation of the model object '<em><b>Type Association Evenement RENS Autre Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement#getAssocieCommeSujetEvenementRENS <em>Associe Comme Sujet Evenement RENS</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement#getAssocieCommeObjetAutreEvenement <em>Associe Comme Objet Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementRENSAutreEvenement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEvenementRENSAutreEvenement' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEvenementRENSAutreEvenement extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementRENSAutreEvenement_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleActiviteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Evenement RENS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Evenement RENS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Evenement RENS</em>' containment reference.
	 * @see #setAssocieCommeSujetEvenementRENS(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementRENSAutreEvenement_AssocieCommeSujetEvenementRENS()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEvenementRENSAutreEvenement' target_entity='type_EvenementRENS'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_EvenementRENS'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetEvenementRENS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement#getAssocieCommeSujetEvenementRENS <em>Associe Comme Sujet Evenement RENS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Evenement RENS</em>' containment reference.
	 * @see #getAssocieCommeSujetEvenementRENS()
	 * @generated
	 */
	void setAssocieCommeSujetEvenementRENS(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Autre Evenement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Autre Evenement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Autre Evenement</em>' containment reference.
	 * @see #setAssocieCommeObjetAutreEvenement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEvenementRENSAutreEvenement_AssocieCommeObjetAutreEvenement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEvenementRENSAutreEvenement' target_entity='type_AutreEvenement'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_AutreEvenement'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetAutreEvenement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEvenementRENSAutreEvenement#getAssocieCommeObjetAutreEvenement <em>Associe Comme Objet Autre Evenement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Autre Evenement</em>' containment reference.
	 * @see #getAssocieCommeObjetAutreEvenement()
	 * @generated
	 */
	void setAssocieCommeObjetAutreEvenement(TypeAssociation value);

} // TypeAssociationEvenementRENSAutreEvenement
