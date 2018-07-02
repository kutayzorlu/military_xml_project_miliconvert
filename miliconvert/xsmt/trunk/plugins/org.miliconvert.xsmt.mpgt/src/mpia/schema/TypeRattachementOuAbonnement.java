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
 * A representation of the model object '<em><b>Type Rattachement Ou Abonnement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getDomaineLogistique <em>Domaine Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getSpecialiteMaintenance2 <em>Specialite Maintenance2</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getSpecialiteMaintenance1 <em>Specialite Maintenance1</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getAPourUniteSoutenueUnite <em>APour Unite Soutenue Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachementOuAbonnement#getAPourZoneRattachementZoneLogistique <em>APour Zone Rattachement Zone Logistique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_RattachementOuAbonnement' kind='elementOnly'"
 * @generated
 */
public interface TypeRattachementOuAbonnement extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getDateDebut <em>Date Debut</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_DateFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_DomaineLogistique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DomaineLogistique'"
	 * @generated
	 */
	TypeDictionaryDicoDomaineLogistique getDomaineLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getDomaineLogistique <em>Domaine Logistique</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getDomaineLogistique <em>Domaine Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomaineLogistique()
	 * @see #getDomaineLogistique()
	 * @see #setDomaineLogistique(TypeDictionaryDicoDomaineLogistique)
	 * @generated
	 */
	void unsetDomaineLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getDomaineLogistique <em>Domaine Logistique</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Specialite Maintenance2</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialite Maintenance2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite Maintenance2</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance
	 * @see #isSetSpecialiteMaintenance2()
	 * @see #unsetSpecialiteMaintenance2()
	 * @see #setSpecialiteMaintenance2(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_SpecialiteMaintenance2()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SpecialiteMaintenance2'"
	 * @generated
	 */
	TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance getSpecialiteMaintenance2();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getSpecialiteMaintenance2 <em>Specialite Maintenance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialite Maintenance2</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance
	 * @see #isSetSpecialiteMaintenance2()
	 * @see #unsetSpecialiteMaintenance2()
	 * @see #getSpecialiteMaintenance2()
	 * @generated
	 */
	void setSpecialiteMaintenance2(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getSpecialiteMaintenance2 <em>Specialite Maintenance2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecialiteMaintenance2()
	 * @see #getSpecialiteMaintenance2()
	 * @see #setSpecialiteMaintenance2(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance)
	 * @generated
	 */
	void unsetSpecialiteMaintenance2();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getSpecialiteMaintenance2 <em>Specialite Maintenance2</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specialite Maintenance2</em>' attribute is set.
	 * @see #unsetSpecialiteMaintenance2()
	 * @see #getSpecialiteMaintenance2()
	 * @see #setSpecialiteMaintenance2(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance)
	 * @generated
	 */
	boolean isSetSpecialiteMaintenance2();

	/**
	 * Returns the value of the '<em><b>Specialite Maintenance1</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialite Maintenance1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite Maintenance1</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance
	 * @see #isSetSpecialiteMaintenance1()
	 * @see #unsetSpecialiteMaintenance1()
	 * @see #setSpecialiteMaintenance1(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_SpecialiteMaintenance1()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SpecialiteMaintenance1'"
	 * @generated
	 */
	TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance getSpecialiteMaintenance1();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getSpecialiteMaintenance1 <em>Specialite Maintenance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialite Maintenance1</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance
	 * @see #isSetSpecialiteMaintenance1()
	 * @see #unsetSpecialiteMaintenance1()
	 * @see #getSpecialiteMaintenance1()
	 * @generated
	 */
	void setSpecialiteMaintenance1(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getSpecialiteMaintenance1 <em>Specialite Maintenance1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecialiteMaintenance1()
	 * @see #getSpecialiteMaintenance1()
	 * @see #setSpecialiteMaintenance1(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance)
	 * @generated
	 */
	void unsetSpecialiteMaintenance1();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getSpecialiteMaintenance1 <em>Specialite Maintenance1</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specialite Maintenance1</em>' attribute is set.
	 * @see #unsetSpecialiteMaintenance1()
	 * @see #getSpecialiteMaintenance1()
	 * @see #setSpecialiteMaintenance1(TypeDictionaryDicoRattachementOuAbonnementSpecialiteMaintenance)
	 * @generated
	 */
	boolean isSetSpecialiteMaintenance1();

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Soutenue Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Soutenue Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Soutenue Unite</em>' containment reference.
	 * @see #setAPourUniteSoutenueUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_APourUniteSoutenueUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteSoutenue_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteSoutenueUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getAPourUniteSoutenueUnite <em>APour Unite Soutenue Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Soutenue Unite</em>' containment reference.
	 * @see #getAPourUniteSoutenueUnite()
	 * @generated
	 */
	void setAPourUniteSoutenueUnite(TypeAssociationEXT value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRattachementOuAbonnement_APourZoneRattachementZoneLogistique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ZoneLogistique'"
	 *        extendedMetaData="kind='element' name='APourZoneRattachement_ZoneLogistique'"
	 * @generated
	 */
	TypeAssociation getAPourZoneRattachementZoneLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachementOuAbonnement#getAPourZoneRattachementZoneLogistique <em>APour Zone Rattachement Zone Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Rattachement Zone Logistique</em>' containment reference.
	 * @see #getAPourZoneRattachementZoneLogistique()
	 * @generated
	 */
	void setAPourZoneRattachementZoneLogistique(TypeAssociation value);

} // TypeRattachementOuAbonnement
