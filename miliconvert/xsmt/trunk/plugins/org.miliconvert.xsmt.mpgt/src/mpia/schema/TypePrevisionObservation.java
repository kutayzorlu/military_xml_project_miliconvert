/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Prevision Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePrevisionObservation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservation#getGdhDebutValidite <em>Gdh Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservation#getGdhFinValidite <em>Gdh Fin Validite</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservation#getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche <em>APour Caracteristique Deuxieme Tranche Prevision Observation Par Tranche</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservation#getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche <em>APour Caracteristique Premiere Tranche Prevision Observation Par Tranche</em>}</li>
 *   <li>{@link mpia.schema.TypePrevisionObservation#getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche <em>APour Caracteristique Troisieme Tranche Prevision Observation Par Tranche</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePrevisionObservation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PrevisionObservation' kind='elementOnly'"
 * @generated
 */
public interface TypePrevisionObservation extends TypeInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrevisionObservationCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrevisionObservationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPrevisionObservationCategorie)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservation_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoPrevisionObservationCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrevisionObservationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoPrevisionObservationCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrevisionObservation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPrevisionObservationCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrevisionObservation#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPrevisionObservationCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Gdh Debut Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdh Debut Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdh Debut Validite</em>' attribute.
	 * @see #setGdhDebutValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservation_GdhDebutValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GdhDebutValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getGdhDebutValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservation#getGdhDebutValidite <em>Gdh Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdh Debut Validite</em>' attribute.
	 * @see #getGdhDebutValidite()
	 * @generated
	 */
	void setGdhDebutValidite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Gdh Fin Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdh Fin Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdh Fin Validite</em>' attribute.
	 * @see #setGdhFinValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservation_GdhFinValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GdhFinValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getGdhFinValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservation#getGdhFinValidite <em>Gdh Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdh Fin Validite</em>' attribute.
	 * @see #getGdhFinValidite()
	 * @generated
	 */
	void setGdhFinValidite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Deuxieme Tranche Prevision Observation Par Tranche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Deuxieme Tranche Prevision Observation Par Tranche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Deuxieme Tranche Prevision Observation Par Tranche</em>' containment reference.
	 * @see #setAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservation_APourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PrevisionObservationParTranche'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueDeuxiemeTranche_PrevisionObservationParTranche'"
	 * @generated
	 */
	TypePrevisionObservationParTranche getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservation#getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche <em>APour Caracteristique Deuxieme Tranche Prevision Observation Par Tranche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique Deuxieme Tranche Prevision Observation Par Tranche</em>' containment reference.
	 * @see #getAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche()
	 * @generated
	 */
	void setAPourCaracteristiqueDeuxiemeTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Premiere Tranche Prevision Observation Par Tranche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Premiere Tranche Prevision Observation Par Tranche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Premiere Tranche Prevision Observation Par Tranche</em>' containment reference.
	 * @see #setAPourCaracteristiquePremiereTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservation_APourCaracteristiquePremiereTranchePrevisionObservationParTranche()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PrevisionObservationParTranche'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiquePremiereTranche_PrevisionObservationParTranche'"
	 * @generated
	 */
	TypePrevisionObservationParTranche getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservation#getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche <em>APour Caracteristique Premiere Tranche Prevision Observation Par Tranche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique Premiere Tranche Prevision Observation Par Tranche</em>' containment reference.
	 * @see #getAPourCaracteristiquePremiereTranchePrevisionObservationParTranche()
	 * @generated
	 */
	void setAPourCaracteristiquePremiereTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristique Troisieme Tranche Prevision Observation Par Tranche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristique Troisieme Tranche Prevision Observation Par Tranche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristique Troisieme Tranche Prevision Observation Par Tranche</em>' containment reference.
	 * @see #setAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche)
	 * @see mpia.schema.SchemaPackage#getTypePrevisionObservation_APourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PrevisionObservationParTranche'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiqueTroisiemeTranche_PrevisionObservationParTranche'"
	 * @generated
	 */
	TypePrevisionObservationParTranche getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrevisionObservation#getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche <em>APour Caracteristique Troisieme Tranche Prevision Observation Par Tranche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristique Troisieme Tranche Prevision Observation Par Tranche</em>' containment reference.
	 * @see #getAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche()
	 * @generated
	 */
	void setAPourCaracteristiqueTroisiemeTranchePrevisionObservationParTranche(TypePrevisionObservationParTranche value);

} // TypePrevisionObservation
