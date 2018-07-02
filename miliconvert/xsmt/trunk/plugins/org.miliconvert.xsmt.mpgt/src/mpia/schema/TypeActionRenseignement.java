/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Action Renseignement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeActionRenseignement#getHeurePremiereFourniture <em>Heure Premiere Fourniture</em>}</li>
 *   <li>{@link mpia.schema.TypeActionRenseignement#getHeureLimiteFourniture <em>Heure Limite Fourniture</em>}</li>
 *   <li>{@link mpia.schema.TypeActionRenseignement#getPeriodicite <em>Periodicite</em>}</li>
 *   <li>{@link mpia.schema.TypeActionRenseignement#getACommeFaitRechercheFaitRenseignement <em>AComme Fait Recherche Fait Renseignement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeActionRenseignement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ActionRenseignement' kind='elementOnly'"
 * @generated
 */
public interface TypeActionRenseignement extends TypeAction {
	/**
	 * Returns the value of the '<em><b>Heure Premiere Fourniture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Premiere Fourniture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Premiere Fourniture</em>' attribute.
	 * @see #setHeurePremiereFourniture(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeActionRenseignement_HeurePremiereFourniture()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeurePremiereFourniture'"
	 * @generated
	 */
	XMLGregorianCalendar getHeurePremiereFourniture();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionRenseignement#getHeurePremiereFourniture <em>Heure Premiere Fourniture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Premiere Fourniture</em>' attribute.
	 * @see #getHeurePremiereFourniture()
	 * @generated
	 */
	void setHeurePremiereFourniture(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Heure Limite Fourniture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure Limite Fourniture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Limite Fourniture</em>' attribute.
	 * @see #setHeureLimiteFourniture(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeActionRenseignement_HeureLimiteFourniture()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureLimiteFourniture'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureLimiteFourniture();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionRenseignement#getHeureLimiteFourniture <em>Heure Limite Fourniture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Limite Fourniture</em>' attribute.
	 * @see #getHeureLimiteFourniture()
	 * @generated
	 */
	void setHeureLimiteFourniture(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Periodicite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicite</em>' containment reference.
	 * @see #setPeriodicite(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeActionRenseignement_Periodicite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Periodicite'"
	 * @generated
	 */
	TypeDataTypeDuree getPeriodicite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionRenseignement#getPeriodicite <em>Periodicite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicite</em>' containment reference.
	 * @see #getPeriodicite()
	 * @generated
	 */
	void setPeriodicite(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>AComme Fait Recherche Fait Renseignement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Fait Recherche Fait Renseignement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Fait Recherche Fait Renseignement</em>' containment reference.
	 * @see #setACommeFaitRechercheFaitRenseignement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeActionRenseignement_ACommeFaitRechercheFaitRenseignement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_FaitRenseignement'"
	 *        extendedMetaData="kind='element' name='ACommeFaitRecherche_FaitRenseignement'"
	 * @generated
	 */
	TypeAssociation getACommeFaitRechercheFaitRenseignement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeActionRenseignement#getACommeFaitRechercheFaitRenseignement <em>AComme Fait Recherche Fait Renseignement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Fait Recherche Fait Renseignement</em>' containment reference.
	 * @see #getACommeFaitRechercheFaitRenseignement()
	 * @generated
	 */
	void setACommeFaitRechercheFaitRenseignement(TypeAssociation value);

} // TypeActionRenseignement
