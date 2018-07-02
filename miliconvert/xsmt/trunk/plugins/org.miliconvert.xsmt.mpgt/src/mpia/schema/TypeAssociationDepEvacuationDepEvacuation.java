/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Dep Evacuation Dep Evacuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationDepEvacuationDepEvacuation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationDepEvacuationDepEvacuation#getAssocieCommeObjetDepannageEvacuation <em>Associe Comme Objet Depannage Evacuation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationDepEvacuationDepEvacuation#getAssocieCommeSujetDepannageEvacuation <em>Associe Comme Sujet Depannage Evacuation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationDepEvacuationDepEvacuation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationDepEvacuationDepEvacuation' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationDepEvacuationDepEvacuation extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationDepEvacuationDepEvacuation_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationDepEvacuationDepEvacuation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationDepEvacuationDepEvacuation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationDepEvacuationDepEvacuation#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationDepEvacuationDepEvacuationCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Depannage Evacuation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Depannage Evacuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Depannage Evacuation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAssociationDepEvacuationDepEvacuation_AssocieCommeObjetDepannageEvacuation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationDepEvacuationDepEvacuation' target_entity='type_DepannageEvacuation'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_DepannageEvacuation'"
	 * @generated
	 */
	EList<TypeAssociation> getAssocieCommeObjetDepannageEvacuation();

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Depannage Evacuation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Depannage Evacuation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Depannage Evacuation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAssociationDepEvacuationDepEvacuation_AssocieCommeSujetDepannageEvacuation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationDepEvacuationDepEvacuation' target_entity='type_DepannageEvacuation'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_DepannageEvacuation'"
	 * @generated
	 */
	EList<TypeAssociation> getAssocieCommeSujetDepannageEvacuation();

} // TypeAssociationDepEvacuationDepEvacuation
