/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLocalisation;
import mpia.schema.TypePointUsager;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Point Usager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePointUsagerImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointUsagerImpl#getNomAbrege <em>Nom Abrege</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointUsagerImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointUsagerImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePointUsagerImpl#getEstLocaliseEnLocalisation <em>Est Localise En Localisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePointUsagerImpl extends EObjectImpl implements TypePointUsager {
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
	 * The default value of the '{@link #getNomAbrege() <em>Nom Abrege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAbrege()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_ABREGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomAbrege() <em>Nom Abrege</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomAbrege()
	 * @generated
	 * @ordered
	 */
	protected String nomAbrege = NOM_ABREGE_EDEFAULT;

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
	protected TypePointUsagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePointUsager();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_USAGER__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomAbrege() {
		return nomAbrege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomAbrege(String newNomAbrege) {
		String oldNomAbrege = nomAbrege;
		nomAbrege = newNomAbrege;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_USAGER__NOM_ABREGE, oldNomAbrege, nomAbrege));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_USAGER__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_USAGER__CE, oldCE, cE));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION, oldEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation);
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
				msgs = ((InternalEObject)estLocaliseEnLocalisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			if (newEstLocaliseEnLocalisation != null)
				msgs = ((InternalEObject)newEstLocaliseEnLocalisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION, null, msgs);
			msgs = basicSetEstLocaliseEnLocalisation(newEstLocaliseEnLocalisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION, newEstLocaliseEnLocalisation, newEstLocaliseEnLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION:
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
			case SchemaPackage.TYPE_POINT_USAGER__NOM:
				return getNom();
			case SchemaPackage.TYPE_POINT_USAGER__NOM_ABREGE:
				return getNomAbrege();
			case SchemaPackage.TYPE_POINT_USAGER__CTE:
				return getCTE();
			case SchemaPackage.TYPE_POINT_USAGER__CE:
				return getCE();
			case SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION:
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
			case SchemaPackage.TYPE_POINT_USAGER__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_USAGER__NOM_ABREGE:
				setNomAbrege((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_USAGER__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_USAGER__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION:
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
			case SchemaPackage.TYPE_POINT_USAGER__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_USAGER__NOM_ABREGE:
				setNomAbrege(NOM_ABREGE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_USAGER__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_USAGER__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION:
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
			case SchemaPackage.TYPE_POINT_USAGER__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_POINT_USAGER__NOM_ABREGE:
				return NOM_ABREGE_EDEFAULT == null ? nomAbrege != null : !NOM_ABREGE_EDEFAULT.equals(nomAbrege);
			case SchemaPackage.TYPE_POINT_USAGER__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_POINT_USAGER__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_POINT_USAGER__EST_LOCALISE_EN_LOCALISATION:
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", nomAbrege: ");
		result.append(nomAbrege);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePointUsagerImpl
