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
 * A representation of the model object '<em><b>Type Constat Terrain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConstatTerrain#getNatureObstacle <em>Nature Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeConstatTerrain#getTypeObstacle <em>Type Obstacle</em>}</li>
 *   <li>{@link mpia.schema.TypeConstatTerrain#getAttitudeTenue <em>Attitude Tenue</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConstatTerrain()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConstatTerrain' kind='elementOnly'"
 * @generated
 */
public interface TypeConstatTerrain extends EObject {
	/**
	 * Returns the value of the '<em><b>Nature Obstacle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Obstacle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Obstacle</em>' attribute.
	 * @see #setNatureObstacle(String)
	 * @see mpia.schema.SchemaPackage#getTypeConstatTerrain_NatureObstacle()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020" required="true"
	 *        extendedMetaData="kind='element' name='NatureObstacle'"
	 * @generated
	 */
	String getNatureObstacle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatTerrain#getNatureObstacle <em>Nature Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Obstacle</em>' attribute.
	 * @see #getNatureObstacle()
	 * @generated
	 */
	void setNatureObstacle(String value);

	/**
	 * Returns the value of the '<em><b>Type Obstacle</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConstatTerrainTypeObstacle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Obstacle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Obstacle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConstatTerrainTypeObstacle
	 * @see #isSetTypeObstacle()
	 * @see #unsetTypeObstacle()
	 * @see #setTypeObstacle(TypeDictionaryDicoConstatTerrainTypeObstacle)
	 * @see mpia.schema.SchemaPackage#getTypeConstatTerrain_TypeObstacle()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeObstacle'"
	 * @generated
	 */
	TypeDictionaryDicoConstatTerrainTypeObstacle getTypeObstacle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatTerrain#getTypeObstacle <em>Type Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Obstacle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConstatTerrainTypeObstacle
	 * @see #isSetTypeObstacle()
	 * @see #unsetTypeObstacle()
	 * @see #getTypeObstacle()
	 * @generated
	 */
	void setTypeObstacle(TypeDictionaryDicoConstatTerrainTypeObstacle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConstatTerrain#getTypeObstacle <em>Type Obstacle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeObstacle()
	 * @see #getTypeObstacle()
	 * @see #setTypeObstacle(TypeDictionaryDicoConstatTerrainTypeObstacle)
	 * @generated
	 */
	void unsetTypeObstacle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConstatTerrain#getTypeObstacle <em>Type Obstacle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Obstacle</em>' attribute is set.
	 * @see #unsetTypeObstacle()
	 * @see #getTypeObstacle()
	 * @see #setTypeObstacle(TypeDictionaryDicoConstatTerrainTypeObstacle)
	 * @generated
	 */
	boolean isSetTypeObstacle();

	/**
	 * Returns the value of the '<em><b>Attitude Tenue</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConstatTerrainAttitudeTenue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude Tenue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude Tenue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConstatTerrainAttitudeTenue
	 * @see #isSetAttitudeTenue()
	 * @see #unsetAttitudeTenue()
	 * @see #setAttitudeTenue(TypeDictionaryDicoConstatTerrainAttitudeTenue)
	 * @see mpia.schema.SchemaPackage#getTypeConstatTerrain_AttitudeTenue()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='AttitudeTenue'"
	 * @generated
	 */
	TypeDictionaryDicoConstatTerrainAttitudeTenue getAttitudeTenue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatTerrain#getAttitudeTenue <em>Attitude Tenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude Tenue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConstatTerrainAttitudeTenue
	 * @see #isSetAttitudeTenue()
	 * @see #unsetAttitudeTenue()
	 * @see #getAttitudeTenue()
	 * @generated
	 */
	void setAttitudeTenue(TypeDictionaryDicoConstatTerrainAttitudeTenue value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConstatTerrain#getAttitudeTenue <em>Attitude Tenue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttitudeTenue()
	 * @see #getAttitudeTenue()
	 * @see #setAttitudeTenue(TypeDictionaryDicoConstatTerrainAttitudeTenue)
	 * @generated
	 */
	void unsetAttitudeTenue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConstatTerrain#getAttitudeTenue <em>Attitude Tenue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attitude Tenue</em>' attribute is set.
	 * @see #unsetAttitudeTenue()
	 * @see #getAttitudeTenue()
	 * @see #setAttitudeTenue(TypeDictionaryDicoConstatTerrainAttitudeTenue)
	 * @generated
	 */
	boolean isSetAttitudeTenue();

} // TypeConstatTerrain
