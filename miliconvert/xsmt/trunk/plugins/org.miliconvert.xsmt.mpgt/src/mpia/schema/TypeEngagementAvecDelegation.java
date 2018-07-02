/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Engagement Avec Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeEngagementAvecDelegation#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeEngagementAvecDelegation#getAutreEffetRecherche <em>Autre Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeEngagementAvecDelegation#getPourcentageDommagesRecherche <em>Pourcentage Dommages Recherche</em>}</li>
 *   <li>{@link mpia.schema.TypeEngagementAvecDelegation#getEffetMunition <em>Effet Munition</em>}</li>
 *   <li>{@link mpia.schema.TypeEngagementAvecDelegation#getVolumeMoyenTir <em>Volume Moyen Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeEngagementAvecDelegation#getNombreMaximumDemandeTir <em>Nombre Maximum Demande Tir</em>}</li>
 *   <li>{@link mpia.schema.TypeEngagementAvecDelegation#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}</li>
 *   <li>{@link mpia.schema.TypeEngagementAvecDelegation#getAPourMunitionTypeMunition <em>APour Munition Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_EngagementAvecDelegation' kind='elementOnly'"
 * @generated
 */
public interface TypeEngagementAvecDelegation extends EObject {
	/**
	 * Returns the value of the '<em><b>Effet Recherche</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEffetTactiqueASS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueASS
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation_EffetRecherche()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='EffetRecherche'"
	 * @generated
	 */
	TypeDictionaryDicoEffetTactiqueASS getEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Recherche</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEffetTactiqueASS
	 * @see #isSetEffetRecherche()
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @generated
	 */
	void setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getEffetRecherche <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @generated
	 */
	void unsetEffetRecherche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getEffetRecherche <em>Effet Recherche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Recherche</em>' attribute is set.
	 * @see #unsetEffetRecherche()
	 * @see #getEffetRecherche()
	 * @see #setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS)
	 * @generated
	 */
	boolean isSetEffetRecherche();

	/**
	 * Returns the value of the '<em><b>Autre Effet Recherche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre Effet Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre Effet Recherche</em>' attribute.
	 * @see #setAutreEffetRecherche(String)
	 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation_AutreEffetRecherche()
	 * @model dataType="mpia.meta.TypeDataTypeChaine080"
	 *        extendedMetaData="kind='element' name='AutreEffetRecherche'"
	 * @generated
	 */
	String getAutreEffetRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getAutreEffetRecherche <em>Autre Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre Effet Recherche</em>' attribute.
	 * @see #getAutreEffetRecherche()
	 * @generated
	 */
	void setAutreEffetRecherche(String value);

	/**
	 * Returns the value of the '<em><b>Pourcentage Dommages Recherche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pourcentage Dommages Recherche</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pourcentage Dommages Recherche</em>' attribute.
	 * @see #isSetPourcentageDommagesRecherche()
	 * @see #unsetPourcentageDommagesRecherche()
	 * @see #setPourcentageDommagesRecherche(double)
	 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation_PourcentageDommagesRecherche()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='PourcentageDommagesRecherche'"
	 * @generated
	 */
	double getPourcentageDommagesRecherche();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getPourcentageDommagesRecherche <em>Pourcentage Dommages Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pourcentage Dommages Recherche</em>' attribute.
	 * @see #isSetPourcentageDommagesRecherche()
	 * @see #unsetPourcentageDommagesRecherche()
	 * @see #getPourcentageDommagesRecherche()
	 * @generated
	 */
	void setPourcentageDommagesRecherche(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getPourcentageDommagesRecherche <em>Pourcentage Dommages Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPourcentageDommagesRecherche()
	 * @see #getPourcentageDommagesRecherche()
	 * @see #setPourcentageDommagesRecherche(double)
	 * @generated
	 */
	void unsetPourcentageDommagesRecherche();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getPourcentageDommagesRecherche <em>Pourcentage Dommages Recherche</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pourcentage Dommages Recherche</em>' attribute is set.
	 * @see #unsetPourcentageDommagesRecherche()
	 * @see #getPourcentageDommagesRecherche()
	 * @see #setPourcentageDommagesRecherche(double)
	 * @generated
	 */
	boolean isSetPourcentageDommagesRecherche();

	/**
	 * Returns the value of the '<em><b>Effet Munition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Munition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Munition</em>' attribute.
	 * @see #isSetEffetMunition()
	 * @see #unsetEffetMunition()
	 * @see #setEffetMunition(double)
	 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation_EffetMunition()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeRatio"
	 *        extendedMetaData="kind='element' name='EffetMunition'"
	 * @generated
	 */
	double getEffetMunition();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getEffetMunition <em>Effet Munition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Munition</em>' attribute.
	 * @see #isSetEffetMunition()
	 * @see #unsetEffetMunition()
	 * @see #getEffetMunition()
	 * @generated
	 */
	void setEffetMunition(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getEffetMunition <em>Effet Munition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEffetMunition()
	 * @see #getEffetMunition()
	 * @see #setEffetMunition(double)
	 * @generated
	 */
	void unsetEffetMunition();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getEffetMunition <em>Effet Munition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Effet Munition</em>' attribute is set.
	 * @see #unsetEffetMunition()
	 * @see #getEffetMunition()
	 * @see #setEffetMunition(double)
	 * @generated
	 */
	boolean isSetEffetMunition();

	/**
	 * Returns the value of the '<em><b>Volume Moyen Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume Moyen Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume Moyen Tir</em>' attribute.
	 * @see #isSetVolumeMoyenTir()
	 * @see #unsetVolumeMoyenTir()
	 * @see #setVolumeMoyenTir(long)
	 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation_VolumeMoyenTir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='VolumeMoyenTir'"
	 * @generated
	 */
	long getVolumeMoyenTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getVolumeMoyenTir <em>Volume Moyen Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Moyen Tir</em>' attribute.
	 * @see #isSetVolumeMoyenTir()
	 * @see #unsetVolumeMoyenTir()
	 * @see #getVolumeMoyenTir()
	 * @generated
	 */
	void setVolumeMoyenTir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getVolumeMoyenTir <em>Volume Moyen Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVolumeMoyenTir()
	 * @see #getVolumeMoyenTir()
	 * @see #setVolumeMoyenTir(long)
	 * @generated
	 */
	void unsetVolumeMoyenTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getVolumeMoyenTir <em>Volume Moyen Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Volume Moyen Tir</em>' attribute is set.
	 * @see #unsetVolumeMoyenTir()
	 * @see #getVolumeMoyenTir()
	 * @see #setVolumeMoyenTir(long)
	 * @generated
	 */
	boolean isSetVolumeMoyenTir();

	/**
	 * Returns the value of the '<em><b>Nombre Maximum Demande Tir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Maximum Demande Tir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Maximum Demande Tir</em>' attribute.
	 * @see #isSetNombreMaximumDemandeTir()
	 * @see #unsetNombreMaximumDemandeTir()
	 * @see #setNombreMaximumDemandeTir(long)
	 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation_NombreMaximumDemandeTir()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3" required="true"
	 *        extendedMetaData="kind='element' name='NombreMaximumDemandeTir'"
	 * @generated
	 */
	long getNombreMaximumDemandeTir();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getNombreMaximumDemandeTir <em>Nombre Maximum Demande Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Maximum Demande Tir</em>' attribute.
	 * @see #isSetNombreMaximumDemandeTir()
	 * @see #unsetNombreMaximumDemandeTir()
	 * @see #getNombreMaximumDemandeTir()
	 * @generated
	 */
	void setNombreMaximumDemandeTir(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getNombreMaximumDemandeTir <em>Nombre Maximum Demande Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreMaximumDemandeTir()
	 * @see #getNombreMaximumDemandeTir()
	 * @see #setNombreMaximumDemandeTir(long)
	 * @generated
	 */
	void unsetNombreMaximumDemandeTir();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getNombreMaximumDemandeTir <em>Nombre Maximum Demande Tir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Maximum Demande Tir</em>' attribute is set.
	 * @see #unsetNombreMaximumDemandeTir()
	 * @see #getNombreMaximumDemandeTir()
	 * @see #setNombreMaximumDemandeTir(long)
	 * @generated
	 */
	boolean isSetNombreMaximumDemandeTir();

	/**
	 * Returns the value of the '<em><b>Effet Sur Environnement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effet Sur Environnement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effet Sur Environnement</em>' attribute.
	 * @see #setEffetSurEnvironnement(String)
	 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation_EffetSurEnvironnement()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0255"
	 *        extendedMetaData="kind='element' name='EffetSurEnvironnement'"
	 * @generated
	 */
	String getEffetSurEnvironnement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeEngagementAvecDelegation#getEffetSurEnvironnement <em>Effet Sur Environnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effet Sur Environnement</em>' attribute.
	 * @see #getEffetSurEnvironnement()
	 * @generated
	 */
	void setEffetSurEnvironnement(String value);

	/**
	 * Returns the value of the '<em><b>APour Munition Type Munition</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.meta.TypeAssociationEXT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Munition Type Munition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Munition Type Munition</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeEngagementAvecDelegation_APourMunitionTypeMunition()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeMunition'"
	 *        extendedMetaData="kind='element' name='APourMunition_TypeMunition'"
	 * @generated
	 */
	EList<TypeAssociationEXT> getAPourMunitionTypeMunition();

} // TypeEngagementAvecDelegation
