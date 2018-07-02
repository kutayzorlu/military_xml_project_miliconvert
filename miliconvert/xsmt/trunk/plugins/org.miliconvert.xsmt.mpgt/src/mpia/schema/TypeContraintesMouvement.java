/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Contraintes Mouvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getAutorouteLongueurEncombrement <em>Autoroute Longueur Encombrement</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getAutorouteDureeEcoulement <em>Autoroute Duree Ecoulement</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getAutorouteDistanceEntreVehicules <em>Autoroute Distance Entre Vehicules</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getAutorouteVitesseMoyenne <em>Autoroute Vitesse Moyenne</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getContraintesColonnes <em>Contraintes Colonnes</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getIntervalleTempsEntreRames <em>Intervalle Temps Entre Rames</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getIntervalleTempsEntreGroupementsMarche <em>Intervalle Temps Entre Groupements Marche</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getConsignesParticulieres <em>Consignes Particulieres</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getHauteurMaximaleVehicules <em>Hauteur Maximale Vehicules</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getIntervalleTempsEntreUniteMarche <em>Intervalle Temps Entre Unite Marche</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getLargeurMaximaleVehicule <em>Largeur Maximale Vehicule</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getMesuresPrecautionsOTAN <em>Mesures Precautions OTAN</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getNombreRames <em>Nombre Rames</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesAChenilles <em>Nombre Vehicules AChenilles</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesPlusLourd <em>Nombre Vehicules Plus Lourd</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getLongueurMaximaleVehicule <em>Longueur Maximale Vehicule</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getNombreGroupementsMarche <em>Nombre Groupements Marche</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getNombreUniteMarche <em>Nombre Unite Marche</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesARoues <em>Nombre Vehicules ARoues</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getPoidsVehiculePlusLourd <em>Poids Vehicule Plus Lourd</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getPTRAplusLourdAChenilles <em>PTR Aplus Lourd AChenilles</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getRouteDureeEcoulement <em>Route Duree Ecoulement</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getRouteVitesseMoyenne <em>Route Vitesse Moyenne</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getPTRAplusLourdARoues <em>PTR Aplus Lourd ARoues</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getRouteDistanceEntreVehicules <em>Route Distance Entre Vehicules</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getRouteLongueurEncombrement <em>Route Longueur Encombrement</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getTypeVehiculePlusLourd <em>Type Vehicule Plus Lourd</em>}</li>
 *   <li>{@link mpia.schema.TypeContraintesMouvement#getACommeVehiculePlusContraignantVehiculeExceptionnel <em>AComme Vehicule Plus Contraignant Vehicule Exceptionnel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ContraintesMouvement' kind='elementOnly'"
 * @generated
 */
public interface TypeContraintesMouvement extends EObject {
	/**
	 * Returns the value of the '<em><b>Autoroute Longueur Encombrement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoroute Longueur Encombrement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoroute Longueur Encombrement</em>' containment reference.
	 * @see #setAutorouteLongueurEncombrement(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_AutorouteLongueurEncombrement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AutorouteLongueurEncombrement'"
	 * @generated
	 */
	TypeDataTypeLongueur getAutorouteLongueurEncombrement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getAutorouteLongueurEncombrement <em>Autoroute Longueur Encombrement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoroute Longueur Encombrement</em>' containment reference.
	 * @see #getAutorouteLongueurEncombrement()
	 * @generated
	 */
	void setAutorouteLongueurEncombrement(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Autoroute Duree Ecoulement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoroute Duree Ecoulement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoroute Duree Ecoulement</em>' containment reference.
	 * @see #setAutorouteDureeEcoulement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_AutorouteDureeEcoulement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AutorouteDureeEcoulement'"
	 * @generated
	 */
	TypeDataTypeDuree getAutorouteDureeEcoulement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getAutorouteDureeEcoulement <em>Autoroute Duree Ecoulement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoroute Duree Ecoulement</em>' containment reference.
	 * @see #getAutorouteDureeEcoulement()
	 * @generated
	 */
	void setAutorouteDureeEcoulement(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Autoroute Distance Entre Vehicules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoroute Distance Entre Vehicules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoroute Distance Entre Vehicules</em>' containment reference.
	 * @see #setAutorouteDistanceEntreVehicules(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_AutorouteDistanceEntreVehicules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AutorouteDistanceEntreVehicules'"
	 * @generated
	 */
	TypeDataTypeLongueur getAutorouteDistanceEntreVehicules();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getAutorouteDistanceEntreVehicules <em>Autoroute Distance Entre Vehicules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoroute Distance Entre Vehicules</em>' containment reference.
	 * @see #getAutorouteDistanceEntreVehicules()
	 * @generated
	 */
	void setAutorouteDistanceEntreVehicules(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Autoroute Vitesse Moyenne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autoroute Vitesse Moyenne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoroute Vitesse Moyenne</em>' containment reference.
	 * @see #setAutorouteVitesseMoyenne(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_AutorouteVitesseMoyenne()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AutorouteVitesseMoyenne'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getAutorouteVitesseMoyenne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getAutorouteVitesseMoyenne <em>Autoroute Vitesse Moyenne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoroute Vitesse Moyenne</em>' containment reference.
	 * @see #getAutorouteVitesseMoyenne()
	 * @generated
	 */
	void setAutorouteVitesseMoyenne(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Contraintes Colonnes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraintes Colonnes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes Colonnes</em>' attribute.
	 * @see #setContraintesColonnes(String)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_ContraintesColonnes()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='ContraintesColonnes'"
	 * @generated
	 */
	String getContraintesColonnes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getContraintesColonnes <em>Contraintes Colonnes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contraintes Colonnes</em>' attribute.
	 * @see #getContraintesColonnes()
	 * @generated
	 */
	void setContraintesColonnes(String value);

	/**
	 * Returns the value of the '<em><b>Intervalle Temps Entre Rames</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Temps Entre Rames</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Temps Entre Rames</em>' containment reference.
	 * @see #setIntervalleTempsEntreRames(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_IntervalleTempsEntreRames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntervalleTempsEntreRames'"
	 * @generated
	 */
	TypeDataTypeDuree getIntervalleTempsEntreRames();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getIntervalleTempsEntreRames <em>Intervalle Temps Entre Rames</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Temps Entre Rames</em>' containment reference.
	 * @see #getIntervalleTempsEntreRames()
	 * @generated
	 */
	void setIntervalleTempsEntreRames(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Intervalle Temps Entre Groupements Marche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Temps Entre Groupements Marche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Temps Entre Groupements Marche</em>' containment reference.
	 * @see #setIntervalleTempsEntreGroupementsMarche(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_IntervalleTempsEntreGroupementsMarche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntervalleTempsEntreGroupementsMarche'"
	 * @generated
	 */
	TypeDataTypeDuree getIntervalleTempsEntreGroupementsMarche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getIntervalleTempsEntreGroupementsMarche <em>Intervalle Temps Entre Groupements Marche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Temps Entre Groupements Marche</em>' containment reference.
	 * @see #getIntervalleTempsEntreGroupementsMarche()
	 * @generated
	 */
	void setIntervalleTempsEntreGroupementsMarche(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Consignes Particulieres</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consignes Particulieres</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consignes Particulieres</em>' attribute.
	 * @see #setConsignesParticulieres(String)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_ConsignesParticulieres()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='ConsignesParticulieres'"
	 * @generated
	 */
	String getConsignesParticulieres();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getConsignesParticulieres <em>Consignes Particulieres</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consignes Particulieres</em>' attribute.
	 * @see #getConsignesParticulieres()
	 * @generated
	 */
	void setConsignesParticulieres(String value);

	/**
	 * Returns the value of the '<em><b>Hauteur Maximale Vehicules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Maximale Vehicules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Maximale Vehicules</em>' containment reference.
	 * @see #setHauteurMaximaleVehicules(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_HauteurMaximaleVehicules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurMaximaleVehicules'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurMaximaleVehicules();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getHauteurMaximaleVehicules <em>Hauteur Maximale Vehicules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Maximale Vehicules</em>' containment reference.
	 * @see #getHauteurMaximaleVehicules()
	 * @generated
	 */
	void setHauteurMaximaleVehicules(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Intervalle Temps Entre Unite Marche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Temps Entre Unite Marche</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Temps Entre Unite Marche</em>' containment reference.
	 * @see #setIntervalleTempsEntreUniteMarche(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_IntervalleTempsEntreUniteMarche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntervalleTempsEntreUniteMarche'"
	 * @generated
	 */
	TypeDataTypeDuree getIntervalleTempsEntreUniteMarche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getIntervalleTempsEntreUniteMarche <em>Intervalle Temps Entre Unite Marche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Temps Entre Unite Marche</em>' containment reference.
	 * @see #getIntervalleTempsEntreUniteMarche()
	 * @generated
	 */
	void setIntervalleTempsEntreUniteMarche(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Classe Mil Max Pour Vehicules ARoue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Mil Max Pour Vehicules ARoue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Mil Max Pour Vehicules ARoue</em>' attribute.
	 * @see #isSetClasseMilMaxPourVehiculesARoue()
	 * @see #unsetClasseMilMaxPourVehiculesARoue()
	 * @see #setClasseMilMaxPourVehiculesARoue(long)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_ClasseMilMaxPourVehiculesARoue()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='ClasseMilMaxPourVehiculesARoue'"
	 * @generated
	 */
	long getClasseMilMaxPourVehiculesARoue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Mil Max Pour Vehicules ARoue</em>' attribute.
	 * @see #isSetClasseMilMaxPourVehiculesARoue()
	 * @see #unsetClasseMilMaxPourVehiculesARoue()
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @generated
	 */
	void setClasseMilMaxPourVehiculesARoue(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContraintesMouvement#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasseMilMaxPourVehiculesARoue()
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @see #setClasseMilMaxPourVehiculesARoue(long)
	 * @generated
	 */
	void unsetClasseMilMaxPourVehiculesARoue();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContraintesMouvement#getClasseMilMaxPourVehiculesARoue <em>Classe Mil Max Pour Vehicules ARoue</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe Mil Max Pour Vehicules ARoue</em>' attribute is set.
	 * @see #unsetClasseMilMaxPourVehiculesARoue()
	 * @see #getClasseMilMaxPourVehiculesARoue()
	 * @see #setClasseMilMaxPourVehiculesARoue(long)
	 * @generated
	 */
	boolean isSetClasseMilMaxPourVehiculesARoue();

	/**
	 * Returns the value of the '<em><b>Classe Mi Max Pour Vehicules AChenilles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe Mi Max Pour Vehicules AChenilles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe Mi Max Pour Vehicules AChenilles</em>' attribute.
	 * @see #isSetClasseMiMaxPourVehiculesAChenilles()
	 * @see #unsetClasseMiMaxPourVehiculesAChenilles()
	 * @see #setClasseMiMaxPourVehiculesAChenilles(long)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_ClasseMiMaxPourVehiculesAChenilles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='ClasseMiMaxPourVehiculesAChenilles'"
	 * @generated
	 */
	long getClasseMiMaxPourVehiculesAChenilles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe Mi Max Pour Vehicules AChenilles</em>' attribute.
	 * @see #isSetClasseMiMaxPourVehiculesAChenilles()
	 * @see #unsetClasseMiMaxPourVehiculesAChenilles()
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @generated
	 */
	void setClasseMiMaxPourVehiculesAChenilles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContraintesMouvement#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasseMiMaxPourVehiculesAChenilles()
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @see #setClasseMiMaxPourVehiculesAChenilles(long)
	 * @generated
	 */
	void unsetClasseMiMaxPourVehiculesAChenilles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContraintesMouvement#getClasseMiMaxPourVehiculesAChenilles <em>Classe Mi Max Pour Vehicules AChenilles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe Mi Max Pour Vehicules AChenilles</em>' attribute is set.
	 * @see #unsetClasseMiMaxPourVehiculesAChenilles()
	 * @see #getClasseMiMaxPourVehiculesAChenilles()
	 * @see #setClasseMiMaxPourVehiculesAChenilles(long)
	 * @generated
	 */
	boolean isSetClasseMiMaxPourVehiculesAChenilles();

	/**
	 * Returns the value of the '<em><b>Largeur Maximale Vehicule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Maximale Vehicule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Maximale Vehicule</em>' containment reference.
	 * @see #setLargeurMaximaleVehicule(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_LargeurMaximaleVehicule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurMaximaleVehicule'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurMaximaleVehicule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getLargeurMaximaleVehicule <em>Largeur Maximale Vehicule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Maximale Vehicule</em>' containment reference.
	 * @see #getLargeurMaximaleVehicule()
	 * @generated
	 */
	void setLargeurMaximaleVehicule(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Mesures Precautions OTAN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesures Precautions OTAN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesures Precautions OTAN</em>' attribute.
	 * @see #setMesuresPrecautionsOTAN(String)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_MesuresPrecautionsOTAN()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000"
	 *        extendedMetaData="kind='element' name='MesuresPrecautionsOTAN'"
	 * @generated
	 */
	String getMesuresPrecautionsOTAN();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getMesuresPrecautionsOTAN <em>Mesures Precautions OTAN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mesures Precautions OTAN</em>' attribute.
	 * @see #getMesuresPrecautionsOTAN()
	 * @generated
	 */
	void setMesuresPrecautionsOTAN(String value);

	/**
	 * Returns the value of the '<em><b>Nombre Rames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Rames</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Rames</em>' attribute.
	 * @see #isSetNombreRames()
	 * @see #unsetNombreRames()
	 * @see #setNombreRames(long)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_NombreRames()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreRames'"
	 * @generated
	 */
	long getNombreRames();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreRames <em>Nombre Rames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Rames</em>' attribute.
	 * @see #isSetNombreRames()
	 * @see #unsetNombreRames()
	 * @see #getNombreRames()
	 * @generated
	 */
	void setNombreRames(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreRames <em>Nombre Rames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreRames()
	 * @see #getNombreRames()
	 * @see #setNombreRames(long)
	 * @generated
	 */
	void unsetNombreRames();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreRames <em>Nombre Rames</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Rames</em>' attribute is set.
	 * @see #unsetNombreRames()
	 * @see #getNombreRames()
	 * @see #setNombreRames(long)
	 * @generated
	 */
	boolean isSetNombreRames();

	/**
	 * Returns the value of the '<em><b>Nombre Vehicules AChenilles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules AChenilles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules AChenilles</em>' attribute.
	 * @see #isSetNombreVehiculesAChenilles()
	 * @see #unsetNombreVehiculesAChenilles()
	 * @see #setNombreVehiculesAChenilles(long)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_NombreVehiculesAChenilles()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreVehiculesAChenilles'"
	 * @generated
	 */
	long getNombreVehiculesAChenilles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesAChenilles <em>Nombre Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules AChenilles</em>' attribute.
	 * @see #isSetNombreVehiculesAChenilles()
	 * @see #unsetNombreVehiculesAChenilles()
	 * @see #getNombreVehiculesAChenilles()
	 * @generated
	 */
	void setNombreVehiculesAChenilles(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesAChenilles <em>Nombre Vehicules AChenilles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehiculesAChenilles()
	 * @see #getNombreVehiculesAChenilles()
	 * @see #setNombreVehiculesAChenilles(long)
	 * @generated
	 */
	void unsetNombreVehiculesAChenilles();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesAChenilles <em>Nombre Vehicules AChenilles</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules AChenilles</em>' attribute is set.
	 * @see #unsetNombreVehiculesAChenilles()
	 * @see #getNombreVehiculesAChenilles()
	 * @see #setNombreVehiculesAChenilles(long)
	 * @generated
	 */
	boolean isSetNombreVehiculesAChenilles();

	/**
	 * Returns the value of the '<em><b>Nombre Vehicules Plus Lourd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules Plus Lourd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules Plus Lourd</em>' attribute.
	 * @see #isSetNombreVehiculesPlusLourd()
	 * @see #unsetNombreVehiculesPlusLourd()
	 * @see #setNombreVehiculesPlusLourd(long)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_NombreVehiculesPlusLourd()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreVehiculesPlusLourd'"
	 * @generated
	 */
	long getNombreVehiculesPlusLourd();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesPlusLourd <em>Nombre Vehicules Plus Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules Plus Lourd</em>' attribute.
	 * @see #isSetNombreVehiculesPlusLourd()
	 * @see #unsetNombreVehiculesPlusLourd()
	 * @see #getNombreVehiculesPlusLourd()
	 * @generated
	 */
	void setNombreVehiculesPlusLourd(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesPlusLourd <em>Nombre Vehicules Plus Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehiculesPlusLourd()
	 * @see #getNombreVehiculesPlusLourd()
	 * @see #setNombreVehiculesPlusLourd(long)
	 * @generated
	 */
	void unsetNombreVehiculesPlusLourd();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesPlusLourd <em>Nombre Vehicules Plus Lourd</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules Plus Lourd</em>' attribute is set.
	 * @see #unsetNombreVehiculesPlusLourd()
	 * @see #getNombreVehiculesPlusLourd()
	 * @see #setNombreVehiculesPlusLourd(long)
	 * @generated
	 */
	boolean isSetNombreVehiculesPlusLourd();

	/**
	 * Returns the value of the '<em><b>Longueur Maximale Vehicule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Maximale Vehicule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Maximale Vehicule</em>' containment reference.
	 * @see #setLongueurMaximaleVehicule(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_LongueurMaximaleVehicule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LongueurMaximaleVehicule'"
	 * @generated
	 */
	TypeDataTypeLongueur getLongueurMaximaleVehicule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getLongueurMaximaleVehicule <em>Longueur Maximale Vehicule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Maximale Vehicule</em>' containment reference.
	 * @see #getLongueurMaximaleVehicule()
	 * @generated
	 */
	void setLongueurMaximaleVehicule(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Nombre Groupements Marche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Groupements Marche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Groupements Marche</em>' attribute.
	 * @see #isSetNombreGroupementsMarche()
	 * @see #unsetNombreGroupementsMarche()
	 * @see #setNombreGroupementsMarche(long)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_NombreGroupementsMarche()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreGroupementsMarche'"
	 * @generated
	 */
	long getNombreGroupementsMarche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreGroupementsMarche <em>Nombre Groupements Marche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Groupements Marche</em>' attribute.
	 * @see #isSetNombreGroupementsMarche()
	 * @see #unsetNombreGroupementsMarche()
	 * @see #getNombreGroupementsMarche()
	 * @generated
	 */
	void setNombreGroupementsMarche(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreGroupementsMarche <em>Nombre Groupements Marche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreGroupementsMarche()
	 * @see #getNombreGroupementsMarche()
	 * @see #setNombreGroupementsMarche(long)
	 * @generated
	 */
	void unsetNombreGroupementsMarche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreGroupementsMarche <em>Nombre Groupements Marche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Groupements Marche</em>' attribute is set.
	 * @see #unsetNombreGroupementsMarche()
	 * @see #getNombreGroupementsMarche()
	 * @see #setNombreGroupementsMarche(long)
	 * @generated
	 */
	boolean isSetNombreGroupementsMarche();

	/**
	 * Returns the value of the '<em><b>Nombre Unite Marche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Unite Marche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Unite Marche</em>' attribute.
	 * @see #isSetNombreUniteMarche()
	 * @see #unsetNombreUniteMarche()
	 * @see #setNombreUniteMarche(long)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_NombreUniteMarche()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreUniteMarche'"
	 * @generated
	 */
	long getNombreUniteMarche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreUniteMarche <em>Nombre Unite Marche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Unite Marche</em>' attribute.
	 * @see #isSetNombreUniteMarche()
	 * @see #unsetNombreUniteMarche()
	 * @see #getNombreUniteMarche()
	 * @generated
	 */
	void setNombreUniteMarche(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreUniteMarche <em>Nombre Unite Marche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreUniteMarche()
	 * @see #getNombreUniteMarche()
	 * @see #setNombreUniteMarche(long)
	 * @generated
	 */
	void unsetNombreUniteMarche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreUniteMarche <em>Nombre Unite Marche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Unite Marche</em>' attribute is set.
	 * @see #unsetNombreUniteMarche()
	 * @see #getNombreUniteMarche()
	 * @see #setNombreUniteMarche(long)
	 * @generated
	 */
	boolean isSetNombreUniteMarche();

	/**
	 * Returns the value of the '<em><b>Nombre Vehicules ARoues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Vehicules ARoues</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Vehicules ARoues</em>' attribute.
	 * @see #isSetNombreVehiculesARoues()
	 * @see #unsetNombreVehiculesARoues()
	 * @see #setNombreVehiculesARoues(long)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_NombreVehiculesARoues()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreVehiculesARoues'"
	 * @generated
	 */
	long getNombreVehiculesARoues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesARoues <em>Nombre Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Vehicules ARoues</em>' attribute.
	 * @see #isSetNombreVehiculesARoues()
	 * @see #unsetNombreVehiculesARoues()
	 * @see #getNombreVehiculesARoues()
	 * @generated
	 */
	void setNombreVehiculesARoues(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesARoues <em>Nombre Vehicules ARoues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreVehiculesARoues()
	 * @see #getNombreVehiculesARoues()
	 * @see #setNombreVehiculesARoues(long)
	 * @generated
	 */
	void unsetNombreVehiculesARoues();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeContraintesMouvement#getNombreVehiculesARoues <em>Nombre Vehicules ARoues</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Vehicules ARoues</em>' attribute is set.
	 * @see #unsetNombreVehiculesARoues()
	 * @see #getNombreVehiculesARoues()
	 * @see #setNombreVehiculesARoues(long)
	 * @generated
	 */
	boolean isSetNombreVehiculesARoues();

	/**
	 * Returns the value of the '<em><b>Poids Vehicule Plus Lourd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poids Vehicule Plus Lourd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids Vehicule Plus Lourd</em>' containment reference.
	 * @see #setPoidsVehiculePlusLourd(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_PoidsVehiculePlusLourd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PoidsVehiculePlusLourd'"
	 * @generated
	 */
	TypeDataTypeMasse getPoidsVehiculePlusLourd();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getPoidsVehiculePlusLourd <em>Poids Vehicule Plus Lourd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids Vehicule Plus Lourd</em>' containment reference.
	 * @see #getPoidsVehiculePlusLourd()
	 * @generated
	 */
	void setPoidsVehiculePlusLourd(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>PTR Aplus Lourd AChenilles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTR Aplus Lourd AChenilles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTR Aplus Lourd AChenilles</em>' containment reference.
	 * @see #setPTRAplusLourdAChenilles(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_PTRAplusLourdAChenilles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTRAplusLourdAChenilles'"
	 * @generated
	 */
	TypeDataTypeMasse getPTRAplusLourdAChenilles();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getPTRAplusLourdAChenilles <em>PTR Aplus Lourd AChenilles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTR Aplus Lourd AChenilles</em>' containment reference.
	 * @see #getPTRAplusLourdAChenilles()
	 * @generated
	 */
	void setPTRAplusLourdAChenilles(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Rayon Braquage Maximal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Braquage Maximal</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Braquage Maximal</em>' containment reference.
	 * @see #setRayonBraquageMaximal(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_RayonBraquageMaximal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RayonBraquageMaximal'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonBraquageMaximal();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getRayonBraquageMaximal <em>Rayon Braquage Maximal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Braquage Maximal</em>' containment reference.
	 * @see #getRayonBraquageMaximal()
	 * @generated
	 */
	void setRayonBraquageMaximal(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Route Duree Ecoulement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Duree Ecoulement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Duree Ecoulement</em>' containment reference.
	 * @see #setRouteDureeEcoulement(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_RouteDureeEcoulement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RouteDureeEcoulement'"
	 * @generated
	 */
	TypeDataTypeDuree getRouteDureeEcoulement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getRouteDureeEcoulement <em>Route Duree Ecoulement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Duree Ecoulement</em>' containment reference.
	 * @see #getRouteDureeEcoulement()
	 * @generated
	 */
	void setRouteDureeEcoulement(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Route Vitesse Moyenne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Vitesse Moyenne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Vitesse Moyenne</em>' containment reference.
	 * @see #setRouteVitesseMoyenne(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_RouteVitesseMoyenne()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RouteVitesseMoyenne'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getRouteVitesseMoyenne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getRouteVitesseMoyenne <em>Route Vitesse Moyenne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Vitesse Moyenne</em>' containment reference.
	 * @see #getRouteVitesseMoyenne()
	 * @generated
	 */
	void setRouteVitesseMoyenne(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>PTR Aplus Lourd ARoues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTR Aplus Lourd ARoues</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTR Aplus Lourd ARoues</em>' containment reference.
	 * @see #setPTRAplusLourdARoues(TypeDataTypeMasse)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_PTRAplusLourdARoues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTRAplusLourdARoues'"
	 * @generated
	 */
	TypeDataTypeMasse getPTRAplusLourdARoues();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getPTRAplusLourdARoues <em>PTR Aplus Lourd ARoues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTR Aplus Lourd ARoues</em>' containment reference.
	 * @see #getPTRAplusLourdARoues()
	 * @generated
	 */
	void setPTRAplusLourdARoues(TypeDataTypeMasse value);

	/**
	 * Returns the value of the '<em><b>Route Distance Entre Vehicules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Distance Entre Vehicules</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Distance Entre Vehicules</em>' containment reference.
	 * @see #setRouteDistanceEntreVehicules(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_RouteDistanceEntreVehicules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RouteDistanceEntreVehicules'"
	 * @generated
	 */
	TypeDataTypeLongueur getRouteDistanceEntreVehicules();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getRouteDistanceEntreVehicules <em>Route Distance Entre Vehicules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Distance Entre Vehicules</em>' containment reference.
	 * @see #getRouteDistanceEntreVehicules()
	 * @generated
	 */
	void setRouteDistanceEntreVehicules(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Route Longueur Encombrement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Longueur Encombrement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Longueur Encombrement</em>' containment reference.
	 * @see #setRouteLongueurEncombrement(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_RouteLongueurEncombrement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RouteLongueurEncombrement'"
	 * @generated
	 */
	TypeDataTypeLongueur getRouteLongueurEncombrement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getRouteLongueurEncombrement <em>Route Longueur Encombrement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route Longueur Encombrement</em>' containment reference.
	 * @see #getRouteLongueurEncombrement()
	 * @generated
	 */
	void setRouteLongueurEncombrement(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Type Vehicule Plus Lourd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Vehicule Plus Lourd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Vehicule Plus Lourd</em>' attribute.
	 * @see #setTypeVehiculePlusLourd(String)
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_TypeVehiculePlusLourd()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='TypeVehiculePlusLourd'"
	 * @generated
	 */
	String getTypeVehiculePlusLourd();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeContraintesMouvement#getTypeVehiculePlusLourd <em>Type Vehicule Plus Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Vehicule Plus Lourd</em>' attribute.
	 * @see #getTypeVehiculePlusLourd()
	 * @generated
	 */
	void setTypeVehiculePlusLourd(String value);

	/**
	 * Returns the value of the '<em><b>AComme Vehicule Plus Contraignant Vehicule Exceptionnel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeVehiculeExceptionnel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Vehicule Plus Contraignant Vehicule Exceptionnel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Vehicule Plus Contraignant Vehicule Exceptionnel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeContraintesMouvement_ACommeVehiculePlusContraignantVehiculeExceptionnel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_VehiculeExceptionnel'"
	 *        extendedMetaData="kind='element' name='ACommeVehiculePlusContraignant_VehiculeExceptionnel'"
	 * @generated
	 */
	EList<TypeVehiculeExceptionnel> getACommeVehiculePlusContraignantVehiculeExceptionnel();

} // TypeContraintesMouvement
