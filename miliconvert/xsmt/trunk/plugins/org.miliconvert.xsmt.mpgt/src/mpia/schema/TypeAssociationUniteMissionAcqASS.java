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
 * A representation of the model object '<em><b>Type Association Unite Mission Acq ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationUniteMissionAcqASS#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationUniteMissionAcqASS#getAPourSujetUnite <em>APour Sujet Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationUniteMissionAcqASS#getAPourObjetMissionAcquisitionASS <em>APour Objet Mission Acquisition ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteMissionAcqASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationUniteMissionAcqASS' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationUniteMissionAcqASS extends TypeAssociationInstanceObjetActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationUniteMissionAcqASSCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationUniteMissionAcqASSCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteMissionAcqASSCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteMissionAcqASS_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationUniteMissionAcqASSCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteMissionAcqASS#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationUniteMissionAcqASSCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationUniteMissionAcqASSCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationUniteMissionAcqASS#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteMissionAcqASSCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationUniteMissionAcqASS#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationUniteMissionAcqASSCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Unite</em>' containment reference.
	 * @see #setAPourSujetUnite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteMissionAcqASS_APourSujetUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationUniteMissionAcqASS' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourSujet_Unite'"
	 * @generated
	 */
	TypeAssociation getAPourSujetUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteMissionAcqASS#getAPourSujetUnite <em>APour Sujet Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Unite</em>' containment reference.
	 * @see #getAPourSujetUnite()
	 * @generated
	 */
	void setAPourSujetUnite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Mission Acquisition ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Mission Acquisition ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Mission Acquisition ASS</em>' containment reference.
	 * @see #setAPourObjetMissionAcquisitionASS(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationUniteMissionAcqASS_APourObjetMissionAcquisitionASS()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationUniteMissionAcqASS' target_entity='type_MissionAcquisitionASS'"
	 *        extendedMetaData="kind='element' name='APourObjet_MissionAcquisitionASS'"
	 * @generated
	 */
	TypeAssociation getAPourObjetMissionAcquisitionASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationUniteMissionAcqASS#getAPourObjetMissionAcquisitionASS <em>APour Objet Mission Acquisition ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Mission Acquisition ASS</em>' containment reference.
	 * @see #getAPourObjetMissionAcquisitionASS()
	 * @generated
	 */
	void setAPourObjetMissionAcquisitionASS(TypeAssociation value);

} // TypeAssociationUniteMissionAcqASS
