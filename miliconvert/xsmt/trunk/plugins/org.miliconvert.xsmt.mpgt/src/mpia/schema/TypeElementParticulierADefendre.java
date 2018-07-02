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
 * A representation of the model object '<em><b>Type Element Particulier ADefendre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeElementParticulierADefendre#getNatureElement <em>Nature Element</em>}</li>
 *   <li>{@link mpia.schema.TypeElementParticulierADefendre#getPrioriteDefense <em>Priorite Defense</em>}</li>
 *   <li>{@link mpia.schema.TypeElementParticulierADefendre#getACommeLocalisationAutreElementControle <em>AComme Localisation Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeElementParticulierADefendre()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ElementParticulierADefendre' kind='elementOnly'"
 * @generated
 */
public interface TypeElementParticulierADefendre extends EObject {
	/**
	 * Returns the value of the '<em><b>Nature Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Element</em>' attribute.
	 * @see #setNatureElement(String)
	 * @see mpia.schema.SchemaPackage#getTypeElementParticulierADefendre_NatureElement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='NatureElement'"
	 * @generated
	 */
	String getNatureElement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementParticulierADefendre#getNatureElement <em>Nature Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Element</em>' attribute.
	 * @see #getNatureElement()
	 * @generated
	 */
	void setNatureElement(String value);

	/**
	 * Returns the value of the '<em><b>Priorite Defense</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPriorite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Defense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Defense</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPrioriteDefense()
	 * @see #unsetPrioriteDefense()
	 * @see #setPrioriteDefense(TypeDictionaryDicoPriorite)
	 * @see mpia.schema.SchemaPackage#getTypeElementParticulierADefendre_PrioriteDefense()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrioriteDefense'"
	 * @generated
	 */
	TypeDictionaryDicoPriorite getPrioriteDefense();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementParticulierADefendre#getPrioriteDefense <em>Priorite Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite Defense</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPriorite
	 * @see #isSetPrioriteDefense()
	 * @see #unsetPrioriteDefense()
	 * @see #getPrioriteDefense()
	 * @generated
	 */
	void setPrioriteDefense(TypeDictionaryDicoPriorite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeElementParticulierADefendre#getPrioriteDefense <em>Priorite Defense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrioriteDefense()
	 * @see #getPrioriteDefense()
	 * @see #setPrioriteDefense(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	void unsetPrioriteDefense();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeElementParticulierADefendre#getPrioriteDefense <em>Priorite Defense</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite Defense</em>' attribute is set.
	 * @see #unsetPrioriteDefense()
	 * @see #getPrioriteDefense()
	 * @see #setPrioriteDefense(TypeDictionaryDicoPriorite)
	 * @generated
	 */
	boolean isSetPrioriteDefense();

	/**
	 * Returns the value of the '<em><b>AComme Localisation Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Localisation Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Localisation Autre Element Controle</em>' containment reference.
	 * @see #setACommeLocalisationAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeElementParticulierADefendre_ACommeLocalisationAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ACommeLocalisation_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getACommeLocalisationAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeElementParticulierADefendre#getACommeLocalisationAutreElementControle <em>AComme Localisation Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Localisation Autre Element Controle</em>' containment reference.
	 * @see #getACommeLocalisationAutreElementControle()
	 * @generated
	 */
	void setACommeLocalisationAutreElementControle(TypeAssociation value);

} // TypeElementParticulierADefendre
