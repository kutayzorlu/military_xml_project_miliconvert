/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAction3Deni;
import mpia.schema.TypeDictionaryDicoAction3DeniActiviteAerienne;
import mpia.schema.TypeEffetTactiqueRechercheParENI;

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
 * An implementation of the model object '<em><b>Type Action3 Deni</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAction3DeniImpl#getNombreSortiesEn24h <em>Nombre Sorties En24h</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAction3DeniImpl#getActiviteAerienne <em>Activite Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAction3DeniImpl#getActiviteAerienneNonRepertoriee <em>Activite Aerienne Non Repertoriee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAction3DeniImpl#getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI <em>APour Effet Tactique Recherche Par ENI Effet Tactique Recherche Par ENI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAction3DeniImpl extends EObjectImpl implements TypeAction3Deni {
	/**
	 * The default value of the '{@link #getNombreSortiesEn24h() <em>Nombre Sorties En24h</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSortiesEn24h()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_SORTIES_EN24H_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreSortiesEn24h() <em>Nombre Sorties En24h</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreSortiesEn24h()
	 * @generated
	 * @ordered
	 */
	protected long nombreSortiesEn24h = NOMBRE_SORTIES_EN24H_EDEFAULT;

	/**
	 * This is true if the Nombre Sorties En24h attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreSortiesEn24hESet;

	/**
	 * The default value of the '{@link #getActiviteAerienne() <em>Activite Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteAerienne()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAction3DeniActiviteAerienne ACTIVITE_AERIENNE_EDEFAULT = TypeDictionaryDicoAction3DeniActiviteAerienne.CAS;

	/**
	 * The cached value of the '{@link #getActiviteAerienne() <em>Activite Aerienne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteAerienne()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAction3DeniActiviteAerienne activiteAerienne = ACTIVITE_AERIENNE_EDEFAULT;

	/**
	 * This is true if the Activite Aerienne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activiteAerienneESet;

	/**
	 * The default value of the '{@link #getActiviteAerienneNonRepertoriee() <em>Activite Aerienne Non Repertoriee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteAerienneNonRepertoriee()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIVITE_AERIENNE_NON_REPERTORIEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActiviteAerienneNonRepertoriee() <em>Activite Aerienne Non Repertoriee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteAerienneNonRepertoriee()
	 * @generated
	 * @ordered
	 */
	protected String activiteAerienneNonRepertoriee = ACTIVITE_AERIENNE_NON_REPERTORIEE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI() <em>APour Effet Tactique Recherche Par ENI Effet Tactique Recherche Par ENI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffetTactiqueRechercheParENI> aPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAction3DeniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAction3Deni();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreSortiesEn24h() {
		return nombreSortiesEn24h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreSortiesEn24h(long newNombreSortiesEn24h) {
		long oldNombreSortiesEn24h = nombreSortiesEn24h;
		nombreSortiesEn24h = newNombreSortiesEn24h;
		boolean oldNombreSortiesEn24hESet = nombreSortiesEn24hESet;
		nombreSortiesEn24hESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION3_DENI__NOMBRE_SORTIES_EN24H, oldNombreSortiesEn24h, nombreSortiesEn24h, !oldNombreSortiesEn24hESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreSortiesEn24h() {
		long oldNombreSortiesEn24h = nombreSortiesEn24h;
		boolean oldNombreSortiesEn24hESet = nombreSortiesEn24hESet;
		nombreSortiesEn24h = NOMBRE_SORTIES_EN24H_EDEFAULT;
		nombreSortiesEn24hESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION3_DENI__NOMBRE_SORTIES_EN24H, oldNombreSortiesEn24h, NOMBRE_SORTIES_EN24H_EDEFAULT, oldNombreSortiesEn24hESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreSortiesEn24h() {
		return nombreSortiesEn24hESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAction3DeniActiviteAerienne getActiviteAerienne() {
		return activiteAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiviteAerienne(TypeDictionaryDicoAction3DeniActiviteAerienne newActiviteAerienne) {
		TypeDictionaryDicoAction3DeniActiviteAerienne oldActiviteAerienne = activiteAerienne;
		activiteAerienne = newActiviteAerienne == null ? ACTIVITE_AERIENNE_EDEFAULT : newActiviteAerienne;
		boolean oldActiviteAerienneESet = activiteAerienneESet;
		activiteAerienneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE, oldActiviteAerienne, activiteAerienne, !oldActiviteAerienneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActiviteAerienne() {
		TypeDictionaryDicoAction3DeniActiviteAerienne oldActiviteAerienne = activiteAerienne;
		boolean oldActiviteAerienneESet = activiteAerienneESet;
		activiteAerienne = ACTIVITE_AERIENNE_EDEFAULT;
		activiteAerienneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE, oldActiviteAerienne, ACTIVITE_AERIENNE_EDEFAULT, oldActiviteAerienneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActiviteAerienne() {
		return activiteAerienneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActiviteAerienneNonRepertoriee() {
		return activiteAerienneNonRepertoriee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiviteAerienneNonRepertoriee(String newActiviteAerienneNonRepertoriee) {
		String oldActiviteAerienneNonRepertoriee = activiteAerienneNonRepertoriee;
		activiteAerienneNonRepertoriee = newActiviteAerienneNonRepertoriee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE_NON_REPERTORIEE, oldActiviteAerienneNonRepertoriee, activiteAerienneNonRepertoriee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffetTactiqueRechercheParENI> getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI() {
		if (aPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI == null) {
			aPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI = new EObjectContainmentEList<TypeEffetTactiqueRechercheParENI>(TypeEffetTactiqueRechercheParENI.class, this, SchemaPackage.TYPE_ACTION3_DENI__APOUR_EFFET_TACTIQUE_RECHERCHE_PAR_ENI_EFFET_TACTIQUE_RECHERCHE_PAR_ENI);
		}
		return aPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ACTION3_DENI__APOUR_EFFET_TACTIQUE_RECHERCHE_PAR_ENI_EFFET_TACTIQUE_RECHERCHE_PAR_ENI:
				return ((InternalEList<?>)getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ACTION3_DENI__NOMBRE_SORTIES_EN24H:
				return new Long(getNombreSortiesEn24h());
			case SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE:
				return getActiviteAerienne();
			case SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE_NON_REPERTORIEE:
				return getActiviteAerienneNonRepertoriee();
			case SchemaPackage.TYPE_ACTION3_DENI__APOUR_EFFET_TACTIQUE_RECHERCHE_PAR_ENI_EFFET_TACTIQUE_RECHERCHE_PAR_ENI:
				return getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI();
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
			case SchemaPackage.TYPE_ACTION3_DENI__NOMBRE_SORTIES_EN24H:
				setNombreSortiesEn24h(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE:
				setActiviteAerienne((TypeDictionaryDicoAction3DeniActiviteAerienne)newValue);
				return;
			case SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE_NON_REPERTORIEE:
				setActiviteAerienneNonRepertoriee((String)newValue);
				return;
			case SchemaPackage.TYPE_ACTION3_DENI__APOUR_EFFET_TACTIQUE_RECHERCHE_PAR_ENI_EFFET_TACTIQUE_RECHERCHE_PAR_ENI:
				getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI().clear();
				getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI().addAll((Collection<? extends TypeEffetTactiqueRechercheParENI>)newValue);
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
			case SchemaPackage.TYPE_ACTION3_DENI__NOMBRE_SORTIES_EN24H:
				unsetNombreSortiesEn24h();
				return;
			case SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE:
				unsetActiviteAerienne();
				return;
			case SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE_NON_REPERTORIEE:
				setActiviteAerienneNonRepertoriee(ACTIVITE_AERIENNE_NON_REPERTORIEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ACTION3_DENI__APOUR_EFFET_TACTIQUE_RECHERCHE_PAR_ENI_EFFET_TACTIQUE_RECHERCHE_PAR_ENI:
				getAPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI().clear();
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
			case SchemaPackage.TYPE_ACTION3_DENI__NOMBRE_SORTIES_EN24H:
				return isSetNombreSortiesEn24h();
			case SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE:
				return isSetActiviteAerienne();
			case SchemaPackage.TYPE_ACTION3_DENI__ACTIVITE_AERIENNE_NON_REPERTORIEE:
				return ACTIVITE_AERIENNE_NON_REPERTORIEE_EDEFAULT == null ? activiteAerienneNonRepertoriee != null : !ACTIVITE_AERIENNE_NON_REPERTORIEE_EDEFAULT.equals(activiteAerienneNonRepertoriee);
			case SchemaPackage.TYPE_ACTION3_DENI__APOUR_EFFET_TACTIQUE_RECHERCHE_PAR_ENI_EFFET_TACTIQUE_RECHERCHE_PAR_ENI:
				return aPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI != null && !aPourEffetTactiqueRechercheParENIEffetTactiqueRechercheParENI.isEmpty();
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
		result.append(" (nombreSortiesEn24h: ");
		if (nombreSortiesEn24hESet) result.append(nombreSortiesEn24h); else result.append("<unset>");
		result.append(", activiteAerienne: ");
		if (activiteAerienneESet) result.append(activiteAerienne); else result.append("<unset>");
		result.append(", activiteAerienneNonRepertoriee: ");
		result.append(activiteAerienneNonRepertoriee);
		result.append(')');
		return result.toString();
	}

} //TypeAction3DeniImpl
