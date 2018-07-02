/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace;
import mpia.schema.TypeMenacesAeriennesMissionALAT;

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
 * An implementation of the model object '<em><b>Type Menaces Aeriennes Mission ALAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMenacesAeriennesMissionALATImpl#getTypeMenace <em>Type Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenacesAeriennesMissionALATImpl#getOrigineGeographique <em>Origine Geographique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenacesAeriennesMissionALATImpl#getConsigneDeTir <em>Consigne De Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMenacesAeriennesMissionALATImpl#getConcerneTypeArmementTypeMateriel <em>Concerne Type Armement Type Materiel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMenacesAeriennesMissionALATImpl extends TypeMenaceImpl implements TypeMenacesAeriennesMissionALAT {
	/**
	 * The default value of the '{@link #getTypeMenace() <em>Type Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMenace()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace TYPE_MENACE_EDEFAULT = TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace.ACFT;

	/**
	 * The cached value of the '{@link #getTypeMenace() <em>Type Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeMenace()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace typeMenace = TYPE_MENACE_EDEFAULT;

	/**
	 * This is true if the Type Menace attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeMenaceESet;

	/**
	 * The default value of the '{@link #getOrigineGeographique() <em>Origine Geographique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineGeographique()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGINE_GEOGRAPHIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigineGeographique() <em>Origine Geographique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigineGeographique()
	 * @generated
	 * @ordered
	 */
	protected String origineGeographique = ORIGINE_GEOGRAPHIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsigneDeTir() <em>Consigne De Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneDeTir()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSIGNE_DE_TIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsigneDeTir() <em>Consigne De Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsigneDeTir()
	 * @generated
	 * @ordered
	 */
	protected String consigneDeTir = CONSIGNE_DE_TIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcerneTypeArmementTypeMateriel() <em>Concerne Type Armement Type Materiel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeArmementTypeMateriel()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> concerneTypeArmementTypeMateriel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMenacesAeriennesMissionALATImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMenacesAeriennesMissionALAT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace getTypeMenace() {
		return typeMenace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeMenace(TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace newTypeMenace) {
		TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace oldTypeMenace = typeMenace;
		typeMenace = newTypeMenace == null ? TYPE_MENACE_EDEFAULT : newTypeMenace;
		boolean oldTypeMenaceESet = typeMenaceESet;
		typeMenaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__TYPE_MENACE, oldTypeMenace, typeMenace, !oldTypeMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeMenace() {
		TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace oldTypeMenace = typeMenace;
		boolean oldTypeMenaceESet = typeMenaceESet;
		typeMenace = TYPE_MENACE_EDEFAULT;
		typeMenaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__TYPE_MENACE, oldTypeMenace, TYPE_MENACE_EDEFAULT, oldTypeMenaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeMenace() {
		return typeMenaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrigineGeographique() {
		return origineGeographique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigineGeographique(String newOrigineGeographique) {
		String oldOrigineGeographique = origineGeographique;
		origineGeographique = newOrigineGeographique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__ORIGINE_GEOGRAPHIQUE, oldOrigineGeographique, origineGeographique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConsigneDeTir() {
		return consigneDeTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsigneDeTir(String newConsigneDeTir) {
		String oldConsigneDeTir = consigneDeTir;
		consigneDeTir = newConsigneDeTir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONSIGNE_DE_TIR, oldConsigneDeTir, consigneDeTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getConcerneTypeArmementTypeMateriel() {
		if (concerneTypeArmementTypeMateriel == null) {
			concerneTypeArmementTypeMateriel = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONCERNE_TYPE_ARMEMENT_TYPE_MATERIEL);
		}
		return concerneTypeArmementTypeMateriel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONCERNE_TYPE_ARMEMENT_TYPE_MATERIEL:
				return ((InternalEList<?>)getConcerneTypeArmementTypeMateriel()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__TYPE_MENACE:
				return getTypeMenace();
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__ORIGINE_GEOGRAPHIQUE:
				return getOrigineGeographique();
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONSIGNE_DE_TIR:
				return getConsigneDeTir();
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONCERNE_TYPE_ARMEMENT_TYPE_MATERIEL:
				return getConcerneTypeArmementTypeMateriel();
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
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__TYPE_MENACE:
				setTypeMenace((TypeDictionaryDicoMenacesAeriennesMissionALATTypeMenace)newValue);
				return;
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__ORIGINE_GEOGRAPHIQUE:
				setOrigineGeographique((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONSIGNE_DE_TIR:
				setConsigneDeTir((String)newValue);
				return;
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONCERNE_TYPE_ARMEMENT_TYPE_MATERIEL:
				getConcerneTypeArmementTypeMateriel().clear();
				getConcerneTypeArmementTypeMateriel().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__TYPE_MENACE:
				unsetTypeMenace();
				return;
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__ORIGINE_GEOGRAPHIQUE:
				setOrigineGeographique(ORIGINE_GEOGRAPHIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONSIGNE_DE_TIR:
				setConsigneDeTir(CONSIGNE_DE_TIR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONCERNE_TYPE_ARMEMENT_TYPE_MATERIEL:
				getConcerneTypeArmementTypeMateriel().clear();
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
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__TYPE_MENACE:
				return isSetTypeMenace();
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__ORIGINE_GEOGRAPHIQUE:
				return ORIGINE_GEOGRAPHIQUE_EDEFAULT == null ? origineGeographique != null : !ORIGINE_GEOGRAPHIQUE_EDEFAULT.equals(origineGeographique);
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONSIGNE_DE_TIR:
				return CONSIGNE_DE_TIR_EDEFAULT == null ? consigneDeTir != null : !CONSIGNE_DE_TIR_EDEFAULT.equals(consigneDeTir);
			case SchemaPackage.TYPE_MENACES_AERIENNES_MISSION_ALAT__CONCERNE_TYPE_ARMEMENT_TYPE_MATERIEL:
				return concerneTypeArmementTypeMateriel != null && !concerneTypeArmementTypeMateriel.isEmpty();
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
		result.append(" (typeMenace: ");
		if (typeMenaceESet) result.append(typeMenace); else result.append("<unset>");
		result.append(", origineGeographique: ");
		result.append(origineGeographique);
		result.append(", consigneDeTir: ");
		result.append(consigneDeTir);
		result.append(')');
		return result.toString();
	}

} //TypeMenacesAeriennesMissionALATImpl
