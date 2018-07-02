/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeVolume;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Chargement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeChargement#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}</li>
 *   <li>{@link mpia.schema.TypeChargement#getQuantiteCarburantPrevue <em>Quantite Carburant Prevue</em>}</li>
 *   <li>{@link mpia.schema.TypeChargement#getNombrePersonnesDebarquees <em>Nombre Personnes Debarquees</em>}</li>
 *   <li>{@link mpia.schema.TypeChargement#getQuantiteMaterielEmbarque <em>Quantite Materiel Embarque</em>}</li>
 *   <li>{@link mpia.schema.TypeChargement#getQuantiteMaterielDebarque <em>Quantite Materiel Debarque</em>}</li>
 *   <li>{@link mpia.schema.TypeChargement#getAPourRessourceDechargeeDotationEffectiveConsommable <em>APour Ressource Dechargee Dotation Effective Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypeChargement#getAPourRessourceChargeeDotationEffectiveConsommable <em>APour Ressource Chargee Dotation Effective Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeChargement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Chargement' kind='elementOnly'"
 * @generated
 */
public interface TypeChargement extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Personnes Embarquees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Personnes Embarquees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Personnes Embarquees</em>' attribute.
	 * @see #isSetNombrePersonnesEmbarquees()
	 * @see #unsetNombrePersonnesEmbarquees()
	 * @see #setNombrePersonnesEmbarquees(long)
	 * @see mpia.schema.SchemaPackage#getTypeChargement_NombrePersonnesEmbarquees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NombrePersonnesEmbarquees'"
	 * @generated
	 */
	long getNombrePersonnesEmbarquees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChargement#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Personnes Embarquees</em>' attribute.
	 * @see #isSetNombrePersonnesEmbarquees()
	 * @see #unsetNombrePersonnesEmbarquees()
	 * @see #getNombrePersonnesEmbarquees()
	 * @generated
	 */
	void setNombrePersonnesEmbarquees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChargement#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePersonnesEmbarquees()
	 * @see #getNombrePersonnesEmbarquees()
	 * @see #setNombrePersonnesEmbarquees(long)
	 * @generated
	 */
	void unsetNombrePersonnesEmbarquees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChargement#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Personnes Embarquees</em>' attribute is set.
	 * @see #unsetNombrePersonnesEmbarquees()
	 * @see #getNombrePersonnesEmbarquees()
	 * @see #setNombrePersonnesEmbarquees(long)
	 * @generated
	 */
	boolean isSetNombrePersonnesEmbarquees();

	/**
	 * Returns the value of the '<em><b>Quantite Carburant Prevue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Carburant Prevue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Carburant Prevue</em>' containment reference.
	 * @see #setQuantiteCarburantPrevue(TypeDataTypeVolume)
	 * @see mpia.schema.SchemaPackage#getTypeChargement_QuantiteCarburantPrevue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteCarburantPrevue'"
	 * @generated
	 */
	TypeDataTypeVolume getQuantiteCarburantPrevue();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChargement#getQuantiteCarburantPrevue <em>Quantite Carburant Prevue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Carburant Prevue</em>' containment reference.
	 * @see #getQuantiteCarburantPrevue()
	 * @generated
	 */
	void setQuantiteCarburantPrevue(TypeDataTypeVolume value);

	/**
	 * Returns the value of the '<em><b>Nombre Personnes Debarquees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Personnes Debarquees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Personnes Debarquees</em>' attribute.
	 * @see #isSetNombrePersonnesDebarquees()
	 * @see #unsetNombrePersonnesDebarquees()
	 * @see #setNombrePersonnesDebarquees(long)
	 * @see mpia.schema.SchemaPackage#getTypeChargement_NombrePersonnesDebarquees()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NombrePersonnesDebarquees'"
	 * @generated
	 */
	long getNombrePersonnesDebarquees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChargement#getNombrePersonnesDebarquees <em>Nombre Personnes Debarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Personnes Debarquees</em>' attribute.
	 * @see #isSetNombrePersonnesDebarquees()
	 * @see #unsetNombrePersonnesDebarquees()
	 * @see #getNombrePersonnesDebarquees()
	 * @generated
	 */
	void setNombrePersonnesDebarquees(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChargement#getNombrePersonnesDebarquees <em>Nombre Personnes Debarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePersonnesDebarquees()
	 * @see #getNombrePersonnesDebarquees()
	 * @see #setNombrePersonnesDebarquees(long)
	 * @generated
	 */
	void unsetNombrePersonnesDebarquees();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChargement#getNombrePersonnesDebarquees <em>Nombre Personnes Debarquees</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Personnes Debarquees</em>' attribute is set.
	 * @see #unsetNombrePersonnesDebarquees()
	 * @see #getNombrePersonnesDebarquees()
	 * @see #setNombrePersonnesDebarquees(long)
	 * @generated
	 */
	boolean isSetNombrePersonnesDebarquees();

	/**
	 * Returns the value of the '<em><b>Quantite Materiel Embarque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Materiel Embarque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Materiel Embarque</em>' attribute.
	 * @see #isSetQuantiteMaterielEmbarque()
	 * @see #unsetQuantiteMaterielEmbarque()
	 * @see #setQuantiteMaterielEmbarque(long)
	 * @see mpia.schema.SchemaPackage#getTypeChargement_QuantiteMaterielEmbarque()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteMaterielEmbarque'"
	 * @generated
	 */
	long getQuantiteMaterielEmbarque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChargement#getQuantiteMaterielEmbarque <em>Quantite Materiel Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Materiel Embarque</em>' attribute.
	 * @see #isSetQuantiteMaterielEmbarque()
	 * @see #unsetQuantiteMaterielEmbarque()
	 * @see #getQuantiteMaterielEmbarque()
	 * @generated
	 */
	void setQuantiteMaterielEmbarque(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChargement#getQuantiteMaterielEmbarque <em>Quantite Materiel Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMaterielEmbarque()
	 * @see #getQuantiteMaterielEmbarque()
	 * @see #setQuantiteMaterielEmbarque(long)
	 * @generated
	 */
	void unsetQuantiteMaterielEmbarque();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChargement#getQuantiteMaterielEmbarque <em>Quantite Materiel Embarque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Materiel Embarque</em>' attribute is set.
	 * @see #unsetQuantiteMaterielEmbarque()
	 * @see #getQuantiteMaterielEmbarque()
	 * @see #setQuantiteMaterielEmbarque(long)
	 * @generated
	 */
	boolean isSetQuantiteMaterielEmbarque();

	/**
	 * Returns the value of the '<em><b>Quantite Materiel Debarque</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Materiel Debarque</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Materiel Debarque</em>' attribute.
	 * @see #isSetQuantiteMaterielDebarque()
	 * @see #unsetQuantiteMaterielDebarque()
	 * @see #setQuantiteMaterielDebarque(long)
	 * @see mpia.schema.SchemaPackage#getTypeChargement_QuantiteMaterielDebarque()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteMaterielDebarque'"
	 * @generated
	 */
	long getQuantiteMaterielDebarque();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeChargement#getQuantiteMaterielDebarque <em>Quantite Materiel Debarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Materiel Debarque</em>' attribute.
	 * @see #isSetQuantiteMaterielDebarque()
	 * @see #unsetQuantiteMaterielDebarque()
	 * @see #getQuantiteMaterielDebarque()
	 * @generated
	 */
	void setQuantiteMaterielDebarque(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeChargement#getQuantiteMaterielDebarque <em>Quantite Materiel Debarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMaterielDebarque()
	 * @see #getQuantiteMaterielDebarque()
	 * @see #setQuantiteMaterielDebarque(long)
	 * @generated
	 */
	void unsetQuantiteMaterielDebarque();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeChargement#getQuantiteMaterielDebarque <em>Quantite Materiel Debarque</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Materiel Debarque</em>' attribute is set.
	 * @see #unsetQuantiteMaterielDebarque()
	 * @see #getQuantiteMaterielDebarque()
	 * @see #setQuantiteMaterielDebarque(long)
	 * @generated
	 */
	boolean isSetQuantiteMaterielDebarque();

	/**
	 * Returns the value of the '<em><b>APour Ressource Dechargee Dotation Effective Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDotationEffectiveConsommable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Ressource Dechargee Dotation Effective Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Ressource Dechargee Dotation Effective Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeChargement_APourRessourceDechargeeDotationEffectiveConsommable()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DotationEffectiveConsommable'"
	 *        extendedMetaData="kind='element' name='APourRessourceDechargee_DotationEffectiveConsommable'"
	 * @generated
	 */
	EList<TypeDotationEffectiveConsommable> getAPourRessourceDechargeeDotationEffectiveConsommable();

	/**
	 * Returns the value of the '<em><b>APour Ressource Chargee Dotation Effective Consommable</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDotationEffectiveConsommable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Ressource Chargee Dotation Effective Consommable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Ressource Chargee Dotation Effective Consommable</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeChargement_APourRessourceChargeeDotationEffectiveConsommable()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DotationEffectiveConsommable'"
	 *        extendedMetaData="kind='element' name='APourRessourceChargee_DotationEffectiveConsommable'"
	 * @generated
	 */
	EList<TypeDotationEffectiveConsommable> getAPourRessourceChargeeDotationEffectiveConsommable();

} // TypeChargement
