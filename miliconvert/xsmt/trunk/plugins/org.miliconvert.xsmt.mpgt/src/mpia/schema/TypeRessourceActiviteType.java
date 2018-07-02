/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ressource Activite Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRessourceActiviteType#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActiviteType#getRepartition <em>Repartition</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActiviteType#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeRessourceActiviteType#getAssocieCommeTypeType <em>Associe Comme Type Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteType()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_RessourceActiviteType' kind='elementOnly'"
 * @generated
 */
public interface TypeRessourceActiviteType extends TypeRessourceActivite {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteType_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActiviteType#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRessourceActiviteType#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRessourceActiviteType#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Repartition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repartition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repartition</em>' attribute.
	 * @see #isSetRepartition()
	 * @see #unsetRepartition()
	 * @see #setRepartition(double)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteType_Repartition()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='Repartition'"
	 * @generated
	 */
	double getRepartition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActiviteType#getRepartition <em>Repartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repartition</em>' attribute.
	 * @see #isSetRepartition()
	 * @see #unsetRepartition()
	 * @see #getRepartition()
	 * @generated
	 */
	void setRepartition(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRessourceActiviteType#getRepartition <em>Repartition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepartition()
	 * @see #getRepartition()
	 * @see #setRepartition(double)
	 * @generated
	 */
	void unsetRepartition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRessourceActiviteType#getRepartition <em>Repartition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repartition</em>' attribute is set.
	 * @see #unsetRepartition()
	 * @see #getRepartition()
	 * @see #setRepartition(double)
	 * @generated
	 */
	boolean isSetRepartition();

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
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteType_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActiviteType#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Type Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Type Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Type Type</em>' containment reference.
	 * @see #setAssocieCommeTypeType(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeRessourceActiviteType_AssocieCommeTypeType()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='AssocieCommeType_Type'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeTypeType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRessourceActiviteType#getAssocieCommeTypeType <em>Associe Comme Type Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Type Type</em>' containment reference.
	 * @see #getAssocieCommeTypeType()
	 * @generated
	 */
	void setAssocieCommeTypeType(TypeAssociationEXT value);

} // TypeRessourceActiviteType
