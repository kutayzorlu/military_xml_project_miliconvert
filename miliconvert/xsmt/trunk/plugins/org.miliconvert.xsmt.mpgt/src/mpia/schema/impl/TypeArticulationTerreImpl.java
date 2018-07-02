/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeArticulationTerre;
import mpia.schema.TypeDictionaryDicoArticulationTerreCategorie;
import mpia.schema.TypeDictionaryDicoArticulationTerreTypeODB;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Articulation Terre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeArticulationTerreImpl#getTypeODB <em>Type ODB</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationTerreImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationTerreImpl#getEstDefinieParUnite <em>Est Definie Par Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationTerreImpl#getEstConstitueModule <em>Est Constitue Module</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationTerreImpl#getACommePrelevementPrelevementDetachement <em>AComme Prelevement Prelevement Detachement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeArticulationTerreImpl#getAPourCoordonneesRadioAdresseRadio <em>APour Coordonnees Radio Adresse Radio</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeArticulationTerreImpl extends TypeArticulationImpl implements TypeArticulationTerre {
	/**
	 * The default value of the '{@link #getTypeODB() <em>Type ODB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeODB()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoArticulationTerreTypeODB TYPE_ODB_EDEFAULT = TypeDictionaryDicoArticulationTerreTypeODB.REF;

	/**
	 * The cached value of the '{@link #getTypeODB() <em>Type ODB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeODB()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoArticulationTerreTypeODB typeODB = TYPE_ODB_EDEFAULT;

	/**
	 * This is true if the Type ODB attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeODBESet;

	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoArticulationTerreCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoArticulationTerreCategorie.FRD;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoArticulationTerreCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getEstDefinieParUnite() <em>Est Definie Par Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDefinieParUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estDefinieParUnite;

	/**
	 * The cached value of the '{@link #getEstConstitueModule() <em>Est Constitue Module</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstConstitueModule()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estConstitueModule;

	/**
	 * The cached value of the '{@link #getACommePrelevementPrelevementDetachement() <em>AComme Prelevement Prelevement Detachement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePrelevementPrelevementDetachement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommePrelevementPrelevementDetachement;

	/**
	 * The cached value of the '{@link #getAPourCoordonneesRadioAdresseRadio() <em>APour Coordonnees Radio Adresse Radio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCoordonneesRadioAdresseRadio()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourCoordonneesRadioAdresseRadio;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeArticulationTerreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeArticulationTerre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoArticulationTerreTypeODB getTypeODB() {
		return typeODB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeODB(TypeDictionaryDicoArticulationTerreTypeODB newTypeODB) {
		TypeDictionaryDicoArticulationTerreTypeODB oldTypeODB = typeODB;
		typeODB = newTypeODB == null ? TYPE_ODB_EDEFAULT : newTypeODB;
		boolean oldTypeODBESet = typeODBESet;
		typeODBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_TERRE__TYPE_ODB, oldTypeODB, typeODB, !oldTypeODBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeODB() {
		TypeDictionaryDicoArticulationTerreTypeODB oldTypeODB = typeODB;
		boolean oldTypeODBESet = typeODBESet;
		typeODB = TYPE_ODB_EDEFAULT;
		typeODBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_TERRE__TYPE_ODB, oldTypeODB, TYPE_ODB_EDEFAULT, oldTypeODBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeODB() {
		return typeODBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoArticulationTerreCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoArticulationTerreCategorie newCategorie) {
		TypeDictionaryDicoArticulationTerreCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_TERRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoArticulationTerreCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ARTICULATION_TERRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociationEXT getEstDefinieParUnite() {
		return estDefinieParUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDefinieParUnite(TypeAssociationEXT newEstDefinieParUnite, NotificationChain msgs) {
		TypeAssociationEXT oldEstDefinieParUnite = estDefinieParUnite;
		estDefinieParUnite = newEstDefinieParUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE, oldEstDefinieParUnite, newEstDefinieParUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDefinieParUnite(TypeAssociationEXT newEstDefinieParUnite) {
		if (newEstDefinieParUnite != estDefinieParUnite) {
			NotificationChain msgs = null;
			if (estDefinieParUnite != null)
				msgs = ((InternalEObject)estDefinieParUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE, null, msgs);
			if (newEstDefinieParUnite != null)
				msgs = ((InternalEObject)newEstDefinieParUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE, null, msgs);
			msgs = basicSetEstDefinieParUnite(newEstDefinieParUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE, newEstDefinieParUnite, newEstDefinieParUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstConstitueModule() {
		if (estConstitueModule == null) {
			estConstitueModule = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION_TERRE__EST_CONSTITUE_MODULE);
		}
		return estConstitueModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommePrelevementPrelevementDetachement() {
		if (aCommePrelevementPrelevementDetachement == null) {
			aCommePrelevementPrelevementDetachement = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_ARTICULATION_TERRE__ACOMME_PRELEVEMENT_PRELEVEMENT_DETACHEMENT);
		}
		return aCommePrelevementPrelevementDetachement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourCoordonneesRadioAdresseRadio() {
		return aPourCoordonneesRadioAdresseRadio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCoordonneesRadioAdresseRadio(TypeAssociation newAPourCoordonneesRadioAdresseRadio, NotificationChain msgs) {
		TypeAssociation oldAPourCoordonneesRadioAdresseRadio = aPourCoordonneesRadioAdresseRadio;
		aPourCoordonneesRadioAdresseRadio = newAPourCoordonneesRadioAdresseRadio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, oldAPourCoordonneesRadioAdresseRadio, newAPourCoordonneesRadioAdresseRadio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCoordonneesRadioAdresseRadio(TypeAssociation newAPourCoordonneesRadioAdresseRadio) {
		if (newAPourCoordonneesRadioAdresseRadio != aPourCoordonneesRadioAdresseRadio) {
			NotificationChain msgs = null;
			if (aPourCoordonneesRadioAdresseRadio != null)
				msgs = ((InternalEObject)aPourCoordonneesRadioAdresseRadio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, null, msgs);
			if (newAPourCoordonneesRadioAdresseRadio != null)
				msgs = ((InternalEObject)newAPourCoordonneesRadioAdresseRadio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, null, msgs);
			msgs = basicSetAPourCoordonneesRadioAdresseRadio(newAPourCoordonneesRadioAdresseRadio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO, newAPourCoordonneesRadioAdresseRadio, newAPourCoordonneesRadioAdresseRadio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE:
				return basicSetEstDefinieParUnite(null, msgs);
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_CONSTITUE_MODULE:
				return ((InternalEList<?>)getEstConstitueModule()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION_TERRE__ACOMME_PRELEVEMENT_PRELEVEMENT_DETACHEMENT:
				return ((InternalEList<?>)getACommePrelevementPrelevementDetachement()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return basicSetAPourCoordonneesRadioAdresseRadio(null, msgs);
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
			case SchemaPackage.TYPE_ARTICULATION_TERRE__TYPE_ODB:
				return getTypeODB();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE:
				return getEstDefinieParUnite();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_CONSTITUE_MODULE:
				return getEstConstitueModule();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__ACOMME_PRELEVEMENT_PRELEVEMENT_DETACHEMENT:
				return getACommePrelevementPrelevementDetachement();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return getAPourCoordonneesRadioAdresseRadio();
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
			case SchemaPackage.TYPE_ARTICULATION_TERRE__TYPE_ODB:
				setTypeODB((TypeDictionaryDicoArticulationTerreTypeODB)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoArticulationTerreCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE:
				setEstDefinieParUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_CONSTITUE_MODULE:
				getEstConstitueModule().clear();
				getEstConstitueModule().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__ACOMME_PRELEVEMENT_PRELEVEMENT_DETACHEMENT:
				getACommePrelevementPrelevementDetachement().clear();
				getACommePrelevementPrelevementDetachement().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				setAPourCoordonneesRadioAdresseRadio((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ARTICULATION_TERRE__TYPE_ODB:
				unsetTypeODB();
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE:
				setEstDefinieParUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_CONSTITUE_MODULE:
				getEstConstitueModule().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__ACOMME_PRELEVEMENT_PRELEVEMENT_DETACHEMENT:
				getACommePrelevementPrelevementDetachement().clear();
				return;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				setAPourCoordonneesRadioAdresseRadio((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ARTICULATION_TERRE__TYPE_ODB:
				return isSetTypeODB();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_DEFINIE_PAR_UNITE:
				return estDefinieParUnite != null;
			case SchemaPackage.TYPE_ARTICULATION_TERRE__EST_CONSTITUE_MODULE:
				return estConstitueModule != null && !estConstitueModule.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__ACOMME_PRELEVEMENT_PRELEVEMENT_DETACHEMENT:
				return aCommePrelevementPrelevementDetachement != null && !aCommePrelevementPrelevementDetachement.isEmpty();
			case SchemaPackage.TYPE_ARTICULATION_TERRE__APOUR_COORDONNEES_RADIO_ADRESSE_RADIO:
				return aPourCoordonneesRadioAdresseRadio != null;
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
		result.append(" (typeODB: ");
		if (typeODBESet) result.append(typeODB); else result.append("<unset>");
		result.append(", categorie: ");
		if (categorieESet) result.append(categorie); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeArticulationTerreImpl
