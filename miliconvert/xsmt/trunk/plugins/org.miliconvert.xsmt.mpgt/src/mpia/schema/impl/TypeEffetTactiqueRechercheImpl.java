/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEffetTactiqueASS;
import mpia.schema.TypeEffetTactiqueRecherche;
import mpia.schema.TypeTypeObjectifASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Effet Tactique Recherche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEffetTactiqueRechercheImpl#getEffetRecherche <em>Effet Recherche</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetTactiqueRechercheImpl#getDureeEffet <em>Duree Effet</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEffetTactiqueRechercheImpl#getConcerneTypeObjectifASS <em>Concerne Type Objectif ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEffetTactiqueRechercheImpl extends EObjectImpl implements TypeEffetTactiqueRecherche {
	/**
	 * The default value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEffetTactiqueASS EFFET_RECHERCHE_EDEFAULT = TypeDictionaryDicoEffetTactiqueASS.NOS;

	/**
	 * The cached value of the '{@link #getEffetRecherche() <em>Effet Recherche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetRecherche()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEffetTactiqueASS effetRecherche = EFFET_RECHERCHE_EDEFAULT;

	/**
	 * This is true if the Effet Recherche attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetRechercheESet;

	/**
	 * The cached value of the '{@link #getDureeEffet() <em>Duree Effet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeEffet()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeEffet;

	/**
	 * The cached value of the '{@link #getConcerneTypeObjectifASS() <em>Concerne Type Objectif ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneTypeObjectifASS()
	 * @generated
	 * @ordered
	 */
	protected TypeTypeObjectifASS concerneTypeObjectifASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEffetTactiqueRechercheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEffetTactiqueRecherche();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEffetTactiqueASS getEffetRecherche() {
		return effetRecherche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetRecherche(TypeDictionaryDicoEffetTactiqueASS newEffetRecherche) {
		TypeDictionaryDicoEffetTactiqueASS oldEffetRecherche = effetRecherche;
		effetRecherche = newEffetRecherche == null ? EFFET_RECHERCHE_EDEFAULT : newEffetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRechercheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__EFFET_RECHERCHE, oldEffetRecherche, effetRecherche, !oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetRecherche() {
		TypeDictionaryDicoEffetTactiqueASS oldEffetRecherche = effetRecherche;
		boolean oldEffetRechercheESet = effetRechercheESet;
		effetRecherche = EFFET_RECHERCHE_EDEFAULT;
		effetRechercheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__EFFET_RECHERCHE, oldEffetRecherche, EFFET_RECHERCHE_EDEFAULT, oldEffetRechercheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetRecherche() {
		return effetRechercheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeEffet() {
		return dureeEffet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeEffet(TypeDataTypeDuree newDureeEffet, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeEffet = dureeEffet;
		dureeEffet = newDureeEffet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET, oldDureeEffet, newDureeEffet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeEffet(TypeDataTypeDuree newDureeEffet) {
		if (newDureeEffet != dureeEffet) {
			NotificationChain msgs = null;
			if (dureeEffet != null)
				msgs = ((InternalEObject)dureeEffet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET, null, msgs);
			if (newDureeEffet != null)
				msgs = ((InternalEObject)newDureeEffet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET, null, msgs);
			msgs = basicSetDureeEffet(newDureeEffet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET, newDureeEffet, newDureeEffet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeObjectifASS getConcerneTypeObjectifASS() {
		return concerneTypeObjectifASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneTypeObjectifASS(TypeTypeObjectifASS newConcerneTypeObjectifASS, NotificationChain msgs) {
		TypeTypeObjectifASS oldConcerneTypeObjectifASS = concerneTypeObjectifASS;
		concerneTypeObjectifASS = newConcerneTypeObjectifASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS, oldConcerneTypeObjectifASS, newConcerneTypeObjectifASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneTypeObjectifASS(TypeTypeObjectifASS newConcerneTypeObjectifASS) {
		if (newConcerneTypeObjectifASS != concerneTypeObjectifASS) {
			NotificationChain msgs = null;
			if (concerneTypeObjectifASS != null)
				msgs = ((InternalEObject)concerneTypeObjectifASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS, null, msgs);
			if (newConcerneTypeObjectifASS != null)
				msgs = ((InternalEObject)newConcerneTypeObjectifASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS, null, msgs);
			msgs = basicSetConcerneTypeObjectifASS(newConcerneTypeObjectifASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS, newConcerneTypeObjectifASS, newConcerneTypeObjectifASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET:
				return basicSetDureeEffet(null, msgs);
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS:
				return basicSetConcerneTypeObjectifASS(null, msgs);
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
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__EFFET_RECHERCHE:
				return getEffetRecherche();
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET:
				return getDureeEffet();
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS:
				return getConcerneTypeObjectifASS();
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
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__EFFET_RECHERCHE:
				setEffetRecherche((TypeDictionaryDicoEffetTactiqueASS)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET:
				setDureeEffet((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS:
				setConcerneTypeObjectifASS((TypeTypeObjectifASS)newValue);
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
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__EFFET_RECHERCHE:
				unsetEffetRecherche();
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET:
				setDureeEffet((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS:
				setConcerneTypeObjectifASS((TypeTypeObjectifASS)null);
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
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__EFFET_RECHERCHE:
				return isSetEffetRecherche();
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__DUREE_EFFET:
				return dureeEffet != null;
			case SchemaPackage.TYPE_EFFET_TACTIQUE_RECHERCHE__CONCERNE_TYPE_OBJECTIF_ASS:
				return concerneTypeObjectifASS != null;
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
		result.append(" (effetRecherche: ");
		if (effetRechercheESet) result.append(effetRecherche); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEffetTactiqueRechercheImpl
