/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCentreASA;
import mpia.schema.TypeDeploiementMoyensASAc3d;
import mpia.schema.TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement;
import mpia.schema.TypePeriode3D;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Deploiement Moyens AS Ac3d</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMoyensASAc3dImpl#getTypeDeploiement <em>Type Deploiement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMoyensASAc3dImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMoyensASAc3dImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMoyensASAc3dImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMoyensASAc3dImpl#getConcerneCentreOuI3DCentreASA <em>Concerne Centre Ou I3D Centre ASA</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementMoyensASAc3dImpl#getAPourPeriodeValiditePeriode3D <em>APour Periode Validite Periode3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeploiementMoyensASAc3dImpl extends EObjectImpl implements TypeDeploiementMoyensASAc3d {
	/**
	 * The default value of the '{@link #getTypeDeploiement() <em>Type Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeploiement()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement TYPE_DEPLOIEMENT_EDEFAULT = TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement.FOR;

	/**
	 * The cached value of the '{@link #getTypeDeploiement() <em>Type Deploiement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDeploiement()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement typeDeploiement = TYPE_DEPLOIEMENT_EDEFAULT;

	/**
	 * This is true if the Type Deploiement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeDeploiementESet;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneCentreOuI3DCentreASA() <em>Concerne Centre Ou I3D Centre ASA</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneCentreOuI3DCentreASA()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeCentreASA> concerneCentreOuI3DCentreASA;

	/**
	 * The cached value of the '{@link #getAPourPeriodeValiditePeriode3D() <em>APour Periode Validite Periode3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPeriodeValiditePeriode3D()
	 * @generated
	 * @ordered
	 */
	protected TypePeriode3D aPourPeriodeValiditePeriode3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeploiementMoyensASAc3dImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDeploiementMoyensASAc3d();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement getTypeDeploiement() {
		return typeDeploiement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeDeploiement(TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement newTypeDeploiement) {
		TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement oldTypeDeploiement = typeDeploiement;
		typeDeploiement = newTypeDeploiement == null ? TYPE_DEPLOIEMENT_EDEFAULT : newTypeDeploiement;
		boolean oldTypeDeploiementESet = typeDeploiementESet;
		typeDeploiementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__TYPE_DEPLOIEMENT, oldTypeDeploiement, typeDeploiement, !oldTypeDeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeDeploiement() {
		TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement oldTypeDeploiement = typeDeploiement;
		boolean oldTypeDeploiementESet = typeDeploiementESet;
		typeDeploiement = TYPE_DEPLOIEMENT_EDEFAULT;
		typeDeploiementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__TYPE_DEPLOIEMENT, oldTypeDeploiement, TYPE_DEPLOIEMENT_EDEFAULT, oldTypeDeploiementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeDeploiement() {
		return typeDeploiementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeCentreASA> getConcerneCentreOuI3DCentreASA() {
		if (concerneCentreOuI3DCentreASA == null) {
			concerneCentreOuI3DCentreASA = new EObjectContainmentEList<TypeCentreASA>(TypeCentreASA.class, this, SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CONCERNE_CENTRE_OU_I3D_CENTRE_ASA);
		}
		return concerneCentreOuI3DCentreASA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePeriode3D getAPourPeriodeValiditePeriode3D() {
		return aPourPeriodeValiditePeriode3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPeriodeValiditePeriode3D(TypePeriode3D newAPourPeriodeValiditePeriode3D, NotificationChain msgs) {
		TypePeriode3D oldAPourPeriodeValiditePeriode3D = aPourPeriodeValiditePeriode3D;
		aPourPeriodeValiditePeriode3D = newAPourPeriodeValiditePeriode3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D, oldAPourPeriodeValiditePeriode3D, newAPourPeriodeValiditePeriode3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPeriodeValiditePeriode3D(TypePeriode3D newAPourPeriodeValiditePeriode3D) {
		if (newAPourPeriodeValiditePeriode3D != aPourPeriodeValiditePeriode3D) {
			NotificationChain msgs = null;
			if (aPourPeriodeValiditePeriode3D != null)
				msgs = ((InternalEObject)aPourPeriodeValiditePeriode3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D, null, msgs);
			if (newAPourPeriodeValiditePeriode3D != null)
				msgs = ((InternalEObject)newAPourPeriodeValiditePeriode3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D, null, msgs);
			msgs = basicSetAPourPeriodeValiditePeriode3D(newAPourPeriodeValiditePeriode3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D, newAPourPeriodeValiditePeriode3D, newAPourPeriodeValiditePeriode3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CONCERNE_CENTRE_OU_I3D_CENTRE_ASA:
				return ((InternalEList<?>)getConcerneCentreOuI3DCentreASA()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				return basicSetAPourPeriodeValiditePeriode3D(null, msgs);
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
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__TYPE_DEPLOIEMENT:
				return getTypeDeploiement();
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CE:
				return getCE();
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CONCERNE_CENTRE_OU_I3D_CENTRE_ASA:
				return getConcerneCentreOuI3DCentreASA();
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				return getAPourPeriodeValiditePeriode3D();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__TYPE_DEPLOIEMENT:
				setTypeDeploiement((TypeDictionaryDicoDeploiementMoyensASAc3dTypeDeploiement)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CONCERNE_CENTRE_OU_I3D_CENTRE_ASA:
				getConcerneCentreOuI3DCentreASA().clear();
				getConcerneCentreOuI3DCentreASA().addAll((Collection<? extends TypeCentreASA>)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				setAPourPeriodeValiditePeriode3D((TypePeriode3D)newValue);
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
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__TYPE_DEPLOIEMENT:
				unsetTypeDeploiement();
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CONCERNE_CENTRE_OU_I3D_CENTRE_ASA:
				getConcerneCentreOuI3DCentreASA().clear();
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				setAPourPeriodeValiditePeriode3D((TypePeriode3D)null);
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
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__TYPE_DEPLOIEMENT:
				return isSetTypeDeploiement();
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__CONCERNE_CENTRE_OU_I3D_CENTRE_ASA:
				return concerneCentreOuI3DCentreASA != null && !concerneCentreOuI3DCentreASA.isEmpty();
			case SchemaPackage.TYPE_DEPLOIEMENT_MOYENS_AS_AC3D__APOUR_PERIODE_VALIDITE_PERIODE3_D:
				return aPourPeriodeValiditePeriode3D != null;
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
		result.append(" (typeDeploiement: ");
		if (typeDeploiementESet) result.append(typeDeploiement); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDeploiementMoyensASAc3dImpl
