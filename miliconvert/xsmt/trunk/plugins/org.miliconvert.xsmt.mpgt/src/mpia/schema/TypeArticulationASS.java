/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Articulation ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeArticulationASS#getTypeRepartition <em>Type Repartition</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getTypeDLO <em>Type DLO</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getTypeDLOnonRenseigne <em>Type DL Onon Renseigne</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getNatureMission <em>Nature Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getNbEquipesLiaison <em>Nb Equipes Liaison</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getNbEquipesObservation <em>Nb Equipes Observation</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getNbEquipesRadar <em>Nb Equipes Radar</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationASS#getEstCaracteriseParTypeUnite <em>Est Caracterise Par Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeArticulationASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ArticulationASS' kind='elementOnly'"
 * @generated
 */
public interface TypeArticulationASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Repartition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoArticulationASSTypeRepartition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Repartition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Repartition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationASSTypeRepartition
	 * @see #isSetTypeRepartition()
	 * @see #unsetTypeRepartition()
	 * @see #setTypeRepartition(TypeDictionaryDicoArticulationASSTypeRepartition)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_TypeRepartition()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeRepartition'"
	 * @generated
	 */
	TypeDictionaryDicoArticulationASSTypeRepartition getTypeRepartition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getTypeRepartition <em>Type Repartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Repartition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationASSTypeRepartition
	 * @see #isSetTypeRepartition()
	 * @see #unsetTypeRepartition()
	 * @see #getTypeRepartition()
	 * @generated
	 */
	void setTypeRepartition(TypeDictionaryDicoArticulationASSTypeRepartition value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationASS#getTypeRepartition <em>Type Repartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeRepartition()
	 * @see #getTypeRepartition()
	 * @see #setTypeRepartition(TypeDictionaryDicoArticulationASSTypeRepartition)
	 * @generated
	 */
	void unsetTypeRepartition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationASS#getTypeRepartition <em>Type Repartition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Repartition</em>' attribute is set.
	 * @see #unsetTypeRepartition()
	 * @see #getTypeRepartition()
	 * @see #setTypeRepartition(TypeDictionaryDicoArticulationASSTypeRepartition)
	 * @generated
	 */
	boolean isSetTypeRepartition();

	/**
	 * Returns the value of the '<em><b>Type DLO</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeDLO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type DLO</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type DLO</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeDLO
	 * @see #isSetTypeDLO()
	 * @see #unsetTypeDLO()
	 * @see #setTypeDLO(TypeDictionaryDicoTypeDLO)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_TypeDLO()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeDLO'"
	 * @generated
	 */
	TypeDictionaryDicoTypeDLO getTypeDLO();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getTypeDLO <em>Type DLO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type DLO</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeDLO
	 * @see #isSetTypeDLO()
	 * @see #unsetTypeDLO()
	 * @see #getTypeDLO()
	 * @generated
	 */
	void setTypeDLO(TypeDictionaryDicoTypeDLO value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationASS#getTypeDLO <em>Type DLO</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDLO()
	 * @see #getTypeDLO()
	 * @see #setTypeDLO(TypeDictionaryDicoTypeDLO)
	 * @generated
	 */
	void unsetTypeDLO();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationASS#getTypeDLO <em>Type DLO</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type DLO</em>' attribute is set.
	 * @see #unsetTypeDLO()
	 * @see #getTypeDLO()
	 * @see #setTypeDLO(TypeDictionaryDicoTypeDLO)
	 * @generated
	 */
	boolean isSetTypeDLO();

	/**
	 * Returns the value of the '<em><b>Type DL Onon Renseigne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type DL Onon Renseigne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type DL Onon Renseigne</em>' attribute.
	 * @see #setTypeDLOnonRenseigne(String)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_TypeDLOnonRenseigne()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeDLOnonRenseigne'"
	 * @generated
	 */
	String getTypeDLOnonRenseigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getTypeDLOnonRenseigne <em>Type DL Onon Renseigne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type DL Onon Renseigne</em>' attribute.
	 * @see #getTypeDLOnonRenseigne()
	 * @generated
	 */
	void setTypeDLOnonRenseigne(String value);

	/**
	 * Returns the value of the '<em><b>Nature Mission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMissionASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionASS
	 * @see #isSetNatureMission()
	 * @see #unsetNatureMission()
	 * @see #setNatureMission(TypeDictionaryDicoTypeMissionASS)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_NatureMission()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='NatureMission'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMissionASS getNatureMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getNatureMission <em>Nature Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Mission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMissionASS
	 * @see #isSetNatureMission()
	 * @see #unsetNatureMission()
	 * @see #getNatureMission()
	 * @generated
	 */
	void setNatureMission(TypeDictionaryDicoTypeMissionASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationASS#getNatureMission <em>Nature Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureMission()
	 * @see #getNatureMission()
	 * @see #setNatureMission(TypeDictionaryDicoTypeMissionASS)
	 * @generated
	 */
	void unsetNatureMission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationASS#getNatureMission <em>Nature Mission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Mission</em>' attribute is set.
	 * @see #unsetNatureMission()
	 * @see #getNatureMission()
	 * @see #setNatureMission(TypeDictionaryDicoTypeMissionASS)
	 * @generated
	 */
	boolean isSetNatureMission();

	/**
	 * Returns the value of the '<em><b>Nb Equipes Liaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Equipes Liaison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Equipes Liaison</em>' attribute.
	 * @see #isSetNbEquipesLiaison()
	 * @see #unsetNbEquipesLiaison()
	 * @see #setNbEquipesLiaison(long)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_NbEquipesLiaison()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbEquipesLiaison'"
	 * @generated
	 */
	long getNbEquipesLiaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesLiaison <em>Nb Equipes Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Equipes Liaison</em>' attribute.
	 * @see #isSetNbEquipesLiaison()
	 * @see #unsetNbEquipesLiaison()
	 * @see #getNbEquipesLiaison()
	 * @generated
	 */
	void setNbEquipesLiaison(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesLiaison <em>Nb Equipes Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbEquipesLiaison()
	 * @see #getNbEquipesLiaison()
	 * @see #setNbEquipesLiaison(long)
	 * @generated
	 */
	void unsetNbEquipesLiaison();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesLiaison <em>Nb Equipes Liaison</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Equipes Liaison</em>' attribute is set.
	 * @see #unsetNbEquipesLiaison()
	 * @see #getNbEquipesLiaison()
	 * @see #setNbEquipesLiaison(long)
	 * @generated
	 */
	boolean isSetNbEquipesLiaison();

	/**
	 * Returns the value of the '<em><b>Nb Equipes Observation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Equipes Observation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Equipes Observation</em>' attribute.
	 * @see #isSetNbEquipesObservation()
	 * @see #unsetNbEquipesObservation()
	 * @see #setNbEquipesObservation(long)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_NbEquipesObservation()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NbEquipesObservation'"
	 * @generated
	 */
	long getNbEquipesObservation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesObservation <em>Nb Equipes Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Equipes Observation</em>' attribute.
	 * @see #isSetNbEquipesObservation()
	 * @see #unsetNbEquipesObservation()
	 * @see #getNbEquipesObservation()
	 * @generated
	 */
	void setNbEquipesObservation(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesObservation <em>Nb Equipes Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbEquipesObservation()
	 * @see #getNbEquipesObservation()
	 * @see #setNbEquipesObservation(long)
	 * @generated
	 */
	void unsetNbEquipesObservation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesObservation <em>Nb Equipes Observation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Equipes Observation</em>' attribute is set.
	 * @see #unsetNbEquipesObservation()
	 * @see #getNbEquipesObservation()
	 * @see #setNbEquipesObservation(long)
	 * @generated
	 */
	boolean isSetNbEquipesObservation();

	/**
	 * Returns the value of the '<em><b>Nb Equipes Radar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Equipes Radar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Equipes Radar</em>' attribute.
	 * @see #isSetNbEquipesRadar()
	 * @see #unsetNbEquipesRadar()
	 * @see #setNbEquipesRadar(long)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_NbEquipesRadar()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbEquipesRadar'"
	 * @generated
	 */
	long getNbEquipesRadar();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesRadar <em>Nb Equipes Radar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Equipes Radar</em>' attribute.
	 * @see #isSetNbEquipesRadar()
	 * @see #unsetNbEquipesRadar()
	 * @see #getNbEquipesRadar()
	 * @generated
	 */
	void setNbEquipesRadar(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesRadar <em>Nb Equipes Radar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbEquipesRadar()
	 * @see #getNbEquipesRadar()
	 * @see #setNbEquipesRadar(long)
	 * @generated
	 */
	void unsetNbEquipesRadar();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationASS#getNbEquipesRadar <em>Nb Equipes Radar</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Equipes Radar</em>' attribute is set.
	 * @see #unsetNbEquipesRadar()
	 * @see #getNbEquipesRadar()
	 * @see #setNbEquipesRadar(long)
	 * @generated
	 */
	boolean isSetNbEquipesRadar();

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
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Unite Fournisseur Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Unite Fournisseur Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Unite Fournisseur Unite</em>' containment reference.
	 * @see #setACommeUniteFournisseurUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_ACommeUniteFournisseurUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstFourniPour_ArticulationASS' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeUniteFournisseur_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeUniteFournisseurUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Unite Fournisseur Unite</em>' containment reference.
	 * @see #getACommeUniteFournisseurUnite()
	 * @generated
	 */
	void setACommeUniteFournisseurUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Unite Beneficiaire Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference.
	 * @see #setACommeUniteBeneficiaireUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_ACommeUniteBeneficiaireUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Beneficie_ArticulationASS' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeUniteBeneficiaire_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeUniteBeneficiaireUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference.
	 * @see #getACommeUniteBeneficiaireUnite()
	 * @generated
	 */
	void setACommeUniteBeneficiaireUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Coordonnees Radio Adresse Radio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference.
	 * @see #setAPourCoordonneesRadioAdresseRadio(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_APourCoordonneesRadioAdresseRadio()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AdresseRadio'"
	 *        extendedMetaData="kind='element' name='APourCoordonneesRadio_AdresseRadio'"
	 * @generated
	 */
	TypeAssociation getAPourCoordonneesRadioAdresseRadio();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Coordonnees Radio Adresse Radio</em>' containment reference.
	 * @see #getAPourCoordonneesRadioAdresseRadio()
	 * @generated
	 */
	void setAPourCoordonneesRadioAdresseRadio(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Caracterise Par Type Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Caracterise Par Type Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Caracterise Par Type Unite</em>' containment reference.
	 * @see #setEstCaracteriseParTypeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationASS_EstCaracteriseParTypeUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeUnite'"
	 *        extendedMetaData="kind='element' name='EstCaracterisePar_TypeUnite'"
	 * @generated
	 */
	TypeAssociationEXT getEstCaracteriseParTypeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationASS#getEstCaracteriseParTypeUnite <em>Est Caracterise Par Type Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Caracterise Par Type Unite</em>' containment reference.
	 * @see #getEstCaracteriseParTypeUnite()
	 * @generated
	 */
	void setEstCaracteriseParTypeUnite(TypeAssociationEXT value);

} // TypeArticulationASS
