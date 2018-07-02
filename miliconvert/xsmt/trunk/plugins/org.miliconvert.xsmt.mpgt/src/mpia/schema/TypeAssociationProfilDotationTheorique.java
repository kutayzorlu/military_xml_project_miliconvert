/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Association Profil Dotation Theorique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssociationProfilDotationTheorique#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilDotationTheorique#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilDotationTheorique#getQuantiteDisponible <em>Quantite Disponible</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilDotationTheorique#getAssocieCommeProfilProfil <em>Associe Comme Profil Profil</em>}</li>
 *   <li>{@link mpia.schema.TypeAssociationProfilDotationTheorique#getAssocieCommeDotationTheoriqueDotationTheorique <em>Associe Comme Dotation Theorique Dotation Theorique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilDotationTheorique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_AssociationProfilDotationTheorique' kind='elementOnly'"
 * @generated
 */
public interface TypeAssociationProfilDotationTheorique extends EObject {
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilDotationTheorique_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilDotationTheorique#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilDotationTheorique_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilDotationTheorique#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Quantite Disponible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Disponible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Disponible</em>' attribute.
	 * @see #isSetQuantiteDisponible()
	 * @see #unsetQuantiteDisponible()
	 * @see #setQuantiteDisponible(long)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilDotationTheorique_QuantiteDisponible()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier9"
	 *        extendedMetaData="kind='element' name='QuantiteDisponible'"
	 * @generated
	 */
	long getQuantiteDisponible();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilDotationTheorique#getQuantiteDisponible <em>Quantite Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Disponible</em>' attribute.
	 * @see #isSetQuantiteDisponible()
	 * @see #unsetQuantiteDisponible()
	 * @see #getQuantiteDisponible()
	 * @generated
	 */
	void setQuantiteDisponible(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssociationProfilDotationTheorique#getQuantiteDisponible <em>Quantite Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteDisponible()
	 * @see #getQuantiteDisponible()
	 * @see #setQuantiteDisponible(long)
	 * @generated
	 */
	void unsetQuantiteDisponible();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssociationProfilDotationTheorique#getQuantiteDisponible <em>Quantite Disponible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Disponible</em>' attribute is set.
	 * @see #unsetQuantiteDisponible()
	 * @see #getQuantiteDisponible()
	 * @see #setQuantiteDisponible(long)
	 * @generated
	 */
	boolean isSetQuantiteDisponible();

	/**
	 * Returns the value of the '<em><b>Associe Comme Profil Profil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Profil Profil</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Profil Profil</em>' containment reference.
	 * @see #setAssocieCommeProfilProfil(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilDotationTheorique_AssocieCommeProfilProfil()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstProfil_AssociationProfilDotationTheorique' target_entity='type_Profil'"
	 *        extendedMetaData="kind='element' name='AssocieCommeProfil_Profil'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeProfilProfil();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilDotationTheorique#getAssocieCommeProfilProfil <em>Associe Comme Profil Profil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Profil Profil</em>' containment reference.
	 * @see #getAssocieCommeProfilProfil()
	 * @generated
	 */
	void setAssocieCommeProfilProfil(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Associe Comme Dotation Theorique Dotation Theorique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associe Comme Dotation Theorique Dotation Theorique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associe Comme Dotation Theorique Dotation Theorique</em>' containment reference.
	 * @see #setAssocieCommeDotationTheoriqueDotationTheorique(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssociationProfilDotationTheorique_AssocieCommeDotationTheoriqueDotationTheorique()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstDotationTheorique_AssociationProfilDotationTheorique' target_entity='type_DotationTheorique'"
	 *        extendedMetaData="kind='element' name='AssocieCommeDotationTheorique_DotationTheorique'"
	 * @generated
	 */
	TypeAssociation getAssocieCommeDotationTheoriqueDotationTheorique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssociationProfilDotationTheorique#getAssocieCommeDotationTheoriqueDotationTheorique <em>Associe Comme Dotation Theorique Dotation Theorique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associe Comme Dotation Theorique Dotation Theorique</em>' containment reference.
	 * @see #getAssocieCommeDotationTheoriqueDotationTheorique()
	 * @generated
	 */
	void setAssocieCommeDotationTheoriqueDotationTheorique(TypeAssociation value);

} // TypeAssociationProfilDotationTheorique
