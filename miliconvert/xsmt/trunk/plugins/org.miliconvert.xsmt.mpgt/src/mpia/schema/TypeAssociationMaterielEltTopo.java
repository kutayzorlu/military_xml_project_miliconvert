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
 * A representation of the model object '<em><b>Type Association Materiel Elt Topo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationMaterielEltTopo#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielEltTopo#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationMaterielEltTopo#getAPourSujetMateriel <em>APour Sujet Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielEltTopo()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationMaterielEltTopo' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationMaterielEltTopo extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationMaterielEltTopoCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMaterielEltTopoCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielEltTopoCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielEltTopo_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationMaterielEltTopoCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielEltTopo#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationMaterielEltTopoCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationMaterielEltTopoCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationMaterielEltTopo#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielEltTopoCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationMaterielEltTopo#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationMaterielEltTopoCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielEltTopo_APourObjetElementTopographie()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationMaterielEltTopo' target_entity='type_ElementTopographie'"
	 *        extendedMetaData="kind='element' name='APourObjet_ElementTopographie'"
	 * @generated
	 */
	TypeAssociation getAPourObjetElementTopographie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielEltTopo#getAPourObjetElementTopographie <em>APour Objet Element Topographie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Element Topographie</em>' containment reference.
	 * @see #getAPourObjetElementTopographie()
	 * @generated
	 */
	void setAPourObjetElementTopographie(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationMaterielEltTopo_APourSujetMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationMaterielEltTopo' target_entity='type_Materiel'"
	 *        extendedMetaData="kind='element' name='APourSujet_Materiel'"
	 * @generated
	 */
	TypeAssociation getAPourSujetMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationMaterielEltTopo#getAPourSujetMateriel <em>APour Sujet Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Materiel</em>' containment reference.
	 * @see #getAPourSujetMateriel()
	 * @generated
	 */
	void setAPourSujetMateriel(TypeAssociation value);

} // TypeAssociationMaterielEltTopo
