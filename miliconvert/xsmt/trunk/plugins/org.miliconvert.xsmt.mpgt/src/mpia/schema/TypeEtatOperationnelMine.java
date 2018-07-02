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
 * A representation of the model object '<em><b>Type Etat Operationnel Mine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMine#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMine#getQualificatifEtatMineMaritime <em>Qualificatif Etat Mine Maritime</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMine#getPourcentageEnfouissement <em>Pourcentage Enfouissement</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelMine#getEffetParachutage <em>Effet Parachutage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMine()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelMine' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelMine extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualificatif Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMineQualificatifEtat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMineQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMineQualificatifEtat)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMine_QualificatifEtat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifEtat'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMineQualificatifEtat getQualificatifEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMineQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @generated
	 */
	void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMineQualificatifEtat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMineQualificatifEtat)
	 * @generated
	 */
	void unsetQualificatifEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Etat</em>' attribute is set.
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMineQualificatifEtat)
	 * @generated
	 */
	boolean isSetQualificatifEtat();

	/**
	 * Returns the value of the '<em><b>Qualificatif Etat Mine Maritime</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Etat Mine Maritime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Etat Mine Maritime</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime
	 * @see #isSetQualificatifEtatMineMaritime()
	 * @see #unsetQualificatifEtatMineMaritime()
	 * @see #setQualificatifEtatMineMaritime(TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMine_QualificatifEtatMineMaritime()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifEtatMineMaritime'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime getQualificatifEtatMineMaritime();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getQualificatifEtatMineMaritime <em>Qualificatif Etat Mine Maritime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Etat Mine Maritime</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime
	 * @see #isSetQualificatifEtatMineMaritime()
	 * @see #unsetQualificatifEtatMineMaritime()
	 * @see #getQualificatifEtatMineMaritime()
	 * @generated
	 */
	void setQualificatifEtatMineMaritime(TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getQualificatifEtatMineMaritime <em>Qualificatif Etat Mine Maritime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifEtatMineMaritime()
	 * @see #getQualificatifEtatMineMaritime()
	 * @see #setQualificatifEtatMineMaritime(TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime)
	 * @generated
	 */
	void unsetQualificatifEtatMineMaritime();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getQualificatifEtatMineMaritime <em>Qualificatif Etat Mine Maritime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Etat Mine Maritime</em>' attribute is set.
	 * @see #unsetQualificatifEtatMineMaritime()
	 * @see #getQualificatifEtatMineMaritime()
	 * @see #setQualificatifEtatMineMaritime(TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime)
	 * @generated
	 */
	boolean isSetQualificatifEtatMineMaritime();

	/**
	 * Returns the value of the '<em><b>Pourcentage Enfouissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Enfouissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Enfouissement</em>' attribute.
	 * @see #isSetPourcentageEnfouissement()
	 * @see #unsetPourcentageEnfouissement()
	 * @see #setPourcentageEnfouissement(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMine_PourcentageEnfouissement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='PourcentageEnfouissement'"
	 * @generated
	 */
	double getPourcentageEnfouissement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getPourcentageEnfouissement <em>Pourcentage Enfouissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Enfouissement</em>' attribute.
	 * @see #isSetPourcentageEnfouissement()
	 * @see #unsetPourcentageEnfouissement()
	 * @see #getPourcentageEnfouissement()
	 * @generated
	 */
	void setPourcentageEnfouissement(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getPourcentageEnfouissement <em>Pourcentage Enfouissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageEnfouissement()
	 * @see #getPourcentageEnfouissement()
	 * @see #setPourcentageEnfouissement(double)
	 * @generated
	 */
	void unsetPourcentageEnfouissement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getPourcentageEnfouissement <em>Pourcentage Enfouissement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Enfouissement</em>' attribute is set.
	 * @see #unsetPourcentageEnfouissement()
	 * @see #getPourcentageEnfouissement()
	 * @see #setPourcentageEnfouissement(double)
	 * @generated
	 */
	boolean isSetPourcentageEnfouissement();

	/**
	 * Returns the value of the '<em><b>Effet Parachutage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelMineEffetParachutage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Parachutage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Parachutage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMineEffetParachutage
	 * @see #isSetEffetParachutage()
	 * @see #unsetEffetParachutage()
	 * @see #setEffetParachutage(TypeDictionaryDicoEtatOperationnelMineEffetParachutage)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelMine_EffetParachutage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetParachutage'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelMineEffetParachutage getEffetParachutage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getEffetParachutage <em>Effet Parachutage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Parachutage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelMineEffetParachutage
	 * @see #isSetEffetParachutage()
	 * @see #unsetEffetParachutage()
	 * @see #getEffetParachutage()
	 * @generated
	 */
	void setEffetParachutage(TypeDictionaryDicoEtatOperationnelMineEffetParachutage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getEffetParachutage <em>Effet Parachutage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetParachutage()
	 * @see #getEffetParachutage()
	 * @see #setEffetParachutage(TypeDictionaryDicoEtatOperationnelMineEffetParachutage)
	 * @generated
	 */
	void unsetEffetParachutage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelMine#getEffetParachutage <em>Effet Parachutage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Parachutage</em>' attribute is set.
	 * @see #unsetEffetParachutage()
	 * @see #getEffetParachutage()
	 * @see #setEffetParachutage(TypeDictionaryDicoEtatOperationnelMineEffetParachutage)
	 * @generated
	 */
	boolean isSetEffetParachutage();

} // TypeEtatOperationnelMine
