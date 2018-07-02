/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Caracteristique Logistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParAir <em>Transport Par Air</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParPipeline <em>Transport Par Pipeline</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParRoute <em>Transport Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueLogistique#getCodeLocalisation <em>Code Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParMer <em>Transport Par Mer</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParRail <em>Transport Par Rail</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParVoieFluviale <em>Transport Par Voie Fluviale</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueLogistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiqueLogistique' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiqueLogistique extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Transport Par Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Par Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Par Air</em>' attribute.
	 * @see #isSetTransportParAir()
	 * @see #unsetTransportParAir()
	 * @see #setTransportParAir(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueLogistique_TransportParAir()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportParAir'"
	 * @generated
	 */
	boolean isTransportParAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParAir <em>Transport Par Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Par Air</em>' attribute.
	 * @see #isSetTransportParAir()
	 * @see #unsetTransportParAir()
	 * @see #isTransportParAir()
	 * @generated
	 */
	void setTransportParAir(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParAir <em>Transport Par Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportParAir()
	 * @see #isTransportParAir()
	 * @see #setTransportParAir(boolean)
	 * @generated
	 */
	void unsetTransportParAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParAir <em>Transport Par Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Par Air</em>' attribute is set.
	 * @see #unsetTransportParAir()
	 * @see #isTransportParAir()
	 * @see #setTransportParAir(boolean)
	 * @generated
	 */
	boolean isSetTransportParAir();

	/**
	 * Returns the value of the '<em><b>Transport Par Pipeline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Par Pipeline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Par Pipeline</em>' attribute.
	 * @see #isSetTransportParPipeline()
	 * @see #unsetTransportParPipeline()
	 * @see #setTransportParPipeline(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueLogistique_TransportParPipeline()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportParPipeline'"
	 * @generated
	 */
	boolean isTransportParPipeline();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParPipeline <em>Transport Par Pipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Par Pipeline</em>' attribute.
	 * @see #isSetTransportParPipeline()
	 * @see #unsetTransportParPipeline()
	 * @see #isTransportParPipeline()
	 * @generated
	 */
	void setTransportParPipeline(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParPipeline <em>Transport Par Pipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportParPipeline()
	 * @see #isTransportParPipeline()
	 * @see #setTransportParPipeline(boolean)
	 * @generated
	 */
	void unsetTransportParPipeline();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParPipeline <em>Transport Par Pipeline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Par Pipeline</em>' attribute is set.
	 * @see #unsetTransportParPipeline()
	 * @see #isTransportParPipeline()
	 * @see #setTransportParPipeline(boolean)
	 * @generated
	 */
	boolean isSetTransportParPipeline();

	/**
	 * Returns the value of the '<em><b>Transport Par Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Par Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Par Route</em>' attribute.
	 * @see #isSetTransportParRoute()
	 * @see #unsetTransportParRoute()
	 * @see #setTransportParRoute(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueLogistique_TransportParRoute()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportParRoute'"
	 * @generated
	 */
	boolean isTransportParRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParRoute <em>Transport Par Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Par Route</em>' attribute.
	 * @see #isSetTransportParRoute()
	 * @see #unsetTransportParRoute()
	 * @see #isTransportParRoute()
	 * @generated
	 */
	void setTransportParRoute(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParRoute <em>Transport Par Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportParRoute()
	 * @see #isTransportParRoute()
	 * @see #setTransportParRoute(boolean)
	 * @generated
	 */
	void unsetTransportParRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParRoute <em>Transport Par Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Par Route</em>' attribute is set.
	 * @see #unsetTransportParRoute()
	 * @see #isTransportParRoute()
	 * @see #setTransportParRoute(boolean)
	 * @generated
	 */
	boolean isSetTransportParRoute();

	/**
	 * Returns the value of the '<em><b>Code Localisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Localisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Localisation</em>' attribute.
	 * @see #setCodeLocalisation(String)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueLogistique_CodeLocalisation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='CodeLocalisation'"
	 * @generated
	 */
	String getCodeLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#getCodeLocalisation <em>Code Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Localisation</em>' attribute.
	 * @see #getCodeLocalisation()
	 * @generated
	 */
	void setCodeLocalisation(String value);

	/**
	 * Returns the value of the '<em><b>Transport Par Mer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Par Mer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Par Mer</em>' attribute.
	 * @see #isSetTransportParMer()
	 * @see #unsetTransportParMer()
	 * @see #setTransportParMer(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueLogistique_TransportParMer()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportParMer'"
	 * @generated
	 */
	boolean isTransportParMer();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParMer <em>Transport Par Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Par Mer</em>' attribute.
	 * @see #isSetTransportParMer()
	 * @see #unsetTransportParMer()
	 * @see #isTransportParMer()
	 * @generated
	 */
	void setTransportParMer(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParMer <em>Transport Par Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportParMer()
	 * @see #isTransportParMer()
	 * @see #setTransportParMer(boolean)
	 * @generated
	 */
	void unsetTransportParMer();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParMer <em>Transport Par Mer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Par Mer</em>' attribute is set.
	 * @see #unsetTransportParMer()
	 * @see #isTransportParMer()
	 * @see #setTransportParMer(boolean)
	 * @generated
	 */
	boolean isSetTransportParMer();

	/**
	 * Returns the value of the '<em><b>Transport Par Rail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Par Rail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Par Rail</em>' attribute.
	 * @see #isSetTransportParRail()
	 * @see #unsetTransportParRail()
	 * @see #setTransportParRail(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueLogistique_TransportParRail()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportParRail'"
	 * @generated
	 */
	boolean isTransportParRail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParRail <em>Transport Par Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Par Rail</em>' attribute.
	 * @see #isSetTransportParRail()
	 * @see #unsetTransportParRail()
	 * @see #isTransportParRail()
	 * @generated
	 */
	void setTransportParRail(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParRail <em>Transport Par Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportParRail()
	 * @see #isTransportParRail()
	 * @see #setTransportParRail(boolean)
	 * @generated
	 */
	void unsetTransportParRail();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParRail <em>Transport Par Rail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Par Rail</em>' attribute is set.
	 * @see #unsetTransportParRail()
	 * @see #isTransportParRail()
	 * @see #setTransportParRail(boolean)
	 * @generated
	 */
	boolean isSetTransportParRail();

	/**
	 * Returns the value of the '<em><b>Transport Par Voie Fluviale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport Par Voie Fluviale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport Par Voie Fluviale</em>' attribute.
	 * @see #isSetTransportParVoieFluviale()
	 * @see #unsetTransportParVoieFluviale()
	 * @see #setTransportParVoieFluviale(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueLogistique_TransportParVoieFluviale()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportParVoieFluviale'"
	 * @generated
	 */
	boolean isTransportParVoieFluviale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParVoieFluviale <em>Transport Par Voie Fluviale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport Par Voie Fluviale</em>' attribute.
	 * @see #isSetTransportParVoieFluviale()
	 * @see #unsetTransportParVoieFluviale()
	 * @see #isTransportParVoieFluviale()
	 * @generated
	 */
	void setTransportParVoieFluviale(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParVoieFluviale <em>Transport Par Voie Fluviale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportParVoieFluviale()
	 * @see #isTransportParVoieFluviale()
	 * @see #setTransportParVoieFluviale(boolean)
	 * @generated
	 */
	void unsetTransportParVoieFluviale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueLogistique#isTransportParVoieFluviale <em>Transport Par Voie Fluviale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transport Par Voie Fluviale</em>' attribute is set.
	 * @see #unsetTransportParVoieFluviale()
	 * @see #isTransportParVoieFluviale()
	 * @see #setTransportParVoieFluviale(boolean)
	 * @generated
	 */
	boolean isSetTransportParVoieFluviale();

} // TypeCaracteristiqueLogistique
