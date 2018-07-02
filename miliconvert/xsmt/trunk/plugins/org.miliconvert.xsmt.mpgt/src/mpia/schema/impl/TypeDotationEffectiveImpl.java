/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDotationEffectiveMethodeCalculStock;
import mpia.schema.TypeDotationEffective;
import mpia.schema.TypeSurplusOuDeficit;
import mpia.schema.TypeTransfertDotation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Dotation Effective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getQuantiteOperationnelle <em>Quantite Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getQuantiteDisponible <em>Quantite Disponible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getQuantiteTotale <em>Quantite Totale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getQuantiteDisponibleDemande <em>Quantite Disponible Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getQuantiteTotaleDemande <em>Quantite Totale Demande</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getQuantitePourDestructionCible <em>Quantite Pour Destruction Cible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getNombreUtilisations <em>Nombre Utilisations</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getDureeFonctionnement <em>Duree Fonctionnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getMethodeCalculStock <em>Methode Calcul Stock</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getEstChangeParTransfertDotation <em>Est Change Par Transfert Dotation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getAPourInformationsDurplusOuDeficitSurplusOuDeficit <em>APour Informations Durplus Ou Deficit Surplus Ou Deficit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDotationEffectiveImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeDotationEffectiveImpl extends EObjectImpl implements TypeDotationEffective {
	/**
	 * The default value of the '{@link #getQuantiteOperationnelle() <em>Quantite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_OPERATIONNELLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteOperationnelle() <em>Quantite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected long quantiteOperationnelle = QUANTITE_OPERATIONNELLE_EDEFAULT;

	/**
	 * This is true if the Quantite Operationnelle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteOperationnelleESet;

	/**
	 * The default value of the '{@link #getQuantiteDisponible() <em>Quantite Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDisponible()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_DISPONIBLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteDisponible() <em>Quantite Disponible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDisponible()
	 * @generated
	 * @ordered
	 */
	protected long quantiteDisponible = QUANTITE_DISPONIBLE_EDEFAULT;

	/**
	 * This is true if the Quantite Disponible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteDisponibleESet;

	/**
	 * The default value of the '{@link #getQuantiteTotale() <em>Quantite Totale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteTotale()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_TOTALE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteTotale() <em>Quantite Totale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteTotale()
	 * @generated
	 * @ordered
	 */
	protected long quantiteTotale = QUANTITE_TOTALE_EDEFAULT;

	/**
	 * This is true if the Quantite Totale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteTotaleESet;

	/**
	 * The default value of the '{@link #getQuantiteDisponibleDemande() <em>Quantite Disponible Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDisponibleDemande()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_DISPONIBLE_DEMANDE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteDisponibleDemande() <em>Quantite Disponible Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteDisponibleDemande()
	 * @generated
	 * @ordered
	 */
	protected long quantiteDisponibleDemande = QUANTITE_DISPONIBLE_DEMANDE_EDEFAULT;

	/**
	 * This is true if the Quantite Disponible Demande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteDisponibleDemandeESet;

	/**
	 * The default value of the '{@link #getQuantiteTotaleDemande() <em>Quantite Totale Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteTotaleDemande()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_TOTALE_DEMANDE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteTotaleDemande() <em>Quantite Totale Demande</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteTotaleDemande()
	 * @generated
	 * @ordered
	 */
	protected long quantiteTotaleDemande = QUANTITE_TOTALE_DEMANDE_EDEFAULT;

	/**
	 * This is true if the Quantite Totale Demande attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteTotaleDemandeESet;

	/**
	 * The default value of the '{@link #getQuantitePourDestructionCible() <em>Quantite Pour Destruction Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitePourDestructionCible()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_POUR_DESTRUCTION_CIBLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantitePourDestructionCible() <em>Quantite Pour Destruction Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantitePourDestructionCible()
	 * @generated
	 * @ordered
	 */
	protected long quantitePourDestructionCible = QUANTITE_POUR_DESTRUCTION_CIBLE_EDEFAULT;

	/**
	 * This is true if the Quantite Pour Destruction Cible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantitePourDestructionCibleESet;

	/**
	 * The default value of the '{@link #getNombreUtilisations() <em>Nombre Utilisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreUtilisations()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_UTILISATIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreUtilisations() <em>Nombre Utilisations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreUtilisations()
	 * @generated
	 * @ordered
	 */
	protected long nombreUtilisations = NOMBRE_UTILISATIONS_EDEFAULT;

	/**
	 * This is true if the Nombre Utilisations attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreUtilisationsESet;

	/**
	 * The cached value of the '{@link #getDureeFonctionnement() <em>Duree Fonctionnement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeFonctionnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeFonctionnement;

	/**
	 * The default value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected static final String CTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCTE() <em>CTE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTE()
	 * @generated
	 * @ordered
	 */
	protected String cTE = CTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected static final String CE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCE() <em>CE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE()
	 * @generated
	 * @ordered
	 */
	protected String cE = CE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethodeCalculStock() <em>Methode Calcul Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodeCalculStock()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDotationEffectiveMethodeCalculStock METHODE_CALCUL_STOCK_EDEFAULT = TypeDictionaryDicoDotationEffectiveMethodeCalculStock.LVLOEF;

	/**
	 * The cached value of the '{@link #getMethodeCalculStock() <em>Methode Calcul Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodeCalculStock()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDotationEffectiveMethodeCalculStock methodeCalculStock = METHODE_CALCUL_STOCK_EDEFAULT;

	/**
	 * This is true if the Methode Calcul Stock attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodeCalculStockESet;

	/**
	 * The cached value of the '{@link #getEstChangeParTransfertDotation() <em>Est Change Par Transfert Dotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstChangeParTransfertDotation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTransfertDotation> estChangeParTransfertDotation;

	/**
	 * The cached value of the '{@link #getAPourInformationsDurplusOuDeficitSurplusOuDeficit() <em>APour Informations Durplus Ou Deficit Surplus Ou Deficit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourInformationsDurplusOuDeficitSurplusOuDeficit()
	 * @generated
	 * @ordered
	 */
	protected TypeSurplusOuDeficit aPourInformationsDurplusOuDeficitSurplusOuDeficit;

	/**
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDotationEffectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDotationEffective();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteOperationnelle() {
		return quantiteOperationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteOperationnelle(long newQuantiteOperationnelle) {
		long oldQuantiteOperationnelle = quantiteOperationnelle;
		quantiteOperationnelle = newQuantiteOperationnelle;
		boolean oldQuantiteOperationnelleESet = quantiteOperationnelleESet;
		quantiteOperationnelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_OPERATIONNELLE, oldQuantiteOperationnelle, quantiteOperationnelle, !oldQuantiteOperationnelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteOperationnelle() {
		long oldQuantiteOperationnelle = quantiteOperationnelle;
		boolean oldQuantiteOperationnelleESet = quantiteOperationnelleESet;
		quantiteOperationnelle = QUANTITE_OPERATIONNELLE_EDEFAULT;
		quantiteOperationnelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_OPERATIONNELLE, oldQuantiteOperationnelle, QUANTITE_OPERATIONNELLE_EDEFAULT, oldQuantiteOperationnelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteOperationnelle() {
		return quantiteOperationnelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteDisponible() {
		return quantiteDisponible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteDisponible(long newQuantiteDisponible) {
		long oldQuantiteDisponible = quantiteDisponible;
		quantiteDisponible = newQuantiteDisponible;
		boolean oldQuantiteDisponibleESet = quantiteDisponibleESet;
		quantiteDisponibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE, oldQuantiteDisponible, quantiteDisponible, !oldQuantiteDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteDisponible() {
		long oldQuantiteDisponible = quantiteDisponible;
		boolean oldQuantiteDisponibleESet = quantiteDisponibleESet;
		quantiteDisponible = QUANTITE_DISPONIBLE_EDEFAULT;
		quantiteDisponibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE, oldQuantiteDisponible, QUANTITE_DISPONIBLE_EDEFAULT, oldQuantiteDisponibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteDisponible() {
		return quantiteDisponibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteTotale() {
		return quantiteTotale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteTotale(long newQuantiteTotale) {
		long oldQuantiteTotale = quantiteTotale;
		quantiteTotale = newQuantiteTotale;
		boolean oldQuantiteTotaleESet = quantiteTotaleESet;
		quantiteTotaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE, oldQuantiteTotale, quantiteTotale, !oldQuantiteTotaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteTotale() {
		long oldQuantiteTotale = quantiteTotale;
		boolean oldQuantiteTotaleESet = quantiteTotaleESet;
		quantiteTotale = QUANTITE_TOTALE_EDEFAULT;
		quantiteTotaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE, oldQuantiteTotale, QUANTITE_TOTALE_EDEFAULT, oldQuantiteTotaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteTotale() {
		return quantiteTotaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteDisponibleDemande() {
		return quantiteDisponibleDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteDisponibleDemande(long newQuantiteDisponibleDemande) {
		long oldQuantiteDisponibleDemande = quantiteDisponibleDemande;
		quantiteDisponibleDemande = newQuantiteDisponibleDemande;
		boolean oldQuantiteDisponibleDemandeESet = quantiteDisponibleDemandeESet;
		quantiteDisponibleDemandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE_DEMANDE, oldQuantiteDisponibleDemande, quantiteDisponibleDemande, !oldQuantiteDisponibleDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteDisponibleDemande() {
		long oldQuantiteDisponibleDemande = quantiteDisponibleDemande;
		boolean oldQuantiteDisponibleDemandeESet = quantiteDisponibleDemandeESet;
		quantiteDisponibleDemande = QUANTITE_DISPONIBLE_DEMANDE_EDEFAULT;
		quantiteDisponibleDemandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE_DEMANDE, oldQuantiteDisponibleDemande, QUANTITE_DISPONIBLE_DEMANDE_EDEFAULT, oldQuantiteDisponibleDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteDisponibleDemande() {
		return quantiteDisponibleDemandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteTotaleDemande() {
		return quantiteTotaleDemande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteTotaleDemande(long newQuantiteTotaleDemande) {
		long oldQuantiteTotaleDemande = quantiteTotaleDemande;
		quantiteTotaleDemande = newQuantiteTotaleDemande;
		boolean oldQuantiteTotaleDemandeESet = quantiteTotaleDemandeESet;
		quantiteTotaleDemandeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE_DEMANDE, oldQuantiteTotaleDemande, quantiteTotaleDemande, !oldQuantiteTotaleDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteTotaleDemande() {
		long oldQuantiteTotaleDemande = quantiteTotaleDemande;
		boolean oldQuantiteTotaleDemandeESet = quantiteTotaleDemandeESet;
		quantiteTotaleDemande = QUANTITE_TOTALE_DEMANDE_EDEFAULT;
		quantiteTotaleDemandeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE_DEMANDE, oldQuantiteTotaleDemande, QUANTITE_TOTALE_DEMANDE_EDEFAULT, oldQuantiteTotaleDemandeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteTotaleDemande() {
		return quantiteTotaleDemandeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantitePourDestructionCible() {
		return quantitePourDestructionCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantitePourDestructionCible(long newQuantitePourDestructionCible) {
		long oldQuantitePourDestructionCible = quantitePourDestructionCible;
		quantitePourDestructionCible = newQuantitePourDestructionCible;
		boolean oldQuantitePourDestructionCibleESet = quantitePourDestructionCibleESet;
		quantitePourDestructionCibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_POUR_DESTRUCTION_CIBLE, oldQuantitePourDestructionCible, quantitePourDestructionCible, !oldQuantitePourDestructionCibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantitePourDestructionCible() {
		long oldQuantitePourDestructionCible = quantitePourDestructionCible;
		boolean oldQuantitePourDestructionCibleESet = quantitePourDestructionCibleESet;
		quantitePourDestructionCible = QUANTITE_POUR_DESTRUCTION_CIBLE_EDEFAULT;
		quantitePourDestructionCibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_POUR_DESTRUCTION_CIBLE, oldQuantitePourDestructionCible, QUANTITE_POUR_DESTRUCTION_CIBLE_EDEFAULT, oldQuantitePourDestructionCibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantitePourDestructionCible() {
		return quantitePourDestructionCibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreUtilisations() {
		return nombreUtilisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreUtilisations(long newNombreUtilisations) {
		long oldNombreUtilisations = nombreUtilisations;
		nombreUtilisations = newNombreUtilisations;
		boolean oldNombreUtilisationsESet = nombreUtilisationsESet;
		nombreUtilisationsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__NOMBRE_UTILISATIONS, oldNombreUtilisations, nombreUtilisations, !oldNombreUtilisationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreUtilisations() {
		long oldNombreUtilisations = nombreUtilisations;
		boolean oldNombreUtilisationsESet = nombreUtilisationsESet;
		nombreUtilisations = NOMBRE_UTILISATIONS_EDEFAULT;
		nombreUtilisationsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__NOMBRE_UTILISATIONS, oldNombreUtilisations, NOMBRE_UTILISATIONS_EDEFAULT, oldNombreUtilisationsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreUtilisations() {
		return nombreUtilisationsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeFonctionnement() {
		return dureeFonctionnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeFonctionnement(TypeDataTypeDuree newDureeFonctionnement, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeFonctionnement = dureeFonctionnement;
		dureeFonctionnement = newDureeFonctionnement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT, oldDureeFonctionnement, newDureeFonctionnement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeFonctionnement(TypeDataTypeDuree newDureeFonctionnement) {
		if (newDureeFonctionnement != dureeFonctionnement) {
			NotificationChain msgs = null;
			if (dureeFonctionnement != null)
				msgs = ((InternalEObject)dureeFonctionnement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT, null, msgs);
			if (newDureeFonctionnement != null)
				msgs = ((InternalEObject)newDureeFonctionnement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT, null, msgs);
			msgs = basicSetDureeFonctionnement(newDureeFonctionnement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT, newDureeFonctionnement, newDureeFonctionnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCTE() {
		return cTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTE(String newCTE) {
		String oldCTE = cTE;
		cTE = newCTE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__CTE, oldCTE, cTE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCE() {
		return cE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE(String newCE) {
		String oldCE = cE;
		cE = newCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDotationEffectiveMethodeCalculStock getMethodeCalculStock() {
		return methodeCalculStock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodeCalculStock(TypeDictionaryDicoDotationEffectiveMethodeCalculStock newMethodeCalculStock) {
		TypeDictionaryDicoDotationEffectiveMethodeCalculStock oldMethodeCalculStock = methodeCalculStock;
		methodeCalculStock = newMethodeCalculStock == null ? METHODE_CALCUL_STOCK_EDEFAULT : newMethodeCalculStock;
		boolean oldMethodeCalculStockESet = methodeCalculStockESet;
		methodeCalculStockESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__METHODE_CALCUL_STOCK, oldMethodeCalculStock, methodeCalculStock, !oldMethodeCalculStockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethodeCalculStock() {
		TypeDictionaryDicoDotationEffectiveMethodeCalculStock oldMethodeCalculStock = methodeCalculStock;
		boolean oldMethodeCalculStockESet = methodeCalculStockESet;
		methodeCalculStock = METHODE_CALCUL_STOCK_EDEFAULT;
		methodeCalculStockESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__METHODE_CALCUL_STOCK, oldMethodeCalculStock, METHODE_CALCUL_STOCK_EDEFAULT, oldMethodeCalculStockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethodeCalculStock() {
		return methodeCalculStockESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTransfertDotation> getEstChangeParTransfertDotation() {
		if (estChangeParTransfertDotation == null) {
			estChangeParTransfertDotation = new EObjectContainmentEList<TypeTransfertDotation>(TypeTransfertDotation.class, this, SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_CHANGE_PAR_TRANSFERT_DOTATION);
		}
		return estChangeParTransfertDotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSurplusOuDeficit getAPourInformationsDurplusOuDeficitSurplusOuDeficit() {
		return aPourInformationsDurplusOuDeficitSurplusOuDeficit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourInformationsDurplusOuDeficitSurplusOuDeficit(TypeSurplusOuDeficit newAPourInformationsDurplusOuDeficitSurplusOuDeficit, NotificationChain msgs) {
		TypeSurplusOuDeficit oldAPourInformationsDurplusOuDeficitSurplusOuDeficit = aPourInformationsDurplusOuDeficitSurplusOuDeficit;
		aPourInformationsDurplusOuDeficitSurplusOuDeficit = newAPourInformationsDurplusOuDeficitSurplusOuDeficit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT, oldAPourInformationsDurplusOuDeficitSurplusOuDeficit, newAPourInformationsDurplusOuDeficitSurplusOuDeficit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourInformationsDurplusOuDeficitSurplusOuDeficit(TypeSurplusOuDeficit newAPourInformationsDurplusOuDeficitSurplusOuDeficit) {
		if (newAPourInformationsDurplusOuDeficitSurplusOuDeficit != aPourInformationsDurplusOuDeficitSurplusOuDeficit) {
			NotificationChain msgs = null;
			if (aPourInformationsDurplusOuDeficitSurplusOuDeficit != null)
				msgs = ((InternalEObject)aPourInformationsDurplusOuDeficitSurplusOuDeficit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT, null, msgs);
			if (newAPourInformationsDurplusOuDeficitSurplusOuDeficit != null)
				msgs = ((InternalEObject)newAPourInformationsDurplusOuDeficitSurplusOuDeficit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT, null, msgs);
			msgs = basicSetAPourInformationsDurplusOuDeficitSurplusOuDeficit(newAPourInformationsDurplusOuDeficitSurplusOuDeficit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT, newAPourInformationsDurplusOuDeficitSurplusOuDeficit, newAPourInformationsDurplusOuDeficitSurplusOuDeficit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT:
				return basicSetDureeFonctionnement(null, msgs);
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_CHANGE_PAR_TRANSFERT_DOTATION:
				return ((InternalEList<?>)getEstChangeParTransfertDotation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT:
				return basicSetAPourInformationsDurplusOuDeficitSurplusOuDeficit(null, msgs);
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_OPERATIONNELLE:
				return new Long(getQuantiteOperationnelle());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE:
				return new Long(getQuantiteDisponible());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE:
				return new Long(getQuantiteTotale());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE_DEMANDE:
				return new Long(getQuantiteDisponibleDemande());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE_DEMANDE:
				return new Long(getQuantiteTotaleDemande());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_POUR_DESTRUCTION_CIBLE:
				return new Long(getQuantitePourDestructionCible());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__NOMBRE_UTILISATIONS:
				return new Long(getNombreUtilisations());
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT:
				return getDureeFonctionnement();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__CE:
				return getCE();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__METHODE_CALCUL_STOCK:
				return getMethodeCalculStock();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_CHANGE_PAR_TRANSFERT_DOTATION:
				return getEstChangeParTransfertDotation();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT:
				return getAPourInformationsDurplusOuDeficitSurplusOuDeficit();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_OPERATIONNELLE:
				setQuantiteOperationnelle(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE:
				setQuantiteDisponible(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE:
				setQuantiteTotale(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE_DEMANDE:
				setQuantiteDisponibleDemande(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE_DEMANDE:
				setQuantiteTotaleDemande(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_POUR_DESTRUCTION_CIBLE:
				setQuantitePourDestructionCible(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__NOMBRE_UTILISATIONS:
				setNombreUtilisations(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT:
				setDureeFonctionnement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__METHODE_CALCUL_STOCK:
				setMethodeCalculStock((TypeDictionaryDicoDotationEffectiveMethodeCalculStock)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_CHANGE_PAR_TRANSFERT_DOTATION:
				getEstChangeParTransfertDotation().clear();
				getEstChangeParTransfertDotation().addAll((Collection<? extends TypeTransfertDotation>)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT:
				setAPourInformationsDurplusOuDeficitSurplusOuDeficit((TypeSurplusOuDeficit)newValue);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_OPERATIONNELLE:
				unsetQuantiteOperationnelle();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE:
				unsetQuantiteDisponible();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE:
				unsetQuantiteTotale();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE_DEMANDE:
				unsetQuantiteDisponibleDemande();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE_DEMANDE:
				unsetQuantiteTotaleDemande();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_POUR_DESTRUCTION_CIBLE:
				unsetQuantitePourDestructionCible();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__NOMBRE_UTILISATIONS:
				unsetNombreUtilisations();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT:
				setDureeFonctionnement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__METHODE_CALCUL_STOCK:
				unsetMethodeCalculStock();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_CHANGE_PAR_TRANSFERT_DOTATION:
				getEstChangeParTransfertDotation().clear();
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT:
				setAPourInformationsDurplusOuDeficitSurplusOuDeficit((TypeSurplusOuDeficit)null);
				return;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_OPERATIONNELLE:
				return isSetQuantiteOperationnelle();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE:
				return isSetQuantiteDisponible();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE:
				return isSetQuantiteTotale();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_DISPONIBLE_DEMANDE:
				return isSetQuantiteDisponibleDemande();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_TOTALE_DEMANDE:
				return isSetQuantiteTotaleDemande();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__QUANTITE_POUR_DESTRUCTION_CIBLE:
				return isSetQuantitePourDestructionCible();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__NOMBRE_UTILISATIONS:
				return isSetNombreUtilisations();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__DUREE_FONCTIONNEMENT:
				return dureeFonctionnement != null;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__METHODE_CALCUL_STOCK:
				return isSetMethodeCalculStock();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_CHANGE_PAR_TRANSFERT_DOTATION:
				return estChangeParTransfertDotation != null && !estChangeParTransfertDotation.isEmpty();
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__APOUR_INFORMATIONS_DURPLUS_OU_DEFICIT_SURPLUS_OU_DEFICIT:
				return aPourInformationsDurplusOuDeficitSurplusOuDeficit != null;
			case SchemaPackage.TYPE_DOTATION_EFFECTIVE__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (quantiteOperationnelle: ");
		if (quantiteOperationnelleESet) result.append(quantiteOperationnelle); else result.append("<unset>");
		result.append(", quantiteDisponible: ");
		if (quantiteDisponibleESet) result.append(quantiteDisponible); else result.append("<unset>");
		result.append(", quantiteTotale: ");
		if (quantiteTotaleESet) result.append(quantiteTotale); else result.append("<unset>");
		result.append(", quantiteDisponibleDemande: ");
		if (quantiteDisponibleDemandeESet) result.append(quantiteDisponibleDemande); else result.append("<unset>");
		result.append(", quantiteTotaleDemande: ");
		if (quantiteTotaleDemandeESet) result.append(quantiteTotaleDemande); else result.append("<unset>");
		result.append(", quantitePourDestructionCible: ");
		if (quantitePourDestructionCibleESet) result.append(quantitePourDestructionCible); else result.append("<unset>");
		result.append(", nombreUtilisations: ");
		if (nombreUtilisationsESet) result.append(nombreUtilisations); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", methodeCalculStock: ");
		if (methodeCalculStockESet) result.append(methodeCalculStock); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeDotationEffectiveImpl
