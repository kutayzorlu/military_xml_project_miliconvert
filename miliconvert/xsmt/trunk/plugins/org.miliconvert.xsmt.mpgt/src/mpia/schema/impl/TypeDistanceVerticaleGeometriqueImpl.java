/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoDistanceVerticaleReference;
import mpia.schema.TypeDictionaryDicoPrecisionDistance;
import mpia.schema.TypeDistanceVerticaleGeometrique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Distance Verticale Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDistanceVerticaleGeometriqueImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDistanceVerticaleGeometriqueImpl#getValeur <em>Valeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDistanceVerticaleGeometriqueImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDistanceVerticaleGeometriqueImpl#getDatum <em>Datum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDistanceVerticaleGeometriqueImpl extends EObjectImpl implements TypeDistanceVerticaleGeometrique {
	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDistanceVerticaleReference REFERENCE_EDEFAULT = TypeDictionaryDicoDistanceVerticaleReference.CHADAT;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDistanceVerticaleReference reference = REFERENCE_EDEFAULT;

	/**
	 * This is true if the Reference attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceESet;

	/**
	 * The default value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeur() <em>Valeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeur()
	 * @generated
	 * @ordered
	 */
	protected double valeur = VALEUR_EDEFAULT;

	/**
	 * This is true if the Valeur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeurESet;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrecisionDistance PRECISION_EDEFAULT = TypeDictionaryDicoPrecisionDistance._10FT;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrecisionDistance precision = PRECISION_EDEFAULT;

	/**
	 * This is true if the Precision attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionESet;

	/**
	 * The default value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected static final String DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatum() <em>Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatum()
	 * @generated
	 * @ordered
	 */
	protected String datum = DATUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDistanceVerticaleGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDistanceVerticaleGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDistanceVerticaleReference getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(TypeDictionaryDicoDistanceVerticaleReference newReference) {
		TypeDictionaryDicoDistanceVerticaleReference oldReference = reference;
		reference = newReference == null ? REFERENCE_EDEFAULT : newReference;
		boolean oldReferenceESet = referenceESet;
		referenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__REFERENCE, oldReference, reference, !oldReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReference() {
		TypeDictionaryDicoDistanceVerticaleReference oldReference = reference;
		boolean oldReferenceESet = referenceESet;
		reference = REFERENCE_EDEFAULT;
		referenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__REFERENCE, oldReference, REFERENCE_EDEFAULT, oldReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReference() {
		return referenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeur() {
		return valeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeur(double newValeur) {
		double oldValeur = valeur;
		valeur = newValeur;
		boolean oldValeurESet = valeurESet;
		valeurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__VALEUR, oldValeur, valeur, !oldValeurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeur() {
		double oldValeur = valeur;
		boolean oldValeurESet = valeurESet;
		valeur = VALEUR_EDEFAULT;
		valeurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__VALEUR, oldValeur, VALEUR_EDEFAULT, oldValeurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeur() {
		return valeurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrecisionDistance getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(TypeDictionaryDicoPrecisionDistance newPrecision) {
		TypeDictionaryDicoPrecisionDistance oldPrecision = precision;
		precision = newPrecision == null ? PRECISION_EDEFAULT : newPrecision;
		boolean oldPrecisionESet = precisionESet;
		precisionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__PRECISION, oldPrecision, precision, !oldPrecisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecision() {
		TypeDictionaryDicoPrecisionDistance oldPrecision = precision;
		boolean oldPrecisionESet = precisionESet;
		precision = PRECISION_EDEFAULT;
		precisionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__PRECISION, oldPrecision, PRECISION_EDEFAULT, oldPrecisionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecision() {
		return precisionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatum() {
		return datum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatum(String newDatum) {
		String oldDatum = datum;
		datum = newDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__DATUM, oldDatum, datum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__REFERENCE:
				return getReference();
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__VALEUR:
				return new Double(getValeur());
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__PRECISION:
				return getPrecision();
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__DATUM:
				return getDatum();
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
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__REFERENCE:
				setReference((TypeDictionaryDicoDistanceVerticaleReference)newValue);
				return;
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__VALEUR:
				setValeur(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__PRECISION:
				setPrecision((TypeDictionaryDicoPrecisionDistance)newValue);
				return;
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__DATUM:
				setDatum((String)newValue);
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
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__REFERENCE:
				unsetReference();
				return;
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__VALEUR:
				unsetValeur();
				return;
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__PRECISION:
				unsetPrecision();
				return;
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__DATUM:
				setDatum(DATUM_EDEFAULT);
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
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__REFERENCE:
				return isSetReference();
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__VALEUR:
				return isSetValeur();
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__PRECISION:
				return isSetPrecision();
			case SchemaPackage.TYPE_DISTANCE_VERTICALE_GEOMETRIQUE__DATUM:
				return DATUM_EDEFAULT == null ? datum != null : !DATUM_EDEFAULT.equals(datum);
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
		result.append(" (reference: ");
		if (referenceESet) result.append(reference); else result.append("<unset>");
		result.append(", valeur: ");
		if (valeurESet) result.append(valeur); else result.append("<unset>");
		result.append(", precision: ");
		if (precisionESet) result.append(precision); else result.append("<unset>");
		result.append(", datum: ");
		result.append(datum);
		result.append(')');
		return result.toString();
	}

} //TypeDistanceVerticaleGeometriqueImpl
