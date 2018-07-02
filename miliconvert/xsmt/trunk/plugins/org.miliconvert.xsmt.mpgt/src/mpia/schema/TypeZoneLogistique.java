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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Zone Logistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getAutreType <em>Autre Type</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getEchelonLogistique <em>Echelon Logistique</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getComplement <em>Complement</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getAPourLocalisationPCUniteRattacheeLocalisation <em>APour Localisation PC Unite Rattachee Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getAPourPointEntreeAutreElementControle <em>APour Point Entree Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getAPourPosteRenseignementRegulationUnite <em>APour Poste Renseignement Regulation Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getAPourPointEntreeFuturAutreElementControle <em>APour Point Entree Futur Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getAPourArticulationSoutienMedicalArticulationSoutienMedical <em>APour Articulation Soutien Medical Articulation Soutien Medical</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getEstMiseEnPlaceSelonMiseEnPlace <em>Est Mise En Place Selon Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.TypeZoneLogistique#getAPourPointSortieAutreElementControle <em>APour Point Sortie Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_ZoneLogistique' kind='elementOnly'"
 * @generated
 */
public interface TypeZoneLogistique extends TypeElementControle {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneLogistiqueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneLogistiqueType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeDictionaryDicoZoneLogistiqueType)
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeDictionaryDicoZoneLogistiqueType getType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneLogistique#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneLogistiqueType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeDictionaryDicoZoneLogistiqueType value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneLogistique#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoZoneLogistiqueType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneLogistique#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeDictionaryDicoZoneLogistiqueType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Autre Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Type</em>' attribute.
	 * @see #setAutreType(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_AutreType()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='AutreType'"
	 * @generated
	 */
	String getAutreType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneLogistique#getAutreType <em>Autre Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Type</em>' attribute.
	 * @see #getAutreType()
	 * @generated
	 */
	void setAutreType(String value);

	/**
	 * Returns the value of the '<em><b>Echelon Logistique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneLogistiqueEchelonLogistique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Echelon Logistique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Echelon Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneLogistiqueEchelonLogistique
	 * @see #isSetEchelonLogistique()
	 * @see #unsetEchelonLogistique()
	 * @see #setEchelonLogistique(TypeDictionaryDicoZoneLogistiqueEchelonLogistique)
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_EchelonLogistique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EchelonLogistique'"
	 * @generated
	 */
	TypeDictionaryDicoZoneLogistiqueEchelonLogistique getEchelonLogistique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneLogistique#getEchelonLogistique <em>Echelon Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echelon Logistique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneLogistiqueEchelonLogistique
	 * @see #isSetEchelonLogistique()
	 * @see #unsetEchelonLogistique()
	 * @see #getEchelonLogistique()
	 * @generated
	 */
	void setEchelonLogistique(TypeDictionaryDicoZoneLogistiqueEchelonLogistique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeZoneLogistique#getEchelonLogistique <em>Echelon Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEchelonLogistique()
	 * @see #getEchelonLogistique()
	 * @see #setEchelonLogistique(TypeDictionaryDicoZoneLogistiqueEchelonLogistique)
	 * @generated
	 */
	void unsetEchelonLogistique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeZoneLogistique#getEchelonLogistique <em>Echelon Logistique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Echelon Logistique</em>' attribute is set.
	 * @see #unsetEchelonLogistique()
	 * @see #getEchelonLogistique()
	 * @see #setEchelonLogistique(TypeDictionaryDicoZoneLogistiqueEchelonLogistique)
	 * @generated
	 */
	boolean isSetEchelonLogistique();

	/**
	 * Returns the value of the '<em><b>Complement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complement</em>' attribute.
	 * @see #setComplement(String)
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_Complement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine050"
	 *        extendedMetaData="kind='element' name='Complement'"
	 * @generated
	 */
	String getComplement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneLogistique#getComplement <em>Complement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complement</em>' attribute.
	 * @see #getComplement()
	 * @generated
	 */
	void setComplement(String value);

	/**
	 * Returns the value of the '<em><b>APour Localisation PC Unite Rattachee Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation PC Unite Rattachee Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation PC Unite Rattachee Localisation</em>' containment reference.
	 * @see #setAPourLocalisationPCUniteRattacheeLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_APourLocalisationPCUniteRattacheeLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='APourLocalisationPCUniteRattachee_Localisation'"
	 * @generated
	 */
	TypeLocalisation getAPourLocalisationPCUniteRattacheeLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneLogistique#getAPourLocalisationPCUniteRattacheeLocalisation <em>APour Localisation PC Unite Rattachee Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation PC Unite Rattachee Localisation</em>' containment reference.
	 * @see #getAPourLocalisationPCUniteRattacheeLocalisation()
	 * @generated
	 */
	void setAPourLocalisationPCUniteRattacheeLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>APour Point Entree Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Point Entree Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Point Entree Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_APourPointEntreeAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourPointEntree_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourPointEntreeAutreElementControle();

	/**
	 * Returns the value of the '<em><b>Vaut Pour Horaire Manoeuvre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #setVautPourHoraireManoeuvre(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_VautPourHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='VautPour_HoraireManoeuvre'"
	 * @generated
	 */
	TypeAssociation getVautPourHoraireManoeuvre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneLogistique#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaut Pour Horaire Manoeuvre</em>' containment reference.
	 * @see #getVautPourHoraireManoeuvre()
	 * @generated
	 */
	void setVautPourHoraireManoeuvre(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Poste Renseignement Regulation Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Poste Renseignement Regulation Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Poste Renseignement Regulation Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_APourPosteRenseignementRegulationUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourPosteRenseignementRegulation_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourPosteRenseignementRegulationUnite();

	/**
	 * Returns the value of the '<em><b>APour Point Entree Futur Autre Element Controle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Point Entree Futur Autre Element Controle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Point Entree Futur Autre Element Controle</em>' containment reference.
	 * @see #setAPourPointEntreeFuturAutreElementControle(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_APourPointEntreeFuturAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourPointEntreeFutur_AutreElementControle'"
	 * @generated
	 */
	TypeAssociation getAPourPointEntreeFuturAutreElementControle();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneLogistique#getAPourPointEntreeFuturAutreElementControle <em>APour Point Entree Futur Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Point Entree Futur Autre Element Controle</em>' containment reference.
	 * @see #getAPourPointEntreeFuturAutreElementControle()
	 * @generated
	 */
	void setAPourPointEntreeFuturAutreElementControle(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Articulation Soutien Medical Articulation Soutien Medical</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeArticulationSoutienMedical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Articulation Soutien Medical Articulation Soutien Medical</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Articulation Soutien Medical Articulation Soutien Medical</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_APourArticulationSoutienMedicalArticulationSoutienMedical()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ArticulationSoutienMedical'"
	 *        extendedMetaData="kind='element' name='APourArticulationSoutienMedical_ArticulationSoutienMedical'"
	 * @generated
	 */
	EList<TypeArticulationSoutienMedical> getAPourArticulationSoutienMedicalArticulationSoutienMedical();

	/**
	 * Returns the value of the '<em><b>APour Localisation PC Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation PC Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation PC Localisation</em>' containment reference.
	 * @see #setAPourLocalisationPCLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_APourLocalisationPCLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='APourLocalisationPC_Localisation'"
	 * @generated
	 */
	TypeLocalisation getAPourLocalisationPCLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeZoneLogistique#getAPourLocalisationPCLocalisation <em>APour Localisation PC Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation PC Localisation</em>' containment reference.
	 * @see #getAPourLocalisationPCLocalisation()
	 * @generated
	 */
	void setAPourLocalisationPCLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>Est Mise En Place Selon Mise En Place</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMiseEnPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Mise En Place Selon Mise En Place</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Mise En Place Selon Mise En Place</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_EstMiseEnPlaceSelonMiseEnPlace()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MiseEnPlace'"
	 *        extendedMetaData="kind='element' name='EstMiseEnPlaceSelon_MiseEnPlace'"
	 * @generated
	 */
	EList<TypeMiseEnPlace> getEstMiseEnPlaceSelonMiseEnPlace();

	/**
	 * Returns the value of the '<em><b>APour Point Sortie Autre Element Controle</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Point Sortie Autre Element Controle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Point Sortie Autre Element Controle</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeZoneLogistique_APourPointSortieAutreElementControle()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_AutreElementControle'"
	 *        extendedMetaData="kind='element' name='APourPointSortie_AutreElementControle'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourPointSortieAutreElementControle();

} // TypeZoneLogistique
