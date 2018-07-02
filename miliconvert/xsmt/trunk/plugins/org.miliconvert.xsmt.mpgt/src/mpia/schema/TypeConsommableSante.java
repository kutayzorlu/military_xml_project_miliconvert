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
 * A representation of the model object '<em><b>Type Consommable Sante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConsommableSante#getJoursFonctionnement <em>Jours Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommableSante#getNumeroGroupe <em>Numero Groupe</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommableSante#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeConsommableSante#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConsommableSante()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConsommableSante' kind='elementOnly'"
 * @generated
 */
public interface TypeConsommableSante extends EObject {
	/**
	 * Returns the value of the '<em><b>Jours Fonctionnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jours Fonctionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jours Fonctionnement</em>' attribute.
	 * @see #isSetJoursFonctionnement()
	 * @see #unsetJoursFonctionnement()
	 * @see #setJoursFonctionnement(long)
	 * @see mpia.schema.SchemaPackage#getTypeConsommableSante_JoursFonctionnement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='JoursFonctionnement'"
	 * @generated
	 */
	long getJoursFonctionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommableSante#getJoursFonctionnement <em>Jours Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jours Fonctionnement</em>' attribute.
	 * @see #isSetJoursFonctionnement()
	 * @see #unsetJoursFonctionnement()
	 * @see #getJoursFonctionnement()
	 * @generated
	 */
	void setJoursFonctionnement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsommableSante#getJoursFonctionnement <em>Jours Fonctionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJoursFonctionnement()
	 * @see #getJoursFonctionnement()
	 * @see #setJoursFonctionnement(long)
	 * @generated
	 */
	void unsetJoursFonctionnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsommableSante#getJoursFonctionnement <em>Jours Fonctionnement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Jours Fonctionnement</em>' attribute is set.
	 * @see #unsetJoursFonctionnement()
	 * @see #getJoursFonctionnement()
	 * @see #setJoursFonctionnement(long)
	 * @generated
	 */
	boolean isSetJoursFonctionnement();

	/**
	 * Returns the value of the '<em><b>Numero Groupe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Groupe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Groupe</em>' attribute.
	 * @see #isSetNumeroGroupe()
	 * @see #unsetNumeroGroupe()
	 * @see #setNumeroGroupe(long)
	 * @see mpia.schema.SchemaPackage#getTypeConsommableSante_NumeroGroupe()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroGroupe'"
	 * @generated
	 */
	long getNumeroGroupe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommableSante#getNumeroGroupe <em>Numero Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Groupe</em>' attribute.
	 * @see #isSetNumeroGroupe()
	 * @see #unsetNumeroGroupe()
	 * @see #getNumeroGroupe()
	 * @generated
	 */
	void setNumeroGroupe(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConsommableSante#getNumeroGroupe <em>Numero Groupe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroGroupe()
	 * @see #getNumeroGroupe()
	 * @see #setNumeroGroupe(long)
	 * @generated
	 */
	void unsetNumeroGroupe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConsommableSante#getNumeroGroupe <em>Numero Groupe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Groupe</em>' attribute is set.
	 * @see #unsetNumeroGroupe()
	 * @see #getNumeroGroupe()
	 * @see #setNumeroGroupe(long)
	 * @generated
	 */
	boolean isSetNumeroGroupe();

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
	 * @see mpia.schema.SchemaPackage#getTypeConsommableSante_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommableSante#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConsommableSante_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConsommableSante#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeConsommableSante
