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
 * A representation of the model object '<em><b>Type Batiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBatiment#getIndicatifInternational <em>Indicatif International</em>}</li>
 *   <li>{@link mpia.schema.TypeBatiment#getTrigramme <em>Trigramme</em>}</li>
 *   <li>{@link mpia.schema.TypeBatiment#getNumeroDansClasse <em>Numero Dans Classe</em>}</li>
 *   <li>{@link mpia.schema.TypeBatiment#getEtatMouvement <em>Etat Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeBatiment#getAPourArticulationArticulationMarine <em>APour Articulation Articulation Marine</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBatiment()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Batiment' kind='elementOnly'"
 * @generated
 */
public interface TypeBatiment extends TypeMateriel {
	/**
	 * Returns the value of the '<em><b>Indicatif International</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicatif International</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicatif International</em>' attribute.
	 * @see #setIndicatifInternational(String)
	 * @see mpia.schema.SchemaPackage#getTypeBatiment_IndicatifInternational()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='IndicatifInternational'"
	 * @generated
	 */
	String getIndicatifInternational();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBatiment#getIndicatifInternational <em>Indicatif International</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicatif International</em>' attribute.
	 * @see #getIndicatifInternational()
	 * @generated
	 */
	void setIndicatifInternational(String value);

	/**
	 * Returns the value of the '<em><b>Trigramme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigramme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigramme</em>' attribute.
	 * @see #setTrigramme(String)
	 * @see mpia.schema.SchemaPackage#getTypeBatiment_Trigramme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='Trigramme'"
	 * @generated
	 */
	String getTrigramme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBatiment#getTrigramme <em>Trigramme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigramme</em>' attribute.
	 * @see #getTrigramme()
	 * @generated
	 */
	void setTrigramme(String value);

	/**
	 * Returns the value of the '<em><b>Numero Dans Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Dans Classe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Dans Classe</em>' attribute.
	 * @see #isSetNumeroDansClasse()
	 * @see #unsetNumeroDansClasse()
	 * @see #setNumeroDansClasse(long)
	 * @see mpia.schema.SchemaPackage#getTypeBatiment_NumeroDansClasse()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroDansClasse'"
	 * @generated
	 */
	long getNumeroDansClasse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBatiment#getNumeroDansClasse <em>Numero Dans Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Dans Classe</em>' attribute.
	 * @see #isSetNumeroDansClasse()
	 * @see #unsetNumeroDansClasse()
	 * @see #getNumeroDansClasse()
	 * @generated
	 */
	void setNumeroDansClasse(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBatiment#getNumeroDansClasse <em>Numero Dans Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroDansClasse()
	 * @see #getNumeroDansClasse()
	 * @see #setNumeroDansClasse(long)
	 * @generated
	 */
	void unsetNumeroDansClasse();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBatiment#getNumeroDansClasse <em>Numero Dans Classe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Dans Classe</em>' attribute is set.
	 * @see #unsetNumeroDansClasse()
	 * @see #getNumeroDansClasse()
	 * @see #setNumeroDansClasse(long)
	 * @generated
	 */
	boolean isSetNumeroDansClasse();

	/**
	 * Returns the value of the '<em><b>Etat Mouvement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatMouvement
	 * @see #isSetEtatMouvement()
	 * @see #unsetEtatMouvement()
	 * @see #setEtatMouvement(TypeDictionaryDicoEtatMouvement)
	 * @see mpia.schema.SchemaPackage#getTypeBatiment_EtatMouvement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatMouvement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatMouvement getEtatMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBatiment#getEtatMouvement <em>Etat Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatMouvement
	 * @see #isSetEtatMouvement()
	 * @see #unsetEtatMouvement()
	 * @see #getEtatMouvement()
	 * @generated
	 */
	void setEtatMouvement(TypeDictionaryDicoEtatMouvement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBatiment#getEtatMouvement <em>Etat Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatMouvement()
	 * @see #getEtatMouvement()
	 * @see #setEtatMouvement(TypeDictionaryDicoEtatMouvement)
	 * @generated
	 */
	void unsetEtatMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBatiment#getEtatMouvement <em>Etat Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Mouvement</em>' attribute is set.
	 * @see #unsetEtatMouvement()
	 * @see #getEtatMouvement()
	 * @see #setEtatMouvement(TypeDictionaryDicoEtatMouvement)
	 * @generated
	 */
	boolean isSetEtatMouvement();

	/**
	 * Returns the value of the '<em><b>APour Articulation Articulation Marine</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Articulation Articulation Marine</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Articulation Articulation Marine</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBatiment_APourArticulationArticulationMarine()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourBatimentsParticipants_Batiment' target_entity='type_ArticulationMarine'"
	 *        extendedMetaData="kind='element' name='APourArticulation_ArticulationMarine'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourArticulationArticulationMarine();

} // TypeBatiment
