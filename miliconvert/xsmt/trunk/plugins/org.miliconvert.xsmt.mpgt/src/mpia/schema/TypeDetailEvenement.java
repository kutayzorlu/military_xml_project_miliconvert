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
 * A representation of the model object '<em><b>Type Detail Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getClassificationSujet <em>Classification Sujet</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#isCrime <em>Crime</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getDescriptionDetaillee <em>Description Detaillee</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getRisquesMesures <em>Risques Mesures</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getConsequencesEvenement <em>Consequences Evenement</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getDispositionsPrises <em>Dispositions Prises</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDetailEvenement#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DetailEvenement' kind='elementOnly'"
 * @generated
 */
public interface TypeDetailEvenement extends EObject {
	/**
	 * Returns the value of the '<em><b>Classification Sujet</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDetailEvenementClassificationSujet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Sujet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Sujet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDetailEvenementClassificationSujet
	 * @see #isSetClassificationSujet()
	 * @see #unsetClassificationSujet()
	 * @see #setClassificationSujet(TypeDictionaryDicoDetailEvenementClassificationSujet)
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_ClassificationSujet()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ClassificationSujet'"
	 * @generated
	 */
	TypeDictionaryDicoDetailEvenementClassificationSujet getClassificationSujet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getClassificationSujet <em>Classification Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Sujet</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDetailEvenementClassificationSujet
	 * @see #isSetClassificationSujet()
	 * @see #unsetClassificationSujet()
	 * @see #getClassificationSujet()
	 * @generated
	 */
	void setClassificationSujet(TypeDictionaryDicoDetailEvenementClassificationSujet value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDetailEvenement#getClassificationSujet <em>Classification Sujet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassificationSujet()
	 * @see #getClassificationSujet()
	 * @see #setClassificationSujet(TypeDictionaryDicoDetailEvenementClassificationSujet)
	 * @generated
	 */
	void unsetClassificationSujet();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDetailEvenement#getClassificationSujet <em>Classification Sujet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classification Sujet</em>' attribute is set.
	 * @see #unsetClassificationSujet()
	 * @see #getClassificationSujet()
	 * @see #setClassificationSujet(TypeDictionaryDicoDetailEvenementClassificationSujet)
	 * @generated
	 */
	boolean isSetClassificationSujet();

	/**
	 * Returns the value of the '<em><b>Crime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crime</em>' attribute.
	 * @see #isSetCrime()
	 * @see #unsetCrime()
	 * @see #setCrime(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_Crime()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Crime'"
	 * @generated
	 */
	boolean isCrime();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#isCrime <em>Crime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crime</em>' attribute.
	 * @see #isSetCrime()
	 * @see #unsetCrime()
	 * @see #isCrime()
	 * @generated
	 */
	void setCrime(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDetailEvenement#isCrime <em>Crime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCrime()
	 * @see #isCrime()
	 * @see #setCrime(boolean)
	 * @generated
	 */
	void unsetCrime();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDetailEvenement#isCrime <em>Crime</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Crime</em>' attribute is set.
	 * @see #unsetCrime()
	 * @see #isCrime()
	 * @see #setCrime(boolean)
	 * @generated
	 */
	boolean isSetCrime();

	/**
	 * Returns the value of the '<em><b>Description Detaillee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Detaillee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Detaillee</em>' attribute.
	 * @see #setDescriptionDetaillee(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_DescriptionDetaillee()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='DescriptionDetaillee'"
	 * @generated
	 */
	String getDescriptionDetaillee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getDescriptionDetaillee <em>Description Detaillee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Detaillee</em>' attribute.
	 * @see #getDescriptionDetaillee()
	 * @generated
	 */
	void setDescriptionDetaillee(String value);

	/**
	 * Returns the value of the '<em><b>Risques Mesures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risques Mesures</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risques Mesures</em>' attribute.
	 * @see #setRisquesMesures(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_RisquesMesures()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='RisquesMesures'"
	 * @generated
	 */
	String getRisquesMesures();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getRisquesMesures <em>Risques Mesures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risques Mesures</em>' attribute.
	 * @see #getRisquesMesures()
	 * @generated
	 */
	void setRisquesMesures(String value);

	/**
	 * Returns the value of the '<em><b>Consequences Evenement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consequences Evenement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequences Evenement</em>' attribute.
	 * @see #setConsequencesEvenement(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_ConsequencesEvenement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConsequencesEvenement'"
	 * @generated
	 */
	String getConsequencesEvenement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getConsequencesEvenement <em>Consequences Evenement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consequences Evenement</em>' attribute.
	 * @see #getConsequencesEvenement()
	 * @generated
	 */
	void setConsequencesEvenement(String value);

	/**
	 * Returns the value of the '<em><b>Dispositions Prises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispositions Prises</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispositions Prises</em>' attribute.
	 * @see #setDispositionsPrises(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_DispositionsPrises()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DispositionsPrises'"
	 * @generated
	 */
	String getDispositionsPrises();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getDispositionsPrises <em>Dispositions Prises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispositions Prises</em>' attribute.
	 * @see #getDispositionsPrises()
	 * @generated
	 */
	void setDispositionsPrises(String value);

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapporte Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapporte Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #setEstRapporteParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDetailEvenement_EstRapporteParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetailEvenement#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

} // TypeDetailEvenement
