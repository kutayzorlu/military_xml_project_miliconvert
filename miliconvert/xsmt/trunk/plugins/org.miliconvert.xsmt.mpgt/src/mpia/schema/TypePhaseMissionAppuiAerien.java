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
 * A representation of the model object '<em><b>Type Phase Mission Appui Aerien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePhaseMissionAppuiAerien#getDesignation <em>Designation</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseMissionAppuiAerien#getTypePhase <em>Type Phase</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseMissionAppuiAerien#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseMissionAppuiAerien#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseMissionAppuiAerien#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePhaseMissionAppuiAerien#getVautPendantPeriode3D <em>Vaut Pendant Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePhaseMissionAppuiAerien()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PhaseMissionAppuiAerien' kind='elementOnly'"
 * @generated
 */
public interface TypePhaseMissionAppuiAerien extends EObject {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPhaseMissionAppuiAerienDesignation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Designation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Designation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPhaseMissionAppuiAerienDesignation
	 * @see #isSetDesignation()
	 * @see #unsetDesignation()
	 * @see #setDesignation(TypeDictionaryDicoPhaseMissionAppuiAerienDesignation)
	 * @see mpia.schema.SchemaPackage#getTypePhaseMissionAppuiAerien_Designation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Designation'"
	 * @generated
	 */
	TypeDictionaryDicoPhaseMissionAppuiAerienDesignation getDesignation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getDesignation <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Designation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPhaseMissionAppuiAerienDesignation
	 * @see #isSetDesignation()
	 * @see #unsetDesignation()
	 * @see #getDesignation()
	 * @generated
	 */
	void setDesignation(TypeDictionaryDicoPhaseMissionAppuiAerienDesignation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getDesignation <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDesignation()
	 * @see #getDesignation()
	 * @see #setDesignation(TypeDictionaryDicoPhaseMissionAppuiAerienDesignation)
	 * @generated
	 */
	void unsetDesignation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getDesignation <em>Designation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Designation</em>' attribute is set.
	 * @see #unsetDesignation()
	 * @see #getDesignation()
	 * @see #setDesignation(TypeDictionaryDicoPhaseMissionAppuiAerienDesignation)
	 * @generated
	 */
	boolean isSetDesignation();

	/**
	 * Returns the value of the '<em><b>Type Phase</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Phase</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase
	 * @see #isSetTypePhase()
	 * @see #unsetTypePhase()
	 * @see #setTypePhase(TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase)
	 * @see mpia.schema.SchemaPackage#getTypePhaseMissionAppuiAerien_TypePhase()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypePhase'"
	 * @generated
	 */
	TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase getTypePhase();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getTypePhase <em>Type Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Phase</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase
	 * @see #isSetTypePhase()
	 * @see #unsetTypePhase()
	 * @see #getTypePhase()
	 * @generated
	 */
	void setTypePhase(TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getTypePhase <em>Type Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypePhase()
	 * @see #getTypePhase()
	 * @see #setTypePhase(TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase)
	 * @generated
	 */
	void unsetTypePhase();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getTypePhase <em>Type Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Phase</em>' attribute is set.
	 * @see #unsetTypePhase()
	 * @see #getTypePhase()
	 * @see #setTypePhase(TypeDictionaryDicoPhaseMissionAppuiAerienTypePhase)
	 * @generated
	 */
	boolean isSetTypePhase();

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
	 * @see mpia.schema.SchemaPackage#getTypePhaseMissionAppuiAerien_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePhaseMissionAppuiAerien_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePhaseMissionAppuiAerien_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePhaseMissionAppuiAerien#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Vaut Pendant Periode3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePeriode3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pendant Periode3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pendant Periode3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePhaseMissionAppuiAerien_VautPendantPeriode3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='VautPendant_Periode3D'"
	 * @generated
	 */
	EList<TypePeriode3D> getVautPendantPeriode3D();

} // TypePhaseMissionAppuiAerien
