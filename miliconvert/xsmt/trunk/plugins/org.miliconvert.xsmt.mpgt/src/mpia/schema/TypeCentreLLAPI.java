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
 * A representation of the model object '<em><b>Type Centre LLAPI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCentreLLAPI#getModeFonctionnement <em>Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreLLAPI#getAutreModeFonctionnement <em>Autre Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreLLAPI#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCentreLLAPI()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CentreLLAPI' kind='elementOnly'"
 * @generated
 */
public interface TypeCentreLLAPI extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode Fonctionnement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModeFonctionnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Fonctionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Fonctionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeFonctionnement
	 * @see #isSetModeFonctionnement()
	 * @see #unsetModeFonctionnement()
	 * @see #setModeFonctionnement(TypeDictionaryDicoModeFonctionnement)
	 * @see mpia.schema.SchemaPackage#getTypeCentreLLAPI_ModeFonctionnement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ModeFonctionnement'"
	 * @generated
	 */
	TypeDictionaryDicoModeFonctionnement getModeFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreLLAPI#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Fonctionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeFonctionnement
	 * @see #isSetModeFonctionnement()
	 * @see #unsetModeFonctionnement()
	 * @see #getModeFonctionnement()
	 * @generated
	 */
	void setModeFonctionnement(TypeDictionaryDicoModeFonctionnement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCentreLLAPI#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeFonctionnement()
	 * @see #getModeFonctionnement()
	 * @see #setModeFonctionnement(TypeDictionaryDicoModeFonctionnement)
	 * @generated
	 */
	void unsetModeFonctionnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCentreLLAPI#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Fonctionnement</em>' attribute is set.
	 * @see #unsetModeFonctionnement()
	 * @see #getModeFonctionnement()
	 * @see #setModeFonctionnement(TypeDictionaryDicoModeFonctionnement)
	 * @generated
	 */
	boolean isSetModeFonctionnement();

	/**
	 * Returns the value of the '<em><b>Autre Mode Fonctionnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Mode Fonctionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Mode Fonctionnement</em>' attribute.
	 * @see #setAutreModeFonctionnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeCentreLLAPI_AutreModeFonctionnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreModeFonctionnement'"
	 * @generated
	 */
	String getAutreModeFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreLLAPI#getAutreModeFonctionnement <em>Autre Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Mode Fonctionnement</em>' attribute.
	 * @see #getAutreModeFonctionnement()
	 * @generated
	 */
	void setAutreModeFonctionnement(String value);

	/**
	 * Returns the value of the '<em><b>Consignes Particulieres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consignes Particulieres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consignes Particulieres</em>' attribute.
	 * @see #setConsignesParticulieres(String)
	 * @see mpia.schema.SchemaPackage#getTypeCentreLLAPI_ConsignesParticulieres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConsignesParticulieres'"
	 * @generated
	 */
	String getConsignesParticulieres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreLLAPI#getConsignesParticulieres <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignes Particulieres</em>' attribute.
	 * @see #getConsignesParticulieres()
	 * @generated
	 */
	void setConsignesParticulieres(String value);

} // TypeCentreLLAPI
