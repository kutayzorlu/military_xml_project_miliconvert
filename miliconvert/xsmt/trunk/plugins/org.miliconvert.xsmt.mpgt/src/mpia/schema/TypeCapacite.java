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
 * A representation of the model object '<em><b>Type Capacite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapacite#getUnite <em>Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCapacite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCapacite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCapacite#getConditionLumiere <em>Condition Lumiere</em>}</li>
 *   <li>{@link mpia.schema.TypeCapacite#getEstCapaciteAssociationActiviteCapacite <em>Est Capacite Association Activite Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeCapacite#getEstPossedeeParTypeAssociationTypeCapacite <em>Est Possedee Par Type Association Type Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeCapacite#getAPourDocumentAssocieAssociationDocumentCapacite <em>APour Document Associe Association Document Capacite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapacite()
 * @model abstract="true"
 *        extendedMetaData="name='type_Capacite' kind='elementOnly'"
 * @generated
 */
public interface TypeCapacite extends EObject {
	/**
	 * Returns the value of the '<em><b>Unite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteUnite
	 * @see #isSetUnite()
	 * @see #unsetUnite()
	 * @see #setUnite(TypeDictionaryDicoCapaciteUnite)
	 * @see mpia.schema.SchemaPackage#getTypeCapacite_Unite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Unite'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteUnite getUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapacite#getUnite <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteUnite
	 * @see #isSetUnite()
	 * @see #unsetUnite()
	 * @see #getUnite()
	 * @generated
	 */
	void setUnite(TypeDictionaryDicoCapaciteUnite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapacite#getUnite <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnite()
	 * @see #getUnite()
	 * @see #setUnite(TypeDictionaryDicoCapaciteUnite)
	 * @generated
	 */
	void unsetUnite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapacite#getUnite <em>Unite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite</em>' attribute is set.
	 * @see #unsetUnite()
	 * @see #getUnite()
	 * @see #setUnite(TypeDictionaryDicoCapaciteUnite)
	 * @generated
	 */
	boolean isSetUnite();

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
	 * @see mpia.schema.SchemaPackage#getTypeCapacite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapacite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCapacite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapacite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Condition Lumiere</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCapaciteConditionLumiere}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Lumiere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Lumiere</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteConditionLumiere
	 * @see #isSetConditionLumiere()
	 * @see #unsetConditionLumiere()
	 * @see #setConditionLumiere(TypeDictionaryDicoCapaciteConditionLumiere)
	 * @see mpia.schema.SchemaPackage#getTypeCapacite_ConditionLumiere()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConditionLumiere'"
	 * @generated
	 */
	TypeDictionaryDicoCapaciteConditionLumiere getConditionLumiere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapacite#getConditionLumiere <em>Condition Lumiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Lumiere</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCapaciteConditionLumiere
	 * @see #isSetConditionLumiere()
	 * @see #unsetConditionLumiere()
	 * @see #getConditionLumiere()
	 * @generated
	 */
	void setConditionLumiere(TypeDictionaryDicoCapaciteConditionLumiere value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapacite#getConditionLumiere <em>Condition Lumiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionLumiere()
	 * @see #getConditionLumiere()
	 * @see #setConditionLumiere(TypeDictionaryDicoCapaciteConditionLumiere)
	 * @generated
	 */
	void unsetConditionLumiere();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapacite#getConditionLumiere <em>Condition Lumiere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Condition Lumiere</em>' attribute is set.
	 * @see #unsetConditionLumiere()
	 * @see #getConditionLumiere()
	 * @see #setConditionLumiere(TypeDictionaryDicoCapaciteConditionLumiere)
	 * @generated
	 */
	boolean isSetConditionLumiere();

	/**
	 * Returns the value of the '<em><b>Est Capacite Association Activite Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Capacite Association Activite Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Capacite Association Activite Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCapacite_EstCapaciteAssociationActiviteCapacite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeCapacite_Capacite' target_entity='type_AssociationActiviteCapacite'"
	 *        extendedMetaData="kind='element' name='EstCapacite_AssociationActiviteCapacite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstCapaciteAssociationActiviteCapacite();

	/**
	 * Returns the value of the '<em><b>Est Possedee Par Type Association Type Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Possedee Par Type Association Type Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Possedee Par Type Association Type Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCapacite_EstPossedeeParTypeAssociationTypeCapacite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='PorteSurCapacite_Capacite' target_entity='type_AssociationTypeCapacite'"
	 *        extendedMetaData="kind='element' name='EstPossedeeParType_AssociationTypeCapacite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstPossedeeParTypeAssociationTypeCapacite();

	/**
	 * Returns the value of the '<em><b>APour Document Associe Association Document Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Document Associe Association Document Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Document Associe Association Document Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCapacite_APourDocumentAssocieAssociationDocumentCapacite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Capacite' target_entity='type_AssociationDocumentCapacite'"
	 *        extendedMetaData="kind='element' name='APourDocumentAssocie_AssociationDocumentCapacite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourDocumentAssocieAssociationDocumentCapacite();

} // TypeCapacite
