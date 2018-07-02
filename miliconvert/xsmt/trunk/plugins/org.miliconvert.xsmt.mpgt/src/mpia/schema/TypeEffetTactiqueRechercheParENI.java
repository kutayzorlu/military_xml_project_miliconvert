/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Effet Tactique Recherche Par ENI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getProbabiliteConflit <em>Probabilite Conflit</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getACommeMoyensENIutilisesMoyensENIutilises <em>AComme Moyens EN Iutilises Moyens EN Iutilises</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRechercheParENI()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EffetTactiqueRechercheParENI' kind='elementOnly'"
 * @generated
 */
public interface TypeEffetTactiqueRechercheParENI extends EObject {
	/**
	 * Returns the value of the '<em><b>Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectif</em>' attribute.
	 * @see #setObjectif(String)
	 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRechercheParENI_Objectif()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='Objectif'"
	 * @generated
	 */
	String getObjectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getObjectif <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectif</em>' attribute.
	 * @see #getObjectif()
	 * @generated
	 */
	void setObjectif(String value);

	/**
	 * Returns the value of the '<em><b>Probabilite Conflit</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoProbabiliteEvenement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Probabilite Conflit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probabilite Conflit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoProbabiliteEvenement
	 * @see #isSetProbabiliteConflit()
	 * @see #unsetProbabiliteConflit()
	 * @see #setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement)
	 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRechercheParENI_ProbabiliteConflit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ProbabiliteConflit'"
	 * @generated
	 */
	TypeDictionaryDicoProbabiliteEvenement getProbabiliteConflit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getProbabiliteConflit <em>Probabilite Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probabilite Conflit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoProbabiliteEvenement
	 * @see #isSetProbabiliteConflit()
	 * @see #unsetProbabiliteConflit()
	 * @see #getProbabiliteConflit()
	 * @generated
	 */
	void setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getProbabiliteConflit <em>Probabilite Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProbabiliteConflit()
	 * @see #getProbabiliteConflit()
	 * @see #setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement)
	 * @generated
	 */
	void unsetProbabiliteConflit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getProbabiliteConflit <em>Probabilite Conflit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Probabilite Conflit</em>' attribute is set.
	 * @see #unsetProbabiliteConflit()
	 * @see #getProbabiliteConflit()
	 * @see #setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement)
	 * @generated
	 */
	boolean isSetProbabiliteConflit();

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
	 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRechercheParENI_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRechercheParENI_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetTactiqueRechercheParENI#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Moyens EN Iutilises Moyens EN Iutilises</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMoyensENIutilises}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Moyens EN Iutilises Moyens EN Iutilises</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Moyens EN Iutilises Moyens EN Iutilises</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRechercheParENI_ACommeMoyensENIutilisesMoyensENIutilises()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MoyensENIutilises'"
	 *        extendedMetaData="kind='element' name='ACommeMoyensENIutilises_MoyensENIutilises'"
	 * @generated
	 */
	EList<TypeMoyensENIutilises> getACommeMoyensENIutilisesMoyensENIutilises();

} // TypeEffetTactiqueRechercheParENI
