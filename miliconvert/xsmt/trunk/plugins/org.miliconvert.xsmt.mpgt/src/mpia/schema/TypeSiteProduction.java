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
 * A representation of the model object '<em><b>Type Site Production</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeSiteProduction#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteProduction#getProductionJournaliere <em>Production Journaliere</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteProduction#getSousType <em>Sous Type</em>}</li>
 *   <li>{@link mpia.schema.TypeSiteProduction#getUniteMesure <em>Unite Mesure</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeSiteProduction()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_SiteProduction' kind='elementOnly'"
 * @generated
 */
public interface TypeSiteProduction extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSiteProductionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSiteProductionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoSiteProductionType)
	 * @see mpia.schema.SchemaPackage#getTypeSiteProduction_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoSiteProductionType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteProduction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSiteProductionType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoSiteProductionType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteProduction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoSiteProductionType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteProduction#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoSiteProductionType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Production Journaliere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Journaliere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Journaliere</em>' attribute.
	 * @see #isSetProductionJournaliere()
	 * @see #unsetProductionJournaliere()
	 * @see #setProductionJournaliere(double)
	 * @see mpia.schema.SchemaPackage#getTypeSiteProduction_ProductionJournaliere()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='ProductionJournaliere'"
	 * @generated
	 */
	double getProductionJournaliere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteProduction#getProductionJournaliere <em>Production Journaliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Journaliere</em>' attribute.
	 * @see #isSetProductionJournaliere()
	 * @see #unsetProductionJournaliere()
	 * @see #getProductionJournaliere()
	 * @generated
	 */
	void setProductionJournaliere(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteProduction#getProductionJournaliere <em>Production Journaliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProductionJournaliere()
	 * @see #getProductionJournaliere()
	 * @see #setProductionJournaliere(double)
	 * @generated
	 */
	void unsetProductionJournaliere();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteProduction#getProductionJournaliere <em>Production Journaliere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Production Journaliere</em>' attribute is set.
	 * @see #unsetProductionJournaliere()
	 * @see #getProductionJournaliere()
	 * @see #setProductionJournaliere(double)
	 * @generated
	 */
	boolean isSetProductionJournaliere();

	/**
	 * Returns the value of the '<em><b>Sous Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSiteProductionSousType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSiteProductionSousType
	 * @see #isSetSousType()
	 * @see #unsetSousType()
	 * @see #setSousType(TypeDictionaryDicoSiteProductionSousType)
	 * @see mpia.schema.SchemaPackage#getTypeSiteProduction_SousType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SousType'"
	 * @generated
	 */
	TypeDictionaryDicoSiteProductionSousType getSousType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteProduction#getSousType <em>Sous Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSiteProductionSousType
	 * @see #isSetSousType()
	 * @see #unsetSousType()
	 * @see #getSousType()
	 * @generated
	 */
	void setSousType(TypeDictionaryDicoSiteProductionSousType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeSiteProduction#getSousType <em>Sous Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousType()
	 * @see #getSousType()
	 * @see #setSousType(TypeDictionaryDicoSiteProductionSousType)
	 * @generated
	 */
	void unsetSousType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeSiteProduction#getSousType <em>Sous Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Type</em>' attribute is set.
	 * @see #unsetSousType()
	 * @see #getSousType()
	 * @see #setSousType(TypeDictionaryDicoSiteProductionSousType)
	 * @generated
	 */
	boolean isSetSousType();

	/**
	 * Returns the value of the '<em><b>Unite Mesure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unite Mesure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unite Mesure</em>' attribute.
	 * @see #setUniteMesure(String)
	 * @see mpia.schema.SchemaPackage#getTypeSiteProduction_UniteMesure()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='UniteMesure'"
	 * @generated
	 */
	String getUniteMesure();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeSiteProduction#getUniteMesure <em>Unite Mesure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unite Mesure</em>' attribute.
	 * @see #getUniteMesure()
	 * @generated
	 */
	void setUniteMesure(String value);

} // TypeSiteProduction
