/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Champ Mines Maritime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getCodeCouleur <em>Code Couleur</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNiveauEscompteMCM <em>Niveau Escompte MCM</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNiveauMenace <em>Niveau Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getPourcentageMenace <em>Pourcentage Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQuantiteMines <em>Quantite Mines</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getMoyensDetectionMines <em>Moyens Detection Mines</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNombreMinesDetectees <em>Nombre Mines Detectees</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQuantiteMinesDetectees <em>Quantite Mines Detectees</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getMouillage <em>Mouillage</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getProfondeurDragage <em>Profondeur Dragage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelChampMinesMaritime' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelChampMinesMaritime extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualificatif Etat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_QualificatifEtat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifEtat'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat getQualificatifEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Etat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat
	 * @see #isSetQualificatifEtat()
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @generated
	 */
	void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat)
	 * @generated
	 */
	void unsetQualificatifEtat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQualificatifEtat <em>Qualificatif Etat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Etat</em>' attribute is set.
	 * @see #unsetQualificatifEtat()
	 * @see #getQualificatifEtat()
	 * @see #setQualificatifEtat(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeQualificatifEtat)
	 * @generated
	 */
	boolean isSetQualificatifEtat();

	/**
	 * Returns the value of the '<em><b>Code Couleur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Couleur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur
	 * @see #isSetCodeCouleur()
	 * @see #unsetCodeCouleur()
	 * @see #setCodeCouleur(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_CodeCouleur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CodeCouleur'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur getCodeCouleur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getCodeCouleur <em>Code Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Couleur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur
	 * @see #isSetCodeCouleur()
	 * @see #unsetCodeCouleur()
	 * @see #getCodeCouleur()
	 * @generated
	 */
	void setCodeCouleur(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getCodeCouleur <em>Code Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodeCouleur()
	 * @see #getCodeCouleur()
	 * @see #setCodeCouleur(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur)
	 * @generated
	 */
	void unsetCodeCouleur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getCodeCouleur <em>Code Couleur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code Couleur</em>' attribute is set.
	 * @see #unsetCodeCouleur()
	 * @see #getCodeCouleur()
	 * @see #setCodeCouleur(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeCodeCouleur)
	 * @generated
	 */
	boolean isSetCodeCouleur();

	/**
	 * Returns the value of the '<em><b>Niveau Escompte MCM</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Escompte MCM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Escompte MCM</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM
	 * @see #isSetNiveauEscompteMCM()
	 * @see #unsetNiveauEscompteMCM()
	 * @see #setNiveauEscompteMCM(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_NiveauEscompteMCM()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauEscompteMCM'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM getNiveauEscompteMCM();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNiveauEscompteMCM <em>Niveau Escompte MCM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Escompte MCM</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM
	 * @see #isSetNiveauEscompteMCM()
	 * @see #unsetNiveauEscompteMCM()
	 * @see #getNiveauEscompteMCM()
	 * @generated
	 */
	void setNiveauEscompteMCM(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNiveauEscompteMCM <em>Niveau Escompte MCM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauEscompteMCM()
	 * @see #getNiveauEscompteMCM()
	 * @see #setNiveauEscompteMCM(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM)
	 * @generated
	 */
	void unsetNiveauEscompteMCM();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNiveauEscompteMCM <em>Niveau Escompte MCM</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Escompte MCM</em>' attribute is set.
	 * @see #unsetNiveauEscompteMCM()
	 * @see #getNiveauEscompteMCM()
	 * @see #setNiveauEscompteMCM(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauEscompteMCM)
	 * @generated
	 */
	boolean isSetNiveauEscompteMCM();

	/**
	 * Returns the value of the '<em><b>Niveau Menace</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace
	 * @see #isSetNiveauMenace()
	 * @see #unsetNiveauMenace()
	 * @see #setNiveauMenace(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_NiveauMenace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauMenace'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace getNiveauMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNiveauMenace <em>Niveau Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace
	 * @see #isSetNiveauMenace()
	 * @see #unsetNiveauMenace()
	 * @see #getNiveauMenace()
	 * @generated
	 */
	void setNiveauMenace(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNiveauMenace <em>Niveau Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauMenace()
	 * @see #getNiveauMenace()
	 * @see #setNiveauMenace(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace)
	 * @generated
	 */
	void unsetNiveauMenace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNiveauMenace <em>Niveau Menace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Menace</em>' attribute is set.
	 * @see #unsetNiveauMenace()
	 * @see #getNiveauMenace()
	 * @see #setNiveauMenace(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeNiveauMenace)
	 * @generated
	 */
	boolean isSetNiveauMenace();

	/**
	 * Returns the value of the '<em><b>Pourcentage Menace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Menace</em>' attribute.
	 * @see #isSetPourcentageMenace()
	 * @see #unsetPourcentageMenace()
	 * @see #setPourcentageMenace(double)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_PourcentageMenace()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='PourcentageMenace'"
	 * @generated
	 */
	double getPourcentageMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getPourcentageMenace <em>Pourcentage Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Menace</em>' attribute.
	 * @see #isSetPourcentageMenace()
	 * @see #unsetPourcentageMenace()
	 * @see #getPourcentageMenace()
	 * @generated
	 */
	void setPourcentageMenace(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getPourcentageMenace <em>Pourcentage Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageMenace()
	 * @see #getPourcentageMenace()
	 * @see #setPourcentageMenace(double)
	 * @generated
	 */
	void unsetPourcentageMenace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getPourcentageMenace <em>Pourcentage Menace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Menace</em>' attribute is set.
	 * @see #unsetPourcentageMenace()
	 * @see #getPourcentageMenace()
	 * @see #setPourcentageMenace(double)
	 * @generated
	 */
	boolean isSetPourcentageMenace();

	/**
	 * Returns the value of the '<em><b>Quantite Mines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Mines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Mines</em>' attribute.
	 * @see #isSetQuantiteMines()
	 * @see #unsetQuantiteMines()
	 * @see #setQuantiteMines(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_QuantiteMines()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='QuantiteMines'"
	 * @generated
	 */
	long getQuantiteMines();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQuantiteMines <em>Quantite Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Mines</em>' attribute.
	 * @see #isSetQuantiteMines()
	 * @see #unsetQuantiteMines()
	 * @see #getQuantiteMines()
	 * @generated
	 */
	void setQuantiteMines(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQuantiteMines <em>Quantite Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMines()
	 * @see #getQuantiteMines()
	 * @see #setQuantiteMines(long)
	 * @generated
	 */
	void unsetQuantiteMines();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQuantiteMines <em>Quantite Mines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Mines</em>' attribute is set.
	 * @see #unsetQuantiteMines()
	 * @see #getQuantiteMines()
	 * @see #setQuantiteMines(long)
	 * @generated
	 */
	boolean isSetQuantiteMines();

	/**
	 * Returns the value of the '<em><b>Moyens Detection Mines</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Detection Mines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Detection Mines</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines
	 * @see #isSetMoyensDetectionMines()
	 * @see #unsetMoyensDetectionMines()
	 * @see #setMoyensDetectionMines(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_MoyensDetectionMines()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MoyensDetectionMines'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines getMoyensDetectionMines();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getMoyensDetectionMines <em>Moyens Detection Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Detection Mines</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines
	 * @see #isSetMoyensDetectionMines()
	 * @see #unsetMoyensDetectionMines()
	 * @see #getMoyensDetectionMines()
	 * @generated
	 */
	void setMoyensDetectionMines(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getMoyensDetectionMines <em>Moyens Detection Mines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyensDetectionMines()
	 * @see #getMoyensDetectionMines()
	 * @see #setMoyensDetectionMines(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines)
	 * @generated
	 */
	void unsetMoyensDetectionMines();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getMoyensDetectionMines <em>Moyens Detection Mines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyens Detection Mines</em>' attribute is set.
	 * @see #unsetMoyensDetectionMines()
	 * @see #getMoyensDetectionMines()
	 * @see #setMoyensDetectionMines(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMoyensDetectionMines)
	 * @generated
	 */
	boolean isSetMoyensDetectionMines();

	/**
	 * Returns the value of the '<em><b>Nombre Mines Detectees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Mines Detectees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Mines Detectees</em>' attribute.
	 * @see #isSetNombreMinesDetectees()
	 * @see #unsetNombreMinesDetectees()
	 * @see #setNombreMinesDetectees(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_NombreMinesDetectees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMinesDetectees'"
	 * @generated
	 */
	long getNombreMinesDetectees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNombreMinesDetectees <em>Nombre Mines Detectees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Mines Detectees</em>' attribute.
	 * @see #isSetNombreMinesDetectees()
	 * @see #unsetNombreMinesDetectees()
	 * @see #getNombreMinesDetectees()
	 * @generated
	 */
	void setNombreMinesDetectees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNombreMinesDetectees <em>Nombre Mines Detectees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMinesDetectees()
	 * @see #getNombreMinesDetectees()
	 * @see #setNombreMinesDetectees(long)
	 * @generated
	 */
	void unsetNombreMinesDetectees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getNombreMinesDetectees <em>Nombre Mines Detectees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Mines Detectees</em>' attribute is set.
	 * @see #unsetNombreMinesDetectees()
	 * @see #getNombreMinesDetectees()
	 * @see #setNombreMinesDetectees(long)
	 * @generated
	 */
	boolean isSetNombreMinesDetectees();

	/**
	 * Returns the value of the '<em><b>Quantite Mines Detectees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Mines Detectees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Mines Detectees</em>' attribute.
	 * @see #isSetQuantiteMinesDetectees()
	 * @see #unsetQuantiteMinesDetectees()
	 * @see #setQuantiteMinesDetectees(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_QuantiteMinesDetectees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='QuantiteMinesDetectees'"
	 * @generated
	 */
	long getQuantiteMinesDetectees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQuantiteMinesDetectees <em>Quantite Mines Detectees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Mines Detectees</em>' attribute.
	 * @see #isSetQuantiteMinesDetectees()
	 * @see #unsetQuantiteMinesDetectees()
	 * @see #getQuantiteMinesDetectees()
	 * @generated
	 */
	void setQuantiteMinesDetectees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQuantiteMinesDetectees <em>Quantite Mines Detectees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMinesDetectees()
	 * @see #getQuantiteMinesDetectees()
	 * @see #setQuantiteMinesDetectees(long)
	 * @generated
	 */
	void unsetQuantiteMinesDetectees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getQuantiteMinesDetectees <em>Quantite Mines Detectees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Mines Detectees</em>' attribute is set.
	 * @see #unsetQuantiteMinesDetectees()
	 * @see #getQuantiteMinesDetectees()
	 * @see #setQuantiteMinesDetectees(long)
	 * @generated
	 */
	boolean isSetQuantiteMinesDetectees();

	/**
	 * Returns the value of the '<em><b>Mouillage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouillage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouillage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage
	 * @see #isSetMouillage()
	 * @see #unsetMouillage()
	 * @see #setMouillage(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_Mouillage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Mouillage'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage getMouillage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getMouillage <em>Mouillage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouillage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage
	 * @see #isSetMouillage()
	 * @see #unsetMouillage()
	 * @see #getMouillage()
	 * @generated
	 */
	void setMouillage(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getMouillage <em>Mouillage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMouillage()
	 * @see #getMouillage()
	 * @see #setMouillage(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage)
	 * @generated
	 */
	void unsetMouillage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getMouillage <em>Mouillage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mouillage</em>' attribute is set.
	 * @see #unsetMouillage()
	 * @see #getMouillage()
	 * @see #setMouillage(TypeDictionaryDicoEtatOperationnelChampMinesMaritimeMouillage)
	 * @generated
	 */
	boolean isSetMouillage();

	/**
	 * Returns the value of the '<em><b>Profondeur Dragage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profondeur Dragage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profondeur Dragage</em>' containment reference.
	 * @see #setProfondeurDragage(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelChampMinesMaritime_ProfondeurDragage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProfondeurDragage'"
	 * @generated
	 */
	TypeDataTypeLongueur getProfondeurDragage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelChampMinesMaritime#getProfondeurDragage <em>Profondeur Dragage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profondeur Dragage</em>' containment reference.
	 * @see #getProfondeurDragage()
	 * @generated
	 */
	void setProfondeurDragage(TypeDataTypeLongueur value);

} // TypeEtatOperationnelChampMinesMaritime
