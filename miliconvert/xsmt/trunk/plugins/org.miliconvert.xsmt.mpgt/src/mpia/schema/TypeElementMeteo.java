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
 * A representation of the model object '<em><b>Type Element Meteo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeElementMeteo#getSource <em>Source</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#isPardefaut <em>Pardefaut</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getInterpretation <em>Interpretation</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getProbabilite <em>Probabilite</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourVentVent <em>APour Vent Vent</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourCouvertureNuageuseCouvertureNuageuse <em>APour Couverture Nuageuse Couverture Nuageuse</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique <em>APour Autre Phenomene Meteorologique Autre Phenomene Meteorologique</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourAtmosphereAtmosphere <em>APour Atmosphere Atmosphere</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourPrecipitationPrecipitation <em>APour Precipitation Precipitation</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourVisibiliteVisibilite <em>APour Visibilite Visibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getEstObjetAssociationMaterielMeteorologie <em>Est Objet Association Materiel Meteorologie</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getEstSujetAssociationMeteorologieSite <em>Est Sujet Association Meteorologie Site</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourLumiereLumiere <em>APour Lumiere Lumiere</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourTrancheHoraireTrancheMeteo <em>APour Tranche Horaire Tranche Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getAPourGivrageGivrage <em>APour Givrage Givrage</em>}</li>
 *   <li>{@link mpia.schema.TypeElementMeteo#getEstObjetAssociationSiteMeteorologie <em>Est Objet Association Site Meteorologie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeElementMeteo()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ElementMeteo' kind='elementOnly'"
 * @generated
 */
public interface TypeElementMeteo extends TypeInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMeteorologieSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMeteorologieSource
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(TypeDictionaryDicoMeteorologieSource)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_Source()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	TypeDictionaryDicoMeteorologieSource getSource();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMeteorologieSource
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TypeDictionaryDicoMeteorologieSource value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementMeteo#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(TypeDictionaryDicoMeteorologieSource)
	 * @generated
	 */
	void unsetSource();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementMeteo#getSource <em>Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' attribute is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(TypeDictionaryDicoMeteorologieSource)
	 * @generated
	 */
	boolean isSetSource();

	/**
	 * Returns the value of the '<em><b>Pardefaut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pardefaut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pardefaut</em>' attribute.
	 * @see #isSetPardefaut()
	 * @see #unsetPardefaut()
	 * @see #setPardefaut(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_Pardefaut()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Pardefaut'"
	 * @generated
	 */
	boolean isPardefaut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#isPardefaut <em>Pardefaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pardefaut</em>' attribute.
	 * @see #isSetPardefaut()
	 * @see #unsetPardefaut()
	 * @see #isPardefaut()
	 * @generated
	 */
	void setPardefaut(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementMeteo#isPardefaut <em>Pardefaut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPardefaut()
	 * @see #isPardefaut()
	 * @see #setPardefaut(boolean)
	 * @generated
	 */
	void unsetPardefaut();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementMeteo#isPardefaut <em>Pardefaut</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pardefaut</em>' attribute is set.
	 * @see #unsetPardefaut()
	 * @see #isPardefaut()
	 * @see #setPardefaut(boolean)
	 * @generated
	 */
	boolean isSetPardefaut();

	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMeteorologieInterpretation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMeteorologieInterpretation
	 * @see #isSetInterpretation()
	 * @see #unsetInterpretation()
	 * @see #setInterpretation(TypeDictionaryDicoMeteorologieInterpretation)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_Interpretation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Interpretation'"
	 * @generated
	 */
	TypeDictionaryDicoMeteorologieInterpretation getInterpretation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interpretation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMeteorologieInterpretation
	 * @see #isSetInterpretation()
	 * @see #unsetInterpretation()
	 * @see #getInterpretation()
	 * @generated
	 */
	void setInterpretation(TypeDictionaryDicoMeteorologieInterpretation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementMeteo#getInterpretation <em>Interpretation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInterpretation()
	 * @see #getInterpretation()
	 * @see #setInterpretation(TypeDictionaryDicoMeteorologieInterpretation)
	 * @generated
	 */
	void unsetInterpretation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementMeteo#getInterpretation <em>Interpretation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Interpretation</em>' attribute is set.
	 * @see #unsetInterpretation()
	 * @see #getInterpretation()
	 * @see #setInterpretation(TypeDictionaryDicoMeteorologieInterpretation)
	 * @generated
	 */
	boolean isSetInterpretation();

	/**
	 * Returns the value of the '<em><b>Probabilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilite</em>' attribute.
	 * @see #isSetProbabilite()
	 * @see #unsetProbabilite()
	 * @see #setProbabilite(double)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_Probabilite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='Probabilite'"
	 * @generated
	 */
	double getProbabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getProbabilite <em>Probabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilite</em>' attribute.
	 * @see #isSetProbabilite()
	 * @see #unsetProbabilite()
	 * @see #getProbabilite()
	 * @generated
	 */
	void setProbabilite(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementMeteo#getProbabilite <em>Probabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbabilite()
	 * @see #getProbabilite()
	 * @see #setProbabilite(double)
	 * @generated
	 */
	void unsetProbabilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementMeteo#getProbabilite <em>Probabilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Probabilite</em>' attribute is set.
	 * @see #unsetProbabilite()
	 * @see #getProbabilite()
	 * @see #setProbabilite(double)
	 * @generated
	 */
	boolean isSetProbabilite();

	/**
	 * Returns the value of the '<em><b>APour Vent Vent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Vent Vent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Vent Vent</em>' containment reference.
	 * @see #setAPourVentVent(TypeVent)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourVentVent()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Vent'"
	 *        extendedMetaData="kind='element' name='APourVent_Vent'"
	 * @generated
	 */
	TypeVent getAPourVentVent();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourVentVent <em>APour Vent Vent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Vent Vent</em>' containment reference.
	 * @see #getAPourVentVent()
	 * @generated
	 */
	void setAPourVentVent(TypeVent value);

	/**
	 * Returns the value of the '<em><b>APour Couverture Nuageuse Couverture Nuageuse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Couverture Nuageuse Couverture Nuageuse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Couverture Nuageuse Couverture Nuageuse</em>' containment reference.
	 * @see #setAPourCouvertureNuageuseCouvertureNuageuse(TypeCouvertureNuageuse)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourCouvertureNuageuseCouvertureNuageuse()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CouvertureNuageuse'"
	 *        extendedMetaData="kind='element' name='APourCouvertureNuageuse_CouvertureNuageuse'"
	 * @generated
	 */
	TypeCouvertureNuageuse getAPourCouvertureNuageuseCouvertureNuageuse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourCouvertureNuageuseCouvertureNuageuse <em>APour Couverture Nuageuse Couverture Nuageuse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Couverture Nuageuse Couverture Nuageuse</em>' containment reference.
	 * @see #getAPourCouvertureNuageuseCouvertureNuageuse()
	 * @generated
	 */
	void setAPourCouvertureNuageuseCouvertureNuageuse(TypeCouvertureNuageuse value);

	/**
	 * Returns the value of the '<em><b>APour Autre Phenomene Meteorologique Autre Phenomene Meteorologique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Autre Phenomene Meteorologique Autre Phenomene Meteorologique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Autre Phenomene Meteorologique Autre Phenomene Meteorologique</em>' containment reference.
	 * @see #setAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AutrePhenomeneMeteorologique'"
	 *        extendedMetaData="kind='element' name='APourAutrePhenomeneMeteorologique_AutrePhenomeneMeteorologique'"
	 * @generated
	 */
	TypeAutrePhenomeneMeteorologique getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique <em>APour Autre Phenomene Meteorologique Autre Phenomene Meteorologique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Autre Phenomene Meteorologique Autre Phenomene Meteorologique</em>' containment reference.
	 * @see #getAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique()
	 * @generated
	 */
	void setAPourAutrePhenomeneMeteorologiqueAutrePhenomeneMeteorologique(TypeAutrePhenomeneMeteorologique value);

	/**
	 * Returns the value of the '<em><b>APour Atmosphere Atmosphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Atmosphere Atmosphere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Atmosphere Atmosphere</em>' containment reference.
	 * @see #setAPourAtmosphereAtmosphere(TypeAtmosphere)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourAtmosphereAtmosphere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Atmosphere'"
	 *        extendedMetaData="kind='element' name='APourAtmosphere_Atmosphere'"
	 * @generated
	 */
	TypeAtmosphere getAPourAtmosphereAtmosphere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourAtmosphereAtmosphere <em>APour Atmosphere Atmosphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Atmosphere Atmosphere</em>' containment reference.
	 * @see #getAPourAtmosphereAtmosphere()
	 * @generated
	 */
	void setAPourAtmosphereAtmosphere(TypeAtmosphere value);

	/**
	 * Returns the value of the '<em><b>APour Precipitation Precipitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Precipitation Precipitation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Precipitation Precipitation</em>' containment reference.
	 * @see #setAPourPrecipitationPrecipitation(TypePrecipitation)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourPrecipitationPrecipitation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Precipitation'"
	 *        extendedMetaData="kind='element' name='APourPrecipitation_Precipitation'"
	 * @generated
	 */
	TypePrecipitation getAPourPrecipitationPrecipitation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourPrecipitationPrecipitation <em>APour Precipitation Precipitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Precipitation Precipitation</em>' containment reference.
	 * @see #getAPourPrecipitationPrecipitation()
	 * @generated
	 */
	void setAPourPrecipitationPrecipitation(TypePrecipitation value);

	/**
	 * Returns the value of the '<em><b>APour Visibilite Visibilite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Visibilite Visibilite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Visibilite Visibilite</em>' containment reference.
	 * @see #setAPourVisibiliteVisibilite(TypeVisibilite)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourVisibiliteVisibilite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Visibilite'"
	 *        extendedMetaData="kind='element' name='APourVisibilite_Visibilite'"
	 * @generated
	 */
	TypeVisibilite getAPourVisibiliteVisibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourVisibiliteVisibilite <em>APour Visibilite Visibilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Visibilite Visibilite</em>' containment reference.
	 * @see #getAPourVisibiliteVisibilite()
	 * @generated
	 */
	void setAPourVisibiliteVisibilite(TypeVisibilite value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Materiel Meteorologie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Materiel Meteorologie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Materiel Meteorologie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_EstObjetAssociationMaterielMeteorologie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementMeteo' target_entity='type_AssociationMaterielMeteorologie'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationMaterielMeteorologie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationMaterielMeteorologie();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Meteorologie Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Meteorologie Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Meteorologie Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_EstSujetAssociationMeteorologieSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_ElementMeteo' target_entity='type_AssociationMeteorologieSite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationMeteorologieSite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationMeteorologieSite();

	/**
	 * Returns the value of the '<em><b>APour Lumiere Lumiere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lumiere Lumiere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lumiere Lumiere</em>' containment reference.
	 * @see #setAPourLumiereLumiere(TypeLumiere)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourLumiereLumiere()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Lumiere'"
	 *        extendedMetaData="kind='element' name='APourLumiere_Lumiere'"
	 * @generated
	 */
	TypeLumiere getAPourLumiereLumiere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourLumiereLumiere <em>APour Lumiere Lumiere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lumiere Lumiere</em>' containment reference.
	 * @see #getAPourLumiereLumiere()
	 * @generated
	 */
	void setAPourLumiereLumiere(TypeLumiere value);

	/**
	 * Returns the value of the '<em><b>APour Tranche Horaire Tranche Meteo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Tranche Horaire Tranche Meteo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Tranche Horaire Tranche Meteo</em>' containment reference.
	 * @see #setAPourTrancheHoraireTrancheMeteo(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourTrancheHoraireTrancheMeteo()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourCaracteristique_ElementMeteo' target_entity='type_TrancheMeteo'"
	 *        extendedMetaData="kind='element' name='APourTrancheHoraire_TrancheMeteo'"
	 * @generated
	 */
	TypeAssociation getAPourTrancheHoraireTrancheMeteo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourTrancheHoraireTrancheMeteo <em>APour Tranche Horaire Tranche Meteo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Tranche Horaire Tranche Meteo</em>' containment reference.
	 * @see #getAPourTrancheHoraireTrancheMeteo()
	 * @generated
	 */
	void setAPourTrancheHoraireTrancheMeteo(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Givrage Givrage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Givrage Givrage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Givrage Givrage</em>' containment reference.
	 * @see #setAPourGivrageGivrage(TypeGivrage)
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_APourGivrageGivrage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Givrage'"
	 *        extendedMetaData="kind='element' name='APourGivrage_Givrage'"
	 * @generated
	 */
	TypeGivrage getAPourGivrageGivrage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementMeteo#getAPourGivrageGivrage <em>APour Givrage Givrage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Givrage Givrage</em>' containment reference.
	 * @see #getAPourGivrageGivrage()
	 * @generated
	 */
	void setAPourGivrageGivrage(TypeGivrage value);

	/**
	 * Returns the value of the '<em><b>Est Objet Association Site Meteorologie</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Site Meteorologie</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Site Meteorologie</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeElementMeteo_EstObjetAssociationSiteMeteorologie()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourObjet_ElementMeteo' target_entity='type_AssociationSiteMeteorologie'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationSiteMeteorologie'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationSiteMeteorologie();

} // TypeElementMeteo
