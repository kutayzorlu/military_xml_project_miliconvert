/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTailleTexte;
import mpia.schema.TypeSymboleTexte;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Symbole Texte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymboleTexteImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleTexteImpl#getTailleTexte <em>Taille Texte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSymboleTexteImpl extends TypeSymboleLibreImpl implements TypeSymboleTexte {
	/**
	 * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTexte()
	 * @generated
	 * @ordered
	 */
	protected String texte = TEXTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTailleTexte() <em>Taille Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleTexte()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTailleTexte TAILLE_TEXTE_EDEFAULT = TypeDictionaryDicoTailleTexte._16;

	/**
	 * The cached value of the '{@link #getTailleTexte() <em>Taille Texte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTailleTexte()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTailleTexte tailleTexte = TAILLE_TEXTE_EDEFAULT;

	/**
	 * This is true if the Taille Texte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tailleTexteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymboleTexteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymboleTexte();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTexte() {
		return texte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTexte(String newTexte) {
		String oldTexte = texte;
		texte = newTexte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TEXTE__TEXTE, oldTexte, texte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTailleTexte getTailleTexte() {
		return tailleTexte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTailleTexte(TypeDictionaryDicoTailleTexte newTailleTexte) {
		TypeDictionaryDicoTailleTexte oldTailleTexte = tailleTexte;
		tailleTexte = newTailleTexte == null ? TAILLE_TEXTE_EDEFAULT : newTailleTexte;
		boolean oldTailleTexteESet = tailleTexteESet;
		tailleTexteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_TEXTE__TAILLE_TEXTE, oldTailleTexte, tailleTexte, !oldTailleTexteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTailleTexte() {
		TypeDictionaryDicoTailleTexte oldTailleTexte = tailleTexte;
		boolean oldTailleTexteESet = tailleTexteESet;
		tailleTexte = TAILLE_TEXTE_EDEFAULT;
		tailleTexteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_TEXTE__TAILLE_TEXTE, oldTailleTexte, TAILLE_TEXTE_EDEFAULT, oldTailleTexteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTailleTexte() {
		return tailleTexteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_TEXTE__TEXTE:
				return getTexte();
			case SchemaPackage.TYPE_SYMBOLE_TEXTE__TAILLE_TEXTE:
				return getTailleTexte();
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
			case SchemaPackage.TYPE_SYMBOLE_TEXTE__TEXTE:
				setTexte((String)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TEXTE__TAILLE_TEXTE:
				setTailleTexte((TypeDictionaryDicoTailleTexte)newValue);
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
			case SchemaPackage.TYPE_SYMBOLE_TEXTE__TEXTE:
				setTexte(TEXTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_SYMBOLE_TEXTE__TAILLE_TEXTE:
				unsetTailleTexte();
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
			case SchemaPackage.TYPE_SYMBOLE_TEXTE__TEXTE:
				return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
			case SchemaPackage.TYPE_SYMBOLE_TEXTE__TAILLE_TEXTE:
				return isSetTailleTexte();
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
		result.append(" (texte: ");
		result.append(texte);
		result.append(", tailleTexte: ");
		if (tailleTexteESet) result.append(tailleTexte); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSymboleTexteImpl
