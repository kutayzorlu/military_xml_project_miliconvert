/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Besoin Raccordement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeBesoinRaccordement#getBesoinLiaison <em>Besoin Liaison</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinRaccordement#getNatureLiaison <em>Nature Liaison</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinRaccordement#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinRaccordement#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinRaccordement#getMoyens <em>Moyens</em>}</li>
 *   <li>{@link mpia.schema.TypeBesoinRaccordement#getAPourUniteRaccordeUnite <em>APour Unite Raccorde Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeBesoinRaccordement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_BesoinRaccordement' kind='elementOnly'"
 * @generated
 */
public interface TypeBesoinRaccordement extends EObject {
	/**
	 * Returns the value of the '<em><b>Besoin Liaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Besoin Liaison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Besoin Liaison</em>' attribute.
	 * @see #setBesoinLiaison(String)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinRaccordement_BesoinLiaison()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='BesoinLiaison'"
	 * @generated
	 */
	String getBesoinLiaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinRaccordement#getBesoinLiaison <em>Besoin Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besoin Liaison</em>' attribute.
	 * @see #getBesoinLiaison()
	 * @generated
	 */
	void setBesoinLiaison(String value);

	/**
	 * Returns the value of the '<em><b>Nature Liaison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Liaison</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Liaison</em>' attribute.
	 * @see #setNatureLiaison(String)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinRaccordement_NatureLiaison()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='NatureLiaison'"
	 * @generated
	 */
	String getNatureLiaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinRaccordement#getNatureLiaison <em>Nature Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Liaison</em>' attribute.
	 * @see #getNatureLiaison()
	 * @generated
	 */
	void setNatureLiaison(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeBesoinRaccordement_DateDebut()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateDebut'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateDebut();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinRaccordement#getDateDebut <em>Date Debut</em>}' containment reference.
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
	 * @see mpia.schema.SchemaPackage#getTypeBesoinRaccordement_DateFin()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateFin'"
	 * @generated
	 */
	TypeDataTypeDateHeure getDateFin();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinRaccordement#getDateFin <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' containment reference.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(TypeDataTypeDateHeure value);

	/**
	 * Returns the value of the '<em><b>Moyens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moyens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moyens</em>' attribute.
	 * @see #setMoyens(String)
	 * @see mpia.schema.SchemaPackage#getTypeBesoinRaccordement_Moyens()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='Moyens'"
	 * @generated
	 */
	String getMoyens();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeBesoinRaccordement#getMoyens <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moyens</em>' attribute.
	 * @see #getMoyens()
	 * @generated
	 */
	void setMoyens(String value);

	/**
	 * Returns the value of the '<em><b>APour Unite Raccorde Unite</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Unite Raccorde Unite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Unite Raccorde Unite</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeBesoinRaccordement_APourUniteRaccordeUnite()
	 * @model containment="true" lower="2" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourUniteRaccorde_Unite'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourUniteRaccordeUnite();

} // TypeBesoinRaccordement
