/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Compte Rendu Mouvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getGDHpassageTete <em>GD Hpassage Tete</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getGDHpassageQueue <em>GD Hpassage Queue</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getCommentaireOuDemande <em>Commentaire Ou Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCompteRenduMouvement#getEstLocaliseParLocalisation <em>Est Localise Par Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CompteRenduMouvement' kind='elementOnly'"
 * @generated
 */
public interface TypeCompteRenduMouvement extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCompteRenduMouvementCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduMouvementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCompteRenduMouvementCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoCompteRenduMouvementCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCompteRenduMouvementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoCompteRenduMouvementCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCompteRenduMouvementCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoCompteRenduMouvementCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>GD Hpassage Tete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hpassage Tete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hpassage Tete</em>' attribute.
	 * @see #setGDHpassageTete(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_GDHpassageTete()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='GDHpassageTete'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHpassageTete();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getGDHpassageTete <em>GD Hpassage Tete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hpassage Tete</em>' attribute.
	 * @see #getGDHpassageTete()
	 * @generated
	 */
	void setGDHpassageTete(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GD Hpassage Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hpassage Queue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hpassage Queue</em>' attribute.
	 * @see #setGDHpassageQueue(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_GDHpassageQueue()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHpassageQueue'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHpassageQueue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getGDHpassageQueue <em>GD Hpassage Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hpassage Queue</em>' attribute.
	 * @see #getGDHpassageQueue()
	 * @generated
	 */
	void setGDHpassageQueue(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nombre Total Vehicules AChenilles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Total Vehicules AChenilles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Total Vehicules AChenilles</em>' attribute.
	 * @see #isSetNombreTotalVehiculesAChenilles()
	 * @see #unsetNombreTotalVehiculesAChenilles()
	 * @see #setNombreTotalVehiculesAChenilles(long)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_NombreTotalVehiculesAChenilles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreTotalVehiculesAChenilles'"
	 * @generated
	 */
	long getNombreTotalVehiculesAChenilles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Total Vehicules AChenilles</em>' attribute.
	 * @see #isSetNombreTotalVehiculesAChenilles()
	 * @see #unsetNombreTotalVehiculesAChenilles()
	 * @see #getNombreTotalVehiculesAChenilles()
	 * @generated
	 */
	void setNombreTotalVehiculesAChenilles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTotalVehiculesAChenilles()
	 * @see #getNombreTotalVehiculesAChenilles()
	 * @see #setNombreTotalVehiculesAChenilles(long)
	 * @generated
	 */
	void unsetNombreTotalVehiculesAChenilles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Total Vehicules AChenilles</em>' attribute is set.
	 * @see #unsetNombreTotalVehiculesAChenilles()
	 * @see #getNombreTotalVehiculesAChenilles()
	 * @see #setNombreTotalVehiculesAChenilles(long)
	 * @generated
	 */
	boolean isSetNombreTotalVehiculesAChenilles();

	/**
	 * Returns the value of the '<em><b>Nombre Total Vehicules ARoues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Total Vehicules ARoues</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Total Vehicules ARoues</em>' attribute.
	 * @see #isSetNombreTotalVehiculesARoues()
	 * @see #unsetNombreTotalVehiculesARoues()
	 * @see #setNombreTotalVehiculesARoues(long)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_NombreTotalVehiculesARoues()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreTotalVehiculesARoues'"
	 * @generated
	 */
	long getNombreTotalVehiculesARoues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Total Vehicules ARoues</em>' attribute.
	 * @see #isSetNombreTotalVehiculesARoues()
	 * @see #unsetNombreTotalVehiculesARoues()
	 * @see #getNombreTotalVehiculesARoues()
	 * @generated
	 */
	void setNombreTotalVehiculesARoues(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTotalVehiculesARoues()
	 * @see #getNombreTotalVehiculesARoues()
	 * @see #setNombreTotalVehiculesARoues(long)
	 * @generated
	 */
	void unsetNombreTotalVehiculesARoues();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Total Vehicules ARoues</em>' attribute is set.
	 * @see #unsetNombreTotalVehiculesARoues()
	 * @see #getNombreTotalVehiculesARoues()
	 * @see #setNombreTotalVehiculesARoues(long)
	 * @generated
	 */
	boolean isSetNombreTotalVehiculesARoues();

	/**
	 * Returns the value of the '<em><b>Commentaire Ou Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Ou Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Ou Demande</em>' attribute.
	 * @see #setCommentaireOuDemande(String)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_CommentaireOuDemande()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='CommentaireOuDemande'"
	 * @generated
	 */
	String getCommentaireOuDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getCommentaireOuDemande <em>Commentaire Ou Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Ou Demande</em>' attribute.
	 * @see #getCommentaireOuDemande()
	 * @generated
	 */
	void setCommentaireOuDemande(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Rendant Compte Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Rendant Compte Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #setAPourUniteRendantCompteUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_APourUniteRendantCompteUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRendantCompte_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRendantCompteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 */
	void setAPourUniteRendantCompteUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Localise Par Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise Par Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise Par Localisation</em>' containment reference.
	 * @see #setEstLocaliseParLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeCompteRenduMouvement_EstLocaliseParLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocalisePar_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseParLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCompteRenduMouvement#getEstLocaliseParLocalisation <em>Est Localise Par Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise Par Localisation</em>' containment reference.
	 * @see #getEstLocaliseParLocalisation()
	 * @generated
	 */
	void setEstLocaliseParLocalisation(TypeLocalisation value);

} // TypeCompteRenduMouvement
