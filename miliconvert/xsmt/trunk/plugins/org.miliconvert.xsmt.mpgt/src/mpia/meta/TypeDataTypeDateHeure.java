/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Data Type Date Heure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.meta.TypeDataTypeDateHeure#getAnnee <em>Annee</em>}</li>
 *   <li>{@link mpia.meta.TypeDataTypeDateHeure#getAnneeMois <em>Annee Mois</em>}</li>
 *   <li>{@link mpia.meta.TypeDataTypeDateHeure#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.meta.TypeDataTypeDateHeure#getHeure <em>Heure</em>}</li>
 *   <li>{@link mpia.meta.TypeDataTypeDateHeure#getDateHeure <em>Date Heure</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.meta.MetaPackage#getTypeDataTypeDateHeure()
 * @model extendedMetaData="name='typeDataTypeDateHeure' kind='elementOnly'"
 * @generated
 */
public interface TypeDataTypeDateHeure extends EObject {
	/**
	 * Returns the value of the '<em><b>Annee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee</em>' attribute.
	 * @see #setAnnee(XMLGregorianCalendar)
	 * @see mpia.meta.MetaPackage#getTypeDataTypeDateHeure_Annee()
	 * @model dataType="mpia.meta.TypeAnnee"
	 *        extendedMetaData="kind='element' name='annee'"
	 * @generated
	 */
	XMLGregorianCalendar getAnnee();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeDataTypeDateHeure#getAnnee <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee</em>' attribute.
	 * @see #getAnnee()
	 * @generated
	 */
	void setAnnee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Annee Mois</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annee Mois</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee Mois</em>' attribute.
	 * @see #setAnneeMois(XMLGregorianCalendar)
	 * @see mpia.meta.MetaPackage#getTypeDataTypeDateHeure_AnneeMois()
	 * @model dataType="mpia.meta.TypeAnneeMois"
	 *        extendedMetaData="kind='element' name='anneeMois'"
	 * @generated
	 */
	XMLGregorianCalendar getAnneeMois();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeDataTypeDateHeure#getAnneeMois <em>Annee Mois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee Mois</em>' attribute.
	 * @see #getAnneeMois()
	 * @generated
	 */
	void setAnneeMois(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(XMLGregorianCalendar)
	 * @see mpia.meta.MetaPackage#getTypeDataTypeDateHeure_Date()
	 * @model dataType="mpia.meta.TypeDate"
	 *        extendedMetaData="kind='element' name='date'"
	 * @generated
	 */
	XMLGregorianCalendar getDate();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeDataTypeDateHeure#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure</em>' attribute.
	 * @see #setHeure(XMLGregorianCalendar)
	 * @see mpia.meta.MetaPackage#getTypeDataTypeDateHeure_Heure()
	 * @model dataType="mpia.meta.TypeHeure"
	 *        extendedMetaData="kind='element' name='heure'"
	 * @generated
	 */
	XMLGregorianCalendar getHeure();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeDataTypeDateHeure#getHeure <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure</em>' attribute.
	 * @see #getHeure()
	 * @generated
	 */
	void setHeure(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Heure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Heure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Heure</em>' attribute.
	 * @see #setDateHeure(XMLGregorianCalendar)
	 * @see mpia.meta.MetaPackage#getTypeDataTypeDateHeure_DateHeure()
	 * @model dataType="mpia.meta.TypeDTG"
	 *        extendedMetaData="kind='element' name='dateHeure'"
	 * @generated
	 */
	XMLGregorianCalendar getDateHeure();

	/**
	 * Sets the value of the '{@link mpia.meta.TypeDataTypeDateHeure#getDateHeure <em>Date Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Heure</em>' attribute.
	 * @see #getDateHeure()
	 * @generated
	 */
	void setDateHeure(XMLGregorianCalendar value);

} // TypeDataTypeDateHeure
