/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCompetenceLinguistique;
import mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveau;
import mpia.schema.TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis;
import mpia.schema.TypeDictionaryDicoLangue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Competence Linguistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCompetenceLinguistiqueImpl#getLangue <em>Langue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompetenceLinguistiqueImpl#getNiveauGeneral <em>Niveau General</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompetenceLinguistiqueImpl#getNiveauCompris <em>Niveau Compris</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompetenceLinguistiqueImpl#getNiveauParle <em>Niveau Parle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompetenceLinguistiqueImpl#getNiveauLu <em>Niveau Lu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompetenceLinguistiqueImpl#getNiveauEcrit <em>Niveau Ecrit</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompetenceLinguistiqueImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCompetenceLinguistiqueImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCompetenceLinguistiqueImpl extends EObjectImpl implements TypeCompetenceLinguistique {
	/**
	 * The default value of the '{@link #getLangue() <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangue()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoLangue LANGUE_EDEFAULT = TypeDictionaryDicoLangue.AFGHAN;

	/**
	 * The cached value of the '{@link #getLangue() <em>Langue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangue()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoLangue langue = LANGUE_EDEFAULT;

	/**
	 * This is true if the Langue attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean langueESet;

	/**
	 * The default value of the '{@link #getNiveauGeneral() <em>Niveau General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauGeneral()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompetenceLinguistiqueNiveau NIVEAU_GENERAL_EDEFAULT = TypeDictionaryDicoCompetenceLinguistiqueNiveau.ELEM;

	/**
	 * The cached value of the '{@link #getNiveauGeneral() <em>Niveau General</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauGeneral()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompetenceLinguistiqueNiveau niveauGeneral = NIVEAU_GENERAL_EDEFAULT;

	/**
	 * This is true if the Niveau General attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauGeneralESet;

	/**
	 * The default value of the '{@link #getNiveauCompris() <em>Niveau Compris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauCompris()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis NIVEAU_COMPRIS_EDEFAULT = TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis._0;

	/**
	 * The cached value of the '{@link #getNiveauCompris() <em>Niveau Compris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauCompris()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis niveauCompris = NIVEAU_COMPRIS_EDEFAULT;

	/**
	 * This is true if the Niveau Compris attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauComprisESet;

	/**
	 * The default value of the '{@link #getNiveauParle() <em>Niveau Parle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauParle()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis NIVEAU_PARLE_EDEFAULT = TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis._0;

	/**
	 * The cached value of the '{@link #getNiveauParle() <em>Niveau Parle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauParle()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis niveauParle = NIVEAU_PARLE_EDEFAULT;

	/**
	 * This is true if the Niveau Parle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauParleESet;

	/**
	 * The default value of the '{@link #getNiveauLu() <em>Niveau Lu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauLu()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis NIVEAU_LU_EDEFAULT = TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis._0;

	/**
	 * The cached value of the '{@link #getNiveauLu() <em>Niveau Lu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauLu()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis niveauLu = NIVEAU_LU_EDEFAULT;

	/**
	 * This is true if the Niveau Lu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauLuESet;

	/**
	 * The default value of the '{@link #getNiveauEcrit() <em>Niveau Ecrit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEcrit()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis NIVEAU_ECRIT_EDEFAULT = TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis._0;

	/**
	 * The cached value of the '{@link #getNiveauEcrit() <em>Niveau Ecrit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEcrit()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis niveauEcrit = NIVEAU_ECRIT_EDEFAULT;

	/**
	 * This is true if the Niveau Ecrit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauEcritESet;

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
	protected TypeCompetenceLinguistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCompetenceLinguistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoLangue getLangue() {
		return langue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangue(TypeDictionaryDicoLangue newLangue) {
		TypeDictionaryDicoLangue oldLangue = langue;
		langue = newLangue == null ? LANGUE_EDEFAULT : newLangue;
		boolean oldLangueESet = langueESet;
		langueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__LANGUE, oldLangue, langue, !oldLangueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLangue() {
		TypeDictionaryDicoLangue oldLangue = langue;
		boolean oldLangueESet = langueESet;
		langue = LANGUE_EDEFAULT;
		langueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__LANGUE, oldLangue, LANGUE_EDEFAULT, oldLangueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLangue() {
		return langueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompetenceLinguistiqueNiveau getNiveauGeneral() {
		return niveauGeneral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauGeneral(TypeDictionaryDicoCompetenceLinguistiqueNiveau newNiveauGeneral) {
		TypeDictionaryDicoCompetenceLinguistiqueNiveau oldNiveauGeneral = niveauGeneral;
		niveauGeneral = newNiveauGeneral == null ? NIVEAU_GENERAL_EDEFAULT : newNiveauGeneral;
		boolean oldNiveauGeneralESet = niveauGeneralESet;
		niveauGeneralESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_GENERAL, oldNiveauGeneral, niveauGeneral, !oldNiveauGeneralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauGeneral() {
		TypeDictionaryDicoCompetenceLinguistiqueNiveau oldNiveauGeneral = niveauGeneral;
		boolean oldNiveauGeneralESet = niveauGeneralESet;
		niveauGeneral = NIVEAU_GENERAL_EDEFAULT;
		niveauGeneralESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_GENERAL, oldNiveauGeneral, NIVEAU_GENERAL_EDEFAULT, oldNiveauGeneralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauGeneral() {
		return niveauGeneralESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis getNiveauCompris() {
		return niveauCompris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauCompris(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis newNiveauCompris) {
		TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis oldNiveauCompris = niveauCompris;
		niveauCompris = newNiveauCompris == null ? NIVEAU_COMPRIS_EDEFAULT : newNiveauCompris;
		boolean oldNiveauComprisESet = niveauComprisESet;
		niveauComprisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_COMPRIS, oldNiveauCompris, niveauCompris, !oldNiveauComprisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauCompris() {
		TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis oldNiveauCompris = niveauCompris;
		boolean oldNiveauComprisESet = niveauComprisESet;
		niveauCompris = NIVEAU_COMPRIS_EDEFAULT;
		niveauComprisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_COMPRIS, oldNiveauCompris, NIVEAU_COMPRIS_EDEFAULT, oldNiveauComprisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauCompris() {
		return niveauComprisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis getNiveauParle() {
		return niveauParle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauParle(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis newNiveauParle) {
		TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis oldNiveauParle = niveauParle;
		niveauParle = newNiveauParle == null ? NIVEAU_PARLE_EDEFAULT : newNiveauParle;
		boolean oldNiveauParleESet = niveauParleESet;
		niveauParleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_PARLE, oldNiveauParle, niveauParle, !oldNiveauParleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauParle() {
		TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis oldNiveauParle = niveauParle;
		boolean oldNiveauParleESet = niveauParleESet;
		niveauParle = NIVEAU_PARLE_EDEFAULT;
		niveauParleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_PARLE, oldNiveauParle, NIVEAU_PARLE_EDEFAULT, oldNiveauParleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauParle() {
		return niveauParleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis getNiveauLu() {
		return niveauLu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauLu(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis newNiveauLu) {
		TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis oldNiveauLu = niveauLu;
		niveauLu = newNiveauLu == null ? NIVEAU_LU_EDEFAULT : newNiveauLu;
		boolean oldNiveauLuESet = niveauLuESet;
		niveauLuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_LU, oldNiveauLu, niveauLu, !oldNiveauLuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauLu() {
		TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis oldNiveauLu = niveauLu;
		boolean oldNiveauLuESet = niveauLuESet;
		niveauLu = NIVEAU_LU_EDEFAULT;
		niveauLuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_LU, oldNiveauLu, NIVEAU_LU_EDEFAULT, oldNiveauLuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauLu() {
		return niveauLuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis getNiveauEcrit() {
		return niveauEcrit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauEcrit(TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis newNiveauEcrit) {
		TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis oldNiveauEcrit = niveauEcrit;
		niveauEcrit = newNiveauEcrit == null ? NIVEAU_ECRIT_EDEFAULT : newNiveauEcrit;
		boolean oldNiveauEcritESet = niveauEcritESet;
		niveauEcritESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_ECRIT, oldNiveauEcrit, niveauEcrit, !oldNiveauEcritESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauEcrit() {
		TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis oldNiveauEcrit = niveauEcrit;
		boolean oldNiveauEcritESet = niveauEcritESet;
		niveauEcrit = NIVEAU_ECRIT_EDEFAULT;
		niveauEcritESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_ECRIT, oldNiveauEcrit, NIVEAU_ECRIT_EDEFAULT, oldNiveauEcritESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauEcrit() {
		return niveauEcritESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__LANGUE:
				return getLangue();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_GENERAL:
				return getNiveauGeneral();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_COMPRIS:
				return getNiveauCompris();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_PARLE:
				return getNiveauParle();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_LU:
				return getNiveauLu();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_ECRIT:
				return getNiveauEcrit();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CE:
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
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__LANGUE:
				setLangue((TypeDictionaryDicoLangue)newValue);
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_GENERAL:
				setNiveauGeneral((TypeDictionaryDicoCompetenceLinguistiqueNiveau)newValue);
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_COMPRIS:
				setNiveauCompris((TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)newValue);
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_PARLE:
				setNiveauParle((TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)newValue);
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_LU:
				setNiveauLu((TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)newValue);
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_ECRIT:
				setNiveauEcrit((TypeDictionaryDicoCompetenceLinguistiqueNiveauPrecis)newValue);
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CE:
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
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__LANGUE:
				unsetLangue();
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_GENERAL:
				unsetNiveauGeneral();
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_COMPRIS:
				unsetNiveauCompris();
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_PARLE:
				unsetNiveauParle();
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_LU:
				unsetNiveauLu();
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_ECRIT:
				unsetNiveauEcrit();
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CE:
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
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__LANGUE:
				return isSetLangue();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_GENERAL:
				return isSetNiveauGeneral();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_COMPRIS:
				return isSetNiveauCompris();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_PARLE:
				return isSetNiveauParle();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_LU:
				return isSetNiveauLu();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__NIVEAU_ECRIT:
				return isSetNiveauEcrit();
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_COMPETENCE_LINGUISTIQUE__CE:
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
		result.append(" (langue: ");
		if (langueESet) result.append(langue); else result.append("<unset>");
		result.append(", niveauGeneral: ");
		if (niveauGeneralESet) result.append(niveauGeneral); else result.append("<unset>");
		result.append(", niveauCompris: ");
		if (niveauComprisESet) result.append(niveauCompris); else result.append("<unset>");
		result.append(", niveauParle: ");
		if (niveauParleESet) result.append(niveauParle); else result.append("<unset>");
		result.append(", niveauLu: ");
		if (niveauLuESet) result.append(niveauLu); else result.append("<unset>");
		result.append(", niveauEcrit: ");
		if (niveauEcritESet) result.append(niveauEcrit); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCompetenceLinguistiqueImpl
