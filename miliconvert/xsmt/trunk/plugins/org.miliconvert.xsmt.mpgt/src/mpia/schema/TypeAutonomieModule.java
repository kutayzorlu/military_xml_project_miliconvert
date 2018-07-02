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
 * A representation of the model object '<em><b>Type Autonomie Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAutonomieModule#getAutreCapaciteOperationnelle <em>Autre Capacite Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAutonomieModule#getDureeVol <em>Duree Vol</em>}</li>
 *   <li>{@link mpia.schema.TypeAutonomieModule#getQuantiteCarburantRestant <em>Quantite Carburant Restant</em>}</li>
 *   <li>{@link mpia.schema.TypeAutonomieModule#getCapaciteOperationnelle <em>Capacite Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.TypeAutonomieModule#getPotentielHoraireRestant <em>Potentiel Horaire Restant</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAutonomieModule()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AutonomieModule' kind='elementOnly'"
 * @generated
 */
public interface TypeAutonomieModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Autre Capacite Operationnelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Capacite Operationnelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Capacite Operationnelle</em>' attribute.
	 * @see #setAutreCapaciteOperationnelle(String)
	 * @see mpia.schema.SchemaPackage#getTypeAutonomieModule_AutreCapaciteOperationnelle()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='AutreCapaciteOperationnelle'"
	 * @generated
	 */
	String getAutreCapaciteOperationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutonomieModule#getAutreCapaciteOperationnelle <em>Autre Capacite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Capacite Operationnelle</em>' attribute.
	 * @see #getAutreCapaciteOperationnelle()
	 * @generated
	 */
	void setAutreCapaciteOperationnelle(String value);

	/**
	 * Returns the value of the '<em><b>Duree Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Vol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Vol</em>' attribute.
	 * @see #isSetDureeVol()
	 * @see #unsetDureeVol()
	 * @see #setDureeVol(long)
	 * @see mpia.schema.SchemaPackage#getTypeAutonomieModule_DureeVol()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='DureeVol'"
	 * @generated
	 */
	long getDureeVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutonomieModule#getDureeVol <em>Duree Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Vol</em>' attribute.
	 * @see #isSetDureeVol()
	 * @see #unsetDureeVol()
	 * @see #getDureeVol()
	 * @generated
	 */
	void setDureeVol(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutonomieModule#getDureeVol <em>Duree Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDureeVol()
	 * @see #getDureeVol()
	 * @see #setDureeVol(long)
	 * @generated
	 */
	void unsetDureeVol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutonomieModule#getDureeVol <em>Duree Vol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Duree Vol</em>' attribute is set.
	 * @see #unsetDureeVol()
	 * @see #getDureeVol()
	 * @see #setDureeVol(long)
	 * @generated
	 */
	boolean isSetDureeVol();

	/**
	 * Returns the value of the '<em><b>Quantite Carburant Restant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Carburant Restant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Carburant Restant</em>' attribute.
	 * @see #isSetQuantiteCarburantRestant()
	 * @see #unsetQuantiteCarburantRestant()
	 * @see #setQuantiteCarburantRestant(double)
	 * @see mpia.schema.SchemaPackage#getTypeAutonomieModule_QuantiteCarburantRestant()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='QuantiteCarburantRestant'"
	 * @generated
	 */
	double getQuantiteCarburantRestant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutonomieModule#getQuantiteCarburantRestant <em>Quantite Carburant Restant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Carburant Restant</em>' attribute.
	 * @see #isSetQuantiteCarburantRestant()
	 * @see #unsetQuantiteCarburantRestant()
	 * @see #getQuantiteCarburantRestant()
	 * @generated
	 */
	void setQuantiteCarburantRestant(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutonomieModule#getQuantiteCarburantRestant <em>Quantite Carburant Restant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteCarburantRestant()
	 * @see #getQuantiteCarburantRestant()
	 * @see #setQuantiteCarburantRestant(double)
	 * @generated
	 */
	void unsetQuantiteCarburantRestant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutonomieModule#getQuantiteCarburantRestant <em>Quantite Carburant Restant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Carburant Restant</em>' attribute is set.
	 * @see #unsetQuantiteCarburantRestant()
	 * @see #getQuantiteCarburantRestant()
	 * @see #setQuantiteCarburantRestant(double)
	 * @generated
	 */
	boolean isSetQuantiteCarburantRestant();

	/**
	 * Returns the value of the '<em><b>Capacite Operationnelle</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Operationnelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Operationnelle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle
	 * @see #isSetCapaciteOperationnelle()
	 * @see #unsetCapaciteOperationnelle()
	 * @see #setCapaciteOperationnelle(TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle)
	 * @see mpia.schema.SchemaPackage#getTypeAutonomieModule_CapaciteOperationnelle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CapaciteOperationnelle'"
	 * @generated
	 */
	TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle getCapaciteOperationnelle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutonomieModule#getCapaciteOperationnelle <em>Capacite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Operationnelle</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle
	 * @see #isSetCapaciteOperationnelle()
	 * @see #unsetCapaciteOperationnelle()
	 * @see #getCapaciteOperationnelle()
	 * @generated
	 */
	void setCapaciteOperationnelle(TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutonomieModule#getCapaciteOperationnelle <em>Capacite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteOperationnelle()
	 * @see #getCapaciteOperationnelle()
	 * @see #setCapaciteOperationnelle(TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle)
	 * @generated
	 */
	void unsetCapaciteOperationnelle();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutonomieModule#getCapaciteOperationnelle <em>Capacite Operationnelle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Operationnelle</em>' attribute is set.
	 * @see #unsetCapaciteOperationnelle()
	 * @see #getCapaciteOperationnelle()
	 * @see #setCapaciteOperationnelle(TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle)
	 * @generated
	 */
	boolean isSetCapaciteOperationnelle();

	/**
	 * Returns the value of the '<em><b>Potentiel Horaire Restant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Potentiel Horaire Restant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potentiel Horaire Restant</em>' attribute.
	 * @see #isSetPotentielHoraireRestant()
	 * @see #unsetPotentielHoraireRestant()
	 * @see #setPotentielHoraireRestant(double)
	 * @see mpia.schema.SchemaPackage#getTypeAutonomieModule_PotentielHoraireRestant()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='PotentielHoraireRestant'"
	 * @generated
	 */
	double getPotentielHoraireRestant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAutonomieModule#getPotentielHoraireRestant <em>Potentiel Horaire Restant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Potentiel Horaire Restant</em>' attribute.
	 * @see #isSetPotentielHoraireRestant()
	 * @see #unsetPotentielHoraireRestant()
	 * @see #getPotentielHoraireRestant()
	 * @generated
	 */
	void setPotentielHoraireRestant(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAutonomieModule#getPotentielHoraireRestant <em>Potentiel Horaire Restant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPotentielHoraireRestant()
	 * @see #getPotentielHoraireRestant()
	 * @see #setPotentielHoraireRestant(double)
	 * @generated
	 */
	void unsetPotentielHoraireRestant();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAutonomieModule#getPotentielHoraireRestant <em>Potentiel Horaire Restant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Potentiel Horaire Restant</em>' attribute is set.
	 * @see #unsetPotentielHoraireRestant()
	 * @see #getPotentielHoraireRestant()
	 * @see #setPotentielHoraireRestant(double)
	 * @generated
	 */
	boolean isSetPotentielHoraireRestant();

} // TypeAutonomieModule
