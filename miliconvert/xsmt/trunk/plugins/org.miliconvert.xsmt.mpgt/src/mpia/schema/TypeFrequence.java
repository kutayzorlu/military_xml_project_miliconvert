/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDateHeure;
import mpia.meta.TypeDataTypeFrequence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Frequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeFrequence#getReferenceAOPT <em>Reference AOPT</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getFrequence <em>Frequence</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getNumeroCanal <em>Numero Canal</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getNomCode <em>Nom Code</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getCategorieRestriction <em>Categorie Restriction</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getFrequenceMinimale <em>Frequence Minimale</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getFrequenceMaximale <em>Frequence Maximale</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getBandeFrequence <em>Bande Frequence</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getIdentificationBande <em>Identification Bande</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getModulation <em>Modulation</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getFinalite <em>Finalite</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeFrequence#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeFrequence()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Frequence' kind='elementOnly'"
 * @generated
 */
public interface TypeFrequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference AOPT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference AOPT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference AOPT</em>' attribute.
	 * @see #setReferenceAOPT(String)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_ReferenceAOPT()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='ReferenceAOPT'"
	 * @generated
	 */
	String getReferenceAOPT();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getReferenceAOPT <em>Reference AOPT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference AOPT</em>' attribute.
	 * @see #getReferenceAOPT()
	 * @generated
	 */
	void setReferenceAOPT(String value);

	/**
	 * Returns the value of the '<em><b>Frequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequence</em>' containment reference.
	 * @see #setFrequence(TypeDataTypeFrequence)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_Frequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Frequence'"
	 * @generated
	 */
	TypeDataTypeFrequence getFrequence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getFrequence <em>Frequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequence</em>' containment reference.
	 * @see #getFrequence()
	 * @generated
	 */
	void setFrequence(TypeDataTypeFrequence value);

	/**
	 * Returns the value of the '<em><b>Numero Canal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Canal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Canal</em>' attribute.
	 * @see #isSetNumeroCanal()
	 * @see #unsetNumeroCanal()
	 * @see #setNumeroCanal(long)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_NumeroCanal()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroCanal'"
	 * @generated
	 */
	long getNumeroCanal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getNumeroCanal <em>Numero Canal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Canal</em>' attribute.
	 * @see #isSetNumeroCanal()
	 * @see #unsetNumeroCanal()
	 * @see #getNumeroCanal()
	 * @generated
	 */
	void setNumeroCanal(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeFrequence#getNumeroCanal <em>Numero Canal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroCanal()
	 * @see #getNumeroCanal()
	 * @see #setNumeroCanal(long)
	 * @generated
	 */
	void unsetNumeroCanal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeFrequence#getNumeroCanal <em>Numero Canal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Canal</em>' attribute is set.
	 * @see #unsetNumeroCanal()
	 * @see #getNumeroCanal()
	 * @see #setNumeroCanal(long)
	 * @generated
	 */
	boolean isSetNumeroCanal();

	/**
	 * Returns the value of the '<em><b>Nom Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Code</em>' attribute.
	 * @see #setNomCode(String)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_NomCode()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='NomCode'"
	 * @generated
	 */
	String getNomCode();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getNomCode <em>Nom Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Code</em>' attribute.
	 * @see #getNomCode()
	 * @generated
	 */
	void setNomCode(String value);

	/**
	 * Returns the value of the '<em><b>Categorie Restriction</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoFrequenceCategorieRestriction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Restriction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Restriction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceCategorieRestriction
	 * @see #isSetCategorieRestriction()
	 * @see #unsetCategorieRestriction()
	 * @see #setCategorieRestriction(TypeDictionaryDicoFrequenceCategorieRestriction)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_CategorieRestriction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CategorieRestriction'"
	 * @generated
	 */
	TypeDictionaryDicoFrequenceCategorieRestriction getCategorieRestriction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getCategorieRestriction <em>Categorie Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Restriction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceCategorieRestriction
	 * @see #isSetCategorieRestriction()
	 * @see #unsetCategorieRestriction()
	 * @see #getCategorieRestriction()
	 * @generated
	 */
	void setCategorieRestriction(TypeDictionaryDicoFrequenceCategorieRestriction value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeFrequence#getCategorieRestriction <em>Categorie Restriction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieRestriction()
	 * @see #getCategorieRestriction()
	 * @see #setCategorieRestriction(TypeDictionaryDicoFrequenceCategorieRestriction)
	 * @generated
	 */
	void unsetCategorieRestriction();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeFrequence#getCategorieRestriction <em>Categorie Restriction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Restriction</em>' attribute is set.
	 * @see #unsetCategorieRestriction()
	 * @see #getCategorieRestriction()
	 * @see #setCategorieRestriction(TypeDictionaryDicoFrequenceCategorieRestriction)
	 * @generated
	 */
	boolean isSetCategorieRestriction();

	/**
	 * Returns the value of the '<em><b>Frequence Minimale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequence Minimale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequence Minimale</em>' containment reference.
	 * @see #setFrequenceMinimale(TypeDataTypeFrequence)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_FrequenceMinimale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FrequenceMinimale'"
	 * @generated
	 */
	TypeDataTypeFrequence getFrequenceMinimale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getFrequenceMinimale <em>Frequence Minimale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequence Minimale</em>' containment reference.
	 * @see #getFrequenceMinimale()
	 * @generated
	 */
	void setFrequenceMinimale(TypeDataTypeFrequence value);

	/**
	 * Returns the value of the '<em><b>Frequence Maximale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequence Maximale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequence Maximale</em>' containment reference.
	 * @see #setFrequenceMaximale(TypeDataTypeFrequence)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_FrequenceMaximale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FrequenceMaximale'"
	 * @generated
	 */
	TypeDataTypeFrequence getFrequenceMaximale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getFrequenceMaximale <em>Frequence Maximale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequence Maximale</em>' containment reference.
	 * @see #getFrequenceMaximale()
	 * @generated
	 */
	void setFrequenceMaximale(TypeDataTypeFrequence value);

	/**
	 * Returns the value of the '<em><b>Bande Frequence</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoFrequenceBandeFrequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bande Frequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bande Frequence</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceBandeFrequence
	 * @see #isSetBandeFrequence()
	 * @see #unsetBandeFrequence()
	 * @see #setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_BandeFrequence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='BandeFrequence'"
	 * @generated
	 */
	TypeDictionaryDicoFrequenceBandeFrequence getBandeFrequence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getBandeFrequence <em>Bande Frequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bande Frequence</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceBandeFrequence
	 * @see #isSetBandeFrequence()
	 * @see #unsetBandeFrequence()
	 * @see #getBandeFrequence()
	 * @generated
	 */
	void setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeFrequence#getBandeFrequence <em>Bande Frequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBandeFrequence()
	 * @see #getBandeFrequence()
	 * @see #setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence)
	 * @generated
	 */
	void unsetBandeFrequence();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeFrequence#getBandeFrequence <em>Bande Frequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bande Frequence</em>' attribute is set.
	 * @see #unsetBandeFrequence()
	 * @see #getBandeFrequence()
	 * @see #setBandeFrequence(TypeDictionaryDicoFrequenceBandeFrequence)
	 * @generated
	 */
	boolean isSetBandeFrequence();

	/**
	 * Returns the value of the '<em><b>Identification Bande</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoFrequenceIdentificationBande}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identification Bande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Bande</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceIdentificationBande
	 * @see #isSetIdentificationBande()
	 * @see #unsetIdentificationBande()
	 * @see #setIdentificationBande(TypeDictionaryDicoFrequenceIdentificationBande)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_IdentificationBande()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='IdentificationBande'"
	 * @generated
	 */
	TypeDictionaryDicoFrequenceIdentificationBande getIdentificationBande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getIdentificationBande <em>Identification Bande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identification Bande</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceIdentificationBande
	 * @see #isSetIdentificationBande()
	 * @see #unsetIdentificationBande()
	 * @see #getIdentificationBande()
	 * @generated
	 */
	void setIdentificationBande(TypeDictionaryDicoFrequenceIdentificationBande value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeFrequence#getIdentificationBande <em>Identification Bande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentificationBande()
	 * @see #getIdentificationBande()
	 * @see #setIdentificationBande(TypeDictionaryDicoFrequenceIdentificationBande)
	 * @generated
	 */
	void unsetIdentificationBande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeFrequence#getIdentificationBande <em>Identification Bande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identification Bande</em>' attribute is set.
	 * @see #unsetIdentificationBande()
	 * @see #getIdentificationBande()
	 * @see #setIdentificationBande(TypeDictionaryDicoFrequenceIdentificationBande)
	 * @generated
	 */
	boolean isSetIdentificationBande();

	/**
	 * Returns the value of the '<em><b>Modulation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoFrequenceModulation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modulation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modulation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceModulation
	 * @see #isSetModulation()
	 * @see #unsetModulation()
	 * @see #setModulation(TypeDictionaryDicoFrequenceModulation)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_Modulation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Modulation'"
	 * @generated
	 */
	TypeDictionaryDicoFrequenceModulation getModulation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getModulation <em>Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoFrequenceModulation
	 * @see #isSetModulation()
	 * @see #unsetModulation()
	 * @see #getModulation()
	 * @generated
	 */
	void setModulation(TypeDictionaryDicoFrequenceModulation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeFrequence#getModulation <em>Modulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModulation()
	 * @see #getModulation()
	 * @see #setModulation(TypeDictionaryDicoFrequenceModulation)
	 * @generated
	 */
	void unsetModulation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeFrequence#getModulation <em>Modulation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modulation</em>' attribute is set.
	 * @see #unsetModulation()
	 * @see #getModulation()
	 * @see #setModulation(TypeDictionaryDicoFrequenceModulation)
	 * @generated
	 */
	boolean isSetModulation();

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' containment reference.
	 * @see #setDateDebut(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_DateDebut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getDateDebut <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' containment reference.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' containment reference.
	 * @see #setDateFin(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_DateFin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getDateFin <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' containment reference.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Finalite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalite</em>' attribute.
	 * @see #setFinalite(String)
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_Finalite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Finalite'"
	 * @generated
	 */
	String getFinalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getFinalite <em>Finalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalite</em>' attribute.
	 * @see #getFinalite()
	 * @generated
	 */
	void setFinalite(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeFrequence_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeFrequence#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeFrequence
