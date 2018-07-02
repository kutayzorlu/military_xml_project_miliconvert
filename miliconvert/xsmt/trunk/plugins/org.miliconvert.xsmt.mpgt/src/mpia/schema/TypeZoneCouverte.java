/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Couverte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneCouverte#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneCouverte#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneCouverte#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneCouverte#getConcerneLocalisationGeometrique2D <em>Concerne Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneCouverte()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ZoneCouverte' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneCouverte extends EObject {
	/**
	 * Returns the value of the '<em><b>Hauteur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur</em>' containment reference.
	 * @see #setHauteur(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeZoneCouverte_Hauteur()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hauteur'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneCouverte#getHauteur <em>Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur</em>' containment reference.
	 * @see #getHauteur()
	 * @generated
	 */
	void setHauteur(TypeDataTypeLongueur value);

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
	 * @see mpia.schema.SchemaPackage#getTypeZoneCouverte_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneCouverte#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeZoneCouverte_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneCouverte#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Localisation Geometrique2 D</em>' containment reference.
	 * @see #setConcerneLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypeZoneCouverte_ConcerneLocalisationGeometrique2D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='Concerne_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getConcerneLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneCouverte#getConcerneLocalisationGeometrique2D <em>Concerne Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Localisation Geometrique2 D</em>' containment reference.
	 * @see #getConcerneLocalisationGeometrique2D()
	 * @generated
	 */
	void setConcerneLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

} // TypeZoneCouverte
