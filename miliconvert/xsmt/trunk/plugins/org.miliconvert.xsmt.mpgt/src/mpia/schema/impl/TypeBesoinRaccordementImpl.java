/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBesoinRaccordement;

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
 * An implementation of the model object '<em><b>Type Besoin Raccordement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBesoinRaccordementImpl#getBesoinLiaison <em>Besoin Liaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinRaccordementImpl#getNatureLiaison <em>Nature Liaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinRaccordementImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinRaccordementImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinRaccordementImpl#getMoyens <em>Moyens</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBesoinRaccordementImpl#getAPourUniteRaccordeUnite <em>APour Unite Raccorde Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBesoinRaccordementImpl extends EObjectImpl implements TypeBesoinRaccordement {
	/**
	 * The default value of the '{@link #getBesoinLiaison() <em>Besoin Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesoinLiaison()
	 * @generated
	 * @ordered
	 */
	protected static final String BESOIN_LIAISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBesoinLiaison() <em>Besoin Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesoinLiaison()
	 * @generated
	 * @ordered
	 */
	protected String besoinLiaison = BESOIN_LIAISON_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatureLiaison() <em>Nature Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureLiaison()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_LIAISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNatureLiaison() <em>Nature Liaison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureLiaison()
	 * @generated
	 * @ordered
	 */
	protected String natureLiaison = NATURE_LIAISON_EDEFAULT;

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
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateFin;

	/**
	 * The default value of the '{@link #getMoyens() <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyens()
	 * @generated
	 * @ordered
	 */
	protected static final String MOYENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoyens() <em>Moyens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoyens()
	 * @generated
	 * @ordered
	 */
	protected String moyens = MOYENS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourUniteRaccordeUnite() <em>APour Unite Raccorde Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRaccordeUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUniteRaccordeUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBesoinRaccordementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBesoinRaccordement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBesoinLiaison() {
		return besoinLiaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBesoinLiaison(String newBesoinLiaison) {
		String oldBesoinLiaison = besoinLiaison;
		besoinLiaison = newBesoinLiaison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_RACCORDEMENT__BESOIN_LIAISON, oldBesoinLiaison, besoinLiaison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNatureLiaison() {
		return natureLiaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureLiaison(String newNatureLiaison) {
		String oldNatureLiaison = natureLiaison;
		natureLiaison = newNatureLiaison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_RACCORDEMENT__NATURE_LIAISON, oldNatureLiaison, natureLiaison));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT, oldDateDebut, newDateDebut);
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
				msgs = ((InternalEObject)dateDebut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT, null, msgs);
			if (newDateDebut != null)
				msgs = ((InternalEObject)newDateDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT, null, msgs);
			msgs = basicSetDateDebut(newDateDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT, newDateDebut, newDateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateFin(TypeDataTypeDateHeure newDateFin, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN, oldDateFin, newDateFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(TypeDataTypeDateHeure newDateFin) {
		if (newDateFin != dateFin) {
			NotificationChain msgs = null;
			if (dateFin != null)
				msgs = ((InternalEObject)dateFin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN, null, msgs);
			if (newDateFin != null)
				msgs = ((InternalEObject)newDateFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN, null, msgs);
			msgs = basicSetDateFin(newDateFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN, newDateFin, newDateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoyens() {
		return moyens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoyens(String newMoyens) {
		String oldMoyens = moyens;
		moyens = newMoyens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BESOIN_RACCORDEMENT__MOYENS, oldMoyens, moyens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUniteRaccordeUnite() {
		if (aPourUniteRaccordeUnite == null) {
			aPourUniteRaccordeUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_BESOIN_RACCORDEMENT__APOUR_UNITE_RACCORDE_UNITE);
		}
		return aPourUniteRaccordeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT:
				return basicSetDateDebut(null, msgs);
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN:
				return basicSetDateFin(null, msgs);
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__APOUR_UNITE_RACCORDE_UNITE:
				return ((InternalEList<?>)getAPourUniteRaccordeUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__BESOIN_LIAISON:
				return getBesoinLiaison();
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__NATURE_LIAISON:
				return getNatureLiaison();
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__MOYENS:
				return getMoyens();
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__APOUR_UNITE_RACCORDE_UNITE:
				return getAPourUniteRaccordeUnite();
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
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__BESOIN_LIAISON:
				setBesoinLiaison((String)newValue);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__NATURE_LIAISON:
				setNatureLiaison((String)newValue);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__MOYENS:
				setMoyens((String)newValue);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__APOUR_UNITE_RACCORDE_UNITE:
				getAPourUniteRaccordeUnite().clear();
				getAPourUniteRaccordeUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__BESOIN_LIAISON:
				setBesoinLiaison(BESOIN_LIAISON_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__NATURE_LIAISON:
				setNatureLiaison(NATURE_LIAISON_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT:
				setDateDebut((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN:
				setDateFin((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__MOYENS:
				setMoyens(MOYENS_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__APOUR_UNITE_RACCORDE_UNITE:
				getAPourUniteRaccordeUnite().clear();
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
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__BESOIN_LIAISON:
				return BESOIN_LIAISON_EDEFAULT == null ? besoinLiaison != null : !BESOIN_LIAISON_EDEFAULT.equals(besoinLiaison);
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__NATURE_LIAISON:
				return NATURE_LIAISON_EDEFAULT == null ? natureLiaison != null : !NATURE_LIAISON_EDEFAULT.equals(natureLiaison);
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_DEBUT:
				return dateDebut != null;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__DATE_FIN:
				return dateFin != null;
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__MOYENS:
				return MOYENS_EDEFAULT == null ? moyens != null : !MOYENS_EDEFAULT.equals(moyens);
			case SchemaPackage.TYPE_BESOIN_RACCORDEMENT__APOUR_UNITE_RACCORDE_UNITE:
				return aPourUniteRaccordeUnite != null && !aPourUniteRaccordeUnite.isEmpty();
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
		result.append(" (besoinLiaison: ");
		result.append(besoinLiaison);
		result.append(", natureLiaison: ");
		result.append(natureLiaison);
		result.append(", moyens: ");
		result.append(moyens);
		result.append(')');
		return result.toString();
	}

} //TypeBesoinRaccordementImpl
