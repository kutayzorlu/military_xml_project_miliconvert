/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeSite#getMobilite <em>Mobilite</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeSite#getEstTypeSiteAssocieCapaciteGenie <em>Est Type Site Associe Capacite Genie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeSite()
 * @model abstract="true"
 *        extendedMetaData="name='type_TypeSite' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeSite extends TypeType {
	/**
	 * Returns the value of the '<em><b>Mobilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteMobiliteMobiliteSite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMobiliteMobiliteSite
	 * @see #isSetMobilite()
	 * @see #unsetMobilite()
	 * @see #setMobilite(TypeDictionaryDicoCapaciteMobiliteMobiliteSite)
	 * @see mpia.schema.SchemaPackage#getTypeTypeSite_Mobilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Mobilite'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteMobiliteMobiliteSite getMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeSite#getMobilite <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteMobiliteMobiliteSite
	 * @see #isSetMobilite()
	 * @see #unsetMobilite()
	 * @see #getMobilite()
	 * @generated
	 */
	void setMobilite(TypeDictionaryDicoCapaciteMobiliteMobiliteSite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeSite#getMobilite <em>Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMobilite()
	 * @see #getMobilite()
	 * @see #setMobilite(TypeDictionaryDicoCapaciteMobiliteMobiliteSite)
	 * @generated
	 */
	void unsetMobilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeSite#getMobilite <em>Mobilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mobilite</em>' attribute is set.
	 * @see #unsetMobilite()
	 * @see #getMobilite()
	 * @see #setMobilite(TypeDictionaryDicoCapaciteMobiliteMobiliteSite)
	 * @generated
	 */
	boolean isSetMobilite();

	/**
	 * Returns the value of the '<em><b>Est Type Site Associe Capacite Genie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Type Site Associe Capacite Genie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Type Site Associe Capacite Genie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeSite_EstTypeSiteAssocieCapaciteGenie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSite_TypeSite' target_entity='type_CapaciteGenie'"
	 *        extendedMetaData="kind='element' name='EstTypeSiteAssocie_CapaciteGenie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstTypeSiteAssocieCapaciteGenie();

} // TypeTypeSite
