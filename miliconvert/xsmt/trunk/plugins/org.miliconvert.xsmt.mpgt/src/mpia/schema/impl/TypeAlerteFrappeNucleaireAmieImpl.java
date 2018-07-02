/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAlerteFrappeNucleaireAmie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Alerte Frappe Nucleaire Amie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAlerteFrappeNucleaireAmieImpl#getNomCible <em>Nom Cible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAlerteFrappeNucleaireAmieImpl#getNumeroCible <em>Numero Cible</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAlerteFrappeNucleaireAmieImpl#getGDHfrappe <em>GD Hfrappe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAlerteFrappeNucleaireAmieImpl#getGDHannulationFrappe <em>GD Hannulation Frappe</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAlerteFrappeNucleaireAmieImpl#getNbExplosionsEnSurface <em>Nb Explosions En Surface</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAlerteFrappeNucleaireAmieImpl#getNbExplosionsFrappeMultiple <em>Nb Explosions Frappe Multiple</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAlerteFrappeNucleaireAmieImpl#getDistanceMinimaleSecurite1 <em>Distance Minimale Securite1</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAlerteFrappeNucleaireAmieImpl#getDistanceMinimaleSecurite2 <em>Distance Minimale Securite2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAlerteFrappeNucleaireAmieImpl extends TypeEvenementImpl implements TypeAlerteFrappeNucleaireAmie {
	/**
	 * The default value of the '{@link #getNomCible() <em>Nom Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCible()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_CIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomCible() <em>Nom Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCible()
	 * @generated
	 * @ordered
	 */
	protected String nomCible = NOM_CIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroCible() <em>Numero Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroCible()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_CIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroCible() <em>Numero Cible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroCible()
	 * @generated
	 * @ordered
	 */
	protected String numeroCible = NUMERO_CIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHfrappe() <em>GD Hfrappe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfrappe()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HFRAPPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHfrappe() <em>GD Hfrappe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHfrappe()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHfrappe = GD_HFRAPPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHannulationFrappe() <em>GD Hannulation Frappe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHannulationFrappe()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HANNULATION_FRAPPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHannulationFrappe() <em>GD Hannulation Frappe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHannulationFrappe()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHannulationFrappe = GD_HANNULATION_FRAPPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbExplosionsEnSurface() <em>Nb Explosions En Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbExplosionsEnSurface()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_EXPLOSIONS_EN_SURFACE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbExplosionsEnSurface() <em>Nb Explosions En Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbExplosionsEnSurface()
	 * @generated
	 * @ordered
	 */
	protected long nbExplosionsEnSurface = NB_EXPLOSIONS_EN_SURFACE_EDEFAULT;

	/**
	 * This is true if the Nb Explosions En Surface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbExplosionsEnSurfaceESet;

	/**
	 * The default value of the '{@link #getNbExplosionsFrappeMultiple() <em>Nb Explosions Frappe Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbExplosionsFrappeMultiple()
	 * @generated
	 * @ordered
	 */
	protected static final long NB_EXPLOSIONS_FRAPPE_MULTIPLE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNbExplosionsFrappeMultiple() <em>Nb Explosions Frappe Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbExplosionsFrappeMultiple()
	 * @generated
	 * @ordered
	 */
	protected long nbExplosionsFrappeMultiple = NB_EXPLOSIONS_FRAPPE_MULTIPLE_EDEFAULT;

	/**
	 * This is true if the Nb Explosions Frappe Multiple attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nbExplosionsFrappeMultipleESet;

	/**
	 * The cached value of the '{@link #getDistanceMinimaleSecurite1() <em>Distance Minimale Securite1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceMinimaleSecurite1()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceMinimaleSecurite1;

	/**
	 * The cached value of the '{@link #getDistanceMinimaleSecurite2() <em>Distance Minimale Securite2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceMinimaleSecurite2()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur distanceMinimaleSecurite2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAlerteFrappeNucleaireAmieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAlerteFrappeNucleaireAmie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomCible() {
		return nomCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomCible(String newNomCible) {
		String oldNomCible = nomCible;
		nomCible = newNomCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NOM_CIBLE, oldNomCible, nomCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroCible() {
		return numeroCible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroCible(String newNumeroCible) {
		String oldNumeroCible = numeroCible;
		numeroCible = newNumeroCible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NUMERO_CIBLE, oldNumeroCible, numeroCible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHfrappe() {
		return gDHfrappe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHfrappe(XMLGregorianCalendar newGDHfrappe) {
		XMLGregorianCalendar oldGDHfrappe = gDHfrappe;
		gDHfrappe = newGDHfrappe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HFRAPPE, oldGDHfrappe, gDHfrappe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHannulationFrappe() {
		return gDHannulationFrappe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHannulationFrappe(XMLGregorianCalendar newGDHannulationFrappe) {
		XMLGregorianCalendar oldGDHannulationFrappe = gDHannulationFrappe;
		gDHannulationFrappe = newGDHannulationFrappe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HANNULATION_FRAPPE, oldGDHannulationFrappe, gDHannulationFrappe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbExplosionsEnSurface() {
		return nbExplosionsEnSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbExplosionsEnSurface(long newNbExplosionsEnSurface) {
		long oldNbExplosionsEnSurface = nbExplosionsEnSurface;
		nbExplosionsEnSurface = newNbExplosionsEnSurface;
		boolean oldNbExplosionsEnSurfaceESet = nbExplosionsEnSurfaceESet;
		nbExplosionsEnSurfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_EN_SURFACE, oldNbExplosionsEnSurface, nbExplosionsEnSurface, !oldNbExplosionsEnSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbExplosionsEnSurface() {
		long oldNbExplosionsEnSurface = nbExplosionsEnSurface;
		boolean oldNbExplosionsEnSurfaceESet = nbExplosionsEnSurfaceESet;
		nbExplosionsEnSurface = NB_EXPLOSIONS_EN_SURFACE_EDEFAULT;
		nbExplosionsEnSurfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_EN_SURFACE, oldNbExplosionsEnSurface, NB_EXPLOSIONS_EN_SURFACE_EDEFAULT, oldNbExplosionsEnSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbExplosionsEnSurface() {
		return nbExplosionsEnSurfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNbExplosionsFrappeMultiple() {
		return nbExplosionsFrappeMultiple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbExplosionsFrappeMultiple(long newNbExplosionsFrappeMultiple) {
		long oldNbExplosionsFrappeMultiple = nbExplosionsFrappeMultiple;
		nbExplosionsFrappeMultiple = newNbExplosionsFrappeMultiple;
		boolean oldNbExplosionsFrappeMultipleESet = nbExplosionsFrappeMultipleESet;
		nbExplosionsFrappeMultipleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_FRAPPE_MULTIPLE, oldNbExplosionsFrappeMultiple, nbExplosionsFrappeMultiple, !oldNbExplosionsFrappeMultipleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNbExplosionsFrappeMultiple() {
		long oldNbExplosionsFrappeMultiple = nbExplosionsFrappeMultiple;
		boolean oldNbExplosionsFrappeMultipleESet = nbExplosionsFrappeMultipleESet;
		nbExplosionsFrappeMultiple = NB_EXPLOSIONS_FRAPPE_MULTIPLE_EDEFAULT;
		nbExplosionsFrappeMultipleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_FRAPPE_MULTIPLE, oldNbExplosionsFrappeMultiple, NB_EXPLOSIONS_FRAPPE_MULTIPLE_EDEFAULT, oldNbExplosionsFrappeMultipleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNbExplosionsFrappeMultiple() {
		return nbExplosionsFrappeMultipleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceMinimaleSecurite1() {
		return distanceMinimaleSecurite1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceMinimaleSecurite1(TypeDataTypeLongueur newDistanceMinimaleSecurite1, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceMinimaleSecurite1 = distanceMinimaleSecurite1;
		distanceMinimaleSecurite1 = newDistanceMinimaleSecurite1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1, oldDistanceMinimaleSecurite1, newDistanceMinimaleSecurite1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceMinimaleSecurite1(TypeDataTypeLongueur newDistanceMinimaleSecurite1) {
		if (newDistanceMinimaleSecurite1 != distanceMinimaleSecurite1) {
			NotificationChain msgs = null;
			if (distanceMinimaleSecurite1 != null)
				msgs = ((InternalEObject)distanceMinimaleSecurite1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1, null, msgs);
			if (newDistanceMinimaleSecurite1 != null)
				msgs = ((InternalEObject)newDistanceMinimaleSecurite1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1, null, msgs);
			msgs = basicSetDistanceMinimaleSecurite1(newDistanceMinimaleSecurite1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1, newDistanceMinimaleSecurite1, newDistanceMinimaleSecurite1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getDistanceMinimaleSecurite2() {
		return distanceMinimaleSecurite2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistanceMinimaleSecurite2(TypeDataTypeLongueur newDistanceMinimaleSecurite2, NotificationChain msgs) {
		TypeDataTypeLongueur oldDistanceMinimaleSecurite2 = distanceMinimaleSecurite2;
		distanceMinimaleSecurite2 = newDistanceMinimaleSecurite2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2, oldDistanceMinimaleSecurite2, newDistanceMinimaleSecurite2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceMinimaleSecurite2(TypeDataTypeLongueur newDistanceMinimaleSecurite2) {
		if (newDistanceMinimaleSecurite2 != distanceMinimaleSecurite2) {
			NotificationChain msgs = null;
			if (distanceMinimaleSecurite2 != null)
				msgs = ((InternalEObject)distanceMinimaleSecurite2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2, null, msgs);
			if (newDistanceMinimaleSecurite2 != null)
				msgs = ((InternalEObject)newDistanceMinimaleSecurite2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2, null, msgs);
			msgs = basicSetDistanceMinimaleSecurite2(newDistanceMinimaleSecurite2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2, newDistanceMinimaleSecurite2, newDistanceMinimaleSecurite2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1:
				return basicSetDistanceMinimaleSecurite1(null, msgs);
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2:
				return basicSetDistanceMinimaleSecurite2(null, msgs);
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
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NOM_CIBLE:
				return getNomCible();
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NUMERO_CIBLE:
				return getNumeroCible();
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HFRAPPE:
				return getGDHfrappe();
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HANNULATION_FRAPPE:
				return getGDHannulationFrappe();
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_EN_SURFACE:
				return new Long(getNbExplosionsEnSurface());
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_FRAPPE_MULTIPLE:
				return new Long(getNbExplosionsFrappeMultiple());
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1:
				return getDistanceMinimaleSecurite1();
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2:
				return getDistanceMinimaleSecurite2();
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
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NOM_CIBLE:
				setNomCible((String)newValue);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NUMERO_CIBLE:
				setNumeroCible((String)newValue);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HFRAPPE:
				setGDHfrappe((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HANNULATION_FRAPPE:
				setGDHannulationFrappe((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_EN_SURFACE:
				setNbExplosionsEnSurface(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_FRAPPE_MULTIPLE:
				setNbExplosionsFrappeMultiple(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1:
				setDistanceMinimaleSecurite1((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2:
				setDistanceMinimaleSecurite2((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NOM_CIBLE:
				setNomCible(NOM_CIBLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NUMERO_CIBLE:
				setNumeroCible(NUMERO_CIBLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HFRAPPE:
				setGDHfrappe(GD_HFRAPPE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HANNULATION_FRAPPE:
				setGDHannulationFrappe(GD_HANNULATION_FRAPPE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_EN_SURFACE:
				unsetNbExplosionsEnSurface();
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_FRAPPE_MULTIPLE:
				unsetNbExplosionsFrappeMultiple();
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1:
				setDistanceMinimaleSecurite1((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2:
				setDistanceMinimaleSecurite2((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NOM_CIBLE:
				return NOM_CIBLE_EDEFAULT == null ? nomCible != null : !NOM_CIBLE_EDEFAULT.equals(nomCible);
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NUMERO_CIBLE:
				return NUMERO_CIBLE_EDEFAULT == null ? numeroCible != null : !NUMERO_CIBLE_EDEFAULT.equals(numeroCible);
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HFRAPPE:
				return GD_HFRAPPE_EDEFAULT == null ? gDHfrappe != null : !GD_HFRAPPE_EDEFAULT.equals(gDHfrappe);
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__GD_HANNULATION_FRAPPE:
				return GD_HANNULATION_FRAPPE_EDEFAULT == null ? gDHannulationFrappe != null : !GD_HANNULATION_FRAPPE_EDEFAULT.equals(gDHannulationFrappe);
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_EN_SURFACE:
				return isSetNbExplosionsEnSurface();
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__NB_EXPLOSIONS_FRAPPE_MULTIPLE:
				return isSetNbExplosionsFrappeMultiple();
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE1:
				return distanceMinimaleSecurite1 != null;
			case SchemaPackage.TYPE_ALERTE_FRAPPE_NUCLEAIRE_AMIE__DISTANCE_MINIMALE_SECURITE2:
				return distanceMinimaleSecurite2 != null;
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
		result.append(" (nomCible: ");
		result.append(nomCible);
		result.append(", numeroCible: ");
		result.append(numeroCible);
		result.append(", gDHfrappe: ");
		result.append(gDHfrappe);
		result.append(", gDHannulationFrappe: ");
		result.append(gDHannulationFrappe);
		result.append(", nbExplosionsEnSurface: ");
		if (nbExplosionsEnSurfaceESet) result.append(nbExplosionsEnSurface); else result.append("<unset>");
		result.append(", nbExplosionsFrappeMultiple: ");
		if (nbExplosionsFrappeMultipleESet) result.append(nbExplosionsFrappeMultiple); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAlerteFrappeNucleaireAmieImpl
