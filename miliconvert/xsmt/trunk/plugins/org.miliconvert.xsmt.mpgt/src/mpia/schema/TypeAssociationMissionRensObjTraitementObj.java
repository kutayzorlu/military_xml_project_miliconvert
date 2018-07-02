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
 * A representation of the model object '<em><b>Type Association Mission Rens Obj Traitement Obj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj#getAssocieCommeObjetTraitementObjectif <em>Associe Comme Objet Traitement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj#getAssocieCommeSujetMissionRenseignementObjectif <em>Associe Comme Sujet Mission Renseignement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRensObjTraitementObj()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMissionRensObjTraitementObj' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMissionRensObjTraitementObj extends TypeAssociationFonctionnelleActivite {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRensObjTraitementObj_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleUARCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj#getCategorie <em>Categorie</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleUARCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj#getCategorie <em>Categorie</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Associe Comme Objet Traitement Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Traitement Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Traitement Objectif</em>' containment reference.
	 * @see #setAssocieCommeObjetTraitementObjectif(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRensObjTraitementObj_AssocieCommeObjetTraitementObjectif()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMissionRensObjTraitementObj' target_entity='type_TraitementObjectif'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_TraitementObjectif'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetTraitementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj#getAssocieCommeObjetTraitementObjectif <em>Associe Comme Objet Traitement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Traitement Objectif</em>' containment reference.
	 * @see #getAssocieCommeObjetTraitementObjectif()
	 * @generated
	 */
	void setAssocieCommeObjetTraitementObjectif(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMissionRensObjTraitementObj_AssocieCommeSujetMissionRenseignementObjectif()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMissionRensObjTraitementObj' target_entity='type_MissionRenseignementObjectif'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_MissionRenseignementObjectif'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetMissionRenseignementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMissionRensObjTraitementObj#getAssocieCommeSujetMissionRenseignementObjectif <em>Associe Comme Sujet Mission Renseignement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Mission Renseignement Objectif</em>' containment reference.
	 * @see #getAssocieCommeSujetMissionRenseignementObjectif()
	 * @generated
	 */
	void setAssocieCommeSujetMissionRenseignementObjectif(TypeAssociation value);

} // TypeAssociationMissionRensObjTraitementObj
