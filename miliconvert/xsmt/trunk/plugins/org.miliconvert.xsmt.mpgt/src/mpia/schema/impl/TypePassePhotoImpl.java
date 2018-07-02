/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypePassePhoto;
import mpia.schema.TypePointGeometrique;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Passe Photo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePassePhotoImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassePhotoImpl#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassePhotoImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassePhotoImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassePhotoImpl#getPointEntreePointGeometrique <em>Point Entree Point Geometrique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePassePhotoImpl#getPointSortiePointGeometrique <em>Point Sortie Point Geometrique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePassePhotoImpl extends EObjectImpl implements TypePassePhoto {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getLargeur() <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected static final double LARGEUR_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLargeur() <em>Largeur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected double largeur = LARGEUR_EDEFAULT;

	/**
	 * This is true if the Largeur attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean largeurESet;

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
	 * The cached value of the '{@link #getPointEntreePointGeometrique() <em>Point Entree Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointEntreePointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique pointEntreePointGeometrique;

	/**
	 * The cached value of the '{@link #getPointSortiePointGeometrique() <em>Point Sortie Point Geometrique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointSortiePointGeometrique()
	 * @generated
	 * @ordered
	 */
	protected TypePointGeometrique pointSortiePointGeometrique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePassePhotoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePassePhoto();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSE_PHOTO__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeur(double newLargeur) {
		double oldLargeur = largeur;
		largeur = newLargeur;
		boolean oldLargeurESet = largeurESet;
		largeurESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSE_PHOTO__LARGEUR, oldLargeur, largeur, !oldLargeurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLargeur() {
		double oldLargeur = largeur;
		boolean oldLargeurESet = largeurESet;
		largeur = LARGEUR_EDEFAULT;
		largeurESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PASSE_PHOTO__LARGEUR, oldLargeur, LARGEUR_EDEFAULT, oldLargeurESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLargeur() {
		return largeurESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSE_PHOTO__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSE_PHOTO__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getPointEntreePointGeometrique() {
		return pointEntreePointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointEntreePointGeometrique(TypePointGeometrique newPointEntreePointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldPointEntreePointGeometrique = pointEntreePointGeometrique;
		pointEntreePointGeometrique = newPointEntreePointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE, oldPointEntreePointGeometrique, newPointEntreePointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointEntreePointGeometrique(TypePointGeometrique newPointEntreePointGeometrique) {
		if (newPointEntreePointGeometrique != pointEntreePointGeometrique) {
			NotificationChain msgs = null;
			if (pointEntreePointGeometrique != null)
				msgs = ((InternalEObject)pointEntreePointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE, null, msgs);
			if (newPointEntreePointGeometrique != null)
				msgs = ((InternalEObject)newPointEntreePointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetPointEntreePointGeometrique(newPointEntreePointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE, newPointEntreePointGeometrique, newPointEntreePointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePointGeometrique getPointSortiePointGeometrique() {
		return pointSortiePointGeometrique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointSortiePointGeometrique(TypePointGeometrique newPointSortiePointGeometrique, NotificationChain msgs) {
		TypePointGeometrique oldPointSortiePointGeometrique = pointSortiePointGeometrique;
		pointSortiePointGeometrique = newPointSortiePointGeometrique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE, oldPointSortiePointGeometrique, newPointSortiePointGeometrique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointSortiePointGeometrique(TypePointGeometrique newPointSortiePointGeometrique) {
		if (newPointSortiePointGeometrique != pointSortiePointGeometrique) {
			NotificationChain msgs = null;
			if (pointSortiePointGeometrique != null)
				msgs = ((InternalEObject)pointSortiePointGeometrique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE, null, msgs);
			if (newPointSortiePointGeometrique != null)
				msgs = ((InternalEObject)newPointSortiePointGeometrique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE, null, msgs);
			msgs = basicSetPointSortiePointGeometrique(newPointSortiePointGeometrique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE, newPointSortiePointGeometrique, newPointSortiePointGeometrique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE:
				return basicSetPointEntreePointGeometrique(null, msgs);
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE:
				return basicSetPointSortiePointGeometrique(null, msgs);
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
			case SchemaPackage.TYPE_PASSE_PHOTO__NOM:
				return getNom();
			case SchemaPackage.TYPE_PASSE_PHOTO__LARGEUR:
				return new Double(getLargeur());
			case SchemaPackage.TYPE_PASSE_PHOTO__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PASSE_PHOTO__CE:
				return getCE();
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE:
				return getPointEntreePointGeometrique();
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE:
				return getPointSortiePointGeometrique();
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
			case SchemaPackage.TYPE_PASSE_PHOTO__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__LARGEUR:
				setLargeur(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE:
				setPointEntreePointGeometrique((TypePointGeometrique)newValue);
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE:
				setPointSortiePointGeometrique((TypePointGeometrique)newValue);
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
			case SchemaPackage.TYPE_PASSE_PHOTO__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__LARGEUR:
				unsetLargeur();
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE:
				setPointEntreePointGeometrique((TypePointGeometrique)null);
				return;
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE:
				setPointSortiePointGeometrique((TypePointGeometrique)null);
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
			case SchemaPackage.TYPE_PASSE_PHOTO__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_PASSE_PHOTO__LARGEUR:
				return isSetLargeur();
			case SchemaPackage.TYPE_PASSE_PHOTO__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PASSE_PHOTO__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_ENTREE_POINT_GEOMETRIQUE:
				return pointEntreePointGeometrique != null;
			case SchemaPackage.TYPE_PASSE_PHOTO__POINT_SORTIE_POINT_GEOMETRIQUE:
				return pointSortiePointGeometrique != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", largeur: ");
		if (largeurESet) result.append(largeur); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePassePhotoImpl
