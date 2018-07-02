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
 * A representation of the model object '<em><b>Type Dotation Effective Equipement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteReparableA12h <em>Quantite Reparable A1 2h</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteDefinitivementIndispo <em>Quantite Definitivement Indispo</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteRechange <em>Quantite Rechange</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffectiveEquipement#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationEffectiveEquipement#getConstitueSituationEquipement <em>Constitue Situation Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEquipement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DotationEffectiveEquipement' kind='elementOnly'"
 * @generated
 */
public interface TypeDotationEffectiveEquipement extends TypeDotationEffective {
	/**
	 * Returns the value of the '<em><b>Quantite Reparable A1 2h</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Reparable A1 2h</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Reparable A1 2h</em>' attribute.
	 * @see #isSetQuantiteReparableA12h()
	 * @see #unsetQuantiteReparableA12h()
	 * @see #setQuantiteReparableA12h(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEquipement_QuantiteReparableA12h()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteReparableA12h'"
	 * @generated
	 */
	long getQuantiteReparableA12h();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteReparableA12h <em>Quantite Reparable A1 2h</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Reparable A1 2h</em>' attribute.
	 * @see #isSetQuantiteReparableA12h()
	 * @see #unsetQuantiteReparableA12h()
	 * @see #getQuantiteReparableA12h()
	 * @generated
	 */
	void setQuantiteReparableA12h(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteReparableA12h <em>Quantite Reparable A1 2h</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteReparableA12h()
	 * @see #getQuantiteReparableA12h()
	 * @see #setQuantiteReparableA12h(long)
	 * @generated
	 */
	void unsetQuantiteReparableA12h();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteReparableA12h <em>Quantite Reparable A1 2h</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Reparable A1 2h</em>' attribute is set.
	 * @see #unsetQuantiteReparableA12h()
	 * @see #getQuantiteReparableA12h()
	 * @see #setQuantiteReparableA12h(long)
	 * @generated
	 */
	boolean isSetQuantiteReparableA12h();

	/**
	 * Returns the value of the '<em><b>Quantite Definitivement Indispo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Definitivement Indispo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Definitivement Indispo</em>' attribute.
	 * @see #isSetQuantiteDefinitivementIndispo()
	 * @see #unsetQuantiteDefinitivementIndispo()
	 * @see #setQuantiteDefinitivementIndispo(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEquipement_QuantiteDefinitivementIndispo()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteDefinitivementIndispo'"
	 * @generated
	 */
	long getQuantiteDefinitivementIndispo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteDefinitivementIndispo <em>Quantite Definitivement Indispo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Definitivement Indispo</em>' attribute.
	 * @see #isSetQuantiteDefinitivementIndispo()
	 * @see #unsetQuantiteDefinitivementIndispo()
	 * @see #getQuantiteDefinitivementIndispo()
	 * @generated
	 */
	void setQuantiteDefinitivementIndispo(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteDefinitivementIndispo <em>Quantite Definitivement Indispo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteDefinitivementIndispo()
	 * @see #getQuantiteDefinitivementIndispo()
	 * @see #setQuantiteDefinitivementIndispo(long)
	 * @generated
	 */
	void unsetQuantiteDefinitivementIndispo();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteDefinitivementIndispo <em>Quantite Definitivement Indispo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Definitivement Indispo</em>' attribute is set.
	 * @see #unsetQuantiteDefinitivementIndispo()
	 * @see #getQuantiteDefinitivementIndispo()
	 * @see #setQuantiteDefinitivementIndispo(long)
	 * @generated
	 */
	boolean isSetQuantiteDefinitivementIndispo();

	/**
	 * Returns the value of the '<em><b>Quantite Rechange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Rechange</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Rechange</em>' attribute.
	 * @see #isSetQuantiteRechange()
	 * @see #unsetQuantiteRechange()
	 * @see #setQuantiteRechange(long)
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEquipement_QuantiteRechange()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteRechange'"
	 * @generated
	 */
	long getQuantiteRechange();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteRechange <em>Quantite Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Rechange</em>' attribute.
	 * @see #isSetQuantiteRechange()
	 * @see #unsetQuantiteRechange()
	 * @see #getQuantiteRechange()
	 * @generated
	 */
	void setQuantiteRechange(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteRechange <em>Quantite Rechange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteRechange()
	 * @see #getQuantiteRechange()
	 * @see #setQuantiteRechange(long)
	 * @generated
	 */
	void unsetQuantiteRechange();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getQuantiteRechange <em>Quantite Rechange</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Rechange</em>' attribute is set.
	 * @see #unsetQuantiteRechange()
	 * @see #getQuantiteRechange()
	 * @see #setQuantiteRechange(long)
	 * @generated
	 */
	boolean isSetQuantiteRechange();

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
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEquipement_AssocieCommeTypeTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_TypeMateriel'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeTypeTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationEffectiveEquipement#getAssocieCommeTypeTypeMateriel <em>Associe Comme Type Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type Materiel</em>' containment reference.
	 * @see #getAssocieCommeTypeTypeMateriel()
	 * @generated
	 */
	void setAssocieCommeTypeTypeMateriel(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Constitue Situation Equipement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constitue Situation Equipement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constitue Situation Equipement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDotationEffectiveEquipement_ConstitueSituationEquipement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_SituationEquipement'"
	 *        extendedMetaData="kind='element' name='Constitue_SituationEquipement'"
	 * @generated
	 */
	EList<TypeAssociation> getConstitueSituationEquipement();

} // TypeDotationEffectiveEquipement
