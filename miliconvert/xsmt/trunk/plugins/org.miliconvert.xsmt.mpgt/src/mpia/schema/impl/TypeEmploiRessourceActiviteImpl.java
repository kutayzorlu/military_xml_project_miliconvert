/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEmploiRessourceActiviteMethodeControle;
import mpia.schema.TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir;
import mpia.schema.TypeEmploiRessourceActivite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Emploi Ressource Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEmploiRessourceActiviteImpl#getTypeTrajectoireTir <em>Type Trajectoire Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiRessourceActiviteImpl#getAngleTir <em>Angle Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEmploiRessourceActiviteImpl#getMethodeControle <em>Methode Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeEmploiRessourceActiviteImpl extends EObjectImpl implements TypeEmploiRessourceActivite {
	/**
	 * The default value of the '{@link #getTypeTrajectoireTir() <em>Type Trajectoire Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTrajectoireTir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir TYPE_TRAJECTOIRE_TIR_EDEFAULT = TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir.HIGH;

	/**
	 * The cached value of the '{@link #getTypeTrajectoireTir() <em>Type Trajectoire Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTrajectoireTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir typeTrajectoireTir = TYPE_TRAJECTOIRE_TIR_EDEFAULT;

	/**
	 * This is true if the Type Trajectoire Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeTrajectoireTirESet;

	/**
	 * The cached value of the '{@link #getAngleTir() <em>Angle Tir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngleTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle angleTir;

	/**
	 * The default value of the '{@link #getMethodeControle() <em>Methode Controle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodeControle()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEmploiRessourceActiviteMethodeControle METHODE_CONTROLE_EDEFAULT = TypeDictionaryDicoEmploiRessourceActiviteMethodeControle.ASORD;

	/**
	 * The cached value of the '{@link #getMethodeControle() <em>Methode Controle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodeControle()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEmploiRessourceActiviteMethodeControle methodeControle = METHODE_CONTROLE_EDEFAULT;

	/**
	 * This is true if the Methode Controle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean methodeControleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEmploiRessourceActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEmploiRessourceActivite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir getTypeTrajectoireTir() {
		return typeTrajectoireTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeTrajectoireTir(TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir newTypeTrajectoireTir) {
		TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir oldTypeTrajectoireTir = typeTrajectoireTir;
		typeTrajectoireTir = newTypeTrajectoireTir == null ? TYPE_TRAJECTOIRE_TIR_EDEFAULT : newTypeTrajectoireTir;
		boolean oldTypeTrajectoireTirESet = typeTrajectoireTirESet;
		typeTrajectoireTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__TYPE_TRAJECTOIRE_TIR, oldTypeTrajectoireTir, typeTrajectoireTir, !oldTypeTrajectoireTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeTrajectoireTir() {
		TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir oldTypeTrajectoireTir = typeTrajectoireTir;
		boolean oldTypeTrajectoireTirESet = typeTrajectoireTirESet;
		typeTrajectoireTir = TYPE_TRAJECTOIRE_TIR_EDEFAULT;
		typeTrajectoireTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__TYPE_TRAJECTOIRE_TIR, oldTypeTrajectoireTir, TYPE_TRAJECTOIRE_TIR_EDEFAULT, oldTypeTrajectoireTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeTrajectoireTir() {
		return typeTrajectoireTirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getAngleTir() {
		return angleTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngleTir(TypeDataTypeAngle newAngleTir, NotificationChain msgs) {
		TypeDataTypeAngle oldAngleTir = angleTir;
		angleTir = newAngleTir;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR, oldAngleTir, newAngleTir);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngleTir(TypeDataTypeAngle newAngleTir) {
		if (newAngleTir != angleTir) {
			NotificationChain msgs = null;
			if (angleTir != null)
				msgs = ((InternalEObject)angleTir).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR, null, msgs);
			if (newAngleTir != null)
				msgs = ((InternalEObject)newAngleTir).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR, null, msgs);
			msgs = basicSetAngleTir(newAngleTir, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR, newAngleTir, newAngleTir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEmploiRessourceActiviteMethodeControle getMethodeControle() {
		return methodeControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodeControle(TypeDictionaryDicoEmploiRessourceActiviteMethodeControle newMethodeControle) {
		TypeDictionaryDicoEmploiRessourceActiviteMethodeControle oldMethodeControle = methodeControle;
		methodeControle = newMethodeControle == null ? METHODE_CONTROLE_EDEFAULT : newMethodeControle;
		boolean oldMethodeControleESet = methodeControleESet;
		methodeControleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__METHODE_CONTROLE, oldMethodeControle, methodeControle, !oldMethodeControleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMethodeControle() {
		TypeDictionaryDicoEmploiRessourceActiviteMethodeControle oldMethodeControle = methodeControle;
		boolean oldMethodeControleESet = methodeControleESet;
		methodeControle = METHODE_CONTROLE_EDEFAULT;
		methodeControleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__METHODE_CONTROLE, oldMethodeControle, METHODE_CONTROLE_EDEFAULT, oldMethodeControleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMethodeControle() {
		return methodeControleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR:
				return basicSetAngleTir(null, msgs);
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
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__TYPE_TRAJECTOIRE_TIR:
				return getTypeTrajectoireTir();
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR:
				return getAngleTir();
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__METHODE_CONTROLE:
				return getMethodeControle();
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
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__TYPE_TRAJECTOIRE_TIR:
				setTypeTrajectoireTir((TypeDictionaryDicoEmploiRessourceActiviteTypeTrajectoireTir)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR:
				setAngleTir((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__METHODE_CONTROLE:
				setMethodeControle((TypeDictionaryDicoEmploiRessourceActiviteMethodeControle)newValue);
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
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__TYPE_TRAJECTOIRE_TIR:
				unsetTypeTrajectoireTir();
				return;
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR:
				setAngleTir((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__METHODE_CONTROLE:
				unsetMethodeControle();
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
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__TYPE_TRAJECTOIRE_TIR:
				return isSetTypeTrajectoireTir();
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__ANGLE_TIR:
				return angleTir != null;
			case SchemaPackage.TYPE_EMPLOI_RESSOURCE_ACTIVITE__METHODE_CONTROLE:
				return isSetMethodeControle();
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
		result.append(" (typeTrajectoireTir: ");
		if (typeTrajectoireTirESet) result.append(typeTrajectoireTir); else result.append("<unset>");
		result.append(", methodeControle: ");
		if (methodeControleESet) result.append(methodeControle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEmploiRessourceActiviteImpl
