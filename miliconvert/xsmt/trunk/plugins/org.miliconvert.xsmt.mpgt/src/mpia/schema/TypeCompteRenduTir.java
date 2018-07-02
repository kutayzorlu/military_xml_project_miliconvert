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
 * A representation of the model object '<em><b>Type Compte Rendu Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getTypeCR <em>Type CR</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getValeurCRtir <em>Valeur CRtir</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getCauseRefusTir <em>Cause Refus Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getEtatSalve <em>Etat Salve</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getAPourEmetteurUnite <em>APour Emetteur Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getConcerneDemandeTir <em>Concerne Demande Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getConcerneDirectiveTir <em>Concerne Directive Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduTir#getAPourConsommationVolumeMunitionsASS <em>APour Consommation Volume Munitions ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CompteRenduTir' kind='elementOnly'"
 * @generated
 */
public interface TypeCompteRenduTir extends EObject {
	/**
	 * Returns the value of the '<em><b>Type CR</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompteRenduTirTypeCR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type CR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type CR</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduTirTypeCR
	 * @see #isSetTypeCR()
	 * @see #unsetTypeCR()
	 * @see #setTypeCR(TypeDictionaryDicoCompteRenduTirTypeCR)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_TypeCR()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeCR'"
	 * @generated
	 */
	TypeDictionaryDicoCompteRenduTirTypeCR getTypeCR();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getTypeCR <em>Type CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type CR</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduTirTypeCR
	 * @see #isSetTypeCR()
	 * @see #unsetTypeCR()
	 * @see #getTypeCR()
	 * @generated
	 */
	void setTypeCR(TypeDictionaryDicoCompteRenduTirTypeCR value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompteRenduTir#getTypeCR <em>Type CR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCR()
	 * @see #getTypeCR()
	 * @see #setTypeCR(TypeDictionaryDicoCompteRenduTirTypeCR)
	 * @generated
	 */
	void unsetTypeCR();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompteRenduTir#getTypeCR <em>Type CR</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type CR</em>' attribute is set.
	 * @see #unsetTypeCR()
	 * @see #getTypeCR()
	 * @see #setTypeCR(TypeDictionaryDicoCompteRenduTirTypeCR)
	 * @generated
	 */
	boolean isSetTypeCR();

	/**
	 * Returns the value of the '<em><b>Valeur CRtir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompteRenduTirValeurCRtir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur CRtir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur CRtir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduTirValeurCRtir
	 * @see #isSetValeurCRtir()
	 * @see #unsetValeurCRtir()
	 * @see #setValeurCRtir(TypeDictionaryDicoCompteRenduTirValeurCRtir)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_ValeurCRtir()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ValeurCRtir'"
	 * @generated
	 */
	TypeDictionaryDicoCompteRenduTirValeurCRtir getValeurCRtir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getValeurCRtir <em>Valeur CRtir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur CRtir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduTirValeurCRtir
	 * @see #isSetValeurCRtir()
	 * @see #unsetValeurCRtir()
	 * @see #getValeurCRtir()
	 * @generated
	 */
	void setValeurCRtir(TypeDictionaryDicoCompteRenduTirValeurCRtir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompteRenduTir#getValeurCRtir <em>Valeur CRtir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValeurCRtir()
	 * @see #getValeurCRtir()
	 * @see #setValeurCRtir(TypeDictionaryDicoCompteRenduTirValeurCRtir)
	 * @generated
	 */
	void unsetValeurCRtir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompteRenduTir#getValeurCRtir <em>Valeur CRtir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valeur CRtir</em>' attribute is set.
	 * @see #unsetValeurCRtir()
	 * @see #getValeurCRtir()
	 * @see #setValeurCRtir(TypeDictionaryDicoCompteRenduTirValeurCRtir)
	 * @generated
	 */
	boolean isSetValeurCRtir();

	/**
	 * Returns the value of the '<em><b>Cause Refus Tir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompteRenduTirCauseRefusTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cause Refus Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause Refus Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduTirCauseRefusTir
	 * @see #isSetCauseRefusTir()
	 * @see #unsetCauseRefusTir()
	 * @see #setCauseRefusTir(TypeDictionaryDicoCompteRenduTirCauseRefusTir)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_CauseRefusTir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CauseRefusTir'"
	 * @generated
	 */
	TypeDictionaryDicoCompteRenduTirCauseRefusTir getCauseRefusTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getCauseRefusTir <em>Cause Refus Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause Refus Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduTirCauseRefusTir
	 * @see #isSetCauseRefusTir()
	 * @see #unsetCauseRefusTir()
	 * @see #getCauseRefusTir()
	 * @generated
	 */
	void setCauseRefusTir(TypeDictionaryDicoCompteRenduTirCauseRefusTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompteRenduTir#getCauseRefusTir <em>Cause Refus Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCauseRefusTir()
	 * @see #getCauseRefusTir()
	 * @see #setCauseRefusTir(TypeDictionaryDicoCompteRenduTirCauseRefusTir)
	 * @generated
	 */
	void unsetCauseRefusTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompteRenduTir#getCauseRefusTir <em>Cause Refus Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cause Refus Tir</em>' attribute is set.
	 * @see #unsetCauseRefusTir()
	 * @see #getCauseRefusTir()
	 * @see #setCauseRefusTir(TypeDictionaryDicoCompteRenduTirCauseRefusTir)
	 * @generated
	 */
	boolean isSetCauseRefusTir();

	/**
	 * Returns the value of the '<em><b>Etat Salve</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompteRenduTirEtatSalve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Salve</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Salve</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduTirEtatSalve
	 * @see #isSetEtatSalve()
	 * @see #unsetEtatSalve()
	 * @see #setEtatSalve(TypeDictionaryDicoCompteRenduTirEtatSalve)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_EtatSalve()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatSalve'"
	 * @generated
	 */
	TypeDictionaryDicoCompteRenduTirEtatSalve getEtatSalve();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getEtatSalve <em>Etat Salve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Salve</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduTirEtatSalve
	 * @see #isSetEtatSalve()
	 * @see #unsetEtatSalve()
	 * @see #getEtatSalve()
	 * @generated
	 */
	void setEtatSalve(TypeDictionaryDicoCompteRenduTirEtatSalve value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompteRenduTir#getEtatSalve <em>Etat Salve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatSalve()
	 * @see #getEtatSalve()
	 * @see #setEtatSalve(TypeDictionaryDicoCompteRenduTirEtatSalve)
	 * @generated
	 */
	void unsetEtatSalve();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompteRenduTir#getEtatSalve <em>Etat Salve</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Salve</em>' attribute is set.
	 * @see #unsetEtatSalve()
	 * @see #getEtatSalve()
	 * @see #setEtatSalve(TypeDictionaryDicoCompteRenduTirEtatSalve)
	 * @generated
	 */
	boolean isSetEtatSalve();

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
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Emetteur Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Emetteur Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Emetteur Unite</em>' containment reference.
	 * @see #setAPourEmetteurUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_APourEmetteurUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourEmetteur_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourEmetteurUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getAPourEmetteurUnite <em>APour Emetteur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Emetteur Unite</em>' containment reference.
	 * @see #getAPourEmetteurUnite()
	 * @generated
	 */
	void setAPourEmetteurUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Demande Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Demande Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Demande Tir</em>' containment reference.
	 * @see #setConcerneDemandeTir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_ConcerneDemandeTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourCompteRendu_CompteRenduTir' target_entity='type_DemandeTir'"
	 *        extendedMetaData="kind='element' name='Concerne_DemandeTir'"
	 * @generated
	 */
	TypeAssociation getConcerneDemandeTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getConcerneDemandeTir <em>Concerne Demande Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Demande Tir</em>' containment reference.
	 * @see #getConcerneDemandeTir()
	 * @generated
	 */
	void setConcerneDemandeTir(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Concerne Directive Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Directive Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Directive Tir</em>' containment reference.
	 * @see #setConcerneDirectiveTir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_ConcerneDirectiveTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourCompteRendu_CompteRenduTir' target_entity='type_DirectiveTir'"
	 *        extendedMetaData="kind='element' name='Concerne_DirectiveTir'"
	 * @generated
	 */
	TypeAssociation getConcerneDirectiveTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduTir#getConcerneDirectiveTir <em>Concerne Directive Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Directive Tir</em>' containment reference.
	 * @see #getConcerneDirectiveTir()
	 * @generated
	 */
	void setConcerneDirectiveTir(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Consommation Volume Munitions ASS</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVolumeMunitionsASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Consommation Volume Munitions ASS</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Consommation Volume Munitions ASS</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduTir_APourConsommationVolumeMunitionsASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VolumeMunitionsASS'"
	 *        extendedMetaData="kind='element' name='APourConsommation_VolumeMunitionsASS'"
	 * @generated
	 */
	EList<TypeVolumeMunitionsASS> getAPourConsommationVolumeMunitionsASS();

} // TypeCompteRenduTir
