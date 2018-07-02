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
 * A representation of the model object '<em><b>Type Objectif Majeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjectifMajeur#getDescriptionGenerale <em>Description Generale</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifMajeur#getDescriptionMoyens <em>Description Moyens</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifMajeur#getAttitudePrevisible <em>Attitude Previsible</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifMajeur#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifMajeur#getInformationsComplementaires <em>Informations Complementaires</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjectifMajeur()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ObjectifMajeur' kind='elementOnly'"
 * @generated
 */
public interface TypeObjectifMajeur extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Generale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Generale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Generale</em>' attribute.
	 * @see #setDescriptionGenerale(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifMajeur_DescriptionGenerale()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionGenerale'"
	 * @generated
	 */
	String getDescriptionGenerale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifMajeur#getDescriptionGenerale <em>Description Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Generale</em>' attribute.
	 * @see #getDescriptionGenerale()
	 * @generated
	 */
	void setDescriptionGenerale(String value);

	/**
	 * Returns the value of the '<em><b>Description Moyens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Moyens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Moyens</em>' attribute.
	 * @see #setDescriptionMoyens(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifMajeur_DescriptionMoyens()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionMoyens'"
	 * @generated
	 */
	String getDescriptionMoyens();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifMajeur#getDescriptionMoyens <em>Description Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Moyens</em>' attribute.
	 * @see #getDescriptionMoyens()
	 * @generated
	 */
	void setDescriptionMoyens(String value);

	/**
	 * Returns the value of the '<em><b>Attitude Previsible</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMobiliteAttitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude Previsible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude Previsible</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobiliteAttitude
	 * @see #isSetAttitudePrevisible()
	 * @see #unsetAttitudePrevisible()
	 * @see #setAttitudePrevisible(TypeDictionaryDicoMobiliteAttitude)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifMajeur_AttitudePrevisible()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AttitudePrevisible'"
	 * @generated
	 */
	TypeDictionaryDicoMobiliteAttitude getAttitudePrevisible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifMajeur#getAttitudePrevisible <em>Attitude Previsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude Previsible</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobiliteAttitude
	 * @see #isSetAttitudePrevisible()
	 * @see #unsetAttitudePrevisible()
	 * @see #getAttitudePrevisible()
	 * @generated
	 */
	void setAttitudePrevisible(TypeDictionaryDicoMobiliteAttitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifMajeur#getAttitudePrevisible <em>Attitude Previsible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttitudePrevisible()
	 * @see #getAttitudePrevisible()
	 * @see #setAttitudePrevisible(TypeDictionaryDicoMobiliteAttitude)
	 * @generated
	 */
	void unsetAttitudePrevisible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifMajeur#getAttitudePrevisible <em>Attitude Previsible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attitude Previsible</em>' attribute is set.
	 * @see #unsetAttitudePrevisible()
	 * @see #getAttitudePrevisible()
	 * @see #setAttitudePrevisible(TypeDictionaryDicoMobiliteAttitude)
	 * @generated
	 */
	boolean isSetAttitudePrevisible();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeObjectifMajeurCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifMajeurCategorie
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoTypeObjectifMajeurCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifMajeur_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoTypeObjectifMajeurCategorie getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifMajeur#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifMajeurCategorie
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoTypeObjectifMajeurCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifMajeur#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoTypeObjectifMajeurCategorie)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifMajeur#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoTypeObjectifMajeurCategorie)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Informations Complementaires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informations Complementaires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informations Complementaires</em>' attribute.
	 * @see #setInformationsComplementaires(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifMajeur_InformationsComplementaires()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='InformationsComplementaires'"
	 * @generated
	 */
	String getInformationsComplementaires();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifMajeur#getInformationsComplementaires <em>Informations Complementaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informations Complementaires</em>' attribute.
	 * @see #getInformationsComplementaires()
	 * @generated
	 */
	void setInformationsComplementaires(String value);

} // TypeObjectifMajeur
