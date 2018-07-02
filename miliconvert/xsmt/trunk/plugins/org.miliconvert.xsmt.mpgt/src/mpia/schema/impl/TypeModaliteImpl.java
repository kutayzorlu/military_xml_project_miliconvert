/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeDuree;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDatation;
import mpia.schema.TypeDictionaryDicoModaliteSens;
import mpia.schema.TypeDictionaryDicoTypeVol;
import mpia.schema.TypeModalite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Modalite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getSens <em>Sens</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getTypeVol <em>Type Vol</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getVitesseMoyenne <em>Vitesse Moyenne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getDateDebutCalculee <em>Date Debut Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getDateFinCalculee <em>Date Fin Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getDureeOccupation <em>Duree Occupation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getAPourDebutDatation <em>APour Debut Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeModaliteImpl#getAPourFinDatation <em>APour Fin Datation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeModaliteImpl extends EObjectImpl implements TypeModalite {
	/**
	 * The default value of the '{@link #getSens() <em>Sens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSens()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModaliteSens SENS_EDEFAULT = TypeDictionaryDicoModaliteSens.DIRCRE;

	/**
	 * The cached value of the '{@link #getSens() <em>Sens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSens()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModaliteSens sens = SENS_EDEFAULT;

	/**
	 * This is true if the Sens attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensESet;

	/**
	 * The default value of the '{@link #getTypeVol() <em>Type Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVol()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeVol TYPE_VOL_EDEFAULT = TypeDictionaryDicoTypeVol.TECFBD;

	/**
	 * The cached value of the '{@link #getTypeVol() <em>Type Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeVol()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeVol typeVol = TYPE_VOL_EDEFAULT;

	/**
	 * This is true if the Type Vol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeVolESet;

	/**
	 * The default value of the '{@link #getVitesseMoyenne() <em>Vitesse Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMoyenne()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_MOYENNE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseMoyenne() <em>Vitesse Moyenne</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMoyenne()
	 * @generated
	 * @ordered
	 */
	protected double vitesseMoyenne = VITESSE_MOYENNE_EDEFAULT;

	/**
	 * This is true if the Vitesse Moyenne attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseMoyenneESet;

	/**
	 * The default value of the '{@link #getDateDebutCalculee() <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebutCalculee() <em>Date Debut Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebutCalculee = DATE_DEBUT_CALCULEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFinCalculee() <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FIN_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFinCalculee() <em>Date Fin Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFinCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFinCalculee = DATE_FIN_CALCULEE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeOccupation() <em>Duree Occupation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeOccupation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeOccupation;

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
	 * The cached value of the '{@link #getAPourDebutDatation() <em>APour Debut Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDebutDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDebutDatation;

	/**
	 * The cached value of the '{@link #getAPourFinDatation() <em>APour Fin Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourFinDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourFinDatation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeModaliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeModalite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModaliteSens getSens() {
		return sens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSens(TypeDictionaryDicoModaliteSens newSens) {
		TypeDictionaryDicoModaliteSens oldSens = sens;
		sens = newSens == null ? SENS_EDEFAULT : newSens;
		boolean oldSensESet = sensESet;
		sensESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__SENS, oldSens, sens, !oldSensESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSens() {
		TypeDictionaryDicoModaliteSens oldSens = sens;
		boolean oldSensESet = sensESet;
		sens = SENS_EDEFAULT;
		sensESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE__SENS, oldSens, SENS_EDEFAULT, oldSensESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSens() {
		return sensESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeVol getTypeVol() {
		return typeVol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeVol(TypeDictionaryDicoTypeVol newTypeVol) {
		TypeDictionaryDicoTypeVol oldTypeVol = typeVol;
		typeVol = newTypeVol == null ? TYPE_VOL_EDEFAULT : newTypeVol;
		boolean oldTypeVolESet = typeVolESet;
		typeVolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__TYPE_VOL, oldTypeVol, typeVol, !oldTypeVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeVol() {
		TypeDictionaryDicoTypeVol oldTypeVol = typeVol;
		boolean oldTypeVolESet = typeVolESet;
		typeVol = TYPE_VOL_EDEFAULT;
		typeVolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE__TYPE_VOL, oldTypeVol, TYPE_VOL_EDEFAULT, oldTypeVolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeVol() {
		return typeVolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseMoyenne() {
		return vitesseMoyenne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMoyenne(double newVitesseMoyenne) {
		double oldVitesseMoyenne = vitesseMoyenne;
		vitesseMoyenne = newVitesseMoyenne;
		boolean oldVitesseMoyenneESet = vitesseMoyenneESet;
		vitesseMoyenneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__VITESSE_MOYENNE, oldVitesseMoyenne, vitesseMoyenne, !oldVitesseMoyenneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseMoyenne() {
		double oldVitesseMoyenne = vitesseMoyenne;
		boolean oldVitesseMoyenneESet = vitesseMoyenneESet;
		vitesseMoyenne = VITESSE_MOYENNE_EDEFAULT;
		vitesseMoyenneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MODALITE__VITESSE_MOYENNE, oldVitesseMoyenne, VITESSE_MOYENNE_EDEFAULT, oldVitesseMoyenneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseMoyenne() {
		return vitesseMoyenneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebutCalculee() {
		return dateDebutCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutCalculee(XMLGregorianCalendar newDateDebutCalculee) {
		XMLGregorianCalendar oldDateDebutCalculee = dateDebutCalculee;
		dateDebutCalculee = newDateDebutCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__DATE_DEBUT_CALCULEE, oldDateDebutCalculee, dateDebutCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFinCalculee() {
		return dateFinCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFinCalculee(XMLGregorianCalendar newDateFinCalculee) {
		XMLGregorianCalendar oldDateFinCalculee = dateFinCalculee;
		dateFinCalculee = newDateFinCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__DATE_FIN_CALCULEE, oldDateFinCalculee, dateFinCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeOccupation() {
		return dureeOccupation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeOccupation(TypeDataTypeDuree newDureeOccupation, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeOccupation = dureeOccupation;
		dureeOccupation = newDureeOccupation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION, oldDureeOccupation, newDureeOccupation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeOccupation(TypeDataTypeDuree newDureeOccupation) {
		if (newDureeOccupation != dureeOccupation) {
			NotificationChain msgs = null;
			if (dureeOccupation != null)
				msgs = ((InternalEObject)dureeOccupation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION, null, msgs);
			if (newDureeOccupation != null)
				msgs = ((InternalEObject)newDureeOccupation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION, null, msgs);
			msgs = basicSetDureeOccupation(newDureeOccupation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION, newDureeOccupation, newDureeOccupation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__COMMENTAIRE, oldCommentaire, commentaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDebutDatation() {
		return aPourDebutDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDebutDatation(TypeDatation newAPourDebutDatation, NotificationChain msgs) {
		TypeDatation oldAPourDebutDatation = aPourDebutDatation;
		aPourDebutDatation = newAPourDebutDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION, oldAPourDebutDatation, newAPourDebutDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDebutDatation(TypeDatation newAPourDebutDatation) {
		if (newAPourDebutDatation != aPourDebutDatation) {
			NotificationChain msgs = null;
			if (aPourDebutDatation != null)
				msgs = ((InternalEObject)aPourDebutDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION, null, msgs);
			if (newAPourDebutDatation != null)
				msgs = ((InternalEObject)newAPourDebutDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION, null, msgs);
			msgs = basicSetAPourDebutDatation(newAPourDebutDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION, newAPourDebutDatation, newAPourDebutDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourFinDatation() {
		return aPourFinDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourFinDatation(TypeDatation newAPourFinDatation, NotificationChain msgs) {
		TypeDatation oldAPourFinDatation = aPourFinDatation;
		aPourFinDatation = newAPourFinDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION, oldAPourFinDatation, newAPourFinDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourFinDatation(TypeDatation newAPourFinDatation) {
		if (newAPourFinDatation != aPourFinDatation) {
			NotificationChain msgs = null;
			if (aPourFinDatation != null)
				msgs = ((InternalEObject)aPourFinDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION, null, msgs);
			if (newAPourFinDatation != null)
				msgs = ((InternalEObject)newAPourFinDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION, null, msgs);
			msgs = basicSetAPourFinDatation(newAPourFinDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION, newAPourFinDatation, newAPourFinDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION:
				return basicSetDureeOccupation(null, msgs);
			case SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION:
				return basicSetAPourDebutDatation(null, msgs);
			case SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION:
				return basicSetAPourFinDatation(null, msgs);
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
			case SchemaPackage.TYPE_MODALITE__SENS:
				return getSens();
			case SchemaPackage.TYPE_MODALITE__TYPE_VOL:
				return getTypeVol();
			case SchemaPackage.TYPE_MODALITE__VITESSE_MOYENNE:
				return new Double(getVitesseMoyenne());
			case SchemaPackage.TYPE_MODALITE__DATE_DEBUT_CALCULEE:
				return getDateDebutCalculee();
			case SchemaPackage.TYPE_MODALITE__DATE_FIN_CALCULEE:
				return getDateFinCalculee();
			case SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION:
				return getDureeOccupation();
			case SchemaPackage.TYPE_MODALITE__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION:
				return getAPourDebutDatation();
			case SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION:
				return getAPourFinDatation();
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
			case SchemaPackage.TYPE_MODALITE__SENS:
				setSens((TypeDictionaryDicoModaliteSens)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE__TYPE_VOL:
				setTypeVol((TypeDictionaryDicoTypeVol)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE__VITESSE_MOYENNE:
				setVitesseMoyenne(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_MODALITE__DATE_DEBUT_CALCULEE:
				setDateDebutCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE__DATE_FIN_CALCULEE:
				setDateFinCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION:
				setDureeOccupation((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION:
				setAPourDebutDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION:
				setAPourFinDatation((TypeDatation)newValue);
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
			case SchemaPackage.TYPE_MODALITE__SENS:
				unsetSens();
				return;
			case SchemaPackage.TYPE_MODALITE__TYPE_VOL:
				unsetTypeVol();
				return;
			case SchemaPackage.TYPE_MODALITE__VITESSE_MOYENNE:
				unsetVitesseMoyenne();
				return;
			case SchemaPackage.TYPE_MODALITE__DATE_DEBUT_CALCULEE:
				setDateDebutCalculee(DATE_DEBUT_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE__DATE_FIN_CALCULEE:
				setDateFinCalculee(DATE_FIN_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION:
				setDureeOccupation((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_MODALITE__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION:
				setAPourDebutDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION:
				setAPourFinDatation((TypeDatation)null);
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
			case SchemaPackage.TYPE_MODALITE__SENS:
				return isSetSens();
			case SchemaPackage.TYPE_MODALITE__TYPE_VOL:
				return isSetTypeVol();
			case SchemaPackage.TYPE_MODALITE__VITESSE_MOYENNE:
				return isSetVitesseMoyenne();
			case SchemaPackage.TYPE_MODALITE__DATE_DEBUT_CALCULEE:
				return DATE_DEBUT_CALCULEE_EDEFAULT == null ? dateDebutCalculee != null : !DATE_DEBUT_CALCULEE_EDEFAULT.equals(dateDebutCalculee);
			case SchemaPackage.TYPE_MODALITE__DATE_FIN_CALCULEE:
				return DATE_FIN_CALCULEE_EDEFAULT == null ? dateFinCalculee != null : !DATE_FIN_CALCULEE_EDEFAULT.equals(dateFinCalculee);
			case SchemaPackage.TYPE_MODALITE__DUREE_OCCUPATION:
				return dureeOccupation != null;
			case SchemaPackage.TYPE_MODALITE__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_MODALITE__APOUR_DEBUT_DATATION:
				return aPourDebutDatation != null;
			case SchemaPackage.TYPE_MODALITE__APOUR_FIN_DATATION:
				return aPourFinDatation != null;
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
		result.append(" (sens: ");
		if (sensESet) result.append(sens); else result.append("<unset>");
		result.append(", typeVol: ");
		if (typeVolESet) result.append(typeVol); else result.append("<unset>");
		result.append(", vitesseMoyenne: ");
		if (vitesseMoyenneESet) result.append(vitesseMoyenne); else result.append("<unset>");
		result.append(", dateDebutCalculee: ");
		result.append(dateDebutCalculee);
		result.append(", dateFinCalculee: ");
		result.append(dateFinCalculee);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(')');
		return result.toString();
	}

} //TypeModaliteImpl
