/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Materiel Meteorologie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMaterielMeteorologie#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielMeteorologie#getAPourObjetElementMeteo <em>APour Objet Element Meteo</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielMeteorologie#getAPourSujetMateriel <em>APour Sujet Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielMeteorologie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMaterielMeteorologie' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMaterielMeteorologie extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMaterielMeteorologieCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMaterielMeteorologieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielMeteorologieCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielMeteorologie_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMaterielMeteorologieCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielMeteorologie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMaterielMeteorologieCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMaterielMeteorologieCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMaterielMeteorologie#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielMeteorologieCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMaterielMeteorologie#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielMeteorologieCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Objet Element Meteo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Element Meteo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Element Meteo</em>' containment reference.
	 * @see #setAPourObjetElementMeteo(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielMeteorologie_APourObjetElementMeteo()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMaterielMeteorologie' target_entity='type_ElementMeteo'"
	 *        extendedMetaData="kind='element' name='APourObjet_ElementMeteo'"
	 * @generated
	 */
	TypeAssociation getAPourObjetElementMeteo();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielMeteorologie#getAPourObjetElementMeteo <em>APour Objet Element Meteo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Element Meteo</em>' containment reference.
	 * @see #getAPourObjetElementMeteo()
	 * @generated
	 */
	void setAPourObjetElementMeteo(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Materiel</em>' containment reference.
	 * @see #setAPourSujetMateriel(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielMeteorologie_APourSujetMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMaterielMeteorologie' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='APourSujet_Materiel'"
	 * @generated
	 */
	TypeAssociation getAPourSujetMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielMeteorologie#getAPourSujetMateriel <em>APour Sujet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Materiel</em>' containment reference.
	 * @see #getAPourSujetMateriel()
	 * @generated
	 */
	void setAPourSujetMateriel(TypeAssociation value);

} // TypeAssociationMaterielMeteorologie
