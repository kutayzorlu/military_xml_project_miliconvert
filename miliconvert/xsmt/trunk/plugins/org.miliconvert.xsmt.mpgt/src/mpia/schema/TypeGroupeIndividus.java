/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Groupe Individus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeGroupeIndividus#getEthnie <em>Ethnie</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupeIndividus#getDescriptionPopulation <em>Description Population</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupeIndividus#getTypeLieu <em>Type Lieu</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupeIndividus#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupeIndividus#getNomRangResponsable <em>Nom Rang Responsable</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupeIndividus#getFonctionResponsable <em>Fonction Responsable</em>}</li>
 *   <li>{@link mpia.schema.TypeGroupeIndividus#getAPourResponsableUnite <em>APour Responsable Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeGroupeIndividus()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_GroupeIndividus' kind='elementOnly'"
 * @generated
 */
public interface TypeGroupeIndividus extends TypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Ethnie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ethnie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ethnie</em>' attribute.
	 * @see #setEthnie(String)
	 * @see mpia.schema.SchemaPackage#getTypeGroupeIndividus_Ethnie()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Ethnie'"
	 * @generated
	 */
	String getEthnie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupeIndividus#getEthnie <em>Ethnie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ethnie</em>' attribute.
	 * @see #getEthnie()
	 * @generated
	 */
	void setEthnie(String value);

	/**
	 * Returns the value of the '<em><b>Description Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Population</em>' attribute.
	 * @see #setDescriptionPopulation(String)
	 * @see mpia.schema.SchemaPackage#getTypeGroupeIndividus_DescriptionPopulation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='DescriptionPopulation'"
	 * @generated
	 */
	String getDescriptionPopulation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupeIndividus#getDescriptionPopulation <em>Description Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Population</em>' attribute.
	 * @see #getDescriptionPopulation()
	 * @generated
	 */
	void setDescriptionPopulation(String value);

	/**
	 * Returns the value of the '<em><b>Type Lieu</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoGroupeIndividusTypeLieu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Lieu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Lieu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoGroupeIndividusTypeLieu
	 * @see #isSetTypeLieu()
	 * @see #unsetTypeLieu()
	 * @see #setTypeLieu(TypeDictionaryDicoGroupeIndividusTypeLieu)
	 * @see mpia.schema.SchemaPackage#getTypeGroupeIndividus_TypeLieu()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeLieu'"
	 * @generated
	 */
	TypeDictionaryDicoGroupeIndividusTypeLieu getTypeLieu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupeIndividus#getTypeLieu <em>Type Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Lieu</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoGroupeIndividusTypeLieu
	 * @see #isSetTypeLieu()
	 * @see #unsetTypeLieu()
	 * @see #getTypeLieu()
	 * @generated
	 */
	void setTypeLieu(TypeDictionaryDicoGroupeIndividusTypeLieu value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeGroupeIndividus#getTypeLieu <em>Type Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeLieu()
	 * @see #getTypeLieu()
	 * @see #setTypeLieu(TypeDictionaryDicoGroupeIndividusTypeLieu)
	 * @generated
	 */
	void unsetTypeLieu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeGroupeIndividus#getTypeLieu <em>Type Lieu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Lieu</em>' attribute is set.
	 * @see #unsetTypeLieu()
	 * @see #getTypeLieu()
	 * @see #setTypeLieu(TypeDictionaryDicoGroupeIndividusTypeLieu)
	 * @generated
	 */
	boolean isSetTypeLieu();

	/**
	 * Returns the value of the '<em><b>Consequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequences</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequences</em>' attribute.
	 * @see #setConsequences(String)
	 * @see mpia.schema.SchemaPackage#getTypeGroupeIndividus_Consequences()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Consequences'"
	 * @generated
	 */
	String getConsequences();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupeIndividus#getConsequences <em>Consequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequences</em>' attribute.
	 * @see #getConsequences()
	 * @generated
	 */
	void setConsequences(String value);

	/**
	 * Returns the value of the '<em><b>Nom Rang Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Rang Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Rang Responsable</em>' attribute.
	 * @see #setNomRangResponsable(String)
	 * @see mpia.schema.SchemaPackage#getTypeGroupeIndividus_NomRangResponsable()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NomRangResponsable'"
	 * @generated
	 */
	String getNomRangResponsable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupeIndividus#getNomRangResponsable <em>Nom Rang Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Rang Responsable</em>' attribute.
	 * @see #getNomRangResponsable()
	 * @generated
	 */
	void setNomRangResponsable(String value);

	/**
	 * Returns the value of the '<em><b>Fonction Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction Responsable</em>' attribute.
	 * @see #setFonctionResponsable(String)
	 * @see mpia.schema.SchemaPackage#getTypeGroupeIndividus_FonctionResponsable()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='FonctionResponsable'"
	 * @generated
	 */
	String getFonctionResponsable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupeIndividus#getFonctionResponsable <em>Fonction Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction Responsable</em>' attribute.
	 * @see #getFonctionResponsable()
	 * @generated
	 */
	void setFonctionResponsable(String value);

	/**
	 * Returns the value of the '<em><b>APour Responsable Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Responsable Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Responsable Unite</em>' containment reference.
	 * @see #setAPourResponsableUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeGroupeIndividus_APourResponsableUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourResponsable_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourResponsableUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeGroupeIndividus#getAPourResponsableUnite <em>APour Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Responsable Unite</em>' containment reference.
	 * @see #getAPourResponsableUnite()
	 * @generated
	 */
	void setAPourResponsableUnite(TypeAssociationEXT value);

} // TypeGroupeIndividus
