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
 * A representation of the model object '<em><b>Type Degre Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDegreClassification#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.TypeDegreClassification#getPolitique <em>Politique</em>}</li>
 *   <li>{@link mpia.schema.TypeDegreClassification#getAvertissement <em>Avertissement</em>}</li>
 *   <li>{@link mpia.schema.TypeDegreClassification#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDegreClassification#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDegreClassification()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DegreClassification' kind='elementOnly'"
 * @generated
 */
public interface TypeDegreClassification extends EObject {
	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDegreClassificationNiveau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDegreClassificationNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #setNiveau(TypeDictionaryDicoDegreClassificationNiveau)
	 * @see mpia.schema.SchemaPackage#getTypeDegreClassification_Niveau()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Niveau'"
	 * @generated
	 */
	TypeDictionaryDicoDegreClassificationNiveau getNiveau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDegreClassification#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDegreClassificationNiveau
	 * @see #isSetNiveau()
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(TypeDictionaryDicoDegreClassificationNiveau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDegreClassification#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoDegreClassificationNiveau)
	 * @generated
	 */
	void unsetNiveau();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDegreClassification#getNiveau <em>Niveau</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau</em>' attribute is set.
	 * @see #unsetNiveau()
	 * @see #getNiveau()
	 * @see #setNiveau(TypeDictionaryDicoDegreClassificationNiveau)
	 * @generated
	 */
	boolean isSetNiveau();

	/**
	 * Returns the value of the '<em><b>Politique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Politique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Politique</em>' attribute.
	 * @see #setPolitique(String)
	 * @see mpia.schema.SchemaPackage#getTypeDegreClassification_Politique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='Politique'"
	 * @generated
	 */
	String getPolitique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDegreClassification#getPolitique <em>Politique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Politique</em>' attribute.
	 * @see #getPolitique()
	 * @generated
	 */
	void setPolitique(String value);

	/**
	 * Returns the value of the '<em><b>Avertissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avertissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avertissement</em>' attribute.
	 * @see #setAvertissement(String)
	 * @see mpia.schema.SchemaPackage#getTypeDegreClassification_Avertissement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='Avertissement'"
	 * @generated
	 */
	String getAvertissement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDegreClassification#getAvertissement <em>Avertissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avertissement</em>' attribute.
	 * @see #getAvertissement()
	 * @generated
	 */
	void setAvertissement(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDegreClassification_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDegreClassification#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDegreClassification_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDegreClassification#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeDegreClassification
