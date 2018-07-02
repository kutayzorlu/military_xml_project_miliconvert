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
 * A representation of the model object '<em><b>Type Comptage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeComptage#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#getQualificatifCompte <em>Qualificatif Compte</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#getMaladie <em>Maladie</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#isEstTransmissible <em>Est Transmissible</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#getGroupeAge <em>Groupe Age</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#getLangue <em>Langue</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#getDelaiTraitement <em>Delai Traitement</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeComptage#getEstComptePourTypePersonne <em>Est Compte Pour Type Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeComptage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Comptage' kind='elementOnly'"
 * @generated
 */
public interface TypeComptage extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeComptage_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getQuantite <em>Quantite</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeComptage#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeComptage#getQuantite <em>Quantite</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Qualificatif Compte</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoComptageQualificatifCompte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Compte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Compte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComptageQualificatifCompte
	 * @see #isSetQualificatifCompte()
	 * @see #unsetQualificatifCompte()
	 * @see #setQualificatifCompte(TypeDictionaryDicoComptageQualificatifCompte)
	 * @see mpia.schema.SchemaPackage#getTypeComptage_QualificatifCompte()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifCompte'"
	 * @generated
	 */
	TypeDictionaryDicoComptageQualificatifCompte getQualificatifCompte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getQualificatifCompte <em>Qualificatif Compte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Compte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComptageQualificatifCompte
	 * @see #isSetQualificatifCompte()
	 * @see #unsetQualificatifCompte()
	 * @see #getQualificatifCompte()
	 * @generated
	 */
	void setQualificatifCompte(TypeDictionaryDicoComptageQualificatifCompte value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeComptage#getQualificatifCompte <em>Qualificatif Compte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifCompte()
	 * @see #getQualificatifCompte()
	 * @see #setQualificatifCompte(TypeDictionaryDicoComptageQualificatifCompte)
	 * @generated
	 */
	void unsetQualificatifCompte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeComptage#getQualificatifCompte <em>Qualificatif Compte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Compte</em>' attribute is set.
	 * @see #unsetQualificatifCompte()
	 * @see #getQualificatifCompte()
	 * @see #setQualificatifCompte(TypeDictionaryDicoComptageQualificatifCompte)
	 * @generated
	 */
	boolean isSetQualificatifCompte();

	/**
	 * Returns the value of the '<em><b>Maladie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoComptageMaladie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maladie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maladie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComptageMaladie
	 * @see #isSetMaladie()
	 * @see #unsetMaladie()
	 * @see #setMaladie(TypeDictionaryDicoComptageMaladie)
	 * @see mpia.schema.SchemaPackage#getTypeComptage_Maladie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Maladie'"
	 * @generated
	 */
	TypeDictionaryDicoComptageMaladie getMaladie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getMaladie <em>Maladie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maladie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComptageMaladie
	 * @see #isSetMaladie()
	 * @see #unsetMaladie()
	 * @see #getMaladie()
	 * @generated
	 */
	void setMaladie(TypeDictionaryDicoComptageMaladie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeComptage#getMaladie <em>Maladie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaladie()
	 * @see #getMaladie()
	 * @see #setMaladie(TypeDictionaryDicoComptageMaladie)
	 * @generated
	 */
	void unsetMaladie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeComptage#getMaladie <em>Maladie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maladie</em>' attribute is set.
	 * @see #unsetMaladie()
	 * @see #getMaladie()
	 * @see #setMaladie(TypeDictionaryDicoComptageMaladie)
	 * @generated
	 */
	boolean isSetMaladie();

	/**
	 * Returns the value of the '<em><b>Est Transmissible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Transmissible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Transmissible</em>' attribute.
	 * @see #isSetEstTransmissible()
	 * @see #unsetEstTransmissible()
	 * @see #setEstTransmissible(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeComptage_EstTransmissible()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EstTransmissible'"
	 * @generated
	 */
	boolean isEstTransmissible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#isEstTransmissible <em>Est Transmissible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Transmissible</em>' attribute.
	 * @see #isSetEstTransmissible()
	 * @see #unsetEstTransmissible()
	 * @see #isEstTransmissible()
	 * @generated
	 */
	void setEstTransmissible(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeComptage#isEstTransmissible <em>Est Transmissible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstTransmissible()
	 * @see #isEstTransmissible()
	 * @see #setEstTransmissible(boolean)
	 * @generated
	 */
	void unsetEstTransmissible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeComptage#isEstTransmissible <em>Est Transmissible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Est Transmissible</em>' attribute is set.
	 * @see #unsetEstTransmissible()
	 * @see #isEstTransmissible()
	 * @see #setEstTransmissible(boolean)
	 * @generated
	 */
	boolean isSetEstTransmissible();

	/**
	 * Returns the value of the '<em><b>Groupe Age</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoComptageGroupeAge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groupe Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groupe Age</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComptageGroupeAge
	 * @see #isSetGroupeAge()
	 * @see #unsetGroupeAge()
	 * @see #setGroupeAge(TypeDictionaryDicoComptageGroupeAge)
	 * @see mpia.schema.SchemaPackage#getTypeComptage_GroupeAge()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='GroupeAge'"
	 * @generated
	 */
	TypeDictionaryDicoComptageGroupeAge getGroupeAge();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getGroupeAge <em>Groupe Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groupe Age</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComptageGroupeAge
	 * @see #isSetGroupeAge()
	 * @see #unsetGroupeAge()
	 * @see #getGroupeAge()
	 * @generated
	 */
	void setGroupeAge(TypeDictionaryDicoComptageGroupeAge value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeComptage#getGroupeAge <em>Groupe Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupeAge()
	 * @see #getGroupeAge()
	 * @see #setGroupeAge(TypeDictionaryDicoComptageGroupeAge)
	 * @generated
	 */
	void unsetGroupeAge();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeComptage#getGroupeAge <em>Groupe Age</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Groupe Age</em>' attribute is set.
	 * @see #unsetGroupeAge()
	 * @see #getGroupeAge()
	 * @see #setGroupeAge(TypeDictionaryDicoComptageGroupeAge)
	 * @generated
	 */
	boolean isSetGroupeAge();

	/**
	 * Returns the value of the '<em><b>Langue</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLangue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Langue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Langue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLangue
	 * @see #isSetLangue()
	 * @see #unsetLangue()
	 * @see #setLangue(TypeDictionaryDicoLangue)
	 * @see mpia.schema.SchemaPackage#getTypeComptage_Langue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Langue'"
	 * @generated
	 */
	TypeDictionaryDicoLangue getLangue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getLangue <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Langue</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLangue
	 * @see #isSetLangue()
	 * @see #unsetLangue()
	 * @see #getLangue()
	 * @generated
	 */
	void setLangue(TypeDictionaryDicoLangue value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeComptage#getLangue <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLangue()
	 * @see #getLangue()
	 * @see #setLangue(TypeDictionaryDicoLangue)
	 * @generated
	 */
	void unsetLangue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeComptage#getLangue <em>Langue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Langue</em>' attribute is set.
	 * @see #unsetLangue()
	 * @see #getLangue()
	 * @see #setLangue(TypeDictionaryDicoLangue)
	 * @generated
	 */
	boolean isSetLangue();

	/**
	 * Returns the value of the '<em><b>Delai Traitement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoComptageDelaiTraitement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delai Traitement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delai Traitement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComptageDelaiTraitement
	 * @see #isSetDelaiTraitement()
	 * @see #unsetDelaiTraitement()
	 * @see #setDelaiTraitement(TypeDictionaryDicoComptageDelaiTraitement)
	 * @see mpia.schema.SchemaPackage#getTypeComptage_DelaiTraitement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DelaiTraitement'"
	 * @generated
	 */
	TypeDictionaryDicoComptageDelaiTraitement getDelaiTraitement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getDelaiTraitement <em>Delai Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delai Traitement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComptageDelaiTraitement
	 * @see #isSetDelaiTraitement()
	 * @see #unsetDelaiTraitement()
	 * @see #getDelaiTraitement()
	 * @generated
	 */
	void setDelaiTraitement(TypeDictionaryDicoComptageDelaiTraitement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeComptage#getDelaiTraitement <em>Delai Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelaiTraitement()
	 * @see #getDelaiTraitement()
	 * @see #setDelaiTraitement(TypeDictionaryDicoComptageDelaiTraitement)
	 * @generated
	 */
	void unsetDelaiTraitement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeComptage#getDelaiTraitement <em>Delai Traitement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delai Traitement</em>' attribute is set.
	 * @see #unsetDelaiTraitement()
	 * @see #getDelaiTraitement()
	 * @see #setDelaiTraitement(TypeDictionaryDicoComptageDelaiTraitement)
	 * @generated
	 */
	boolean isSetDelaiTraitement();

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
	 * @see mpia.schema.SchemaPackage#getTypeComptage_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeComptage_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Compte Pour Type Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Compte Pour Type Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Compte Pour Type Personne</em>' containment reference.
	 * @see #setEstComptePourTypePersonne(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeComptage_EstComptePourTypePersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypePersonne'"
	 *        extendedMetaData="kind='element' name='EstComptePour_TypePersonne'"
	 * @generated
	 */
	TypeAssociationEXT getEstComptePourTypePersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComptage#getEstComptePourTypePersonne <em>Est Compte Pour Type Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Compte Pour Type Personne</em>' containment reference.
	 * @see #getEstComptePourTypePersonne()
	 * @generated
	 */
	void setEstComptePourTypePersonne(TypeAssociationEXT value);

} // TypeComptage
