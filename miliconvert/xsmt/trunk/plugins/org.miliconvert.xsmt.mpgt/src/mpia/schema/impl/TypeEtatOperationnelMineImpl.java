/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMineEffetParachutage;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMineQualificatifEtat;
import mpia.schema.TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime;
import mpia.schema.TypeEtatOperationnelMine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Mine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMineImpl#getQualificatifEtat <em>Qualificatif Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMineImpl#getQualificatifEtatMineMaritime <em>Qualificatif Etat Mine Maritime</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMineImpl#getPourcentageEnfouissement <em>Pourcentage Enfouissement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelMineImpl#getEffetParachutage <em>Effet Parachutage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelMineImpl extends EObjectImpl implements TypeEtatOperationnelMine {
	/**
	 * The default value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMineQualificatifEtat QUALIFICATIF_ETAT_EDEFAULT = TypeDictionaryDicoEtatOperationnelMineQualificatifEtat.ACTVED;

	/**
	 * The cached value of the '{@link #getQualificatifEtat() <em>Qualificatif Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMineQualificatifEtat qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;

	/**
	 * This is true if the Qualificatif Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifEtatESet;

	/**
	 * The default value of the '{@link #getQualificatifEtatMineMaritime() <em>Qualificatif Etat Mine Maritime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtatMineMaritime()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime QUALIFICATIF_ETAT_MINE_MARITIME_EDEFAULT = TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime.CNTMND;

	/**
	 * The cached value of the '{@link #getQualificatifEtatMineMaritime() <em>Qualificatif Etat Mine Maritime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualificatifEtatMineMaritime()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime qualificatifEtatMineMaritime = QUALIFICATIF_ETAT_MINE_MARITIME_EDEFAULT;

	/**
	 * This is true if the Qualificatif Etat Mine Maritime attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean qualificatifEtatMineMaritimeESet;

	/**
	 * The default value of the '{@link #getPourcentageEnfouissement() <em>Pourcentage Enfouissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageEnfouissement()
	 * @generated
	 * @ordered
	 */
	protected static final double POURCENTAGE_ENFOUISSEMENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPourcentageEnfouissement() <em>Pourcentage Enfouissement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPourcentageEnfouissement()
	 * @generated
	 * @ordered
	 */
	protected double pourcentageEnfouissement = POURCENTAGE_ENFOUISSEMENT_EDEFAULT;

	/**
	 * This is true if the Pourcentage Enfouissement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pourcentageEnfouissementESet;

	/**
	 * The default value of the '{@link #getEffetParachutage() <em>Effet Parachutage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetParachutage()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelMineEffetParachutage EFFET_PARACHUTAGE_EDEFAULT = TypeDictionaryDicoEtatOperationnelMineEffetParachutage.NORMAL;

	/**
	 * The cached value of the '{@link #getEffetParachutage() <em>Effet Parachutage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffetParachutage()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelMineEffetParachutage effetParachutage = EFFET_PARACHUTAGE_EDEFAULT;

	/**
	 * This is true if the Effet Parachutage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effetParachutageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelMineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelMine();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMineQualificatifEtat getQualificatifEtat() {
		return qualificatifEtat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifEtat(TypeDictionaryDicoEtatOperationnelMineQualificatifEtat newQualificatifEtat) {
		TypeDictionaryDicoEtatOperationnelMineQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		qualificatifEtat = newQualificatifEtat == null ? QUALIFICATIF_ETAT_EDEFAULT : newQualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT, oldQualificatifEtat, qualificatifEtat, !oldQualificatifEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifEtat() {
		TypeDictionaryDicoEtatOperationnelMineQualificatifEtat oldQualificatifEtat = qualificatifEtat;
		boolean oldQualificatifEtatESet = qualificatifEtatESet;
		qualificatifEtat = QUALIFICATIF_ETAT_EDEFAULT;
		qualificatifEtatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT, oldQualificatifEtat, QUALIFICATIF_ETAT_EDEFAULT, oldQualificatifEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifEtat() {
		return qualificatifEtatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime getQualificatifEtatMineMaritime() {
		return qualificatifEtatMineMaritime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualificatifEtatMineMaritime(TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime newQualificatifEtatMineMaritime) {
		TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime oldQualificatifEtatMineMaritime = qualificatifEtatMineMaritime;
		qualificatifEtatMineMaritime = newQualificatifEtatMineMaritime == null ? QUALIFICATIF_ETAT_MINE_MARITIME_EDEFAULT : newQualificatifEtatMineMaritime;
		boolean oldQualificatifEtatMineMaritimeESet = qualificatifEtatMineMaritimeESet;
		qualificatifEtatMineMaritimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT_MINE_MARITIME, oldQualificatifEtatMineMaritime, qualificatifEtatMineMaritime, !oldQualificatifEtatMineMaritimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualificatifEtatMineMaritime() {
		TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime oldQualificatifEtatMineMaritime = qualificatifEtatMineMaritime;
		boolean oldQualificatifEtatMineMaritimeESet = qualificatifEtatMineMaritimeESet;
		qualificatifEtatMineMaritime = QUALIFICATIF_ETAT_MINE_MARITIME_EDEFAULT;
		qualificatifEtatMineMaritimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT_MINE_MARITIME, oldQualificatifEtatMineMaritime, QUALIFICATIF_ETAT_MINE_MARITIME_EDEFAULT, oldQualificatifEtatMineMaritimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualificatifEtatMineMaritime() {
		return qualificatifEtatMineMaritimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPourcentageEnfouissement() {
		return pourcentageEnfouissement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPourcentageEnfouissement(double newPourcentageEnfouissement) {
		double oldPourcentageEnfouissement = pourcentageEnfouissement;
		pourcentageEnfouissement = newPourcentageEnfouissement;
		boolean oldPourcentageEnfouissementESet = pourcentageEnfouissementESet;
		pourcentageEnfouissementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__POURCENTAGE_ENFOUISSEMENT, oldPourcentageEnfouissement, pourcentageEnfouissement, !oldPourcentageEnfouissementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPourcentageEnfouissement() {
		double oldPourcentageEnfouissement = pourcentageEnfouissement;
		boolean oldPourcentageEnfouissementESet = pourcentageEnfouissementESet;
		pourcentageEnfouissement = POURCENTAGE_ENFOUISSEMENT_EDEFAULT;
		pourcentageEnfouissementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__POURCENTAGE_ENFOUISSEMENT, oldPourcentageEnfouissement, POURCENTAGE_ENFOUISSEMENT_EDEFAULT, oldPourcentageEnfouissementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPourcentageEnfouissement() {
		return pourcentageEnfouissementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelMineEffetParachutage getEffetParachutage() {
		return effetParachutage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffetParachutage(TypeDictionaryDicoEtatOperationnelMineEffetParachutage newEffetParachutage) {
		TypeDictionaryDicoEtatOperationnelMineEffetParachutage oldEffetParachutage = effetParachutage;
		effetParachutage = newEffetParachutage == null ? EFFET_PARACHUTAGE_EDEFAULT : newEffetParachutage;
		boolean oldEffetParachutageESet = effetParachutageESet;
		effetParachutageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__EFFET_PARACHUTAGE, oldEffetParachutage, effetParachutage, !oldEffetParachutageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffetParachutage() {
		TypeDictionaryDicoEtatOperationnelMineEffetParachutage oldEffetParachutage = effetParachutage;
		boolean oldEffetParachutageESet = effetParachutageESet;
		effetParachutage = EFFET_PARACHUTAGE_EDEFAULT;
		effetParachutageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__EFFET_PARACHUTAGE, oldEffetParachutage, EFFET_PARACHUTAGE_EDEFAULT, oldEffetParachutageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffetParachutage() {
		return effetParachutageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT:
				return getQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT_MINE_MARITIME:
				return getQualificatifEtatMineMaritime();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__POURCENTAGE_ENFOUISSEMENT:
				return new Double(getPourcentageEnfouissement());
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__EFFET_PARACHUTAGE:
				return getEffetParachutage();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT:
				setQualificatifEtat((TypeDictionaryDicoEtatOperationnelMineQualificatifEtat)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT_MINE_MARITIME:
				setQualificatifEtatMineMaritime((TypeDictionaryDicoEtatOperationnelMineQualificatifEtatMineMaritime)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__POURCENTAGE_ENFOUISSEMENT:
				setPourcentageEnfouissement(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__EFFET_PARACHUTAGE:
				setEffetParachutage((TypeDictionaryDicoEtatOperationnelMineEffetParachutage)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT:
				unsetQualificatifEtat();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT_MINE_MARITIME:
				unsetQualificatifEtatMineMaritime();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__POURCENTAGE_ENFOUISSEMENT:
				unsetPourcentageEnfouissement();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__EFFET_PARACHUTAGE:
				unsetEffetParachutage();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT:
				return isSetQualificatifEtat();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__QUALIFICATIF_ETAT_MINE_MARITIME:
				return isSetQualificatifEtatMineMaritime();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__POURCENTAGE_ENFOUISSEMENT:
				return isSetPourcentageEnfouissement();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_MINE__EFFET_PARACHUTAGE:
				return isSetEffetParachutage();
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
		result.append(" (qualificatifEtat: ");
		if (qualificatifEtatESet) result.append(qualificatifEtat); else result.append("<unset>");
		result.append(", qualificatifEtatMineMaritime: ");
		if (qualificatifEtatMineMaritimeESet) result.append(qualificatifEtatMineMaritime); else result.append("<unset>");
		result.append(", pourcentageEnfouissement: ");
		if (pourcentageEnfouissementESet) result.append(pourcentageEnfouissement); else result.append("<unset>");
		result.append(", effetParachutage: ");
		if (effetParachutageESet) result.append(effetParachutage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelMineImpl
