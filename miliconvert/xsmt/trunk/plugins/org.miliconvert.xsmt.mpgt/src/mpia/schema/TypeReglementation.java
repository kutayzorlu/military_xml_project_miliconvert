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
 * A representation of the model object '<em><b>Type Reglementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeReglementation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getConditionsAcces <em>Conditions Acces</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getFonctionResponsable <em>Fonction Responsable</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getNomEtRangResponsable <em>Nom Et Rang Responsable</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getVautPourPhaseHoraireManoeuvre <em>Vaut Pour Phase Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getPreciseConsigneTir <em>Precise Consigne Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getAPourRestrictionsUsage4DCoordination4D <em>APour Restrictions Usage4 DCoordination4 D</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getVautPourTypeType <em>Vaut Pour Type Type</em>}</li>
 *   <li>{@link mpia.schema.TypeReglementation#getVautPourInstanceInstanceObjet <em>Vaut Pour Instance Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeReglementation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_Reglementation' kind='elementOnly'"
 * @generated
 */
public interface TypeReglementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReglementationCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReglementationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoReglementationCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoReglementationCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReglementationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoReglementationCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReglementation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoReglementationCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReglementation#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoReglementationCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Conditions Acces</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoReglementationConditionsAcces}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions Acces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions Acces</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReglementationConditionsAcces
	 * @see #isSetConditionsAcces()
	 * @see #unsetConditionsAcces()
	 * @see #setConditionsAcces(TypeDictionaryDicoReglementationConditionsAcces)
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_ConditionsAcces()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ConditionsAcces'"
	 * @generated
	 */
	TypeDictionaryDicoReglementationConditionsAcces getConditionsAcces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getConditionsAcces <em>Conditions Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions Acces</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoReglementationConditionsAcces
	 * @see #isSetConditionsAcces()
	 * @see #unsetConditionsAcces()
	 * @see #getConditionsAcces()
	 * @generated
	 */
	void setConditionsAcces(TypeDictionaryDicoReglementationConditionsAcces value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeReglementation#getConditionsAcces <em>Conditions Acces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConditionsAcces()
	 * @see #getConditionsAcces()
	 * @see #setConditionsAcces(TypeDictionaryDicoReglementationConditionsAcces)
	 * @generated
	 */
	void unsetConditionsAcces();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeReglementation#getConditionsAcces <em>Conditions Acces</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Conditions Acces</em>' attribute is set.
	 * @see #unsetConditionsAcces()
	 * @see #getConditionsAcces()
	 * @see #setConditionsAcces(TypeDictionaryDicoReglementationConditionsAcces)
	 * @generated
	 */
	boolean isSetConditionsAcces();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_Description()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fonction Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonction Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonction Responsable</em>' attribute.
	 * @see #setFonctionResponsable(String)
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_FonctionResponsable()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='FonctionResponsable'"
	 * @generated
	 */
	String getFonctionResponsable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getFonctionResponsable <em>Fonction Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fonction Responsable</em>' attribute.
	 * @see #getFonctionResponsable()
	 * @generated
	 */
	void setFonctionResponsable(String value);

	/**
	 * Returns the value of the '<em><b>Nom Et Rang Responsable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Et Rang Responsable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Et Rang Responsable</em>' attribute.
	 * @see #setNomEtRangResponsable(String)
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_NomEtRangResponsable()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='NomEtRangResponsable'"
	 * @generated
	 */
	String getNomEtRangResponsable();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getNomEtRangResponsable <em>Nom Et Rang Responsable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Et Rang Responsable</em>' attribute.
	 * @see #getNomEtRangResponsable()
	 * @generated
	 */
	void setNomEtRangResponsable(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Vaut Pour Phase Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pour Phase Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pour Phase Horaire Manoeuvre</em>' containment reference.
	 * @see #setVautPourPhaseHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_VautPourPhaseHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='VautPourPhase_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getVautPourPhaseHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getVautPourPhaseHoraireManoeuvre <em>Vaut Pour Phase Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pour Phase Horaire Manoeuvre</em>' containment reference.
	 * @see #getVautPourPhaseHoraireManoeuvre()
	 * @generated
	 */
	void setVautPourPhaseHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Precise Consigne Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precise Consigne Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precise Consigne Tir</em>' containment reference.
	 * @see #setPreciseConsigneTir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_PreciseConsigneTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_ConsigneTir'"
	 *        extendedMetaData="kind='element' name='Precise_ConsigneTir'"
	 * @generated
	 */
	TypeAssociation getPreciseConsigneTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getPreciseConsigneTir <em>Precise Consigne Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precise Consigne Tir</em>' containment reference.
	 * @see #getPreciseConsigneTir()
	 * @generated
	 */
	void setPreciseConsigneTir(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Restrictions Usage4 DCoordination4 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Restrictions Usage4 DCoordination4 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Restrictions Usage4 DCoordination4 D</em>' containment reference.
	 * @see #setAPourRestrictionsUsage4DCoordination4D(TypeCoordination4D)
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_APourRestrictionsUsage4DCoordination4D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Coordination4D'"
	 *        extendedMetaData="kind='element' name='APourRestrictionsUsage4D_Coordination4D'"
	 * @generated
	 */
	TypeCoordination4D getAPourRestrictionsUsage4DCoordination4D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeReglementation#getAPourRestrictionsUsage4DCoordination4D <em>APour Restrictions Usage4 DCoordination4 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Restrictions Usage4 DCoordination4 D</em>' containment reference.
	 * @see #getAPourRestrictionsUsage4DCoordination4D()
	 * @generated
	 */
	void setAPourRestrictionsUsage4DCoordination4D(TypeCoordination4D value);

	/**
	 * Returns the value of the '<em><b>Vaut Pour Type Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pour Type Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pour Type Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_VautPourTypeType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='VautPourType_Type'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getVautPourTypeType();

	/**
	 * Returns the value of the '<em><b>Vaut Pour Instance Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pour Instance Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pour Instance Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeReglementation_VautPourInstanceInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='VautPourInstance_InstanceObjet'"
	 * @generated
	 */
	EList<TypeAssociation> getVautPourInstanceInstanceObjet();

} // TypeReglementation
