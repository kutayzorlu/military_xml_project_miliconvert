/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Directive EMCO Npour Unite ASA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getHeureDebutApplication <em>Heure Debut Application</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getHeureFinApplication <em>Heure Fin Application</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getNiveauEMCON <em>Niveau EMCON</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getModalitesParticulieresEMCON <em>Modalites Particulieres EMCON</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getSAppliqueAuSystemeArmeTypeArme <em>SApplique Au Systeme Arme Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDirectiveEMCONpourUniteASA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DirectiveEMCONpourUniteASA' kind='elementOnly'"
 * @generated
 */
public interface TypeDirectiveEMCONpourUniteASA extends EObject {
	/**
	 * Returns the value of the '<em><b>Heure Debut Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Debut Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Debut Application</em>' attribute.
	 * @see #setHeureDebutApplication(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveEMCONpourUniteASA_HeureDebutApplication()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureDebutApplication'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureDebutApplication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getHeureDebutApplication <em>Heure Debut Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Debut Application</em>' attribute.
	 * @see #getHeureDebutApplication()
	 * @generated
	 */
	void setHeureDebutApplication(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Heure Fin Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Fin Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin Application</em>' attribute.
	 * @see #setHeureFinApplication(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveEMCONpourUniteASA_HeureFinApplication()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureFinApplication'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureFinApplication();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getHeureFinApplication <em>Heure Fin Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin Application</em>' attribute.
	 * @see #getHeureFinApplication()
	 * @generated
	 */
	void setHeureFinApplication(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Niveau EMCON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau EMCON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau EMCON</em>' attribute.
	 * @see #isSetNiveauEMCON()
	 * @see #unsetNiveauEMCON()
	 * @see #setNiveauEMCON(long)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveEMCONpourUniteASA_NiveauEMCON()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NiveauEMCON'"
	 * @generated
	 */
	long getNiveauEMCON();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getNiveauEMCON <em>Niveau EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau EMCON</em>' attribute.
	 * @see #isSetNiveauEMCON()
	 * @see #unsetNiveauEMCON()
	 * @see #getNiveauEMCON()
	 * @generated
	 */
	void setNiveauEMCON(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getNiveauEMCON <em>Niveau EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauEMCON()
	 * @see #getNiveauEMCON()
	 * @see #setNiveauEMCON(long)
	 * @generated
	 */
	void unsetNiveauEMCON();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getNiveauEMCON <em>Niveau EMCON</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau EMCON</em>' attribute is set.
	 * @see #unsetNiveauEMCON()
	 * @see #getNiveauEMCON()
	 * @see #setNiveauEMCON(long)
	 * @generated
	 */
	boolean isSetNiveauEMCON();

	/**
	 * Returns the value of the '<em><b>Modalites Particulieres EMCON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Particulieres EMCON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Particulieres EMCON</em>' attribute.
	 * @see #setModalitesParticulieresEMCON(String)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveEMCONpourUniteASA_ModalitesParticulieresEMCON()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ModalitesParticulieresEMCON'"
	 * @generated
	 */
	String getModalitesParticulieresEMCON();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getModalitesParticulieresEMCON <em>Modalites Particulieres EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Particulieres EMCON</em>' attribute.
	 * @see #getModalitesParticulieresEMCON()
	 * @generated
	 */
	void setModalitesParticulieresEMCON(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveEMCONpourUniteASA_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveEMCONpourUniteASA_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>SApplique Au Systeme Arme Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SApplique Au Systeme Arme Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SApplique Au Systeme Arme Type Arme</em>' containment reference.
	 * @see #setSAppliqueAuSystemeArmeTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveEMCONpourUniteASA_SAppliqueAuSystemeArmeTypeArme()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='SAppliqueAuSystemeArme_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getSAppliqueAuSystemeArmeTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveEMCONpourUniteASA#getSAppliqueAuSystemeArmeTypeArme <em>SApplique Au Systeme Arme Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SApplique Au Systeme Arme Type Arme</em>' containment reference.
	 * @see #getSAppliqueAuSystemeArmeTypeArme()
	 * @generated
	 */
	void setSAppliqueAuSystemeArmeTypeArme(TypeAssociationEXT value);

} // TypeDirectiveEMCONpourUniteASA
