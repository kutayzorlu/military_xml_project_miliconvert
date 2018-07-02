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
 * A representation of the model object '<em><b>Type Priorite Tactique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePrioriteTactique#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypePrioriteTactique#getDebutValidite <em>Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.TypePrioriteTactique#getFinValidite <em>Fin Validite</em>}</li>
 *   <li>{@link mpia.schema.TypePrioriteTactique#getFonctionOperationnelle <em>Fonction Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypePrioriteTactique#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePrioriteTactique#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePrioriteTactique#getAppliquePourHoraireManoeuvre <em>Applique Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypePrioriteTactique#getConcerneUnite <em>Concerne Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PrioriteTactique' kind='elementOnly'"
 * @generated
 */
public interface TypePrioriteTactique extends EObject {
	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique_Priorite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoPriorite getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrioriteTactique#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePrioriteTactique#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePrioriteTactique#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	boolean isSetPriorite();

	/**
	 * Returns the value of the '<em><b>Debut Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Validite</em>' attribute.
	 * @see #setDebutValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique_DebutValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrioriteTactique#getDebutValidite <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Validite</em>' attribute.
	 * @see #getDebutValidite()
	 * @generated
	 */
	void setDebutValidite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Validite</em>' attribute.
	 * @see #setFinValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique_FinValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getFinValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrioriteTactique#getFinValidite <em>Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Validite</em>' attribute.
	 * @see #getFinValidite()
	 * @generated
	 */
	void setFinValidite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fonction Operationnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction Operationnelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction Operationnelle</em>' attribute.
	 * @see #setFonctionOperationnelle(String)
	 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique_FonctionOperationnelle()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='FonctionOperationnelle'"
	 * @generated
	 */
	String getFonctionOperationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrioriteTactique#getFonctionOperationnelle <em>Fonction Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction Operationnelle</em>' attribute.
	 * @see #getFonctionOperationnelle()
	 * @generated
	 */
	void setFonctionOperationnelle(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrioriteTactique#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrioriteTactique#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Applique Pour Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applique Pour Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applique Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #setAppliquePourHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique_AppliquePourHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='AppliquePour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getAppliquePourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrioriteTactique#getAppliquePourHoraireManoeuvre <em>Applique Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applique Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getAppliquePourHoraireManoeuvre()
	 * @generated
	 */
	void setAppliquePourHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Unite</em>' containment reference.
	 * @see #setConcerneUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePrioriteTactique_ConcerneUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='Concerne_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePrioriteTactique#getConcerneUnite <em>Concerne Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Unite</em>' containment reference.
	 * @see #getConcerneUnite()
	 * @generated
	 */
	void setConcerneUnite(TypeAssociationEXT value);

} // TypePrioriteTactique
