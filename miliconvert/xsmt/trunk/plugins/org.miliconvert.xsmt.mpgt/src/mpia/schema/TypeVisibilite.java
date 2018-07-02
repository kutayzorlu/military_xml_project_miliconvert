/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Visibilite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVisibilite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeVisibilite#getDistance <em>Distance</em>}</li>
 *   <li>{@link mpia.schema.TypeVisibilite#getPlafond <em>Plafond</em>}</li>
 *   <li>{@link mpia.schema.TypeVisibilite#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVisibilite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Visibilite' kind='elementOnly'"
 * @generated
 */
public interface TypeVisibilite extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVisibiliteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVisibiliteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoVisibiliteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeVisibilite_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoVisibiliteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVisibilite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVisibiliteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoVisibiliteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVisibilite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoVisibiliteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVisibilite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoVisibiliteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeVisibilite_Distance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Distance'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVisibilite#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Plafond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plafond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plafond</em>' containment reference.
	 * @see #setPlafond(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeVisibilite_Plafond()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Plafond'"
	 * @generated
	 */
	TypeDataTypeLongueur getPlafond();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVisibilite#getPlafond <em>Plafond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plafond</em>' containment reference.
	 * @see #getPlafond()
	 * @generated
	 */
	void setPlafond(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #setDirection(TypeDictionaryDicoDirection)
	 * @see mpia.schema.SchemaPackage#getTypeVisibilite_Direction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Direction'"
	 * @generated
	 */
	TypeDictionaryDicoDirection getDirection();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVisibilite#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirection
	 * @see #isSetDirection()
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(TypeDictionaryDicoDirection value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVisibilite#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirection()
	 * @see #getDirection()
	 * @see #setDirection(TypeDictionaryDicoDirection)
	 * @generated
	 */
	void unsetDirection();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVisibilite#getDirection <em>Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direction</em>' attribute is set.
	 * @see #unsetDirection()
	 * @see #getDirection()
	 * @see #setDirection(TypeDictionaryDicoDirection)
	 * @generated
	 */
	boolean isSetDirection();

} // TypeVisibilite
