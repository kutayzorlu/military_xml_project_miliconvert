/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Modalites Evaluation Degats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getAutreEffetRecherche <em>Autre Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getDureeEffetRecherche <em>Duree Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getPourcentageAttenduEffet <em>Pourcentage Attendu Effet</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getDateEvaluationObjectif <em>Date Evaluation Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getDateDebutTraitement <em>Date Debut Traitement</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getDateFinTraitement <em>Date Fin Traitement</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesEvaluationDegats#getAPourResponsableCoordinationUnite <em>APour Responsable Coordination Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModalitesEvaluationDegats' kind='elementOnly'"
 * @generated
 */
public interface TypeModalitesEvaluationDegats extends EObject {
	/**
	 * Returns the value of the '<em><b>Effet Recherche</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetTactiqueASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueASS
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_EffetRecherche()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetRecherche'"
	 * @generated
	 */
	TypeDictionaryDicoEffetTactiqueASS getEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueASS
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @generated
	 */
	void setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @generated
	 */
	void unsetEffetRecherche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getEffetRecherche <em>Effet Recherche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Recherche</em>' attribute is set.
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @generated
	 */
	boolean isSetEffetRecherche();

	/**
	 * Returns the value of the '<em><b>Autre Effet Recherche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Effet Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Effet Recherche</em>' attribute.
	 * @see #setAutreEffetRecherche(String)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_AutreEffetRecherche()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreEffetRecherche'"
	 * @generated
	 */
	String getAutreEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getAutreEffetRecherche <em>Autre Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Effet Recherche</em>' attribute.
	 * @see #getAutreEffetRecherche()
	 * @generated
	 */
	void setAutreEffetRecherche(String value);

	/**
	 * Returns the value of the '<em><b>Duree Effet Recherche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Effet Recherche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Effet Recherche</em>' containment reference.
	 * @see #setDureeEffetRecherche(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_DureeEffetRecherche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeEffetRecherche'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getDureeEffetRecherche <em>Duree Effet Recherche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Effet Recherche</em>' containment reference.
	 * @see #getDureeEffetRecherche()
	 * @generated
	 */
	void setDureeEffetRecherche(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Pourcentage Attendu Effet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Attendu Effet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Attendu Effet</em>' attribute.
	 * @see #isSetPourcentageAttenduEffet()
	 * @see #unsetPourcentageAttenduEffet()
	 * @see #setPourcentageAttenduEffet(double)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_PourcentageAttenduEffet()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='PourcentageAttenduEffet'"
	 * @generated
	 */
	double getPourcentageAttenduEffet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getPourcentageAttenduEffet <em>Pourcentage Attendu Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Attendu Effet</em>' attribute.
	 * @see #isSetPourcentageAttenduEffet()
	 * @see #unsetPourcentageAttenduEffet()
	 * @see #getPourcentageAttenduEffet()
	 * @generated
	 */
	void setPourcentageAttenduEffet(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getPourcentageAttenduEffet <em>Pourcentage Attendu Effet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageAttenduEffet()
	 * @see #getPourcentageAttenduEffet()
	 * @see #setPourcentageAttenduEffet(double)
	 * @generated
	 */
	void unsetPourcentageAttenduEffet();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getPourcentageAttenduEffet <em>Pourcentage Attendu Effet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Attendu Effet</em>' attribute is set.
	 * @see #unsetPourcentageAttenduEffet()
	 * @see #getPourcentageAttenduEffet()
	 * @see #setPourcentageAttenduEffet(double)
	 * @generated
	 */
	boolean isSetPourcentageAttenduEffet();

	/**
	 * Returns the value of the '<em><b>Date Evaluation Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Evaluation Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Evaluation Objectif</em>' attribute.
	 * @see #setDateEvaluationObjectif(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_DateEvaluationObjectif()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateEvaluationObjectif'"
	 * @generated
	 */
	XMLGregorianCalendar getDateEvaluationObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getDateEvaluationObjectif <em>Date Evaluation Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Evaluation Objectif</em>' attribute.
	 * @see #getDateEvaluationObjectif()
	 * @generated
	 */
	void setDateEvaluationObjectif(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Debut Traitement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut Traitement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut Traitement</em>' attribute.
	 * @see #setDateDebutTraitement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_DateDebutTraitement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebutTraitement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebutTraitement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getDateDebutTraitement <em>Date Debut Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut Traitement</em>' attribute.
	 * @see #getDateDebutTraitement()
	 * @generated
	 */
	void setDateDebutTraitement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin Traitement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Traitement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Traitement</em>' attribute.
	 * @see #setDateFinTraitement(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_DateFinTraitement()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFinTraitement'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFinTraitement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getDateFinTraitement <em>Date Fin Traitement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Traitement</em>' attribute.
	 * @see #getDateFinTraitement()
	 * @generated
	 */
	void setDateFinTraitement(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Effet Sur Environnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Sur Environnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Sur Environnement</em>' attribute.
	 * @see #setEffetSurEnvironnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_EffetSurEnvironnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EffetSurEnvironnement'"
	 * @generated
	 */
	String getEffetSurEnvironnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Sur Environnement</em>' attribute.
	 * @see #getEffetSurEnvironnement()
	 * @generated
	 */
	void setEffetSurEnvironnement(String value);

	/**
	 * Returns the value of the '<em><b>APour Responsable Coordination Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Responsable Coordination Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Responsable Coordination Unite</em>' containment reference.
	 * @see #setAPourResponsableCoordinationUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesEvaluationDegats_APourResponsableCoordinationUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourResponsableCoordination_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourResponsableCoordinationUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesEvaluationDegats#getAPourResponsableCoordinationUnite <em>APour Responsable Coordination Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Responsable Coordination Unite</em>' containment reference.
	 * @see #getAPourResponsableCoordinationUnite()
	 * @generated
	 */
	void setAPourResponsableCoordinationUnite(TypeAssociationEXT value);

} // TypeModalitesEvaluationDegats
