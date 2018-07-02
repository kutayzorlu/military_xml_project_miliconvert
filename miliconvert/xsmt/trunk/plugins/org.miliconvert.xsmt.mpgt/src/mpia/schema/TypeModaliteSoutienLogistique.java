/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Modalite Soutien Logistique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienGeneral <em>Soutien General</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienSpecifiqueEquipements <em>Soutien Specifique Equipements</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienSpecifiqueEnRessources <em>Soutien Specifique En Ressources</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteSoutienLogistique#isPriseEnCompteEffectifs <em>Prise En Compte Effectifs</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteSoutienLogistique#isPriseEnCompteSuiviAdministratif <em>Prise En Compte Suivi Administratif</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteSoutienLogistique#isAutre <em>Autre</em>}</li>
 *   <li>{@link mpia.schema.TypeModaliteSoutienLogistique#getCommentaire <em>Commentaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeModaliteSoutienLogistique()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_ModaliteSoutienLogistique' kind='elementOnly'"
 * @generated
 */
public interface TypeModaliteSoutienLogistique extends EObject {
	/**
	 * Returns the value of the '<em><b>Soutien General</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soutien General</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soutien General</em>' attribute.
	 * @see #isSetSoutienGeneral()
	 * @see #unsetSoutienGeneral()
	 * @see #setSoutienGeneral(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteSoutienLogistique_SoutienGeneral()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='SoutienGeneral'"
	 * @generated
	 */
	boolean isSoutienGeneral();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienGeneral <em>Soutien General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soutien General</em>' attribute.
	 * @see #isSetSoutienGeneral()
	 * @see #unsetSoutienGeneral()
	 * @see #isSoutienGeneral()
	 * @generated
	 */
	void setSoutienGeneral(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienGeneral <em>Soutien General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoutienGeneral()
	 * @see #isSoutienGeneral()
	 * @see #setSoutienGeneral(boolean)
	 * @generated
	 */
	void unsetSoutienGeneral();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienGeneral <em>Soutien General</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Soutien General</em>' attribute is set.
	 * @see #unsetSoutienGeneral()
	 * @see #isSoutienGeneral()
	 * @see #setSoutienGeneral(boolean)
	 * @generated
	 */
	boolean isSetSoutienGeneral();

	/**
	 * Returns the value of the '<em><b>Soutien Specifique Equipements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soutien Specifique Equipements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soutien Specifique Equipements</em>' attribute.
	 * @see #isSetSoutienSpecifiqueEquipements()
	 * @see #unsetSoutienSpecifiqueEquipements()
	 * @see #setSoutienSpecifiqueEquipements(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteSoutienLogistique_SoutienSpecifiqueEquipements()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='SoutienSpecifiqueEquipements'"
	 * @generated
	 */
	boolean isSoutienSpecifiqueEquipements();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienSpecifiqueEquipements <em>Soutien Specifique Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soutien Specifique Equipements</em>' attribute.
	 * @see #isSetSoutienSpecifiqueEquipements()
	 * @see #unsetSoutienSpecifiqueEquipements()
	 * @see #isSoutienSpecifiqueEquipements()
	 * @generated
	 */
	void setSoutienSpecifiqueEquipements(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienSpecifiqueEquipements <em>Soutien Specifique Equipements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoutienSpecifiqueEquipements()
	 * @see #isSoutienSpecifiqueEquipements()
	 * @see #setSoutienSpecifiqueEquipements(boolean)
	 * @generated
	 */
	void unsetSoutienSpecifiqueEquipements();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienSpecifiqueEquipements <em>Soutien Specifique Equipements</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Soutien Specifique Equipements</em>' attribute is set.
	 * @see #unsetSoutienSpecifiqueEquipements()
	 * @see #isSoutienSpecifiqueEquipements()
	 * @see #setSoutienSpecifiqueEquipements(boolean)
	 * @generated
	 */
	boolean isSetSoutienSpecifiqueEquipements();

	/**
	 * Returns the value of the '<em><b>Soutien Specifique En Ressources</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soutien Specifique En Ressources</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soutien Specifique En Ressources</em>' attribute.
	 * @see #isSetSoutienSpecifiqueEnRessources()
	 * @see #unsetSoutienSpecifiqueEnRessources()
	 * @see #setSoutienSpecifiqueEnRessources(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteSoutienLogistique_SoutienSpecifiqueEnRessources()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='SoutienSpecifiqueEnRessources'"
	 * @generated
	 */
	boolean isSoutienSpecifiqueEnRessources();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienSpecifiqueEnRessources <em>Soutien Specifique En Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soutien Specifique En Ressources</em>' attribute.
	 * @see #isSetSoutienSpecifiqueEnRessources()
	 * @see #unsetSoutienSpecifiqueEnRessources()
	 * @see #isSoutienSpecifiqueEnRessources()
	 * @generated
	 */
	void setSoutienSpecifiqueEnRessources(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienSpecifiqueEnRessources <em>Soutien Specifique En Ressources</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSoutienSpecifiqueEnRessources()
	 * @see #isSoutienSpecifiqueEnRessources()
	 * @see #setSoutienSpecifiqueEnRessources(boolean)
	 * @generated
	 */
	void unsetSoutienSpecifiqueEnRessources();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isSoutienSpecifiqueEnRessources <em>Soutien Specifique En Ressources</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Soutien Specifique En Ressources</em>' attribute is set.
	 * @see #unsetSoutienSpecifiqueEnRessources()
	 * @see #isSoutienSpecifiqueEnRessources()
	 * @see #setSoutienSpecifiqueEnRessources(boolean)
	 * @generated
	 */
	boolean isSetSoutienSpecifiqueEnRessources();

	/**
	 * Returns the value of the '<em><b>Prise En Compte Effectifs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prise En Compte Effectifs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prise En Compte Effectifs</em>' attribute.
	 * @see #isSetPriseEnCompteEffectifs()
	 * @see #unsetPriseEnCompteEffectifs()
	 * @see #setPriseEnCompteEffectifs(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteSoutienLogistique_PriseEnCompteEffectifs()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='PriseEnCompteEffectifs'"
	 * @generated
	 */
	boolean isPriseEnCompteEffectifs();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isPriseEnCompteEffectifs <em>Prise En Compte Effectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prise En Compte Effectifs</em>' attribute.
	 * @see #isSetPriseEnCompteEffectifs()
	 * @see #unsetPriseEnCompteEffectifs()
	 * @see #isPriseEnCompteEffectifs()
	 * @generated
	 */
	void setPriseEnCompteEffectifs(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isPriseEnCompteEffectifs <em>Prise En Compte Effectifs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriseEnCompteEffectifs()
	 * @see #isPriseEnCompteEffectifs()
	 * @see #setPriseEnCompteEffectifs(boolean)
	 * @generated
	 */
	void unsetPriseEnCompteEffectifs();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isPriseEnCompteEffectifs <em>Prise En Compte Effectifs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prise En Compte Effectifs</em>' attribute is set.
	 * @see #unsetPriseEnCompteEffectifs()
	 * @see #isPriseEnCompteEffectifs()
	 * @see #setPriseEnCompteEffectifs(boolean)
	 * @generated
	 */
	boolean isSetPriseEnCompteEffectifs();

	/**
	 * Returns the value of the '<em><b>Prise En Compte Suivi Administratif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prise En Compte Suivi Administratif</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prise En Compte Suivi Administratif</em>' attribute.
	 * @see #isSetPriseEnCompteSuiviAdministratif()
	 * @see #unsetPriseEnCompteSuiviAdministratif()
	 * @see #setPriseEnCompteSuiviAdministratif(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteSoutienLogistique_PriseEnCompteSuiviAdministratif()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='PriseEnCompteSuiviAdministratif'"
	 * @generated
	 */
	boolean isPriseEnCompteSuiviAdministratif();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isPriseEnCompteSuiviAdministratif <em>Prise En Compte Suivi Administratif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prise En Compte Suivi Administratif</em>' attribute.
	 * @see #isSetPriseEnCompteSuiviAdministratif()
	 * @see #unsetPriseEnCompteSuiviAdministratif()
	 * @see #isPriseEnCompteSuiviAdministratif()
	 * @generated
	 */
	void setPriseEnCompteSuiviAdministratif(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isPriseEnCompteSuiviAdministratif <em>Prise En Compte Suivi Administratif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPriseEnCompteSuiviAdministratif()
	 * @see #isPriseEnCompteSuiviAdministratif()
	 * @see #setPriseEnCompteSuiviAdministratif(boolean)
	 * @generated
	 */
	void unsetPriseEnCompteSuiviAdministratif();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isPriseEnCompteSuiviAdministratif <em>Prise En Compte Suivi Administratif</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prise En Compte Suivi Administratif</em>' attribute is set.
	 * @see #unsetPriseEnCompteSuiviAdministratif()
	 * @see #isPriseEnCompteSuiviAdministratif()
	 * @see #setPriseEnCompteSuiviAdministratif(boolean)
	 * @generated
	 */
	boolean isSetPriseEnCompteSuiviAdministratif();

	/**
	 * Returns the value of the '<em><b>Autre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autre</em>' attribute.
	 * @see #isSetAutre()
	 * @see #unsetAutre()
	 * @see #setAutre(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteSoutienLogistique_Autre()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean" required="true"
	 *        extendedMetaData="kind='element' name='Autre'"
	 * @generated
	 */
	boolean isAutre();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isAutre <em>Autre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autre</em>' attribute.
	 * @see #isSetAutre()
	 * @see #unsetAutre()
	 * @see #isAutre()
	 * @generated
	 */
	void setAutre(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isAutre <em>Autre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutre()
	 * @see #isAutre()
	 * @see #setAutre(boolean)
	 * @generated
	 */
	void unsetAutre();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#isAutre <em>Autre</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Autre</em>' attribute is set.
	 * @see #unsetAutre()
	 * @see #isAutre()
	 * @see #setAutre(boolean)
	 * @generated
	 */
	boolean isSetAutre();

	/**
	 * Returns the value of the '<em><b>Commentaire</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commentaire</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commentaire</em>' attribute.
	 * @see #setCommentaire(String)
	 * @see mpia.schema.SchemaPackage#getTypeModaliteSoutienLogistique_Commentaire()
	 * @model dataType="mpia.meta.TypeDataTypeChaine02000" required="true"
	 *        extendedMetaData="kind='element' name='Commentaire'"
	 * @generated
	 */
	String getCommentaire();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeModaliteSoutienLogistique#getCommentaire <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commentaire</em>' attribute.
	 * @see #getCommentaire()
	 * @generated
	 */
	void setCommentaire(String value);

} // TypeModaliteSoutienLogistique
