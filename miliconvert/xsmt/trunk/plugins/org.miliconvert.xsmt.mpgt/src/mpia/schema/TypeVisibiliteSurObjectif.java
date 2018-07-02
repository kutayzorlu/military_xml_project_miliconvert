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
 * A representation of the model object '<em><b>Type Visibilite Sur Objectif</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeVisibiliteSurObjectif#getTypeVisibilite <em>Type Visibilite</em>}</li>
 *   <li>{@link mpia.schema.TypeVisibiliteSurObjectif#getDistance <em>Distance</em>}</li>
 *   <li>{@link mpia.schema.TypeVisibiliteSurObjectif#isCamouflageIR <em>Camouflage IR</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeVisibiliteSurObjectif()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_VisibiliteSurObjectif' kind='elementOnly'"
 * @generated
 */
public interface TypeVisibiliteSurObjectif extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Visibilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Visibilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Visibilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite
	 * @see #isSetTypeVisibilite()
	 * @see #unsetTypeVisibilite()
	 * @see #setTypeVisibilite(TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite)
	 * @see mpia.schema.SchemaPackage#getTypeVisibiliteSurObjectif_TypeVisibilite()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeVisibilite'"
	 * @generated
	 */
	TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite getTypeVisibilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVisibiliteSurObjectif#getTypeVisibilite <em>Type Visibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Visibilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite
	 * @see #isSetTypeVisibilite()
	 * @see #unsetTypeVisibilite()
	 * @see #getTypeVisibilite()
	 * @generated
	 */
	void setTypeVisibilite(TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVisibiliteSurObjectif#getTypeVisibilite <em>Type Visibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeVisibilite()
	 * @see #getTypeVisibilite()
	 * @see #setTypeVisibilite(TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite)
	 * @generated
	 */
	void unsetTypeVisibilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVisibiliteSurObjectif#getTypeVisibilite <em>Type Visibilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Visibilite</em>' attribute is set.
	 * @see #unsetTypeVisibilite()
	 * @see #getTypeVisibilite()
	 * @see #setTypeVisibilite(TypeDictionaryDicoVisibiliteSurObjectifTypeVisibilite)
	 * @generated
	 */
	boolean isSetTypeVisibilite();

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeVisibiliteSurObjectif_Distance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Distance'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVisibiliteSurObjectif#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Camouflage IR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camouflage IR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camouflage IR</em>' attribute.
	 * @see #isSetCamouflageIR()
	 * @see #unsetCamouflageIR()
	 * @see #setCamouflageIR(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeVisibiliteSurObjectif_CamouflageIR()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='CamouflageIR'"
	 * @generated
	 */
	boolean isCamouflageIR();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeVisibiliteSurObjectif#isCamouflageIR <em>Camouflage IR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camouflage IR</em>' attribute.
	 * @see #isSetCamouflageIR()
	 * @see #unsetCamouflageIR()
	 * @see #isCamouflageIR()
	 * @generated
	 */
	void setCamouflageIR(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeVisibiliteSurObjectif#isCamouflageIR <em>Camouflage IR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCamouflageIR()
	 * @see #isCamouflageIR()
	 * @see #setCamouflageIR(boolean)
	 * @generated
	 */
	void unsetCamouflageIR();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeVisibiliteSurObjectif#isCamouflageIR <em>Camouflage IR</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Camouflage IR</em>' attribute is set.
	 * @see #unsetCamouflageIR()
	 * @see #isCamouflageIR()
	 * @see #setCamouflageIR(boolean)
	 * @generated
	 */
	boolean isSetCamouflageIR();

} // TypeVisibiliteSurObjectif
