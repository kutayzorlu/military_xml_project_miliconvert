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
 * A representation of the model object '<em><b>Type Assoc Liste Obj Cand Liste Obj Cand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getAPourListeObjectifsObjetListeObjectifsCandidats <em>APour Liste Objectifs Objet Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getAPourListeObjectifsSujetListeObjectifsCandidats <em>APour Liste Objectifs Sujet Liste Objectifs Candidats</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocListeObjCandListeObjCand()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssocListeObjCandListeObjCand' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocListeObjCandListeObjCand extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocListeObjCandListeObjCand_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocListeObjCandListeObjCand_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssocListeObjCandListeObjCand_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour Liste Objectifs Objet Liste Objectifs Candidats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Liste Objectifs Objet Liste Objectifs Candidats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Liste Objectifs Objet Liste Objectifs Candidats</em>' containment reference.
	 * @see #setAPourListeObjectifsObjetListeObjectifsCandidats(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocListeObjCandListeObjCand_APourListeObjectifsObjetListeObjectifsCandidats()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Depend_AssocListeObjCandListeObjCand' target_entity='type_ListeObjectifsCandidats'"
	 *        extendedMetaData="kind='element' name='APourListeObjectifsObjet_ListeObjectifsCandidats'"
	 * @generated
	 */
	TypeAssociation getAPourListeObjectifsObjetListeObjectifsCandidats();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getAPourListeObjectifsObjetListeObjectifsCandidats <em>APour Liste Objectifs Objet Liste Objectifs Candidats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Liste Objectifs Objet Liste Objectifs Candidats</em>' containment reference.
	 * @see #getAPourListeObjectifsObjetListeObjectifsCandidats()
	 * @generated
	 */
	void setAPourListeObjectifsObjetListeObjectifsCandidats(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Liste Objectifs Sujet Liste Objectifs Candidats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Liste Objectifs Sujet Liste Objectifs Candidats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Liste Objectifs Sujet Liste Objectifs Candidats</em>' containment reference.
	 * @see #setAPourListeObjectifsSujetListeObjectifsCandidats(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocListeObjCandListeObjCand_APourListeObjectifsSujetListeObjectifsCandidats()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Contraint_AssocListeObjCandListeObjCand' target_entity='type_ListeObjectifsCandidats'"
	 *        extendedMetaData="kind='element' name='APourListeObjectifsSujet_ListeObjectifsCandidats'"
	 * @generated
	 */
	TypeAssociation getAPourListeObjectifsSujetListeObjectifsCandidats();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocListeObjCandListeObjCand#getAPourListeObjectifsSujetListeObjectifsCandidats <em>APour Liste Objectifs Sujet Liste Objectifs Candidats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Liste Objectifs Sujet Liste Objectifs Candidats</em>' containment reference.
	 * @see #getAPourListeObjectifsSujetListeObjectifsCandidats()
	 * @generated
	 */
	void setAPourListeObjectifsSujetListeObjectifsCandidats(TypeAssociation value);

} // TypeAssocListeObjCandListeObjCand
