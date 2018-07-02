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
 * A representation of the model object '<em><b>Type Association Renseignement Obj Mis Renseignement Obj</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj#getAssocieCommeObjetMissionRenseignementObjectif <em>Associe Comme Objet Mission Renseignement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj#getAssocieCommeSujetRenseignementObjectif <em>Associe Comme Sujet Renseignement Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationRenseignementObjMisRenseignementObj()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationRenseignementObjMisRenseignementObj' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationRenseignementObjMisRenseignementObj extends TypeAssociationFonctionnelleActivite {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRenseignementObjMisRenseignementObj_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationFonctionnelleHSACategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj#getCategorie <em>Categorie</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationFonctionnelleHSACategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj#getCategorie <em>Categorie</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Associe Comme Objet Mission Renseignement Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Mission Renseignement Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Mission Renseignement Objectif</em>' containment reference.
	 * @see #setAssocieCommeObjetMissionRenseignementObjectif(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRenseignementObjMisRenseignementObj_AssocieCommeObjetMissionRenseignementObjectif()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationRenseignementObjMisRenseignementObj' target_entity='type_MissionRenseignementObjectif'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_MissionRenseignementObjectif'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetMissionRenseignementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj#getAssocieCommeObjetMissionRenseignementObjectif <em>Associe Comme Objet Mission Renseignement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Mission Renseignement Objectif</em>' containment reference.
	 * @see #getAssocieCommeObjetMissionRenseignementObjectif()
	 * @generated
	 */
	void setAssocieCommeObjetMissionRenseignementObjectif(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Renseignement Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Renseignement Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Renseignement Objectif</em>' containment reference.
	 * @see #setAssocieCommeSujetRenseignementObjectif(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationRenseignementObjMisRenseignementObj_AssocieCommeSujetRenseignementObjectif()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationRenseignementObjMisRenseignementObj' target_entity='type_RenseignementObjectif'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_RenseignementObjectif'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetRenseignementObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationRenseignementObjMisRenseignementObj#getAssocieCommeSujetRenseignementObjectif <em>Associe Comme Sujet Renseignement Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Renseignement Objectif</em>' containment reference.
	 * @see #getAssocieCommeSujetRenseignementObjectif()
	 * @generated
	 */
	void setAssocieCommeSujetRenseignementObjectif(TypeAssociation value);

} // TypeAssociationRenseignementObjMisRenseignementObj
