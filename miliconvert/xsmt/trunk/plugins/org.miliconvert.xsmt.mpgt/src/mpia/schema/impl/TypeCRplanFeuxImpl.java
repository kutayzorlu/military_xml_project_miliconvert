/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCRplanFeux;
import mpia.schema.TypeDictionaryDicoCRtraitementObjectifCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type CRplan Feux</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCRplanFeuxImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRplanFeuxImpl#getMotifsNonExecution <em>Motifs Non Execution</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRplanFeuxImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRplanFeuxImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCRplanFeuxImpl#getConcerneObjectifCiblage <em>Concerne Objectif Ciblage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCRplanFeuxImpl extends EObjectImpl implements TypeCRplanFeux {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCRtraitementObjectifCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoCRtraitementObjectifCategorie.EXEC;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCRtraitementObjectifCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getMotifsNonExecution() <em>Motifs Non Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotifsNonExecution()
	 * @generated
	 * @ordered
	 */
	protected static final String MOTIFS_NON_EXECUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotifsNonExecution() <em>Motifs Non Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotifsNonExecution()
	 * @generated
	 * @ordered
	 */
	protected String motifsNonExecution = MOTIFS_NON_EXECUTION_EDEFAULT;

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
	 * The cached value of the '{@link #getConcerneObjectifCiblage() <em>Concerne Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneObjectifCiblage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCRplanFeuxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCRplanFeux();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCRtraitementObjectifCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoCRtraitementObjectifCategorie newCategorie) {
		TypeDictionaryDicoCRtraitementObjectifCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRPLAN_FEUX__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoCRtraitementObjectifCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CRPLAN_FEUX__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCategorie() {
		return categorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMotifsNonExecution() {
		return motifsNonExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotifsNonExecution(String newMotifsNonExecution) {
		String oldMotifsNonExecution = motifsNonExecution;
		motifsNonExecution = newMotifsNonExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRPLAN_FEUX__MOTIFS_NON_EXECUTION, oldMotifsNonExecution, motifsNonExecution));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRPLAN_FEUX__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRPLAN_FEUX__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneObjectifCiblage() {
		return concerneObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneObjectifCiblage(TypeAssociation newConcerneObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldConcerneObjectifCiblage = concerneObjectifCiblage;
		concerneObjectifCiblage = newConcerneObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE, oldConcerneObjectifCiblage, newConcerneObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneObjectifCiblage(TypeAssociation newConcerneObjectifCiblage) {
		if (newConcerneObjectifCiblage != concerneObjectifCiblage) {
			NotificationChain msgs = null;
			if (concerneObjectifCiblage != null)
				msgs = ((InternalEObject)concerneObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE, null, msgs);
			if (newConcerneObjectifCiblage != null)
				msgs = ((InternalEObject)newConcerneObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetConcerneObjectifCiblage(newConcerneObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE, newConcerneObjectifCiblage, newConcerneObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE:
				return basicSetConcerneObjectifCiblage(null, msgs);
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
			case SchemaPackage.TYPE_CRPLAN_FEUX__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_CRPLAN_FEUX__MOTIFS_NON_EXECUTION:
				return getMotifsNonExecution();
			case SchemaPackage.TYPE_CRPLAN_FEUX__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CRPLAN_FEUX__CE:
				return getCE();
			case SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE:
				return getConcerneObjectifCiblage();
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
			case SchemaPackage.TYPE_CRPLAN_FEUX__CATEGORIE:
				setCategorie((TypeDictionaryDicoCRtraitementObjectifCategorie)newValue);
				return;
			case SchemaPackage.TYPE_CRPLAN_FEUX__MOTIFS_NON_EXECUTION:
				setMotifsNonExecution((String)newValue);
				return;
			case SchemaPackage.TYPE_CRPLAN_FEUX__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CRPLAN_FEUX__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE:
				setConcerneObjectifCiblage((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_CRPLAN_FEUX__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_CRPLAN_FEUX__MOTIFS_NON_EXECUTION:
				setMotifsNonExecution(MOTIFS_NON_EXECUTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRPLAN_FEUX__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRPLAN_FEUX__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE:
				setConcerneObjectifCiblage((TypeAssociation)null);
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
			case SchemaPackage.TYPE_CRPLAN_FEUX__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_CRPLAN_FEUX__MOTIFS_NON_EXECUTION:
				return MOTIFS_NON_EXECUTION_EDEFAULT == null ? motifsNonExecution != null : !MOTIFS_NON_EXECUTION_EDEFAULT.equals(motifsNonExecution);
			case SchemaPackage.TYPE_CRPLAN_FEUX__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CRPLAN_FEUX__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CRPLAN_FEUX__CONCERNE_OBJECTIF_CIBLAGE:
				return concerneObjectifCiblage != null;
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
		result.append(" (categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(", motifsNonExecution: ");
		result.append(motifsNonExecution);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCRplanFeuxImpl
