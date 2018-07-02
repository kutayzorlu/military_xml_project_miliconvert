/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Recherche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneRecherche#getNumero <em>Numero</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneRecherche#getVersion <em>Version</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneRecherche#getPrioriteZone <em>Priorite Zone</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneRecherche#getDebutRecherche <em>Debut Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneRecherche#getFinRecherche <em>Fin Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneRecherche#getFaitObjetAction <em>Fait Objet Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneRecherche()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ZoneRecherche' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneRecherche extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Numero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero</em>' attribute.
	 * @see #setNumero(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneRecherche_Numero()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Numero'"
	 * @generated
	 */
	String getNumero();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneRecherche#getNumero <em>Numero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero</em>' attribute.
	 * @see #getNumero()
	 * @generated
	 */
	void setNumero(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneRecherche_Version()
	 * @model dataType="mpia.meta.TypeDataTypeChaine06"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneRecherche#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Priorite Zone</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoImportance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priorite Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priorite Zone</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoImportance
	 * @see #isSetPrioriteZone()
	 * @see #unsetPrioriteZone()
	 * @see #setPrioriteZone(TypeDictionaryDicoImportance)
	 * @see mpia.schema.SchemaPackage#getTypeZoneRecherche_PrioriteZone()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrioriteZone'"
	 * @generated
	 */
	TypeDictionaryDicoImportance getPrioriteZone();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneRecherche#getPrioriteZone <em>Priorite Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priorite Zone</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoImportance
	 * @see #isSetPrioriteZone()
	 * @see #unsetPrioriteZone()
	 * @see #getPrioriteZone()
	 * @generated
	 */
	void setPrioriteZone(TypeDictionaryDicoImportance value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneRecherche#getPrioriteZone <em>Priorite Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrioriteZone()
	 * @see #getPrioriteZone()
	 * @see #setPrioriteZone(TypeDictionaryDicoImportance)
	 * @generated
	 */
	void unsetPrioriteZone();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneRecherche#getPrioriteZone <em>Priorite Zone</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Priorite Zone</em>' attribute is set.
	 * @see #unsetPrioriteZone()
	 * @see #getPrioriteZone()
	 * @see #setPrioriteZone(TypeDictionaryDicoImportance)
	 * @generated
	 */
	boolean isSetPrioriteZone();

	/**
	 * Returns the value of the '<em><b>Debut Recherche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Recherche</em>' attribute.
	 * @see #setDebutRecherche(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeZoneRecherche_DebutRecherche()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutRecherche'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneRecherche#getDebutRecherche <em>Debut Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Recherche</em>' attribute.
	 * @see #getDebutRecherche()
	 * @generated
	 */
	void setDebutRecherche(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Recherche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Recherche</em>' attribute.
	 * @see #setFinRecherche(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeZoneRecherche_FinRecherche()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinRecherche'"
	 * @generated
	 */
	XMLGregorianCalendar getFinRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneRecherche#getFinRecherche <em>Fin Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Recherche</em>' attribute.
	 * @see #getFinRecherche()
	 * @generated
	 */
	void setFinRecherche(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fait Objet Action</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fait Objet Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fait Objet Action</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeZoneRecherche_FaitObjetAction()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='APourZoneRecherche_ZoneRecherche' target_entity='type_Action'"
	 *        extendedMetaData="kind='element' name='FaitObjet_Action'"
	 * @generated
	 */
	EList<TypeAssociation> getFaitObjetAction();

} // TypeZoneRecherche
