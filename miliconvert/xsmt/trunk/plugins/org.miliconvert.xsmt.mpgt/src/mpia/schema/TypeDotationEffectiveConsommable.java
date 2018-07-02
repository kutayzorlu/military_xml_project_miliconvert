/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Dotation Effective Consommable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDotationEffectiveConsommable#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffectiveConsommable#getConstitueSituationConsommable <em>Constitue Situation Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveConsommable()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DotationEffectiveConsommable' kind='elementOnly'"
 * @generated
 */
public interface TypeDotationEffectiveConsommable extends TypeDotationEffective {
	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type Materiel</em>' containment reference.
	 * @see #setAssocieCommeTypeTypeMateriel(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveConsommable_AssocieCommeTypeTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypeMateriel'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeTypeTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffectiveConsommable#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Materiel</em>' containment reference.
	 * @see #getAssocieCommeTypeTypeMateriel()
	 * @generated
	 */
	void setAssocieCommeTypeTypeMateriel(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Constitue Situation Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constitue Situation Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constitue Situation Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveConsommable_ConstitueSituationConsommable()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_SituationConsommable'"
	 *        extendedMetaData="kind='element' name='Constitue_SituationConsommable'"
	 * @generated
	 */
	EList<TypeAssociation> getConstitueSituationConsommable();

} // TypeDotationEffectiveConsommable
