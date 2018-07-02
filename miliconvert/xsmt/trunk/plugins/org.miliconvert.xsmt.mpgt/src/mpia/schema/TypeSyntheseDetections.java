/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Synthese Detections</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getCodeValidation <em>Code Validation</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getNatureRejet <em>Nature Rejet</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getReferencesGeographiques <em>References Geographiques</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getGDHreference <em>GD Hreference</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getEstSujetAssociationSyntheseDetectionsEvenementNRBC <em>Est Sujet Association Synthese Detections Evenement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getEstDetecteParTypeEquipementNRBC <em>Est Detecte Par Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getAPourZonesContamineesReellesAutreElementControle <em>APour Zones Contaminees Reelles Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getAPourConditionsMeteoTrancheMeteo <em>APour Conditions Meteo Tranche Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeSyntheseDetections#getAPourTypeRessourceRessourceActiviteType <em>APour Type Ressource Ressource Activite Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_SyntheseDetections' kind='elementOnly'"
 * @generated
 */
public interface TypeSyntheseDetections extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Code Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Validation</em>' attribute.
	 * @see #setCodeValidation(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_CodeValidation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='CodeValidation'"
	 * @generated
	 */
	String getCodeValidation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseDetections#getCodeValidation <em>Code Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Validation</em>' attribute.
	 * @see #getCodeValidation()
	 * @generated
	 */
	void setCodeValidation(String value);

	/**
	 * Returns the value of the '<em><b>Nature Rejet</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoNatureRejet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Rejet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Rejet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNatureRejet
	 * @see #isSetNatureRejet()
	 * @see #unsetNatureRejet()
	 * @see #setNatureRejet(TypeDictionaryDicoNatureRejet)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_NatureRejet()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NatureRejet'"
	 * @generated
	 */
	TypeDictionaryDicoNatureRejet getNatureRejet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseDetections#getNatureRejet <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Rejet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNatureRejet
	 * @see #isSetNatureRejet()
	 * @see #unsetNatureRejet()
	 * @see #getNatureRejet()
	 * @generated
	 */
	void setNatureRejet(TypeDictionaryDicoNatureRejet value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSyntheseDetections#getNatureRejet <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureRejet()
	 * @see #getNatureRejet()
	 * @see #setNatureRejet(TypeDictionaryDicoNatureRejet)
	 * @generated
	 */
	void unsetNatureRejet();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSyntheseDetections#getNatureRejet <em>Nature Rejet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Rejet</em>' attribute is set.
	 * @see #unsetNatureRejet()
	 * @see #getNatureRejet()
	 * @see #setNatureRejet(TypeDictionaryDicoNatureRejet)
	 * @generated
	 */
	boolean isSetNatureRejet();

	/**
	 * Returns the value of the '<em><b>References Geographiques</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References Geographiques</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References Geographiques</em>' attribute.
	 * @see #setReferencesGeographiques(String)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_ReferencesGeographiques()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='ReferencesGeographiques'"
	 * @generated
	 */
	String getReferencesGeographiques();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseDetections#getReferencesGeographiques <em>References Geographiques</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References Geographiques</em>' attribute.
	 * @see #getReferencesGeographiques()
	 * @generated
	 */
	void setReferencesGeographiques(String value);

	/**
	 * Returns the value of the '<em><b>GD Hreference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hreference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hreference</em>' attribute.
	 * @see #setGDHreference(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_GDHreference()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHreference'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHreference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSyntheseDetections#getGDHreference <em>GD Hreference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hreference</em>' attribute.
	 * @see #getGDHreference()
	 * @generated
	 */
	void setGDHreference(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Synthese Detections Evenement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Synthese Detections Evenement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Synthese Detections Evenement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_EstSujetAssociationSyntheseDetectionsEvenementNRBC()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_SyntheseDetections' target_entity='type_AssociationSyntheseDetectionsEvenementNRBC'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationSyntheseDetectionsEvenementNRBC'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationSyntheseDetectionsEvenementNRBC();

	/**
	 * Returns the value of the '<em><b>Est Detecte Par Type Equipement NRBC</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Detecte Par Type Equipement NRBC</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Detecte Par Type Equipement NRBC</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_EstDetecteParTypeEquipementNRBC()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipementNRBC'"
	 *        extendedMetaData="kind='element' name='EstDetectePar_TypeEquipementNRBC'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstDetecteParTypeEquipementNRBC();

	/**
	 * Returns the value of the '<em><b>APour Zones Contaminees Reelles Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zones Contaminees Reelles Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zones Contaminees Reelles Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_APourZonesContamineesReellesAutreElementControle()
	 * @model containment="true" required="true" upper="50"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZonesContamineesReelles_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZonesContamineesReellesAutreElementControle();

	/**
	 * Returns the value of the '<em><b>APour Conditions Meteo Tranche Meteo</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Conditions Meteo Tranche Meteo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Conditions Meteo Tranche Meteo</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_APourConditionsMeteoTrancheMeteo()
	 * @model containment="true" upper="20"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_SyntheseDetections' target_entity='type_TrancheMeteo'"
	 *        extendedMetaData="kind='element' name='APourConditionsMeteo_TrancheMeteo'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourConditionsMeteoTrancheMeteo();

	/**
	 * Returns the value of the '<em><b>APour Type Ressource Ressource Activite Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeRessourceActiviteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Ressource Ressource Activite Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Ressource Ressource Activite Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeSyntheseDetections_APourTypeRessourceRessourceActiviteType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceActiviteType'"
	 *        extendedMetaData="kind='element' name='APourTypeRessource_RessourceActiviteType'"
	 * @generated
	 */
	EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteType();

} // TypeSyntheseDetections
