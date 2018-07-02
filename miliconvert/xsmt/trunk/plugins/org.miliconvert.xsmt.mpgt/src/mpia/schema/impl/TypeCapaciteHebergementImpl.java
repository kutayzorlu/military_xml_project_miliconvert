/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCapaciteHebergement;
import mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatEauCourante;
import mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatElectricite;
import mpia.schema.TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux;
import mpia.schema.TypeDictionaryDicoCapaciteHebergementType;
import mpia.schema.TypeDictionaryDicoCapaciteHebergementTypeDistributionEau;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Capacite Hebergement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getBesoinApproSpecifique <em>Besoin Appro Specifique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getCapaciteTotaleAccueil <em>Capacite Totale Accueil</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getConditionsRavitaillement <em>Conditions Ravitaillement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getContraintesAlimentaires <em>Contraintes Alimentaires</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getDisponibilite <em>Disponibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getEtatSite <em>Etat Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getEtatEntretien <em>Etat Entretien</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getEtatSanitaire <em>Etat Sanitaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getEtatEauCourante <em>Etat Eau Courante</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getEtatElectricite <em>Etat Electricite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getEtatPhysique <em>Etat Physique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getEtatMoral <em>Etat Moral</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getEtatSoinsMedicaux <em>Etat Soins Medicaux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreBasAge <em>Nombre Bas Age</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreEnfants <em>Nombre Enfants</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreFemmes <em>Nombre Femmes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreHommes <em>Nombre Hommes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreMalades <em>Nombre Malades</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreVieillar <em>Nombre Vieillar</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreMedecins <em>Nombre Medecins</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreInfirmiers <em>Nombre Infirmiers</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getNombreTotal <em>Nombre Total</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getPathologies <em>Pathologies</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getPourcentageOccupation <em>Pourcentage Occupation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getQualiteApprovisionnement <em>Qualite Approvisionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteHebergementImpl#getTypeDistributionEau <em>Type Distribution Eau</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCapaciteHebergementImpl extends TypeCapaciteImpl implements TypeCapaciteHebergement {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteHebergementType TYPE_EDEFAULT = TypeDictionaryDicoCapaciteHebergementType.WARE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteHebergementType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getBesoinApproSpecifique() <em>Besoin Appro Specifique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesoinApproSpecifique()
	 * @generated
	 * @ordered
	 */
	protected static final String BESOIN_APPRO_SPECIFIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBesoinApproSpecifique() <em>Besoin Appro Specifique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesoinApproSpecifique()
	 * @generated
	 * @ordered
	 */
	protected String besoinApproSpecifique = BESOIN_APPRO_SPECIFIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapaciteTotaleAccueil() <em>Capacite Totale Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteTotaleAccueil()
	 * @generated
	 * @ordered
	 */
	protected static final long CAPACITE_TOTALE_ACCUEIL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCapaciteTotaleAccueil() <em>Capacite Totale Accueil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteTotaleAccueil()
	 * @generated
	 * @ordered
	 */
	protected long capaciteTotaleAccueil = CAPACITE_TOTALE_ACCUEIL_EDEFAULT;

	/**
	 * This is true if the Capacite Totale Accueil attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteTotaleAccueilESet;

	/**
	 * The default value of the '{@link #getConditionsRavitaillement() <em>Conditions Ravitaillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsRavitaillement()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITIONS_RAVITAILLEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionsRavitaillement() <em>Conditions Ravitaillement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionsRavitaillement()
	 * @generated
	 * @ordered
	 */
	protected String conditionsRavitaillement = CONDITIONS_RAVITAILLEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getContraintesAlimentaires() <em>Contraintes Alimentaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintesAlimentaires()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRAINTES_ALIMENTAIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContraintesAlimentaires() <em>Contraintes Alimentaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintesAlimentaires()
	 * @generated
	 * @ordered
	 */
	protected String contraintesAlimentaires = CONTRAINTES_ALIMENTAIRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisponibilite() <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected static final long DISPONIBILITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDisponibilite() <em>Disponibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisponibilite()
	 * @generated
	 * @ordered
	 */
	protected long disponibilite = DISPONIBILITE_EDEFAULT;

	/**
	 * This is true if the Disponibilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean disponibiliteESet;

	/**
	 * The default value of the '{@link #getEtatSite() <em>Etat Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSite()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_SITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtatSite() <em>Etat Site</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSite()
	 * @generated
	 * @ordered
	 */
	protected String etatSite = ETAT_SITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatEntretien() <em>Etat Entretien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatEntretien()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_ENTRETIEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtatEntretien() <em>Etat Entretien</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatEntretien()
	 * @generated
	 * @ordered
	 */
	protected String etatEntretien = ETAT_ENTRETIEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatSanitaire() <em>Etat Sanitaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSanitaire()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_SANITAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtatSanitaire() <em>Etat Sanitaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSanitaire()
	 * @generated
	 * @ordered
	 */
	protected String etatSanitaire = ETAT_SANITAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatEauCourante() <em>Etat Eau Courante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatEauCourante()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteHebergementEtatEauCourante ETAT_EAU_COURANTE_EDEFAULT = TypeDictionaryDicoCapaciteHebergementEtatEauCourante.MOPS;

	/**
	 * The cached value of the '{@link #getEtatEauCourante() <em>Etat Eau Courante</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatEauCourante()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteHebergementEtatEauCourante etatEauCourante = ETAT_EAU_COURANTE_EDEFAULT;

	/**
	 * This is true if the Etat Eau Courante attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatEauCouranteESet;

	/**
	 * The default value of the '{@link #getEtatElectricite() <em>Etat Electricite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatElectricite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteHebergementEtatElectricite ETAT_ELECTRICITE_EDEFAULT = TypeDictionaryDicoCapaciteHebergementEtatElectricite.MOPS;

	/**
	 * The cached value of the '{@link #getEtatElectricite() <em>Etat Electricite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatElectricite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteHebergementEtatElectricite etatElectricite = ETAT_ELECTRICITE_EDEFAULT;

	/**
	 * This is true if the Etat Electricite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatElectriciteESet;

	/**
	 * The default value of the '{@link #getEtatPhysique() <em>Etat Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPhysique()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_PHYSIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtatPhysique() <em>Etat Physique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatPhysique()
	 * @generated
	 * @ordered
	 */
	protected String etatPhysique = ETAT_PHYSIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatMoral() <em>Etat Moral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatMoral()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_MORAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtatMoral() <em>Etat Moral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatMoral()
	 * @generated
	 * @ordered
	 */
	protected String etatMoral = ETAT_MORAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatSoinsMedicaux() <em>Etat Soins Medicaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSoinsMedicaux()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux ETAT_SOINS_MEDICAUX_EDEFAULT = TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux._1;

	/**
	 * The cached value of the '{@link #getEtatSoinsMedicaux() <em>Etat Soins Medicaux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatSoinsMedicaux()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux etatSoinsMedicaux = ETAT_SOINS_MEDICAUX_EDEFAULT;

	/**
	 * This is true if the Etat Soins Medicaux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatSoinsMedicauxESet;

	/**
	 * The default value of the '{@link #getNombreBasAge() <em>Nombre Bas Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreBasAge()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_BAS_AGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreBasAge() <em>Nombre Bas Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreBasAge()
	 * @generated
	 * @ordered
	 */
	protected long nombreBasAge = NOMBRE_BAS_AGE_EDEFAULT;

	/**
	 * This is true if the Nombre Bas Age attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreBasAgeESet;

	/**
	 * The default value of the '{@link #getNombreEnfants() <em>Nombre Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEnfants()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_ENFANTS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreEnfants() <em>Nombre Enfants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreEnfants()
	 * @generated
	 * @ordered
	 */
	protected long nombreEnfants = NOMBRE_ENFANTS_EDEFAULT;

	/**
	 * This is true if the Nombre Enfants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreEnfantsESet;

	/**
	 * The default value of the '{@link #getNombreFemmes() <em>Nombre Femmes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreFemmes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_FEMMES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreFemmes() <em>Nombre Femmes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreFemmes()
	 * @generated
	 * @ordered
	 */
	protected long nombreFemmes = NOMBRE_FEMMES_EDEFAULT;

	/**
	 * This is true if the Nombre Femmes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreFemmesESet;

	/**
	 * The default value of the '{@link #getNombreHommes() <em>Nombre Hommes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreHommes()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_HOMMES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreHommes() <em>Nombre Hommes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreHommes()
	 * @generated
	 * @ordered
	 */
	protected long nombreHommes = NOMBRE_HOMMES_EDEFAULT;

	/**
	 * This is true if the Nombre Hommes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreHommesESet;

	/**
	 * The default value of the '{@link #getNombreMalades() <em>Nombre Malades</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMalades()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MALADES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMalades() <em>Nombre Malades</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMalades()
	 * @generated
	 * @ordered
	 */
	protected long nombreMalades = NOMBRE_MALADES_EDEFAULT;

	/**
	 * This is true if the Nombre Malades attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMaladesESet;

	/**
	 * The default value of the '{@link #getNombreVieillar() <em>Nombre Vieillar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVieillar()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_VIEILLAR_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreVieillar() <em>Nombre Vieillar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreVieillar()
	 * @generated
	 * @ordered
	 */
	protected long nombreVieillar = NOMBRE_VIEILLAR_EDEFAULT;

	/**
	 * This is true if the Nombre Vieillar attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreVieillarESet;

	/**
	 * The default value of the '{@link #getNombreMedecins() <em>Nombre Medecins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMedecins()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MEDECINS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMedecins() <em>Nombre Medecins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMedecins()
	 * @generated
	 * @ordered
	 */
	protected long nombreMedecins = NOMBRE_MEDECINS_EDEFAULT;

	/**
	 * This is true if the Nombre Medecins attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMedecinsESet;

	/**
	 * The default value of the '{@link #getNombreInfirmiers() <em>Nombre Infirmiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreInfirmiers()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_INFIRMIERS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreInfirmiers() <em>Nombre Infirmiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreInfirmiers()
	 * @generated
	 * @ordered
	 */
	protected long nombreInfirmiers = NOMBRE_INFIRMIERS_EDEFAULT;

	/**
	 * This is true if the Nombre Infirmiers attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreInfirmiersESet;

	/**
	 * The default value of the '{@link #getNombreTotal() <em>Nombre Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotal()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TOTAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTotal() <em>Nombre Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTotal()
	 * @generated
	 * @ordered
	 */
	protected long nombreTotal = NOMBRE_TOTAL_EDEFAULT;

	/**
	 * This is true if the Nombre Total attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTotalESet;

	/**
	 * The default value of the '{@link #getPathologies() <em>Pathologies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathologies()
	 * @generated
	 * @ordered
	 */
	protected static final String PATHOLOGIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathologies() <em>Pathologies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathologies()
	 * @generated
	 * @ordered
	 */
	protected String pathologies = PATHOLOGIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPourcentageOccupation() <em>Pourcentage Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageOccupation()
	 * @generated
	 * @ordered
	 */
	protected static final long POURCENTAGE_OCCUPATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPourcentageOccupation() <em>Pourcentage Occupation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageOccupation()
	 * @generated
	 * @ordered
	 */
	protected long pourcentageOccupation = POURCENTAGE_OCCUPATION_EDEFAULT;

	/**
	 * This is true if the Pourcentage Occupation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageOccupationESet;

	/**
	 * The default value of the '{@link #getQualiteApprovisionnement() <em>Qualite Approvisionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualiteApprovisionnement()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITE_APPROVISIONNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualiteApprovisionnement() <em>Qualite Approvisionnement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualiteApprovisionnement()
	 * @generated
	 * @ordered
	 */
	protected String qualiteApprovisionnement = QUALITE_APPROVISIONNEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeDistributionEau() <em>Type Distribution Eau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDistributionEau()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteHebergementTypeDistributionEau TYPE_DISTRIBUTION_EAU_EDEFAULT = TypeDictionaryDicoCapaciteHebergementTypeDistributionEau.RUNNING;

	/**
	 * The cached value of the '{@link #getTypeDistributionEau() <em>Type Distribution Eau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDistributionEau()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteHebergementTypeDistributionEau typeDistributionEau = TYPE_DISTRIBUTION_EAU_EDEFAULT;

	/**
	 * This is true if the Type Distribution Eau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDistributionEauESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteHebergementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapaciteHebergement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteHebergementType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoCapaciteHebergementType newType) {
		TypeDictionaryDicoCapaciteHebergementType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoCapaciteHebergementType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBesoinApproSpecifique() {
		return besoinApproSpecifique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBesoinApproSpecifique(String newBesoinApproSpecifique) {
		String oldBesoinApproSpecifique = besoinApproSpecifique;
		besoinApproSpecifique = newBesoinApproSpecifique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__BESOIN_APPRO_SPECIFIQUE, oldBesoinApproSpecifique, besoinApproSpecifique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCapaciteTotaleAccueil() {
		return capaciteTotaleAccueil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteTotaleAccueil(long newCapaciteTotaleAccueil) {
		long oldCapaciteTotaleAccueil = capaciteTotaleAccueil;
		capaciteTotaleAccueil = newCapaciteTotaleAccueil;
		boolean oldCapaciteTotaleAccueilESet = capaciteTotaleAccueilESet;
		capaciteTotaleAccueilESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CAPACITE_TOTALE_ACCUEIL, oldCapaciteTotaleAccueil, capaciteTotaleAccueil, !oldCapaciteTotaleAccueilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteTotaleAccueil() {
		long oldCapaciteTotaleAccueil = capaciteTotaleAccueil;
		boolean oldCapaciteTotaleAccueilESet = capaciteTotaleAccueilESet;
		capaciteTotaleAccueil = CAPACITE_TOTALE_ACCUEIL_EDEFAULT;
		capaciteTotaleAccueilESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CAPACITE_TOTALE_ACCUEIL, oldCapaciteTotaleAccueil, CAPACITE_TOTALE_ACCUEIL_EDEFAULT, oldCapaciteTotaleAccueilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteTotaleAccueil() {
		return capaciteTotaleAccueilESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionsRavitaillement() {
		return conditionsRavitaillement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionsRavitaillement(String newConditionsRavitaillement) {
		String oldConditionsRavitaillement = conditionsRavitaillement;
		conditionsRavitaillement = newConditionsRavitaillement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONDITIONS_RAVITAILLEMENT, oldConditionsRavitaillement, conditionsRavitaillement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContraintesAlimentaires() {
		return contraintesAlimentaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraintesAlimentaires(String newContraintesAlimentaires) {
		String oldContraintesAlimentaires = contraintesAlimentaires;
		contraintesAlimentaires = newContraintesAlimentaires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONTRAINTES_ALIMENTAIRES, oldContraintesAlimentaires, contraintesAlimentaires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDisponibilite() {
		return disponibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisponibilite(long newDisponibilite) {
		long oldDisponibilite = disponibilite;
		disponibilite = newDisponibilite;
		boolean oldDisponibiliteESet = disponibiliteESet;
		disponibiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__DISPONIBILITE, oldDisponibilite, disponibilite, !oldDisponibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisponibilite() {
		long oldDisponibilite = disponibilite;
		boolean oldDisponibiliteESet = disponibiliteESet;
		disponibilite = DISPONIBILITE_EDEFAULT;
		disponibiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__DISPONIBILITE, oldDisponibilite, DISPONIBILITE_EDEFAULT, oldDisponibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisponibilite() {
		return disponibiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtatSite() {
		return etatSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSite(String newEtatSite) {
		String oldEtatSite = etatSite;
		etatSite = newEtatSite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SITE, oldEtatSite, etatSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtatEntretien() {
		return etatEntretien;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatEntretien(String newEtatEntretien) {
		String oldEtatEntretien = etatEntretien;
		etatEntretien = newEtatEntretien;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ENTRETIEN, oldEtatEntretien, etatEntretien));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtatSanitaire() {
		return etatSanitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSanitaire(String newEtatSanitaire) {
		String oldEtatSanitaire = etatSanitaire;
		etatSanitaire = newEtatSanitaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SANITAIRE, oldEtatSanitaire, etatSanitaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteHebergementEtatEauCourante getEtatEauCourante() {
		return etatEauCourante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatEauCourante(TypeDictionaryDicoCapaciteHebergementEtatEauCourante newEtatEauCourante) {
		TypeDictionaryDicoCapaciteHebergementEtatEauCourante oldEtatEauCourante = etatEauCourante;
		etatEauCourante = newEtatEauCourante == null ? ETAT_EAU_COURANTE_EDEFAULT : newEtatEauCourante;
		boolean oldEtatEauCouranteESet = etatEauCouranteESet;
		etatEauCouranteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_EAU_COURANTE, oldEtatEauCourante, etatEauCourante, !oldEtatEauCouranteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatEauCourante() {
		TypeDictionaryDicoCapaciteHebergementEtatEauCourante oldEtatEauCourante = etatEauCourante;
		boolean oldEtatEauCouranteESet = etatEauCouranteESet;
		etatEauCourante = ETAT_EAU_COURANTE_EDEFAULT;
		etatEauCouranteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_EAU_COURANTE, oldEtatEauCourante, ETAT_EAU_COURANTE_EDEFAULT, oldEtatEauCouranteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatEauCourante() {
		return etatEauCouranteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteHebergementEtatElectricite getEtatElectricite() {
		return etatElectricite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatElectricite(TypeDictionaryDicoCapaciteHebergementEtatElectricite newEtatElectricite) {
		TypeDictionaryDicoCapaciteHebergementEtatElectricite oldEtatElectricite = etatElectricite;
		etatElectricite = newEtatElectricite == null ? ETAT_ELECTRICITE_EDEFAULT : newEtatElectricite;
		boolean oldEtatElectriciteESet = etatElectriciteESet;
		etatElectriciteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ELECTRICITE, oldEtatElectricite, etatElectricite, !oldEtatElectriciteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatElectricite() {
		TypeDictionaryDicoCapaciteHebergementEtatElectricite oldEtatElectricite = etatElectricite;
		boolean oldEtatElectriciteESet = etatElectriciteESet;
		etatElectricite = ETAT_ELECTRICITE_EDEFAULT;
		etatElectriciteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ELECTRICITE, oldEtatElectricite, ETAT_ELECTRICITE_EDEFAULT, oldEtatElectriciteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatElectricite() {
		return etatElectriciteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtatPhysique() {
		return etatPhysique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatPhysique(String newEtatPhysique) {
		String oldEtatPhysique = etatPhysique;
		etatPhysique = newEtatPhysique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_PHYSIQUE, oldEtatPhysique, etatPhysique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtatMoral() {
		return etatMoral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatMoral(String newEtatMoral) {
		String oldEtatMoral = etatMoral;
		etatMoral = newEtatMoral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_MORAL, oldEtatMoral, etatMoral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux getEtatSoinsMedicaux() {
		return etatSoinsMedicaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatSoinsMedicaux(TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux newEtatSoinsMedicaux) {
		TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux oldEtatSoinsMedicaux = etatSoinsMedicaux;
		etatSoinsMedicaux = newEtatSoinsMedicaux == null ? ETAT_SOINS_MEDICAUX_EDEFAULT : newEtatSoinsMedicaux;
		boolean oldEtatSoinsMedicauxESet = etatSoinsMedicauxESet;
		etatSoinsMedicauxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SOINS_MEDICAUX, oldEtatSoinsMedicaux, etatSoinsMedicaux, !oldEtatSoinsMedicauxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatSoinsMedicaux() {
		TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux oldEtatSoinsMedicaux = etatSoinsMedicaux;
		boolean oldEtatSoinsMedicauxESet = etatSoinsMedicauxESet;
		etatSoinsMedicaux = ETAT_SOINS_MEDICAUX_EDEFAULT;
		etatSoinsMedicauxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SOINS_MEDICAUX, oldEtatSoinsMedicaux, ETAT_SOINS_MEDICAUX_EDEFAULT, oldEtatSoinsMedicauxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatSoinsMedicaux() {
		return etatSoinsMedicauxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreBasAge() {
		return nombreBasAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreBasAge(long newNombreBasAge) {
		long oldNombreBasAge = nombreBasAge;
		nombreBasAge = newNombreBasAge;
		boolean oldNombreBasAgeESet = nombreBasAgeESet;
		nombreBasAgeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_BAS_AGE, oldNombreBasAge, nombreBasAge, !oldNombreBasAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreBasAge() {
		long oldNombreBasAge = nombreBasAge;
		boolean oldNombreBasAgeESet = nombreBasAgeESet;
		nombreBasAge = NOMBRE_BAS_AGE_EDEFAULT;
		nombreBasAgeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_BAS_AGE, oldNombreBasAge, NOMBRE_BAS_AGE_EDEFAULT, oldNombreBasAgeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreBasAge() {
		return nombreBasAgeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreEnfants() {
		return nombreEnfants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreEnfants(long newNombreEnfants) {
		long oldNombreEnfants = nombreEnfants;
		nombreEnfants = newNombreEnfants;
		boolean oldNombreEnfantsESet = nombreEnfantsESet;
		nombreEnfantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_ENFANTS, oldNombreEnfants, nombreEnfants, !oldNombreEnfantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreEnfants() {
		long oldNombreEnfants = nombreEnfants;
		boolean oldNombreEnfantsESet = nombreEnfantsESet;
		nombreEnfants = NOMBRE_ENFANTS_EDEFAULT;
		nombreEnfantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_ENFANTS, oldNombreEnfants, NOMBRE_ENFANTS_EDEFAULT, oldNombreEnfantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreEnfants() {
		return nombreEnfantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreFemmes() {
		return nombreFemmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreFemmes(long newNombreFemmes) {
		long oldNombreFemmes = nombreFemmes;
		nombreFemmes = newNombreFemmes;
		boolean oldNombreFemmesESet = nombreFemmesESet;
		nombreFemmesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_FEMMES, oldNombreFemmes, nombreFemmes, !oldNombreFemmesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreFemmes() {
		long oldNombreFemmes = nombreFemmes;
		boolean oldNombreFemmesESet = nombreFemmesESet;
		nombreFemmes = NOMBRE_FEMMES_EDEFAULT;
		nombreFemmesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_FEMMES, oldNombreFemmes, NOMBRE_FEMMES_EDEFAULT, oldNombreFemmesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreFemmes() {
		return nombreFemmesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreHommes() {
		return nombreHommes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreHommes(long newNombreHommes) {
		long oldNombreHommes = nombreHommes;
		nombreHommes = newNombreHommes;
		boolean oldNombreHommesESet = nombreHommesESet;
		nombreHommesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_HOMMES, oldNombreHommes, nombreHommes, !oldNombreHommesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreHommes() {
		long oldNombreHommes = nombreHommes;
		boolean oldNombreHommesESet = nombreHommesESet;
		nombreHommes = NOMBRE_HOMMES_EDEFAULT;
		nombreHommesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_HOMMES, oldNombreHommes, NOMBRE_HOMMES_EDEFAULT, oldNombreHommesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreHommes() {
		return nombreHommesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMalades() {
		return nombreMalades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMalades(long newNombreMalades) {
		long oldNombreMalades = nombreMalades;
		nombreMalades = newNombreMalades;
		boolean oldNombreMaladesESet = nombreMaladesESet;
		nombreMaladesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MALADES, oldNombreMalades, nombreMalades, !oldNombreMaladesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMalades() {
		long oldNombreMalades = nombreMalades;
		boolean oldNombreMaladesESet = nombreMaladesESet;
		nombreMalades = NOMBRE_MALADES_EDEFAULT;
		nombreMaladesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MALADES, oldNombreMalades, NOMBRE_MALADES_EDEFAULT, oldNombreMaladesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMalades() {
		return nombreMaladesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreVieillar() {
		return nombreVieillar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreVieillar(long newNombreVieillar) {
		long oldNombreVieillar = nombreVieillar;
		nombreVieillar = newNombreVieillar;
		boolean oldNombreVieillarESet = nombreVieillarESet;
		nombreVieillarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_VIEILLAR, oldNombreVieillar, nombreVieillar, !oldNombreVieillarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreVieillar() {
		long oldNombreVieillar = nombreVieillar;
		boolean oldNombreVieillarESet = nombreVieillarESet;
		nombreVieillar = NOMBRE_VIEILLAR_EDEFAULT;
		nombreVieillarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_VIEILLAR, oldNombreVieillar, NOMBRE_VIEILLAR_EDEFAULT, oldNombreVieillarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreVieillar() {
		return nombreVieillarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMedecins() {
		return nombreMedecins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMedecins(long newNombreMedecins) {
		long oldNombreMedecins = nombreMedecins;
		nombreMedecins = newNombreMedecins;
		boolean oldNombreMedecinsESet = nombreMedecinsESet;
		nombreMedecinsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MEDECINS, oldNombreMedecins, nombreMedecins, !oldNombreMedecinsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMedecins() {
		long oldNombreMedecins = nombreMedecins;
		boolean oldNombreMedecinsESet = nombreMedecinsESet;
		nombreMedecins = NOMBRE_MEDECINS_EDEFAULT;
		nombreMedecinsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MEDECINS, oldNombreMedecins, NOMBRE_MEDECINS_EDEFAULT, oldNombreMedecinsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMedecins() {
		return nombreMedecinsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreInfirmiers() {
		return nombreInfirmiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreInfirmiers(long newNombreInfirmiers) {
		long oldNombreInfirmiers = nombreInfirmiers;
		nombreInfirmiers = newNombreInfirmiers;
		boolean oldNombreInfirmiersESet = nombreInfirmiersESet;
		nombreInfirmiersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_INFIRMIERS, oldNombreInfirmiers, nombreInfirmiers, !oldNombreInfirmiersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreInfirmiers() {
		long oldNombreInfirmiers = nombreInfirmiers;
		boolean oldNombreInfirmiersESet = nombreInfirmiersESet;
		nombreInfirmiers = NOMBRE_INFIRMIERS_EDEFAULT;
		nombreInfirmiersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_INFIRMIERS, oldNombreInfirmiers, NOMBRE_INFIRMIERS_EDEFAULT, oldNombreInfirmiersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreInfirmiers() {
		return nombreInfirmiersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTotal() {
		return nombreTotal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTotal(long newNombreTotal) {
		long oldNombreTotal = nombreTotal;
		nombreTotal = newNombreTotal;
		boolean oldNombreTotalESet = nombreTotalESet;
		nombreTotalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_TOTAL, oldNombreTotal, nombreTotal, !oldNombreTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTotal() {
		long oldNombreTotal = nombreTotal;
		boolean oldNombreTotalESet = nombreTotalESet;
		nombreTotal = NOMBRE_TOTAL_EDEFAULT;
		nombreTotalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_TOTAL, oldNombreTotal, NOMBRE_TOTAL_EDEFAULT, oldNombreTotalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTotal() {
		return nombreTotalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathologies() {
		return pathologies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathologies(String newPathologies) {
		String oldPathologies = pathologies;
		pathologies = newPathologies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__PATHOLOGIES, oldPathologies, pathologies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPourcentageOccupation() {
		return pourcentageOccupation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageOccupation(long newPourcentageOccupation) {
		long oldPourcentageOccupation = pourcentageOccupation;
		pourcentageOccupation = newPourcentageOccupation;
		boolean oldPourcentageOccupationESet = pourcentageOccupationESet;
		pourcentageOccupationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__POURCENTAGE_OCCUPATION, oldPourcentageOccupation, pourcentageOccupation, !oldPourcentageOccupationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageOccupation() {
		long oldPourcentageOccupation = pourcentageOccupation;
		boolean oldPourcentageOccupationESet = pourcentageOccupationESet;
		pourcentageOccupation = POURCENTAGE_OCCUPATION_EDEFAULT;
		pourcentageOccupationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__POURCENTAGE_OCCUPATION, oldPourcentageOccupation, POURCENTAGE_OCCUPATION_EDEFAULT, oldPourcentageOccupationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageOccupation() {
		return pourcentageOccupationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualiteApprovisionnement() {
		return qualiteApprovisionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualiteApprovisionnement(String newQualiteApprovisionnement) {
		String oldQualiteApprovisionnement = qualiteApprovisionnement;
		qualiteApprovisionnement = newQualiteApprovisionnement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__QUALITE_APPROVISIONNEMENT, oldQualiteApprovisionnement, qualiteApprovisionnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteHebergementTypeDistributionEau getTypeDistributionEau() {
		return typeDistributionEau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDistributionEau(TypeDictionaryDicoCapaciteHebergementTypeDistributionEau newTypeDistributionEau) {
		TypeDictionaryDicoCapaciteHebergementTypeDistributionEau oldTypeDistributionEau = typeDistributionEau;
		typeDistributionEau = newTypeDistributionEau == null ? TYPE_DISTRIBUTION_EAU_EDEFAULT : newTypeDistributionEau;
		boolean oldTypeDistributionEauESet = typeDistributionEauESet;
		typeDistributionEauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE_DISTRIBUTION_EAU, oldTypeDistributionEau, typeDistributionEau, !oldTypeDistributionEauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDistributionEau() {
		TypeDictionaryDicoCapaciteHebergementTypeDistributionEau oldTypeDistributionEau = typeDistributionEau;
		boolean oldTypeDistributionEauESet = typeDistributionEauESet;
		typeDistributionEau = TYPE_DISTRIBUTION_EAU_EDEFAULT;
		typeDistributionEauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE_DISTRIBUTION_EAU, oldTypeDistributionEau, TYPE_DISTRIBUTION_EAU_EDEFAULT, oldTypeDistributionEauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDistributionEau() {
		return typeDistributionEauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE:
				return getType();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__BESOIN_APPRO_SPECIFIQUE:
				return getBesoinApproSpecifique();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CAPACITE_TOTALE_ACCUEIL:
				return new Long(getCapaciteTotaleAccueil());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONDITIONS_RAVITAILLEMENT:
				return getConditionsRavitaillement();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONTRAINTES_ALIMENTAIRES:
				return getContraintesAlimentaires();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__DISPONIBILITE:
				return new Long(getDisponibilite());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SITE:
				return getEtatSite();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ENTRETIEN:
				return getEtatEntretien();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SANITAIRE:
				return getEtatSanitaire();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_EAU_COURANTE:
				return getEtatEauCourante();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ELECTRICITE:
				return getEtatElectricite();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_PHYSIQUE:
				return getEtatPhysique();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_MORAL:
				return getEtatMoral();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SOINS_MEDICAUX:
				return getEtatSoinsMedicaux();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_BAS_AGE:
				return new Long(getNombreBasAge());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_ENFANTS:
				return new Long(getNombreEnfants());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_FEMMES:
				return new Long(getNombreFemmes());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_HOMMES:
				return new Long(getNombreHommes());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MALADES:
				return new Long(getNombreMalades());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_VIEILLAR:
				return new Long(getNombreVieillar());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MEDECINS:
				return new Long(getNombreMedecins());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_INFIRMIERS:
				return new Long(getNombreInfirmiers());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_TOTAL:
				return new Long(getNombreTotal());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__PATHOLOGIES:
				return getPathologies();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__POURCENTAGE_OCCUPATION:
				return new Long(getPourcentageOccupation());
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__QUALITE_APPROVISIONNEMENT:
				return getQualiteApprovisionnement();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE_DISTRIBUTION_EAU:
				return getTypeDistributionEau();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE:
				setType((TypeDictionaryDicoCapaciteHebergementType)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__BESOIN_APPRO_SPECIFIQUE:
				setBesoinApproSpecifique((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CAPACITE_TOTALE_ACCUEIL:
				setCapaciteTotaleAccueil(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONDITIONS_RAVITAILLEMENT:
				setConditionsRavitaillement((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONTRAINTES_ALIMENTAIRES:
				setContraintesAlimentaires((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__DISPONIBILITE:
				setDisponibilite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SITE:
				setEtatSite((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ENTRETIEN:
				setEtatEntretien((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SANITAIRE:
				setEtatSanitaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_EAU_COURANTE:
				setEtatEauCourante((TypeDictionaryDicoCapaciteHebergementEtatEauCourante)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ELECTRICITE:
				setEtatElectricite((TypeDictionaryDicoCapaciteHebergementEtatElectricite)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_PHYSIQUE:
				setEtatPhysique((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_MORAL:
				setEtatMoral((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SOINS_MEDICAUX:
				setEtatSoinsMedicaux((TypeDictionaryDicoCapaciteHebergementEtatSoinsMedicaux)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_BAS_AGE:
				setNombreBasAge(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_ENFANTS:
				setNombreEnfants(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_FEMMES:
				setNombreFemmes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_HOMMES:
				setNombreHommes(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MALADES:
				setNombreMalades(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_VIEILLAR:
				setNombreVieillar(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MEDECINS:
				setNombreMedecins(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_INFIRMIERS:
				setNombreInfirmiers(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_TOTAL:
				setNombreTotal(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__PATHOLOGIES:
				setPathologies((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__POURCENTAGE_OCCUPATION:
				setPourcentageOccupation(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__QUALITE_APPROVISIONNEMENT:
				setQualiteApprovisionnement((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE_DISTRIBUTION_EAU:
				setTypeDistributionEau((TypeDictionaryDicoCapaciteHebergementTypeDistributionEau)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__BESOIN_APPRO_SPECIFIQUE:
				setBesoinApproSpecifique(BESOIN_APPRO_SPECIFIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CAPACITE_TOTALE_ACCUEIL:
				unsetCapaciteTotaleAccueil();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONDITIONS_RAVITAILLEMENT:
				setConditionsRavitaillement(CONDITIONS_RAVITAILLEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONTRAINTES_ALIMENTAIRES:
				setContraintesAlimentaires(CONTRAINTES_ALIMENTAIRES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__DISPONIBILITE:
				unsetDisponibilite();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SITE:
				setEtatSite(ETAT_SITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ENTRETIEN:
				setEtatEntretien(ETAT_ENTRETIEN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SANITAIRE:
				setEtatSanitaire(ETAT_SANITAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_EAU_COURANTE:
				unsetEtatEauCourante();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ELECTRICITE:
				unsetEtatElectricite();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_PHYSIQUE:
				setEtatPhysique(ETAT_PHYSIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_MORAL:
				setEtatMoral(ETAT_MORAL_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SOINS_MEDICAUX:
				unsetEtatSoinsMedicaux();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_BAS_AGE:
				unsetNombreBasAge();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_ENFANTS:
				unsetNombreEnfants();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_FEMMES:
				unsetNombreFemmes();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_HOMMES:
				unsetNombreHommes();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MALADES:
				unsetNombreMalades();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_VIEILLAR:
				unsetNombreVieillar();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MEDECINS:
				unsetNombreMedecins();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_INFIRMIERS:
				unsetNombreInfirmiers();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_TOTAL:
				unsetNombreTotal();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__PATHOLOGIES:
				setPathologies(PATHOLOGIES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__POURCENTAGE_OCCUPATION:
				unsetPourcentageOccupation();
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__QUALITE_APPROVISIONNEMENT:
				setQualiteApprovisionnement(QUALITE_APPROVISIONNEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE_DISTRIBUTION_EAU:
				unsetTypeDistributionEau();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__BESOIN_APPRO_SPECIFIQUE:
				return BESOIN_APPRO_SPECIFIQUE_EDEFAULT == null ? besoinApproSpecifique != null : !BESOIN_APPRO_SPECIFIQUE_EDEFAULT.equals(besoinApproSpecifique);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CAPACITE_TOTALE_ACCUEIL:
				return isSetCapaciteTotaleAccueil();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONDITIONS_RAVITAILLEMENT:
				return CONDITIONS_RAVITAILLEMENT_EDEFAULT == null ? conditionsRavitaillement != null : !CONDITIONS_RAVITAILLEMENT_EDEFAULT.equals(conditionsRavitaillement);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__CONTRAINTES_ALIMENTAIRES:
				return CONTRAINTES_ALIMENTAIRES_EDEFAULT == null ? contraintesAlimentaires != null : !CONTRAINTES_ALIMENTAIRES_EDEFAULT.equals(contraintesAlimentaires);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__DISPONIBILITE:
				return isSetDisponibilite();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SITE:
				return ETAT_SITE_EDEFAULT == null ? etatSite != null : !ETAT_SITE_EDEFAULT.equals(etatSite);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ENTRETIEN:
				return ETAT_ENTRETIEN_EDEFAULT == null ? etatEntretien != null : !ETAT_ENTRETIEN_EDEFAULT.equals(etatEntretien);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SANITAIRE:
				return ETAT_SANITAIRE_EDEFAULT == null ? etatSanitaire != null : !ETAT_SANITAIRE_EDEFAULT.equals(etatSanitaire);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_EAU_COURANTE:
				return isSetEtatEauCourante();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_ELECTRICITE:
				return isSetEtatElectricite();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_PHYSIQUE:
				return ETAT_PHYSIQUE_EDEFAULT == null ? etatPhysique != null : !ETAT_PHYSIQUE_EDEFAULT.equals(etatPhysique);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_MORAL:
				return ETAT_MORAL_EDEFAULT == null ? etatMoral != null : !ETAT_MORAL_EDEFAULT.equals(etatMoral);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__ETAT_SOINS_MEDICAUX:
				return isSetEtatSoinsMedicaux();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_BAS_AGE:
				return isSetNombreBasAge();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_ENFANTS:
				return isSetNombreEnfants();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_FEMMES:
				return isSetNombreFemmes();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_HOMMES:
				return isSetNombreHommes();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MALADES:
				return isSetNombreMalades();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_VIEILLAR:
				return isSetNombreVieillar();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_MEDECINS:
				return isSetNombreMedecins();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_INFIRMIERS:
				return isSetNombreInfirmiers();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__NOMBRE_TOTAL:
				return isSetNombreTotal();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__PATHOLOGIES:
				return PATHOLOGIES_EDEFAULT == null ? pathologies != null : !PATHOLOGIES_EDEFAULT.equals(pathologies);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__POURCENTAGE_OCCUPATION:
				return isSetPourcentageOccupation();
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__QUALITE_APPROVISIONNEMENT:
				return QUALITE_APPROVISIONNEMENT_EDEFAULT == null ? qualiteApprovisionnement != null : !QUALITE_APPROVISIONNEMENT_EDEFAULT.equals(qualiteApprovisionnement);
			case SchemaPackage.TYPE_CAPACITE_HEBERGEMENT__TYPE_DISTRIBUTION_EAU:
				return isSetTypeDistributionEau();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", besoinApproSpecifique: ");
		result.append(besoinApproSpecifique);
		result.append(", capaciteTotaleAccueil: ");
		if (capaciteTotaleAccueilESet) result.append(capaciteTotaleAccueil); else result.append("<unset>");
		result.append(", conditionsRavitaillement: ");
		result.append(conditionsRavitaillement);
		result.append(", contraintesAlimentaires: ");
		result.append(contraintesAlimentaires);
		result.append(", disponibilite: ");
		if (disponibiliteESet) result.append(disponibilite); else result.append("<unset>");
		result.append(", etatSite: ");
		result.append(etatSite);
		result.append(", etatEntretien: ");
		result.append(etatEntretien);
		result.append(", etatSanitaire: ");
		result.append(etatSanitaire);
		result.append(", etatEauCourante: ");
		if (etatEauCouranteESet) result.append(etatEauCourante); else result.append("<unset>");
		result.append(", etatElectricite: ");
		if (etatElectriciteESet) result.append(etatElectricite); else result.append("<unset>");
		result.append(", etatPhysique: ");
		result.append(etatPhysique);
		result.append(", etatMoral: ");
		result.append(etatMoral);
		result.append(", etatSoinsMedicaux: ");
		if (etatSoinsMedicauxESet) result.append(etatSoinsMedicaux); else result.append("<unset>");
		result.append(", nombreBasAge: ");
		if (nombreBasAgeESet) result.append(nombreBasAge); else result.append("<unset>");
		result.append(", nombreEnfants: ");
		if (nombreEnfantsESet) result.append(nombreEnfants); else result.append("<unset>");
		result.append(", nombreFemmes: ");
		if (nombreFemmesESet) result.append(nombreFemmes); else result.append("<unset>");
		result.append(", nombreHommes: ");
		if (nombreHommesESet) result.append(nombreHommes); else result.append("<unset>");
		result.append(", nombreMalades: ");
		if (nombreMaladesESet) result.append(nombreMalades); else result.append("<unset>");
		result.append(", nombreVieillar: ");
		if (nombreVieillarESet) result.append(nombreVieillar); else result.append("<unset>");
		result.append(", nombreMedecins: ");
		if (nombreMedecinsESet) result.append(nombreMedecins); else result.append("<unset>");
		result.append(", nombreInfirmiers: ");
		if (nombreInfirmiersESet) result.append(nombreInfirmiers); else result.append("<unset>");
		result.append(", nombreTotal: ");
		if (nombreTotalESet) result.append(nombreTotal); else result.append("<unset>");
		result.append(", pathologies: ");
		result.append(pathologies);
		result.append(", pourcentageOccupation: ");
		if (pourcentageOccupationESet) result.append(pourcentageOccupation); else result.append("<unset>");
		result.append(", qualiteApprovisionnement: ");
		result.append(qualiteApprovisionnement);
		result.append(", typeDistributionEau: ");
		if (typeDistributionEauESet) result.append(typeDistributionEau); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteHebergementImpl
