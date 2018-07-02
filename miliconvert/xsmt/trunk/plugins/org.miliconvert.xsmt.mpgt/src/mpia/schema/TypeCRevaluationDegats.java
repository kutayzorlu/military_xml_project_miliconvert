/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type CRevaluation Degats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCRevaluationDegats#getTypeEffetConstate <em>Type Effet Constate</em>}</li>
 *   <li>{@link mpia.schema.TypeCRevaluationDegats#getPourcentageEstimeDesDommages <em>Pourcentage Estime Des Dommages</em>}</li>
 *   <li>{@link mpia.schema.TypeCRevaluationDegats#getNombreEstimeDesVictimes <em>Nombre Estime Des Victimes</em>}</li>
 *   <li>{@link mpia.schema.TypeCRevaluationDegats#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}</li>
 *   <li>{@link mpia.schema.TypeCRevaluationDegats#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeCRevaluationDegats#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeCRevaluationDegats#getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen <em>AComme Materiel Ou Moyen Endommage Quantite Materiel Ou Moyen</em>}</li>
 *   <li>{@link mpia.schema.TypeCRevaluationDegats#getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen <em>AComme Materiel Ou Moyen Restant Quantite Materiel Ou Moyen</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CRevaluationDegats' kind='elementOnly'"
 * @generated
 */
public interface TypeCRevaluationDegats extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Effet Constate</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetConstateEffetConstate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Effet Constate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Effet Constate</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetConstateEffetConstate
	 * @see #isSetTypeEffetConstate()
	 * @see #unsetTypeEffetConstate()
	 * @see #setTypeEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate)
	 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats_TypeEffetConstate()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeEffetConstate'"
	 * @generated
	 */
	TypeDictionaryDicoEffetConstateEffetConstate getTypeEffetConstate();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getTypeEffetConstate <em>Type Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Effet Constate</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetConstateEffetConstate
	 * @see #isSetTypeEffetConstate()
	 * @see #unsetTypeEffetConstate()
	 * @see #getTypeEffetConstate()
	 * @generated
	 */
	void setTypeEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getTypeEffetConstate <em>Type Effet Constate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeEffetConstate()
	 * @see #getTypeEffetConstate()
	 * @see #setTypeEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate)
	 * @generated
	 */
	void unsetTypeEffetConstate();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRevaluationDegats#getTypeEffetConstate <em>Type Effet Constate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Effet Constate</em>' attribute is set.
	 * @see #unsetTypeEffetConstate()
	 * @see #getTypeEffetConstate()
	 * @see #setTypeEffetConstate(TypeDictionaryDicoEffetConstateEffetConstate)
	 * @generated
	 */
	boolean isSetTypeEffetConstate();

	/**
	 * Returns the value of the '<em><b>Pourcentage Estime Des Dommages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Estime Des Dommages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Estime Des Dommages</em>' attribute.
	 * @see #isSetPourcentageEstimeDesDommages()
	 * @see #unsetPourcentageEstimeDesDommages()
	 * @see #setPourcentageEstimeDesDommages(double)
	 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats_PourcentageEstimeDesDommages()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio" required="true"
	 *        extendedMetaData="kind='element' name='PourcentageEstimeDesDommages'"
	 * @generated
	 */
	double getPourcentageEstimeDesDommages();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getPourcentageEstimeDesDommages <em>Pourcentage Estime Des Dommages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Estime Des Dommages</em>' attribute.
	 * @see #isSetPourcentageEstimeDesDommages()
	 * @see #unsetPourcentageEstimeDesDommages()
	 * @see #getPourcentageEstimeDesDommages()
	 * @generated
	 */
	void setPourcentageEstimeDesDommages(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getPourcentageEstimeDesDommages <em>Pourcentage Estime Des Dommages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageEstimeDesDommages()
	 * @see #getPourcentageEstimeDesDommages()
	 * @see #setPourcentageEstimeDesDommages(double)
	 * @generated
	 */
	void unsetPourcentageEstimeDesDommages();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRevaluationDegats#getPourcentageEstimeDesDommages <em>Pourcentage Estime Des Dommages</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Estime Des Dommages</em>' attribute is set.
	 * @see #unsetPourcentageEstimeDesDommages()
	 * @see #getPourcentageEstimeDesDommages()
	 * @see #setPourcentageEstimeDesDommages(double)
	 * @generated
	 */
	boolean isSetPourcentageEstimeDesDommages();

	/**
	 * Returns the value of the '<em><b>Nombre Estime Des Victimes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Estime Des Victimes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Estime Des Victimes</em>' attribute.
	 * @see #isSetNombreEstimeDesVictimes()
	 * @see #unsetNombreEstimeDesVictimes()
	 * @see #setNombreEstimeDesVictimes(long)
	 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats_NombreEstimeDesVictimes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreEstimeDesVictimes'"
	 * @generated
	 */
	long getNombreEstimeDesVictimes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getNombreEstimeDesVictimes <em>Nombre Estime Des Victimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Estime Des Victimes</em>' attribute.
	 * @see #isSetNombreEstimeDesVictimes()
	 * @see #unsetNombreEstimeDesVictimes()
	 * @see #getNombreEstimeDesVictimes()
	 * @generated
	 */
	void setNombreEstimeDesVictimes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getNombreEstimeDesVictimes <em>Nombre Estime Des Victimes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEstimeDesVictimes()
	 * @see #getNombreEstimeDesVictimes()
	 * @see #setNombreEstimeDesVictimes(long)
	 * @generated
	 */
	void unsetNombreEstimeDesVictimes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCRevaluationDegats#getNombreEstimeDesVictimes <em>Nombre Estime Des Victimes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Estime Des Victimes</em>' attribute is set.
	 * @see #unsetNombreEstimeDesVictimes()
	 * @see #getNombreEstimeDesVictimes()
	 * @see #setNombreEstimeDesVictimes(long)
	 * @generated
	 */
	boolean isSetNombreEstimeDesVictimes();

	/**
	 * Returns the value of the '<em><b>Effet Sur Environnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Sur Environnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Sur Environnement</em>' attribute.
	 * @see #setEffetSurEnvironnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats_EffetSurEnvironnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EffetSurEnvironnement'"
	 * @generated
	 */
	String getEffetSurEnvironnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Sur Environnement</em>' attribute.
	 * @see #getEffetSurEnvironnement()
	 * @generated
	 */
	void setEffetSurEnvironnement(String value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Autre Element Controle</em>' containment reference.
	 * @see #setAPourLocalisationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats_APourLocalisationAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLocalisation_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLocalisationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getAPourLocalisationAutreElementControle <em>APour Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Autre Element Controle</em>' containment reference.
	 * @see #getAPourLocalisationAutreElementControle()
	 * @generated
	 */
	void setAPourLocalisationAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Objectif Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objectif Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objectif Objectif Ciblage</em>' containment reference.
	 * @see #setAPourObjectifObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats_APourObjectifObjectifCiblage()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='APourObjectif_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getAPourObjectifObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCRevaluationDegats#getAPourObjectifObjectifCiblage <em>APour Objectif Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Objectif Objectif Ciblage</em>' containment reference.
	 * @see #getAPourObjectifObjectifCiblage()
	 * @generated
	 */
	void setAPourObjectifObjectifCiblage(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Materiel Ou Moyen Endommage Quantite Materiel Ou Moyen</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteMaterielOuMoyen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Materiel Ou Moyen Endommage Quantite Materiel Ou Moyen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Materiel Ou Moyen Endommage Quantite Materiel Ou Moyen</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats_ACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteMaterielOuMoyen'"
	 *        extendedMetaData="kind='element' name='ACommeMaterielOuMoyenEndommage_QuantiteMaterielOuMoyen'"
	 * @generated
	 */
	EList<TypeQuantiteMaterielOuMoyen> getACommeMaterielOuMoyenEndommageQuantiteMaterielOuMoyen();

	/**
	 * Returns the value of the '<em><b>AComme Materiel Ou Moyen Restant Quantite Materiel Ou Moyen</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteMaterielOuMoyen}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Materiel Ou Moyen Restant Quantite Materiel Ou Moyen</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Materiel Ou Moyen Restant Quantite Materiel Ou Moyen</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCRevaluationDegats_ACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteMaterielOuMoyen'"
	 *        extendedMetaData="kind='element' name='ACommeMaterielOuMoyenRestant_QuantiteMaterielOuMoyen'"
	 * @generated
	 */
	EList<TypeQuantiteMaterielOuMoyen> getACommeMaterielOuMoyenRestantQuantiteMaterielOuMoyen();

} // TypeCRevaluationDegats
