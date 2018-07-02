/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEmploiReconnaissanceModeCouverture;
import mpia.schema.TypeDictionaryDicoEmploiReconnaissanceTypeCouverture;
import mpia.schema.TypeDictionaryDicoEmploiReconnaissanceTypeImagerie;
import mpia.schema.TypeEmploiReconnaissance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Emploi Reconnaissance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEmploiReconnaissanceImpl#getModeCouverture <em>Mode Couverture</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiReconnaissanceImpl#getTypeImagerie <em>Type Imagerie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiReconnaissanceImpl#getTypeCouverture <em>Type Couverture</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEmploiReconnaissanceImpl extends TypeEmploiRessourceActiviteImpl implements TypeEmploiReconnaissance {
	/**
	 * The default value of the '{@link #getModeCouverture() <em>Mode Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCouverture()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiReconnaissanceModeCouverture MODE_COUVERTURE_EDEFAULT = TypeDictionaryDicoEmploiReconnaissanceModeCouverture.MONOCC;

	/**
	 * The cached value of the '{@link #getModeCouverture() <em>Mode Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeCouverture()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiReconnaissanceModeCouverture modeCouverture = MODE_COUVERTURE_EDEFAULT;

	/**
	 * This is true if the Mode Couverture attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeCouvertureESet;

	/**
	 * The default value of the '{@link #getTypeImagerie() <em>Type Imagerie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeImagerie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiReconnaissanceTypeImagerie TYPE_IMAGERIE_EDEFAULT = TypeDictionaryDicoEmploiReconnaissanceTypeImagerie.DBMIEO;

	/**
	 * The cached value of the '{@link #getTypeImagerie() <em>Type Imagerie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeImagerie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiReconnaissanceTypeImagerie typeImagerie = TYPE_IMAGERIE_EDEFAULT;

	/**
	 * This is true if the Type Imagerie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeImagerieESet;

	/**
	 * The default value of the '{@link #getTypeCouverture() <em>Type Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCouverture()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiReconnaissanceTypeCouverture TYPE_COUVERTURE_EDEFAULT = TypeDictionaryDicoEmploiReconnaissanceTypeCouverture.AFLOA;

	/**
	 * The cached value of the '{@link #getTypeCouverture() <em>Type Couverture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCouverture()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiReconnaissanceTypeCouverture typeCouverture = TYPE_COUVERTURE_EDEFAULT;

	/**
	 * This is true if the Type Couverture attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeCouvertureESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEmploiReconnaissanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEmploiReconnaissance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiReconnaissanceModeCouverture getModeCouverture() {
		return modeCouverture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeCouverture(TypeDictionaryDicoEmploiReconnaissanceModeCouverture newModeCouverture) {
		TypeDictionaryDicoEmploiReconnaissanceModeCouverture oldModeCouverture = modeCouverture;
		modeCouverture = newModeCouverture == null ? MODE_COUVERTURE_EDEFAULT : newModeCouverture;
		boolean oldModeCouvertureESet = modeCouvertureESet;
		modeCouvertureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__MODE_COUVERTURE, oldModeCouverture, modeCouverture, !oldModeCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetModeCouverture() {
		TypeDictionaryDicoEmploiReconnaissanceModeCouverture oldModeCouverture = modeCouverture;
		boolean oldModeCouvertureESet = modeCouvertureESet;
		modeCouverture = MODE_COUVERTURE_EDEFAULT;
		modeCouvertureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__MODE_COUVERTURE, oldModeCouverture, MODE_COUVERTURE_EDEFAULT, oldModeCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetModeCouverture() {
		return modeCouvertureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiReconnaissanceTypeImagerie getTypeImagerie() {
		return typeImagerie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeImagerie(TypeDictionaryDicoEmploiReconnaissanceTypeImagerie newTypeImagerie) {
		TypeDictionaryDicoEmploiReconnaissanceTypeImagerie oldTypeImagerie = typeImagerie;
		typeImagerie = newTypeImagerie == null ? TYPE_IMAGERIE_EDEFAULT : newTypeImagerie;
		boolean oldTypeImagerieESet = typeImagerieESet;
		typeImagerieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_IMAGERIE, oldTypeImagerie, typeImagerie, !oldTypeImagerieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeImagerie() {
		TypeDictionaryDicoEmploiReconnaissanceTypeImagerie oldTypeImagerie = typeImagerie;
		boolean oldTypeImagerieESet = typeImagerieESet;
		typeImagerie = TYPE_IMAGERIE_EDEFAULT;
		typeImagerieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_IMAGERIE, oldTypeImagerie, TYPE_IMAGERIE_EDEFAULT, oldTypeImagerieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeImagerie() {
		return typeImagerieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiReconnaissanceTypeCouverture getTypeCouverture() {
		return typeCouverture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCouverture(TypeDictionaryDicoEmploiReconnaissanceTypeCouverture newTypeCouverture) {
		TypeDictionaryDicoEmploiReconnaissanceTypeCouverture oldTypeCouverture = typeCouverture;
		typeCouverture = newTypeCouverture == null ? TYPE_COUVERTURE_EDEFAULT : newTypeCouverture;
		boolean oldTypeCouvertureESet = typeCouvertureESet;
		typeCouvertureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_COUVERTURE, oldTypeCouverture, typeCouverture, !oldTypeCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCouverture() {
		TypeDictionaryDicoEmploiReconnaissanceTypeCouverture oldTypeCouverture = typeCouverture;
		boolean oldTypeCouvertureESet = typeCouvertureESet;
		typeCouverture = TYPE_COUVERTURE_EDEFAULT;
		typeCouvertureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_COUVERTURE, oldTypeCouverture, TYPE_COUVERTURE_EDEFAULT, oldTypeCouvertureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCouverture() {
		return typeCouvertureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__MODE_COUVERTURE:
				return getModeCouverture();
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_IMAGERIE:
				return getTypeImagerie();
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_COUVERTURE:
				return getTypeCouverture();
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
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__MODE_COUVERTURE:
				setModeCouverture((TypeDictionaryDicoEmploiReconnaissanceModeCouverture)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_IMAGERIE:
				setTypeImagerie((TypeDictionaryDicoEmploiReconnaissanceTypeImagerie)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_COUVERTURE:
				setTypeCouverture((TypeDictionaryDicoEmploiReconnaissanceTypeCouverture)newValue);
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
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__MODE_COUVERTURE:
				unsetModeCouverture();
				return;
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_IMAGERIE:
				unsetTypeImagerie();
				return;
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_COUVERTURE:
				unsetTypeCouverture();
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
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__MODE_COUVERTURE:
				return isSetModeCouverture();
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_IMAGERIE:
				return isSetTypeImagerie();
			case SchemaPackage.TYPE_EMPLOI_RECONNAISSANCE__TYPE_COUVERTURE:
				return isSetTypeCouverture();
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
		result.append(" (modeCouverture: ");
		if (modeCouvertureESet) result.append(modeCouverture); else result.append("<unset>");
		result.append(", typeImagerie: ");
		if (typeImagerieESet) result.append(typeImagerie); else result.append("<unset>");
		result.append(", typeCouverture: ");
		if (typeCouvertureESet) result.append(typeCouverture); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEmploiReconnaissanceImpl
