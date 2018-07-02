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
 * A representation of the model object '<em><b>Type Moyens EN Iutilises</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyensENIutilises#getVitesseAeronef <em>Vitesse Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENIutilises#getAltitudeAeronef <em>Altitude Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENIutilises#getNatureVolumeENI <em>Nature Volume ENI</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENIutilises#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENIutilises#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENIutilises#getUtiliseCommeTypeAeronefTypeAeronef <em>Utilise Comme Type Aeronef Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENIutilises#getUtiliseCommeArmementOuEquipementTypeMateriel <em>Utilise Comme Armement Ou Equipement Type Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyensENIutilises#getAPourAxeApprocheAutreElementControle <em>APour Axe Approche Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyensENIutilises' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyensENIutilises extends EObject {
	/**
	 * Returns the value of the '<em><b>Vitesse Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse Aeronef</em>' containment reference.
	 * @see #setVitesseAeronef(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises_VitesseAeronef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VitesseAeronef'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesseAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENIutilises#getVitesseAeronef <em>Vitesse Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse Aeronef</em>' containment reference.
	 * @see #getVitesseAeronef()
	 * @generated
	 */
	void setVitesseAeronef(TypeDataTypeVitesseLineaire value);

	/**
	 * Returns the value of the '<em><b>Altitude Aeronef</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAltitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Aeronef</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Aeronef</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAltitude
	 * @see #isSetAltitudeAeronef()
	 * @see #unsetAltitudeAeronef()
	 * @see #setAltitudeAeronef(TypeDictionaryDicoAltitude)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises_AltitudeAeronef()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AltitudeAeronef'"
	 * @generated
	 */
	TypeDictionaryDicoAltitude getAltitudeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENIutilises#getAltitudeAeronef <em>Altitude Aeronef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Aeronef</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAltitude
	 * @see #isSetAltitudeAeronef()
	 * @see #unsetAltitudeAeronef()
	 * @see #getAltitudeAeronef()
	 * @generated
	 */
	void setAltitudeAeronef(TypeDictionaryDicoAltitude value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyensENIutilises#getAltitudeAeronef <em>Altitude Aeronef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeAeronef()
	 * @see #getAltitudeAeronef()
	 * @see #setAltitudeAeronef(TypeDictionaryDicoAltitude)
	 * @generated
	 */
	void unsetAltitudeAeronef();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyensENIutilises#getAltitudeAeronef <em>Altitude Aeronef</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude Aeronef</em>' attribute is set.
	 * @see #unsetAltitudeAeronef()
	 * @see #getAltitudeAeronef()
	 * @see #setAltitudeAeronef(TypeDictionaryDicoAltitude)
	 * @generated
	 */
	boolean isSetAltitudeAeronef();

	/**
	 * Returns the value of the '<em><b>Nature Volume ENI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Volume ENI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Volume ENI</em>' attribute.
	 * @see #setNatureVolumeENI(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises_NatureVolumeENI()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='NatureVolumeENI'"
	 * @generated
	 */
	String getNatureVolumeENI();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENIutilises#getNatureVolumeENI <em>Nature Volume ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Volume ENI</em>' attribute.
	 * @see #getNatureVolumeENI()
	 * @generated
	 */
	void setNatureVolumeENI(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENIutilises#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENIutilises#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Utilise Comme Type Aeronef Type Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilise Comme Type Aeronef Type Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilise Comme Type Aeronef Type Aeronef</em>' containment reference.
	 * @see #setUtiliseCommeTypeAeronefTypeAeronef(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises_UtiliseCommeTypeAeronefTypeAeronef()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='UtiliseCommeTypeAeronef_TypeAeronef'"
	 * @generated
	 */
	TypeAssociationEXT getUtiliseCommeTypeAeronefTypeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENIutilises#getUtiliseCommeTypeAeronefTypeAeronef <em>Utilise Comme Type Aeronef Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilise Comme Type Aeronef Type Aeronef</em>' containment reference.
	 * @see #getUtiliseCommeTypeAeronefTypeAeronef()
	 * @generated
	 */
	void setUtiliseCommeTypeAeronefTypeAeronef(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Utilise Comme Armement Ou Equipement Type Materiel</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilise Comme Armement Ou Equipement Type Materiel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilise Comme Armement Ou Equipement Type Materiel</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises_UtiliseCommeArmementOuEquipementTypeMateriel()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMateriel'"
	 *        extendedMetaData="kind='element' name='UtiliseCommeArmementOuEquipement_TypeMateriel'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getUtiliseCommeArmementOuEquipementTypeMateriel();

	/**
	 * Returns the value of the '<em><b>APour Axe Approche Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Axe Approche Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Axe Approche Autre Element Controle</em>' containment reference.
	 * @see #setAPourAxeApprocheAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeMoyensENIutilises_APourAxeApprocheAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourAxeApproche_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourAxeApprocheAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyensENIutilises#getAPourAxeApprocheAutreElementControle <em>APour Axe Approche Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Axe Approche Autre Element Controle</em>' containment reference.
	 * @see #getAPourAxeApprocheAutreElementControle()
	 * @generated
	 */
	void setAPourAxeApprocheAutreElementControle(TypeAssociation value);

} // TypeMoyensENIutilises
