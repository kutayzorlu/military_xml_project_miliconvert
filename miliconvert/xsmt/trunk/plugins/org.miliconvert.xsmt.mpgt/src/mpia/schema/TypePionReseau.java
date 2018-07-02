/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDebitTransmission;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Pion Reseau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePionReseau#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getNatureStationCommutateur <em>Nature Station Commutateur</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getNature <em>Nature</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getDebit <em>Debit</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getValeurDebit <em>Valeur Debit</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getHauteurAntenne <em>Hauteur Antenne</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getEstEsclaveJonctionReseau <em>Est Esclave Jonction Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getEstMaitreJonctionReseau <em>Est Maitre Jonction Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getEstEsclaveLiaisonReseau <em>Est Esclave Liaison Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypePionReseau#getEstMaitreLiaisonReseau <em>Est Maitre Liaison Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePionReseau()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_PionReseau' kind='elementOnly'"
 * @generated
 */
public interface TypePionReseau extends TypeSite {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPionReseauCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPionReseauCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPionReseauCategorie)
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoPionReseauCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePionReseau#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPionReseauCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoPionReseauCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePionReseau#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPionReseauCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePionReseau#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoPionReseauCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Nature Station Commutateur</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPionReseauNatureStationCommutateur}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Station Commutateur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Station Commutateur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPionReseauNatureStationCommutateur
	 * @see #isSetNatureStationCommutateur()
	 * @see #unsetNatureStationCommutateur()
	 * @see #setNatureStationCommutateur(TypeDictionaryDicoPionReseauNatureStationCommutateur)
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_NatureStationCommutateur()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NatureStationCommutateur'"
	 * @generated
	 */
	TypeDictionaryDicoPionReseauNatureStationCommutateur getNatureStationCommutateur();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePionReseau#getNatureStationCommutateur <em>Nature Station Commutateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Station Commutateur</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPionReseauNatureStationCommutateur
	 * @see #isSetNatureStationCommutateur()
	 * @see #unsetNatureStationCommutateur()
	 * @see #getNatureStationCommutateur()
	 * @generated
	 */
	void setNatureStationCommutateur(TypeDictionaryDicoPionReseauNatureStationCommutateur value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePionReseau#getNatureStationCommutateur <em>Nature Station Commutateur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNatureStationCommutateur()
	 * @see #getNatureStationCommutateur()
	 * @see #setNatureStationCommutateur(TypeDictionaryDicoPionReseauNatureStationCommutateur)
	 * @generated
	 */
	void unsetNatureStationCommutateur();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePionReseau#getNatureStationCommutateur <em>Nature Station Commutateur</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Station Commutateur</em>' attribute is set.
	 * @see #unsetNatureStationCommutateur()
	 * @see #getNatureStationCommutateur()
	 * @see #setNatureStationCommutateur(TypeDictionaryDicoPionReseauNatureStationCommutateur)
	 * @generated
	 */
	boolean isSetNatureStationCommutateur();

	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPionReseauNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPionReseauNature
	 * @see #isSetNature()
	 * @see #unsetNature()
	 * @see #setNature(TypeDictionaryDicoPionReseauNature)
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_Nature()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Nature'"
	 * @generated
	 */
	TypeDictionaryDicoPionReseauNature getNature();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePionReseau#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPionReseauNature
	 * @see #isSetNature()
	 * @see #unsetNature()
	 * @see #getNature()
	 * @generated
	 */
	void setNature(TypeDictionaryDicoPionReseauNature value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePionReseau#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNature()
	 * @see #getNature()
	 * @see #setNature(TypeDictionaryDicoPionReseauNature)
	 * @generated
	 */
	void unsetNature();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePionReseau#getNature <em>Nature</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature</em>' attribute is set.
	 * @see #unsetNature()
	 * @see #getNature()
	 * @see #setNature(TypeDictionaryDicoPionReseauNature)
	 * @generated
	 */
	boolean isSetNature();

	/**
	 * Returns the value of the '<em><b>Debit</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPionReseauDebit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPionReseauDebit
	 * @see #isSetDebit()
	 * @see #unsetDebit()
	 * @see #setDebit(TypeDictionaryDicoPionReseauDebit)
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_Debit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Debit'"
	 * @generated
	 */
	TypeDictionaryDicoPionReseauDebit getDebit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePionReseau#getDebit <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPionReseauDebit
	 * @see #isSetDebit()
	 * @see #unsetDebit()
	 * @see #getDebit()
	 * @generated
	 */
	void setDebit(TypeDictionaryDicoPionReseauDebit value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePionReseau#getDebit <em>Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDebit()
	 * @see #getDebit()
	 * @see #setDebit(TypeDictionaryDicoPionReseauDebit)
	 * @generated
	 */
	void unsetDebit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePionReseau#getDebit <em>Debit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Debit</em>' attribute is set.
	 * @see #unsetDebit()
	 * @see #getDebit()
	 * @see #setDebit(TypeDictionaryDicoPionReseauDebit)
	 * @generated
	 */
	boolean isSetDebit();

	/**
	 * Returns the value of the '<em><b>Valeur Debit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valeur Debit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valeur Debit</em>' containment reference.
	 * @see #setValeurDebit(TypeDataTypeDebitTransmission)
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_ValeurDebit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValeurDebit'"
	 * @generated
	 */
	TypeDataTypeDebitTransmission getValeurDebit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePionReseau#getValeurDebit <em>Valeur Debit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valeur Debit</em>' containment reference.
	 * @see #getValeurDebit()
	 * @generated
	 */
	void setValeurDebit(TypeDataTypeDebitTransmission value);

	/**
	 * Returns the value of the '<em><b>Hauteur Antenne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hauteur Antenne</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hauteur Antenne</em>' containment reference.
	 * @see #setHauteurAntenne(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_HauteurAntenne()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HauteurAntenne'"
	 * @generated
	 */
	TypeDataTypeLongueur getHauteurAntenne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePionReseau#getHauteurAntenne <em>Hauteur Antenne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauteur Antenne</em>' containment reference.
	 * @see #getHauteurAntenne()
	 * @generated
	 */
	void setHauteurAntenne(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Est Esclave Jonction Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Esclave Jonction Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Esclave Jonction Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_EstEsclaveJonctionReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourExtremiteEsclave_PionReseau' target_entity='type_JonctionReseau'"
	 *        extendedMetaData="kind='element' name='EstEsclave_JonctionReseau'"
	 * @generated
	 */
	EList<TypeAssociation> getEstEsclaveJonctionReseau();

	/**
	 * Returns the value of the '<em><b>Est Maitre Jonction Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Maitre Jonction Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Maitre Jonction Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_EstMaitreJonctionReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourExtremiteMaitre_PionReseau' target_entity='type_JonctionReseau'"
	 *        extendedMetaData="kind='element' name='EstMaitre_JonctionReseau'"
	 * @generated
	 */
	EList<TypeAssociation> getEstMaitreJonctionReseau();

	/**
	 * Returns the value of the '<em><b>Est Esclave Liaison Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Esclave Liaison Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Esclave Liaison Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_EstEsclaveLiaisonReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourExtremiteEsclave_PionReseau' target_entity='type_LiaisonReseau'"
	 *        extendedMetaData="kind='element' name='EstEsclave_LiaisonReseau'"
	 * @generated
	 */
	EList<TypeAssociation> getEstEsclaveLiaisonReseau();

	/**
	 * Returns the value of the '<em><b>Est Maitre Liaison Reseau</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Maitre Liaison Reseau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Maitre Liaison Reseau</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypePionReseau_EstMaitreLiaisonReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourExtremiteMaitre_PionReseau' target_entity='type_LiaisonReseau'"
	 *        extendedMetaData="kind='element' name='EstMaitre_LiaisonReseau'"
	 * @generated
	 */
	EList<TypeAssociation> getEstMaitreLiaisonReseau();

} // TypePionReseau
