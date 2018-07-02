/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Renseignement Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRenseignementObjectif#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeRenseignementObjectif#getAPourCRrenseignementObjectifCRrenseignementObjectif <em>APour CRrenseignement Objectif CRrenseignement Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeRenseignementObjectif#getEstSujetAssociationRenseignementObjMisRenseignementObj <em>Est Sujet Association Renseignement Obj Mis Renseignement Obj</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRenseignementObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_RenseignementObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeRenseignementObjectif extends TypeActivite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoRenseignementObjectifCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRenseignementObjectifCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRenseignementObjectifCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeRenseignementObjectif_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoRenseignementObjectifCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRenseignementObjectif#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoRenseignementObjectifCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoRenseignementObjectifCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRenseignementObjectif#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRenseignementObjectifCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRenseignementObjectif#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoRenseignementObjectifCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>APour CRrenseignement Objectif CRrenseignement Objectif</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCRrenseignementObjectif}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour CRrenseignement Objectif CRrenseignement Objectif</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour CRrenseignement Objectif CRrenseignement Objectif</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRenseignementObjectif_APourCRrenseignementObjectifCRrenseignementObjectif()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CRrenseignementObjectif'"
	 *        extendedMetaData="kind='element' name='APourCRrenseignementObjectif_CRrenseignementObjectif'"
	 * @generated
	 */
	EList<TypeCRrenseignementObjectif> getAPourCRrenseignementObjectifCRrenseignementObjectif();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Renseignement Obj Mis Renseignement Obj</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Renseignement Obj Mis Renseignement Obj</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Renseignement Obj Mis Renseignement Obj</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRenseignementObjectif_EstSujetAssociationRenseignementObjMisRenseignementObj()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_RenseignementObjectif' target_entity='type_AssociationRenseignementObjMisRenseignementObj'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationRenseignementObjMisRenseignementObj'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationRenseignementObjMisRenseignementObj();

} // TypeRenseignementObjectif
