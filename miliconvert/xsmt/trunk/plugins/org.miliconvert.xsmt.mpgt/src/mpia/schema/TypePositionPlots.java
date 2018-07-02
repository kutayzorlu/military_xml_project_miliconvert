/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Position Plots</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePositionPlots#getNumeroPosition <em>Numero Position</em>}</li>
 *   <li>{@link mpia.schema.TypePositionPlots#getTypePosition <em>Type Position</em>}</li>
 *   <li>{@link mpia.schema.TypePositionPlots#getDirectionPrivilegieeTirHorizontal <em>Direction Privilegiee Tir Horizontal</em>}</li>
 *   <li>{@link mpia.schema.TypePositionPlots#getDirectionPrivilegieeTirVertical <em>Direction Privilegiee Tir Vertical</em>}</li>
 *   <li>{@link mpia.schema.TypePositionPlots#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypePositionPlots#getACommePositionLocalisationGeometrique2D <em>AComme Position Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePositionPlots()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PositionPlots' kind='elementOnly'"
 * @generated
 */
public interface TypePositionPlots extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Position</em>' attribute.
	 * @see #isSetNumeroPosition()
	 * @see #unsetNumeroPosition()
	 * @see #setNumeroPosition(long)
	 * @see mpia.schema.SchemaPackage#getTypePositionPlots_NumeroPosition()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='NumeroPosition'"
	 * @generated
	 */
	long getNumeroPosition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionPlots#getNumeroPosition <em>Numero Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Position</em>' attribute.
	 * @see #isSetNumeroPosition()
	 * @see #unsetNumeroPosition()
	 * @see #getNumeroPosition()
	 * @generated
	 */
	void setNumeroPosition(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePositionPlots#getNumeroPosition <em>Numero Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroPosition()
	 * @see #getNumeroPosition()
	 * @see #setNumeroPosition(long)
	 * @generated
	 */
	void unsetNumeroPosition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePositionPlots#getNumeroPosition <em>Numero Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Position</em>' attribute is set.
	 * @see #unsetNumeroPosition()
	 * @see #getNumeroPosition()
	 * @see #setNumeroPosition(long)
	 * @generated
	 */
	boolean isSetNumeroPosition();

	/**
	 * Returns the value of the '<em><b>Type Position</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPositionPlotsTypePosition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Position</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPositionPlotsTypePosition
	 * @see #isSetTypePosition()
	 * @see #unsetTypePosition()
	 * @see #setTypePosition(TypeDictionaryDicoPositionPlotsTypePosition)
	 * @see mpia.schema.SchemaPackage#getTypePositionPlots_TypePosition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypePosition'"
	 * @generated
	 */
	TypeDictionaryDicoPositionPlotsTypePosition getTypePosition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionPlots#getTypePosition <em>Type Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Position</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPositionPlotsTypePosition
	 * @see #isSetTypePosition()
	 * @see #unsetTypePosition()
	 * @see #getTypePosition()
	 * @generated
	 */
	void setTypePosition(TypeDictionaryDicoPositionPlotsTypePosition value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePositionPlots#getTypePosition <em>Type Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePosition()
	 * @see #getTypePosition()
	 * @see #setTypePosition(TypeDictionaryDicoPositionPlotsTypePosition)
	 * @generated
	 */
	void unsetTypePosition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePositionPlots#getTypePosition <em>Type Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Position</em>' attribute is set.
	 * @see #unsetTypePosition()
	 * @see #getTypePosition()
	 * @see #setTypePosition(TypeDictionaryDicoPositionPlotsTypePosition)
	 * @generated
	 */
	boolean isSetTypePosition();

	/**
	 * Returns the value of the '<em><b>Direction Privilegiee Tir Horizontal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Privilegiee Tir Horizontal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Privilegiee Tir Horizontal</em>' containment reference.
	 * @see #setDirectionPrivilegieeTirHorizontal(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypePositionPlots_DirectionPrivilegieeTirHorizontal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionPrivilegieeTirHorizontal'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionPrivilegieeTirHorizontal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionPlots#getDirectionPrivilegieeTirHorizontal <em>Direction Privilegiee Tir Horizontal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Privilegiee Tir Horizontal</em>' containment reference.
	 * @see #getDirectionPrivilegieeTirHorizontal()
	 * @generated
	 */
	void setDirectionPrivilegieeTirHorizontal(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Direction Privilegiee Tir Vertical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Privilegiee Tir Vertical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Privilegiee Tir Vertical</em>' containment reference.
	 * @see #setDirectionPrivilegieeTirVertical(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypePositionPlots_DirectionPrivilegieeTirVertical()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionPrivilegieeTirVertical'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionPrivilegieeTirVertical();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionPlots#getDirectionPrivilegieeTirVertical <em>Direction Privilegiee Tir Vertical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Privilegiee Tir Vertical</em>' containment reference.
	 * @see #getDirectionPrivilegieeTirVertical()
	 * @generated
	 */
	void setDirectionPrivilegieeTirVertical(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypePositionPlots_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionPlots#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>AComme Position Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Position Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Position Localisation Geometrique2 D</em>' containment reference.
	 * @see #setACommePositionLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypePositionPlots_ACommePositionLocalisationGeometrique2D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='ACommePosition_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getACommePositionLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePositionPlots#getACommePositionLocalisationGeometrique2D <em>AComme Position Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Position Localisation Geometrique2 D</em>' containment reference.
	 * @see #getACommePositionLocalisationGeometrique2D()
	 * @generated
	 */
	void setACommePositionLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

} // TypePositionPlots
