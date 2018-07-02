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
 * A representation of the model object '<em><b>Type Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModule#getNombreAeronefs <em>Nombre Aeronefs</em>}</li>
 *   <li>{@link mpia.schema.TypeModule#getEstTypeTypeAeronef <em>Est Type Type Aeronef</em>}</li>
 *   <li>{@link mpia.schema.TypeModule#getEstSpecifieParTypeIntervenant3D <em>Est Specifie Par Type Intervenant3 D</em>}</li>
 *   <li>{@link mpia.schema.TypeModule#getACommeTrajetPhaseTrajet <em>AComme Trajet Phase Trajet</em>}</li>
 *   <li>{@link mpia.schema.TypeModule#getAPourResponsableUnite <em>APour Responsable Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeModule#getAPourVolLeaderVol <em>APour Vol Leader Vol</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModule()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_Module' kind='elementOnly'"
 * @generated
 */
public interface TypeModule extends TypeEntiteOrganisationnelle {
	/**
	 * Returns the value of the '<em><b>Nombre Aeronefs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Aeronefs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Aeronefs</em>' attribute.
	 * @see #isSetNombreAeronefs()
	 * @see #unsetNombreAeronefs()
	 * @see #setNombreAeronefs(long)
	 * @see mpia.schema.SchemaPackage#getTypeModule_NombreAeronefs()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreAeronefs'"
	 * @generated
	 */
	long getNombreAeronefs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModule#getNombreAeronefs <em>Nombre Aeronefs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Aeronefs</em>' attribute.
	 * @see #isSetNombreAeronefs()
	 * @see #unsetNombreAeronefs()
	 * @see #getNombreAeronefs()
	 * @generated
	 */
	void setNombreAeronefs(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModule#getNombreAeronefs <em>Nombre Aeronefs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreAeronefs()
	 * @see #getNombreAeronefs()
	 * @see #setNombreAeronefs(long)
	 * @generated
	 */
	void unsetNombreAeronefs();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModule#getNombreAeronefs <em>Nombre Aeronefs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Aeronefs</em>' attribute is set.
	 * @see #unsetNombreAeronefs()
	 * @see #getNombreAeronefs()
	 * @see #setNombreAeronefs(long)
	 * @generated
	 */
	boolean isSetNombreAeronefs();

	/**
	 * Returns the value of the '<em><b>Est Type Type Aeronef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Type Type Aeronef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Type Type Aeronef</em>' containment reference.
	 * @see #setEstTypeTypeAeronef(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeModule_EstTypeTypeAeronef()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeAeronef'"
	 *        extendedMetaData="kind='element' name='EstType_TypeAeronef'"
	 * @generated
	 */
	TypeAssociationEXT getEstTypeTypeAeronef();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModule#getEstTypeTypeAeronef <em>Est Type Type Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Type Type Aeronef</em>' containment reference.
	 * @see #getEstTypeTypeAeronef()
	 * @generated
	 */
	void setEstTypeTypeAeronef(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Est Specifie Par Type Intervenant3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Specifie Par Type Intervenant3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Specifie Par Type Intervenant3 D</em>' containment reference.
	 * @see #setEstSpecifieParTypeIntervenant3D(TypeTypeIntervenant3D)
	 * @see mpia.schema.SchemaPackage#getTypeModule_EstSpecifieParTypeIntervenant3D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_TypeIntervenant3D'"
	 *        extendedMetaData="kind='element' name='EstSpecifiePar_TypeIntervenant3D'"
	 * @generated
	 */
	TypeTypeIntervenant3D getEstSpecifieParTypeIntervenant3D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModule#getEstSpecifieParTypeIntervenant3D <em>Est Specifie Par Type Intervenant3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Specifie Par Type Intervenant3 D</em>' containment reference.
	 * @see #getEstSpecifieParTypeIntervenant3D()
	 * @generated
	 */
	void setEstSpecifieParTypeIntervenant3D(TypeTypeIntervenant3D value);

	/**
	 * Returns the value of the '<em><b>AComme Trajet Phase Trajet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypePhaseTrajet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Trajet Phase Trajet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Trajet Phase Trajet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeModule_ACommeTrajetPhaseTrajet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_PhaseTrajet'"
	 *        extendedMetaData="kind='element' name='ACommeTrajet_PhaseTrajet'"
	 * @generated
	 */
	EList<TypePhaseTrajet> getACommeTrajetPhaseTrajet();

	/**
	 * Returns the value of the '<em><b>APour Responsable Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Responsable Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Responsable Unite</em>' containment reference.
	 * @see #setAPourResponsableUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeModule_APourResponsableUnite()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourResponsable_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourResponsableUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModule#getAPourResponsableUnite <em>APour Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Responsable Unite</em>' containment reference.
	 * @see #getAPourResponsableUnite()
	 * @generated
	 */
	void setAPourResponsableUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Vol Leader Vol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Vol Leader Vol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Vol Leader Vol</em>' containment reference.
	 * @see #setAPourVolLeaderVol(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeModule_APourVolLeaderVol()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstVolLeader_Module' target_entity='type_Vol'"
	 *        extendedMetaData="kind='element' name='APourVolLeader_Vol'"
	 * @generated
	 */
	TypeAssociation getAPourVolLeaderVol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModule#getAPourVolLeaderVol <em>APour Vol Leader Vol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Vol Leader Vol</em>' containment reference.
	 * @see #getAPourVolLeaderVol()
	 * @generated
	 */
	void setAPourVolLeaderVol(TypeAssociation value);

} // TypeModule
