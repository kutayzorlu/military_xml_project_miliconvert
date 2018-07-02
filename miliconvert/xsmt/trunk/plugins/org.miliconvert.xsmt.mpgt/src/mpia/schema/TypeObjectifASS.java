/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Objectif ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjectifASS#getDureeEngagement <em>Duree Engagement</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getEnvironnement <em>Environnement</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getAutreEnvironnement <em>Autre Environnement</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getNombreElements <em>Nombre Elements</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getNumeroOccurrenceDansPDF <em>Numero Occurrence Dans PDF</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getPrecisionLocalisation <em>Precision Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getAPourLocalisationLocalisationObjectif <em>APour Localisation Localisation Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getAPourDebutTraitementADemandeDatation <em>APour Debut Traitement ADemande Datation</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getAPourFinTraitementADemandeDatation <em>APour Fin Traitement ADemande Datation</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getAPourHoraireTraitementAHoraireDatation <em>APour Horaire Traitement AHoraire Datation</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifASS#getAPourTypeTypeObjectifASS <em>APour Type Type Objectif ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjectifASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ObjectifASS' kind='elementOnly'"
 * @generated
 */
public interface TypeObjectifASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Duree Engagement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Engagement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Engagement</em>' containment reference.
	 * @see #setDureeEngagement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_DureeEngagement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeEngagement'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeEngagement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getDureeEngagement <em>Duree Engagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Engagement</em>' containment reference.
	 * @see #getDureeEngagement()
	 * @generated
	 */
	void setDureeEngagement(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Environnement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectifASSEnvironnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifASSEnvironnement
	 * @see #isSetEnvironnement()
	 * @see #unsetEnvironnement()
	 * @see #setEnvironnement(TypeDictionaryDicoObjectifASSEnvironnement)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_Environnement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Environnement'"
	 * @generated
	 */
	TypeDictionaryDicoObjectifASSEnvironnement getEnvironnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getEnvironnement <em>Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifASSEnvironnement
	 * @see #isSetEnvironnement()
	 * @see #unsetEnvironnement()
	 * @see #getEnvironnement()
	 * @generated
	 */
	void setEnvironnement(TypeDictionaryDicoObjectifASSEnvironnement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifASS#getEnvironnement <em>Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnvironnement()
	 * @see #getEnvironnement()
	 * @see #setEnvironnement(TypeDictionaryDicoObjectifASSEnvironnement)
	 * @generated
	 */
	void unsetEnvironnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifASS#getEnvironnement <em>Environnement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Environnement</em>' attribute is set.
	 * @see #unsetEnvironnement()
	 * @see #getEnvironnement()
	 * @see #setEnvironnement(TypeDictionaryDicoObjectifASSEnvironnement)
	 * @generated
	 */
	boolean isSetEnvironnement();

	/**
	 * Returns the value of the '<em><b>Autre Environnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Environnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Environnement</em>' attribute.
	 * @see #setAutreEnvironnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_AutreEnvironnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreEnvironnement'"
	 * @generated
	 */
	String getAutreEnvironnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getAutreEnvironnement <em>Autre Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Environnement</em>' attribute.
	 * @see #getAutreEnvironnement()
	 * @generated
	 */
	void setAutreEnvironnement(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Elements</em>' attribute.
	 * @see #isSetNombreElements()
	 * @see #unsetNombreElements()
	 * @see #setNombreElements(long)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_NombreElements()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreElements'"
	 * @generated
	 */
	long getNombreElements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getNombreElements <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Elements</em>' attribute.
	 * @see #isSetNombreElements()
	 * @see #unsetNombreElements()
	 * @see #getNombreElements()
	 * @generated
	 */
	void setNombreElements(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifASS#getNombreElements <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreElements()
	 * @see #getNombreElements()
	 * @see #setNombreElements(long)
	 * @generated
	 */
	void unsetNombreElements();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifASS#getNombreElements <em>Nombre Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Elements</em>' attribute is set.
	 * @see #unsetNombreElements()
	 * @see #getNombreElements()
	 * @see #setNombreElements(long)
	 * @generated
	 */
	boolean isSetNombreElements();

	/**
	 * Returns the value of the '<em><b>Numero Occurrence Dans PDF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Occurrence Dans PDF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Occurrence Dans PDF</em>' attribute.
	 * @see #isSetNumeroOccurrenceDansPDF()
	 * @see #unsetNumeroOccurrenceDansPDF()
	 * @see #setNumeroOccurrenceDansPDF(long)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_NumeroOccurrenceDansPDF()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroOccurrenceDansPDF'"
	 * @generated
	 */
	long getNumeroOccurrenceDansPDF();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getNumeroOccurrenceDansPDF <em>Numero Occurrence Dans PDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Occurrence Dans PDF</em>' attribute.
	 * @see #isSetNumeroOccurrenceDansPDF()
	 * @see #unsetNumeroOccurrenceDansPDF()
	 * @see #getNumeroOccurrenceDansPDF()
	 * @generated
	 */
	void setNumeroOccurrenceDansPDF(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifASS#getNumeroOccurrenceDansPDF <em>Numero Occurrence Dans PDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroOccurrenceDansPDF()
	 * @see #getNumeroOccurrenceDansPDF()
	 * @see #setNumeroOccurrenceDansPDF(long)
	 * @generated
	 */
	void unsetNumeroOccurrenceDansPDF();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifASS#getNumeroOccurrenceDansPDF <em>Numero Occurrence Dans PDF</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Occurrence Dans PDF</em>' attribute is set.
	 * @see #unsetNumeroOccurrenceDansPDF()
	 * @see #getNumeroOccurrenceDansPDF()
	 * @see #setNumeroOccurrenceDansPDF(long)
	 * @generated
	 */
	boolean isSetNumeroOccurrenceDansPDF();

	/**
	 * Returns the value of the '<em><b>Precision Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision Localisation</em>' containment reference.
	 * @see #setPrecisionLocalisation(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_PrecisionLocalisation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PrecisionLocalisation'"
	 * @generated
	 */
	TypeDataTypeLongueur getPrecisionLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getPrecisionLocalisation <em>Precision Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision Localisation</em>' containment reference.
	 * @see #getPrecisionLocalisation()
	 * @generated
	 */
	void setPrecisionLocalisation(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see #setEtat(String)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_Etat()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Etat'"
	 * @generated
	 */
	String getEtat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(String value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Localisation Objectif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Localisation Objectif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Localisation Objectif</em>' containment reference.
	 * @see #setAPourLocalisationLocalisationObjectif(TypeLocalisationObjectif)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_APourLocalisationLocalisationObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationObjectif'"
	 *        extendedMetaData="kind='element' name='APourLocalisation_LocalisationObjectif'"
	 * @generated
	 */
	TypeLocalisationObjectif getAPourLocalisationLocalisationObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getAPourLocalisationLocalisationObjectif <em>APour Localisation Localisation Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Localisation Objectif</em>' containment reference.
	 * @see #getAPourLocalisationLocalisationObjectif()
	 * @generated
	 */
	void setAPourLocalisationLocalisationObjectif(TypeLocalisationObjectif value);

	/**
	 * Returns the value of the '<em><b>APour Debut Traitement ADemande Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Debut Traitement ADemande Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Debut Traitement ADemande Datation</em>' containment reference.
	 * @see #setAPourDebutTraitementADemandeDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_APourDebutTraitementADemandeDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourDebutTraitementADemande_Datation'"
	 * @generated
	 */
	TypeDatation getAPourDebutTraitementADemandeDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getAPourDebutTraitementADemandeDatation <em>APour Debut Traitement ADemande Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Debut Traitement ADemande Datation</em>' containment reference.
	 * @see #getAPourDebutTraitementADemandeDatation()
	 * @generated
	 */
	void setAPourDebutTraitementADemandeDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>APour Fin Traitement ADemande Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Fin Traitement ADemande Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Fin Traitement ADemande Datation</em>' containment reference.
	 * @see #setAPourFinTraitementADemandeDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_APourFinTraitementADemandeDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourFinTraitementADemande_Datation'"
	 * @generated
	 */
	TypeDatation getAPourFinTraitementADemandeDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getAPourFinTraitementADemandeDatation <em>APour Fin Traitement ADemande Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Fin Traitement ADemande Datation</em>' containment reference.
	 * @see #getAPourFinTraitementADemandeDatation()
	 * @generated
	 */
	void setAPourFinTraitementADemandeDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>APour Horaire Traitement AHoraire Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Horaire Traitement AHoraire Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Horaire Traitement AHoraire Datation</em>' containment reference.
	 * @see #setAPourHoraireTraitementAHoraireDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_APourHoraireTraitementAHoraireDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='APourHoraireTraitementAHoraire_Datation'"
	 * @generated
	 */
	TypeDatation getAPourHoraireTraitementAHoraireDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifASS#getAPourHoraireTraitementAHoraireDatation <em>APour Horaire Traitement AHoraire Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Horaire Traitement AHoraire Datation</em>' containment reference.
	 * @see #getAPourHoraireTraitementAHoraireDatation()
	 * @generated
	 */
	void setAPourHoraireTraitementAHoraireDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>APour Type Type Objectif ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeObjectifASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Type Objectif ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Type Objectif ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeObjectifASS_APourTypeTypeObjectifASS()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeObjectifASS'"
	 *        extendedMetaData="kind='element' name='APourType_TypeObjectifASS'"
	 * @generated
	 */
	EList<TypeTypeObjectifASS> getAPourTypeTypeObjectifASS();

} // TypeObjectifASS
