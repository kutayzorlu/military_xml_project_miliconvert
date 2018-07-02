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
 * A representation of the model object '<em><b>Type Association Elt Ctrl Materiel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationEltCtrlMateriel#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEltCtrlMateriel#getAPourSujetElementControle <em>APour Sujet Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationEltCtrlMateriel#getAPourObjetMateriel <em>APour Objet Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlMateriel()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationEltCtrlMateriel' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationEltCtrlMateriel extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationEltCtrlMaterielCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEltCtrlMaterielCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltCtrlMaterielCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlMateriel_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationEltCtrlMaterielCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltCtrlMateriel#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationEltCtrlMaterielCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationEltCtrlMaterielCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationEltCtrlMateriel#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltCtrlMaterielCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationEltCtrlMateriel#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationEltCtrlMaterielCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Element Controle</em>' containment reference.
	 * @see #setAPourSujetElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlMateriel_APourSujetElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationEltCtrlMateriel' target_entity='type_ElementControle'"
	 *        extendedMetaData="kind='element' name='APourSujet_ElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourSujetElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltCtrlMateriel#getAPourSujetElementControle <em>APour Sujet Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Element Controle</em>' containment reference.
	 * @see #getAPourSujetElementControle()
	 * @generated
	 */
	void setAPourSujetElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Materiel</em>' containment reference.
	 * @see #setAPourObjetMateriel(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationEltCtrlMateriel_APourObjetMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationEltCtrlMateriel' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='APourObjet_Materiel'"
	 * @generated
	 */
	TypeAssociation getAPourObjetMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationEltCtrlMateriel#getAPourObjetMateriel <em>APour Objet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Materiel</em>' containment reference.
	 * @see #getAPourObjetMateriel()
	 * @generated
	 */
	void setAPourObjetMateriel(TypeAssociation value);

} // TypeAssociationEltCtrlMateriel
