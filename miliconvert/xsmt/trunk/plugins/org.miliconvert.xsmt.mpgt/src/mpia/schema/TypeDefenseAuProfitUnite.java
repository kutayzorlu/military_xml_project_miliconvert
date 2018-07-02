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
 * A representation of the model object '<em><b>Type Defense Au Profit Unite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDefenseAuProfitUnite#getPrioriteDefense <em>Priorite Defense</em>}</li>
 *   <li>{@link mpia.schema.TypeDefenseAuProfitUnite#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDefenseAuProfitUnite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DefenseAuProfitUnite' kind='elementOnly'"
 * @generated
 */
public interface TypeDefenseAuProfitUnite extends EObject {
	/**
	 * Returns the value of the '<em><b>Priorite Defense</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Defense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Defense</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPrioriteDefense()
	 * @see #unsetPrioriteDefense()
	 * @see #setPrioriteDefense(TypeDictionaryDicoPriorite)
	 * @see mpia.schema.SchemaPackage#getTypeDefenseAuProfitUnite_PrioriteDefense()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrioriteDefense'"
	 * @generated
	 */
	TypeDictionaryDicoPriorite getPrioriteDefense();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDefenseAuProfitUnite#getPrioriteDefense <em>Priorite Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite Defense</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPrioriteDefense()
	 * @see #unsetPrioriteDefense()
	 * @see #getPrioriteDefense()
	 * @generated
	 */
	void setPrioriteDefense(TypeDictionaryDicoPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDefenseAuProfitUnite#getPrioriteDefense <em>Priorite Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrioriteDefense()
	 * @see #getPrioriteDefense()
	 * @see #setPrioriteDefense(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	void unsetPrioriteDefense();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDefenseAuProfitUnite#getPrioriteDefense <em>Priorite Defense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite Defense</em>' attribute is set.
	 * @see #unsetPrioriteDefense()
	 * @see #getPrioriteDefense()
	 * @see #setPrioriteDefense(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	boolean isSetPrioriteDefense();

	/**
	 * Returns the value of the '<em><b>APour Localisation PC Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation PC Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation PC Localisation</em>' containment reference.
	 * @see #setAPourLocalisationPCLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeDefenseAuProfitUnite_APourLocalisationPCLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='APourLocalisationPC_Localisation'"
	 * @generated
	 */
	TypeLocalisation getAPourLocalisationPCLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDefenseAuProfitUnite#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation PC Localisation</em>' containment reference.
	 * @see #getAPourLocalisationPCLocalisation()
	 * @generated
	 */
	void setAPourLocalisationPCLocalisation(TypeLocalisation value);

} // TypeDefenseAuProfitUnite
