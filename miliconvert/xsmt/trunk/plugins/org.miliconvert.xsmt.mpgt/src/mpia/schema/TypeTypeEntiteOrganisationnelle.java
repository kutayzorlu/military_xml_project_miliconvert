/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Entite Organisationnelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeEntiteOrganisationnelle#isFonctionCommandement <em>Fonction Commandement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getTypeCommandement <em>Type Commandement</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getLargZoneDiffusion <em>Larg Zone Diffusion</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getHautZoneDiffusion <em>Haut Zone Diffusion</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeEntiteOrganisationnelle()
 * @model abstract="true"
 *        extendedMetaData="name='type_TypeEntiteOrganisationnelle' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeEntiteOrganisationnelle extends TypeType {
	/**
	 * Returns the value of the '<em><b>Fonction Commandement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction Commandement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction Commandement</em>' attribute.
	 * @see #isSetFonctionCommandement()
	 * @see #unsetFonctionCommandement()
	 * @see #setFonctionCommandement(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEntiteOrganisationnelle_FonctionCommandement()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='FonctionCommandement'"
	 * @generated
	 */
	boolean isFonctionCommandement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#isFonctionCommandement <em>Fonction Commandement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction Commandement</em>' attribute.
	 * @see #isSetFonctionCommandement()
	 * @see #unsetFonctionCommandement()
	 * @see #isFonctionCommandement()
	 * @generated
	 */
	void setFonctionCommandement(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#isFonctionCommandement <em>Fonction Commandement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFonctionCommandement()
	 * @see #isFonctionCommandement()
	 * @see #setFonctionCommandement(boolean)
	 * @generated
	 */
	void unsetFonctionCommandement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#isFonctionCommandement <em>Fonction Commandement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fonction Commandement</em>' attribute is set.
	 * @see #unsetFonctionCommandement()
	 * @see #isFonctionCommandement()
	 * @see #setFonctionCommandement(boolean)
	 * @generated
	 */
	boolean isSetFonctionCommandement();

	/**
	 * Returns the value of the '<em><b>Type Commandement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Commandement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Commandement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement
	 * @see #isSetTypeCommandement()
	 * @see #unsetTypeCommandement()
	 * @see #setTypeCommandement(TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEntiteOrganisationnelle_TypeCommandement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCommandement'"
	 * @generated
	 */
	TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement getTypeCommandement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getTypeCommandement <em>Type Commandement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Commandement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement
	 * @see #isSetTypeCommandement()
	 * @see #unsetTypeCommandement()
	 * @see #getTypeCommandement()
	 * @generated
	 */
	void setTypeCommandement(TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getTypeCommandement <em>Type Commandement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCommandement()
	 * @see #getTypeCommandement()
	 * @see #setTypeCommandement(TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement)
	 * @generated
	 */
	void unsetTypeCommandement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getTypeCommandement <em>Type Commandement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Commandement</em>' attribute is set.
	 * @see #unsetTypeCommandement()
	 * @see #getTypeCommandement()
	 * @see #setTypeCommandement(TypeDictionaryDicoTypeEntiteOrganisationnelleTypeCommandement)
	 * @generated
	 */
	boolean isSetTypeCommandement();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEntiteOrganisationnelle_Description()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Larg Zone Diffusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Larg Zone Diffusion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Larg Zone Diffusion</em>' containment reference.
	 * @see #setLargZoneDiffusion(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEntiteOrganisationnelle_LargZoneDiffusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargZoneDiffusion'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargZoneDiffusion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getLargZoneDiffusion <em>Larg Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Larg Zone Diffusion</em>' containment reference.
	 * @see #getLargZoneDiffusion()
	 * @generated
	 */
	void setLargZoneDiffusion(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Haut Zone Diffusion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Haut Zone Diffusion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Haut Zone Diffusion</em>' containment reference.
	 * @see #setHautZoneDiffusion(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeTypeEntiteOrganisationnelle_HautZoneDiffusion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HautZoneDiffusion'"
	 * @generated
	 */
	TypeDataTypeLongueur getHautZoneDiffusion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeEntiteOrganisationnelle#getHautZoneDiffusion <em>Haut Zone Diffusion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haut Zone Diffusion</em>' containment reference.
	 * @see #getHautZoneDiffusion()
	 * @generated
	 */
	void setHautZoneDiffusion(TypeDataTypeLongueur value);

} // TypeTypeEntiteOrganisationnelle
