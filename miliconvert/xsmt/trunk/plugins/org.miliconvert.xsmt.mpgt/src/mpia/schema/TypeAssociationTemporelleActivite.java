/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Temporelle Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationTemporelleActivite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationTemporelleActivite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationTemporelleActivite#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationTemporelleActivite#getDureeRelative <em>Duree Relative</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationTemporelleActivite#getAssocieCommeSujetActivite <em>Associe Comme Sujet Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationTemporelleActivite#getAssocieCommeObjetActivite <em>Associe Comme Objet Activite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationTemporelleActivite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationTemporelleActivite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationTemporelleActivite extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTemporelleActivite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTemporelleActivite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTemporelleActivite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTemporelleActivite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationTemporelleCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationTemporelleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationTemporelleCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTemporelleActivite_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationTemporelleCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTemporelleActivite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationTemporelleCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationTemporelleCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationTemporelleActivite#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationTemporelleCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationTemporelleActivite#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationTemporelleCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Duree Relative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Relative</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Relative</em>' containment reference.
	 * @see #setDureeRelative(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTemporelleActivite_DureeRelative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeRelative'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeRelative();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTemporelleActivite#getDureeRelative <em>Duree Relative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Relative</em>' containment reference.
	 * @see #getDureeRelative()
	 * @generated
	 */
	void setDureeRelative(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Activite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Activite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Activite</em>' containment reference.
	 * @see #setAssocieCommeSujetActivite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTemporelleActivite_AssocieCommeSujetActivite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationTemporelleActivite' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_Activite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTemporelleActivite#getAssocieCommeSujetActivite <em>Associe Comme Sujet Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Activite</em>' containment reference.
	 * @see #getAssocieCommeSujetActivite()
	 * @generated
	 */
	void setAssocieCommeSujetActivite(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Activite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Activite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Activite</em>' containment reference.
	 * @see #setAssocieCommeObjetActivite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationTemporelleActivite_AssocieCommeObjetActivite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationTemporelleActivite' target_entity='type_Activite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_Activite'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetActivite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationTemporelleActivite#getAssocieCommeObjetActivite <em>Associe Comme Objet Activite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Activite</em>' containment reference.
	 * @see #getAssocieCommeObjetActivite()
	 * @generated
	 */
	void setAssocieCommeObjetActivite(TypeAssociation value);

} // TypeAssociationTemporelleActivite
