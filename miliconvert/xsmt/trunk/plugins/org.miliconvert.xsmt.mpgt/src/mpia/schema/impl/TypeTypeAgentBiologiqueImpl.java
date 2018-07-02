/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPersistance;
import mpia.schema.TypeDictionaryDicoTypeAgentBiologiqueCategorie;
import mpia.schema.TypeDictionaryDicoTypeAgentBiologiqueSousCategorie;
import mpia.schema.TypeTypeAgentBiologique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Agent Biologique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentBiologiqueImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentBiologiqueImpl#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentBiologiqueImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentBiologiqueImpl#getPersistance <em>Persistance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentBiologiqueImpl#isContagiosite <em>Contagiosite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentBiologiqueImpl#getModeContamination <em>Mode Contamination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeAgentBiologiqueImpl extends TypeTypeConsommableImpl implements TypeTypeAgentBiologique {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAgentBiologiqueCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeAgentBiologiqueCategorie.BACTRL;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAgentBiologiqueCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getAutreCategorie() <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreCategorie() <em>Autre Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreCategorie()
	 * @generated
	 * @ordered
	 */
	protected String autreCategorie = AUTRE_CATEGORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAgentBiologiqueSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeAgentBiologiqueSousCategorie.CHLMYD;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAgentBiologiqueSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getPersistance() <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistance()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPersistance PERSISTANCE_EDEFAULT = TypeDictionaryDicoPersistance.NONPRS;

	/**
	 * The cached value of the '{@link #getPersistance() <em>Persistance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistance()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPersistance persistance = PERSISTANCE_EDEFAULT;

	/**
	 * This is true if the Persistance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean persistanceESet;

	/**
	 * The default value of the '{@link #isContagiosite() <em>Contagiosite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContagiosite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAGIOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContagiosite() <em>Contagiosite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContagiosite()
	 * @generated
	 * @ordered
	 */
	protected boolean contagiosite = CONTAGIOSITE_EDEFAULT;

	/**
	 * This is true if the Contagiosite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contagiositeESet;

	/**
	 * The default value of the '{@link #getModeContamination() <em>Mode Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeContamination()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_CONTAMINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModeContamination() <em>Mode Contamination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModeContamination()
	 * @generated
	 * @ordered
	 */
	protected String modeContamination = MODE_CONTAMINATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeAgentBiologiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeAgentBiologique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAgentBiologiqueCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeAgentBiologiqueCategorie newCategorie) {
		TypeDictionaryDicoTypeAgentBiologiqueCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeAgentBiologiqueCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public String getAutreCategorie() {
		return autreCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreCategorie(String newAutreCategorie) {
		String oldAutreCategorie = autreCategorie;
		autreCategorie = newAutreCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__AUTRE_CATEGORIE, oldAutreCategorie, autreCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAgentBiologiqueSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoTypeAgentBiologiqueSousCategorie newSousCategorie) {
		TypeDictionaryDicoTypeAgentBiologiqueSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoTypeAgentBiologiqueSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSousCategorie() {
		return sousCategorieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPersistance getPersistance() {
		return persistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistance(TypeDictionaryDicoPersistance newPersistance) {
		TypeDictionaryDicoPersistance oldPersistance = persistance;
		persistance = newPersistance == null ? PERSISTANCE_EDEFAULT : newPersistance;
		boolean oldPersistanceESet = persistanceESet;
		persistanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__PERSISTANCE, oldPersistance, persistance, !oldPersistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPersistance() {
		TypeDictionaryDicoPersistance oldPersistance = persistance;
		boolean oldPersistanceESet = persistanceESet;
		persistance = PERSISTANCE_EDEFAULT;
		persistanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__PERSISTANCE, oldPersistance, PERSISTANCE_EDEFAULT, oldPersistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPersistance() {
		return persistanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContagiosite() {
		return contagiosite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContagiosite(boolean newContagiosite) {
		boolean oldContagiosite = contagiosite;
		contagiosite = newContagiosite;
		boolean oldContagiositeESet = contagiositeESet;
		contagiositeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CONTAGIOSITE, oldContagiosite, contagiosite, !oldContagiositeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContagiosite() {
		boolean oldContagiosite = contagiosite;
		boolean oldContagiositeESet = contagiositeESet;
		contagiosite = CONTAGIOSITE_EDEFAULT;
		contagiositeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CONTAGIOSITE, oldContagiosite, CONTAGIOSITE_EDEFAULT, oldContagiositeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContagiosite() {
		return contagiositeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModeContamination() {
		return modeContamination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModeContamination(String newModeContamination) {
		String oldModeContamination = modeContamination;
		modeContamination = newModeContamination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__MODE_CONTAMINATION, oldModeContamination, modeContamination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__AUTRE_CATEGORIE:
				return getAutreCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__PERSISTANCE:
				return getPersistance();
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CONTAGIOSITE:
				return isContagiosite() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__MODE_CONTAMINATION:
				return getModeContamination();
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
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeAgentBiologiqueCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__AUTRE_CATEGORIE:
				setAutreCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoTypeAgentBiologiqueSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__PERSISTANCE:
				setPersistance((TypeDictionaryDicoPersistance)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CONTAGIOSITE:
				setContagiosite(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__MODE_CONTAMINATION:
				setModeContamination((String)newValue);
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
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__AUTRE_CATEGORIE:
				setAutreCategorie(AUTRE_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__PERSISTANCE:
				unsetPersistance();
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CONTAGIOSITE:
				unsetContagiosite();
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__MODE_CONTAMINATION:
				setModeContamination(MODE_CONTAMINATION_EDEFAULT);
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
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__AUTRE_CATEGORIE:
				return AUTRE_CATEGORIE_EDEFAULT == null ? autreCategorie != null : !AUTRE_CATEGORIE_EDEFAULT.equals(autreCategorie);
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__PERSISTANCE:
				return isSetPersistance();
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__CONTAGIOSITE:
				return isSetContagiosite();
			case SchemaPackage.TYPE_TYPE_AGENT_BIOLOGIQUE__MODE_CONTAMINATION:
				return MODE_CONTAMINATION_EDEFAULT == null ? modeContamination != null : !MODE_CONTAMINATION_EDEFAULT.equals(modeContamination);
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
		result.append(", autreCategorie: ");
		result.append(autreCategorie);
		result.append(", sousCategorie: ");
		if (sousCategorieESet) result.append(sousCategorie); else result.append("<unset>");
		result.append(", persistance: ");
		if (persistanceESet) result.append(persistance); else result.append("<unset>");
		result.append(", contagiosite: ");
		if (contagiositeESet) result.append(contagiosite); else result.append("<unset>");
		result.append(", modeContamination: ");
		result.append(modeContamination);
		result.append(')');
		return result.toString();
	}

} //TypeTypeAgentBiologiqueImpl
