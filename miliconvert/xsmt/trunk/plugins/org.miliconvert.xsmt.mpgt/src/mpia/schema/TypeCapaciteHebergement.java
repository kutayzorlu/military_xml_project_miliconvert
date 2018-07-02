/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capacite Hebergement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getBesoinApproSpecifique <em>Besoin Appro Specifique</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getCapaciteTotaleAccueil <em>Capacite Totale Accueil</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getConditionsRavitaillement <em>Conditions Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getContraintesAlimentaires <em>Contraintes Alimentaires</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getDisponibilite <em>Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getEtatSite <em>Etat Site</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getEtatEntretien <em>Etat Entretien</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getEtatSanitaire <em>Etat Sanitaire</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getEtatEauCourante <em>Etat Eau Courante</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getEtatElectricite <em>Etat Electricite</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getEtatPhysique <em>Etat Physique</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getEtatMoral <em>Etat Moral</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getEtatSoinsMedicaux <em>Etat Soins Medicaux</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreBasAge <em>Nombre Bas Age</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreEnfants <em>Nombre Enfants</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreFemmes <em>Nombre Femmes</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreHommes <em>Nombre Hommes</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreMalades <em>Nombre Malades</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreVieillar <em>Nombre Vieillar</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreMedecins <em>Nombre Medecins</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreInfirmiers <em>Nombre Infirmiers</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getNombreTotal <em>Nombre Total</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getPathologies <em>Pathologies</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getPourcentageOccupation <em>Pourcentage Occupation</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getQualiteApprovisionnement <em>Qualite Approvisionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteHebergement#getTypeDistributionEau <em>Type Distribution Eau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapaciteHebergement' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteHebergement extends TypeCapacite {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteHebergementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoCapaciteHebergementType)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteHebergementType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoCapaciteHebergementType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteHebergementType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoCapaciteHebergementType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Besoin Appro Specifique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Besoin Appro Specifique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Besoin Appro Specifique</em>' attribute.
	 * @see #setBesoinApproSpecifique(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_BesoinApproSpecifique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='BesoinApproSpecifique'"
	 * @generated
	 */
	String getBesoinApproSpecifique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getBesoinApproSpecifique <em>Besoin Appro Specifique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besoin Appro Specifique</em>' attribute.
	 * @see #getBesoinApproSpecifique()
	 * @generated
	 */
	void setBesoinApproSpecifique(String value);

	/**
	 * Returns the value of the '<em><b>Capacite Totale Accueil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Totale Accueil</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Totale Accueil</em>' attribute.
	 * @see #isSetCapaciteTotaleAccueil()
	 * @see #unsetCapaciteTotaleAccueil()
	 * @see #setCapaciteTotaleAccueil(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_CapaciteTotaleAccueil()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='CapaciteTotaleAccueil'"
	 * @generated
	 */
	long getCapaciteTotaleAccueil();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getCapaciteTotaleAccueil <em>Capacite Totale Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Totale Accueil</em>' attribute.
	 * @see #isSetCapaciteTotaleAccueil()
	 * @see #unsetCapaciteTotaleAccueil()
	 * @see #getCapaciteTotaleAccueil()
	 * @generated
	 */
	void setCapaciteTotaleAccueil(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getCapaciteTotaleAccueil <em>Capacite Totale Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteTotaleAccueil()
	 * @see #getCapaciteTotaleAccueil()
	 * @see #setCapaciteTotaleAccueil(long)
	 * @generated
	 */
	void unsetCapaciteTotaleAccueil();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getCapaciteTotaleAccueil <em>Capacite Totale Accueil</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Totale Accueil</em>' attribute is set.
	 * @see #unsetCapaciteTotaleAccueil()
	 * @see #getCapaciteTotaleAccueil()
	 * @see #setCapaciteTotaleAccueil(long)
	 * @generated
	 */
	boolean isSetCapaciteTotaleAccueil();

	/**
	 * Returns the value of the '<em><b>Conditions Ravitaillement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions Ravitaillement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions Ravitaillement</em>' attribute.
	 * @see #setConditionsRavitaillement(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_ConditionsRavitaillement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConditionsRavitaillement'"
	 * @generated
	 */
	String getConditionsRavitaillement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getConditionsRavitaillement <em>Conditions Ravitaillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions Ravitaillement</em>' attribute.
	 * @see #getConditionsRavitaillement()
	 * @generated
	 */
	void setConditionsRavitaillement(String value);

	/**
	 * Returns the value of the '<em><b>Contraintes Alimentaires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraintes Alimentaires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes Alimentaires</em>' attribute.
	 * @see #setContraintesAlimentaires(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_ContraintesAlimentaires()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ContraintesAlimentaires'"
	 * @generated
	 */
	String getContraintesAlimentaires();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getContraintesAlimentaires <em>Contraintes Alimentaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contraintes Alimentaires</em>' attribute.
	 * @see #getContraintesAlimentaires()
	 * @generated
	 */
	void setContraintesAlimentaires(String value);

	/**
	 * Returns the value of the '<em><b>Disponibilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disponibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disponibilite</em>' attribute.
	 * @see #isSetDisponibilite()
	 * @see #unsetDisponibilite()
	 * @see #setDisponibilite(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_Disponibilite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Disponibilite'"
	 * @generated
	 */
	long getDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getDisponibilite <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disponibilite</em>' attribute.
	 * @see #isSetDisponibilite()
	 * @see #unsetDisponibilite()
	 * @see #getDisponibilite()
	 * @generated
	 */
	void setDisponibilite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getDisponibilite <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisponibilite()
	 * @see #getDisponibilite()
	 * @see #setDisponibilite(long)
	 * @generated
	 */
	void unsetDisponibilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getDisponibilite <em>Disponibilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disponibilite</em>' attribute is set.
	 * @see #unsetDisponibilite()
	 * @see #getDisponibilite()
	 * @see #setDisponibilite(long)
	 * @generated
	 */
	boolean isSetDisponibilite();

	/**
	 * Returns the value of the '<em><b>Etat Site</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Site</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Site</em>' attribute.
	 * @see #setEtatSite(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_EtatSite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='EtatSite'"
	 * @generated
	 */
	String getEtatSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatSite <em>Etat Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Site</em>' attribute.
	 * @see #getEtatSite()
	 * @generated
	 */
	void setEtatSite(String value);

	/**
	 * Returns the value of the '<em><b>Etat Entretien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Entretien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Entretien</em>' attribute.
	 * @see #setEtatEntretien(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_EtatEntretien()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='EtatEntretien'"
	 * @generated
	 */
	String getEtatEntretien();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatEntretien <em>Etat Entretien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Entretien</em>' attribute.
	 * @see #getEtatEntretien()
	 * @generated
	 */
	void setEtatEntretien(String value);

	/**
	 * Returns the value of the '<em><b>Etat Sanitaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Sanitaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Sanitaire</em>' attribute.
	 * @see #setEtatSanitaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_EtatSanitaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='EtatSanitaire'"
	 * @generated
	 */
	String getEtatSanitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatSanitaire <em>Etat Sanitaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Sanitaire</em>' attribute.
	 * @see #getEtatSanitaire()
	 * @generated
	 */
	void setEtatSanitaire(String value);

	/**
	 * Returns the value of the '<em><b>Etat Eau Courante</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatEauCourante}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Eau Courante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Eau Courante</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatEauCourante
	 * @see #isSetEtatEauCourante()
	 * @see #unsetEtatEauCourante()
	 * @see #setEtatEauCourante(TypeDictionaryDicoCapaciteHebergementEtatEauCourante)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_EtatEauCourante()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatEauCourante'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteHebergementEtatEauCourante getEtatEauCourante();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatEauCourante <em>Etat Eau Courante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Eau Courante</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatEauCourante
	 * @see #isSetEtatEauCourante()
	 * @see #unsetEtatEauCourante()
	 * @see #getEtatEauCourante()
	 * @generated
	 */
	void setEtatEauCourante(TypeDictionaryDicoCapaciteHebergementEtatEauCourante value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatEauCourante <em>Etat Eau Courante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatEauCourante()
	 * @see #getEtatEauCourante()
	 * @see #setEtatEauCourante(TypeDictionaryDicoCapaciteHebergementEtatEauCourante)
	 * @generated
	 */
	void unsetEtatEauCourante();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatEauCourante <em>Etat Eau Courante</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Eau Courante</em>' attribute is set.
	 * @see #unsetEtatEauCourante()
	 * @see #getEtatEauCourante()
	 * @see #setEtatEauCourante(TypeDictionaryDicoCapaciteHebergementEtatEauCourante)
	 * @generated
	 */
	boolean isSetEtatEauCourante();

	/**
	 * Returns the value of the '<em><b>Etat Electricite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatElectricite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Electricite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Electricite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatElectricite
	 * @see #isSetEtatElectricite()
	 * @see #unsetEtatElectricite()
	 * @see #setEtatElectricite(TypeDictionaryDicoCapaciteHebergementEtatElectricite)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_EtatElectricite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatElectricite'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteHebergementEtatElectricite getEtatElectricite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatElectricite <em>Etat Electricite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Electricite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatElectricite
	 * @see #isSetEtatElectricite()
	 * @see #unsetEtatElectricite()
	 * @see #getEtatElectricite()
	 * @generated
	 */
	void setEtatElectricite(TypeDictionaryDicoCapaciteHebergementEtatElectricite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatElectricite <em>Etat Electricite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatElectricite()
	 * @see #getEtatElectricite()
	 * @see #setEtatElectricite(TypeDictionaryDicoCapaciteHebergementEtatElectricite)
	 * @generated
	 */
	void unsetEtatElectricite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatElectricite <em>Etat Electricite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Electricite</em>' attribute is set.
	 * @see #unsetEtatElectricite()
	 * @see #getEtatElectricite()
	 * @see #setEtatElectricite(TypeDictionaryDicoCapaciteHebergementEtatElectricite)
	 * @generated
	 */
	boolean isSetEtatElectricite();

	/**
	 * Returns the value of the '<em><b>Etat Physique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Physique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Physique</em>' attribute.
	 * @see #setEtatPhysique(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_EtatPhysique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='EtatPhysique'"
	 * @generated
	 */
	String getEtatPhysique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatPhysique <em>Etat Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Physique</em>' attribute.
	 * @see #getEtatPhysique()
	 * @generated
	 */
	void setEtatPhysique(String value);

	/**
	 * Returns the value of the '<em><b>Etat Moral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Moral</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Moral</em>' attribute.
	 * @see #setEtatMoral(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_EtatMoral()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='EtatMoral'"
	 * @generated
	 */
	String getEtatMoral();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatMoral <em>Etat Moral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Moral</em>' attribute.
	 * @see #getEtatMoral()
	 * @generated
	 */
	void setEtatMoral(String value);

	/**
	 * Returns the value of the '<em><b>Etat Soins Medicaux</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Soins Medicaux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Soins Medicaux</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux
	 * @see #isSetEtatSoinsMedicaux()
	 * @see #unsetEtatSoinsMedicaux()
	 * @see #setEtatSoinsMedicaux(TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_EtatSoinsMedicaux()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatSoinsMedicaux'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux getEtatSoinsMedicaux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatSoinsMedicaux <em>Etat Soins Medicaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Soins Medicaux</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux
	 * @see #isSetEtatSoinsMedicaux()
	 * @see #unsetEtatSoinsMedicaux()
	 * @see #getEtatSoinsMedicaux()
	 * @generated
	 */
	void setEtatSoinsMedicaux(TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatSoinsMedicaux <em>Etat Soins Medicaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatSoinsMedicaux()
	 * @see #getEtatSoinsMedicaux()
	 * @see #setEtatSoinsMedicaux(TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux)
	 * @generated
	 */
	void unsetEtatSoinsMedicaux();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getEtatSoinsMedicaux <em>Etat Soins Medicaux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Soins Medicaux</em>' attribute is set.
	 * @see #unsetEtatSoinsMedicaux()
	 * @see #getEtatSoinsMedicaux()
	 * @see #setEtatSoinsMedicaux(TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux)
	 * @generated
	 */
	boolean isSetEtatSoinsMedicaux();

	/**
	 * Returns the value of the '<em><b>Nombre Bas Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Bas Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Bas Age</em>' attribute.
	 * @see #isSetNombreBasAge()
	 * @see #unsetNombreBasAge()
	 * @see #setNombreBasAge(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreBasAge()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreBasAge'"
	 * @generated
	 */
	long getNombreBasAge();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreBasAge <em>Nombre Bas Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Bas Age</em>' attribute.
	 * @see #isSetNombreBasAge()
	 * @see #unsetNombreBasAge()
	 * @see #getNombreBasAge()
	 * @generated
	 */
	void setNombreBasAge(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreBasAge <em>Nombre Bas Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreBasAge()
	 * @see #getNombreBasAge()
	 * @see #setNombreBasAge(long)
	 * @generated
	 */
	void unsetNombreBasAge();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreBasAge <em>Nombre Bas Age</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Bas Age</em>' attribute is set.
	 * @see #unsetNombreBasAge()
	 * @see #getNombreBasAge()
	 * @see #setNombreBasAge(long)
	 * @generated
	 */
	boolean isSetNombreBasAge();

	/**
	 * Returns the value of the '<em><b>Nombre Enfants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Enfants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Enfants</em>' attribute.
	 * @see #isSetNombreEnfants()
	 * @see #unsetNombreEnfants()
	 * @see #setNombreEnfants(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreEnfants()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreEnfants'"
	 * @generated
	 */
	long getNombreEnfants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreEnfants <em>Nombre Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Enfants</em>' attribute.
	 * @see #isSetNombreEnfants()
	 * @see #unsetNombreEnfants()
	 * @see #getNombreEnfants()
	 * @generated
	 */
	void setNombreEnfants(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreEnfants <em>Nombre Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEnfants()
	 * @see #getNombreEnfants()
	 * @see #setNombreEnfants(long)
	 * @generated
	 */
	void unsetNombreEnfants();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreEnfants <em>Nombre Enfants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Enfants</em>' attribute is set.
	 * @see #unsetNombreEnfants()
	 * @see #getNombreEnfants()
	 * @see #setNombreEnfants(long)
	 * @generated
	 */
	boolean isSetNombreEnfants();

	/**
	 * Returns the value of the '<em><b>Nombre Femmes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Femmes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Femmes</em>' attribute.
	 * @see #isSetNombreFemmes()
	 * @see #unsetNombreFemmes()
	 * @see #setNombreFemmes(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreFemmes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreFemmes'"
	 * @generated
	 */
	long getNombreFemmes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreFemmes <em>Nombre Femmes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Femmes</em>' attribute.
	 * @see #isSetNombreFemmes()
	 * @see #unsetNombreFemmes()
	 * @see #getNombreFemmes()
	 * @generated
	 */
	void setNombreFemmes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreFemmes <em>Nombre Femmes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreFemmes()
	 * @see #getNombreFemmes()
	 * @see #setNombreFemmes(long)
	 * @generated
	 */
	void unsetNombreFemmes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreFemmes <em>Nombre Femmes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Femmes</em>' attribute is set.
	 * @see #unsetNombreFemmes()
	 * @see #getNombreFemmes()
	 * @see #setNombreFemmes(long)
	 * @generated
	 */
	boolean isSetNombreFemmes();

	/**
	 * Returns the value of the '<em><b>Nombre Hommes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Hommes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Hommes</em>' attribute.
	 * @see #isSetNombreHommes()
	 * @see #unsetNombreHommes()
	 * @see #setNombreHommes(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreHommes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreHommes'"
	 * @generated
	 */
	long getNombreHommes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreHommes <em>Nombre Hommes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Hommes</em>' attribute.
	 * @see #isSetNombreHommes()
	 * @see #unsetNombreHommes()
	 * @see #getNombreHommes()
	 * @generated
	 */
	void setNombreHommes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreHommes <em>Nombre Hommes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreHommes()
	 * @see #getNombreHommes()
	 * @see #setNombreHommes(long)
	 * @generated
	 */
	void unsetNombreHommes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreHommes <em>Nombre Hommes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Hommes</em>' attribute is set.
	 * @see #unsetNombreHommes()
	 * @see #getNombreHommes()
	 * @see #setNombreHommes(long)
	 * @generated
	 */
	boolean isSetNombreHommes();

	/**
	 * Returns the value of the '<em><b>Nombre Malades</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Malades</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Malades</em>' attribute.
	 * @see #isSetNombreMalades()
	 * @see #unsetNombreMalades()
	 * @see #setNombreMalades(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreMalades()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreMalades'"
	 * @generated
	 */
	long getNombreMalades();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreMalades <em>Nombre Malades</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Malades</em>' attribute.
	 * @see #isSetNombreMalades()
	 * @see #unsetNombreMalades()
	 * @see #getNombreMalades()
	 * @generated
	 */
	void setNombreMalades(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreMalades <em>Nombre Malades</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMalades()
	 * @see #getNombreMalades()
	 * @see #setNombreMalades(long)
	 * @generated
	 */
	void unsetNombreMalades();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreMalades <em>Nombre Malades</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Malades</em>' attribute is set.
	 * @see #unsetNombreMalades()
	 * @see #getNombreMalades()
	 * @see #setNombreMalades(long)
	 * @generated
	 */
	boolean isSetNombreMalades();

	/**
	 * Returns the value of the '<em><b>Nombre Vieillar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vieillar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vieillar</em>' attribute.
	 * @see #isSetNombreVieillar()
	 * @see #unsetNombreVieillar()
	 * @see #setNombreVieillar(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreVieillar()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreVieillar'"
	 * @generated
	 */
	long getNombreVieillar();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreVieillar <em>Nombre Vieillar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vieillar</em>' attribute.
	 * @see #isSetNombreVieillar()
	 * @see #unsetNombreVieillar()
	 * @see #getNombreVieillar()
	 * @generated
	 */
	void setNombreVieillar(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreVieillar <em>Nombre Vieillar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVieillar()
	 * @see #getNombreVieillar()
	 * @see #setNombreVieillar(long)
	 * @generated
	 */
	void unsetNombreVieillar();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreVieillar <em>Nombre Vieillar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vieillar</em>' attribute is set.
	 * @see #unsetNombreVieillar()
	 * @see #getNombreVieillar()
	 * @see #setNombreVieillar(long)
	 * @generated
	 */
	boolean isSetNombreVieillar();

	/**
	 * Returns the value of the '<em><b>Nombre Medecins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Medecins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Medecins</em>' attribute.
	 * @see #isSetNombreMedecins()
	 * @see #unsetNombreMedecins()
	 * @see #setNombreMedecins(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreMedecins()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMedecins'"
	 * @generated
	 */
	long getNombreMedecins();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreMedecins <em>Nombre Medecins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Medecins</em>' attribute.
	 * @see #isSetNombreMedecins()
	 * @see #unsetNombreMedecins()
	 * @see #getNombreMedecins()
	 * @generated
	 */
	void setNombreMedecins(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreMedecins <em>Nombre Medecins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMedecins()
	 * @see #getNombreMedecins()
	 * @see #setNombreMedecins(long)
	 * @generated
	 */
	void unsetNombreMedecins();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreMedecins <em>Nombre Medecins</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Medecins</em>' attribute is set.
	 * @see #unsetNombreMedecins()
	 * @see #getNombreMedecins()
	 * @see #setNombreMedecins(long)
	 * @generated
	 */
	boolean isSetNombreMedecins();

	/**
	 * Returns the value of the '<em><b>Nombre Infirmiers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Infirmiers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Infirmiers</em>' attribute.
	 * @see #isSetNombreInfirmiers()
	 * @see #unsetNombreInfirmiers()
	 * @see #setNombreInfirmiers(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreInfirmiers()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreInfirmiers'"
	 * @generated
	 */
	long getNombreInfirmiers();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreInfirmiers <em>Nombre Infirmiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Infirmiers</em>' attribute.
	 * @see #isSetNombreInfirmiers()
	 * @see #unsetNombreInfirmiers()
	 * @see #getNombreInfirmiers()
	 * @generated
	 */
	void setNombreInfirmiers(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreInfirmiers <em>Nombre Infirmiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreInfirmiers()
	 * @see #getNombreInfirmiers()
	 * @see #setNombreInfirmiers(long)
	 * @generated
	 */
	void unsetNombreInfirmiers();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreInfirmiers <em>Nombre Infirmiers</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Infirmiers</em>' attribute is set.
	 * @see #unsetNombreInfirmiers()
	 * @see #getNombreInfirmiers()
	 * @see #setNombreInfirmiers(long)
	 * @generated
	 */
	boolean isSetNombreInfirmiers();

	/**
	 * Returns the value of the '<em><b>Nombre Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Total</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Total</em>' attribute.
	 * @see #isSetNombreTotal()
	 * @see #unsetNombreTotal()
	 * @see #setNombreTotal(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_NombreTotal()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreTotal'"
	 * @generated
	 */
	long getNombreTotal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreTotal <em>Nombre Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Total</em>' attribute.
	 * @see #isSetNombreTotal()
	 * @see #unsetNombreTotal()
	 * @see #getNombreTotal()
	 * @generated
	 */
	void setNombreTotal(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreTotal <em>Nombre Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTotal()
	 * @see #getNombreTotal()
	 * @see #setNombreTotal(long)
	 * @generated
	 */
	void unsetNombreTotal();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getNombreTotal <em>Nombre Total</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Total</em>' attribute is set.
	 * @see #unsetNombreTotal()
	 * @see #getNombreTotal()
	 * @see #setNombreTotal(long)
	 * @generated
	 */
	boolean isSetNombreTotal();

	/**
	 * Returns the value of the '<em><b>Pathologies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathologies</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathologies</em>' attribute.
	 * @see #setPathologies(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_Pathologies()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Pathologies'"
	 * @generated
	 */
	String getPathologies();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getPathologies <em>Pathologies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathologies</em>' attribute.
	 * @see #getPathologies()
	 * @generated
	 */
	void setPathologies(String value);

	/**
	 * Returns the value of the '<em><b>Pourcentage Occupation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Occupation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Occupation</em>' attribute.
	 * @see #isSetPourcentageOccupation()
	 * @see #unsetPourcentageOccupation()
	 * @see #setPourcentageOccupation(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_PourcentageOccupation()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='PourcentageOccupation'"
	 * @generated
	 */
	long getPourcentageOccupation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getPourcentageOccupation <em>Pourcentage Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Occupation</em>' attribute.
	 * @see #isSetPourcentageOccupation()
	 * @see #unsetPourcentageOccupation()
	 * @see #getPourcentageOccupation()
	 * @generated
	 */
	void setPourcentageOccupation(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getPourcentageOccupation <em>Pourcentage Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageOccupation()
	 * @see #getPourcentageOccupation()
	 * @see #setPourcentageOccupation(long)
	 * @generated
	 */
	void unsetPourcentageOccupation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getPourcentageOccupation <em>Pourcentage Occupation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Occupation</em>' attribute is set.
	 * @see #unsetPourcentageOccupation()
	 * @see #getPourcentageOccupation()
	 * @see #setPourcentageOccupation(long)
	 * @generated
	 */
	boolean isSetPourcentageOccupation();

	/**
	 * Returns the value of the '<em><b>Qualite Approvisionnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualite Approvisionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualite Approvisionnement</em>' attribute.
	 * @see #setQualiteApprovisionnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_QualiteApprovisionnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='QualiteApprovisionnement'"
	 * @generated
	 */
	String getQualiteApprovisionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getQualiteApprovisionnement <em>Qualite Approvisionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualite Approvisionnement</em>' attribute.
	 * @see #getQualiteApprovisionnement()
	 * @generated
	 */
	void setQualiteApprovisionnement(String value);

	/**
	 * Returns the value of the '<em><b>Type Distribution Eau</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteHebergementTypeDistributionEau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Distribution Eau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Distribution Eau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementTypeDistributionEau
	 * @see #isSetTypeDistributionEau()
	 * @see #unsetTypeDistributionEau()
	 * @see #setTypeDistributionEau(TypeDictionaryDicoCapaciteHebergementTypeDistributionEau)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteHebergement_TypeDistributionEau()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDistributionEau'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteHebergementTypeDistributionEau getTypeDistributionEau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getTypeDistributionEau <em>Type Distribution Eau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Distribution Eau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteHebergementTypeDistributionEau
	 * @see #isSetTypeDistributionEau()
	 * @see #unsetTypeDistributionEau()
	 * @see #getTypeDistributionEau()
	 * @generated
	 */
	void setTypeDistributionEau(TypeDictionaryDicoCapaciteHebergementTypeDistributionEau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteHebergement#getTypeDistributionEau <em>Type Distribution Eau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDistributionEau()
	 * @see #getTypeDistributionEau()
	 * @see #setTypeDistributionEau(TypeDictionaryDicoCapaciteHebergementTypeDistributionEau)
	 * @generated
	 */
	void unsetTypeDistributionEau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteHebergement#getTypeDistributionEau <em>Type Distribution Eau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Distribution Eau</em>' attribute is set.
	 * @see #unsetTypeDistributionEau()
	 * @see #getTypeDistributionEau()
	 * @see #setTypeDistributionEau(TypeDictionaryDicoCapaciteHebergementTypeDistributionEau)
	 * @generated
	 */
	boolean isSetTypeDistributionEau();

} // TypeCapaciteHebergement
