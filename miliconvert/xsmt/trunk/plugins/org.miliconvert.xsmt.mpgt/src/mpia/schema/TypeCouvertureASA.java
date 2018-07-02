/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Couverture ASA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getAltitudeCouverture <em>Altitude Couverture</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getTypeCouvertureSolAir <em>Type Couverture Sol Air</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getConcerneTypeArmeSolAirTypeArme <em>Concerne Type Arme Sol Air Type Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getAPourUniteASAresponsableUnite <em>APour Unite AS Aresponsable Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getAPourZoneCouvertureAutreElementControle <em>APour Zone Couverture Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeCouvertureASA#getAPourPeriodesActivationPeriode3D <em>APour Periodes Activation Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_CouvertureASA' kind='elementOnly'"
 * @generated
 */
public interface TypeCouvertureASA extends EObject {
	/**
	 * Returns the value of the '<em><b>Altitude Couverture</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAltitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Couverture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Couverture</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAltitude
	 * @see #isSetAltitudeCouverture()
	 * @see #unsetAltitudeCouverture()
	 * @see #setAltitudeCouverture(TypeDictionaryDicoAltitude)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_AltitudeCouverture()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AltitudeCouverture'"
	 * @generated
	 */
	TypeDictionaryDicoAltitude getAltitudeCouverture();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureASA#getAltitudeCouverture <em>Altitude Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Couverture</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAltitude
	 * @see #isSetAltitudeCouverture()
	 * @see #unsetAltitudeCouverture()
	 * @see #getAltitudeCouverture()
	 * @generated
	 */
	void setAltitudeCouverture(TypeDictionaryDicoAltitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCouvertureASA#getAltitudeCouverture <em>Altitude Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeCouverture()
	 * @see #getAltitudeCouverture()
	 * @see #setAltitudeCouverture(TypeDictionaryDicoAltitude)
	 * @generated
	 */
	void unsetAltitudeCouverture();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCouvertureASA#getAltitudeCouverture <em>Altitude Couverture</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude Couverture</em>' attribute is set.
	 * @see #unsetAltitudeCouverture()
	 * @see #getAltitudeCouverture()
	 * @see #setAltitudeCouverture(TypeDictionaryDicoAltitude)
	 * @generated
	 */
	boolean isSetAltitudeCouverture();

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureASA#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Type Couverture Sol Air</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoCouvertureASATypeCouvertureSolAir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Couverture Sol Air</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Couverture Sol Air</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouvertureASATypeCouvertureSolAir
	 * @see #isSetTypeCouvertureSolAir()
	 * @see #unsetTypeCouvertureSolAir()
	 * @see #setTypeCouvertureSolAir(TypeDictionaryDicoCouvertureASATypeCouvertureSolAir)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_TypeCouvertureSolAir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeCouvertureSolAir'"
	 * @generated
	 */
	TypeDictionaryDicoCouvertureASATypeCouvertureSolAir getTypeCouvertureSolAir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureASA#getTypeCouvertureSolAir <em>Type Couverture Sol Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Couverture Sol Air</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoCouvertureASATypeCouvertureSolAir
	 * @see #isSetTypeCouvertureSolAir()
	 * @see #unsetTypeCouvertureSolAir()
	 * @see #getTypeCouvertureSolAir()
	 * @generated
	 */
	void setTypeCouvertureSolAir(TypeDictionaryDicoCouvertureASATypeCouvertureSolAir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeCouvertureASA#getTypeCouvertureSolAir <em>Type Couverture Sol Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeCouvertureSolAir()
	 * @see #getTypeCouvertureSolAir()
	 * @see #setTypeCouvertureSolAir(TypeDictionaryDicoCouvertureASATypeCouvertureSolAir)
	 * @generated
	 */
	void unsetTypeCouvertureSolAir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeCouvertureASA#getTypeCouvertureSolAir <em>Type Couverture Sol Air</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Couverture Sol Air</em>' attribute is set.
	 * @see #unsetTypeCouvertureSolAir()
	 * @see #getTypeCouvertureSolAir()
	 * @see #setTypeCouvertureSolAir(TypeDictionaryDicoCouvertureASATypeCouvertureSolAir)
	 * @generated
	 */
	boolean isSetTypeCouvertureSolAir();

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
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureASA#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureASA#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Arme Sol Air Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Arme Sol Air Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Arme Sol Air Type Arme</em>' containment reference.
	 * @see #setConcerneTypeArmeSolAirTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_ConcerneTypeArmeSolAirTypeArme()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeArmeSolAir_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getConcerneTypeArmeSolAirTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureASA#getConcerneTypeArmeSolAirTypeArme <em>Concerne Type Arme Sol Air Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Type Arme Sol Air Type Arme</em>' containment reference.
	 * @see #getConcerneTypeArmeSolAirTypeArme()
	 * @generated
	 */
	void setConcerneTypeArmeSolAirTypeArme(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Unite AS Aresponsable Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite AS Aresponsable Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite AS Aresponsable Unite</em>' containment reference.
	 * @see #setAPourUniteASAresponsableUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_APourUniteASAresponsableUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteASAresponsable_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourUniteASAresponsableUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureASA#getAPourUniteASAresponsableUnite <em>APour Unite AS Aresponsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Unite AS Aresponsable Unite</em>' containment reference.
	 * @see #getAPourUniteASAresponsableUnite()
	 * @generated
	 */
	void setAPourUniteASAresponsableUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Zone Couverture Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Couverture Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Couverture Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneCouvertureAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_APourZoneCouvertureAutreElementControle()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneCouverture_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneCouvertureAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeCouvertureASA#getAPourZoneCouvertureAutreElementControle <em>APour Zone Couverture Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Couverture Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneCouvertureAutreElementControle()
	 * @generated
	 */
	void setAPourZoneCouvertureAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Periodes Activation Periode3 D</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePeriode3D}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Periodes Activation Periode3 D</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Periodes Activation Periode3 D</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeCouvertureASA_APourPeriodesActivationPeriode3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Periode3D'"
	 *        extendedMetaData="kind='element' name='APourPeriodesActivation_Periode3D'"
	 * @generated
	 */
	EList<TypePeriode3D> getAPourPeriodesActivationPeriode3D();

} // TypeCouvertureASA
