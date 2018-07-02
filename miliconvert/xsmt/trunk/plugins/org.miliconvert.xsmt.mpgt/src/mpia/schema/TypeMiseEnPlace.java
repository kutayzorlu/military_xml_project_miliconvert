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
 * A representation of the model object '<em><b>Type Mise En Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMiseEnPlace#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlace#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlace#getEstMiseEnPlaceParUnite <em>Est Mise En Place Par Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlace#getAPourRessourcesAEmporterDotationEffectiveConsommable <em>APour Ressources AEmporter Dotation Effective Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlace()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MiseEnPlace' kind='elementOnly'"
 * @generated
 */
public interface TypeMiseEnPlace extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlace_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlace#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlace_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlace#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Mise En Place Par Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Mise En Place Par Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Mise En Place Par Unite</em>' containment reference.
	 * @see #setEstMiseEnPlaceParUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlace_EstMiseEnPlaceParUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EstMiseEnPlacePar_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getEstMiseEnPlaceParUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlace#getEstMiseEnPlaceParUnite <em>Est Mise En Place Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Mise En Place Par Unite</em>' containment reference.
	 * @see #getEstMiseEnPlaceParUnite()
	 * @generated
	 */
	void setEstMiseEnPlaceParUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Ressources AEmporter Dotation Effective Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDotationEffectiveConsommable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Ressources AEmporter Dotation Effective Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Ressources AEmporter Dotation Effective Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlace_APourRessourcesAEmporterDotationEffectiveConsommable()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DotationEffectiveConsommable'"
	 *        extendedMetaData="kind='element' name='APourRessourcesAEmporter_DotationEffectiveConsommable'"
	 * @generated
	 */
	EList<TypeDotationEffectiveConsommable> getAPourRessourcesAEmporterDotationEffectiveConsommable();

} // TypeMiseEnPlace
