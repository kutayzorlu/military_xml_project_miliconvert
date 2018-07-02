/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Detachement Non Identifie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDetachementNonIdentifie#getTypeDetach <em>Type Detach</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementNonIdentifie#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementNonIdentifie#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementNonIdentifie#getMoyensPersonnel <em>Moyens Personnel</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementNonIdentifie#getMoyensEnMateriel <em>Moyens En Materiel</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementNonIdentifie#getModaliteMission <em>Modalite Mission</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementNonIdentifie#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDetachementNonIdentifie#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DetachementNonIdentifie' kind='elementOnly'"
 * @generated
 */
public interface TypeDetachementNonIdentifie extends TypePrelevementDetachement {
	/**
	 * Returns the value of the '<em><b>Type Detach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Detach</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Detach</em>' attribute.
	 * @see #setTypeDetach(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie_TypeDetach()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080" required="true"
	 *        extendedMetaData="kind='element' name='TypeDetach'"
	 * @generated
	 */
	String getTypeDetach();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementNonIdentifie#getTypeDetach <em>Type Detach</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Detach</em>' attribute.
	 * @see #getTypeDetach()
	 * @generated
	 */
	void setTypeDetach(String value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' containment reference.
	 * @see #setDateDebut(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie_DateDebut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementNonIdentifie#getDateDebut <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' containment reference.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' containment reference.
	 * @see #setDateFin(TypeDataTypeDateHeure)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie_DateFin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementNonIdentifie#getDateFin <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' containment reference.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Moyens Personnel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens Personnel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens Personnel</em>' attribute.
	 * @see #setMoyensPersonnel(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie_MoyensPersonnel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='MoyensPersonnel'"
	 * @generated
	 */
	String getMoyensPersonnel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementNonIdentifie#getMoyensPersonnel <em>Moyens Personnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens Personnel</em>' attribute.
	 * @see #getMoyensPersonnel()
	 * @generated
	 */
	void setMoyensPersonnel(String value);

	/**
	 * Returns the value of the '<em><b>Moyens En Materiel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens En Materiel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens En Materiel</em>' attribute.
	 * @see #setMoyensEnMateriel(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie_MoyensEnMateriel()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='MoyensEnMateriel'"
	 * @generated
	 */
	String getMoyensEnMateriel();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementNonIdentifie#getMoyensEnMateriel <em>Moyens En Materiel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens En Materiel</em>' attribute.
	 * @see #getMoyensEnMateriel()
	 * @generated
	 */
	void setMoyensEnMateriel(String value);

	/**
	 * Returns the value of the '<em><b>Modalite Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalite Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalite Mission</em>' attribute.
	 * @see #setModaliteMission(String)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie_ModaliteMission()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='ModaliteMission'"
	 * @generated
	 */
	String getModaliteMission();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementNonIdentifie#getModaliteMission <em>Modalite Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalite Mission</em>' attribute.
	 * @see #getModaliteMission()
	 * @generated
	 */
	void setModaliteMission(String value);

	/**
	 * Returns the value of the '<em><b>AComme Unite Fournisseur Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Unite Fournisseur Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Unite Fournisseur Unite</em>' containment reference.
	 * @see #setACommeUniteFournisseurUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie_ACommeUniteFournisseurUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstFourniPour_DetachementNonIdentifie' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeUniteFournisseur_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeUniteFournisseurUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementNonIdentifie#getACommeUniteFournisseurUnite <em>AComme Unite Fournisseur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Unite Fournisseur Unite</em>' containment reference.
	 * @see #getACommeUniteFournisseurUnite()
	 * @generated
	 */
	void setACommeUniteFournisseurUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>AComme Unite Beneficiaire Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference.
	 * @see #setACommeUniteBeneficiaireUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDetachementNonIdentifie_ACommeUniteBeneficiaireUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Beneficie_DetachementNonIdentifie' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='ACommeUniteBeneficiaire_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getACommeUniteBeneficiaireUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDetachementNonIdentifie#getACommeUniteBeneficiaireUnite <em>AComme Unite Beneficiaire Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AComme Unite Beneficiaire Unite</em>' containment reference.
	 * @see #getACommeUniteBeneficiaireUnite()
	 * @generated
	 */
	void setACommeUniteBeneficiaireUnite(TypeAssociationEXT value);

} // TypeDetachementNonIdentifie
