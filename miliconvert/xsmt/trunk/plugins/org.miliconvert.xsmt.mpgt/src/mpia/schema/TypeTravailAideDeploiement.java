/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Travail Aide Deploiement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeTravailAideDeploiement#getObjetTravail <em>Objet Travail</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailAideDeploiement#getDateDescriptionTravail <em>Date Description Travail</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailAideDeploiement#getDegreDurabilite <em>Degre Durabilite</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailAideDeploiement#getEstLocaliseParLocalisation <em>Est Localise Par Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeTravailAideDeploiement#getAPourInfrastuctureInfrastructure <em>APour Infrastucture Infrastructure</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeTravailAideDeploiement()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_TravailAideDeploiement' kind='elementOnly'"
 * @generated
 */
public interface TypeTravailAideDeploiement extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Objet Travail</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAideDeploiementObjetTravail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objet Travail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objet Travail</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAideDeploiementObjetTravail
	 * @see #isSetObjetTravail()
	 * @see #unsetObjetTravail()
	 * @see #setObjetTravail(TypeDictionaryDicoAideDeploiementObjetTravail)
	 * @see mpia.schema.SchemaPackage#getTypeTravailAideDeploiement_ObjetTravail()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjetTravail'"
	 * @generated
	 */
	TypeDictionaryDicoAideDeploiementObjetTravail getObjetTravail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailAideDeploiement#getObjetTravail <em>Objet Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objet Travail</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAideDeploiementObjetTravail
	 * @see #isSetObjetTravail()
	 * @see #unsetObjetTravail()
	 * @see #getObjetTravail()
	 * @generated
	 */
	void setObjetTravail(TypeDictionaryDicoAideDeploiementObjetTravail value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTravailAideDeploiement#getObjetTravail <em>Objet Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObjetTravail()
	 * @see #getObjetTravail()
	 * @see #setObjetTravail(TypeDictionaryDicoAideDeploiementObjetTravail)
	 * @generated
	 */
	void unsetObjetTravail();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTravailAideDeploiement#getObjetTravail <em>Objet Travail</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Objet Travail</em>' attribute is set.
	 * @see #unsetObjetTravail()
	 * @see #getObjetTravail()
	 * @see #setObjetTravail(TypeDictionaryDicoAideDeploiementObjetTravail)
	 * @generated
	 */
	boolean isSetObjetTravail();

	/**
	 * Returns the value of the '<em><b>Date Description Travail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Description Travail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Description Travail</em>' attribute.
	 * @see #setDateDescriptionTravail(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeTravailAideDeploiement_DateDescriptionTravail()
	 * @model dataType="mpia.meta.TypeDataTypeGDH" required="true"
	 *        extendedMetaData="kind='element' name='DateDescriptionTravail'"
	 * @generated
	 */
	XMLGregorianCalendar getDateDescriptionTravail();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailAideDeploiement#getDateDescriptionTravail <em>Date Description Travail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Description Travail</em>' attribute.
	 * @see #getDateDescriptionTravail()
	 * @generated
	 */
	void setDateDescriptionTravail(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Degre Durabilite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoZoneMiseTerreHomologation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degre Durabilite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degre Durabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneMiseTerreHomologation
	 * @see #isSetDegreDurabilite()
	 * @see #unsetDegreDurabilite()
	 * @see #setDegreDurabilite(TypeDictionaryDicoZoneMiseTerreHomologation)
	 * @see mpia.schema.SchemaPackage#getTypeTravailAideDeploiement_DegreDurabilite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DegreDurabilite'"
	 * @generated
	 */
	TypeDictionaryDicoZoneMiseTerreHomologation getDegreDurabilite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailAideDeploiement#getDegreDurabilite <em>Degre Durabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degre Durabilite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoZoneMiseTerreHomologation
	 * @see #isSetDegreDurabilite()
	 * @see #unsetDegreDurabilite()
	 * @see #getDegreDurabilite()
	 * @generated
	 */
	void setDegreDurabilite(TypeDictionaryDicoZoneMiseTerreHomologation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeTravailAideDeploiement#getDegreDurabilite <em>Degre Durabilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDegreDurabilite()
	 * @see #getDegreDurabilite()
	 * @see #setDegreDurabilite(TypeDictionaryDicoZoneMiseTerreHomologation)
	 * @generated
	 */
	void unsetDegreDurabilite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeTravailAideDeploiement#getDegreDurabilite <em>Degre Durabilite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Degre Durabilite</em>' attribute is set.
	 * @see #unsetDegreDurabilite()
	 * @see #getDegreDurabilite()
	 * @see #setDegreDurabilite(TypeDictionaryDicoZoneMiseTerreHomologation)
	 * @generated
	 */
	boolean isSetDegreDurabilite();

	/**
	 * Returns the value of the '<em><b>Est Localise Par Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise Par Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise Par Localisation</em>' containment reference.
	 * @see #setEstLocaliseParLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeTravailAideDeploiement_EstLocaliseParLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocalisePar_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseParLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeTravailAideDeploiement#getEstLocaliseParLocalisation <em>Est Localise Par Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise Par Localisation</em>' containment reference.
	 * @see #getEstLocaliseParLocalisation()
	 * @generated
	 */
	void setEstLocaliseParLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>APour Infrastucture Infrastructure</b></em>' containment reference list.
	 * The list contents are of type {@link mpia.schema.TypeInfrastructure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Infrastucture Infrastructure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Infrastucture Infrastructure</em>' containment reference list.
	 * @see mpia.schema.SchemaPackage#getTypeTravailAideDeploiement_APourInfrastuctureInfrastructure()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Infrastructure'"
	 *        extendedMetaData="kind='element' name='APourInfrastucture_Infrastructure'"
	 * @generated
	 */
	EList<TypeInfrastructure> getAPourInfrastuctureInfrastructure();

} // TypeTravailAideDeploiement
