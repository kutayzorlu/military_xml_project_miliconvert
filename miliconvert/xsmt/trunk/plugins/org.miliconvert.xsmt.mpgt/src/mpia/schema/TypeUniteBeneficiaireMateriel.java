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
 * A representation of the model object '<em><b>Type Unite Beneficiaire Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUniteBeneficiaireMateriel#getQuantiteAllouee <em>Quantite Allouee</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteBeneficiaireMateriel#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteBeneficiaireMateriel#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteBeneficiaireMateriel#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteBeneficiaireMateriel#getAPourModaliteObtentionModaliteObtention <em>APour Modalite Obtention Modalite Obtention</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUniteBeneficiaireMateriel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_UniteBeneficiaireMateriel' kind='elementOnly'"
 * @generated
 */
public interface TypeUniteBeneficiaireMateriel extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite Allouee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Allouee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Allouee</em>' attribute.
	 * @see #isSetQuantiteAllouee()
	 * @see #unsetQuantiteAllouee()
	 * @see #setQuantiteAllouee(long)
	 * @see mpia.schema.SchemaPackage#getTypeUniteBeneficiaireMateriel_QuantiteAllouee()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteAllouee'"
	 * @generated
	 */
	long getQuantiteAllouee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getQuantiteAllouee <em>Quantite Allouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Allouee</em>' attribute.
	 * @see #isSetQuantiteAllouee()
	 * @see #unsetQuantiteAllouee()
	 * @see #getQuantiteAllouee()
	 * @generated
	 */
	void setQuantiteAllouee(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getQuantiteAllouee <em>Quantite Allouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteAllouee()
	 * @see #getQuantiteAllouee()
	 * @see #setQuantiteAllouee(long)
	 * @generated
	 */
	void unsetQuantiteAllouee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getQuantiteAllouee <em>Quantite Allouee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Allouee</em>' attribute is set.
	 * @see #unsetQuantiteAllouee()
	 * @see #getQuantiteAllouee()
	 * @see #setQuantiteAllouee(long)
	 * @generated
	 */
	boolean isSetQuantiteAllouee();

	/**
	 * Returns the value of the '<em><b>Conditionnement Unite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConditionnementUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Unite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetConditionnementUnite()
	 * @see #unsetConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @see mpia.schema.SchemaPackage#getTypeUniteBeneficiaireMateriel_ConditionnementUnite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ConditionnementUnite'"
	 * @generated
	 */
	TypeDictionaryDicoConditionnementUnite getConditionnementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetConditionnementUnite()
	 * @see #unsetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @generated
	 */
	void setConditionnementUnite(TypeDictionaryDicoConditionnementUnite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	void unsetConditionnementUnite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditionnement Unite</em>' attribute is set.
	 * @see #unsetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	boolean isSetConditionnementUnite();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoUniteBeneficiaireMaterielCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteBeneficiaireMaterielCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoUniteBeneficiaireMaterielCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeUniteBeneficiaireMateriel_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoUniteBeneficiaireMaterielCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoUniteBeneficiaireMaterielCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoUniteBeneficiaireMaterielCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoUniteBeneficiaireMaterielCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoUniteBeneficiaireMaterielCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Concerne Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Materiel</em>' containment reference.
	 * @see #setConcerneTypeMateriel(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeUniteBeneficiaireMateriel_ConcerneTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='Concerne_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Materiel</em>' containment reference.
	 * @see #getConcerneTypeMateriel()
	 * @generated
	 */
	void setConcerneTypeMateriel(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Modalite Obtention Modalite Obtention</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Modalite Obtention Modalite Obtention</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Modalite Obtention Modalite Obtention</em>' containment reference.
	 * @see #setAPourModaliteObtentionModaliteObtention(TypeModaliteObtention)
	 * @see mpia.schema.SchemaPackage#getTypeUniteBeneficiaireMateriel_APourModaliteObtentionModaliteObtention()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModaliteObtention'"
	 *        extendedMetaData="kind='element' name='APourModaliteObtention_ModaliteObtention'"
	 * @generated
	 */
	TypeModaliteObtention getAPourModaliteObtentionModaliteObtention();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteBeneficiaireMateriel#getAPourModaliteObtentionModaliteObtention <em>APour Modalite Obtention Modalite Obtention</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Modalite Obtention Modalite Obtention</em>' containment reference.
	 * @see #getAPourModaliteObtentionModaliteObtention()
	 * @generated
	 */
	void setAPourModaliteObtentionModaliteObtention(TypeModaliteObtention value);

} // TypeUniteBeneficiaireMateriel
