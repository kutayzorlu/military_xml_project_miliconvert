/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoModaliteObtentionCategorie;
import mpia.schema.TypeModaliteObtention;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Modalite Obtention</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModaliteObtentionImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteObtentionImpl#getDateOuvertureDepot <em>Date Ouverture Depot</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteObtentionImpl#getDateFermetureDepot <em>Date Fermeture Depot</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteObtentionImpl#getDateLivraison <em>Date Livraison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteObtentionImpl#getEstLivreOuDeposeAAutreSite <em>Est Livre Ou Depose AAutre Site</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteObtentionImpl#getEstLivreOuDeposeAAutreElementControle <em>Est Livre Ou Depose AAutre Element Controle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModaliteObtentionImpl extends EObjectImpl implements TypeModaliteObtention {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModaliteObtentionCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoModaliteObtentionCategorie.DELIVERY;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModaliteObtentionCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getDateOuvertureDepot() <em>Date Ouverture Depot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOuvertureDepot()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_OUVERTURE_DEPOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateOuvertureDepot() <em>Date Ouverture Depot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOuvertureDepot()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateOuvertureDepot = DATE_OUVERTURE_DEPOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFermetureDepot() <em>Date Fermeture Depot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFermetureDepot()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FERMETURE_DEPOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFermetureDepot() <em>Date Fermeture Depot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFermetureDepot()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFermetureDepot = DATE_FERMETURE_DEPOT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateLivraison() <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLivraison()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_LIVRAISON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateLivraison() <em>Date Livraison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateLivraison()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateLivraison = DATE_LIVRAISON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstLivreOuDeposeAAutreSite() <em>Est Livre Ou Depose AAutre Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLivreOuDeposeAAutreSite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estLivreOuDeposeAAutreSite;

	/**
	 * The cached value of the '{@link #getEstLivreOuDeposeAAutreElementControle() <em>Est Livre Ou Depose AAutre Element Controle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstLivreOuDeposeAAutreElementControle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estLivreOuDeposeAAutreElementControle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModaliteObtentionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModaliteObtention();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModaliteObtentionCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoModaliteObtentionCategorie newCategorie) {
		TypeDictionaryDicoModaliteObtentionCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_OBTENTION__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoModaliteObtentionCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE_OBTENTION__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public XMLGregorianCalendar getDateOuvertureDepot() {
		return dateOuvertureDepot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOuvertureDepot(XMLGregorianCalendar newDateOuvertureDepot) {
		XMLGregorianCalendar oldDateOuvertureDepot = dateOuvertureDepot;
		dateOuvertureDepot = newDateOuvertureDepot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_OUVERTURE_DEPOT, oldDateOuvertureDepot, dateOuvertureDepot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFermetureDepot() {
		return dateFermetureDepot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFermetureDepot(XMLGregorianCalendar newDateFermetureDepot) {
		XMLGregorianCalendar oldDateFermetureDepot = dateFermetureDepot;
		dateFermetureDepot = newDateFermetureDepot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_FERMETURE_DEPOT, oldDateFermetureDepot, dateFermetureDepot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateLivraison() {
		return dateLivraison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateLivraison(XMLGregorianCalendar newDateLivraison) {
		XMLGregorianCalendar oldDateLivraison = dateLivraison;
		dateLivraison = newDateLivraison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_LIVRAISON, oldDateLivraison, dateLivraison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstLivreOuDeposeAAutreSite() {
		return estLivreOuDeposeAAutreSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLivreOuDeposeAAutreSite(TypeAssociation newEstLivreOuDeposeAAutreSite, NotificationChain msgs) {
		TypeAssociation oldEstLivreOuDeposeAAutreSite = estLivreOuDeposeAAutreSite;
		estLivreOuDeposeAAutreSite = newEstLivreOuDeposeAAutreSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE, oldEstLivreOuDeposeAAutreSite, newEstLivreOuDeposeAAutreSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLivreOuDeposeAAutreSite(TypeAssociation newEstLivreOuDeposeAAutreSite) {
		if (newEstLivreOuDeposeAAutreSite != estLivreOuDeposeAAutreSite) {
			NotificationChain msgs = null;
			if (estLivreOuDeposeAAutreSite != null)
				msgs = ((InternalEObject)estLivreOuDeposeAAutreSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE, null, msgs);
			if (newEstLivreOuDeposeAAutreSite != null)
				msgs = ((InternalEObject)newEstLivreOuDeposeAAutreSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE, null, msgs);
			msgs = basicSetEstLivreOuDeposeAAutreSite(newEstLivreOuDeposeAAutreSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE, newEstLivreOuDeposeAAutreSite, newEstLivreOuDeposeAAutreSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstLivreOuDeposeAAutreElementControle() {
		return estLivreOuDeposeAAutreElementControle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstLivreOuDeposeAAutreElementControle(TypeAssociation newEstLivreOuDeposeAAutreElementControle, NotificationChain msgs) {
		TypeAssociation oldEstLivreOuDeposeAAutreElementControle = estLivreOuDeposeAAutreElementControle;
		estLivreOuDeposeAAutreElementControle = newEstLivreOuDeposeAAutreElementControle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE, oldEstLivreOuDeposeAAutreElementControle, newEstLivreOuDeposeAAutreElementControle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstLivreOuDeposeAAutreElementControle(TypeAssociation newEstLivreOuDeposeAAutreElementControle) {
		if (newEstLivreOuDeposeAAutreElementControle != estLivreOuDeposeAAutreElementControle) {
			NotificationChain msgs = null;
			if (estLivreOuDeposeAAutreElementControle != null)
				msgs = ((InternalEObject)estLivreOuDeposeAAutreElementControle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE, null, msgs);
			if (newEstLivreOuDeposeAAutreElementControle != null)
				msgs = ((InternalEObject)newEstLivreOuDeposeAAutreElementControle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE, null, msgs);
			msgs = basicSetEstLivreOuDeposeAAutreElementControle(newEstLivreOuDeposeAAutreElementControle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE, newEstLivreOuDeposeAAutreElementControle, newEstLivreOuDeposeAAutreElementControle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE:
				return basicSetEstLivreOuDeposeAAutreSite(null, msgs);
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE:
				return basicSetEstLivreOuDeposeAAutreElementControle(null, msgs);
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
			case SchemaPackage.TYPE_MODALITE_OBTENTION__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_OUVERTURE_DEPOT:
				return getDateOuvertureDepot();
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_FERMETURE_DEPOT:
				return getDateFermetureDepot();
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_LIVRAISON:
				return getDateLivraison();
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE:
				return getEstLivreOuDeposeAAutreSite();
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE:
				return getEstLivreOuDeposeAAutreElementControle();
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
			case SchemaPackage.TYPE_MODALITE_OBTENTION__CATEGORIE:
				setCategorie((TypeDictionaryDicoModaliteObtentionCategorie)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_OUVERTURE_DEPOT:
				setDateOuvertureDepot((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_FERMETURE_DEPOT:
				setDateFermetureDepot((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_LIVRAISON:
				setDateLivraison((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE:
				setEstLivreOuDeposeAAutreSite((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE:
				setEstLivreOuDeposeAAutreElementControle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MODALITE_OBTENTION__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_OUVERTURE_DEPOT:
				setDateOuvertureDepot(DATE_OUVERTURE_DEPOT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_FERMETURE_DEPOT:
				setDateFermetureDepot(DATE_FERMETURE_DEPOT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_LIVRAISON:
				setDateLivraison(DATE_LIVRAISON_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE:
				setEstLivreOuDeposeAAutreSite((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE:
				setEstLivreOuDeposeAAutreElementControle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MODALITE_OBTENTION__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_OUVERTURE_DEPOT:
				return DATE_OUVERTURE_DEPOT_EDEFAULT == null ? dateOuvertureDepot != null : !DATE_OUVERTURE_DEPOT_EDEFAULT.equals(dateOuvertureDepot);
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_FERMETURE_DEPOT:
				return DATE_FERMETURE_DEPOT_EDEFAULT == null ? dateFermetureDepot != null : !DATE_FERMETURE_DEPOT_EDEFAULT.equals(dateFermetureDepot);
			case SchemaPackage.TYPE_MODALITE_OBTENTION__DATE_LIVRAISON:
				return DATE_LIVRAISON_EDEFAULT == null ? dateLivraison != null : !DATE_LIVRAISON_EDEFAULT.equals(dateLivraison);
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_SITE:
				return estLivreOuDeposeAAutreSite != null;
			case SchemaPackage.TYPE_MODALITE_OBTENTION__EST_LIVRE_OU_DEPOSE_AAUTRE_ELEMENT_CONTROLE:
				return estLivreOuDeposeAAutreElementControle != null;
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
		result.append(", dateOuvertureDepot: ");
		result.append(dateOuvertureDepot);
		result.append(", dateFermetureDepot: ");
		result.append(dateFermetureDepot);
		result.append(", dateLivraison: ");
		result.append(dateLivraison);
		result.append(')');
		return result.toString();
	}

} //TypeModaliteObtentionImpl
