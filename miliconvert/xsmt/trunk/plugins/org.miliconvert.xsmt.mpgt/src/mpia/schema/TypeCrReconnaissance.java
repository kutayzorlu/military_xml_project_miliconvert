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
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Cr Reconnaissance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getDateCR <em>Date CR</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getCompteRendu <em>Compte Rendu</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#isCapaciteTravaux <em>Capacite Travaux</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getDelai <em>Delai</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getDateFinReconnaissance <em>Date Fin Reconnaissance</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getNecessiteMoyenTypeMoyenManquant <em>Necessite Moyen Type Moyen Manquant</em>}</li>
 *   <li>{@link mpia.schema.TypeCrReconnaissance#getAPourZonesReconnuesAutreElementControle <em>APour Zones Reconnues Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CrReconnaissance' kind='elementOnly'"
 * @generated
 */
public interface TypeCrReconnaissance extends EObject {
	/**
	 * Returns the value of the '<em><b>Date CR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date CR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date CR</em>' attribute.
	 * @see #setDateCR(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_DateCR()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateCR'"
	 * @generated
	 */
	XMLGregorianCalendar getDateCR();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrReconnaissance#getDateCR <em>Date CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date CR</em>' attribute.
	 * @see #getDateCR()
	 * @generated
	 */
	void setDateCR(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Compte Rendu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compte Rendu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compte Rendu</em>' attribute.
	 * @see #setCompteRendu(String)
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_CompteRendu()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='CompteRendu'"
	 * @generated
	 */
	String getCompteRendu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrReconnaissance#getCompteRendu <em>Compte Rendu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compte Rendu</em>' attribute.
	 * @see #getCompteRendu()
	 * @generated
	 */
	void setCompteRendu(String value);

	/**
	 * Returns the value of the '<em><b>Capacite Travaux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Travaux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Travaux</em>' attribute.
	 * @see #isSetCapaciteTravaux()
	 * @see #unsetCapaciteTravaux()
	 * @see #setCapaciteTravaux(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_CapaciteTravaux()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='CapaciteTravaux'"
	 * @generated
	 */
	boolean isCapaciteTravaux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrReconnaissance#isCapaciteTravaux <em>Capacite Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Travaux</em>' attribute.
	 * @see #isSetCapaciteTravaux()
	 * @see #unsetCapaciteTravaux()
	 * @see #isCapaciteTravaux()
	 * @generated
	 */
	void setCapaciteTravaux(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCrReconnaissance#isCapaciteTravaux <em>Capacite Travaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteTravaux()
	 * @see #isCapaciteTravaux()
	 * @see #setCapaciteTravaux(boolean)
	 * @generated
	 */
	void unsetCapaciteTravaux();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCrReconnaissance#isCapaciteTravaux <em>Capacite Travaux</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Travaux</em>' attribute is set.
	 * @see #unsetCapaciteTravaux()
	 * @see #isCapaciteTravaux()
	 * @see #setCapaciteTravaux(boolean)
	 * @generated
	 */
	boolean isSetCapaciteTravaux();

	/**
	 * Returns the value of the '<em><b>Delai</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delai</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delai</em>' containment reference.
	 * @see #setDelai(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_Delai()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Delai'"
	 * @generated
	 */
	TypeDataTypeDuree getDelai();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrReconnaissance#getDelai <em>Delai</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delai</em>' containment reference.
	 * @see #getDelai()
	 * @generated
	 */
	void setDelai(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Date Fin Reconnaissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin Reconnaissance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin Reconnaissance</em>' attribute.
	 * @see #setDateFinReconnaissance(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_DateFinReconnaissance()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFinReconnaissance'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFinReconnaissance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrReconnaissance#getDateFinReconnaissance <em>Date Fin Reconnaissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin Reconnaissance</em>' attribute.
	 * @see #getDateFinReconnaissance()
	 * @generated
	 */
	void setDateFinReconnaissance(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrReconnaissance#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrReconnaissance#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Rendant Compte Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Rendant Compte Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #setAPourUniteRendantCompteUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_APourUniteRendantCompteUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRendantCompte_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRendantCompteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCrReconnaissance#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 */
	void setAPourUniteRendantCompteUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Necessite Moyen Type Moyen Manquant</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeMoyenManquant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Necessite Moyen Type Moyen Manquant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Necessite Moyen Type Moyen Manquant</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_NecessiteMoyenTypeMoyenManquant()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeMoyenManquant'"
	 *        extendedMetaData="kind='element' name='NecessiteMoyen_TypeMoyenManquant'"
	 * @generated
	 */
	EList<TypeTypeMoyenManquant> getNecessiteMoyenTypeMoyenManquant();

	/**
	 * Returns the value of the '<em><b>APour Zones Reconnues Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zones Reconnues Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zones Reconnues Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCrReconnaissance_APourZonesReconnuesAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZonesReconnues_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourZonesReconnuesAutreElementControle();

} // TypeCrReconnaissance
