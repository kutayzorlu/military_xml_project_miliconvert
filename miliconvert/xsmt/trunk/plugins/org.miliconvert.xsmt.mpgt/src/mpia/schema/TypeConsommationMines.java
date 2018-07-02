/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Consommation Mines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsommationMines#getPourcentage <em>Pourcentage</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationMines#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationMines#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationMines#getACommeTypeMinesTypeMateriel <em>AComme Type Mines Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsommationMines()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConsommationMines' kind='elementOnly'"
 * @generated
 */
public interface TypeConsommationMines extends EObject {
	/**
	 * Returns the value of the '<em><b>Pourcentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage</em>' attribute.
	 * @see #isSetPourcentage()
	 * @see #unsetPourcentage()
	 * @see #setPourcentage(long)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationMines_Pourcentage()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='Pourcentage'"
	 * @generated
	 */
	long getPourcentage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationMines#getPourcentage <em>Pourcentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage</em>' attribute.
	 * @see #isSetPourcentage()
	 * @see #unsetPourcentage()
	 * @see #getPourcentage()
	 * @generated
	 */
	void setPourcentage(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsommationMines#getPourcentage <em>Pourcentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentage()
	 * @see #getPourcentage()
	 * @see #setPourcentage(long)
	 * @generated
	 */
	void unsetPourcentage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsommationMines#getPourcentage <em>Pourcentage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage</em>' attribute is set.
	 * @see #unsetPourcentage()
	 * @see #getPourcentage()
	 * @see #setPourcentage(long)
	 * @generated
	 */
	boolean isSetPourcentage();

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
	 * @see mpia.schema.SchemaPackage#getTypeConsommationMines_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationMines#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConsommationMines_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationMines#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Type Mines Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Mines Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Mines Type Materiel</em>' containment reference.
	 * @see #setACommeTypeMinesTypeMateriel(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationMines_ACommeTypeMinesTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='ACommeTypeMines_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getACommeTypeMinesTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationMines#getACommeTypeMinesTypeMateriel <em>AComme Type Mines Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Type Mines Type Materiel</em>' containment reference.
	 * @see #getACommeTypeMinesTypeMateriel()
	 * @generated
	 */
	void setACommeTypeMinesTypeMateriel(TypeAssociationEXT value);

} // TypeConsommationMines
