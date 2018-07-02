/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Passe Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePassePhoto#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypePassePhoto#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.TypePassePhoto#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePassePhoto#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePassePhoto#getPointEntreePointGeometrique <em>Point Entree Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.TypePassePhoto#getPointSortiePointGeometrique <em>Point Sortie Point Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePassePhoto()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PassePhoto' kind='elementOnly'"
 * @generated
 */
public interface TypePassePhoto extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypePassePhoto_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassePhoto#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Largeur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur</em>' attribute.
	 * @see #isSetLargeur()
	 * @see #unsetLargeur()
	 * @see #setLargeur(double)
	 * @see mpia.schema.SchemaPackage#getTypePassePhoto_Largeur()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Largeur'"
	 * @generated
	 */
	double getLargeur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassePhoto#getLargeur <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur</em>' attribute.
	 * @see #isSetLargeur()
	 * @see #unsetLargeur()
	 * @see #getLargeur()
	 * @generated
	 */
	void setLargeur(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePassePhoto#getLargeur <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLargeur()
	 * @see #getLargeur()
	 * @see #setLargeur(double)
	 * @generated
	 */
	void unsetLargeur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePassePhoto#getLargeur <em>Largeur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Largeur</em>' attribute is set.
	 * @see #unsetLargeur()
	 * @see #getLargeur()
	 * @see #setLargeur(double)
	 * @generated
	 */
	boolean isSetLargeur();

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
	 * @see mpia.schema.SchemaPackage#getTypePassePhoto_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassePhoto#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePassePhoto_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassePhoto#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Point Entree Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Entree Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Entree Point Geometrique</em>' containment reference.
	 * @see #setPointEntreePointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypePassePhoto_PointEntreePointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='PointEntree_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getPointEntreePointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassePhoto#getPointEntreePointGeometrique <em>Point Entree Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Entree Point Geometrique</em>' containment reference.
	 * @see #getPointEntreePointGeometrique()
	 * @generated
	 */
	void setPointEntreePointGeometrique(TypePointGeometrique value);

	/**
	 * Returns the value of the '<em><b>Point Sortie Point Geometrique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Sortie Point Geometrique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Sortie Point Geometrique</em>' containment reference.
	 * @see #setPointSortiePointGeometrique(TypePointGeometrique)
	 * @see mpia.schema.SchemaPackage#getTypePassePhoto_PointSortiePointGeometrique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PointGeometrique'"
	 *        extendedMetaData="kind='element' name='PointSortie_PointGeometrique'"
	 * @generated
	 */
	TypePointGeometrique getPointSortiePointGeometrique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassePhoto#getPointSortiePointGeometrique <em>Point Sortie Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Sortie Point Geometrique</em>' containment reference.
	 * @see #getPointSortiePointGeometrique()
	 * @generated
	 */
	void setPointSortiePointGeometrique(TypePointGeometrique value);

} // TypePassePhoto
