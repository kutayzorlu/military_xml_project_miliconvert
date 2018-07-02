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
 * A representation of the model object '<em><b>Type Specialite Maintenance Ou Depannage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage#getSousCategorie <em>Sous Categorie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSpecialiteMaintenanceOuDepannage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SpecialiteMaintenanceOuDepannage' kind='elementOnly'"
 * @generated
 */
public interface TypeSpecialiteMaintenanceOuDepannage extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSpecialiteMaintenanceOuDepannageCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSpecialiteMaintenanceOuDepannageCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoSpecialiteMaintenanceOuDepannageCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeSpecialiteMaintenanceOuDepannage_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoSpecialiteMaintenanceOuDepannageCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSpecialiteMaintenanceOuDepannageCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoSpecialiteMaintenanceOuDepannageCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoSpecialiteMaintenanceOuDepannageCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoSpecialiteMaintenanceOuDepannageCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSpecialiteMaintenanceOuDepannageSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSpecialiteMaintenanceOuDepannageSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoSpecialiteMaintenanceOuDepannageSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeSpecialiteMaintenanceOuDepannage_SousCategorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoSpecialiteMaintenanceOuDepannageSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSpecialiteMaintenanceOuDepannageSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoSpecialiteMaintenanceOuDepannageSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoSpecialiteMaintenanceOuDepannageSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoSpecialiteMaintenanceOuDepannageSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

} // TypeSpecialiteMaintenanceOuDepannage
