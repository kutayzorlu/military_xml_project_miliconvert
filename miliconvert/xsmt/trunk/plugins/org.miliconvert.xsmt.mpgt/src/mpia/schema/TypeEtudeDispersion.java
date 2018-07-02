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
 * A representation of the model object '<em><b>Type Etude Dispersion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtudeDispersion#getGDHreference <em>GD Hreference</em>}</li>
 *   <li>{@link mpia.schema.TypeEtudeDispersion#getNatureRejet <em>Nature Rejet</em>}</li>
 *   <li>{@link mpia.schema.TypeEtudeDispersion#getAPourZonesDispersionAutreElementControle <em>APour Zones Dispersion Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeEtudeDispersion#getEstDetecteParTypeEquipementNRBC <em>Est Detecte Par Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeEtudeDispersion#getAPourTypeRessourceRessourceActiviteType <em>APour Type Ressource Ressource Activite Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtudeDispersion()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_EtudeDispersion' kind='elementOnly'"
 * @generated
 */
public interface TypeEtudeDispersion extends TypeActivite {
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
	 * @see mpia.schema.SchemaPackage#getTypeEtudeDispersion_GDHreference()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='GDHreference'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHreference();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtudeDispersion#getGDHreference <em>GD Hreference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hreference</em>' attribute.
	 * @see #getGDHreference()
	 * @generated
	 */
	void setGDHreference(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeEtudeDispersion_NatureRejet()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NatureRejet'"
	 * @generated
	 */
	TypeDictionaryDicoNatureRejet getNatureRejet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtudeDispersion#getNatureRejet <em>Nature Rejet</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeEtudeDispersion#getNatureRejet <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureRejet()
	 * @see #getNatureRejet()
	 * @see #setNatureRejet(TypeDictionaryDicoNatureRejet)
	 * @generated
	 */
	void unsetNatureRejet();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtudeDispersion#getNatureRejet <em>Nature Rejet</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>APour Zones Dispersion Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zones Dispersion Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zones Dispersion Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEtudeDispersion_APourZonesDispersionAutreElementControle()
	 * @model containment="true" required="true" upper="50"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZonesDispersion_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZonesDispersionAutreElementControle();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtudeDispersion_EstDetecteParTypeEquipementNRBC()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipementNRBC'"
	 *        extendedMetaData="kind='element' name='EstDetectePar_TypeEquipementNRBC'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstDetecteParTypeEquipementNRBC();

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
	 * @see mpia.schema.SchemaPackage#getTypeEtudeDispersion_APourTypeRessourceRessourceActiviteType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_RessourceActiviteType'"
	 *        extendedMetaData="kind='element' name='APourTypeRessource_RessourceActiviteType'"
	 * @generated
	 */
	EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteType();

} // TypeEtudeDispersion
