/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeConsommationEnMunitions;
import mpia.schema.TypeDictionaryDicoConsommationEnMunitionsEffetFeu;
import mpia.schema.TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Consommation En Munitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeConsommationEnMunitionsImpl#getNombreMunitions <em>Nombre Munitions</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationEnMunitionsImpl#getEffetFeu <em>Effet Feu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationEnMunitionsImpl#getNatureChargeEmise <em>Nature Charge Emise</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationEnMunitionsImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationEnMunitionsImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationEnMunitionsImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeConsommationEnMunitionsImpl#getACommeTypeFeuTypeArme <em>AComme Type Feu Type Arme</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConsommationEnMunitionsImpl extends EObjectImpl implements TypeConsommationEnMunitions {
	/**
	 * The default value of the '{@link #getNombreMunitions() <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMunitions()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_MUNITIONS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreMunitions() <em>Nombre Munitions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreMunitions()
	 * @generated
	 * @ordered
	 */
	protected long nombreMunitions = NOMBRE_MUNITIONS_EDEFAULT;

	/**
	 * This is true if the Nombre Munitions attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreMunitionsESet;

	/**
	 * The default value of the '{@link #getEffetFeu() <em>Effet Feu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetFeu()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsommationEnMunitionsEffetFeu EFFET_FEU_EDEFAULT = TypeDictionaryDicoConsommationEnMunitionsEffetFeu.GRE;

	/**
	 * The cached value of the '{@link #getEffetFeu() <em>Effet Feu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetFeu()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsommationEnMunitionsEffetFeu effetFeu = EFFET_FEU_EDEFAULT;

	/**
	 * This is true if the Effet Feu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetFeuESet;

	/**
	 * The default value of the '{@link #getNatureChargeEmise() <em>Nature Charge Emise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureChargeEmise()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise NATURE_CHARGE_EMISE_EDEFAULT = TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise.SLOW;

	/**
	 * The cached value of the '{@link #getNatureChargeEmise() <em>Nature Charge Emise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNatureChargeEmise()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise natureChargeEmise = NATURE_CHARGE_EMISE_EDEFAULT;

	/**
	 * This is true if the Nature Charge Emise attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean natureChargeEmiseESet;

	/**
	 * The default value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaire() <em>Commentaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaire()
	 * @generated
	 * @ordered
	 */
	protected String commentaire = COMMENTAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getACommeTypeFeuTypeArme() <em>AComme Type Feu Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeTypeFeuTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aCommeTypeFeuTypeArme;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConsommationEnMunitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeConsommationEnMunitions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreMunitions() {
		return nombreMunitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreMunitions(long newNombreMunitions) {
		long oldNombreMunitions = nombreMunitions;
		nombreMunitions = newNombreMunitions;
		boolean oldNombreMunitionsESet = nombreMunitionsESet;
		nombreMunitionsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NOMBRE_MUNITIONS, oldNombreMunitions, nombreMunitions, !oldNombreMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreMunitions() {
		long oldNombreMunitions = nombreMunitions;
		boolean oldNombreMunitionsESet = nombreMunitionsESet;
		nombreMunitions = NOMBRE_MUNITIONS_EDEFAULT;
		nombreMunitionsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NOMBRE_MUNITIONS, oldNombreMunitions, NOMBRE_MUNITIONS_EDEFAULT, oldNombreMunitionsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreMunitions() {
		return nombreMunitionsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsommationEnMunitionsEffetFeu getEffetFeu() {
		return effetFeu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetFeu(TypeDictionaryDicoConsommationEnMunitionsEffetFeu newEffetFeu) {
		TypeDictionaryDicoConsommationEnMunitionsEffetFeu oldEffetFeu = effetFeu;
		effetFeu = newEffetFeu == null ? EFFET_FEU_EDEFAULT : newEffetFeu;
		boolean oldEffetFeuESet = effetFeuESet;
		effetFeuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__EFFET_FEU, oldEffetFeu, effetFeu, !oldEffetFeuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetFeu() {
		TypeDictionaryDicoConsommationEnMunitionsEffetFeu oldEffetFeu = effetFeu;
		boolean oldEffetFeuESet = effetFeuESet;
		effetFeu = EFFET_FEU_EDEFAULT;
		effetFeuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__EFFET_FEU, oldEffetFeu, EFFET_FEU_EDEFAULT, oldEffetFeuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetFeu() {
		return effetFeuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise getNatureChargeEmise() {
		return natureChargeEmise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNatureChargeEmise(TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise newNatureChargeEmise) {
		TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise oldNatureChargeEmise = natureChargeEmise;
		natureChargeEmise = newNatureChargeEmise == null ? NATURE_CHARGE_EMISE_EDEFAULT : newNatureChargeEmise;
		boolean oldNatureChargeEmiseESet = natureChargeEmiseESet;
		natureChargeEmiseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NATURE_CHARGE_EMISE, oldNatureChargeEmise, natureChargeEmise, !oldNatureChargeEmiseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNatureChargeEmise() {
		TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise oldNatureChargeEmise = natureChargeEmise;
		boolean oldNatureChargeEmiseESet = natureChargeEmiseESet;
		natureChargeEmise = NATURE_CHARGE_EMISE_EDEFAULT;
		natureChargeEmiseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NATURE_CHARGE_EMISE, oldNatureChargeEmise, NATURE_CHARGE_EMISE_EDEFAULT, oldNatureChargeEmiseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNatureChargeEmise() {
		return natureChargeEmiseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaire() {
		return commentaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaire(String newCommentaire) {
		String oldCommentaire = commentaire;
		commentaire = newCommentaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getACommeTypeFeuTypeArme() {
		return aCommeTypeFeuTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommeTypeFeuTypeArme(TypeAssociationEXT newACommeTypeFeuTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldACommeTypeFeuTypeArme = aCommeTypeFeuTypeArme;
		aCommeTypeFeuTypeArme = newACommeTypeFeuTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME, oldACommeTypeFeuTypeArme, newACommeTypeFeuTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommeTypeFeuTypeArme(TypeAssociationEXT newACommeTypeFeuTypeArme) {
		if (newACommeTypeFeuTypeArme != aCommeTypeFeuTypeArme) {
			NotificationChain msgs = null;
			if (aCommeTypeFeuTypeArme != null)
				msgs = ((InternalEObject)aCommeTypeFeuTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME, null, msgs);
			if (newACommeTypeFeuTypeArme != null)
				msgs = ((InternalEObject)newACommeTypeFeuTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME, null, msgs);
			msgs = basicSetACommeTypeFeuTypeArme(newACommeTypeFeuTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME, newACommeTypeFeuTypeArme, newACommeTypeFeuTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME:
				return basicSetACommeTypeFeuTypeArme(null, msgs);
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
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NOMBRE_MUNITIONS:
				return new Long(getNombreMunitions());
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__EFFET_FEU:
				return getEffetFeu();
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NATURE_CHARGE_EMISE:
				return getNatureChargeEmise();
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CE:
				return getCE();
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME:
				return getACommeTypeFeuTypeArme();
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
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NOMBRE_MUNITIONS:
				setNombreMunitions(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__EFFET_FEU:
				setEffetFeu((TypeDictionaryDicoConsommationEnMunitionsEffetFeu)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NATURE_CHARGE_EMISE:
				setNatureChargeEmise((TypeDictionaryDicoConsommationEnMunitionsNatureChargeEmise)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME:
				setACommeTypeFeuTypeArme((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NOMBRE_MUNITIONS:
				unsetNombreMunitions();
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__EFFET_FEU:
				unsetEffetFeu();
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NATURE_CHARGE_EMISE:
				unsetNatureChargeEmise();
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME:
				setACommeTypeFeuTypeArme((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NOMBRE_MUNITIONS:
				return isSetNombreMunitions();
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__EFFET_FEU:
				return isSetEffetFeu();
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__NATURE_CHARGE_EMISE:
				return isSetNatureChargeEmise();
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CONSOMMATION_EN_MUNITIONS__ACOMME_TYPE_FEU_TYPE_ARME:
				return aCommeTypeFeuTypeArme != null;
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
		result.append(" (nombreMunitions: ");
		if (nombreMunitionsESet) result.append(nombreMunitions); else result.append("<unset>");
		result.append(", effetFeu: ");
		if (effetFeuESet) result.append(effetFeu); else result.append("<unset>");
		result.append(", natureChargeEmise: ");
		if (natureChargeEmiseESet) result.append(natureChargeEmise); else result.append("<unset>");
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeConsommationEnMunitionsImpl
