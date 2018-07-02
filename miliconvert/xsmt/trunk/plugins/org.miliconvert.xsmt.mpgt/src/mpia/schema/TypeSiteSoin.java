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
 * A representation of the model object '<em><b>Type Site Soin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSiteSoin#getNombreConsultation <em>Nombre Consultation</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getQualiteSoins <em>Qualite Soins</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getBlocsOperatoires <em>Blocs Operatoires</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getEquipements <em>Equipements</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getLitsChirurgie <em>Lits Chirurgie</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getLitsNeuroChirurgie <em>Lits Neuro Chirurgie</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#isServiceReanimation <em>Service Reanimation</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#isEauCourante <em>Eau Courante</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#isFacilitesSanitaires <em>Facilites Sanitaires</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getLitsGrandsBrules <em>Lits Grands Brules</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getLitsOphtalmologie <em>Lits Ophtalmologie</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getMedicaments <em>Medicaments</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteSoin#getLitsUrologie <em>Lits Urologie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSiteSoin()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SiteSoin' kind='elementOnly'"
 * @generated
 */
public interface TypeSiteSoin extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Consultation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Consultation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Consultation</em>' attribute.
	 * @see #isSetNombreConsultation()
	 * @see #unsetNombreConsultation()
	 * @see #setNombreConsultation(long)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_NombreConsultation()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreConsultation'"
	 * @generated
	 */
	long getNombreConsultation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getNombreConsultation <em>Nombre Consultation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Consultation</em>' attribute.
	 * @see #isSetNombreConsultation()
	 * @see #unsetNombreConsultation()
	 * @see #getNombreConsultation()
	 * @generated
	 */
	void setNombreConsultation(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#getNombreConsultation <em>Nombre Consultation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreConsultation()
	 * @see #getNombreConsultation()
	 * @see #setNombreConsultation(long)
	 * @generated
	 */
	void unsetNombreConsultation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#getNombreConsultation <em>Nombre Consultation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Consultation</em>' attribute is set.
	 * @see #unsetNombreConsultation()
	 * @see #getNombreConsultation()
	 * @see #setNombreConsultation(long)
	 * @generated
	 */
	boolean isSetNombreConsultation();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSiteSoinType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSiteSoinType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoSiteSoinType)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoSiteSoinType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSiteSoinType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoSiteSoinType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoSiteSoinType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoSiteSoinType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Qualite Soins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualite Soins</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualite Soins</em>' attribute.
	 * @see #setQualiteSoins(String)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_QualiteSoins()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='QualiteSoins'"
	 * @generated
	 */
	String getQualiteSoins();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getQualiteSoins <em>Qualite Soins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualite Soins</em>' attribute.
	 * @see #getQualiteSoins()
	 * @generated
	 */
	void setQualiteSoins(String value);

	/**
	 * Returns the value of the '<em><b>Blocs Operatoires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocs Operatoires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocs Operatoires</em>' attribute.
	 * @see #isSetBlocsOperatoires()
	 * @see #unsetBlocsOperatoires()
	 * @see #setBlocsOperatoires(long)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_BlocsOperatoires()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier15"
	 *        extendedMetaData="kind='element' name='BlocsOperatoires'"
	 * @generated
	 */
	long getBlocsOperatoires();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getBlocsOperatoires <em>Blocs Operatoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocs Operatoires</em>' attribute.
	 * @see #isSetBlocsOperatoires()
	 * @see #unsetBlocsOperatoires()
	 * @see #getBlocsOperatoires()
	 * @generated
	 */
	void setBlocsOperatoires(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#getBlocsOperatoires <em>Blocs Operatoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlocsOperatoires()
	 * @see #getBlocsOperatoires()
	 * @see #setBlocsOperatoires(long)
	 * @generated
	 */
	void unsetBlocsOperatoires();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#getBlocsOperatoires <em>Blocs Operatoires</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blocs Operatoires</em>' attribute is set.
	 * @see #unsetBlocsOperatoires()
	 * @see #getBlocsOperatoires()
	 * @see #setBlocsOperatoires(long)
	 * @generated
	 */
	boolean isSetBlocsOperatoires();

	/**
	 * Returns the value of the '<em><b>Equipements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equipements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equipements</em>' attribute.
	 * @see #setEquipements(String)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_Equipements()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='Equipements'"
	 * @generated
	 */
	String getEquipements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getEquipements <em>Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equipements</em>' attribute.
	 * @see #getEquipements()
	 * @generated
	 */
	void setEquipements(String value);

	/**
	 * Returns the value of the '<em><b>Lits Chirurgie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lits Chirurgie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lits Chirurgie</em>' attribute.
	 * @see #isSetLitsChirurgie()
	 * @see #unsetLitsChirurgie()
	 * @see #setLitsChirurgie(long)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_LitsChirurgie()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='LitsChirurgie'"
	 * @generated
	 */
	long getLitsChirurgie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsChirurgie <em>Lits Chirurgie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lits Chirurgie</em>' attribute.
	 * @see #isSetLitsChirurgie()
	 * @see #unsetLitsChirurgie()
	 * @see #getLitsChirurgie()
	 * @generated
	 */
	void setLitsChirurgie(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsChirurgie <em>Lits Chirurgie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLitsChirurgie()
	 * @see #getLitsChirurgie()
	 * @see #setLitsChirurgie(long)
	 * @generated
	 */
	void unsetLitsChirurgie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#getLitsChirurgie <em>Lits Chirurgie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lits Chirurgie</em>' attribute is set.
	 * @see #unsetLitsChirurgie()
	 * @see #getLitsChirurgie()
	 * @see #setLitsChirurgie(long)
	 * @generated
	 */
	boolean isSetLitsChirurgie();

	/**
	 * Returns the value of the '<em><b>Lits Neuro Chirurgie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lits Neuro Chirurgie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lits Neuro Chirurgie</em>' attribute.
	 * @see #isSetLitsNeuroChirurgie()
	 * @see #unsetLitsNeuroChirurgie()
	 * @see #setLitsNeuroChirurgie(long)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_LitsNeuroChirurgie()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='LitsNeuroChirurgie'"
	 * @generated
	 */
	long getLitsNeuroChirurgie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsNeuroChirurgie <em>Lits Neuro Chirurgie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lits Neuro Chirurgie</em>' attribute.
	 * @see #isSetLitsNeuroChirurgie()
	 * @see #unsetLitsNeuroChirurgie()
	 * @see #getLitsNeuroChirurgie()
	 * @generated
	 */
	void setLitsNeuroChirurgie(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsNeuroChirurgie <em>Lits Neuro Chirurgie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLitsNeuroChirurgie()
	 * @see #getLitsNeuroChirurgie()
	 * @see #setLitsNeuroChirurgie(long)
	 * @generated
	 */
	void unsetLitsNeuroChirurgie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#getLitsNeuroChirurgie <em>Lits Neuro Chirurgie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lits Neuro Chirurgie</em>' attribute is set.
	 * @see #unsetLitsNeuroChirurgie()
	 * @see #getLitsNeuroChirurgie()
	 * @see #setLitsNeuroChirurgie(long)
	 * @generated
	 */
	boolean isSetLitsNeuroChirurgie();

	/**
	 * Returns the value of the '<em><b>Service Reanimation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Reanimation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Reanimation</em>' attribute.
	 * @see #isSetServiceReanimation()
	 * @see #unsetServiceReanimation()
	 * @see #setServiceReanimation(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_ServiceReanimation()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ServiceReanimation'"
	 * @generated
	 */
	boolean isServiceReanimation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#isServiceReanimation <em>Service Reanimation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Reanimation</em>' attribute.
	 * @see #isSetServiceReanimation()
	 * @see #unsetServiceReanimation()
	 * @see #isServiceReanimation()
	 * @generated
	 */
	void setServiceReanimation(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#isServiceReanimation <em>Service Reanimation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServiceReanimation()
	 * @see #isServiceReanimation()
	 * @see #setServiceReanimation(boolean)
	 * @generated
	 */
	void unsetServiceReanimation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#isServiceReanimation <em>Service Reanimation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Service Reanimation</em>' attribute is set.
	 * @see #unsetServiceReanimation()
	 * @see #isServiceReanimation()
	 * @see #setServiceReanimation(boolean)
	 * @generated
	 */
	boolean isSetServiceReanimation();

	/**
	 * Returns the value of the '<em><b>Eau Courante</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eau Courante</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eau Courante</em>' attribute.
	 * @see #isSetEauCourante()
	 * @see #unsetEauCourante()
	 * @see #setEauCourante(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_EauCourante()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='EauCourante'"
	 * @generated
	 */
	boolean isEauCourante();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#isEauCourante <em>Eau Courante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eau Courante</em>' attribute.
	 * @see #isSetEauCourante()
	 * @see #unsetEauCourante()
	 * @see #isEauCourante()
	 * @generated
	 */
	void setEauCourante(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#isEauCourante <em>Eau Courante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEauCourante()
	 * @see #isEauCourante()
	 * @see #setEauCourante(boolean)
	 * @generated
	 */
	void unsetEauCourante();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#isEauCourante <em>Eau Courante</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eau Courante</em>' attribute is set.
	 * @see #unsetEauCourante()
	 * @see #isEauCourante()
	 * @see #setEauCourante(boolean)
	 * @generated
	 */
	boolean isSetEauCourante();

	/**
	 * Returns the value of the '<em><b>Facilites Sanitaires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilites Sanitaires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilites Sanitaires</em>' attribute.
	 * @see #isSetFacilitesSanitaires()
	 * @see #unsetFacilitesSanitaires()
	 * @see #setFacilitesSanitaires(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_FacilitesSanitaires()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='FacilitesSanitaires'"
	 * @generated
	 */
	boolean isFacilitesSanitaires();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#isFacilitesSanitaires <em>Facilites Sanitaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facilites Sanitaires</em>' attribute.
	 * @see #isSetFacilitesSanitaires()
	 * @see #unsetFacilitesSanitaires()
	 * @see #isFacilitesSanitaires()
	 * @generated
	 */
	void setFacilitesSanitaires(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#isFacilitesSanitaires <em>Facilites Sanitaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFacilitesSanitaires()
	 * @see #isFacilitesSanitaires()
	 * @see #setFacilitesSanitaires(boolean)
	 * @generated
	 */
	void unsetFacilitesSanitaires();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#isFacilitesSanitaires <em>Facilites Sanitaires</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Facilites Sanitaires</em>' attribute is set.
	 * @see #unsetFacilitesSanitaires()
	 * @see #isFacilitesSanitaires()
	 * @see #setFacilitesSanitaires(boolean)
	 * @generated
	 */
	boolean isSetFacilitesSanitaires();

	/**
	 * Returns the value of the '<em><b>Lits Grands Brules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lits Grands Brules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lits Grands Brules</em>' attribute.
	 * @see #isSetLitsGrandsBrules()
	 * @see #unsetLitsGrandsBrules()
	 * @see #setLitsGrandsBrules(long)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_LitsGrandsBrules()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='LitsGrandsBrules'"
	 * @generated
	 */
	long getLitsGrandsBrules();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsGrandsBrules <em>Lits Grands Brules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lits Grands Brules</em>' attribute.
	 * @see #isSetLitsGrandsBrules()
	 * @see #unsetLitsGrandsBrules()
	 * @see #getLitsGrandsBrules()
	 * @generated
	 */
	void setLitsGrandsBrules(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsGrandsBrules <em>Lits Grands Brules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLitsGrandsBrules()
	 * @see #getLitsGrandsBrules()
	 * @see #setLitsGrandsBrules(long)
	 * @generated
	 */
	void unsetLitsGrandsBrules();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#getLitsGrandsBrules <em>Lits Grands Brules</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lits Grands Brules</em>' attribute is set.
	 * @see #unsetLitsGrandsBrules()
	 * @see #getLitsGrandsBrules()
	 * @see #setLitsGrandsBrules(long)
	 * @generated
	 */
	boolean isSetLitsGrandsBrules();

	/**
	 * Returns the value of the '<em><b>Lits Ophtalmologie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lits Ophtalmologie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lits Ophtalmologie</em>' attribute.
	 * @see #isSetLitsOphtalmologie()
	 * @see #unsetLitsOphtalmologie()
	 * @see #setLitsOphtalmologie(long)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_LitsOphtalmologie()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='LitsOphtalmologie'"
	 * @generated
	 */
	long getLitsOphtalmologie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsOphtalmologie <em>Lits Ophtalmologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lits Ophtalmologie</em>' attribute.
	 * @see #isSetLitsOphtalmologie()
	 * @see #unsetLitsOphtalmologie()
	 * @see #getLitsOphtalmologie()
	 * @generated
	 */
	void setLitsOphtalmologie(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsOphtalmologie <em>Lits Ophtalmologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLitsOphtalmologie()
	 * @see #getLitsOphtalmologie()
	 * @see #setLitsOphtalmologie(long)
	 * @generated
	 */
	void unsetLitsOphtalmologie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#getLitsOphtalmologie <em>Lits Ophtalmologie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lits Ophtalmologie</em>' attribute is set.
	 * @see #unsetLitsOphtalmologie()
	 * @see #getLitsOphtalmologie()
	 * @see #setLitsOphtalmologie(long)
	 * @generated
	 */
	boolean isSetLitsOphtalmologie();

	/**
	 * Returns the value of the '<em><b>Medicaments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicaments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaments</em>' attribute.
	 * @see #setMedicaments(String)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_Medicaments()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Medicaments'"
	 * @generated
	 */
	String getMedicaments();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getMedicaments <em>Medicaments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicaments</em>' attribute.
	 * @see #getMedicaments()
	 * @generated
	 */
	void setMedicaments(String value);

	/**
	 * Returns the value of the '<em><b>Lits Urologie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lits Urologie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lits Urologie</em>' attribute.
	 * @see #isSetLitsUrologie()
	 * @see #unsetLitsUrologie()
	 * @see #setLitsUrologie(long)
	 * @see mpia.schema.SchemaPackage#getTypeSiteSoin_LitsUrologie()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='LitsUrologie'"
	 * @generated
	 */
	long getLitsUrologie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsUrologie <em>Lits Urologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lits Urologie</em>' attribute.
	 * @see #isSetLitsUrologie()
	 * @see #unsetLitsUrologie()
	 * @see #getLitsUrologie()
	 * @generated
	 */
	void setLitsUrologie(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteSoin#getLitsUrologie <em>Lits Urologie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLitsUrologie()
	 * @see #getLitsUrologie()
	 * @see #setLitsUrologie(long)
	 * @generated
	 */
	void unsetLitsUrologie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteSoin#getLitsUrologie <em>Lits Urologie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lits Urologie</em>' attribute is set.
	 * @see #unsetLitsUrologie()
	 * @see #getLitsUrologie()
	 * @see #setLitsUrologie(long)
	 * @generated
	 */
	boolean isSetLitsUrologie();

} // TypeSiteSoin
