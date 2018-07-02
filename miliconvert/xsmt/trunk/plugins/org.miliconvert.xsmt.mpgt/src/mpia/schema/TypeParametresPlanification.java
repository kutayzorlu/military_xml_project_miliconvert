/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parametres Planification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeParametresPlanification#isArretSurHalte <em>Arret Sur Halte</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getDistanceEntreVehiculesArret <em>Distance Entre Vehicules Arret</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreRames <em>Intervalle Entre Rames</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getLongueurMaxVehicule <em>Longueur Max Vehicule</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getDebutNuit <em>Debut Nuit</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getFinNuit <em>Fin Nuit</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getDistanceEntreVehicules <em>Distance Entre Vehicules</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreFormation <em>Intervalle Entre Formation</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreRegiments <em>Intervalle Entre Regiments</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getModeCalcul <em>Mode Calcul</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getNiveauGU <em>Niveau GU</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getResponsableAttributMvt <em>Responsable Attribut Mvt</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurAutoroute <em>Vitesse Jour Sur Autoroute</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurRouteSpe <em>Vitesse Jour Sur Route Spe</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getIdentifiantMouvement <em>Identifiant Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getTypeDeplacement <em>Type Deplacement</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurRoute <em>Vitesse Jour Sur Route</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurAutoroute <em>Vitesse Nuit Sur Autoroute</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurRoute <em>Vitesse Nuit Sur Route</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurRouteSpeciale <em>Vitesse Nuit Sur Route Speciale</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresPlanification#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ParametresPlanification' kind='elementOnly'"
 * @generated
 */
