/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDocument#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getPhaseCycleVie <em>Phase Cycle Vie</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getTitreCourt <em>Titre Court</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getReference <em>Reference</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getVerification <em>Verification</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getTitre <em>Titre</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getVersion <em>Version</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getSujet <em>Sujet</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getMotsCles <em>Mots Cles</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getAuteur <em>Auteur</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getLangue <em>Langue</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getCheminAcces <em>Chemin Acces</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getEmplacement <em>Emplacement</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getFormat <em>Format</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getSupport <em>Support</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getSourceInformatique <em>Source Informatique</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getTailleFichierInformatique <em>Taille Fichier Informatique</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getTaillePhysique <em>Taille Physique</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getDateCreation <em>Date Creation</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getDateModification <em>Date Modification</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getDateApprobation <em>Date Approbation</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getDatePublication <em>Date Publication</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getDebutValidite <em>Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getFinValidite <em>Fin Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getModeTransmission <em>Mode Transmission</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getRestrictionsDiffusion <em>Restrictions Diffusion</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getObservations <em>Observations</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getDocumenteAssociationObjectifCiblageDocument <em>Documente Association Objectif Ciblage Document</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getDocumenteCapaciteAssociationDocumentCapacite <em>Documente Capacite Association Document Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeDocument#getDocumenteAssociationRacineOperationnelleDocument <em>Documente Association Racine Operationnelle Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDocument()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Document' kind='elementOnly'"
 * @generated
 */
public interface TypeDocument extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDocumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoDocumentType)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoDocumentType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoDocumentType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDocument#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoDocumentType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDocument#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoDocumentType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Phase Cycle Vie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDocumentPhaseCycleVie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase Cycle Vie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase Cycle Vie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentPhaseCycleVie
	 * @see #isSetPhaseCycleVie()
	 * @see #unsetPhaseCycleVie()
	 * @see #setPhaseCycleVie(TypeDictionaryDicoDocumentPhaseCycleVie)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_PhaseCycleVie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PhaseCycleVie'"
	 * @generated
	 */
	TypeDictionaryDicoDocumentPhaseCycleVie getPhaseCycleVie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getPhaseCycleVie <em>Phase Cycle Vie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase Cycle Vie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentPhaseCycleVie
	 * @see #isSetPhaseCycleVie()
	 * @see #unsetPhaseCycleVie()
	 * @see #getPhaseCycleVie()
	 * @generated
	 */
	void setPhaseCycleVie(TypeDictionaryDicoDocumentPhaseCycleVie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDocument#getPhaseCycleVie <em>Phase Cycle Vie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhaseCycleVie()
	 * @see #getPhaseCycleVie()
	 * @see #setPhaseCycleVie(TypeDictionaryDicoDocumentPhaseCycleVie)
	 * @generated
	 */
	void unsetPhaseCycleVie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDocument#getPhaseCycleVie <em>Phase Cycle Vie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase Cycle Vie</em>' attribute is set.
	 * @see #unsetPhaseCycleVie()
	 * @see #getPhaseCycleVie()
	 * @see #setPhaseCycleVie(TypeDictionaryDicoDocumentPhaseCycleVie)
	 * @generated
	 */
	boolean isSetPhaseCycleVie();

	/**
	 * Returns the value of the '<em><b>Titre Court</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre Court</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre Court</em>' attribute.
	 * @see #setTitreCourt(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_TitreCourt()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='TitreCourt'"
	 * @generated
	 */
	String getTitreCourt();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getTitreCourt <em>Titre Court</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre Court</em>' attribute.
	 * @see #getTitreCourt()
	 * @generated
	 */
	void setTitreCourt(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Reference()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Reference'"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Verification</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDocumentVerification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentVerification
	 * @see #isSetVerification()
	 * @see #unsetVerification()
	 * @see #setVerification(TypeDictionaryDicoDocumentVerification)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Verification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Verification'"
	 * @generated
	 */
	TypeDictionaryDicoDocumentVerification getVerification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getVerification <em>Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentVerification
	 * @see #isSetVerification()
	 * @see #unsetVerification()
	 * @see #getVerification()
	 * @generated
	 */
	void setVerification(TypeDictionaryDicoDocumentVerification value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDocument#getVerification <em>Verification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerification()
	 * @see #getVerification()
	 * @see #setVerification(TypeDictionaryDicoDocumentVerification)
	 * @generated
	 */
	void unsetVerification();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDocument#getVerification <em>Verification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Verification</em>' attribute is set.
	 * @see #unsetVerification()
	 * @see #getVerification()
	 * @see #setVerification(TypeDictionaryDicoDocumentVerification)
	 * @generated
	 */
	boolean isSetVerification();

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Titre()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Titre'"
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Version()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Sujet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sujet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sujet</em>' attribute.
	 * @see #setSujet(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Sujet()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='Sujet'"
	 * @generated
	 */
	String getSujet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getSujet <em>Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sujet</em>' attribute.
	 * @see #getSujet()
	 * @generated
	 */
	void setSujet(String value);

	/**
	 * Returns the value of the '<em><b>Mots Cles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mots Cles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mots Cles</em>' attribute.
	 * @see #setMotsCles(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_MotsCles()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MotsCles'"
	 * @generated
	 */
	String getMotsCles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getMotsCles <em>Mots Cles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mots Cles</em>' attribute.
	 * @see #getMotsCles()
	 * @generated
	 */
	void setMotsCles(String value);

	/**
	 * Returns the value of the '<em><b>Auteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auteur</em>' attribute.
	 * @see #setAuteur(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Auteur()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Auteur'"
	 * @generated
	 */
	String getAuteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getAuteur <em>Auteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auteur</em>' attribute.
	 * @see #getAuteur()
	 * @generated
	 */
	void setAuteur(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Langue()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Langue'"
	 * @generated
	 */
	TypeDictionaryDicoLangue getLangue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getLangue <em>Langue</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeDocument#getLangue <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLangue()
	 * @see #getLangue()
	 * @see #setLangue(TypeDictionaryDicoLangue)
	 * @generated
	 */
	void unsetLangue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDocument#getLangue <em>Langue</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Chemin Acces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chemin Acces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chemin Acces</em>' attribute.
	 * @see #setCheminAcces(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_CheminAcces()
	 * @model dataType="mpia.meta.TypeAnyURI"
	 *        extendedMetaData="kind='element' name='CheminAcces'"
	 * @generated
	 */
	String getCheminAcces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getCheminAcces <em>Chemin Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chemin Acces</em>' attribute.
	 * @see #getCheminAcces()
	 * @generated
	 */
	void setCheminAcces(String value);

	/**
	 * Returns the value of the '<em><b>Emplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emplacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emplacement</em>' attribute.
	 * @see #setEmplacement(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Emplacement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Emplacement'"
	 * @generated
	 */
	String getEmplacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getEmplacement <em>Emplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emplacement</em>' attribute.
	 * @see #getEmplacement()
	 * @generated
	 */
	void setEmplacement(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Format()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Format'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Support</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDocumentSupport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentSupport
	 * @see #isSetSupport()
	 * @see #unsetSupport()
	 * @see #setSupport(TypeDictionaryDicoDocumentSupport)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Support()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Support'"
	 * @generated
	 */
	TypeDictionaryDicoDocumentSupport getSupport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getSupport <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Support</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentSupport
	 * @see #isSetSupport()
	 * @see #unsetSupport()
	 * @see #getSupport()
	 * @generated
	 */
	void setSupport(TypeDictionaryDicoDocumentSupport value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDocument#getSupport <em>Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSupport()
	 * @see #getSupport()
	 * @see #setSupport(TypeDictionaryDicoDocumentSupport)
	 * @generated
	 */
	void unsetSupport();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDocument#getSupport <em>Support</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Support</em>' attribute is set.
	 * @see #unsetSupport()
	 * @see #getSupport()
	 * @see #setSupport(TypeDictionaryDicoDocumentSupport)
	 * @generated
	 */
	boolean isSetSupport();

	/**
	 * Returns the value of the '<em><b>Source Informatique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Informatique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Informatique</em>' attribute.
	 * @see #setSourceInformatique(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_SourceInformatique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='SourceInformatique'"
	 * @generated
	 */
	String getSourceInformatique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getSourceInformatique <em>Source Informatique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Informatique</em>' attribute.
	 * @see #getSourceInformatique()
	 * @generated
	 */
	void setSourceInformatique(String value);

	/**
	 * Returns the value of the '<em><b>Taille Fichier Informatique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Fichier Informatique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Fichier Informatique</em>' attribute.
	 * @see #setTailleFichierInformatique(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_TailleFichierInformatique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='TailleFichierInformatique'"
	 * @generated
	 */
	String getTailleFichierInformatique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getTailleFichierInformatique <em>Taille Fichier Informatique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Fichier Informatique</em>' attribute.
	 * @see #getTailleFichierInformatique()
	 * @generated
	 */
	void setTailleFichierInformatique(String value);

	/**
	 * Returns the value of the '<em><b>Taille Physique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taille Physique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taille Physique</em>' attribute.
	 * @see #setTaillePhysique(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_TaillePhysique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='TaillePhysique'"
	 * @generated
	 */
	String getTaillePhysique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getTaillePhysique <em>Taille Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taille Physique</em>' attribute.
	 * @see #getTaillePhysique()
	 * @generated
	 */
	void setTaillePhysique(String value);

	/**
	 * Returns the value of the '<em><b>Date Creation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Creation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Creation</em>' containment reference.
	 * @see #setDateCreation(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_DateCreation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateCreation'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateCreation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getDateCreation <em>Date Creation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Creation</em>' containment reference.
	 * @see #getDateCreation()
	 * @generated
	 */
	void setDateCreation(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Date Modification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Modification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Modification</em>' attribute.
	 * @see #setDateModification(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_DateModification()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateModification'"
	 * @generated
	 */
	XMLGregorianCalendar getDateModification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getDateModification <em>Date Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Modification</em>' attribute.
	 * @see #getDateModification()
	 * @generated
	 */
	void setDateModification(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Approbation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Approbation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Approbation</em>' containment reference.
	 * @see #setDateApprobation(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_DateApprobation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateApprobation'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateApprobation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getDateApprobation <em>Date Approbation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Approbation</em>' containment reference.
	 * @see #getDateApprobation()
	 * @generated
	 */
	void setDateApprobation(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Date Publication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Publication</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Publication</em>' containment reference.
	 * @see #setDatePublication(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_DatePublication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DatePublication'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDatePublication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getDatePublication <em>Date Publication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Publication</em>' containment reference.
	 * @see #getDatePublication()
	 * @generated
	 */
	void setDatePublication(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Debut Validite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Validite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Validite</em>' containment reference.
	 * @see #setDebutValidite(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_DebutValidite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DebutValidite'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDebutValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getDebutValidite <em>Debut Validite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Validite</em>' containment reference.
	 * @see #getDebutValidite()
	 * @generated
	 */
	void setDebutValidite(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Fin Validite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Validite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Validite</em>' containment reference.
	 * @see #setFinValidite(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_FinValidite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FinValidite'"
	 * @generated
	 */
	TypeDataTypeDateHeure getFinValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getFinValidite <em>Fin Validite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Validite</em>' containment reference.
	 * @see #getFinValidite()
	 * @generated
	 */
	void setFinValidite(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Mode Transmission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDocumentModeTransmission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Transmission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Transmission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentModeTransmission
	 * @see #isSetModeTransmission()
	 * @see #unsetModeTransmission()
	 * @see #setModeTransmission(TypeDictionaryDicoDocumentModeTransmission)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_ModeTransmission()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeTransmission'"
	 * @generated
	 */
	TypeDictionaryDicoDocumentModeTransmission getModeTransmission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getModeTransmission <em>Mode Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Transmission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDocumentModeTransmission
	 * @see #isSetModeTransmission()
	 * @see #unsetModeTransmission()
	 * @see #getModeTransmission()
	 * @generated
	 */
	void setModeTransmission(TypeDictionaryDicoDocumentModeTransmission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDocument#getModeTransmission <em>Mode Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeTransmission()
	 * @see #getModeTransmission()
	 * @see #setModeTransmission(TypeDictionaryDicoDocumentModeTransmission)
	 * @generated
	 */
	void unsetModeTransmission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDocument#getModeTransmission <em>Mode Transmission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Transmission</em>' attribute is set.
	 * @see #unsetModeTransmission()
	 * @see #getModeTransmission()
	 * @see #setModeTransmission(TypeDictionaryDicoDocumentModeTransmission)
	 * @generated
	 */
	boolean isSetModeTransmission();

	/**
	 * Returns the value of the '<em><b>Restrictions Diffusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restrictions Diffusion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restrictions Diffusion</em>' attribute.
	 * @see #setRestrictionsDiffusion(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_RestrictionsDiffusion()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='RestrictionsDiffusion'"
	 * @generated
	 */
	String getRestrictionsDiffusion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getRestrictionsDiffusion <em>Restrictions Diffusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restrictions Diffusion</em>' attribute.
	 * @see #getRestrictionsDiffusion()
	 * @generated
	 */
	void setRestrictionsDiffusion(String value);

	/**
	 * Returns the value of the '<em><b>Observations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observations</em>' attribute.
	 * @see #setObservations(String)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_Observations()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Observations'"
	 * @generated
	 */
	String getObservations();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getObservations <em>Observations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observations</em>' attribute.
	 * @see #getObservations()
	 * @generated
	 */
	void setObservations(String value);

	/**
	 * Returns the value of the '<em><b>APour Degre Classification Degre Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Degre Classification Degre Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #setAPourDegreClassificationDegreClassification(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDocument_APourDegreClassificationDegreClassification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_DegreClassification'"
	 *        extendedMetaData="kind='element' name='APourDegreClassification_DegreClassification'"
	 * @generated
	 */
	TypeAssociation getAPourDegreClassificationDegreClassification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDocument#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 */
	void setAPourDegreClassificationDegreClassification(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Documente Association Objectif Ciblage Document</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documente Association Objectif Ciblage Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documente Association Objectif Ciblage Document</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDocument_DocumenteAssociationObjectifCiblageDocument()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Document' target_entity='type_AssociationObjectifCiblageDocument'"
	 *        extendedMetaData="kind='element' name='Documente_AssociationObjectifCiblageDocument'"
	 * @generated
	 */
	EList<TypeAssociation> getDocumenteAssociationObjectifCiblageDocument();

	/**
	 * Returns the value of the '<em><b>Documente Capacite Association Document Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documente Capacite Association Document Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documente Capacite Association Document Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDocument_DocumenteCapaciteAssociationDocumentCapacite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Document' target_entity='type_AssociationDocumentCapacite'"
	 *        extendedMetaData="kind='element' name='DocumenteCapacite_AssociationDocumentCapacite'"
	 * @generated
	 */
	EList<TypeAssociation> getDocumenteCapaciteAssociationDocumentCapacite();

	/**
	 * Returns the value of the '<em><b>Documente Association Racine Operationnelle Document</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documente Association Racine Operationnelle Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documente Association Racine Operationnelle Document</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDocument_DocumenteAssociationRacineOperationnelleDocument()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Document' target_entity='type_AssociationRacineOperationnelleDocument'"
	 *        extendedMetaData="kind='element' name='Documente_AssociationRacineOperationnelleDocument'"
	 * @generated
	 */
	EList<TypeAssociation> getDocumenteAssociationRacineOperationnelleDocument();

} // TypeDocument
