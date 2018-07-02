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
 * A representation of the model object '<em><b>Type Annulation Interdiction Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAnnulationInterdictionTir#getHeureFinInterdictionSurZone <em>Heure Fin Interdiction Sur Zone</em>}</li>
 *   <li>{@link mpia.schema.TypeAnnulationInterdictionTir#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeAnnulationInterdictionTir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAnnulationInterdictionTir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAnnulationInterdictionTir#getReferenceAlerteConflit3D <em>Reference Alerte Conflit3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeAnnulationInterdictionTir#getSeComposeFinInterdiction <em>Se Compose Fin Interdiction</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAnnulationInterdictionTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AnnulationInterdictionTir' kind='elementOnly'"
 * @generated
 */
public interface TypeAnnulationInterdictionTir extends EObject {
	/**
	 * Returns the value of the '<em><b>Heure Fin Interdiction Sur Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Fin Interdiction Sur Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin Interdiction Sur Zone</em>' attribute.
	 * @see #setHeureFinInterdictionSurZone(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationInterdictionTir_HeureFinInterdictionSurZone()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureFinInterdictionSurZone'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureFinInterdictionSurZone();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationInterdictionTir#getHeureFinInterdictionSurZone <em>Heure Fin Interdiction Sur Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin Interdiction Sur Zone</em>' attribute.
	 * @see #getHeureFinInterdictionSurZone()
	 * @generated
	 */
	void setHeureFinInterdictionSurZone(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationInterdictionTir_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationInterdictionTir#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationInterdictionTir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationInterdictionTir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationInterdictionTir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationInterdictionTir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Reference Alerte Conflit3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Alerte Conflit3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Alerte Conflit3 D</em>' containment reference.
	 * @see #setReferenceAlerteConflit3D(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationInterdictionTir_ReferenceAlerteConflit3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Conflit3D'"
	 *        extendedMetaData="kind='element' name='ReferenceAlerte_Conflit3D'"
	 * @generated
	 */
	TypeAssociation getReferenceAlerteConflit3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAnnulationInterdictionTir#getReferenceAlerteConflit3D <em>Reference Alerte Conflit3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Alerte Conflit3 D</em>' containment reference.
	 * @see #getReferenceAlerteConflit3D()
	 * @generated
	 */
	void setReferenceAlerteConflit3D(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Se Compose Fin Interdiction</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeFinInterdiction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Compose Fin Interdiction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Compose Fin Interdiction</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAnnulationInterdictionTir_SeComposeFinInterdiction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_FinInterdiction'"
	 *        extendedMetaData="kind='element' name='SeCompose_FinInterdiction'"
	 * @generated
	 */
	EList<TypeFinInterdiction> getSeComposeFinInterdiction();

} // TypeAnnulationInterdictionTir
