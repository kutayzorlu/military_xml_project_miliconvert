/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ligne Livraison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getConditionnement <em>Conditionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getNomConditionnement <em>Nom Conditionnement</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getConditionnementUnite <em>Conditionnement Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getConcerneChargementMateriel <em>Concerne Chargement Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getConcerneTypeMaterielTypeMateriel <em>Concerne Type Materiel Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeLigneLivraison#getDecritLivraison <em>Decrit Livraison</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_LigneLivraison' kind='elementOnly'"
 * @generated
 */
public interface TypeLigneLivraison extends EObject {
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
	 * @see #setQuantite(long)
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_Quantite()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9" required="true"
	 *        extendedMetaData="kind='element' name='Quantite'"
	 * @generated
	 */
	long getQuantite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneLivraison#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite</em>' attribute.
	 * @see #isSetQuantite()
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @generated
	 */
	void setQuantite(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLigneLivraison#getQuantite <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	void unsetQuantite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLigneLivraison#getQuantite <em>Quantite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite</em>' attribute is set.
	 * @see #unsetQuantite()
	 * @see #getQuantite()
	 * @see #setQuantite(long)
	 * @generated
	 */
	boolean isSetQuantite();

	/**
	 * Returns the value of the '<em><b>Conditionnement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCodeConditionnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCodeConditionnement
	 * @see #isSetConditionnement()
	 * @see #unsetConditionnement()
	 * @see #setConditionnement(TypeDictionaryDicoCodeConditionnement)
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_Conditionnement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Conditionnement'"
	 * @generated
	 */
	TypeDictionaryDicoCodeConditionnement getConditionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneLivraison#getConditionnement <em>Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCodeConditionnement
	 * @see #isSetConditionnement()
	 * @see #unsetConditionnement()
	 * @see #getConditionnement()
	 * @generated
	 */
	void setConditionnement(TypeDictionaryDicoCodeConditionnement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLigneLivraison#getConditionnement <em>Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnement()
	 * @see #getConditionnement()
	 * @see #setConditionnement(TypeDictionaryDicoCodeConditionnement)
	 * @generated
	 */
	void unsetConditionnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLigneLivraison#getConditionnement <em>Conditionnement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditionnement</em>' attribute is set.
	 * @see #unsetConditionnement()
	 * @see #getConditionnement()
	 * @see #setConditionnement(TypeDictionaryDicoCodeConditionnement)
	 * @generated
	 */
	boolean isSetConditionnement();

	/**
	 * Returns the value of the '<em><b>Nom Conditionnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Conditionnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Conditionnement</em>' attribute.
	 * @see #setNomConditionnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_NomConditionnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='NomConditionnement'"
	 * @generated
	 */
	String getNomConditionnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneLivraison#getNomConditionnement <em>Nom Conditionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Conditionnement</em>' attribute.
	 * @see #getNomConditionnement()
	 * @generated
	 */
	void setNomConditionnement(String value);

	/**
	 * Returns the value of the '<em><b>Conditionnement Unite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConditionnementUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditionnement Unite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditionnement Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetConditionnementUnite()
	 * @see #unsetConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_ConditionnementUnite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConditionnementUnite'"
	 * @generated
	 */
	TypeDictionaryDicoConditionnementUnite getConditionnementUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneLivraison#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditionnement Unite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConditionnementUnite
	 * @see #isSetConditionnementUnite()
	 * @see #unsetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @generated
	 */
	void setConditionnementUnite(TypeDictionaryDicoConditionnementUnite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLigneLivraison#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	void unsetConditionnementUnite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLigneLivraison#getConditionnementUnite <em>Conditionnement Unite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditionnement Unite</em>' attribute is set.
	 * @see #unsetConditionnementUnite()
	 * @see #getConditionnementUnite()
	 * @see #setConditionnementUnite(TypeDictionaryDicoConditionnementUnite)
	 * @generated
	 */
	boolean isSetConditionnementUnite();

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
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneLivraison#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneLivraison#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Chargement Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Chargement Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Chargement Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_ConcerneChargementMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstPrisEnCharge_LigneLivraison' target_entity='type_ChargementMateriel'"
	 *        extendedMetaData="kind='element' name='Concerne_ChargementMateriel'"
	 * @generated
	 */
	EList<TypeAssociation> getConcerneChargementMateriel();

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
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_ConcerneTypeMaterielTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeMateriel_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeMaterielTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneLivraison#getConcerneTypeMaterielTypeMateriel <em>Concerne Type Materiel Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Materiel Type Materiel</em>' containment reference.
	 * @see #getConcerneTypeMaterielTypeMateriel()
	 * @generated
	 */
	void setConcerneTypeMaterielTypeMateriel(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Decrit Livraison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrit Livraison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrit Livraison</em>' containment reference.
	 * @see #setDecritLivraison(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeLigneLivraison_DecritLivraison()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstDecritPar_LigneLivraison' target_entity='type_Livraison'"
	 *        extendedMetaData="kind='element' name='Decrit_Livraison'"
	 * @generated
	 */
	TypeAssociation getDecritLivraison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLigneLivraison#getDecritLivraison <em>Decrit Livraison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decrit Livraison</em>' containment reference.
	 * @see #getDecritLivraison()
	 * @generated
	 */
	void setDecritLivraison(TypeAssociation value);

} // TypeLigneLivraison
