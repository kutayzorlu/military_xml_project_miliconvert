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
 * A representation of the model object '<em><b>Type Branche Eurogrid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBrancheEurogrid#getHauteurSecurite <em>Hauteur Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheEurogrid#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeBrancheEurogrid#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBrancheEurogrid()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_BrancheEurogrid' kind='elementOnly'"
 * @generated
 */
public interface TypeBrancheEurogrid extends EObject {
	/**
	 * Returns the value of the '<em><b>Hauteur Securite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Securite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Securite</em>' attribute.
	 * @see #isSetHauteurSecurite()
	 * @see #unsetHauteurSecurite()
	 * @see #setHauteurSecurite(double)
	 * @see mpia.schema.SchemaPackage#getTypeBrancheEurogrid_HauteurSecurite()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal" required="true"
	 *        extendedMetaData="kind='element' name='HauteurSecurite'"
	 * @generated
	 */
	double getHauteurSecurite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheEurogrid#getHauteurSecurite <em>Hauteur Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Securite</em>' attribute.
	 * @see #isSetHauteurSecurite()
	 * @see #unsetHauteurSecurite()
	 * @see #getHauteurSecurite()
	 * @generated
	 */
	void setHauteurSecurite(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBrancheEurogrid#getHauteurSecurite <em>Hauteur Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHauteurSecurite()
	 * @see #getHauteurSecurite()
	 * @see #setHauteurSecurite(double)
	 * @generated
	 */
	void unsetHauteurSecurite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBrancheEurogrid#getHauteurSecurite <em>Hauteur Securite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hauteur Securite</em>' attribute is set.
	 * @see #unsetHauteurSecurite()
	 * @see #getHauteurSecurite()
	 * @see #setHauteurSecurite(double)
	 * @generated
	 */
	boolean isSetHauteurSecurite();

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
	 * @see mpia.schema.SchemaPackage#getTypeBrancheEurogrid_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheEurogrid#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeBrancheEurogrid_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBrancheEurogrid#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeBrancheEurogrid
