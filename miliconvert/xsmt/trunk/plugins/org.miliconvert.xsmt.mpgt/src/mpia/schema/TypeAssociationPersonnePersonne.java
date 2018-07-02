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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Personne Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationPersonnePersonne#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonnePersonne#getEstReferenceeDansArticulation <em>Est Referencee Dans Articulation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonnePersonne#getAPourObjetPersonne <em>APour Objet Personne</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationPersonnePersonne#getAPourSujetPersonne <em>APour Sujet Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePersonne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationPersonnePersonne' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationPersonnePersonne extends TypeAssociationInstanceObjetInstanceObjet {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssociationPersonnePersonneCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonnePersonneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonnePersonneCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePersonne_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssociationPersonnePersonneCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonnePersonne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssociationPersonnePersonneCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssociationPersonnePersonneCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationPersonnePersonne#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonnePersonneCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationPersonnePersonne#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssociationPersonnePersonneCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Est Referencee Dans Articulation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Referencee Dans Articulation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Referencee Dans Articulation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePersonne_EstReferenceeDansArticulation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstConstitueDe_AssociationPersonnePersonne' target_entity='type_Articulation'"
	 *        extendedMetaData="kind='element' name='EstReferenceeDans_Articulation'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEstReferenceeDansArticulation();

	/**
	 * Returns the value of the '<em><b>APour Objet Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objet Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objet Personne</em>' containment reference.
	 * @see #setAPourObjetPersonne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePersonne_APourObjetPersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationPersonnePersonne' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='APourObjet_Personne'"
	 * @generated
	 */
	TypeAssociation getAPourObjetPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonnePersonne#getAPourObjetPersonne <em>APour Objet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objet Personne</em>' containment reference.
	 * @see #getAPourObjetPersonne()
	 * @generated
	 */
	void setAPourObjetPersonne(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Sujet Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Sujet Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Sujet Personne</em>' containment reference.
	 * @see #setAPourSujetPersonne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationPersonnePersonne_APourSujetPersonne()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationPersonnePersonne' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='APourSujet_Personne'"
	 * @generated
	 */
	TypeAssociation getAPourSujetPersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationPersonnePersonne#getAPourSujetPersonne <em>APour Sujet Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Sujet Personne</em>' containment reference.
	 * @see #getAPourSujetPersonne()
	 * @generated
	 */
	void setAPourSujetPersonne(TypeAssociation value);

} // TypeAssociationPersonnePersonne
