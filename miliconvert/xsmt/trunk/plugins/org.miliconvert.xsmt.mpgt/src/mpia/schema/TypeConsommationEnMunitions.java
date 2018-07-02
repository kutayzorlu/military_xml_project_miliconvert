/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Consommation En Munitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsommationEnMunitions#getNombreMunitions <em>Nombre Munitions</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationEnMunitions#getEffetFeu <em>Effet Feu</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationEnMunitions#getNatureChargeEmise <em>Nature Charge Emise</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationEnMunitions#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationEnMunitions#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationEnMunitions#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommationEnMunitions#getACommeTypeFeuTypeArme <em>AComme Type Feu Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsommationEnMunitions()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConsommationEnMunitions' kind='elementOnly'"
 * @generated
 */
public interface TypeConsommationEnMunitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Munitions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Munitions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Munitions</em>' attribute.
	 * @see #isSetNombreMunitions()
	 * @see #unsetNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationEnMunitions_NombreMunitions()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9" required="true"
	 *        extendedMetaData="kind='element' name='NombreMunitions'"
	 * @generated
	 */
	long getNombreMunitions();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getNombreMunitions <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Munitions</em>' attribute.
	 * @see #isSetNombreMunitions()
	 * @see #unsetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @generated
	 */
	void setNombreMunitions(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getNombreMunitions <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @generated
	 */
	void unsetNombreMunitions();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getNombreMunitions <em>Nombre Munitions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Munitions</em>' attribute is set.
	 * @see #unsetNombreMunitions()
	 * @see #getNombreMunitions()
	 * @see #setNombreMunitions(long)
	 * @generated
	 */
	boolean isSetNombreMunitions();

	/**
	 * Returns the value of the '<em><b>Effet Feu</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsommationEnMunitionsEffetFeu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Feu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Feu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsommationEnMunitionsEffetFeu
	 * @see #isSetEffetFeu()
	 * @see #unsetEffetFeu()
	 * @see #setEffetFeu(TypeDictionaryDicoConsommationEnMunitionsEffetFeu)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationEnMunitions_EffetFeu()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetFeu'"
	 * @generated
	 */
	TypeDictionaryDicoConsommationEnMunitionsEffetFeu getEffetFeu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getEffetFeu <em>Effet Feu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Feu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsommationEnMunitionsEffetFeu
	 * @see #isSetEffetFeu()
	 * @see #unsetEffetFeu()
	 * @see #getEffetFeu()
	 * @generated
	 */
	void setEffetFeu(TypeDictionaryDicoConsommationEnMunitionsEffetFeu value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getEffetFeu <em>Effet Feu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetFeu()
	 * @see #getEffetFeu()
	 * @see #setEffetFeu(TypeDictionaryDicoConsommationEnMunitionsEffetFeu)
	 * @generated
	 */
	void unsetEffetFeu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getEffetFeu <em>Effet Feu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Feu</em>' attribute is set.
	 * @see #unsetEffetFeu()
	 * @see #getEffetFeu()
	 * @see #setEffetFeu(TypeDictionaryDicoConsommationEnMunitionsEffetFeu)
	 * @generated
	 */
	boolean isSetEffetFeu();

	/**
	 * Returns the value of the '<em><b>Nature Charge Emise</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Charge Emise</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Charge Emise</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise
	 * @see #isSetNatureChargeEmise()
	 * @see #unsetNatureChargeEmise()
	 * @see #setNatureChargeEmise(TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationEnMunitions_NatureChargeEmise()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NatureChargeEmise'"
	 * @generated
	 */
	TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise getNatureChargeEmise();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getNatureChargeEmise <em>Nature Charge Emise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Charge Emise</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise
	 * @see #isSetNatureChargeEmise()
	 * @see #unsetNatureChargeEmise()
	 * @see #getNatureChargeEmise()
	 * @generated
	 */
	void setNatureChargeEmise(TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getNatureChargeEmise <em>Nature Charge Emise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureChargeEmise()
	 * @see #getNatureChargeEmise()
	 * @see #setNatureChargeEmise(TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise)
	 * @generated
	 */
	void unsetNatureChargeEmise();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getNatureChargeEmise <em>Nature Charge Emise</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Charge Emise</em>' attribute is set.
	 * @see #unsetNatureChargeEmise()
	 * @see #getNatureChargeEmise()
	 * @see #setNatureChargeEmise(TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise)
	 * @generated
	 */
	boolean isSetNatureChargeEmise();

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationEnMunitions_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeConsommationEnMunitions_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConsommationEnMunitions_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Type Feu Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Type Feu Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Type Feu Type Arme</em>' containment reference.
	 * @see #setACommeTypeFeuTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeConsommationEnMunitions_ACommeTypeFeuTypeArme()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='ACommeTypeFeu_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getACommeTypeFeuTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommationEnMunitions#getACommeTypeFeuTypeArme <em>AComme Type Feu Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Type Feu Type Arme</em>' containment reference.
	 * @see #getACommeTypeFeuTypeArme()
	 * @generated
	 */
	void setACommeTypeFeuTypeArme(TypeAssociationEXT value);

} // TypeConsommationEnMunitions
