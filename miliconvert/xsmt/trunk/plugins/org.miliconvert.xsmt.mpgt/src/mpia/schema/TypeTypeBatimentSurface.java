/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVolume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Batiment Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeBatimentSurface#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatimentSurface#getDeplacement <em>Deplacement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeBatimentSurface#getChargeMaximalePont <em>Charge Maximale Pont</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentSurface()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeBatimentSurface' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeBatimentSurface extends TypeTypeBatiment {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeBatimentSurfaceCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeBatimentSurfaceCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeBatimentSurfaceCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentSurface_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeBatimentSurfaceCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatimentSurface#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeBatimentSurfaceCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeBatimentSurfaceCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeBatimentSurface#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeBatimentSurfaceCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeBatimentSurface#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeBatimentSurfaceCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Deplacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deplacement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deplacement</em>' containment reference.
	 * @see #setDeplacement(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentSurface_Deplacement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Deplacement'"
	 * @generated
	 */
	TypeDataTypeVolume getDeplacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatimentSurface#getDeplacement <em>Deplacement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deplacement</em>' containment reference.
	 * @see #getDeplacement()
	 * @generated
	 */
	void setDeplacement(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Charge Maximale Pont</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Maximale Pont</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Maximale Pont</em>' containment reference.
	 * @see #setChargeMaximalePont(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeTypeBatimentSurface_ChargeMaximalePont()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ChargeMaximalePont'"
	 * @generated
	 */
	TypeDataTypeMasse getChargeMaximalePont();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeBatimentSurface#getChargeMaximalePont <em>Charge Maximale Pont</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Maximale Pont</em>' containment reference.
	 * @see #getChargeMaximalePont()
	 * @generated
	 */
	void setChargeMaximalePont(TypeDataTypeMasse value);

} // TypeTypeBatimentSurface
