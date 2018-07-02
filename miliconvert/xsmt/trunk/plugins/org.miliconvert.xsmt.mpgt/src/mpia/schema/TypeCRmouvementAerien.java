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
 * A representation of the model object '<em><b>Type CRmouvement Aerien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getGDHredaction <em>GD Hredaction</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getAEteEmisParUnite <em>AEte Emis Par Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getRendCompteBilansModulesBilanModule <em>Rend Compte Bilans Modules Bilan Module</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getRendComptePotentielsAeronefPotentielAeronef <em>Rend Compte Potentiels Aeronef Potentiel Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getAutonomieModuleAutonomieModule <em>Autonomie Module Autonomie Module</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getPassageModulePassageModule <em>Passage Module Passage Module</em>}</li>
 *   <li>{@link mpia.schema.TypeCRmouvementAerien#getRendCompteDecollageBilanModule <em>Rend Compte Decollage Bilan Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CRmouvementAerien' kind='elementOnly'"
 * @generated
 */
public interface TypeCRmouvementAerien extends EObject {
	/**
	 * Returns the value of the '<em><b>GD Hredaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hredaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hredaction</em>' attribute.
	 * @see #setGDHredaction(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_GDHredaction()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='GDHredaction'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHredaction();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRmouvementAerien#getGDHredaction <em>GD Hredaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hredaction</em>' attribute.
	 * @see #getGDHredaction()
	 * @generated
	 */
	void setGDHredaction(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRmouvementAerien#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRmouvementAerien#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRmouvementAerien#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AEte Emis Par Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AEte Emis Par Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEte Emis Par Unite</em>' containment reference.
	 * @see #setAEteEmisParUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_AEteEmisParUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='AEteEmisPar_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAEteEmisParUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRmouvementAerien#getAEteEmisParUnite <em>AEte Emis Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEte Emis Par Unite</em>' containment reference.
	 * @see #getAEteEmisParUnite()
	 * @generated
	 */
	void setAEteEmisParUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Rend Compte Bilans Modules Bilan Module</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeBilanModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rend Compte Bilans Modules Bilan Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rend Compte Bilans Modules Bilan Module</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_RendCompteBilansModulesBilanModule()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BilanModule'"
	 *        extendedMetaData="kind='element' name='RendCompteBilansModules_BilanModule'"
	 * @generated
	 */
	EList<TypeBilanModule> getRendCompteBilansModulesBilanModule();

	/**
	 * Returns the value of the '<em><b>Rend Compte Potentiels Aeronef Potentiel Aeronef</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePotentielAeronef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rend Compte Potentiels Aeronef Potentiel Aeronef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rend Compte Potentiels Aeronef Potentiel Aeronef</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_RendComptePotentielsAeronefPotentielAeronef()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PotentielAeronef'"
	 *        extendedMetaData="kind='element' name='RendComptePotentielsAeronef_PotentielAeronef'"
	 * @generated
	 */
	EList<TypePotentielAeronef> getRendComptePotentielsAeronefPotentielAeronef();

	/**
	 * Returns the value of the '<em><b>Autonomie Module Autonomie Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autonomie Module Autonomie Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autonomie Module Autonomie Module</em>' containment reference.
	 * @see #setAutonomieModuleAutonomieModule(TypeAutonomieModule)
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_AutonomieModuleAutonomieModule()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AutonomieModule'"
	 *        extendedMetaData="kind='element' name='AutonomieModule_AutonomieModule'"
	 * @generated
	 */
	TypeAutonomieModule getAutonomieModuleAutonomieModule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRmouvementAerien#getAutonomieModuleAutonomieModule <em>Autonomie Module Autonomie Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autonomie Module Autonomie Module</em>' containment reference.
	 * @see #getAutonomieModuleAutonomieModule()
	 * @generated
	 */
	void setAutonomieModuleAutonomieModule(TypeAutonomieModule value);

	/**
	 * Returns the value of the '<em><b>Passage Module Passage Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passage Module Passage Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passage Module Passage Module</em>' containment reference.
	 * @see #setPassageModulePassageModule(TypePassageModule)
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_PassageModulePassageModule()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PassageModule'"
	 *        extendedMetaData="kind='element' name='PassageModule_PassageModule'"
	 * @generated
	 */
	TypePassageModule getPassageModulePassageModule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRmouvementAerien#getPassageModulePassageModule <em>Passage Module Passage Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passage Module Passage Module</em>' containment reference.
	 * @see #getPassageModulePassageModule()
	 * @generated
	 */
	void setPassageModulePassageModule(TypePassageModule value);

	/**
	 * Returns the value of the '<em><b>Rend Compte Decollage Bilan Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rend Compte Decollage Bilan Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rend Compte Decollage Bilan Module</em>' containment reference.
	 * @see #setRendCompteDecollageBilanModule(TypeBilanModule)
	 * @see mpia.schema.SchemaPackage#getTypeCRmouvementAerien_RendCompteDecollageBilanModule()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_BilanModule'"
	 *        extendedMetaData="kind='element' name='RendCompteDecollage_BilanModule'"
	 * @generated
	 */
	TypeBilanModule getRendCompteDecollageBilanModule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRmouvementAerien#getRendCompteDecollageBilanModule <em>Rend Compte Decollage Bilan Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rend Compte Decollage Bilan Module</em>' containment reference.
	 * @see #getRendCompteDecollageBilanModule()
	 * @generated
	 */
	void setRendCompteDecollageBilanModule(TypeBilanModule value);

} // TypeCRmouvementAerien
