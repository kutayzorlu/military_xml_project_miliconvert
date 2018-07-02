/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypePression;
import mpia.meta.TypeDataTypeTemperature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Atmosphere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAtmosphere#getHumidite <em>Humidite</em>}</li>
 *   <li>{@link mpia.schema.TypeAtmosphere#getPression <em>Pression</em>}</li>
 *   <li>{@link mpia.schema.TypeAtmosphere#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link mpia.schema.TypeAtmosphere#getGradientTemperature <em>Gradient Temperature</em>}</li>
 *   <li>{@link mpia.schema.TypeAtmosphere#getGradientDetailleTemperature <em>Gradient Detaille Temperature</em>}</li>
 *   <li>{@link mpia.schema.TypeAtmosphere#getCoucheInversion <em>Couche Inversion</em>}</li>
 *   <li>{@link mpia.schema.TypeAtmosphere#getSystemePression <em>Systeme Pression</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAtmosphere()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Atmosphere' kind='elementOnly'"
 * @generated
 */
public interface TypeAtmosphere extends EObject {
	/**
	 * Returns the value of the '<em><b>Humidite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Humidite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Humidite</em>' attribute.
	 * @see #isSetHumidite()
	 * @see #unsetHumidite()
	 * @see #setHumidite(double)
	 * @see mpia.schema.SchemaPackage#getTypeAtmosphere_Humidite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='Humidite'"
	 * @generated
	 */
	double getHumidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAtmosphere#getHumidite <em>Humidite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Humidite</em>' attribute.
	 * @see #isSetHumidite()
	 * @see #unsetHumidite()
	 * @see #getHumidite()
	 * @generated
	 */
	void setHumidite(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAtmosphere#getHumidite <em>Humidite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHumidite()
	 * @see #getHumidite()
	 * @see #setHumidite(double)
	 * @generated
	 */
	void unsetHumidite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAtmosphere#getHumidite <em>Humidite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Humidite</em>' attribute is set.
	 * @see #unsetHumidite()
	 * @see #getHumidite()
	 * @see #setHumidite(double)
	 * @generated
	 */
	boolean isSetHumidite();

	/**
	 * Returns the value of the '<em><b>Pression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pression</em>' containment reference.
	 * @see #setPression(TypeDataTypePression)
	 * @see mpia.schema.SchemaPackage#getTypeAtmosphere_Pression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pression'"
	 * @generated
	 */
	TypeDataTypePression getPression();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAtmosphere#getPression <em>Pression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pression</em>' containment reference.
	 * @see #getPression()
	 * @generated
	 */
	void setPression(TypeDataTypePression value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' containment reference.
	 * @see #setTemperature(TypeDataTypeTemperature)
	 * @see mpia.schema.SchemaPackage#getTypeAtmosphere_Temperature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Temperature'"
	 * @generated
	 */
	TypeDataTypeTemperature getTemperature();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAtmosphere#getTemperature <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' containment reference.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(TypeDataTypeTemperature value);

	/**
	 * Returns the value of the '<em><b>Gradient Temperature</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAtmosphereGradientTemperature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Temperature</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAtmosphereGradientTemperature
	 * @see #isSetGradientTemperature()
	 * @see #unsetGradientTemperature()
	 * @see #setGradientTemperature(TypeDictionaryDicoAtmosphereGradientTemperature)
	 * @see mpia.schema.SchemaPackage#getTypeAtmosphere_GradientTemperature()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='GradientTemperature'"
	 * @generated
	 */
	TypeDictionaryDicoAtmosphereGradientTemperature getGradientTemperature();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAtmosphere#getGradientTemperature <em>Gradient Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Temperature</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAtmosphereGradientTemperature
	 * @see #isSetGradientTemperature()
	 * @see #unsetGradientTemperature()
	 * @see #getGradientTemperature()
	 * @generated
	 */
	void setGradientTemperature(TypeDictionaryDicoAtmosphereGradientTemperature value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAtmosphere#getGradientTemperature <em>Gradient Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGradientTemperature()
	 * @see #getGradientTemperature()
	 * @see #setGradientTemperature(TypeDictionaryDicoAtmosphereGradientTemperature)
	 * @generated
	 */
	void unsetGradientTemperature();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAtmosphere#getGradientTemperature <em>Gradient Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gradient Temperature</em>' attribute is set.
	 * @see #unsetGradientTemperature()
	 * @see #getGradientTemperature()
	 * @see #setGradientTemperature(TypeDictionaryDicoAtmosphereGradientTemperature)
	 * @generated
	 */
	boolean isSetGradientTemperature();

	/**
	 * Returns the value of the '<em><b>Gradient Detaille Temperature</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAtmosphereGradientDetailleTemperature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gradient Detaille Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gradient Detaille Temperature</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAtmosphereGradientDetailleTemperature
	 * @see #isSetGradientDetailleTemperature()
	 * @see #unsetGradientDetailleTemperature()
	 * @see #setGradientDetailleTemperature(TypeDictionaryDicoAtmosphereGradientDetailleTemperature)
	 * @see mpia.schema.SchemaPackage#getTypeAtmosphere_GradientDetailleTemperature()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='GradientDetailleTemperature'"
	 * @generated
	 */
	TypeDictionaryDicoAtmosphereGradientDetailleTemperature getGradientDetailleTemperature();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAtmosphere#getGradientDetailleTemperature <em>Gradient Detaille Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gradient Detaille Temperature</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAtmosphereGradientDetailleTemperature
	 * @see #isSetGradientDetailleTemperature()
	 * @see #unsetGradientDetailleTemperature()
	 * @see #getGradientDetailleTemperature()
	 * @generated
	 */
	void setGradientDetailleTemperature(TypeDictionaryDicoAtmosphereGradientDetailleTemperature value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAtmosphere#getGradientDetailleTemperature <em>Gradient Detaille Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGradientDetailleTemperature()
	 * @see #getGradientDetailleTemperature()
	 * @see #setGradientDetailleTemperature(TypeDictionaryDicoAtmosphereGradientDetailleTemperature)
	 * @generated
	 */
	void unsetGradientDetailleTemperature();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAtmosphere#getGradientDetailleTemperature <em>Gradient Detaille Temperature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gradient Detaille Temperature</em>' attribute is set.
	 * @see #unsetGradientDetailleTemperature()
	 * @see #getGradientDetailleTemperature()
	 * @see #setGradientDetailleTemperature(TypeDictionaryDicoAtmosphereGradientDetailleTemperature)
	 * @generated
	 */
	boolean isSetGradientDetailleTemperature();

	/**
	 * Returns the value of the '<em><b>Couche Inversion</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAtmosphereCoucheInversion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couche Inversion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couche Inversion</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAtmosphereCoucheInversion
	 * @see #isSetCoucheInversion()
	 * @see #unsetCoucheInversion()
	 * @see #setCoucheInversion(TypeDictionaryDicoAtmosphereCoucheInversion)
	 * @see mpia.schema.SchemaPackage#getTypeAtmosphere_CoucheInversion()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CoucheInversion'"
	 * @generated
	 */
	TypeDictionaryDicoAtmosphereCoucheInversion getCoucheInversion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAtmosphere#getCoucheInversion <em>Couche Inversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couche Inversion</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAtmosphereCoucheInversion
	 * @see #isSetCoucheInversion()
	 * @see #unsetCoucheInversion()
	 * @see #getCoucheInversion()
	 * @generated
	 */
	void setCoucheInversion(TypeDictionaryDicoAtmosphereCoucheInversion value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAtmosphere#getCoucheInversion <em>Couche Inversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoucheInversion()
	 * @see #getCoucheInversion()
	 * @see #setCoucheInversion(TypeDictionaryDicoAtmosphereCoucheInversion)
	 * @generated
	 */
	void unsetCoucheInversion();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAtmosphere#getCoucheInversion <em>Couche Inversion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Couche Inversion</em>' attribute is set.
	 * @see #unsetCoucheInversion()
	 * @see #getCoucheInversion()
	 * @see #setCoucheInversion(TypeDictionaryDicoAtmosphereCoucheInversion)
	 * @generated
	 */
	boolean isSetCoucheInversion();

	/**
	 * Returns the value of the '<em><b>Systeme Pression</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAtmosphereSystemePression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systeme Pression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systeme Pression</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAtmosphereSystemePression
	 * @see #isSetSystemePression()
	 * @see #unsetSystemePression()
	 * @see #setSystemePression(TypeDictionaryDicoAtmosphereSystemePression)
	 * @see mpia.schema.SchemaPackage#getTypeAtmosphere_SystemePression()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SystemePression'"
	 * @generated
	 */
	TypeDictionaryDicoAtmosphereSystemePression getSystemePression();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAtmosphere#getSystemePression <em>Systeme Pression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systeme Pression</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAtmosphereSystemePression
	 * @see #isSetSystemePression()
	 * @see #unsetSystemePression()
	 * @see #getSystemePression()
	 * @generated
	 */
	void setSystemePression(TypeDictionaryDicoAtmosphereSystemePression value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAtmosphere#getSystemePression <em>Systeme Pression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSystemePression()
	 * @see #getSystemePression()
	 * @see #setSystemePression(TypeDictionaryDicoAtmosphereSystemePression)
	 * @generated
	 */
	void unsetSystemePression();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAtmosphere#getSystemePression <em>Systeme Pression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Systeme Pression</em>' attribute is set.
	 * @see #unsetSystemePression()
	 * @see #getSystemePression()
	 * @see #setSystemePression(TypeDictionaryDicoAtmosphereSystemePression)
	 * @generated
	 */
	boolean isSetSystemePression();

} // TypeAtmosphere
