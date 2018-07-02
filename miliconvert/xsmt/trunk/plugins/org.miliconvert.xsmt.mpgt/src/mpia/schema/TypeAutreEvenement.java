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
 * A representation of the model object '<em><b>Type Autre Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getEstObjetAssociationAutreEvenementAutreEvenement <em>Est Objet Association Autre Evenement Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getEstSujetAssociationAutreEvenementAutreEvenement <em>Est Sujet Association Autre Evenement Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getEstObjetAssociationActionAutreEvenement <em>Est Objet Association Action Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getEstSujetAssociationAutreEvenementAction <em>Est Sujet Association Autre Evenement Action</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getEstSujetAssociationAutreEvenementEvenementNRBC <em>Est Sujet Association Autre Evenement Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getEstObjetAssociationEvenementNRBCAutreEvenement <em>Est Objet Association Evenement NRBC Autre Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreEvenement#getEstObjetAssociationEvenementRENSAutreEvenement <em>Est Objet Association Evenement RENS Autre Evenement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreEvenement' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreEvenement extends TypeEvenement {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreEvenementCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreEvenementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreEvenementCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreEvenementCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreEvenementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAutreEvenementCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreEvenement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreEvenementCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreEvenement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreEvenementCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreEvenementSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreEvenementSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreEvenementSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreEvenementSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreEvenement#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreEvenementSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoAutreEvenementSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreEvenement#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreEvenementSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreEvenement#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoAutreEvenementSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Autre Evenement Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Autre Evenement Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Autre Evenement Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_EstObjetAssociationAutreEvenementAutreEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_AutreEvenement' target_entity='type_AssociationAutreEvenementAutreEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationAutreEvenementAutreEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationAutreEvenementAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Autre Evenement Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Autre Evenement Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Autre Evenement Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_EstSujetAssociationAutreEvenementAutreEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_AutreEvenement' target_entity='type_AssociationAutreEvenementAutreEvenement'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationAutreEvenementAutreEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationAutreEvenementAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Action Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Action Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Action Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_EstObjetAssociationActionAutreEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_AutreEvenement' target_entity='type_AssociationActionAutreEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationActionAutreEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationActionAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Autre Evenement Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Autre Evenement Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Autre Evenement Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_EstSujetAssociationAutreEvenementAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_AutreEvenement' target_entity='type_AssociationAutreEvenementAction'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationAutreEvenementAction'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationAutreEvenementAction();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Autre Evenement Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Autre Evenement Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Autre Evenement Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_EstSujetAssociationAutreEvenementEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_AutreEvenement' target_entity='type_AssociationAutreEvenementEvenementNRBC'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationAutreEvenementEvenementNRBC'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationAutreEvenementEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Evenement NRBC Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Evenement NRBC Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Evenement NRBC Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_EstObjetAssociationEvenementNRBCAutreEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_AutreEvenement' target_entity='type_AssociationEvenementNRBCAutreEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEvenementNRBCAutreEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEvenementNRBCAutreEvenement();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Evenement RENS Autre Evenement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Evenement RENS Autre Evenement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Evenement RENS Autre Evenement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreEvenement_EstObjetAssociationEvenementRENSAutreEvenement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_AutreEvenement' target_entity='type_AssociationEvenementRENSAutreEvenement'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationEvenementRENSAutreEvenement'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationEvenementRENSAutreEvenement();

} // TypeAutreEvenement
