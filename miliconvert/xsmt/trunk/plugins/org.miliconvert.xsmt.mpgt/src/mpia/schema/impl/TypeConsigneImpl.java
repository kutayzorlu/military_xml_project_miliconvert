/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssocConsigneLocalisation;
import mpia.schema.TypeChargement;
import mpia.schema.TypeConsigne;
import mpia.schema.TypeConsigneGeographique;
import mpia.schema.TypeDatation;
import mpia.schema.TypeDictionaryDicoConsigneEtatDemandeVolume;
import mpia.schema.TypeModalite;
import mpia.schema.TypePeriode;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Consigne</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getCode <em>Code</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getEtatDemandeVolume <em>Etat Demande Volume</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getNumeroDansPhase <em>Numero Dans Phase</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getACommeConsigneGeographiqueConsigneGeographique <em>AComme Consigne Geographique Consigne Geographique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getEstLocaliseParAssocConsigneLocalisation <em>Est Localise Par Assoc Consigne Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getACommeChargementChargement <em>AComme Chargement Chargement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getACommePeriodeActivationPeriode <em>AComme Periode Activation Periode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getACommeModaliteApplicationModalite <em>AComme Modalite Application Modalite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getACommeMesureCoordination3DMesureCoordination <em>AComme Mesure Coordination3 DMesure Coordination</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getACommePointEntreePointControle3D <em>AComme Point Entree Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getACommePointSortiePointControle3D <em>AComme Point Sortie Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getACommePointParticulierDeConsignePointControle3D <em>AComme Point Particulier De Consigne Point Controle3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getAPourDebutDatation <em>APour Debut Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsigneImpl#getAPourFinDatation <em>APour Fin Datation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsigneImpl extends TypeRacineOperationnelleImpl implements TypeConsigne {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatDemandeVolume() <em>Etat Demande Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemandeVolume()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsigneEtatDemandeVolume ETAT_DEMANDE_VOLUME_EDEFAULT = TypeDictionaryDicoConsigneEtatDemandeVolume.REQUEST;

	/**
	 * The cached value of the '{@link #getEtatDemandeVolume() <em>Etat Demande Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatDemandeVolume()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsigneEtatDemandeVolume etatDemandeVolume = ETAT_DEMANDE_VOLUME_EDEFAULT;

	/**
	 * This is true if the Etat Demande Volume attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatDemandeVolumeESet;

	/**
	 * The default value of the '{@link #getNumeroDansPhase() <em>Numero Dans Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDansPhase()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_DANS_PHASE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroDansPhase() <em>Numero Dans Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDansPhase()
	 * @generated
	 * @ordered
	 */
	protected long numeroDansPhase = NUMERO_DANS_PHASE_EDEFAULT;

	/**
	 * This is true if the Numero Dans Phase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroDansPhaseESet;

	/**
	 * The cached value of the '{@link #getACommeConsigneGeographiqueConsigneGeographique() <em>AComme Consigne Geographique Consigne Geographique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsigneGeographiqueConsigneGeographique()
	 * @generated
	 * @ordered
	 */
	protected TypeConsigneGeographique aCommeConsigneGeographiqueConsigneGeographique;

	/**
	 * The cached value of the '{@link #getEstLocaliseParAssocConsigneLocalisation() <em>Est Localise Par Assoc Consigne Localisation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseParAssocConsigneLocalisation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssocConsigneLocalisation> estLocaliseParAssocConsigneLocalisation;

	/**
	 * The cached value of the '{@link #getACommeChargementChargement() <em>AComme Chargement Chargement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeChargementChargement()
	 * @generated
	 * @ordered
	 */
	protected TypeChargement aCommeChargementChargement;

	/**
	 * The cached value of the '{@link #getACommePeriodeActivationPeriode() <em>AComme Periode Activation Periode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePeriodeActivationPeriode()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePeriode> aCommePeriodeActivationPeriode;

	/**
	 * The cached value of the '{@link #getACommeModaliteApplicationModalite() <em>AComme Modalite Application Modalite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeModaliteApplicationModalite()
	 * @generated
	 * @ordered
	 */
	protected TypeModalite aCommeModaliteApplicationModalite;

	/**
	 * The cached value of the '{@link #getACommeMesureCoordination3DMesureCoordination() <em>AComme Mesure Coordination3 DMesure Coordination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMesureCoordination3DMesureCoordination()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeMesureCoordination3DMesureCoordination;

	/**
	 * The cached value of the '{@link #getACommePointEntreePointControle3D() <em>AComme Point Entree Point Controle3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointEntreePointControle3D()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePointEntreePointControle3D;

	/**
	 * The cached value of the '{@link #getACommePointSortiePointControle3D() <em>AComme Point Sortie Point Controle3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointSortiePointControle3D()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePointSortiePointControle3D;

	/**
	 * The cached value of the '{@link #getACommePointParticulierDeConsignePointControle3D() <em>AComme Point Particulier De Consigne Point Controle3 D</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointParticulierDeConsignePointControle3D()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommePointParticulierDeConsignePointControle3D;

	/**
	 * The cached value of the '{@link #getAPourDebutDatation() <em>APour Debut Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDebutDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDebutDatation;

	/**
	 * The cached value of the '{@link #getAPourFinDatation() <em>APour Fin Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFinDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourFinDatation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsigneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsigne();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsigneEtatDemandeVolume getEtatDemandeVolume() {
		return etatDemandeVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatDemandeVolume(TypeDictionaryDicoConsigneEtatDemandeVolume newEtatDemandeVolume) {
		TypeDictionaryDicoConsigneEtatDemandeVolume oldEtatDemandeVolume = etatDemandeVolume;
		etatDemandeVolume = newEtatDemandeVolume == null ? ETAT_DEMANDE_VOLUME_EDEFAULT : newEtatDemandeVolume;
		boolean oldEtatDemandeVolumeESet = etatDemandeVolumeESet;
		etatDemandeVolumeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ETAT_DEMANDE_VOLUME, oldEtatDemandeVolume, etatDemandeVolume, !oldEtatDemandeVolumeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtatDemandeVolume() {
		TypeDictionaryDicoConsigneEtatDemandeVolume oldEtatDemandeVolume = etatDemandeVolume;
		boolean oldEtatDemandeVolumeESet = etatDemandeVolumeESet;
		etatDemandeVolume = ETAT_DEMANDE_VOLUME_EDEFAULT;
		etatDemandeVolumeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSIGNE__ETAT_DEMANDE_VOLUME, oldEtatDemandeVolume, ETAT_DEMANDE_VOLUME_EDEFAULT, oldEtatDemandeVolumeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtatDemandeVolume() {
		return etatDemandeVolumeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroDansPhase() {
		return numeroDansPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroDansPhase(long newNumeroDansPhase) {
		long oldNumeroDansPhase = numeroDansPhase;
		numeroDansPhase = newNumeroDansPhase;
		boolean oldNumeroDansPhaseESet = numeroDansPhaseESet;
		numeroDansPhaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__NUMERO_DANS_PHASE, oldNumeroDansPhase, numeroDansPhase, !oldNumeroDansPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroDansPhase() {
		long oldNumeroDansPhase = numeroDansPhase;
		boolean oldNumeroDansPhaseESet = numeroDansPhaseESet;
		numeroDansPhase = NUMERO_DANS_PHASE_EDEFAULT;
		numeroDansPhaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSIGNE__NUMERO_DANS_PHASE, oldNumeroDansPhase, NUMERO_DANS_PHASE_EDEFAULT, oldNumeroDansPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroDansPhase() {
		return numeroDansPhaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConsigneGeographique getACommeConsigneGeographiqueConsigneGeographique() {
		return aCommeConsigneGeographiqueConsigneGeographique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeConsigneGeographiqueConsigneGeographique(TypeConsigneGeographique newACommeConsigneGeographiqueConsigneGeographique, NotificationChain msgs) {
		TypeConsigneGeographique oldACommeConsigneGeographiqueConsigneGeographique = aCommeConsigneGeographiqueConsigneGeographique;
		aCommeConsigneGeographiqueConsigneGeographique = newACommeConsigneGeographiqueConsigneGeographique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE, oldACommeConsigneGeographiqueConsigneGeographique, newACommeConsigneGeographiqueConsigneGeographique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeConsigneGeographiqueConsigneGeographique(TypeConsigneGeographique newACommeConsigneGeographiqueConsigneGeographique) {
		if (newACommeConsigneGeographiqueConsigneGeographique != aCommeConsigneGeographiqueConsigneGeographique) {
			NotificationChain msgs = null;
			if (aCommeConsigneGeographiqueConsigneGeographique != null)
				msgs = ((InternalEObject)aCommeConsigneGeographiqueConsigneGeographique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE, null, msgs);
			if (newACommeConsigneGeographiqueConsigneGeographique != null)
				msgs = ((InternalEObject)newACommeConsigneGeographiqueConsigneGeographique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE, null, msgs);
			msgs = basicSetACommeConsigneGeographiqueConsigneGeographique(newACommeConsigneGeographiqueConsigneGeographique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE, newACommeConsigneGeographiqueConsigneGeographique, newACommeConsigneGeographiqueConsigneGeographique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssocConsigneLocalisation> getEstLocaliseParAssocConsigneLocalisation() {
		if (estLocaliseParAssocConsigneLocalisation == null) {
			estLocaliseParAssocConsigneLocalisation = new EObjectContainmentEList<TypeAssocConsigneLocalisation>(TypeAssocConsigneLocalisation.class, this, SchemaPackage.TYPE_CONSIGNE__EST_LOCALISE_PAR_ASSOC_CONSIGNE_LOCALISATION);
		}
		return estLocaliseParAssocConsigneLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeChargement getACommeChargementChargement() {
		return aCommeChargementChargement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeChargementChargement(TypeChargement newACommeChargementChargement, NotificationChain msgs) {
		TypeChargement oldACommeChargementChargement = aCommeChargementChargement;
		aCommeChargementChargement = newACommeChargementChargement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT, oldACommeChargementChargement, newACommeChargementChargement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeChargementChargement(TypeChargement newACommeChargementChargement) {
		if (newACommeChargementChargement != aCommeChargementChargement) {
			NotificationChain msgs = null;
			if (aCommeChargementChargement != null)
				msgs = ((InternalEObject)aCommeChargementChargement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT, null, msgs);
			if (newACommeChargementChargement != null)
				msgs = ((InternalEObject)newACommeChargementChargement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT, null, msgs);
			msgs = basicSetACommeChargementChargement(newACommeChargementChargement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT, newACommeChargementChargement, newACommeChargementChargement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePeriode> getACommePeriodeActivationPeriode() {
		if (aCommePeriodeActivationPeriode == null) {
			aCommePeriodeActivationPeriode = new EObjectContainmentEList<TypePeriode>(TypePeriode.class, this, SchemaPackage.TYPE_CONSIGNE__ACOMME_PERIODE_ACTIVATION_PERIODE);
		}
		return aCommePeriodeActivationPeriode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeModalite getACommeModaliteApplicationModalite() {
		return aCommeModaliteApplicationModalite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeModaliteApplicationModalite(TypeModalite newACommeModaliteApplicationModalite, NotificationChain msgs) {
		TypeModalite oldACommeModaliteApplicationModalite = aCommeModaliteApplicationModalite;
		aCommeModaliteApplicationModalite = newACommeModaliteApplicationModalite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE, oldACommeModaliteApplicationModalite, newACommeModaliteApplicationModalite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeModaliteApplicationModalite(TypeModalite newACommeModaliteApplicationModalite) {
		if (newACommeModaliteApplicationModalite != aCommeModaliteApplicationModalite) {
			NotificationChain msgs = null;
			if (aCommeModaliteApplicationModalite != null)
				msgs = ((InternalEObject)aCommeModaliteApplicationModalite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE, null, msgs);
			if (newACommeModaliteApplicationModalite != null)
				msgs = ((InternalEObject)newACommeModaliteApplicationModalite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE, null, msgs);
			msgs = basicSetACommeModaliteApplicationModalite(newACommeModaliteApplicationModalite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE, newACommeModaliteApplicationModalite, newACommeModaliteApplicationModalite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeMesureCoordination3DMesureCoordination() {
		return aCommeMesureCoordination3DMesureCoordination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeMesureCoordination3DMesureCoordination(TypeAssociation newACommeMesureCoordination3DMesureCoordination, NotificationChain msgs) {
		TypeAssociation oldACommeMesureCoordination3DMesureCoordination = aCommeMesureCoordination3DMesureCoordination;
		aCommeMesureCoordination3DMesureCoordination = newACommeMesureCoordination3DMesureCoordination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION, oldACommeMesureCoordination3DMesureCoordination, newACommeMesureCoordination3DMesureCoordination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeMesureCoordination3DMesureCoordination(TypeAssociation newACommeMesureCoordination3DMesureCoordination) {
		if (newACommeMesureCoordination3DMesureCoordination != aCommeMesureCoordination3DMesureCoordination) {
			NotificationChain msgs = null;
			if (aCommeMesureCoordination3DMesureCoordination != null)
				msgs = ((InternalEObject)aCommeMesureCoordination3DMesureCoordination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION, null, msgs);
			if (newACommeMesureCoordination3DMesureCoordination != null)
				msgs = ((InternalEObject)newACommeMesureCoordination3DMesureCoordination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION, null, msgs);
			msgs = basicSetACommeMesureCoordination3DMesureCoordination(newACommeMesureCoordination3DMesureCoordination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION, newACommeMesureCoordination3DMesureCoordination, newACommeMesureCoordination3DMesureCoordination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePointEntreePointControle3D() {
		return aCommePointEntreePointControle3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePointEntreePointControle3D(TypeAssociation newACommePointEntreePointControle3D, NotificationChain msgs) {
		TypeAssociation oldACommePointEntreePointControle3D = aCommePointEntreePointControle3D;
		aCommePointEntreePointControle3D = newACommePointEntreePointControle3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D, oldACommePointEntreePointControle3D, newACommePointEntreePointControle3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePointEntreePointControle3D(TypeAssociation newACommePointEntreePointControle3D) {
		if (newACommePointEntreePointControle3D != aCommePointEntreePointControle3D) {
			NotificationChain msgs = null;
			if (aCommePointEntreePointControle3D != null)
				msgs = ((InternalEObject)aCommePointEntreePointControle3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D, null, msgs);
			if (newACommePointEntreePointControle3D != null)
				msgs = ((InternalEObject)newACommePointEntreePointControle3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D, null, msgs);
			msgs = basicSetACommePointEntreePointControle3D(newACommePointEntreePointControle3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D, newACommePointEntreePointControle3D, newACommePointEntreePointControle3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePointSortiePointControle3D() {
		return aCommePointSortiePointControle3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePointSortiePointControle3D(TypeAssociation newACommePointSortiePointControle3D, NotificationChain msgs) {
		TypeAssociation oldACommePointSortiePointControle3D = aCommePointSortiePointControle3D;
		aCommePointSortiePointControle3D = newACommePointSortiePointControle3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D, oldACommePointSortiePointControle3D, newACommePointSortiePointControle3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePointSortiePointControle3D(TypeAssociation newACommePointSortiePointControle3D) {
		if (newACommePointSortiePointControle3D != aCommePointSortiePointControle3D) {
			NotificationChain msgs = null;
			if (aCommePointSortiePointControle3D != null)
				msgs = ((InternalEObject)aCommePointSortiePointControle3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D, null, msgs);
			if (newACommePointSortiePointControle3D != null)
				msgs = ((InternalEObject)newACommePointSortiePointControle3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D, null, msgs);
			msgs = basicSetACommePointSortiePointControle3D(newACommePointSortiePointControle3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D, newACommePointSortiePointControle3D, newACommePointSortiePointControle3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommePointParticulierDeConsignePointControle3D() {
		if (aCommePointParticulierDeConsignePointControle3D == null) {
			aCommePointParticulierDeConsignePointControle3D = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_PARTICULIER_DE_CONSIGNE_POINT_CONTROLE3_D);
		}
		return aCommePointParticulierDeConsignePointControle3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDebutDatation() {
		return aPourDebutDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDebutDatation(TypeDatation newAPourDebutDatation, NotificationChain msgs) {
		TypeDatation oldAPourDebutDatation = aPourDebutDatation;
		aPourDebutDatation = newAPourDebutDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION, oldAPourDebutDatation, newAPourDebutDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDebutDatation(TypeDatation newAPourDebutDatation) {
		if (newAPourDebutDatation != aPourDebutDatation) {
			NotificationChain msgs = null;
			if (aPourDebutDatation != null)
				msgs = ((InternalEObject)aPourDebutDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION, null, msgs);
			if (newAPourDebutDatation != null)
				msgs = ((InternalEObject)newAPourDebutDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION, null, msgs);
			msgs = basicSetAPourDebutDatation(newAPourDebutDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION, newAPourDebutDatation, newAPourDebutDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourFinDatation() {
		return aPourFinDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFinDatation(TypeDatation newAPourFinDatation, NotificationChain msgs) {
		TypeDatation oldAPourFinDatation = aPourFinDatation;
		aPourFinDatation = newAPourFinDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION, oldAPourFinDatation, newAPourFinDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFinDatation(TypeDatation newAPourFinDatation) {
		if (newAPourFinDatation != aPourFinDatation) {
			NotificationChain msgs = null;
			if (aPourFinDatation != null)
				msgs = ((InternalEObject)aPourFinDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION, null, msgs);
			if (newAPourFinDatation != null)
				msgs = ((InternalEObject)newAPourFinDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION, null, msgs);
			msgs = basicSetAPourFinDatation(newAPourFinDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION, newAPourFinDatation, newAPourFinDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE:
				return basicSetACommeConsigneGeographiqueConsigneGeographique(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE__EST_LOCALISE_PAR_ASSOC_CONSIGNE_LOCALISATION:
				return ((InternalEList<?>)getEstLocaliseParAssocConsigneLocalisation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT:
				return basicSetACommeChargementChargement(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_PERIODE_ACTIVATION_PERIODE:
				return ((InternalEList<?>)getACommePeriodeActivationPeriode()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE:
				return basicSetACommeModaliteApplicationModalite(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION:
				return basicSetACommeMesureCoordination3DMesureCoordination(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D:
				return basicSetACommePointEntreePointControle3D(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D:
				return basicSetACommePointSortiePointControle3D(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_PARTICULIER_DE_CONSIGNE_POINT_CONTROLE3_D:
				return ((InternalEList<?>)getACommePointParticulierDeConsignePointControle3D()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION:
				return basicSetAPourDebutDatation(null, msgs);
			case SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION:
				return basicSetAPourFinDatation(null, msgs);
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
			case SchemaPackage.TYPE_CONSIGNE__CODE:
				return getCode();
			case SchemaPackage.TYPE_CONSIGNE__ETAT_DEMANDE_VOLUME:
				return getEtatDemandeVolume();
			case SchemaPackage.TYPE_CONSIGNE__NUMERO_DANS_PHASE:
				return new Long(getNumeroDansPhase());
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE:
				return getACommeConsigneGeographiqueConsigneGeographique();
			case SchemaPackage.TYPE_CONSIGNE__EST_LOCALISE_PAR_ASSOC_CONSIGNE_LOCALISATION:
				return getEstLocaliseParAssocConsigneLocalisation();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT:
				return getACommeChargementChargement();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_PERIODE_ACTIVATION_PERIODE:
				return getACommePeriodeActivationPeriode();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE:
				return getACommeModaliteApplicationModalite();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION:
				return getACommeMesureCoordination3DMesureCoordination();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D:
				return getACommePointEntreePointControle3D();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D:
				return getACommePointSortiePointControle3D();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_PARTICULIER_DE_CONSIGNE_POINT_CONTROLE3_D:
				return getACommePointParticulierDeConsignePointControle3D();
			case SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION:
				return getAPourDebutDatation();
			case SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION:
				return getAPourFinDatation();
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
			case SchemaPackage.TYPE_CONSIGNE__CODE:
				setCode((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ETAT_DEMANDE_VOLUME:
				setEtatDemandeVolume((TypeDictionaryDicoConsigneEtatDemandeVolume)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__NUMERO_DANS_PHASE:
				setNumeroDansPhase(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE:
				setACommeConsigneGeographiqueConsigneGeographique((TypeConsigneGeographique)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__EST_LOCALISE_PAR_ASSOC_CONSIGNE_LOCALISATION:
				getEstLocaliseParAssocConsigneLocalisation().clear();
				getEstLocaliseParAssocConsigneLocalisation().addAll((Collection<? extends TypeAssocConsigneLocalisation>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT:
				setACommeChargementChargement((TypeChargement)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_PERIODE_ACTIVATION_PERIODE:
				getACommePeriodeActivationPeriode().clear();
				getACommePeriodeActivationPeriode().addAll((Collection<? extends TypePeriode>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE:
				setACommeModaliteApplicationModalite((TypeModalite)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION:
				setACommeMesureCoordination3DMesureCoordination((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D:
				setACommePointEntreePointControle3D((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D:
				setACommePointSortiePointControle3D((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_PARTICULIER_DE_CONSIGNE_POINT_CONTROLE3_D:
				getACommePointParticulierDeConsignePointControle3D().clear();
				getACommePointParticulierDeConsignePointControle3D().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION:
				setAPourDebutDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION:
				setAPourFinDatation((TypeDatation)newValue);
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
			case SchemaPackage.TYPE_CONSIGNE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ETAT_DEMANDE_VOLUME:
				unsetEtatDemandeVolume();
				return;
			case SchemaPackage.TYPE_CONSIGNE__NUMERO_DANS_PHASE:
				unsetNumeroDansPhase();
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE:
				setACommeConsigneGeographiqueConsigneGeographique((TypeConsigneGeographique)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE__EST_LOCALISE_PAR_ASSOC_CONSIGNE_LOCALISATION:
				getEstLocaliseParAssocConsigneLocalisation().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT:
				setACommeChargementChargement((TypeChargement)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_PERIODE_ACTIVATION_PERIODE:
				getACommePeriodeActivationPeriode().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE:
				setACommeModaliteApplicationModalite((TypeModalite)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION:
				setACommeMesureCoordination3DMesureCoordination((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D:
				setACommePointEntreePointControle3D((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D:
				setACommePointSortiePointControle3D((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_PARTICULIER_DE_CONSIGNE_POINT_CONTROLE3_D:
				getACommePointParticulierDeConsignePointControle3D().clear();
				return;
			case SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION:
				setAPourDebutDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION:
				setAPourFinDatation((TypeDatation)null);
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
			case SchemaPackage.TYPE_CONSIGNE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case SchemaPackage.TYPE_CONSIGNE__ETAT_DEMANDE_VOLUME:
				return isSetEtatDemandeVolume();
			case SchemaPackage.TYPE_CONSIGNE__NUMERO_DANS_PHASE:
				return isSetNumeroDansPhase();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CONSIGNE_GEOGRAPHIQUE_CONSIGNE_GEOGRAPHIQUE:
				return aCommeConsigneGeographiqueConsigneGeographique != null;
			case SchemaPackage.TYPE_CONSIGNE__EST_LOCALISE_PAR_ASSOC_CONSIGNE_LOCALISATION:
				return estLocaliseParAssocConsigneLocalisation != null && !estLocaliseParAssocConsigneLocalisation.isEmpty();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_CHARGEMENT_CHARGEMENT:
				return aCommeChargementChargement != null;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_PERIODE_ACTIVATION_PERIODE:
				return aCommePeriodeActivationPeriode != null && !aCommePeriodeActivationPeriode.isEmpty();
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MODALITE_APPLICATION_MODALITE:
				return aCommeModaliteApplicationModalite != null;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_MESURE_COORDINATION3_DMESURE_COORDINATION:
				return aCommeMesureCoordination3DMesureCoordination != null;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_ENTREE_POINT_CONTROLE3_D:
				return aCommePointEntreePointControle3D != null;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_SORTIE_POINT_CONTROLE3_D:
				return aCommePointSortiePointControle3D != null;
			case SchemaPackage.TYPE_CONSIGNE__ACOMME_POINT_PARTICULIER_DE_CONSIGNE_POINT_CONTROLE3_D:
				return aCommePointParticulierDeConsignePointControle3D != null && !aCommePointParticulierDeConsignePointControle3D.isEmpty();
			case SchemaPackage.TYPE_CONSIGNE__APOUR_DEBUT_DATATION:
				return aPourDebutDatation != null;
			case SchemaPackage.TYPE_CONSIGNE__APOUR_FIN_DATATION:
				return aPourFinDatation != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", etatDemandeVolume: ");
		if (etatDemandeVolumeESet) result.append(etatDemandeVolume); else result.append("<unset>");
		result.append(", numeroDansPhase: ");
		if (numeroDansPhaseESet) result.append(numeroDansPhase); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeConsigneImpl
