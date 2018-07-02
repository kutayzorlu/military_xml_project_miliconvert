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
 * A representation of the model object '<em><b>Type Composition Dotation Theorique En Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#isPartieMajeure <em>Partie Majeure</em>}</li>
 *   <li>{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getEstComposantDotationTheorique <em>Est Composant Dotation Theorique</em>}</li>
 *   <li>{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getAPourReferenceType <em>APour Reference Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCompositionDotationTheoriqueEnType()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CompositionDotationTheoriqueEnType' kind='elementOnly'"
 * @generated
 */
public interface TypeCompositionDotationTheoriqueEnType extends EObject {
	/**
	 * Returns the value of the '<em><b>Partie Majeure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partie Majeure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partie Majeure</em>' attribute.
	 * @see #isSetPartieMajeure()
	 * @see #unsetPartieMajeure()
	 * @see #setPartieMajeure(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCompositionDotationTheoriqueEnType_PartieMajeure()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PartieMajeure'"
	 * @generated
	 */
	boolean isPartieMajeure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#isPartieMajeure <em>Partie Majeure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partie Majeure</em>' attribute.
	 * @see #isSetPartieMajeure()
	 * @see #unsetPartieMajeure()
	 * @see #isPartieMajeure()
	 * @generated
	 */
	void setPartieMajeure(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#isPartieMajeure <em>Partie Majeure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPartieMajeure()
	 * @see #isPartieMajeure()
	 * @see #setPartieMajeure(boolean)
	 * @generated
	 */
	void unsetPartieMajeure();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#isPartieMajeure <em>Partie Majeure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Partie Majeure</em>' attribute is set.
	 * @see #unsetPartieMajeure()
	 * @see #isPartieMajeure()
	 * @see #setPartieMajeure(boolean)
	 * @generated
	 */
	boolean isSetPartieMajeure();

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
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeCompositionDotationTheoriqueEnType_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

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
	 * @see mpia.schema.SchemaPackage#getTypeCompositionDotationTheoriqueEnType_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCompositionDotationTheoriqueEnType_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Composant Dotation Theorique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Composant Dotation Theorique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Composant Dotation Theorique</em>' containment reference.
	 * @see #setEstComposantDotationTheorique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCompositionDotationTheoriqueEnType_EstComposantDotationTheorique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSpecifieAuTravers_CompositionDotationTheoriqueEnType' target_entity='type_DotationTheorique'"
	 *        extendedMetaData="kind='element' name='EstComposant_DotationTheorique'"
	 * @generated
	 */
	TypeAssociation getEstComposantDotationTheorique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getEstComposantDotationTheorique <em>Est Composant Dotation Theorique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Composant Dotation Theorique</em>' containment reference.
	 * @see #getEstComposantDotationTheorique()
	 * @generated
	 */
	void setEstComposantDotationTheorique(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Reference Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Reference Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Reference Type</em>' containment reference.
	 * @see #setAPourReferenceType(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCompositionDotationTheoriqueEnType_APourReferenceType()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSpecifieCommePart_CompositionDotationTheoriqueEnType' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='APourReference_Type'"
	 * @generated
	 */
	TypeAssociation getAPourReferenceType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompositionDotationTheoriqueEnType#getAPourReferenceType <em>APour Reference Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Reference Type</em>' containment reference.
	 * @see #getAPourReferenceType()
	 * @generated
	 */
	void setAPourReferenceType(TypeAssociation value);

} // TypeCompositionDotationTheoriqueEnType
