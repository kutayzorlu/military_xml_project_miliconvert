/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutonomieModule;
import mpia.schema.TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autonomie Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutonomieModuleImpl#getAutreCapaciteOperationnelle <em>Autre Capacite Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutonomieModuleImpl#getDureeVol <em>Duree Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutonomieModuleImpl#getQuantiteCarburantRestant <em>Quantite Carburant Restant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutonomieModuleImpl#getCapaciteOperationnelle <em>Capacite Operationnelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutonomieModuleImpl#getPotentielHoraireRestant <em>Potentiel Horaire Restant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutonomieModuleImpl extends EObjectImpl implements TypeAutonomieModule {
	/**
	 * The default value of the '{@link #getAutreCapaciteOperationnelle() <em>Autre Capacite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreCapaciteOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_CAPACITE_OPERATIONNELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreCapaciteOperationnelle() <em>Autre Capacite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreCapaciteOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected String autreCapaciteOperationnelle = AUTRE_CAPACITE_OPERATIONNELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDureeVol() <em>Duree Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeVol()
	 * @generated
	 * @ordered
	 */
	protected static final long DUREE_VOL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDureeVol() <em>Duree Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeVol()
	 * @generated
	 * @ordered
	 */
	protected long dureeVol = DUREE_VOL_EDEFAULT;

	/**
	 * This is true if the Duree Vol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dureeVolESet;

	/**
	 * The default value of the '{@link #getQuantiteCarburantRestant() <em>Quantite Carburant Restant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteCarburantRestant()
	 * @generated
	 * @ordered
	 */
	protected static final double QUANTITE_CARBURANT_RESTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getQuantiteCarburantRestant() <em>Quantite Carburant Restant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteCarburantRestant()
	 * @generated
	 * @ordered
	 */
	protected double quantiteCarburantRestant = QUANTITE_CARBURANT_RESTANT_EDEFAULT;

	/**
	 * This is true if the Quantite Carburant Restant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteCarburantRestantESet;

	/**
	 * The default value of the '{@link #getCapaciteOperationnelle() <em>Capacite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle CAPACITE_OPERATIONNELLE_EDEFAULT = TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle.CAP;

	/**
	 * The cached value of the '{@link #getCapaciteOperationnelle() <em>Capacite Operationnelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteOperationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle capaciteOperationnelle = CAPACITE_OPERATIONNELLE_EDEFAULT;

	/**
	 * This is true if the Capacite Operationnelle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteOperationnelleESet;

	/**
	 * The default value of the '{@link #getPotentielHoraireRestant() <em>Potentiel Horaire Restant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielHoraireRestant()
	 * @generated
	 * @ordered
	 */
	protected static final double POTENTIEL_HORAIRE_RESTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPotentielHoraireRestant() <em>Potentiel Horaire Restant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPotentielHoraireRestant()
	 * @generated
	 * @ordered
	 */
	protected double potentielHoraireRestant = POTENTIEL_HORAIRE_RESTANT_EDEFAULT;

	/**
	 * This is true if the Potentiel Horaire Restant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean potentielHoraireRestantESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutonomieModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutonomieModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreCapaciteOperationnelle() {
		return autreCapaciteOperationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreCapaciteOperationnelle(String newAutreCapaciteOperationnelle) {
		String oldAutreCapaciteOperationnelle = autreCapaciteOperationnelle;
		autreCapaciteOperationnelle = newAutreCapaciteOperationnelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTONOMIE_MODULE__AUTRE_CAPACITE_OPERATIONNELLE, oldAutreCapaciteOperationnelle, autreCapaciteOperationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDureeVol() {
		return dureeVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeVol(long newDureeVol) {
		long oldDureeVol = dureeVol;
		dureeVol = newDureeVol;
		boolean oldDureeVolESet = dureeVolESet;
		dureeVolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTONOMIE_MODULE__DUREE_VOL, oldDureeVol, dureeVol, !oldDureeVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDureeVol() {
		long oldDureeVol = dureeVol;
		boolean oldDureeVolESet = dureeVolESet;
		dureeVol = DUREE_VOL_EDEFAULT;
		dureeVolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTONOMIE_MODULE__DUREE_VOL, oldDureeVol, DUREE_VOL_EDEFAULT, oldDureeVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDureeVol() {
		return dureeVolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getQuantiteCarburantRestant() {
		return quantiteCarburantRestant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteCarburantRestant(double newQuantiteCarburantRestant) {
		double oldQuantiteCarburantRestant = quantiteCarburantRestant;
		quantiteCarburantRestant = newQuantiteCarburantRestant;
		boolean oldQuantiteCarburantRestantESet = quantiteCarburantRestantESet;
		quantiteCarburantRestantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTONOMIE_MODULE__QUANTITE_CARBURANT_RESTANT, oldQuantiteCarburantRestant, quantiteCarburantRestant, !oldQuantiteCarburantRestantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteCarburantRestant() {
		double oldQuantiteCarburantRestant = quantiteCarburantRestant;
		boolean oldQuantiteCarburantRestantESet = quantiteCarburantRestantESet;
		quantiteCarburantRestant = QUANTITE_CARBURANT_RESTANT_EDEFAULT;
		quantiteCarburantRestantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTONOMIE_MODULE__QUANTITE_CARBURANT_RESTANT, oldQuantiteCarburantRestant, QUANTITE_CARBURANT_RESTANT_EDEFAULT, oldQuantiteCarburantRestantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteCarburantRestant() {
		return quantiteCarburantRestantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle getCapaciteOperationnelle() {
		return capaciteOperationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteOperationnelle(TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle newCapaciteOperationnelle) {
		TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle oldCapaciteOperationnelle = capaciteOperationnelle;
		capaciteOperationnelle = newCapaciteOperationnelle == null ? CAPACITE_OPERATIONNELLE_EDEFAULT : newCapaciteOperationnelle;
		boolean oldCapaciteOperationnelleESet = capaciteOperationnelleESet;
		capaciteOperationnelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTONOMIE_MODULE__CAPACITE_OPERATIONNELLE, oldCapaciteOperationnelle, capaciteOperationnelle, !oldCapaciteOperationnelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteOperationnelle() {
		TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle oldCapaciteOperationnelle = capaciteOperationnelle;
		boolean oldCapaciteOperationnelleESet = capaciteOperationnelleESet;
		capaciteOperationnelle = CAPACITE_OPERATIONNELLE_EDEFAULT;
		capaciteOperationnelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTONOMIE_MODULE__CAPACITE_OPERATIONNELLE, oldCapaciteOperationnelle, CAPACITE_OPERATIONNELLE_EDEFAULT, oldCapaciteOperationnelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteOperationnelle() {
		return capaciteOperationnelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPotentielHoraireRestant() {
		return potentielHoraireRestant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPotentielHoraireRestant(double newPotentielHoraireRestant) {
		double oldPotentielHoraireRestant = potentielHoraireRestant;
		potentielHoraireRestant = newPotentielHoraireRestant;
		boolean oldPotentielHoraireRestantESet = potentielHoraireRestantESet;
		potentielHoraireRestantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTONOMIE_MODULE__POTENTIEL_HORAIRE_RESTANT, oldPotentielHoraireRestant, potentielHoraireRestant, !oldPotentielHoraireRestantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPotentielHoraireRestant() {
		double oldPotentielHoraireRestant = potentielHoraireRestant;
		boolean oldPotentielHoraireRestantESet = potentielHoraireRestantESet;
		potentielHoraireRestant = POTENTIEL_HORAIRE_RESTANT_EDEFAULT;
		potentielHoraireRestantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTONOMIE_MODULE__POTENTIEL_HORAIRE_RESTANT, oldPotentielHoraireRestant, POTENTIEL_HORAIRE_RESTANT_EDEFAULT, oldPotentielHoraireRestantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPotentielHoraireRestant() {
		return potentielHoraireRestantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__AUTRE_CAPACITE_OPERATIONNELLE:
				return getAutreCapaciteOperationnelle();
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__DUREE_VOL:
				return new Long(getDureeVol());
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__QUANTITE_CARBURANT_RESTANT:
				return new Double(getQuantiteCarburantRestant());
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__CAPACITE_OPERATIONNELLE:
				return getCapaciteOperationnelle();
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__POTENTIEL_HORAIRE_RESTANT:
				return new Double(getPotentielHoraireRestant());
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
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__AUTRE_CAPACITE_OPERATIONNELLE:
				setAutreCapaciteOperationnelle((String)newValue);
				return;
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__DUREE_VOL:
				setDureeVol(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__QUANTITE_CARBURANT_RESTANT:
				setQuantiteCarburantRestant(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__CAPACITE_OPERATIONNELLE:
				setCapaciteOperationnelle((TypeDictionaryDicoAutonomieModuleCapaciteOperationnelle)newValue);
				return;
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__POTENTIEL_HORAIRE_RESTANT:
				setPotentielHoraireRestant(((Double)newValue).doubleValue());
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
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__AUTRE_CAPACITE_OPERATIONNELLE:
				setAutreCapaciteOperationnelle(AUTRE_CAPACITE_OPERATIONNELLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__DUREE_VOL:
				unsetDureeVol();
				return;
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__QUANTITE_CARBURANT_RESTANT:
				unsetQuantiteCarburantRestant();
				return;
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__CAPACITE_OPERATIONNELLE:
				unsetCapaciteOperationnelle();
				return;
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__POTENTIEL_HORAIRE_RESTANT:
				unsetPotentielHoraireRestant();
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
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__AUTRE_CAPACITE_OPERATIONNELLE:
				return AUTRE_CAPACITE_OPERATIONNELLE_EDEFAULT == null ? autreCapaciteOperationnelle != null : !AUTRE_CAPACITE_OPERATIONNELLE_EDEFAULT.equals(autreCapaciteOperationnelle);
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__DUREE_VOL:
				return isSetDureeVol();
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__QUANTITE_CARBURANT_RESTANT:
				return isSetQuantiteCarburantRestant();
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__CAPACITE_OPERATIONNELLE:
				return isSetCapaciteOperationnelle();
			case SchemaPackage.TYPE_AUTONOMIE_MODULE__POTENTIEL_HORAIRE_RESTANT:
				return isSetPotentielHoraireRestant();
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
		result.append(" (autreCapaciteOperationnelle: ");
		result.append(autreCapaciteOperationnelle);
		result.append(", dureeVol: ");
		if (dureeVolESet) result.append(dureeVol); else result.append("<unset>");
		result.append(", quantiteCarburantRestant: ");
		if (quantiteCarburantRestantESet) result.append(quantiteCarburantRestant); else result.append("<unset>");
		result.append(", capaciteOperationnelle: ");
		if (capaciteOperationnelleESet) result.append(capaciteOperationnelle); else result.append("<unset>");
		result.append(", potentielHoraireRestant: ");
		if (potentielHoraireRestantESet) result.append(potentielHoraireRestant); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAutonomieModuleImpl
