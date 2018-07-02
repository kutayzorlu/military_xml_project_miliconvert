/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mobilite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMobilite#getAttitude <em>Attitude</em>}</li>
 *   <li>{@link mpia.schema.TypeMobilite#getCap <em>Cap</em>}</li>
 *   <li>{@link mpia.schema.TypeMobilite#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeMobilite#getDureeStationnement <em>Duree Stationnement</em>}</li>
 *   <li>{@link mpia.schema.TypeMobilite#getGDHeffectif <em>GD Heffectif</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMobilite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Mobilite' kind='elementOnly'"
 * @generated
 */
public interface TypeMobilite extends EObject {
	/**
	 * Returns the value of the '<em><b>Attitude</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMobiliteAttitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobiliteAttitude
	 * @see #isSetAttitude()
	 * @see #unsetAttitude()
	 * @see #setAttitude(TypeDictionaryDicoMobiliteAttitude)
	 * @see mpia.schema.SchemaPackage#getTypeMobilite_Attitude()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Attitude'"
	 * @generated
	 */
	TypeDictionaryDicoMobiliteAttitude getAttitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMobilite#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMobiliteAttitude
	 * @see #isSetAttitude()
	 * @see #unsetAttitude()
	 * @see #getAttitude()
	 * @generated
	 */
	void setAttitude(TypeDictionaryDicoMobiliteAttitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMobilite#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttitude()
	 * @see #getAttitude()
	 * @see #setAttitude(TypeDictionaryDicoMobiliteAttitude)
	 * @generated
	 */
	void unsetAttitude();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMobilite#getAttitude <em>Attitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attitude</em>' attribute is set.
	 * @see #unsetAttitude()
	 * @see #getAttitude()
	 * @see #setAttitude(TypeDictionaryDicoMobiliteAttitude)
	 * @generated
	 */
	boolean isSetAttitude();

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cap</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' containment reference.
	 * @see #setCap(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeMobilite_Cap()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cap'"
	 * @generated
	 */
	TypeDataTypeAngle getCap();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMobilite#getCap <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' containment reference.
	 * @see #getCap()
	 * @generated
	 */
	void setCap(TypeDataTypeAngle value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMobilite_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMobilite#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Duree Stationnement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Stationnement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Stationnement</em>' containment reference.
	 * @see #setDureeStationnement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeMobilite_DureeStationnement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeStationnement'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeStationnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMobilite#getDureeStationnement <em>Duree Stationnement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Stationnement</em>' containment reference.
	 * @see #getDureeStationnement()
	 * @generated
	 */
	void setDureeStationnement(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>GD Heffectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Heffectif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Heffectif</em>' attribute.
	 * @see #setGDHeffectif(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeMobilite_GDHeffectif()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHeffectif'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHeffectif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMobilite#getGDHeffectif <em>GD Heffectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Heffectif</em>' attribute.
	 * @see #getGDHeffectif()
	 * @generated
	 */
	void setGDHeffectif(XMLGregorianCalendar value);

} // TypeMobilite
