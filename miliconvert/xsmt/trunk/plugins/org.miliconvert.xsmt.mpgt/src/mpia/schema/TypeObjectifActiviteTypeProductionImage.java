/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Objectif Activite Type Production Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeObjectifActiviteTypeProductionImage#getEchelle <em>Echelle</em>}</li>
 *   <li>{@link mpia.schema.TypeObjectifActiviteTypeProductionImage#getMediaEtQualiteImage <em>Media Et Qualite Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeObjectifActiviteTypeProductionImage()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ObjectifActiviteTypeProductionImage' kind='elementOnly'"
 * @generated
 */
public interface TypeObjectifActiviteTypeProductionImage extends TypeObjectifActiviteType {
	/**
	 * Returns the value of the '<em><b>Echelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelle</em>' attribute.
	 * @see #isSetEchelle()
	 * @see #unsetEchelle()
	 * @see #setEchelle(double)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActiviteTypeProductionImage_Echelle()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='Echelle'"
	 * @generated
	 */
	double getEchelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActiviteTypeProductionImage#getEchelle <em>Echelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelle</em>' attribute.
	 * @see #isSetEchelle()
	 * @see #unsetEchelle()
	 * @see #getEchelle()
	 * @generated
	 */
	void setEchelle(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifActiviteTypeProductionImage#getEchelle <em>Echelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelle()
	 * @see #getEchelle()
	 * @see #setEchelle(double)
	 * @generated
	 */
	void unsetEchelle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifActiviteTypeProductionImage#getEchelle <em>Echelle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelle</em>' attribute is set.
	 * @see #unsetEchelle()
	 * @see #getEchelle()
	 * @see #setEchelle(double)
	 * @generated
	 */
	boolean isSetEchelle();

	/**
	 * Returns the value of the '<em><b>Media Et Qualite Image</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Media Et Qualite Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Media Et Qualite Image</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage
	 * @see #isSetMediaEtQualiteImage()
	 * @see #unsetMediaEtQualiteImage()
	 * @see #setMediaEtQualiteImage(TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage)
	 * @see mpia.schema.SchemaPackage#getTypeObjectifActiviteTypeProductionImage_MediaEtQualiteImage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MediaEtQualiteImage'"
	 * @generated
	 */
	TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage getMediaEtQualiteImage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeObjectifActiviteTypeProductionImage#getMediaEtQualiteImage <em>Media Et Qualite Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media Et Qualite Image</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage
	 * @see #isSetMediaEtQualiteImage()
	 * @see #unsetMediaEtQualiteImage()
	 * @see #getMediaEtQualiteImage()
	 * @generated
	 */
	void setMediaEtQualiteImage(TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeObjectifActiviteTypeProductionImage#getMediaEtQualiteImage <em>Media Et Qualite Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMediaEtQualiteImage()
	 * @see #getMediaEtQualiteImage()
	 * @see #setMediaEtQualiteImage(TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage)
	 * @generated
	 */
	void unsetMediaEtQualiteImage();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeObjectifActiviteTypeProductionImage#getMediaEtQualiteImage <em>Media Et Qualite Image</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Media Et Qualite Image</em>' attribute is set.
	 * @see #unsetMediaEtQualiteImage()
	 * @see #getMediaEtQualiteImage()
	 * @see #setMediaEtQualiteImage(TypeDictionaryDicoObjectifActiviteTypeProductionImageMediaEtQualiteImage)
	 * @generated
	 */
	boolean isSetMediaEtQualiteImage();

} // TypeObjectifActiviteTypeProductionImage
