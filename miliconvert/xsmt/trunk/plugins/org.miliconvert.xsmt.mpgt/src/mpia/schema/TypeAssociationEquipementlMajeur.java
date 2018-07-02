/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Equipementl Majeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEquipementlMajeur#isSuiviTactique <em>Suivi Tactique</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEquipementlMajeur#isSuiviLogistique <em>Suivi Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEquipementlMajeur#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEquipementlMajeur#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEquipementlMajeur#getAssocieCommeTypeEquipementTypeEquipement <em>Associe Comme Type Equipement Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEquipementlMajeur#getAssocieCommeUniteUnite <em>Associe Comme Unite Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEquipementlMajeur()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEquipementlMajeur' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEquipementlMajeur extends EObject {
	/**
	 * Returns the value of the '<em><b>Suivi Tactique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suivi Tactique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivi Tactique</em>' attribute.
	 * @see #isSetSuiviTactique()
	 * @see #unsetSuiviTactique()
	 * @see #setSuiviTactique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEquipementlMajeur_SuiviTactique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='SuiviTactique'"
	 * @generated
	 */
	boolean isSuiviTactique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#isSuiviTactique <em>Suivi Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suivi Tactique</em>' attribute.
	 * @see #isSetSuiviTactique()
	 * @see #unsetSuiviTactique()
	 * @see #isSuiviTactique()
	 * @generated
	 */
	void setSuiviTactique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#isSuiviTactique <em>Suivi Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuiviTactique()
	 * @see #isSuiviTactique()
	 * @see #setSuiviTactique(boolean)
	 * @generated
	 */
	void unsetSuiviTactique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#isSuiviTactique <em>Suivi Tactique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suivi Tactique</em>' attribute is set.
	 * @see #unsetSuiviTactique()
	 * @see #isSuiviTactique()
	 * @see #setSuiviTactique(boolean)
	 * @generated
	 */
	boolean isSetSuiviTactique();

	/**
	 * Returns the value of the '<em><b>Suivi Logistique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suivi Logistique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suivi Logistique</em>' attribute.
	 * @see #isSetSuiviLogistique()
	 * @see #unsetSuiviLogistique()
	 * @see #setSuiviLogistique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEquipementlMajeur_SuiviLogistique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='SuiviLogistique'"
	 * @generated
	 */
	boolean isSuiviLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#isSuiviLogistique <em>Suivi Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suivi Logistique</em>' attribute.
	 * @see #isSetSuiviLogistique()
	 * @see #unsetSuiviLogistique()
	 * @see #isSuiviLogistique()
	 * @generated
	 */
	void setSuiviLogistique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#isSuiviLogistique <em>Suivi Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuiviLogistique()
	 * @see #isSuiviLogistique()
	 * @see #setSuiviLogistique(boolean)
	 * @generated
	 */
	void unsetSuiviLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#isSuiviLogistique <em>Suivi Logistique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suivi Logistique</em>' attribute is set.
	 * @see #unsetSuiviLogistique()
	 * @see #isSuiviLogistique()
	 * @see #setSuiviLogistique(boolean)
	 * @generated
	 */
	boolean isSetSuiviLogistique();

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEquipementlMajeur_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEquipementlMajeur_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Equipement Type Equipement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Equipement Type Equipement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Equipement Type Equipement</em>' containment reference.
	 * @see #setAssocieCommeTypeEquipementTypeEquipement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEquipementlMajeur_AssocieCommeTypeEquipementTypeEquipement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstEquipementMajeur_AssociationEquipementlMajeur' target_entity='type_TypeEquipement'"
	 *        extendedMetaData="kind='element' name='AssocieCommeTypeEquipement_TypeEquipement'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeTypeEquipementTypeEquipement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#getAssocieCommeTypeEquipementTypeEquipement <em>Associe Comme Type Equipement Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Equipement Type Equipement</em>' containment reference.
	 * @see #getAssocieCommeTypeEquipementTypeEquipement()
	 * @generated
	 */
	void setAssocieCommeTypeEquipementTypeEquipement(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Unite Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Unite Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Unite Unite</em>' containment reference.
	 * @see #setAssocieCommeUniteUnite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEquipementlMajeur_AssocieCommeUniteUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourEquipementMajeur_AssociationEquipementlMajeur' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeUnite_Unite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeUniteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEquipementlMajeur#getAssocieCommeUniteUnite <em>Associe Comme Unite Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Unite Unite</em>' containment reference.
	 * @see #getAssocieCommeUniteUnite()
	 * @generated
	 */
	void setAssocieCommeUniteUnite(TypeAssociation value);

} // TypeAssociationEquipementlMajeur
