/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Assoc Consigne Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocConsigneLocalisation#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocConsigneLocalisation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocConsigneLocalisation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocConsigneLocalisation#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocConsigneLocalisation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AssocConsigneLocalisation' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocConsigneLocalisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @see mpia.schema.SchemaPackage#getTypeAssocConsigneLocalisation_NumeroOrdre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NumeroOrdre'"
	 * @generated
	 */
	long getNumeroOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocConsigneLocalisation#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @generated
	 */
	void setNumeroOrdre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocConsigneLocalisation#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	void unsetNumeroOrdre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocConsigneLocalisation#getNumeroOrdre <em>Numero Ordre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Ordre</em>' attribute is set.
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	boolean isSetNumeroOrdre();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssocConsigneLocalisation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocConsigneLocalisation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocConsigneLocalisation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocConsigneLocalisation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #setEstLocaliseEnLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocConsigneLocalisation_EstLocaliseEnLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseEnLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocConsigneLocalisation#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 */
	void setEstLocaliseEnLocalisation(TypeLocalisation value);

} // TypeAssocConsigneLocalisation
