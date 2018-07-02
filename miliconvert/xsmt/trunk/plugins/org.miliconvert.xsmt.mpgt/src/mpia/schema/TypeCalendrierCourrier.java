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
 * A representation of the model object '<em><b>Type Calendrier Courrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCalendrierCourrier#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.TypeCalendrierCourrier#getMoyenTransport <em>Moyen Transport</em>}</li>
 *   <li>{@link mpia.schema.TypeCalendrierCourrier#getClassificationOtan <em>Classification Otan</em>}</li>
 *   <li>{@link mpia.schema.TypeCalendrierCourrier#getDateDepart <em>Date Depart</em>}</li>
 *   <li>{@link mpia.schema.TypeCalendrierCourrier#getDateArrivee <em>Date Arrivee</em>}</li>
 *   <li>{@link mpia.schema.TypeCalendrierCourrier#getTypeLocalisation <em>Type Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeCalendrierCourrier#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCalendrierCourrier#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CalendrierCourrier' kind='elementOnly'"
 * @generated
 */
public interface TypeCalendrierCourrier extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant</em>' attribute.
	 * @see #setIdentifiant(String)
	 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier_Identifiant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        extendedMetaData="kind='element' name='Identifiant'"
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

	/**
	 * Returns the value of the '<em><b>Moyen Transport</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCalendrierCourrierMoyenTransport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyen Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyen Transport</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCalendrierCourrierMoyenTransport
	 * @see #isSetMoyenTransport()
	 * @see #unsetMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoCalendrierCourrierMoyenTransport)
	 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier_MoyenTransport()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MoyenTransport'"
	 * @generated
	 */
	TypeDictionaryDicoCalendrierCourrierMoyenTransport getMoyenTransport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getMoyenTransport <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyen Transport</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCalendrierCourrierMoyenTransport
	 * @see #isSetMoyenTransport()
	 * @see #unsetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @generated
	 */
	void setMoyenTransport(TypeDictionaryDicoCalendrierCourrierMoyenTransport value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getMoyenTransport <em>Moyen Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoCalendrierCourrierMoyenTransport)
	 * @generated
	 */
	void unsetMoyenTransport();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCalendrierCourrier#getMoyenTransport <em>Moyen Transport</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Moyen Transport</em>' attribute is set.
	 * @see #unsetMoyenTransport()
	 * @see #getMoyenTransport()
	 * @see #setMoyenTransport(TypeDictionaryDicoCalendrierCourrierMoyenTransport)
	 * @generated
	 */
	boolean isSetMoyenTransport();

	/**
	 * Returns the value of the '<em><b>Classification Otan</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConfidentialiteOTAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Otan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Otan</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConfidentialiteOTAN
	 * @see #isSetClassificationOtan()
	 * @see #unsetClassificationOtan()
	 * @see #setClassificationOtan(TypeDictionaryDicoConfidentialiteOTAN)
	 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier_ClassificationOtan()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ClassificationOtan'"
	 * @generated
	 */
	TypeDictionaryDicoConfidentialiteOTAN getClassificationOtan();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getClassificationOtan <em>Classification Otan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Otan</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConfidentialiteOTAN
	 * @see #isSetClassificationOtan()
	 * @see #unsetClassificationOtan()
	 * @see #getClassificationOtan()
	 * @generated
	 */
	void setClassificationOtan(TypeDictionaryDicoConfidentialiteOTAN value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getClassificationOtan <em>Classification Otan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClassificationOtan()
	 * @see #getClassificationOtan()
	 * @see #setClassificationOtan(TypeDictionaryDicoConfidentialiteOTAN)
	 * @generated
	 */
	void unsetClassificationOtan();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCalendrierCourrier#getClassificationOtan <em>Classification Otan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classification Otan</em>' attribute is set.
	 * @see #unsetClassificationOtan()
	 * @see #getClassificationOtan()
	 * @see #setClassificationOtan(TypeDictionaryDicoConfidentialiteOTAN)
	 * @generated
	 */
	boolean isSetClassificationOtan();

	/**
	 * Returns the value of the '<em><b>Date Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Depart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Depart</em>' attribute.
	 * @see #setDateDepart(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier_DateDepart()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDepart'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDepart();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getDateDepart <em>Date Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Depart</em>' attribute.
	 * @see #getDateDepart()
	 * @generated
	 */
	void setDateDepart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Arrivee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Arrivee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Arrivee</em>' attribute.
	 * @see #setDateArrivee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier_DateArrivee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateArrivee'"
	 * @generated
	 */
	XMLGregorianCalendar getDateArrivee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getDateArrivee <em>Date Arrivee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Arrivee</em>' attribute.
	 * @see #getDateArrivee()
	 * @generated
	 */
	void setDateArrivee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Type Localisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Localisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Localisation</em>' attribute.
	 * @see #setTypeLocalisation(String)
	 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier_TypeLocalisation()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='TypeLocalisation'"
	 * @generated
	 */
	String getTypeLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getTypeLocalisation <em>Type Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Localisation</em>' attribute.
	 * @see #getTypeLocalisation()
	 * @generated
	 */
	void setTypeLocalisation(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCalendrierCourrier_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCalendrierCourrier#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeCalendrierCourrier
