/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAltitudePression;
import mpia.meta.TypeDataTypeDuree;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mise En Place Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMiseEnPlaceTir#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlaceTir#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlaceTir#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlaceTir#getIntervalleEntrePiecesOuEntreCoups <em>Intervalle Entre Pieces Ou Entre Coups</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlaceTir#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlaceTir#getAPourModalitesDeclenchementDeclenchementTir <em>APour Modalites Declenchement Declenchement Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlaceTir#getAPourMunitionsTypeMunition <em>APour Munitions Type Munition</em>}</li>
 *   <li>{@link mpia.schema.TypeMiseEnPlaceTir#getAPourLocalisationMiseEnPlaceLocalisationGeometrique2D <em>APour Localisation Mise En Place Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MiseEnPlaceTir' kind='elementOnly'"
 * @generated
 */
public interface TypeMiseEnPlaceTir extends EObject {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(TypeDataTypeAltitudePression)
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir_Altitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Altitude'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(TypeDataTypeAltitudePression value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir_ModalitesMiseEnPlace()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModalitesMiseEnPlace'"
	 * @generated
	 */
	TypeDictionaryDicoModalitesMiseEnPlace getModalitesMiseEnPlace();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModalitesMiseEnPlace()
	 * @see #getModalitesMiseEnPlace()
	 * @see #setModalitesMiseEnPlace(TypeDictionaryDicoModalitesMiseEnPlace)
	 * @generated
	 */
	void unsetModalitesMiseEnPlace();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getModalitesMiseEnPlace <em>Modalites Mise En Place</em>}' attribute is set.
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
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir_ModeFonctionnementFusee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeFonctionnementFusee'"
	 * @generated
	 */
	TypeDictionaryDicoModeFonctionnementFusee getModeFonctionnementFusee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeFonctionnementFusee()
	 * @see #getModeFonctionnementFusee()
	 * @see #setModeFonctionnementFusee(TypeDictionaryDicoModeFonctionnementFusee)
	 * @generated
	 */
	void unsetModeFonctionnementFusee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getModeFonctionnementFusee <em>Mode Fonctionnement Fusee</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Intervalle Entre Pieces Ou Entre Coups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intervalle Entre Pieces Ou Entre Coups</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intervalle Entre Pieces Ou Entre Coups</em>' containment reference.
	 * @see #setIntervalleEntrePiecesOuEntreCoups(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir_IntervalleEntrePiecesOuEntreCoups()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IntervalleEntrePiecesOuEntreCoups'"
	 * @generated
	 */
	TypeDataTypeDuree getIntervalleEntrePiecesOuEntreCoups();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getIntervalleEntrePiecesOuEntreCoups <em>Intervalle Entre Pieces Ou Entre Coups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intervalle Entre Pieces Ou Entre Coups</em>' containment reference.
	 * @see #getIntervalleEntrePiecesOuEntreCoups()
	 * @generated
	 */
	void setIntervalleEntrePiecesOuEntreCoups(TypeDataTypeDuree value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir_NombreCoupsParPiece()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreCoupsParPiece'"
	 * @generated
	 */
	long getNombreCoupsParPiece();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute.
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
	 * Unsets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreCoupsParPiece()
	 * @see #getNombreCoupsParPiece()
	 * @see #setNombreCoupsParPiece(long)
	 * @generated
	 */
	void unsetNombreCoupsParPiece();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getNombreCoupsParPiece <em>Nombre Coups Par Piece</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>APour Modalites Declenchement Declenchement Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Modalites Declenchement Declenchement Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Modalites Declenchement Declenchement Tir</em>' containment reference.
	 * @see #setAPourModalitesDeclenchementDeclenchementTir(TypeDeclenchementTir)
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir_APourModalitesDeclenchementDeclenchementTir()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DeclenchementTir'"
	 *        extendedMetaData="kind='element' name='APourModalitesDeclenchement_DeclenchementTir'"
	 * @generated
	 */
	TypeDeclenchementTir getAPourModalitesDeclenchementDeclenchementTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getAPourModalitesDeclenchementDeclenchementTir <em>APour Modalites Declenchement Declenchement Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Modalites Declenchement Declenchement Tir</em>' containment reference.
	 * @see #getAPourModalitesDeclenchementDeclenchementTir()
	 * @generated
	 */
	void setAPourModalitesDeclenchementDeclenchementTir(TypeDeclenchementTir value);

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
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir_APourMunitionsTypeMunition()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMunition'"
	 *        extendedMetaData="kind='element' name='APourMunitions_TypeMunition'"
	 * @generated
	 */
	TypeAssociationEXT getAPourMunitionsTypeMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getAPourMunitionsTypeMunition <em>APour Munitions Type Munition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Munitions Type Munition</em>' containment reference.
	 * @see #getAPourMunitionsTypeMunition()
	 * @generated
	 */
	void setAPourMunitionsTypeMunition(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Localisation Mise En Place Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Mise En Place Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Mise En Place Localisation Geometrique2 D</em>' containment reference.
	 * @see #setAPourLocalisationMiseEnPlaceLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypeMiseEnPlaceTir_APourLocalisationMiseEnPlaceLocalisationGeometrique2D()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='APourLocalisationMiseEnPlace_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getAPourLocalisationMiseEnPlaceLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMiseEnPlaceTir#getAPourLocalisationMiseEnPlaceLocalisationGeometrique2D <em>APour Localisation Mise En Place Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Mise En Place Localisation Geometrique2 D</em>' containment reference.
	 * @see #getAPourLocalisationMiseEnPlaceLocalisationGeometrique2D()
	 * @generated
	 */
	void setAPourLocalisationMiseEnPlaceLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

} // TypeMiseEnPlaceTir
