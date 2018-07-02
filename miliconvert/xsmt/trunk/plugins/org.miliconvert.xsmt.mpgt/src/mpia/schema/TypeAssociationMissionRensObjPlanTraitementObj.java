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
 * A representation of the model object '<em><b>Type Association Mission Rens Obj Plan Traitement Obj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj#getAssocieCommeObjetPlanTraitementObjectifs <em>Associe Comme Objet Plan Traitement Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj#getAssocieCommeSujetMissionRenseignementObjectif <em>Associe Comme Sujet Mission Renseignement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRensObjPlanTraitementObj()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMissionRensObjPlanTraitementObj' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMissionRensObjPlanTraitementObj extends TypeAssociationFonctionnelleActivite {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRensObjPlanTraitementObj_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleUARCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj#getCategorie <em>Categorie</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj#getCategorie <em>Categorie</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Associe Comme Objet Plan Traitement Objectifs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Plan Traitement Objectifs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Plan Traitement Objectifs</em>' containment reference.
	 * @see #setAssocieCommeObjetPlanTraitementObjectifs(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRensObjPlanTraitementObj_AssocieCommeObjetPlanTraitementObjectifs()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMissionRensObjPlanTraitementObj' target_entity='type_PlanTraitementObjectifs'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_PlanTraitementObjectifs'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetPlanTraitementObjectifs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj#getAssocieCommeObjetPlanTraitementObjectifs <em>Associe Comme Objet Plan Traitement Objectifs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Plan Traitement Objectifs</em>' containment reference.
	 * @see #getAssocieCommeObjetPlanTraitementObjectifs()
	 * @generated
	 */
	void setAssocieCommeObjetPlanTraitementObjectifs(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Mission Renseignement Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Mission Renseignement Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Mission Renseignement Objectif</em>' containment reference.
	 * @see #setAssocieCommeSujetMissionRenseignementObjectif(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRensObjPlanTraitementObj_AssocieCommeSujetMissionRenseignementObjectif()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMissionRensObjPlanTraitementObj' target_entity='type_MissionRenseignementObjectif'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_MissionRenseignementObjectif'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetMissionRenseignementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRensObjPlanTraitementObj#getAssocieCommeSujetMissionRenseignementObjectif <em>Associe Comme Sujet Mission Renseignement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Mission Renseignement Objectif</em>' containment reference.
	 * @see #getAssocieCommeSujetMissionRenseignementObjectif()
	 * @generated
	 */
	void setAssocieCommeSujetMissionRenseignementObjectif(TypeAssociation value);

} // TypeAssociationMissionRensObjPlanTraitementObj
