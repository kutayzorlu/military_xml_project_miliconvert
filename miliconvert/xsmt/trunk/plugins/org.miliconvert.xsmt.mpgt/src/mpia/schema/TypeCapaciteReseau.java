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
 * A representation of the model object '<em><b>Type Capacite Reseau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteReseau#getTypeLargeurBande <em>Type Largeur Bande</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteReseau#getTypeProtocole <em>Type Protocole</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteReseau#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteReseau#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteReseau()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CapaciteReseau' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteReseau extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Largeur Bande</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteReseauTypeLargeurBande}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Largeur Bande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Largeur Bande</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteReseauTypeLargeurBande
	 * @see #isSetTypeLargeurBande()
	 * @see #unsetTypeLargeurBande()
	 * @see #setTypeLargeurBande(TypeDictionaryDicoCapaciteReseauTypeLargeurBande)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteReseau_TypeLargeurBande()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeLargeurBande'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteReseauTypeLargeurBande getTypeLargeurBande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteReseau#getTypeLargeurBande <em>Type Largeur Bande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Largeur Bande</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteReseauTypeLargeurBande
	 * @see #isSetTypeLargeurBande()
	 * @see #unsetTypeLargeurBande()
	 * @see #getTypeLargeurBande()
	 * @generated
	 */
	void setTypeLargeurBande(TypeDictionaryDicoCapaciteReseauTypeLargeurBande value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteReseau#getTypeLargeurBande <em>Type Largeur Bande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeLargeurBande()
	 * @see #getTypeLargeurBande()
	 * @see #setTypeLargeurBande(TypeDictionaryDicoCapaciteReseauTypeLargeurBande)
	 * @generated
	 */
	void unsetTypeLargeurBande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteReseau#getTypeLargeurBande <em>Type Largeur Bande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Largeur Bande</em>' attribute is set.
	 * @see #unsetTypeLargeurBande()
	 * @see #getTypeLargeurBande()
	 * @see #setTypeLargeurBande(TypeDictionaryDicoCapaciteReseauTypeLargeurBande)
	 * @generated
	 */
	boolean isSetTypeLargeurBande();

	/**
	 * Returns the value of the '<em><b>Type Protocole</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteReseauTypeProtocole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Protocole</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Protocole</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteReseauTypeProtocole
	 * @see #isSetTypeProtocole()
	 * @see #unsetTypeProtocole()
	 * @see #setTypeProtocole(TypeDictionaryDicoCapaciteReseauTypeProtocole)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteReseau_TypeProtocole()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeProtocole'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteReseauTypeProtocole getTypeProtocole();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteReseau#getTypeProtocole <em>Type Protocole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Protocole</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteReseauTypeProtocole
	 * @see #isSetTypeProtocole()
	 * @see #unsetTypeProtocole()
	 * @see #getTypeProtocole()
	 * @generated
	 */
	void setTypeProtocole(TypeDictionaryDicoCapaciteReseauTypeProtocole value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteReseau#getTypeProtocole <em>Type Protocole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeProtocole()
	 * @see #getTypeProtocole()
	 * @see #setTypeProtocole(TypeDictionaryDicoCapaciteReseauTypeProtocole)
	 * @generated
	 */
	void unsetTypeProtocole();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteReseau#getTypeProtocole <em>Type Protocole</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Protocole</em>' attribute is set.
	 * @see #unsetTypeProtocole()
	 * @see #getTypeProtocole()
	 * @see #setTypeProtocole(TypeDictionaryDicoCapaciteReseauTypeProtocole)
	 * @generated
	 */
	boolean isSetTypeProtocole();

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
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteReseau_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteReseau#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteReseau_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteReseau#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeCapaciteReseau
