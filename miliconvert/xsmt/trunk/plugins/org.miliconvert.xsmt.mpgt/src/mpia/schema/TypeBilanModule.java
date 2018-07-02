/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Bilan Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBilanModule#getNbAppareilsArrives <em>Nb Appareils Arrives</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getGDHdecollage <em>GD Hdecollage</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getGDHatterrissage <em>GD Hatterrissage</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getMotifNonDecollage <em>Motif Non Decollage</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getComplements <em>Complements</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getConcerneModule <em>Concerne Module</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getADecolleAutreElementControle <em>ADecolle Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeBilanModule#getAAtterriEnAutreElementControle <em>AAtterri En Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBilanModule()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_BilanModule' kind='elementOnly'"
 * @generated
 */
public interface TypeBilanModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Nb Appareils Arrives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Appareils Arrives</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Appareils Arrives</em>' attribute.
	 * @see #isSetNbAppareilsArrives()
	 * @see #unsetNbAppareilsArrives()
	 * @see #setNbAppareilsArrives(long)
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_NbAppareilsArrives()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NbAppareilsArrives'"
	 * @generated
	 */
	long getNbAppareilsArrives();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getNbAppareilsArrives <em>Nb Appareils Arrives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Appareils Arrives</em>' attribute.
	 * @see #isSetNbAppareilsArrives()
	 * @see #unsetNbAppareilsArrives()
	 * @see #getNbAppareilsArrives()
	 * @generated
	 */
	void setNbAppareilsArrives(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBilanModule#getNbAppareilsArrives <em>Nb Appareils Arrives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbAppareilsArrives()
	 * @see #getNbAppareilsArrives()
	 * @see #setNbAppareilsArrives(long)
	 * @generated
	 */
	void unsetNbAppareilsArrives();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBilanModule#getNbAppareilsArrives <em>Nb Appareils Arrives</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Appareils Arrives</em>' attribute is set.
	 * @see #unsetNbAppareilsArrives()
	 * @see #getNbAppareilsArrives()
	 * @see #setNbAppareilsArrives(long)
	 * @generated
	 */
	boolean isSetNbAppareilsArrives();

	/**
	 * Returns the value of the '<em><b>GD Hdecollage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hdecollage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hdecollage</em>' attribute.
	 * @see #setGDHdecollage(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_GDHdecollage()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHdecollage'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdecollage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getGDHdecollage <em>GD Hdecollage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hdecollage</em>' attribute.
	 * @see #getGDHdecollage()
	 * @generated
	 */
	void setGDHdecollage(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hatterrissage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hatterrissage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hatterrissage</em>' attribute.
	 * @see #setGDHatterrissage(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_GDHatterrissage()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHatterrissage'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHatterrissage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getGDHatterrissage <em>GD Hatterrissage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hatterrissage</em>' attribute.
	 * @see #getGDHatterrissage()
	 * @generated
	 */
	void setGDHatterrissage(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Motif Non Decollage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motif Non Decollage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motif Non Decollage</em>' attribute.
	 * @see #setMotifNonDecollage(String)
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_MotifNonDecollage()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MotifNonDecollage'"
	 * @generated
	 */
	String getMotifNonDecollage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getMotifNonDecollage <em>Motif Non Decollage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motif Non Decollage</em>' attribute.
	 * @see #getMotifNonDecollage()
	 * @generated
	 */
	void setMotifNonDecollage(String value);

	/**
	 * Returns the value of the '<em><b>Complements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complements</em>' attribute.
	 * @see #setComplements(String)
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_Complements()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Complements'"
	 * @generated
	 */
	String getComplements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getComplements <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complements</em>' attribute.
	 * @see #getComplements()
	 * @generated
	 */
	void setComplements(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Module</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Module</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Module</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_ConcerneModule()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Module'"
	 *        extendedMetaData="kind='element' name='Concerne_Module'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneModule();

	/**
	 * Returns the value of the '<em><b>ADecolle Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADecolle Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADecolle Autre Element Controle</em>' containment reference.
	 * @see #setADecolleAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_ADecolleAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ADecolle_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getADecolleAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getADecolleAutreElementControle <em>ADecolle Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADecolle Autre Element Controle</em>' containment reference.
	 * @see #getADecolleAutreElementControle()
	 * @generated
	 */
	void setADecolleAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AAtterri En Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AAtterri En Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AAtterri En Autre Element Controle</em>' containment reference.
	 * @see #setAAtterriEnAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeBilanModule_AAtterriEnAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='AAtterriEn_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAAtterriEnAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBilanModule#getAAtterriEnAutreElementControle <em>AAtterri En Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AAtterri En Autre Element Controle</em>' containment reference.
	 * @see #getAAtterriEnAutreElementControle()
	 * @generated
	 */
	void setAAtterriEnAutreElementControle(TypeAssociation value);

} // TypeBilanModule
