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
 * A representation of the model object '<em><b>Type Caracteristique Complementaire Obstacle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle#getCaracteristique <em>Caracteristique</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueComplementaireObstacle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiqueComplementaireObstacle' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiqueComplementaireObstacle extends EObject {
	/**
	 * Returns the value of the '<em><b>Caracteristique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique
	 * @see #isSetCaracteristique()
	 * @see #unsetCaracteristique()
	 * @see #setCaracteristique(TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueComplementaireObstacle_Caracteristique()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Caracteristique'"
	 * @generated
	 */
	TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique getCaracteristique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle#getCaracteristique <em>Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique
	 * @see #isSetCaracteristique()
	 * @see #unsetCaracteristique()
	 * @see #getCaracteristique()
	 * @generated
	 */
	void setCaracteristique(TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle#getCaracteristique <em>Caracteristique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaracteristique()
	 * @see #getCaracteristique()
	 * @see #setCaracteristique(TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique)
	 * @generated
	 */
	void unsetCaracteristique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle#getCaracteristique <em>Caracteristique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caracteristique</em>' attribute is set.
	 * @see #unsetCaracteristique()
	 * @see #getCaracteristique()
	 * @see #setCaracteristique(TypeDictionaryDicoCaracteristiqueComplementaireObstacleCaracteristique)
	 * @generated
	 */
	boolean isSetCaracteristique();

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
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueComplementaireObstacle_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueComplementaireObstacle_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueComplementaireObstacle#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeCaracteristiqueComplementaireObstacle
