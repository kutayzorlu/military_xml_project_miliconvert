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
 * A representation of the model object '<em><b>Type Association Personne Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPersonneMateriel#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonneMateriel#getAPourObjetMateriel <em>APour Objet Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonneMateriel#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneMateriel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPersonneMateriel' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPersonneMateriel extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationPersonneMaterielCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonneMaterielCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneMaterielCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneMateriel_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationPersonneMaterielCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneMateriel#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonneMaterielCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationPersonneMaterielCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationPersonneMateriel#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneMaterielCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationPersonneMateriel#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonneMaterielCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objet Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Materiel</em>' containment reference.
	 * @see #setAPourObjetMateriel(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneMateriel_APourObjetMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationPersonneMateriel' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='APourObjet_Materiel'"
	 * @generated
	 */
	TypeAssociation getAPourObjetMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneMateriel#getAPourObjetMateriel <em>APour Objet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Materiel</em>' containment reference.
	 * @see #getAPourObjetMateriel()
	 * @generated
	 */
	void setAPourObjetMateriel(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonneMateriel_APourSujetPersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationPersonneMateriel' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='APourSujet_Personne'"
	 * @generated
	 */
	TypeAssociation getAPourSujetPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonneMateriel#getAPourSujetPersonne <em>APour Sujet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Personne</em>' containment reference.
	 * @see #getAPourSujetPersonne()
	 * @generated
	 */
	void setAPourSujetPersonne(TypeAssociation value);

} // TypeAssociationPersonneMateriel
