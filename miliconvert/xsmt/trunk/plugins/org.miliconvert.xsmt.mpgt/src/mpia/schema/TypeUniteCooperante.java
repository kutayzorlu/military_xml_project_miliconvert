/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Unite Cooperante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUniteCooperante#getTypeConcours <em>Type Concours</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteCooperante#getTypeConcoursTextuel <em>Type Concours Textuel</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteCooperante#getAPourUniteParticipanteUnite <em>APour Unite Participante Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUniteCooperante()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_UniteCooperante' kind='elementOnly'"
 * @generated
 */
public interface TypeUniteCooperante extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Concours</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteCooperanteTypeConcours}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Concours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Concours</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteCooperanteTypeConcours
	 * @see #isSetTypeConcours()
	 * @see #unsetTypeConcours()
	 * @see #setTypeConcours(TypeDictionaryDicoUniteCooperanteTypeConcours)
	 * @see mpia.schema.SchemaPackage#getTypeUniteCooperante_TypeConcours()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeConcours'"
	 * @generated
	 */
	TypeDictionaryDicoUniteCooperanteTypeConcours getTypeConcours();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteCooperante#getTypeConcours <em>Type Concours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Concours</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteCooperanteTypeConcours
	 * @see #isSetTypeConcours()
	 * @see #unsetTypeConcours()
	 * @see #getTypeConcours()
	 * @generated
	 */
	void setTypeConcours(TypeDictionaryDicoUniteCooperanteTypeConcours value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteCooperante#getTypeConcours <em>Type Concours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeConcours()
	 * @see #getTypeConcours()
	 * @see #setTypeConcours(TypeDictionaryDicoUniteCooperanteTypeConcours)
	 * @generated
	 */
	void unsetTypeConcours();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteCooperante#getTypeConcours <em>Type Concours</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Concours</em>' attribute is set.
	 * @see #unsetTypeConcours()
	 * @see #getTypeConcours()
	 * @see #setTypeConcours(TypeDictionaryDicoUniteCooperanteTypeConcours)
	 * @generated
	 */
	boolean isSetTypeConcours();

	/**
	 * Returns the value of the '<em><b>Type Concours Textuel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Concours Textuel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Concours Textuel</em>' attribute.
	 * @see #setTypeConcoursTextuel(String)
	 * @see mpia.schema.SchemaPackage#getTypeUniteCooperante_TypeConcoursTextuel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeConcoursTextuel'"
	 * @generated
	 */
	String getTypeConcoursTextuel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteCooperante#getTypeConcoursTextuel <em>Type Concours Textuel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Concours Textuel</em>' attribute.
	 * @see #getTypeConcoursTextuel()
	 * @generated
	 */
	void setTypeConcoursTextuel(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Participante Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Participante Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Participante Unite</em>' containment reference.
	 * @see #setAPourUniteParticipanteUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeUniteCooperante_APourUniteParticipanteUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteParticipante_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteParticipanteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteCooperante#getAPourUniteParticipanteUnite <em>APour Unite Participante Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Participante Unite</em>' containment reference.
	 * @see #getAPourUniteParticipanteUnite()
	 * @generated
	 */
	void setAPourUniteParticipanteUnite(TypeAssociationEXT value);

} // TypeUniteCooperante
