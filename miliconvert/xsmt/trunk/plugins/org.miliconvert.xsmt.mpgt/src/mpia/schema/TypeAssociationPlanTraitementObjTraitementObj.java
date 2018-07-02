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
 * A representation of the model object '<em><b>Type Association Plan Traitement Obj Traitement Obj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj#getAssocieCommeObjetTraitementObjectif <em>Associe Comme Objet Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj#getAssocieCommeSujetPlanTraitementObjectifs <em>Associe Comme Sujet Plan Traitement Objectifs</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanTraitementObjTraitementObj()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPlanTraitementObjTraitementObj' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPlanTraitementObjTraitementObj extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationFonctionnelleHSACategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleHSACategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanTraitementObjTraitementObj_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleHSACategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleHSACategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Traitement Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Traitement Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Traitement Objectif</em>' containment reference.
	 * @see #setAssocieCommeObjetTraitementObjectif(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanTraitementObjTraitementObj_AssocieCommeObjetTraitementObjectif()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationPlanTraitementObjTraitementObj' target_entity='type_TraitementObjectif'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_TraitementObjectif'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetTraitementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj#getAssocieCommeObjetTraitementObjectif <em>Associe Comme Objet Traitement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Traitement Objectif</em>' containment reference.
	 * @see #getAssocieCommeObjetTraitementObjectif()
	 * @generated
	 */
	void setAssocieCommeObjetTraitementObjectif(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Plan Traitement Objectifs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Plan Traitement Objectifs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Plan Traitement Objectifs</em>' containment reference.
	 * @see #setAssocieCommeSujetPlanTraitementObjectifs(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPlanTraitementObjTraitementObj_AssocieCommeSujetPlanTraitementObjectifs()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationPlanTraitementObjTraitementObj' target_entity='type_PlanTraitementObjectifs'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_PlanTraitementObjectifs'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetPlanTraitementObjectifs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPlanTraitementObjTraitementObj#getAssocieCommeSujetPlanTraitementObjectifs <em>Associe Comme Sujet Plan Traitement Objectifs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Plan Traitement Objectifs</em>' containment reference.
	 * @see #getAssocieCommeSujetPlanTraitementObjectifs()
	 * @generated
	 */
	void setAssocieCommeSujetPlanTraitementObjectifs(TypeAssociation value);

} // TypeAssociationPlanTraitementObjTraitementObj
