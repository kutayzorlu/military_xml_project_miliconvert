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
 * A representation of the model object '<em><b>Type Rapport Force</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRapportForce#getPonderationForceEni <em>Ponderation Force Eni</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getQuantiteMoyenAmi <em>Quantite Moyen Ami</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getPonderationForceAmi <em>Ponderation Force Ami</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getQuantiteMoyenEni <em>Quantite Moyen Eni</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getCorrespondHoraireManoeuvre <em>Correspond Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeRapportForce#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRapportForce()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_RapportForce' kind='elementOnly'"
 * @generated
 */
public interface TypeRapportForce extends EObject {
	/**
	 * Returns the value of the '<em><b>Ponderation Force Eni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ponderation Force Eni</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ponderation Force Eni</em>' attribute.
	 * @see #isSetPonderationForceEni()
	 * @see #unsetPonderationForceEni()
	 * @see #setPonderationForceEni(long)
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_PonderationForceEni()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='PonderationForceEni'"
	 * @generated
	 */
	long getPonderationForceEni();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getPonderationForceEni <em>Ponderation Force Eni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ponderation Force Eni</em>' attribute.
	 * @see #isSetPonderationForceEni()
	 * @see #unsetPonderationForceEni()
	 * @see #getPonderationForceEni()
	 * @generated
	 */
	void setPonderationForceEni(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapportForce#getPonderationForceEni <em>Ponderation Force Eni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPonderationForceEni()
	 * @see #getPonderationForceEni()
	 * @see #setPonderationForceEni(long)
	 * @generated
	 */
	void unsetPonderationForceEni();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapportForce#getPonderationForceEni <em>Ponderation Force Eni</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ponderation Force Eni</em>' attribute is set.
	 * @see #unsetPonderationForceEni()
	 * @see #getPonderationForceEni()
	 * @see #setPonderationForceEni(long)
	 * @generated
	 */
	boolean isSetPonderationForceEni();

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
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Quantite Moyen Ami</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Moyen Ami</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Moyen Ami</em>' attribute.
	 * @see #isSetQuantiteMoyenAmi()
	 * @see #unsetQuantiteMoyenAmi()
	 * @see #setQuantiteMoyenAmi(long)
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_QuantiteMoyenAmi()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='QuantiteMoyenAmi'"
	 * @generated
	 */
	long getQuantiteMoyenAmi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getQuantiteMoyenAmi <em>Quantite Moyen Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Moyen Ami</em>' attribute.
	 * @see #isSetQuantiteMoyenAmi()
	 * @see #unsetQuantiteMoyenAmi()
	 * @see #getQuantiteMoyenAmi()
	 * @generated
	 */
	void setQuantiteMoyenAmi(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapportForce#getQuantiteMoyenAmi <em>Quantite Moyen Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMoyenAmi()
	 * @see #getQuantiteMoyenAmi()
	 * @see #setQuantiteMoyenAmi(long)
	 * @generated
	 */
	void unsetQuantiteMoyenAmi();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapportForce#getQuantiteMoyenAmi <em>Quantite Moyen Ami</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Moyen Ami</em>' attribute is set.
	 * @see #unsetQuantiteMoyenAmi()
	 * @see #getQuantiteMoyenAmi()
	 * @see #setQuantiteMoyenAmi(long)
	 * @generated
	 */
	boolean isSetQuantiteMoyenAmi();

	/**
	 * Returns the value of the '<em><b>Ponderation Force Ami</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ponderation Force Ami</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ponderation Force Ami</em>' attribute.
	 * @see #isSetPonderationForceAmi()
	 * @see #unsetPonderationForceAmi()
	 * @see #setPonderationForceAmi(long)
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_PonderationForceAmi()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='PonderationForceAmi'"
	 * @generated
	 */
	long getPonderationForceAmi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getPonderationForceAmi <em>Ponderation Force Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ponderation Force Ami</em>' attribute.
	 * @see #isSetPonderationForceAmi()
	 * @see #unsetPonderationForceAmi()
	 * @see #getPonderationForceAmi()
	 * @generated
	 */
	void setPonderationForceAmi(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRapportForce#getPonderationForceAmi <em>Ponderation Force Ami</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPonderationForceAmi()
	 * @see #getPonderationForceAmi()
	 * @see #setPonderationForceAmi(long)
	 * @generated
	 */
	void unsetPonderationForceAmi();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRapportForce#getPonderationForceAmi <em>Ponderation Force Ami</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ponderation Force Ami</em>' attribute is set.
	 * @see #unsetPonderationForceAmi()
	 * @see #getPonderationForceAmi()
	 * @see #setPonderationForceAmi(long)
	 * @generated
	 */
	boolean isSetPonderationForceAmi();

	/**
	 * Returns the value of the '<em><b>Quantite Moyen Eni</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Moyen Eni</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Moyen Eni</em>' attribute.
	 * @see #setQuantiteMoyenEni(String)
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_QuantiteMoyenEni()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='QuantiteMoyenEni'"
	 * @generated
	 */
	String getQuantiteMoyenEni();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getQuantiteMoyenEni <em>Quantite Moyen Eni</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Moyen Eni</em>' attribute.
	 * @see #getQuantiteMoyenEni()
	 * @generated
	 */
	void setQuantiteMoyenEni(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Materiel</em>' containment reference.
	 * @see #setConcerneTypeMateriel(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_ConcerneTypeMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='Concerne_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Materiel</em>' containment reference.
	 * @see #getConcerneTypeMateriel()
	 * @generated
	 */
	void setConcerneTypeMateriel(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Correspond Horaire Manoeuvre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspond Horaire Manoeuvre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspond Horaire Manoeuvre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_CorrespondHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='DecritRapportForce_RapportForce' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='Correspond_HoraireManoeuvre'"
	 * @generated
	 */
	EList<TypeAssociation> getCorrespondHoraireManoeuvre();

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeRapportForce_EstRapporteeParRapport()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRapportForce#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeRapportForce
