/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Hippodrome Geometrique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeHippodromeGeometrique#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.TypeHippodromeGeometrique#getCodeAlignement <em>Code Alignement</em>}</li>
 *   <li>{@link mpia.schema.TypeHippodromeGeometrique#getAPourPremierPointCoordonneesLatLong <em>APour Premier Point Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.TypeHippodromeGeometrique#getAPourSecondPointCoordonneesLatLong <em>APour Second Point Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeHippodromeGeometrique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_HippodromeGeometrique' kind='elementOnly'"
 * @generated
 */
public interface TypeHippodromeGeometrique extends TypeObjetGeometrique {
	/**
	 * Returns the value of the '<em><b>Largeur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur</em>' containment reference.
	 * @see #setLargeur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeHippodromeGeometrique_Largeur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Largeur'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHippodromeGeometrique#getLargeur <em>Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur</em>' containment reference.
	 * @see #getLargeur()
	 * @generated
	 */
	void setLargeur(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Code Alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoHippodromeCodeAlignement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Alignement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Alignement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoHippodromeCodeAlignement
	 * @see #isSetCodeAlignement()
	 * @see #unsetCodeAlignement()
	 * @see #setCodeAlignement(TypeDictionaryDicoHippodromeCodeAlignement)
	 * @see mpia.schema.SchemaPackage#getTypeHippodromeGeometrique_CodeAlignement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='CodeAlignement'"
	 * @generated
	 */
	TypeDictionaryDicoHippodromeCodeAlignement getCodeAlignement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHippodromeGeometrique#getCodeAlignement <em>Code Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Alignement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoHippodromeCodeAlignement
	 * @see #isSetCodeAlignement()
	 * @see #unsetCodeAlignement()
	 * @see #getCodeAlignement()
	 * @generated
	 */
	void setCodeAlignement(TypeDictionaryDicoHippodromeCodeAlignement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeHippodromeGeometrique#getCodeAlignement <em>Code Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodeAlignement()
	 * @see #getCodeAlignement()
	 * @see #setCodeAlignement(TypeDictionaryDicoHippodromeCodeAlignement)
	 * @generated
	 */
	void unsetCodeAlignement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeHippodromeGeometrique#getCodeAlignement <em>Code Alignement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code Alignement</em>' attribute is set.
	 * @see #unsetCodeAlignement()
	 * @see #getCodeAlignement()
	 * @see #setCodeAlignement(TypeDictionaryDicoHippodromeCodeAlignement)
	 * @generated
	 */
	boolean isSetCodeAlignement();

	/**
	 * Returns the value of the '<em><b>APour Premier Point Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Premier Point Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Premier Point Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourPremierPointCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeHippodromeGeometrique_APourPremierPointCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourPremierPoint_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourPremierPointCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHippodromeGeometrique#getAPourPremierPointCoordonneesLatLong <em>APour Premier Point Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Premier Point Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourPremierPointCoordonneesLatLong()
	 * @generated
	 */
	void setAPourPremierPointCoordonneesLatLong(TypeCoordonneesLatLong value);

	/**
	 * Returns the value of the '<em><b>APour Second Point Coordonnees Lat Long</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Second Point Coordonnees Lat Long</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Second Point Coordonnees Lat Long</em>' containment reference.
	 * @see #setAPourSecondPointCoordonneesLatLong(TypeCoordonneesLatLong)
	 * @see mpia.schema.SchemaPackage#getTypeHippodromeGeometrique_APourSecondPointCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourSecondPoint_CoordonneesLatLong'"
	 * @generated
	 */
	TypeCoordonneesLatLong getAPourSecondPointCoordonneesLatLong();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeHippodromeGeometrique#getAPourSecondPointCoordonneesLatLong <em>APour Second Point Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Second Point Coordonnees Lat Long</em>' containment reference.
	 * @see #getAPourSecondPointCoordonneesLatLong()
	 * @generated
	 */
	void setAPourSecondPointCoordonneesLatLong(TypeCoordonneesLatLong value);

} // TypeHippodromeGeometrique
