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
 * A representation of the model object '<em><b>Type Ressource Elementaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRessourceElementaire#getVolumeForces <em>Volume Forces</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceElementaire#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceElementaire#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceElementaire#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceElementaire#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRessourceElementaire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_RessourceElementaire' kind='elementOnly'"
 * @generated
 */
public interface TypeRessourceElementaire extends EObject {
	/**
	 * Returns the value of the '<em><b>Volume Forces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Forces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Forces</em>' attribute.
	 * @see #isSetVolumeForces()
	 * @see #unsetVolumeForces()
	 * @see #setVolumeForces(long)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceElementaire_VolumeForces()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9" required="true"
	 *        extendedMetaData="kind='element' name='VolumeForces'"
	 * @generated
	 */
	long getVolumeForces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceElementaire#getVolumeForces <em>Volume Forces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Forces</em>' attribute.
	 * @see #isSetVolumeForces()
	 * @see #unsetVolumeForces()
	 * @see #getVolumeForces()
	 * @generated
	 */
	void setVolumeForces(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRessourceElementaire#getVolumeForces <em>Volume Forces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeForces()
	 * @see #getVolumeForces()
	 * @see #setVolumeForces(long)
	 * @generated
	 */
	void unsetVolumeForces();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRessourceElementaire#getVolumeForces <em>Volume Forces</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Forces</em>' attribute is set.
	 * @see #unsetVolumeForces()
	 * @see #getVolumeForces()
	 * @see #setVolumeForces(long)
	 * @generated
	 */
	boolean isSetVolumeForces();

	/**
	 * Returns the value of the '<em><b>Conditionnement Unite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConditionnementUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Unite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetConditionnementUnite()
	 * @see #unsetConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceElementaire_ConditionnementUnite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ConditionnementUnite'"
	 * @generated
	 */
	TypeDictionaryDicoConditionnementUnite getConditionnementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceElementaire#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetConditionnementUnite()
	 * @see #unsetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @generated
	 */
	void setConditionnementUnite(TypeDictionaryDicoConditionnementUnite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRessourceElementaire#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	void unsetConditionnementUnite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRessourceElementaire#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditionnement Unite</em>' attribute is set.
	 * @see #unsetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	boolean isSetConditionnementUnite();

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
	 * @see mpia.schema.SchemaPackage#getTypeRessourceElementaire_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceElementaire#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRessourceElementaire_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceElementaire#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Ressource Type Consommable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Ressource Type Consommable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Ressource Type Consommable</em>' containment reference.
	 * @see #setConcerneTypeRessourceTypeConsommable(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceElementaire_ConcerneTypeRessourceTypeConsommable()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeConsommable'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeRessource_TypeConsommable'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeRessourceTypeConsommable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceElementaire#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Ressource Type Consommable</em>' containment reference.
	 * @see #getConcerneTypeRessourceTypeConsommable()
	 * @generated
	 */
	void setConcerneTypeRessourceTypeConsommable(TypeAssociationEXT value);

} // TypeRessourceElementaire
