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
 * A representation of the model object '<em><b>Type Centre NC23</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCentreNC23#isResponsabiliteLiaisonAvecCentreAir <em>Responsabilite Liaison Avec Centre Air</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreNC23#getModeFonctionnement <em>Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreNC23#getAutreModeFonctionnement <em>Autre Mode Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeCentreNC23#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCentreNC23()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CentreNC23' kind='elementOnly'"
 * @generated
 */
public interface TypeCentreNC23 extends EObject {
	/**
	 * Returns the value of the '<em><b>Responsabilite Liaison Avec Centre Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsabilite Liaison Avec Centre Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsabilite Liaison Avec Centre Air</em>' attribute.
	 * @see #isSetResponsabiliteLiaisonAvecCentreAir()
	 * @see #unsetResponsabiliteLiaisonAvecCentreAir()
	 * @see #setResponsabiliteLiaisonAvecCentreAir(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCentreNC23_ResponsabiliteLiaisonAvecCentreAir()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='ResponsabiliteLiaisonAvecCentreAir'"
	 * @generated
	 */
	boolean isResponsabiliteLiaisonAvecCentreAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreNC23#isResponsabiliteLiaisonAvecCentreAir <em>Responsabilite Liaison Avec Centre Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsabilite Liaison Avec Centre Air</em>' attribute.
	 * @see #isSetResponsabiliteLiaisonAvecCentreAir()
	 * @see #unsetResponsabiliteLiaisonAvecCentreAir()
	 * @see #isResponsabiliteLiaisonAvecCentreAir()
	 * @generated
	 */
	void setResponsabiliteLiaisonAvecCentreAir(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCentreNC23#isResponsabiliteLiaisonAvecCentreAir <em>Responsabilite Liaison Avec Centre Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResponsabiliteLiaisonAvecCentreAir()
	 * @see #isResponsabiliteLiaisonAvecCentreAir()
	 * @see #setResponsabiliteLiaisonAvecCentreAir(boolean)
	 * @generated
	 */
	void unsetResponsabiliteLiaisonAvecCentreAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCentreNC23#isResponsabiliteLiaisonAvecCentreAir <em>Responsabilite Liaison Avec Centre Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Responsabilite Liaison Avec Centre Air</em>' attribute is set.
	 * @see #unsetResponsabiliteLiaisonAvecCentreAir()
	 * @see #isResponsabiliteLiaisonAvecCentreAir()
	 * @see #setResponsabiliteLiaisonAvecCentreAir(boolean)
	 * @generated
	 */
	boolean isSetResponsabiliteLiaisonAvecCentreAir();

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
	 * @see mpia.schema.SchemaPackage#getTypeCentreNC23_ModeFonctionnement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ModeFonctionnement'"
	 * @generated
	 */
	TypeDictionaryDicoModeFonctionnement getModeFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreNC23#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeCentreNC23#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeFonctionnement()
	 * @see #getModeFonctionnement()
	 * @see #setModeFonctionnement(TypeDictionaryDicoModeFonctionnement)
	 * @generated
	 */
	void unsetModeFonctionnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCentreNC23#getModeFonctionnement <em>Mode Fonctionnement</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeCentreNC23_AutreModeFonctionnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreModeFonctionnement'"
	 * @generated
	 */
	String getAutreModeFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreNC23#getAutreModeFonctionnement <em>Autre Mode Fonctionnement</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCentreNC23_ConsignesParticulieres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConsignesParticulieres'"
	 * @generated
	 */
	String getConsignesParticulieres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCentreNC23#getConsignesParticulieres <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignes Particulieres</em>' attribute.
	 * @see #getConsignesParticulieres()
	 * @generated
	 */
	void setConsignesParticulieres(String value);

} // TypeCentreNC23
