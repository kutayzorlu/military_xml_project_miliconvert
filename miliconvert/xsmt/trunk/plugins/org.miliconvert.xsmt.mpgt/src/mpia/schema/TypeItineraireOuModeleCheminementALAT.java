/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Itineraire Ou Modele Cheminement ALAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeItineraireOuModeleCheminementALAT#getSensRoute <em>Sens Route</em>}</li>
 *   <li>{@link mpia.schema.TypeItineraireOuModeleCheminementALAT#getInclusSite <em>Inclus Site</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeItineraireOuModeleCheminementALAT()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ItineraireOuModeleCheminementALAT' kind='elementOnly'"
 * @generated
 */
public interface TypeItineraireOuModeleCheminementALAT extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Sens Route</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModaliteSens}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sens Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sens Route</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteSens
	 * @see #isSetSensRoute()
	 * @see #unsetSensRoute()
	 * @see #setSensRoute(TypeDictionaryDicoModaliteSens)
	 * @see mpia.schema.SchemaPackage#getTypeItineraireOuModeleCheminementALAT_SensRoute()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SensRoute'"
	 * @generated
	 */
	TypeDictionaryDicoModaliteSens getSensRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraireOuModeleCheminementALAT#getSensRoute <em>Sens Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sens Route</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteSens
	 * @see #isSetSensRoute()
	 * @see #unsetSensRoute()
	 * @see #getSensRoute()
	 * @generated
	 */
	void setSensRoute(TypeDictionaryDicoModaliteSens value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeItineraireOuModeleCheminementALAT#getSensRoute <em>Sens Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensRoute()
	 * @see #getSensRoute()
	 * @see #setSensRoute(TypeDictionaryDicoModaliteSens)
	 * @generated
	 */
	void unsetSensRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeItineraireOuModeleCheminementALAT#getSensRoute <em>Sens Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sens Route</em>' attribute is set.
	 * @see #unsetSensRoute()
	 * @see #getSensRoute()
	 * @see #setSensRoute(TypeDictionaryDicoModaliteSens)
	 * @generated
	 */
	boolean isSetSensRoute();

	/**
	 * Returns the value of the '<em><b>Inclus Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inclus Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inclus Site</em>' containment reference.
	 * @see #setInclusSite(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeItineraireOuModeleCheminementALAT_InclusSite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Site'"
	 *        extendedMetaData="kind='element' name='Inclus_Site'"
	 * @generated
	 */
	TypeAssociation getInclusSite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeItineraireOuModeleCheminementALAT#getInclusSite <em>Inclus Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclus Site</em>' containment reference.
	 * @see #getInclusSite()
	 * @generated
	 */
	void setInclusSite(TypeAssociation value);

} // TypeItineraireOuModeleCheminementALAT
