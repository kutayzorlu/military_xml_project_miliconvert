/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeDictionaryDicoHippodromeCodeAlignement;
import mpia.schema.TypeHippodromeGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Hippodrome Geometrique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeHippodromeGeometriqueImpl#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHippodromeGeometriqueImpl#getCodeAlignement <em>Code Alignement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHippodromeGeometriqueImpl#getAPourPremierPointCoordonneesLatLong <em>APour Premier Point Coordonnees Lat Long</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeHippodromeGeometriqueImpl#getAPourSecondPointCoordonneesLatLong <em>APour Second Point Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeHippodromeGeometriqueImpl extends TypeObjetGeometriqueImpl implements TypeHippodromeGeometrique {
	/**
	 * The cached value of the '{@link #getLargeur() <em>Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeur;

	/**
	 * The default value of the '{@link #getCodeAlignement() <em>Code Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAlignement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoHippodromeCodeAlignement CODE_ALIGNEMENT_EDEFAULT = TypeDictionaryDicoHippodromeCodeAlignement.CENTRE;

	/**
	 * The cached value of the '{@link #getCodeAlignement() <em>Code Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeAlignement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoHippodromeCodeAlignement codeAlignement = CODE_ALIGNEMENT_EDEFAULT;

	/**
	 * This is true if the Code Alignement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeAlignementESet;

	/**
	 * The cached value of the '{@link #getAPourPremierPointCoordonneesLatLong() <em>APour Premier Point Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPremierPointCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourPremierPointCoordonneesLatLong;

	/**
	 * The cached value of the '{@link #getAPourSecondPointCoordonneesLatLong() <em>APour Second Point Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSecondPointCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourSecondPointCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeHippodromeGeometriqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeHippodromeGeometrique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeur() {
		return largeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeur(TypeDataTypeLongueur newLargeur, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeur = largeur;
		largeur = newLargeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR, oldLargeur, newLargeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeur(TypeDataTypeLongueur newLargeur) {
		if (newLargeur != largeur) {
			NotificationChain msgs = null;
			if (largeur != null)
				msgs = ((InternalEObject)largeur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR, null, msgs);
			if (newLargeur != null)
				msgs = ((InternalEObject)newLargeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR, null, msgs);
			msgs = basicSetLargeur(newLargeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR, newLargeur, newLargeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoHippodromeCodeAlignement getCodeAlignement() {
		return codeAlignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeAlignement(TypeDictionaryDicoHippodromeCodeAlignement newCodeAlignement) {
		TypeDictionaryDicoHippodromeCodeAlignement oldCodeAlignement = codeAlignement;
		codeAlignement = newCodeAlignement == null ? CODE_ALIGNEMENT_EDEFAULT : newCodeAlignement;
		boolean oldCodeAlignementESet = codeAlignementESet;
		codeAlignementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__CODE_ALIGNEMENT, oldCodeAlignement, codeAlignement, !oldCodeAlignementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodeAlignement() {
		TypeDictionaryDicoHippodromeCodeAlignement oldCodeAlignement = codeAlignement;
		boolean oldCodeAlignementESet = codeAlignementESet;
		codeAlignement = CODE_ALIGNEMENT_EDEFAULT;
		codeAlignementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__CODE_ALIGNEMENT, oldCodeAlignement, CODE_ALIGNEMENT_EDEFAULT, oldCodeAlignementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodeAlignement() {
		return codeAlignementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourPremierPointCoordonneesLatLong() {
		return aPourPremierPointCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPremierPointCoordonneesLatLong(TypeCoordonneesLatLong newAPourPremierPointCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourPremierPointCoordonneesLatLong = aPourPremierPointCoordonneesLatLong;
		aPourPremierPointCoordonneesLatLong = newAPourPremierPointCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG, oldAPourPremierPointCoordonneesLatLong, newAPourPremierPointCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPremierPointCoordonneesLatLong(TypeCoordonneesLatLong newAPourPremierPointCoordonneesLatLong) {
		if (newAPourPremierPointCoordonneesLatLong != aPourPremierPointCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourPremierPointCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourPremierPointCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourPremierPointCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourPremierPointCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourPremierPointCoordonneesLatLong(newAPourPremierPointCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG, newAPourPremierPointCoordonneesLatLong, newAPourPremierPointCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourSecondPointCoordonneesLatLong() {
		return aPourSecondPointCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSecondPointCoordonneesLatLong(TypeCoordonneesLatLong newAPourSecondPointCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourSecondPointCoordonneesLatLong = aPourSecondPointCoordonneesLatLong;
		aPourSecondPointCoordonneesLatLong = newAPourSecondPointCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG, oldAPourSecondPointCoordonneesLatLong, newAPourSecondPointCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSecondPointCoordonneesLatLong(TypeCoordonneesLatLong newAPourSecondPointCoordonneesLatLong) {
		if (newAPourSecondPointCoordonneesLatLong != aPourSecondPointCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourSecondPointCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourSecondPointCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourSecondPointCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourSecondPointCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourSecondPointCoordonneesLatLong(newAPourSecondPointCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG, newAPourSecondPointCoordonneesLatLong, newAPourSecondPointCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR:
				return basicSetLargeur(null, msgs);
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG:
				return basicSetAPourPremierPointCoordonneesLatLong(null, msgs);
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG:
				return basicSetAPourSecondPointCoordonneesLatLong(null, msgs);
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
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR:
				return getLargeur();
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__CODE_ALIGNEMENT:
				return getCodeAlignement();
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG:
				return getAPourPremierPointCoordonneesLatLong();
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG:
				return getAPourSecondPointCoordonneesLatLong();
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
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR:
				setLargeur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__CODE_ALIGNEMENT:
				setCodeAlignement((TypeDictionaryDicoHippodromeCodeAlignement)newValue);
				return;
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG:
				setAPourPremierPointCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
				return;
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG:
				setAPourSecondPointCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
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
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR:
				setLargeur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__CODE_ALIGNEMENT:
				unsetCodeAlignement();
				return;
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG:
				setAPourPremierPointCoordonneesLatLong((TypeCoordonneesLatLong)null);
				return;
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG:
				setAPourSecondPointCoordonneesLatLong((TypeCoordonneesLatLong)null);
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
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__LARGEUR:
				return largeur != null;
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__CODE_ALIGNEMENT:
				return isSetCodeAlignement();
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_PREMIER_POINT_COORDONNEES_LAT_LONG:
				return aPourPremierPointCoordonneesLatLong != null;
			case SchemaPackage.TYPE_HIPPODROME_GEOMETRIQUE__APOUR_SECOND_POINT_COORDONNEES_LAT_LONG:
				return aPourSecondPointCoordonneesLatLong != null;
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
		result.append(" (codeAlignement: ");
		if (codeAlignementESet) result.append(codeAlignement); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeHippodromeGeometriqueImpl
