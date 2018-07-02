/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Agent Biologique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeAgentBiologique#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentBiologique#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentBiologique#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentBiologique#getPersistance <em>Persistance</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentBiologique#isContagiosite <em>Contagiosite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeAgentBiologique#getModeContamination <em>Mode Contamination</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeAgentBiologique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeAgentBiologique' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeAgentBiologique extends TypeTypeConsommable {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAgentBiologiqueCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentBiologiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentBiologiqueCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentBiologique_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAgentBiologiqueCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentBiologiqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeAgentBiologiqueCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentBiologiqueCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeAgentBiologiqueCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Autre Categorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Categorie</em>' attribute.
	 * @see #setAutreCategorie(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentBiologique_AutreCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='AutreCategorie'"
	 * @generated
	 */
	String getAutreCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getAutreCategorie <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Categorie</em>' attribute.
	 * @see #getAutreCategorie()
	 * @generated
	 */
	void setAutreCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeAgentBiologiqueSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentBiologiqueSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeAgentBiologiqueSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentBiologique_SousCategorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeAgentBiologiqueSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeAgentBiologiqueSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoTypeAgentBiologiqueSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeAgentBiologiqueSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoTypeAgentBiologiqueSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Persistance</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPersistance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPersistance
	 * @see #isSetPersistance()
	 * @see #unsetPersistance()
	 * @see #setPersistance(TypeDictionaryDicoPersistance)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentBiologique_Persistance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Persistance'"
	 * @generated
	 */
	TypeDictionaryDicoPersistance getPersistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getPersistance <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistance</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPersistance
	 * @see #isSetPersistance()
	 * @see #unsetPersistance()
	 * @see #getPersistance()
	 * @generated
	 */
	void setPersistance(TypeDictionaryDicoPersistance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getPersistance <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistance()
	 * @see #getPersistance()
	 * @see #setPersistance(TypeDictionaryDicoPersistance)
	 * @generated
	 */
	void unsetPersistance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getPersistance <em>Persistance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistance</em>' attribute is set.
	 * @see #unsetPersistance()
	 * @see #getPersistance()
	 * @see #setPersistance(TypeDictionaryDicoPersistance)
	 * @generated
	 */
	boolean isSetPersistance();

	/**
	 * Returns the value of the '<em><b>Contagiosite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contagiosite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contagiosite</em>' attribute.
	 * @see #isSetContagiosite()
	 * @see #unsetContagiosite()
	 * @see #setContagiosite(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentBiologique_Contagiosite()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Contagiosite'"
	 * @generated
	 */
	boolean isContagiosite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#isContagiosite <em>Contagiosite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contagiosite</em>' attribute.
	 * @see #isSetContagiosite()
	 * @see #unsetContagiosite()
	 * @see #isContagiosite()
	 * @generated
	 */
	void setContagiosite(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#isContagiosite <em>Contagiosite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContagiosite()
	 * @see #isContagiosite()
	 * @see #setContagiosite(boolean)
	 * @generated
	 */
	void unsetContagiosite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeAgentBiologique#isContagiosite <em>Contagiosite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contagiosite</em>' attribute is set.
	 * @see #unsetContagiosite()
	 * @see #isContagiosite()
	 * @see #setContagiosite(boolean)
	 * @generated
	 */
	boolean isSetContagiosite();

	/**
	 * Returns the value of the '<em><b>Mode Contamination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Contamination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Contamination</em>' attribute.
	 * @see #setModeContamination(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeAgentBiologique_ModeContamination()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ModeContamination'"
	 * @generated
	 */
	String getModeContamination();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeAgentBiologique#getModeContamination <em>Mode Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Contamination</em>' attribute.
	 * @see #getModeContamination()
	 * @generated
	 */
	void setModeContamination(String value);

} // TypeTypeAgentBiologique
