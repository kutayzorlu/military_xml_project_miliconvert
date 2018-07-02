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
 * A representation of the model object '<em><b>Type Etat Operationnel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnel#getPiege <em>Piege</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnel#getControleEmission <em>Controle Emission</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnel#isNonIdentifie <em>Non Identifie</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnel#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnel#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnel#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnel()
 * @model abstract="true"
 *        annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnel' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnel extends EObject {
	/**
	 * Returns the value of the '<em><b>Piege</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelPiege}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Piege</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piege</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelPiege
	 * @see #isSetPiege()
	 * @see #unsetPiege()
	 * @see #setPiege(TypeDictionaryDicoEtatOperationnelPiege)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnel_Piege()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Piege'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelPiege getPiege();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnel#getPiege <em>Piege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Piege</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelPiege
	 * @see #isSetPiege()
	 * @see #unsetPiege()
	 * @see #getPiege()
	 * @generated
	 */
	void setPiege(TypeDictionaryDicoEtatOperationnelPiege value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnel#getPiege <em>Piege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPiege()
	 * @see #getPiege()
	 * @see #setPiege(TypeDictionaryDicoEtatOperationnelPiege)
	 * @generated
	 */
	void unsetPiege();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnel#getPiege <em>Piege</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Piege</em>' attribute is set.
	 * @see #unsetPiege()
	 * @see #getPiege()
	 * @see #setPiege(TypeDictionaryDicoEtatOperationnelPiege)
	 * @generated
	 */
	boolean isSetPiege();

	/**
	 * Returns the value of the '<em><b>Controle Emission</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelControleEmission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controle Emission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controle Emission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelControleEmission
	 * @see #isSetControleEmission()
	 * @see #unsetControleEmission()
	 * @see #setControleEmission(TypeDictionaryDicoEtatOperationnelControleEmission)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnel_ControleEmission()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ControleEmission'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelControleEmission getControleEmission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnel#getControleEmission <em>Controle Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controle Emission</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelControleEmission
	 * @see #isSetControleEmission()
	 * @see #unsetControleEmission()
	 * @see #getControleEmission()
	 * @generated
	 */
	void setControleEmission(TypeDictionaryDicoEtatOperationnelControleEmission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnel#getControleEmission <em>Controle Emission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetControleEmission()
	 * @see #getControleEmission()
	 * @see #setControleEmission(TypeDictionaryDicoEtatOperationnelControleEmission)
	 * @generated
	 */
	void unsetControleEmission();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnel#getControleEmission <em>Controle Emission</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Controle Emission</em>' attribute is set.
	 * @see #unsetControleEmission()
	 * @see #getControleEmission()
	 * @see #setControleEmission(TypeDictionaryDicoEtatOperationnelControleEmission)
	 * @generated
	 */
	boolean isSetControleEmission();

	/**
	 * Returns the value of the '<em><b>Non Identifie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Identifie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Identifie</em>' attribute.
	 * @see #isSetNonIdentifie()
	 * @see #unsetNonIdentifie()
	 * @see #setNonIdentifie(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnel_NonIdentifie()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='NonIdentifie'"
	 * @generated
	 */
	boolean isNonIdentifie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnel#isNonIdentifie <em>Non Identifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Identifie</em>' attribute.
	 * @see #isSetNonIdentifie()
	 * @see #unsetNonIdentifie()
	 * @see #isNonIdentifie()
	 * @generated
	 */
	void setNonIdentifie(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnel#isNonIdentifie <em>Non Identifie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNonIdentifie()
	 * @see #isNonIdentifie()
	 * @see #setNonIdentifie(boolean)
	 * @generated
	 */
	void unsetNonIdentifie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnel#isNonIdentifie <em>Non Identifie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Non Identifie</em>' attribute is set.
	 * @see #unsetNonIdentifie()
	 * @see #isNonIdentifie()
	 * @see #setNonIdentifie(boolean)
	 * @generated
	 */
	boolean isSetNonIdentifie();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnel_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnel#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnel_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnel#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapporte Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapporte Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #setEstRapporteParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnel_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnel#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeEtatOperationnel
