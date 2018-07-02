/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeLongueur;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Liaison Reseau</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getNaturePhysique <em>Nature Physique</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getMarge <em>Marge</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getGDHplanification <em>GD Hplanification</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getCoefficientRefractionAtmosphere <em>Coefficient Refraction Atmosphere</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getCategorieDebit <em>Categorie Debit</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getPasCoupe <em>Pas Coupe</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getModeCalcul <em>Mode Calcul</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getProfilTerrain <em>Profil Terrain</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getTypeClimat <em>Type Climat</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getNombreReductionsAutomatiquesContraintes <em>Nombre Reductions Automatiques Contraintes</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#isTransmissionContrainte <em>Transmission Contrainte</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getPolarisation <em>Polarisation</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#isSursol <em>Sursol</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getEtatLiaisonEtatLiaison <em>Etat Liaison Etat Liaison</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getAPourTypeEquipementTypeEquipementElectronique <em>APour Type Equipement Type Equipement Electronique</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getAPourExtremiteMaitrePionReseau <em>APour Extremite Maitre Pion Reseau</em>}</li>
 *   <li>{@link mpia.schema.TypeLiaisonReseau#getAPourExtremiteEsclavePionReseau <em>APour Extremite Esclave Pion Reseau</em>}</li>
 * </ul>
 * </p>
 *
 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau()
 * @model annotation="urn:MPIA-schemaInfo entity_Type='INSTANCIABLE_ENTITY'"
 *        extendedMetaData="name='type_LiaisonReseau' kind='elementOnly'"
 * @generated
 */
public interface TypeLiaisonReseau extends TypeRacineOperationnelle {
	/**
	 * Returns the value of the '<em><b>Nature Physique</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonReseauNaturePhysique}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature Physique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature Physique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauNaturePhysique
	 * @see #isSetNaturePhysique()
	 * @see #unsetNaturePhysique()
	 * @see #setNaturePhysique(TypeDictionaryDicoLiaisonReseauNaturePhysique)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_NaturePhysique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NaturePhysique'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonReseauNaturePhysique getNaturePhysique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getNaturePhysique <em>Nature Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature Physique</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauNaturePhysique
	 * @see #isSetNaturePhysique()
	 * @see #unsetNaturePhysique()
	 * @see #getNaturePhysique()
	 * @generated
	 */
	void setNaturePhysique(TypeDictionaryDicoLiaisonReseauNaturePhysique value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getNaturePhysique <em>Nature Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNaturePhysique()
	 * @see #getNaturePhysique()
	 * @see #setNaturePhysique(TypeDictionaryDicoLiaisonReseauNaturePhysique)
	 * @generated
	 */
	void unsetNaturePhysique();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getNaturePhysique <em>Nature Physique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nature Physique</em>' attribute is set.
	 * @see #unsetNaturePhysique()
	 * @see #getNaturePhysique()
	 * @see #setNaturePhysique(TypeDictionaryDicoLiaisonReseauNaturePhysique)
	 * @generated
	 */
	boolean isSetNaturePhysique();

	/**
	 * Returns the value of the '<em><b>Marge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Marge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Marge</em>' attribute.
	 * @see #isSetMarge()
	 * @see #unsetMarge()
	 * @see #setMarge(double)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_Marge()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='Marge'"
	 * @generated
	 */
	double getMarge();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getMarge <em>Marge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Marge</em>' attribute.
	 * @see #isSetMarge()
	 * @see #unsetMarge()
	 * @see #getMarge()
	 * @generated
	 */
	void setMarge(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getMarge <em>Marge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMarge()
	 * @see #getMarge()
	 * @see #setMarge(double)
	 * @generated
	 */
	void unsetMarge();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getMarge <em>Marge</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Marge</em>' attribute is set.
	 * @see #unsetMarge()
	 * @see #getMarge()
	 * @see #setMarge(double)
	 * @generated
	 */
	boolean isSetMarge();

	/**
	 * Returns the value of the '<em><b>GD Hplanification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GD Hplanification</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GD Hplanification</em>' attribute.
	 * @see #setGDHplanification(XMLGregorianCalendar)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_GDHplanification()
	 * @model dataType="mpia.meta.TypeDataTypeGDH"
	 *        extendedMetaData="kind='element' name='GDHplanification'"
	 * @generated
	 */
	XMLGregorianCalendar getGDHplanification();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getGDHplanification <em>GD Hplanification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GD Hplanification</em>' attribute.
	 * @see #getGDHplanification()
	 * @generated
	 */
	void setGDHplanification(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Coefficient Refraction Atmosphere</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coefficient Refraction Atmosphere</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coefficient Refraction Atmosphere</em>' attribute.
	 * @see #isSetCoefficientRefractionAtmosphere()
	 * @see #unsetCoefficientRefractionAtmosphere()
	 * @see #setCoefficientRefractionAtmosphere(double)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_CoefficientRefractionAtmosphere()
	 * @model unsettable="true" dataType="mpia.meta.TypeReal"
	 *        extendedMetaData="kind='element' name='CoefficientRefractionAtmosphere'"
	 * @generated
	 */
	double getCoefficientRefractionAtmosphere();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getCoefficientRefractionAtmosphere <em>Coefficient Refraction Atmosphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coefficient Refraction Atmosphere</em>' attribute.
	 * @see #isSetCoefficientRefractionAtmosphere()
	 * @see #unsetCoefficientRefractionAtmosphere()
	 * @see #getCoefficientRefractionAtmosphere()
	 * @generated
	 */
	void setCoefficientRefractionAtmosphere(double value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getCoefficientRefractionAtmosphere <em>Coefficient Refraction Atmosphere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoefficientRefractionAtmosphere()
	 * @see #getCoefficientRefractionAtmosphere()
	 * @see #setCoefficientRefractionAtmosphere(double)
	 * @generated
	 */
	void unsetCoefficientRefractionAtmosphere();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getCoefficientRefractionAtmosphere <em>Coefficient Refraction Atmosphere</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coefficient Refraction Atmosphere</em>' attribute is set.
	 * @see #unsetCoefficientRefractionAtmosphere()
	 * @see #getCoefficientRefractionAtmosphere()
	 * @see #setCoefficientRefractionAtmosphere(double)
	 * @generated
	 */
	boolean isSetCoefficientRefractionAtmosphere();

	/**
	 * Returns the value of the '<em><b>Categorie Debit</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonReseauCategorieDebit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categorie Debit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categorie Debit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauCategorieDebit
	 * @see #isSetCategorieDebit()
	 * @see #unsetCategorieDebit()
	 * @see #setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_CategorieDebit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='CategorieDebit'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonReseauCategorieDebit getCategorieDebit();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getCategorieDebit <em>Categorie Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categorie Debit</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauCategorieDebit
	 * @see #isSetCategorieDebit()
	 * @see #unsetCategorieDebit()
	 * @see #getCategorieDebit()
	 * @generated
	 */
	void setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getCategorieDebit <em>Categorie Debit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCategorieDebit()
	 * @see #getCategorieDebit()
	 * @see #setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit)
	 * @generated
	 */
	void unsetCategorieDebit();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getCategorieDebit <em>Categorie Debit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Categorie Debit</em>' attribute is set.
	 * @see #unsetCategorieDebit()
	 * @see #getCategorieDebit()
	 * @see #setCategorieDebit(TypeDictionaryDicoLiaisonReseauCategorieDebit)
	 * @generated
	 */
	boolean isSetCategorieDebit();

	/**
	 * Returns the value of the '<em><b>Pas Coupe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pas Coupe</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pas Coupe</em>' containment reference.
	 * @see #setPasCoupe(TypeDataTypeLongueur)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_PasCoupe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PasCoupe'"
	 * @generated
	 */
	TypeDataTypeLongueur getPasCoupe();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getPasCoupe <em>Pas Coupe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pas Coupe</em>' containment reference.
	 * @see #getPasCoupe()
	 * @generated
	 */
	void setPasCoupe(TypeDataTypeLongueur value);

	/**
	 * Returns the value of the '<em><b>Mode Calcul</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonReseauModeCalcul}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Calcul</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Calcul</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauModeCalcul
	 * @see #isSetModeCalcul()
	 * @see #unsetModeCalcul()
	 * @see #setModeCalcul(TypeDictionaryDicoLiaisonReseauModeCalcul)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_ModeCalcul()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ModeCalcul'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonReseauModeCalcul getModeCalcul();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getModeCalcul <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Calcul</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauModeCalcul
	 * @see #isSetModeCalcul()
	 * @see #unsetModeCalcul()
	 * @see #getModeCalcul()
	 * @generated
	 */
	void setModeCalcul(TypeDictionaryDicoLiaisonReseauModeCalcul value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getModeCalcul <em>Mode Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetModeCalcul()
	 * @see #getModeCalcul()
	 * @see #setModeCalcul(TypeDictionaryDicoLiaisonReseauModeCalcul)
	 * @generated
	 */
	void unsetModeCalcul();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getModeCalcul <em>Mode Calcul</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode Calcul</em>' attribute is set.
	 * @see #unsetModeCalcul()
	 * @see #getModeCalcul()
	 * @see #setModeCalcul(TypeDictionaryDicoLiaisonReseauModeCalcul)
	 * @generated
	 */
	boolean isSetModeCalcul();

	/**
	 * Returns the value of the '<em><b>Profil Terrain</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonReseauProfilTerrain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profil Terrain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profil Terrain</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauProfilTerrain
	 * @see #isSetProfilTerrain()
	 * @see #unsetProfilTerrain()
	 * @see #setProfilTerrain(TypeDictionaryDicoLiaisonReseauProfilTerrain)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_ProfilTerrain()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProfilTerrain'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonReseauProfilTerrain getProfilTerrain();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getProfilTerrain <em>Profil Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profil Terrain</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauProfilTerrain
	 * @see #isSetProfilTerrain()
	 * @see #unsetProfilTerrain()
	 * @see #getProfilTerrain()
	 * @generated
	 */
	void setProfilTerrain(TypeDictionaryDicoLiaisonReseauProfilTerrain value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getProfilTerrain <em>Profil Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfilTerrain()
	 * @see #getProfilTerrain()
	 * @see #setProfilTerrain(TypeDictionaryDicoLiaisonReseauProfilTerrain)
	 * @generated
	 */
	void unsetProfilTerrain();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getProfilTerrain <em>Profil Terrain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profil Terrain</em>' attribute is set.
	 * @see #unsetProfilTerrain()
	 * @see #getProfilTerrain()
	 * @see #setProfilTerrain(TypeDictionaryDicoLiaisonReseauProfilTerrain)
	 * @generated
	 */
	boolean isSetProfilTerrain();

	/**
	 * Returns the value of the '<em><b>Type Climat</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonReseauTypeClimat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Climat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Climat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauTypeClimat
	 * @see #isSetTypeClimat()
	 * @see #unsetTypeClimat()
	 * @see #setTypeClimat(TypeDictionaryDicoLiaisonReseauTypeClimat)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_TypeClimat()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='TypeClimat'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonReseauTypeClimat getTypeClimat();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getTypeClimat <em>Type Climat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Climat</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauTypeClimat
	 * @see #isSetTypeClimat()
	 * @see #unsetTypeClimat()
	 * @see #getTypeClimat()
	 * @generated
	 */
	void setTypeClimat(TypeDictionaryDicoLiaisonReseauTypeClimat value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getTypeClimat <em>Type Climat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypeClimat()
	 * @see #getTypeClimat()
	 * @see #setTypeClimat(TypeDictionaryDicoLiaisonReseauTypeClimat)
	 * @generated
	 */
	void unsetTypeClimat();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getTypeClimat <em>Type Climat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type Climat</em>' attribute is set.
	 * @see #unsetTypeClimat()
	 * @see #getTypeClimat()
	 * @see #setTypeClimat(TypeDictionaryDicoLiaisonReseauTypeClimat)
	 * @generated
	 */
	boolean isSetTypeClimat();

	/**
	 * Returns the value of the '<em><b>Nombre Reductions Automatiques Contraintes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre Reductions Automatiques Contraintes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre Reductions Automatiques Contraintes</em>' attribute.
	 * @see #isSetNombreReductionsAutomatiquesContraintes()
	 * @see #unsetNombreReductionsAutomatiquesContraintes()
	 * @see #setNombreReductionsAutomatiquesContraintes(long)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_NombreReductionsAutomatiquesContraintes()
	 * @model unsettable="true" dataType="mpia.meta.TypeDataTypeEntier3"
	 *        extendedMetaData="kind='element' name='NombreReductionsAutomatiquesContraintes'"
	 * @generated
	 */
	long getNombreReductionsAutomatiquesContraintes();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getNombreReductionsAutomatiquesContraintes <em>Nombre Reductions Automatiques Contraintes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre Reductions Automatiques Contraintes</em>' attribute.
	 * @see #isSetNombreReductionsAutomatiquesContraintes()
	 * @see #unsetNombreReductionsAutomatiquesContraintes()
	 * @see #getNombreReductionsAutomatiquesContraintes()
	 * @generated
	 */
	void setNombreReductionsAutomatiquesContraintes(long value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getNombreReductionsAutomatiquesContraintes <em>Nombre Reductions Automatiques Contraintes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNombreReductionsAutomatiquesContraintes()
	 * @see #getNombreReductionsAutomatiquesContraintes()
	 * @see #setNombreReductionsAutomatiquesContraintes(long)
	 * @generated
	 */
	void unsetNombreReductionsAutomatiquesContraintes();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getNombreReductionsAutomatiquesContraintes <em>Nombre Reductions Automatiques Contraintes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nombre Reductions Automatiques Contraintes</em>' attribute is set.
	 * @see #unsetNombreReductionsAutomatiquesContraintes()
	 * @see #getNombreReductionsAutomatiquesContraintes()
	 * @see #setNombreReductionsAutomatiquesContraintes(long)
	 * @generated
	 */
	boolean isSetNombreReductionsAutomatiquesContraintes();

	/**
	 * Returns the value of the '<em><b>Transmission Contrainte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Contrainte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Contrainte</em>' attribute.
	 * @see #isSetTransmissionContrainte()
	 * @see #unsetTransmissionContrainte()
	 * @see #setTransmissionContrainte(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_TransmissionContrainte()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='TransmissionContrainte'"
	 * @generated
	 */
	boolean isTransmissionContrainte();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#isTransmissionContrainte <em>Transmission Contrainte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Contrainte</em>' attribute.
	 * @see #isSetTransmissionContrainte()
	 * @see #unsetTransmissionContrainte()
	 * @see #isTransmissionContrainte()
	 * @generated
	 */
	void setTransmissionContrainte(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#isTransmissionContrainte <em>Transmission Contrainte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransmissionContrainte()
	 * @see #isTransmissionContrainte()
	 * @see #setTransmissionContrainte(boolean)
	 * @generated
	 */
	void unsetTransmissionContrainte();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#isTransmissionContrainte <em>Transmission Contrainte</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transmission Contrainte</em>' attribute is set.
	 * @see #unsetTransmissionContrainte()
	 * @see #isTransmissionContrainte()
	 * @see #setTransmissionContrainte(boolean)
	 * @generated
	 */
	boolean isSetTransmissionContrainte();

	/**
	 * Returns the value of the '<em><b>Polarisation</b></em>' attribute.
	 * The literals are from the enumeration {@link mpia.schema.TypeDictionaryDicoLiaisonReseauPolarisation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polarisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polarisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauPolarisation
	 * @see #isSetPolarisation()
	 * @see #unsetPolarisation()
	 * @see #setPolarisation(TypeDictionaryDicoLiaisonReseauPolarisation)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_Polarisation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Polarisation'"
	 * @generated
	 */
	TypeDictionaryDicoLiaisonReseauPolarisation getPolarisation();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getPolarisation <em>Polarisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polarisation</em>' attribute.
	 * @see mpia.schema.TypeDictionaryDicoLiaisonReseauPolarisation
	 * @see #isSetPolarisation()
	 * @see #unsetPolarisation()
	 * @see #getPolarisation()
	 * @generated
	 */
	void setPolarisation(TypeDictionaryDicoLiaisonReseauPolarisation value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#getPolarisation <em>Polarisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPolarisation()
	 * @see #getPolarisation()
	 * @see #setPolarisation(TypeDictionaryDicoLiaisonReseauPolarisation)
	 * @generated
	 */
	void unsetPolarisation();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#getPolarisation <em>Polarisation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Polarisation</em>' attribute is set.
	 * @see #unsetPolarisation()
	 * @see #getPolarisation()
	 * @see #setPolarisation(TypeDictionaryDicoLiaisonReseauPolarisation)
	 * @generated
	 */
	boolean isSetPolarisation();

	/**
	 * Returns the value of the '<em><b>Sursol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sursol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sursol</em>' attribute.
	 * @see #isSetSursol()
	 * @see #unsetSursol()
	 * @see #setSursol(boolean)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_Sursol()
	 * @model unsettable="true" dataType="mpia.meta.TypeBoolean"
	 *        extendedMetaData="kind='element' name='Sursol'"
	 * @generated
	 */
	boolean isSursol();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#isSursol <em>Sursol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sursol</em>' attribute.
	 * @see #isSetSursol()
	 * @see #unsetSursol()
	 * @see #isSursol()
	 * @generated
	 */
	void setSursol(boolean value);

	/**
	 * Unsets the value of the '{@link mpia.schema.TypeLiaisonReseau#isSursol <em>Sursol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSursol()
	 * @see #isSursol()
	 * @see #setSursol(boolean)
	 * @generated
	 */
	void unsetSursol();

	/**
	 * Returns whether the value of the '{@link mpia.schema.TypeLiaisonReseau#isSursol <em>Sursol</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sursol</em>' attribute is set.
	 * @see #unsetSursol()
	 * @see #isSursol()
	 * @see #setSursol(boolean)
	 * @generated
	 */
	boolean isSetSursol();

	/**
	 * Returns the value of the '<em><b>Etat Liaison Etat Liaison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat Liaison Etat Liaison</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat Liaison Etat Liaison</em>' containment reference.
	 * @see #setEtatLiaisonEtatLiaison(TypeEtatLiaison)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_EtatLiaisonEtatLiaison()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='AGGREGATION' target_entity='type_EtatLiaison'"
	 *        extendedMetaData="kind='element' name='EtatLiaison_EtatLiaison'"
	 * @generated
	 */
	TypeEtatLiaison getEtatLiaisonEtatLiaison();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getEtatLiaisonEtatLiaison <em>Etat Liaison Etat Liaison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat Liaison Etat Liaison</em>' containment reference.
	 * @see #getEtatLiaisonEtatLiaison()
	 * @generated
	 */
	void setEtatLiaisonEtatLiaison(TypeEtatLiaison value);

	/**
	 * Returns the value of the '<em><b>APour Type Equipement Type Equipement Electronique</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Type Equipement Type Equipement Electronique</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Type Equipement Type Equipement Electronique</em>' containment reference.
	 * @see #setAPourTypeEquipementTypeEquipementElectronique(TypeAssociationEXT)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_APourTypeEquipementTypeEquipementElectronique()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' target_entity='type_TypeEquipementElectronique'"
	 *        extendedMetaData="kind='element' name='APourTypeEquipement_TypeEquipementElectronique'"
	 * @generated
	 */
	TypeAssociationEXT getAPourTypeEquipementTypeEquipementElectronique();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getAPourTypeEquipementTypeEquipementElectronique <em>APour Type Equipement Type Equipement Electronique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Type Equipement Type Equipement Electronique</em>' containment reference.
	 * @see #getAPourTypeEquipementTypeEquipementElectronique()
	 * @generated
	 */
	void setAPourTypeEquipementTypeEquipementElectronique(TypeAssociationEXT value);

	/**
	 * Returns the value of the '<em><b>APour Extremite Maitre Pion Reseau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Extremite Maitre Pion Reseau</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Extremite Maitre Pion Reseau</em>' containment reference.
	 * @see #setAPourExtremiteMaitrePionReseau(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_APourExtremiteMaitrePionReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstMaitre_LiaisonReseau' target_entity='type_PionReseau'"
	 *        extendedMetaData="kind='element' name='APourExtremiteMaitre_PionReseau'"
	 * @generated
	 */
	TypeAssociation getAPourExtremiteMaitrePionReseau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getAPourExtremiteMaitrePionReseau <em>APour Extremite Maitre Pion Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Extremite Maitre Pion Reseau</em>' containment reference.
	 * @see #getAPourExtremiteMaitrePionReseau()
	 * @generated
	 */
	void setAPourExtremiteMaitrePionReseau(TypeAssociation value);

	/**
	 * Returns the value of the '<em><b>APour Extremite Esclave Pion Reseau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APour Extremite Esclave Pion Reseau</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APour Extremite Esclave Pion Reseau</em>' containment reference.
	 * @see #setAPourExtremiteEsclavePionReseau(TypeAssociation)
	 * @see mpia.schema.SchemaPackage#getTypeLiaisonReseau_APourExtremiteEsclavePionReseau()
	 * @model containment="true"
	 *        annotation="urn:MPIA-schemaInfo relation_type='ASSOCIATION' reverse_association='EstEsclave_LiaisonReseau' target_entity='type_PionReseau'"
	 *        extendedMetaData="kind='element' name='APourExtremiteEsclave_PionReseau'"
	 * @generated
	 */
	TypeAssociation getAPourExtremiteEsclavePionReseau();

	/**
	 * Sets the value of the '{@link mpia.schema.TypeLiaisonReseau#getAPourExtremiteEsclavePionReseau <em>APour Extremite Esclave Pion Reseau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APour Extremite Esclave Pion Reseau</em>' containment reference.
	 * @see #getAPourExtremiteEsclavePionReseau()
	 * @generated
	 */
	void setAPourExtremiteEsclavePionReseau(TypeAssociation value);

} // TypeLiaisonReseau
