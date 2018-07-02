/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Reservation Unite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeReservationUnite#getTrajectoireTir <em>Trajectoire Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getAPourTypeLanceurTypeArme <em>APour Type Lanceur Type Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getAPourUniteReserveeOuAEngagerUnite <em>APour Unite Reservee Ou AEngager Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getCommenceDatation <em>Commence Datation</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getSeTermineDatation <em>Se Termine Datation</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getConcerneObjectifCiblage <em>Concerne Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeReservationUnite#getEstPrevueParPlanFeux <em>Est Prevue Par Plan Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeReservationUnite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ReservationUnite' kind='elementOnly'"
 * @generated
 */
public interface TypeReservationUnite extends EObject {
	/**
	 * Returns the value of the '<em><b>Trajectoire Tir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTrajectoire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trajectoire Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectoire Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTrajectoire
	 * @see #isSetTrajectoireTir()
	 * @see #unsetTrajectoireTir()
	 * @see #setTrajectoireTir(TypeDictionaryDicoTrajectoire)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_TrajectoireTir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TrajectoireTir'"
	 * @generated
	 */
	TypeDictionaryDicoTrajectoire getTrajectoireTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getTrajectoireTir <em>Trajectoire Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectoire Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTrajectoire
	 * @see #isSetTrajectoireTir()
	 * @see #unsetTrajectoireTir()
	 * @see #getTrajectoireTir()
	 * @generated
	 */
	void setTrajectoireTir(TypeDictionaryDicoTrajectoire value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReservationUnite#getTrajectoireTir <em>Trajectoire Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrajectoireTir()
	 * @see #getTrajectoireTir()
	 * @see #setTrajectoireTir(TypeDictionaryDicoTrajectoire)
	 * @generated
	 */
	void unsetTrajectoireTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReservationUnite#getTrajectoireTir <em>Trajectoire Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trajectoire Tir</em>' attribute is set.
	 * @see #unsetTrajectoireTir()
	 * @see #getTrajectoireTir()
	 * @see #setTrajectoireTir(TypeDictionaryDicoTrajectoire)
	 * @generated
	 */
	boolean isSetTrajectoireTir();

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
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Type Lanceur Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Lanceur Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Lanceur Type Arme</em>' containment reference.
	 * @see #setAPourTypeLanceurTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_APourTypeLanceurTypeArme()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='APourTypeLanceur_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getAPourTypeLanceurTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getAPourTypeLanceurTypeArme <em>APour Type Lanceur Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Type Lanceur Type Arme</em>' containment reference.
	 * @see #getAPourTypeLanceurTypeArme()
	 * @generated
	 */
	void setAPourTypeLanceurTypeArme(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite Reservee Ou AEngager Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Reservee Ou AEngager Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Reservee Ou AEngager Unite</em>' containment reference.
	 * @see #setAPourUniteReserveeOuAEngagerUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_APourUniteReserveeOuAEngagerUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteReserveeOuAEngager_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteReserveeOuAEngagerUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getAPourUniteReserveeOuAEngagerUnite <em>APour Unite Reservee Ou AEngager Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Reservee Ou AEngager Unite</em>' containment reference.
	 * @see #getAPourUniteReserveeOuAEngagerUnite()
	 * @generated
	 */
	void setAPourUniteReserveeOuAEngagerUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Secondes Munitions Parametres Imposes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference.
	 * @see #setAPourSecondesMunitionsParametresImposes(TypeParametresImposes)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_APourSecondesMunitionsParametresImposes()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ParametresImposes'"
	 *        extendedMetaData="kind='element' name='APourSecondesMunitions_ParametresImposes'"
	 * @generated
	 */
	TypeParametresImposes getAPourSecondesMunitionsParametresImposes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference.
	 * @see #getAPourSecondesMunitionsParametresImposes()
	 * @generated
	 */
	void setAPourSecondesMunitionsParametresImposes(TypeParametresImposes value);

	/**
	 * Returns the value of the '<em><b>APour Premieres Munitions Parametres Imposes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference.
	 * @see #setAPourPremieresMunitionsParametresImposes(TypeParametresImposes)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_APourPremieresMunitionsParametresImposes()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ParametresImposes'"
	 *        extendedMetaData="kind='element' name='APourPremieresMunitions_ParametresImposes'"
	 * @generated
	 */
	TypeParametresImposes getAPourPremieresMunitionsParametresImposes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference.
	 * @see #getAPourPremieresMunitionsParametresImposes()
	 * @generated
	 */
	void setAPourPremieresMunitionsParametresImposes(TypeParametresImposes value);

	/**
	 * Returns the value of the '<em><b>Commence Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commence Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commence Datation</em>' containment reference.
	 * @see #setCommenceDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_CommenceDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='Commence_Datation'"
	 * @generated
	 */
	TypeDatation getCommenceDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getCommenceDatation <em>Commence Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commence Datation</em>' containment reference.
	 * @see #getCommenceDatation()
	 * @generated
	 */
	void setCommenceDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>Se Termine Datation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Termine Datation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Termine Datation</em>' containment reference.
	 * @see #setSeTermineDatation(TypeDatation)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_SeTermineDatation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Datation'"
	 *        extendedMetaData="kind='element' name='SeTermine_Datation'"
	 * @generated
	 */
	TypeDatation getSeTermineDatation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getSeTermineDatation <em>Se Termine Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se Termine Datation</em>' containment reference.
	 * @see #getSeTermineDatation()
	 * @generated
	 */
	void setSeTermineDatation(TypeDatation value);

	/**
	 * Returns the value of the '<em><b>Concerne Objectif Ciblage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Objectif Ciblage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Objectif Ciblage</em>' containment reference.
	 * @see #setConcerneObjectifCiblage(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_ConcerneObjectifCiblage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourUniteFeuxAEngager_ReservationUnite' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='Concerne_ObjectifCiblage'"
	 * @generated
	 */
	TypeAssociation getConcerneObjectifCiblage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getConcerneObjectifCiblage <em>Concerne Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Objectif Ciblage</em>' containment reference.
	 * @see #getConcerneObjectifCiblage()
	 * @generated
	 */
	void setConcerneObjectifCiblage(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Prevue Par Plan Feux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Prevue Par Plan Feux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Prevue Par Plan Feux</em>' containment reference.
	 * @see #setEstPrevueParPlanFeux(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeReservationUnite_EstPrevueParPlanFeux()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Prevoit_ReservationUnite' target_entity='type_PlanFeux'"
	 *        extendedMetaData="kind='element' name='EstPrevuePar_PlanFeux'"
	 * @generated
	 */
	TypeAssociation getEstPrevueParPlanFeux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReservationUnite#getEstPrevueParPlanFeux <em>Est Prevue Par Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Prevue Par Plan Feux</em>' containment reference.
	 * @see #getEstPrevueParPlanFeux()
	 * @generated
	 */
	void setEstPrevueParPlanFeux(TypeAssociation value);

} // TypeReservationUnite
