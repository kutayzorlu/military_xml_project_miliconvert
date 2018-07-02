/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAdresse;
import mpia.schema.TypeDictionaryDicoAdresseType;

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
 * An implementation of the model object '<em><b>Type Adresse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAdresseImpl#getType <em>Type</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseImpl#getLibelle <em>Libelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseImpl#getEstAdresseAssociationInstanceObjetAdresse <em>Est Adresse Association Instance Objet Adresse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAdresseImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeAdresseImpl extends EObjectImpl implements TypeAdresse {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAdresseType TYPE_EDEFAULT = TypeDictionaryDicoAdresseType.PROF;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAdresseType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibelle() <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibelle()
	 * @generated
	 * @ordered
	 */
	protected String libelle = LIBELLE_EDEFAULT;

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
	 * The cached value of the '{@link #getEstAdresseAssociationInstanceObjetAdresse() <em>Est Adresse Association Instance Objet Adresse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstAdresseAssociationInstanceObjetAdresse()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estAdresseAssociationInstanceObjetAdresse;

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
	protected TypeAdresseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAdresse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAdresseType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeDictionaryDicoAdresseType newType) {
		TypeDictionaryDicoAdresseType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeDictionaryDicoAdresseType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ADRESSE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibelle(String newLibelle) {
		String oldLibelle = libelle;
		libelle = newLibelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE__LIBELLE, oldLibelle, libelle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstAdresseAssociationInstanceObjetAdresse() {
		if (estAdresseAssociationInstanceObjetAdresse == null) {
			estAdresseAssociationInstanceObjetAdresse = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ADRESSE__EST_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE);
		}
		return estAdresseAssociationInstanceObjetAdresse;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
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
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ADRESSE__EST_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return ((InternalEList<?>)getEstAdresseAssociationInstanceObjetAdresse()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ADRESSE__TYPE:
				return getType();
			case SchemaPackage.TYPE_ADRESSE__LIBELLE:
				return getLibelle();
			case SchemaPackage.TYPE_ADRESSE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ADRESSE__CE:
				return getCE();
			case SchemaPackage.TYPE_ADRESSE__EST_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return getEstAdresseAssociationInstanceObjetAdresse();
			case SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_ADRESSE__TYPE:
				setType((TypeDictionaryDicoAdresseType)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE__LIBELLE:
				setLibelle((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE__EST_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				getEstAdresseAssociationInstanceObjetAdresse().clear();
				getEstAdresseAssociationInstanceObjetAdresse().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ADRESSE__TYPE:
				unsetType();
				return;
			case SchemaPackage.TYPE_ADRESSE__LIBELLE:
				setLibelle(LIBELLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ADRESSE__EST_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				getEstAdresseAssociationInstanceObjetAdresse().clear();
				return;
			case SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
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
			case SchemaPackage.TYPE_ADRESSE__TYPE:
				return isSetType();
			case SchemaPackage.TYPE_ADRESSE__LIBELLE:
				return LIBELLE_EDEFAULT == null ? libelle != null : !LIBELLE_EDEFAULT.equals(libelle);
			case SchemaPackage.TYPE_ADRESSE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ADRESSE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ADRESSE__EST_ADRESSE_ASSOCIATION_INSTANCE_OBJET_ADRESSE:
				return estAdresseAssociationInstanceObjetAdresse != null && !estAdresseAssociationInstanceObjetAdresse.isEmpty();
			case SchemaPackage.TYPE_ADRESSE__EST_RAPPORTEE_PAR_RAPPORT:
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", libelle: ");
		result.append(libelle);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAdresseImpl
