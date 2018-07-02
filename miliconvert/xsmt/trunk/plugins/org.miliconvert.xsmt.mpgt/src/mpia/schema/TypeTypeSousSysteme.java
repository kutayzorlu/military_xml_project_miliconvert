/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Sous Systeme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeSousSysteme#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousSysteme#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousSysteme#getTypeFonctionnement <em>Type Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousSysteme#getAutrePanne <em>Autre Panne</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousSysteme#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousSysteme#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSousSysteme#getConcerneTypeEquipement <em>Concerne Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeSousSysteme()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_TypeSousSysteme' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeSousSysteme extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeSousSystemeCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSousSystemeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeSousSystemeCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousSysteme_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeSousSystemeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSousSystemeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeSousSystemeCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeSousSystemeCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeSousSysteme#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeSousSystemeCategorie)
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousSysteme_AutreCategorie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreCategorie'"
	 * @generated
	 */
	String getAutreCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getAutreCategorie <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Categorie</em>' attribute.
	 * @see #getAutreCategorie()
	 * @generated
	 */
	void setAutreCategorie(String value);

	/**
	 * Returns the value of the '<em><b>Type Fonctionnement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeSousSystemeTypeFonctionnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Fonctionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Fonctionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSousSystemeTypeFonctionnement
	 * @see #isSetTypeFonctionnement()
	 * @see #unsetTypeFonctionnement()
	 * @see #setTypeFonctionnement(TypeDictionaryDicoTypeSousSystemeTypeFonctionnement)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousSysteme_TypeFonctionnement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeFonctionnement'"
	 * @generated
	 */
	TypeDictionaryDicoTypeSousSystemeTypeFonctionnement getTypeFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getTypeFonctionnement <em>Type Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Fonctionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeSousSystemeTypeFonctionnement
	 * @see #isSetTypeFonctionnement()
	 * @see #unsetTypeFonctionnement()
	 * @see #getTypeFonctionnement()
	 * @generated
	 */
	void setTypeFonctionnement(TypeDictionaryDicoTypeSousSystemeTypeFonctionnement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getTypeFonctionnement <em>Type Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeFonctionnement()
	 * @see #getTypeFonctionnement()
	 * @see #setTypeFonctionnement(TypeDictionaryDicoTypeSousSystemeTypeFonctionnement)
	 * @generated
	 */
	void unsetTypeFonctionnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeSousSysteme#getTypeFonctionnement <em>Type Fonctionnement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Fonctionnement</em>' attribute is set.
	 * @see #unsetTypeFonctionnement()
	 * @see #getTypeFonctionnement()
	 * @see #setTypeFonctionnement(TypeDictionaryDicoTypeSousSystemeTypeFonctionnement)
	 * @generated
	 */
	boolean isSetTypeFonctionnement();

	/**
	 * Returns the value of the '<em><b>Autre Panne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Panne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Panne</em>' attribute.
	 * @see #setAutrePanne(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousSysteme_AutrePanne()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='AutrePanne'"
	 * @generated
	 */
	String getAutrePanne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getAutrePanne <em>Autre Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Panne</em>' attribute.
	 * @see #getAutrePanne()
	 * @generated
	 */
	void setAutrePanne(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousSysteme_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousSysteme_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Equipement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Equipement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Equipement</em>' containment reference.
	 * @see #setConcerneTypeEquipement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSousSysteme_ConcerneTypeEquipement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipement'"
	 *        extendedMetaData="kind='element' name='Concerne_TypeEquipement'"
	 * @generated
	 */
	TypeAssociation getConcerneTypeEquipement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSousSysteme#getConcerneTypeEquipement <em>Concerne Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Equipement</em>' containment reference.
	 * @see #getConcerneTypeEquipement()
	 * @generated
	 */
	void setConcerneTypeEquipement(TypeAssociation value);

} // TypeTypeSousSysteme
