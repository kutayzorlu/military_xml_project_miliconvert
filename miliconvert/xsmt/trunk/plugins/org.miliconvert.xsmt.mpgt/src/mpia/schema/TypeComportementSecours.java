/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Comportement Secours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeComportementSecours#getTempsDeclenchement <em>Temps Declenchement</em>}</li>
 *   <li>{@link mpia.schema.TypeComportementSecours#getTypeComportement <em>Type Comportement</em>}</li>
 *   <li>{@link mpia.schema.TypeComportementSecours#getVitesseConsigne <em>Vitesse Consigne</em>}</li>
 *   <li>{@link mpia.schema.TypeComportementSecours#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeComportementSecours#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeComportementSecours#getAPourPlancherDistanceVerticaleGeometrique <em>APour Plancher Distance Verticale Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeComportementSecours#getAPourPlafondDistanceVerticaleGeometrique <em>APour Plafond Distance Verticale Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypeComportementSecours#getACommeConsigneSecoursPointControle3D <em>AComme Consigne Secours Point Controle3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeComportementSecours()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ComportementSecours' kind='elementOnly'"
 * @generated
 */
public interface TypeComportementSecours extends EObject {
	/**
	 * Returns the value of the '<em><b>Temps Declenchement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temps Declenchement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temps Declenchement</em>' containment reference.
	 * @see #setTempsDeclenchement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeComportementSecours_TempsDeclenchement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TempsDeclenchement'"
	 * @generated
	 */
	TypeDataTypeDuree getTempsDeclenchement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComportementSecours#getTempsDeclenchement <em>Temps Declenchement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temps Declenchement</em>' containment reference.
	 * @see #getTempsDeclenchement()
	 * @generated
	 */
	void setTempsDeclenchement(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Type Comportement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoComportementSecoursTypeComportement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Comportement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Comportement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComportementSecoursTypeComportement
	 * @see #isSetTypeComportement()
	 * @see #unsetTypeComportement()
	 * @see #setTypeComportement(TypeDictionaryDicoComportementSecoursTypeComportement)
	 * @see mpia.schema.SchemaPackage#getTypeComportementSecours_TypeComportement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeComportement'"
	 * @generated
	 */
	TypeDictionaryDicoComportementSecoursTypeComportement getTypeComportement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComportementSecours#getTypeComportement <em>Type Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Comportement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoComportementSecoursTypeComportement
	 * @see #isSetTypeComportement()
	 * @see #unsetTypeComportement()
	 * @see #getTypeComportement()
	 * @generated
	 */
	void setTypeComportement(TypeDictionaryDicoComportementSecoursTypeComportement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeComportementSecours#getTypeComportement <em>Type Comportement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeComportement()
	 * @see #getTypeComportement()
	 * @see #setTypeComportement(TypeDictionaryDicoComportementSecoursTypeComportement)
	 * @generated
	 */
	void unsetTypeComportement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeComportementSecours#getTypeComportement <em>Type Comportement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Comportement</em>' attribute is set.
	 * @see #unsetTypeComportement()
	 * @see #getTypeComportement()
	 * @see #setTypeComportement(TypeDictionaryDicoComportementSecoursTypeComportement)
	 * @generated
	 */
	boolean isSetTypeComportement();

	/**
	 * Returns the value of the '<em><b>Vitesse Consigne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Consigne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Consigne</em>' containment reference.
	 * @see #setVitesseConsigne(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeComportementSecours_VitesseConsigne()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseConsigne'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseConsigne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComportementSecours#getVitesseConsigne <em>Vitesse Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Consigne</em>' containment reference.
	 * @see #getVitesseConsigne()
	 * @generated
	 */
	void setVitesseConsigne(TypeDataTypeVitesseLineaire value);

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
	 * @see mpia.schema.SchemaPackage#getTypeComportementSecours_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComportementSecours#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeComportementSecours_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComportementSecours#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Plancher Distance Verticale Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Plancher Distance Verticale Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Plancher Distance Verticale Geometrique</em>' containment reference.
	 * @see #setAPourPlancherDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeComportementSecours_APourPlancherDistanceVerticaleGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DistanceVerticaleGeometrique'"
	 *        extendedMetaData="kind='element' name='APourPlancher_DistanceVerticaleGeometrique'"
	 * @generated
	 */
	TypeDistanceVerticaleGeometrique getAPourPlancherDistanceVerticaleGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComportementSecours#getAPourPlancherDistanceVerticaleGeometrique <em>APour Plancher Distance Verticale Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Plancher Distance Verticale Geometrique</em>' containment reference.
	 * @see #getAPourPlancherDistanceVerticaleGeometrique()
	 * @generated
	 */
	void setAPourPlancherDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique value);

	/**
	 * Returns the value of the '<em><b>APour Plafond Distance Verticale Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Plafond Distance Verticale Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Plafond Distance Verticale Geometrique</em>' containment reference.
	 * @see #setAPourPlafondDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypeComportementSecours_APourPlafondDistanceVerticaleGeometrique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DistanceVerticaleGeometrique'"
	 *        extendedMetaData="kind='element' name='APourPlafond_DistanceVerticaleGeometrique'"
	 * @generated
	 */
	TypeDistanceVerticaleGeometrique getAPourPlafondDistanceVerticaleGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeComportementSecours#getAPourPlafondDistanceVerticaleGeometrique <em>APour Plafond Distance Verticale Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Plafond Distance Verticale Geometrique</em>' containment reference.
	 * @see #getAPourPlafondDistanceVerticaleGeometrique()
	 * @generated
	 */
	void setAPourPlafondDistanceVerticaleGeometrique(TypeDistanceVerticaleGeometrique value);

	/**
	 * Returns the value of the '<em><b>AComme Consigne Secours Point Controle3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Consigne Secours Point Controle3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Consigne Secours Point Controle3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeComportementSecours_ACommeConsigneSecoursPointControle3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_PointControle3D'"
	 *        extendedMetaData="kind='element' name='ACommeConsigneSecours_PointControle3D'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeConsigneSecoursPointControle3D();

} // TypeComportementSecours
