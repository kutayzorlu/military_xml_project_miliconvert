/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Acquisition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneAcquisition#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneAcquisition#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneAcquisition#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneAcquisition#getFaitObjetRecherchesTypeEquipement <em>Fait Objet Recherches Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneAcquisition()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ZoneAcquisition' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneAcquisition extends EObject {
	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneAcquisitionPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneAcquisitionPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoZoneAcquisitionPriorite)
	 * @see mpia.schema.SchemaPackage#getTypeZoneAcquisition_Priorite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoZoneAcquisitionPriorite getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneAcquisition#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneAcquisitionPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoZoneAcquisitionPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneAcquisition#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoZoneAcquisitionPriorite)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneAcquisition#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoZoneAcquisitionPriorite)
	 * @generated
	 */
	boolean isSetPriorite();

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
	 * @see mpia.schema.SchemaPackage#getTypeZoneAcquisition_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneAcquisition#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeZoneAcquisition_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneAcquisition#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Fait Objet Recherches Type Equipement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fait Objet Recherches Type Equipement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fait Objet Recherches Type Equipement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeZoneAcquisition_FaitObjetRecherchesTypeEquipement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipement'"
	 *        extendedMetaData="kind='element' name='FaitObjetRecherches_TypeEquipement'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getFaitObjetRecherchesTypeEquipement();

} // TypeZoneAcquisition
