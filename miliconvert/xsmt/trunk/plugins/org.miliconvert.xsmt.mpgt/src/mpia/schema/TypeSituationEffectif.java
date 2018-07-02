/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Situation Effectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSituationEffectif#getDateSituation <em>Date Situation</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationEffectif#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationEffectif#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeSituationEffectif#getEmiseParUnite <em>Emise Par Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSituationEffectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SituationEffectif' kind='elementOnly'"
 * @generated
 */
public interface TypeSituationEffectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Situation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Situation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Situation</em>' attribute.
	 * @see #setDateSituation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSituationEffectif_DateSituation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateSituation'"
	 * @generated
	 */
	XMLGregorianCalendar getDateSituation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationEffectif#getDateSituation <em>Date Situation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Situation</em>' attribute.
	 * @see #getDateSituation()
	 * @generated
	 */
	void setDateSituation(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeSituationEffectif_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationEffectif#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeSituationEffectif_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationEffectif#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Emise Par Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emise Par Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emise Par Unite</em>' containment reference.
	 * @see #setEmiseParUnite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeSituationEffectif_EmiseParUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSituationEffectif_SituationEffectif' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EmisePar_Unite'"
	 * @generated
	 */
	TypeAssociation getEmiseParUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSituationEffectif#getEmiseParUnite <em>Emise Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emise Par Unite</em>' containment reference.
	 * @see #getEmiseParUnite()
	 * @generated
	 */
	void setEmiseParUnite(TypeAssociation value);

} // TypeSituationEffectif
