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
 * A representation of the model object '<em><b>Type Liste Objectifs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeListeObjectifs#getIdentifiantListeObjectifs <em>Identifiant Liste Objectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeListeObjectifs#getTypeListe <em>Type Liste</em>}</li>
 *   <li>{@link mpia.schema.TypeListeObjectifs#getACommeObjectifCiblageObjectifCiblage <em>AComme Objectif Ciblage Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeListeObjectifs()
 * @model abstract="true"
 *        extendedMetaData="name='type_ListeObjectifs' kind='elementOnly'"
 * @generated
 */
public interface TypeListeObjectifs extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Identifiant Liste Objectifs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant Liste Objectifs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant Liste Objectifs</em>' attribute.
	 * @see #setIdentifiantListeObjectifs(String)
	 * @see mpia.schema.SchemaPackage#getTypeListeObjectifs_IdentifiantListeObjectifs()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='IdentifiantListeObjectifs'"
	 * @generated
	 */
	String getIdentifiantListeObjectifs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeObjectifs#getIdentifiantListeObjectifs <em>Identifiant Liste Objectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant Liste Objectifs</em>' attribute.
	 * @see #getIdentifiantListeObjectifs()
	 * @generated
	 */
	void setIdentifiantListeObjectifs(String value);

	/**
	 * Returns the value of the '<em><b>Type Liste</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoListeObjectifsTypeListe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Liste</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Liste</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoListeObjectifsTypeListe
	 * @see #isSetTypeListe()
	 * @see #unsetTypeListe()
	 * @see #setTypeListe(TypeDictionaryDicoListeObjectifsTypeListe)
	 * @see mpia.schema.SchemaPackage#getTypeListeObjectifs_TypeListe()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeListe'"
	 * @generated
	 */
	TypeDictionaryDicoListeObjectifsTypeListe getTypeListe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeListeObjectifs#getTypeListe <em>Type Liste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Liste</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoListeObjectifsTypeListe
	 * @see #isSetTypeListe()
	 * @see #unsetTypeListe()
	 * @see #getTypeListe()
	 * @generated
	 */
	void setTypeListe(TypeDictionaryDicoListeObjectifsTypeListe value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeListeObjectifs#getTypeListe <em>Type Liste</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeListe()
	 * @see #getTypeListe()
	 * @see #setTypeListe(TypeDictionaryDicoListeObjectifsTypeListe)
	 * @generated
	 */
	void unsetTypeListe();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeListeObjectifs#getTypeListe <em>Type Liste</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Liste</em>' attribute is set.
	 * @see #unsetTypeListe()
	 * @see #getTypeListe()
	 * @see #setTypeListe(TypeDictionaryDicoListeObjectifsTypeListe)
	 * @generated
	 */
	boolean isSetTypeListe();

	/**
	 * Returns the value of the '<em><b>AComme Objectif Ciblage Objectif Ciblage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Objectif Ciblage Objectif Ciblage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Objectif Ciblage Objectif Ciblage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeListeObjectifs_ACommeObjectifCiblageObjectifCiblage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeListeObjectifs_ListeObjectifs' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='ACommeObjectifCiblage_ObjectifCiblage'"
	 * @generated
	 */
	EList<TypeAssociation> getACommeObjectifCiblageObjectifCiblage();

} // TypeListeObjectifs
