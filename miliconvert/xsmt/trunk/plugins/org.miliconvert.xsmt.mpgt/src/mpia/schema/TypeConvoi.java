/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Convoi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConvoi#getDatePrevueDepart <em>Date Prevue Depart</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getDatePrevueArrivee <em>Date Prevue Arrivee</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getDescriptionMissionConvoi <em>Description Mission Convoi</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getDateDescription <em>Date Description</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getNombreVehicules <em>Nombre Vehicules</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getNombrePersonnes <em>Nombre Personnes</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getDistanceEntreRames <em>Distance Entre Rames</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getNombreVehiculesParRame <em>Nombre Vehicules Par Rame</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getDistanceEntreVehiculesJour <em>Distance Entre Vehicules Jour</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getDistanceEntreVehiculesNuit <em>Distance Entre Vehicules Nuit</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getVitesseJour <em>Vitesse Jour</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getVitesseNuit <em>Vitesse Nuit</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getDureeStationnement <em>Duree Stationnement</em>}</li>
 *   <li>{@link mpia.schema.TypeConvoi#getEstSujetAssociationConvoiMouvementParRoute <em>Est Sujet Association Convoi Mouvement Par Route</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConvoi()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Convoi' kind='elementOnly'"
 * @generated
 */
public interface TypeConvoi extends TypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Date Prevue Depart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Prevue Depart</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Prevue Depart</em>' attribute.
	 * @see #setDatePrevueDepart(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_DatePrevueDepart()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DatePrevueDepart'"
	 * @generated
	 */
	XMLGregorianCalendar getDatePrevueDepart();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getDatePrevueDepart <em>Date Prevue Depart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Prevue Depart</em>' attribute.
	 * @see #getDatePrevueDepart()
	 * @generated
	 */
	void setDatePrevueDepart(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Prevue Arrivee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Prevue Arrivee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Prevue Arrivee</em>' attribute.
	 * @see #setDatePrevueArrivee(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_DatePrevueArrivee()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DatePrevueArrivee'"
	 * @generated
	 */
	XMLGregorianCalendar getDatePrevueArrivee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getDatePrevueArrivee <em>Date Prevue Arrivee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Prevue Arrivee</em>' attribute.
	 * @see #getDatePrevueArrivee()
	 * @generated
	 */
	void setDatePrevueArrivee(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description Mission Convoi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Mission Convoi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Mission Convoi</em>' attribute.
	 * @see #setDescriptionMissionConvoi(String)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_DescriptionMissionConvoi()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='DescriptionMissionConvoi'"
	 * @generated
	 */
	String getDescriptionMissionConvoi();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getDescriptionMissionConvoi <em>Description Mission Convoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Mission Convoi</em>' attribute.
	 * @see #getDescriptionMissionConvoi()
	 * @generated
	 */
	void setDescriptionMissionConvoi(String value);

	/**
	 * Returns the value of the '<em><b>Date Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Description</em>' attribute.
	 * @see #setDateDescription(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_DateDescription()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDescription'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getDateDescription <em>Date Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Description</em>' attribute.
	 * @see #getDateDescription()
	 * @generated
	 */
	void setDateDescription(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Nombre Vehicules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules</em>' attribute.
	 * @see #isSetNombreVehicules()
	 * @see #unsetNombreVehicules()
	 * @see #setNombreVehicules(long)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_NombreVehicules()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreVehicules'"
	 * @generated
	 */
	long getNombreVehicules();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getNombreVehicules <em>Nombre Vehicules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules</em>' attribute.
	 * @see #isSetNombreVehicules()
	 * @see #unsetNombreVehicules()
	 * @see #getNombreVehicules()
	 * @generated
	 */
	void setNombreVehicules(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConvoi#getNombreVehicules <em>Nombre Vehicules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehicules()
	 * @see #getNombreVehicules()
	 * @see #setNombreVehicules(long)
	 * @generated
	 */
	void unsetNombreVehicules();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConvoi#getNombreVehicules <em>Nombre Vehicules</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules</em>' attribute is set.
	 * @see #unsetNombreVehicules()
	 * @see #getNombreVehicules()
	 * @see #setNombreVehicules(long)
	 * @generated
	 */
	boolean isSetNombreVehicules();

	/**
	 * Returns the value of the '<em><b>Nombre Personnes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Personnes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Personnes</em>' attribute.
	 * @see #isSetNombrePersonnes()
	 * @see #unsetNombrePersonnes()
	 * @see #setNombrePersonnes(long)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_NombrePersonnes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='NombrePersonnes'"
	 * @generated
	 */
	long getNombrePersonnes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getNombrePersonnes <em>Nombre Personnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Personnes</em>' attribute.
	 * @see #isSetNombrePersonnes()
	 * @see #unsetNombrePersonnes()
	 * @see #getNombrePersonnes()
	 * @generated
	 */
	void setNombrePersonnes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConvoi#getNombrePersonnes <em>Nombre Personnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePersonnes()
	 * @see #getNombrePersonnes()
	 * @see #setNombrePersonnes(long)
	 * @generated
	 */
	void unsetNombrePersonnes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConvoi#getNombrePersonnes <em>Nombre Personnes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Personnes</em>' attribute is set.
	 * @see #unsetNombrePersonnes()
	 * @see #getNombrePersonnes()
	 * @see #setNombrePersonnes(long)
	 * @generated
	 */
	boolean isSetNombrePersonnes();

	/**
	 * Returns the value of the '<em><b>Distance Entre Rames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Entre Rames</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Entre Rames</em>' containment reference.
	 * @see #setDistanceEntreRames(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_DistanceEntreRames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceEntreRames'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceEntreRames();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getDistanceEntreRames <em>Distance Entre Rames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Entre Rames</em>' containment reference.
	 * @see #getDistanceEntreRames()
	 * @generated
	 */
	void setDistanceEntreRames(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Nombre Vehicules Par Rame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules Par Rame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules Par Rame</em>' attribute.
	 * @see #isSetNombreVehiculesParRame()
	 * @see #unsetNombreVehiculesParRame()
	 * @see #setNombreVehiculesParRame(long)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_NombreVehiculesParRame()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='NombreVehiculesParRame'"
	 * @generated
	 */
	long getNombreVehiculesParRame();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getNombreVehiculesParRame <em>Nombre Vehicules Par Rame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules Par Rame</em>' attribute.
	 * @see #isSetNombreVehiculesParRame()
	 * @see #unsetNombreVehiculesParRame()
	 * @see #getNombreVehiculesParRame()
	 * @generated
	 */
	void setNombreVehiculesParRame(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConvoi#getNombreVehiculesParRame <em>Nombre Vehicules Par Rame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehiculesParRame()
	 * @see #getNombreVehiculesParRame()
	 * @see #setNombreVehiculesParRame(long)
	 * @generated
	 */
	void unsetNombreVehiculesParRame();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConvoi#getNombreVehiculesParRame <em>Nombre Vehicules Par Rame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules Par Rame</em>' attribute is set.
	 * @see #unsetNombreVehiculesParRame()
	 * @see #getNombreVehiculesParRame()
	 * @see #setNombreVehiculesParRame(long)
	 * @generated
	 */
	boolean isSetNombreVehiculesParRame();

	/**
	 * Returns the value of the '<em><b>Distance Entre Vehicules Jour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Entre Vehicules Jour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Entre Vehicules Jour</em>' containment reference.
	 * @see #setDistanceEntreVehiculesJour(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_DistanceEntreVehiculesJour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceEntreVehiculesJour'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceEntreVehiculesJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getDistanceEntreVehiculesJour <em>Distance Entre Vehicules Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Entre Vehicules Jour</em>' containment reference.
	 * @see #getDistanceEntreVehiculesJour()
	 * @generated
	 */
	void setDistanceEntreVehiculesJour(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Distance Entre Vehicules Nuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Entre Vehicules Nuit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Entre Vehicules Nuit</em>' containment reference.
	 * @see #setDistanceEntreVehiculesNuit(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_DistanceEntreVehiculesNuit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DistanceEntreVehiculesNuit'"
	 * @generated
	 */
	TypeDataTypeLongueur getDistanceEntreVehiculesNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getDistanceEntreVehiculesNuit <em>Distance Entre Vehicules Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Entre Vehicules Nuit</em>' containment reference.
	 * @see #getDistanceEntreVehiculesNuit()
	 * @generated
	 */
	void setDistanceEntreVehiculesNuit(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Vitesse Jour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Jour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Jour</em>' containment reference.
	 * @see #setVitesseJour(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_VitesseJour()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseJour'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseJour();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getVitesseJour <em>Vitesse Jour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Jour</em>' containment reference.
	 * @see #getVitesseJour()
	 * @generated
	 */
	void setVitesseJour(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Vitesse Nuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Nuit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Nuit</em>' containment reference.
	 * @see #setVitesseNuit(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_VitesseNuit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseNuit'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getVitesseNuit <em>Vitesse Nuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Nuit</em>' containment reference.
	 * @see #getVitesseNuit()
	 * @generated
	 */
	void setVitesseNuit(TypeDataTypeVitesseLineaire value);

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
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_DureeStationnement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeStationnement'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeStationnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConvoi#getDureeStationnement <em>Duree Stationnement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Stationnement</em>' containment reference.
	 * @see #getDureeStationnement()
	 * @generated
	 */
	void setDureeStationnement(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Convoi Mouvement Par Route</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Convoi Mouvement Par Route</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Convoi Mouvement Par Route</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeConvoi_EstSujetAssociationConvoiMouvementParRoute()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourSujet_Convoi' target_entity='type_AssociationConvoiMouvementParRoute'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationConvoiMouvementParRoute'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationConvoiMouvementParRoute();

} // TypeConvoi
