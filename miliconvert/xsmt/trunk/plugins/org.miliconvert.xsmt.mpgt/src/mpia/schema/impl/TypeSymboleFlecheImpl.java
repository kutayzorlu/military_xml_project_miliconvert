/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoLargeurFleche;
import mpia.schema.TypeSymboleFleche;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Symbole Fleche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymboleFlecheImpl#getLargeurFleche <em>Largeur Fleche</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSymboleFlecheImpl extends TypeSymboleSurfaciqueImpl implements TypeSymboleFleche {
	/**
	 * The default value of the '{@link #getLargeurFleche() <em>Largeur Fleche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurFleche()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLargeurFleche LARGEUR_FLECHE_EDEFAULT = TypeDictionaryDicoLargeurFleche._1;

	/**
	 * The cached value of the '{@link #getLargeurFleche() <em>Largeur Fleche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurFleche()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLargeurFleche largeurFleche = LARGEUR_FLECHE_EDEFAULT;

	/**
	 * This is true if the Largeur Fleche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean largeurFlecheESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymboleFlecheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymboleFleche();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLargeurFleche getLargeurFleche() {
		return largeurFleche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurFleche(TypeDictionaryDicoLargeurFleche newLargeurFleche) {
		TypeDictionaryDicoLargeurFleche oldLargeurFleche = largeurFleche;
		largeurFleche = newLargeurFleche == null ? LARGEUR_FLECHE_EDEFAULT : newLargeurFleche;
		boolean oldLargeurFlecheESet = largeurFlecheESet;
		largeurFlecheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_FLECHE__LARGEUR_FLECHE, oldLargeurFleche, largeurFleche, !oldLargeurFlecheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLargeurFleche() {
		TypeDictionaryDicoLargeurFleche oldLargeurFleche = largeurFleche;
		boolean oldLargeurFlecheESet = largeurFlecheESet;
		largeurFleche = LARGEUR_FLECHE_EDEFAULT;
		largeurFlecheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_FLECHE__LARGEUR_FLECHE, oldLargeurFleche, LARGEUR_FLECHE_EDEFAULT, oldLargeurFlecheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLargeurFleche() {
		return largeurFlecheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_FLECHE__LARGEUR_FLECHE:
				return getLargeurFleche();
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
			case SchemaPackage.TYPE_SYMBOLE_FLECHE__LARGEUR_FLECHE:
				setLargeurFleche((TypeDictionaryDicoLargeurFleche)newValue);
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
			case SchemaPackage.TYPE_SYMBOLE_FLECHE__LARGEUR_FLECHE:
				unsetLargeurFleche();
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
			case SchemaPackage.TYPE_SYMBOLE_FLECHE__LARGEUR_FLECHE:
				return isSetLargeurFleche();
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
		result.append(" (largeurFleche: ");
		if (largeurFlecheESet) result.append(largeurFleche); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSymboleFlecheImpl
