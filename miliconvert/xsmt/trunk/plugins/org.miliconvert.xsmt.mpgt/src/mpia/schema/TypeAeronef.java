/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Aeronef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAeronef#getIdentifiantAppareilGenerique <em>Identifiant Appareil Generique</em>}</li>
 *   <li>{@link mpia.schema.TypeAeronef#getNumeroSerieOACI <em>Numero Serie OACI</em>}</li>
 *   <li>{@link mpia.schema.TypeAeronef#getIndicatifOACI <em>Indicatif OACI</em>}</li>
 *   <li>{@link mpia.schema.TypeAeronef#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}</li>
 *   <li>{@link mpia.schema.TypeAeronef#getCommentaireSurPersonnelEmbarque <em>Commentaire Sur Personnel Embarque</em>}</li>
 *   <li>{@link mpia.schema.TypeAeronef#getAutreEquipementEmbarque <em>Autre Equipement Embarque</em>}</li>
 *   <li>{@link mpia.schema.TypeAeronef#getAPourPotentielPotentielAeronef <em>APour Potentiel Potentiel Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAeronef()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Aeronef' kind='elementOnly'"
 * @generated
 */
public interface TypeAeronef extends TypeMateriel {
	/**
	 * Returns the value of the '<em><b>Identifiant Appareil Generique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Appareil Generique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Appareil Generique</em>' attribute.
	 * @see #setIdentifiantAppareilGenerique(String)
	 * @see mpia.schema.SchemaPackage#getTypeAeronef_IdentifiantAppareilGenerique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='IdentifiantAppareilGenerique'"
	 * @generated
	 */
	String getIdentifiantAppareilGenerique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAeronef#getIdentifiantAppareilGenerique <em>Identifiant Appareil Generique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Appareil Generique</em>' attribute.
	 * @see #getIdentifiantAppareilGenerique()
	 * @generated
	 */
	void setIdentifiantAppareilGenerique(String value);

	/**
	 * Returns the value of the '<em><b>Numero Serie OACI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Serie OACI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Serie OACI</em>' attribute.
	 * @see #setNumeroSerieOACI(String)
	 * @see mpia.schema.SchemaPackage#getTypeAeronef_NumeroSerieOACI()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='NumeroSerieOACI'"
	 * @generated
	 */
	String getNumeroSerieOACI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAeronef#getNumeroSerieOACI <em>Numero Serie OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Serie OACI</em>' attribute.
	 * @see #getNumeroSerieOACI()
	 * @generated
	 */
	void setNumeroSerieOACI(String value);

	/**
	 * Returns the value of the '<em><b>Indicatif OACI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicatif OACI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicatif OACI</em>' attribute.
	 * @see #setIndicatifOACI(String)
	 * @see mpia.schema.SchemaPackage#getTypeAeronef_IndicatifOACI()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='IndicatifOACI'"
	 * @generated
	 */
	String getIndicatifOACI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAeronef#getIndicatifOACI <em>Indicatif OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicatif OACI</em>' attribute.
	 * @see #getIndicatifOACI()
	 * @generated
	 */
	void setIndicatifOACI(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Personnes Embarquees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Personnes Embarquees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Personnes Embarquees</em>' attribute.
	 * @see #isSetNombrePersonnesEmbarquees()
	 * @see #unsetNombrePersonnesEmbarquees()
	 * @see #setNombrePersonnesEmbarquees(long)
	 * @see mpia.schema.SchemaPackage#getTypeAeronef_NombrePersonnesEmbarquees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombrePersonnesEmbarquees'"
	 * @generated
	 */
	long getNombrePersonnesEmbarquees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAeronef#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Personnes Embarquees</em>' attribute.
	 * @see #isSetNombrePersonnesEmbarquees()
	 * @see #unsetNombrePersonnesEmbarquees()
	 * @see #getNombrePersonnesEmbarquees()
	 * @generated
	 */
	void setNombrePersonnesEmbarquees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAeronef#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePersonnesEmbarquees()
	 * @see #getNombrePersonnesEmbarquees()
	 * @see #setNombrePersonnesEmbarquees(long)
	 * @generated
	 */
	void unsetNombrePersonnesEmbarquees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAeronef#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Personnes Embarquees</em>' attribute is set.
	 * @see #unsetNombrePersonnesEmbarquees()
	 * @see #getNombrePersonnesEmbarquees()
	 * @see #setNombrePersonnesEmbarquees(long)
	 * @generated
	 */
	boolean isSetNombrePersonnesEmbarquees();

	/**
	 * Returns the value of the '<em><b>Commentaire Sur Personnel Embarque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Sur Personnel Embarque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Sur Personnel Embarque</em>' attribute.
	 * @see #setCommentaireSurPersonnelEmbarque(String)
	 * @see mpia.schema.SchemaPackage#getTypeAeronef_CommentaireSurPersonnelEmbarque()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='CommentaireSurPersonnelEmbarque'"
	 * @generated
	 */
	String getCommentaireSurPersonnelEmbarque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAeronef#getCommentaireSurPersonnelEmbarque <em>Commentaire Sur Personnel Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Sur Personnel Embarque</em>' attribute.
	 * @see #getCommentaireSurPersonnelEmbarque()
	 * @generated
	 */
	void setCommentaireSurPersonnelEmbarque(String value);

	/**
	 * Returns the value of the '<em><b>Autre Equipement Embarque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Equipement Embarque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Equipement Embarque</em>' attribute.
	 * @see #setAutreEquipementEmbarque(String)
	 * @see mpia.schema.SchemaPackage#getTypeAeronef_AutreEquipementEmbarque()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='AutreEquipementEmbarque'"
	 * @generated
	 */
	String getAutreEquipementEmbarque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAeronef#getAutreEquipementEmbarque <em>Autre Equipement Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Equipement Embarque</em>' attribute.
	 * @see #getAutreEquipementEmbarque()
	 * @generated
	 */
	void setAutreEquipementEmbarque(String value);

	/**
	 * Returns the value of the '<em><b>APour Potentiel Potentiel Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Potentiel Potentiel Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Potentiel Potentiel Aeronef</em>' containment reference.
	 * @see #setAPourPotentielPotentielAeronef(TypePotentielAeronef)
	 * @see mpia.schema.SchemaPackage#getTypeAeronef_APourPotentielPotentielAeronef()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PotentielAeronef'"
	 *        extendedMetaData="kind='element' name='APourPotentiel_PotentielAeronef'"
	 * @generated
	 */
	TypePotentielAeronef getAPourPotentielPotentielAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAeronef#getAPourPotentielPotentielAeronef <em>APour Potentiel Potentiel Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Potentiel Potentiel Aeronef</em>' containment reference.
	 * @see #getAPourPotentielPotentielAeronef()
	 * @generated
	 */
	void setAPourPotentielPotentielAeronef(TypePotentielAeronef value);

} // TypeAeronef
