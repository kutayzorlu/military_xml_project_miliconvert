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
 * A representation of the model object '<em><b>Type Evacuations Par Periode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvacuationsParPeriode#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationsParPeriode#getDestination <em>Destination</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationsParPeriode#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEvacuationsParPeriode#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvacuationsParPeriode()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EvacuationsParPeriode' kind='elementOnly'"
 * @generated
 */
public interface TypeEvacuationsParPeriode extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationsParPeriode_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationsParPeriode#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationsParPeriode#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationsParPeriode#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEvacuationDestination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvacuationDestination
	 * @see #isSetDestination()
	 * @see #unsetDestination()
	 * @see #setDestination(TypeDictionaryDicoEvacuationDestination)
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationsParPeriode_Destination()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Destination'"
	 * @generated
	 */
	TypeDictionaryDicoEvacuationDestination getDestination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationsParPeriode#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEvacuationDestination
	 * @see #isSetDestination()
	 * @see #unsetDestination()
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(TypeDictionaryDicoEvacuationDestination value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvacuationsParPeriode#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDestination()
	 * @see #getDestination()
	 * @see #setDestination(TypeDictionaryDicoEvacuationDestination)
	 * @generated
	 */
	void unsetDestination();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvacuationsParPeriode#getDestination <em>Destination</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destination</em>' attribute is set.
	 * @see #unsetDestination()
	 * @see #getDestination()
	 * @see #setDestination(TypeDictionaryDicoEvacuationDestination)
	 * @generated
	 */
	boolean isSetDestination();

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
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationsParPeriode_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationsParPeriode#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEvacuationsParPeriode_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvacuationsParPeriode#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEvacuationsParPeriode
