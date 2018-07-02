/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Quantite Moyens Tir ASS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeQuantiteMoyensTirASS#getNombreSectionsTir <em>Nombre Sections Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMoyensTirASS#getNombrePieces <em>Nombre Pieces</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMoyensTirASS#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMoyensTirASS#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeQuantiteMoyensTirASS#getAPourTypeDeLanceurTypeArme <em>APour Type De Lanceur Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeQuantiteMoyensTirASS()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_QuantiteMoyensTirASS' kind='elementOnly'"
 * @generated
 */
public interface TypeQuantiteMoyensTirASS extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre Sections Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Sections Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Sections Tir</em>' attribute.
	 * @see #isSetNombreSectionsTir()
	 * @see #unsetNombreSectionsTir()
	 * @see #setNombreSectionsTir(long)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMoyensTirASS_NombreSectionsTir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreSectionsTir'"
	 * @generated
	 */
	long getNombreSectionsTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getNombreSectionsTir <em>Nombre Sections Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Sections Tir</em>' attribute.
	 * @see #isSetNombreSectionsTir()
	 * @see #unsetNombreSectionsTir()
	 * @see #getNombreSectionsTir()
	 * @generated
	 */
	void setNombreSectionsTir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getNombreSectionsTir <em>Nombre Sections Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreSectionsTir()
	 * @see #getNombreSectionsTir()
	 * @see #setNombreSectionsTir(long)
	 * @generated
	 */
	void unsetNombreSectionsTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getNombreSectionsTir <em>Nombre Sections Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Sections Tir</em>' attribute is set.
	 * @see #unsetNombreSectionsTir()
	 * @see #getNombreSectionsTir()
	 * @see #setNombreSectionsTir(long)
	 * @generated
	 */
	boolean isSetNombreSectionsTir();

	/**
	 * Returns the value of the '<em><b>Nombre Pieces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Pieces</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Pieces</em>' attribute.
	 * @see #isSetNombrePieces()
	 * @see #unsetNombrePieces()
	 * @see #setNombrePieces(long)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMoyensTirASS_NombrePieces()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombrePieces'"
	 * @generated
	 */
	long getNombrePieces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getNombrePieces <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Pieces</em>' attribute.
	 * @see #isSetNombrePieces()
	 * @see #unsetNombrePieces()
	 * @see #getNombrePieces()
	 * @generated
	 */
	void setNombrePieces(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getNombrePieces <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePieces()
	 * @see #getNombrePieces()
	 * @see #setNombrePieces(long)
	 * @generated
	 */
	void unsetNombrePieces();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getNombrePieces <em>Nombre Pieces</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Pieces</em>' attribute is set.
	 * @see #unsetNombrePieces()
	 * @see #getNombrePieces()
	 * @see #setNombrePieces(long)
	 * @generated
	 */
	boolean isSetNombrePieces();

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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMoyensTirASS_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMoyensTirASS_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>APour Type De Lanceur Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type De Lanceur Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type De Lanceur Type Arme</em>' containment reference.
	 * @see #setAPourTypeDeLanceurTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeQuantiteMoyensTirASS_APourTypeDeLanceurTypeArme()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='APourTypeDeLanceur_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getAPourTypeDeLanceurTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeQuantiteMoyensTirASS#getAPourTypeDeLanceurTypeArme <em>APour Type De Lanceur Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Type De Lanceur Type Arme</em>' containment reference.
	 * @see #getAPourTypeDeLanceurTypeArme()
	 * @generated
	 */
	void setAPourTypeDeLanceurTypeArme(TypeAssociationEXT value);

} // TypeQuantiteMoyensTirASS
