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
 * A representation of the model object '<em><b>Type Autorisation Liste Objectifs Candidats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#isAutorisee <em>Autorisee</em>}</li>
 *   <li>{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutorisationListeObjectifsCandidats()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AutorisationListeObjectifsCandidats' kind='elementOnly'"
 * @generated
 */
public interface TypeAutorisationListeObjectifsCandidats extends EObject {
	/**
	 * Returns the value of the '<em><b>Autorisee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autorisee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autorisee</em>' attribute.
	 * @see #isSetAutorisee()
	 * @see #unsetAutorisee()
	 * @see #setAutorisee(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationListeObjectifsCandidats_Autorisee()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='Autorisee'"
	 * @generated
	 */
	boolean isAutorisee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#isAutorisee <em>Autorisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autorisee</em>' attribute.
	 * @see #isSetAutorisee()
	 * @see #unsetAutorisee()
	 * @see #isAutorisee()
	 * @generated
	 */
	void setAutorisee(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#isAutorisee <em>Autorisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutorisee()
	 * @see #isAutorisee()
	 * @see #setAutorisee(boolean)
	 * @generated
	 */
	void unsetAutorisee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#isAutorisee <em>Autorisee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Autorisee</em>' attribute is set.
	 * @see #unsetAutorisee()
	 * @see #isAutorisee()
	 * @see #setAutorisee(boolean)
	 * @generated
	 */
	boolean isSetAutorisee();

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
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationListeObjectifsCandidats_Priorite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	long getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getPriorite <em>Priorite</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(long)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getPriorite <em>Priorite</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationListeObjectifsCandidats_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationListeObjectifsCandidats_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getCE <em>CE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAutorisationListeObjectifsCandidats_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutorisationListeObjectifsCandidats#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAutorisationListeObjectifsCandidats
