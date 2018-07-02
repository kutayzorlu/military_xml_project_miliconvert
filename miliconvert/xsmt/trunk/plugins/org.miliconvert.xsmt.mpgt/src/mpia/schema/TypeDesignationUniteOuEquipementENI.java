/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Designation Unite Ou Equipement ENI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}</li>
 *   <li>{@link mpia.schema.TypeDesignationUniteOuEquipementENI#isIndicateurRenforcement <em>Indicateur Renforcement</em>}</li>
 *   <li>{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getAPourZoneMenaceAutreElementControle <em>APour Zone Menace Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle <em>APour Localisation Pieces Ou Unites AS Aeni Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getEmploieCommeUniteUnite <em>Emploie Comme Unite Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite <em>APour Quantite Type Unite Employe Quantite Type Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement <em>APour Quantite Type Equipement Employe Quantite Type Equipement</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDesignationUniteOuEquipementENI()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DesignationUniteOuEquipementENI' kind='elementOnly'"
 * @generated
 */
public interface TypeDesignationUniteOuEquipementENI extends EObject {
	/**
	 * Returns the value of the '<em><b>Capacite Ops Globale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacite Ops Globale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite Ops Globale</em>' attribute.
	 * @see #isSetCapaciteOpsGlobale()
	 * @see #unsetCapaciteOpsGlobale()
	 * @see #setCapaciteOpsGlobale(double)
	 * @see mpia.schema.SchemaPackage#getTypeDesignationUniteOuEquipementENI_CapaciteOpsGlobale()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeFraction"
	 *        extendedMetaData="kind='element' name='CapaciteOpsGlobale'"
	 * @generated
	 */
	double getCapaciteOpsGlobale();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite Ops Globale</em>' attribute.
	 * @see #isSetCapaciteOpsGlobale()
	 * @see #unsetCapaciteOpsGlobale()
	 * @see #getCapaciteOpsGlobale()
	 * @generated
	 */
	void setCapaciteOpsGlobale(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCapaciteOpsGlobale()
	 * @see #getCapaciteOpsGlobale()
	 * @see #setCapaciteOpsGlobale(double)
	 * @generated
	 */
	void unsetCapaciteOpsGlobale();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getCapaciteOpsGlobale <em>Capacite Ops Globale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Capacite Ops Globale</em>' attribute is set.
	 * @see #unsetCapaciteOpsGlobale()
	 * @see #getCapaciteOpsGlobale()
	 * @see #setCapaciteOpsGlobale(double)
	 * @generated
	 */
	boolean isSetCapaciteOpsGlobale();

	/**
	 * Returns the value of the '<em><b>Indicateur Renforcement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicateur Renforcement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicateur Renforcement</em>' attribute.
	 * @see #isSetIndicateurRenforcement()
	 * @see #unsetIndicateurRenforcement()
	 * @see #setIndicateurRenforcement(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeDesignationUniteOuEquipementENI_IndicateurRenforcement()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='IndicateurRenforcement'"
	 * @generated
	 */
	boolean isIndicateurRenforcement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDesignationUniteOuEquipementENI#isIndicateurRenforcement <em>Indicateur Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicateur Renforcement</em>' attribute.
	 * @see #isSetIndicateurRenforcement()
	 * @see #unsetIndicateurRenforcement()
	 * @see #isIndicateurRenforcement()
	 * @generated
	 */
	void setIndicateurRenforcement(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDesignationUniteOuEquipementENI#isIndicateurRenforcement <em>Indicateur Renforcement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIndicateurRenforcement()
	 * @see #isIndicateurRenforcement()
	 * @see #setIndicateurRenforcement(boolean)
	 * @generated
	 */
	void unsetIndicateurRenforcement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDesignationUniteOuEquipementENI#isIndicateurRenforcement <em>Indicateur Renforcement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Indicateur Renforcement</em>' attribute is set.
	 * @see #unsetIndicateurRenforcement()
	 * @see #isIndicateurRenforcement()
	 * @see #setIndicateurRenforcement(boolean)
	 * @generated
	 */
	boolean isSetIndicateurRenforcement();

	/**
	 * Returns the value of the '<em><b>APour Zone Menace Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Zone Menace Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Zone Menace Autre Element Controle</em>' containment reference.
	 * @see #setAPourZoneMenaceAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDesignationUniteOuEquipementENI_APourZoneMenaceAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourZoneMenace_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourZoneMenaceAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getAPourZoneMenaceAutreElementControle <em>APour Zone Menace Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Zone Menace Autre Element Controle</em>' containment reference.
	 * @see #getAPourZoneMenaceAutreElementControle()
	 * @generated
	 */
	void setAPourZoneMenaceAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Pieces Ou Unites AS Aeni Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Pieces Ou Unites AS Aeni Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Pieces Ou Unites AS Aeni Autre Element Controle</em>' containment reference.
	 * @see #setAPourLocalisationPiecesOuUnitesASAeniAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDesignationUniteOuEquipementENI_APourLocalisationPiecesOuUnitesASAeniAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourLocalisationPiecesOuUnitesASAeni_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDesignationUniteOuEquipementENI#getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle <em>APour Localisation Pieces Ou Unites AS Aeni Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Pieces Ou Unites AS Aeni Autre Element Controle</em>' containment reference.
	 * @see #getAPourLocalisationPiecesOuUnitesASAeniAutreElementControle()
	 * @generated
	 */
	void setAPourLocalisationPiecesOuUnitesASAeniAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Emploie Comme Unite Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emploie Comme Unite Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emploie Comme Unite Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDesignationUniteOuEquipementENI_EmploieCommeUniteUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='EmploieCommeUnite_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getEmploieCommeUniteUnite();

	/**
	 * Returns the value of the '<em><b>APour Quantite Type Unite Employe Quantite Type Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteTypeUnite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Quantite Type Unite Employe Quantite Type Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Quantite Type Unite Employe Quantite Type Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDesignationUniteOuEquipementENI_APourQuantiteTypeUniteEmployeQuantiteTypeUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteTypeUnite'"
	 *        extendedMetaData="kind='element' name='APourQuantiteTypeUniteEmploye_QuantiteTypeUnite'"
	 * @generated
	 */
	EList<TypeQuantiteTypeUnite> getAPourQuantiteTypeUniteEmployeQuantiteTypeUnite();

	/**
	 * Returns the value of the '<em><b>APour Quantite Type Equipement Employe Quantite Type Equipement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeQuantiteTypeEquipement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Quantite Type Equipement Employe Quantite Type Equipement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Quantite Type Equipement Employe Quantite Type Equipement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDesignationUniteOuEquipementENI_APourQuantiteTypeEquipementEmployeQuantiteTypeEquipement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_QuantiteTypeEquipement'"
	 *        extendedMetaData="kind='element' name='APourQuantiteTypeEquipementEmploye_QuantiteTypeEquipement'"
	 * @generated
	 */
	EList<TypeQuantiteTypeEquipement> getAPourQuantiteTypeEquipementEmployeQuantiteTypeEquipement();

} // TypeDesignationUniteOuEquipementENI
