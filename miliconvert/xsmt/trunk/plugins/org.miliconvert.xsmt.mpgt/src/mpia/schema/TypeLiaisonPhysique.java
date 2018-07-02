/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Liaison Physique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLiaisonPhysique#getCodeStanag3596 <em>Code Stanag3596</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonPhysique#getTypeProduit <em>Type Produit</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonPhysique#getDebit <em>Debit</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonPhysique#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonPhysique#getTypeDebit <em>Type Debit</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonPhysique#getTypeInstallation <em>Type Installation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLiaisonPhysique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_LiaisonPhysique' kind='elementOnly'"
 * @generated
 */
public interface TypeLiaisonPhysique extends EObject {
	/**
	 * Returns the value of the '<em><b>Code Stanag3596</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Stanag3596</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Stanag3596</em>' attribute.
	 * @see #setCodeStanag3596(String)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonPhysique_CodeStanag3596()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='CodeStanag3596'"
	 * @generated
	 */
	String getCodeStanag3596();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonPhysique#getCodeStanag3596 <em>Code Stanag3596</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Stanag3596</em>' attribute.
	 * @see #getCodeStanag3596()
	 * @generated
	 */
	void setCodeStanag3596(String value);

	/**
	 * Returns the value of the '<em><b>Type Produit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Produit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Produit</em>' attribute.
	 * @see #setTypeProduit(String)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonPhysique_TypeProduit()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='TypeProduit'"
	 * @generated
	 */
	String getTypeProduit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonPhysique#getTypeProduit <em>Type Produit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Produit</em>' attribute.
	 * @see #getTypeProduit()
	 * @generated
	 */
	void setTypeProduit(String value);

	/**
	 * Returns the value of the '<em><b>Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit</em>' attribute.
	 * @see #isSetDebit()
	 * @see #unsetDebit()
	 * @see #setDebit(long)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonPhysique_Debit()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier15"
	 *        extendedMetaData="kind='element' name='Debit'"
	 * @generated
	 */
	long getDebit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonPhysique#getDebit <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit</em>' attribute.
	 * @see #isSetDebit()
	 * @see #unsetDebit()
	 * @see #getDebit()
	 * @generated
	 */
	void setDebit(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonPhysique#getDebit <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDebit()
	 * @see #getDebit()
	 * @see #setDebit(long)
	 * @generated
	 */
	void unsetDebit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonPhysique#getDebit <em>Debit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Debit</em>' attribute is set.
	 * @see #unsetDebit()
	 * @see #getDebit()
	 * @see #setDebit(long)
	 * @generated
	 */
	boolean isSetDebit();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonPhysique_Type()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonPhysique#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Type Debit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Debit</em>' attribute.
	 * @see #setTypeDebit(String)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonPhysique_TypeDebit()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='TypeDebit'"
	 * @generated
	 */
	String getTypeDebit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonPhysique#getTypeDebit <em>Type Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Debit</em>' attribute.
	 * @see #getTypeDebit()
	 * @generated
	 */
	void setTypeDebit(String value);

	/**
	 * Returns the value of the '<em><b>Type Installation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonPhysiqueTypeInstallation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Installation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Installation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonPhysiqueTypeInstallation
	 * @see #isSetTypeInstallation()
	 * @see #unsetTypeInstallation()
	 * @see #setTypeInstallation(TypeDictionaryDicoLiaisonPhysiqueTypeInstallation)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonPhysique_TypeInstallation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeInstallation'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonPhysiqueTypeInstallation getTypeInstallation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonPhysique#getTypeInstallation <em>Type Installation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Installation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonPhysiqueTypeInstallation
	 * @see #isSetTypeInstallation()
	 * @see #unsetTypeInstallation()
	 * @see #getTypeInstallation()
	 * @generated
	 */
	void setTypeInstallation(TypeDictionaryDicoLiaisonPhysiqueTypeInstallation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonPhysique#getTypeInstallation <em>Type Installation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeInstallation()
	 * @see #getTypeInstallation()
	 * @see #setTypeInstallation(TypeDictionaryDicoLiaisonPhysiqueTypeInstallation)
	 * @generated
	 */
	void unsetTypeInstallation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonPhysique#getTypeInstallation <em>Type Installation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Installation</em>' attribute is set.
	 * @see #unsetTypeInstallation()
	 * @see #getTypeInstallation()
	 * @see #setTypeInstallation(TypeDictionaryDicoLiaisonPhysiqueTypeInstallation)
	 * @generated
	 */
	boolean isSetTypeInstallation();

} // TypeLiaisonPhysique
