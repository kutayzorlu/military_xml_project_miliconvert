/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mesure Nuage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMesureNuage#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureNuage#getSection <em>Section</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureNuage#getAngle <em>Angle</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureNuage#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMesureNuage#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMesureNuage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MesureNuage' kind='elementOnly'"
 * @generated
 */
public interface TypeMesureNuage extends EObject {
	/**
	 * Returns the value of the '<em><b>Hauteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur</em>' containment reference.
	 * @see #setHauteur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeMesureNuage_Hauteur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hauteur'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureNuage#getHauteur <em>Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' containment reference.
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMesureNuageSection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMesureNuageSection
	 * @see #isSetSection()
	 * @see #unsetSection()
	 * @see #setSection(TypeDictionaryDicoMesureNuageSection)
	 * @see mpia.schema.SchemaPackage#getTypeMesureNuage_Section()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Section'"
	 * @generated
	 */
	TypeDictionaryDicoMesureNuageSection getSection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureNuage#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMesureNuageSection
	 * @see #isSetSection()
	 * @see #unsetSection()
	 * @see #getSection()
	 * @generated
	 */
	void setSection(TypeDictionaryDicoMesureNuageSection value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMesureNuage#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSection()
	 * @see #getSection()
	 * @see #setSection(TypeDictionaryDicoMesureNuageSection)
	 * @generated
	 */
	void unsetSection();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMesureNuage#getSection <em>Section</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Section</em>' attribute is set.
	 * @see #unsetSection()
	 * @see #getSection()
	 * @see #setSection(TypeDictionaryDicoMesureNuageSection)
	 * @generated
	 */
	boolean isSetSection();

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeMesureNuage_Angle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Angle'"
	 * @generated
	 */
	TypeDataTypeAngle getAngle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureNuage#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(TypeDataTypeAngle value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMesureNuage_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureNuage#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMesureNuage_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMesureNuage#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeMesureNuage
