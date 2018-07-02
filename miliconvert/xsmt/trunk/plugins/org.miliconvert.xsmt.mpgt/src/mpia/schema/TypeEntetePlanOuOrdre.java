/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Entete Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getFuseauHoraire <em>Fuseau Horaire</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getNumeroSerie <em>Numero Serie</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getNumeroReference <em>Numero Reference</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getSurnom <em>Surnom</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getTypeForceConcerne <em>Type Force Concerne</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEntetePlanOuOrdre#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EntetePlanOuOrdre' kind='elementOnly'"
 * @generated
 */
public interface TypeEntetePlanOuOrdre extends EObject {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Date'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Fuseau Horaire</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuseau Horaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuseau Horaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire
	 * @see #isSetFuseauHoraire()
	 * @see #unsetFuseauHoraire()
	 * @see #setFuseauHoraire(TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire)
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_FuseauHoraire()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FuseauHoraire'"
	 * @generated
	 */
	TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire getFuseauHoraire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getFuseauHoraire <em>Fuseau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuseau Horaire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire
	 * @see #isSetFuseauHoraire()
	 * @see #unsetFuseauHoraire()
	 * @see #getFuseauHoraire()
	 * @generated
	 */
	void setFuseauHoraire(TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getFuseauHoraire <em>Fuseau Horaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFuseauHoraire()
	 * @see #getFuseauHoraire()
	 * @see #setFuseauHoraire(TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire)
	 * @generated
	 */
	void unsetFuseauHoraire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getFuseauHoraire <em>Fuseau Horaire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fuseau Horaire</em>' attribute is set.
	 * @see #unsetFuseauHoraire()
	 * @see #getFuseauHoraire()
	 * @see #setFuseauHoraire(TypeDictionaryDicoEntetePlanOuOrdreFuseauHoraire)
	 * @generated
	 */
	boolean isSetFuseauHoraire();

	/**
	 * Returns the value of the '<em><b>Numero Serie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Serie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Serie</em>' attribute.
	 * @see #setNumeroSerie(String)
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_NumeroSerie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='NumeroSerie'"
	 * @generated
	 */
	String getNumeroSerie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getNumeroSerie <em>Numero Serie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Serie</em>' attribute.
	 * @see #getNumeroSerie()
	 * @generated
	 */
	void setNumeroSerie(String value);

	/**
	 * Returns the value of the '<em><b>Numero Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Reference</em>' attribute.
	 * @see #setNumeroReference(String)
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_NumeroReference()
	 * @model dataType="mpia.meta.TypeDataTypeChaine015"
	 *        extendedMetaData="kind='element' name='NumeroReference'"
	 * @generated
	 */
	String getNumeroReference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getNumeroReference <em>Numero Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Reference</em>' attribute.
	 * @see #getNumeroReference()
	 * @generated
	 */
	void setNumeroReference(String value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Surnom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surnom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surnom</em>' attribute.
	 * @see #setSurnom(String)
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_Surnom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Surnom'"
	 * @generated
	 */
	String getSurnom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getSurnom <em>Surnom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surnom</em>' attribute.
	 * @see #getSurnom()
	 * @generated
	 */
	void setSurnom(String value);

	/**
	 * Returns the value of the '<em><b>Type Force Concerne</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Force Concerne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Force Concerne</em>' attribute.
	 * @see #setTypeForceConcerne(String)
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_TypeForceConcerne()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeForceConcerne'"
	 * @generated
	 */
	String getTypeForceConcerne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getTypeForceConcerne <em>Type Force Concerne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Force Concerne</em>' attribute.
	 * @see #getTypeForceConcerne()
	 * @generated
	 */
	void setTypeForceConcerne(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Degre Classification Degre Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Degre Classification Degre Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #setAPourDegreClassificationDegreClassification(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEntetePlanOuOrdre_APourDegreClassificationDegreClassification()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_DegreClassification'"
	 *        extendedMetaData="kind='element' name='APourDegreClassification_DegreClassification'"
	 * @generated
	 */
	TypeAssociation getAPourDegreClassificationDegreClassification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEntetePlanOuOrdre#getAPourDegreClassificationDegreClassification <em>APour Degre Classification Degre Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Degre Classification Degre Classification</em>' containment reference.
	 * @see #getAPourDegreClassificationDegreClassification()
	 * @generated
	 */
	void setAPourDegreClassificationDegreClassification(TypeAssociation value);

} // TypeEntetePlanOuOrdre
