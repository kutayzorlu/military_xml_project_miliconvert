/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationObjectifActiviteLocalisation;
import mpia.schema.TypeLocalisation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Objectif Activite Localisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getAngleMouvement <em>Angle Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getPlafondBandeAlt <em>Plafond Bande Alt</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getPlancherBandeAlt <em>Plancher Bande Alt</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getPrecisionHoriz <em>Precision Horiz</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getPrecisionVerticale <em>Precision Verticale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationObjectifActiviteLocalisationImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationObjectifActiviteLocalisationImpl extends EObjectImpl implements TypeAssociationObjectifActiviteLocalisation {
	/**
	 * The cached value of the '{@link #getAngleMouvement() <em>Angle Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleMouvement;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

	/**
	 * The cached value of the '{@link #getPlafondBandeAlt() <em>Plafond Bande Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlafondBandeAlt()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur plafondBandeAlt;

	/**
	 * The cached value of the '{@link #getPlancherBandeAlt() <em>Plancher Bande Alt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlancherBandeAlt()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur plancherBandeAlt;

	/**
	 * The default value of the '{@link #getPrecisionHoriz() <em>Precision Horiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionHoriz()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECISION_HORIZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecisionHoriz() <em>Precision Horiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionHoriz()
	 * @generated
	 * @ordered
	 */
	protected double precisionHoriz = PRECISION_HORIZ_EDEFAULT;

	/**
	 * This is true if the Precision Horiz attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionHorizESet;

	/**
	 * The default value of the '{@link #getPrecisionVerticale() <em>Precision Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionVerticale()
	 * @generated
	 * @ordered
	 */
	protected static final double PRECISION_VERTICALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrecisionVerticale() <em>Precision Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionVerticale()
	 * @generated
	 * @ordered
	 */
	protected double precisionVerticale = PRECISION_VERTICALE_EDEFAULT;

	/**
	 * This is true if the Precision Verticale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionVerticaleESet;

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
	 * The cached value of the '{@link #getEstLocaliseEnLocalisation() <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseEnLocalisation;

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
	protected TypeAssociationObjectifActiviteLocalisationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationObjectifActiviteLocalisation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleMouvement() {
		return angleMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleMouvement(TypeDataTypeAngle newAngleMouvement, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleMouvement = angleMouvement;
		angleMouvement = newAngleMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT, oldAngleMouvement, newAngleMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleMouvement(TypeDataTypeAngle newAngleMouvement) {
		if (newAngleMouvement != angleMouvement) {
			NotificationChain msgs = null;
			if (angleMouvement != null)
				msgs = ((InternalEObject)angleMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT, null, msgs);
			if (newAngleMouvement != null)
				msgs = ((InternalEObject)newAngleMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT, null, msgs);
			msgs = basicSetAngleMouvement(newAngleMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT, newAngleMouvement, newAngleMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPlafondBandeAlt() {
		return plafondBandeAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlafondBandeAlt(TypeDataTypeLongueur newPlafondBandeAlt, NotificationChain msgs) {
		TypeDataTypeLongueur oldPlafondBandeAlt = plafondBandeAlt;
		plafondBandeAlt = newPlafondBandeAlt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT, oldPlafondBandeAlt, newPlafondBandeAlt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlafondBandeAlt(TypeDataTypeLongueur newPlafondBandeAlt) {
		if (newPlafondBandeAlt != plafondBandeAlt) {
			NotificationChain msgs = null;
			if (plafondBandeAlt != null)
				msgs = ((InternalEObject)plafondBandeAlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT, null, msgs);
			if (newPlafondBandeAlt != null)
				msgs = ((InternalEObject)newPlafondBandeAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT, null, msgs);
			msgs = basicSetPlafondBandeAlt(newPlafondBandeAlt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT, newPlafondBandeAlt, newPlafondBandeAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPlancherBandeAlt() {
		return plancherBandeAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlancherBandeAlt(TypeDataTypeLongueur newPlancherBandeAlt, NotificationChain msgs) {
		TypeDataTypeLongueur oldPlancherBandeAlt = plancherBandeAlt;
		plancherBandeAlt = newPlancherBandeAlt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT, oldPlancherBandeAlt, newPlancherBandeAlt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlancherBandeAlt(TypeDataTypeLongueur newPlancherBandeAlt) {
		if (newPlancherBandeAlt != plancherBandeAlt) {
			NotificationChain msgs = null;
			if (plancherBandeAlt != null)
				msgs = ((InternalEObject)plancherBandeAlt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT, null, msgs);
			if (newPlancherBandeAlt != null)
				msgs = ((InternalEObject)newPlancherBandeAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT, null, msgs);
			msgs = basicSetPlancherBandeAlt(newPlancherBandeAlt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT, newPlancherBandeAlt, newPlancherBandeAlt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecisionHoriz() {
		return precisionHoriz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionHoriz(double newPrecisionHoriz) {
		double oldPrecisionHoriz = precisionHoriz;
		precisionHoriz = newPrecisionHoriz;
		boolean oldPrecisionHorizESet = precisionHorizESet;
		precisionHorizESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_HORIZ, oldPrecisionHoriz, precisionHoriz, !oldPrecisionHorizESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionHoriz() {
		double oldPrecisionHoriz = precisionHoriz;
		boolean oldPrecisionHorizESet = precisionHorizESet;
		precisionHoriz = PRECISION_HORIZ_EDEFAULT;
		precisionHorizESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_HORIZ, oldPrecisionHoriz, PRECISION_HORIZ_EDEFAULT, oldPrecisionHorizESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionHoriz() {
		return precisionHorizESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrecisionVerticale() {
		return precisionVerticale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionVerticale(double newPrecisionVerticale) {
		double oldPrecisionVerticale = precisionVerticale;
		precisionVerticale = newPrecisionVerticale;
		boolean oldPrecisionVerticaleESet = precisionVerticaleESet;
		precisionVerticaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_VERTICALE, oldPrecisionVerticale, precisionVerticale, !oldPrecisionVerticaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionVerticale() {
		double oldPrecisionVerticale = precisionVerticale;
		boolean oldPrecisionVerticaleESet = precisionVerticaleESet;
		precisionVerticale = PRECISION_VERTICALE_EDEFAULT;
		precisionVerticaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_VERTICALE, oldPrecisionVerticale, PRECISION_VERTICALE_EDEFAULT, oldPrecisionVerticaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionVerticale() {
		return precisionVerticaleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseEnLocalisation() {
		return estLocaliseEnLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseEnLocalisation = estLocaliseEnLocalisation;
		estLocaliseEnLocalisation = newEstLocaliseEnLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, oldEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation) {
		if (newEstLocaliseEnLocalisation != estLocaliseEnLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)estLocaliseEnLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			if (newEstLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisation(newEstLocaliseEnLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION, newEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
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
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				return basicSetAngleMouvement(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT:
				return basicSetPlafondBandeAlt(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT:
				return basicSetPlancherBandeAlt(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return basicSetEstLocaliseEnLocalisation(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				return getAngleMouvement();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT:
				return getPlafondBandeAlt();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT:
				return getPlancherBandeAlt();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_HORIZ:
				return new Double(getPrecisionHoriz());
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_VERTICALE:
				return new Double(getPrecisionVerticale());
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return getEstLocaliseEnLocalisation();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				setAngleMouvement((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT:
				setPlafondBandeAlt((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT:
				setPlancherBandeAlt((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_HORIZ:
				setPrecisionHoriz(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_VERTICALE:
				setPrecisionVerticale(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				setAngleMouvement((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT:
				setPlafondBandeAlt((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT:
				setPlancherBandeAlt((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_HORIZ:
				unsetPrecisionHoriz();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_VERTICALE:
				unsetPrecisionVerticale();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__ANGLE_MOUVEMENT:
				return angleMouvement != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLAFOND_BANDE_ALT:
				return plafondBandeAlt != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PLANCHER_BANDE_ALT:
				return plancherBandeAlt != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_HORIZ:
				return isSetPrecisionHoriz();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__PRECISION_VERTICALE:
				return isSetPrecisionVerticale();
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_LOCALISE_EN_LOCALISATION:
				return estLocaliseEnLocalisation != null;
			case SchemaPackage.TYPE_ASSOCIATION_OBJECTIF_ACTIVITE_LOCALISATION__EST_RAPPORTEE_PAR_RAPPORT:
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
		result.append(" (precisionHoriz: ");
		if (precisionHorizESet) result.append(precisionHoriz); else result.append("<unset>");
		result.append(", precisionVerticale: ");
		if (precisionVerticaleESet) result.append(precisionVerticale); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationObjectifActiviteLocalisationImpl
