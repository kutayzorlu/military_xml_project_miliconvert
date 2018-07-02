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
 * A representation of the model object '<em><b>Type Directives WEZ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDirectivesWEZ#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectivesWEZ#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectivesWEZ#getNiveauEMCON <em>Niveau EMCON</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectivesWEZ#getModalitesParticulieresEtatAlerte <em>Modalites Particulieres Etat Alerte</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectivesWEZ#getModalitesParticulieresEMCON <em>Modalites Particulieres EMCON</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDirectivesWEZ()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DirectivesWEZ' kind='elementOnly'"
 * @generated
 */
public interface TypeDirectivesWEZ extends EObject {
	/**
	 * Returns the value of the '<em><b>Etat Alerte Pour Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Alerte Pour Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Alerte Pour Tir</em>' attribute.
	 * @see #isSetEtatAlertePourTir()
	 * @see #unsetEtatAlertePourTir()
	 * @see #setEtatAlertePourTir(long)
	 * @see mpia.schema.SchemaPackage#getTypeDirectivesWEZ_EtatAlertePourTir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='EtatAlertePourTir'"
	 * @generated
	 */
	long getEtatAlertePourTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectivesWEZ#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Alerte Pour Tir</em>' attribute.
	 * @see #isSetEtatAlertePourTir()
	 * @see #unsetEtatAlertePourTir()
	 * @see #getEtatAlertePourTir()
	 * @generated
	 */
	void setEtatAlertePourTir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectivesWEZ#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatAlertePourTir()
	 * @see #getEtatAlertePourTir()
	 * @see #setEtatAlertePourTir(long)
	 * @generated
	 */
	void unsetEtatAlertePourTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectivesWEZ#getEtatAlertePourTir <em>Etat Alerte Pour Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Alerte Pour Tir</em>' attribute is set.
	 * @see #unsetEtatAlertePourTir()
	 * @see #getEtatAlertePourTir()
	 * @see #setEtatAlertePourTir(long)
	 * @generated
	 */
	boolean isSetEtatAlertePourTir();

	/**
	 * Returns the value of the '<em><b>Etat Alerte Pour Mouvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Alerte Pour Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Alerte Pour Mouvement</em>' attribute.
	 * @see #isSetEtatAlertePourMouvement()
	 * @see #unsetEtatAlertePourMouvement()
	 * @see #setEtatAlertePourMouvement(long)
	 * @see mpia.schema.SchemaPackage#getTypeDirectivesWEZ_EtatAlertePourMouvement()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='EtatAlertePourMouvement'"
	 * @generated
	 */
	long getEtatAlertePourMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectivesWEZ#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Alerte Pour Mouvement</em>' attribute.
	 * @see #isSetEtatAlertePourMouvement()
	 * @see #unsetEtatAlertePourMouvement()
	 * @see #getEtatAlertePourMouvement()
	 * @generated
	 */
	void setEtatAlertePourMouvement(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectivesWEZ#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatAlertePourMouvement()
	 * @see #getEtatAlertePourMouvement()
	 * @see #setEtatAlertePourMouvement(long)
	 * @generated
	 */
	void unsetEtatAlertePourMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectivesWEZ#getEtatAlertePourMouvement <em>Etat Alerte Pour Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Alerte Pour Mouvement</em>' attribute is set.
	 * @see #unsetEtatAlertePourMouvement()
	 * @see #getEtatAlertePourMouvement()
	 * @see #setEtatAlertePourMouvement(long)
	 * @generated
	 */
	boolean isSetEtatAlertePourMouvement();

	/**
	 * Returns the value of the '<em><b>Niveau EMCON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau EMCON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau EMCON</em>' attribute.
	 * @see #isSetNiveauEMCON()
	 * @see #unsetNiveauEMCON()
	 * @see #setNiveauEMCON(long)
	 * @see mpia.schema.SchemaPackage#getTypeDirectivesWEZ_NiveauEMCON()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NiveauEMCON'"
	 * @generated
	 */
	long getNiveauEMCON();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectivesWEZ#getNiveauEMCON <em>Niveau EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau EMCON</em>' attribute.
	 * @see #isSetNiveauEMCON()
	 * @see #unsetNiveauEMCON()
	 * @see #getNiveauEMCON()
	 * @generated
	 */
	void setNiveauEMCON(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectivesWEZ#getNiveauEMCON <em>Niveau EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauEMCON()
	 * @see #getNiveauEMCON()
	 * @see #setNiveauEMCON(long)
	 * @generated
	 */
	void unsetNiveauEMCON();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectivesWEZ#getNiveauEMCON <em>Niveau EMCON</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau EMCON</em>' attribute is set.
	 * @see #unsetNiveauEMCON()
	 * @see #getNiveauEMCON()
	 * @see #setNiveauEMCON(long)
	 * @generated
	 */
	boolean isSetNiveauEMCON();

	/**
	 * Returns the value of the '<em><b>Modalites Particulieres Etat Alerte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Particulieres Etat Alerte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Particulieres Etat Alerte</em>' attribute.
	 * @see #setModalitesParticulieresEtatAlerte(String)
	 * @see mpia.schema.SchemaPackage#getTypeDirectivesWEZ_ModalitesParticulieresEtatAlerte()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ModalitesParticulieresEtatAlerte'"
	 * @generated
	 */
	String getModalitesParticulieresEtatAlerte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectivesWEZ#getModalitesParticulieresEtatAlerte <em>Modalites Particulieres Etat Alerte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Particulieres Etat Alerte</em>' attribute.
	 * @see #getModalitesParticulieresEtatAlerte()
	 * @generated
	 */
	void setModalitesParticulieresEtatAlerte(String value);

	/**
	 * Returns the value of the '<em><b>Modalites Particulieres EMCON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Particulieres EMCON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Particulieres EMCON</em>' attribute.
	 * @see #setModalitesParticulieresEMCON(String)
	 * @see mpia.schema.SchemaPackage#getTypeDirectivesWEZ_ModalitesParticulieresEMCON()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ModalitesParticulieresEMCON'"
	 * @generated
	 */
	String getModalitesParticulieresEMCON();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectivesWEZ#getModalitesParticulieresEMCON <em>Modalites Particulieres EMCON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Particulieres EMCON</em>' attribute.
	 * @see #getModalitesParticulieresEMCON()
	 * @generated
	 */
	void setModalitesParticulieresEMCON(String value);

} // TypeDirectivesWEZ
