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
 * A representation of the model object '<em><b>Type Moyens Evacuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyensEvacuation#getCategorieMoyens <em>Categorie Moyens</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensEvacuation#getMoyensDisponibles <em>Moyens Disponibles</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensEvacuation#getMoyensExistants <em>Moyens Existants</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensEvacuation#getMoyensPreleves <em>Moyens Preleves</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensEvacuation#getMoyensRecus <em>Moyens Recus</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensEvacuation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensEvacuation#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyensEvacuation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyensEvacuation' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyensEvacuation extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie Moyens</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMoyensEvacuationCategorieMoyens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Moyens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Moyens</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyensEvacuationCategorieMoyens
	 * @see #isSetCategorieMoyens()
	 * @see #unsetCategorieMoyens()
	 * @see #setCategorieMoyens(TypeDictionaryDicoMoyensEvacuationCategorieMoyens)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensEvacuation_CategorieMoyens()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='CategorieMoyens'"
	 * @generated
	 */
	TypeDictionaryDicoMoyensEvacuationCategorieMoyens getCategorieMoyens();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getCategorieMoyens <em>Categorie Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Moyens</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMoyensEvacuationCategorieMoyens
	 * @see #isSetCategorieMoyens()
	 * @see #unsetCategorieMoyens()
	 * @see #getCategorieMoyens()
	 * @generated
	 */
	void setCategorieMoyens(TypeDictionaryDicoMoyensEvacuationCategorieMoyens value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getCategorieMoyens <em>Categorie Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieMoyens()
	 * @see #getCategorieMoyens()
	 * @see #setCategorieMoyens(TypeDictionaryDicoMoyensEvacuationCategorieMoyens)
	 * @generated
	 */
	void unsetCategorieMoyens();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensEvacuation#getCategorieMoyens <em>Categorie Moyens</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Moyens</em>' attribute is set.
	 * @see #unsetCategorieMoyens()
	 * @see #getCategorieMoyens()
	 * @see #setCategorieMoyens(TypeDictionaryDicoMoyensEvacuationCategorieMoyens)
	 * @generated
	 */
	boolean isSetCategorieMoyens();

	/**
	 * Returns the value of the '<em><b>Moyens Disponibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Disponibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Disponibles</em>' attribute.
	 * @see #isSetMoyensDisponibles()
	 * @see #unsetMoyensDisponibles()
	 * @see #setMoyensDisponibles(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensEvacuation_MoyensDisponibles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='MoyensDisponibles'"
	 * @generated
	 */
	long getMoyensDisponibles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensDisponibles <em>Moyens Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Disponibles</em>' attribute.
	 * @see #isSetMoyensDisponibles()
	 * @see #unsetMoyensDisponibles()
	 * @see #getMoyensDisponibles()
	 * @generated
	 */
	void setMoyensDisponibles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensDisponibles <em>Moyens Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyensDisponibles()
	 * @see #getMoyensDisponibles()
	 * @see #setMoyensDisponibles(long)
	 * @generated
	 */
	void unsetMoyensDisponibles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensDisponibles <em>Moyens Disponibles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyens Disponibles</em>' attribute is set.
	 * @see #unsetMoyensDisponibles()
	 * @see #getMoyensDisponibles()
	 * @see #setMoyensDisponibles(long)
	 * @generated
	 */
	boolean isSetMoyensDisponibles();

	/**
	 * Returns the value of the '<em><b>Moyens Existants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Existants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Existants</em>' attribute.
	 * @see #isSetMoyensExistants()
	 * @see #unsetMoyensExistants()
	 * @see #setMoyensExistants(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensEvacuation_MoyensExistants()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='MoyensExistants'"
	 * @generated
	 */
	long getMoyensExistants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensExistants <em>Moyens Existants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Existants</em>' attribute.
	 * @see #isSetMoyensExistants()
	 * @see #unsetMoyensExistants()
	 * @see #getMoyensExistants()
	 * @generated
	 */
	void setMoyensExistants(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensExistants <em>Moyens Existants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyensExistants()
	 * @see #getMoyensExistants()
	 * @see #setMoyensExistants(long)
	 * @generated
	 */
	void unsetMoyensExistants();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensExistants <em>Moyens Existants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyens Existants</em>' attribute is set.
	 * @see #unsetMoyensExistants()
	 * @see #getMoyensExistants()
	 * @see #setMoyensExistants(long)
	 * @generated
	 */
	boolean isSetMoyensExistants();

	/**
	 * Returns the value of the '<em><b>Moyens Preleves</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Preleves</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Preleves</em>' attribute.
	 * @see #isSetMoyensPreleves()
	 * @see #unsetMoyensPreleves()
	 * @see #setMoyensPreleves(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensEvacuation_MoyensPreleves()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='MoyensPreleves'"
	 * @generated
	 */
	long getMoyensPreleves();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensPreleves <em>Moyens Preleves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Preleves</em>' attribute.
	 * @see #isSetMoyensPreleves()
	 * @see #unsetMoyensPreleves()
	 * @see #getMoyensPreleves()
	 * @generated
	 */
	void setMoyensPreleves(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensPreleves <em>Moyens Preleves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyensPreleves()
	 * @see #getMoyensPreleves()
	 * @see #setMoyensPreleves(long)
	 * @generated
	 */
	void unsetMoyensPreleves();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensPreleves <em>Moyens Preleves</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyens Preleves</em>' attribute is set.
	 * @see #unsetMoyensPreleves()
	 * @see #getMoyensPreleves()
	 * @see #setMoyensPreleves(long)
	 * @generated
	 */
	boolean isSetMoyensPreleves();

	/**
	 * Returns the value of the '<em><b>Moyens Recus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Recus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Recus</em>' attribute.
	 * @see #isSetMoyensRecus()
	 * @see #unsetMoyensRecus()
	 * @see #setMoyensRecus(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensEvacuation_MoyensRecus()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='MoyensRecus'"
	 * @generated
	 */
	long getMoyensRecus();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensRecus <em>Moyens Recus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Recus</em>' attribute.
	 * @see #isSetMoyensRecus()
	 * @see #unsetMoyensRecus()
	 * @see #getMoyensRecus()
	 * @generated
	 */
	void setMoyensRecus(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensRecus <em>Moyens Recus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyensRecus()
	 * @see #getMoyensRecus()
	 * @see #setMoyensRecus(long)
	 * @generated
	 */
	void unsetMoyensRecus();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensEvacuation#getMoyensRecus <em>Moyens Recus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyens Recus</em>' attribute is set.
	 * @see #unsetMoyensRecus()
	 * @see #getMoyensRecus()
	 * @see #setMoyensRecus(long)
	 * @generated
	 */
	boolean isSetMoyensRecus();

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensEvacuation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensEvacuation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensEvacuation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeMoyensEvacuation
