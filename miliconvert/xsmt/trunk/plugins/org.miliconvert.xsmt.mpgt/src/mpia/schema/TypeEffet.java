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
 * A representation of the model object '<em><b>Type Effet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEffet#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.TypeEffet#getGravite <em>Gravite</em>}</li>
 *   <li>{@link mpia.schema.TypeEffet#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffet#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffet#getEstAuContactEffetAuContactASS <em>Est Au Contact Effet Au Contact ASS</em>}</li>
 *   <li>{@link mpia.schema.TypeEffet#getVautPourTypeEffetSurType <em>Vaut Pour Type Effet Sur Type</em>}</li>
 *   <li>{@link mpia.schema.TypeEffet#getVautPourInstanceEffetSurInstanceObjet <em>Vaut Pour Instance Effet Sur Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeEffet#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEffet()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Effet' kind='elementOnly'"
 * @generated
 */
public interface TypeEffet extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetDescription
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(TypeDictionaryDicoEffetDescription)
	 * @see mpia.schema.SchemaPackage#getTypeEffet_Description()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	TypeDictionaryDicoEffetDescription getDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffet#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetDescription
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(TypeDictionaryDicoEffetDescription value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffet#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(TypeDictionaryDicoEffetDescription)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffet#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(TypeDictionaryDicoEffetDescription)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Gravite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetGravite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetGravite
	 * @see #isSetGravite()
	 * @see #unsetGravite()
	 * @see #setGravite(TypeDictionaryDicoEffetGravite)
	 * @see mpia.schema.SchemaPackage#getTypeEffet_Gravite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Gravite'"
	 * @generated
	 */
	TypeDictionaryDicoEffetGravite getGravite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffet#getGravite <em>Gravite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetGravite
	 * @see #isSetGravite()
	 * @see #unsetGravite()
	 * @see #getGravite()
	 * @generated
	 */
	void setGravite(TypeDictionaryDicoEffetGravite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffet#getGravite <em>Gravite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGravite()
	 * @see #getGravite()
	 * @see #setGravite(TypeDictionaryDicoEffetGravite)
	 * @generated
	 */
	void unsetGravite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffet#getGravite <em>Gravite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gravite</em>' attribute is set.
	 * @see #unsetGravite()
	 * @see #getGravite()
	 * @see #setGravite(TypeDictionaryDicoEffetGravite)
	 * @generated
	 */
	boolean isSetGravite();

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
	 * @see mpia.schema.SchemaPackage#getTypeEffet_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffet#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEffet_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffet#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Au Contact Effet Au Contact ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Au Contact Effet Au Contact ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Au Contact Effet Au Contact ASS</em>' containment reference.
	 * @see #setEstAuContactEffetAuContactASS(TypeEffetAuContactASS)
	 * @see mpia.schema.SchemaPackage#getTypeEffet_EstAuContactEffetAuContactASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetAuContactASS'"
	 *        extendedMetaData="kind='element' name='EstAuContact_EffetAuContactASS'"
	 * @generated
	 */
	TypeEffetAuContactASS getEstAuContactEffetAuContactASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffet#getEstAuContactEffetAuContactASS <em>Est Au Contact Effet Au Contact ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Au Contact Effet Au Contact ASS</em>' containment reference.
	 * @see #getEstAuContactEffetAuContactASS()
	 * @generated
	 */
	void setEstAuContactEffetAuContactASS(TypeEffetAuContactASS value);

	/**
	 * Returns the value of the '<em><b>Vaut Pour Type Effet Sur Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pour Type Effet Sur Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pour Type Effet Sur Type</em>' containment reference.
	 * @see #setVautPourTypeEffetSurType(TypeEffetSurType)
	 * @see mpia.schema.SchemaPackage#getTypeEffet_VautPourTypeEffetSurType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetSurType'"
	 *        extendedMetaData="kind='element' name='VautPourType_EffetSurType'"
	 * @generated
	 */
	TypeEffetSurType getVautPourTypeEffetSurType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffet#getVautPourTypeEffetSurType <em>Vaut Pour Type Effet Sur Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pour Type Effet Sur Type</em>' containment reference.
	 * @see #getVautPourTypeEffetSurType()
	 * @generated
	 */
	void setVautPourTypeEffetSurType(TypeEffetSurType value);

	/**
	 * Returns the value of the '<em><b>Vaut Pour Instance Effet Sur Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pour Instance Effet Sur Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pour Instance Effet Sur Instance Objet</em>' containment reference.
	 * @see #setVautPourInstanceEffetSurInstanceObjet(TypeEffetSurInstanceObjet)
	 * @see mpia.schema.SchemaPackage#getTypeEffet_VautPourInstanceEffetSurInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetSurInstanceObjet'"
	 *        extendedMetaData="kind='element' name='VautPourInstance_EffetSurInstanceObjet'"
	 * @generated
	 */
	TypeEffetSurInstanceObjet getVautPourInstanceEffetSurInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffet#getVautPourInstanceEffetSurInstanceObjet <em>Vaut Pour Instance Effet Sur Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pour Instance Effet Sur Instance Objet</em>' containment reference.
	 * @see #getVautPourInstanceEffetSurInstanceObjet()
	 * @generated
	 */
	void setVautPourInstanceEffetSurInstanceObjet(TypeEffetSurInstanceObjet value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEffet_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffet#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeEffet
