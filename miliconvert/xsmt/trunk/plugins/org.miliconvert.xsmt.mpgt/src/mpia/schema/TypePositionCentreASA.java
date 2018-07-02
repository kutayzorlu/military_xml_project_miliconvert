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
 * A representation of the model object '<em><b>Type Position Centre ASA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePositionCentreASA#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.TypePositionCentreASA#getTypePosition <em>Type Position</em>}</li>
 *   <li>{@link mpia.schema.TypePositionCentreASA#getAPourZonePositionnementLocalisationGeometrique2D <em>APour Zone Positionnement Localisation Geometrique2 D</em>}</li>
 *   <li>{@link mpia.schema.TypePositionCentreASA#getAPourPointPositionnementLocalisationGeometrique2D <em>APour Point Positionnement Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePositionCentreASA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PositionCentreASA' kind='elementOnly'"
 * @generated
 */
public interface TypePositionCentreASA extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Bapteme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Bapteme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #setNomBapteme(String)
	 * @see mpia.schema.SchemaPackage#getTypePositionCentreASA_NomBapteme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='NomBapteme'"
	 * @generated
	 */
	String getNomBapteme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionCentreASA#getNomBapteme <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #getNomBapteme()
	 * @generated
	 */
	void setNomBapteme(String value);

	/**
	 * Returns the value of the '<em><b>Type Position</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPositionCentreASATypePosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Position</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPositionCentreASATypePosition
	 * @see #isSetTypePosition()
	 * @see #unsetTypePosition()
	 * @see #setTypePosition(TypeDictionaryDicoPositionCentreASATypePosition)
	 * @see mpia.schema.SchemaPackage#getTypePositionCentreASA_TypePosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypePosition'"
	 * @generated
	 */
	TypeDictionaryDicoPositionCentreASATypePosition getTypePosition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionCentreASA#getTypePosition <em>Type Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Position</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPositionCentreASATypePosition
	 * @see #isSetTypePosition()
	 * @see #unsetTypePosition()
	 * @see #getTypePosition()
	 * @generated
	 */
	void setTypePosition(TypeDictionaryDicoPositionCentreASATypePosition value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePositionCentreASA#getTypePosition <em>Type Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePosition()
	 * @see #getTypePosition()
	 * @see #setTypePosition(TypeDictionaryDicoPositionCentreASATypePosition)
	 * @generated
	 */
	void unsetTypePosition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePositionCentreASA#getTypePosition <em>Type Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Position</em>' attribute is set.
	 * @see #unsetTypePosition()
	 * @see #getTypePosition()
	 * @see #setTypePosition(TypeDictionaryDicoPositionCentreASATypePosition)
	 * @generated
	 */
	boolean isSetTypePosition();

	/**
	 * Returns the value of the '<em><b>APour Zone Positionnement Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Positionnement Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Positionnement Localisation Geometrique2 D</em>' containment reference.
	 * @see #setAPourZonePositionnementLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypePositionCentreASA_APourZonePositionnementLocalisationGeometrique2D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='APourZonePositionnement_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getAPourZonePositionnementLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionCentreASA#getAPourZonePositionnementLocalisationGeometrique2D <em>APour Zone Positionnement Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Positionnement Localisation Geometrique2 D</em>' containment reference.
	 * @see #getAPourZonePositionnementLocalisationGeometrique2D()
	 * @generated
	 */
	void setAPourZonePositionnementLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

	/**
	 * Returns the value of the '<em><b>APour Point Positionnement Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Point Positionnement Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Point Positionnement Localisation Geometrique2 D</em>' containment reference.
	 * @see #setAPourPointPositionnementLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypePositionCentreASA_APourPointPositionnementLocalisationGeometrique2D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='APourPointPositionnement_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getAPourPointPositionnementLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionCentreASA#getAPourPointPositionnementLocalisationGeometrique2D <em>APour Point Positionnement Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Point Positionnement Localisation Geometrique2 D</em>' containment reference.
	 * @see #getAPourPointPositionnementLocalisationGeometrique2D()
	 * @generated
	 */
	void setAPourPointPositionnementLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

} // TypePositionCentreASA