public interface TypeParametresPlanification extends EObject {
	/**
	 * Returns the value of the '<em><b>Arret Sur Halte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arret Sur Halte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arret Sur Halte</em>' attribute.
	 * @see #isSetArretSurHalte()
	 * @see #unsetArretSurHalte()
	 * @see #setArretSurHalte(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_ArretSurHalte()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='ArretSurHalte'"
	 * @generated
	 */
	boolean isArretSurHalte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#isArretSurHalte <em>Arret Sur Halte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arret Sur Halte</em>' attribute.
	 * @see #isSetArretSurHalte()
	 * @see #unsetArretSurHalte()
	 * @see #isArretSurHalte()
	 * @generated
	 */
	void setArretSurHalte(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#isArretSurHalte <em>Arret Sur Halte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArretSurHalte()
	 * @see #isArretSurHalte()
	 * @see #setArretSurHalte(boolean)
	 * @generated
	 */
	void unsetArretSurHalte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#isArretSurHalte <em>Arret Sur Halte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Arret Sur Halte</em>' attribute is set.
	 * @see #unsetArretSurHalte()
	 * @see #isArretSurHalte()
	 * @see #setArretSurHalte(boolean)
	 * @generated
	 */
	boolean isSetArretSurHalte();

	/**
	 * Returns the value of the '<em><b>Distance Entre Vehicules Arret</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Entre Vehicules Arret</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Entre Vehicules Arret</em>' attribute.
	 * @see #isSetDistanceEntreVehiculesArret()
	 * @see #unsetDistanceEntreVehiculesArret()
	 * @see #setDistanceEntreVehiculesArret(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_DistanceEntreVehiculesArret()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='DistanceEntreVehiculesArret'"
	 * @generated
	 */
	long getDistanceEntreVehiculesArret();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getDistanceEntreVehiculesArret <em>Distance Entre Vehicules Arret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Entre Vehicules Arret</em>' attribute.
	 * @see #isSetDistanceEntreVehiculesArret()
	 * @see #unsetDistanceEntreVehiculesArret()
	 * @see #getDistanceEntreVehiculesArret()
	 * @generated
	 */
	void setDistanceEntreVehiculesArret(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getDistanceEntreVehiculesArret <em>Distance Entre Vehicules Arret</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistanceEntreVehiculesArret()
	 * @see #getDistanceEntreVehiculesArret()
	 * @see #setDistanceEntreVehiculesArret(long)
	 * @generated
	 */
	void unsetDistanceEntreVehiculesArret();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getDistanceEntreVehiculesArret <em>Distance Entre Vehicules Arret</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance Entre Vehicules Arret</em>' attribute is set.
	 * @see #unsetDistanceEntreVehiculesArret()
	 * @see #getDistanceEntreVehiculesArret()
	 * @see #setDistanceEntreVehiculesArret(long)
	 * @generated
	 */
	boolean isSetDistanceEntreVehiculesArret();

	/**
	 * Returns the value of the '<em><b>Intervalle Entre Rames</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Entre Rames</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Entre Rames</em>' attribute.
	 * @see #isSetIntervalleEntreRames()
	 * @see #unsetIntervalleEntreRames()
	 * @see #setIntervalleEntreRames(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_IntervalleEntreRames()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='IntervalleEntreRames'"
	 * @generated
	 */
	long getIntervalleEntreRames();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreRames <em>Intervalle Entre Rames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Entre Rames</em>' attribute.
	 * @see #isSetIntervalleEntreRames()
	 * @see #unsetIntervalleEntreRames()
	 * @see #getIntervalleEntreRames()
	 * @generated
	 */
	void setIntervalleEntreRames(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreRames <em>Intervalle Entre Rames</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntervalleEntreRames()
	 * @see #getIntervalleEntreRames()
	 * @see #setIntervalleEntreRames(long)
	 * @generated
	 */
	void unsetIntervalleEntreRames();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreRames <em>Intervalle Entre Rames</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intervalle Entre Rames</em>' attribute is set.
	 * @see #unsetIntervalleEntreRames()
	 * @see #getIntervalleEntreRames()
	 * @see #setIntervalleEntreRames(long)
	 * @generated
	 */
	boolean isSetIntervalleEntreRames();

	/**
	 * Returns the value of the '<em><b>Longueur Max Vehicule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longueur Max Vehicule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longueur Max Vehicule</em>' attribute.
	 * @see #isSetLongueurMaxVehicule()
	 * @see #unsetLongueurMaxVehicule()
	 * @see #setLongueurMaxVehicule(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_LongueurMaxVehicule()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='LongueurMaxVehicule'"
	 * @generated
	 */
	long getLongueurMaxVehicule();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getLongueurMaxVehicule <em>Longueur Max Vehicule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longueur Max Vehicule</em>' attribute.
	 * @see #isSetLongueurMaxVehicule()
	 * @see #unsetLongueurMaxVehicule()
	 * @see #getLongueurMaxVehicule()
	 * @generated
	 */
	void setLongueurMaxVehicule(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getLongueurMaxVehicule <em>Longueur Max Vehicule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongueurMaxVehicule()
	 * @see #getLongueurMaxVehicule()
	 * @see #setLongueurMaxVehicule(long)
	 * @generated
	 */
	void unsetLongueurMaxVehicule();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getLongueurMaxVehicule <em>Longueur Max Vehicule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longueur Max Vehicule</em>' attribute is set.
	 * @see #unsetLongueurMaxVehicule()
	 * @see #getLongueurMaxVehicule()
	 * @see #setLongueurMaxVehicule(long)
	 * @generated
	 */
	boolean isSetLongueurMaxVehicule();

	/**
	 * Returns the value of the '<em><b>Debut Nuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Nuit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Nuit</em>' attribute.
	 * @see #isSetDebutNuit()
	 * @see #unsetDebutNuit()
	 * @see #setDebutNuit(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_DebutNuit()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='DebutNuit'"
	 * @generated
	 */
	long getDebutNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getDebutNuit <em>Debut Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Nuit</em>' attribute.
	 * @see #isSetDebutNuit()
	 * @see #unsetDebutNuit()
	 * @see #getDebutNuit()
	 * @generated
	 */
	void setDebutNuit(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getDebutNuit <em>Debut Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDebutNuit()
	 * @see #getDebutNuit()
	 * @see #setDebutNuit(long)
	 * @generated
	 */
	void unsetDebutNuit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getDebutNuit <em>Debut Nuit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Debut Nuit</em>' attribute is set.
	 * @see #unsetDebutNuit()
	 * @see #getDebutNuit()
	 * @see #setDebutNuit(long)
	 * @generated
	 */
	boolean isSetDebutNuit();

	/**
	 * Returns the value of the '<em><b>Fin Nuit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Nuit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Nuit</em>' attribute.
	 * @see #isSetFinNuit()
	 * @see #unsetFinNuit()
	 * @see #setFinNuit(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_FinNuit()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='FinNuit'"
	 * @generated
	 */
	long getFinNuit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getFinNuit <em>Fin Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Nuit</em>' attribute.
	 * @see #isSetFinNuit()
	 * @see #unsetFinNuit()
	 * @see #getFinNuit()
	 * @generated
	 */
	void setFinNuit(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getFinNuit <em>Fin Nuit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinNuit()
	 * @see #getFinNuit()
	 * @see #setFinNuit(long)
	 * @generated
	 */
	void unsetFinNuit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getFinNuit <em>Fin Nuit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fin Nuit</em>' attribute is set.
	 * @see #unsetFinNuit()
	 * @see #getFinNuit()
	 * @see #setFinNuit(long)
	 * @generated
	 */
	boolean isSetFinNuit();

	/**
	 * Returns the value of the '<em><b>Distance Entre Vehicules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Entre Vehicules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Entre Vehicules</em>' attribute.
	 * @see #isSetDistanceEntreVehicules()
	 * @see #unsetDistanceEntreVehicules()
	 * @see #setDistanceEntreVehicules(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_DistanceEntreVehicules()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='DistanceEntreVehicules'"
	 * @generated
	 */
	long getDistanceEntreVehicules();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getDistanceEntreVehicules <em>Distance Entre Vehicules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Entre Vehicules</em>' attribute.
	 * @see #isSetDistanceEntreVehicules()
	 * @see #unsetDistanceEntreVehicules()
	 * @see #getDistanceEntreVehicules()
	 * @generated
	 */
	void setDistanceEntreVehicules(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getDistanceEntreVehicules <em>Distance Entre Vehicules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistanceEntreVehicules()
	 * @see #getDistanceEntreVehicules()
	 * @see #setDistanceEntreVehicules(long)
	 * @generated
	 */
	void unsetDistanceEntreVehicules();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getDistanceEntreVehicules <em>Distance Entre Vehicules</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distance Entre Vehicules</em>' attribute is set.
	 * @see #unsetDistanceEntreVehicules()
	 * @see #getDistanceEntreVehicules()
	 * @see #setDistanceEntreVehicules(long)
	 * @generated
	 */
	boolean isSetDistanceEntreVehicules();

	/**
	 * Returns the value of the '<em><b>Intervalle Entre Formation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Entre Formation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Entre Formation</em>' attribute.
	 * @see #isSetIntervalleEntreFormation()
	 * @see #unsetIntervalleEntreFormation()
	 * @see #setIntervalleEntreFormation(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_IntervalleEntreFormation()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='IntervalleEntreFormation'"
	 * @generated
	 */
	long getIntervalleEntreFormation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreFormation <em>Intervalle Entre Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Entre Formation</em>' attribute.
	 * @see #isSetIntervalleEntreFormation()
	 * @see #unsetIntervalleEntreFormation()
	 * @see #getIntervalleEntreFormation()
	 * @generated
	 */
	void setIntervalleEntreFormation(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreFormation <em>Intervalle Entre Formation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntervalleEntreFormation()
	 * @see #getIntervalleEntreFormation()
	 * @see #setIntervalleEntreFormation(long)
	 * @generated
	 */
	void unsetIntervalleEntreFormation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreFormation <em>Intervalle Entre Formation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intervalle Entre Formation</em>' attribute is set.
	 * @see #unsetIntervalleEntreFormation()
	 * @see #getIntervalleEntreFormation()
	 * @see #setIntervalleEntreFormation(long)
	 * @generated
	 */
	boolean isSetIntervalleEntreFormation();

	/**
	 * Returns the value of the '<em><b>Intervalle Entre Regiments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Entre Regiments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Entre Regiments</em>' attribute.
	 * @see #isSetIntervalleEntreRegiments()
	 * @see #unsetIntervalleEntreRegiments()
	 * @see #setIntervalleEntreRegiments(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_IntervalleEntreRegiments()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='IntervalleEntreRegiments'"
	 * @generated
	 */
	long getIntervalleEntreRegiments();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreRegiments <em>Intervalle Entre Regiments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Entre Regiments</em>' attribute.
	 * @see #isSetIntervalleEntreRegiments()
	 * @see #unsetIntervalleEntreRegiments()
	 * @see #getIntervalleEntreRegiments()
	 * @generated
	 */
	void setIntervalleEntreRegiments(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreRegiments <em>Intervalle Entre Regiments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntervalleEntreRegiments()
	 * @see #getIntervalleEntreRegiments()
	 * @see #setIntervalleEntreRegiments(long)
	 * @generated
	 */
	void unsetIntervalleEntreRegiments();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getIntervalleEntreRegiments <em>Intervalle Entre Regiments</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intervalle Entre Regiments</em>' attribute is set.
	 * @see #unsetIntervalleEntreRegiments()
	 * @see #getIntervalleEntreRegiments()
	 * @see #setIntervalleEntreRegiments(long)
	 * @generated
	 */
	boolean isSetIntervalleEntreRegiments();

	/**
	 * Returns the value of the '<em><b>Mode Calcul</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModeCalculDeplacement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Calcul</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Calcul</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeCalculDeplacement
	 * @see #isSetModeCalcul()
	 * @see #unsetModeCalcul()
	 * @see #setModeCalcul(TypeDictionaryDicoModeCalculDeplacement)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_ModeCalcul()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeCalcul'"
	 * @generated
	 */
	TypeDictionaryDicoModeCalculDeplacement getModeCalcul();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getModeCalcul <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Calcul</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeCalculDeplacement
	 * @see #isSetModeCalcul()
	 * @see #unsetModeCalcul()
	 * @see #getModeCalcul()
	 * @generated
	 */
	void setModeCalcul(TypeDictionaryDicoModeCalculDeplacement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getModeCalcul <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeCalcul()
	 * @see #getModeCalcul()
	 * @see #setModeCalcul(TypeDictionaryDicoModeCalculDeplacement)
	 * @generated
	 */
	void unsetModeCalcul();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getModeCalcul <em>Mode Calcul</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Calcul</em>' attribute is set.
	 * @see #unsetModeCalcul()
	 * @see #getModeCalcul()
	 * @see #setModeCalcul(TypeDictionaryDicoModeCalculDeplacement)
	 * @generated
	 */
	boolean isSetModeCalcul();

	/**
	 * Returns the value of the '<em><b>Niveau GU</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoNiveau}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau GU</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau GU</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNiveau
	 * @see #isSetNiveauGU()
	 * @see #unsetNiveauGU()
	 * @see #setNiveauGU(TypeDictionaryDicoNiveau)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_NiveauGU()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauGU'"
	 * @generated
	 */
	TypeDictionaryDicoNiveau getNiveauGU();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getNiveauGU <em>Niveau GU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau GU</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoNiveau
	 * @see #isSetNiveauGU()
	 * @see #unsetNiveauGU()
	 * @see #getNiveauGU()
	 * @generated
	 */
	void setNiveauGU(TypeDictionaryDicoNiveau value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getNiveauGU <em>Niveau GU</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauGU()
	 * @see #getNiveauGU()
	 * @see #setNiveauGU(TypeDictionaryDicoNiveau)
	 * @generated
	 */
	void unsetNiveauGU();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getNiveauGU <em>Niveau GU</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau GU</em>' attribute is set.
	 * @see #unsetNiveauGU()
	 * @see #getNiveauGU()
	 * @see #setNiveauGU(TypeDictionaryDicoNiveau)
	 * @generated
	 */
	boolean isSetNiveauGU();

	/**
	 * Returns the value of the '<em><b>Responsable Attribut Mvt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsable Attribut Mvt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Attribut Mvt</em>' attribute.
	 * @see #setResponsableAttributMvt(String)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_ResponsableAttributMvt()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='ResponsableAttributMvt'"
	 * @generated
	 */
	String getResponsableAttributMvt();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getResponsableAttributMvt <em>Responsable Attribut Mvt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable Attribut Mvt</em>' attribute.
	 * @see #getResponsableAttributMvt()
	 * @generated
	 */
	void setResponsableAttributMvt(String value);

	/**
	 * Returns the value of the '<em><b>Vitesse Jour Sur Autoroute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Jour Sur Autoroute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Jour Sur Autoroute</em>' attribute.
	 * @see #isSetVitesseJourSurAutoroute()
	 * @see #unsetVitesseJourSurAutoroute()
	 * @see #setVitesseJourSurAutoroute(double)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_VitesseJourSurAutoroute()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseJourSurAutoroute'"
	 * @generated
	 */
	double getVitesseJourSurAutoroute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurAutoroute <em>Vitesse Jour Sur Autoroute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Jour Sur Autoroute</em>' attribute.
	 * @see #isSetVitesseJourSurAutoroute()
	 * @see #unsetVitesseJourSurAutoroute()
	 * @see #getVitesseJourSurAutoroute()
	 * @generated
	 */
	void setVitesseJourSurAutoroute(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurAutoroute <em>Vitesse Jour Sur Autoroute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseJourSurAutoroute()
	 * @see #getVitesseJourSurAutoroute()
	 * @see #setVitesseJourSurAutoroute(double)
	 * @generated
	 */
	void unsetVitesseJourSurAutoroute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurAutoroute <em>Vitesse Jour Sur Autoroute</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Jour Sur Autoroute</em>' attribute is set.
	 * @see #unsetVitesseJourSurAutoroute()
	 * @see #getVitesseJourSurAutoroute()
	 * @see #setVitesseJourSurAutoroute(double)
	 * @generated
	 */
	boolean isSetVitesseJourSurAutoroute();

	/**
	 * Returns the value of the '<em><b>Vitesse Jour Sur Route Spe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Jour Sur Route Spe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Jour Sur Route Spe</em>' attribute.
	 * @see #isSetVitesseJourSurRouteSpe()
	 * @see #unsetVitesseJourSurRouteSpe()
	 * @see #setVitesseJourSurRouteSpe(double)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_VitesseJourSurRouteSpe()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseJourSurRouteSpe'"
	 * @generated
	 */
	double getVitesseJourSurRouteSpe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurRouteSpe <em>Vitesse Jour Sur Route Spe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Jour Sur Route Spe</em>' attribute.
	 * @see #isSetVitesseJourSurRouteSpe()
	 * @see #unsetVitesseJourSurRouteSpe()
	 * @see #getVitesseJourSurRouteSpe()
	 * @generated
	 */
	void setVitesseJourSurRouteSpe(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurRouteSpe <em>Vitesse Jour Sur Route Spe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseJourSurRouteSpe()
	 * @see #getVitesseJourSurRouteSpe()
	 * @see #setVitesseJourSurRouteSpe(double)
	 * @generated
	 */
	void unsetVitesseJourSurRouteSpe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurRouteSpe <em>Vitesse Jour Sur Route Spe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Jour Sur Route Spe</em>' attribute is set.
	 * @see #unsetVitesseJourSurRouteSpe()
	 * @see #getVitesseJourSurRouteSpe()
	 * @see #setVitesseJourSurRouteSpe(double)
	 * @generated
	 */
	boolean isSetVitesseJourSurRouteSpe();

	/**
	 * Returns the value of the '<em><b>Nationalite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationalite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @generated
	 */
	void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getNationalite <em>Nationalite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationalite</em>' attribute is set.
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetNationalite();

	/**
	 * Returns the value of the '<em><b>Identifiant Mouvement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Mouvement</em>' attribute.
	 * @see #setIdentifiantMouvement(String)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_IdentifiantMouvement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine03"
	 *        extendedMetaData="kind='element' name='IdentifiantMouvement'"
	 * @generated
	 */
	String getIdentifiantMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getIdentifiantMouvement <em>Identifiant Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Mouvement</em>' attribute.
	 * @see #getIdentifiantMouvement()
	 * @generated
	 */
	void setIdentifiantMouvement(String value);

	/**
	 * Returns the value of the '<em><b>Type Deplacement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTypeDeplacement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Deplacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Deplacement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeDeplacement
	 * @see #isSetTypeDeplacement()
	 * @see #unsetTypeDeplacement()
	 * @see #setTypeDeplacement(TypeDictionaryDicoTypeDeplacement)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_TypeDeplacement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeDeplacement'"
	 * @generated
	 */
	TypeDictionaryDicoTypeDeplacement getTypeDeplacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getTypeDeplacement <em>Type Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Deplacement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTypeDeplacement
	 * @see #isSetTypeDeplacement()
	 * @see #unsetTypeDeplacement()
	 * @see #getTypeDeplacement()
	 * @generated
	 */
	void setTypeDeplacement(TypeDictionaryDicoTypeDeplacement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getTypeDeplacement <em>Type Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeDeplacement()
	 * @see #getTypeDeplacement()
	 * @see #setTypeDeplacement(TypeDictionaryDicoTypeDeplacement)
	 * @generated
	 */
	void unsetTypeDeplacement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getTypeDeplacement <em>Type Deplacement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Deplacement</em>' attribute is set.
	 * @see #unsetTypeDeplacement()
	 * @see #getTypeDeplacement()
	 * @see #setTypeDeplacement(TypeDictionaryDicoTypeDeplacement)
	 * @generated
	 */
	boolean isSetTypeDeplacement();

	/**
	 * Returns the value of the '<em><b>Vitesse Jour Sur Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Jour Sur Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Jour Sur Route</em>' attribute.
	 * @see #isSetVitesseJourSurRoute()
	 * @see #unsetVitesseJourSurRoute()
	 * @see #setVitesseJourSurRoute(double)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_VitesseJourSurRoute()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseJourSurRoute'"
	 * @generated
	 */
	double getVitesseJourSurRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurRoute <em>Vitesse Jour Sur Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Jour Sur Route</em>' attribute.
	 * @see #isSetVitesseJourSurRoute()
	 * @see #unsetVitesseJourSurRoute()
	 * @see #getVitesseJourSurRoute()
	 * @generated
	 */
	void setVitesseJourSurRoute(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurRoute <em>Vitesse Jour Sur Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseJourSurRoute()
	 * @see #getVitesseJourSurRoute()
	 * @see #setVitesseJourSurRoute(double)
	 * @generated
	 */
	void unsetVitesseJourSurRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseJourSurRoute <em>Vitesse Jour Sur Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Jour Sur Route</em>' attribute is set.
	 * @see #unsetVitesseJourSurRoute()
	 * @see #getVitesseJourSurRoute()
	 * @see #setVitesseJourSurRoute(double)
	 * @generated
	 */
	boolean isSetVitesseJourSurRoute();

	/**
	 * Returns the value of the '<em><b>Vitesse Nuit Sur Autoroute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Nuit Sur Autoroute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Nuit Sur Autoroute</em>' attribute.
	 * @see #isSetVitesseNuitSurAutoroute()
	 * @see #unsetVitesseNuitSurAutoroute()
	 * @see #setVitesseNuitSurAutoroute(double)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_VitesseNuitSurAutoroute()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseNuitSurAutoroute'"
	 * @generated
	 */
	double getVitesseNuitSurAutoroute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurAutoroute <em>Vitesse Nuit Sur Autoroute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Nuit Sur Autoroute</em>' attribute.
	 * @see #isSetVitesseNuitSurAutoroute()
	 * @see #unsetVitesseNuitSurAutoroute()
	 * @see #getVitesseNuitSurAutoroute()
	 * @generated
	 */
	void setVitesseNuitSurAutoroute(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurAutoroute <em>Vitesse Nuit Sur Autoroute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseNuitSurAutoroute()
	 * @see #getVitesseNuitSurAutoroute()
	 * @see #setVitesseNuitSurAutoroute(double)
	 * @generated
	 */
	void unsetVitesseNuitSurAutoroute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurAutoroute <em>Vitesse Nuit Sur Autoroute</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Nuit Sur Autoroute</em>' attribute is set.
	 * @see #unsetVitesseNuitSurAutoroute()
	 * @see #getVitesseNuitSurAutoroute()
	 * @see #setVitesseNuitSurAutoroute(double)
	 * @generated
	 */
	boolean isSetVitesseNuitSurAutoroute();

	/**
	 * Returns the value of the '<em><b>Vitesse Nuit Sur Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Nuit Sur Route</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Nuit Sur Route</em>' attribute.
	 * @see #isSetVitesseNuitSurRoute()
	 * @see #unsetVitesseNuitSurRoute()
	 * @see #setVitesseNuitSurRoute(double)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_VitesseNuitSurRoute()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseNuitSurRoute'"
	 * @generated
	 */
	double getVitesseNuitSurRoute();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurRoute <em>Vitesse Nuit Sur Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Nuit Sur Route</em>' attribute.
	 * @see #isSetVitesseNuitSurRoute()
	 * @see #unsetVitesseNuitSurRoute()
	 * @see #getVitesseNuitSurRoute()
	 * @generated
	 */
	void setVitesseNuitSurRoute(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurRoute <em>Vitesse Nuit Sur Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseNuitSurRoute()
	 * @see #getVitesseNuitSurRoute()
	 * @see #setVitesseNuitSurRoute(double)
	 * @generated
	 */
	void unsetVitesseNuitSurRoute();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurRoute <em>Vitesse Nuit Sur Route</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Nuit Sur Route</em>' attribute is set.
	 * @see #unsetVitesseNuitSurRoute()
	 * @see #getVitesseNuitSurRoute()
	 * @see #setVitesseNuitSurRoute(double)
	 * @generated
	 */
	boolean isSetVitesseNuitSurRoute();

	/**
	 * Returns the value of the '<em><b>Vitesse Nuit Sur Route Speciale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Nuit Sur Route Speciale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Nuit Sur Route Speciale</em>' attribute.
	 * @see #isSetVitesseNuitSurRouteSpeciale()
	 * @see #unsetVitesseNuitSurRouteSpeciale()
	 * @see #setVitesseNuitSurRouteSpeciale(double)
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_VitesseNuitSurRouteSpeciale()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='VitesseNuitSurRouteSpeciale'"
	 * @generated
	 */
	double getVitesseNuitSurRouteSpeciale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurRouteSpeciale <em>Vitesse Nuit Sur Route Speciale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Nuit Sur Route Speciale</em>' attribute.
	 * @see #isSetVitesseNuitSurRouteSpeciale()
	 * @see #unsetVitesseNuitSurRouteSpeciale()
	 * @see #getVitesseNuitSurRouteSpeciale()
	 * @generated
	 */
	void setVitesseNuitSurRouteSpeciale(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurRouteSpeciale <em>Vitesse Nuit Sur Route Speciale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseNuitSurRouteSpeciale()
	 * @see #getVitesseNuitSurRouteSpeciale()
	 * @see #setVitesseNuitSurRouteSpeciale(double)
	 * @generated
	 */
	void unsetVitesseNuitSurRouteSpeciale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresPlanification#getVitesseNuitSurRouteSpeciale <em>Vitesse Nuit Sur Route Speciale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Nuit Sur Route Speciale</em>' attribute is set.
	 * @see #unsetVitesseNuitSurRouteSpeciale()
	 * @see #getVitesseNuitSurRouteSpeciale()
	 * @see #setVitesseNuitSurRouteSpeciale(double)
	 * @generated
	 */
	boolean isSetVitesseNuitSurRouteSpeciale();

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
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeParametresPlanification_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresPlanification#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

} // TypeParametresPlanification
