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
 * A representation of the model object '<em><b>Type Association Traitement Obj Plan Traitement Obj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj#getAssocieCommeSujetTraitementObjectif <em>Associe Comme Sujet Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj#getAssocieCommeObjetPlanTraitementObjectifs <em>Associe Comme Objet Plan Traitement Objectifs</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationTraitementObjPlanTraitementObj()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationTraitementObjPlanTraitementObj' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationTraitementObjPlanTraitementObj extends TypeAssociationFonctionnelleActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTraitementObjPlanTraitementObj_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleUARCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationFonctionnelleUARCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Traitement Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Traitement Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Traitement Objectif</em>' containment reference.
	 * @see #setAssocieCommeSujetTraitementObjectif(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTraitementObjPlanTraitementObj_AssocieCommeSujetTraitementObjectif()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationTraitementObjPlanTraitementObj' target_entity='type_TraitementObjectif'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_TraitementObjectif'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetTraitementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj#getAssocieCommeSujetTraitementObjectif <em>Associe Comme Sujet Traitement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Traitement Objectif</em>' containment reference.
	 * @see #getAssocieCommeSujetTraitementObjectif()
	 * @generated
	 */
	void setAssocieCommeSujetTraitementObjectif(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Plan Traitement Objectifs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Plan Traitement Objectifs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Plan Traitement Objectifs</em>' containment reference.
	 * @see #setAssocieCommeObjetPlanTraitementObjectifs(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTraitementObjPlanTraitementObj_AssocieCommeObjetPlanTraitementObjectifs()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationTraitementObjPlanTraitementObj' target_entity='type_PlanTraitementObjectifs'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_PlanTraitementObjectifs'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetPlanTraitementObjectifs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTraitementObjPlanTraitementObj#getAssocieCommeObjetPlanTraitementObjectifs <em>Associe Comme Objet Plan Traitement Objectifs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Plan Traitement Objectifs</em>' containment reference.
	 * @see #getAssocieCommeObjetPlanTraitementObjectifs()
	 * @generated
	 */
	void setAssocieCommeObjetPlanTraitementObjectifs(TypeAssociation value);

} // TypeAssociationTraitementObjPlanTraitementObj
