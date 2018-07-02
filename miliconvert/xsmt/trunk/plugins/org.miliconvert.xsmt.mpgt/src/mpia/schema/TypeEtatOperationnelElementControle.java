/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Etat Operationnel Element Controle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementControle#getActivation <em>Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementControle#getGDHdebutActivation <em>GD Hdebut Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementControle#getGDHFinActivation <em>GDH Fin Activation</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementControle#getSecurite <em>Securite</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementControle#getNiveauMenaceNRBC <em>Niveau Menace NRBC</em>}</li>
 *   <li>{@link mpia.schema.TypeEtatOperationnelElementControle#getStatutInvestigation <em>Statut Investigation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementControle()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EtatOperationnelElementControle' kind='elementOnly'"
 * @generated
 */
public interface TypeEtatOperationnelElementControle extends TypeEtatOperationnel {
	/**
	 * Returns the value of the '<em><b>Activation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoActivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivation
	 * @see #isSetActivation()
	 * @see #unsetActivation()
	 * @see #setActivation(TypeDictionaryDicoActivation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementControle_Activation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Activation'"
	 * @generated
	 */
	TypeDictionaryDicoActivation getActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoActivation
	 * @see #isSetActivation()
	 * @see #unsetActivation()
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(TypeDictionaryDicoActivation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getActivation <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActivation()
	 * @see #getActivation()
	 * @see #setActivation(TypeDictionaryDicoActivation)
	 * @generated
	 */
	void unsetActivation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getActivation <em>Activation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Activation</em>' attribute is set.
	 * @see #unsetActivation()
	 * @see #getActivation()
	 * @see #setActivation(TypeDictionaryDicoActivation)
	 * @generated
	 */
	boolean isSetActivation();

	/**
	 * Returns the value of the '<em><b>GD Hdebut Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hdebut Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hdebut Activation</em>' attribute.
	 * @see #setGDHdebutActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementControle_GDHdebutActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHdebutActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHdebutActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getGDHdebutActivation <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hdebut Activation</em>' attribute.
	 * @see #getGDHdebutActivation()
	 * @generated
	 */
	void setGDHdebutActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>GDH Fin Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GDH Fin Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GDH Fin Activation</em>' attribute.
	 * @see #setGDHFinActivation(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementControle_GDHFinActivation()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHFinActivation'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHFinActivation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getGDHFinActivation <em>GDH Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GDH Fin Activation</em>' attribute.
	 * @see #getGDHFinActivation()
	 * @generated
	 */
	void setGDHFinActivation(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Securite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleSecurite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleSecurite
	 * @see #isSetSecurite()
	 * @see #unsetSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelElementControleSecurite)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementControle_Securite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Securite'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelElementControleSecurite getSecurite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getSecurite <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Securite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleSecurite
	 * @see #isSetSecurite()
	 * @see #unsetSecurite()
	 * @see #getSecurite()
	 * @generated
	 */
	void setSecurite(TypeDictionaryDicoEtatOperationnelElementControleSecurite value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getSecurite <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSecurite()
	 * @see #getSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelElementControleSecurite)
	 * @generated
	 */
	void unsetSecurite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getSecurite <em>Securite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Securite</em>' attribute is set.
	 * @see #unsetSecurite()
	 * @see #getSecurite()
	 * @see #setSecurite(TypeDictionaryDicoEtatOperationnelElementControleSecurite)
	 * @generated
	 */
	boolean isSetSecurite();

	/**
	 * Returns the value of the '<em><b>Niveau Menace NRBC</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau Menace NRBC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau Menace NRBC</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC
	 * @see #isSetNiveauMenaceNRBC()
	 * @see #unsetNiveauMenaceNRBC()
	 * @see #setNiveauMenaceNRBC(TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementControle_NiveauMenaceNRBC()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NiveauMenaceNRBC'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC getNiveauMenaceNRBC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getNiveauMenaceNRBC <em>Niveau Menace NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau Menace NRBC</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC
	 * @see #isSetNiveauMenaceNRBC()
	 * @see #unsetNiveauMenaceNRBC()
	 * @see #getNiveauMenaceNRBC()
	 * @generated
	 */
	void setNiveauMenaceNRBC(TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getNiveauMenaceNRBC <em>Niveau Menace NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNiveauMenaceNRBC()
	 * @see #getNiveauMenaceNRBC()
	 * @see #setNiveauMenaceNRBC(TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC)
	 * @generated
	 */
	void unsetNiveauMenaceNRBC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getNiveauMenaceNRBC <em>Niveau Menace NRBC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Niveau Menace NRBC</em>' attribute is set.
	 * @see #unsetNiveauMenaceNRBC()
	 * @see #getNiveauMenaceNRBC()
	 * @see #setNiveauMenaceNRBC(TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC)
	 * @generated
	 */
	boolean isSetNiveauMenaceNRBC();

	/**
	 * Returns the value of the '<em><b>Statut Investigation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statut Investigation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut Investigation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation
	 * @see #isSetStatutInvestigation()
	 * @see #unsetStatutInvestigation()
	 * @see #setStatutInvestigation(TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation)
	 * @see mpia.schema.SchemaPackage#getTypeEtatOperationnelElementControle_StatutInvestigation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StatutInvestigation'"
	 * @generated
	 */
	TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation getStatutInvestigation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getStatutInvestigation <em>Statut Investigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut Investigation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation
	 * @see #isSetStatutInvestigation()
	 * @see #unsetStatutInvestigation()
	 * @see #getStatutInvestigation()
	 * @generated
	 */
	void setStatutInvestigation(TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getStatutInvestigation <em>Statut Investigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatutInvestigation()
	 * @see #getStatutInvestigation()
	 * @see #setStatutInvestigation(TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation)
	 * @generated
	 */
	void unsetStatutInvestigation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEtatOperationnelElementControle#getStatutInvestigation <em>Statut Investigation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Statut Investigation</em>' attribute is set.
	 * @see #unsetStatutInvestigation()
	 * @see #getStatutInvestigation()
	 * @see #setStatutInvestigation(TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation)
	 * @generated
	 */
	boolean isSetStatutInvestigation();

} // TypeEtatOperationnelElementControle
