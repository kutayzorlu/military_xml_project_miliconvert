/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Parametres Imposes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeParametresImposes#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresImposes#getIntervalleEntreCoups <em>Intervalle Entre Coups</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresImposes#getNombrePieces <em>Nombre Pieces</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresImposes#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresImposes#getNombreTotalCoups <em>Nombre Total Coups</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresImposes#getDureeTir <em>Duree Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeParametresImposes#getAPourMunitionsTypeMunition <em>APour Munitions Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeParametresImposes()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ParametresImposes' kind='elementOnly'"
 * @generated
 */
public interface TypeParametresImposes extends EObject {
	/**
	 * Returns the value of the '<em><b>Mode Fonctionnement Fusee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModeFonctionnementFusee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Fonctionnement Fusee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Fonctionnement Fusee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeFonctionnementFusee
	 * @see #isSetModeFonctionnementFusee()
	 * @see #unsetModeFonctionnementFusee()
	 * @see #setModeFonctionnementFusee(TypeDictionaryDicoModeFonctionnementFusee)
	 * @see mpia.schema.SchemaPackage#getTypeParametresImposes_ModeFonctionnementFusee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeFonctionnementFusee'"
	 * @generated
	 */
	TypeDictionaryDicoModeFonctionnementFusee getModeFonctionnementFusee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresImposes#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Fonctionnement Fusee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModeFonctionnementFusee
	 * @see #isSetModeFonctionnementFusee()
	 * @see #unsetModeFonctionnementFusee()
	 * @see #getModeFonctionnementFusee()
	 * @generated
	 */
	void setModeFonctionnementFusee(TypeDictionaryDicoModeFonctionnementFusee value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresImposes#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeFonctionnementFusee()
	 * @see #getModeFonctionnementFusee()
	 * @see #setModeFonctionnementFusee(TypeDictionaryDicoModeFonctionnementFusee)
	 * @generated
	 */
	void unsetModeFonctionnementFusee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresImposes#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Fonctionnement Fusee</em>' attribute is set.
	 * @see #unsetModeFonctionnementFusee()
	 * @see #getModeFonctionnementFusee()
	 * @see #setModeFonctionnementFusee(TypeDictionaryDicoModeFonctionnementFusee)
	 * @generated
	 */
	boolean isSetModeFonctionnementFusee();

	/**
	 * Returns the value of the '<em><b>Intervalle Entre Coups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Entre Coups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Entre Coups</em>' containment reference.
	 * @see #setIntervalleEntreCoups(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeParametresImposes_IntervalleEntreCoups()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntervalleEntreCoups'"
	 * @generated
	 */
	TypeDataTypeDuree getIntervalleEntreCoups();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresImposes#getIntervalleEntreCoups <em>Intervalle Entre Coups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Entre Coups</em>' containment reference.
	 * @see #getIntervalleEntreCoups()
	 * @generated
	 */
	void setIntervalleEntreCoups(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeParametresImposes_NombrePieces()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombrePieces'"
	 * @generated
	 */
	long getNombrePieces();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresImposes#getNombrePieces <em>Nombre Pieces</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeParametresImposes#getNombrePieces <em>Nombre Pieces</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombrePieces()
	 * @see #getNombrePieces()
	 * @see #setNombrePieces(long)
	 * @generated
	 */
	void unsetNombrePieces();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresImposes#getNombrePieces <em>Nombre Pieces</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Nombre Coups Par Piece</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Coups Par Piece</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Coups Par Piece</em>' attribute.
	 * @see #isSetNombreCoupsParPiece()
	 * @see #unsetNombreCoupsParPiece()
	 * @see #setNombreCoupsParPiece(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresImposes_NombreCoupsParPiece()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreCoupsParPiece'"
	 * @generated
	 */
	long getNombreCoupsParPiece();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresImposes#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Coups Par Piece</em>' attribute.
	 * @see #isSetNombreCoupsParPiece()
	 * @see #unsetNombreCoupsParPiece()
	 * @see #getNombreCoupsParPiece()
	 * @generated
	 */
	void setNombreCoupsParPiece(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresImposes#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreCoupsParPiece()
	 * @see #getNombreCoupsParPiece()
	 * @see #setNombreCoupsParPiece(long)
	 * @generated
	 */
	void unsetNombreCoupsParPiece();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresImposes#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Coups Par Piece</em>' attribute is set.
	 * @see #unsetNombreCoupsParPiece()
	 * @see #getNombreCoupsParPiece()
	 * @see #setNombreCoupsParPiece(long)
	 * @generated
	 */
	boolean isSetNombreCoupsParPiece();

	/**
	 * Returns the value of the '<em><b>Nombre Total Coups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Total Coups</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Total Coups</em>' attribute.
	 * @see #isSetNombreTotalCoups()
	 * @see #unsetNombreTotalCoups()
	 * @see #setNombreTotalCoups(long)
	 * @see mpia.schema.SchemaPackage#getTypeParametresImposes_NombreTotalCoups()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreTotalCoups'"
	 * @generated
	 */
	long getNombreTotalCoups();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresImposes#getNombreTotalCoups <em>Nombre Total Coups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Total Coups</em>' attribute.
	 * @see #isSetNombreTotalCoups()
	 * @see #unsetNombreTotalCoups()
	 * @see #getNombreTotalCoups()
	 * @generated
	 */
	void setNombreTotalCoups(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeParametresImposes#getNombreTotalCoups <em>Nombre Total Coups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreTotalCoups()
	 * @see #getNombreTotalCoups()
	 * @see #setNombreTotalCoups(long)
	 * @generated
	 */
	void unsetNombreTotalCoups();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeParametresImposes#getNombreTotalCoups <em>Nombre Total Coups</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Total Coups</em>' attribute is set.
	 * @see #unsetNombreTotalCoups()
	 * @see #getNombreTotalCoups()
	 * @see #setNombreTotalCoups(long)
	 * @generated
	 */
	boolean isSetNombreTotalCoups();

	/**
	 * Returns the value of the '<em><b>Duree Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Tir</em>' containment reference.
	 * @see #setDureeTir(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeParametresImposes_DureeTir()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureeTir'"
	 * @generated
	 */
	TypeDataTypeDuree getDureeTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresImposes#getDureeTir <em>Duree Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Tir</em>' containment reference.
	 * @see #getDureeTir()
	 * @generated
	 */
	void setDureeTir(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>APour Munitions Type Munition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Munitions Type Munition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Munitions Type Munition</em>' containment reference.
	 * @see #setAPourMunitionsTypeMunition(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeParametresImposes_APourMunitionsTypeMunition()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMunition'"
	 *        extendedMetaData="kind='element' name='APourMunitions_TypeMunition'"
	 * @generated
	 */
	TypeAssociationEXT getAPourMunitionsTypeMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeParametresImposes#getAPourMunitionsTypeMunition <em>APour Munitions Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Munitions Type Munition</em>' containment reference.
	 * @see #getAPourMunitionsTypeMunition()
	 * @generated
	 */
	void setAPourMunitionsTypeMunition(TypeAssociationEXT value);

} // TypeParametresImposes
