/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeActionRenseignement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Action Renseignement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeActionRenseignementImpl#getHeurePremiereFourniture <em>Heure Premiere Fourniture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionRenseignementImpl#getHeureLimiteFourniture <em>Heure Limite Fourniture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionRenseignementImpl#getPeriodicite <em>Periodicite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeActionRenseignementImpl#getACommeFaitRechercheFaitRenseignement <em>AComme Fait Recherche Fait Renseignement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeActionRenseignementImpl extends TypeActionImpl implements TypeActionRenseignement {
	/**
	 * The default value of the '{@link #getHeurePremiereFourniture() <em>Heure Premiere Fourniture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeurePremiereFourniture()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_PREMIERE_FOURNITURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeurePremiereFourniture() <em>Heure Premiere Fourniture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeurePremiereFourniture()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heurePremiereFourniture = HEURE_PREMIERE_FOURNITURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureLimiteFourniture() <em>Heure Limite Fourniture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureLimiteFourniture()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_LIMITE_FOURNITURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureLimiteFourniture() <em>Heure Limite Fourniture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureLimiteFourniture()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heureLimiteFourniture = HEURE_LIMITE_FOURNITURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPeriodicite() <em>Periodicite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicite()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree periodicite;

	/**
	 * The cached value of the '{@link #getACommeFaitRechercheFaitRenseignement() <em>AComme Fait Recherche Fait Renseignement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeFaitRechercheFaitRenseignement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeFaitRechercheFaitRenseignement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeActionRenseignementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeActionRenseignement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeurePremiereFourniture() {
		return heurePremiereFourniture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeurePremiereFourniture(XMLGregorianCalendar newHeurePremiereFourniture) {
		XMLGregorianCalendar oldHeurePremiereFourniture = heurePremiereFourniture;
		heurePremiereFourniture = newHeurePremiereFourniture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_PREMIERE_FOURNITURE, oldHeurePremiereFourniture, heurePremiereFourniture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeureLimiteFourniture() {
		return heureLimiteFourniture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureLimiteFourniture(XMLGregorianCalendar newHeureLimiteFourniture) {
		XMLGregorianCalendar oldHeureLimiteFourniture = heureLimiteFourniture;
		heureLimiteFourniture = newHeureLimiteFourniture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_LIMITE_FOURNITURE, oldHeureLimiteFourniture, heureLimiteFourniture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getPeriodicite() {
		return periodicite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodicite(TypeDataTypeDuree newPeriodicite, NotificationChain msgs) {
		TypeDataTypeDuree oldPeriodicite = periodicite;
		periodicite = newPeriodicite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE, oldPeriodicite, newPeriodicite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodicite(TypeDataTypeDuree newPeriodicite) {
		if (newPeriodicite != periodicite) {
			NotificationChain msgs = null;
			if (periodicite != null)
				msgs = ((InternalEObject)periodicite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE, null, msgs);
			if (newPeriodicite != null)
				msgs = ((InternalEObject)newPeriodicite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE, null, msgs);
			msgs = basicSetPeriodicite(newPeriodicite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE, newPeriodicite, newPeriodicite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeFaitRechercheFaitRenseignement() {
		return aCommeFaitRechercheFaitRenseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeFaitRechercheFaitRenseignement(TypeAssociation newACommeFaitRechercheFaitRenseignement, NotificationChain msgs) {
		TypeAssociation oldACommeFaitRechercheFaitRenseignement = aCommeFaitRechercheFaitRenseignement;
		aCommeFaitRechercheFaitRenseignement = newACommeFaitRechercheFaitRenseignement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT, oldACommeFaitRechercheFaitRenseignement, newACommeFaitRechercheFaitRenseignement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeFaitRechercheFaitRenseignement(TypeAssociation newACommeFaitRechercheFaitRenseignement) {
		if (newACommeFaitRechercheFaitRenseignement != aCommeFaitRechercheFaitRenseignement) {
			NotificationChain msgs = null;
			if (aCommeFaitRechercheFaitRenseignement != null)
				msgs = ((InternalEObject)aCommeFaitRechercheFaitRenseignement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT, null, msgs);
			if (newACommeFaitRechercheFaitRenseignement != null)
				msgs = ((InternalEObject)newACommeFaitRechercheFaitRenseignement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT, null, msgs);
			msgs = basicSetACommeFaitRechercheFaitRenseignement(newACommeFaitRechercheFaitRenseignement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT, newACommeFaitRechercheFaitRenseignement, newACommeFaitRechercheFaitRenseignement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE:
				return basicSetPeriodicite(null, msgs);
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				return basicSetACommeFaitRechercheFaitRenseignement(null, msgs);
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
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_PREMIERE_FOURNITURE:
				return getHeurePremiereFourniture();
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_LIMITE_FOURNITURE:
				return getHeureLimiteFourniture();
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE:
				return getPeriodicite();
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				return getACommeFaitRechercheFaitRenseignement();
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
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_PREMIERE_FOURNITURE:
				setHeurePremiereFourniture((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_LIMITE_FOURNITURE:
				setHeureLimiteFourniture((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE:
				setPeriodicite((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				setACommeFaitRechercheFaitRenseignement((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_PREMIERE_FOURNITURE:
				setHeurePremiereFourniture(HEURE_PREMIERE_FOURNITURE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_LIMITE_FOURNITURE:
				setHeureLimiteFourniture(HEURE_LIMITE_FOURNITURE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE:
				setPeriodicite((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				setACommeFaitRechercheFaitRenseignement((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_PREMIERE_FOURNITURE:
				return HEURE_PREMIERE_FOURNITURE_EDEFAULT == null ? heurePremiereFourniture != null : !HEURE_PREMIERE_FOURNITURE_EDEFAULT.equals(heurePremiereFourniture);
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__HEURE_LIMITE_FOURNITURE:
				return HEURE_LIMITE_FOURNITURE_EDEFAULT == null ? heureLimiteFourniture != null : !HEURE_LIMITE_FOURNITURE_EDEFAULT.equals(heureLimiteFourniture);
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__PERIODICITE:
				return periodicite != null;
			case SchemaPackage.TYPE_ACTION_RENSEIGNEMENT__ACOMME_FAIT_RECHERCHE_FAIT_RENSEIGNEMENT:
				return aCommeFaitRechercheFaitRenseignement != null;
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
		result.append(" (heurePremiereFourniture: ");
		result.append(heurePremiereFourniture);
		result.append(", heureLimiteFourniture: ");
		result.append(heureLimiteFourniture);
		result.append(')');
		return result.toString();
	}

} //TypeActionRenseignementImpl
