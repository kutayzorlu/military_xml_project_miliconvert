/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Couverture Aerienne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCouvertureAerienne#getDegreSuperioriteAerienneGlobale <em>Degre Superiorite Aerienne Globale</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureAerienne#getDegreSuperioriteAerienneLocale <em>Degre Superiorite Aerienne Locale</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureAerienne#getDebutTempsSituationParticuliere <em>Debut Temps Situation Particuliere</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureAerienne#getFinTempsSituationParticuliere <em>Fin Temps Situation Particuliere</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureAerienne#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureAerienne#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureAerienne#getConcerneZoneAutreElementControle <em>Concerne Zone Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCouvertureAerienne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CouvertureAerienne' kind='elementOnly'"
 * @generated
 */
public interface TypeCouvertureAerienne extends EObject {
	/**
	 * Returns the value of the '<em><b>Degre Superiorite Aerienne Globale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSuperioriteAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Superiorite Aerienne Globale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Superiorite Aerienne Globale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuperioriteAerienne
	 * @see #isSetDegreSuperioriteAerienneGlobale()
	 * @see #unsetDegreSuperioriteAerienneGlobale()
	 * @see #setDegreSuperioriteAerienneGlobale(TypeDictionaryDicoSuperioriteAerienne)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureAerienne_DegreSuperioriteAerienneGlobale()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DegreSuperioriteAerienneGlobale'"
	 * @generated
	 */
	TypeDictionaryDicoSuperioriteAerienne getDegreSuperioriteAerienneGlobale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getDegreSuperioriteAerienneGlobale <em>Degre Superiorite Aerienne Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Superiorite Aerienne Globale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuperioriteAerienne
	 * @see #isSetDegreSuperioriteAerienneGlobale()
	 * @see #unsetDegreSuperioriteAerienneGlobale()
	 * @see #getDegreSuperioriteAerienneGlobale()
	 * @generated
	 */
	void setDegreSuperioriteAerienneGlobale(TypeDictionaryDicoSuperioriteAerienne value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getDegreSuperioriteAerienneGlobale <em>Degre Superiorite Aerienne Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegreSuperioriteAerienneGlobale()
	 * @see #getDegreSuperioriteAerienneGlobale()
	 * @see #setDegreSuperioriteAerienneGlobale(TypeDictionaryDicoSuperioriteAerienne)
	 * @generated
	 */
	void unsetDegreSuperioriteAerienneGlobale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCouvertureAerienne#getDegreSuperioriteAerienneGlobale <em>Degre Superiorite Aerienne Globale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degre Superiorite Aerienne Globale</em>' attribute is set.
	 * @see #unsetDegreSuperioriteAerienneGlobale()
	 * @see #getDegreSuperioriteAerienneGlobale()
	 * @see #setDegreSuperioriteAerienneGlobale(TypeDictionaryDicoSuperioriteAerienne)
	 * @generated
	 */
	boolean isSetDegreSuperioriteAerienneGlobale();

	/**
	 * Returns the value of the '<em><b>Degre Superiorite Aerienne Locale</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoSuperioriteAerienne}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Superiorite Aerienne Locale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Superiorite Aerienne Locale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuperioriteAerienne
	 * @see #isSetDegreSuperioriteAerienneLocale()
	 * @see #unsetDegreSuperioriteAerienneLocale()
	 * @see #setDegreSuperioriteAerienneLocale(TypeDictionaryDicoSuperioriteAerienne)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureAerienne_DegreSuperioriteAerienneLocale()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DegreSuperioriteAerienneLocale'"
	 * @generated
	 */
	TypeDictionaryDicoSuperioriteAerienne getDegreSuperioriteAerienneLocale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getDegreSuperioriteAerienneLocale <em>Degre Superiorite Aerienne Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Superiorite Aerienne Locale</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoSuperioriteAerienne
	 * @see #isSetDegreSuperioriteAerienneLocale()
	 * @see #unsetDegreSuperioriteAerienneLocale()
	 * @see #getDegreSuperioriteAerienneLocale()
	 * @generated
	 */
	void setDegreSuperioriteAerienneLocale(TypeDictionaryDicoSuperioriteAerienne value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getDegreSuperioriteAerienneLocale <em>Degre Superiorite Aerienne Locale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegreSuperioriteAerienneLocale()
	 * @see #getDegreSuperioriteAerienneLocale()
	 * @see #setDegreSuperioriteAerienneLocale(TypeDictionaryDicoSuperioriteAerienne)
	 * @generated
	 */
	void unsetDegreSuperioriteAerienneLocale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCouvertureAerienne#getDegreSuperioriteAerienneLocale <em>Degre Superiorite Aerienne Locale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degre Superiorite Aerienne Locale</em>' attribute is set.
	 * @see #unsetDegreSuperioriteAerienneLocale()
	 * @see #getDegreSuperioriteAerienneLocale()
	 * @see #setDegreSuperioriteAerienneLocale(TypeDictionaryDicoSuperioriteAerienne)
	 * @generated
	 */
	boolean isSetDegreSuperioriteAerienneLocale();

	/**
	 * Returns the value of the '<em><b>Debut Temps Situation Particuliere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Temps Situation Particuliere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Temps Situation Particuliere</em>' attribute.
	 * @see #setDebutTempsSituationParticuliere(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureAerienne_DebutTempsSituationParticuliere()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutTempsSituationParticuliere'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutTempsSituationParticuliere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getDebutTempsSituationParticuliere <em>Debut Temps Situation Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Temps Situation Particuliere</em>' attribute.
	 * @see #getDebutTempsSituationParticuliere()
	 * @generated
	 */
	void setDebutTempsSituationParticuliere(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Fin Temps Situation Particuliere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin Temps Situation Particuliere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin Temps Situation Particuliere</em>' attribute.
	 * @see #setFinTempsSituationParticuliere(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureAerienne_FinTempsSituationParticuliere()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='FinTempsSituationParticuliere'"
	 * @generated
	 */
	XMLGregorianCalendar getFinTempsSituationParticuliere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getFinTempsSituationParticuliere <em>Fin Temps Situation Particuliere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin Temps Situation Particuliere</em>' attribute.
	 * @see #getFinTempsSituationParticuliere()
	 * @generated
	 */
	void setFinTempsSituationParticuliere(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureAerienne_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureAerienne_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Zone Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Zone Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Zone Autre Element Controle</em>' containment reference.
	 * @see #setConcerneZoneAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureAerienne_ConcerneZoneAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='ConcerneZone_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getConcerneZoneAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureAerienne#getConcerneZoneAutreElementControle <em>Concerne Zone Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Zone Autre Element Controle</em>' containment reference.
	 * @see #getConcerneZoneAutreElementControle()
	 * @generated
	 */
	void setConcerneZoneAutreElementControle(TypeAssociation value);

} // TypeCouvertureAerienne
