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
 * A representation of the model object '<em><b>Type Rattachement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRattachement#getDateDeDebut <em>Date De Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachement#getDateDeFin <em>Date De Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachement#getDefinitPourHoraireManoeuvre <em>Definit Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachement#getAPourUniteRattachementUnite <em>APour Unite Rattachement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeRattachement#getAPourUniteConcerneUnite <em>APour Unite Concerne Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRattachement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Rattachement' kind='elementOnly'"
 * @generated
 */
public interface TypeRattachement extends EObject {
	/**
	 * Returns the value of the '<em><b>Date De Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date De Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date De Debut</em>' attribute.
	 * @see #setDateDeDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeRattachement_DateDeDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDeDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachement#getDateDeDebut <em>Date De Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Debut</em>' attribute.
	 * @see #getDateDeDebut()
	 * @generated
	 */
	void setDateDeDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date De Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date De Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date De Fin</em>' attribute.
	 * @see #setDateDeFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeRattachement_DateDeFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDeFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDeFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachement#getDateDeFin <em>Date De Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date De Fin</em>' attribute.
	 * @see #getDateDeFin()
	 * @generated
	 */
	void setDateDeFin(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRattachement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRattachement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Definit Pour Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definit Pour Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definit Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #setDefinitPourHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRattachement_DefinitPourHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='DefinitPour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getDefinitPourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachement#getDefinitPourHoraireManoeuvre <em>Definit Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definit Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getDefinitPourHoraireManoeuvre()
	 * @generated
	 */
	void setDefinitPourHoraireManoeuvre(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRattachement_APourUniteRattachementUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRattachement_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRattachementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRattachement#getAPourUniteRattachementUnite <em>APour Unite Rattachement Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rattachement Unite</em>' containment reference.
	 * @see #getAPourUniteRattachementUnite()
	 * @generated
	 */
	void setAPourUniteRattachementUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Concerne Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Concerne Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Concerne Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRattachement_APourUniteConcerneUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteConcerne_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUniteConcerneUnite();

} // TypeRattachement
