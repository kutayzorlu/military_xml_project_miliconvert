/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPersistance;
import mpia.schema.TypeDictionaryDicoTypeAgentChimiqueCategorie;
import mpia.schema.TypeDictionaryDicoTypeAgentChimiqueSousCategorie;
import mpia.schema.TypeTypeAgentChimique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Agent Chimique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentChimiqueImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentChimiqueImpl#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentChimiqueImpl#getSousCategorie <em>Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentChimiqueImpl#getAutreSousCategorie <em>Autre Sous Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentChimiqueImpl#getPersistance <em>Persistance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeAgentChimiqueImpl extends TypeTypeConsommableImpl implements TypeTypeAgentChimique {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAgentChimiqueCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeAgentChimiqueCategorie.BLISTR;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAgentChimiqueCategorie categorie = CATEGORIE_EDEFAULT;

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
	protected static final TypeDictionaryDicoTypeAgentChimiqueSousCategorie SOUS_CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeAgentChimiqueSousCategorie.ARSINE;

	/**
	 * The cached value of the '{@link #getSousCategorie() <em>Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAgentChimiqueSousCategorie sousCategorie = SOUS_CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Sous Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sousCategorieESet;

	/**
	 * The default value of the '{@link #getAutreSousCategorie() <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_SOUS_CATEGORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreSousCategorie() <em>Autre Sous Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreSousCategorie()
	 * @generated
	 * @ordered
	 */
	protected String autreSousCategorie = AUTRE_SOUS_CATEGORIE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeAgentChimiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeAgentChimique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAgentChimiqueCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeAgentChimiqueCategorie newCategorie) {
		TypeDictionaryDicoTypeAgentChimiqueCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeAgentChimiqueCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_CATEGORIE, oldAutreCategorie, autreCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAgentChimiqueSousCategorie getSousCategorie() {
		return sousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorie(TypeDictionaryDicoTypeAgentChimiqueSousCategorie newSousCategorie) {
		TypeDictionaryDicoTypeAgentChimiqueSousCategorie oldSousCategorie = sousCategorie;
		sousCategorie = newSousCategorie == null ? SOUS_CATEGORIE_EDEFAULT : newSousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__SOUS_CATEGORIE, oldSousCategorie, sousCategorie, !oldSousCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSousCategorie() {
		TypeDictionaryDicoTypeAgentChimiqueSousCategorie oldSousCategorie = sousCategorie;
		boolean oldSousCategorieESet = sousCategorieESet;
		sousCategorie = SOUS_CATEGORIE_EDEFAULT;
		sousCategorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__SOUS_CATEGORIE, oldSousCategorie, SOUS_CATEGORIE_EDEFAULT, oldSousCategorieESet));
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
	public String getAutreSousCategorie() {
		return autreSousCategorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreSousCategorie(String newAutreSousCategorie) {
		String oldAutreSousCategorie = autreSousCategorie;
		autreSousCategorie = newAutreSousCategorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_SOUS_CATEGORIE, oldAutreSousCategorie, autreSousCategorie));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__PERSISTANCE, oldPersistance, persistance, !oldPersistanceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__PERSISTANCE, oldPersistance, PERSISTANCE_EDEFAULT, oldPersistanceESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_CATEGORIE:
				return getAutreCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__SOUS_CATEGORIE:
				return getSousCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_SOUS_CATEGORIE:
				return getAutreSousCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__PERSISTANCE:
				return getPersistance();
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
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeAgentChimiqueCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_CATEGORIE:
				setAutreCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__SOUS_CATEGORIE:
				setSousCategorie((TypeDictionaryDicoTypeAgentChimiqueSousCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_SOUS_CATEGORIE:
				setAutreSousCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__PERSISTANCE:
				setPersistance((TypeDictionaryDicoPersistance)newValue);
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
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_CATEGORIE:
				setAutreCategorie(AUTRE_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__SOUS_CATEGORIE:
				unsetSousCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_SOUS_CATEGORIE:
				setAutreSousCategorie(AUTRE_SOUS_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__PERSISTANCE:
				unsetPersistance();
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
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_CATEGORIE:
				return AUTRE_CATEGORIE_EDEFAULT == null ? autreCategorie != null : !AUTRE_CATEGORIE_EDEFAULT.equals(autreCategorie);
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__SOUS_CATEGORIE:
				return isSetSousCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__AUTRE_SOUS_CATEGORIE:
				return AUTRE_SOUS_CATEGORIE_EDEFAULT == null ? autreSousCategorie != null : !AUTRE_SOUS_CATEGORIE_EDEFAULT.equals(autreSousCategorie);
			case SchemaPackage.TYPE_TYPE_AGENT_CHIMIQUE__PERSISTANCE:
				return isSetPersistance();
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
		result.append(", autreSousCategorie: ");
		result.append(autreSousCategorie);
		result.append(", persistance: ");
		if (persistanceESet) result.append(persistance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeAgentChimiqueImpl
