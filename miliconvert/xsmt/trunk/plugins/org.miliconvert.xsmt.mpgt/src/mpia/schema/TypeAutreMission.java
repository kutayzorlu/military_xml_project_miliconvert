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
 * A representation of the model object '<em><b>Type Autre Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutreMission#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAutreMission#getAPourUniteConcerneeUnite <em>APour Unite Concernee Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutreMission()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AutreMission' kind='elementOnly'"
 * @generated
 */
public interface TypeAutreMission extends TypeMission {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutreMissionCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreMissionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreMissionCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAutreMission_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAutreMissionCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutreMission#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutreMissionCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAutreMissionCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutreMission#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreMissionCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutreMission#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAutreMissionCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Unite Concernee Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Concernee Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Concernee Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAutreMission_APourUniteConcerneeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteConcernee_Unite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourUniteConcerneeUnite();

} // TypeAutreMission
