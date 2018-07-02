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
 * A representation of the model object '<em><b>Type Suivi Demande</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSuiviDemande#getIdentifiantDemande <em>Identifiant Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviDemande#getEtatDemande <em>Etat Demande</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviDemande#getPrioriteRevisee <em>Priorite Revisee</em>}</li>
 *   <li>{@link mpia.schema.TypeSuiviDemande#getCommentaireAbrege <em>Commentaire Abrege</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSuiviDemande()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SuiviDemande' kind='elementOnly'"
 * @generated
 */
public interface TypeSuiviDemande extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiant Demande</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Demande</em>' attribute.
	 * @see #isSetIdentifiantDemande()
	 * @see #unsetIdentifiantDemande()
	 * @see #setIdentifiantDemande(long)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviDemande_IdentifiantDemande()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier15"
	 *        extendedMetaData="kind='element' name='IdentifiantDemande'"
	 * @generated
	 */
	long getIdentifiantDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviDemande#getIdentifiantDemande <em>Identifiant Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Demande</em>' attribute.
	 * @see #isSetIdentifiantDemande()
	 * @see #unsetIdentifiantDemande()
	 * @see #getIdentifiantDemande()
	 * @generated
	 */
	void setIdentifiantDemande(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSuiviDemande#getIdentifiantDemande <em>Identifiant Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentifiantDemande()
	 * @see #getIdentifiantDemande()
	 * @see #setIdentifiantDemande(long)
	 * @generated
	 */
	void unsetIdentifiantDemande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSuiviDemande#getIdentifiantDemande <em>Identifiant Demande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identifiant Demande</em>' attribute is set.
	 * @see #unsetIdentifiantDemande()
	 * @see #getIdentifiantDemande()
	 * @see #setIdentifiantDemande(long)
	 * @generated
	 */
	boolean isSetIdentifiantDemande();

	/**
	 * Returns the value of the '<em><b>Etat Demande</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSuiviDemandeEtatDemande}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Demande</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Demande</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuiviDemandeEtatDemande
	 * @see #isSetEtatDemande()
	 * @see #unsetEtatDemande()
	 * @see #setEtatDemande(TypeDictionaryDicoSuiviDemandeEtatDemande)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviDemande_EtatDemande()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EtatDemande'"
	 * @generated
	 */
	TypeDictionaryDicoSuiviDemandeEtatDemande getEtatDemande();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviDemande#getEtatDemande <em>Etat Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Demande</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuiviDemandeEtatDemande
	 * @see #isSetEtatDemande()
	 * @see #unsetEtatDemande()
	 * @see #getEtatDemande()
	 * @generated
	 */
	void setEtatDemande(TypeDictionaryDicoSuiviDemandeEtatDemande value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSuiviDemande#getEtatDemande <em>Etat Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEtatDemande()
	 * @see #getEtatDemande()
	 * @see #setEtatDemande(TypeDictionaryDicoSuiviDemandeEtatDemande)
	 * @generated
	 */
	void unsetEtatDemande();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSuiviDemande#getEtatDemande <em>Etat Demande</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Etat Demande</em>' attribute is set.
	 * @see #unsetEtatDemande()
	 * @see #getEtatDemande()
	 * @see #setEtatDemande(TypeDictionaryDicoSuiviDemandeEtatDemande)
	 * @generated
	 */
	boolean isSetEtatDemande();

	/**
	 * Returns the value of the '<em><b>Priorite Revisee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSuiviDemandePrioriteRevisee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Revisee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Revisee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuiviDemandePrioriteRevisee
	 * @see #isSetPrioriteRevisee()
	 * @see #unsetPrioriteRevisee()
	 * @see #setPrioriteRevisee(TypeDictionaryDicoSuiviDemandePrioriteRevisee)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviDemande_PrioriteRevisee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrioriteRevisee'"
	 * @generated
	 */
	TypeDictionaryDicoSuiviDemandePrioriteRevisee getPrioriteRevisee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviDemande#getPrioriteRevisee <em>Priorite Revisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite Revisee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuiviDemandePrioriteRevisee
	 * @see #isSetPrioriteRevisee()
	 * @see #unsetPrioriteRevisee()
	 * @see #getPrioriteRevisee()
	 * @generated
	 */
	void setPrioriteRevisee(TypeDictionaryDicoSuiviDemandePrioriteRevisee value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSuiviDemande#getPrioriteRevisee <em>Priorite Revisee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrioriteRevisee()
	 * @see #getPrioriteRevisee()
	 * @see #setPrioriteRevisee(TypeDictionaryDicoSuiviDemandePrioriteRevisee)
	 * @generated
	 */
	void unsetPrioriteRevisee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSuiviDemande#getPrioriteRevisee <em>Priorite Revisee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite Revisee</em>' attribute is set.
	 * @see #unsetPrioriteRevisee()
	 * @see #getPrioriteRevisee()
	 * @see #setPrioriteRevisee(TypeDictionaryDicoSuiviDemandePrioriteRevisee)
	 * @generated
	 */
	boolean isSetPrioriteRevisee();

	/**
	 * Returns the value of the '<em><b>Commentaire Abrege</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire Abrege</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire Abrege</em>' attribute.
	 * @see #setCommentaireAbrege(String)
	 * @see mpia.schema.SchemaPackage#getTypeSuiviDemande_CommentaireAbrege()
	 * @model dataType="mpia.meta.TypeDataTypeChaine08"
	 *        extendedMetaData="kind='element' name='CommentaireAbrege'"
	 * @generated
	 */
	String getCommentaireAbrege();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSuiviDemande#getCommentaireAbrege <em>Commentaire Abrege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire Abrege</em>' attribute.
	 * @see #getCommentaireAbrege()
	 * @generated
	 */
	void setCommentaireAbrege(String value);

} // TypeSuiviDemande
