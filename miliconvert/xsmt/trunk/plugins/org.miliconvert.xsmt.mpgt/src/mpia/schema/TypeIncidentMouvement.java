/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Incident Mouvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getDescriptionIncident <em>Description Incident</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getGDHIncident <em>GDH Incident</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getRetardAIncident <em>Retard AIncident</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesAChenillesDetruits <em>Nombre Vehicules AChenilles Detruits</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesAChenillesImmobilises <em>Nombre Vehicules AChenilles Immobilises</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesARouesDetruits <em>Nombre Vehicules ARoues Detruits</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesARouesImmobilises <em>Nombre Vehicules ARoues Immobilises</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getMesuresPrisesOuDemandeComplementaire <em>Mesures Prises Ou Demande Complementaire</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeIncidentMouvement#getAPourLieuAutreElementControle <em>APour Lieu Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_IncidentMouvement' kind='elementOnly'"
 * @generated
 */
public interface TypeIncidentMouvement extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoIncidentMouvementCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoIncidentMouvementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoIncidentMouvementCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoIncidentMouvementCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoIncidentMouvementCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoIncidentMouvementCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIncidentMouvement#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoIncidentMouvementCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIncidentMouvement#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoIncidentMouvementCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Description Incident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Incident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Incident</em>' attribute.
	 * @see #setDescriptionIncident(String)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_DescriptionIncident()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionIncident'"
	 * @generated
	 */
	String getDescriptionIncident();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getDescriptionIncident <em>Description Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Incident</em>' attribute.
	 * @see #getDescriptionIncident()
	 * @generated
	 */
	void setDescriptionIncident(String value);

	/**
	 * Returns the value of the '<em><b>GDH Incident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Incident</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Incident</em>' attribute.
	 * @see #setGDHIncident(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_GDHIncident()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='GDHIncident'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHIncident();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getGDHIncident <em>GDH Incident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Incident</em>' attribute.
	 * @see #getGDHIncident()
	 * @generated
	 */
	void setGDHIncident(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Retard AIncident</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retard AIncident</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retard AIncident</em>' containment reference.
	 * @see #setRetardAIncident(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_RetardAIncident()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RetardAIncident'"
	 * @generated
	 */
	TypeDataTypeDuree getRetardAIncident();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getRetardAIncident <em>Retard AIncident</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retard AIncident</em>' containment reference.
	 * @see #getRetardAIncident()
	 * @generated
	 */
	void setRetardAIncident(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_NombreTotalVehiculesAChenilles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreTotalVehiculesAChenilles'"
	 * @generated
	 */
	long getNombreTotalVehiculesAChenilles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTotalVehiculesAChenilles()
	 * @see #getNombreTotalVehiculesAChenilles()
	 * @see #setNombreTotalVehiculesAChenilles(long)
	 * @generated
	 */
	void unsetNombreTotalVehiculesAChenilles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreTotalVehiculesAChenilles <em>Nombre Total Vehicules AChenilles</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_NombreTotalVehiculesARoues()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreTotalVehiculesARoues'"
	 * @generated
	 */
	long getNombreTotalVehiculesARoues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTotalVehiculesARoues()
	 * @see #getNombreTotalVehiculesARoues()
	 * @see #setNombreTotalVehiculesARoues(long)
	 * @generated
	 */
	void unsetNombreTotalVehiculesARoues();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreTotalVehiculesARoues <em>Nombre Total Vehicules ARoues</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Nombre Vehicules AChenilles Detruits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules AChenilles Detruits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules AChenilles Detruits</em>' attribute.
	 * @see #isSetNombreVehiculesAChenillesDetruits()
	 * @see #unsetNombreVehiculesAChenillesDetruits()
	 * @see #setNombreVehiculesAChenillesDetruits(long)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_NombreVehiculesAChenillesDetruits()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreVehiculesAChenillesDetruits'"
	 * @generated
	 */
	long getNombreVehiculesAChenillesDetruits();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesAChenillesDetruits <em>Nombre Vehicules AChenilles Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules AChenilles Detruits</em>' attribute.
	 * @see #isSetNombreVehiculesAChenillesDetruits()
	 * @see #unsetNombreVehiculesAChenillesDetruits()
	 * @see #getNombreVehiculesAChenillesDetruits()
	 * @generated
	 */
	void setNombreVehiculesAChenillesDetruits(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesAChenillesDetruits <em>Nombre Vehicules AChenilles Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehiculesAChenillesDetruits()
	 * @see #getNombreVehiculesAChenillesDetruits()
	 * @see #setNombreVehiculesAChenillesDetruits(long)
	 * @generated
	 */
	void unsetNombreVehiculesAChenillesDetruits();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesAChenillesDetruits <em>Nombre Vehicules AChenilles Detruits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules AChenilles Detruits</em>' attribute is set.
	 * @see #unsetNombreVehiculesAChenillesDetruits()
	 * @see #getNombreVehiculesAChenillesDetruits()
	 * @see #setNombreVehiculesAChenillesDetruits(long)
	 * @generated
	 */
	boolean isSetNombreVehiculesAChenillesDetruits();

	/**
	 * Returns the value of the '<em><b>Nombre Vehicules AChenilles Immobilises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules AChenilles Immobilises</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules AChenilles Immobilises</em>' attribute.
	 * @see #isSetNombreVehiculesAChenillesImmobilises()
	 * @see #unsetNombreVehiculesAChenillesImmobilises()
	 * @see #setNombreVehiculesAChenillesImmobilises(long)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_NombreVehiculesAChenillesImmobilises()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreVehiculesAChenillesImmobilises'"
	 * @generated
	 */
	long getNombreVehiculesAChenillesImmobilises();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesAChenillesImmobilises <em>Nombre Vehicules AChenilles Immobilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules AChenilles Immobilises</em>' attribute.
	 * @see #isSetNombreVehiculesAChenillesImmobilises()
	 * @see #unsetNombreVehiculesAChenillesImmobilises()
	 * @see #getNombreVehiculesAChenillesImmobilises()
	 * @generated
	 */
	void setNombreVehiculesAChenillesImmobilises(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesAChenillesImmobilises <em>Nombre Vehicules AChenilles Immobilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehiculesAChenillesImmobilises()
	 * @see #getNombreVehiculesAChenillesImmobilises()
	 * @see #setNombreVehiculesAChenillesImmobilises(long)
	 * @generated
	 */
	void unsetNombreVehiculesAChenillesImmobilises();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesAChenillesImmobilises <em>Nombre Vehicules AChenilles Immobilises</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules AChenilles Immobilises</em>' attribute is set.
	 * @see #unsetNombreVehiculesAChenillesImmobilises()
	 * @see #getNombreVehiculesAChenillesImmobilises()
	 * @see #setNombreVehiculesAChenillesImmobilises(long)
	 * @generated
	 */
	boolean isSetNombreVehiculesAChenillesImmobilises();

	/**
	 * Returns the value of the '<em><b>Nombre Vehicules ARoues Detruits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules ARoues Detruits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules ARoues Detruits</em>' attribute.
	 * @see #isSetNombreVehiculesARouesDetruits()
	 * @see #unsetNombreVehiculesARouesDetruits()
	 * @see #setNombreVehiculesARouesDetruits(long)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_NombreVehiculesARouesDetruits()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreVehiculesARouesDetruits'"
	 * @generated
	 */
	long getNombreVehiculesARouesDetruits();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesARouesDetruits <em>Nombre Vehicules ARoues Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules ARoues Detruits</em>' attribute.
	 * @see #isSetNombreVehiculesARouesDetruits()
	 * @see #unsetNombreVehiculesARouesDetruits()
	 * @see #getNombreVehiculesARouesDetruits()
	 * @generated
	 */
	void setNombreVehiculesARouesDetruits(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesARouesDetruits <em>Nombre Vehicules ARoues Detruits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehiculesARouesDetruits()
	 * @see #getNombreVehiculesARouesDetruits()
	 * @see #setNombreVehiculesARouesDetruits(long)
	 * @generated
	 */
	void unsetNombreVehiculesARouesDetruits();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesARouesDetruits <em>Nombre Vehicules ARoues Detruits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules ARoues Detruits</em>' attribute is set.
	 * @see #unsetNombreVehiculesARouesDetruits()
	 * @see #getNombreVehiculesARouesDetruits()
	 * @see #setNombreVehiculesARouesDetruits(long)
	 * @generated
	 */
	boolean isSetNombreVehiculesARouesDetruits();

	/**
	 * Returns the value of the '<em><b>Nombre Vehicules ARoues Immobilises</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules ARoues Immobilises</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules ARoues Immobilises</em>' attribute.
	 * @see #isSetNombreVehiculesARouesImmobilises()
	 * @see #unsetNombreVehiculesARouesImmobilises()
	 * @see #setNombreVehiculesARouesImmobilises(long)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_NombreVehiculesARouesImmobilises()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreVehiculesARouesImmobilises'"
	 * @generated
	 */
	long getNombreVehiculesARouesImmobilises();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesARouesImmobilises <em>Nombre Vehicules ARoues Immobilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules ARoues Immobilises</em>' attribute.
	 * @see #isSetNombreVehiculesARouesImmobilises()
	 * @see #unsetNombreVehiculesARouesImmobilises()
	 * @see #getNombreVehiculesARouesImmobilises()
	 * @generated
	 */
	void setNombreVehiculesARouesImmobilises(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesARouesImmobilises <em>Nombre Vehicules ARoues Immobilises</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehiculesARouesImmobilises()
	 * @see #getNombreVehiculesARouesImmobilises()
	 * @see #setNombreVehiculesARouesImmobilises(long)
	 * @generated
	 */
	void unsetNombreVehiculesARouesImmobilises();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeIncidentMouvement#getNombreVehiculesARouesImmobilises <em>Nombre Vehicules ARoues Immobilises</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules ARoues Immobilises</em>' attribute is set.
	 * @see #unsetNombreVehiculesARouesImmobilises()
	 * @see #getNombreVehiculesARouesImmobilises()
	 * @see #setNombreVehiculesARouesImmobilises(long)
	 * @generated
	 */
	boolean isSetNombreVehiculesARouesImmobilises();

	/**
	 * Returns the value of the '<em><b>Mesures Prises Ou Demande Complementaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Prises Ou Demande Complementaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Prises Ou Demande Complementaire</em>' attribute.
	 * @see #setMesuresPrisesOuDemandeComplementaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_MesuresPrisesOuDemandeComplementaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='MesuresPrisesOuDemandeComplementaire'"
	 * @generated
	 */
	String getMesuresPrisesOuDemandeComplementaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getMesuresPrisesOuDemandeComplementaire <em>Mesures Prises Ou Demande Complementaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesures Prises Ou Demande Complementaire</em>' attribute.
	 * @see #getMesuresPrisesOuDemandeComplementaire()
	 * @generated
	 */
	void setMesuresPrisesOuDemandeComplementaire(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getCE <em>CE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_APourUniteRendantCompteUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRendantCompte_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteRendantCompteUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite Rendant Compte Unite</em>' containment reference.
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 */
	void setAPourUniteRendantCompteUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Lieu Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Lieu Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Lieu Autre Element Controle</em>' containment reference.
	 * @see #setAPourLieuAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeIncidentMouvement_APourLieuAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLieu_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLieuAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeIncidentMouvement#getAPourLieuAutreElementControle <em>APour Lieu Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Lieu Autre Element Controle</em>' containment reference.
	 * @see #getAPourLieuAutreElementControle()
	 * @generated
	 */
	void setAPourLieuAutreElementControle(TypeAssociation value);

} // TypeIncidentMouvement
