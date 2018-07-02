/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeLongueur;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Evenement Arme Nucleaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getDureePropagationBang <em>Duree Propagation Bang</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#isPresenceCratere <em>Presence Cratere</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getLargeurCratere <em>Largeur Cratere</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getQuantiteEnergieLiberee <em>Quantite Energie Liberee</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getAngleNuageH5 <em>Angle Nuage H5</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getDirectionNuage <em>Direction Nuage</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getCategorieEnergieLiberee <em>Categorie Energie Liberee</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getAPourLocalisationNuageLocalisation <em>APour Localisation Nuage Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getMesureH10MesureNuage <em>Mesure H10 Mesure Nuage</em>}</li>
 *   <li>{@link mpia.schema.TypeEvenementArmeNucleaire#getAPourParametresPrevisionnelsParametresZoneRetombees <em>APour Parametres Previsionnels Parametres Zone Retombees</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_EvenementArmeNucleaire' kind='elementOnly'"
 * @generated
 */
public interface TypeEvenementArmeNucleaire extends TypeEvenementNucleaire {
	/**
	 * Returns the value of the '<em><b>Duree Propagation Bang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree Propagation Bang</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree Propagation Bang</em>' containment reference.
	 * @see #setDureePropagationBang(TypeDataTypeDuree)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_DureePropagationBang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DureePropagationBang'"
	 * @generated
	 */
	TypeDataTypeDuree getDureePropagationBang();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getDureePropagationBang <em>Duree Propagation Bang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree Propagation Bang</em>' containment reference.
	 * @see #getDureePropagationBang()
	 * @generated
	 */
	void setDureePropagationBang(TypeDataTypeDuree value);

	/**
	 * Returns the value of the '<em><b>Presence Cratere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presence Cratere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presence Cratere</em>' attribute.
	 * @see #isSetPresenceCratere()
	 * @see #unsetPresenceCratere()
	 * @see #setPresenceCratere(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_PresenceCratere()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='PresenceCratere'"
	 * @generated
	 */
	boolean isPresenceCratere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#isPresenceCratere <em>Presence Cratere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presence Cratere</em>' attribute.
	 * @see #isSetPresenceCratere()
	 * @see #unsetPresenceCratere()
	 * @see #isPresenceCratere()
	 * @generated
	 */
	void setPresenceCratere(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#isPresenceCratere <em>Presence Cratere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresenceCratere()
	 * @see #isPresenceCratere()
	 * @see #setPresenceCratere(boolean)
	 * @generated
	 */
	void unsetPresenceCratere();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#isPresenceCratere <em>Presence Cratere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presence Cratere</em>' attribute is set.
	 * @see #unsetPresenceCratere()
	 * @see #isPresenceCratere()
	 * @see #setPresenceCratere(boolean)
	 * @generated
	 */
	boolean isSetPresenceCratere();

	/**
	 * Returns the value of the '<em><b>Largeur Cratere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Largeur Cratere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Largeur Cratere</em>' containment reference.
	 * @see #setLargeurCratere(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_LargeurCratere()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LargeurCratere'"
	 * @generated
	 */
	TypeDataTypeLongueur getLargeurCratere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getLargeurCratere <em>Largeur Cratere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Largeur Cratere</em>' containment reference.
	 * @see #getLargeurCratere()
	 * @generated
	 */
	void setLargeurCratere(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Quantite Energie Liberee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantite Energie Liberee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantite Energie Liberee</em>' attribute.
	 * @see #isSetQuantiteEnergieLiberee()
	 * @see #unsetQuantiteEnergieLiberee()
	 * @see #setQuantiteEnergieLiberee(double)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_QuantiteEnergieLiberee()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='QuantiteEnergieLiberee'"
	 * @generated
	 */
	double getQuantiteEnergieLiberee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getQuantiteEnergieLiberee <em>Quantite Energie Liberee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantite Energie Liberee</em>' attribute.
	 * @see #isSetQuantiteEnergieLiberee()
	 * @see #unsetQuantiteEnergieLiberee()
	 * @see #getQuantiteEnergieLiberee()
	 * @generated
	 */
	void setQuantiteEnergieLiberee(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getQuantiteEnergieLiberee <em>Quantite Energie Liberee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQuantiteEnergieLiberee()
	 * @see #getQuantiteEnergieLiberee()
	 * @see #setQuantiteEnergieLiberee(double)
	 * @generated
	 */
	void unsetQuantiteEnergieLiberee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getQuantiteEnergieLiberee <em>Quantite Energie Liberee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Quantite Energie Liberee</em>' attribute is set.
	 * @see #unsetQuantiteEnergieLiberee()
	 * @see #getQuantiteEnergieLiberee()
	 * @see #setQuantiteEnergieLiberee(double)
	 * @generated
	 */
	boolean isSetQuantiteEnergieLiberee();

	/**
	 * Returns the value of the '<em><b>Angle Nuage H5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Nuage H5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Nuage H5</em>' containment reference.
	 * @see #setAngleNuageH5(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_AngleNuageH5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleNuageH5'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleNuageH5();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getAngleNuageH5 <em>Angle Nuage H5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Nuage H5</em>' containment reference.
	 * @see #getAngleNuageH5()
	 * @generated
	 */
	void setAngleNuageH5(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Direction Nuage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Nuage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Nuage</em>' containment reference.
	 * @see #setDirectionNuage(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_DirectionNuage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DirectionNuage'"
	 * @generated
	 */
	TypeDataTypeAngle getDirectionNuage();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getDirectionNuage <em>Direction Nuage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Nuage</em>' containment reference.
	 * @see #getDirectionNuage()
	 * @generated
	 */
	void setDirectionNuage(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Categorie Energie Liberee</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoPuissanceDetonation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Energie Liberee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Energie Liberee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPuissanceDetonation
	 * @see #isSetCategorieEnergieLiberee()
	 * @see #unsetCategorieEnergieLiberee()
	 * @see #setCategorieEnergieLiberee(TypeDictionaryDicoPuissanceDetonation)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_CategorieEnergieLiberee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CategorieEnergieLiberee'"
	 * @generated
	 */
	TypeDictionaryDicoPuissanceDetonation getCategorieEnergieLiberee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getCategorieEnergieLiberee <em>Categorie Energie Liberee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Energie Liberee</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoPuissanceDetonation
	 * @see #isSetCategorieEnergieLiberee()
	 * @see #unsetCategorieEnergieLiberee()
	 * @see #getCategorieEnergieLiberee()
	 * @generated
	 */
	void setCategorieEnergieLiberee(TypeDictionaryDicoPuissanceDetonation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getCategorieEnergieLiberee <em>Categorie Energie Liberee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieEnergieLiberee()
	 * @see #getCategorieEnergieLiberee()
	 * @see #setCategorieEnergieLiberee(TypeDictionaryDicoPuissanceDetonation)
	 * @generated
	 */
	void unsetCategorieEnergieLiberee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getCategorieEnergieLiberee <em>Categorie Energie Liberee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Energie Liberee</em>' attribute is set.
	 * @see #unsetCategorieEnergieLiberee()
	 * @see #getCategorieEnergieLiberee()
	 * @see #setCategorieEnergieLiberee(TypeDictionaryDicoPuissanceDetonation)
	 * @generated
	 */
	boolean isSetCategorieEnergieLiberee();

	/**
	 * Returns the value of the '<em><b>APour Localisation Nuage Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Localisation Nuage Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Localisation Nuage Localisation</em>' containment reference.
	 * @see #setAPourLocalisationNuageLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_APourLocalisationNuageLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='APourLocalisationNuage_Localisation'"
	 * @generated
	 */
	TypeLocalisation getAPourLocalisationNuageLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getAPourLocalisationNuageLocalisation <em>APour Localisation Nuage Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Localisation Nuage Localisation</em>' containment reference.
	 * @see #getAPourLocalisationNuageLocalisation()
	 * @generated
	 */
	void setAPourLocalisationNuageLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>Mesure H10 Mesure Nuage</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeMesureNuage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mesure H10 Mesure Nuage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mesure H10 Mesure Nuage</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_MesureH10MesureNuage()
	 * @model containment="true" upper="2"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_MesureNuage'"
	 *        extendedMetaData="kind='element' name='MesureH10_MesureNuage'"
	 * @generated
	 */
	EList<TypeMesureNuage> getMesureH10MesureNuage();

	/**
	 * Returns the value of the '<em><b>APour Parametres Previsionnels Parametres Zone Retombees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Parametres Previsionnels Parametres Zone Retombees</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Parametres Previsionnels Parametres Zone Retombees</em>' containment reference.
	 * @see #setAPourParametresPrevisionnelsParametresZoneRetombees(TypeParametresZoneRetombees)
	 * @see mpia.schema.SchemaPackage#getTypeEvenementArmeNucleaire_APourParametresPrevisionnelsParametresZoneRetombees()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ParametresZoneRetombees'"
	 *        extendedMetaData="kind='element' name='APourParametresPrevisionnels_ParametresZoneRetombees'"
	 * @generated
	 */
	TypeParametresZoneRetombees getAPourParametresPrevisionnelsParametresZoneRetombees();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEvenementArmeNucleaire#getAPourParametresPrevisionnelsParametresZoneRetombees <em>APour Parametres Previsionnels Parametres Zone Retombees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Parametres Previsionnels Parametres Zone Retombees</em>' containment reference.
	 * @see #getAPourParametresPrevisionnelsParametresZoneRetombees()
	 * @generated
	 */
	void setAPourParametresPrevisionnelsParametresZoneRetombees(TypeParametresZoneRetombees value);

} // TypeEvenementArmeNucleaire
