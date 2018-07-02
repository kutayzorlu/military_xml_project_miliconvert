/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Priorite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePriorite#getTypePriorite <em>Type Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypePriorite#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypePriorite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePriorite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePriorite#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypePriorite#getConcerneUniteUnite <em>Concerne Unite Unite</em>}</li>
 *   <li>{@link mpia.schema.TypePriorite#getDefinitPourHoraireManoeuvre <em>Definit Pour Horaire Manoeuvre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePriorite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Priorite' kind='elementOnly'"
 * @generated
 */
public interface TypePriorite extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrioriteTypePriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrioriteTypePriorite
	 * @see #isSetTypePriorite()
	 * @see #unsetTypePriorite()
	 * @see #setTypePriorite(TypeDictionaryDicoPrioriteTypePriorite)
	 * @see mpia.schema.SchemaPackage#getTypePriorite_TypePriorite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypePriorite'"
	 * @generated
	 */
	TypeDictionaryDicoPrioriteTypePriorite getTypePriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePriorite#getTypePriorite <em>Type Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrioriteTypePriorite
	 * @see #isSetTypePriorite()
	 * @see #unsetTypePriorite()
	 * @see #getTypePriorite()
	 * @generated
	 */
	void setTypePriorite(TypeDictionaryDicoPrioriteTypePriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePriorite#getTypePriorite <em>Type Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePriorite()
	 * @see #getTypePriorite()
	 * @see #setTypePriorite(TypeDictionaryDicoPrioriteTypePriorite)
	 * @generated
	 */
	void unsetTypePriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePriorite#getTypePriorite <em>Type Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Priorite</em>' attribute is set.
	 * @see #unsetTypePriorite()
	 * @see #getTypePriorite()
	 * @see #setTypePriorite(TypeDictionaryDicoPrioriteTypePriorite)
	 * @generated
	 */
	boolean isSetTypePriorite();

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
	 * @see mpia.schema.SchemaPackage#getTypePriorite_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePriorite#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePriorite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePriorite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePriorite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePriorite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Ressource Type Consommable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Ressource Type Consommable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Ressource Type Consommable</em>' containment reference.
	 * @see #setConcerneTypeRessourceTypeConsommable(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePriorite_ConcerneTypeRessourceTypeConsommable()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeConsommable'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeRessource_TypeConsommable'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeRessourceTypeConsommable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePriorite#getConcerneTypeRessourceTypeConsommable <em>Concerne Type Ressource Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Ressource Type Consommable</em>' containment reference.
	 * @see #getConcerneTypeRessourceTypeConsommable()
	 * @generated
	 */
	void setConcerneTypeRessourceTypeConsommable(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Unite Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Unite Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Unite Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePriorite_ConcerneUniteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ConcerneUnite_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getConcerneUniteUnite();

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
	 * @see mpia.schema.SchemaPackage#getTypePriorite_DefinitPourHoraireManoeuvre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='DefinitPour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getDefinitPourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePriorite#getDefinitPourHoraireManoeuvre <em>Definit Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definit Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getDefinitPourHoraireManoeuvre()
	 * @generated
	 */
	void setDefinitPourHoraireManoeuvre(TypeAssociation value);

} // TypePriorite
