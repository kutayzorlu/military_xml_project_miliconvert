/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeEffectifNecessaire;
import mpia.schema.TypeMoyensGenie;
import mpia.schema.TypeMoyensNecessaires;

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
 * An implementation of the model object '<em><b>Type Moyens Genie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMoyensGenieImpl#getDuree <em>Duree</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensGenieImpl#getDistanceCalcul <em>Distance Calcul</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensGenieImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensGenieImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensGenieImpl#getAPourVarianteRealisationVarianteTravail <em>APour Variante Realisation Variante Travail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensGenieImpl#getConcerneEffectifsEffectifNecessaire <em>Concerne Effectifs Effectif Necessaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMoyensGenieImpl#getConcerneMoyensMoyensNecessaires <em>Concerne Moyens Moyens Necessaires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMoyensGenieImpl extends EObjectImpl implements TypeMoyensGenie {
	/**
	 * The cached value of the '{@link #getDuree() <em>Duree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuree()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree duree;

	/**
	 * The default value of the '{@link #getDistanceCalcul() <em>Distance Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceCalcul()
	 * @generated
	 * @ordered
	 */
	protected static final long DISTANCE_CALCUL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDistanceCalcul() <em>Distance Calcul</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistanceCalcul()
	 * @generated
	 * @ordered
	 */
	protected long distanceCalcul = DISTANCE_CALCUL_EDEFAULT;

	/**
	 * This is true if the Distance Calcul attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distanceCalculESet;

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
	 * The cached value of the '{@link #getAPourVarianteRealisationVarianteTravail() <em>APour Variante Realisation Variante Travail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourVarianteRealisationVarianteTravail()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourVarianteRealisationVarianteTravail;

	/**
	 * The cached value of the '{@link #getConcerneEffectifsEffectifNecessaire() <em>Concerne Effectifs Effectif Necessaire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneEffectifsEffectifNecessaire()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffectifNecessaire> concerneEffectifsEffectifNecessaire;

	/**
	 * The cached value of the '{@link #getConcerneMoyensMoyensNecessaires() <em>Concerne Moyens Moyens Necessaires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneMoyensMoyensNecessaires()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyensNecessaires> concerneMoyensMoyensNecessaires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMoyensGenieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMoyensGenie();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDuree() {
		return duree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuree(TypeDataTypeDuree newDuree, NotificationChain msgs) {
		TypeDataTypeDuree oldDuree = duree;
		duree = newDuree;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_GENIE__DUREE, oldDuree, newDuree);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuree(TypeDataTypeDuree newDuree) {
		if (newDuree != duree) {
			NotificationChain msgs = null;
			if (duree != null)
				msgs = ((InternalEObject)duree).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_GENIE__DUREE, null, msgs);
			if (newDuree != null)
				msgs = ((InternalEObject)newDuree).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_GENIE__DUREE, null, msgs);
			msgs = basicSetDuree(newDuree, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_GENIE__DUREE, newDuree, newDuree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDistanceCalcul() {
		return distanceCalcul;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistanceCalcul(long newDistanceCalcul) {
		long oldDistanceCalcul = distanceCalcul;
		distanceCalcul = newDistanceCalcul;
		boolean oldDistanceCalculESet = distanceCalculESet;
		distanceCalculESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_GENIE__DISTANCE_CALCUL, oldDistanceCalcul, distanceCalcul, !oldDistanceCalculESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistanceCalcul() {
		long oldDistanceCalcul = distanceCalcul;
		boolean oldDistanceCalculESet = distanceCalculESet;
		distanceCalcul = DISTANCE_CALCUL_EDEFAULT;
		distanceCalculESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOYENS_GENIE__DISTANCE_CALCUL, oldDistanceCalcul, DISTANCE_CALCUL_EDEFAULT, oldDistanceCalculESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistanceCalcul() {
		return distanceCalculESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_GENIE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_GENIE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourVarianteRealisationVarianteTravail() {
		return aPourVarianteRealisationVarianteTravail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourVarianteRealisationVarianteTravail(TypeAssociation newAPourVarianteRealisationVarianteTravail, NotificationChain msgs) {
		TypeAssociation oldAPourVarianteRealisationVarianteTravail = aPourVarianteRealisationVarianteTravail;
		aPourVarianteRealisationVarianteTravail = newAPourVarianteRealisationVarianteTravail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL, oldAPourVarianteRealisationVarianteTravail, newAPourVarianteRealisationVarianteTravail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourVarianteRealisationVarianteTravail(TypeAssociation newAPourVarianteRealisationVarianteTravail) {
		if (newAPourVarianteRealisationVarianteTravail != aPourVarianteRealisationVarianteTravail) {
			NotificationChain msgs = null;
			if (aPourVarianteRealisationVarianteTravail != null)
				msgs = ((InternalEObject)aPourVarianteRealisationVarianteTravail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL, null, msgs);
			if (newAPourVarianteRealisationVarianteTravail != null)
				msgs = ((InternalEObject)newAPourVarianteRealisationVarianteTravail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL, null, msgs);
			msgs = basicSetAPourVarianteRealisationVarianteTravail(newAPourVarianteRealisationVarianteTravail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL, newAPourVarianteRealisationVarianteTravail, newAPourVarianteRealisationVarianteTravail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffectifNecessaire> getConcerneEffectifsEffectifNecessaire() {
		if (concerneEffectifsEffectifNecessaire == null) {
			concerneEffectifsEffectifNecessaire = new EObjectContainmentEList<TypeEffectifNecessaire>(TypeEffectifNecessaire.class, this, SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_EFFECTIFS_EFFECTIF_NECESSAIRE);
		}
		return concerneEffectifsEffectifNecessaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensNecessaires> getConcerneMoyensMoyensNecessaires() {
		if (concerneMoyensMoyensNecessaires == null) {
			concerneMoyensMoyensNecessaires = new EObjectContainmentEList<TypeMoyensNecessaires>(TypeMoyensNecessaires.class, this, SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_MOYENS_MOYENS_NECESSAIRES);
		}
		return concerneMoyensMoyensNecessaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOYENS_GENIE__DUREE:
				return basicSetDuree(null, msgs);
			case SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				return basicSetAPourVarianteRealisationVarianteTravail(null, msgs);
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_EFFECTIFS_EFFECTIF_NECESSAIRE:
				return ((InternalEList<?>)getConcerneEffectifsEffectifNecessaire()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				return ((InternalEList<?>)getConcerneMoyensMoyensNecessaires()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_MOYENS_GENIE__DUREE:
				return getDuree();
			case SchemaPackage.TYPE_MOYENS_GENIE__DISTANCE_CALCUL:
				return new Long(getDistanceCalcul());
			case SchemaPackage.TYPE_MOYENS_GENIE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MOYENS_GENIE__CE:
				return getCE();
			case SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				return getAPourVarianteRealisationVarianteTravail();
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_EFFECTIFS_EFFECTIF_NECESSAIRE:
				return getConcerneEffectifsEffectifNecessaire();
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				return getConcerneMoyensMoyensNecessaires();
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
			case SchemaPackage.TYPE_MOYENS_GENIE__DUREE:
				setDuree((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__DISTANCE_CALCUL:
				setDistanceCalcul(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				setAPourVarianteRealisationVarianteTravail((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_EFFECTIFS_EFFECTIF_NECESSAIRE:
				getConcerneEffectifsEffectifNecessaire().clear();
				getConcerneEffectifsEffectifNecessaire().addAll((Collection<? extends TypeEffectifNecessaire>)newValue);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				getConcerneMoyensMoyensNecessaires().clear();
				getConcerneMoyensMoyensNecessaires().addAll((Collection<? extends TypeMoyensNecessaires>)newValue);
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
			case SchemaPackage.TYPE_MOYENS_GENIE__DUREE:
				setDuree((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__DISTANCE_CALCUL:
				unsetDistanceCalcul();
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				setAPourVarianteRealisationVarianteTravail((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_EFFECTIFS_EFFECTIF_NECESSAIRE:
				getConcerneEffectifsEffectifNecessaire().clear();
				return;
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				getConcerneMoyensMoyensNecessaires().clear();
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
			case SchemaPackage.TYPE_MOYENS_GENIE__DUREE:
				return duree != null;
			case SchemaPackage.TYPE_MOYENS_GENIE__DISTANCE_CALCUL:
				return isSetDistanceCalcul();
			case SchemaPackage.TYPE_MOYENS_GENIE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MOYENS_GENIE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MOYENS_GENIE__APOUR_VARIANTE_REALISATION_VARIANTE_TRAVAIL:
				return aPourVarianteRealisationVarianteTravail != null;
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_EFFECTIFS_EFFECTIF_NECESSAIRE:
				return concerneEffectifsEffectifNecessaire != null && !concerneEffectifsEffectifNecessaire.isEmpty();
			case SchemaPackage.TYPE_MOYENS_GENIE__CONCERNE_MOYENS_MOYENS_NECESSAIRES:
				return concerneMoyensMoyensNecessaires != null && !concerneMoyensMoyensNecessaires.isEmpty();
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
		result.append(" (distanceCalcul: ");
		if (distanceCalculESet) result.append(distanceCalcul); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMoyensGenieImpl
