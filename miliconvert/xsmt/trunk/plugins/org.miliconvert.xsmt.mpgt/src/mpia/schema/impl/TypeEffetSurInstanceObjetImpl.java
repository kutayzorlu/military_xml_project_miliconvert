/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque;
import mpia.schema.TypeEffetProfondeurASS;
import mpia.schema.TypeEffetSurInstanceObjet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Effet Sur Instance Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEffetSurInstanceObjetImpl#getTypeAttaque <em>Type Attaque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetSurInstanceObjetImpl#getFraction <em>Fraction</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetSurInstanceObjetImpl#getEstEnProfondeurEffetProfondeurASS <em>Est En Profondeur Effet Profondeur ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetSurInstanceObjetImpl#getAssocieCommeInstanceObjetInstanceObjet <em>Associe Comme Instance Objet Instance Objet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEffetSurInstanceObjetImpl extends EObjectImpl implements TypeEffetSurInstanceObjet {
	/**
	 * The default value of the '{@link #getTypeAttaque() <em>Type Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttaque()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque TYPE_ATTAQUE_EDEFAULT = TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque.TUBEARTY;

	/**
	 * The cached value of the '{@link #getTypeAttaque() <em>Type Attaque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeAttaque()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque typeAttaque = TYPE_ATTAQUE_EDEFAULT;

	/**
	 * This is true if the Type Attaque attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeAttaqueESet;

	/**
	 * The default value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected static final double FRACTION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFraction() <em>Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFraction()
	 * @generated
	 * @ordered
	 */
	protected double fraction = FRACTION_EDEFAULT;

	/**
	 * This is true if the Fraction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fractionESet;

	/**
	 * The cached value of the '{@link #getEstEnProfondeurEffetProfondeurASS() <em>Est En Profondeur Effet Profondeur ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEnProfondeurEffetProfondeurASS()
	 * @generated
	 * @ordered
	 */
	protected TypeEffetProfondeurASS estEnProfondeurEffetProfondeurASS;

	/**
	 * The cached value of the '{@link #getAssocieCommeInstanceObjetInstanceObjet() <em>Associe Comme Instance Objet Instance Objet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeInstanceObjetInstanceObjet()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeInstanceObjetInstanceObjet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEffetSurInstanceObjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEffetSurInstanceObjet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque getTypeAttaque() {
		return typeAttaque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeAttaque(TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque newTypeAttaque) {
		TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque oldTypeAttaque = typeAttaque;
		typeAttaque = newTypeAttaque == null ? TYPE_ATTAQUE_EDEFAULT : newTypeAttaque;
		boolean oldTypeAttaqueESet = typeAttaqueESet;
		typeAttaqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__TYPE_ATTAQUE, oldTypeAttaque, typeAttaque, !oldTypeAttaqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeAttaque() {
		TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque oldTypeAttaque = typeAttaque;
		boolean oldTypeAttaqueESet = typeAttaqueESet;
		typeAttaque = TYPE_ATTAQUE_EDEFAULT;
		typeAttaqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__TYPE_ATTAQUE, oldTypeAttaque, TYPE_ATTAQUE_EDEFAULT, oldTypeAttaqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeAttaque() {
		return typeAttaqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFraction() {
		return fraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFraction(double newFraction) {
		double oldFraction = fraction;
		fraction = newFraction;
		boolean oldFractionESet = fractionESet;
		fractionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__FRACTION, oldFraction, fraction, !oldFractionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFraction() {
		double oldFraction = fraction;
		boolean oldFractionESet = fractionESet;
		fraction = FRACTION_EDEFAULT;
		fractionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__FRACTION, oldFraction, FRACTION_EDEFAULT, oldFractionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFraction() {
		return fractionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeEffetProfondeurASS getEstEnProfondeurEffetProfondeurASS() {
		return estEnProfondeurEffetProfondeurASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstEnProfondeurEffetProfondeurASS(TypeEffetProfondeurASS newEstEnProfondeurEffetProfondeurASS, NotificationChain msgs) {
		TypeEffetProfondeurASS oldEstEnProfondeurEffetProfondeurASS = estEnProfondeurEffetProfondeurASS;
		estEnProfondeurEffetProfondeurASS = newEstEnProfondeurEffetProfondeurASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS, oldEstEnProfondeurEffetProfondeurASS, newEstEnProfondeurEffetProfondeurASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstEnProfondeurEffetProfondeurASS(TypeEffetProfondeurASS newEstEnProfondeurEffetProfondeurASS) {
		if (newEstEnProfondeurEffetProfondeurASS != estEnProfondeurEffetProfondeurASS) {
			NotificationChain msgs = null;
			if (estEnProfondeurEffetProfondeurASS != null)
				msgs = ((InternalEObject)estEnProfondeurEffetProfondeurASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS, null, msgs);
			if (newEstEnProfondeurEffetProfondeurASS != null)
				msgs = ((InternalEObject)newEstEnProfondeurEffetProfondeurASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS, null, msgs);
			msgs = basicSetEstEnProfondeurEffetProfondeurASS(newEstEnProfondeurEffetProfondeurASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS, newEstEnProfondeurEffetProfondeurASS, newEstEnProfondeurEffetProfondeurASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeInstanceObjetInstanceObjet() {
		return associeCommeInstanceObjetInstanceObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeInstanceObjetInstanceObjet = associeCommeInstanceObjetInstanceObjet;
		associeCommeInstanceObjetInstanceObjet = newAssocieCommeInstanceObjetInstanceObjet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, oldAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeInstanceObjetInstanceObjet(TypeAssociation newAssocieCommeInstanceObjetInstanceObjet) {
		if (newAssocieCommeInstanceObjetInstanceObjet != associeCommeInstanceObjetInstanceObjet) {
			NotificationChain msgs = null;
			if (associeCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)associeCommeInstanceObjetInstanceObjet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			if (newAssocieCommeInstanceObjetInstanceObjet != null)
				msgs = ((InternalEObject)newAssocieCommeInstanceObjetInstanceObjet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, null, msgs);
			msgs = basicSetAssocieCommeInstanceObjetInstanceObjet(newAssocieCommeInstanceObjetInstanceObjet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET, newAssocieCommeInstanceObjetInstanceObjet, newAssocieCommeInstanceObjetInstanceObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS:
				return basicSetEstEnProfondeurEffetProfondeurASS(null, msgs);
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return basicSetAssocieCommeInstanceObjetInstanceObjet(null, msgs);
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
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__TYPE_ATTAQUE:
				return getTypeAttaque();
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__FRACTION:
				return new Double(getFraction());
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS:
				return getEstEnProfondeurEffetProfondeurASS();
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return getAssocieCommeInstanceObjetInstanceObjet();
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
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__TYPE_ATTAQUE:
				setTypeAttaque((TypeDictionaryDicoEffetSurInstanceObjetTypeAttaque)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__FRACTION:
				setFraction(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS:
				setEstEnProfondeurEffetProfondeurASS((TypeEffetProfondeurASS)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__TYPE_ATTAQUE:
				unsetTypeAttaque();
				return;
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__FRACTION:
				unsetFraction();
				return;
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS:
				setEstEnProfondeurEffetProfondeurASS((TypeEffetProfondeurASS)null);
				return;
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				setAssocieCommeInstanceObjetInstanceObjet((TypeAssociation)null);
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
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__TYPE_ATTAQUE:
				return isSetTypeAttaque();
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__FRACTION:
				return isSetFraction();
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__EST_EN_PROFONDEUR_EFFET_PROFONDEUR_ASS:
				return estEnProfondeurEffetProfondeurASS != null;
			case SchemaPackage.TYPE_EFFET_SUR_INSTANCE_OBJET__ASSOCIE_COMME_INSTANCE_OBJET_INSTANCE_OBJET:
				return associeCommeInstanceObjetInstanceObjet != null;
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
		result.append(" (typeAttaque: ");
		if (typeAttaqueESet) result.append(typeAttaque); else result.append("<unset>");
		result.append(", fraction: ");
		if (fractionESet) result.append(fraction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEffetSurInstanceObjetImpl
