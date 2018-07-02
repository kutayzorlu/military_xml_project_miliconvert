/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import mpia.meta.TypeAssociationEXT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Moyen Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#getIdentifiant <em>Identifiant</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#getNationalite <em>Nationalite</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#isRadio <em>Radio</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#getPortee <em>Portee</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#isAffichageCouverture <em>Affichage Couverture</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#isSatellite <em>Satellite</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#getTypeEquipementTypeEquipement <em>Type Equipement Type Equipement</em>}</li>
 *   <li>{@link mpia.schema.TypeMoyenCommunication#getLocalisationLocalisation <em>Localisation Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='AGGREGATED_ENTITY'"
 *        extendedMetaData="name='type_MoyenCommunication' kind='elementOnly'"
 * @generated
 */
public interface TypeMoyenCommunication extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifiant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifiant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifiant</em>' attribute.
	 * @see #setIdentifiant(String)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_Identifiant()
	 * @model dataType="mpia.meta.TypeDataTypeChaine020"
	 *        extendedMetaData="kind='element' name='Identifiant'"
	 * @generated
	 */
	String getIdentifiant();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#getIdentifiant <em>Identifiant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifiant</em>' attribute.
	 * @see #getIdentifiant()
	 * @generated
	 */
	void setIdentifiant(String value);

	/**
	 * Returns the value of the '<em><b>Nationalite</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nationalite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_Nationalite()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Nationalite'"
	 * @generated
	 */
	TypeDictionaryDicoEntitePolitiqueTrigramme getNationalite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nationalite</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoEntitePolitiqueTrigramme
	 * @see #isSetNationalite()
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @generated
	 */
	void setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenCommunication#getNationalite <em>Nationalite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	void unsetNationalite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenCommunication#getNationalite <em>Nationalite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nationalite</em>' attribute is set.
	 * @see #unsetNationalite()
	 * @see #getNationalite()
	 * @see #setNationalite(TypeDictionaryDicoEntitePolitiqueTrigramme)
	 * @generated
	 */
	boolean isSetNationalite();

	/**
	 * Returns the value of the '<em><b>Radio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radio</em>' attribute.
	 * @see #isSetRadio()
	 * @see #unsetRadio()
	 * @see #setRadio(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_Radio()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Radio'"
	 * @generated
	 */
	boolean isRadio();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#isRadio <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radio</em>' attribute.
	 * @see #isSetRadio()
	 * @see #unsetRadio()
	 * @see #isRadio()
	 * @generated
	 */
	void setRadio(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenCommunication#isRadio <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRadio()
	 * @see #isRadio()
	 * @see #setRadio(boolean)
	 * @generated
	 */
	void unsetRadio();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenCommunication#isRadio <em>Radio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Radio</em>' attribute is set.
	 * @see #unsetRadio()
	 * @see #isRadio()
	 * @see #setRadio(boolean)
	 * @generated
	 */
	boolean isSetRadio();

	/**
	 * Returns the value of the '<em><b>Portee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Portee</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portee</em>' attribute.
	 * @see #isSetPortee()
	 * @see #unsetPortee()
	 * @see #setPortee(long)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_Portee()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier6"
	 *        extendedMetaData="kind='element' name='Portee'"
	 * @generated
	 */
	long getPortee();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#getPortee <em>Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Portee</em>' attribute.
	 * @see #isSetPortee()
	 * @see #unsetPortee()
	 * @see #getPortee()
	 * @generated
	 */
	void setPortee(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenCommunication#getPortee <em>Portee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPortee()
	 * @see #getPortee()
	 * @see #setPortee(long)
	 * @generated
	 */
	void unsetPortee();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenCommunication#getPortee <em>Portee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Portee</em>' attribute is set.
	 * @see #unsetPortee()
	 * @see #getPortee()
	 * @see #setPortee(long)
	 * @generated
	 */
	boolean isSetPortee();

	/**
	 * Returns the value of the '<em><b>Affichage Couverture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affichage Couverture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affichage Couverture</em>' attribute.
	 * @see #isSetAffichageCouverture()
	 * @see #unsetAffichageCouverture()
	 * @see #setAffichageCouverture(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_AffichageCouverture()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='AffichageCouverture'"
	 * @generated
	 */
	boolean isAffichageCouverture();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#isAffichageCouverture <em>Affichage Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affichage Couverture</em>' attribute.
	 * @see #isSetAffichageCouverture()
	 * @see #unsetAffichageCouverture()
	 * @see #isAffichageCouverture()
	 * @generated
	 */
	void setAffichageCouverture(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenCommunication#isAffichageCouverture <em>Affichage Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAffichageCouverture()
	 * @see #isAffichageCouverture()
	 * @see #setAffichageCouverture(boolean)
	 * @generated
	 */
	void unsetAffichageCouverture();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenCommunication#isAffichageCouverture <em>Affichage Couverture</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Affichage Couverture</em>' attribute is set.
	 * @see #unsetAffichageCouverture()
	 * @see #isAffichageCouverture()
	 * @see #setAffichageCouverture(boolean)
	 * @generated
	 */
	boolean isSetAffichageCouverture();

	/**
	 * Returns the value of the '<em><b>Satellite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satellite</em>' attribute.
	 * @see #isSetSatellite()
	 * @see #unsetSatellite()
	 * @see #setSatellite(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_Satellite()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Satellite'"
	 * @generated
	 */
	boolean isSatellite();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#isSatellite <em>Satellite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite</em>' attribute.
	 * @see #isSetSatellite()
	 * @see #unsetSatellite()
	 * @see #isSatellite()
	 * @generated
	 */
	void setSatellite(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeMoyenCommunication#isSatellite <em>Satellite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSatellite()
	 * @see #isSatellite()
	 * @see #setSatellite(boolean)
	 * @generated
	 */
	void unsetSatellite();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeMoyenCommunication#isSatellite <em>Satellite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Satellite</em>' attribute is set.
	 * @see #unsetSatellite()
	 * @see #isSatellite()
	 * @see #setSatellite(boolean)
	 * @generated
	 */
	boolean isSetSatellite();

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
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_CTE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine030" required="true"
	 *        extendedMetaData="kind='element' name='CTE'"
	 * @generated
	 */
	String getCTE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#getCTE <em>CTE</em>}' attribute.
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
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_CE()
	 * @model dataType="mpia.meta.TypeDataTypeChaine0100"
	 *        extendedMetaData="kind='element' name='CE'"
	 * @generated
	 */
	String getCE();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#getCE <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CE</em>' attribute.
	 * @see #getCE()
	 * @generated
	 */
	void setCE(String value);

	/**
	 * Returns the value of the '<em><b>Type Equipement Type Equipement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Equipement Type Equipement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Equipement Type Equipement</em>' containment reference.
	 * @see #setTypeEquipementTypeEquipement(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_TypeEquipementTypeEquipement()
	 * @model containment="true" required="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipement'"
	 *        extendedMetaData="kind='element' name='TypeEquipement_TypeEquipement'"
	 * @generated
	 */
	TypeAssociationEXT getTypeEquipementTypeEquipement();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#getTypeEquipementTypeEquipement <em>Type Equipement Type Equipement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Equipement Type Equipement</em>' containment reference.
	 * @see #getTypeEquipementTypeEquipement()
	 * @generated
	 */
	void setTypeEquipementTypeEquipement(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>Localisation Localisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Localisation Localisation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localisation Localisation</em>' containment reference.
	 * @see #setLocalisationLocalisation(TypeLocalisation)
	 * @see mpia.schema.SchemaPackage#getTypeMoyenCommunication_LocalisationLocalisation()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_Localisation'"
	 *        extendedMetaData="kind='element' name='Localisation_Localisation'"
	 * @generated
	 */
	TypeLocalisation getLocalisationLocalisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeMoyenCommunication#getLocalisationLocalisation <em>Localisation Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localisation Localisation</em>' containment reference.
	 * @see #getLocalisationLocalisation()
	 * @generated
	 */
	void setLocalisationLocalisation(TypeLocalisation value);

} // TypeMoyenCommunication
