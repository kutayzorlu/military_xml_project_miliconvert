/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getAPourComportementComportement <em>APour Comportement Comportement</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getEstAffilieAAssociationAffiliationInstanceObjet <em>Est Affilie AAssociation Affiliation Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getEstLocaliseParAssocInstanceObjetLocalisation <em>Est Localise Par Assoc Instance Objet Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getAPourDotationEffectiveDotationEffective <em>APour Dotation Effective Dotation Effective</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getAPourDotationTheoriqueDotationTheoriqueInstanceObjet <em>APour Dotation Theorique Dotation Theorique Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getAssocieCommeAdresseAssociationInstanceObjetAdresse <em>Associe Comme Adresse Association Instance Objet Adresse</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getAssocieCommeObjectifActiviteObjectifActivite <em>Associe Comme Objectif Activite Objectif Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getEstPlaceDansAssocContexteInstanceObjet <em>Est Place Dans Assoc Contexte Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getAPourCapaciteAssociationInstanceObjetCapacite <em>APour Capacite Association Instance Objet Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getAssocieCommeObjectifCiblageObjectifCiblage <em>Associe Comme Objectif Ciblage Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.TypeInstanceObjet#getAPourComptageParActiviteComptageParActivite <em>APour Comptage Par Activite Comptage Par Activite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet()
 * @model abstract="true"
 *        extendedMetaData="name='type_InstanceObjet' kind='elementOnly'"
 * @generated
 */
public interface TypeInstanceObjet extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>APour Comportement Comportement</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeComportement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Comportement Comportement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Comportement Comportement</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_APourComportementComportement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Comportement'"
	 *        extendedMetaData="kind='element' name='APourComportement_Comportement'"
	 * @generated
	 */
	EList<TypeComportement> getAPourComportementComportement();

	/**
	 * Returns the value of the '<em><b>Est Affilie AAssociation Affiliation Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Affilie AAssociation Affiliation Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Affilie AAssociation Affiliation Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_EstAffilieAAssociationAffiliationInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ConcerneInstanceObjet_InstanceObjet' target_entity='type_AssociationAffiliationInstanceObjet'"
	 *        extendedMetaData="kind='element' name='EstAffilieA_AssociationAffiliationInstanceObjet'"
	 * @generated
	 */
	EList<TypeAssociation> getEstAffilieAAssociationAffiliationInstanceObjet();

	/**
	 * Returns the value of the '<em><b>Est Localise Par Assoc Instance Objet Localisation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssocInstanceObjetLocalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise Par Assoc Instance Objet Localisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise Par Assoc Instance Objet Localisation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_EstLocaliseParAssocInstanceObjetLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AssocInstanceObjetLocalisation'"
	 *        extendedMetaData="kind='element' name='EstLocalisePar_AssocInstanceObjetLocalisation'"
	 * @generated
	 */
	EList<TypeAssocInstanceObjetLocalisation> getEstLocaliseParAssocInstanceObjetLocalisation();

	/**
	 * Returns the value of the '<em><b>APour Dotation Effective Dotation Effective</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeDotationEffective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Dotation Effective Dotation Effective</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Dotation Effective Dotation Effective</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_APourDotationEffectiveDotationEffective()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DotationEffective'"
	 *        extendedMetaData="kind='element' name='APourDotationEffective_DotationEffective'"
	 * @generated
	 */
	EList<TypeDotationEffective> getAPourDotationEffectiveDotationEffective();

	/**
	 * Returns the value of the '<em><b>APour Dotation Theorique Dotation Theorique Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Dotation Theorique Dotation Theorique Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Dotation Theorique Dotation Theorique Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_APourDotationTheoriqueDotationTheoriqueInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstDotationTheorique_InstanceObjet' target_entity='type_DotationTheoriqueInstanceObjet'"
	 *        extendedMetaData="kind='element' name='APourDotationTheorique_DotationTheoriqueInstanceObjet'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourDotationTheoriqueDotationTheoriqueInstanceObjet();

	/**
	 * Returns the value of the '<em><b>Associe Comme Adresse Association Instance Objet Adresse</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Adresse Association Instance Objet Adresse</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Adresse Association Instance Objet Adresse</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_AssocieCommeAdresseAssociationInstanceObjetAdresse()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_InstanceObjet' target_entity='type_AssociationInstanceObjetAdresse'"
	 *        extendedMetaData="kind='element' name='AssocieCommeAdresse_AssociationInstanceObjetAdresse'"
	 * @generated
	 */
	EList<TypeAssociation> getAssocieCommeAdresseAssociationInstanceObjetAdresse();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objectif Activite Objectif Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objectif Activite Objectif Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objectif Activite Objectif Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_AssocieCommeObjectifActiviteObjectifActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeInstanceObjet_InstanceObjet' target_entity='type_ObjectifActivite'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjectifActivite_ObjectifActivite'"
	 * @generated
	 */
	EList<TypeAssociation> getAssocieCommeObjectifActiviteObjectifActivite();

	/**
	 * Returns the value of the '<em><b>Est Place Dans Assoc Contexte Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Place Dans Assoc Contexte Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Place Dans Assoc Contexte Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_EstPlaceDansAssocContexteInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeInstanceObjet_InstanceObjet' target_entity='type_AssocContexteInstanceObjet'"
	 *        extendedMetaData="kind='element' name='EstPlaceDans_AssocContexteInstanceObjet'"
	 * @generated
	 */
	EList<TypeAssociation> getEstPlaceDansAssocContexteInstanceObjet();

	/**
	 * Returns the value of the '<em><b>APour Capacite Association Instance Objet Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Capacite Association Instance Objet Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Capacite Association Instance Objet Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_APourCapaciteAssociationInstanceObjetCapacite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCapacite_InstanceObjet' target_entity='type_AssociationInstanceObjetCapacite'"
	 *        extendedMetaData="kind='element' name='APourCapacite_AssociationInstanceObjetCapacite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourCapaciteAssociationInstanceObjetCapacite();

	/**
	 * Returns the value of the '<em><b>Associe Comme Objectif Ciblage Objectif Ciblage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Objectif Ciblage Objectif Ciblage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Objectif Ciblage Objectif Ciblage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_AssocieCommeObjectifCiblageObjectifCiblage()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeInstanceObjet_InstanceObjet' target_entity='type_ObjectifCiblage'"
	 *        extendedMetaData="kind='element' name='AssocieCommeObjectifCiblage_ObjectifCiblage'"
	 * @generated
	 */
	EList<TypeAssociation> getAssocieCommeObjectifCiblageObjectifCiblage();

	/**
	 * Returns the value of the '<em><b>APour Comptage Par Activite Comptage Par Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeComptageParActivite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Comptage Par Activite Comptage Par Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Comptage Par Activite Comptage Par Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeInstanceObjet_APourComptageParActiviteComptageParActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ComptageParActivite'"
	 *        extendedMetaData="kind='element' name='APourComptageParActivite_ComptageParActivite'"
	 * @generated
	 */
	EList<TypeComptageParActivite> getAPourComptageParActiviteComptageParActivite();

} // TypeInstanceObjet
