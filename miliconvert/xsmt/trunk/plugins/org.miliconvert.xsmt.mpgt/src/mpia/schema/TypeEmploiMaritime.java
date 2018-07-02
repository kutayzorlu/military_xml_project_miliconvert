/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Emploi Maritime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEmploiMaritime#getProcedureAirMerCoordonnee <em>Procedure Air Mer Coordonnee</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiMaritime#getNombrePassagesRequis <em>Nombre Passages Requis</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiMaritime#getLargeurCouloirMiseEnMarche <em>Largeur Couloir Mise En Marche</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiMaritime#getInstructionsPassage <em>Instructions Passage</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiMaritime#getVitessePassageRecommandee <em>Vitesse Passage Recommandee</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiMaritime#getDistanceEntreBatiments <em>Distance Entre Batiments</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiMaritime#getDistanceEntreGroupes <em>Distance Entre Groupes</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiMaritime#getNomBatimentPrincipal <em>Nom Batiment Principal</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EmploiMaritime' kind='elementOnly'"
 * @generated
 */
public interface TypeEmploiMaritime extends TypeEmploiRessourceActivite {
	/**
	 * Returns the value of the '<em><b>Procedure Air Mer Coordonnee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Air Mer Coordonnee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Air Mer Coordonnee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee
	 * @see #isSetProcedureAirMerCoordonnee()
	 * @see #unsetProcedureAirMerCoordonnee()
	 * @see #setProcedureAirMerCoordonnee(TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime_ProcedureAirMerCoordonnee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcedureAirMerCoordonnee'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee getProcedureAirMerCoordonnee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiMaritime#getProcedureAirMerCoordonnee <em>Procedure Air Mer Coordonnee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Air Mer Coordonnee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee
	 * @see #isSetProcedureAirMerCoordonnee()
	 * @see #unsetProcedureAirMerCoordonnee()
	 * @see #getProcedureAirMerCoordonnee()
	 * @generated
	 */
	void setProcedureAirMerCoordonnee(TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiMaritime#getProcedureAirMerCoordonnee <em>Procedure Air Mer Coordonnee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcedureAirMerCoordonnee()
	 * @see #getProcedureAirMerCoordonnee()
	 * @see #setProcedureAirMerCoordonnee(TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee)
	 * @generated
	 */
	void unsetProcedureAirMerCoordonnee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiMaritime#getProcedureAirMerCoordonnee <em>Procedure Air Mer Coordonnee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Procedure Air Mer Coordonnee</em>' attribute is set.
	 * @see #unsetProcedureAirMerCoordonnee()
	 * @see #getProcedureAirMerCoordonnee()
	 * @see #setProcedureAirMerCoordonnee(TypeDictionaryDicoEmploiMaritimeProcedureAirMerCoordonnee)
	 * @generated
	 */
	boolean isSetProcedureAirMerCoordonnee();

	/**
	 * Returns the value of the '<em><b>Nombre Passages Requis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Passages Requis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Passages Requis</em>' attribute.
	 * @see #isSetNombrePassagesRequis()
	 * @see #unsetNombrePassagesRequis()
	 * @see #setNombrePassagesRequis(long)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime_NombrePassagesRequis()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombrePassagesRequis'"
	 * @generated
	 */
	long getNombrePassagesRequis();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiMaritime#getNombrePassagesRequis <em>Nombre Passages Requis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Passages Requis</em>' attribute.
	 * @see #isSetNombrePassagesRequis()
	 * @see #unsetNombrePassagesRequis()
	 * @see #getNombrePassagesRequis()
	 * @generated
	 */
	void setNombrePassagesRequis(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiMaritime#getNombrePassagesRequis <em>Nombre Passages Requis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePassagesRequis()
	 * @see #getNombrePassagesRequis()
	 * @see #setNombrePassagesRequis(long)
	 * @generated
	 */
	void unsetNombrePassagesRequis();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiMaritime#getNombrePassagesRequis <em>Nombre Passages Requis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Passages Requis</em>' attribute is set.
	 * @see #unsetNombrePassagesRequis()
	 * @see #getNombrePassagesRequis()
	 * @see #setNombrePassagesRequis(long)
	 * @generated
	 */
	boolean isSetNombrePassagesRequis();

	/**
	 * Returns the value of the '<em><b>Largeur Couloir Mise En Marche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Couloir Mise En Marche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Couloir Mise En Marche</em>' containment reference.
	 * @see #setLargeurCouloirMiseEnMarche(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime_LargeurCouloirMiseEnMarche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurCouloirMiseEnMarche'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurCouloirMiseEnMarche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiMaritime#getLargeurCouloirMiseEnMarche <em>Largeur Couloir Mise En Marche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Couloir Mise En Marche</em>' containment reference.
	 * @see #getLargeurCouloirMiseEnMarche()
	 * @generated
	 */
	void setLargeurCouloirMiseEnMarche(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Instructions Passage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiMaritimeInstructionsPassage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions Passage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions Passage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiMaritimeInstructionsPassage
	 * @see #isSetInstructionsPassage()
	 * @see #unsetInstructionsPassage()
	 * @see #setInstructionsPassage(TypeDictionaryDicoEmploiMaritimeInstructionsPassage)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime_InstructionsPassage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='InstructionsPassage'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiMaritimeInstructionsPassage getInstructionsPassage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiMaritime#getInstructionsPassage <em>Instructions Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions Passage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiMaritimeInstructionsPassage
	 * @see #isSetInstructionsPassage()
	 * @see #unsetInstructionsPassage()
	 * @see #getInstructionsPassage()
	 * @generated
	 */
	void setInstructionsPassage(TypeDictionaryDicoEmploiMaritimeInstructionsPassage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiMaritime#getInstructionsPassage <em>Instructions Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstructionsPassage()
	 * @see #getInstructionsPassage()
	 * @see #setInstructionsPassage(TypeDictionaryDicoEmploiMaritimeInstructionsPassage)
	 * @generated
	 */
	void unsetInstructionsPassage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiMaritime#getInstructionsPassage <em>Instructions Passage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instructions Passage</em>' attribute is set.
	 * @see #unsetInstructionsPassage()
	 * @see #getInstructionsPassage()
	 * @see #setInstructionsPassage(TypeDictionaryDicoEmploiMaritimeInstructionsPassage)
	 * @generated
	 */
	boolean isSetInstructionsPassage();

	/**
	 * Returns the value of the '<em><b>Vitesse Passage Recommandee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Passage Recommandee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Passage Recommandee</em>' attribute.
	 * @see #isSetVitessePassageRecommandee()
	 * @see #unsetVitessePassageRecommandee()
	 * @see #setVitessePassageRecommandee(double)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime_VitessePassageRecommandee()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitessePassageRecommandee'"
	 * @generated
	 */
	double getVitessePassageRecommandee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiMaritime#getVitessePassageRecommandee <em>Vitesse Passage Recommandee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Passage Recommandee</em>' attribute.
	 * @see #isSetVitessePassageRecommandee()
	 * @see #unsetVitessePassageRecommandee()
	 * @see #getVitessePassageRecommandee()
	 * @generated
	 */
	void setVitessePassageRecommandee(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiMaritime#getVitessePassageRecommandee <em>Vitesse Passage Recommandee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitessePassageRecommandee()
	 * @see #getVitessePassageRecommandee()
	 * @see #setVitessePassageRecommandee(double)
	 * @generated
	 */
	void unsetVitessePassageRecommandee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiMaritime#getVitessePassageRecommandee <em>Vitesse Passage Recommandee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Passage Recommandee</em>' attribute is set.
	 * @see #unsetVitessePassageRecommandee()
	 * @see #getVitessePassageRecommandee()
	 * @see #setVitessePassageRecommandee(double)
	 * @generated
	 */
	boolean isSetVitessePassageRecommandee();

	/**
	 * Returns the value of the '<em><b>Distance Entre Batiments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Entre Batiments</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Entre Batiments</em>' containment reference.
	 * @see #setDistanceEntreBatiments(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime_DistanceEntreBatiments()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceEntreBatiments'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceEntreBatiments();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiMaritime#getDistanceEntreBatiments <em>Distance Entre Batiments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Entre Batiments</em>' containment reference.
	 * @see #getDistanceEntreBatiments()
	 * @generated
	 */
	void setDistanceEntreBatiments(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Distance Entre Groupes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Entre Groupes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Entre Groupes</em>' containment reference.
	 * @see #setDistanceEntreGroupes(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime_DistanceEntreGroupes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceEntreGroupes'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceEntreGroupes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiMaritime#getDistanceEntreGroupes <em>Distance Entre Groupes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Entre Groupes</em>' containment reference.
	 * @see #getDistanceEntreGroupes()
	 * @generated
	 */
	void setDistanceEntreGroupes(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Nom Batiment Principal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Batiment Principal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Batiment Principal</em>' attribute.
	 * @see #setNomBatimentPrincipal(String)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiMaritime_NomBatimentPrincipal()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='NomBatimentPrincipal'"
	 * @generated
	 */
	String getNomBatimentPrincipal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiMaritime#getNomBatimentPrincipal <em>Nom Batiment Principal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Batiment Principal</em>' attribute.
	 * @see #getNomBatimentPrincipal()
	 * @generated
	 */
	void setNomBatimentPrincipal(String value);

} // TypeEmploiMaritime
