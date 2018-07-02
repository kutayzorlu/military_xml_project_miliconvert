/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Moyens Genie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyensGenie#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensGenie#getDistanceCalcul <em>Distance Calcul</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensGenie#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensGenie#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensGenie#getAPourVarianteRealisationVarianteTravail <em>APour Variante Realisation Variante Travail</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensGenie#getConcerneEffectifsEffectifNecessaire <em>Concerne Effectifs Effectif Necessaire</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensGenie#getConcerneMoyensMoyensNecessaires <em>Concerne Moyens Moyens Necessaires</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyensGenie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MoyensGenie' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyensGenie extends EObject {
	/**
	 * Returns the value of the '<em><b>Duree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' containment reference.
	 * @see #setDuree(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensGenie_Duree()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Duree'"
	 * @generated
	 */
	TypeDataTypeDuree getDuree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensGenie#getDuree <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' containment reference.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Distance Calcul</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Calcul</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Calcul</em>' attribute.
	 * @see #isSetDistanceCalcul()
	 * @see #unsetDistanceCalcul()
	 * @see #setDistanceCalcul(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensGenie_DistanceCalcul()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='DistanceCalcul'"
	 * @generated
	 */
	long getDistanceCalcul();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensGenie#getDistanceCalcul <em>Distance Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Calcul</em>' attribute.
	 * @see #isSetDistanceCalcul()
	 * @see #unsetDistanceCalcul()
	 * @see #getDistanceCalcul()
	 * @generated
	 */
	void setDistanceCalcul(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensGenie#getDistanceCalcul <em>Distance Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistanceCalcul()
	 * @see #getDistanceCalcul()
	 * @see #setDistanceCalcul(long)
	 * @generated
	 */
	void unsetDistanceCalcul();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensGenie#getDistanceCalcul <em>Distance Calcul</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance Calcul</em>' attribute is set.
	 * @see #unsetDistanceCalcul()
	 * @see #getDistanceCalcul()
	 * @see #setDistanceCalcul(long)
	 * @generated
	 */
	boolean isSetDistanceCalcul();

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensGenie_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensGenie#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensGenie_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensGenie#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Variante Realisation Variante Travail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Variante Realisation Variante Travail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Variante Realisation Variante Travail</em>' containment reference.
	 * @see #setAPourVarianteRealisationVarianteTravail(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensGenie_APourVarianteRealisationVarianteTravail()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstReferencePar_MoyensGenie' target_entity='type_VarianteTravail'"
	 *        extendedMetaData="kind='element' name='APourVarianteRealisation_VarianteTravail'"
	 * @generated
	 */
	TypeAssociation getAPourVarianteRealisationVarianteTravail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensGenie#getAPourVarianteRealisationVarianteTravail <em>APour Variante Realisation Variante Travail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Variante Realisation Variante Travail</em>' containment reference.
	 * @see #getAPourVarianteRealisationVarianteTravail()
	 * @generated
	 */
	void setAPourVarianteRealisationVarianteTravail(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Effectifs Effectif Necessaire</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffectifNecessaire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Effectifs Effectif Necessaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Effectifs Effectif Necessaire</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMoyensGenie_ConcerneEffectifsEffectifNecessaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffectifNecessaire'"
	 *        extendedMetaData="kind='element' name='ConcerneEffectifs_EffectifNecessaire'"
	 * @generated
	 */
	EList<TypeEffectifNecessaire> getConcerneEffectifsEffectifNecessaire();

	/**
	 * Returns the value of the '<em><b>Concerne Moyens Moyens Necessaires</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensNecessaires}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Moyens Moyens Necessaires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Moyens Moyens Necessaires</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMoyensGenie_ConcerneMoyensMoyensNecessaires()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyensNecessaires'"
	 *        extendedMetaData="kind='element' name='ConcerneMoyens_MoyensNecessaires'"
	 * @generated
	 */
	EList<TypeMoyensNecessaires> getConcerneMoyensMoyensNecessaires();

} // TypeMoyensGenie
