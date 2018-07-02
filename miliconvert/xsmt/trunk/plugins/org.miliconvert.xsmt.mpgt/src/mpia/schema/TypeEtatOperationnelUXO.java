/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel UXO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelUXO#getQualificatif <em>Qualificatif</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelUXO#getExposition <em>Exposition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelUXO()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelUXO' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelUXO extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualificatif</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelUXOQualificatif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelUXOQualificatif
	 * @see #isSetQualificatif()
	 * @see #unsetQualificatif()
	 * @see #setQualificatif(TypeDictionaryDicoEtatOperationnelUXOQualificatif)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelUXO_Qualificatif()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Qualificatif'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelUXOQualificatif getQualificatif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelUXO#getQualificatif <em>Qualificatif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelUXOQualificatif
	 * @see #isSetQualificatif()
	 * @see #unsetQualificatif()
	 * @see #getQualificatif()
	 * @generated
	 */
	void setQualificatif(TypeDictionaryDicoEtatOperationnelUXOQualificatif value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelUXO#getQualificatif <em>Qualificatif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatif()
	 * @see #getQualificatif()
	 * @see #setQualificatif(TypeDictionaryDicoEtatOperationnelUXOQualificatif)
	 * @generated
	 */
	void unsetQualificatif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelUXO#getQualificatif <em>Qualificatif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif</em>' attribute is set.
	 * @see #unsetQualificatif()
	 * @see #getQualificatif()
	 * @see #setQualificatif(TypeDictionaryDicoEtatOperationnelUXOQualificatif)
	 * @generated
	 */
	boolean isSetQualificatif();

	/**
	 * Returns the value of the '<em><b>Exposition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelUXOExposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelUXOExposition
	 * @see #isSetExposition()
	 * @see #unsetExposition()
	 * @see #setExposition(TypeDictionaryDicoEtatOperationnelUXOExposition)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelUXO_Exposition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Exposition'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelUXOExposition getExposition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelUXO#getExposition <em>Exposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelUXOExposition
	 * @see #isSetExposition()
	 * @see #unsetExposition()
	 * @see #getExposition()
	 * @generated
	 */
	void setExposition(TypeDictionaryDicoEtatOperationnelUXOExposition value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelUXO#getExposition <em>Exposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExposition()
	 * @see #getExposition()
	 * @see #setExposition(TypeDictionaryDicoEtatOperationnelUXOExposition)
	 * @generated
	 */
	void unsetExposition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelUXO#getExposition <em>Exposition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exposition</em>' attribute is set.
	 * @see #unsetExposition()
	 * @see #getExposition()
	 * @see #setExposition(TypeDictionaryDicoEtatOperationnelUXOExposition)
	 * @generated
	 */
	boolean isSetExposition();

} // TypeEtatOperationnelUXO
