/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMarquageObjectifCouleurSignal;
import mpia.schema.TypeDictionaryDicoMarquageObjectifFormePanneau;
import mpia.schema.TypeDictionaryDicoMarquageObjectifMethode;
import mpia.schema.TypeMarquageObjectif;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Marquage Objectif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMarquageObjectifImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMarquageObjectifImpl#getMethode <em>Methode</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMarquageObjectifImpl#getFormePanneau <em>Forme Panneau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMarquageObjectifImpl#getCouleurSignal <em>Couleur Signal</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMarquageObjectifImpl#getCorrelationLaser <em>Correlation Laser</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMarquageObjectifImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMarquageObjectifImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMarquageObjectifImpl#getEstUtilisateurEntiteOrganisationnelle <em>Est Utilisateur Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMarquageObjectifImpl extends EObjectImpl implements TypeMarquageObjectif {
	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateDebut;

	/**
	 * The default value of the '{@link #getMethode() <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethode()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMarquageObjectifMethode METHODE_EDEFAULT = TypeDictionaryDicoMarquageObjectifMethode.FLR;

	/**
	 * The cached value of the '{@link #getMethode() <em>Methode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethode()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMarquageObjectifMethode methode = METHODE_EDEFAULT;

	/**
	 * This is true if the Methode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodeESet;

	/**
	 * The default value of the '{@link #getFormePanneau() <em>Forme Panneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormePanneau()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMarquageObjectifFormePanneau FORME_PANNEAU_EDEFAULT = TypeDictionaryDicoMarquageObjectifFormePanneau.HSHAPE;

	/**
	 * The cached value of the '{@link #getFormePanneau() <em>Forme Panneau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormePanneau()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMarquageObjectifFormePanneau formePanneau = FORME_PANNEAU_EDEFAULT;

	/**
	 * This is true if the Forme Panneau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formePanneauESet;

	/**
	 * The default value of the '{@link #getCouleurSignal() <em>Couleur Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurSignal()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMarquageObjectifCouleurSignal COULEUR_SIGNAL_EDEFAULT = TypeDictionaryDicoMarquageObjectifCouleurSignal.BLUE;

	/**
	 * The cached value of the '{@link #getCouleurSignal() <em>Couleur Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleurSignal()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMarquageObjectifCouleurSignal couleurSignal = COULEUR_SIGNAL_EDEFAULT;

	/**
	 * This is true if the Couleur Signal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurSignalESet;

	/**
	 * The default value of the '{@link #getCorrelationLaser() <em>Correlation Laser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationLaser()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRELATION_LASER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrelationLaser() <em>Correlation Laser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationLaser()
	 * @generated
	 * @ordered
	 */
	protected String correlationLaser = CORRELATION_LASER_EDEFAULT;

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
	 * The cached value of the '{@link #getEstUtilisateurEntiteOrganisationnelle() <em>Est Utilisateur Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstUtilisateurEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estUtilisateurEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMarquageObjectifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMarquageObjectif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateDebut(TypeDataTypeDateHeure newDateDebut, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT, oldDateDebut, newDateDebut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(TypeDataTypeDateHeure newDateDebut) {
		if (newDateDebut != dateDebut) {
			NotificationChain msgs = null;
			if (dateDebut != null)
				msgs = ((InternalEObject)dateDebut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT, null, msgs);
			if (newDateDebut != null)
				msgs = ((InternalEObject)newDateDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT, null, msgs);
			msgs = basicSetDateDebut(newDateDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT, newDateDebut, newDateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMarquageObjectifMethode getMethode() {
		return methode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethode(TypeDictionaryDicoMarquageObjectifMethode newMethode) {
		TypeDictionaryDicoMarquageObjectifMethode oldMethode = methode;
		methode = newMethode == null ? METHODE_EDEFAULT : newMethode;
		boolean oldMethodeESet = methodeESet;
		methodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__METHODE, oldMethode, methode, !oldMethodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethode() {
		TypeDictionaryDicoMarquageObjectifMethode oldMethode = methode;
		boolean oldMethodeESet = methodeESet;
		methode = METHODE_EDEFAULT;
		methodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__METHODE, oldMethode, METHODE_EDEFAULT, oldMethodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethode() {
		return methodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMarquageObjectifFormePanneau getFormePanneau() {
		return formePanneau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormePanneau(TypeDictionaryDicoMarquageObjectifFormePanneau newFormePanneau) {
		TypeDictionaryDicoMarquageObjectifFormePanneau oldFormePanneau = formePanneau;
		formePanneau = newFormePanneau == null ? FORME_PANNEAU_EDEFAULT : newFormePanneau;
		boolean oldFormePanneauESet = formePanneauESet;
		formePanneauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__FORME_PANNEAU, oldFormePanneau, formePanneau, !oldFormePanneauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormePanneau() {
		TypeDictionaryDicoMarquageObjectifFormePanneau oldFormePanneau = formePanneau;
		boolean oldFormePanneauESet = formePanneauESet;
		formePanneau = FORME_PANNEAU_EDEFAULT;
		formePanneauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__FORME_PANNEAU, oldFormePanneau, FORME_PANNEAU_EDEFAULT, oldFormePanneauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormePanneau() {
		return formePanneauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMarquageObjectifCouleurSignal getCouleurSignal() {
		return couleurSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleurSignal(TypeDictionaryDicoMarquageObjectifCouleurSignal newCouleurSignal) {
		TypeDictionaryDicoMarquageObjectifCouleurSignal oldCouleurSignal = couleurSignal;
		couleurSignal = newCouleurSignal == null ? COULEUR_SIGNAL_EDEFAULT : newCouleurSignal;
		boolean oldCouleurSignalESet = couleurSignalESet;
		couleurSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__COULEUR_SIGNAL, oldCouleurSignal, couleurSignal, !oldCouleurSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleurSignal() {
		TypeDictionaryDicoMarquageObjectifCouleurSignal oldCouleurSignal = couleurSignal;
		boolean oldCouleurSignalESet = couleurSignalESet;
		couleurSignal = COULEUR_SIGNAL_EDEFAULT;
		couleurSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__COULEUR_SIGNAL, oldCouleurSignal, COULEUR_SIGNAL_EDEFAULT, oldCouleurSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleurSignal() {
		return couleurSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrelationLaser() {
		return correlationLaser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationLaser(String newCorrelationLaser) {
		String oldCorrelationLaser = correlationLaser;
		correlationLaser = newCorrelationLaser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CORRELATION_LASER, oldCorrelationLaser, correlationLaser));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstUtilisateurEntiteOrganisationnelle() {
		return estUtilisateurEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstUtilisateurEntiteOrganisationnelle(TypeAssociationEXT newEstUtilisateurEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldEstUtilisateurEntiteOrganisationnelle = estUtilisateurEntiteOrganisationnelle;
		estUtilisateurEntiteOrganisationnelle = newEstUtilisateurEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE, oldEstUtilisateurEntiteOrganisationnelle, newEstUtilisateurEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstUtilisateurEntiteOrganisationnelle(TypeAssociationEXT newEstUtilisateurEntiteOrganisationnelle) {
		if (newEstUtilisateurEntiteOrganisationnelle != estUtilisateurEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (estUtilisateurEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)estUtilisateurEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newEstUtilisateurEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newEstUtilisateurEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetEstUtilisateurEntiteOrganisationnelle(newEstUtilisateurEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE, newEstUtilisateurEntiteOrganisationnelle, newEstUtilisateurEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT:
				return basicSetDateDebut(null, msgs);
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE:
				return basicSetEstUtilisateurEntiteOrganisationnelle(null, msgs);
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
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__METHODE:
				return getMethode();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__FORME_PANNEAU:
				return getFormePanneau();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__COULEUR_SIGNAL:
				return getCouleurSignal();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CORRELATION_LASER:
				return getCorrelationLaser();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CE:
				return getCE();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE:
				return getEstUtilisateurEntiteOrganisationnelle();
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
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__METHODE:
				setMethode((TypeDictionaryDicoMarquageObjectifMethode)newValue);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__FORME_PANNEAU:
				setFormePanneau((TypeDictionaryDicoMarquageObjectifFormePanneau)newValue);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__COULEUR_SIGNAL:
				setCouleurSignal((TypeDictionaryDicoMarquageObjectifCouleurSignal)newValue);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CORRELATION_LASER:
				setCorrelationLaser((String)newValue);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE:
				setEstUtilisateurEntiteOrganisationnelle((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__METHODE:
				unsetMethode();
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__FORME_PANNEAU:
				unsetFormePanneau();
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__COULEUR_SIGNAL:
				unsetCouleurSignal();
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CORRELATION_LASER:
				setCorrelationLaser(CORRELATION_LASER_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE:
				setEstUtilisateurEntiteOrganisationnelle((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__DATE_DEBUT:
				return dateDebut != null;
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__METHODE:
				return isSetMethode();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__FORME_PANNEAU:
				return isSetFormePanneau();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__COULEUR_SIGNAL:
				return isSetCouleurSignal();
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CORRELATION_LASER:
				return CORRELATION_LASER_EDEFAULT == null ? correlationLaser != null : !CORRELATION_LASER_EDEFAULT.equals(correlationLaser);
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MARQUAGE_OBJECTIF__EST_UTILISATEUR_ENTITE_ORGANISATIONNELLE:
				return estUtilisateurEntiteOrganisationnelle != null;
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
		result.append(" (methode: ");
		if (methodeESet) result.append(methode); else result.append("<unset>");
		result.append(", formePanneau: ");
		if (formePanneauESet) result.append(formePanneau); else result.append("<unset>");
		result.append(", couleurSignal: ");
		if (couleurSignalESet) result.append(couleurSignal); else result.append("<unset>");
		result.append(", correlationLaser: ");
		result.append(correlationLaser);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMarquageObjectifImpl
