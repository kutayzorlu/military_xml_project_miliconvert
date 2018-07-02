/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Emploi Aeronef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEmploiAeronef#getApprocheDecalee <em>Approche Decalee</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiAeronef#getModeDebarquement <em>Mode Debarquement</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiAeronef#isBesoinCompteRenduEnVol <em>Besoin Compte Rendu En Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiAeronef#getDirectionEntree <em>Direction Entree</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiAeronef#getDirectionSortie <em>Direction Sortie</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiAeronef#getRoleOperationnel <em>Role Operationnel</em>}</li>
 *   <li>{@link mpia.schema.TypeEmploiAeronef#getCompositionEquipage <em>Composition Equipage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEmploiAeronef()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EmploiAeronef' kind='elementOnly'"
 * @generated
 */
public interface TypeEmploiAeronef extends TypeEmploiRessourceActivite {
	/**
	 * Returns the value of the '<em><b>Approche Decalee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiAeronefApprocheDecalee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approche Decalee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approche Decalee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiAeronefApprocheDecalee
	 * @see #isSetApprocheDecalee()
	 * @see #unsetApprocheDecalee()
	 * @see #setApprocheDecalee(TypeDictionaryDicoEmploiAeronefApprocheDecalee)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiAeronef_ApprocheDecalee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ApprocheDecalee'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiAeronefApprocheDecalee getApprocheDecalee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiAeronef#getApprocheDecalee <em>Approche Decalee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approche Decalee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiAeronefApprocheDecalee
	 * @see #isSetApprocheDecalee()
	 * @see #unsetApprocheDecalee()
	 * @see #getApprocheDecalee()
	 * @generated
	 */
	void setApprocheDecalee(TypeDictionaryDicoEmploiAeronefApprocheDecalee value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiAeronef#getApprocheDecalee <em>Approche Decalee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApprocheDecalee()
	 * @see #getApprocheDecalee()
	 * @see #setApprocheDecalee(TypeDictionaryDicoEmploiAeronefApprocheDecalee)
	 * @generated
	 */
	void unsetApprocheDecalee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiAeronef#getApprocheDecalee <em>Approche Decalee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Approche Decalee</em>' attribute is set.
	 * @see #unsetApprocheDecalee()
	 * @see #getApprocheDecalee()
	 * @see #setApprocheDecalee(TypeDictionaryDicoEmploiAeronefApprocheDecalee)
	 * @generated
	 */
	boolean isSetApprocheDecalee();

	/**
	 * Returns the value of the '<em><b>Mode Debarquement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiAeronefModeDebarquement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Debarquement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Debarquement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiAeronefModeDebarquement
	 * @see #isSetModeDebarquement()
	 * @see #unsetModeDebarquement()
	 * @see #setModeDebarquement(TypeDictionaryDicoEmploiAeronefModeDebarquement)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiAeronef_ModeDebarquement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeDebarquement'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiAeronefModeDebarquement getModeDebarquement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiAeronef#getModeDebarquement <em>Mode Debarquement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Debarquement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiAeronefModeDebarquement
	 * @see #isSetModeDebarquement()
	 * @see #unsetModeDebarquement()
	 * @see #getModeDebarquement()
	 * @generated
	 */
	void setModeDebarquement(TypeDictionaryDicoEmploiAeronefModeDebarquement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiAeronef#getModeDebarquement <em>Mode Debarquement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeDebarquement()
	 * @see #getModeDebarquement()
	 * @see #setModeDebarquement(TypeDictionaryDicoEmploiAeronefModeDebarquement)
	 * @generated
	 */
	void unsetModeDebarquement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiAeronef#getModeDebarquement <em>Mode Debarquement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Debarquement</em>' attribute is set.
	 * @see #unsetModeDebarquement()
	 * @see #getModeDebarquement()
	 * @see #setModeDebarquement(TypeDictionaryDicoEmploiAeronefModeDebarquement)
	 * @generated
	 */
	boolean isSetModeDebarquement();

	/**
	 * Returns the value of the '<em><b>Besoin Compte Rendu En Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Besoin Compte Rendu En Vol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Besoin Compte Rendu En Vol</em>' attribute.
	 * @see #isSetBesoinCompteRenduEnVol()
	 * @see #unsetBesoinCompteRenduEnVol()
	 * @see #setBesoinCompteRenduEnVol(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiAeronef_BesoinCompteRenduEnVol()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='BesoinCompteRenduEnVol'"
	 * @generated
	 */
	boolean isBesoinCompteRenduEnVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiAeronef#isBesoinCompteRenduEnVol <em>Besoin Compte Rendu En Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besoin Compte Rendu En Vol</em>' attribute.
	 * @see #isSetBesoinCompteRenduEnVol()
	 * @see #unsetBesoinCompteRenduEnVol()
	 * @see #isBesoinCompteRenduEnVol()
	 * @generated
	 */
	void setBesoinCompteRenduEnVol(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiAeronef#isBesoinCompteRenduEnVol <em>Besoin Compte Rendu En Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBesoinCompteRenduEnVol()
	 * @see #isBesoinCompteRenduEnVol()
	 * @see #setBesoinCompteRenduEnVol(boolean)
	 * @generated
	 */
	void unsetBesoinCompteRenduEnVol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiAeronef#isBesoinCompteRenduEnVol <em>Besoin Compte Rendu En Vol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Besoin Compte Rendu En Vol</em>' attribute is set.
	 * @see #unsetBesoinCompteRenduEnVol()
	 * @see #isBesoinCompteRenduEnVol()
	 * @see #setBesoinCompteRenduEnVol(boolean)
	 * @generated
	 */
	boolean isSetBesoinCompteRenduEnVol();

	/**
	 * Returns the value of the '<em><b>Direction Entree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Entree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Entree</em>' containment reference.
	 * @see #setDirectionEntree(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiAeronef_DirectionEntree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionEntree'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionEntree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiAeronef#getDirectionEntree <em>Direction Entree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Entree</em>' containment reference.
	 * @see #getDirectionEntree()
	 * @generated
	 */
	void setDirectionEntree(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Direction Sortie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Sortie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Sortie</em>' containment reference.
	 * @see #setDirectionSortie(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiAeronef_DirectionSortie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionSortie'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionSortie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiAeronef#getDirectionSortie <em>Direction Sortie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Sortie</em>' containment reference.
	 * @see #getDirectionSortie()
	 * @generated
	 */
	void setDirectionSortie(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Role Operationnel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiAeronefRoleOperationnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Operationnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiAeronefRoleOperationnel
	 * @see #isSetRoleOperationnel()
	 * @see #unsetRoleOperationnel()
	 * @see #setRoleOperationnel(TypeDictionaryDicoEmploiAeronefRoleOperationnel)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiAeronef_RoleOperationnel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RoleOperationnel'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiAeronefRoleOperationnel getRoleOperationnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiAeronef#getRoleOperationnel <em>Role Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Operationnel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiAeronefRoleOperationnel
	 * @see #isSetRoleOperationnel()
	 * @see #unsetRoleOperationnel()
	 * @see #getRoleOperationnel()
	 * @generated
	 */
	void setRoleOperationnel(TypeDictionaryDicoEmploiAeronefRoleOperationnel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiAeronef#getRoleOperationnel <em>Role Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoleOperationnel()
	 * @see #getRoleOperationnel()
	 * @see #setRoleOperationnel(TypeDictionaryDicoEmploiAeronefRoleOperationnel)
	 * @generated
	 */
	void unsetRoleOperationnel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiAeronef#getRoleOperationnel <em>Role Operationnel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Role Operationnel</em>' attribute is set.
	 * @see #unsetRoleOperationnel()
	 * @see #getRoleOperationnel()
	 * @see #setRoleOperationnel(TypeDictionaryDicoEmploiAeronefRoleOperationnel)
	 * @generated
	 */
	boolean isSetRoleOperationnel();

	/**
	 * Returns the value of the '<em><b>Composition Equipage</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEmploiAeronefCompositionEquipage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Equipage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Equipage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiAeronefCompositionEquipage
	 * @see #isSetCompositionEquipage()
	 * @see #unsetCompositionEquipage()
	 * @see #setCompositionEquipage(TypeDictionaryDicoEmploiAeronefCompositionEquipage)
	 * @see mpia.schema.SchemaPackage#getTypeEmploiAeronef_CompositionEquipage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CompositionEquipage'"
	 * @generated
	 */
	TypeDictionaryDicoEmploiAeronefCompositionEquipage getCompositionEquipage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEmploiAeronef#getCompositionEquipage <em>Composition Equipage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition Equipage</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEmploiAeronefCompositionEquipage
	 * @see #isSetCompositionEquipage()
	 * @see #unsetCompositionEquipage()
	 * @see #getCompositionEquipage()
	 * @generated
	 */
	void setCompositionEquipage(TypeDictionaryDicoEmploiAeronefCompositionEquipage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEmploiAeronef#getCompositionEquipage <em>Composition Equipage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositionEquipage()
	 * @see #getCompositionEquipage()
	 * @see #setCompositionEquipage(TypeDictionaryDicoEmploiAeronefCompositionEquipage)
	 * @generated
	 */
	void unsetCompositionEquipage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEmploiAeronef#getCompositionEquipage <em>Composition Equipage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Composition Equipage</em>' attribute is set.
	 * @see #unsetCompositionEquipage()
	 * @see #getCompositionEquipage()
	 * @see #setCompositionEquipage(TypeDictionaryDicoEmploiAeronefCompositionEquipage)
	 * @generated
	 */
	boolean isSetCompositionEquipage();

} // TypeEmploiAeronef
