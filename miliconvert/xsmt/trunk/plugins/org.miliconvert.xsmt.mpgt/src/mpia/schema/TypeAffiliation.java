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
 * A representation of the model object '<em><b>Type Affiliation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAffiliation#getAPourLangueLangue <em>APour Langue Langue</em>}</li>
 *   <li>{@link mpia.schema.TypeAffiliation#getEstObjetAssociationAffiliationAffiliation <em>Est Objet Association Affiliation Affiliation</em>}</li>
 *   <li>{@link mpia.schema.TypeAffiliation#getEstSujetAssociationAffiliationAffiliation <em>Est Sujet Association Affiliation Affiliation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAffiliation()
 * @model abstract="true"
 *        extendedMetaData="name='type_Affiliation' kind='elementOnly'"
 * @generated
 */
public interface TypeAffiliation extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>APour Langue Langue</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeLangue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Langue Langue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Langue Langue</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAffiliation_APourLangueLangue()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Langue'"
	 *        extendedMetaData="kind='element' name='APourLangue_Langue'"
	 * @generated
	 */
	EList<TypeLangue> getAPourLangueLangue();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Affiliation Affiliation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Affiliation Affiliation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Affiliation Affiliation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAffiliation_EstObjetAssociationAffiliationAffiliation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Affiliation' target_entity='type_AssociationAffiliationAffiliation'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationAffiliationAffiliation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationAffiliationAffiliation();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Affiliation Affiliation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Affiliation Affiliation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Affiliation Affiliation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAffiliation_EstSujetAssociationAffiliationAffiliation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Affiliation' target_entity='type_AssociationAffiliationAffiliation'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationAffiliationAffiliation'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationAffiliationAffiliation();

} // TypeAffiliation
