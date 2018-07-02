/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Point Particulier Itineraire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getNumeroPoint <em>Numero Point</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getNomBapteme <em>Nom Bapteme</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getGDHactivation <em>GD Hactivation</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getGDHpassageOblige <em>GD Hpassage Oblige</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getGDHpassageAuPlusTard <em>GD Hpassage Au Plus Tard</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getGDHpassageAuPlusTot <em>GD Hpassage Au Plus Tot</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getVitesseImposee <em>Vitesse Imposee</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getDureeArret <em>Duree Arret</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getRouteAEmprunter <em>Route AEmprunter</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePointParticulierItineraire#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PointParticulierItineraire' kind='elementOnly'"
 * @generated
 */
public interface TypePointParticulierItineraire extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Point</em>' attribute.
	 * @see #isSetNumeroPoint()
	 * @see #unsetNumeroPoint()
	 * @see #setNumeroPoint(long)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_NumeroPoint()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NumeroPoint'"
	 * @generated
	 */
	long getNumeroPoint();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getNumeroPoint <em>Numero Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Point</em>' attribute.
	 * @see #isSetNumeroPoint()
	 * @see #unsetNumeroPoint()
	 * @see #getNumeroPoint()
	 * @generated
	 */
	void setNumeroPoint(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getNumeroPoint <em>Numero Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumeroPoint()
	 * @see #getNumeroPoint()
	 * @see #setNumeroPoint(long)
	 * @generated
	 */
	void unsetNumeroPoint();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointParticulierItineraire#getNumeroPoint <em>Numero Point</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Numero Point</em>' attribute is set.
	 * @see #unsetNumeroPoint()
	 * @see #getNumeroPoint()
	 * @see #setNumeroPoint(long)
	 * @generated
	 */
	boolean isSetNumeroPoint();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Nom Bapteme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Bapteme</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #setNomBapteme(String)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_NomBapteme()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='NomBapteme'"
	 * @generated
	 */
	String getNomBapteme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getNomBapteme <em>Nom Bapteme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Bapteme</em>' attribute.
	 * @see #getNomBapteme()
	 * @generated
	 */
	void setNomBapteme(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPointParticulierItineraireCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointParticulierItineraireCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPointParticulierItineraireCategorie)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoPointParticulierItineraireCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointParticulierItineraireCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoPointParticulierItineraireCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPointParticulierItineraireCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointParticulierItineraire#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPointParticulierItineraireCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPointParticulierItineraireSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointParticulierItineraireSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoPointParticulierItineraireSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_SousCategorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoPointParticulierItineraireSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPointParticulierItineraireSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoPointParticulierItineraireSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoPointParticulierItineraireSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePointParticulierItineraire#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoPointParticulierItineraireSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>GD Hactivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hactivation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hactivation</em>' attribute.
	 * @see #setGDHactivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_GDHactivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHactivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHactivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getGDHactivation <em>GD Hactivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hactivation</em>' attribute.
	 * @see #getGDHactivation()
	 * @generated
	 */
	void setGDHactivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hpassage Oblige</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hpassage Oblige</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hpassage Oblige</em>' attribute.
	 * @see #setGDHpassageOblige(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_GDHpassageOblige()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHpassageOblige'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHpassageOblige();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getGDHpassageOblige <em>GD Hpassage Oblige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hpassage Oblige</em>' attribute.
	 * @see #getGDHpassageOblige()
	 * @generated
	 */
	void setGDHpassageOblige(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hpassage Au Plus Tard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hpassage Au Plus Tard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hpassage Au Plus Tard</em>' attribute.
	 * @see #setGDHpassageAuPlusTard(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_GDHpassageAuPlusTard()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHpassageAuPlusTard'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHpassageAuPlusTard();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getGDHpassageAuPlusTard <em>GD Hpassage Au Plus Tard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hpassage Au Plus Tard</em>' attribute.
	 * @see #getGDHpassageAuPlusTard()
	 * @generated
	 */
	void setGDHpassageAuPlusTard(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hpassage Au Plus Tot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hpassage Au Plus Tot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hpassage Au Plus Tot</em>' attribute.
	 * @see #setGDHpassageAuPlusTot(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_GDHpassageAuPlusTot()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHpassageAuPlusTot'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHpassageAuPlusTot();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getGDHpassageAuPlusTot <em>GD Hpassage Au Plus Tot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hpassage Au Plus Tot</em>' attribute.
	 * @see #getGDHpassageAuPlusTot()
	 * @generated
	 */
	void setGDHpassageAuPlusTot(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Vitesse Imposee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Imposee</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Imposee</em>' containment reference.
	 * @see #setVitesseImposee(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_VitesseImposee()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseImposee'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseImposee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getVitesseImposee <em>Vitesse Imposee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Imposee</em>' containment reference.
	 * @see #getVitesseImposee()
	 * @generated
	 */
	void setVitesseImposee(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Duree Arret</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Arret</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Arret</em>' containment reference.
	 * @see #setDureeArret(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_DureeArret()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeArret'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeArret();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getDureeArret <em>Duree Arret</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Arret</em>' containment reference.
	 * @see #getDureeArret()
	 * @generated
	 */
	void setDureeArret(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Route AEmprunter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route AEmprunter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route AEmprunter</em>' attribute.
	 * @see #setRouteAEmprunter(String)
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_RouteAEmprunter()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='RouteAEmprunter'"
	 * @generated
	 */
	String getRouteAEmprunter();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getRouteAEmprunter <em>Route AEmprunter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route AEmprunter</em>' attribute.
	 * @see #getRouteAEmprunter()
	 * @generated
	 */
	void setRouteAEmprunter(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getCommentaire <em>Commentaire</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePointParticulierItineraire_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePointParticulierItineraire#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypePointParticulierItineraire
