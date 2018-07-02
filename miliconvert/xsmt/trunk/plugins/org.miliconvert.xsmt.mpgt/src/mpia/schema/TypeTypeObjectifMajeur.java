/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Objectif Majeur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeObjectifMajeur#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifMajeur#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifMajeur#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifMajeur#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifMajeur#getAPourEffetMajeurARealiserEffetAuContactASS <em>APour Effet Majeur ARealiser Effet Au Contact ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeObjectifMajeur#getAPourElementsVitauxElementVital <em>APour Elements Vitaux Element Vital</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifMajeur()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeObjectifMajeur' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeObjectifMajeur extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeObjectifMajeurCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifMajeurCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeObjectifMajeurCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifMajeur_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeObjectifMajeurCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifMajeur#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeObjectifMajeurCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeObjectifMajeurCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeObjectifMajeur#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeObjectifMajeurCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeObjectifMajeur#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeObjectifMajeurCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrioriteTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrioriteTir
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPrioriteTir)
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifMajeur_Priorite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoPrioriteTir getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifMajeur#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrioriteTir
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoPrioriteTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeObjectifMajeur#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPrioriteTir)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeObjectifMajeur#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPrioriteTir)
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifMajeur_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifMajeur#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifMajeur_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeObjectifMajeur#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Effet Majeur ARealiser Effet Au Contact ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffetAuContactASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Effet Majeur ARealiser Effet Au Contact ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Effet Majeur ARealiser Effet Au Contact ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifMajeur_APourEffetMajeurARealiserEffetAuContactASS()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetAuContactASS'"
	 *        extendedMetaData="kind='element' name='APourEffetMajeurARealiser_EffetAuContactASS'"
	 * @generated
	 */
	EList<TypeEffetAuContactASS> getAPourEffetMajeurARealiserEffetAuContactASS();

	/**
	 * Returns the value of the '<em><b>APour Elements Vitaux Element Vital</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeElementVital}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Elements Vitaux Element Vital</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Elements Vitaux Element Vital</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeObjectifMajeur_APourElementsVitauxElementVital()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ElementVital'"
	 *        extendedMetaData="kind='element' name='APourElementsVitaux_ElementVital'"
	 * @generated
	 */
	EList<TypeElementVital> getAPourElementsVitauxElementVital();

} // TypeTypeObjectifMajeur
