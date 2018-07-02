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
 * A representation of the model object '<em><b>Type Occupation Lits</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeOccupationLits#getCategoriePatients <em>Categorie Patients</em>}</li>
 *   <li>{@link mpia.schema.TypeOccupationLits#getNbOccupants <em>Nb Occupants</em>}</li>
 *   <li>{@link mpia.schema.TypeOccupationLits#getNbBlessesNRBC <em>Nb Blesses NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeOccupationLits#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeOccupationLits#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeOccupationLits()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_OccupationLits' kind='elementOnly'"
 * @generated
 */
public interface TypeOccupationLits extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie Patients</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCategoriePatients}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Patients</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Patients</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCategoriePatients
	 * @see #isSetCategoriePatients()
	 * @see #unsetCategoriePatients()
	 * @see #setCategoriePatients(TypeDictionaryDicoCategoriePatients)
	 * @see mpia.schema.SchemaPackage#getTypeOccupationLits_CategoriePatients()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='CategoriePatients'"
	 * @generated
	 */
	TypeDictionaryDicoCategoriePatients getCategoriePatients();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOccupationLits#getCategoriePatients <em>Categorie Patients</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Patients</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCategoriePatients
	 * @see #isSetCategoriePatients()
	 * @see #unsetCategoriePatients()
	 * @see #getCategoriePatients()
	 * @generated
	 */
	void setCategoriePatients(TypeDictionaryDicoCategoriePatients value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeOccupationLits#getCategoriePatients <em>Categorie Patients</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategoriePatients()
	 * @see #getCategoriePatients()
	 * @see #setCategoriePatients(TypeDictionaryDicoCategoriePatients)
	 * @generated
	 */
	void unsetCategoriePatients();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOccupationLits#getCategoriePatients <em>Categorie Patients</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Patients</em>' attribute is set.
	 * @see #unsetCategoriePatients()
	 * @see #getCategoriePatients()
	 * @see #setCategoriePatients(TypeDictionaryDicoCategoriePatients)
	 * @generated
	 */
	boolean isSetCategoriePatients();

	/**
	 * Returns the value of the '<em><b>Nb Occupants</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Occupants</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Occupants</em>' attribute.
	 * @see #isSetNbOccupants()
	 * @see #unsetNbOccupants()
	 * @see #setNbOccupants(long)
	 * @see mpia.schema.SchemaPackage#getTypeOccupationLits_NbOccupants()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NbOccupants'"
	 * @generated
	 */
	long getNbOccupants();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOccupationLits#getNbOccupants <em>Nb Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Occupants</em>' attribute.
	 * @see #isSetNbOccupants()
	 * @see #unsetNbOccupants()
	 * @see #getNbOccupants()
	 * @generated
	 */
	void setNbOccupants(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeOccupationLits#getNbOccupants <em>Nb Occupants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbOccupants()
	 * @see #getNbOccupants()
	 * @see #setNbOccupants(long)
	 * @generated
	 */
	void unsetNbOccupants();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOccupationLits#getNbOccupants <em>Nb Occupants</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Occupants</em>' attribute is set.
	 * @see #unsetNbOccupants()
	 * @see #getNbOccupants()
	 * @see #setNbOccupants(long)
	 * @generated
	 */
	boolean isSetNbOccupants();

	/**
	 * Returns the value of the '<em><b>Nb Blesses NRBC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Blesses NRBC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Blesses NRBC</em>' attribute.
	 * @see #isSetNbBlessesNRBC()
	 * @see #unsetNbBlessesNRBC()
	 * @see #setNbBlessesNRBC(long)
	 * @see mpia.schema.SchemaPackage#getTypeOccupationLits_NbBlessesNRBC()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='NbBlessesNRBC'"
	 * @generated
	 */
	long getNbBlessesNRBC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOccupationLits#getNbBlessesNRBC <em>Nb Blesses NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Blesses NRBC</em>' attribute.
	 * @see #isSetNbBlessesNRBC()
	 * @see #unsetNbBlessesNRBC()
	 * @see #getNbBlessesNRBC()
	 * @generated
	 */
	void setNbBlessesNRBC(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeOccupationLits#getNbBlessesNRBC <em>Nb Blesses NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbBlessesNRBC()
	 * @see #getNbBlessesNRBC()
	 * @see #setNbBlessesNRBC(long)
	 * @generated
	 */
	void unsetNbBlessesNRBC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeOccupationLits#getNbBlessesNRBC <em>Nb Blesses NRBC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Blesses NRBC</em>' attribute is set.
	 * @see #unsetNbBlessesNRBC()
	 * @see #getNbBlessesNRBC()
	 * @see #setNbBlessesNRBC(long)
	 * @generated
	 */
	boolean isSetNbBlessesNRBC();

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
	 * @see mpia.schema.SchemaPackage#getTypeOccupationLits_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOccupationLits#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeOccupationLits_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeOccupationLits#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeOccupationLits
