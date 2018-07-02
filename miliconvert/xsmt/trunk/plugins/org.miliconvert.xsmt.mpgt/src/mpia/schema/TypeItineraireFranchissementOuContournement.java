/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Itineraire Franchissement Ou Contournement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeItineraireFranchissementOuContournement#isFranchissement <em>Franchissement</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraireFranchissementOuContournement#isContournement <em>Contournement</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraireFranchissementOuContournement#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraireFranchissementOuContournement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraireFranchissementOuContournement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraireFranchissementOuContournement#getAPourLocalisationLocalisationGeometrique2D <em>APour Localisation Localisation Geometrique2 D</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraireFranchissementOuContournement#getVautSelonModesModeFranchissement <em>Vaut Selon Modes Mode Franchissement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeItineraireFranchissementOuContournement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ItineraireFranchissementOuContournement' kind='elementOnly'"
 * @generated
 */
public interface TypeItineraireFranchissementOuContournement extends EObject {
	/**
	 * Returns the value of the '<em><b>Franchissement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Franchissement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Franchissement</em>' attribute.
	 * @see #isSetFranchissement()
	 * @see #unsetFranchissement()
	 * @see #setFranchissement(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeItineraireFranchissementOuContournement_Franchissement()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='Franchissement'"
	 * @generated
	 */
	boolean isFranchissement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#isFranchissement <em>Franchissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Franchissement</em>' attribute.
	 * @see #isSetFranchissement()
	 * @see #unsetFranchissement()
	 * @see #isFranchissement()
	 * @generated
	 */
	void setFranchissement(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#isFranchissement <em>Franchissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFranchissement()
	 * @see #isFranchissement()
	 * @see #setFranchissement(boolean)
	 * @generated
	 */
	void unsetFranchissement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#isFranchissement <em>Franchissement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Franchissement</em>' attribute is set.
	 * @see #unsetFranchissement()
	 * @see #isFranchissement()
	 * @see #setFranchissement(boolean)
	 * @generated
	 */
	boolean isSetFranchissement();

	/**
	 * Returns the value of the '<em><b>Contournement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contournement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contournement</em>' attribute.
	 * @see #isSetContournement()
	 * @see #unsetContournement()
	 * @see #setContournement(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeItineraireFranchissementOuContournement_Contournement()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Contournement'"
	 * @generated
	 */
	boolean isContournement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#isContournement <em>Contournement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contournement</em>' attribute.
	 * @see #isSetContournement()
	 * @see #unsetContournement()
	 * @see #isContournement()
	 * @generated
	 */
	void setContournement(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#isContournement <em>Contournement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContournement()
	 * @see #isContournement()
	 * @see #setContournement(boolean)
	 * @generated
	 */
	void unsetContournement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#isContournement <em>Contournement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contournement</em>' attribute is set.
	 * @see #unsetContournement()
	 * @see #isContournement()
	 * @see #setContournement(boolean)
	 * @generated
	 */
	boolean isSetContournement();

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeItineraireFranchissementOuContournement_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeItineraireFranchissementOuContournement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeItineraireFranchissementOuContournement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Localisation Geometrique2 D</em>' containment reference.
	 * @see #setAPourLocalisationLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypeItineraireFranchissementOuContournement_APourLocalisationLocalisationGeometrique2D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='APourLocalisation_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getAPourLocalisationLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraireFranchissementOuContournement#getAPourLocalisationLocalisationGeometrique2D <em>APour Localisation Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Localisation Geometrique2 D</em>' containment reference.
	 * @see #getAPourLocalisationLocalisationGeometrique2D()
	 * @generated
	 */
	void setAPourLocalisationLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

	/**
	 * Returns the value of the '<em><b>Vaut Selon Modes Mode Franchissement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeModeFranchissement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Selon Modes Mode Franchissement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Selon Modes Mode Franchissement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeItineraireFranchissementOuContournement_VautSelonModesModeFranchissement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModeFranchissement'"
	 *        extendedMetaData="kind='element' name='VautSelonModes_ModeFranchissement'"
	 * @generated
	 */
	EList<TypeModeFranchissement> getVautSelonModesModeFranchissement();

} // TypeItineraireFranchissementOuContournement
