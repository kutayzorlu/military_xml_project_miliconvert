/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Horaire Manoeuvre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationHoraireManoeuvre#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationHoraireManoeuvre#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationHoraireManoeuvre#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationHoraireManoeuvre#getAssocieCommeSujetHoraireManoeuvre <em>Associe Comme Sujet Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationHoraireManoeuvre#getAssocieCommeObjetHoraireManoeuvre <em>Associe Comme Objet Horaire Manoeuvre</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationHoraireManoeuvre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationHoraireManoeuvre' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationHoraireManoeuvre extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationHoraireManoeuvreCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationHoraireManoeuvreCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationHoraireManoeuvreCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationHoraireManoeuvre_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationHoraireManoeuvreCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationHoraireManoeuvre#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationHoraireManoeuvreCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationHoraireManoeuvreCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationHoraireManoeuvre#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationHoraireManoeuvreCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationHoraireManoeuvre#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationHoraireManoeuvreCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationHoraireManoeuvre_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationHoraireManoeuvre#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationHoraireManoeuvre_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationHoraireManoeuvre#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Horaire Manoeuvre</em>' containment reference.
	 * @see #setAssocieCommeSujetHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationHoraireManoeuvre_AssocieCommeSujetHoraireManoeuvre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationHoraireManoeuvre' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationHoraireManoeuvre#getAssocieCommeSujetHoraireManoeuvre <em>Associe Comme Sujet Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Horaire Manoeuvre</em>' containment reference.
	 * @see #getAssocieCommeSujetHoraireManoeuvre()
	 * @generated
	 */
	void setAssocieCommeSujetHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Horaire Manoeuvre</em>' containment reference.
	 * @see #setAssocieCommeObjetHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationHoraireManoeuvre_AssocieCommeObjetHoraireManoeuvre()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationHoraireManoeuvre' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeObjetHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationHoraireManoeuvre#getAssocieCommeObjetHoraireManoeuvre <em>Associe Comme Objet Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Horaire Manoeuvre</em>' containment reference.
	 * @see #getAssocieCommeObjetHoraireManoeuvre()
	 * @generated
	 */
	void setAssocieCommeObjetHoraireManoeuvre(TypeAssociation value);

} // TypeAssociationHoraireManoeuvre
