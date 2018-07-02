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
 * A representation of the model object '<em><b>Type Capacite Observation ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCapaciteObservationASS#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteObservationASS#getNombreEquipesEngagees <em>Nombre Equipes Engagees</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteObservationASS#getNombreEquipesDisponibles <em>Nombre Equipes Disponibles</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteObservationASS#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteObservationASS#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCapaciteObservationASS#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCapaciteObservationASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CapaciteObservationASS' kind='elementOnly'"
 * @generated
 */
public interface TypeCapaciteObservationASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Moyen Acquisition</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Moyen Acquisition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Moyen Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS
	 * @see #isSetTypeMoyenAcquisition()
	 * @see #unsetTypeMoyenAcquisition()
	 * @see #setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteObservationASS_TypeMoyenAcquisition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeMoyenAcquisition'"
	 * @generated
	 */
	TypeDictionaryDicoTypeMoyenAcquisitionASS getTypeMoyenAcquisition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Moyen Acquisition</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeMoyenAcquisitionASS
	 * @see #isSetTypeMoyenAcquisition()
	 * @see #unsetTypeMoyenAcquisition()
	 * @see #getTypeMoyenAcquisition()
	 * @generated
	 */
	void setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMoyenAcquisition()
	 * @see #getTypeMoyenAcquisition()
	 * @see #setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @generated
	 */
	void unsetTypeMoyenAcquisition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getTypeMoyenAcquisition <em>Type Moyen Acquisition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Moyen Acquisition</em>' attribute is set.
	 * @see #unsetTypeMoyenAcquisition()
	 * @see #getTypeMoyenAcquisition()
	 * @see #setTypeMoyenAcquisition(TypeDictionaryDicoTypeMoyenAcquisitionASS)
	 * @generated
	 */
	boolean isSetTypeMoyenAcquisition();

	/**
	 * Returns the value of the '<em><b>Nombre Equipes Engagees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Equipes Engagees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Equipes Engagees</em>' attribute.
	 * @see #isSetNombreEquipesEngagees()
	 * @see #unsetNombreEquipesEngagees()
	 * @see #setNombreEquipesEngagees(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteObservationASS_NombreEquipesEngagees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreEquipesEngagees'"
	 * @generated
	 */
	long getNombreEquipesEngagees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getNombreEquipesEngagees <em>Nombre Equipes Engagees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Equipes Engagees</em>' attribute.
	 * @see #isSetNombreEquipesEngagees()
	 * @see #unsetNombreEquipesEngagees()
	 * @see #getNombreEquipesEngagees()
	 * @generated
	 */
	void setNombreEquipesEngagees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getNombreEquipesEngagees <em>Nombre Equipes Engagees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEquipesEngagees()
	 * @see #getNombreEquipesEngagees()
	 * @see #setNombreEquipesEngagees(long)
	 * @generated
	 */
	void unsetNombreEquipesEngagees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getNombreEquipesEngagees <em>Nombre Equipes Engagees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Equipes Engagees</em>' attribute is set.
	 * @see #unsetNombreEquipesEngagees()
	 * @see #getNombreEquipesEngagees()
	 * @see #setNombreEquipesEngagees(long)
	 * @generated
	 */
	boolean isSetNombreEquipesEngagees();

	/**
	 * Returns the value of the '<em><b>Nombre Equipes Disponibles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Equipes Disponibles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Equipes Disponibles</em>' attribute.
	 * @see #isSetNombreEquipesDisponibles()
	 * @see #unsetNombreEquipesDisponibles()
	 * @see #setNombreEquipesDisponibles(long)
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteObservationASS_NombreEquipesDisponibles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombreEquipesDisponibles'"
	 * @generated
	 */
	long getNombreEquipesDisponibles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getNombreEquipesDisponibles <em>Nombre Equipes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Equipes Disponibles</em>' attribute.
	 * @see #isSetNombreEquipesDisponibles()
	 * @see #unsetNombreEquipesDisponibles()
	 * @see #getNombreEquipesDisponibles()
	 * @generated
	 */
	void setNombreEquipesDisponibles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getNombreEquipesDisponibles <em>Nombre Equipes Disponibles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreEquipesDisponibles()
	 * @see #getNombreEquipesDisponibles()
	 * @see #setNombreEquipesDisponibles(long)
	 * @generated
	 */
	void unsetNombreEquipesDisponibles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getNombreEquipesDisponibles <em>Nombre Equipes Disponibles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Equipes Disponibles</em>' attribute is set.
	 * @see #unsetNombreEquipesDisponibles()
	 * @see #getNombreEquipesDisponibles()
	 * @see #setNombreEquipesDisponibles(long)
	 * @generated
	 */
	boolean isSetNombreEquipesDisponibles();

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
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteObservationASS_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteObservationASS_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCapaciteObservationASS_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCapaciteObservationASS#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeCapaciteObservationASS
