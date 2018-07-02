/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Moyens Niveau4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyensNiveau4#getHopitaux <em>Hopitaux</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNiveau4#getPointsAccueil <em>Points Accueil</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNiveau4#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNiveau4#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensNiveau4#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyensNiveau4()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyensNiveau4' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyensNiveau4 extends EObject {
	/**
	 * Returns the value of the '<em><b>Hopitaux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hopitaux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hopitaux</em>' attribute.
	 * @see #setHopitaux(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNiveau4_Hopitaux()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='Hopitaux'"
	 * @generated
	 */
	String getHopitaux();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNiveau4#getHopitaux <em>Hopitaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hopitaux</em>' attribute.
	 * @see #getHopitaux()
	 * @generated
	 */
	void setHopitaux(String value);

	/**
	 * Returns the value of the '<em><b>Points Accueil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points Accueil</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points Accueil</em>' attribute.
	 * @see #setPointsAccueil(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNiveau4_PointsAccueil()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255" required="true"
	 *        extendedMetaData="kind='element' name='PointsAccueil'"
	 * @generated
	 */
	String getPointsAccueil();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNiveau4#getPointsAccueil <em>Points Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points Accueil</em>' attribute.
	 * @see #getPointsAccueil()
	 * @generated
	 */
	void setPointsAccueil(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNiveau4_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNiveau4#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNiveau4_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNiveau4#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Nationalite Entite Politique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Nationalite Entite Politique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Nationalite Entite Politique</em>' containment reference.
	 * @see #setAPourNationaliteEntitePolitique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensNiveau4_APourNationaliteEntitePolitique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_EntitePolitique'"
	 *        extendedMetaData="kind='element' name='APourNationalite_EntitePolitique'"
	 * @generated
	 */
	TypeAssociation getAPourNationaliteEntitePolitique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensNiveau4#getAPourNationaliteEntitePolitique <em>APour Nationalite Entite Politique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Nationalite Entite Politique</em>' containment reference.
	 * @see #getAPourNationaliteEntitePolitique()
	 * @generated
	 */
	void setAPourNationaliteEntitePolitique(TypeAssociation value);

} // TypeMoyensNiveau4
