/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type ZD Vpar Periode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZDVparPeriode#getTypeZDV <em>Type ZDV</em>}</li>
 *   <li>{@link mpia.schema.TypeZDVparPeriode#getConditionsInitiales <em>Conditions Initiales</em>}</li>
 *   <li>{@link mpia.schema.TypeZDVparPeriode#getDebutPeriodeValidite <em>Debut Periode Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeZDVparPeriode#getRayonCercle <em>Rayon Cercle</em>}</li>
 *   <li>{@link mpia.schema.TypeZDVparPeriode#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeZDVparPeriode#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeZDVparPeriode#getAPourContourCoordonneesLatLong <em>APour Contour Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZDVparPeriode()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ZDVparPeriode' kind='elementOnly'"
 * @generated
 */
public interface TypeZDVparPeriode extends EObject {
	/**
	 * Returns the value of the '<em><b>Type ZDV</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZDVparPeriodeTypeZDV}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type ZDV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type ZDV</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZDVparPeriodeTypeZDV
	 * @see #isSetTypeZDV()
	 * @see #unsetTypeZDV()
	 * @see #setTypeZDV(TypeDictionaryDicoZDVparPeriodeTypeZDV)
	 * @see mpia.schema.SchemaPackage#getTypeZDVparPeriode_TypeZDV()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeZDV'"
	 * @generated
	 */
	TypeDictionaryDicoZDVparPeriodeTypeZDV getTypeZDV();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZDVparPeriode#getTypeZDV <em>Type ZDV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type ZDV</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZDVparPeriodeTypeZDV
	 * @see #isSetTypeZDV()
	 * @see #unsetTypeZDV()
	 * @see #getTypeZDV()
	 * @generated
	 */
	void setTypeZDV(TypeDictionaryDicoZDVparPeriodeTypeZDV value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZDVparPeriode#getTypeZDV <em>Type ZDV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeZDV()
	 * @see #getTypeZDV()
	 * @see #setTypeZDV(TypeDictionaryDicoZDVparPeriodeTypeZDV)
	 * @generated
	 */
	void unsetTypeZDV();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZDVparPeriode#getTypeZDV <em>Type ZDV</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type ZDV</em>' attribute is set.
	 * @see #unsetTypeZDV()
	 * @see #getTypeZDV()
	 * @see #setTypeZDV(TypeDictionaryDicoZDVparPeriodeTypeZDV)
	 * @generated
	 */
	boolean isSetTypeZDV();

	/**
	 * Returns the value of the '<em><b>Conditions Initiales</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZDVparPeriodeConditionsInitiales}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions Initiales</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions Initiales</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZDVparPeriodeConditionsInitiales
	 * @see #isSetConditionsInitiales()
	 * @see #unsetConditionsInitiales()
	 * @see #setConditionsInitiales(TypeDictionaryDicoZDVparPeriodeConditionsInitiales)
	 * @see mpia.schema.SchemaPackage#getTypeZDVparPeriode_ConditionsInitiales()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ConditionsInitiales'"
	 * @generated
	 */
	TypeDictionaryDicoZDVparPeriodeConditionsInitiales getConditionsInitiales();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZDVparPeriode#getConditionsInitiales <em>Conditions Initiales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions Initiales</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZDVparPeriodeConditionsInitiales
	 * @see #isSetConditionsInitiales()
	 * @see #unsetConditionsInitiales()
	 * @see #getConditionsInitiales()
	 * @generated
	 */
	void setConditionsInitiales(TypeDictionaryDicoZDVparPeriodeConditionsInitiales value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZDVparPeriode#getConditionsInitiales <em>Conditions Initiales</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionsInitiales()
	 * @see #getConditionsInitiales()
	 * @see #setConditionsInitiales(TypeDictionaryDicoZDVparPeriodeConditionsInitiales)
	 * @generated
	 */
	void unsetConditionsInitiales();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZDVparPeriode#getConditionsInitiales <em>Conditions Initiales</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditions Initiales</em>' attribute is set.
	 * @see #unsetConditionsInitiales()
	 * @see #getConditionsInitiales()
	 * @see #setConditionsInitiales(TypeDictionaryDicoZDVparPeriodeConditionsInitiales)
	 * @generated
	 */
	boolean isSetConditionsInitiales();

	/**
	 * Returns the value of the '<em><b>Debut Periode Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debut Periode Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut Periode Validite</em>' attribute.
	 * @see #setDebutPeriodeValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeZDVparPeriode_DebutPeriodeValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DebutPeriodeValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getDebutPeriodeValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZDVparPeriode#getDebutPeriodeValidite <em>Debut Periode Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut Periode Validite</em>' attribute.
	 * @see #getDebutPeriodeValidite()
	 * @generated
	 */
	void setDebutPeriodeValidite(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Rayon Cercle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rayon Cercle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rayon Cercle</em>' containment reference.
	 * @see #setRayonCercle(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeZDVparPeriode_RayonCercle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RayonCercle'"
	 * @generated
	 */
	TypeDataTypeLongueur getRayonCercle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZDVparPeriode#getRayonCercle <em>Rayon Cercle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rayon Cercle</em>' containment reference.
	 * @see #getRayonCercle()
	 * @generated
	 */
	void setRayonCercle(TypeDataTypeLongueur value);

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
	 * @see mpia.schema.SchemaPackage#getTypeZDVparPeriode_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZDVparPeriode#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeZDVparPeriode_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZDVparPeriode#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Contour Coordonnees Lat Long</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeCoordonneesLatLong}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Contour Coordonnees Lat Long</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Contour Coordonnees Lat Long</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeZDVparPeriode_APourContourCoordonneesLatLong()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CoordonneesLatLong'"
	 *        extendedMetaData="kind='element' name='APourContour_CoordonneesLatLong'"
	 * @generated
	 */
	EList<TypeCoordonneesLatLong> getAPourContourCoordonneesLatLong();

} // TypeZDVparPeriode
