/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Autorisation Objectif Ciblage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutorisationObjectifCiblage#getApprobation <em>Approbation</em>}</li>
 *   <li>{@link mpia.schema.TypeAutorisationObjectifCiblage#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeAutorisationObjectifCiblage#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAutorisationObjectifCiblage#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAutorisationObjectifCiblage#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutorisationObjectifCiblage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AutorisationObjectifCiblage' kind='elementOnly'"
 * @generated
 */
public interface TypeAutorisationObjectifCiblage extends EObject {
	/**
	 * Returns the value of the '<em><b>Approbation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutorisationObjectifCiblageApprobation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approbation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approbation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutorisationObjectifCiblageApprobation
	 * @see #isSetApprobation()
	 * @see #unsetApprobation()
	 * @see #setApprobation(TypeDictionaryDicoAutorisationObjectifCiblageApprobation)
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationObjectifCiblage_Approbation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Approbation'"
	 * @generated
	 */
	TypeDictionaryDicoAutorisationObjectifCiblageApprobation getApprobation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getApprobation <em>Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approbation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutorisationObjectifCiblageApprobation
	 * @see #isSetApprobation()
	 * @see #unsetApprobation()
	 * @see #getApprobation()
	 * @generated
	 */
	void setApprobation(TypeDictionaryDicoAutorisationObjectifCiblageApprobation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getApprobation <em>Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprobation()
	 * @see #getApprobation()
	 * @see #setApprobation(TypeDictionaryDicoAutorisationObjectifCiblageApprobation)
	 * @generated
	 */
	void unsetApprobation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getApprobation <em>Approbation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approbation</em>' attribute is set.
	 * @see #unsetApprobation()
	 * @see #getApprobation()
	 * @see #setApprobation(TypeDictionaryDicoAutorisationObjectifCiblageApprobation)
	 * @generated
	 */
	boolean isSetApprobation();

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(long)
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationObjectifCiblage_Priorite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	long getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(long)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(long)
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
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationObjectifCiblage_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationObjectifCiblage_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationObjectifCiblage_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationObjectifCiblage#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAutorisationObjectifCiblage
