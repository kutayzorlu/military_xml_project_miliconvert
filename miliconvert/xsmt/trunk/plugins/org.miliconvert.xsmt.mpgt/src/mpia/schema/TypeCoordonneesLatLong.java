/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLatitude;
import mpia.meta.TypeDataTypeLongitude;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Coordonnees Lat Long</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCoordonneesLatLong#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link mpia.schema.TypeCoordonneesLatLong#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link mpia.schema.TypeCoordonneesLatLong#getValeurDistanceVerticale <em>Valeur Distance Verticale</em>}</li>
 *   <li>{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionLatitude <em>Precision Latitude</em>}</li>
 *   <li>{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionLongitude <em>Precision Longitude</em>}</li>
 *   <li>{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionDistanceVerticale <em>Precision Distance Verticale</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCoordonneesLatLong()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CoordonneesLatLong' kind='elementOnly'"
 * @generated
 */
public interface TypeCoordonneesLatLong extends EObject {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(TypeDataTypeLatitude)
	 * @see mpia.schema.SchemaPackage#getTypeCoordonneesLatLong_Latitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Latitude'"
	 * @generated
	 */
	TypeDataTypeLatitude getLatitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(TypeDataTypeLatitude value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(TypeDataTypeLongitude)
	 * @see mpia.schema.SchemaPackage#getTypeCoordonneesLatLong_Longitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Longitude'"
	 * @generated
	 */
	TypeDataTypeLongitude getLongitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(TypeDataTypeLongitude value);

	/**
	 * Returns the value of the '<em><b>Valeur Distance Verticale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur Distance Verticale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur Distance Verticale</em>' attribute.
	 * @see #isSetValeurDistanceVerticale()
	 * @see #unsetValeurDistanceVerticale()
	 * @see #setValeurDistanceVerticale(double)
	 * @see mpia.schema.SchemaPackage#getTypeCoordonneesLatLong_ValeurDistanceVerticale()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='ValeurDistanceVerticale'"
	 * @generated
	 */
	double getValeurDistanceVerticale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getValeurDistanceVerticale <em>Valeur Distance Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur Distance Verticale</em>' attribute.
	 * @see #isSetValeurDistanceVerticale()
	 * @see #unsetValeurDistanceVerticale()
	 * @see #getValeurDistanceVerticale()
	 * @generated
	 */
	void setValeurDistanceVerticale(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getValeurDistanceVerticale <em>Valeur Distance Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeurDistanceVerticale()
	 * @see #getValeurDistanceVerticale()
	 * @see #setValeurDistanceVerticale(double)
	 * @generated
	 */
	void unsetValeurDistanceVerticale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getValeurDistanceVerticale <em>Valeur Distance Verticale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur Distance Verticale</em>' attribute is set.
	 * @see #unsetValeurDistanceVerticale()
	 * @see #getValeurDistanceVerticale()
	 * @see #setValeurDistanceVerticale(double)
	 * @generated
	 */
	boolean isSetValeurDistanceVerticale();

	/**
	 * Returns the value of the '<em><b>Precision Latitude</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrecisionAngle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Latitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionAngle
	 * @see #isSetPrecisionLatitude()
	 * @see #unsetPrecisionLatitude()
	 * @see #setPrecisionLatitude(TypeDictionaryDicoPrecisionAngle)
	 * @see mpia.schema.SchemaPackage#getTypeCoordonneesLatLong_PrecisionLatitude()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrecisionLatitude'"
	 * @generated
	 */
	TypeDictionaryDicoPrecisionAngle getPrecisionLatitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionLatitude <em>Precision Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Latitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionAngle
	 * @see #isSetPrecisionLatitude()
	 * @see #unsetPrecisionLatitude()
	 * @see #getPrecisionLatitude()
	 * @generated
	 */
	void setPrecisionLatitude(TypeDictionaryDicoPrecisionAngle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionLatitude <em>Precision Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionLatitude()
	 * @see #getPrecisionLatitude()
	 * @see #setPrecisionLatitude(TypeDictionaryDicoPrecisionAngle)
	 * @generated
	 */
	void unsetPrecisionLatitude();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionLatitude <em>Precision Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Latitude</em>' attribute is set.
	 * @see #unsetPrecisionLatitude()
	 * @see #getPrecisionLatitude()
	 * @see #setPrecisionLatitude(TypeDictionaryDicoPrecisionAngle)
	 * @generated
	 */
	boolean isSetPrecisionLatitude();

	/**
	 * Returns the value of the '<em><b>Precision Longitude</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrecisionAngle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Longitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionAngle
	 * @see #isSetPrecisionLongitude()
	 * @see #unsetPrecisionLongitude()
	 * @see #setPrecisionLongitude(TypeDictionaryDicoPrecisionAngle)
	 * @see mpia.schema.SchemaPackage#getTypeCoordonneesLatLong_PrecisionLongitude()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrecisionLongitude'"
	 * @generated
	 */
	TypeDictionaryDicoPrecisionAngle getPrecisionLongitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionLongitude <em>Precision Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Longitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionAngle
	 * @see #isSetPrecisionLongitude()
	 * @see #unsetPrecisionLongitude()
	 * @see #getPrecisionLongitude()
	 * @generated
	 */
	void setPrecisionLongitude(TypeDictionaryDicoPrecisionAngle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionLongitude <em>Precision Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionLongitude()
	 * @see #getPrecisionLongitude()
	 * @see #setPrecisionLongitude(TypeDictionaryDicoPrecisionAngle)
	 * @generated
	 */
	void unsetPrecisionLongitude();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionLongitude <em>Precision Longitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Longitude</em>' attribute is set.
	 * @see #unsetPrecisionLongitude()
	 * @see #getPrecisionLongitude()
	 * @see #setPrecisionLongitude(TypeDictionaryDicoPrecisionAngle)
	 * @generated
	 */
	boolean isSetPrecisionLongitude();

	/**
	 * Returns the value of the '<em><b>Precision Distance Verticale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrecisionDistance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Distance Verticale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Distance Verticale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionDistance
	 * @see #isSetPrecisionDistanceVerticale()
	 * @see #unsetPrecisionDistanceVerticale()
	 * @see #setPrecisionDistanceVerticale(TypeDictionaryDicoPrecisionDistance)
	 * @see mpia.schema.SchemaPackage#getTypeCoordonneesLatLong_PrecisionDistanceVerticale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrecisionDistanceVerticale'"
	 * @generated
	 */
	TypeDictionaryDicoPrecisionDistance getPrecisionDistanceVerticale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionDistanceVerticale <em>Precision Distance Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Distance Verticale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrecisionDistance
	 * @see #isSetPrecisionDistanceVerticale()
	 * @see #unsetPrecisionDistanceVerticale()
	 * @see #getPrecisionDistanceVerticale()
	 * @generated
	 */
	void setPrecisionDistanceVerticale(TypeDictionaryDicoPrecisionDistance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionDistanceVerticale <em>Precision Distance Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecisionDistanceVerticale()
	 * @see #getPrecisionDistanceVerticale()
	 * @see #setPrecisionDistanceVerticale(TypeDictionaryDicoPrecisionDistance)
	 * @generated
	 */
	void unsetPrecisionDistanceVerticale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCoordonneesLatLong#getPrecisionDistanceVerticale <em>Precision Distance Verticale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precision Distance Verticale</em>' attribute is set.
	 * @see #unsetPrecisionDistanceVerticale()
	 * @see #getPrecisionDistanceVerticale()
	 * @see #setPrecisionDistanceVerticale(TypeDictionaryDicoPrecisionDistance)
	 * @generated
	 */
	boolean isSetPrecisionDistanceVerticale();

} // TypeCoordonneesLatLong
