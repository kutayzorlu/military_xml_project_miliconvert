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
 * A representation of the model object '<em><b>Type Effet Constate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEffetConstate#getTypeCible <em>Type Cible</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetConstate#getNombreElements <em>Nombre Elements</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetConstate#getEffetConstate <em>Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetConstate#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetConstate#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEffetConstate()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EffetConstate' kind='elementOnly'"
 * @generated
 */
public interface TypeEffetConstate extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Cible</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetConstateTypeCible}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Cible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Cible</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetConstateTypeCible
	 * @see #isSetTypeCible()
	 * @see #unsetTypeCible()
	 * @see #setTypeCible(TypeDictionaryDicoEffetConstateTypeCible)
	 * @see mpia.schema.SchemaPackage#getTypeEffetConstate_TypeCible()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeCible'"
	 * @generated
	 */
	TypeDictionaryDicoEffetConstateTypeCible getTypeCible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetConstate#getTypeCible <em>Type Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Cible</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetConstateTypeCible
	 * @see #isSetTypeCible()
	 * @see #unsetTypeCible()
	 * @see #getTypeCible()
	 * @generated
	 */
	void setTypeCible(TypeDictionaryDicoEffetConstateTypeCible value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffetConstate#getTypeCible <em>Type Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCible()
	 * @see #getTypeCible()
	 * @see #setTypeCible(TypeDictionaryDicoEffetConstateTypeCible)
	 * @generated
	 */
	void unsetTypeCible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetConstate#getTypeCible <em>Type Cible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Cible</em>' attribute is set.
	 * @see #unsetTypeCible()
	 * @see #getTypeCible()
	 * @see #setTypeCible(TypeDictionaryDicoEffetConstateTypeCible)
	 * @generated
	 */
	boolean isSetTypeCible();

	/**
	 * Returns the value of the '<em><b>Nombre Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Elements</em>' attribute.
	 * @see #isSetNombreElements()
	 * @see #unsetNombreElements()
	 * @see #setNombreElements(long)
	 * @see mpia.schema.SchemaPackage#getTypeEffetConstate_NombreElements()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NombreElements'"
	 * @generated
	 */
	long getNombreElements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetConstate#getNombreElements <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Elements</em>' attribute.
	 * @see #isSetNombreElements()
	 * @see #unsetNombreElements()
	 * @see #getNombreElements()
	 * @generated
	 */
	void setNombreElements(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffetConstate#getNombreElements <em>Nombre Elements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreElements()
	 * @see #getNombreElements()
	 * @see #setNombreElements(long)
	 * @generated
	 */
	void unsetNombreElements();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetConstate#getNombreElements <em>Nombre Elements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Elements</em>' attribute is set.
	 * @see #unsetNombreElements()
	 * @see #getNombreElements()
	 * @see #setNombreElements(long)
	 * @generated
	 */
	boolean isSetNombreElements();

	/**
	 * Returns the value of the '<em><b>Effet Constate</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetConstateEffetConstate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Constate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Constate</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetConstateEffetConstate
	 * @see #isSetEffetConstate()
	 * @see #unsetEffetConstate()
	 * @see #setEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate)
	 * @see mpia.schema.SchemaPackage#getTypeEffetConstate_EffetConstate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EffetConstate'"
	 * @generated
	 */
	TypeDictionaryDicoEffetConstateEffetConstate getEffetConstate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetConstate#getEffetConstate <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Constate</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetConstateEffetConstate
	 * @see #isSetEffetConstate()
	 * @see #unsetEffetConstate()
	 * @see #getEffetConstate()
	 * @generated
	 */
	void setEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffetConstate#getEffetConstate <em>Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetConstate()
	 * @see #getEffetConstate()
	 * @see #setEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate)
	 * @generated
	 */
	void unsetEffetConstate();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetConstate#getEffetConstate <em>Effet Constate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Constate</em>' attribute is set.
	 * @see #unsetEffetConstate()
	 * @see #getEffetConstate()
	 * @see #setEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate)
	 * @generated
	 */
	boolean isSetEffetConstate();

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
	 * @see mpia.schema.SchemaPackage#getTypeEffetConstate_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetConstate#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEffetConstate_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetConstate#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeEffetConstate
