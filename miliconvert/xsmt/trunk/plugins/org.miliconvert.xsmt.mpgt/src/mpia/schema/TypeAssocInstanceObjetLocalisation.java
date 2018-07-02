/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Assoc Instance Objet Localisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getSitePC <em>Site PC</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getAngleMouvement <em>Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getNomSitePC <em>Nom Site PC</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation <em>APour Caracteristiques Caracteristiques Assoc Instance Objet Localisation</em>}</li>
 *   <li>{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_AssocInstanceObjetLocalisation' kind='elementOnly'"
 * @generated
 */
public interface TypeAssocInstanceObjetLocalisation extends EObject {
	/**
	 * Returns the value of the '<em><b>Categorie</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie)
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_Categorie()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Categorie'"
	 * @generated
	 */
	TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie getCategorie();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie
	 * @see #isSetCategorie()
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @generated
	 */
	void setCategorie(TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getCategorie <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie)
	 * @generated
	 */
	void unsetCategorie();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getCategorie <em>Categorie</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie</em>' attribute is set.
	 * @see #unsetCategorie()
	 * @see #getCategorie()
	 * @see #setCategorie(TypeDictionaryDicoAssocInstanceObjetLocalisationCategorie)
	 * @generated
	 */
	boolean isSetCategorie();

	/**
	 * Returns the value of the '<em><b>Site PC</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site PC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site PC</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC
	 * @see #isSetSitePC()
	 * @see #unsetSitePC()
	 * @see #setSitePC(TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC)
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_SitePC()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SitePC'"
	 * @generated
	 */
	TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC getSitePC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getSitePC <em>Site PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site PC</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC
	 * @see #isSetSitePC()
	 * @see #unsetSitePC()
	 * @see #getSitePC()
	 * @generated
	 */
	void setSitePC(TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getSitePC <em>Site PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSitePC()
	 * @see #getSitePC()
	 * @see #setSitePC(TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC)
	 * @generated
	 */
	void unsetSitePC();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getSitePC <em>Site PC</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Site PC</em>' attribute is set.
	 * @see #unsetSitePC()
	 * @see #getSitePC()
	 * @see #setSitePC(TypeDictionaryDicoAssocInstanceObjetLocalisationSitePC)
	 * @generated
	 */
	boolean isSetSitePC();

	/**
	 * Returns the value of the '<em><b>Angle Mouvement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle Mouvement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle Mouvement</em>' containment reference.
	 * @see #setAngleMouvement(TypeDataTypeAngle)
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_AngleMouvement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AngleMouvement'"
	 * @generated
	 */
	TypeDataTypeAngle getAngleMouvement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getAngleMouvement <em>Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle Mouvement</em>' containment reference.
	 * @see #getAngleMouvement()
	 * @generated
	 */
	void setAngleMouvement(TypeDataTypeAngle value);

	/**
	 * Returns the value of the '<em><b>Vitesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vitesse</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vitesse</em>' containment reference.
	 * @see #setVitesse(TypeDataTypeVitesseLineaire)
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_Vitesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vitesse'"
	 * @generated
	 */
	TypeDataTypeVitesseLineaire getVitesse();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getVitesse <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vitesse</em>' containment reference.
	 * @see #getVitesse()
	 * @generated
	 */
	void setVitesse(TypeDataTypeVitesseLineaire value);

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
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Nom Site PC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Site PC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Site PC</em>' attribute.
	 * @see #setNomSitePC(String)
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_NomSitePC()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030"
	 *        extendedMetaData="kind='element' name='NomSitePC'"
	 * @generated
	 */
	String getNomSitePC();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getNomSitePC <em>Nom Site PC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Site PC</em>' attribute.
	 * @see #getNomSitePC()
	 * @generated
	 */
	void setNomSitePC(String value);

	/**
	 * Returns the value of the '<em><b>Est Localise En Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Localise En Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #setEstLocaliseEnLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_EstLocaliseEnLocalisation()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='EstLocaliseEn_Localisation'"
	 * @generated
	 */
	TypeLocalisation getEstLocaliseEnLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Localise En Localisation</em>' containment reference.
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 */
	void setEstLocaliseEnLocalisation(TypeLocalisation value);

	/**
	 * Returns the value of the '<em><b>APour Caracteristiques Caracteristiques Assoc Instance Objet Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Caracteristiques Caracteristiques Assoc Instance Objet Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Caracteristiques Caracteristiques Assoc Instance Objet Localisation</em>' containment reference.
	 * @see #setAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation(TypeCaracteristiquesAssocInstanceObjetLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_APourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_CaracteristiquesAssocInstanceObjetLocalisation'"
	 *        extendedMetaData="kind='element' name='APourCaracteristiques_CaracteristiquesAssocInstanceObjetLocalisation'"
	 * @generated
	 */
	TypeCaracteristiquesAssocInstanceObjetLocalisation getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation <em>APour Caracteristiques Caracteristiques Assoc Instance Objet Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Caracteristiques Caracteristiques Assoc Instance Objet Localisation</em>' containment reference.
	 * @see #getAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation()
	 * @generated
	 */
	void setAPourCaracteristiquesCaracteristiquesAssocInstanceObjetLocalisation(TypeCaracteristiquesAssocInstanceObjetLocalisation value);

	/**
	 * Returns the value of the '<em><b>Est Rapportee Par Rapport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Est Rapportee Par Rapport</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #setEstRapporteeParRapport(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeAssocInstanceObjetLocalisation_EstRapporteeParRapport()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_Rapport'"
	 *        extendedMetaData="kind='element' name='EstRapporteePar_Rapport'"
	 * @generated
	 */
	TypeAssociation getEstRapporteeParRapport();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeAssocInstanceObjetLocalisation#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Est Rapportee Par Rapport</em>' containment reference.
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 */
	void setEstRapporteeParRapport(TypeAssociation value);

} // TypeAssocInstanceObjetLocalisation
