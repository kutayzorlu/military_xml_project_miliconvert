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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Liaison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLiaison#getEtatLiaison <em>Etat Liaison</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaison#getMoyens <em>Moyens</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaison#getAPourCorrespondantUnite <em>APour Correspondant Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaison#getAPourCorrespondantSite <em>APour Correspondant Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLiaison()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Liaison' kind='elementOnly'"
 * @generated
 */
public interface TypeLiaison extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat Liaison</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonEtatLiaison}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Liaison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Liaison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonEtatLiaison
	 * @see #isSetEtatLiaison()
	 * @see #unsetEtatLiaison()
	 * @see #setEtatLiaison(TypeDictionaryDicoLiaisonEtatLiaison)
	 * @see mpia.schema.SchemaPackage#getTypeLiaison_EtatLiaison()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EtatLiaison'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonEtatLiaison getEtatLiaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaison#getEtatLiaison <em>Etat Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Liaison</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonEtatLiaison
	 * @see #isSetEtatLiaison()
	 * @see #unsetEtatLiaison()
	 * @see #getEtatLiaison()
	 * @generated
	 */
	void setEtatLiaison(TypeDictionaryDicoLiaisonEtatLiaison value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaison#getEtatLiaison <em>Etat Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatLiaison()
	 * @see #getEtatLiaison()
	 * @see #setEtatLiaison(TypeDictionaryDicoLiaisonEtatLiaison)
	 * @generated
	 */
	void unsetEtatLiaison();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaison#getEtatLiaison <em>Etat Liaison</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Liaison</em>' attribute is set.
	 * @see #unsetEtatLiaison()
	 * @see #getEtatLiaison()
	 * @see #setEtatLiaison(TypeDictionaryDicoLiaisonEtatLiaison)
	 * @generated
	 */
	boolean isSetEtatLiaison();

	/**
	 * Returns the value of the '<em><b>Moyens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens</em>' attribute.
	 * @see #setMoyens(String)
	 * @see mpia.schema.SchemaPackage#getTypeLiaison_Moyens()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='Moyens'"
	 * @generated
	 */
	String getMoyens();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaison#getMoyens <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens</em>' attribute.
	 * @see #getMoyens()
	 * @generated
	 */
	void setMoyens(String value);

	/**
	 * Returns the value of the '<em><b>APour Correspondant Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Correspondant Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Correspondant Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLiaison_APourCorrespondantUnite()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourCorrespondant_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourCorrespondantUnite();

	/**
	 * Returns the value of the '<em><b>APour Correspondant Site</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Correspondant Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Correspondant Site</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLiaison_APourCorrespondantSite()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='APourCorrespondant_Site'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourCorrespondantSite();

} // TypeLiaison
