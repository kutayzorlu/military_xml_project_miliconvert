/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Route Helicoptere ALAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeRouteHelicoptereALAT#getTypeRoute <em>Type Route</em>}</li>
 *   <li>{@link mpia.schema.TypeRouteHelicoptereALAT#getSousCategorieTextuelle <em>Sous Categorie Textuelle</em>}</li>
 *   <li>{@link mpia.schema.TypeRouteHelicoptereALAT#getMajorantDistance <em>Majorant Distance</em>}</li>
 *   <li>{@link mpia.schema.TypeRouteHelicoptereALAT#getPenteRoute <em>Pente Route</em>}</li>
 *   <li>{@link mpia.schema.TypeRouteHelicoptereALAT#getSensRoute <em>Sens Route</em>}</li>
 *   <li>{@link mpia.schema.TypeRouteHelicoptereALAT#getVitesse <em>Vitesse</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeRouteHelicoptereALAT()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_RouteHelicoptereALAT' kind='elementOnly'"
 * @generated
 */
public interface TypeRouteHelicoptereALAT extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Type Route</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeVol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Route</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVol
	 * @see #isSetTypeRoute()
	 * @see #unsetTypeRoute()
	 * @see #setTypeRoute(TypeDictionaryDicoTypeVol)
	 * @see mpia.schema.SchemaPackage#getTypeRouteHelicoptereALAT_TypeRoute()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeRoute'"
	 * @generated
	 */
	TypeDictionaryDicoTypeVol getTypeRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getTypeRoute <em>Type Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Route</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeVol
	 * @see #isSetTypeRoute()
	 * @see #unsetTypeRoute()
	 * @see #getTypeRoute()
	 * @generated
	 */
	void setTypeRoute(TypeDictionaryDicoTypeVol value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getTypeRoute <em>Type Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeRoute()
	 * @see #getTypeRoute()
	 * @see #setTypeRoute(TypeDictionaryDicoTypeVol)
	 * @generated
	 */
	void unsetTypeRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getTypeRoute <em>Type Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Route</em>' attribute is set.
	 * @see #unsetTypeRoute()
	 * @see #getTypeRoute()
	 * @see #setTypeRoute(TypeDictionaryDicoTypeVol)
	 * @generated
	 */
	boolean isSetTypeRoute();

	/**
	 * Returns the value of the '<em><b>Sous Categorie Textuelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie Textuelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie Textuelle</em>' attribute.
	 * @see #setSousCategorieTextuelle(String)
	 * @see mpia.schema.SchemaPackage#getTypeRouteHelicoptereALAT_SousCategorieTextuelle()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='SousCategorieTextuelle'"
	 * @generated
	 */
	String getSousCategorieTextuelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getSousCategorieTextuelle <em>Sous Categorie Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie Textuelle</em>' attribute.
	 * @see #getSousCategorieTextuelle()
	 * @generated
	 */
	void setSousCategorieTextuelle(String value);

	/**
	 * Returns the value of the '<em><b>Majorant Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Majorant Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Majorant Distance</em>' attribute.
	 * @see #isSetMajorantDistance()
	 * @see #unsetMajorantDistance()
	 * @see #setMajorantDistance(long)
	 * @see mpia.schema.SchemaPackage#getTypeRouteHelicoptereALAT_MajorantDistance()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='MajorantDistance'"
	 * @generated
	 */
	long getMajorantDistance();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getMajorantDistance <em>Majorant Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Majorant Distance</em>' attribute.
	 * @see #isSetMajorantDistance()
	 * @see #unsetMajorantDistance()
	 * @see #getMajorantDistance()
	 * @generated
	 */
	void setMajorantDistance(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getMajorantDistance <em>Majorant Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMajorantDistance()
	 * @see #getMajorantDistance()
	 * @see #setMajorantDistance(long)
	 * @generated
	 */
	void unsetMajorantDistance();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getMajorantDistance <em>Majorant Distance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Majorant Distance</em>' attribute is set.
	 * @see #unsetMajorantDistance()
	 * @see #getMajorantDistance()
	 * @see #setMajorantDistance(long)
	 * @generated
	 */
	boolean isSetMajorantDistance();

	/**
	 * Returns the value of the '<em><b>Pente Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pente Route</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pente Route</em>' containment reference.
	 * @see #setPenteRoute(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeRouteHelicoptereALAT_PenteRoute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PenteRoute'"
	 * @generated
	 */
	TypeDataTypeAngle getPenteRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getPenteRoute <em>Pente Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pente Route</em>' containment reference.
	 * @see #getPenteRoute()
	 * @generated
	 */
	void setPenteRoute(TypeDataTypeAngle value);

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
	 * @see mpia.schema.SchemaPackage#getTypeRouteHelicoptereALAT_SensRoute()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SensRoute'"
	 * @generated
	 */
	TypeDictionaryDicoModaliteSens getSensRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getSensRoute <em>Sens Route</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getSensRoute <em>Sens Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSensRoute()
	 * @see #getSensRoute()
	 * @see #setSensRoute(TypeDictionaryDicoModaliteSens)
	 * @generated
	 */
	void unsetSensRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getSensRoute <em>Sens Route</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeRouteHelicoptereALAT_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeRouteHelicoptereALAT#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

} // TypeRouteHelicoptereALAT
