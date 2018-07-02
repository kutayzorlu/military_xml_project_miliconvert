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
 * A representation of the model object '<em><b>Type Dotation Effective Effectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDotationEffectiveEffectif#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffectiveEffectif#getAssocieCommeTypeTypePersonne <em>Associe Comme Type Type Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffectiveEffectif#getConstitueSituationEffectif <em>Constitue Situation Effectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEffectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DotationEffectiveEffectif' kind='elementOnly'"
 * @generated
 */
public interface TypeDotationEffectiveEffectif extends TypeDotationEffective {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDotationEffectiveCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationEffectiveCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDotationEffectiveCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEffectif_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoDotationEffectiveCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffectiveEffectif#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationEffectiveCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoDotationEffectiveCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffectiveEffectif#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDotationEffectiveCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffectiveEffectif#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDotationEffectiveCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type Personne</em>' containment reference.
	 * @see #setAssocieCommeTypeTypePersonne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEffectif_AssocieCommeTypeTypePersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypePersonne'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypePersonne'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeTypeTypePersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffectiveEffectif#getAssocieCommeTypeTypePersonne <em>Associe Comme Type Type Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Personne</em>' containment reference.
	 * @see #getAssocieCommeTypeTypePersonne()
	 * @generated
	 */
	void setAssocieCommeTypeTypePersonne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Constitue Situation Effectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constitue Situation Effectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constitue Situation Effectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEffectif_ConstitueSituationEffectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_SituationEffectif'"
	 *        extendedMetaData="kind='element' name='Constitue_SituationEffectif'"
	 * @generated
	 */
	EList<TypeAssociation> getConstitueSituationEffectif();

} // TypeDotationEffectiveEffectif
