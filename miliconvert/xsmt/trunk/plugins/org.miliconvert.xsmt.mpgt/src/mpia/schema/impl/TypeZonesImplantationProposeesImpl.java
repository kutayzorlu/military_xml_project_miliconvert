/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeZonesImplantationProposees;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Zones Implantation Proposees</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeZonesImplantationProposeesImpl#getNumeroOrdre <em>Numero Ordre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZonesImplantationProposeesImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZonesImplantationProposeesImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZonesImplantationProposeesImpl#getACommeLocalisationProposeeAutreElementControle <em>AComme Localisation Proposee Autre Element Controle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeZonesImplantationProposeesImpl#getACommeLocalisationAlternativeAutreElementControle <em>AComme Localisation Alternative Autre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeZonesImplantationProposeesImpl extends EObjectImpl implements TypeZonesImplantationProposees {
	/**
	 * The default value of the '{@link #getNumeroOrdre() <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrdre()
	 * @generated
	 * @ordered
	 */
	protected static final long NUMERO_ORDRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNumeroOrdre() <em>Numero Ordre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroOrdre()
	 * @generated
	 * @ordered
	 */
	protected long numeroOrdre = NUMERO_ORDRE_EDEFAULT;

	/**
	 * This is true if the Numero Ordre attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numeroOrdreESet;

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
	 * The cached value of the '{@link #getACommeLocalisationProposeeAutreElementControle() <em>AComme Localisation Proposee Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLocalisationProposeeAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLocalisationProposeeAutreElementControle;

	/**
	 * The cached value of the '{@link #getACommeLocalisationAlternativeAutreElementControle() <em>AComme Localisation Alternative Autre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeLocalisationAlternativeAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommeLocalisationAlternativeAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeZonesImplantationProposeesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeZonesImplantationProposees();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNumeroOrdre() {
		return numeroOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroOrdre(long newNumeroOrdre) {
		long oldNumeroOrdre = numeroOrdre;
		numeroOrdre = newNumeroOrdre;
		boolean oldNumeroOrdreESet = numeroOrdreESet;
		numeroOrdreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__NUMERO_ORDRE, oldNumeroOrdre, numeroOrdre, !oldNumeroOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumeroOrdre() {
		long oldNumeroOrdre = numeroOrdre;
		boolean oldNumeroOrdreESet = numeroOrdreESet;
		numeroOrdre = NUMERO_ORDRE_EDEFAULT;
		numeroOrdreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__NUMERO_ORDRE, oldNumeroOrdre, NUMERO_ORDRE_EDEFAULT, oldNumeroOrdreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumeroOrdre() {
		return numeroOrdreESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLocalisationProposeeAutreElementControle() {
		return aCommeLocalisationProposeeAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLocalisationProposeeAutreElementControle(TypeAssociation newACommeLocalisationProposeeAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeLocalisationProposeeAutreElementControle = aCommeLocalisationProposeeAutreElementControle;
		aCommeLocalisationProposeeAutreElementControle = newACommeLocalisationProposeeAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE, oldACommeLocalisationProposeeAutreElementControle, newACommeLocalisationProposeeAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLocalisationProposeeAutreElementControle(TypeAssociation newACommeLocalisationProposeeAutreElementControle) {
		if (newACommeLocalisationProposeeAutreElementControle != aCommeLocalisationProposeeAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeLocalisationProposeeAutreElementControle != null)
				msgs = ((InternalEObject)aCommeLocalisationProposeeAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeLocalisationProposeeAutreElementControle != null)
				msgs = ((InternalEObject)newACommeLocalisationProposeeAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeLocalisationProposeeAutreElementControle(newACommeLocalisationProposeeAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE, newACommeLocalisationProposeeAutreElementControle, newACommeLocalisationProposeeAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommeLocalisationAlternativeAutreElementControle() {
		return aCommeLocalisationAlternativeAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeLocalisationAlternativeAutreElementControle(TypeAssociation newACommeLocalisationAlternativeAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldACommeLocalisationAlternativeAutreElementControle = aCommeLocalisationAlternativeAutreElementControle;
		aCommeLocalisationAlternativeAutreElementControle = newACommeLocalisationAlternativeAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE, oldACommeLocalisationAlternativeAutreElementControle, newACommeLocalisationAlternativeAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeLocalisationAlternativeAutreElementControle(TypeAssociation newACommeLocalisationAlternativeAutreElementControle) {
		if (newACommeLocalisationAlternativeAutreElementControle != aCommeLocalisationAlternativeAutreElementControle) {
			NotificationChain msgs = null;
			if (aCommeLocalisationAlternativeAutreElementControle != null)
				msgs = ((InternalEObject)aCommeLocalisationAlternativeAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newACommeLocalisationAlternativeAutreElementControle != null)
				msgs = ((InternalEObject)newACommeLocalisationAlternativeAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetACommeLocalisationAlternativeAutreElementControle(newACommeLocalisationAlternativeAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE, newACommeLocalisationAlternativeAutreElementControle, newACommeLocalisationAlternativeAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeLocalisationProposeeAutreElementControle(null, msgs);
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE:
				return basicSetACommeLocalisationAlternativeAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__NUMERO_ORDRE:
				return new Long(getNumeroOrdre());
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CE:
				return getCE();
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE:
				return getACommeLocalisationProposeeAutreElementControle();
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE:
				return getACommeLocalisationAlternativeAutreElementControle();
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
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__NUMERO_ORDRE:
				setNumeroOrdre(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE:
				setACommeLocalisationProposeeAutreElementControle((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE:
				setACommeLocalisationAlternativeAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__NUMERO_ORDRE:
				unsetNumeroOrdre();
				return;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE:
				setACommeLocalisationProposeeAutreElementControle((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE:
				setACommeLocalisationAlternativeAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__NUMERO_ORDRE:
				return isSetNumeroOrdre();
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_PROPOSEE_AUTRE_ELEMENT_CONTROLE:
				return aCommeLocalisationProposeeAutreElementControle != null;
			case SchemaPackage.TYPE_ZONES_IMPLANTATION_PROPOSEES__ACOMME_LOCALISATION_ALTERNATIVE_AUTRE_ELEMENT_CONTROLE:
				return aCommeLocalisationAlternativeAutreElementControle != null;
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
		result.append(" (numeroOrdre: ");
		if (numeroOrdreESet) result.append(numeroOrdre); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeZonesImplantationProposeesImpl
