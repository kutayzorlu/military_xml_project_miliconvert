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
 * A representation of the model object '<em><b>Type Blesses Par Periode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBlessesParPeriode#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeBlessesParPeriode#getQuantiteArrives <em>Quantite Arrives</em>}</li>
 *   <li>{@link mpia.schema.TypeBlessesParPeriode#getQuantiteAdmis <em>Quantite Admis</em>}</li>
 *   <li>{@link mpia.schema.TypeBlessesParPeriode#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeBlessesParPeriode#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBlessesParPeriode()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_BlessesParPeriode' kind='elementOnly'"
 * @generated
 */
public interface TypeBlessesParPeriode extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoBlessesParPeriodeCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoBlessesParPeriodeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoBlessesParPeriodeCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeBlessesParPeriode_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoBlessesParPeriodeCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBlessesParPeriode#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoBlessesParPeriodeCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoBlessesParPeriodeCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBlessesParPeriode#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoBlessesParPeriodeCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBlessesParPeriode#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoBlessesParPeriodeCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Quantite Arrives</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Arrives</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Arrives</em>' attribute.
	 * @see #isSetQuantiteArrives()
	 * @see #unsetQuantiteArrives()
	 * @see #setQuantiteArrives(long)
	 * @see mpia.schema.SchemaPackage#getTypeBlessesParPeriode_QuantiteArrives()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteArrives'"
	 * @generated
	 */
	long getQuantiteArrives();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBlessesParPeriode#getQuantiteArrives <em>Quantite Arrives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Arrives</em>' attribute.
	 * @see #isSetQuantiteArrives()
	 * @see #unsetQuantiteArrives()
	 * @see #getQuantiteArrives()
	 * @generated
	 */
	void setQuantiteArrives(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBlessesParPeriode#getQuantiteArrives <em>Quantite Arrives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteArrives()
	 * @see #getQuantiteArrives()
	 * @see #setQuantiteArrives(long)
	 * @generated
	 */
	void unsetQuantiteArrives();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBlessesParPeriode#getQuantiteArrives <em>Quantite Arrives</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Arrives</em>' attribute is set.
	 * @see #unsetQuantiteArrives()
	 * @see #getQuantiteArrives()
	 * @see #setQuantiteArrives(long)
	 * @generated
	 */
	boolean isSetQuantiteArrives();

	/**
	 * Returns the value of the '<em><b>Quantite Admis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Admis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Admis</em>' attribute.
	 * @see #isSetQuantiteAdmis()
	 * @see #unsetQuantiteAdmis()
	 * @see #setQuantiteAdmis(long)
	 * @see mpia.schema.SchemaPackage#getTypeBlessesParPeriode_QuantiteAdmis()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteAdmis'"
	 * @generated
	 */
	long getQuantiteAdmis();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBlessesParPeriode#getQuantiteAdmis <em>Quantite Admis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Admis</em>' attribute.
	 * @see #isSetQuantiteAdmis()
	 * @see #unsetQuantiteAdmis()
	 * @see #getQuantiteAdmis()
	 * @generated
	 */
	void setQuantiteAdmis(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeBlessesParPeriode#getQuantiteAdmis <em>Quantite Admis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteAdmis()
	 * @see #getQuantiteAdmis()
	 * @see #setQuantiteAdmis(long)
	 * @generated
	 */
	void unsetQuantiteAdmis();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeBlessesParPeriode#getQuantiteAdmis <em>Quantite Admis</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Admis</em>' attribute is set.
	 * @see #unsetQuantiteAdmis()
	 * @see #getQuantiteAdmis()
	 * @see #setQuantiteAdmis(long)
	 * @generated
	 */
	boolean isSetQuantiteAdmis();

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
	 * @see mpia.schema.SchemaPackage#getTypeBlessesParPeriode_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBlessesParPeriode#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeBlessesParPeriode_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBlessesParPeriode#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeBlessesParPeriode
