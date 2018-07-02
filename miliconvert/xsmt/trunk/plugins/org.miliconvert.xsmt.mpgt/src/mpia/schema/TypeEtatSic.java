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
 * A representation of the model object '<em><b>Type Etat Sic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatSic#getConfirmation <em>Confirmation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getTypeSystemeCommunication <em>Type Systeme Communication</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getNomDuReseau <em>Nom Du Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getEtatSystemeCommunication <em>Etat Systeme Communication</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getClassificationNato <em>Classification Nato</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getMarquageSpecial <em>Marquage Special</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getTypeSystemeSecurite <em>Type Systeme Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#isOperationnel <em>Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getNbAbonnesPermanents <em>Nb Abonnes Permanents</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getNbAbonnesTemporaires <em>Nb Abonnes Temporaires</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatSic#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatSic()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatSic' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatSic extends EObject {
	/**
	 * Returns the value of the '<em><b>Confirmation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRapportConfirmation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirmation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportConfirmation
	 * @see #isSetConfirmation()
	 * @see #unsetConfirmation()
	 * @see #setConfirmation(TypeDictionaryDicoRapportConfirmation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_Confirmation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Confirmation'"
	 * @generated
	 */
	TypeDictionaryDicoRapportConfirmation getConfirmation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getConfirmation <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirmation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRapportConfirmation
	 * @see #isSetConfirmation()
	 * @see #unsetConfirmation()
	 * @see #getConfirmation()
	 * @generated
	 */
	void setConfirmation(TypeDictionaryDicoRapportConfirmation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatSic#getConfirmation <em>Confirmation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfirmation()
	 * @see #getConfirmation()
	 * @see #setConfirmation(TypeDictionaryDicoRapportConfirmation)
	 * @generated
	 */
	void unsetConfirmation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatSic#getConfirmation <em>Confirmation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confirmation</em>' attribute is set.
	 * @see #unsetConfirmation()
	 * @see #getConfirmation()
	 * @see #setConfirmation(TypeDictionaryDicoRapportConfirmation)
	 * @generated
	 */
	boolean isSetConfirmation();

	/**
	 * Returns the value of the '<em><b>Type Systeme Communication</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatSicTypeSystemeCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Systeme Communication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Systeme Communication</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatSicTypeSystemeCommunication
	 * @see #isSetTypeSystemeCommunication()
	 * @see #unsetTypeSystemeCommunication()
	 * @see #setTypeSystemeCommunication(TypeDictionaryDicoEtatSicTypeSystemeCommunication)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_TypeSystemeCommunication()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeSystemeCommunication'"
	 * @generated
	 */
	TypeDictionaryDicoEtatSicTypeSystemeCommunication getTypeSystemeCommunication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getTypeSystemeCommunication <em>Type Systeme Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Systeme Communication</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatSicTypeSystemeCommunication
	 * @see #isSetTypeSystemeCommunication()
	 * @see #unsetTypeSystemeCommunication()
	 * @see #getTypeSystemeCommunication()
	 * @generated
	 */
	void setTypeSystemeCommunication(TypeDictionaryDicoEtatSicTypeSystemeCommunication value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatSic#getTypeSystemeCommunication <em>Type Systeme Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeSystemeCommunication()
	 * @see #getTypeSystemeCommunication()
	 * @see #setTypeSystemeCommunication(TypeDictionaryDicoEtatSicTypeSystemeCommunication)
	 * @generated
	 */
	void unsetTypeSystemeCommunication();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatSic#getTypeSystemeCommunication <em>Type Systeme Communication</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Systeme Communication</em>' attribute is set.
	 * @see #unsetTypeSystemeCommunication()
	 * @see #getTypeSystemeCommunication()
	 * @see #setTypeSystemeCommunication(TypeDictionaryDicoEtatSicTypeSystemeCommunication)
	 * @generated
	 */
	boolean isSetTypeSystemeCommunication();

	/**
	 * Returns the value of the '<em><b>Nom Du Reseau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Du Reseau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Du Reseau</em>' attribute.
	 * @see #setNomDuReseau(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_NomDuReseau()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='NomDuReseau'"
	 * @generated
	 */
	String getNomDuReseau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getNomDuReseau <em>Nom Du Reseau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Du Reseau</em>' attribute.
	 * @see #getNomDuReseau()
	 * @generated
	 */
	void setNomDuReseau(String value);

	/**
	 * Returns the value of the '<em><b>Etat Systeme Communication</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatSicEtatSystemeCommunication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Systeme Communication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Systeme Communication</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatSicEtatSystemeCommunication
	 * @see #isSetEtatSystemeCommunication()
	 * @see #unsetEtatSystemeCommunication()
	 * @see #setEtatSystemeCommunication(TypeDictionaryDicoEtatSicEtatSystemeCommunication)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_EtatSystemeCommunication()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatSystemeCommunication'"
	 * @generated
	 */
	TypeDictionaryDicoEtatSicEtatSystemeCommunication getEtatSystemeCommunication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getEtatSystemeCommunication <em>Etat Systeme Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Systeme Communication</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatSicEtatSystemeCommunication
	 * @see #isSetEtatSystemeCommunication()
	 * @see #unsetEtatSystemeCommunication()
	 * @see #getEtatSystemeCommunication()
	 * @generated
	 */
	void setEtatSystemeCommunication(TypeDictionaryDicoEtatSicEtatSystemeCommunication value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatSic#getEtatSystemeCommunication <em>Etat Systeme Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatSystemeCommunication()
	 * @see #getEtatSystemeCommunication()
	 * @see #setEtatSystemeCommunication(TypeDictionaryDicoEtatSicEtatSystemeCommunication)
	 * @generated
	 */
	void unsetEtatSystemeCommunication();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatSic#getEtatSystemeCommunication <em>Etat Systeme Communication</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Systeme Communication</em>' attribute is set.
	 * @see #unsetEtatSystemeCommunication()
	 * @see #getEtatSystemeCommunication()
	 * @see #setEtatSystemeCommunication(TypeDictionaryDicoEtatSicEtatSystemeCommunication)
	 * @generated
	 */
	boolean isSetEtatSystemeCommunication();

	/**
	 * Returns the value of the '<em><b>Classification Nato</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConfidentialiteOTAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Nato</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Nato</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConfidentialiteOTAN
	 * @see #isSetClassificationNato()
	 * @see #unsetClassificationNato()
	 * @see #setClassificationNato(TypeDictionaryDicoConfidentialiteOTAN)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_ClassificationNato()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ClassificationNato'"
	 * @generated
	 */
	TypeDictionaryDicoConfidentialiteOTAN getClassificationNato();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getClassificationNato <em>Classification Nato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Nato</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConfidentialiteOTAN
	 * @see #isSetClassificationNato()
	 * @see #unsetClassificationNato()
	 * @see #getClassificationNato()
	 * @generated
	 */
	void setClassificationNato(TypeDictionaryDicoConfidentialiteOTAN value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatSic#getClassificationNato <em>Classification Nato</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassificationNato()
	 * @see #getClassificationNato()
	 * @see #setClassificationNato(TypeDictionaryDicoConfidentialiteOTAN)
	 * @generated
	 */
	void unsetClassificationNato();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatSic#getClassificationNato <em>Classification Nato</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classification Nato</em>' attribute is set.
	 * @see #unsetClassificationNato()
	 * @see #getClassificationNato()
	 * @see #setClassificationNato(TypeDictionaryDicoConfidentialiteOTAN)
	 * @generated
	 */
	boolean isSetClassificationNato();

	/**
	 * Returns the value of the '<em><b>Marquage Special</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatLiaisonMarquageSpecial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marquage Special</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marquage Special</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatLiaisonMarquageSpecial
	 * @see #isSetMarquageSpecial()
	 * @see #unsetMarquageSpecial()
	 * @see #setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_MarquageSpecial()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MarquageSpecial'"
	 * @generated
	 */
	TypeDictionaryDicoEtatLiaisonMarquageSpecial getMarquageSpecial();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getMarquageSpecial <em>Marquage Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marquage Special</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatLiaisonMarquageSpecial
	 * @see #isSetMarquageSpecial()
	 * @see #unsetMarquageSpecial()
	 * @see #getMarquageSpecial()
	 * @generated
	 */
	void setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatSic#getMarquageSpecial <em>Marquage Special</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarquageSpecial()
	 * @see #getMarquageSpecial()
	 * @see #setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial)
	 * @generated
	 */
	void unsetMarquageSpecial();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatSic#getMarquageSpecial <em>Marquage Special</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marquage Special</em>' attribute is set.
	 * @see #unsetMarquageSpecial()
	 * @see #getMarquageSpecial()
	 * @see #setMarquageSpecial(TypeDictionaryDicoEtatLiaisonMarquageSpecial)
	 * @generated
	 */
	boolean isSetMarquageSpecial();

	/**
	 * Returns the value of the '<em><b>Type Systeme Securite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Systeme Securite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Systeme Securite</em>' attribute.
	 * @see #setTypeSystemeSecurite(String)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_TypeSystemeSecurite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='TypeSystemeSecurite'"
	 * @generated
	 */
	String getTypeSystemeSecurite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getTypeSystemeSecurite <em>Type Systeme Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Systeme Securite</em>' attribute.
	 * @see #getTypeSystemeSecurite()
	 * @generated
	 */
	void setTypeSystemeSecurite(String value);

	/**
	 * Returns the value of the '<em><b>Operationnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operationnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operationnel</em>' attribute.
	 * @see #isSetOperationnel()
	 * @see #unsetOperationnel()
	 * @see #setOperationnel(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_Operationnel()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Operationnel'"
	 * @generated
	 */
	boolean isOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#isOperationnel <em>Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operationnel</em>' attribute.
	 * @see #isSetOperationnel()
	 * @see #unsetOperationnel()
	 * @see #isOperationnel()
	 * @generated
	 */
	void setOperationnel(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatSic#isOperationnel <em>Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperationnel()
	 * @see #isOperationnel()
	 * @see #setOperationnel(boolean)
	 * @generated
	 */
	void unsetOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatSic#isOperationnel <em>Operationnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operationnel</em>' attribute is set.
	 * @see #unsetOperationnel()
	 * @see #isOperationnel()
	 * @see #setOperationnel(boolean)
	 * @generated
	 */
	boolean isSetOperationnel();

	/**
	 * Returns the value of the '<em><b>Nb Abonnes Permanents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Abonnes Permanents</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Abonnes Permanents</em>' attribute.
	 * @see #isSetNbAbonnesPermanents()
	 * @see #unsetNbAbonnesPermanents()
	 * @see #setNbAbonnesPermanents(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_NbAbonnesPermanents()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbAbonnesPermanents'"
	 * @generated
	 */
	long getNbAbonnesPermanents();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getNbAbonnesPermanents <em>Nb Abonnes Permanents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Abonnes Permanents</em>' attribute.
	 * @see #isSetNbAbonnesPermanents()
	 * @see #unsetNbAbonnesPermanents()
	 * @see #getNbAbonnesPermanents()
	 * @generated
	 */
	void setNbAbonnesPermanents(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatSic#getNbAbonnesPermanents <em>Nb Abonnes Permanents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbAbonnesPermanents()
	 * @see #getNbAbonnesPermanents()
	 * @see #setNbAbonnesPermanents(long)
	 * @generated
	 */
	void unsetNbAbonnesPermanents();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatSic#getNbAbonnesPermanents <em>Nb Abonnes Permanents</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Abonnes Permanents</em>' attribute is set.
	 * @see #unsetNbAbonnesPermanents()
	 * @see #getNbAbonnesPermanents()
	 * @see #setNbAbonnesPermanents(long)
	 * @generated
	 */
	boolean isSetNbAbonnesPermanents();

	/**
	 * Returns the value of the '<em><b>Nb Abonnes Temporaires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Abonnes Temporaires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Abonnes Temporaires</em>' attribute.
	 * @see #isSetNbAbonnesTemporaires()
	 * @see #unsetNbAbonnesTemporaires()
	 * @see #setNbAbonnesTemporaires(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_NbAbonnesTemporaires()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbAbonnesTemporaires'"
	 * @generated
	 */
	long getNbAbonnesTemporaires();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getNbAbonnesTemporaires <em>Nb Abonnes Temporaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Abonnes Temporaires</em>' attribute.
	 * @see #isSetNbAbonnesTemporaires()
	 * @see #unsetNbAbonnesTemporaires()
	 * @see #getNbAbonnesTemporaires()
	 * @generated
	 */
	void setNbAbonnesTemporaires(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatSic#getNbAbonnesTemporaires <em>Nb Abonnes Temporaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbAbonnesTemporaires()
	 * @see #getNbAbonnesTemporaires()
	 * @see #setNbAbonnesTemporaires(long)
	 * @generated
	 */
	void unsetNbAbonnesTemporaires();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatSic#getNbAbonnesTemporaires <em>Nb Abonnes Temporaires</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Abonnes Temporaires</em>' attribute is set.
	 * @see #unsetNbAbonnesTemporaires()
	 * @see #getNbAbonnesTemporaires()
	 * @see #setNbAbonnesTemporaires(long)
	 * @generated
	 */
	boolean isSetNbAbonnesTemporaires();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatSic_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatSic#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEtatSic
