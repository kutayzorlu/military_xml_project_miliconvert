/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Action3 Deni</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAction3Deni#getNombreSortiesEn24h <em>Nombre Sorties En24h</em>}</li>
 *   <li>{@link mpia.schema.TypeAction3Deni#getActiviteAerienne <em>Activite Aerienne</em>}</li>
 *   <li>{@link mpia.schema.TypeAction3Deni#getActiviteAerienneNonRepertoriee <em>Activite Aerienne Non Repertoriee</em>}</li>
 *   <li>{@link mpia.schema.TypeAction3Deni#getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI <em>APour Effet Tactique Recherche Par ENI Effet Tactique Recherche Par ENI</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAction3Deni()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Action3Deni' kind='elementOnly'"
 * @generated
 */
public interface TypeAction3Deni extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Sorties En24h</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Sorties En24h</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Sorties En24h</em>' attribute.
	 * @see #isSetNombreSortiesEn24h()
	 * @see #unsetNombreSortiesEn24h()
	 * @see #setNombreSortiesEn24h(long)
	 * @see mpia.schema.SchemaPackage#getTypeAction3Deni_NombreSortiesEn24h()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NombreSortiesEn24h'"
	 * @generated
	 */
	long getNombreSortiesEn24h();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction3Deni#getNombreSortiesEn24h <em>Nombre Sorties En24h</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Sorties En24h</em>' attribute.
	 * @see #isSetNombreSortiesEn24h()
	 * @see #unsetNombreSortiesEn24h()
	 * @see #getNombreSortiesEn24h()
	 * @generated
	 */
	void setNombreSortiesEn24h(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction3Deni#getNombreSortiesEn24h <em>Nombre Sorties En24h</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreSortiesEn24h()
	 * @see #getNombreSortiesEn24h()
	 * @see #setNombreSortiesEn24h(long)
	 * @generated
	 */
	void unsetNombreSortiesEn24h();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction3Deni#getNombreSortiesEn24h <em>Nombre Sorties En24h</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Sorties En24h</em>' attribute is set.
	 * @see #unsetNombreSortiesEn24h()
	 * @see #getNombreSortiesEn24h()
	 * @see #setNombreSortiesEn24h(long)
	 * @generated
	 */
	boolean isSetNombreSortiesEn24h();

	/**
	 * Returns the value of the '<em><b>Activite Aerienne</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAction3DeniActiviteAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Aerienne</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Aerienne</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAction3DeniActiviteAerienne
	 * @see #isSetActiviteAerienne()
	 * @see #unsetActiviteAerienne()
	 * @see #setActiviteAerienne(TypeDictionaryDicoAction3DeniActiviteAerienne)
	 * @see mpia.schema.SchemaPackage#getTypeAction3Deni_ActiviteAerienne()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ActiviteAerienne'"
	 * @generated
	 */
	TypeDictionaryDicoAction3DeniActiviteAerienne getActiviteAerienne();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction3Deni#getActiviteAerienne <em>Activite Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Aerienne</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAction3DeniActiviteAerienne
	 * @see #isSetActiviteAerienne()
	 * @see #unsetActiviteAerienne()
	 * @see #getActiviteAerienne()
	 * @generated
	 */
	void setActiviteAerienne(TypeDictionaryDicoAction3DeniActiviteAerienne value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAction3Deni#getActiviteAerienne <em>Activite Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActiviteAerienne()
	 * @see #getActiviteAerienne()
	 * @see #setActiviteAerienne(TypeDictionaryDicoAction3DeniActiviteAerienne)
	 * @generated
	 */
	void unsetActiviteAerienne();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAction3Deni#getActiviteAerienne <em>Activite Aerienne</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activite Aerienne</em>' attribute is set.
	 * @see #unsetActiviteAerienne()
	 * @see #getActiviteAerienne()
	 * @see #setActiviteAerienne(TypeDictionaryDicoAction3DeniActiviteAerienne)
	 * @generated
	 */
	boolean isSetActiviteAerienne();

	/**
	 * Returns the value of the '<em><b>Activite Aerienne Non Repertoriee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activite Aerienne Non Repertoriee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Aerienne Non Repertoriee</em>' attribute.
	 * @see #setActiviteAerienneNonRepertoriee(String)
	 * @see mpia.schema.SchemaPackage#getTypeAction3Deni_ActiviteAerienneNonRepertoriee()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='ActiviteAerienneNonRepertoriee'"
	 * @generated
	 */
	String getActiviteAerienneNonRepertoriee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAction3Deni#getActiviteAerienneNonRepertoriee <em>Activite Aerienne Non Repertoriee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Aerienne Non Repertoriee</em>' attribute.
	 * @see #getActiviteAerienneNonRepertoriee()
	 * @generated
	 */
	void setActiviteAerienneNonRepertoriee(String value);

	/**
	 * Returns the value of the '<em><b>APour Effet Tactique Recherche Par ENI Effet Tactique Recherche Par ENI</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffetTactiqueRechercheParENI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Effet Tactique Recherche Par ENI Effet Tactique Recherche Par ENI</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Effet Tactique Recherche Par ENI Effet Tactique Recherche Par ENI</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeAction3Deni_APourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EffetTactiqueRechercheParENI'"
	 *        extendedMetaData="kind='element' name='APourEffetTactiqueRechercheParENI_EffetTactiqueRechercheParENI'"
	 * @generated
	 */
	EList<TypeEffetTactiqueRechercheParENI> getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI();

} // TypeAction3Deni
