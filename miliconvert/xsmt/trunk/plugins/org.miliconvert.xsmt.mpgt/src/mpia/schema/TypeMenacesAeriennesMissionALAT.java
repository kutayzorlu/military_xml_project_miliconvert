/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Menaces Aeriennes Mission ALAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getTypeMenace <em>Type Menace</em>}</li>
 *   <li>{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getOrigineGeographique <em>Origine Geographique</em>}</li>
 *   <li>{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getConsigneDeTir <em>Consigne De Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getConcerneTypeArmementTypeMateriel <em>Concerne Type Armement Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMenacesAeriennesMissionALAT()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_MenacesAeriennesMissionALAT' kind='elementOnly'"
 * @generated
 */
public interface TypeMenacesAeriennesMissionALAT extends TypeMenace {
	/**
	 * Returns the value of the '<em><b>Type Menace</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Menace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace
	 * @see #isSetTypeMenace()
	 * @see #unsetTypeMenace()
	 * @see #setTypeMenace(TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace)
	 * @see mpia.schema.SchemaPackage#getTypeMenacesAeriennesMissionALAT_TypeMenace()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeMenace'"
	 * @generated
	 */
	TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace getTypeMenace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getTypeMenace <em>Type Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Menace</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace
	 * @see #isSetTypeMenace()
	 * @see #unsetTypeMenace()
	 * @see #getTypeMenace()
	 * @generated
	 */
	void setTypeMenace(TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getTypeMenace <em>Type Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeMenace()
	 * @see #getTypeMenace()
	 * @see #setTypeMenace(TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace)
	 * @generated
	 */
	void unsetTypeMenace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getTypeMenace <em>Type Menace</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Menace</em>' attribute is set.
	 * @see #unsetTypeMenace()
	 * @see #getTypeMenace()
	 * @see #setTypeMenace(TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace)
	 * @generated
	 */
	boolean isSetTypeMenace();

	/**
	 * Returns the value of the '<em><b>Origine Geographique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origine Geographique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origine Geographique</em>' attribute.
	 * @see #setOrigineGeographique(String)
	 * @see mpia.schema.SchemaPackage#getTypeMenacesAeriennesMissionALAT_OrigineGeographique()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='OrigineGeographique'"
	 * @generated
	 */
	String getOrigineGeographique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getOrigineGeographique <em>Origine Geographique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origine Geographique</em>' attribute.
	 * @see #getOrigineGeographique()
	 * @generated
	 */
	void setOrigineGeographique(String value);

	/**
	 * Returns the value of the '<em><b>Consigne De Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consigne De Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consigne De Tir</em>' attribute.
	 * @see #setConsigneDeTir(String)
	 * @see mpia.schema.SchemaPackage#getTypeMenacesAeriennesMissionALAT_ConsigneDeTir()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ConsigneDeTir'"
	 * @generated
	 */
	String getConsigneDeTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMenacesAeriennesMissionALAT#getConsigneDeTir <em>Consigne De Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consigne De Tir</em>' attribute.
	 * @see #getConsigneDeTir()
	 * @generated
	 */
	void setConsigneDeTir(String value);

	/**
	 * Returns the value of the '<em><b>Concerne Type Armement Type Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Type Armement Type Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Type Armement Type Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMenacesAeriennesMissionALAT_ConcerneTypeArmementTypeMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='ConcerneTypeArmement_TypeMateriel'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getConcerneTypeArmementTypeMateriel();

} // TypeMenacesAeriennesMissionALAT
