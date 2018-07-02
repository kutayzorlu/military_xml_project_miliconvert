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
 * A representation of the model object '<em><b>Type Politique Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getConsommationMaximaleParTir <em>Consommation Maximale Par Tir</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getCoefficientPonderation <em>Coefficient Ponderation</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getDelaiMaximumDeclenchementTirPlanifie <em>Delai Maximum Declenchement Tir Planifie</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getDelaiRefusTirOpportunite <em>Delai Refus Tir Opportunite</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getOrdresPourMunitionsParticulieres <em>Ordres Pour Munitions Particulieres</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getDefinitInterventionType <em>Definit Intervention Type</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS <em>Limite Usage Par Tir Munitions Rares AVolume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getConcernePlanFeux <em>Concerne Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTir#getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux <em>Prevoit Pour Tirs Planifies Disponibilite Pour Plan Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PolitiqueTir' kind='elementOnly'"
 * @generated
 */
public interface TypePolitiqueTir extends EObject {
	/**
	 * Returns the value of the '<em><b>Consommation Maximale Par Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consommation Maximale Par Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consommation Maximale Par Tir</em>' attribute.
	 * @see #isSetConsommationMaximaleParTir()
	 * @see #unsetConsommationMaximaleParTir()
	 * @see #setConsommationMaximaleParTir(long)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_ConsommationMaximaleParTir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ConsommationMaximaleParTir'"
	 * @generated
	 */
	long getConsommationMaximaleParTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getConsommationMaximaleParTir <em>Consommation Maximale Par Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consommation Maximale Par Tir</em>' attribute.
	 * @see #isSetConsommationMaximaleParTir()
	 * @see #unsetConsommationMaximaleParTir()
	 * @see #getConsommationMaximaleParTir()
	 * @generated
	 */
	void setConsommationMaximaleParTir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePolitiqueTir#getConsommationMaximaleParTir <em>Consommation Maximale Par Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConsommationMaximaleParTir()
	 * @see #getConsommationMaximaleParTir()
	 * @see #setConsommationMaximaleParTir(long)
	 * @generated
	 */
	void unsetConsommationMaximaleParTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePolitiqueTir#getConsommationMaximaleParTir <em>Consommation Maximale Par Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Consommation Maximale Par Tir</em>' attribute is set.
	 * @see #unsetConsommationMaximaleParTir()
	 * @see #getConsommationMaximaleParTir()
	 * @see #setConsommationMaximaleParTir(long)
	 * @generated
	 */
	boolean isSetConsommationMaximaleParTir();

	/**
	 * Returns the value of the '<em><b>Coefficient Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coefficient Ponderation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficient Ponderation</em>' attribute.
	 * @see #isSetCoefficientPonderation()
	 * @see #unsetCoefficientPonderation()
	 * @see #setCoefficientPonderation(double)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_CoefficientPonderation()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='CoefficientPonderation'"
	 * @generated
	 */
	double getCoefficientPonderation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getCoefficientPonderation <em>Coefficient Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficient Ponderation</em>' attribute.
	 * @see #isSetCoefficientPonderation()
	 * @see #unsetCoefficientPonderation()
	 * @see #getCoefficientPonderation()
	 * @generated
	 */
	void setCoefficientPonderation(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePolitiqueTir#getCoefficientPonderation <em>Coefficient Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoefficientPonderation()
	 * @see #getCoefficientPonderation()
	 * @see #setCoefficientPonderation(double)
	 * @generated
	 */
	void unsetCoefficientPonderation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePolitiqueTir#getCoefficientPonderation <em>Coefficient Ponderation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coefficient Ponderation</em>' attribute is set.
	 * @see #unsetCoefficientPonderation()
	 * @see #getCoefficientPonderation()
	 * @see #setCoefficientPonderation(double)
	 * @generated
	 */
	boolean isSetCoefficientPonderation();

	/**
	 * Returns the value of the '<em><b>Delai Maximum Declenchement Tir Planifie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delai Maximum Declenchement Tir Planifie</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delai Maximum Declenchement Tir Planifie</em>' containment reference.
	 * @see #setDelaiMaximumDeclenchementTirPlanifie(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_DelaiMaximumDeclenchementTirPlanifie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DelaiMaximumDeclenchementTirPlanifie'"
	 * @generated
	 */
	TypeDataTypeDuree getDelaiMaximumDeclenchementTirPlanifie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getDelaiMaximumDeclenchementTirPlanifie <em>Delai Maximum Declenchement Tir Planifie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delai Maximum Declenchement Tir Planifie</em>' containment reference.
	 * @see #getDelaiMaximumDeclenchementTirPlanifie()
	 * @generated
	 */
	void setDelaiMaximumDeclenchementTirPlanifie(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Delai Refus Tir Opportunite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delai Refus Tir Opportunite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delai Refus Tir Opportunite</em>' containment reference.
	 * @see #setDelaiRefusTirOpportunite(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_DelaiRefusTirOpportunite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DelaiRefusTirOpportunite'"
	 * @generated
	 */
	TypeDataTypeDuree getDelaiRefusTirOpportunite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getDelaiRefusTirOpportunite <em>Delai Refus Tir Opportunite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delai Refus Tir Opportunite</em>' containment reference.
	 * @see #getDelaiRefusTirOpportunite()
	 * @generated
	 */
	void setDelaiRefusTirOpportunite(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Ordres Pour Munitions Particulieres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordres Pour Munitions Particulieres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordres Pour Munitions Particulieres</em>' attribute.
	 * @see #setOrdresPourMunitionsParticulieres(String)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_OrdresPourMunitionsParticulieres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='OrdresPourMunitionsParticulieres'"
	 * @generated
	 */
	String getOrdresPourMunitionsParticulieres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getOrdresPourMunitionsParticulieres <em>Ordres Pour Munitions Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordres Pour Munitions Particulieres</em>' attribute.
	 * @see #getOrdresPourMunitionsParticulieres()
	 * @generated
	 */
	void setOrdresPourMunitionsParticulieres(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Definit Intervention Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definit Intervention Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definit Intervention Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_DefinitInterventionType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstDefiniePar_PolitiqueTir' target_entity='type_InterventionType'"
	 *        extendedMetaData="kind='element' name='Definit_InterventionType'"
	 * @generated
	 */
	EList<TypeAssociation> getDefinitInterventionType();

	/**
	 * Returns the value of the '<em><b>Limite Usage Par Tir Munitions Rares AVolume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limite Usage Par Tir Munitions Rares AVolume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limite Usage Par Tir Munitions Rares AVolume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_LimiteUsageParTirMunitionsRaresAVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='LimiteUsageParTirMunitionsRaresA_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getLimiteUsageParTirMunitionsRaresAVolumeMunitionsASS();

	/**
	 * Returns the value of the '<em><b>Concerne Plan Feux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Plan Feux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Plan Feux</em>' containment reference.
	 * @see #setConcernePlanFeux(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_ConcernePlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourPolitiqueTir_PolitiqueTir' target_entity='type_PlanFeux'"
	 *        extendedMetaData="kind='element' name='Concerne_PlanFeux'"
	 * @generated
	 */
	TypeAssociation getConcernePlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTir#getConcernePlanFeux <em>Concerne Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Plan Feux</em>' containment reference.
	 * @see #getConcernePlanFeux()
	 * @generated
	 */
	void setConcernePlanFeux(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Prevoit Pour Tirs Planifies Disponibilite Pour Plan Feux</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDisponibilitePourPlanFeux}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prevoit Pour Tirs Planifies Disponibilite Pour Plan Feux</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prevoit Pour Tirs Planifies Disponibilite Pour Plan Feux</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTir_PrevoitPourTirsPlanifiesDisponibilitePourPlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DisponibilitePourPlanFeux'"
	 *        extendedMetaData="kind='element' name='PrevoitPourTirsPlanifies_DisponibilitePourPlanFeux'"
	 * @generated
	 */
	EList<TypeDisponibilitePourPlanFeux> getPrevoitPourTirsPlanifiesDisponibilitePourPlanFeux();

} // TypePolitiqueTir
