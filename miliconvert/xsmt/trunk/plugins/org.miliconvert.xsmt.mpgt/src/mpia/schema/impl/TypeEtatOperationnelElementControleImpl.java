/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoActivation;
import mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC;
import mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleSecurite;
import mpia.schema.TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation;
import mpia.schema.TypeEtatOperationnelElementControle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Operationnel Element Controle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementControleImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementControleImpl#getGDHdebutActivation <em>GD Hdebut Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementControleImpl#getGDHFinActivation <em>GDH Fin Activation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementControleImpl#getSecurite <em>Securite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementControleImpl#getNiveauMenaceNRBC <em>Niveau Menace NRBC</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatOperationnelElementControleImpl#getStatutInvestigation <em>Statut Investigation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatOperationnelElementControleImpl extends TypeEtatOperationnelImpl implements TypeEtatOperationnelElementControle {
	/**
	 * The default value of the '{@link #getActivation() <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoActivation ACTIVATION_EDEFAULT = TypeDictionaryDicoActivation.ACTIVE;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoActivation activation = ACTIVATION_EDEFAULT;

	/**
	 * This is true if the Activation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activationESet;

	/**
	 * The default value of the '{@link #getGDHdebutActivation() <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HDEBUT_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHdebutActivation() <em>GD Hdebut Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHdebutActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHdebutActivation = GD_HDEBUT_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGDHFinActivation() <em>GDH Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHFinActivation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_FIN_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHFinActivation() <em>GDH Fin Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHFinActivation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHFinActivation = GDH_FIN_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurite() <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelElementControleSecurite SECURITE_EDEFAULT = TypeDictionaryDicoEtatOperationnelElementControleSecurite.GUARDD;

	/**
	 * The cached value of the '{@link #getSecurite() <em>Securite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelElementControleSecurite securite = SECURITE_EDEFAULT;

	/**
	 * This is true if the Securite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean securiteESet;

	/**
	 * The default value of the '{@link #getNiveauMenaceNRBC() <em>Niveau Menace NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauMenaceNRBC()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC NIVEAU_MENACE_NRBC_EDEFAULT = TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC.LOW;

	/**
	 * The cached value of the '{@link #getNiveauMenaceNRBC() <em>Niveau Menace NRBC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauMenaceNRBC()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC niveauMenaceNRBC = NIVEAU_MENACE_NRBC_EDEFAULT;

	/**
	 * This is true if the Niveau Menace NRBC attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauMenaceNRBCESet;

	/**
	 * The default value of the '{@link #getStatutInvestigation() <em>Statut Investigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatutInvestigation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation STATUT_INVESTIGATION_EDEFAULT = TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation.INVNEG;

	/**
	 * The cached value of the '{@link #getStatutInvestigation() <em>Statut Investigation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatutInvestigation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation statutInvestigation = STATUT_INVESTIGATION_EDEFAULT;

	/**
	 * This is true if the Statut Investigation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statutInvestigationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatOperationnelElementControleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatOperationnelElementControle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoActivation getActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation(TypeDictionaryDicoActivation newActivation) {
		TypeDictionaryDicoActivation oldActivation = activation;
		activation = newActivation == null ? ACTIVATION_EDEFAULT : newActivation;
		boolean oldActivationESet = activationESet;
		activationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__ACTIVATION, oldActivation, activation, !oldActivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActivation() {
		TypeDictionaryDicoActivation oldActivation = activation;
		boolean oldActivationESet = activationESet;
		activation = ACTIVATION_EDEFAULT;
		activationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__ACTIVATION, oldActivation, ACTIVATION_EDEFAULT, oldActivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivation() {
		return activationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHdebutActivation() {
		return gDHdebutActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHdebutActivation(XMLGregorianCalendar newGDHdebutActivation) {
		XMLGregorianCalendar oldGDHdebutActivation = gDHdebutActivation;
		gDHdebutActivation = newGDHdebutActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GD_HDEBUT_ACTIVATION, oldGDHdebutActivation, gDHdebutActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHFinActivation() {
		return gDHFinActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHFinActivation(XMLGregorianCalendar newGDHFinActivation) {
		XMLGregorianCalendar oldGDHFinActivation = gDHFinActivation;
		gDHFinActivation = newGDHFinActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GDH_FIN_ACTIVATION, oldGDHFinActivation, gDHFinActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelElementControleSecurite getSecurite() {
		return securite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurite(TypeDictionaryDicoEtatOperationnelElementControleSecurite newSecurite) {
		TypeDictionaryDicoEtatOperationnelElementControleSecurite oldSecurite = securite;
		securite = newSecurite == null ? SECURITE_EDEFAULT : newSecurite;
		boolean oldSecuriteESet = securiteESet;
		securiteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__SECURITE, oldSecurite, securite, !oldSecuriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSecurite() {
		TypeDictionaryDicoEtatOperationnelElementControleSecurite oldSecurite = securite;
		boolean oldSecuriteESet = securiteESet;
		securite = SECURITE_EDEFAULT;
		securiteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__SECURITE, oldSecurite, SECURITE_EDEFAULT, oldSecuriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSecurite() {
		return securiteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC getNiveauMenaceNRBC() {
		return niveauMenaceNRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauMenaceNRBC(TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC newNiveauMenaceNRBC) {
		TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC oldNiveauMenaceNRBC = niveauMenaceNRBC;
		niveauMenaceNRBC = newNiveauMenaceNRBC == null ? NIVEAU_MENACE_NRBC_EDEFAULT : newNiveauMenaceNRBC;
		boolean oldNiveauMenaceNRBCESet = niveauMenaceNRBCESet;
		niveauMenaceNRBCESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__NIVEAU_MENACE_NRBC, oldNiveauMenaceNRBC, niveauMenaceNRBC, !oldNiveauMenaceNRBCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauMenaceNRBC() {
		TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC oldNiveauMenaceNRBC = niveauMenaceNRBC;
		boolean oldNiveauMenaceNRBCESet = niveauMenaceNRBCESet;
		niveauMenaceNRBC = NIVEAU_MENACE_NRBC_EDEFAULT;
		niveauMenaceNRBCESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__NIVEAU_MENACE_NRBC, oldNiveauMenaceNRBC, NIVEAU_MENACE_NRBC_EDEFAULT, oldNiveauMenaceNRBCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauMenaceNRBC() {
		return niveauMenaceNRBCESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation getStatutInvestigation() {
		return statutInvestigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatutInvestigation(TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation newStatutInvestigation) {
		TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation oldStatutInvestigation = statutInvestigation;
		statutInvestigation = newStatutInvestigation == null ? STATUT_INVESTIGATION_EDEFAULT : newStatutInvestigation;
		boolean oldStatutInvestigationESet = statutInvestigationESet;
		statutInvestigationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__STATUT_INVESTIGATION, oldStatutInvestigation, statutInvestigation, !oldStatutInvestigationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatutInvestigation() {
		TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation oldStatutInvestigation = statutInvestigation;
		boolean oldStatutInvestigationESet = statutInvestigationESet;
		statutInvestigation = STATUT_INVESTIGATION_EDEFAULT;
		statutInvestigationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__STATUT_INVESTIGATION, oldStatutInvestigation, STATUT_INVESTIGATION_EDEFAULT, oldStatutInvestigationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatutInvestigation() {
		return statutInvestigationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__ACTIVATION:
				return getActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GD_HDEBUT_ACTIVATION:
				return getGDHdebutActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GDH_FIN_ACTIVATION:
				return getGDHFinActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__SECURITE:
				return getSecurite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__NIVEAU_MENACE_NRBC:
				return getNiveauMenaceNRBC();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__STATUT_INVESTIGATION:
				return getStatutInvestigation();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__ACTIVATION:
				setActivation((TypeDictionaryDicoActivation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GD_HDEBUT_ACTIVATION:
				setGDHdebutActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GDH_FIN_ACTIVATION:
				setGDHFinActivation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__SECURITE:
				setSecurite((TypeDictionaryDicoEtatOperationnelElementControleSecurite)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__NIVEAU_MENACE_NRBC:
				setNiveauMenaceNRBC((TypeDictionaryDicoEtatOperationnelElementControleNiveauMenaceNRBC)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__STATUT_INVESTIGATION:
				setStatutInvestigation((TypeDictionaryDicoEtatOperationnelElementControleStatutInvestigation)newValue);
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__ACTIVATION:
				unsetActivation();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GD_HDEBUT_ACTIVATION:
				setGDHdebutActivation(GD_HDEBUT_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GDH_FIN_ACTIVATION:
				setGDHFinActivation(GDH_FIN_ACTIVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__SECURITE:
				unsetSecurite();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__NIVEAU_MENACE_NRBC:
				unsetNiveauMenaceNRBC();
				return;
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__STATUT_INVESTIGATION:
				unsetStatutInvestigation();
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
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__ACTIVATION:
				return isSetActivation();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GD_HDEBUT_ACTIVATION:
				return GD_HDEBUT_ACTIVATION_EDEFAULT == null ? gDHdebutActivation != null : !GD_HDEBUT_ACTIVATION_EDEFAULT.equals(gDHdebutActivation);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__GDH_FIN_ACTIVATION:
				return GDH_FIN_ACTIVATION_EDEFAULT == null ? gDHFinActivation != null : !GDH_FIN_ACTIVATION_EDEFAULT.equals(gDHFinActivation);
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__SECURITE:
				return isSetSecurite();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__NIVEAU_MENACE_NRBC:
				return isSetNiveauMenaceNRBC();
			case SchemaPackage.TYPE_ETAT_OPERATIONNEL_ELEMENT_CONTROLE__STATUT_INVESTIGATION:
				return isSetStatutInvestigation();
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
		result.append(" (activation: ");
		if (activationESet) result.append(activation); else result.append("<unset>");
		result.append(", gDHdebutActivation: ");
		result.append(gDHdebutActivation);
		result.append(", gDHFinActivation: ");
		result.append(gDHFinActivation);
		result.append(", securite: ");
		if (securiteESet) result.append(securite); else result.append("<unset>");
		result.append(", niveauMenaceNRBC: ");
		if (niveauMenaceNRBCESet) result.append(niveauMenaceNRBC); else result.append("<unset>");
		result.append(", statutInvestigation: ");
		if (statutInvestigationESet) result.append(statutInvestigation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeEtatOperationnelElementControleImpl
