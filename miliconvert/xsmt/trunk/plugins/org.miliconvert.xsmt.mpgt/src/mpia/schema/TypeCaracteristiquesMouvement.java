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
 * A representation of the model object '<em><b>Type Caracteristiques Mouvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCaracteristiquesMouvement#getClasse <em>Classe</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesMouvement#getChargeParEssieu <em>Charge Par Essieu</em>}</li>
 *   <li>{@link mpia.schema.TypeCaracteristiquesMouvement#getRayonBraquageMax <em>Rayon Braquage Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesMouvement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_CaracteristiquesMouvement' kind='elementOnly'"
 * @generated
 */
public interface TypeCaracteristiquesMouvement extends EObject {
	/**
	 * Returns the value of the '<em><b>Classe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classe</em>' attribute.
	 * @see #isSetClasse()
	 * @see #unsetClasse()
	 * @see #setClasse(long)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesMouvement_Classe()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='Classe'"
	 * @generated
	 */
	long getClasse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getClasse <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classe</em>' attribute.
	 * @see #isSetClasse()
	 * @see #unsetClasse()
	 * @see #getClasse()
	 * @generated
	 */
	void setClasse(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getClasse <em>Classe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClasse()
	 * @see #getClasse()
	 * @see #setClasse(long)
	 * @generated
	 */
	void unsetClasse();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getClasse <em>Classe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Classe</em>' attribute is set.
	 * @see #unsetClasse()
	 * @see #getClasse()
	 * @see #setClasse(long)
	 * @generated
	 */
	boolean isSetClasse();

	/**
	 * Returns the value of the '<em><b>Charge Par Essieu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charge Par Essieu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Par Essieu</em>' attribute.
	 * @see #isSetChargeParEssieu()
	 * @see #unsetChargeParEssieu()
	 * @see #setChargeParEssieu(double)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesMouvement_ChargeParEssieu()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='ChargeParEssieu'"
	 * @generated
	 */
	double getChargeParEssieu();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getChargeParEssieu <em>Charge Par Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Par Essieu</em>' attribute.
	 * @see #isSetChargeParEssieu()
	 * @see #unsetChargeParEssieu()
	 * @see #getChargeParEssieu()
	 * @generated
	 */
	void setChargeParEssieu(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getChargeParEssieu <em>Charge Par Essieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChargeParEssieu()
	 * @see #getChargeParEssieu()
	 * @see #setChargeParEssieu(double)
	 * @generated
	 */
	void unsetChargeParEssieu();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getChargeParEssieu <em>Charge Par Essieu</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Charge Par Essieu</em>' attribute is set.
	 * @see #unsetChargeParEssieu()
	 * @see #getChargeParEssieu()
	 * @see #setChargeParEssieu(double)
	 * @generated
	 */
	boolean isSetChargeParEssieu();

	/**
	 * Returns the value of the '<em><b>Rayon Braquage Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Braquage Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Braquage Max</em>' attribute.
	 * @see #isSetRayonBraquageMax()
	 * @see #unsetRayonBraquageMax()
	 * @see #setRayonBraquageMax(double)
	 * @see mpia.schema.SchemaPackage#getTypeCaracteristiquesMouvement_RayonBraquageMax()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='RayonBraquageMax'"
	 * @generated
	 */
	double getRayonBraquageMax();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getRayonBraquageMax <em>Rayon Braquage Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Braquage Max</em>' attribute.
	 * @see #isSetRayonBraquageMax()
	 * @see #unsetRayonBraquageMax()
	 * @see #getRayonBraquageMax()
	 * @generated
	 */
	void setRayonBraquageMax(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getRayonBraquageMax <em>Rayon Braquage Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRayonBraquageMax()
	 * @see #getRayonBraquageMax()
	 * @see #setRayonBraquageMax(double)
	 * @generated
	 */
	void unsetRayonBraquageMax();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCaracteristiquesMouvement#getRayonBraquageMax <em>Rayon Braquage Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rayon Braquage Max</em>' attribute is set.
	 * @see #unsetRayonBraquageMax()
	 * @see #getRayonBraquageMax()
	 * @see #setRayonBraquageMax(double)
	 * @generated
	 */
	boolean isSetRayonBraquageMax();

} // TypeCaracteristiquesMouvement
