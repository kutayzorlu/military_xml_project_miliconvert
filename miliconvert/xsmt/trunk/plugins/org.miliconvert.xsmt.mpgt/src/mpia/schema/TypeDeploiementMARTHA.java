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
 * A representation of the model object '<em><b>Type Deploiement MARTHA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDeploiementMARTHA#getDeploiementARealiser <em>Deploiement ARealiser</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMARTHA#getNombreNC23disponibles <em>Nombre NC2 3disponibles</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMARTHA#getHeureDebutActivite <em>Heure Debut Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMARTHA#getHeureFinActivite <em>Heure Fin Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMARTHA#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMARTHA#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMARTHA#getConcerneZoneGlobaleAutreElementControle <em>Concerne Zone Globale Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeDeploiementMARTHA#getConcerneCentresNC23Unite <em>Concerne Centres NC23 Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DeploiementMARTHA' kind='elementOnly'"
 * @generated
 */
public interface TypeDeploiementMARTHA extends EObject {
	/**
	 * Returns the value of the '<em><b>Deploiement ARealiser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploiement ARealiser</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploiement ARealiser</em>' attribute.
	 * @see #setDeploiementARealiser(String)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA_DeploiementARealiser()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='DeploiementARealiser'"
	 * @generated
	 */
	String getDeploiementARealiser();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getDeploiementARealiser <em>Deploiement ARealiser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploiement ARealiser</em>' attribute.
	 * @see #getDeploiementARealiser()
	 * @generated
	 */
	void setDeploiementARealiser(String value);

	/**
	 * Returns the value of the '<em><b>Nombre NC2 3disponibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre NC2 3disponibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre NC2 3disponibles</em>' attribute.
	 * @see #isSetNombreNC23disponibles()
	 * @see #unsetNombreNC23disponibles()
	 * @see #setNombreNC23disponibles(long)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA_NombreNC23disponibles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NombreNC23disponibles'"
	 * @generated
	 */
	long getNombreNC23disponibles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getNombreNC23disponibles <em>Nombre NC2 3disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre NC2 3disponibles</em>' attribute.
	 * @see #isSetNombreNC23disponibles()
	 * @see #unsetNombreNC23disponibles()
	 * @see #getNombreNC23disponibles()
	 * @generated
	 */
	void setNombreNC23disponibles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getNombreNC23disponibles <em>Nombre NC2 3disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreNC23disponibles()
	 * @see #getNombreNC23disponibles()
	 * @see #setNombreNC23disponibles(long)
	 * @generated
	 */
	void unsetNombreNC23disponibles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getNombreNC23disponibles <em>Nombre NC2 3disponibles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre NC2 3disponibles</em>' attribute is set.
	 * @see #unsetNombreNC23disponibles()
	 * @see #getNombreNC23disponibles()
	 * @see #setNombreNC23disponibles(long)
	 * @generated
	 */
	boolean isSetNombreNC23disponibles();

	/**
	 * Returns the value of the '<em><b>Heure Debut Activite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Debut Activite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Debut Activite</em>' attribute.
	 * @see #setHeureDebutActivite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA_HeureDebutActivite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureDebutActivite'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureDebutActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getHeureDebutActivite <em>Heure Debut Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Debut Activite</em>' attribute.
	 * @see #getHeureDebutActivite()
	 * @generated
	 */
	void setHeureDebutActivite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Heure Fin Activite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Fin Activite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin Activite</em>' attribute.
	 * @see #setHeureFinActivite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA_HeureFinActivite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureFinActivite'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureFinActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getHeureFinActivite <em>Heure Fin Activite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin Activite</em>' attribute.
	 * @see #getHeureFinActivite()
	 * @generated
	 */
	void setHeureFinActivite(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Zone Globale Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Zone Globale Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Zone Globale Autre Element Controle</em>' containment reference.
	 * @see #setConcerneZoneGlobaleAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA_ConcerneZoneGlobaleAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ConcerneZoneGlobale_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getConcerneZoneGlobaleAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeploiementMARTHA#getConcerneZoneGlobaleAutreElementControle <em>Concerne Zone Globale Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Zone Globale Autre Element Controle</em>' containment reference.
	 * @see #getConcerneZoneGlobaleAutreElementControle()
	 * @generated
	 */
	void setConcerneZoneGlobaleAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Centres NC23 Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Centres NC23 Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Centres NC23 Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDeploiementMARTHA_ConcerneCentresNC23Unite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ConcerneCentresNC23_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getConcerneCentresNC23Unite();

} // TypeDeploiementMARTHA
