/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Equipement ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeEquipementASS#getNiveauPriorite <em>Niveau Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipementASS#getCaracteristiques <em>Caracteristiques</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEquipementASS#getNbrFardeau <em>Nbr Fardeau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeEquipementASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeEquipementASS' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeEquipementASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Niveau Priorite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Priorite</em>' attribute.
	 * @see #isSetNiveauPriorite()
	 * @see #unsetNiveauPriorite()
	 * @see #setNiveauPriorite(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipementASS_NiveauPriorite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NiveauPriorite'"
	 * @generated
	 */
	long getNiveauPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipementASS#getNiveauPriorite <em>Niveau Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Priorite</em>' attribute.
	 * @see #isSetNiveauPriorite()
	 * @see #unsetNiveauPriorite()
	 * @see #getNiveauPriorite()
	 * @generated
	 */
	void setNiveauPriorite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEquipementASS#getNiveauPriorite <em>Niveau Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauPriorite()
	 * @see #getNiveauPriorite()
	 * @see #setNiveauPriorite(long)
	 * @generated
	 */
	void unsetNiveauPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEquipementASS#getNiveauPriorite <em>Niveau Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Priorite</em>' attribute is set.
	 * @see #unsetNiveauPriorite()
	 * @see #getNiveauPriorite()
	 * @see #setNiveauPriorite(long)
	 * @generated
	 */
	boolean isSetNiveauPriorite();

	/**
	 * Returns the value of the '<em><b>Caracteristiques</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeEquipementASSCaracteristiques}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caracteristiques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caracteristiques</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEquipementASSCaracteristiques
	 * @see #isSetCaracteristiques()
	 * @see #unsetCaracteristiques()
	 * @see #setCaracteristiques(TypeDictionaryDicoTypeEquipementASSCaracteristiques)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipementASS_Caracteristiques()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Caracteristiques'"
	 * @generated
	 */
	TypeDictionaryDicoTypeEquipementASSCaracteristiques getCaracteristiques();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipementASS#getCaracteristiques <em>Caracteristiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caracteristiques</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEquipementASSCaracteristiques
	 * @see #isSetCaracteristiques()
	 * @see #unsetCaracteristiques()
	 * @see #getCaracteristiques()
	 * @generated
	 */
	void setCaracteristiques(TypeDictionaryDicoTypeEquipementASSCaracteristiques value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEquipementASS#getCaracteristiques <em>Caracteristiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaracteristiques()
	 * @see #getCaracteristiques()
	 * @see #setCaracteristiques(TypeDictionaryDicoTypeEquipementASSCaracteristiques)
	 * @generated
	 */
	void unsetCaracteristiques();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEquipementASS#getCaracteristiques <em>Caracteristiques</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caracteristiques</em>' attribute is set.
	 * @see #unsetCaracteristiques()
	 * @see #getCaracteristiques()
	 * @see #setCaracteristiques(TypeDictionaryDicoTypeEquipementASSCaracteristiques)
	 * @generated
	 */
	boolean isSetCaracteristiques();

	/**
	 * Returns the value of the '<em><b>Nbr Fardeau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Fardeau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Fardeau</em>' attribute.
	 * @see #isSetNbrFardeau()
	 * @see #unsetNbrFardeau()
	 * @see #setNbrFardeau(long)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEquipementASS_NbrFardeau()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbrFardeau'"
	 * @generated
	 */
	long getNbrFardeau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEquipementASS#getNbrFardeau <em>Nbr Fardeau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Fardeau</em>' attribute.
	 * @see #isSetNbrFardeau()
	 * @see #unsetNbrFardeau()
	 * @see #getNbrFardeau()
	 * @generated
	 */
	void setNbrFardeau(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEquipementASS#getNbrFardeau <em>Nbr Fardeau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbrFardeau()
	 * @see #getNbrFardeau()
	 * @see #setNbrFardeau(long)
	 * @generated
	 */
	void unsetNbrFardeau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEquipementASS#getNbrFardeau <em>Nbr Fardeau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nbr Fardeau</em>' attribute is set.
	 * @see #unsetNbrFardeau()
	 * @see #getNbrFardeau()
	 * @see #setNbrFardeau(long)
	 * @generated
	 */
	boolean isSetNbrFardeau();

} // TypeTypeEquipementASS
