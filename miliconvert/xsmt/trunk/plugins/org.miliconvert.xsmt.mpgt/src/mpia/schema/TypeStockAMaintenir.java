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
 * A representation of the model object '<em><b>Type Stock AMaintenir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeStockAMaintenir#getVolumeMinForces <em>Volume Min Forces</em>}</li>
 *   <li>{@link mpia.schema.TypeStockAMaintenir#getVolumeMaxForces <em>Volume Max Forces</em>}</li>
 *   <li>{@link mpia.schema.TypeStockAMaintenir#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeStockAMaintenir#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeStockAMaintenir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeStockAMaintenir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeStockAMaintenir#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeStockAMaintenir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_StockAMaintenir' kind='elementOnly'"
 * @generated
 */
public interface TypeStockAMaintenir extends EObject {
	/**
	 * Returns the value of the '<em><b>Volume Min Forces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Min Forces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Min Forces</em>' attribute.
	 * @see #isSetVolumeMinForces()
	 * @see #unsetVolumeMinForces()
	 * @see #setVolumeMinForces(long)
	 * @see mpia.schema.SchemaPackage#getTypeStockAMaintenir_VolumeMinForces()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9" required="true"
	 *        extendedMetaData="kind='element' name='VolumeMinForces'"
	 * @generated
	 */
	long getVolumeMinForces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStockAMaintenir#getVolumeMinForces <em>Volume Min Forces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Min Forces</em>' attribute.
	 * @see #isSetVolumeMinForces()
	 * @see #unsetVolumeMinForces()
	 * @see #getVolumeMinForces()
	 * @generated
	 */
	void setVolumeMinForces(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeStockAMaintenir#getVolumeMinForces <em>Volume Min Forces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeMinForces()
	 * @see #getVolumeMinForces()
	 * @see #setVolumeMinForces(long)
	 * @generated
	 */
	void unsetVolumeMinForces();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeStockAMaintenir#getVolumeMinForces <em>Volume Min Forces</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Min Forces</em>' attribute is set.
	 * @see #unsetVolumeMinForces()
	 * @see #getVolumeMinForces()
	 * @see #setVolumeMinForces(long)
	 * @generated
	 */
	boolean isSetVolumeMinForces();

	/**
	 * Returns the value of the '<em><b>Volume Max Forces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Max Forces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Max Forces</em>' attribute.
	 * @see #isSetVolumeMaxForces()
	 * @see #unsetVolumeMaxForces()
	 * @see #setVolumeMaxForces(long)
	 * @see mpia.schema.SchemaPackage#getTypeStockAMaintenir_VolumeMaxForces()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='VolumeMaxForces'"
	 * @generated
	 */
	long getVolumeMaxForces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStockAMaintenir#getVolumeMaxForces <em>Volume Max Forces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Max Forces</em>' attribute.
	 * @see #isSetVolumeMaxForces()
	 * @see #unsetVolumeMaxForces()
	 * @see #getVolumeMaxForces()
	 * @generated
	 */
	void setVolumeMaxForces(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeStockAMaintenir#getVolumeMaxForces <em>Volume Max Forces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeMaxForces()
	 * @see #getVolumeMaxForces()
	 * @see #setVolumeMaxForces(long)
	 * @generated
	 */
	void unsetVolumeMaxForces();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeStockAMaintenir#getVolumeMaxForces <em>Volume Max Forces</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Max Forces</em>' attribute is set.
	 * @see #unsetVolumeMaxForces()
	 * @see #getVolumeMaxForces()
	 * @see #setVolumeMaxForces(long)
	 * @generated
	 */
	boolean isSetVolumeMaxForces();

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
	 * @see mpia.schema.SchemaPackage#getTypeStockAMaintenir_ConditionnementUnite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ConditionnementUnite'"
	 * @generated
	 */
	TypeDictionaryDicoConditionnementUnite getConditionnementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStockAMaintenir#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeStockAMaintenir#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	void unsetConditionnementUnite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeStockAMaintenir#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeStockAMaintenir_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStockAMaintenir#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeStockAMaintenir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStockAMaintenir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeStockAMaintenir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStockAMaintenir#getCE <em>CE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeStockAMaintenir_ConcerneTypeRessourceTypeConsommable()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeConsommable'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeRessource_TypeConsommable'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeRessourceTypeConsommable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeStockAMaintenir#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Ressource Type Consommable</em>' containment reference.
	 * @see #getConcerneTypeRessourceTypeConsommable()
	 * @generated
	 */
	void setConcerneTypeRessourceTypeConsommable(TypeAssociationEXT value);

} // TypeStockAMaintenir
