/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Adresse Radio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAdresseRadio#getIndicatifOperationnel <em>Indicatif Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeAdresseRadio#getIndicatifRadio <em>Indicatif Radio</em>}</li>
 *   <li>{@link mpia.schema.TypeAdresseRadio#getAPourFrequenceFrequence <em>APour Frequence Frequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAdresseRadio()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AdresseRadio' kind='elementOnly'"
 * @generated
 */
public interface TypeAdresseRadio extends TypeAdresse {
	/**
	 * Returns the value of the '<em><b>Indicatif Operationnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicatif Operationnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicatif Operationnel</em>' attribute.
	 * @see #setIndicatifOperationnel(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdresseRadio_IndicatifOperationnel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='IndicatifOperationnel'"
	 * @generated
	 */
	String getIndicatifOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdresseRadio#getIndicatifOperationnel <em>Indicatif Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicatif Operationnel</em>' attribute.
	 * @see #getIndicatifOperationnel()
	 * @generated
	 */
	void setIndicatifOperationnel(String value);

	/**
	 * Returns the value of the '<em><b>Indicatif Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicatif Radio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicatif Radio</em>' attribute.
	 * @see #setIndicatifRadio(String)
	 * @see mpia.schema.SchemaPackage#getTypeAdresseRadio_IndicatifRadio()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='IndicatifRadio'"
	 * @generated
	 */
	String getIndicatifRadio();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAdresseRadio#getIndicatifRadio <em>Indicatif Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicatif Radio</em>' attribute.
	 * @see #getIndicatifRadio()
	 * @generated
	 */
	void setIndicatifRadio(String value);

	/**
	 * Returns the value of the '<em><b>APour Frequence Frequence</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeFrequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Frequence Frequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Frequence Frequence</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAdresseRadio_APourFrequenceFrequence()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Frequence'"
	 *        extendedMetaData="kind='element' name='APourFrequence_Frequence'"
	 * @generated
	 */
	EList<TypeFrequence> getAPourFrequenceFrequence();

} // TypeAdresseRadio
