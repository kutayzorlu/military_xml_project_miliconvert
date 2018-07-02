/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoProbabiliteEvenement;
import mpia.schema.TypeEffetTactiqueRechercheParENI;
import mpia.schema.TypeMoyensENIutilises;

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
 * An implementation of the model object '<em><b>Type Effet Tactique Recherche Par ENI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEffetTactiqueRechercheParENIImpl#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetTactiqueRechercheParENIImpl#getProbabiliteConflit <em>Probabilite Conflit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetTactiqueRechercheParENIImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetTactiqueRechercheParENIImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetTactiqueRechercheParENIImpl#getACommeMoyensENIutilisesMoyensENIutilises <em>AComme Moyens EN Iutilises Moyens EN Iutilises</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEffetTactiqueRechercheParENIImpl extends EObjectImpl implements TypeEffetTactiqueRechercheParENI {
	/**
	 * The default value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected String objectif = OBJECTIF_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbabiliteConflit() <em>Probabilite Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabiliteConflit()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoProbabiliteEvenement PROBABILITE_CONFLIT_EDEFAULT = TypeDictionaryDicoProbabiliteEvenement.HIGH;

	/**
	 * The cached value of the '{@link #getProbabiliteConflit() <em>Probabilite Conflit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbabiliteConflit()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoProbabiliteEvenement probabiliteConflit = PROBABILITE_CONFLIT_EDEFAULT;

	/**
	 * This is true if the Probabilite Conflit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean probabiliteConflitESet;

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
	 * The cached value of the '{@link #getACommeMoyensENIutilisesMoyensENIutilises() <em>AComme Moyens EN Iutilises Moyens EN Iutilises</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeMoyensENIutilisesMoyensENIutilises()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyensENIutilises> aCommeMoyensENIutilisesMoyensENIutilises;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEffetTactiqueRechercheParENIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEffetTactiqueRechercheParENI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectif() {
		return objectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectif(String newObjectif) {
		String oldObjectif = objectif;
		objectif = newObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__OBJECTIF, oldObjectif, objectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoProbabiliteEvenement getProbabiliteConflit() {
		return probabiliteConflit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbabiliteConflit(TypeDictionaryDicoProbabiliteEvenement newProbabiliteConflit) {
		TypeDictionaryDicoProbabiliteEvenement oldProbabiliteConflit = probabiliteConflit;
		probabiliteConflit = newProbabiliteConflit == null ? PROBABILITE_CONFLIT_EDEFAULT : newProbabiliteConflit;
		boolean oldProbabiliteConflitESet = probabiliteConflitESet;
		probabiliteConflitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__PROBABILITE_CONFLIT, oldProbabiliteConflit, probabiliteConflit, !oldProbabiliteConflitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProbabiliteConflit() {
		TypeDictionaryDicoProbabiliteEvenement oldProbabiliteConflit = probabiliteConflit;
		boolean oldProbabiliteConflitESet = probabiliteConflitESet;
		probabiliteConflit = PROBABILITE_CONFLIT_EDEFAULT;
		probabiliteConflitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__PROBABILITE_CONFLIT, oldProbabiliteConflit, PROBABILITE_CONFLIT_EDEFAULT, oldProbabiliteConflitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProbabiliteConflit() {
		return probabiliteConflitESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensENIutilises> getACommeMoyensENIutilisesMoyensENIutilises() {
		if (aCommeMoyensENIutilisesMoyensENIutilises == null) {
			aCommeMoyensENIutilisesMoyensENIutilises = new EObjectContainmentEList<TypeMoyensENIutilises>(TypeMoyensENIutilises.class, this, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__ACOMME_MOYENS_EN_IUTILISES_MOYENS_EN_IUTILISES);
		}
		return aCommeMoyensENIutilisesMoyensENIutilises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__ACOMME_MOYENS_EN_IUTILISES_MOYENS_EN_IUTILISES:
				return ((InternalEList<?>)getACommeMoyensENIutilisesMoyensENIutilises()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__OBJECTIF:
				return getObjectif();
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__PROBABILITE_CONFLIT:
				return getProbabiliteConflit();
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CTE:
				return getCTE();
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CE:
				return getCE();
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__ACOMME_MOYENS_EN_IUTILISES_MOYENS_EN_IUTILISES:
				return getACommeMoyensENIutilisesMoyensENIutilises();
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
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__OBJECTIF:
				setObjectif((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__PROBABILITE_CONFLIT:
				setProbabiliteConflit((TypeDictionaryDicoProbabiliteEvenement)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__ACOMME_MOYENS_EN_IUTILISES_MOYENS_EN_IUTILISES:
				getACommeMoyensENIutilisesMoyensENIutilises().clear();
				getACommeMoyensENIutilisesMoyensENIutilises().addAll((Collection<? extends TypeMoyensENIutilises>)newValue);
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
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__OBJECTIF:
				setObjectif(OBJECTIF_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__PROBABILITE_CONFLIT:
				unsetProbabiliteConflit();
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__ACOMME_MOYENS_EN_IUTILISES_MOYENS_EN_IUTILISES:
				getACommeMoyensENIutilisesMoyensENIutilises().clear();
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
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__OBJECTIF:
				return OBJECTIF_EDEFAULT == null ? objectif != null : !OBJECTIF_EDEFAULT.equals(objectif);
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__PROBABILITE_CONFLIT:
				return isSetProbabiliteConflit();
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE_PAR_ENI__ACOMME_MOYENS_EN_IUTILISES_MOYENS_EN_IUTILISES:
				return aCommeMoyensENIutilisesMoyensENIutilises != null && !aCommeMoyensENIutilisesMoyensENIutilises.isEmpty();
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
		result.append(" (objectif: ");
		result.append(objectif);
		result.append(", probabiliteConflit: ");
		if (probabiliteConflitESet) result.append(probabiliteConflit); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEffetTactiqueRechercheParENIImpl
