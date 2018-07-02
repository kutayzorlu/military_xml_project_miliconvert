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
 * A representation of the model object '<em><b>Type Activite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeActivite#getAPourComportementComportement <em>APour Comportement Comportement</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getCorrespondAHoraireManoeuvre <em>Correspond AHoraire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getAPourObjectifObjectifActivite <em>APour Objectif Objectif Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getAPourEffetEffet <em>APour Effet Effet</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getEstSujetAssociationActiviteLocalisation <em>Est Sujet Association Activite Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getEstObjetAssociationTemporelleActivite <em>Est Objet Association Temporelle Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getEstSujetAssociationTemporelleActivite <em>Est Sujet Association Temporelle Activite</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getEstAssocieeAPersonne <em>Est Associee APersonne</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getEstActiviteAssociationActiviteCapacite <em>Est Activite Association Activite Capacite</em>}</li>
 *   <li>{@link mpia.schema.TypeActivite#getEstPlaceeDansAssocActiviteContexte <em>Est Placee Dans Assoc Activite Contexte</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeActivite()
 * @model abstract="true"
 *        extendedMetaData="name='type_Activite' kind='elementOnly'"
 * @generated
 */
public interface TypeActivite extends TypeRacineOperationnelle {
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
	 * @see mpia.schema.SchemaPackage#getTypeActivite_APourComportementComportement()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Comportement'"
	 *        extendedMetaData="kind='element' name='APourComportement_Comportement'"
	 * @generated
	 */
	EList<TypeComportement> getAPourComportementComportement();

	/**
	 * Returns the value of the '<em><b>Correspond AHoraire Manoeuvre</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspond AHoraire Manoeuvre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspond AHoraire Manoeuvre</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_CorrespondAHoraireManoeuvre()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ConcerneMissions_Activite' target_entity='type_HoraireManoeuvre'"
	 *        extendedMetaData="kind='element' name='CorrespondA_HoraireManoeuvre'"
	 * @generated
	 */
	EList<TypeAssociation> getCorrespondAHoraireManoeuvre();

	/**
	 * Returns the value of the '<em><b>APour Objectif Objectif Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Objectif Objectif Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Objectif Objectif Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_APourObjectifObjectifActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstObjectifPour_Activite' target_entity='type_ObjectifActivite'"
	 *        extendedMetaData="kind='element' name='APourObjectif_ObjectifActivite'"
	 * @generated
	 */
	EList<TypeAssociation> getAPourObjectifObjectifActivite();

	/**
	 * Returns the value of the '<em><b>APour Effet Effet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeEffet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Effet Effet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Effet Effet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_APourEffetEffet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Effet'"
	 *        extendedMetaData="kind='element' name='APourEffet_Effet'"
	 * @generated
	 */
	EList<TypeEffet> getAPourEffetEffet();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Activite Localisation</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeAssociationActiviteLocalisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Activite Localisation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Activite Localisation</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_EstSujetAssociationActiviteLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_AssociationActiviteLocalisation'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationActiviteLocalisation'"
	 * @generated
	 */
	EList<TypeAssociationActiviteLocalisation> getEstSujetAssociationActiviteLocalisation();

	/**
	 * Returns the value of the '<em><b>Est Objet Association Temporelle Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Objet Association Temporelle Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Objet Association Temporelle Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_EstObjetAssociationTemporelleActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeObjet_Activite' target_entity='type_AssociationTemporelleActivite'"
	 *        extendedMetaData="kind='element' name='EstObjet_AssociationTemporelleActivite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstObjetAssociationTemporelleActivite();

	/**
	 * Returns the value of the '<em><b>Est Sujet Association Temporelle Activite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Sujet Association Temporelle Activite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Sujet Association Temporelle Activite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_EstSujetAssociationTemporelleActivite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeSujet_Activite' target_entity='type_AssociationTemporelleActivite'"
	 *        extendedMetaData="kind='element' name='EstSujet_AssociationTemporelleActivite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSujetAssociationTemporelleActivite();

	/**
	 * Returns the value of the '<em><b>Est Associee APersonne</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Associee APersonne</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Associee APersonne</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_EstAssocieeAPersonne()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstAssocieeA_Activite' target_entity='type_Personne'"
	 *        extendedMetaData="kind='element' name='EstAssocieeA_Personne'"
	 * @generated
	 */
	EList<TypeAssociation> getEstAssocieeAPersonne();

	/**
	 * Returns the value of the '<em><b>Est Activite Association Activite Capacite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Activite Association Activite Capacite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Activite Association Activite Capacite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_EstActiviteAssociationActiviteCapacite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeActivite_Activite' target_entity='type_AssociationActiviteCapacite'"
	 *        extendedMetaData="kind='element' name='EstActivite_AssociationActiviteCapacite'"
	 * @generated
	 */
	EList<TypeAssociation> getEstActiviteAssociationActiviteCapacite();

	/**
	 * Returns the value of the '<em><b>Est Placee Dans Assoc Activite Contexte</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Placee Dans Assoc Activite Contexte</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Placee Dans Assoc Activite Contexte</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeActivite_EstPlaceeDansAssocActiviteContexte()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeActivite_Activite' target_entity='type_AssocActiviteContexte'"
	 *        extendedMetaData="kind='element' name='EstPlaceeDans_AssocActiviteContexte'"
	 * @generated
	 */
	EList<TypeAssociation> getEstPlaceeDansAssocActiviteContexte();

} // TypeActivite
