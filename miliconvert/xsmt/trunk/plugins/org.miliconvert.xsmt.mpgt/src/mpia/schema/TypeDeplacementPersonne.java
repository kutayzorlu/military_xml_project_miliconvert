/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Deplacement Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDeplacementPersonne#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeDeplacementPersonne#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeDeplacementPersonne#getCodeDeplacement <em>Code Deplacement</em>}</li>
 *   <li>{@link mpia.schema.TypeDeplacementPersonne#getLibelleDeplacement <em>Libelle Deplacement</em>}</li>
 *   <li>{@link mpia.schema.TypeDeplacementPersonne#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDeplacementPersonne#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDeplacementPersonne#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}</li>
 *   <li>{@link mpia.schema.TypeDeplacementPersonne#getAEuLieuDansInstanceObjet <em>AEu Lieu Dans Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_DeplacementPersonne' kind='elementOnly'"
 * @generated
 */
public interface TypeDeplacementPersonne extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Debut</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne_DateDebut()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeplacementPersonne#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Fin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne_DateFin()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	XMLGregorianCalendar getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeplacementPersonne#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Code Deplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Deplacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Deplacement</em>' attribute.
	 * @see #setCodeDeplacement(String)
	 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne_CodeDeplacement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='CodeDeplacement'"
	 * @generated
	 */
	String getCodeDeplacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeplacementPersonne#getCodeDeplacement <em>Code Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Deplacement</em>' attribute.
	 * @see #getCodeDeplacement()
	 * @generated
	 */
	void setCodeDeplacement(String value);

	/**
	 * Returns the value of the '<em><b>Libelle Deplacement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle Deplacement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle Deplacement</em>' attribute.
	 * @see #setLibelleDeplacement(String)
	 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne_LibelleDeplacement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='LibelleDeplacement'"
	 * @generated
	 */
	String getLibelleDeplacement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeplacementPersonne#getLibelleDeplacement <em>Libelle Deplacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle Deplacement</em>' attribute.
	 * @see #getLibelleDeplacement()
	 * @generated
	 */
	void setLibelleDeplacement(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeplacementPersonne#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeplacementPersonne#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Rapporte Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapporte Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #setEstRapporteParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne_EstRapporteParRapport()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapportePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDeplacementPersonne#getEstRapporteParRapport <em>Est Rapporte Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapporte Par Rapport</em>' containment reference.
	 * @see #getEstRapporteParRapport()
	 * @generated
	 */
	void setEstRapporteParRapport(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>AEu Lieu Dans Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AEu Lieu Dans Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AEu Lieu Dans Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDeplacementPersonne_AEuLieuDansInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_InstanceObjet'"
	 *        extendedMetaData="kind='element' name='AEuLieuDans_InstanceObjet'"
	 * @generated
	 */
	EList<TypeAssociation> getAEuLieuDansInstanceObjet();

} // TypeDeplacementPersonne
