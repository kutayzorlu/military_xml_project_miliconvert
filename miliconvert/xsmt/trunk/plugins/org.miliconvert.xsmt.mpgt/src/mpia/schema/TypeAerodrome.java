/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Aerodrome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAerodrome#getCodeOACI <em>Code OACI</em>}</li>
 *   <li>{@link mpia.schema.TypeAerodrome#isControleAerien <em>Controle Aerien</em>}</li>
 *   <li>{@link mpia.schema.TypeAerodrome#isAtterrissageAuxInstruments <em>Atterrissage Aux Instruments</em>}</li>
 *   <li>{@link mpia.schema.TypeAerodrome#isLocalisationVisuelleAerodrome <em>Localisation Visuelle Aerodrome</em>}</li>
 *   <li>{@link mpia.schema.TypeAerodrome#isDefenseSolAir <em>Defense Sol Air</em>}</li>
 *   <li>{@link mpia.schema.TypeAerodrome#getSurfaceZoneHangar <em>Surface Zone Hangar</em>}</li>
 *   <li>{@link mpia.schema.TypeAerodrome#getAPourFrequenceApprocheFrequence <em>APour Frequence Approche Frequence</em>}</li>
 *   <li>{@link mpia.schema.TypeAerodrome#getAPourFrequenceTourFrequence <em>APour Frequence Tour Frequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAerodrome()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Aerodrome' kind='elementOnly'"
 * @generated
 */
public interface TypeAerodrome extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Code OACI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code OACI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code OACI</em>' attribute.
	 * @see #setCodeOACI(String)
	 * @see mpia.schema.SchemaPackage#getTypeAerodrome_CodeOACI()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='CodeOACI'"
	 * @generated
	 */
	String getCodeOACI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAerodrome#getCodeOACI <em>Code OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code OACI</em>' attribute.
	 * @see #getCodeOACI()
	 * @generated
	 */
	void setCodeOACI(String value);

	/**
	 * Returns the value of the '<em><b>Controle Aerien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controle Aerien</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controle Aerien</em>' attribute.
	 * @see #isSetControleAerien()
	 * @see #unsetControleAerien()
	 * @see #setControleAerien(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAerodrome_ControleAerien()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ControleAerien'"
	 * @generated
	 */
	boolean isControleAerien();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAerodrome#isControleAerien <em>Controle Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controle Aerien</em>' attribute.
	 * @see #isSetControleAerien()
	 * @see #unsetControleAerien()
	 * @see #isControleAerien()
	 * @generated
	 */
	void setControleAerien(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAerodrome#isControleAerien <em>Controle Aerien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControleAerien()
	 * @see #isControleAerien()
	 * @see #setControleAerien(boolean)
	 * @generated
	 */
	void unsetControleAerien();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAerodrome#isControleAerien <em>Controle Aerien</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Controle Aerien</em>' attribute is set.
	 * @see #unsetControleAerien()
	 * @see #isControleAerien()
	 * @see #setControleAerien(boolean)
	 * @generated
	 */
	boolean isSetControleAerien();

	/**
	 * Returns the value of the '<em><b>Atterrissage Aux Instruments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atterrissage Aux Instruments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atterrissage Aux Instruments</em>' attribute.
	 * @see #isSetAtterrissageAuxInstruments()
	 * @see #unsetAtterrissageAuxInstruments()
	 * @see #setAtterrissageAuxInstruments(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAerodrome_AtterrissageAuxInstruments()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='AtterrissageAuxInstruments'"
	 * @generated
	 */
	boolean isAtterrissageAuxInstruments();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAerodrome#isAtterrissageAuxInstruments <em>Atterrissage Aux Instruments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atterrissage Aux Instruments</em>' attribute.
	 * @see #isSetAtterrissageAuxInstruments()
	 * @see #unsetAtterrissageAuxInstruments()
	 * @see #isAtterrissageAuxInstruments()
	 * @generated
	 */
	void setAtterrissageAuxInstruments(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAerodrome#isAtterrissageAuxInstruments <em>Atterrissage Aux Instruments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAtterrissageAuxInstruments()
	 * @see #isAtterrissageAuxInstruments()
	 * @see #setAtterrissageAuxInstruments(boolean)
	 * @generated
	 */
	void unsetAtterrissageAuxInstruments();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAerodrome#isAtterrissageAuxInstruments <em>Atterrissage Aux Instruments</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Atterrissage Aux Instruments</em>' attribute is set.
	 * @see #unsetAtterrissageAuxInstruments()
	 * @see #isAtterrissageAuxInstruments()
	 * @see #setAtterrissageAuxInstruments(boolean)
	 * @generated
	 */
	boolean isSetAtterrissageAuxInstruments();

	/**
	 * Returns the value of the '<em><b>Localisation Visuelle Aerodrome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localisation Visuelle Aerodrome</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localisation Visuelle Aerodrome</em>' attribute.
	 * @see #isSetLocalisationVisuelleAerodrome()
	 * @see #unsetLocalisationVisuelleAerodrome()
	 * @see #setLocalisationVisuelleAerodrome(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAerodrome_LocalisationVisuelleAerodrome()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='LocalisationVisuelleAerodrome'"
	 * @generated
	 */
	boolean isLocalisationVisuelleAerodrome();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAerodrome#isLocalisationVisuelleAerodrome <em>Localisation Visuelle Aerodrome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localisation Visuelle Aerodrome</em>' attribute.
	 * @see #isSetLocalisationVisuelleAerodrome()
	 * @see #unsetLocalisationVisuelleAerodrome()
	 * @see #isLocalisationVisuelleAerodrome()
	 * @generated
	 */
	void setLocalisationVisuelleAerodrome(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAerodrome#isLocalisationVisuelleAerodrome <em>Localisation Visuelle Aerodrome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocalisationVisuelleAerodrome()
	 * @see #isLocalisationVisuelleAerodrome()
	 * @see #setLocalisationVisuelleAerodrome(boolean)
	 * @generated
	 */
	void unsetLocalisationVisuelleAerodrome();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAerodrome#isLocalisationVisuelleAerodrome <em>Localisation Visuelle Aerodrome</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Localisation Visuelle Aerodrome</em>' attribute is set.
	 * @see #unsetLocalisationVisuelleAerodrome()
	 * @see #isLocalisationVisuelleAerodrome()
	 * @see #setLocalisationVisuelleAerodrome(boolean)
	 * @generated
	 */
	boolean isSetLocalisationVisuelleAerodrome();

	/**
	 * Returns the value of the '<em><b>Defense Sol Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defense Sol Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defense Sol Air</em>' attribute.
	 * @see #isSetDefenseSolAir()
	 * @see #unsetDefenseSolAir()
	 * @see #setDefenseSolAir(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeAerodrome_DefenseSolAir()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DefenseSolAir'"
	 * @generated
	 */
	boolean isDefenseSolAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAerodrome#isDefenseSolAir <em>Defense Sol Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defense Sol Air</em>' attribute.
	 * @see #isSetDefenseSolAir()
	 * @see #unsetDefenseSolAir()
	 * @see #isDefenseSolAir()
	 * @generated
	 */
	void setDefenseSolAir(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAerodrome#isDefenseSolAir <em>Defense Sol Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefenseSolAir()
	 * @see #isDefenseSolAir()
	 * @see #setDefenseSolAir(boolean)
	 * @generated
	 */
	void unsetDefenseSolAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAerodrome#isDefenseSolAir <em>Defense Sol Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defense Sol Air</em>' attribute is set.
	 * @see #unsetDefenseSolAir()
	 * @see #isDefenseSolAir()
	 * @see #setDefenseSolAir(boolean)
	 * @generated
	 */
	boolean isSetDefenseSolAir();

	/**
	 * Returns the value of the '<em><b>Surface Zone Hangar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Zone Hangar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Zone Hangar</em>' containment reference.
	 * @see #setSurfaceZoneHangar(TypeDataTypeAire)
	 * @see mpia.schema.SchemaPackage#getTypeAerodrome_SurfaceZoneHangar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SurfaceZoneHangar'"
	 * @generated
	 */
	TypeDataTypeAire getSurfaceZoneHangar();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAerodrome#getSurfaceZoneHangar <em>Surface Zone Hangar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Zone Hangar</em>' containment reference.
	 * @see #getSurfaceZoneHangar()
	 * @generated
	 */
	void setSurfaceZoneHangar(TypeDataTypeAire value);

	/**
	 * Returns the value of the '<em><b>APour Frequence Approche Frequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Frequence Approche Frequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Frequence Approche Frequence</em>' containment reference.
	 * @see #setAPourFrequenceApprocheFrequence(TypeFrequence)
	 * @see mpia.schema.SchemaPackage#getTypeAerodrome_APourFrequenceApprocheFrequence()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Frequence'"
	 *        extendedMetaData="kind='element' name='APourFrequenceApproche_Frequence'"
	 * @generated
	 */
	TypeFrequence getAPourFrequenceApprocheFrequence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAerodrome#getAPourFrequenceApprocheFrequence <em>APour Frequence Approche Frequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Frequence Approche Frequence</em>' containment reference.
	 * @see #getAPourFrequenceApprocheFrequence()
	 * @generated
	 */
	void setAPourFrequenceApprocheFrequence(TypeFrequence value);

	/**
	 * Returns the value of the '<em><b>APour Frequence Tour Frequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Frequence Tour Frequence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Frequence Tour Frequence</em>' containment reference.
	 * @see #setAPourFrequenceTourFrequence(TypeFrequence)
	 * @see mpia.schema.SchemaPackage#getTypeAerodrome_APourFrequenceTourFrequence()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Frequence'"
	 *        extendedMetaData="kind='element' name='APourFrequenceTour_Frequence'"
	 * @generated
	 */
	TypeFrequence getAPourFrequenceTourFrequence();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAerodrome#getAPourFrequenceTourFrequence <em>APour Frequence Tour Frequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Frequence Tour Frequence</em>' containment reference.
	 * @see #getAPourFrequenceTourFrequence()
	 * @generated
	 */
	void setAPourFrequenceTourFrequence(TypeFrequence value);

} // TypeAerodrome
