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
 * A representation of the model object '<em><b>Type Mission COBRA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMissionCOBRA#getTypeMissionCOBRA <em>Type Mission COBRA</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionCOBRA#getConfianceBatterieENI <em>Confiance Batterie ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionCOBRA#isDelegationTir <em>Delegation Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionCOBRA#getDistanceEntreBatteries <em>Distance Entre Batteries</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionCOBRA#getMissionAlerteurs <em>Mission Alerteurs</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionCOBRA#getNombreTirsDelegues <em>Nombre Tirs Delegues</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionCOBRA#getNombreMinimumTrajectoires <em>Nombre Minimum Trajectoires</em>}</li>
 *   <li>{@link mpia.schema.TypeMissionCOBRA#getCommentaireDelegationTir <em>Commentaire Delegation Tir</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MissionCOBRA' kind='elementOnly'"
 * @generated
 */
public interface TypeMissionCOBRA extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Mission COBRA</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionCOBRATypeMissionCOBRA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Mission COBRA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Mission COBRA</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionCOBRATypeMissionCOBRA
	 * @see #isSetTypeMissionCOBRA()
	 * @see #unsetTypeMissionCOBRA()
	 * @see #setTypeMissionCOBRA(TypeDictionaryDicoMissionCOBRATypeMissionCOBRA)
	 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA_TypeMissionCOBRA()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMissionCOBRA'"
	 * @generated
	 */
	TypeDictionaryDicoMissionCOBRATypeMissionCOBRA getTypeMissionCOBRA();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionCOBRA#getTypeMissionCOBRA <em>Type Mission COBRA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Mission COBRA</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionCOBRATypeMissionCOBRA
	 * @see #isSetTypeMissionCOBRA()
	 * @see #unsetTypeMissionCOBRA()
	 * @see #getTypeMissionCOBRA()
	 * @generated
	 */
	void setTypeMissionCOBRA(TypeDictionaryDicoMissionCOBRATypeMissionCOBRA value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionCOBRA#getTypeMissionCOBRA <em>Type Mission COBRA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMissionCOBRA()
	 * @see #getTypeMissionCOBRA()
	 * @see #setTypeMissionCOBRA(TypeDictionaryDicoMissionCOBRATypeMissionCOBRA)
	 * @generated
	 */
	void unsetTypeMissionCOBRA();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionCOBRA#getTypeMissionCOBRA <em>Type Mission COBRA</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Mission COBRA</em>' attribute is set.
	 * @see #unsetTypeMissionCOBRA()
	 * @see #getTypeMissionCOBRA()
	 * @see #setTypeMissionCOBRA(TypeDictionaryDicoMissionCOBRATypeMissionCOBRA)
	 * @generated
	 */
	boolean isSetTypeMissionCOBRA();

	/**
	 * Returns the value of the '<em><b>Confiance Batterie ENI</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMissionCOBRAConfianceBatterieENI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confiance Batterie ENI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confiance Batterie ENI</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionCOBRAConfianceBatterieENI
	 * @see #isSetConfianceBatterieENI()
	 * @see #unsetConfianceBatterieENI()
	 * @see #setConfianceBatterieENI(TypeDictionaryDicoMissionCOBRAConfianceBatterieENI)
	 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA_ConfianceBatterieENI()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConfianceBatterieENI'"
	 * @generated
	 */
	TypeDictionaryDicoMissionCOBRAConfianceBatterieENI getConfianceBatterieENI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionCOBRA#getConfianceBatterieENI <em>Confiance Batterie ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confiance Batterie ENI</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMissionCOBRAConfianceBatterieENI
	 * @see #isSetConfianceBatterieENI()
	 * @see #unsetConfianceBatterieENI()
	 * @see #getConfianceBatterieENI()
	 * @generated
	 */
	void setConfianceBatterieENI(TypeDictionaryDicoMissionCOBRAConfianceBatterieENI value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionCOBRA#getConfianceBatterieENI <em>Confiance Batterie ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConfianceBatterieENI()
	 * @see #getConfianceBatterieENI()
	 * @see #setConfianceBatterieENI(TypeDictionaryDicoMissionCOBRAConfianceBatterieENI)
	 * @generated
	 */
	void unsetConfianceBatterieENI();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionCOBRA#getConfianceBatterieENI <em>Confiance Batterie ENI</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Confiance Batterie ENI</em>' attribute is set.
	 * @see #unsetConfianceBatterieENI()
	 * @see #getConfianceBatterieENI()
	 * @see #setConfianceBatterieENI(TypeDictionaryDicoMissionCOBRAConfianceBatterieENI)
	 * @generated
	 */
	boolean isSetConfianceBatterieENI();

	/**
	 * Returns the value of the '<em><b>Delegation Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delegation Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delegation Tir</em>' attribute.
	 * @see #isSetDelegationTir()
	 * @see #unsetDelegationTir()
	 * @see #setDelegationTir(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA_DelegationTir()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='DelegationTir'"
	 * @generated
	 */
	boolean isDelegationTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionCOBRA#isDelegationTir <em>Delegation Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegation Tir</em>' attribute.
	 * @see #isSetDelegationTir()
	 * @see #unsetDelegationTir()
	 * @see #isDelegationTir()
	 * @generated
	 */
	void setDelegationTir(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionCOBRA#isDelegationTir <em>Delegation Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDelegationTir()
	 * @see #isDelegationTir()
	 * @see #setDelegationTir(boolean)
	 * @generated
	 */
	void unsetDelegationTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionCOBRA#isDelegationTir <em>Delegation Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Delegation Tir</em>' attribute is set.
	 * @see #unsetDelegationTir()
	 * @see #isDelegationTir()
	 * @see #setDelegationTir(boolean)
	 * @generated
	 */
	boolean isSetDelegationTir();

	/**
	 * Returns the value of the '<em><b>Distance Entre Batteries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Entre Batteries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Entre Batteries</em>' containment reference.
	 * @see #setDistanceEntreBatteries(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA_DistanceEntreBatteries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceEntreBatteries'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceEntreBatteries();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionCOBRA#getDistanceEntreBatteries <em>Distance Entre Batteries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Entre Batteries</em>' containment reference.
	 * @see #getDistanceEntreBatteries()
	 * @generated
	 */
	void setDistanceEntreBatteries(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Mission Alerteurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission Alerteurs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission Alerteurs</em>' attribute.
	 * @see #setMissionAlerteurs(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA_MissionAlerteurs()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='MissionAlerteurs'"
	 * @generated
	 */
	String getMissionAlerteurs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionCOBRA#getMissionAlerteurs <em>Mission Alerteurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission Alerteurs</em>' attribute.
	 * @see #getMissionAlerteurs()
	 * @generated
	 */
	void setMissionAlerteurs(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Tirs Delegues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Tirs Delegues</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Tirs Delegues</em>' attribute.
	 * @see #isSetNombreTirsDelegues()
	 * @see #unsetNombreTirsDelegues()
	 * @see #setNombreTirsDelegues(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA_NombreTirsDelegues()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreTirsDelegues'"
	 * @generated
	 */
	long getNombreTirsDelegues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionCOBRA#getNombreTirsDelegues <em>Nombre Tirs Delegues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Tirs Delegues</em>' attribute.
	 * @see #isSetNombreTirsDelegues()
	 * @see #unsetNombreTirsDelegues()
	 * @see #getNombreTirsDelegues()
	 * @generated
	 */
	void setNombreTirsDelegues(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionCOBRA#getNombreTirsDelegues <em>Nombre Tirs Delegues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTirsDelegues()
	 * @see #getNombreTirsDelegues()
	 * @see #setNombreTirsDelegues(long)
	 * @generated
	 */
	void unsetNombreTirsDelegues();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionCOBRA#getNombreTirsDelegues <em>Nombre Tirs Delegues</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Tirs Delegues</em>' attribute is set.
	 * @see #unsetNombreTirsDelegues()
	 * @see #getNombreTirsDelegues()
	 * @see #setNombreTirsDelegues(long)
	 * @generated
	 */
	boolean isSetNombreTirsDelegues();

	/**
	 * Returns the value of the '<em><b>Nombre Minimum Trajectoires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Minimum Trajectoires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Minimum Trajectoires</em>' attribute.
	 * @see #isSetNombreMinimumTrajectoires()
	 * @see #unsetNombreMinimumTrajectoires()
	 * @see #setNombreMinimumTrajectoires(long)
	 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA_NombreMinimumTrajectoires()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreMinimumTrajectoires'"
	 * @generated
	 */
	long getNombreMinimumTrajectoires();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionCOBRA#getNombreMinimumTrajectoires <em>Nombre Minimum Trajectoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Minimum Trajectoires</em>' attribute.
	 * @see #isSetNombreMinimumTrajectoires()
	 * @see #unsetNombreMinimumTrajectoires()
	 * @see #getNombreMinimumTrajectoires()
	 * @generated
	 */
	void setNombreMinimumTrajectoires(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMissionCOBRA#getNombreMinimumTrajectoires <em>Nombre Minimum Trajectoires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMinimumTrajectoires()
	 * @see #getNombreMinimumTrajectoires()
	 * @see #setNombreMinimumTrajectoires(long)
	 * @generated
	 */
	void unsetNombreMinimumTrajectoires();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMissionCOBRA#getNombreMinimumTrajectoires <em>Nombre Minimum Trajectoires</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Minimum Trajectoires</em>' attribute is set.
	 * @see #unsetNombreMinimumTrajectoires()
	 * @see #getNombreMinimumTrajectoires()
	 * @see #setNombreMinimumTrajectoires(long)
	 * @generated
	 */
	boolean isSetNombreMinimumTrajectoires();

	/**
	 * Returns the value of the '<em><b>Commentaire Delegation Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Delegation Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Delegation Tir</em>' attribute.
	 * @see #setCommentaireDelegationTir(String)
	 * @see mpia.schema.SchemaPackage#getTypeMissionCOBRA_CommentaireDelegationTir()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='CommentaireDelegationTir'"
	 * @generated
	 */
	String getCommentaireDelegationTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMissionCOBRA#getCommentaireDelegationTir <em>Commentaire Delegation Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Delegation Tir</em>' attribute.
	 * @see #getCommentaireDelegationTir()
	 * @generated
	 */
	void setCommentaireDelegationTir(String value);

} // TypeMissionCOBRA
