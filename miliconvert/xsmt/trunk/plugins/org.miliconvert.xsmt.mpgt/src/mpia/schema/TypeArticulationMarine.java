/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Articulation Marine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeArticulationMarine#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationMarine#getDomaineLutte <em>Domaine Lutte</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationMarine#getEtatMouvement <em>Etat Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationMarine#getAPourBatimentsParticipantsBatiment <em>APour Batiments Participants Batiment</em>}</li>
 *   <li>{@link mpia.schema.TypeArticulationMarine#getAPourCompositionTypeBatimentParticipant <em>APour Composition Type Batiment Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeArticulationMarine()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ArticulationMarine' kind='elementOnly'"
 * @generated
 */
public interface TypeArticulationMarine extends TypeArticulation {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoArticulationMarineCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationMarineCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoArticulationMarineCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationMarine_Categorie()
	 * @model unsettable="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoArticulationMarineCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationMarine#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationMarineCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoArticulationMarineCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationMarine#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoArticulationMarineCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationMarine#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoArticulationMarineCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Domaine Lutte</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoArticulationMarineDomaineLutte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domaine Lutte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domaine Lutte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationMarineDomaineLutte
	 * @see #isSetDomaineLutte()
	 * @see #unsetDomaineLutte()
	 * @see #setDomaineLutte(TypeDictionaryDicoArticulationMarineDomaineLutte)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationMarine_DomaineLutte()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DomaineLutte'"
	 * @generated
	 */
	TypeDictionaryDicoArticulationMarineDomaineLutte getDomaineLutte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationMarine#getDomaineLutte <em>Domaine Lutte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domaine Lutte</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoArticulationMarineDomaineLutte
	 * @see #isSetDomaineLutte()
	 * @see #unsetDomaineLutte()
	 * @see #getDomaineLutte()
	 * @generated
	 */
	void setDomaineLutte(TypeDictionaryDicoArticulationMarineDomaineLutte value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationMarine#getDomaineLutte <em>Domaine Lutte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomaineLutte()
	 * @see #getDomaineLutte()
	 * @see #setDomaineLutte(TypeDictionaryDicoArticulationMarineDomaineLutte)
	 * @generated
	 */
	void unsetDomaineLutte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationMarine#getDomaineLutte <em>Domaine Lutte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Domaine Lutte</em>' attribute is set.
	 * @see #unsetDomaineLutte()
	 * @see #getDomaineLutte()
	 * @see #setDomaineLutte(TypeDictionaryDicoArticulationMarineDomaineLutte)
	 * @generated
	 */
	boolean isSetDomaineLutte();

	/**
	 * Returns the value of the '<em><b>Etat Mouvement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatMouvement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Mouvement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatMouvement
	 * @see #isSetEtatMouvement()
	 * @see #unsetEtatMouvement()
	 * @see #setEtatMouvement(TypeDictionaryDicoEtatMouvement)
	 * @see mpia.schema.SchemaPackage#getTypeArticulationMarine_EtatMouvement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatMouvement'"
	 * @generated
	 */
	TypeDictionaryDicoEtatMouvement getEtatMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeArticulationMarine#getEtatMouvement <em>Etat Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Mouvement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatMouvement
	 * @see #isSetEtatMouvement()
	 * @see #unsetEtatMouvement()
	 * @see #getEtatMouvement()
	 * @generated
	 */
	void setEtatMouvement(TypeDictionaryDicoEtatMouvement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeArticulationMarine#getEtatMouvement <em>Etat Mouvement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatMouvement()
	 * @see #getEtatMouvement()
	 * @see #setEtatMouvement(TypeDictionaryDicoEtatMouvement)
	 * @generated
	 */
	void unsetEtatMouvement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeArticulationMarine#getEtatMouvement <em>Etat Mouvement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Mouvement</em>' attribute is set.
	 * @see #unsetEtatMouvement()
	 * @see #getEtatMouvement()
	 * @see #setEtatMouvement(TypeDictionaryDicoEtatMouvement)
	 * @generated
	 */
	boolean isSetEtatMouvement();

	/**
	 * Returns the value of the '<em><b>APour Batiments Participants Batiment</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Batiments Participants Batiment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Batiments Participants Batiment</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationMarine_APourBatimentsParticipantsBatiment()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourArticulation_ArticulationMarine' target_entity='type_Batiment'"
	 *        extendedMetaData="kind='element' name='APourBatimentsParticipants_Batiment'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourBatimentsParticipantsBatiment();

	/**
	 * Returns the value of the '<em><b>APour Composition Type Batiment Participant</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeTypeBatimentParticipant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Composition Type Batiment Participant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Composition Type Batiment Participant</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeArticulationMarine_APourCompositionTypeBatimentParticipant()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeBatimentParticipant'"
	 *        extendedMetaData="kind='element' name='APourComposition_TypeBatimentParticipant'"
	 * @generated
	 */
	EList<TypeTypeBatimentParticipant> getAPourCompositionTypeBatimentParticipant();

} // TypeArticulationMarine
