/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Effet Tactique Recherche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEffetTactiqueRecherche#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetTactiqueRecherche#getDureeEffet <em>Duree Effet</em>}</li>
 *   <li>{@link mpia.schema.TypeEffetTactiqueRecherche#getConcerneTypeObjectifASS <em>Concerne Type Objectif ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRecherche()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EffetTactiqueRecherche' kind='elementOnly'"
 * @generated
 */
public interface TypeEffetTactiqueRecherche extends EObject {
	/**
	 * Returns the value of the '<em><b>Effet Recherche</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetTactiqueASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueASS
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRecherche_EffetRecherche()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='EffetRecherche'"
	 * @generated
	 */
	TypeDictionaryDicoEffetTactiqueASS getEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetTactiqueRecherche#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueASS
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @generated
	 */
	void setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEffetTactiqueRecherche#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @generated
	 */
	void unsetEffetRecherche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEffetTactiqueRecherche#getEffetRecherche <em>Effet Recherche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Recherche</em>' attribute is set.
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @generated
	 */
	boolean isSetEffetRecherche();

	/**
	 * Returns the value of the '<em><b>Duree Effet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Effet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Effet</em>' containment reference.
	 * @see #setDureeEffet(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRecherche_DureeEffet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeEffet'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeEffet();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetTactiqueRecherche#getDureeEffet <em>Duree Effet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Effet</em>' containment reference.
	 * @see #getDureeEffet()
	 * @generated
	 */
	void setDureeEffet(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Objectif ASS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Objectif ASS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Objectif ASS</em>' containment reference.
	 * @see #setConcerneTypeObjectifASS(TypeTypeObjectifASS)
	 * @see mpia.schema.SchemaPackage#getTypeEffetTactiqueRecherche_ConcerneTypeObjectifASS()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeObjectifASS'"
	 *        extendedMetaData="kind='element' name='Concerne_TypeObjectifASS'"
	 * @generated
	 */
	TypeTypeObjectifASS getConcerneTypeObjectifASS();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEffetTactiqueRecherche#getConcerneTypeObjectifASS <em>Concerne Type Objectif ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Objectif ASS</em>' containment reference.
	 * @see #getConcerneTypeObjectifASS()
	 * @generated
	 */
	void setConcerneTypeObjectifASS(TypeTypeObjectifASS value);

} // TypeEffetTactiqueRecherche
