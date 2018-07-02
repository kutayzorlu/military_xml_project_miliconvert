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
 * A representation of the model object '<em><b>Type Dotation Theorique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getTypeOperation <em>Type Operation</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getEnvironnement <em>Environnement</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getDateValidite <em>Date Validite</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getEstSpecifieAuTraversCompositionDotationTheoriqueEnType <em>Est Specifie Au Travers Composition Dotation Theorique En Type</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getSpecifieCompositionType <em>Specifie Composition Type</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getEstAffecteAuTraversDotationTheoriqueInstanceObjet <em>Est Affecte Au Travers Dotation Theorique Instance Objet</em>}</li>
 *   <li>{@link mpia.schema.TypeDotationTheorique#getEstDotationTheoriqueAssociationProfilDotationTheorique <em>Est Dotation Theorique Association Profil Dotation Theorique</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DotationTheorique' kind='elementOnly'"
 * @generated
 */
public interface TypeDotationTheorique extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_Nom()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        annotation="urn:MPIA-schemaInfo operational_key='true'"
	 *        extendedMetaData="kind='element' name='Nom'"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheorique#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDotationTheoriqueCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationTheoriqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDotationTheoriqueCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_Categorie()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoDotationTheoriqueCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheorique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationTheoriqueCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoDotationTheoriqueCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationTheorique#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDotationTheoriqueCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationTheorique#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDotationTheoriqueCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Type Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDotationTheoriqueTypeOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Operation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationTheoriqueTypeOperation
	 * @see #isSetTypeOperation()
	 * @see #unsetTypeOperation()
	 * @see #setTypeOperation(TypeDictionaryDicoDotationTheoriqueTypeOperation)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_TypeOperation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeOperation'"
	 * @generated
	 */
	TypeDictionaryDicoDotationTheoriqueTypeOperation getTypeOperation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheorique#getTypeOperation <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Operation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationTheoriqueTypeOperation
	 * @see #isSetTypeOperation()
	 * @see #unsetTypeOperation()
	 * @see #getTypeOperation()
	 * @generated
	 */
	void setTypeOperation(TypeDictionaryDicoDotationTheoriqueTypeOperation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationTheorique#getTypeOperation <em>Type Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeOperation()
	 * @see #getTypeOperation()
	 * @see #setTypeOperation(TypeDictionaryDicoDotationTheoriqueTypeOperation)
	 * @generated
	 */
	void unsetTypeOperation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationTheorique#getTypeOperation <em>Type Operation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Operation</em>' attribute is set.
	 * @see #unsetTypeOperation()
	 * @see #getTypeOperation()
	 * @see #setTypeOperation(TypeDictionaryDicoDotationTheoriqueTypeOperation)
	 * @generated
	 */
	boolean isSetTypeOperation();

	/**
	 * Returns the value of the '<em><b>Environnement</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDotationTheoriqueEnvironnement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationTheoriqueEnvironnement
	 * @see #isSetEnvironnement()
	 * @see #unsetEnvironnement()
	 * @see #setEnvironnement(TypeDictionaryDicoDotationTheoriqueEnvironnement)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_Environnement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Environnement'"
	 * @generated
	 */
	TypeDictionaryDicoDotationTheoriqueEnvironnement getEnvironnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheorique#getEnvironnement <em>Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environnement</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDotationTheoriqueEnvironnement
	 * @see #isSetEnvironnement()
	 * @see #unsetEnvironnement()
	 * @see #getEnvironnement()
	 * @generated
	 */
	void setEnvironnement(TypeDictionaryDicoDotationTheoriqueEnvironnement value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDotationTheorique#getEnvironnement <em>Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnvironnement()
	 * @see #getEnvironnement()
	 * @see #setEnvironnement(TypeDictionaryDicoDotationTheoriqueEnvironnement)
	 * @generated
	 */
	void unsetEnvironnement();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDotationTheorique#getEnvironnement <em>Environnement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Environnement</em>' attribute is set.
	 * @see #unsetEnvironnement()
	 * @see #getEnvironnement()
	 * @see #setEnvironnement(TypeDictionaryDicoDotationTheoriqueEnvironnement)
	 * @generated
	 */
	boolean isSetEnvironnement();

	/**
	 * Returns the value of the '<em><b>Date Validite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Validite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Validite</em>' attribute.
	 * @see #setDateValidite(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_DateValidite()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateValidite'"
	 * @generated
	 */
	XMLGregorianCalendar getDateValidite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheorique#getDateValidite <em>Date Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Validite</em>' attribute.
	 * @see #getDateValidite()
	 * @generated
	 */
	void setDateValidite(XMLGregorianCalendar value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheorique#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheorique#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Est Specifie Au Travers Composition Dotation Theorique En Type</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Specifie Au Travers Composition Dotation Theorique En Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Specifie Au Travers Composition Dotation Theorique En Type</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_EstSpecifieAuTraversCompositionDotationTheoriqueEnType()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstComposant_DotationTheorique' target_entity='type_CompositionDotationTheoriqueEnType'"
	 *        extendedMetaData="kind='element' name='EstSpecifieAuTravers_CompositionDotationTheoriqueEnType'"
	 * @generated
	 */
	EList<TypeAssociation> getEstSpecifieAuTraversCompositionDotationTheoriqueEnType();

	/**
	 * Returns the value of the '<em><b>Specifie Composition Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifie Composition Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifie Composition Type</em>' containment reference.
	 * @see #setSpecifieCompositionType(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_SpecifieCompositionType()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstCompose_DotationTheorique' target_entity='type_Type'"
	 *        extendedMetaData="kind='element' name='SpecifieComposition_Type'"
	 * @generated
	 */
	TypeAssociation getSpecifieCompositionType();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDotationTheorique#getSpecifieCompositionType <em>Specifie Composition Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifie Composition Type</em>' containment reference.
	 * @see #getSpecifieCompositionType()
	 * @generated
	 */
	void setSpecifieCompositionType(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Est Affecte Au Travers Dotation Theorique Instance Objet</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Affecte Au Travers Dotation Theorique Instance Objet</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Affecte Au Travers Dotation Theorique Instance Objet</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_EstAffecteAuTraversDotationTheoriqueInstanceObjet()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeDotation_DotationTheorique' target_entity='type_DotationTheoriqueInstanceObjet'"
	 *        extendedMetaData="kind='element' name='EstAffecteAuTravers_DotationTheoriqueInstanceObjet'"
	 * @generated
	 */
	EList<TypeAssociation> getEstAffecteAuTraversDotationTheoriqueInstanceObjet();

	/**
	 * Returns the value of the '<em><b>Est Dotation Theorique Association Profil Dotation Theorique</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Dotation Theorique Association Profil Dotation Theorique</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Dotation Theorique Association Profil Dotation Theorique</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeDotationTheorique_EstDotationTheoriqueAssociationProfilDotationTheorique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='AssocieCommeDotationTheorique_DotationTheorique' target_entity='type_AssociationProfilDotationTheorique'"
	 *        extendedMetaData="kind='element' name='EstDotationTheorique_AssociationProfilDotationTheorique'"
	 * @generated
	 */
	EList<TypeAssociation> getEstDotationTheoriqueAssociationProfilDotationTheorique();

} // TypeDotationTheorique
