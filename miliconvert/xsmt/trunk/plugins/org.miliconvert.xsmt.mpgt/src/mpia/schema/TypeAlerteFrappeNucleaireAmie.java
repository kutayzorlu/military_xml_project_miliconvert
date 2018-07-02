/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Alerte Frappe Nucleaire Amie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNomCible <em>Nom Cible</em>}</li>
 *   <li>{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNumeroCible <em>Numero Cible</em>}</li>
 *   <li>{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getGDHfrappe <em>GD Hfrappe</em>}</li>
 *   <li>{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getGDHannulationFrappe <em>GD Hannulation Frappe</em>}</li>
 *   <li>{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNbExplosionsEnSurface <em>Nb Explosions En Surface</em>}</li>
 *   <li>{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNbExplosionsFrappeMultiple <em>Nb Explosions Frappe Multiple</em>}</li>
 *   <li>{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getDistanceMinimaleSecurite1 <em>Distance Minimale Securite1</em>}</li>
 *   <li>{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getDistanceMinimaleSecurite2 <em>Distance Minimale Securite2</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AlerteFrappeNucleaireAmie' kind='elementOnly'"
 * @generated
 */
public interface TypeAlerteFrappeNucleaireAmie extends TypeEvenement {
	/**
	 * Returns the value of the '<em><b>Nom Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Cible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Cible</em>' attribute.
	 * @see #setNomCible(String)
	 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie_NomCible()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='NomCible'"
	 * @generated
	 */
	String getNomCible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNomCible <em>Nom Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Cible</em>' attribute.
	 * @see #getNomCible()
	 * @generated
	 */
	void setNomCible(String value);

	/**
	 * Returns the value of the '<em><b>Numero Cible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Cible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Cible</em>' attribute.
	 * @see #setNumeroCible(String)
	 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie_NumeroCible()
	 * @model dataType="mpia.meta.TypeDataTypeChaine012"
	 *        extendedMetaData="kind='element' name='NumeroCible'"
	 * @generated
	 */
	String getNumeroCible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNumeroCible <em>Numero Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Cible</em>' attribute.
	 * @see #getNumeroCible()
	 * @generated
	 */
	void setNumeroCible(String value);

	/**
	 * Returns the value of the '<em><b>GD Hfrappe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hfrappe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hfrappe</em>' attribute.
	 * @see #setGDHfrappe(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie_GDHfrappe()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHfrappe'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHfrappe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getGDHfrappe <em>GD Hfrappe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hfrappe</em>' attribute.
	 * @see #getGDHfrappe()
	 * @generated
	 */
	void setGDHfrappe(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hannulation Frappe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hannulation Frappe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hannulation Frappe</em>' attribute.
	 * @see #setGDHannulationFrappe(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie_GDHannulationFrappe()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHannulationFrappe'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHannulationFrappe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getGDHannulationFrappe <em>GD Hannulation Frappe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hannulation Frappe</em>' attribute.
	 * @see #getGDHannulationFrappe()
	 * @generated
	 */
	void setGDHannulationFrappe(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nb Explosions En Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Explosions En Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Explosions En Surface</em>' attribute.
	 * @see #isSetNbExplosionsEnSurface()
	 * @see #unsetNbExplosionsEnSurface()
	 * @see #setNbExplosionsEnSurface(long)
	 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie_NbExplosionsEnSurface()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbExplosionsEnSurface'"
	 * @generated
	 */
	long getNbExplosionsEnSurface();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNbExplosionsEnSurface <em>Nb Explosions En Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Explosions En Surface</em>' attribute.
	 * @see #isSetNbExplosionsEnSurface()
	 * @see #unsetNbExplosionsEnSurface()
	 * @see #getNbExplosionsEnSurface()
	 * @generated
	 */
	void setNbExplosionsEnSurface(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNbExplosionsEnSurface <em>Nb Explosions En Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbExplosionsEnSurface()
	 * @see #getNbExplosionsEnSurface()
	 * @see #setNbExplosionsEnSurface(long)
	 * @generated
	 */
	void unsetNbExplosionsEnSurface();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNbExplosionsEnSurface <em>Nb Explosions En Surface</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Explosions En Surface</em>' attribute is set.
	 * @see #unsetNbExplosionsEnSurface()
	 * @see #getNbExplosionsEnSurface()
	 * @see #setNbExplosionsEnSurface(long)
	 * @generated
	 */
	boolean isSetNbExplosionsEnSurface();

	/**
	 * Returns the value of the '<em><b>Nb Explosions Frappe Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nb Explosions Frappe Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Explosions Frappe Multiple</em>' attribute.
	 * @see #isSetNbExplosionsFrappeMultiple()
	 * @see #unsetNbExplosionsFrappeMultiple()
	 * @see #setNbExplosionsFrappeMultiple(long)
	 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie_NbExplosionsFrappeMultiple()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NbExplosionsFrappeMultiple'"
	 * @generated
	 */
	long getNbExplosionsFrappeMultiple();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNbExplosionsFrappeMultiple <em>Nb Explosions Frappe Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Explosions Frappe Multiple</em>' attribute.
	 * @see #isSetNbExplosionsFrappeMultiple()
	 * @see #unsetNbExplosionsFrappeMultiple()
	 * @see #getNbExplosionsFrappeMultiple()
	 * @generated
	 */
	void setNbExplosionsFrappeMultiple(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNbExplosionsFrappeMultiple <em>Nb Explosions Frappe Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNbExplosionsFrappeMultiple()
	 * @see #getNbExplosionsFrappeMultiple()
	 * @see #setNbExplosionsFrappeMultiple(long)
	 * @generated
	 */
	void unsetNbExplosionsFrappeMultiple();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getNbExplosionsFrappeMultiple <em>Nb Explosions Frappe Multiple</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nb Explosions Frappe Multiple</em>' attribute is set.
	 * @see #unsetNbExplosionsFrappeMultiple()
	 * @see #getNbExplosionsFrappeMultiple()
	 * @see #setNbExplosionsFrappeMultiple(long)
	 * @generated
	 */
	boolean isSetNbExplosionsFrappeMultiple();

	/**
	 * Returns the value of the '<em><b>Distance Minimale Securite1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Minimale Securite1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Minimale Securite1</em>' containment reference.
	 * @see #setDistanceMinimaleSecurite1(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie_DistanceMinimaleSecurite1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceMinimaleSecurite1'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceMinimaleSecurite1();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getDistanceMinimaleSecurite1 <em>Distance Minimale Securite1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Minimale Securite1</em>' containment reference.
	 * @see #getDistanceMinimaleSecurite1()
	 * @generated
	 */
	void setDistanceMinimaleSecurite1(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Distance Minimale Securite2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Minimale Securite2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Minimale Securite2</em>' containment reference.
	 * @see #setDistanceMinimaleSecurite2(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeAlerteFrappeNucleaireAmie_DistanceMinimaleSecurite2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceMinimaleSecurite2'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceMinimaleSecurite2();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAlerteFrappeNucleaireAmie#getDistanceMinimaleSecurite2 <em>Distance Minimale Securite2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Minimale Securite2</em>' containment reference.
	 * @see #getDistanceMinimaleSecurite2()
	 * @generated
	 */
	void setDistanceMinimaleSecurite2(TypeDataTypeLongueur value);

} // TypeAlerteFrappeNucleaireAmie
