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
 * A representation of the model object '<em><b>Type Association Materiel Objet Inconnu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMaterielObjetInconnu#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielObjetInconnu#getAPourObjetObjetInconnu <em>APour Objet Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielObjetInconnu#getAPourSujetMateriel <em>APour Sujet Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielObjetInconnu()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMaterielObjetInconnu' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMaterielObjetInconnu extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMaterielObjetInconnuCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMaterielObjetInconnuCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielObjetInconnuCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielObjetInconnu_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMaterielObjetInconnuCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielObjetInconnu#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMaterielObjetInconnuCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMaterielObjetInconnuCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMaterielObjetInconnu#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielObjetInconnuCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMaterielObjetInconnu#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielObjetInconnuCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objet Objet Inconnu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Objet Inconnu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Objet Inconnu</em>' containment reference.
	 * @see #setAPourObjetObjetInconnu(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielObjetInconnu_APourObjetObjetInconnu()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMaterielObjetInconnu' target_entity='type_ObjetInconnu'"
	 *        extendedMetaData="kind='element' name='APourObjet_ObjetInconnu'"
	 * @generated
	 */
	TypeAssociation getAPourObjetObjetInconnu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielObjetInconnu#getAPourObjetObjetInconnu <em>APour Objet Objet Inconnu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Objet Inconnu</em>' containment reference.
	 * @see #getAPourObjetObjetInconnu()
	 * @generated
	 */
	void setAPourObjetObjetInconnu(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Materiel</em>' containment reference.
	 * @see #setAPourSujetMateriel(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielObjetInconnu_APourSujetMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMaterielObjetInconnu' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='APourSujet_Materiel'"
	 * @generated
	 */
	TypeAssociation getAPourSujetMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielObjetInconnu#getAPourSujetMateriel <em>APour Sujet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Materiel</em>' containment reference.
	 * @see #getAPourSujetMateriel()
	 * @generated
	 */
	void setAPourSujetMateriel(TypeAssociation value);

} // TypeAssociationMaterielObjetInconnu
