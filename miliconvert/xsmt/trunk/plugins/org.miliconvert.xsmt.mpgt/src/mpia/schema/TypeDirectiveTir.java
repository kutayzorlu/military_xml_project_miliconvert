/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeAltitudePression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Directive Tir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getTrajectoire <em>Trajectoire</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getModaliteFinTir <em>Modalite Fin Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getConcerneDemandeTir <em>Concerne Demande Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getAPourDeclenchementDeclenchementTir <em>APour Declenchement Declenchement Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getAPourCompteRenduCompteRenduTir <em>APour Compte Rendu Compte Rendu Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getDemandeUsageTypeArme <em>Demande Usage Type Arme</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir <em>APour Modalites Mise En Place Tir Modalites Mise En Place Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getAPourEmetteurUnite <em>APour Emetteur Unite</em>}</li>
 *   <li>{@link mpia.schema.TypeDirectiveTir#getAPourPointViseLocalisationGeometrique2D <em>APour Point Vise Localisation Geometrique2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_DirectiveTir' kind='elementOnly'"
 * @generated
 */
public interface TypeDirectiveTir extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDirectiveTirCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirectiveTirCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDirectiveTirCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoDirectiveTirCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirectiveTirCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoDirectiveTirCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectiveTir#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDirectiveTirCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectiveTir#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoDirectiveTirCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Sous Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoDirectiveTirSousCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sous Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirectiveTirSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoDirectiveTirSousCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_SousCategorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SousCategorie'"
	 * @generated
	 */
	TypeDictionaryDicoDirectiveTirSousCategorie getSousCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sous Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoDirectiveTirSousCategorie
	 * @see #isSetSousCategorie()
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @generated
	 */
	void setSousCategorie(TypeDictionaryDicoDirectiveTirSousCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectiveTir#getSousCategorie <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoDirectiveTirSousCategorie)
	 * @generated
	 */
	void unsetSousCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectiveTir#getSousCategorie <em>Sous Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sous Categorie</em>' attribute is set.
	 * @see #unsetSousCategorie()
	 * @see #getSousCategorie()
	 * @see #setSousCategorie(TypeDictionaryDicoDirectiveTirSousCategorie)
	 * @generated
	 */
	boolean isSetSousCategorie();

	/**
	 * Returns the value of the '<em><b>Trajectoire</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoTrajectoire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trajectoire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectoire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTrajectoire
	 * @see #isSetTrajectoire()
	 * @see #unsetTrajectoire()
	 * @see #setTrajectoire(TypeDictionaryDicoTrajectoire)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_Trajectoire()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Trajectoire'"
	 * @generated
	 */
	TypeDictionaryDicoTrajectoire getTrajectoire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getTrajectoire <em>Trajectoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectoire</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoTrajectoire
	 * @see #isSetTrajectoire()
	 * @see #unsetTrajectoire()
	 * @see #getTrajectoire()
	 * @generated
	 */
	void setTrajectoire(TypeDictionaryDicoTrajectoire value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectiveTir#getTrajectoire <em>Trajectoire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrajectoire()
	 * @see #getTrajectoire()
	 * @see #setTrajectoire(TypeDictionaryDicoTrajectoire)
	 * @generated
	 */
	void unsetTrajectoire();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectiveTir#getTrajectoire <em>Trajectoire</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trajectoire</em>' attribute is set.
	 * @see #unsetTrajectoire()
	 * @see #getTrajectoire()
	 * @see #setTrajectoire(TypeDictionaryDicoTrajectoire)
	 * @generated
	 */
	boolean isSetTrajectoire();

	/**
	 * Returns the value of the '<em><b>Modalite Fin Tir</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoModaliteFinTir}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modalite Fin Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modalite Fin Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteFinTir
	 * @see #isSetModaliteFinTir()
	 * @see #unsetModaliteFinTir()
	 * @see #setModaliteFinTir(TypeDictionaryDicoModaliteFinTir)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_ModaliteFinTir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModaliteFinTir'"
	 * @generated
	 */
	TypeDictionaryDicoModaliteFinTir getModaliteFinTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getModaliteFinTir <em>Modalite Fin Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modalite Fin Tir</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoModaliteFinTir
	 * @see #isSetModaliteFinTir()
	 * @see #unsetModaliteFinTir()
	 * @see #getModaliteFinTir()
	 * @generated
	 */
	void setModaliteFinTir(TypeDictionaryDicoModaliteFinTir value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeDirectiveTir#getModaliteFinTir <em>Modalite Fin Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModaliteFinTir()
	 * @see #getModaliteFinTir()
	 * @see #setModaliteFinTir(TypeDictionaryDicoModaliteFinTir)
	 * @generated
	 */
	void unsetModaliteFinTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeDirectiveTir#getModaliteFinTir <em>Modalite Fin Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Modalite Fin Tir</em>' attribute is set.
	 * @see #unsetModaliteFinTir()
	 * @see #getModaliteFinTir()
	 * @see #setModaliteFinTir(TypeDictionaryDicoModaliteFinTir)
	 * @generated
	 */
	boolean isSetModaliteFinTir();

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
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

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
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Altitude'"
	 * @generated
	 */
	TypeDataTypeAltitudePression getAltitude();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(TypeDataTypeAltitudePression value);

	/**
	 * Returns the value of the '<em><b>APour Secondes Munitions Parametres Imposes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference.
	 * @see #setAPourSecondesMunitionsParametresImposes(TypeParametresImposes)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_APourSecondesMunitionsParametresImposes()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ParametresImposes'"
	 *        extendedMetaData="kind='element' name='APourSecondesMunitions_ParametresImposes'"
	 * @generated
	 */
	TypeParametresImposes getAPourSecondesMunitionsParametresImposes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Secondes Munitions Parametres Imposes</em>' containment reference.
	 * @see #getAPourSecondesMunitionsParametresImposes()
	 * @generated
	 */
	void setAPourSecondesMunitionsParametresImposes(TypeParametresImposes value);

	/**
	 * Returns the value of the '<em><b>APour Premieres Munitions Parametres Imposes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference.
	 * @see #setAPourPremieresMunitionsParametresImposes(TypeParametresImposes)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_APourPremieresMunitionsParametresImposes()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ParametresImposes'"
	 *        extendedMetaData="kind='element' name='APourPremieresMunitions_ParametresImposes'"
	 * @generated
	 */
	TypeParametresImposes getAPourPremieresMunitionsParametresImposes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Premieres Munitions Parametres Imposes</em>' containment reference.
	 * @see #getAPourPremieresMunitionsParametresImposes()
	 * @generated
	 */
	void setAPourPremieresMunitionsParametresImposes(TypeParametresImposes value);

	/**
	 * Returns the value of the '<em><b>Concerne Demande Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerne Demande Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerne Demande Tir</em>' containment reference.
	 * @see #setConcerneDemandeTir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_ConcerneDemandeTir()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='ACommeDirective_DirectiveTir' target_entity='type_DemandeTir'"
	 *        extendedMetaData="kind='element' name='Concerne_DemandeTir'"
	 * @generated
	 */
	TypeAssociation getConcerneDemandeTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getConcerneDemandeTir <em>Concerne Demande Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concerne Demande Tir</em>' containment reference.
	 * @see #getConcerneDemandeTir()
	 * @generated
	 */
	void setConcerneDemandeTir(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Declenchement Declenchement Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Declenchement Declenchement Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Declenchement Declenchement Tir</em>' containment reference.
	 * @see #setAPourDeclenchementDeclenchementTir(TypeDeclenchementTir)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_APourDeclenchementDeclenchementTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_DeclenchementTir'"
	 *        extendedMetaData="kind='element' name='APourDeclenchement_DeclenchementTir'"
	 * @generated
	 */
	TypeDeclenchementTir getAPourDeclenchementDeclenchementTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getAPourDeclenchementDeclenchementTir <em>APour Declenchement Declenchement Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Declenchement Declenchement Tir</em>' containment reference.
	 * @see #getAPourDeclenchementDeclenchementTir()
	 * @generated
	 */
	void setAPourDeclenchementDeclenchementTir(TypeDeclenchementTir value);

	/**
	 * Returns the value of the '<em><b>APour Compte Rendu Compte Rendu Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Compte Rendu Compte Rendu Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Compte Rendu Compte Rendu Tir</em>' containment reference.
	 * @see #setAPourCompteRenduCompteRenduTir(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_APourCompteRenduCompteRenduTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='Concerne_DirectiveTir' target_entity='type_CompteRenduTir'"
	 *        extendedMetaData="kind='element' name='APourCompteRendu_CompteRenduTir'"
	 * @generated
	 */
	TypeAssociation getAPourCompteRenduCompteRenduTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getAPourCompteRenduCompteRenduTir <em>APour Compte Rendu Compte Rendu Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Compte Rendu Compte Rendu Tir</em>' containment reference.
	 * @see #getAPourCompteRenduCompteRenduTir()
	 * @generated
	 */
	void setAPourCompteRenduCompteRenduTir(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>Demande Usage Type Arme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Demande Usage Type Arme</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Demande Usage Type Arme</em>' containment reference.
	 * @see #setDemandeUsageTypeArme(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_DemandeUsageTypeArme()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeArme'"
	 *        extendedMetaData="kind='element' name='DemandeUsage_TypeArme'"
	 * @generated
	 */
	TypeAssociationEXT getDemandeUsageTypeArme();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getDemandeUsageTypeArme <em>Demande Usage Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Demande Usage Type Arme</em>' containment reference.
	 * @see #getDemandeUsageTypeArme()
	 * @generated
	 */
	void setDemandeUsageTypeArme(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Modalites Mise En Place Tir Modalites Mise En Place Tir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Modalites Mise En Place Tir Modalites Mise En Place Tir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Modalites Mise En Place Tir Modalites Mise En Place Tir</em>' containment reference.
	 * @see #setAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir(TypeModalitesMiseEnPlaceTir)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_APourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_ModalitesMiseEnPlaceTir'"
	 *        extendedMetaData="kind='element' name='APourModalitesMiseEnPlaceTir_ModalitesMiseEnPlaceTir'"
	 * @generated
	 */
	TypeModalitesMiseEnPlaceTir getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir <em>APour Modalites Mise En Place Tir Modalites Mise En Place Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Modalites Mise En Place Tir Modalites Mise En Place Tir</em>' containment reference.
	 * @see #getAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir()
	 * @generated
	 */
	void setAPourModalitesMiseEnPlaceTirModalitesMiseEnPlaceTir(TypeModalitesMiseEnPlaceTir value);

	/**
	 * Returns the value of the '<em><b>APour Emetteur Unite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Emetteur Unite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Emetteur Unite</em>' containment reference.
	 * @see #setAPourEmetteurUnite(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_APourEmetteurUnite()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Unite'"
	 *        extendedMetaData="kind='element' name='APourEmetteur_Unite'"
	 * @generated
	 */
	TypeAssociationEXT getAPourEmetteurUnite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getAPourEmetteurUnite <em>APour Emetteur Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Emetteur Unite</em>' containment reference.
	 * @see #getAPourEmetteurUnite()
	 * @generated
	 */
	void setAPourEmetteurUnite(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Point Vise Localisation Geometrique2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Point Vise Localisation Geometrique2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Point Vise Localisation Geometrique2 D</em>' containment reference.
	 * @see #setAPourPointViseLocalisationGeometrique2D(TypeLocalisationGeometrique2D)
	 * @see mpia.schema.SchemaPackage#getTypeDirectiveTir_APourPointViseLocalisationGeometrique2D()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_LocalisationGeometrique2D'"
	 *        extendedMetaData="kind='element' name='APourPointVise_LocalisationGeometrique2D'"
	 * @generated
	 */
	TypeLocalisationGeometrique2D getAPourPointViseLocalisationGeometrique2D();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeDirectiveTir#getAPourPointViseLocalisationGeometrique2D <em>APour Point Vise Localisation Geometrique2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Point Vise Localisation Geometrique2 D</em>' containment reference.
	 * @see #getAPourPointViseLocalisationGeometrique2D()
	 * @generated
	 */
	void setAPourPointViseLocalisationGeometrique2D(TypeLocalisationGeometrique2D value);

} // TypeDirectiveTir
