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
 * A representation of the model object '<em><b>Type CRactivite ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCRactiviteASS#getTypeMissionASS <em>Type Mission ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeCRactiviteASS#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCRactiviteASS#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCRactiviteASS#getRealiseeAuProfitUnite <em>Realisee Au Profit Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCRactiviteASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CRactiviteASS' kind='elementOnly'"
 * @generated
 */
public interface TypeCRactiviteASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Mission ASS</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMissionASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission ASS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission ASS</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionASS
	 * @see #isSetTypeMissionASS()
	 * @see #unsetTypeMissionASS()
	 * @see #setTypeMissionASS(TypeDictionaryDicoTypeMissionASS)
	 * @see mpia.schema.SchemaPackage#getTypeCRactiviteASS_TypeMissionASS()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMissionASS'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMissionASS getTypeMissionASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRactiviteASS#getTypeMissionASS <em>Type Mission ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission ASS</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionASS
	 * @see #isSetTypeMissionASS()
	 * @see #unsetTypeMissionASS()
	 * @see #getTypeMissionASS()
	 * @generated
	 */
	void setTypeMissionASS(TypeDictionaryDicoTypeMissionASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRactiviteASS#getTypeMissionASS <em>Type Mission ASS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionASS()
	 * @see #getTypeMissionASS()
	 * @see #setTypeMissionASS(TypeDictionaryDicoTypeMissionASS)
	 * @generated
	 */
	void unsetTypeMissionASS();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRactiviteASS#getTypeMissionASS <em>Type Mission ASS</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission ASS</em>' attribute is set.
	 * @see #unsetTypeMissionASS()
	 * @see #getTypeMissionASS()
	 * @see #setTypeMissionASS(TypeDictionaryDicoTypeMissionASS)
	 * @generated
	 */
	boolean isSetTypeMissionASS();

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
	 * @see mpia.schema.SchemaPackage#getTypeCRactiviteASS_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRactiviteASS#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCRactiviteASS_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRactiviteASS#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Realisee Au Profit Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realisee Au Profit Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realisee Au Profit Unite</em>' containment reference.
	 * @see #setRealiseeAuProfitUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCRactiviteASS_RealiseeAuProfitUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='RealiseeAuProfit_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getRealiseeAuProfitUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRactiviteASS#getRealiseeAuProfitUnite <em>Realisee Au Profit Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realisee Au Profit Unite</em>' containment reference.
	 * @see #getRealiseeAuProfitUnite()
	 * @generated
	 */
	void setRealiseeAuProfitUnite(TypeAssociationEXT value);

} // TypeCRactiviteASS
