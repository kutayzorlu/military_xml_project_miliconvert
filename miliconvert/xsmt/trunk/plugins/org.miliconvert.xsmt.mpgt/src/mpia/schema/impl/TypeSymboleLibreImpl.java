/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoCouleur;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypeSymboleLibre;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Symbole Libre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeSymboleLibreImpl#getCouleur <em>Couleur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeSymboleLibreImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeSymboleLibreImpl extends TypeRacineOperationnelleImpl implements TypeSymboleLibre {
	/**
	 * The default value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCouleur COULEUR_EDEFAULT = TypeDictionaryDicoCouleur.BLACK;

	/**
	 * The cached value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCouleur couleur = COULEUR_EDEFAULT;

	/**
	 * This is true if the Couleur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean couleurESet;

	/**
	 * The cached value of the '{@link #getEstLocaliseEnLocalisation() <em>Est Localise En Localisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLocaliseEnLocalisation()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisation estLocaliseEnLocalisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeSymboleLibreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeSymboleLibre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCouleur getCouleur() {
		return couleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleur(TypeDictionaryDicoCouleur newCouleur) {
		TypeDictionaryDicoCouleur oldCouleur = couleur;
		couleur = newCouleur == null ? COULEUR_EDEFAULT : newCouleur;
		boolean oldCouleurESet = couleurESet;
		couleurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_LIBRE__COULEUR, oldCouleur, couleur, !oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCouleur() {
		TypeDictionaryDicoCouleur oldCouleur = couleur;
		boolean oldCouleurESet = couleurESet;
		couleur = COULEUR_EDEFAULT;
		couleurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_SYMBOLE_LIBRE__COULEUR, oldCouleur, COULEUR_EDEFAULT, oldCouleurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCouleur() {
		return couleurESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisation getEstLocaliseEnLocalisation() {
		return estLocaliseEnLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation, NotificationChain msgs) {
		TypeLocalisation oldEstLocaliseEnLocalisation = estLocaliseEnLocalisation;
		estLocaliseEnLocalisation = newEstLocaliseEnLocalisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION, oldEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLocaliseEnLocalisation(TypeLocalisation newEstLocaliseEnLocalisation) {
		if (newEstLocaliseEnLocalisation != estLocaliseEnLocalisation) {
			NotificationChain msgs = null;
			if (estLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)estLocaliseEnLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			if (newEstLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisation(newEstLocaliseEnLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION, newEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				return basicSetEstLocaliseEnLocalisation(null, msgs);
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
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__COULEUR:
				return getCouleur();
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				return getEstLocaliseEnLocalisation();
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
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__COULEUR:
				setCouleur((TypeDictionaryDicoCouleur)newValue);
				return;
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)newValue);
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
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__COULEUR:
				unsetCouleur();
				return;
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				setEstLocaliseEnLocalisation((TypeLocalisation)null);
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
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__COULEUR:
				return isSetCouleur();
			case SchemaPackage.TYPE_SYMBOLE_LIBRE__EST_LOCALISE_EN_LOCALISATION:
				return estLocaliseEnLocalisation != null;
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
		result.append(" (couleur: ");
		if (couleurESet) result.append(couleur); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeSymboleLibreImpl
