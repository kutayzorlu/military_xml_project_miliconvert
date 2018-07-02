/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Caracteristique Transport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#getClassePoidsMilitaire <em>Classe Poids Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#getCategorieMobilite <em>Categorie Mobilite</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParRoute <em>Transportable Par Route</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#getLargeurTransport <em>Largeur Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParRail <em>Transportable Par Rail</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#getHauteurTransport <em>Hauteur Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParMer <em>Transportable Par Mer</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParAir <em>Transportable Par Air</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParVoieFluviale <em>Transportable Par Voie Fluviale</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiqueTransport#getLongueurTransport <em>Longueur Transport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiqueTransport' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiqueTransport extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Classe Poids Militaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Poids Militaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Poids Militaire</em>' attribute.
	 * @see #setClassePoidsMilitaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_ClassePoidsMilitaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='ClassePoidsMilitaire'"
	 * @generated
	 */
	String getClassePoidsMilitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#getClassePoidsMilitaire <em>Classe Poids Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Poids Militaire</em>' attribute.
	 * @see #getClassePoidsMilitaire()
	 * @generated
	 */
	void setClassePoidsMilitaire(String value);

	/**
	 * Returns the value of the '<em><b>Categorie Mobilite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Mobilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Mobilite</em>' attribute.
	 * @see #setCategorieMobilite(String)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_CategorieMobilite()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='CategorieMobilite'"
	 * @generated
	 */
	String getCategorieMobilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#getCategorieMobilite <em>Categorie Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Mobilite</em>' attribute.
	 * @see #getCategorieMobilite()
	 * @generated
	 */
	void setCategorieMobilite(String value);

	/**
	 * Returns the value of the '<em><b>Transportable Par Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportable Par Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportable Par Route</em>' attribute.
	 * @see #isSetTransportableParRoute()
	 * @see #unsetTransportableParRoute()
	 * @see #setTransportableParRoute(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_TransportableParRoute()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportableParRoute'"
	 * @generated
	 */
	boolean isTransportableParRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParRoute <em>Transportable Par Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportable Par Route</em>' attribute.
	 * @see #isSetTransportableParRoute()
	 * @see #unsetTransportableParRoute()
	 * @see #isTransportableParRoute()
	 * @generated
	 */
	void setTransportableParRoute(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParRoute <em>Transportable Par Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportableParRoute()
	 * @see #isTransportableParRoute()
	 * @see #setTransportableParRoute(boolean)
	 * @generated
	 */
	void unsetTransportableParRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParRoute <em>Transportable Par Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transportable Par Route</em>' attribute is set.
	 * @see #unsetTransportableParRoute()
	 * @see #isTransportableParRoute()
	 * @see #setTransportableParRoute(boolean)
	 * @generated
	 */
	boolean isSetTransportableParRoute();

	/**
	 * Returns the value of the '<em><b>Largeur Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Transport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Transport</em>' containment reference.
	 * @see #setLargeurTransport(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_LargeurTransport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurTransport'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#getLargeurTransport <em>Largeur Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Transport</em>' containment reference.
	 * @see #getLargeurTransport()
	 * @generated
	 */
	void setLargeurTransport(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Transportable Par Rail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportable Par Rail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportable Par Rail</em>' attribute.
	 * @see #isSetTransportableParRail()
	 * @see #unsetTransportableParRail()
	 * @see #setTransportableParRail(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_TransportableParRail()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportableParRail'"
	 * @generated
	 */
	boolean isTransportableParRail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParRail <em>Transportable Par Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportable Par Rail</em>' attribute.
	 * @see #isSetTransportableParRail()
	 * @see #unsetTransportableParRail()
	 * @see #isTransportableParRail()
	 * @generated
	 */
	void setTransportableParRail(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParRail <em>Transportable Par Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportableParRail()
	 * @see #isTransportableParRail()
	 * @see #setTransportableParRail(boolean)
	 * @generated
	 */
	void unsetTransportableParRail();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParRail <em>Transportable Par Rail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transportable Par Rail</em>' attribute is set.
	 * @see #unsetTransportableParRail()
	 * @see #isTransportableParRail()
	 * @see #setTransportableParRail(boolean)
	 * @generated
	 */
	boolean isSetTransportableParRail();

	/**
	 * Returns the value of the '<em><b>Hauteur Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Transport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Transport</em>' containment reference.
	 * @see #setHauteurTransport(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_HauteurTransport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurTransport'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#getHauteurTransport <em>Hauteur Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Transport</em>' containment reference.
	 * @see #getHauteurTransport()
	 * @generated
	 */
	void setHauteurTransport(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Transportable Par Mer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportable Par Mer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportable Par Mer</em>' attribute.
	 * @see #isSetTransportableParMer()
	 * @see #unsetTransportableParMer()
	 * @see #setTransportableParMer(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_TransportableParMer()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportableParMer'"
	 * @generated
	 */
	boolean isTransportableParMer();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParMer <em>Transportable Par Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportable Par Mer</em>' attribute.
	 * @see #isSetTransportableParMer()
	 * @see #unsetTransportableParMer()
	 * @see #isTransportableParMer()
	 * @generated
	 */
	void setTransportableParMer(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParMer <em>Transportable Par Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportableParMer()
	 * @see #isTransportableParMer()
	 * @see #setTransportableParMer(boolean)
	 * @generated
	 */
	void unsetTransportableParMer();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParMer <em>Transportable Par Mer</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transportable Par Mer</em>' attribute is set.
	 * @see #unsetTransportableParMer()
	 * @see #isTransportableParMer()
	 * @see #setTransportableParMer(boolean)
	 * @generated
	 */
	boolean isSetTransportableParMer();

	/**
	 * Returns the value of the '<em><b>Transportable Par Air</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportable Par Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportable Par Air</em>' attribute.
	 * @see #isSetTransportableParAir()
	 * @see #unsetTransportableParAir()
	 * @see #setTransportableParAir(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_TransportableParAir()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportableParAir'"
	 * @generated
	 */
	boolean isTransportableParAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParAir <em>Transportable Par Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportable Par Air</em>' attribute.
	 * @see #isSetTransportableParAir()
	 * @see #unsetTransportableParAir()
	 * @see #isTransportableParAir()
	 * @generated
	 */
	void setTransportableParAir(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParAir <em>Transportable Par Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportableParAir()
	 * @see #isTransportableParAir()
	 * @see #setTransportableParAir(boolean)
	 * @generated
	 */
	void unsetTransportableParAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParAir <em>Transportable Par Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transportable Par Air</em>' attribute is set.
	 * @see #unsetTransportableParAir()
	 * @see #isTransportableParAir()
	 * @see #setTransportableParAir(boolean)
	 * @generated
	 */
	boolean isSetTransportableParAir();

	/**
	 * Returns the value of the '<em><b>Transportable Par Voie Fluviale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transportable Par Voie Fluviale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transportable Par Voie Fluviale</em>' attribute.
	 * @see #isSetTransportableParVoieFluviale()
	 * @see #unsetTransportableParVoieFluviale()
	 * @see #setTransportableParVoieFluviale(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_TransportableParVoieFluviale()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransportableParVoieFluviale'"
	 * @generated
	 */
	boolean isTransportableParVoieFluviale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParVoieFluviale <em>Transportable Par Voie Fluviale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportable Par Voie Fluviale</em>' attribute.
	 * @see #isSetTransportableParVoieFluviale()
	 * @see #unsetTransportableParVoieFluviale()
	 * @see #isTransportableParVoieFluviale()
	 * @generated
	 */
	void setTransportableParVoieFluviale(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParVoieFluviale <em>Transportable Par Voie Fluviale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransportableParVoieFluviale()
	 * @see #isTransportableParVoieFluviale()
	 * @see #setTransportableParVoieFluviale(boolean)
	 * @generated
	 */
	void unsetTransportableParVoieFluviale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#isTransportableParVoieFluviale <em>Transportable Par Voie Fluviale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transportable Par Voie Fluviale</em>' attribute is set.
	 * @see #unsetTransportableParVoieFluviale()
	 * @see #isTransportableParVoieFluviale()
	 * @see #setTransportableParVoieFluviale(boolean)
	 * @generated
	 */
	boolean isSetTransportableParVoieFluviale();

	/**
	 * Returns the value of the '<em><b>Longueur Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Transport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Transport</em>' containment reference.
	 * @see #setLongueurTransport(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiqueTransport_LongueurTransport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongueurTransport'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueurTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiqueTransport#getLongueurTransport <em>Longueur Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Transport</em>' containment reference.
	 * @see #getLongueurTransport()
	 * @generated
	 */
	void setLongueurTransport(TypeDataTypeLongueur value);

} // TypeCaracteristiqueTransport
