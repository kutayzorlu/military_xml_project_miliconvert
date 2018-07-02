/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Passage Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePassageModule#getHauteurVol <em>Hauteur Vol</em>}</li>
 *   <li>{@link mpia.schema.TypePassageModule#getHeureDePassage <em>Heure De Passage</em>}</li>
 *   <li>{@link mpia.schema.TypePassageModule#getNomLieu <em>Nom Lieu</em>}</li>
 *   <li>{@link mpia.schema.TypePassageModule#getCapDuModule <em>Cap Du Module</em>}</li>
 *   <li>{@link mpia.schema.TypePassageModule#getVitesseModule <em>Vitesse Module</em>}</li>
 *   <li>{@link mpia.schema.TypePassageModule#getPositionLocalisation <em>Position Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePassageModule()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PassageModule' kind='elementOnly'"
 * @generated
 */
public interface TypePassageModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Hauteur Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Vol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Vol</em>' attribute.
	 * @see #isSetHauteurVol()
	 * @see #unsetHauteurVol()
	 * @see #setHauteurVol(long)
	 * @see mpia.schema.SchemaPackage#getTypePassageModule_HauteurVol()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='HauteurVol'"
	 * @generated
	 */
	long getHauteurVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassageModule#getHauteurVol <em>Hauteur Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Vol</em>' attribute.
	 * @see #isSetHauteurVol()
	 * @see #unsetHauteurVol()
	 * @see #getHauteurVol()
	 * @generated
	 */
	void setHauteurVol(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePassageModule#getHauteurVol <em>Hauteur Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHauteurVol()
	 * @see #getHauteurVol()
	 * @see #setHauteurVol(long)
	 * @generated
	 */
	void unsetHauteurVol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePassageModule#getHauteurVol <em>Hauteur Vol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hauteur Vol</em>' attribute is set.
	 * @see #unsetHauteurVol()
	 * @see #getHauteurVol()
	 * @see #setHauteurVol(long)
	 * @generated
	 */
	boolean isSetHauteurVol();

	/**
	 * Returns the value of the '<em><b>Heure De Passage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure De Passage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure De Passage</em>' attribute.
	 * @see #setHeureDePassage(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePassageModule_HeureDePassage()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='HeureDePassage'"
	 * @generated
	 */
	XMLGregorianCalendar getHeureDePassage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassageModule#getHeureDePassage <em>Heure De Passage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure De Passage</em>' attribute.
	 * @see #getHeureDePassage()
	 * @generated
	 */
	void setHeureDePassage(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nom Lieu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Lieu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Lieu</em>' attribute.
	 * @see #setNomLieu(String)
	 * @see mpia.schema.SchemaPackage#getTypePassageModule_NomLieu()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='NomLieu'"
	 * @generated
	 */
	String getNomLieu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassageModule#getNomLieu <em>Nom Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Lieu</em>' attribute.
	 * @see #getNomLieu()
	 * @generated
	 */
	void setNomLieu(String value);

	/**
	 * Returns the value of the '<em><b>Cap Du Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap Du Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap Du Module</em>' attribute.
	 * @see #isSetCapDuModule()
	 * @see #unsetCapDuModule()
	 * @see #setCapDuModule(long)
	 * @see mpia.schema.SchemaPackage#getTypePassageModule_CapDuModule()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='CapDuModule'"
	 * @generated
	 */
	long getCapDuModule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassageModule#getCapDuModule <em>Cap Du Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap Du Module</em>' attribute.
	 * @see #isSetCapDuModule()
	 * @see #unsetCapDuModule()
	 * @see #getCapDuModule()
	 * @generated
	 */
	void setCapDuModule(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePassageModule#getCapDuModule <em>Cap Du Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapDuModule()
	 * @see #getCapDuModule()
	 * @see #setCapDuModule(long)
	 * @generated
	 */
	void unsetCapDuModule();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePassageModule#getCapDuModule <em>Cap Du Module</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cap Du Module</em>' attribute is set.
	 * @see #unsetCapDuModule()
	 * @see #getCapDuModule()
	 * @see #setCapDuModule(long)
	 * @generated
	 */
	boolean isSetCapDuModule();

	/**
	 * Returns the value of the '<em><b>Vitesse Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Module</em>' attribute.
	 * @see #isSetVitesseModule()
	 * @see #unsetVitesseModule()
	 * @see #setVitesseModule(double)
	 * @see mpia.schema.SchemaPackage#getTypePassageModule_VitesseModule()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseModule'"
	 * @generated
	 */
	double getVitesseModule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassageModule#getVitesseModule <em>Vitesse Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Module</em>' attribute.
	 * @see #isSetVitesseModule()
	 * @see #unsetVitesseModule()
	 * @see #getVitesseModule()
	 * @generated
	 */
	void setVitesseModule(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePassageModule#getVitesseModule <em>Vitesse Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseModule()
	 * @see #getVitesseModule()
	 * @see #setVitesseModule(double)
	 * @generated
	 */
	void unsetVitesseModule();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePassageModule#getVitesseModule <em>Vitesse Module</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Module</em>' attribute is set.
	 * @see #unsetVitesseModule()
	 * @see #getVitesseModule()
	 * @see #setVitesseModule(double)
	 * @generated
	 */
	boolean isSetVitesseModule();

	/**
	 * Returns the value of the '<em><b>Position Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Localisation</em>' containment reference.
	 * @see #setPositionLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypePassageModule_PositionLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='Position_Localisation'"
	 * @generated
	 */
	TypeLocalisation getPositionLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePassageModule#getPositionLocalisation <em>Position Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Localisation</em>' containment reference.
	 * @see #getPositionLocalisation()
	 * @generated
	 */
	void setPositionLocalisation(TypeLocalisation value);

} // TypePassageModule
