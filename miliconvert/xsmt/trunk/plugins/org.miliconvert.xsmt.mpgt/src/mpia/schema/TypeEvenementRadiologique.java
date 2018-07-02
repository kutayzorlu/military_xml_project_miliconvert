/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Evenement Radiologique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvenementRadiologique#getPourcentageIsotope <em>Pourcentage Isotope</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvenementRadiologique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_EvenementRadiologique' kind='elementOnly'"
 * @generated
 */
public interface TypeEvenementRadiologique extends TypeEvenementRadioactif {
	/**
	 * Returns the value of the '<em><b>Pourcentage Isotope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Isotope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Isotope</em>' attribute.
	 * @see #isSetPourcentageIsotope()
	 * @see #unsetPourcentageIsotope()
	 * @see #setPourcentageIsotope(double)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementRadiologique_PourcentageIsotope()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='PourcentageIsotope'"
	 * @generated
	 */
	double getPourcentageIsotope();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementRadiologique#getPourcentageIsotope <em>Pourcentage Isotope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Isotope</em>' attribute.
	 * @see #isSetPourcentageIsotope()
	 * @see #unsetPourcentageIsotope()
	 * @see #getPourcentageIsotope()
	 * @generated
	 */
	void setPourcentageIsotope(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementRadiologique#getPourcentageIsotope <em>Pourcentage Isotope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageIsotope()
	 * @see #getPourcentageIsotope()
	 * @see #setPourcentageIsotope(double)
	 * @generated
	 */
	void unsetPourcentageIsotope();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementRadiologique#getPourcentageIsotope <em>Pourcentage Isotope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Isotope</em>' attribute is set.
	 * @see #unsetPourcentageIsotope()
	 * @see #getPourcentageIsotope()
	 * @see #setPourcentageIsotope(double)
	 * @generated
	 */
	boolean isSetPourcentageIsotope();

} // TypeEvenementRadiologique
