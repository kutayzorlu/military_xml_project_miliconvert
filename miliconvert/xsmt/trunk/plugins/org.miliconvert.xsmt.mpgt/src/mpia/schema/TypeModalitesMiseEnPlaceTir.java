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
 * A representation of the model object '<em><b>Type Modalites Mise En Place Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getIntervalleEntrePiecesOuEntreCoups <em>Intervalle Entre Pieces Ou Entre Coups</em>}</li>
 *   <li>{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getAPourMunitionsTypeMunition <em>APour Munitions Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModalitesMiseEnPlaceTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModalitesMiseEnPlaceTir' kind='elementOnly'"
 * @generated
 */
public interface TypeModalitesMiseEnPlaceTir extends EObject {
	/**
	 * Returns the value of the '<em><b>Modalites Mise En Place</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModalitesMiseEnPlace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalites Mise En Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalites Mise En Place</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModalitesMiseEnPlace
	 * @see #isSetModalitesMiseEnPlace()
	 * @see #unsetModalitesMiseEnPlace()
	 * @see #setModalitesMiseEnPlace(TypeDictionaryDicoModalitesMiseEnPlace)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesMiseEnPlaceTir_ModalitesMiseEnPlace()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ModalitesMiseEnPlace'"
	 * @generated
	 */
	TypeDictionaryDicoModalitesMiseEnPlace getModalitesMiseEnPlace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalites Mise En Place</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModalitesMiseEnPlace
	 * @see #isSetModalitesMiseEnPlace()
	 * @see #unsetModalitesMiseEnPlace()
	 * @see #getModalitesMiseEnPlace()
	 * @generated
	 */
	void setModalitesMiseEnPlace(TypeDictionaryDicoModalitesMiseEnPlace value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModalitesMiseEnPlace()
	 * @see #getModalitesMiseEnPlace()
	 * @see #setModalitesMiseEnPlace(TypeDictionaryDicoModalitesMiseEnPlace)
	 * @generated
	 */
	void unsetModalitesMiseEnPlace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modalites Mise En Place</em>' attribute is set.
	 * @see #unsetModalitesMiseEnPlace()
	 * @see #getModalitesMiseEnPlace()
	 * @see #setModalitesMiseEnPlace(TypeDictionaryDicoModalitesMiseEnPlace)
	 * @generated
	 */
	boolean isSetModalitesMiseEnPlace();

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
	 * @see mpia.schema.SchemaPackage#getTypeModalitesMiseEnPlaceTir_ModeFonctionnementFusee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeFonctionnementFusee'"
	 * @generated
	 */
	TypeDictionaryDicoModeFonctionnementFusee getModeFonctionnementFusee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeFonctionnementFusee()
	 * @see #getModeFonctionnementFusee()
	 * @see #setModeFonctionnementFusee(TypeDictionaryDicoModeFonctionnementFusee)
	 * @generated
	 */
	void unsetModeFonctionnementFusee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeModalitesMiseEnPlaceTir_NombreCoupsParPiece()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NombreCoupsParPiece'"
	 * @generated
	 */
	long getNombreCoupsParPiece();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreCoupsParPiece()
	 * @see #getNombreCoupsParPiece()
	 * @see #setNombreCoupsParPiece(long)
	 * @generated
	 */
	void unsetNombreCoupsParPiece();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Intervalle Entre Pieces Ou Entre Coups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Entre Pieces Ou Entre Coups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Entre Pieces Ou Entre Coups</em>' containment reference.
	 * @see #setIntervalleEntrePiecesOuEntreCoups(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeModalitesMiseEnPlaceTir_IntervalleEntrePiecesOuEntreCoups()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IntervalleEntrePiecesOuEntreCoups'"
	 * @generated
	 */
	TypeDataTypeDuree getIntervalleEntrePiecesOuEntreCoups();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getIntervalleEntrePiecesOuEntreCoups <em>Intervalle Entre Pieces Ou Entre Coups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Entre Pieces Ou Entre Coups</em>' containment reference.
	 * @see #getIntervalleEntrePiecesOuEntreCoups()
	 * @generated
	 */
	void setIntervalleEntrePiecesOuEntreCoups(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeModalitesMiseEnPlaceTir_APourMunitionsTypeMunition()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMunition'"
	 *        extendedMetaData="kind='element' name='APourMunitions_TypeMunition'"
	 * @generated
	 */
	TypeAssociationEXT getAPourMunitionsTypeMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModalitesMiseEnPlaceTir#getAPourMunitionsTypeMunition <em>APour Munitions Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Munitions Type Munition</em>' containment reference.
	 * @see #getAPourMunitionsTypeMunition()
	 * @generated
	 */
	void setAPourMunitionsTypeMunition(TypeAssociationEXT value);

} // TypeModalitesMiseEnPlaceTir
