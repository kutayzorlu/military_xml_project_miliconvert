/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoActivation;
import mpia.schema.TypeDictionaryDicoEtatDemolition;
import mpia.schema.TypeDictionaryDicoEtatOperationnel;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielMarquage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielPossibilite;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielSecurite;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee;
import mpia.schema.TypeEtatOperationnelMateriel;
import mpia.schema.TypeEtatOperationnelMine;
import mpia.schema.TypeEtatOperationnelUXO;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Materiel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getEtatOperationnel <em>Etat Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getPossibilite <em>Possibilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getSecurite <em>Securite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getEtatDemolition <em>Etat Demolition</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#isVisibleParEnnemi <em>Visible Par Ennemi</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#isImpossibiliteEtreRemorque <em>Impossibilite Etre Remorque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#isReserve <em>Reserve</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#isImpossibiliteSeDeplacer <em>Impossibilite Se Deplacer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#isReparableA12H <em>Reparable A12H</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getDescriptionPanne <em>Description Panne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getPiecesRechangeNecessaires <em>Pieces Rechange Necessaires</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#isVehiculeVide <em>Vehicule Vide</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getCouleurPrincipale <em>Couleur Principale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getMarquage <em>Marquage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getCouleurMarquage <em>Couleur Marquage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#isConformiteOMI <em>Conformite OMI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getTypeDefaillanceBouee <em>Type Defaillance Bouee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getACommeEtatOperationnelMineEtatOperationnelMine <em>AComme Etat Operationnel Mine Etat Operationnel Mine</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMaterielImpl#getAPourCaracteristiqueUXOEtatOperationnelUXO <em>APour Caracteristique UXO Etat Operationnel UXO</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelMaterielImpl extends TypeEtatOperationnelImpl implements TypeEtatOperationnelMateriel {
	/**
	 * The default value of the '{@link #getEtatOperationnel() <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnel ETAT_OPERATIONNEL_EDEFAULT = TypeDictionaryDicoEtatOperationnel.OPR;

	/**
	 * The cached value of the '{@link #getEtatOperationnel() <em>Etat Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatOperationnel()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnel etatOperationnel = ETAT_OPERATIONNEL_EDEFAULT;

	/**
	 * This is true if the Etat Operationnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatOperationnelESet;

	/**
	 * The default value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat QUALIFICATIF_ETAT_EDEFAULT = TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat.DENIED;

	/**
	 * The cached value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;

	/**
	 * This is true if the Qualificatif Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifEtatESet;

	/**
	 * The default value of the '{@link #getPossibilite() <em>Possibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibilite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMaterielPossibilite POSSIBILITE_EDEFAULT = TypeDictionaryDicoEtatOperationnelMaterielPossibilite.FO;

	/**
	 * The cached value of the '{@link #getPossibilite() <em>Possibilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPossibilite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMaterielPossibilite possibilite = POSSIBILITE_EDEFAULT;

	/**
	 * This is true if the Possibilite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean possibiliteESet;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActivation USAGE_EDEFAULT = TypeDictionaryDicoActivation.ACTIVE;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActivation usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

	/**
	 * The default value of the '{@link #getSecurite() <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMaterielSecurite SECURITE_EDEFAULT = TypeDictionaryDicoEtatOperationnelMaterielSecurite.UNASMB;

	/**
	 * The cached value of the '{@link #getSecurite() <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMaterielSecurite securite = SECURITE_EDEFAULT;

	/**
	 * This is true if the Securite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securiteESet;

	/**
	 * The default value of the '{@link #getEtatDemolition() <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemolition()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatDemolition ETAT_DEMOLITION_EDEFAULT = TypeDictionaryDicoEtatDemolition.ABNDIN;

	/**
	 * The cached value of the '{@link #getEtatDemolition() <em>Etat Demolition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemolition()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatDemolition etatDemolition = ETAT_DEMOLITION_EDEFAULT;

	/**
	 * This is true if the Etat Demolition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatDemolitionESet;

	/**
	 * The default value of the '{@link #isVisibleParEnnemi() <em>Visible Par Ennemi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleParEnnemi()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_PAR_ENNEMI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisibleParEnnemi() <em>Visible Par Ennemi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleParEnnemi()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleParEnnemi = VISIBLE_PAR_ENNEMI_EDEFAULT;

	/**
	 * This is true if the Visible Par Ennemi attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleParEnnemiESet;

	/**
	 * The default value of the '{@link #isImpossibiliteEtreRemorque() <em>Impossibilite Etre Remorque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImpossibiliteEtreRemorque()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPOSSIBILITE_ETRE_REMORQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImpossibiliteEtreRemorque() <em>Impossibilite Etre Remorque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImpossibiliteEtreRemorque()
	 * @generated
	 * @ordered
	 */
	protected boolean impossibiliteEtreRemorque = IMPOSSIBILITE_ETRE_REMORQUE_EDEFAULT;

	/**
	 * This is true if the Impossibilite Etre Remorque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impossibiliteEtreRemorqueESet;

	/**
	 * The default value of the '{@link #isReserve() <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserve()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESERVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReserve() <em>Reserve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReserve()
	 * @generated
	 * @ordered
	 */
	protected boolean reserve = RESERVE_EDEFAULT;

	/**
	 * This is true if the Reserve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reserveESet;

	/**
	 * The default value of the '{@link #isImpossibiliteSeDeplacer() <em>Impossibilite Se Deplacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImpossibiliteSeDeplacer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPOSSIBILITE_SE_DEPLACER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImpossibiliteSeDeplacer() <em>Impossibilite Se Deplacer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImpossibiliteSeDeplacer()
	 * @generated
	 * @ordered
	 */
	protected boolean impossibiliteSeDeplacer = IMPOSSIBILITE_SE_DEPLACER_EDEFAULT;

	/**
	 * This is true if the Impossibilite Se Deplacer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impossibiliteSeDeplacerESet;

	/**
	 * The default value of the '{@link #isReparableA12H() <em>Reparable A12H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReparableA12H()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPARABLE_A12H_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReparableA12H() <em>Reparable A12H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReparableA12H()
	 * @generated
	 * @ordered
	 */
	protected boolean reparableA12H = REPARABLE_A12H_EDEFAULT;

	/**
	 * This is true if the Reparable A12H attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reparableA12HESet;

	/**
	 * The default value of the '{@link #getDescriptionPanne() <em>Description Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionPanne()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_PANNE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionPanne() <em>Description Panne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionPanne()
	 * @generated
	 * @ordered
	 */
	protected String descriptionPanne = DESCRIPTION_PANNE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPiecesRechangeNecessaires() <em>Pieces Rechange Necessaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiecesRechangeNecessaires()
	 * @generated
	 * @ordered
	 */
	protected static final String PIECES_RECHANGE_NECESSAIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPiecesRechangeNecessaires() <em>Pieces Rechange Necessaires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPiecesRechangeNecessaires()
	 * @generated
	 * @ordered
	 */
	protected String piecesRechangeNecessaires = PIECES_RECHANGE_NECESSAIRES_EDEFAULT;

	/**
	 * The default value of the '{@link #isVehiculeVide() <em>Vehicule Vide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVehiculeVide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VEHICULE_VIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVehiculeVide() <em>Vehicule Vide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVehiculeVide()
	 * @generated
	 * @ordered
	 */
	protected boolean vehiculeVide = VEHICULE_VIDE_EDEFAULT;

	/**
	 * This is true if the Vehicule Vide attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vehiculeVideESet;

	/**
	 * The default value of the '{@link #getCouleurPrincipale() <em>Couleur Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurPrincipale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale COULEUR_PRINCIPALE_EDEFAULT = TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale.AUBURN;

	/**
	 * The cached value of the '{@link #getCouleurPrincipale() <em>Couleur Principale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurPrincipale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale couleurPrincipale = COULEUR_PRINCIPALE_EDEFAULT;

	/**
	 * This is true if the Couleur Principale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurPrincipaleESet;

	/**
	 * The default value of the '{@link #getMarquage() <em>Marquage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarquage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMaterielMarquage MARQUAGE_EDEFAULT = TypeDictionaryDicoEtatOperationnelMaterielMarquage.NUMBER;

	/**
	 * The cached value of the '{@link #getMarquage() <em>Marquage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarquage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMaterielMarquage marquage = MARQUAGE_EDEFAULT;

	/**
	 * This is true if the Marquage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marquageESet;

	/**
	 * The default value of the '{@link #getCouleurMarquage() <em>Couleur Marquage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurMarquage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage COULEUR_MARQUAGE_EDEFAULT = TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage.BLACK;

	/**
	 * The cached value of the '{@link #getCouleurMarquage() <em>Couleur Marquage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurMarquage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage couleurMarquage = COULEUR_MARQUAGE_EDEFAULT;

	/**
	 * This is true if the Couleur Marquage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurMarquageESet;

	/**
	 * The default value of the '{@link #isConformiteOMI() <em>Conformite OMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConformiteOMI()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONFORMITE_OMI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConformiteOMI() <em>Conformite OMI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConformiteOMI()
	 * @generated
	 * @ordered
	 */
	protected boolean conformiteOMI = CONFORMITE_OMI_EDEFAULT;

	/**
	 * This is true if the Conformite OMI attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conformiteOMIESet;

	/**
	 * The default value of the '{@link #getTypeDefaillanceBouee() <em>Type Defaillance Bouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefaillanceBouee()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee TYPE_DEFAILLANCE_BOUEE_EDEFAULT = TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee.NOFLAG;

	/**
	 * The cached value of the '{@link #getTypeDefaillanceBouee() <em>Type Defaillance Bouee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefaillanceBouee()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee typeDefaillanceBouee = TYPE_DEFAILLANCE_BOUEE_EDEFAULT;

	/**
	 * This is true if the Type Defaillance Bouee attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDefaillanceBoueeESet;

	/**
	 * The cached value of the '{@link #getACommeEtatOperationnelMineEtatOperationnelMine() <em>AComme Etat Operationnel Mine Etat Operationnel Mine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeEtatOperationnelMineEtatOperationnelMine()
	 * @generated
	 * @ordered
	 */
	protected TypeEtatOperationnelMine aCommeEtatOperationnelMineEtatOperationnelMine;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueUXOEtatOperationnelUXO() <em>APour Caracteristique UXO Etat Operationnel UXO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueUXOEtatOperationnelUXO()
	 * @generated
	 * @ordered
	 */
	protected TypeEtatOperationnelUXO aPourCaracteristiqueUXOEtatOperationnelUXO;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelMaterielImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelMateriel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnel getEtatOperationnel() {
		return etatOperationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatOperationnel(TypeDictionaryDicoEtatOperationnel newEtatOperationnel) {
		TypeDictionaryDicoEtatOperationnel oldEtatOperationnel = etatOperationnel;
		etatOperationnel = newEtatOperationnel == null ? ETAT_OPERATIONNEL_EDEFAULT : newEtatOperationnel;
		boolean oldEtatOperationnelESet = etatOperationnelESet;
		etatOperationnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_OPERATIONNEL, oldEtatOperationnel, etatOperationnel, !oldEtatOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatOperationnel() {
		TypeDictionaryDicoEtatOperationnel oldEtatOperationnel = etatOperationnel;
		boolean oldEtatOperationnelESet = etatOperationnelESet;
		etatOperationnel = ETAT_OPERATIONNEL_EDEFAULT;
		etatOperationnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_OPERATIONNEL, oldEtatOperationnel, ETAT_OPERATIONNEL_EDEFAULT, oldEtatOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatOperationnel() {
		return etatOperationnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat getQualificatifEtat() {
		return qualificatifEtat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat newQualificatifEtat) {
		TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		qualificatifEtat = newQualificatifEtat == null ? QUALIFICATIF_ETAT_EDEFAULT : newQualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__QUALIFICATIF_ETAT, oldQualificatifEtat, qualificatifEtat, !oldQualificatifEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifEtat() {
		TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;
		qualificatifEtatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__QUALIFICATIF_ETAT, oldQualificatifEtat, QUALIFICATIF_ETAT_EDEFAULT, oldQualificatifEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifEtat() {
		return qualificatifEtatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMaterielPossibilite getPossibilite() {
		return possibilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPossibilite(TypeDictionaryDicoEtatOperationnelMaterielPossibilite newPossibilite) {
		TypeDictionaryDicoEtatOperationnelMaterielPossibilite oldPossibilite = possibilite;
		possibilite = newPossibilite == null ? POSSIBILITE_EDEFAULT : newPossibilite;
		boolean oldPossibiliteESet = possibiliteESet;
		possibiliteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__POSSIBILITE, oldPossibilite, possibilite, !oldPossibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPossibilite() {
		TypeDictionaryDicoEtatOperationnelMaterielPossibilite oldPossibilite = possibilite;
		boolean oldPossibiliteESet = possibiliteESet;
		possibilite = POSSIBILITE_EDEFAULT;
		possibiliteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__POSSIBILITE, oldPossibilite, POSSIBILITE_EDEFAULT, oldPossibiliteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPossibilite() {
		return possibiliteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActivation getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(TypeDictionaryDicoActivation newUsage) {
		TypeDictionaryDicoActivation oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		boolean oldUsageESet = usageESet;
		usageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__USAGE, oldUsage, usage, !oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		TypeDictionaryDicoActivation oldUsage = usage;
		boolean oldUsageESet = usageESet;
		usage = USAGE_EDEFAULT;
		usageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMaterielSecurite getSecurite() {
		return securite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurite(TypeDictionaryDicoEtatOperationnelMaterielSecurite newSecurite) {
		TypeDictionaryDicoEtatOperationnelMaterielSecurite oldSecurite = securite;
		securite = newSecurite == null ? SECURITE_EDEFAULT : newSecurite;
		boolean oldSecuriteESet = securiteESet;
		securiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__SECURITE, oldSecurite, securite, !oldSecuriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurite() {
		TypeDictionaryDicoEtatOperationnelMaterielSecurite oldSecurite = securite;
		boolean oldSecuriteESet = securiteESet;
		securite = SECURITE_EDEFAULT;
		securiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__SECURITE, oldSecurite, SECURITE_EDEFAULT, oldSecuriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurite() {
		return securiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatDemolition getEtatDemolition() {
		return etatDemolition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDemolition(TypeDictionaryDicoEtatDemolition newEtatDemolition) {
		TypeDictionaryDicoEtatDemolition oldEtatDemolition = etatDemolition;
		etatDemolition = newEtatDemolition == null ? ETAT_DEMOLITION_EDEFAULT : newEtatDemolition;
		boolean oldEtatDemolitionESet = etatDemolitionESet;
		etatDemolitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_DEMOLITION, oldEtatDemolition, etatDemolition, !oldEtatDemolitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatDemolition() {
		TypeDictionaryDicoEtatDemolition oldEtatDemolition = etatDemolition;
		boolean oldEtatDemolitionESet = etatDemolitionESet;
		etatDemolition = ETAT_DEMOLITION_EDEFAULT;
		etatDemolitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_DEMOLITION, oldEtatDemolition, ETAT_DEMOLITION_EDEFAULT, oldEtatDemolitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatDemolition() {
		return etatDemolitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisibleParEnnemi() {
		return visibleParEnnemi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleParEnnemi(boolean newVisibleParEnnemi) {
		boolean oldVisibleParEnnemi = visibleParEnnemi;
		visibleParEnnemi = newVisibleParEnnemi;
		boolean oldVisibleParEnnemiESet = visibleParEnnemiESet;
		visibleParEnnemiESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VISIBLE_PAR_ENNEMI, oldVisibleParEnnemi, visibleParEnnemi, !oldVisibleParEnnemiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleParEnnemi() {
		boolean oldVisibleParEnnemi = visibleParEnnemi;
		boolean oldVisibleParEnnemiESet = visibleParEnnemiESet;
		visibleParEnnemi = VISIBLE_PAR_ENNEMI_EDEFAULT;
		visibleParEnnemiESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VISIBLE_PAR_ENNEMI, oldVisibleParEnnemi, VISIBLE_PAR_ENNEMI_EDEFAULT, oldVisibleParEnnemiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleParEnnemi() {
		return visibleParEnnemiESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImpossibiliteEtreRemorque() {
		return impossibiliteEtreRemorque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpossibiliteEtreRemorque(boolean newImpossibiliteEtreRemorque) {
		boolean oldImpossibiliteEtreRemorque = impossibiliteEtreRemorque;
		impossibiliteEtreRemorque = newImpossibiliteEtreRemorque;
		boolean oldImpossibiliteEtreRemorqueESet = impossibiliteEtreRemorqueESet;
		impossibiliteEtreRemorqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_ETRE_REMORQUE, oldImpossibiliteEtreRemorque, impossibiliteEtreRemorque, !oldImpossibiliteEtreRemorqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpossibiliteEtreRemorque() {
		boolean oldImpossibiliteEtreRemorque = impossibiliteEtreRemorque;
		boolean oldImpossibiliteEtreRemorqueESet = impossibiliteEtreRemorqueESet;
		impossibiliteEtreRemorque = IMPOSSIBILITE_ETRE_REMORQUE_EDEFAULT;
		impossibiliteEtreRemorqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_ETRE_REMORQUE, oldImpossibiliteEtreRemorque, IMPOSSIBILITE_ETRE_REMORQUE_EDEFAULT, oldImpossibiliteEtreRemorqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpossibiliteEtreRemorque() {
		return impossibiliteEtreRemorqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReserve() {
		return reserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserve(boolean newReserve) {
		boolean oldReserve = reserve;
		reserve = newReserve;
		boolean oldReserveESet = reserveESet;
		reserveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__RESERVE, oldReserve, reserve, !oldReserveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReserve() {
		boolean oldReserve = reserve;
		boolean oldReserveESet = reserveESet;
		reserve = RESERVE_EDEFAULT;
		reserveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__RESERVE, oldReserve, RESERVE_EDEFAULT, oldReserveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReserve() {
		return reserveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImpossibiliteSeDeplacer() {
		return impossibiliteSeDeplacer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpossibiliteSeDeplacer(boolean newImpossibiliteSeDeplacer) {
		boolean oldImpossibiliteSeDeplacer = impossibiliteSeDeplacer;
		impossibiliteSeDeplacer = newImpossibiliteSeDeplacer;
		boolean oldImpossibiliteSeDeplacerESet = impossibiliteSeDeplacerESet;
		impossibiliteSeDeplacerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_SE_DEPLACER, oldImpossibiliteSeDeplacer, impossibiliteSeDeplacer, !oldImpossibiliteSeDeplacerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpossibiliteSeDeplacer() {
		boolean oldImpossibiliteSeDeplacer = impossibiliteSeDeplacer;
		boolean oldImpossibiliteSeDeplacerESet = impossibiliteSeDeplacerESet;
		impossibiliteSeDeplacer = IMPOSSIBILITE_SE_DEPLACER_EDEFAULT;
		impossibiliteSeDeplacerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_SE_DEPLACER, oldImpossibiliteSeDeplacer, IMPOSSIBILITE_SE_DEPLACER_EDEFAULT, oldImpossibiliteSeDeplacerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpossibiliteSeDeplacer() {
		return impossibiliteSeDeplacerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReparableA12H() {
		return reparableA12H;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReparableA12H(boolean newReparableA12H) {
		boolean oldReparableA12H = reparableA12H;
		reparableA12H = newReparableA12H;
		boolean oldReparableA12HESet = reparableA12HESet;
		reparableA12HESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__REPARABLE_A12H, oldReparableA12H, reparableA12H, !oldReparableA12HESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReparableA12H() {
		boolean oldReparableA12H = reparableA12H;
		boolean oldReparableA12HESet = reparableA12HESet;
		reparableA12H = REPARABLE_A12H_EDEFAULT;
		reparableA12HESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__REPARABLE_A12H, oldReparableA12H, REPARABLE_A12H_EDEFAULT, oldReparableA12HESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReparableA12H() {
		return reparableA12HESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionPanne() {
		return descriptionPanne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionPanne(String newDescriptionPanne) {
		String oldDescriptionPanne = descriptionPanne;
		descriptionPanne = newDescriptionPanne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__DESCRIPTION_PANNE, oldDescriptionPanne, descriptionPanne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPiecesRechangeNecessaires() {
		return piecesRechangeNecessaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPiecesRechangeNecessaires(String newPiecesRechangeNecessaires) {
		String oldPiecesRechangeNecessaires = piecesRechangeNecessaires;
		piecesRechangeNecessaires = newPiecesRechangeNecessaires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__PIECES_RECHANGE_NECESSAIRES, oldPiecesRechangeNecessaires, piecesRechangeNecessaires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVehiculeVide() {
		return vehiculeVide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehiculeVide(boolean newVehiculeVide) {
		boolean oldVehiculeVide = vehiculeVide;
		vehiculeVide = newVehiculeVide;
		boolean oldVehiculeVideESet = vehiculeVideESet;
		vehiculeVideESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VEHICULE_VIDE, oldVehiculeVide, vehiculeVide, !oldVehiculeVideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVehiculeVide() {
		boolean oldVehiculeVide = vehiculeVide;
		boolean oldVehiculeVideESet = vehiculeVideESet;
		vehiculeVide = VEHICULE_VIDE_EDEFAULT;
		vehiculeVideESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VEHICULE_VIDE, oldVehiculeVide, VEHICULE_VIDE_EDEFAULT, oldVehiculeVideESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVehiculeVide() {
		return vehiculeVideESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale getCouleurPrincipale() {
		return couleurPrincipale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurPrincipale(TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale newCouleurPrincipale) {
		TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale oldCouleurPrincipale = couleurPrincipale;
		couleurPrincipale = newCouleurPrincipale == null ? COULEUR_PRINCIPALE_EDEFAULT : newCouleurPrincipale;
		boolean oldCouleurPrincipaleESet = couleurPrincipaleESet;
		couleurPrincipaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_PRINCIPALE, oldCouleurPrincipale, couleurPrincipale, !oldCouleurPrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurPrincipale() {
		TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale oldCouleurPrincipale = couleurPrincipale;
		boolean oldCouleurPrincipaleESet = couleurPrincipaleESet;
		couleurPrincipale = COULEUR_PRINCIPALE_EDEFAULT;
		couleurPrincipaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_PRINCIPALE, oldCouleurPrincipale, COULEUR_PRINCIPALE_EDEFAULT, oldCouleurPrincipaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurPrincipale() {
		return couleurPrincipaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMaterielMarquage getMarquage() {
		return marquage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarquage(TypeDictionaryDicoEtatOperationnelMaterielMarquage newMarquage) {
		TypeDictionaryDicoEtatOperationnelMaterielMarquage oldMarquage = marquage;
		marquage = newMarquage == null ? MARQUAGE_EDEFAULT : newMarquage;
		boolean oldMarquageESet = marquageESet;
		marquageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__MARQUAGE, oldMarquage, marquage, !oldMarquageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarquage() {
		TypeDictionaryDicoEtatOperationnelMaterielMarquage oldMarquage = marquage;
		boolean oldMarquageESet = marquageESet;
		marquage = MARQUAGE_EDEFAULT;
		marquageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__MARQUAGE, oldMarquage, MARQUAGE_EDEFAULT, oldMarquageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarquage() {
		return marquageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage getCouleurMarquage() {
		return couleurMarquage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurMarquage(TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage newCouleurMarquage) {
		TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage oldCouleurMarquage = couleurMarquage;
		couleurMarquage = newCouleurMarquage == null ? COULEUR_MARQUAGE_EDEFAULT : newCouleurMarquage;
		boolean oldCouleurMarquageESet = couleurMarquageESet;
		couleurMarquageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_MARQUAGE, oldCouleurMarquage, couleurMarquage, !oldCouleurMarquageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurMarquage() {
		TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage oldCouleurMarquage = couleurMarquage;
		boolean oldCouleurMarquageESet = couleurMarquageESet;
		couleurMarquage = COULEUR_MARQUAGE_EDEFAULT;
		couleurMarquageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_MARQUAGE, oldCouleurMarquage, COULEUR_MARQUAGE_EDEFAULT, oldCouleurMarquageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurMarquage() {
		return couleurMarquageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConformiteOMI() {
		return conformiteOMI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformiteOMI(boolean newConformiteOMI) {
		boolean oldConformiteOMI = conformiteOMI;
		conformiteOMI = newConformiteOMI;
		boolean oldConformiteOMIESet = conformiteOMIESet;
		conformiteOMIESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__CONFORMITE_OMI, oldConformiteOMI, conformiteOMI, !oldConformiteOMIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConformiteOMI() {
		boolean oldConformiteOMI = conformiteOMI;
		boolean oldConformiteOMIESet = conformiteOMIESet;
		conformiteOMI = CONFORMITE_OMI_EDEFAULT;
		conformiteOMIESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__CONFORMITE_OMI, oldConformiteOMI, CONFORMITE_OMI_EDEFAULT, oldConformiteOMIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConformiteOMI() {
		return conformiteOMIESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee getTypeDefaillanceBouee() {
		return typeDefaillanceBouee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDefaillanceBouee(TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee newTypeDefaillanceBouee) {
		TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee oldTypeDefaillanceBouee = typeDefaillanceBouee;
		typeDefaillanceBouee = newTypeDefaillanceBouee == null ? TYPE_DEFAILLANCE_BOUEE_EDEFAULT : newTypeDefaillanceBouee;
		boolean oldTypeDefaillanceBoueeESet = typeDefaillanceBoueeESet;
		typeDefaillanceBoueeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__TYPE_DEFAILLANCE_BOUEE, oldTypeDefaillanceBouee, typeDefaillanceBouee, !oldTypeDefaillanceBoueeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDefaillanceBouee() {
		TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee oldTypeDefaillanceBouee = typeDefaillanceBouee;
		boolean oldTypeDefaillanceBoueeESet = typeDefaillanceBoueeESet;
		typeDefaillanceBouee = TYPE_DEFAILLANCE_BOUEE_EDEFAULT;
		typeDefaillanceBoueeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__TYPE_DEFAILLANCE_BOUEE, oldTypeDefaillanceBouee, TYPE_DEFAILLANCE_BOUEE_EDEFAULT, oldTypeDefaillanceBoueeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDefaillanceBouee() {
		return typeDefaillanceBoueeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEtatOperationnelMine getACommeEtatOperationnelMineEtatOperationnelMine() {
		return aCommeEtatOperationnelMineEtatOperationnelMine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeEtatOperationnelMineEtatOperationnelMine(TypeEtatOperationnelMine newACommeEtatOperationnelMineEtatOperationnelMine, NotificationChain msgs) {
		TypeEtatOperationnelMine oldACommeEtatOperationnelMineEtatOperationnelMine = aCommeEtatOperationnelMineEtatOperationnelMine;
		aCommeEtatOperationnelMineEtatOperationnelMine = newACommeEtatOperationnelMineEtatOperationnelMine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE, oldACommeEtatOperationnelMineEtatOperationnelMine, newACommeEtatOperationnelMineEtatOperationnelMine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeEtatOperationnelMineEtatOperationnelMine(TypeEtatOperationnelMine newACommeEtatOperationnelMineEtatOperationnelMine) {
		if (newACommeEtatOperationnelMineEtatOperationnelMine != aCommeEtatOperationnelMineEtatOperationnelMine) {
			NotificationChain msgs = null;
			if (aCommeEtatOperationnelMineEtatOperationnelMine != null)
				msgs = ((InternalEObject)aCommeEtatOperationnelMineEtatOperationnelMine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE, null, msgs);
			if (newACommeEtatOperationnelMineEtatOperationnelMine != null)
				msgs = ((InternalEObject)newACommeEtatOperationnelMineEtatOperationnelMine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE, null, msgs);
			msgs = basicSetACommeEtatOperationnelMineEtatOperationnelMine(newACommeEtatOperationnelMineEtatOperationnelMine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE, newACommeEtatOperationnelMineEtatOperationnelMine, newACommeEtatOperationnelMineEtatOperationnelMine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEtatOperationnelUXO getAPourCaracteristiqueUXOEtatOperationnelUXO() {
		return aPourCaracteristiqueUXOEtatOperationnelUXO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiqueUXOEtatOperationnelUXO(TypeEtatOperationnelUXO newAPourCaracteristiqueUXOEtatOperationnelUXO, NotificationChain msgs) {
		TypeEtatOperationnelUXO oldAPourCaracteristiqueUXOEtatOperationnelUXO = aPourCaracteristiqueUXOEtatOperationnelUXO;
		aPourCaracteristiqueUXOEtatOperationnelUXO = newAPourCaracteristiqueUXOEtatOperationnelUXO;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO, oldAPourCaracteristiqueUXOEtatOperationnelUXO, newAPourCaracteristiqueUXOEtatOperationnelUXO);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiqueUXOEtatOperationnelUXO(TypeEtatOperationnelUXO newAPourCaracteristiqueUXOEtatOperationnelUXO) {
		if (newAPourCaracteristiqueUXOEtatOperationnelUXO != aPourCaracteristiqueUXOEtatOperationnelUXO) {
			NotificationChain msgs = null;
			if (aPourCaracteristiqueUXOEtatOperationnelUXO != null)
				msgs = ((InternalEObject)aPourCaracteristiqueUXOEtatOperationnelUXO).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO, null, msgs);
			if (newAPourCaracteristiqueUXOEtatOperationnelUXO != null)
				msgs = ((InternalEObject)newAPourCaracteristiqueUXOEtatOperationnelUXO).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO, null, msgs);
			msgs = basicSetAPourCaracteristiqueUXOEtatOperationnelUXO(newAPourCaracteristiqueUXOEtatOperationnelUXO, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO, newAPourCaracteristiqueUXOEtatOperationnelUXO, newAPourCaracteristiqueUXOEtatOperationnelUXO));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE:
				return basicSetACommeEtatOperationnelMineEtatOperationnelMine(null, msgs);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO:
				return basicSetAPourCaracteristiqueUXOEtatOperationnelUXO(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_OPERATIONNEL:
				return getEtatOperationnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__QUALIFICATIF_ETAT:
				return getQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__POSSIBILITE:
				return getPossibilite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__USAGE:
				return getUsage();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__SECURITE:
				return getSecurite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_DEMOLITION:
				return getEtatDemolition();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VISIBLE_PAR_ENNEMI:
				return isVisibleParEnnemi() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_ETRE_REMORQUE:
				return isImpossibiliteEtreRemorque() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__RESERVE:
				return isReserve() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_SE_DEPLACER:
				return isImpossibiliteSeDeplacer() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__REPARABLE_A12H:
				return isReparableA12H() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__DESCRIPTION_PANNE:
				return getDescriptionPanne();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__PIECES_RECHANGE_NECESSAIRES:
				return getPiecesRechangeNecessaires();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VEHICULE_VIDE:
				return isVehiculeVide() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_PRINCIPALE:
				return getCouleurPrincipale();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__MARQUAGE:
				return getMarquage();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_MARQUAGE:
				return getCouleurMarquage();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__CONFORMITE_OMI:
				return isConformiteOMI() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__TYPE_DEFAILLANCE_BOUEE:
				return getTypeDefaillanceBouee();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE:
				return getACommeEtatOperationnelMineEtatOperationnelMine();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO:
				return getAPourCaracteristiqueUXOEtatOperationnelUXO();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_OPERATIONNEL:
				setEtatOperationnel((TypeDictionaryDicoEtatOperationnel)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__QUALIFICATIF_ETAT:
				setQualificatifEtat((TypeDictionaryDicoEtatOperationnelMaterielQualificatifEtat)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__POSSIBILITE:
				setPossibilite((TypeDictionaryDicoEtatOperationnelMaterielPossibilite)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__USAGE:
				setUsage((TypeDictionaryDicoActivation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__SECURITE:
				setSecurite((TypeDictionaryDicoEtatOperationnelMaterielSecurite)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_DEMOLITION:
				setEtatDemolition((TypeDictionaryDicoEtatDemolition)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VISIBLE_PAR_ENNEMI:
				setVisibleParEnnemi(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_ETRE_REMORQUE:
				setImpossibiliteEtreRemorque(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__RESERVE:
				setReserve(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_SE_DEPLACER:
				setImpossibiliteSeDeplacer(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__REPARABLE_A12H:
				setReparableA12H(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__DESCRIPTION_PANNE:
				setDescriptionPanne((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__PIECES_RECHANGE_NECESSAIRES:
				setPiecesRechangeNecessaires((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VEHICULE_VIDE:
				setVehiculeVide(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_PRINCIPALE:
				setCouleurPrincipale((TypeDictionaryDicoEtatOperationnelMaterielCouleurPrincipale)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__MARQUAGE:
				setMarquage((TypeDictionaryDicoEtatOperationnelMaterielMarquage)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_MARQUAGE:
				setCouleurMarquage((TypeDictionaryDicoEtatOperationnelMaterielCouleurMarquage)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__CONFORMITE_OMI:
				setConformiteOMI(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__TYPE_DEFAILLANCE_BOUEE:
				setTypeDefaillanceBouee((TypeDictionaryDicoEtatOperationnelMaterielTypeDefaillanceBouee)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE:
				setACommeEtatOperationnelMineEtatOperationnelMine((TypeEtatOperationnelMine)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO:
				setAPourCaracteristiqueUXOEtatOperationnelUXO((TypeEtatOperationnelUXO)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_OPERATIONNEL:
				unsetEtatOperationnel();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__QUALIFICATIF_ETAT:
				unsetQualificatifEtat();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__POSSIBILITE:
				unsetPossibilite();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__USAGE:
				unsetUsage();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__SECURITE:
				unsetSecurite();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_DEMOLITION:
				unsetEtatDemolition();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VISIBLE_PAR_ENNEMI:
				unsetVisibleParEnnemi();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_ETRE_REMORQUE:
				unsetImpossibiliteEtreRemorque();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__RESERVE:
				unsetReserve();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_SE_DEPLACER:
				unsetImpossibiliteSeDeplacer();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__REPARABLE_A12H:
				unsetReparableA12H();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__DESCRIPTION_PANNE:
				setDescriptionPanne(DESCRIPTION_PANNE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__PIECES_RECHANGE_NECESSAIRES:
				setPiecesRechangeNecessaires(PIECES_RECHANGE_NECESSAIRES_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VEHICULE_VIDE:
				unsetVehiculeVide();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_PRINCIPALE:
				unsetCouleurPrincipale();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__MARQUAGE:
				unsetMarquage();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_MARQUAGE:
				unsetCouleurMarquage();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__CONFORMITE_OMI:
				unsetConformiteOMI();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__TYPE_DEFAILLANCE_BOUEE:
				unsetTypeDefaillanceBouee();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE:
				setACommeEtatOperationnelMineEtatOperationnelMine((TypeEtatOperationnelMine)null);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO:
				setAPourCaracteristiqueUXOEtatOperationnelUXO((TypeEtatOperationnelUXO)null);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_OPERATIONNEL:
				return isSetEtatOperationnel();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__QUALIFICATIF_ETAT:
				return isSetQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__POSSIBILITE:
				return isSetPossibilite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__USAGE:
				return isSetUsage();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__SECURITE:
				return isSetSecurite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ETAT_DEMOLITION:
				return isSetEtatDemolition();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VISIBLE_PAR_ENNEMI:
				return isSetVisibleParEnnemi();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_ETRE_REMORQUE:
				return isSetImpossibiliteEtreRemorque();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__RESERVE:
				return isSetReserve();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__IMPOSSIBILITE_SE_DEPLACER:
				return isSetImpossibiliteSeDeplacer();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__REPARABLE_A12H:
				return isSetReparableA12H();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__DESCRIPTION_PANNE:
				return DESCRIPTION_PANNE_EDEFAULT == null ? descriptionPanne != null : !DESCRIPTION_PANNE_EDEFAULT.equals(descriptionPanne);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__PIECES_RECHANGE_NECESSAIRES:
				return PIECES_RECHANGE_NECESSAIRES_EDEFAULT == null ? piecesRechangeNecessaires != null : !PIECES_RECHANGE_NECESSAIRES_EDEFAULT.equals(piecesRechangeNecessaires);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__VEHICULE_VIDE:
				return isSetVehiculeVide();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_PRINCIPALE:
				return isSetCouleurPrincipale();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__MARQUAGE:
				return isSetMarquage();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__COULEUR_MARQUAGE:
				return isSetCouleurMarquage();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__CONFORMITE_OMI:
				return isSetConformiteOMI();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__TYPE_DEFAILLANCE_BOUEE:
				return isSetTypeDefaillanceBouee();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__ACOMME_ETAT_OPERATIONNEL_MINE_ETAT_OPERATIONNEL_MINE:
				return aCommeEtatOperationnelMineEtatOperationnelMine != null;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MATERIEL__APOUR_CARACTERISTIQUE_UXO_ETAT_OPERATIONNEL_UXO:
				return aPourCaracteristiqueUXOEtatOperationnelUXO != null;
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
		result.append(" (etatOperationnel: ");
		if (etatOperationnelESet) result.append(etatOperationnel); else result.append("<unset>");
		result.append(", qualificatifEtat: ");
		if (qualificatifEtatESet) result.append(qualificatifEtat); else result.append("<unset>");
		result.append(", possibilite: ");
		if (possibiliteESet) result.append(possibilite); else result.append("<unset>");
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(", securite: ");
		if (securiteESet) result.append(securite); else result.append("<unset>");
		result.append(", etatDemolition: ");
		if (etatDemolitionESet) result.append(etatDemolition); else result.append("<unset>");
		result.append(", visibleParEnnemi: ");
		if (visibleParEnnemiESet) result.append(visibleParEnnemi); else result.append("<unset>");
		result.append(", impossibiliteEtreRemorque: ");
		if (impossibiliteEtreRemorqueESet) result.append(impossibiliteEtreRemorque); else result.append("<unset>");
		result.append(", reserve: ");
		if (reserveESet) result.append(reserve); else result.append("<unset>");
		result.append(", impossibiliteSeDeplacer: ");
		if (impossibiliteSeDeplacerESet) result.append(impossibiliteSeDeplacer); else result.append("<unset>");
		result.append(", reparableA12H: ");
		if (reparableA12HESet) result.append(reparableA12H); else result.append("<unset>");
		result.append(", descriptionPanne: ");
		result.append(descriptionPanne);
		result.append(", piecesRechangeNecessaires: ");
		result.append(piecesRechangeNecessaires);
		result.append(", vehiculeVide: ");
		if (vehiculeVideESet) result.append(vehiculeVide); else result.append("<unset>");
		result.append(", couleurPrincipale: ");
		if (couleurPrincipaleESet) result.append(couleurPrincipale); else result.append("<unset>");
		result.append(", marquage: ");
		if (marquageESet) result.append(marquage); else result.append("<unset>");
		result.append(", couleurMarquage: ");
		if (couleurMarquageESet) result.append(couleurMarquage); else result.append("<unset>");
		result.append(", conformiteOMI: ");
		if (conformiteOMIESet) result.append(conformiteOMI); else result.append("<unset>");
		result.append(", typeDefaillanceBouee: ");
		if (typeDefaillanceBoueeESet) result.append(typeDefaillanceBouee); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelMaterielImpl
