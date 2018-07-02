/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMineExplosif;

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
 * An implementation of the model object '<em><b>Type Mine Explosif</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMineExplosifImpl#getGDHDebutActivation <em>GDH Debut Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMineExplosifImpl#getGDHFinActivation <em>GDH Fin Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMineExplosifImpl#getQuantite <em>Quantite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMineExplosifImpl#getAssocieCommeTypeMunitionTypeMunition <em>Associe Comme Type Munition Type Munition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMineExplosifImpl extends EObjectImpl implements TypeMineExplosif {
	/**
	 * The default value of the '{@link #getGDHDebutActivation() <em>GDH Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHDebutActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_DEBUT_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHDebutActivation() <em>GDH Debut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHDebutActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHDebutActivation = GDH_DEBUT_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHFinActivation() <em>GDH Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHFinActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_FIN_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHFinActivation() <em>GDH Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHFinActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHFinActivation = GDH_FIN_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantite() <em>Quantite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantite()
	 * @generated
	 * @ordered
	 */
	protected long quantite = QUANTITE_EDEFAULT;

	/**
	 * This is true if the Quantite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteESet;

	/**
	 * The cached value of the '{@link #getAssocieCommeTypeMunitionTypeMunition() <em>Associe Comme Type Munition Type Munition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeMunitionTypeMunition()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> associeCommeTypeMunitionTypeMunition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMineExplosifImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMineExplosif();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHDebutActivation() {
		return gDHDebutActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHDebutActivation(XMLGregorianCalendar newGDHDebutActivation) {
		XMLGregorianCalendar oldGDHDebutActivation = gDHDebutActivation;
		gDHDebutActivation = newGDHDebutActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_DEBUT_ACTIVATION, oldGDHDebutActivation, gDHDebutActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHFinActivation() {
		return gDHFinActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHFinActivation(XMLGregorianCalendar newGDHFinActivation) {
		XMLGregorianCalendar oldGDHFinActivation = gDHFinActivation;
		gDHFinActivation = newGDHFinActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_FIN_ACTIVATION, oldGDHFinActivation, gDHFinActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantite() {
		return quantite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantite(long newQuantite) {
		long oldQuantite = quantite;
		quantite = newQuantite;
		boolean oldQuantiteESet = quantiteESet;
		quantiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MINE_EXPLOSIF__QUANTITE, oldQuantite, quantite, !oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantite() {
		long oldQuantite = quantite;
		boolean oldQuantiteESet = quantiteESet;
		quantite = QUANTITE_EDEFAULT;
		quantiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MINE_EXPLOSIF__QUANTITE, oldQuantite, QUANTITE_EDEFAULT, oldQuantiteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantite() {
		return quantiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAssocieCommeTypeMunitionTypeMunition() {
		if (associeCommeTypeMunitionTypeMunition == null) {
			associeCommeTypeMunitionTypeMunition = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MINE_EXPLOSIF__ASSOCIE_COMME_TYPE_MUNITION_TYPE_MUNITION);
		}
		return associeCommeTypeMunitionTypeMunition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MINE_EXPLOSIF__ASSOCIE_COMME_TYPE_MUNITION_TYPE_MUNITION:
				return ((InternalEList<?>)getAssocieCommeTypeMunitionTypeMunition()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_DEBUT_ACTIVATION:
				return getGDHDebutActivation();
			case SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_FIN_ACTIVATION:
				return getGDHFinActivation();
			case SchemaPackage.TYPE_MINE_EXPLOSIF__QUANTITE:
				return new Long(getQuantite());
			case SchemaPackage.TYPE_MINE_EXPLOSIF__ASSOCIE_COMME_TYPE_MUNITION_TYPE_MUNITION:
				return getAssocieCommeTypeMunitionTypeMunition();
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
			case SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_DEBUT_ACTIVATION:
				setGDHDebutActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_FIN_ACTIVATION:
				setGDHFinActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MINE_EXPLOSIF__QUANTITE:
				setQuantite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MINE_EXPLOSIF__ASSOCIE_COMME_TYPE_MUNITION_TYPE_MUNITION:
				getAssocieCommeTypeMunitionTypeMunition().clear();
				getAssocieCommeTypeMunitionTypeMunition().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_DEBUT_ACTIVATION:
				setGDHDebutActivation(GDH_DEBUT_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_FIN_ACTIVATION:
				setGDHFinActivation(GDH_FIN_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MINE_EXPLOSIF__QUANTITE:
				unsetQuantite();
				return;
			case SchemaPackage.TYPE_MINE_EXPLOSIF__ASSOCIE_COMME_TYPE_MUNITION_TYPE_MUNITION:
				getAssocieCommeTypeMunitionTypeMunition().clear();
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
			case SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_DEBUT_ACTIVATION:
				return GDH_DEBUT_ACTIVATION_EDEFAULT == null ? gDHDebutActivation != null : !GDH_DEBUT_ACTIVATION_EDEFAULT.equals(gDHDebutActivation);
			case SchemaPackage.TYPE_MINE_EXPLOSIF__GDH_FIN_ACTIVATION:
				return GDH_FIN_ACTIVATION_EDEFAULT == null ? gDHFinActivation != null : !GDH_FIN_ACTIVATION_EDEFAULT.equals(gDHFinActivation);
			case SchemaPackage.TYPE_MINE_EXPLOSIF__QUANTITE:
				return isSetQuantite();
			case SchemaPackage.TYPE_MINE_EXPLOSIF__ASSOCIE_COMME_TYPE_MUNITION_TYPE_MUNITION:
				return associeCommeTypeMunitionTypeMunition != null && !associeCommeTypeMunitionTypeMunition.isEmpty();
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
		result.append(" (gDHDebutActivation: ");
		result.append(gDHDebutActivation);
		result.append(", gDHFinActivation: ");
		result.append(gDHFinActivation);
		result.append(", quantite: ");
		if (quantiteESet) result.append(quantite); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeMineExplosifImpl
