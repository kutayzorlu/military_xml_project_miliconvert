/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeAgentNucleaireCategorie;
import mpia.schema.TypeDictionaryDicoTypeAgentNucleaireRadiation;
import mpia.schema.TypeTypeAgentNucleaire;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Agent Nucleaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentNucleaireImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentNucleaireImpl#getAutreCategorie <em>Autre Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeAgentNucleaireImpl#getRadiation <em>Radiation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeAgentNucleaireImpl extends TypeTypeConsommableImpl implements TypeTypeAgentNucleaire {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAgentNucleaireCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeAgentNucleaireCategorie.CESIUM;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAgentNucleaireCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * The default value of the '{@link #getRadiation() <em>Radiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeAgentNucleaireRadiation RADIATION_EDEFAULT = TypeDictionaryDicoTypeAgentNucleaireRadiation.ALPHA;

	/**
	 * The cached value of the '{@link #getRadiation() <em>Radiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadiation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeAgentNucleaireRadiation radiation = RADIATION_EDEFAULT;

	/**
	 * This is true if the Radiation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean radiationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeAgentNucleaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeAgentNucleaire();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAgentNucleaireCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeAgentNucleaireCategorie newCategorie) {
		TypeDictionaryDicoTypeAgentNucleaireCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeAgentNucleaireCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__AUTRE_CATEGORIE, oldAutreCategorie, autreCategorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeAgentNucleaireRadiation getRadiation() {
		return radiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadiation(TypeDictionaryDicoTypeAgentNucleaireRadiation newRadiation) {
		TypeDictionaryDicoTypeAgentNucleaireRadiation oldRadiation = radiation;
		radiation = newRadiation == null ? RADIATION_EDEFAULT : newRadiation;
		boolean oldRadiationESet = radiationESet;
		radiationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__RADIATION, oldRadiation, radiation, !oldRadiationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRadiation() {
		TypeDictionaryDicoTypeAgentNucleaireRadiation oldRadiation = radiation;
		boolean oldRadiationESet = radiationESet;
		radiation = RADIATION_EDEFAULT;
		radiationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__RADIATION, oldRadiation, RADIATION_EDEFAULT, oldRadiationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRadiation() {
		return radiationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__AUTRE_CATEGORIE:
				return getAutreCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__RADIATION:
				return getRadiation();
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
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeAgentNucleaireCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__AUTRE_CATEGORIE:
				setAutreCategorie((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__RADIATION:
				setRadiation((TypeDictionaryDicoTypeAgentNucleaireRadiation)newValue);
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
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__AUTRE_CATEGORIE:
				setAutreCategorie(AUTRE_CATEGORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__RADIATION:
				unsetRadiation();
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
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__AUTRE_CATEGORIE:
				return AUTRE_CATEGORIE_EDEFAULT == null ? autreCategorie != null : !AUTRE_CATEGORIE_EDEFAULT.equals(autreCategorie);
			case SchemaPackage.TYPE_TYPE_AGENT_NUCLEAIRE__RADIATION:
				return isSetRadiation();
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
		result.append(", radiation: ");
		if (radiationESet) result.append(radiation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeAgentNucleaireImpl
