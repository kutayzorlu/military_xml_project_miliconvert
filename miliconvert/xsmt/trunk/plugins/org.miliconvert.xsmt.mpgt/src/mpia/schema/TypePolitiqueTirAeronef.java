/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Politique Tir Aeronef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypePolitiqueTirAeronef#getTypeAeronefAvecVitesse <em>Type Aeronef Avec Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTirAeronef#getMecanismeTir <em>Mecanisme Tir</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTirAeronef#isVitesseRapide <em>Vitesse Rapide</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTirAeronef#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTirAeronef#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypePolitiqueTirAeronef#getAAppliquerParSystemeArmeTypeArme <em>AAppliquer Par Systeme Arme Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypePolitiqueTirAeronef()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_PolitiqueTirAeronef' kind='elementOnly'"
 * @generated
 */
public interface TypePolitiqueTirAeronef extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Aeronef Avec Vitesse</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Aeronef Avec Vitesse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Aeronef Avec Vitesse</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse
	 * @see #isSetTypeAeronefAvecVitesse()
	 * @see #unsetTypeAeronefAvecVitesse()
	 * @see #setTypeAeronefAvecVitesse(TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTirAeronef_TypeAeronefAvecVitesse()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TypeAeronefAvecVitesse'"
	 * @generated
	 */
	TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse getTypeAeronefAvecVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getTypeAeronefAvecVitesse <em>Type Aeronef Avec Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Aeronef Avec Vitesse</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse
	 * @see #isSetTypeAeronefAvecVitesse()
	 * @see #unsetTypeAeronefAvecVitesse()
	 * @see #getTypeAeronefAvecVitesse()
	 * @generated
	 */
	void setTypeAeronefAvecVitesse(TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getTypeAeronefAvecVitesse <em>Type Aeronef Avec Vitesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeAeronefAvecVitesse()
	 * @see #getTypeAeronefAvecVitesse()
	 * @see #setTypeAeronefAvecVitesse(TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse)
	 * @generated
	 */
	void unsetTypeAeronefAvecVitesse();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getTypeAeronefAvecVitesse <em>Type Aeronef Avec Vitesse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Aeronef Avec Vitesse</em>' attribute is set.
	 * @see #unsetTypeAeronefAvecVitesse()
	 * @see #getTypeAeronefAvecVitesse()
	 * @see #setTypeAeronefAvecVitesse(TypeDictionaryDicoPolitiqueTirAeronefTypeAeronefAvecVitesse)
	 * @generated
	 */
	boolean isSetTypeAeronefAvecVitesse();

	/**
	 * Returns the value of the '<em><b>Mecanisme Tir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mecanisme Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mecanisme Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir
	 * @see #isSetMecanismeTir()
	 * @see #unsetMecanismeTir()
	 * @see #setMecanismeTir(TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTirAeronef_MecanismeTir()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MecanismeTir'"
	 * @generated
	 */
	TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir getMecanismeTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getMecanismeTir <em>Mecanisme Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mecanisme Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir
	 * @see #isSetMecanismeTir()
	 * @see #unsetMecanismeTir()
	 * @see #getMecanismeTir()
	 * @generated
	 */
	void setMecanismeTir(TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getMecanismeTir <em>Mecanisme Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMecanismeTir()
	 * @see #getMecanismeTir()
	 * @see #setMecanismeTir(TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir)
	 * @generated
	 */
	void unsetMecanismeTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getMecanismeTir <em>Mecanisme Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mecanisme Tir</em>' attribute is set.
	 * @see #unsetMecanismeTir()
	 * @see #getMecanismeTir()
	 * @see #setMecanismeTir(TypeDictionaryDicoPolitiqueTirAeronefMecanismeTir)
	 * @generated
	 */
	boolean isSetMecanismeTir();

	/**
	 * Returns the value of the '<em><b>Vitesse Rapide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Rapide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Rapide</em>' attribute.
	 * @see #isSetVitesseRapide()
	 * @see #unsetVitesseRapide()
	 * @see #setVitesseRapide(boolean)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTirAeronef_VitesseRapide()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='VitesseRapide'"
	 * @generated
	 */
	boolean isVitesseRapide();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#isVitesseRapide <em>Vitesse Rapide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Rapide</em>' attribute.
	 * @see #isSetVitesseRapide()
	 * @see #unsetVitesseRapide()
	 * @see #isVitesseRapide()
	 * @generated
	 */
	void setVitesseRapide(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#isVitesseRapide <em>Vitesse Rapide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVitesseRapide()
	 * @see #isVitesseRapide()
	 * @see #setVitesseRapide(boolean)
	 * @generated
	 */
	void unsetVitesseRapide();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#isVitesseRapide <em>Vitesse Rapide</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vitesse Rapide</em>' attribute is set.
	 * @see #unsetVitesseRapide()
	 * @see #isVitesseRapide()
	 * @see #setVitesseRapide(boolean)
	 * @generated
	 */
	boolean isSetVitesseRapide();

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
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTirAeronef_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTirAeronef_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>AAppliquer Par Systeme Arme Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AAppliquer Par Systeme Arme Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AAppliquer Par Systeme Arme Type Arme</em>' containment reference.
	 * @see #setAAppliquerParSystemeArmeTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypePolitiqueTirAeronef_AAppliquerParSystemeArmeTypeArme()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='AAppliquerParSystemeArme_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getAAppliquerParSystemeArmeTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypePolitiqueTirAeronef#getAAppliquerParSystemeArmeTypeArme <em>AAppliquer Par Systeme Arme Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AAppliquer Par Systeme Arme Type Arme</em>' containment reference.
	 * @see #getAAppliquerParSystemeArmeTypeArme()
	 * @generated
	 */
	void setAAppliquerParSystemeArmeTypeArme(TypeAssociationEXT value);

} // TypePolitiqueTirAeronef
