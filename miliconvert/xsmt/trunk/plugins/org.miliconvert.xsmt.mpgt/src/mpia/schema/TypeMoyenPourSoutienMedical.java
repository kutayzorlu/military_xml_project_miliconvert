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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Moyen Pour Soutien Medical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyenPourSoutienMedical#getDebutDisponibilite <em>Debut Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenPourSoutienMedical#getFinDisponibilite <em>Fin Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenPourSoutienMedical#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenPourSoutienMedical#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenPourSoutienMedical#getAPourMoyenIdentifieUnite <em>APour Moyen Identifie Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenPourSoutienMedical#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenPourSoutienMedical#getAPourMoyenNonIdentifieQuantiteTypeUnite <em>APour Moyen Non Identifie Quantite Type Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyenPourSoutienMedical()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyenPourSoutienMedical' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyenPourSoutienMedical extends EObject {
	/**
	 * Returns the value of the '<em><b>Debut Disponibilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Disponibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Disponibilite</em>' attribute.
	 * @see #setDebutDisponibilite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenPourSoutienMedical_DebutDisponibilite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutDisponibilite'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenPourSoutienMedical#getDebutDisponibilite <em>Debut Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Disponibilite</em>' attribute.
	 * @see #getDebutDisponibilite()
	 * @generated
	 */
	void setDebutDisponibilite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Disponibilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Disponibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Disponibilite</em>' attribute.
	 * @see #setFinDisponibilite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenPourSoutienMedical_FinDisponibilite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinDisponibilite'"
	 * @generated
	 */
	XMLGregorianCalendar getFinDisponibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenPourSoutienMedical#getFinDisponibilite <em>Fin Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Disponibilite</em>' attribute.
	 * @see #getFinDisponibilite()
	 * @generated
	 */
	void setFinDisponibilite(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyenPourSoutienMedical_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenPourSoutienMedical#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyenPourSoutienMedical_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenPourSoutienMedical#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Moyen Identifie Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyen Identifie Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyen Identifie Unite</em>' containment reference.
	 * @see #setAPourMoyenIdentifieUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenPourSoutienMedical_APourMoyenIdentifieUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourMoyenIdentifie_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourMoyenIdentifieUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenPourSoutienMedical#getAPourMoyenIdentifieUnite <em>APour Moyen Identifie Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Moyen Identifie Unite</em>' containment reference.
	 * @see #getAPourMoyenIdentifieUnite()
	 * @generated
	 */
	void setAPourMoyenIdentifieUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Autre Element Controle</em>' containment reference.
	 * @see #setAPourLocalisationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenPourSoutienMedical_APourLocalisationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLocalisation_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLocalisationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenPourSoutienMedical#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Autre Element Controle</em>' containment reference.
	 * @see #getAPourLocalisationAutreElementControle()
	 * @generated
	 */
	void setAPourLocalisationAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Moyen Non Identifie Quantite Type Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteTypeUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Moyen Non Identifie Quantite Type Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Moyen Non Identifie Quantite Type Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMoyenPourSoutienMedical_APourMoyenNonIdentifieQuantiteTypeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteTypeUnite'"
	 *        extendedMetaData="kind='element' name='APourMoyenNonIdentifie_QuantiteTypeUnite'"
	 * @generated
	 */
	EList<TypeQuantiteTypeUnite> getAPourMoyenNonIdentifieQuantiteTypeUnite();

} // TypeMoyenPourSoutienMedical
