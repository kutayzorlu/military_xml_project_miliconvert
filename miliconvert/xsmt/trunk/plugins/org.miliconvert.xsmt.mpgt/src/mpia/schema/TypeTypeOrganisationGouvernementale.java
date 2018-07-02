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
 * A representation of the model object '<em><b>Type Type Organisation Gouvernementale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeOrganisationGouvernementale#getArmee <em>Armee</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeOrganisationGouvernementale#getActivitePrincipale <em>Activite Principale</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeOrganisationGouvernementale#getEstSupporteeParTypeUnite <em>Est Supportee Par Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeOrganisationGouvernementale()
 * @model abstract="true"
 *        extendedMetaData="name='type_TypeOrganisationGouvernementale' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeOrganisationGouvernementale extends TypeTypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Armee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoArmee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Armee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Armee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArmee
	 * @see #isSetArmee()
	 * @see #unsetArmee()
	 * @see #setArmee(TypeDictionaryDicoArmee)
	 * @see mpia.schema.SchemaPackage#getTypeTypeOrganisationGouvernementale_Armee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Armee'"
	 * @generated
	 */
	TypeDictionaryDicoArmee getArmee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeOrganisationGouvernementale#getArmee <em>Armee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Armee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArmee
	 * @see #isSetArmee()
	 * @see #unsetArmee()
	 * @see #getArmee()
	 * @generated
	 */
	void setArmee(TypeDictionaryDicoArmee value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeOrganisationGouvernementale#getArmee <em>Armee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArmee()
	 * @see #getArmee()
	 * @see #setArmee(TypeDictionaryDicoArmee)
	 * @generated
	 */
	void unsetArmee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeOrganisationGouvernementale#getArmee <em>Armee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Armee</em>' attribute is set.
	 * @see #unsetArmee()
	 * @see #getArmee()
	 * @see #setArmee(TypeDictionaryDicoArmee)
	 * @generated
	 */
	boolean isSetArmee();

	/**
	 * Returns the value of the '<em><b>Activite Principale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActivitePrincipale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Principale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Principale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivitePrincipale
	 * @see #isSetActivitePrincipale()
	 * @see #unsetActivitePrincipale()
	 * @see #setActivitePrincipale(TypeDictionaryDicoActivitePrincipale)
	 * @see mpia.schema.SchemaPackage#getTypeTypeOrganisationGouvernementale_ActivitePrincipale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ActivitePrincipale'"
	 * @generated
	 */
	TypeDictionaryDicoActivitePrincipale getActivitePrincipale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeOrganisationGouvernementale#getActivitePrincipale <em>Activite Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Principale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivitePrincipale
	 * @see #isSetActivitePrincipale()
	 * @see #unsetActivitePrincipale()
	 * @see #getActivitePrincipale()
	 * @generated
	 */
	void setActivitePrincipale(TypeDictionaryDicoActivitePrincipale value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeOrganisationGouvernementale#getActivitePrincipale <em>Activite Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivitePrincipale()
	 * @see #getActivitePrincipale()
	 * @see #setActivitePrincipale(TypeDictionaryDicoActivitePrincipale)
	 * @generated
	 */
	void unsetActivitePrincipale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeOrganisationGouvernementale#getActivitePrincipale <em>Activite Principale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activite Principale</em>' attribute is set.
	 * @see #unsetActivitePrincipale()
	 * @see #getActivitePrincipale()
	 * @see #setActivitePrincipale(TypeDictionaryDicoActivitePrincipale)
	 * @generated
	 */
	boolean isSetActivitePrincipale();

	/**
	 * Returns the value of the '<em><b>Est Supportee Par Type Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Supportee Par Type Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Supportee Par Type Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTypeOrganisationGouvernementale_EstSupporteeParTypeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Supporte_TypeOrganisationGouvernementale' target_entity='type_TypeUnite'"
	 *        extendedMetaData="kind='element' name='EstSupporteePar_TypeUnite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSupporteeParTypeUnite();

} // TypeTypeOrganisationGouvernementale
