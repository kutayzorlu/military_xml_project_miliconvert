/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeVitesseLineaire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Element Topographie Fluide</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getVitesseFondMer <em>Vitesse Fond Mer</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getVitesseMaree <em>Vitesse Maree</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getProfondStratTherm <em>Profond Strat Therm</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getVisibiliteSMarine <em>Visibilite SMarine</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieFluide()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelElementTopographieFluide' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelElementTopographieFluide extends TypeEtatOperationnelElementTopographie {
	/**
	 * Returns the value of the '<em><b>Vitesse Fond Mer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Fond Mer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Fond Mer</em>' containment reference.
	 * @see #setVitesseFondMer(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieFluide_VitesseFondMer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseFondMer'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseFondMer();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getVitesseFondMer <em>Vitesse Fond Mer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Fond Mer</em>' containment reference.
	 * @see #getVitesseFondMer()
	 * @generated
	 */
	void setVitesseFondMer(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Vitesse Maree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Maree</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Maree</em>' containment reference.
	 * @see #setVitesseMaree(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieFluide_VitesseMaree()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseMaree'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseMaree();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getVitesseMaree <em>Vitesse Maree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Maree</em>' containment reference.
	 * @see #getVitesseMaree()
	 * @generated
	 */
	void setVitesseMaree(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Profond Strat Therm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profond Strat Therm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profond Strat Therm</em>' attribute.
	 * @see #isSetProfondStratTherm()
	 * @see #unsetProfondStratTherm()
	 * @see #setProfondStratTherm(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieFluide_ProfondStratTherm()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='ProfondStratTherm'"
	 * @generated
	 */
	long getProfondStratTherm();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getProfondStratTherm <em>Profond Strat Therm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profond Strat Therm</em>' attribute.
	 * @see #isSetProfondStratTherm()
	 * @see #unsetProfondStratTherm()
	 * @see #getProfondStratTherm()
	 * @generated
	 */
	void setProfondStratTherm(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getProfondStratTherm <em>Profond Strat Therm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfondStratTherm()
	 * @see #getProfondStratTherm()
	 * @see #setProfondStratTherm(long)
	 * @generated
	 */
	void unsetProfondStratTherm();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getProfondStratTherm <em>Profond Strat Therm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profond Strat Therm</em>' attribute is set.
	 * @see #unsetProfondStratTherm()
	 * @see #getProfondStratTherm()
	 * @see #setProfondStratTherm(long)
	 * @generated
	 */
	boolean isSetProfondStratTherm();

	/**
	 * Returns the value of the '<em><b>Visibilite SMarine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibilite SMarine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibilite SMarine</em>' attribute.
	 * @see #isSetVisibiliteSMarine()
	 * @see #unsetVisibiliteSMarine()
	 * @see #setVisibiliteSMarine(long)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementTopographieFluide_VisibiliteSMarine()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='VisibiliteSMarine'"
	 * @generated
	 */
	long getVisibiliteSMarine();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getVisibiliteSMarine <em>Visibilite SMarine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibilite SMarine</em>' attribute.
	 * @see #isSetVisibiliteSMarine()
	 * @see #unsetVisibiliteSMarine()
	 * @see #getVisibiliteSMarine()
	 * @generated
	 */
	void setVisibiliteSMarine(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getVisibiliteSMarine <em>Visibilite SMarine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibiliteSMarine()
	 * @see #getVisibiliteSMarine()
	 * @see #setVisibiliteSMarine(long)
	 * @generated
	 */
	void unsetVisibiliteSMarine();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementTopographieFluide#getVisibiliteSMarine <em>Visibilite SMarine</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibilite SMarine</em>' attribute is set.
	 * @see #unsetVisibiliteSMarine()
	 * @see #getVisibiliteSMarine()
	 * @see #setVisibiliteSMarine(long)
	 * @generated
	 */
	boolean isSetVisibiliteSMarine();

} // TypeEtatOperationnelElementTopographieFluide
