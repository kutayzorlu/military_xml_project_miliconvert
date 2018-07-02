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
 * A representation of the model object '<em><b>Type Organisme Controle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeOrganismeControle#getTypeOrganismeAir <em>Type Organisme Air</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganismeControle#getAutreTypeOrganismeAir <em>Autre Type Organisme Air</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganismeControle#getComplementIdentification <em>Complement Identification</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganismeControle#getModeFonctionnement <em>Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganismeControle#getAutreModeFonctionnement <em>Autre Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeOrganismeControle#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeOrganismeControle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_OrganismeControle' kind='elementOnly'"
 * @generated
 */
public interface TypeOrganismeControle extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Organisme Air</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoOrganismeControleTypeOrganismeAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Organisme Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Organisme Air</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoOrganismeControleTypeOrganismeAir
	 * @see #isSetTypeOrganismeAir()
	 * @see #unsetTypeOrganismeAir()
	 * @see #setTypeOrganismeAir(TypeDictionaryDicoOrganismeControleTypeOrganismeAir)
	 * @see mpia.schema.SchemaPackage#getTypeOrganismeControle_TypeOrganismeAir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeOrganismeAir'"
	 * @generated
	 */
	TypeDictionaryDicoOrganismeControleTypeOrganismeAir getTypeOrganismeAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganismeControle#getTypeOrganismeAir <em>Type Organisme Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Organisme Air</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoOrganismeControleTypeOrganismeAir
	 * @see #isSetTypeOrganismeAir()
	 * @see #unsetTypeOrganismeAir()
	 * @see #getTypeOrganismeAir()
	 * @generated
	 */
	void setTypeOrganismeAir(TypeDictionaryDicoOrganismeControleTypeOrganismeAir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeOrganismeControle#getTypeOrganismeAir <em>Type Organisme Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeOrganismeAir()
	 * @see #getTypeOrganismeAir()
	 * @see #setTypeOrganismeAir(TypeDictionaryDicoOrganismeControleTypeOrganismeAir)
	 * @generated
	 */
	void unsetTypeOrganismeAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOrganismeControle#getTypeOrganismeAir <em>Type Organisme Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Organisme Air</em>' attribute is set.
	 * @see #unsetTypeOrganismeAir()
	 * @see #getTypeOrganismeAir()
	 * @see #setTypeOrganismeAir(TypeDictionaryDicoOrganismeControleTypeOrganismeAir)
	 * @generated
	 */
	boolean isSetTypeOrganismeAir();

	/**
	 * Returns the value of the '<em><b>Autre Type Organisme Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type Organisme Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type Organisme Air</em>' attribute.
	 * @see #setAutreTypeOrganismeAir(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganismeControle_AutreTypeOrganismeAir()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreTypeOrganismeAir'"
	 * @generated
	 */
	String getAutreTypeOrganismeAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganismeControle#getAutreTypeOrganismeAir <em>Autre Type Organisme Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type Organisme Air</em>' attribute.
	 * @see #getAutreTypeOrganismeAir()
	 * @generated
	 */
	void setAutreTypeOrganismeAir(String value);

	/**
	 * Returns the value of the '<em><b>Complement Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement Identification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement Identification</em>' attribute.
	 * @see #setComplementIdentification(String)
	 * @see mpia.schema.SchemaPackage#getTypeOrganismeControle_ComplementIdentification()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='ComplementIdentification'"
	 * @generated
	 */
	String getComplementIdentification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganismeControle#getComplementIdentification <em>Complement Identification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement Identification</em>' attribute.
	 * @see #getComplementIdentification()
	 * @generated
	 */
	void setComplementIdentification(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeOrganismeControle_ModeFonctionnement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ModeFonctionnement'"
	 * @generated
	 */
	TypeDictionaryDicoModeFonctionnement getModeFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganismeControle#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeOrganismeControle#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeFonctionnement()
	 * @see #getModeFonctionnement()
	 * @see #setModeFonctionnement(TypeDictionaryDicoModeFonctionnement)
	 * @generated
	 */
	void unsetModeFonctionnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOrganismeControle#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeOrganismeControle_AutreModeFonctionnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreModeFonctionnement'"
	 * @generated
	 */
	String getAutreModeFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganismeControle#getAutreModeFonctionnement <em>Autre Mode Fonctionnement</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeOrganismeControle_ConsignesParticulieres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConsignesParticulieres'"
	 * @generated
	 */
	String getConsignesParticulieres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOrganismeControle#getConsignesParticulieres <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignes Particulieres</em>' attribute.
	 * @see #getConsignesParticulieres()
	 * @generated
	 */
	void setConsignesParticulieres(String value);

} // TypeOrganismeControle
