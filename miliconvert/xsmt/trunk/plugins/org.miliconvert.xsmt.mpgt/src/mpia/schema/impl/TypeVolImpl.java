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
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeVol;

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
 * An implementation of the model object '<em><b>Type Vol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVolImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolImpl#getDureeVol <em>Duree Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolImpl#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolImpl#getConsommationTotale <em>Consommation Totale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolImpl#getEstVolLeaderModule <em>Est Vol Leader Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolImpl#getACommePointTrajectoirePointTrajectoire <em>AComme Point Trajectoire Point Trajectoire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolImpl#getACommeBrancheNavigationBrancheNavigation <em>AComme Branche Navigation Branche Navigation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVolImpl extends TypeRacineOperationnelleImpl implements TypeVol {
	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeVol() <em>Duree Vol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeVol()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeVol;

	/**
	 * The default value of the '{@link #getHauteur() <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected static final double HAUTEUR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHauteur() <em>Hauteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected double hauteur = HAUTEUR_EDEFAULT;

	/**
	 * This is true if the Hauteur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hauteurESet;

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
	 * The cached value of the '{@link #getConsommationTotale() <em>Consommation Totale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsommationTotale()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume consommationTotale;

	/**
	 * The cached value of the '{@link #getEstVolLeaderModule() <em>Est Vol Leader Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstVolLeaderModule()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estVolLeaderModule;

	/**
	 * The cached value of the '{@link #getACommePointTrajectoirePointTrajectoire() <em>AComme Point Trajectoire Point Trajectoire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointTrajectoirePointTrajectoire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommePointTrajectoirePointTrajectoire;

	/**
	 * The cached value of the '{@link #getACommeBrancheNavigationBrancheNavigation() <em>AComme Branche Navigation Branche Navigation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeBrancheNavigationBrancheNavigation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeBrancheNavigationBrancheNavigation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVol();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeVol() {
		return dureeVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeVol(TypeDataTypeDuree newDureeVol, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeVol = dureeVol;
		dureeVol = newDureeVol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__DUREE_VOL, oldDureeVol, newDureeVol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeVol(TypeDataTypeDuree newDureeVol) {
		if (newDureeVol != dureeVol) {
			NotificationChain msgs = null;
			if (dureeVol != null)
				msgs = ((InternalEObject)dureeVol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOL__DUREE_VOL, null, msgs);
			if (newDureeVol != null)
				msgs = ((InternalEObject)newDureeVol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOL__DUREE_VOL, null, msgs);
			msgs = basicSetDureeVol(newDureeVol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__DUREE_VOL, newDureeVol, newDureeVol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHauteur() {
		return hauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteur(double newHauteur) {
		double oldHauteur = hauteur;
		hauteur = newHauteur;
		boolean oldHauteurESet = hauteurESet;
		hauteurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__HAUTEUR, oldHauteur, hauteur, !oldHauteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHauteur() {
		double oldHauteur = hauteur;
		boolean oldHauteurESet = hauteurESet;
		hauteur = HAUTEUR_EDEFAULT;
		hauteurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_VOL__HAUTEUR, oldHauteur, HAUTEUR_EDEFAULT, oldHauteurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHauteur() {
		return hauteurESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__VITESSE, oldVitesse, newVitesse);
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
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOL__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOL__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getConsommationTotale() {
		return consommationTotale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsommationTotale(TypeDataTypeVolume newConsommationTotale, NotificationChain msgs) {
		TypeDataTypeVolume oldConsommationTotale = consommationTotale;
		consommationTotale = newConsommationTotale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE, oldConsommationTotale, newConsommationTotale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsommationTotale(TypeDataTypeVolume newConsommationTotale) {
		if (newConsommationTotale != consommationTotale) {
			NotificationChain msgs = null;
			if (consommationTotale != null)
				msgs = ((InternalEObject)consommationTotale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE, null, msgs);
			if (newConsommationTotale != null)
				msgs = ((InternalEObject)newConsommationTotale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE, null, msgs);
			msgs = basicSetConsommationTotale(newConsommationTotale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE, newConsommationTotale, newConsommationTotale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstVolLeaderModule() {
		return estVolLeaderModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstVolLeaderModule(TypeAssociation newEstVolLeaderModule, NotificationChain msgs) {
		TypeAssociation oldEstVolLeaderModule = estVolLeaderModule;
		estVolLeaderModule = newEstVolLeaderModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE, oldEstVolLeaderModule, newEstVolLeaderModule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstVolLeaderModule(TypeAssociation newEstVolLeaderModule) {
		if (newEstVolLeaderModule != estVolLeaderModule) {
			NotificationChain msgs = null;
			if (estVolLeaderModule != null)
				msgs = ((InternalEObject)estVolLeaderModule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE, null, msgs);
			if (newEstVolLeaderModule != null)
				msgs = ((InternalEObject)newEstVolLeaderModule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE, null, msgs);
			msgs = basicSetEstVolLeaderModule(newEstVolLeaderModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE, newEstVolLeaderModule, newEstVolLeaderModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommePointTrajectoirePointTrajectoire() {
		if (aCommePointTrajectoirePointTrajectoire == null) {
			aCommePointTrajectoirePointTrajectoire = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_VOL__ACOMME_POINT_TRAJECTOIRE_POINT_TRAJECTOIRE);
		}
		return aCommePointTrajectoirePointTrajectoire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeBrancheNavigationBrancheNavigation() {
		if (aCommeBrancheNavigationBrancheNavigation == null) {
			aCommeBrancheNavigationBrancheNavigation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_VOL__ACOMME_BRANCHE_NAVIGATION_BRANCHE_NAVIGATION);
		}
		return aCommeBrancheNavigationBrancheNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VOL__DUREE_VOL:
				return basicSetDureeVol(null, msgs);
			case SchemaPackage.TYPE_VOL__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE:
				return basicSetConsommationTotale(null, msgs);
			case SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE:
				return basicSetEstVolLeaderModule(null, msgs);
			case SchemaPackage.TYPE_VOL__ACOMME_POINT_TRAJECTOIRE_POINT_TRAJECTOIRE:
				return ((InternalEList<?>)getACommePointTrajectoirePointTrajectoire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_VOL__ACOMME_BRANCHE_NAVIGATION_BRANCHE_NAVIGATION:
				return ((InternalEList<?>)getACommeBrancheNavigationBrancheNavigation()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_VOL__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_VOL__DUREE_VOL:
				return getDureeVol();
			case SchemaPackage.TYPE_VOL__HAUTEUR:
				return new Double(getHauteur());
			case SchemaPackage.TYPE_VOL__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE:
				return getConsommationTotale();
			case SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE:
				return getEstVolLeaderModule();
			case SchemaPackage.TYPE_VOL__ACOMME_POINT_TRAJECTOIRE_POINT_TRAJECTOIRE:
				return getACommePointTrajectoirePointTrajectoire();
			case SchemaPackage.TYPE_VOL__ACOMME_BRANCHE_NAVIGATION_BRANCHE_NAVIGATION:
				return getACommeBrancheNavigationBrancheNavigation();
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
			case SchemaPackage.TYPE_VOL__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_VOL__DUREE_VOL:
				setDureeVol((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_VOL__HAUTEUR:
				setHauteur(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_VOL__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE:
				setConsommationTotale((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE:
				setEstVolLeaderModule((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_VOL__ACOMME_POINT_TRAJECTOIRE_POINT_TRAJECTOIRE:
				getACommePointTrajectoirePointTrajectoire().clear();
				getACommePointTrajectoirePointTrajectoire().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_VOL__ACOMME_BRANCHE_NAVIGATION_BRANCHE_NAVIGATION:
				getACommeBrancheNavigationBrancheNavigation().clear();
				getACommeBrancheNavigationBrancheNavigation().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_VOL__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VOL__DUREE_VOL:
				setDureeVol((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_VOL__HAUTEUR:
				unsetHauteur();
				return;
			case SchemaPackage.TYPE_VOL__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE:
				setConsommationTotale((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE:
				setEstVolLeaderModule((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_VOL__ACOMME_POINT_TRAJECTOIRE_POINT_TRAJECTOIRE:
				getACommePointTrajectoirePointTrajectoire().clear();
				return;
			case SchemaPackage.TYPE_VOL__ACOMME_BRANCHE_NAVIGATION_BRANCHE_NAVIGATION:
				getACommeBrancheNavigationBrancheNavigation().clear();
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
			case SchemaPackage.TYPE_VOL__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_VOL__DUREE_VOL:
				return dureeVol != null;
			case SchemaPackage.TYPE_VOL__HAUTEUR:
				return isSetHauteur();
			case SchemaPackage.TYPE_VOL__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_VOL__CONSOMMATION_TOTALE:
				return consommationTotale != null;
			case SchemaPackage.TYPE_VOL__EST_VOL_LEADER_MODULE:
				return estVolLeaderModule != null;
			case SchemaPackage.TYPE_VOL__ACOMME_POINT_TRAJECTOIRE_POINT_TRAJECTOIRE:
				return aCommePointTrajectoirePointTrajectoire != null && !aCommePointTrajectoirePointTrajectoire.isEmpty();
			case SchemaPackage.TYPE_VOL__ACOMME_BRANCHE_NAVIGATION_BRANCHE_NAVIGATION:
				return aCommeBrancheNavigationBrancheNavigation != null && !aCommeBrancheNavigationBrancheNavigation.isEmpty();
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
		result.append(" (dateDebut: ");
		result.append(dateDebut);
		result.append(", hauteur: ");
		if (hauteurESet) result.append(hauteur); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeVolImpl
