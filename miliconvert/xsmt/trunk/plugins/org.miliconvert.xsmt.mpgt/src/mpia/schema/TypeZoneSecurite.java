/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Securite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneSecurite#getDistanceSecurite <em>Distance Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneSecurite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneSecurite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneSecurite#getEstCentreeEnLocalisationGeometrique2D <em>Est Centree En Localisation Geometrique2 D</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneSecurite#getConcerneUnite <em>Concerne Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneSecurite#getSeMeutSelonMobilite <em>Se Meut Selon Mobilite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneSecurite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ZoneSecurite' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneSecurite extends EObject {
	/**
	 * Returns the value of the '<em><b>Distance Securite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Securite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Securite</em>' containment reference.
	 * @see #setDistanceSecurite(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeZoneSecurite_DistanceSecurite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceSecurite'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceSecurite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneSecurite#getDistanceSecurite <em>Distance Securite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Securite</em>' containment reference.
	 * @see #getDistanceSecurite()
	 * @generated
	 */
	void setDistanceSecurite(TypeDataTypeLongueur value);

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
	 * @see mpia.schema.SchemaPackage#getTypeZoneSecurite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneSecurite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeZoneSecurite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneSecurite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Centree En Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Centree En Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Centree En Localisation Geometrique2 D</em>' containment reference.
	 * @see #setEstCentreeEnLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypeZoneSecurite_EstCentreeEnLocalisationGeometrique2D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='EstCentreeEn_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getEstCentreeEnLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneSecurite#getEstCentreeEnLocalisationGeometrique2D <em>Est Centree En Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Centree En Localisation Geometrique2 D</em>' containment reference.
	 * @see #getEstCentreeEnLocalisationGeometrique2D()
	 * @generated
	 */
	void setEstCentreeEnLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

	/**
	 * Returns the value of the '<em><b>Concerne Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Unite</em>' containment reference.
	 * @see #setConcerneUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeZoneSecurite_ConcerneUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='Concerne_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneSecurite#getConcerneUnite <em>Concerne Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Unite</em>' containment reference.
	 * @see #getConcerneUnite()
	 * @generated
	 */
	void setConcerneUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Se Meut Selon Mobilite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se Meut Selon Mobilite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se Meut Selon Mobilite</em>' containment reference.
	 * @see #setSeMeutSelonMobilite(TypeMobilite)
	 * @see mpia.schema.SchemaPackage#getTypeZoneSecurite_SeMeutSelonMobilite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Mobilite'"
	 *        extendedMetaData="kind='element' name='SeMeutSelon_Mobilite'"
	 * @generated
	 */
	TypeMobilite getSeMeutSelonMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneSecurite#getSeMeutSelonMobilite <em>Se Meut Selon Mobilite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se Meut Selon Mobilite</em>' containment reference.
	 * @see #getSeMeutSelonMobilite()
	 * @generated
	 */
	void setSeMeutSelonMobilite(TypeMobilite value);

} // TypeZoneSecurite
