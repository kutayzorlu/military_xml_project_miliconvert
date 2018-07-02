/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Capteur Radar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapteurRadar#getAngleOrientation <em>Angle Orientation</em>}</li>
 *   <li>{@link mpia.schema.TypeCapteurRadar#getRayonSecteur <em>Rayon Secteur</em>}</li>
 *   <li>{@link mpia.schema.TypeCapteurRadar#getAngleSecteur <em>Angle Secteur</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapteurRadar()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CapteurRadar' kind='elementOnly'"
 * @generated
 */
public interface TypeCapteurRadar extends TypeCapteurRENS {
	/**
	 * Returns the value of the '<em><b>Angle Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Orientation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Orientation</em>' attribute.
	 * @see #isSetAngleOrientation()
	 * @see #unsetAngleOrientation()
	 * @see #setAngleOrientation(double)
	 * @see mpia.schema.SchemaPackage#getTypeCapteurRadar_AngleOrientation()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='AngleOrientation'"
	 * @generated
	 */
	double getAngleOrientation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapteurRadar#getAngleOrientation <em>Angle Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Orientation</em>' attribute.
	 * @see #isSetAngleOrientation()
	 * @see #unsetAngleOrientation()
	 * @see #getAngleOrientation()
	 * @generated
	 */
	void setAngleOrientation(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapteurRadar#getAngleOrientation <em>Angle Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngleOrientation()
	 * @see #getAngleOrientation()
	 * @see #setAngleOrientation(double)
	 * @generated
	 */
	void unsetAngleOrientation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapteurRadar#getAngleOrientation <em>Angle Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angle Orientation</em>' attribute is set.
	 * @see #unsetAngleOrientation()
	 * @see #getAngleOrientation()
	 * @see #setAngleOrientation(double)
	 * @generated
	 */
	boolean isSetAngleOrientation();

	/**
	 * Returns the value of the '<em><b>Rayon Secteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Secteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Secteur</em>' attribute.
	 * @see #isSetRayonSecteur()
	 * @see #unsetRayonSecteur()
	 * @see #setRayonSecteur(double)
	 * @see mpia.schema.SchemaPackage#getTypeCapteurRadar_RayonSecteur()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='RayonSecteur'"
	 * @generated
	 */
	double getRayonSecteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapteurRadar#getRayonSecteur <em>Rayon Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Secteur</em>' attribute.
	 * @see #isSetRayonSecteur()
	 * @see #unsetRayonSecteur()
	 * @see #getRayonSecteur()
	 * @generated
	 */
	void setRayonSecteur(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapteurRadar#getRayonSecteur <em>Rayon Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRayonSecteur()
	 * @see #getRayonSecteur()
	 * @see #setRayonSecteur(double)
	 * @generated
	 */
	void unsetRayonSecteur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapteurRadar#getRayonSecteur <em>Rayon Secteur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rayon Secteur</em>' attribute is set.
	 * @see #unsetRayonSecteur()
	 * @see #getRayonSecteur()
	 * @see #setRayonSecteur(double)
	 * @generated
	 */
	boolean isSetRayonSecteur();

	/**
	 * Returns the value of the '<em><b>Angle Secteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Secteur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Secteur</em>' attribute.
	 * @see #isSetAngleSecteur()
	 * @see #unsetAngleSecteur()
	 * @see #setAngleSecteur(double)
	 * @see mpia.schema.SchemaPackage#getTypeCapteurRadar_AngleSecteur()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='AngleSecteur'"
	 * @generated
	 */
	double getAngleSecteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapteurRadar#getAngleSecteur <em>Angle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Secteur</em>' attribute.
	 * @see #isSetAngleSecteur()
	 * @see #unsetAngleSecteur()
	 * @see #getAngleSecteur()
	 * @generated
	 */
	void setAngleSecteur(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapteurRadar#getAngleSecteur <em>Angle Secteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngleSecteur()
	 * @see #getAngleSecteur()
	 * @see #setAngleSecteur(double)
	 * @generated
	 */
	void unsetAngleSecteur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapteurRadar#getAngleSecteur <em>Angle Secteur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angle Secteur</em>' attribute is set.
	 * @see #unsetAngleSecteur()
	 * @see #getAngleSecteur()
	 * @see #setAngleSecteur(double)
	 * @generated
	 */
	boolean isSetAngleSecteur();

} // TypeCapteurRadar
