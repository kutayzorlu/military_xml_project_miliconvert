/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBilanTirsASS;
import mpia.schema.TypeBilanTirsASSsurZone;
import mpia.schema.TypeDictionaryDicoBilanTirsASSEtat;
import mpia.schema.TypeTypeObjectifASS;
import mpia.schema.TypeVolumeMunitionsASS;

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
 * An implementation of the model object '<em><b>Type Bilan Tirs ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getGDHdebut <em>GD Hdebut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getGDHfin <em>GD Hfin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getNombreTirsGlobal <em>Nombre Tirs Global</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getNombreCoupsGlobal <em>Nombre Coups Global</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getNombreTirsOpportunite <em>Nombre Tirs Opportunite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getNombreTirsDemandePlanFeux <em>Nombre Tirs Demande Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getNombreTirsHorairePlanFeux <em>Nombre Tirs Horaire Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getAPourUniteOrigineDemandeUnite <em>APour Unite Origine Demande Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getAPourUniteRendantCompteUnite <em>APour Unite Rendant Compte Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getConcernePlanFeux <em>Concerne Plan Feux</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getDemandeBilanPourTypeObjectifASS <em>Demande Bilan Pour Type Objectif ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getDemandeBilanSurAutreElementControle <em>Demande Bilan Sur Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getAPourConsommationGlobaleVolumeMunitionsASS <em>APour Consommation Globale Volume Munitions ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBilanTirsASSImpl#getAPourBilanSurZoneBilanTirsASSsurZone <em>APour Bilan Sur Zone Bilan Tirs AS Ssur Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBilanTirsASSImpl extends EObjectImpl implements TypeBilanTirsASS {
	/**
	 * The default value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoBilanTirsASSEtat ETAT_EDEFAULT = TypeDictionaryDicoBilanTirsASSEtat.REQUST;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoBilanTirsASSEtat etat = ETAT_EDEFAULT;

	/**
	 * This is true if the Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatESet;

	/**
	 * The default value of the '{@link #getGDHdebut() <em>GD Hdebut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HDEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHdebut() <em>GD Hdebut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHdebut = GD_HDEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHfin() <em>GD Hfin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HFIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHfin() <em>GD Hfin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHfin = GD_HFIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombreTirsGlobal() <em>Nombre Tirs Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TIRS_GLOBAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTirsGlobal() <em>Nombre Tirs Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsGlobal()
	 * @generated
	 * @ordered
	 */
	protected long nombreTirsGlobal = NOMBRE_TIRS_GLOBAL_EDEFAULT;

	/**
	 * This is true if the Nombre Tirs Global attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTirsGlobalESet;

	/**
	 * The default value of the '{@link #getNombreCoupsGlobal() <em>Nombre Coups Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCoupsGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_COUPS_GLOBAL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreCoupsGlobal() <em>Nombre Coups Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreCoupsGlobal()
	 * @generated
	 * @ordered
	 */
	protected long nombreCoupsGlobal = NOMBRE_COUPS_GLOBAL_EDEFAULT;

	/**
	 * This is true if the Nombre Coups Global attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreCoupsGlobalESet;

	/**
	 * The default value of the '{@link #getNombreTirsOpportunite() <em>Nombre Tirs Opportunite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsOpportunite()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TIRS_OPPORTUNITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTirsOpportunite() <em>Nombre Tirs Opportunite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsOpportunite()
	 * @generated
	 * @ordered
	 */
	protected long nombreTirsOpportunite = NOMBRE_TIRS_OPPORTUNITE_EDEFAULT;

	/**
	 * This is true if the Nombre Tirs Opportunite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTirsOpportuniteESet;

	/**
	 * The default value of the '{@link #getNombreTirsDemandePlanFeux() <em>Nombre Tirs Demande Plan Feux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsDemandePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TIRS_DEMANDE_PLAN_FEUX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTirsDemandePlanFeux() <em>Nombre Tirs Demande Plan Feux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsDemandePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected long nombreTirsDemandePlanFeux = NOMBRE_TIRS_DEMANDE_PLAN_FEUX_EDEFAULT;

	/**
	 * This is true if the Nombre Tirs Demande Plan Feux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTirsDemandePlanFeuxESet;

	/**
	 * The default value of the '{@link #getNombreTirsHorairePlanFeux() <em>Nombre Tirs Horaire Plan Feux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsHorairePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TIRS_HORAIRE_PLAN_FEUX_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTirsHorairePlanFeux() <em>Nombre Tirs Horaire Plan Feux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTirsHorairePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected long nombreTirsHorairePlanFeux = NOMBRE_TIRS_HORAIRE_PLAN_FEUX_EDEFAULT;

	/**
	 * This is true if the Nombre Tirs Horaire Plan Feux attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTirsHorairePlanFeuxESet;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteOrigineDemandeUnite() <em>APour Unite Origine Demande Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteOrigineDemandeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteOrigineDemandeUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteRendantCompteUnite() <em>APour Unite Rendant Compte Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRendantCompteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRendantCompteUnite;

	/**
	 * The cached value of the '{@link #getConcernePlanFeux() <em>Concerne Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcernePlanFeux()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concernePlanFeux;

	/**
	 * The cached value of the '{@link #getDemandeBilanPourTypeObjectifASS() <em>Demande Bilan Pour Type Objectif ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeBilanPourTypeObjectifASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeTypeObjectifASS> demandeBilanPourTypeObjectifASS;

	/**
	 * The cached value of the '{@link #getDemandeBilanSurAutreElementControle() <em>Demande Bilan Sur Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDemandeBilanSurAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> demandeBilanSurAutreElementControle;

	/**
	 * The cached value of the '{@link #getAPourConsommationGlobaleVolumeMunitionsASS() <em>APour Consommation Globale Volume Munitions ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourConsommationGlobaleVolumeMunitionsASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeVolumeMunitionsASS> aPourConsommationGlobaleVolumeMunitionsASS;

	/**
	 * The cached value of the '{@link #getAPourBilanSurZoneBilanTirsASSsurZone() <em>APour Bilan Sur Zone Bilan Tirs AS Ssur Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourBilanSurZoneBilanTirsASSsurZone()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeBilanTirsASSsurZone> aPourBilanSurZoneBilanTirsASSsurZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBilanTirsASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBilanTirsASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoBilanTirsASSEtat getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(TypeDictionaryDicoBilanTirsASSEtat newEtat) {
		TypeDictionaryDicoBilanTirsASSEtat oldEtat = etat;
		etat = newEtat == null ? ETAT_EDEFAULT : newEtat;
		boolean oldEtatESet = etatESet;
		etatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__ETAT, oldEtat, etat, !oldEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtat() {
		TypeDictionaryDicoBilanTirsASSEtat oldEtat = etat;
		boolean oldEtatESet = etatESet;
		etat = ETAT_EDEFAULT;
		etatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BILAN_TIRS_ASS__ETAT, oldEtat, ETAT_EDEFAULT, oldEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtat() {
		return etatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHdebut() {
		return gDHdebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHdebut(XMLGregorianCalendar newGDHdebut) {
		XMLGregorianCalendar oldGDHdebut = gDHdebut;
		gDHdebut = newGDHdebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HDEBUT, oldGDHdebut, gDHdebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHfin() {
		return gDHfin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHfin(XMLGregorianCalendar newGDHfin) {
		XMLGregorianCalendar oldGDHfin = gDHfin;
		gDHfin = newGDHfin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HFIN, oldGDHfin, gDHfin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTirsGlobal() {
		return nombreTirsGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTirsGlobal(long newNombreTirsGlobal) {
		long oldNombreTirsGlobal = nombreTirsGlobal;
		nombreTirsGlobal = newNombreTirsGlobal;
		boolean oldNombreTirsGlobalESet = nombreTirsGlobalESet;
		nombreTirsGlobalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_GLOBAL, oldNombreTirsGlobal, nombreTirsGlobal, !oldNombreTirsGlobalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTirsGlobal() {
		long oldNombreTirsGlobal = nombreTirsGlobal;
		boolean oldNombreTirsGlobalESet = nombreTirsGlobalESet;
		nombreTirsGlobal = NOMBRE_TIRS_GLOBAL_EDEFAULT;
		nombreTirsGlobalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_GLOBAL, oldNombreTirsGlobal, NOMBRE_TIRS_GLOBAL_EDEFAULT, oldNombreTirsGlobalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTirsGlobal() {
		return nombreTirsGlobalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreCoupsGlobal() {
		return nombreCoupsGlobal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreCoupsGlobal(long newNombreCoupsGlobal) {
		long oldNombreCoupsGlobal = nombreCoupsGlobal;
		nombreCoupsGlobal = newNombreCoupsGlobal;
		boolean oldNombreCoupsGlobalESet = nombreCoupsGlobalESet;
		nombreCoupsGlobalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_COUPS_GLOBAL, oldNombreCoupsGlobal, nombreCoupsGlobal, !oldNombreCoupsGlobalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreCoupsGlobal() {
		long oldNombreCoupsGlobal = nombreCoupsGlobal;
		boolean oldNombreCoupsGlobalESet = nombreCoupsGlobalESet;
		nombreCoupsGlobal = NOMBRE_COUPS_GLOBAL_EDEFAULT;
		nombreCoupsGlobalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_COUPS_GLOBAL, oldNombreCoupsGlobal, NOMBRE_COUPS_GLOBAL_EDEFAULT, oldNombreCoupsGlobalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreCoupsGlobal() {
		return nombreCoupsGlobalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTirsOpportunite() {
		return nombreTirsOpportunite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTirsOpportunite(long newNombreTirsOpportunite) {
		long oldNombreTirsOpportunite = nombreTirsOpportunite;
		nombreTirsOpportunite = newNombreTirsOpportunite;
		boolean oldNombreTirsOpportuniteESet = nombreTirsOpportuniteESet;
		nombreTirsOpportuniteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_OPPORTUNITE, oldNombreTirsOpportunite, nombreTirsOpportunite, !oldNombreTirsOpportuniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTirsOpportunite() {
		long oldNombreTirsOpportunite = nombreTirsOpportunite;
		boolean oldNombreTirsOpportuniteESet = nombreTirsOpportuniteESet;
		nombreTirsOpportunite = NOMBRE_TIRS_OPPORTUNITE_EDEFAULT;
		nombreTirsOpportuniteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_OPPORTUNITE, oldNombreTirsOpportunite, NOMBRE_TIRS_OPPORTUNITE_EDEFAULT, oldNombreTirsOpportuniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTirsOpportunite() {
		return nombreTirsOpportuniteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTirsDemandePlanFeux() {
		return nombreTirsDemandePlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTirsDemandePlanFeux(long newNombreTirsDemandePlanFeux) {
		long oldNombreTirsDemandePlanFeux = nombreTirsDemandePlanFeux;
		nombreTirsDemandePlanFeux = newNombreTirsDemandePlanFeux;
		boolean oldNombreTirsDemandePlanFeuxESet = nombreTirsDemandePlanFeuxESet;
		nombreTirsDemandePlanFeuxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_DEMANDE_PLAN_FEUX, oldNombreTirsDemandePlanFeux, nombreTirsDemandePlanFeux, !oldNombreTirsDemandePlanFeuxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTirsDemandePlanFeux() {
		long oldNombreTirsDemandePlanFeux = nombreTirsDemandePlanFeux;
		boolean oldNombreTirsDemandePlanFeuxESet = nombreTirsDemandePlanFeuxESet;
		nombreTirsDemandePlanFeux = NOMBRE_TIRS_DEMANDE_PLAN_FEUX_EDEFAULT;
		nombreTirsDemandePlanFeuxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_DEMANDE_PLAN_FEUX, oldNombreTirsDemandePlanFeux, NOMBRE_TIRS_DEMANDE_PLAN_FEUX_EDEFAULT, oldNombreTirsDemandePlanFeuxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTirsDemandePlanFeux() {
		return nombreTirsDemandePlanFeuxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTirsHorairePlanFeux() {
		return nombreTirsHorairePlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTirsHorairePlanFeux(long newNombreTirsHorairePlanFeux) {
		long oldNombreTirsHorairePlanFeux = nombreTirsHorairePlanFeux;
		nombreTirsHorairePlanFeux = newNombreTirsHorairePlanFeux;
		boolean oldNombreTirsHorairePlanFeuxESet = nombreTirsHorairePlanFeuxESet;
		nombreTirsHorairePlanFeuxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_HORAIRE_PLAN_FEUX, oldNombreTirsHorairePlanFeux, nombreTirsHorairePlanFeux, !oldNombreTirsHorairePlanFeuxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTirsHorairePlanFeux() {
		long oldNombreTirsHorairePlanFeux = nombreTirsHorairePlanFeux;
		boolean oldNombreTirsHorairePlanFeuxESet = nombreTirsHorairePlanFeuxESet;
		nombreTirsHorairePlanFeux = NOMBRE_TIRS_HORAIRE_PLAN_FEUX_EDEFAULT;
		nombreTirsHorairePlanFeuxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_HORAIRE_PLAN_FEUX, oldNombreTirsHorairePlanFeux, NOMBRE_TIRS_HORAIRE_PLAN_FEUX_EDEFAULT, oldNombreTirsHorairePlanFeuxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTirsHorairePlanFeux() {
		return nombreTirsHorairePlanFeuxESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteOrigineDemandeUnite() {
		return aPourUniteOrigineDemandeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteOrigineDemandeUnite(TypeAssociationEXT newAPourUniteOrigineDemandeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteOrigineDemandeUnite = aPourUniteOrigineDemandeUnite;
		aPourUniteOrigineDemandeUnite = newAPourUniteOrigineDemandeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE, oldAPourUniteOrigineDemandeUnite, newAPourUniteOrigineDemandeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteOrigineDemandeUnite(TypeAssociationEXT newAPourUniteOrigineDemandeUnite) {
		if (newAPourUniteOrigineDemandeUnite != aPourUniteOrigineDemandeUnite) {
			NotificationChain msgs = null;
			if (aPourUniteOrigineDemandeUnite != null)
				msgs = ((InternalEObject)aPourUniteOrigineDemandeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE, null, msgs);
			if (newAPourUniteOrigineDemandeUnite != null)
				msgs = ((InternalEObject)newAPourUniteOrigineDemandeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE, null, msgs);
			msgs = basicSetAPourUniteOrigineDemandeUnite(newAPourUniteOrigineDemandeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE, newAPourUniteOrigineDemandeUnite, newAPourUniteOrigineDemandeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRendantCompteUnite() {
		return aPourUniteRendantCompteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRendantCompteUnite = aPourUniteRendantCompteUnite;
		aPourUniteRendantCompteUnite = newAPourUniteRendantCompteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE, oldAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRendantCompteUnite(TypeAssociationEXT newAPourUniteRendantCompteUnite) {
		if (newAPourUniteRendantCompteUnite != aPourUniteRendantCompteUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)aPourUniteRendantCompteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			if (newAPourUniteRendantCompteUnite != null)
				msgs = ((InternalEObject)newAPourUniteRendantCompteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE, null, msgs);
			msgs = basicSetAPourUniteRendantCompteUnite(newAPourUniteRendantCompteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE, newAPourUniteRendantCompteUnite, newAPourUniteRendantCompteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcernePlanFeux() {
		return concernePlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcernePlanFeux(TypeAssociation newConcernePlanFeux, NotificationChain msgs) {
		TypeAssociation oldConcernePlanFeux = concernePlanFeux;
		concernePlanFeux = newConcernePlanFeux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX, oldConcernePlanFeux, newConcernePlanFeux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcernePlanFeux(TypeAssociation newConcernePlanFeux) {
		if (newConcernePlanFeux != concernePlanFeux) {
			NotificationChain msgs = null;
			if (concernePlanFeux != null)
				msgs = ((InternalEObject)concernePlanFeux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX, null, msgs);
			if (newConcernePlanFeux != null)
				msgs = ((InternalEObject)newConcernePlanFeux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX, null, msgs);
			msgs = basicSetConcernePlanFeux(newConcernePlanFeux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX, newConcernePlanFeux, newConcernePlanFeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeTypeObjectifASS> getDemandeBilanPourTypeObjectifASS() {
		if (demandeBilanPourTypeObjectifASS == null) {
			demandeBilanPourTypeObjectifASS = new EObjectContainmentEList<TypeTypeObjectifASS>(TypeTypeObjectifASS.class, this, SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_POUR_TYPE_OBJECTIF_ASS);
		}
		return demandeBilanPourTypeObjectifASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getDemandeBilanSurAutreElementControle() {
		if (demandeBilanSurAutreElementControle == null) {
			demandeBilanSurAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_SUR_AUTRE_ELEMENT_CONTROLE);
		}
		return demandeBilanSurAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeVolumeMunitionsASS> getAPourConsommationGlobaleVolumeMunitionsASS() {
		if (aPourConsommationGlobaleVolumeMunitionsASS == null) {
			aPourConsommationGlobaleVolumeMunitionsASS = new EObjectContainmentEList<TypeVolumeMunitionsASS>(TypeVolumeMunitionsASS.class, this, SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_CONSOMMATION_GLOBALE_VOLUME_MUNITIONS_ASS);
		}
		return aPourConsommationGlobaleVolumeMunitionsASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeBilanTirsASSsurZone> getAPourBilanSurZoneBilanTirsASSsurZone() {
		if (aPourBilanSurZoneBilanTirsASSsurZone == null) {
			aPourBilanSurZoneBilanTirsASSsurZone = new EObjectContainmentEList<TypeBilanTirsASSsurZone>(TypeBilanTirsASSsurZone.class, this, SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_BILAN_SUR_ZONE_BILAN_TIRS_AS_SSUR_ZONE);
		}
		return aPourBilanSurZoneBilanTirsASSsurZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE:
				return basicSetAPourUniteOrigineDemandeUnite(null, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return basicSetAPourUniteRendantCompteUnite(null, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX:
				return basicSetConcernePlanFeux(null, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_POUR_TYPE_OBJECTIF_ASS:
				return ((InternalEList<?>)getDemandeBilanPourTypeObjectifASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_SUR_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getDemandeBilanSurAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_CONSOMMATION_GLOBALE_VOLUME_MUNITIONS_ASS:
				return ((InternalEList<?>)getAPourConsommationGlobaleVolumeMunitionsASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_BILAN_SUR_ZONE_BILAN_TIRS_AS_SSUR_ZONE:
				return ((InternalEList<?>)getAPourBilanSurZoneBilanTirsASSsurZone()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__ETAT:
				return getEtat();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HDEBUT:
				return getGDHdebut();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HFIN:
				return getGDHfin();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_GLOBAL:
				return new Long(getNombreTirsGlobal());
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_COUPS_GLOBAL:
				return new Long(getNombreCoupsGlobal());
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_OPPORTUNITE:
				return new Long(getNombreTirsOpportunite());
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_DEMANDE_PLAN_FEUX:
				return new Long(getNombreTirsDemandePlanFeux());
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_HORAIRE_PLAN_FEUX:
				return new Long(getNombreTirsHorairePlanFeux());
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CE:
				return getCE();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE:
				return getAPourUniteOrigineDemandeUnite();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return getAPourUniteRendantCompteUnite();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX:
				return getConcernePlanFeux();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_POUR_TYPE_OBJECTIF_ASS:
				return getDemandeBilanPourTypeObjectifASS();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_SUR_AUTRE_ELEMENT_CONTROLE:
				return getDemandeBilanSurAutreElementControle();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_CONSOMMATION_GLOBALE_VOLUME_MUNITIONS_ASS:
				return getAPourConsommationGlobaleVolumeMunitionsASS();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_BILAN_SUR_ZONE_BILAN_TIRS_AS_SSUR_ZONE:
				return getAPourBilanSurZoneBilanTirsASSsurZone();
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
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__ETAT:
				setEtat((TypeDictionaryDicoBilanTirsASSEtat)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HDEBUT:
				setGDHdebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HFIN:
				setGDHfin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_GLOBAL:
				setNombreTirsGlobal(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_COUPS_GLOBAL:
				setNombreCoupsGlobal(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_OPPORTUNITE:
				setNombreTirsOpportunite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_DEMANDE_PLAN_FEUX:
				setNombreTirsDemandePlanFeux(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_HORAIRE_PLAN_FEUX:
				setNombreTirsHorairePlanFeux(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE:
				setAPourUniteOrigineDemandeUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX:
				setConcernePlanFeux((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_POUR_TYPE_OBJECTIF_ASS:
				getDemandeBilanPourTypeObjectifASS().clear();
				getDemandeBilanPourTypeObjectifASS().addAll((Collection<? extends TypeTypeObjectifASS>)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_SUR_AUTRE_ELEMENT_CONTROLE:
				getDemandeBilanSurAutreElementControle().clear();
				getDemandeBilanSurAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_CONSOMMATION_GLOBALE_VOLUME_MUNITIONS_ASS:
				getAPourConsommationGlobaleVolumeMunitionsASS().clear();
				getAPourConsommationGlobaleVolumeMunitionsASS().addAll((Collection<? extends TypeVolumeMunitionsASS>)newValue);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_BILAN_SUR_ZONE_BILAN_TIRS_AS_SSUR_ZONE:
				getAPourBilanSurZoneBilanTirsASSsurZone().clear();
				getAPourBilanSurZoneBilanTirsASSsurZone().addAll((Collection<? extends TypeBilanTirsASSsurZone>)newValue);
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
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__ETAT:
				unsetEtat();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HDEBUT:
				setGDHdebut(GD_HDEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HFIN:
				setGDHfin(GD_HFIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_GLOBAL:
				unsetNombreTirsGlobal();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_COUPS_GLOBAL:
				unsetNombreCoupsGlobal();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_OPPORTUNITE:
				unsetNombreTirsOpportunite();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_DEMANDE_PLAN_FEUX:
				unsetNombreTirsDemandePlanFeux();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_HORAIRE_PLAN_FEUX:
				unsetNombreTirsHorairePlanFeux();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE:
				setAPourUniteOrigineDemandeUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				setAPourUniteRendantCompteUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX:
				setConcernePlanFeux((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_POUR_TYPE_OBJECTIF_ASS:
				getDemandeBilanPourTypeObjectifASS().clear();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_SUR_AUTRE_ELEMENT_CONTROLE:
				getDemandeBilanSurAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_CONSOMMATION_GLOBALE_VOLUME_MUNITIONS_ASS:
				getAPourConsommationGlobaleVolumeMunitionsASS().clear();
				return;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_BILAN_SUR_ZONE_BILAN_TIRS_AS_SSUR_ZONE:
				getAPourBilanSurZoneBilanTirsASSsurZone().clear();
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
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__ETAT:
				return isSetEtat();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HDEBUT:
				return GD_HDEBUT_EDEFAULT == null ? gDHdebut != null : !GD_HDEBUT_EDEFAULT.equals(gDHdebut);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__GD_HFIN:
				return GD_HFIN_EDEFAULT == null ? gDHfin != null : !GD_HFIN_EDEFAULT.equals(gDHfin);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_GLOBAL:
				return isSetNombreTirsGlobal();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_COUPS_GLOBAL:
				return isSetNombreCoupsGlobal();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_OPPORTUNITE:
				return isSetNombreTirsOpportunite();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_DEMANDE_PLAN_FEUX:
				return isSetNombreTirsDemandePlanFeux();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__NOMBRE_TIRS_HORAIRE_PLAN_FEUX:
				return isSetNombreTirsHorairePlanFeux();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_ORIGINE_DEMANDE_UNITE:
				return aPourUniteOrigineDemandeUnite != null;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_UNITE_RENDANT_COMPTE_UNITE:
				return aPourUniteRendantCompteUnite != null;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__CONCERNE_PLAN_FEUX:
				return concernePlanFeux != null;
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_POUR_TYPE_OBJECTIF_ASS:
				return demandeBilanPourTypeObjectifASS != null && !demandeBilanPourTypeObjectifASS.isEmpty();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__DEMANDE_BILAN_SUR_AUTRE_ELEMENT_CONTROLE:
				return demandeBilanSurAutreElementControle != null && !demandeBilanSurAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_CONSOMMATION_GLOBALE_VOLUME_MUNITIONS_ASS:
				return aPourConsommationGlobaleVolumeMunitionsASS != null && !aPourConsommationGlobaleVolumeMunitionsASS.isEmpty();
			case SchemaPackage.TYPE_BILAN_TIRS_ASS__APOUR_BILAN_SUR_ZONE_BILAN_TIRS_AS_SSUR_ZONE:
				return aPourBilanSurZoneBilanTirsASSsurZone != null && !aPourBilanSurZoneBilanTirsASSsurZone.isEmpty();
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
		result.append(" (etat: ");
		if (etatESet) result.append(etat); else result.append("<unset>");
		result.append(", gDHdebut: ");
		result.append(gDHdebut);
		result.append(", gDHfin: ");
		result.append(gDHfin);
		result.append(", nombreTirsGlobal: ");
		if (nombreTirsGlobalESet) result.append(nombreTirsGlobal); else result.append("<unset>");
		result.append(", nombreCoupsGlobal: ");
		if (nombreCoupsGlobalESet) result.append(nombreCoupsGlobal); else result.append("<unset>");
		result.append(", nombreTirsOpportunite: ");
		if (nombreTirsOpportuniteESet) result.append(nombreTirsOpportunite); else result.append("<unset>");
		result.append(", nombreTirsDemandePlanFeux: ");
		if (nombreTirsDemandePlanFeuxESet) result.append(nombreTirsDemandePlanFeux); else result.append("<unset>");
		result.append(", nombreTirsHorairePlanFeux: ");
		if (nombreTirsHorairePlanFeuxESet) result.append(nombreTirsHorairePlanFeux); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeBilanTirsASSImpl
