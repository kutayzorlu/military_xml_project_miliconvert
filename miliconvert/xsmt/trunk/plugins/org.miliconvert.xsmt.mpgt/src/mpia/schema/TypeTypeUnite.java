/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Type Unite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTypeUnite#isGenerique <em>Generique</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getCategorieArme <em>Categorie Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getSpecialisationArme <em>Specialisation Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getSecondeSpecialisationArme <em>Seconde Specialisation Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getMobiliteGenerale <em>Mobilite Generale</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getQualificatifArme <em>Qualificatif Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getAPourMaterielPrincipalTypeMateriel <em>APour Materiel Principal Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeTypeUnite#getSupporteTypeOrganisationGouvernementale <em>Supporte Type Organisation Gouvernementale</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTypeUnite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TypeUnite' kind='elementOnly'"
 * @generated
 */
public interface TypeTypeUnite extends TypeTypeOrganisationGouvernementale {
	/**
	 * Returns the value of the '<em><b>Generique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generique</em>' attribute.
	 * @see #isSetGenerique()
	 * @see #unsetGenerique()
	 * @see #setGenerique(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_Generique()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Generique'"
	 * @generated
	 */
	boolean isGenerique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#isGenerique <em>Generique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generique</em>' attribute.
	 * @see #isSetGenerique()
	 * @see #unsetGenerique()
	 * @see #isGenerique()
	 * @generated
	 */
	void setGenerique(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeUnite#isGenerique <em>Generique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGenerique()
	 * @see #isGenerique()
	 * @see #setGenerique(boolean)
	 * @generated
	 */
	void unsetGenerique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeUnite#isGenerique <em>Generique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Generique</em>' attribute is set.
	 * @see #unsetGenerique()
	 * @see #isGenerique()
	 * @see #setGenerique(boolean)
	 * @generated
	 */
	boolean isSetGenerique();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoNiveau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #setNiveau(TypeDictionaryDicoNiveau)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_Niveau()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Niveau'"
	 * @generated
	 */
	TypeDictionaryDicoNiveau getNiveau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(TypeDictionaryDicoNiveau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeUnite#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoNiveau)
	 * @generated
	 */
	void unsetNiveau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeUnite#getNiveau <em>Niveau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau</em>' attribute is set.
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoNiveau)
	 * @generated
	 */
	boolean isSetNiveau();

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeUniteCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeUniteCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoTypeUniteCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoTypeUniteCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeUnite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeUniteCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeUnite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoTypeUniteCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Categorie Arme</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeUniteCategorieArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteCategorieArme
	 * @see #isSetCategorieArme()
	 * @see #unsetCategorieArme()
	 * @see #setCategorieArme(TypeDictionaryDicoTypeUniteCategorieArme)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_CategorieArme()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='CategorieArme'"
	 * @generated
	 */
	TypeDictionaryDicoTypeUniteCategorieArme getCategorieArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getCategorieArme <em>Categorie Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteCategorieArme
	 * @see #isSetCategorieArme()
	 * @see #unsetCategorieArme()
	 * @see #getCategorieArme()
	 * @generated
	 */
	void setCategorieArme(TypeDictionaryDicoTypeUniteCategorieArme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeUnite#getCategorieArme <em>Categorie Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieArme()
	 * @see #getCategorieArme()
	 * @see #setCategorieArme(TypeDictionaryDicoTypeUniteCategorieArme)
	 * @generated
	 */
	void unsetCategorieArme();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeUnite#getCategorieArme <em>Categorie Arme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Arme</em>' attribute is set.
	 * @see #unsetCategorieArme()
	 * @see #getCategorieArme()
	 * @see #setCategorieArme(TypeDictionaryDicoTypeUniteCategorieArme)
	 * @generated
	 */
	boolean isSetCategorieArme();

	/**
	 * Returns the value of the '<em><b>Specialisation Arme</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeUniteSpecialisationArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialisation Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialisation Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteSpecialisationArme
	 * @see #isSetSpecialisationArme()
	 * @see #unsetSpecialisationArme()
	 * @see #setSpecialisationArme(TypeDictionaryDicoTypeUniteSpecialisationArme)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_SpecialisationArme()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SpecialisationArme'"
	 * @generated
	 */
	TypeDictionaryDicoTypeUniteSpecialisationArme getSpecialisationArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getSpecialisationArme <em>Specialisation Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialisation Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteSpecialisationArme
	 * @see #isSetSpecialisationArme()
	 * @see #unsetSpecialisationArme()
	 * @see #getSpecialisationArme()
	 * @generated
	 */
	void setSpecialisationArme(TypeDictionaryDicoTypeUniteSpecialisationArme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeUnite#getSpecialisationArme <em>Specialisation Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecialisationArme()
	 * @see #getSpecialisationArme()
	 * @see #setSpecialisationArme(TypeDictionaryDicoTypeUniteSpecialisationArme)
	 * @generated
	 */
	void unsetSpecialisationArme();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeUnite#getSpecialisationArme <em>Specialisation Arme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specialisation Arme</em>' attribute is set.
	 * @see #unsetSpecialisationArme()
	 * @see #getSpecialisationArme()
	 * @see #setSpecialisationArme(TypeDictionaryDicoTypeUniteSpecialisationArme)
	 * @generated
	 */
	boolean isSetSpecialisationArme();

	/**
	 * Returns the value of the '<em><b>Seconde Specialisation Arme</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeUniteSecondeSpecialisationArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconde Specialisation Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconde Specialisation Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteSecondeSpecialisationArme
	 * @see #isSetSecondeSpecialisationArme()
	 * @see #unsetSecondeSpecialisationArme()
	 * @see #setSecondeSpecialisationArme(TypeDictionaryDicoTypeUniteSecondeSpecialisationArme)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_SecondeSpecialisationArme()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SecondeSpecialisationArme'"
	 * @generated
	 */
	TypeDictionaryDicoTypeUniteSecondeSpecialisationArme getSecondeSpecialisationArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getSecondeSpecialisationArme <em>Seconde Specialisation Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seconde Specialisation Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteSecondeSpecialisationArme
	 * @see #isSetSecondeSpecialisationArme()
	 * @see #unsetSecondeSpecialisationArme()
	 * @see #getSecondeSpecialisationArme()
	 * @generated
	 */
	void setSecondeSpecialisationArme(TypeDictionaryDicoTypeUniteSecondeSpecialisationArme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeUnite#getSecondeSpecialisationArme <em>Seconde Specialisation Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecondeSpecialisationArme()
	 * @see #getSecondeSpecialisationArme()
	 * @see #setSecondeSpecialisationArme(TypeDictionaryDicoTypeUniteSecondeSpecialisationArme)
	 * @generated
	 */
	void unsetSecondeSpecialisationArme();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeUnite#getSecondeSpecialisationArme <em>Seconde Specialisation Arme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Seconde Specialisation Arme</em>' attribute is set.
	 * @see #unsetSecondeSpecialisationArme()
	 * @see #getSecondeSpecialisationArme()
	 * @see #setSecondeSpecialisationArme(TypeDictionaryDicoTypeUniteSecondeSpecialisationArme)
	 * @generated
	 */
	boolean isSetSecondeSpecialisationArme();

	/**
	 * Returns the value of the '<em><b>Mobilite Generale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeUniteMobiliteGenerale}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobilite Generale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobilite Generale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteMobiliteGenerale
	 * @see #isSetMobiliteGenerale()
	 * @see #unsetMobiliteGenerale()
	 * @see #setMobiliteGenerale(TypeDictionaryDicoTypeUniteMobiliteGenerale)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_MobiliteGenerale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MobiliteGenerale'"
	 * @generated
	 */
	TypeDictionaryDicoTypeUniteMobiliteGenerale getMobiliteGenerale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getMobiliteGenerale <em>Mobilite Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mobilite Generale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteMobiliteGenerale
	 * @see #isSetMobiliteGenerale()
	 * @see #unsetMobiliteGenerale()
	 * @see #getMobiliteGenerale()
	 * @generated
	 */
	void setMobiliteGenerale(TypeDictionaryDicoTypeUniteMobiliteGenerale value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeUnite#getMobiliteGenerale <em>Mobilite Generale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMobiliteGenerale()
	 * @see #getMobiliteGenerale()
	 * @see #setMobiliteGenerale(TypeDictionaryDicoTypeUniteMobiliteGenerale)
	 * @generated
	 */
	void unsetMobiliteGenerale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeUnite#getMobiliteGenerale <em>Mobilite Generale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mobilite Generale</em>' attribute is set.
	 * @see #unsetMobiliteGenerale()
	 * @see #getMobiliteGenerale()
	 * @see #setMobiliteGenerale(TypeDictionaryDicoTypeUniteMobiliteGenerale)
	 * @generated
	 */
	boolean isSetMobiliteGenerale();

	/**
	 * Returns the value of the '<em><b>Qualificatif Arme</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeUniteQualificatifArme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualificatif Arme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualificatif Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteQualificatifArme
	 * @see #isSetQualificatifArme()
	 * @see #unsetQualificatifArme()
	 * @see #setQualificatifArme(TypeDictionaryDicoTypeUniteQualificatifArme)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_QualificatifArme()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='QualificatifArme'"
	 * @generated
	 */
	TypeDictionaryDicoTypeUniteQualificatifArme getQualificatifArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getQualificatifArme <em>Qualificatif Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualificatif Arme</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeUniteQualificatifArme
	 * @see #isSetQualificatifArme()
	 * @see #unsetQualificatifArme()
	 * @see #getQualificatifArme()
	 * @generated
	 */
	void setQualificatifArme(TypeDictionaryDicoTypeUniteQualificatifArme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTypeUnite#getQualificatifArme <em>Qualificatif Arme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQualificatifArme()
	 * @see #getQualificatifArme()
	 * @see #setQualificatifArme(TypeDictionaryDicoTypeUniteQualificatifArme)
	 * @generated
	 */
	void unsetQualificatifArme();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTypeUnite#getQualificatifArme <em>Qualificatif Arme</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Qualificatif Arme</em>' attribute is set.
	 * @see #unsetQualificatifArme()
	 * @see #getQualificatifArme()
	 * @see #setQualificatifArme(TypeDictionaryDicoTypeUniteQualificatifArme)
	 * @generated
	 */
	boolean isSetQualificatifArme();

	/**
	 * Returns the value of the '<em><b>APour Materiel Principal Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Materiel Principal Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Materiel Principal Type Materiel</em>' containment reference.
	 * @see #setAPourMaterielPrincipalTypeMateriel(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_APourMaterielPrincipalTypeMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='APourMaterielPrincipal_TypeMateriel'"
	 * @generated
	 */
	TypeAssociation getAPourMaterielPrincipalTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getAPourMaterielPrincipalTypeMateriel <em>APour Materiel Principal Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Materiel Principal Type Materiel</em>' containment reference.
	 * @see #getAPourMaterielPrincipalTypeMateriel()
	 * @generated
	 */
	void setAPourMaterielPrincipalTypeMateriel(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Supporte Type Organisation Gouvernementale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporte Type Organisation Gouvernementale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporte Type Organisation Gouvernementale</em>' containment reference.
	 * @see #setSupporteTypeOrganisationGouvernementale(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeTypeUnite_SupporteTypeOrganisationGouvernementale()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSupporteePar_TypeUnite' target_entity='type_TypeOrganisationGouvernementale'"
	 *        extendedMetaData="kind='element' name='Supporte_TypeOrganisationGouvernementale'"
	 * @generated
	 */
	TypeAssociation getSupporteTypeOrganisationGouvernementale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTypeUnite#getSupporteTypeOrganisationGouvernementale <em>Supporte Type Organisation Gouvernementale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supporte Type Organisation Gouvernementale</em>' containment reference.
	 * @see #getSupporteTypeOrganisationGouvernementale()
	 * @generated
	 */
	void setSupporteTypeOrganisationGouvernementale(TypeAssociation value);

} // TypeTypeUnite
