/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoSuperioriteAerienne;
import mpia.schema.TypeMoyensENI;
import mpia.schema.TypePossibilitesENI3d;

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
 * An implementation of the model object '<em><b>Type Possibilites ENI 3d</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePossibilitesENI3dImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePossibilitesENI3dImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePossibilitesENI3dImpl#getDegreSuperioriteAerienneENI <em>Degre Superiorite Aerienne ENI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePossibilitesENI3dImpl#getDegreSuperioriteAerienneENInonRepertorie <em>Degre Superiorite Aerienne EN Inon Repertorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePossibilitesENI3dImpl#getAutresInformationsRelativesAMenace3D <em>Autres Informations Relatives AMenace3 D</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePossibilitesENI3dImpl#getEstARealiserPourHoraireManoeuvre <em>Est ARealiser Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePossibilitesENI3dImpl#getAPourAction3DeniAction <em>APour Action3 Deni Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePossibilitesENI3dImpl#getAPourMoyensENIMoyensENI <em>APour Moyens ENI Moyens ENI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePossibilitesENI3dImpl extends TypeMenaceImpl implements TypePossibilitesENI3d {
	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegreSuperioriteAerienneENI() <em>Degre Superiorite Aerienne ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSuperioriteAerienneENI()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoSuperioriteAerienne DEGRE_SUPERIORITE_AERIENNE_ENI_EDEFAULT = TypeDictionaryDicoSuperioriteAerienne.FSUP;

	/**
	 * The cached value of the '{@link #getDegreSuperioriteAerienneENI() <em>Degre Superiorite Aerienne ENI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSuperioriteAerienneENI()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoSuperioriteAerienne degreSuperioriteAerienneENI = DEGRE_SUPERIORITE_AERIENNE_ENI_EDEFAULT;

	/**
	 * This is true if the Degre Superiorite Aerienne ENI attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean degreSuperioriteAerienneENIESet;

	/**
	 * The default value of the '{@link #getDegreSuperioriteAerienneENInonRepertorie() <em>Degre Superiorite Aerienne EN Inon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSuperioriteAerienneENInonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegreSuperioriteAerienneENInonRepertorie() <em>Degre Superiorite Aerienne EN Inon Repertorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreSuperioriteAerienneENInonRepertorie()
	 * @generated
	 * @ordered
	 */
	protected String degreSuperioriteAerienneENInonRepertorie = DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutresInformationsRelativesAMenace3D() <em>Autres Informations Relatives AMenace3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresInformationsRelativesAMenace3D()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutresInformationsRelativesAMenace3D() <em>Autres Informations Relatives AMenace3 D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutresInformationsRelativesAMenace3D()
	 * @generated
	 * @ordered
	 */
	protected String autresInformationsRelativesAMenace3D = AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEstARealiserPourHoraireManoeuvre() <em>Est ARealiser Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstARealiserPourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estARealiserPourHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getAPourAction3DeniAction() <em>APour Action3 Deni Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourAction3DeniAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourAction3DeniAction;

	/**
	 * The cached value of the '{@link #getAPourMoyensENIMoyensENI() <em>APour Moyens ENI Moyens ENI</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourMoyensENIMoyensENI()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeMoyensENI> aPourMoyensENIMoyensENI;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePossibilitesENI3dImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePossibilitesENI3d();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(XMLGregorianCalendar newDateDebut) {
		XMLGregorianCalendar oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(XMLGregorianCalendar newDateFin) {
		XMLGregorianCalendar oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoSuperioriteAerienne getDegreSuperioriteAerienneENI() {
		return degreSuperioriteAerienneENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreSuperioriteAerienneENI(TypeDictionaryDicoSuperioriteAerienne newDegreSuperioriteAerienneENI) {
		TypeDictionaryDicoSuperioriteAerienne oldDegreSuperioriteAerienneENI = degreSuperioriteAerienneENI;
		degreSuperioriteAerienneENI = newDegreSuperioriteAerienneENI == null ? DEGRE_SUPERIORITE_AERIENNE_ENI_EDEFAULT : newDegreSuperioriteAerienneENI;
		boolean oldDegreSuperioriteAerienneENIESet = degreSuperioriteAerienneENIESet;
		degreSuperioriteAerienneENIESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_ENI, oldDegreSuperioriteAerienneENI, degreSuperioriteAerienneENI, !oldDegreSuperioriteAerienneENIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDegreSuperioriteAerienneENI() {
		TypeDictionaryDicoSuperioriteAerienne oldDegreSuperioriteAerienneENI = degreSuperioriteAerienneENI;
		boolean oldDegreSuperioriteAerienneENIESet = degreSuperioriteAerienneENIESet;
		degreSuperioriteAerienneENI = DEGRE_SUPERIORITE_AERIENNE_ENI_EDEFAULT;
		degreSuperioriteAerienneENIESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_ENI, oldDegreSuperioriteAerienneENI, DEGRE_SUPERIORITE_AERIENNE_ENI_EDEFAULT, oldDegreSuperioriteAerienneENIESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDegreSuperioriteAerienneENI() {
		return degreSuperioriteAerienneENIESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDegreSuperioriteAerienneENInonRepertorie() {
		return degreSuperioriteAerienneENInonRepertorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreSuperioriteAerienneENInonRepertorie(String newDegreSuperioriteAerienneENInonRepertorie) {
		String oldDegreSuperioriteAerienneENInonRepertorie = degreSuperioriteAerienneENInonRepertorie;
		degreSuperioriteAerienneENInonRepertorie = newDegreSuperioriteAerienneENInonRepertorie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE, oldDegreSuperioriteAerienneENInonRepertorie, degreSuperioriteAerienneENInonRepertorie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutresInformationsRelativesAMenace3D() {
		return autresInformationsRelativesAMenace3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutresInformationsRelativesAMenace3D(String newAutresInformationsRelativesAMenace3D) {
		String oldAutresInformationsRelativesAMenace3D = autresInformationsRelativesAMenace3D;
		autresInformationsRelativesAMenace3D = newAutresInformationsRelativesAMenace3D;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D, oldAutresInformationsRelativesAMenace3D, autresInformationsRelativesAMenace3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstARealiserPourHoraireManoeuvre() {
		return estARealiserPourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstARealiserPourHoraireManoeuvre(TypeAssociation newEstARealiserPourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldEstARealiserPourHoraireManoeuvre = estARealiserPourHoraireManoeuvre;
		estARealiserPourHoraireManoeuvre = newEstARealiserPourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE, oldEstARealiserPourHoraireManoeuvre, newEstARealiserPourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstARealiserPourHoraireManoeuvre(TypeAssociation newEstARealiserPourHoraireManoeuvre) {
		if (newEstARealiserPourHoraireManoeuvre != estARealiserPourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (estARealiserPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)estARealiserPourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newEstARealiserPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newEstARealiserPourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetEstARealiserPourHoraireManoeuvre(newEstARealiserPourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE, newEstARealiserPourHoraireManoeuvre, newEstARealiserPourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourAction3DeniAction() {
		if (aPourAction3DeniAction == null) {
			aPourAction3DeniAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_ACTION3_DENI_ACTION);
		}
		return aPourAction3DeniAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeMoyensENI> getAPourMoyensENIMoyensENI() {
		if (aPourMoyensENIMoyensENI == null) {
			aPourMoyensENIMoyensENI = new EObjectContainmentEList<TypeMoyensENI>(TypeMoyensENI.class, this, SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_MOYENS_ENI_MOYENS_ENI);
		}
		return aPourMoyensENIMoyensENI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE:
				return basicSetEstARealiserPourHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_ACTION3_DENI_ACTION:
				return ((InternalEList<?>)getAPourAction3DeniAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_MOYENS_ENI_MOYENS_ENI:
				return ((InternalEList<?>)getAPourMoyensENIMoyensENI()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_DEBUT:
				return getDateDebut();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_FIN:
				return getDateFin();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_ENI:
				return getDegreSuperioriteAerienneENI();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE:
				return getDegreSuperioriteAerienneENInonRepertorie();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D:
				return getAutresInformationsRelativesAMenace3D();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE:
				return getEstARealiserPourHoraireManoeuvre();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_ACTION3_DENI_ACTION:
				return getAPourAction3DeniAction();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_MOYENS_ENI_MOYENS_ENI:
				return getAPourMoyensENIMoyensENI();
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
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_DEBUT:
				setDateDebut((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_FIN:
				setDateFin((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_ENI:
				setDegreSuperioriteAerienneENI((TypeDictionaryDicoSuperioriteAerienne)newValue);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE:
				setDegreSuperioriteAerienneENInonRepertorie((String)newValue);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D:
				setAutresInformationsRelativesAMenace3D((String)newValue);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE:
				setEstARealiserPourHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_ACTION3_DENI_ACTION:
				getAPourAction3DeniAction().clear();
				getAPourAction3DeniAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_MOYENS_ENI_MOYENS_ENI:
				getAPourMoyensENIMoyensENI().clear();
				getAPourMoyensENIMoyensENI().addAll((Collection<? extends TypeMoyensENI>)newValue);
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
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_ENI:
				unsetDegreSuperioriteAerienneENI();
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE:
				setDegreSuperioriteAerienneENInonRepertorie(DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D:
				setAutresInformationsRelativesAMenace3D(AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D_EDEFAULT);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE:
				setEstARealiserPourHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_ACTION3_DENI_ACTION:
				getAPourAction3DeniAction().clear();
				return;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_MOYENS_ENI_MOYENS_ENI:
				getAPourMoyensENIMoyensENI().clear();
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
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_ENI:
				return isSetDegreSuperioriteAerienneENI();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE:
				return DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE_EDEFAULT == null ? degreSuperioriteAerienneENInonRepertorie != null : !DEGRE_SUPERIORITE_AERIENNE_EN_INON_REPERTORIE_EDEFAULT.equals(degreSuperioriteAerienneENInonRepertorie);
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D:
				return AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D_EDEFAULT == null ? autresInformationsRelativesAMenace3D != null : !AUTRES_INFORMATIONS_RELATIVES_AMENACE3_D_EDEFAULT.equals(autresInformationsRelativesAMenace3D);
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__EST_AREALISER_POUR_HORAIRE_MANOEUVRE:
				return estARealiserPourHoraireManoeuvre != null;
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_ACTION3_DENI_ACTION:
				return aPourAction3DeniAction != null && !aPourAction3DeniAction.isEmpty();
			case SchemaPackage.TYPE_POSSIBILITES_ENI_3D__APOUR_MOYENS_ENI_MOYENS_ENI:
				return aPourMoyensENIMoyensENI != null && !aPourMoyensENIMoyensENI.isEmpty();
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
		result.append(" (dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(", degreSuperioriteAerienneENI: ");
		if (degreSuperioriteAerienneENIESet) result.append(degreSuperioriteAerienneENI); else result.append("<unset>");
		result.append(", degreSuperioriteAerienneENInonRepertorie: ");
		result.append(degreSuperioriteAerienneENInonRepertorie);
		result.append(", autresInformationsRelativesAMenace3D: ");
		result.append(autresInformationsRelativesAMenace3D);
		result.append(')');
		return result.toString();
	}

} //TypePossibilitesENI3dImpl
