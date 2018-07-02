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
 * A representation of the model object '<em><b>Type Quantite Materiel Ou Moyen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getAttitude <em>Attitude</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getDesignationMoyen <em>Designation Moyen</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaterielOuMoyen()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_QuantiteMaterielOuMoyen' kind='elementOnly'"
 * @generated
 */
public interface TypeQuantiteMaterielOuMoyen extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaterielOuMoyen_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Attitude</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMobiliteAttitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobiliteAttitude
	 * @see #isSetAttitude()
	 * @see #unsetAttitude()
	 * @see #setAttitude(TypeDictionaryDicoMobiliteAttitude)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaterielOuMoyen_Attitude()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Attitude'"
	 * @generated
	 */
	TypeDictionaryDicoMobiliteAttitude getAttitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobiliteAttitude
	 * @see #isSetAttitude()
	 * @see #unsetAttitude()
	 * @see #getAttitude()
	 * @generated
	 */
	void setAttitude(TypeDictionaryDicoMobiliteAttitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttitude()
	 * @see #getAttitude()
	 * @see #setAttitude(TypeDictionaryDicoMobiliteAttitude)
	 * @generated
	 */
	void unsetAttitude();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getAttitude <em>Attitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attitude</em>' attribute is set.
	 * @see #unsetAttitude()
	 * @see #getAttitude()
	 * @see #setAttitude(TypeDictionaryDicoMobiliteAttitude)
	 * @generated
	 */
	boolean isSetAttitude();

	/**
	 * Returns the value of the '<em><b>Designation Moyen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation Moyen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation Moyen</em>' attribute.
	 * @see #setDesignationMoyen(String)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaterielOuMoyen_DesignationMoyen()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DesignationMoyen'"
	 * @generated
	 */
	String getDesignationMoyen();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getDesignationMoyen <em>Designation Moyen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designation Moyen</em>' attribute.
	 * @see #getDesignationMoyen()
	 * @generated
	 */
	void setDesignationMoyen(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMaterielOuMoyen_ConcerneTypeMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='Concerne_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMaterielOuMoyen#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Materiel</em>' containment reference.
	 * @see #getConcerneTypeMateriel()
	 * @generated
	 */
	void setConcerneTypeMateriel(TypeAssociationEXT value);

} // TypeQuantiteMaterielOuMoyen
