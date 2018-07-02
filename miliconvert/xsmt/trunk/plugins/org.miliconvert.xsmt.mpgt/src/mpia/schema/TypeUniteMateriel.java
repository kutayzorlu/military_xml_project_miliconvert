/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Unite Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeUniteMateriel#getDebut <em>Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteMateriel#getFin <em>Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteMateriel#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteMateriel#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteMateriel#getAPourUniteMeoMaterielUnite <em>APour Unite Meo Materiel Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeUniteMateriel#getACommeSpecialiteSpecialiteMaintenanceOuDepannage <em>AComme Specialite Specialite Maintenance Ou Depannage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeUniteMateriel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_UniteMateriel' kind='elementOnly'"
 * @generated
 */
public interface TypeUniteMateriel extends EObject {
	/**
	 * Returns the value of the '<em><b>Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' attribute.
	 * @see #setDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeUniteMateriel_Debut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='Debut'"
	 * @generated
	 */
	XMLGregorianCalendar getDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteMateriel#getDebut <em>Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' attribute.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' attribute.
	 * @see #setFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeUniteMateriel_Fin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='Fin'"
	 * @generated
	 */
	XMLGregorianCalendar getFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteMateriel#getFin <em>Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' attribute.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>CTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTE</em>' attribute.
	 * @see #setCTE(String)
	 * @see mpia.schema.SchemaPackage#getTypeUniteMateriel_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteMateriel#getCTE <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTE</em>' attribute.
	 * @see #getCTE()
	 * @generated
	 */
	void setCTE(String value);

	/**
	 * Returns the value of the '<em><b>CE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CE</em>' attribute.
	 * @see #setCE(String)
	 * @see mpia.schema.SchemaPackage#getTypeUniteMateriel_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteMateriel#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Meo Materiel Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Meo Materiel Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Meo Materiel Unite</em>' containment reference.
	 * @see #setAPourUniteMeoMaterielUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeUniteMateriel_APourUniteMeoMaterielUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteMeoMateriel_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteMeoMaterielUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeUniteMateriel#getAPourUniteMeoMaterielUnite <em>APour Unite Meo Materiel Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Meo Materiel Unite</em>' containment reference.
	 * @see #getAPourUniteMeoMaterielUnite()
	 * @generated
	 */
	void setAPourUniteMeoMaterielUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Specialite Specialite Maintenance Ou Depannage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeSpecialiteMaintenanceOuDepannage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Specialite Specialite Maintenance Ou Depannage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Specialite Specialite Maintenance Ou Depannage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeUniteMateriel_ACommeSpecialiteSpecialiteMaintenanceOuDepannage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_SpecialiteMaintenanceOuDepannage'"
	 *        extendedMetaData="kind='element' name='ACommeSpecialite_SpecialiteMaintenanceOuDepannage'"
	 * @generated
	 */
	EList<TypeSpecialiteMaintenanceOuDepannage> getACommeSpecialiteSpecialiteMaintenanceOuDepannage();

} // TypeUniteMateriel
