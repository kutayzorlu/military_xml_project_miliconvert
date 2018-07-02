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
 * A representation of the model object '<em><b>Type Association Instance Objet Capacite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getAssocieCapaciteInstanceObjet <em>Associe Capacite Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getPorteSurCapaciteCapacite <em>Porte Sur Capacite Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetCapacite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationInstanceObjetCapacite' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationInstanceObjetCapacite extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetCapacite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetCapacite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Priorite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPrioriteMission}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrioriteMission
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPrioriteMission)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetCapacite_Priorite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Priorite'"
	 * @generated
	 */
	TypeDictionaryDicoPrioriteMission getPriorite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPrioriteMission
	 * @see #isSetPriorite()
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @generated
	 */
	void setPriorite(TypeDictionaryDicoPrioriteMission value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getPriorite <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPrioriteMission)
	 * @generated
	 */
	void unsetPriorite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getPriorite <em>Priorite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite</em>' attribute is set.
	 * @see #unsetPriorite()
	 * @see #getPriorite()
	 * @see #setPriorite(TypeDictionaryDicoPrioriteMission)
	 * @generated
	 */
	boolean isSetPriorite();

	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(double)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetCapacite_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	double getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(double)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(double)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Associe Capacite Instance Objet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Capacite Instance Objet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Capacite Instance Objet</em>' containment reference.
	 * @see #setAssocieCapaciteInstanceObjet(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetCapacite_AssocieCapaciteInstanceObjet()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourCapacite_AssociationInstanceObjetCapacite' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='AssocieCapacite_InstanceObjet'"
	 * @generated
	 */
	TypeAssociation getAssocieCapaciteInstanceObjet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getAssocieCapaciteInstanceObjet <em>Associe Capacite Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Capacite Instance Objet</em>' containment reference.
	 * @see #getAssocieCapaciteInstanceObjet()
	 * @generated
	 */
	void setAssocieCapaciteInstanceObjet(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Porte Sur Capacite Capacite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porte Sur Capacite Capacite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porte Sur Capacite Capacite</em>' containment reference.
	 * @see #setPorteSurCapaciteCapacite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetCapacite_PorteSurCapaciteCapacite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Capacite'"
	 *        extendedMetaData="kind='element' name='PorteSurCapacite_Capacite'"
	 * @generated
	 */
	TypeAssociation getPorteSurCapaciteCapacite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getPorteSurCapaciteCapacite <em>Porte Sur Capacite Capacite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porte Sur Capacite Capacite</em>' containment reference.
	 * @see #getPorteSurCapaciteCapacite()
	 * @generated
	 */
	void setPorteSurCapaciteCapacite(TypeAssociation value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationInstanceObjetCapacite_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationInstanceObjetCapacite#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAssociationInstanceObjetCapacite
