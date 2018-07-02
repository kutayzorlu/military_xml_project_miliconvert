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
 * A representation of the model object '<em><b>Type Pertes Par Periode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePertesParPeriode#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePertesParPeriode#getNombreMorts <em>Nombre Morts</em>}</li>
 *   <li>{@link mpia.schema.TypePertesParPeriode#getNombreInterventions <em>Nombre Interventions</em>}</li>
 *   <li>{@link mpia.schema.TypePertesParPeriode#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePertesParPeriode#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePertesParPeriode()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PertesParPeriode' kind='elementOnly'"
 * @generated
 */
public interface TypePertesParPeriode extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCategoriePatients}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCategoriePatients
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCategoriePatients)
	 * @see mpia.schema.SchemaPackage#getTypePertesParPeriode_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCategoriePatients getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesParPeriode#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCategoriePatients
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCategoriePatients value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePertesParPeriode#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCategoriePatients)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePertesParPeriode#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCategoriePatients)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Nombre Morts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Morts</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Morts</em>' attribute.
	 * @see #isSetNombreMorts()
	 * @see #unsetNombreMorts()
	 * @see #setNombreMorts(long)
	 * @see mpia.schema.SchemaPackage#getTypePertesParPeriode_NombreMorts()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NombreMorts'"
	 * @generated
	 */
	long getNombreMorts();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesParPeriode#getNombreMorts <em>Nombre Morts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Morts</em>' attribute.
	 * @see #isSetNombreMorts()
	 * @see #unsetNombreMorts()
	 * @see #getNombreMorts()
	 * @generated
	 */
	void setNombreMorts(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePertesParPeriode#getNombreMorts <em>Nombre Morts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMorts()
	 * @see #getNombreMorts()
	 * @see #setNombreMorts(long)
	 * @generated
	 */
	void unsetNombreMorts();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePertesParPeriode#getNombreMorts <em>Nombre Morts</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Morts</em>' attribute is set.
	 * @see #unsetNombreMorts()
	 * @see #getNombreMorts()
	 * @see #setNombreMorts(long)
	 * @generated
	 */
	boolean isSetNombreMorts();

	/**
	 * Returns the value of the '<em><b>Nombre Interventions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Interventions</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Interventions</em>' attribute.
	 * @see #isSetNombreInterventions()
	 * @see #unsetNombreInterventions()
	 * @see #setNombreInterventions(long)
	 * @see mpia.schema.SchemaPackage#getTypePertesParPeriode_NombreInterventions()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NombreInterventions'"
	 * @generated
	 */
	long getNombreInterventions();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesParPeriode#getNombreInterventions <em>Nombre Interventions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Interventions</em>' attribute.
	 * @see #isSetNombreInterventions()
	 * @see #unsetNombreInterventions()
	 * @see #getNombreInterventions()
	 * @generated
	 */
	void setNombreInterventions(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePertesParPeriode#getNombreInterventions <em>Nombre Interventions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreInterventions()
	 * @see #getNombreInterventions()
	 * @see #setNombreInterventions(long)
	 * @generated
	 */
	void unsetNombreInterventions();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePertesParPeriode#getNombreInterventions <em>Nombre Interventions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Interventions</em>' attribute is set.
	 * @see #unsetNombreInterventions()
	 * @see #getNombreInterventions()
	 * @see #setNombreInterventions(long)
	 * @generated
	 */
	boolean isSetNombreInterventions();

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
	 * @see mpia.schema.SchemaPackage#getTypePertesParPeriode_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesParPeriode#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePertesParPeriode_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePertesParPeriode#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypePertesParPeriode
