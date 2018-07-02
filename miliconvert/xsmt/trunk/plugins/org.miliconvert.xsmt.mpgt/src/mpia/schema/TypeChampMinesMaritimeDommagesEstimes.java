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
 * A representation of the model object '<em><b>Type Champ Mines Maritime Dommages Estimes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getNbEstimes <em>Nb Estimes</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getNbTransitsEnreg <em>Nb Transits Enreg</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritimeDommagesEstimes()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ChampMinesMaritimeDommagesEstimes' kind='elementOnly'"
 * @generated
 */
public interface TypeChampMinesMaritimeDommagesEstimes extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Estimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Estimes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Estimes</em>' attribute.
	 * @see #isSetNbEstimes()
	 * @see #unsetNbEstimes()
	 * @see #setNbEstimes(long)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritimeDommagesEstimes_NbEstimes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbEstimes'"
	 * @generated
	 */
	long getNbEstimes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getNbEstimes <em>Nb Estimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Estimes</em>' attribute.
	 * @see #isSetNbEstimes()
	 * @see #unsetNbEstimes()
	 * @see #getNbEstimes()
	 * @generated
	 */
	void setNbEstimes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getNbEstimes <em>Nb Estimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbEstimes()
	 * @see #getNbEstimes()
	 * @see #setNbEstimes(long)
	 * @generated
	 */
	void unsetNbEstimes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getNbEstimes <em>Nb Estimes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Estimes</em>' attribute is set.
	 * @see #unsetNbEstimes()
	 * @see #getNbEstimes()
	 * @see #setNbEstimes(long)
	 * @generated
	 */
	boolean isSetNbEstimes();

	/**
	 * Returns the value of the '<em><b>Nb Transits Enreg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Transits Enreg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Transits Enreg</em>' attribute.
	 * @see #isSetNbTransitsEnreg()
	 * @see #unsetNbTransitsEnreg()
	 * @see #setNbTransitsEnreg(long)
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritimeDommagesEstimes_NbTransitsEnreg()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NbTransitsEnreg'"
	 * @generated
	 */
	long getNbTransitsEnreg();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getNbTransitsEnreg <em>Nb Transits Enreg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Transits Enreg</em>' attribute.
	 * @see #isSetNbTransitsEnreg()
	 * @see #unsetNbTransitsEnreg()
	 * @see #getNbTransitsEnreg()
	 * @generated
	 */
	void setNbTransitsEnreg(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getNbTransitsEnreg <em>Nb Transits Enreg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbTransitsEnreg()
	 * @see #getNbTransitsEnreg()
	 * @see #setNbTransitsEnreg(long)
	 * @generated
	 */
	void unsetNbTransitsEnreg();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getNbTransitsEnreg <em>Nb Transits Enreg</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Transits Enreg</em>' attribute is set.
	 * @see #unsetNbTransitsEnreg()
	 * @see #getNbTransitsEnreg()
	 * @see #setNbTransitsEnreg(long)
	 * @generated
	 */
	boolean isSetNbTransitsEnreg();

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
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritimeDommagesEstimes_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeChampMinesMaritimeDommagesEstimes_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChampMinesMaritimeDommagesEstimes#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeChampMinesMaritimeDommagesEstimes
