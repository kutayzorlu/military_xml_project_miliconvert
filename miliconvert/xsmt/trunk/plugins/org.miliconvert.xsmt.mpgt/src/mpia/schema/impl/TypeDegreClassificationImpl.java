/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDegreClassification;
import mpia.schema.TypeDictionaryDicoDegreClassificationNiveau;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Degre Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDegreClassificationImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDegreClassificationImpl#getPolitique <em>Politique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDegreClassificationImpl#getAvertissement <em>Avertissement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDegreClassificationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDegreClassificationImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDegreClassificationImpl extends EObjectImpl implements TypeDegreClassification {
	/**
	 * The default value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoDegreClassificationNiveau NIVEAU_EDEFAULT = TypeDictionaryDicoDegreClassificationNiveau._0;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoDegreClassificationNiveau niveau = NIVEAU_EDEFAULT;

	/**
	 * This is true if the Niveau attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauESet;

	/**
	 * The default value of the '{@link #getPolitique() <em>Politique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolitique()
	 * @generated
	 * @ordered
	 */
	protected static final String POLITIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolitique() <em>Politique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolitique()
	 * @generated
	 * @ordered
	 */
	protected String politique = POLITIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvertissement() <em>Avertissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvertissement()
	 * @generated
	 * @ordered
	 */
	protected static final String AVERTISSEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvertissement() <em>Avertissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvertissement()
	 * @generated
	 * @ordered
	 */
	protected String avertissement = AVERTISSEMENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDegreClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDegreClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoDegreClassificationNiveau getNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(TypeDictionaryDicoDegreClassificationNiveau newNiveau) {
		TypeDictionaryDicoDegreClassificationNiveau oldNiveau = niveau;
		niveau = newNiveau == null ? NIVEAU_EDEFAULT : newNiveau;
		boolean oldNiveauESet = niveauESet;
		niveauESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEGRE_CLASSIFICATION__NIVEAU, oldNiveau, niveau, !oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveau() {
		TypeDictionaryDicoDegreClassificationNiveau oldNiveau = niveau;
		boolean oldNiveauESet = niveauESet;
		niveau = NIVEAU_EDEFAULT;
		niveauESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_DEGRE_CLASSIFICATION__NIVEAU, oldNiveau, NIVEAU_EDEFAULT, oldNiveauESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveau() {
		return niveauESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolitique() {
		return politique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolitique(String newPolitique) {
		String oldPolitique = politique;
		politique = newPolitique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEGRE_CLASSIFICATION__POLITIQUE, oldPolitique, politique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvertissement() {
		return avertissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvertissement(String newAvertissement) {
		String oldAvertissement = avertissement;
		avertissement = newAvertissement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEGRE_CLASSIFICATION__AVERTISSEMENT, oldAvertissement, avertissement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__NIVEAU:
				return getNiveau();
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__POLITIQUE:
				return getPolitique();
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__AVERTISSEMENT:
				return getAvertissement();
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CE:
				return getCE();
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
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__NIVEAU:
				setNiveau((TypeDictionaryDicoDegreClassificationNiveau)newValue);
				return;
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__POLITIQUE:
				setPolitique((String)newValue);
				return;
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__AVERTISSEMENT:
				setAvertissement((String)newValue);
				return;
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__NIVEAU:
				unsetNiveau();
				return;
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__POLITIQUE:
				setPolitique(POLITIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__AVERTISSEMENT:
				setAvertissement(AVERTISSEMENT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__NIVEAU:
				return isSetNiveau();
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__POLITIQUE:
				return POLITIQUE_EDEFAULT == null ? politique != null : !POLITIQUE_EDEFAULT.equals(politique);
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__AVERTISSEMENT:
				return AVERTISSEMENT_EDEFAULT == null ? avertissement != null : !AVERTISSEMENT_EDEFAULT.equals(avertissement);
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DEGRE_CLASSIFICATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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
		result.append(" (niveau: ");
		if (niveauESet) result.append(niveau); else result.append("<unset>");
		result.append(", politique: ");
		result.append(politique);
		result.append(", avertissement: ");
		result.append(avertissement);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeDegreClassificationImpl
