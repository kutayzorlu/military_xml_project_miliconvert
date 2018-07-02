/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Echelon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEchelon#getEchelon <em>Echelon</em>}</li>
 *   <li>{@link mpia.schema.TypeEchelon#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEchelon#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEchelon#getAPourUnitesParticipantesUnite <em>APour Unites Participantes Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeEchelon#getEstAppliqueMissionMelee <em>Est Applique Mission Melee</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEchelon()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Echelon' kind='elementOnly'"
 * @generated
 */
public interface TypeEchelon extends EObject {
	/**
	 * Returns the value of the '<em><b>Echelon</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEchelonEchelon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelon</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonEchelon
	 * @see #isSetEchelon()
	 * @see #unsetEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEchelonEchelon)
	 * @see mpia.schema.SchemaPackage#getTypeEchelon_Echelon()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Echelon'"
	 * @generated
	 */
	TypeDictionaryDicoEchelonEchelon getEchelon();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEchelon#getEchelon <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelon</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEchelonEchelon
	 * @see #isSetEchelon()
	 * @see #unsetEchelon()
	 * @see #getEchelon()
	 * @generated
	 */
	void setEchelon(TypeDictionaryDicoEchelonEchelon value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEchelon#getEchelon <em>Echelon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelon()
	 * @see #getEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEchelonEchelon)
	 * @generated
	 */
	void unsetEchelon();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEchelon#getEchelon <em>Echelon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelon</em>' attribute is set.
	 * @see #unsetEchelon()
	 * @see #getEchelon()
	 * @see #setEchelon(TypeDictionaryDicoEchelonEchelon)
	 * @generated
	 */
	boolean isSetEchelon();

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
	 * @see mpia.schema.SchemaPackage#getTypeEchelon_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEchelon#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEchelon_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEchelon#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unites Participantes Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unites Participantes Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unites Participantes Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEchelon_APourUnitesParticipantesUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUnitesParticipantes_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUnitesParticipantesUnite();

	/**
	 * Returns the value of the '<em><b>Est Applique Mission Melee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Applique Mission Melee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Applique Mission Melee</em>' containment reference.
	 * @see #setEstAppliqueMissionMelee(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEchelon_EstAppliqueMissionMelee()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_Echelon' target_entity='type_MissionMelee'"
	 *        extendedMetaData="kind='element' name='EstApplique_MissionMelee'"
	 * @generated
	 */
	TypeAssociation getEstAppliqueMissionMelee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEchelon#getEstAppliqueMissionMelee <em>Est Applique Mission Melee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Applique Mission Melee</em>' containment reference.
	 * @see #getEstAppliqueMissionMelee()
	 * @generated
	 */
	void setEstAppliqueMissionMelee(TypeAssociation value);

} // TypeEchelon
