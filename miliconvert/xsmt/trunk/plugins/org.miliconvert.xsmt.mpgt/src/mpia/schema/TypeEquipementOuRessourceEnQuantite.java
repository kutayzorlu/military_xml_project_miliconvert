/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Equipement Ou Ressource En Quantite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getQuantiteMin <em>Quantite Min</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getQuantiteMax <em>Quantite Max</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getConcerneTypeMaterielTypeMateriel <em>Concerne Type Materiel Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEquipementOuRessourceEnQuantite()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EquipementOuRessourceEnQuantite' kind='elementOnly'"
 * @generated
 */
public interface TypeEquipementOuRessourceEnQuantite extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Min</em>' attribute.
	 * @see #isSetQuantiteMin()
	 * @see #unsetQuantiteMin()
	 * @see #setQuantiteMin(double)
	 * @see mpia.schema.SchemaPackage#getTypeEquipementOuRessourceEnQuantite_QuantiteMin()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal" required="true"
	 *        extendedMetaData="kind='element' name='QuantiteMin'"
	 * @generated
	 */
	double getQuantiteMin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getQuantiteMin <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Min</em>' attribute.
	 * @see #isSetQuantiteMin()
	 * @see #unsetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @generated
	 */
	void setQuantiteMin(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getQuantiteMin <em>Quantite Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @see #setQuantiteMin(double)
	 * @generated
	 */
	void unsetQuantiteMin();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getQuantiteMin <em>Quantite Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Min</em>' attribute is set.
	 * @see #unsetQuantiteMin()
	 * @see #getQuantiteMin()
	 * @see #setQuantiteMin(double)
	 * @generated
	 */
	boolean isSetQuantiteMin();

	/**
	 * Returns the value of the '<em><b>Quantite Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Max</em>' attribute.
	 * @see #isSetQuantiteMax()
	 * @see #unsetQuantiteMax()
	 * @see #setQuantiteMax(double)
	 * @see mpia.schema.SchemaPackage#getTypeEquipementOuRessourceEnQuantite_QuantiteMax()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='QuantiteMax'"
	 * @generated
	 */
	double getQuantiteMax();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getQuantiteMax <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Max</em>' attribute.
	 * @see #isSetQuantiteMax()
	 * @see #unsetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @generated
	 */
	void setQuantiteMax(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getQuantiteMax <em>Quantite Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @see #setQuantiteMax(double)
	 * @generated
	 */
	void unsetQuantiteMax();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getQuantiteMax <em>Quantite Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Max</em>' attribute is set.
	 * @see #unsetQuantiteMax()
	 * @see #getQuantiteMax()
	 * @see #setQuantiteMax(double)
	 * @generated
	 */
	boolean isSetQuantiteMax();

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
	 * @see mpia.schema.SchemaPackage#getTypeEquipementOuRessourceEnQuantite_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeEquipementOuRessourceEnQuantite_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Materiel Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Materiel Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Materiel Type Materiel</em>' containment reference.
	 * @see #setConcerneTypeMaterielTypeMateriel(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeEquipementOuRessourceEnQuantite_ConcerneTypeMaterielTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeMateriel_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeMaterielTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEquipementOuRessourceEnQuantite#getConcerneTypeMaterielTypeMateriel <em>Concerne Type Materiel Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Materiel Type Materiel</em>' containment reference.
	 * @see #getConcerneTypeMaterielTypeMateriel()
	 * @generated
	 */
	void setConcerneTypeMaterielTypeMateriel(TypeAssociationEXT value);

} // TypeEquipementOuRessourceEnQuantite
