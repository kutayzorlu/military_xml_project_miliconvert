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
 * A representation of the model object '<em><b>Type Zones Implantation Proposees</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZonesImplantationProposees#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.TypeZonesImplantationProposees#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeZonesImplantationProposees#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeZonesImplantationProposees#getACommeLocalisationProposeeAutreElementControle <em>AComme Localisation Proposee Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeZonesImplantationProposees#getACommeLocalisationAlternativeAutreElementControle <em>AComme Localisation Alternative Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZonesImplantationProposees()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ZonesImplantationProposees' kind='elementOnly'"
 * @generated
 */
public interface TypeZonesImplantationProposees extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Ordre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Ordre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @see mpia.schema.SchemaPackage#getTypeZonesImplantationProposees_NumeroOrdre()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NumeroOrdre'"
	 * @generated
	 */
	long getNumeroOrdre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZonesImplantationProposees#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Ordre</em>' attribute.
	 * @see #isSetNumeroOrdre()
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @generated
	 */
	void setNumeroOrdre(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZonesImplantationProposees#getNumeroOrdre <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	void unsetNumeroOrdre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZonesImplantationProposees#getNumeroOrdre <em>Numero Ordre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Ordre</em>' attribute is set.
	 * @see #unsetNumeroOrdre()
	 * @see #getNumeroOrdre()
	 * @see #setNumeroOrdre(long)
	 * @generated
	 */
	boolean isSetNumeroOrdre();

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
	 * @see mpia.schema.SchemaPackage#getTypeZonesImplantationProposees_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZonesImplantationProposees#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeZonesImplantationProposees_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZonesImplantationProposees#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AComme Localisation Proposee Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Localisation Proposee Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Localisation Proposee Autre Element Controle</em>' containment reference.
	 * @see #setACommeLocalisationProposeeAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeZonesImplantationProposees_ACommeLocalisationProposeeAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeLocalisationProposee_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeLocalisationProposeeAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZonesImplantationProposees#getACommeLocalisationProposeeAutreElementControle <em>AComme Localisation Proposee Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Localisation Proposee Autre Element Controle</em>' containment reference.
	 * @see #getACommeLocalisationProposeeAutreElementControle()
	 * @generated
	 */
	void setACommeLocalisationProposeeAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AComme Localisation Alternative Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Localisation Alternative Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Localisation Alternative Autre Element Controle</em>' containment reference.
	 * @see #setACommeLocalisationAlternativeAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeZonesImplantationProposees_ACommeLocalisationAlternativeAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeLocalisationAlternative_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeLocalisationAlternativeAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZonesImplantationProposees#getACommeLocalisationAlternativeAutreElementControle <em>AComme Localisation Alternative Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Localisation Alternative Autre Element Controle</em>' containment reference.
	 * @see #getACommeLocalisationAlternativeAutreElementControle()
	 * @generated
	 */
	void setACommeLocalisationAlternativeAutreElementControle(TypeAssociation value);

} // TypeZonesImplantationProposees
