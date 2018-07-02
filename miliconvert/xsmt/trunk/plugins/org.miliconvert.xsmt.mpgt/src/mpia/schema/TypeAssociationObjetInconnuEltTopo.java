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
 * A representation of the model object '<em><b>Type Association Objet Inconnu Elt Topo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuEltTopo#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuEltTopo#getAPourSujetObjetInconnu <em>APour Sujet Objet Inconnu</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationObjetInconnuEltTopo#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuEltTopo()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationObjetInconnuEltTopo' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationObjetInconnuEltTopo extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuEltTopo_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltTopo#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltTopo#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltTopo#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationObjetInconnuEltTopoCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Sujet Objet Inconnu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Objet Inconnu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Objet Inconnu</em>' containment reference.
	 * @see #setAPourSujetObjetInconnu(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuEltTopo_APourSujetObjetInconnu()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationObjetInconnuEltTopo' target_entity='type_ObjetInconnu'"
	 *        extendedMetaData="kind='element' name='APourSujet_ObjetInconnu'"
	 * @generated
	 */
	TypeAssociation getAPourSujetObjetInconnu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltTopo#getAPourSujetObjetInconnu <em>APour Sujet Objet Inconnu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Objet Inconnu</em>' containment reference.
	 * @see #getAPourSujetObjetInconnu()
	 * @generated
	 */
	void setAPourSujetObjetInconnu(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objet Element Topographie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Element Topographie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Element Topographie</em>' containment reference.
	 * @see #setAPourObjetElementTopographie(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationObjetInconnuEltTopo_APourObjetElementTopographie()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationObjetInconnuEltTopo' target_entity='type_ElementTopographie'"
	 *        extendedMetaData="kind='element' name='APourObjet_ElementTopographie'"
	 * @generated
	 */
	TypeAssociation getAPourObjetElementTopographie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationObjetInconnuEltTopo#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Element Topographie</em>' containment reference.
	 * @see #getAPourObjetElementTopographie()
	 * @generated
	 */
	void setAPourObjetElementTopographie(TypeAssociation value);

} // TypeAssociationObjetInconnuEltTopo
