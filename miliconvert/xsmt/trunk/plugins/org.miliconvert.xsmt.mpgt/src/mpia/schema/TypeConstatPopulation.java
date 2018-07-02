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
 * A representation of the model object '<em><b>Type Constat Population</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConstatPopulation#isPresencePopulation <em>Presence Population</em>}</li>
 *   <li>{@link mpia.schema.TypeConstatPopulation#isPopulationDeplacement <em>Population Deplacement</em>}</li>
 *   <li>{@link mpia.schema.TypeConstatPopulation#isPopulationRegroupee <em>Population Regroupee</em>}</li>
 *   <li>{@link mpia.schema.TypeConstatPopulation#getItineraireEmprunte <em>Itineraire Emprunte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConstatPopulation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConstatPopulation' kind='elementOnly'"
 * @generated
 */
public interface TypeConstatPopulation extends EObject {
	/**
	 * Returns the value of the '<em><b>Presence Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presence Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence Population</em>' attribute.
	 * @see #isSetPresencePopulation()
	 * @see #unsetPresencePopulation()
	 * @see #setPresencePopulation(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeConstatPopulation_PresencePopulation()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PresencePopulation'"
	 * @generated
	 */
	boolean isPresencePopulation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatPopulation#isPresencePopulation <em>Presence Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence Population</em>' attribute.
	 * @see #isSetPresencePopulation()
	 * @see #unsetPresencePopulation()
	 * @see #isPresencePopulation()
	 * @generated
	 */
	void setPresencePopulation(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConstatPopulation#isPresencePopulation <em>Presence Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresencePopulation()
	 * @see #isPresencePopulation()
	 * @see #setPresencePopulation(boolean)
	 * @generated
	 */
	void unsetPresencePopulation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConstatPopulation#isPresencePopulation <em>Presence Population</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presence Population</em>' attribute is set.
	 * @see #unsetPresencePopulation()
	 * @see #isPresencePopulation()
	 * @see #setPresencePopulation(boolean)
	 * @generated
	 */
	boolean isSetPresencePopulation();

	/**
	 * Returns the value of the '<em><b>Population Deplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Deplacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Deplacement</em>' attribute.
	 * @see #isSetPopulationDeplacement()
	 * @see #unsetPopulationDeplacement()
	 * @see #setPopulationDeplacement(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeConstatPopulation_PopulationDeplacement()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PopulationDeplacement'"
	 * @generated
	 */
	boolean isPopulationDeplacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatPopulation#isPopulationDeplacement <em>Population Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Deplacement</em>' attribute.
	 * @see #isSetPopulationDeplacement()
	 * @see #unsetPopulationDeplacement()
	 * @see #isPopulationDeplacement()
	 * @generated
	 */
	void setPopulationDeplacement(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConstatPopulation#isPopulationDeplacement <em>Population Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPopulationDeplacement()
	 * @see #isPopulationDeplacement()
	 * @see #setPopulationDeplacement(boolean)
	 * @generated
	 */
	void unsetPopulationDeplacement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConstatPopulation#isPopulationDeplacement <em>Population Deplacement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Population Deplacement</em>' attribute is set.
	 * @see #unsetPopulationDeplacement()
	 * @see #isPopulationDeplacement()
	 * @see #setPopulationDeplacement(boolean)
	 * @generated
	 */
	boolean isSetPopulationDeplacement();

	/**
	 * Returns the value of the '<em><b>Population Regroupee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Population Regroupee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Regroupee</em>' attribute.
	 * @see #isSetPopulationRegroupee()
	 * @see #unsetPopulationRegroupee()
	 * @see #setPopulationRegroupee(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeConstatPopulation_PopulationRegroupee()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PopulationRegroupee'"
	 * @generated
	 */
	boolean isPopulationRegroupee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatPopulation#isPopulationRegroupee <em>Population Regroupee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Regroupee</em>' attribute.
	 * @see #isSetPopulationRegroupee()
	 * @see #unsetPopulationRegroupee()
	 * @see #isPopulationRegroupee()
	 * @generated
	 */
	void setPopulationRegroupee(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConstatPopulation#isPopulationRegroupee <em>Population Regroupee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPopulationRegroupee()
	 * @see #isPopulationRegroupee()
	 * @see #setPopulationRegroupee(boolean)
	 * @generated
	 */
	void unsetPopulationRegroupee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConstatPopulation#isPopulationRegroupee <em>Population Regroupee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Population Regroupee</em>' attribute is set.
	 * @see #unsetPopulationRegroupee()
	 * @see #isPopulationRegroupee()
	 * @see #setPopulationRegroupee(boolean)
	 * @generated
	 */
	boolean isSetPopulationRegroupee();

	/**
	 * Returns the value of the '<em><b>Itineraire Emprunte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itineraire Emprunte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itineraire Emprunte</em>' attribute.
	 * @see #setItineraireEmprunte(String)
	 * @see mpia.schema.SchemaPackage#getTypeConstatPopulation_ItineraireEmprunte()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='ItineraireEmprunte'"
	 * @generated
	 */
	String getItineraireEmprunte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConstatPopulation#getItineraireEmprunte <em>Itineraire Emprunte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itineraire Emprunte</em>' attribute.
	 * @see #getItineraireEmprunte()
	 * @generated
	 */
	void setItineraireEmprunte(String value);

} // TypeConstatPopulation
