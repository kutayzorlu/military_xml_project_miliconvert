/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capteur Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapteurDrone#getDureeVol <em>Duree Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeCapteurDrone#getLongueurMaxPassePhoto <em>Longueur Max Passe Photo</em>}</li>
 *   <li>{@link mpia.schema.TypeCapteurDrone#getLongueurMaxFicelle <em>Longueur Max Ficelle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapteurDrone()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapteurDrone' kind='elementOnly'"
 * @generated
 */
public interface TypeCapteurDrone extends TypeCapteurRENS {
	/**
	 * Returns the value of the '<em><b>Duree Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Vol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Vol</em>' attribute.
	 * @see #isSetDureeVol()
	 * @see #unsetDureeVol()
	 * @see #setDureeVol(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapteurDrone_DureeVol()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier15"
	 *        extendedMetaData="kind='element' name='DureeVol'"
	 * @generated
	 */
	long getDureeVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapteurDrone#getDureeVol <em>Duree Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Vol</em>' attribute.
	 * @see #isSetDureeVol()
	 * @see #unsetDureeVol()
	 * @see #getDureeVol()
	 * @generated
	 */
	void setDureeVol(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapteurDrone#getDureeVol <em>Duree Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDureeVol()
	 * @see #getDureeVol()
	 * @see #setDureeVol(long)
	 * @generated
	 */
	void unsetDureeVol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapteurDrone#getDureeVol <em>Duree Vol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duree Vol</em>' attribute is set.
	 * @see #unsetDureeVol()
	 * @see #getDureeVol()
	 * @see #setDureeVol(long)
	 * @generated
	 */
	boolean isSetDureeVol();

	/**
	 * Returns the value of the '<em><b>Longueur Max Passe Photo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Max Passe Photo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Max Passe Photo</em>' attribute.
	 * @see #isSetLongueurMaxPassePhoto()
	 * @see #unsetLongueurMaxPassePhoto()
	 * @see #setLongueurMaxPassePhoto(double)
	 * @see mpia.schema.SchemaPackage#getTypeCapteurDrone_LongueurMaxPassePhoto()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='LongueurMaxPassePhoto'"
	 * @generated
	 */
	double getLongueurMaxPassePhoto();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapteurDrone#getLongueurMaxPassePhoto <em>Longueur Max Passe Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Max Passe Photo</em>' attribute.
	 * @see #isSetLongueurMaxPassePhoto()
	 * @see #unsetLongueurMaxPassePhoto()
	 * @see #getLongueurMaxPassePhoto()
	 * @generated
	 */
	void setLongueurMaxPassePhoto(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapteurDrone#getLongueurMaxPassePhoto <em>Longueur Max Passe Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongueurMaxPassePhoto()
	 * @see #getLongueurMaxPassePhoto()
	 * @see #setLongueurMaxPassePhoto(double)
	 * @generated
	 */
	void unsetLongueurMaxPassePhoto();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapteurDrone#getLongueurMaxPassePhoto <em>Longueur Max Passe Photo</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longueur Max Passe Photo</em>' attribute is set.
	 * @see #unsetLongueurMaxPassePhoto()
	 * @see #getLongueurMaxPassePhoto()
	 * @see #setLongueurMaxPassePhoto(double)
	 * @generated
	 */
	boolean isSetLongueurMaxPassePhoto();

	/**
	 * Returns the value of the '<em><b>Longueur Max Ficelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Max Ficelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Max Ficelle</em>' attribute.
	 * @see #isSetLongueurMaxFicelle()
	 * @see #unsetLongueurMaxFicelle()
	 * @see #setLongueurMaxFicelle(double)
	 * @see mpia.schema.SchemaPackage#getTypeCapteurDrone_LongueurMaxFicelle()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='LongueurMaxFicelle'"
	 * @generated
	 */
	double getLongueurMaxFicelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapteurDrone#getLongueurMaxFicelle <em>Longueur Max Ficelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Max Ficelle</em>' attribute.
	 * @see #isSetLongueurMaxFicelle()
	 * @see #unsetLongueurMaxFicelle()
	 * @see #getLongueurMaxFicelle()
	 * @generated
	 */
	void setLongueurMaxFicelle(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapteurDrone#getLongueurMaxFicelle <em>Longueur Max Ficelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongueurMaxFicelle()
	 * @see #getLongueurMaxFicelle()
	 * @see #setLongueurMaxFicelle(double)
	 * @generated
	 */
	void unsetLongueurMaxFicelle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapteurDrone#getLongueurMaxFicelle <em>Longueur Max Ficelle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longueur Max Ficelle</em>' attribute is set.
	 * @see #unsetLongueurMaxFicelle()
	 * @see #getLongueurMaxFicelle()
	 * @see #setLongueurMaxFicelle(double)
	 * @generated
	 */
	boolean isSetLongueurMaxFicelle();

} // TypeCapteurDrone
