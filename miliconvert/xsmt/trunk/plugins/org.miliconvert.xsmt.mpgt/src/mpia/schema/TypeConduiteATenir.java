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
 * A representation of the model object '<em><b>Type Conduite ATenir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeConduiteATenir#getActionSurMateriel <em>Action Sur Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeConduiteATenir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeConduiteATenir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeConduiteATenir#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeConduiteATenir#getConcerneTypePosteMilitaire <em>Concerne Type Poste Militaire</em>}</li>
 *   <li>{@link mpia.schema.TypeConduiteATenir#getACommeAutoritePersonne <em>AComme Autorite Personne</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeConduiteATenir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ConduiteATenir' kind='elementOnly'"
 * @generated
 */
public interface TypeConduiteATenir extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Sur Materiel</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoConduiteATenirActionSurMateriel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Sur Materiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Sur Materiel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConduiteATenirActionSurMateriel
	 * @see #isSetActionSurMateriel()
	 * @see #unsetActionSurMateriel()
	 * @see #setActionSurMateriel(TypeDictionaryDicoConduiteATenirActionSurMateriel)
	 * @see mpia.schema.SchemaPackage#getTypeConduiteATenir_ActionSurMateriel()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ActionSurMateriel'"
	 * @generated
	 */
	TypeDictionaryDicoConduiteATenirActionSurMateriel getActionSurMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConduiteATenir#getActionSurMateriel <em>Action Sur Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Sur Materiel</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoConduiteATenirActionSurMateriel
	 * @see #isSetActionSurMateriel()
	 * @see #unsetActionSurMateriel()
	 * @see #getActionSurMateriel()
	 * @generated
	 */
	void setActionSurMateriel(TypeDictionaryDicoConduiteATenirActionSurMateriel value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeConduiteATenir#getActionSurMateriel <em>Action Sur Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActionSurMateriel()
	 * @see #getActionSurMateriel()
	 * @see #setActionSurMateriel(TypeDictionaryDicoConduiteATenirActionSurMateriel)
	 * @generated
	 */
	void unsetActionSurMateriel();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeConduiteATenir#getActionSurMateriel <em>Action Sur Materiel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Action Sur Materiel</em>' attribute is set.
	 * @see #unsetActionSurMateriel()
	 * @see #getActionSurMateriel()
	 * @see #setActionSurMateriel(TypeDictionaryDicoConduiteATenirActionSurMateriel)
	 * @generated
	 */
	boolean isSetActionSurMateriel();

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
	 * @see mpia.schema.SchemaPackage#getTypeConduiteATenir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConduiteATenir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeConduiteATenir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConduiteATenir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Materiel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Materiel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Materiel</em>' containment reference.
	 * @see #setConcerneTypeMateriel(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeConduiteATenir_ConcerneTypeMateriel()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='Concerne_TypeMateriel'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConduiteATenir#getConcerneTypeMateriel <em>Concerne Type Materiel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Materiel</em>' containment reference.
	 * @see #getConcerneTypeMateriel()
	 * @generated
	 */
	void setConcerneTypeMateriel(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Poste Militaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Poste Militaire</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Poste Militaire</em>' containment reference.
	 * @see #setConcerneTypePosteMilitaire(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeConduiteATenir_ConcerneTypePosteMilitaire()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypePosteMilitaire'"
	 *        extendedMetaData="kind='element' name='Concerne_TypePosteMilitaire'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypePosteMilitaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConduiteATenir#getConcerneTypePosteMilitaire <em>Concerne Type Poste Militaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Poste Militaire</em>' containment reference.
	 * @see #getConcerneTypePosteMilitaire()
	 * @generated
	 */
	void setConcerneTypePosteMilitaire(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Autorite Personne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Autorite Personne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Autorite Personne</em>' containment reference.
	 * @see #setACommeAutoritePersonne(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeConduiteATenir_ACommeAutoritePersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='ACommeAutorite_Personne'"
	 * @generated
	 */
	TypeAssociation getACommeAutoritePersonne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeConduiteATenir#getACommeAutoritePersonne <em>AComme Autorite Personne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Autorite Personne</em>' containment reference.
	 * @see #getACommeAutoritePersonne()
	 * @generated
	 */
	void setACommeAutoritePersonne(TypeAssociation value);

} // TypeConduiteATenir
