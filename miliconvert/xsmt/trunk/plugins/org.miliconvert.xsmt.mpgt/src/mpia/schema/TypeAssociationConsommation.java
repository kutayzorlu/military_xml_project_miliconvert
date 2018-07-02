/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Consommation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationConsommation#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommation#getUniteMesure <em>Unite Mesure</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommation#getAssocieCommeObjetTypeConsommable <em>Associe Comme Objet Type Consommable</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationConsommation#getAssocieCommeSujetTypeEquipement <em>Associe Comme Sujet Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationConsommation' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationConsommation extends EObject {
	/**
	 * Returns the value of the '<em><b>Quantite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #setQuantite(double)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommation_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	double getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommation#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationConsommation#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(double)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationConsommation#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(double)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Unite Mesure</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConditionnementUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite Mesure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite Mesure</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetUniteMesure()
	 * @see #unsetUniteMesure()
	 * @see #setUniteMesure(TypeDictionaryDicoConditionnementUnite)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommation_UniteMesure()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='UniteMesure'"
	 * @generated
	 */
	TypeDictionaryDicoConditionnementUnite getUniteMesure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommation#getUniteMesure <em>Unite Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite Mesure</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetUniteMesure()
	 * @see #unsetUniteMesure()
	 * @see #getUniteMesure()
	 * @generated
	 */
	void setUniteMesure(TypeDictionaryDicoConditionnementUnite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationConsommation#getUniteMesure <em>Unite Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniteMesure()
	 * @see #getUniteMesure()
	 * @see #setUniteMesure(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	void unsetUniteMesure();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationConsommation#getUniteMesure <em>Unite Mesure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unite Mesure</em>' attribute is set.
	 * @see #unsetUniteMesure()
	 * @see #getUniteMesure()
	 * @see #setUniteMesure(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	boolean isSetUniteMesure();

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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Objet Type Consommable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objet Type Consommable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objet Type Consommable</em>' containment reference.
	 * @see #setAssocieCommeObjetTypeConsommable(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommation_AssocieCommeObjetTypeConsommable()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjet_AssociationConsommation' target_entity='type_TypeConsommable'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjet_TypeConsommable'"
	 * @generated
	 */
	TypeAssociationEXT getAssocieCommeObjetTypeConsommable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommation#getAssocieCommeObjetTypeConsommable <em>Associe Comme Objet Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Objet Type Consommable</em>' containment reference.
	 * @see #getAssocieCommeObjetTypeConsommable()
	 * @generated
	 */
	void setAssocieCommeObjetTypeConsommable(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Sujet Type Equipement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Sujet Type Equipement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Sujet Type Equipement</em>' containment reference.
	 * @see #setAssocieCommeSujetTypeEquipement(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationConsommation_AssocieCommeSujetTypeEquipement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstSujet_AssociationConsommation' target_entity='type_TypeEquipement'"
	 *        extendedMetaData="kind='element' name='AssocieCommeSujet_TypeEquipement'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeSujetTypeEquipement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationConsommation#getAssocieCommeSujetTypeEquipement <em>Associe Comme Sujet Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Sujet Type Equipement</em>' containment reference.
	 * @see #getAssocieCommeSujetTypeEquipement()
	 * @generated
	 */
	void setAssocieCommeSujetTypeEquipement(TypeAssociation value);

} // TypeAssociationConsommation
