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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Rattachement Logistique Particulier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getDomaineLogistique <em>Domaine Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getVautPendantHoraireManoeuvre <em>Vaut Pendant Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getAPourUniteRattacheeUnite <em>APour Unite Rattachee Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getAPourUniteRattachementUnite <em>APour Unite Rattachement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementLogistiqueParticulier#getAPourZoneRattachementZoneLogistique <em>APour Zone Rattachement Zone Logistique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_RattachementLogistiqueParticulier' kind='elementOnly'"
 * @generated
 */
public interface TypeRattachementLogistiqueParticulier extends EObject {
	/**
	 * Returns the value of the '<em><b>Domaine Logistique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDomaineLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domaine Logistique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDomaineLogistique
	 * @see #isSetDomaineLogistique()
	 * @see #unsetDomaineLogistique()
	 * @see #setDomaineLogistique(TypeDictionaryDicoDomaineLogistique)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_DomaineLogistique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DomaineLogistique'"
	 * @generated
	 */
	TypeDictionaryDicoDomaineLogistique getDomaineLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getDomaineLogistique <em>Domaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDomaineLogistique
	 * @see #isSetDomaineLogistique()
	 * @see #unsetDomaineLogistique()
	 * @see #getDomaineLogistique()
	 * @generated
	 */
	void setDomaineLogistique(TypeDictionaryDicoDomaineLogistique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getDomaineLogistique <em>Domaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomaineLogistique()
	 * @see #getDomaineLogistique()
	 * @see #setDomaineLogistique(TypeDictionaryDicoDomaineLogistique)
	 * @generated
	 */
	void unsetDomaineLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getDomaineLogistique <em>Domaine Logistique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Domaine Logistique</em>' attribute is set.
	 * @see #unsetDomaineLogistique()
	 * @see #getDomaineLogistique()
	 * @see #setDomaineLogistique(TypeDictionaryDicoDomaineLogistique)
	 * @generated
	 */
	boolean isSetDomaineLogistique();

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_DateFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Vaut Pendant Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pendant Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pendant Horaire Manoeuvre</em>' containment reference.
	 * @see #setVautPendantHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_VautPendantHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='VautPendant_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getVautPendantHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getVautPendantHoraireManoeuvre <em>Vaut Pendant Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pendant Horaire Manoeuvre</em>' containment reference.
	 * @see #getVautPendantHoraireManoeuvre()
	 * @generated
	 */
	void setVautPendantHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Unite Rattachee Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Rattachee Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Rattachee Unite</em>' containment reference.
	 * @see #setAPourUniteRattacheeUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_APourUniteRattacheeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRattachee_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRattacheeUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getAPourUniteRattacheeUnite <em>APour Unite Rattachee Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rattachee Unite</em>' containment reference.
	 * @see #getAPourUniteRattacheeUnite()
	 * @generated
	 */
	void setAPourUniteRattacheeUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Rattachement Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Rattachement Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Rattachement Unite</em>' containment reference.
	 * @see #setAPourUniteRattachementUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_APourUniteRattachementUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRattachement_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRattachementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getAPourUniteRattachementUnite <em>APour Unite Rattachement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rattachement Unite</em>' containment reference.
	 * @see #getAPourUniteRattachementUnite()
	 * @generated
	 */
	void setAPourUniteRattachementUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Zone Rattachement Zone Logistique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Rattachement Zone Logistique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Rattachement Zone Logistique</em>' containment reference.
	 * @see #setAPourZoneRattachementZoneLogistique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementLogistiqueParticulier_APourZoneRattachementZoneLogistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ZoneLogistique'"
	 *        extendedMetaData="kind='element' name='APourZoneRattachement_ZoneLogistique'"
	 * @generated
	 */
	TypeAssociation getAPourZoneRattachementZoneLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementLogistiqueParticulier#getAPourZoneRattachementZoneLogistique <em>APour Zone Rattachement Zone Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Rattachement Zone Logistique</em>' containment reference.
	 * @see #getAPourZoneRattachementZoneLogistique()
	 * @generated
	 */
	void setAPourZoneRattachementZoneLogistique(TypeAssociation value);

} // TypeRattachementLogistiqueParticulier
