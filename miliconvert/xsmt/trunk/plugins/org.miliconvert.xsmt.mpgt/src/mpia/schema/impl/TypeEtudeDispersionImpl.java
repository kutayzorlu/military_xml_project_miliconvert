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
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoNatureRejet;
import mpia.schema.TypeEtudeDispersion;
import mpia.schema.TypeRessourceActiviteType;

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
 * An implementation of the model object '<em><b>Type Etude Dispersion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtudeDispersionImpl#getGDHreference <em>GD Hreference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtudeDispersionImpl#getNatureRejet <em>Nature Rejet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtudeDispersionImpl#getAPourZonesDispersionAutreElementControle <em>APour Zones Dispersion Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtudeDispersionImpl#getEstDetecteParTypeEquipementNRBC <em>Est Detecte Par Type Equipement NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtudeDispersionImpl#getAPourTypeRessourceRessourceActiviteType <em>APour Type Ressource Ressource Activite Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtudeDispersionImpl extends TypeActiviteImpl implements TypeEtudeDispersion {
	/**
	 * The default value of the '{@link #getGDHreference() <em>GD Hreference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHreference()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HREFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHreference() <em>GD Hreference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHreference()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHreference = GD_HREFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNatureRejet() <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureRejet()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoNatureRejet NATURE_REJET_EDEFAULT = TypeDictionaryDicoNatureRejet.ARBRST;

	/**
	 * The cached value of the '{@link #getNatureRejet() <em>Nature Rejet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureRejet()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoNatureRejet natureRejet = NATURE_REJET_EDEFAULT;

	/**
	 * This is true if the Nature Rejet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureRejetESet;

	/**
	 * The cached value of the '{@link #getAPourZonesDispersionAutreElementControle() <em>APour Zones Dispersion Autre Element Controle</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZonesDispersionAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourZonesDispersionAutreElementControle;

	/**
	 * The cached value of the '{@link #getEstDetecteParTypeEquipementNRBC() <em>Est Detecte Par Type Equipement NRBC</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDetecteParTypeEquipementNRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> estDetecteParTypeEquipementNRBC;

	/**
	 * The cached value of the '{@link #getAPourTypeRessourceRessourceActiviteType() <em>APour Type Ressource Ressource Activite Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeRessourceRessourceActiviteType()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeRessourceActiviteType> aPourTypeRessourceRessourceActiviteType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtudeDispersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtudeDispersion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHreference() {
		return gDHreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHreference(XMLGregorianCalendar newGDHreference) {
		XMLGregorianCalendar oldGDHreference = gDHreference;
		gDHreference = newGDHreference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETUDE_DISPERSION__GD_HREFERENCE, oldGDHreference, gDHreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoNatureRejet getNatureRejet() {
		return natureRejet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureRejet(TypeDictionaryDicoNatureRejet newNatureRejet) {
		TypeDictionaryDicoNatureRejet oldNatureRejet = natureRejet;
		natureRejet = newNatureRejet == null ? NATURE_REJET_EDEFAULT : newNatureRejet;
		boolean oldNatureRejetESet = natureRejetESet;
		natureRejetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETUDE_DISPERSION__NATURE_REJET, oldNatureRejet, natureRejet, !oldNatureRejetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureRejet() {
		TypeDictionaryDicoNatureRejet oldNatureRejet = natureRejet;
		boolean oldNatureRejetESet = natureRejetESet;
		natureRejet = NATURE_REJET_EDEFAULT;
		natureRejetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETUDE_DISPERSION__NATURE_REJET, oldNatureRejet, NATURE_REJET_EDEFAULT, oldNatureRejetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureRejet() {
		return natureRejetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourZonesDispersionAutreElementControle() {
		if (aPourZonesDispersionAutreElementControle == null) {
			aPourZonesDispersionAutreElementControle = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_ZONES_DISPERSION_AUTRE_ELEMENT_CONTROLE);
		}
		return aPourZonesDispersionAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getEstDetecteParTypeEquipementNRBC() {
		if (estDetecteParTypeEquipementNRBC == null) {
			estDetecteParTypeEquipementNRBC = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_ETUDE_DISPERSION__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC);
		}
		return estDetecteParTypeEquipementNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeRessourceActiviteType> getAPourTypeRessourceRessourceActiviteType() {
		if (aPourTypeRessourceRessourceActiviteType == null) {
			aPourTypeRessourceRessourceActiviteType = new EObjectContainmentEList<TypeRessourceActiviteType>(TypeRessourceActiviteType.class, this, SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE);
		}
		return aPourTypeRessourceRessourceActiviteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_ZONES_DISPERSION_AUTRE_ELEMENT_CONTROLE:
				return ((InternalEList<?>)getAPourZonesDispersionAutreElementControle()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETUDE_DISPERSION__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return ((InternalEList<?>)getEstDetecteParTypeEquipementNRBC()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return ((InternalEList<?>)getAPourTypeRessourceRessourceActiviteType()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_ETUDE_DISPERSION__GD_HREFERENCE:
				return getGDHreference();
			case SchemaPackage.TYPE_ETUDE_DISPERSION__NATURE_REJET:
				return getNatureRejet();
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_ZONES_DISPERSION_AUTRE_ELEMENT_CONTROLE:
				return getAPourZonesDispersionAutreElementControle();
			case SchemaPackage.TYPE_ETUDE_DISPERSION__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return getEstDetecteParTypeEquipementNRBC();
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return getAPourTypeRessourceRessourceActiviteType();
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
			case SchemaPackage.TYPE_ETUDE_DISPERSION__GD_HREFERENCE:
				setGDHreference((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETUDE_DISPERSION__NATURE_REJET:
				setNatureRejet((TypeDictionaryDicoNatureRejet)newValue);
				return;
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_ZONES_DISPERSION_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesDispersionAutreElementControle().clear();
				getAPourZonesDispersionAutreElementControle().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ETUDE_DISPERSION__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				getEstDetecteParTypeEquipementNRBC().clear();
				getEstDetecteParTypeEquipementNRBC().addAll((Collection<? extends TypeAssociationEXT>)newValue);
				return;
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteType().clear();
				getAPourTypeRessourceRessourceActiviteType().addAll((Collection<? extends TypeRessourceActiviteType>)newValue);
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
			case SchemaPackage.TYPE_ETUDE_DISPERSION__GD_HREFERENCE:
				setGDHreference(GD_HREFERENCE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETUDE_DISPERSION__NATURE_REJET:
				unsetNatureRejet();
				return;
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_ZONES_DISPERSION_AUTRE_ELEMENT_CONTROLE:
				getAPourZonesDispersionAutreElementControle().clear();
				return;
			case SchemaPackage.TYPE_ETUDE_DISPERSION__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				getEstDetecteParTypeEquipementNRBC().clear();
				return;
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				getAPourTypeRessourceRessourceActiviteType().clear();
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
			case SchemaPackage.TYPE_ETUDE_DISPERSION__GD_HREFERENCE:
				return GD_HREFERENCE_EDEFAULT == null ? gDHreference != null : !GD_HREFERENCE_EDEFAULT.equals(gDHreference);
			case SchemaPackage.TYPE_ETUDE_DISPERSION__NATURE_REJET:
				return isSetNatureRejet();
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_ZONES_DISPERSION_AUTRE_ELEMENT_CONTROLE:
				return aPourZonesDispersionAutreElementControle != null && !aPourZonesDispersionAutreElementControle.isEmpty();
			case SchemaPackage.TYPE_ETUDE_DISPERSION__EST_DETECTE_PAR_TYPE_EQUIPEMENT_NRBC:
				return estDetecteParTypeEquipementNRBC != null && !estDetecteParTypeEquipementNRBC.isEmpty();
			case SchemaPackage.TYPE_ETUDE_DISPERSION__APOUR_TYPE_RESSOURCE_RESSOURCE_ACTIVITE_TYPE:
				return aPourTypeRessourceRessourceActiviteType != null && !aPourTypeRessourceRessourceActiviteType.isEmpty();
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
		result.append(" (gDHreference: ");
		result.append(gDHreference);
		result.append(", natureRejet: ");
		if (natureRejetESet) result.append(natureRejet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtudeDispersionImpl
