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
 * A representation of the model object '<em><b>Type Dose Radiation Absorbe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDoseRadiationAbsorbe#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeDoseRadiationAbsorbe#getTrancheDose <em>Tranche Dose</em>}</li>
 *   <li>{@link mpia.schema.TypeDoseRadiationAbsorbe#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDoseRadiationAbsorbe#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDoseRadiationAbsorbe#getEstQuantiteAbsorbePourTypePersonne <em>Est Quantite Absorbe Pour Type Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDoseRadiationAbsorbe()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DoseRadiationAbsorbe' kind='elementOnly'"
 * @generated
 */
public interface TypeDoseRadiationAbsorbe extends EObject {
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
	 * @see #setQuantite(double)
	 * @see mpia.schema.SchemaPackage#getTypeDoseRadiationAbsorbe_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	double getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(double)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(double)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Tranche Dose</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tranche Dose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tranche Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose
	 * @see #isSetTrancheDose()
	 * @see #unsetTrancheDose()
	 * @see #setTrancheDose(TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose)
	 * @see mpia.schema.SchemaPackage#getTypeDoseRadiationAbsorbe_TrancheDose()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TrancheDose'"
	 * @generated
	 */
	TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose getTrancheDose();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getTrancheDose <em>Tranche Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tranche Dose</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose
	 * @see #isSetTrancheDose()
	 * @see #unsetTrancheDose()
	 * @see #getTrancheDose()
	 * @generated
	 */
	void setTrancheDose(TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getTrancheDose <em>Tranche Dose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrancheDose()
	 * @see #getTrancheDose()
	 * @see #setTrancheDose(TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose)
	 * @generated
	 */
	void unsetTrancheDose();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getTrancheDose <em>Tranche Dose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tranche Dose</em>' attribute is set.
	 * @see #unsetTrancheDose()
	 * @see #getTrancheDose()
	 * @see #setTrancheDose(TypeDictionaryDicoDoseRadiationAbsorbeTrancheDose)
	 * @generated
	 */
	boolean isSetTrancheDose();

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
	 * @see mpia.schema.SchemaPackage#getTypeDoseRadiationAbsorbe_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDoseRadiationAbsorbe_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Quantite Absorbe Pour Type Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Quantite Absorbe Pour Type Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Quantite Absorbe Pour Type Personne</em>' containment reference.
	 * @see #setEstQuantiteAbsorbePourTypePersonne(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDoseRadiationAbsorbe_EstQuantiteAbsorbePourTypePersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypePersonne'"
	 *        extendedMetaData="kind='element' name='EstQuantiteAbsorbePour_TypePersonne'"
	 * @generated
	 */
	TypeAssociationEXT getEstQuantiteAbsorbePourTypePersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDoseRadiationAbsorbe#getEstQuantiteAbsorbePourTypePersonne <em>Est Quantite Absorbe Pour Type Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Quantite Absorbe Pour Type Personne</em>' containment reference.
	 * @see #getEstQuantiteAbsorbePourTypePersonne()
	 * @generated
	 */
	void setEstQuantiteAbsorbePourTypePersonne(TypeAssociationEXT value);

} // TypeDoseRadiationAbsorbe
