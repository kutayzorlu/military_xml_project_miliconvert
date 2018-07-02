/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Volume Munitions ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVolumeMunitionsASS#getQuantiteProjectiles <em>Quantite Projectiles</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeMunitionsASS#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeMunitionsASS#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeMunitionsASS#getEstTypeTypeMunition <em>Est Type Type Munition</em>}</li>
 *   <li>{@link mpia.schema.TypeVolumeMunitionsASS#getAPourTypeDeLanceurTypeArme <em>APour Type De Lanceur Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVolumeMunitionsASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_VolumeMunitionsASS' kind='elementOnly'"
 * @generated
 */
public interface TypeVolumeMunitionsASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite Projectiles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Projectiles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Projectiles</em>' attribute.
	 * @see #isSetQuantiteProjectiles()
	 * @see #unsetQuantiteProjectiles()
	 * @see #setQuantiteProjectiles(long)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeMunitionsASS_QuantiteProjectiles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteProjectiles'"
	 * @generated
	 */
	long getQuantiteProjectiles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeMunitionsASS#getQuantiteProjectiles <em>Quantite Projectiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Projectiles</em>' attribute.
	 * @see #isSetQuantiteProjectiles()
	 * @see #unsetQuantiteProjectiles()
	 * @see #getQuantiteProjectiles()
	 * @generated
	 */
	void setQuantiteProjectiles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVolumeMunitionsASS#getQuantiteProjectiles <em>Quantite Projectiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteProjectiles()
	 * @see #getQuantiteProjectiles()
	 * @see #setQuantiteProjectiles(long)
	 * @generated
	 */
	void unsetQuantiteProjectiles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVolumeMunitionsASS#getQuantiteProjectiles <em>Quantite Projectiles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Projectiles</em>' attribute is set.
	 * @see #unsetQuantiteProjectiles()
	 * @see #getQuantiteProjectiles()
	 * @see #setQuantiteProjectiles(long)
	 * @generated
	 */
	boolean isSetQuantiteProjectiles();

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
	 * @see mpia.schema.SchemaPackage#getTypeVolumeMunitionsASS_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeMunitionsASS#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeVolumeMunitionsASS_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeMunitionsASS#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Type Type Munition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Type Type Munition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Type Type Munition</em>' containment reference.
	 * @see #setEstTypeTypeMunition(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeMunitionsASS_EstTypeTypeMunition()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMunition'"
	 *        extendedMetaData="kind='element' name='EstType_TypeMunition'"
	 * @generated
	 */
	TypeAssociationEXT getEstTypeTypeMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeMunitionsASS#getEstTypeTypeMunition <em>Est Type Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Type Type Munition</em>' containment reference.
	 * @see #getEstTypeTypeMunition()
	 * @generated
	 */
	void setEstTypeTypeMunition(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Type De Lanceur Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type De Lanceur Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type De Lanceur Type Arme</em>' containment reference.
	 * @see #setAPourTypeDeLanceurTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeVolumeMunitionsASS_APourTypeDeLanceurTypeArme()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='APourTypeDeLanceur_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getAPourTypeDeLanceurTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVolumeMunitionsASS#getAPourTypeDeLanceurTypeArme <em>APour Type De Lanceur Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Type De Lanceur Type Arme</em>' containment reference.
	 * @see #getAPourTypeDeLanceurTypeArme()
	 * @generated
	 */
	void setAPourTypeDeLanceurTypeArme(TypeAssociationEXT value);

} // TypeVolumeMunitionsASS
