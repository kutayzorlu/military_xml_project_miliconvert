/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoChoixMarqueur;
import mpia.schema.TypeSymbolePoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Symbole Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymbolePointImpl#getMarqueur <em>Marqueur</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSymbolePointImpl extends TypeSymboleLibreImpl implements TypeSymbolePoint {
	/**
	 * The default value of the '{@link #getMarqueur() <em>Marqueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarqueur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoChoixMarqueur MARQUEUR_EDEFAULT = TypeDictionaryDicoChoixMarqueur.WSQU;

	/**
	 * The cached value of the '{@link #getMarqueur() <em>Marqueur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarqueur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoChoixMarqueur marqueur = MARQUEUR_EDEFAULT;

	/**
	 * This is true if the Marqueur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean marqueurESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymbolePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymbolePoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoChoixMarqueur getMarqueur() {
		return marqueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarqueur(TypeDictionaryDicoChoixMarqueur newMarqueur) {
		TypeDictionaryDicoChoixMarqueur oldMarqueur = marqueur;
		marqueur = newMarqueur == null ? MARQUEUR_EDEFAULT : newMarqueur;
		boolean oldMarqueurESet = marqueurESet;
		marqueurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_POINT__MARQUEUR, oldMarqueur, marqueur, !oldMarqueurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMarqueur() {
		TypeDictionaryDicoChoixMarqueur oldMarqueur = marqueur;
		boolean oldMarqueurESet = marqueurESet;
		marqueur = MARQUEUR_EDEFAULT;
		marqueurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_POINT__MARQUEUR, oldMarqueur, MARQUEUR_EDEFAULT, oldMarqueurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMarqueur() {
		return marqueurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_POINT__MARQUEUR:
				return getMarqueur();
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
			case SchemaPackage.TYPE_SYMBOLE_POINT__MARQUEUR:
				setMarqueur((TypeDictionaryDicoChoixMarqueur)newValue);
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
			case SchemaPackage.TYPE_SYMBOLE_POINT__MARQUEUR:
				unsetMarqueur();
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
			case SchemaPackage.TYPE_SYMBOLE_POINT__MARQUEUR:
				return isSetMarqueur();
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
		result.append(" (marqueur: ");
		if (marqueurESet) result.append(marqueur); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSymbolePointImpl
