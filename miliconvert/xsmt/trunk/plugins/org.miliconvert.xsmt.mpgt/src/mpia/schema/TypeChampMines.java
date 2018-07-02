/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Champ Mines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeChampMines#getEspacement <em>Espacement</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMines#getDateDestruction <em>Date Destruction</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeChampMines()
 * @model abstract="true"
 *        extendedMetaData="name='type_ChampMines' kind='elementOnly'"
 * @generated
 */
public interface TypeChampMines extends TypeObstacle {
	/**
	 * Returns the value of the '<em><b>Espacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Espacement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Espacement</em>' containment reference.
	 * @see #setEspacement(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeChampMines_Espacement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Espacement'"
	 * @generated
	 */
	TypeDataTypeLongueur getEspacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMines#getEspacement <em>Espacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Espacement</em>' containment reference.
	 * @see #getEspacement()
	 * @generated
	 */
	void setEspacement(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Date Destruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Destruction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Destruction</em>' containment reference.
	 * @see #setDateDestruction(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeChampMines_DateDestruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDestruction'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDestruction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMines#getDateDestruction <em>Date Destruction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Destruction</em>' containment reference.
	 * @see #getDateDestruction()
	 * @generated
	 */
	void setDateDestruction(TypeDataTypeDateHeure value);

} // TypeChampMines
