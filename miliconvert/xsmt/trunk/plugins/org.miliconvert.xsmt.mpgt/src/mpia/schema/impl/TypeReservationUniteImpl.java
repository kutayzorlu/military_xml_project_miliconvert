/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDatation;
import mpia.schema.TypeDictionaryDicoTrajectoire;
import mpia.schema.TypeParametresImposes;
import mpia.schema.TypeReservationUnite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Reservation Unite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getTrajectoireTir <em>Trajectoire Tir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getAPourTypeLanceurTypeArme <em>APour Type Lanceur Type Arme</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getAPourUniteReserveeOuAEngagerUnite <em>APour Unite Reservee Ou AEngager Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getAPourSecondesMunitionsParametresImposes <em>APour Secondes Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getAPourPremieresMunitionsParametresImposes <em>APour Premieres Munitions Parametres Imposes</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getCommenceDatation <em>Commence Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getSeTermineDatation <em>Se Termine Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getConcerneObjectifCiblage <em>Concerne Objectif Ciblage</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeReservationUniteImpl#getEstPrevueParPlanFeux <em>Est Prevue Par Plan Feux</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeReservationUniteImpl extends EObjectImpl implements TypeReservationUnite {
	/**
	 * The default value of the '{@link #getTrajectoireTir() <em>Trajectoire Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoireTir()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTrajectoire TRAJECTOIRE_TIR_EDEFAULT = TypeDictionaryDicoTrajectoire.PLUN;

	/**
	 * The cached value of the '{@link #getTrajectoireTir() <em>Trajectoire Tir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoireTir()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTrajectoire trajectoireTir = TRAJECTOIRE_TIR_EDEFAULT;

	/**
	 * This is true if the Trajectoire Tir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trajectoireTirESet;

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
	 * The cached value of the '{@link #getAPourTypeLanceurTypeArme() <em>APour Type Lanceur Type Arme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourTypeLanceurTypeArme()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourTypeLanceurTypeArme;

	/**
	 * The cached value of the '{@link #getAPourUniteReserveeOuAEngagerUnite() <em>APour Unite Reservee Ou AEngager Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteReserveeOuAEngagerUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteReserveeOuAEngagerUnite;

	/**
	 * The cached value of the '{@link #getAPourSecondesMunitionsParametresImposes() <em>APour Secondes Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourSecondesMunitionsParametresImposes()
	 * @generated
	 * @ordered
	 */
	protected TypeParametresImposes aPourSecondesMunitionsParametresImposes;

	/**
	 * The cached value of the '{@link #getAPourPremieresMunitionsParametresImposes() <em>APour Premieres Munitions Parametres Imposes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPremieresMunitionsParametresImposes()
	 * @generated
	 * @ordered
	 */
	protected TypeParametresImposes aPourPremieresMunitionsParametresImposes;

	/**
	 * The cached value of the '{@link #getCommenceDatation() <em>Commence Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommenceDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation commenceDatation;

	/**
	 * The cached value of the '{@link #getSeTermineDatation() <em>Se Termine Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeTermineDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation seTermineDatation;

	/**
	 * The cached value of the '{@link #getConcerneObjectifCiblage() <em>Concerne Objectif Ciblage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcerneObjectifCiblage()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation concerneObjectifCiblage;

	/**
	 * The cached value of the '{@link #getEstPrevueParPlanFeux() <em>Est Prevue Par Plan Feux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPrevueParPlanFeux()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estPrevueParPlanFeux;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeReservationUniteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeReservationUnite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTrajectoire getTrajectoireTir() {
		return trajectoireTir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectoireTir(TypeDictionaryDicoTrajectoire newTrajectoireTir) {
		TypeDictionaryDicoTrajectoire oldTrajectoireTir = trajectoireTir;
		trajectoireTir = newTrajectoireTir == null ? TRAJECTOIRE_TIR_EDEFAULT : newTrajectoireTir;
		boolean oldTrajectoireTirESet = trajectoireTirESet;
		trajectoireTirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__TRAJECTOIRE_TIR, oldTrajectoireTir, trajectoireTir, !oldTrajectoireTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrajectoireTir() {
		TypeDictionaryDicoTrajectoire oldTrajectoireTir = trajectoireTir;
		boolean oldTrajectoireTirESet = trajectoireTirESet;
		trajectoireTir = TRAJECTOIRE_TIR_EDEFAULT;
		trajectoireTirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_RESERVATION_UNITE__TRAJECTOIRE_TIR, oldTrajectoireTir, TRAJECTOIRE_TIR_EDEFAULT, oldTrajectoireTirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrajectoireTir() {
		return trajectoireTirESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourTypeLanceurTypeArme() {
		return aPourTypeLanceurTypeArme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourTypeLanceurTypeArme(TypeAssociationEXT newAPourTypeLanceurTypeArme, NotificationChain msgs) {
		TypeAssociationEXT oldAPourTypeLanceurTypeArme = aPourTypeLanceurTypeArme;
		aPourTypeLanceurTypeArme = newAPourTypeLanceurTypeArme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME, oldAPourTypeLanceurTypeArme, newAPourTypeLanceurTypeArme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourTypeLanceurTypeArme(TypeAssociationEXT newAPourTypeLanceurTypeArme) {
		if (newAPourTypeLanceurTypeArme != aPourTypeLanceurTypeArme) {
			NotificationChain msgs = null;
			if (aPourTypeLanceurTypeArme != null)
				msgs = ((InternalEObject)aPourTypeLanceurTypeArme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME, null, msgs);
			if (newAPourTypeLanceurTypeArme != null)
				msgs = ((InternalEObject)newAPourTypeLanceurTypeArme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME, null, msgs);
			msgs = basicSetAPourTypeLanceurTypeArme(newAPourTypeLanceurTypeArme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME, newAPourTypeLanceurTypeArme, newAPourTypeLanceurTypeArme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteReserveeOuAEngagerUnite() {
		return aPourUniteReserveeOuAEngagerUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteReserveeOuAEngagerUnite(TypeAssociationEXT newAPourUniteReserveeOuAEngagerUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteReserveeOuAEngagerUnite = aPourUniteReserveeOuAEngagerUnite;
		aPourUniteReserveeOuAEngagerUnite = newAPourUniteReserveeOuAEngagerUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE, oldAPourUniteReserveeOuAEngagerUnite, newAPourUniteReserveeOuAEngagerUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteReserveeOuAEngagerUnite(TypeAssociationEXT newAPourUniteReserveeOuAEngagerUnite) {
		if (newAPourUniteReserveeOuAEngagerUnite != aPourUniteReserveeOuAEngagerUnite) {
			NotificationChain msgs = null;
			if (aPourUniteReserveeOuAEngagerUnite != null)
				msgs = ((InternalEObject)aPourUniteReserveeOuAEngagerUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE, null, msgs);
			if (newAPourUniteReserveeOuAEngagerUnite != null)
				msgs = ((InternalEObject)newAPourUniteReserveeOuAEngagerUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE, null, msgs);
			msgs = basicSetAPourUniteReserveeOuAEngagerUnite(newAPourUniteReserveeOuAEngagerUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE, newAPourUniteReserveeOuAEngagerUnite, newAPourUniteReserveeOuAEngagerUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParametresImposes getAPourSecondesMunitionsParametresImposes() {
		return aPourSecondesMunitionsParametresImposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourSecondesMunitionsParametresImposes(TypeParametresImposes newAPourSecondesMunitionsParametresImposes, NotificationChain msgs) {
		TypeParametresImposes oldAPourSecondesMunitionsParametresImposes = aPourSecondesMunitionsParametresImposes;
		aPourSecondesMunitionsParametresImposes = newAPourSecondesMunitionsParametresImposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, oldAPourSecondesMunitionsParametresImposes, newAPourSecondesMunitionsParametresImposes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourSecondesMunitionsParametresImposes(TypeParametresImposes newAPourSecondesMunitionsParametresImposes) {
		if (newAPourSecondesMunitionsParametresImposes != aPourSecondesMunitionsParametresImposes) {
			NotificationChain msgs = null;
			if (aPourSecondesMunitionsParametresImposes != null)
				msgs = ((InternalEObject)aPourSecondesMunitionsParametresImposes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			if (newAPourSecondesMunitionsParametresImposes != null)
				msgs = ((InternalEObject)newAPourSecondesMunitionsParametresImposes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			msgs = basicSetAPourSecondesMunitionsParametresImposes(newAPourSecondesMunitionsParametresImposes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES, newAPourSecondesMunitionsParametresImposes, newAPourSecondesMunitionsParametresImposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParametresImposes getAPourPremieresMunitionsParametresImposes() {
		return aPourPremieresMunitionsParametresImposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPremieresMunitionsParametresImposes(TypeParametresImposes newAPourPremieresMunitionsParametresImposes, NotificationChain msgs) {
		TypeParametresImposes oldAPourPremieresMunitionsParametresImposes = aPourPremieresMunitionsParametresImposes;
		aPourPremieresMunitionsParametresImposes = newAPourPremieresMunitionsParametresImposes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, oldAPourPremieresMunitionsParametresImposes, newAPourPremieresMunitionsParametresImposes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPremieresMunitionsParametresImposes(TypeParametresImposes newAPourPremieresMunitionsParametresImposes) {
		if (newAPourPremieresMunitionsParametresImposes != aPourPremieresMunitionsParametresImposes) {
			NotificationChain msgs = null;
			if (aPourPremieresMunitionsParametresImposes != null)
				msgs = ((InternalEObject)aPourPremieresMunitionsParametresImposes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			if (newAPourPremieresMunitionsParametresImposes != null)
				msgs = ((InternalEObject)newAPourPremieresMunitionsParametresImposes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, null, msgs);
			msgs = basicSetAPourPremieresMunitionsParametresImposes(newAPourPremieresMunitionsParametresImposes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES, newAPourPremieresMunitionsParametresImposes, newAPourPremieresMunitionsParametresImposes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getCommenceDatation() {
		return commenceDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommenceDatation(TypeDatation newCommenceDatation, NotificationChain msgs) {
		TypeDatation oldCommenceDatation = commenceDatation;
		commenceDatation = newCommenceDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION, oldCommenceDatation, newCommenceDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommenceDatation(TypeDatation newCommenceDatation) {
		if (newCommenceDatation != commenceDatation) {
			NotificationChain msgs = null;
			if (commenceDatation != null)
				msgs = ((InternalEObject)commenceDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION, null, msgs);
			if (newCommenceDatation != null)
				msgs = ((InternalEObject)newCommenceDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION, null, msgs);
			msgs = basicSetCommenceDatation(newCommenceDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION, newCommenceDatation, newCommenceDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getSeTermineDatation() {
		return seTermineDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeTermineDatation(TypeDatation newSeTermineDatation, NotificationChain msgs) {
		TypeDatation oldSeTermineDatation = seTermineDatation;
		seTermineDatation = newSeTermineDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION, oldSeTermineDatation, newSeTermineDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeTermineDatation(TypeDatation newSeTermineDatation) {
		if (newSeTermineDatation != seTermineDatation) {
			NotificationChain msgs = null;
			if (seTermineDatation != null)
				msgs = ((InternalEObject)seTermineDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION, null, msgs);
			if (newSeTermineDatation != null)
				msgs = ((InternalEObject)newSeTermineDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION, null, msgs);
			msgs = basicSetSeTermineDatation(newSeTermineDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION, newSeTermineDatation, newSeTermineDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getConcerneObjectifCiblage() {
		return concerneObjectifCiblage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcerneObjectifCiblage(TypeAssociation newConcerneObjectifCiblage, NotificationChain msgs) {
		TypeAssociation oldConcerneObjectifCiblage = concerneObjectifCiblage;
		concerneObjectifCiblage = newConcerneObjectifCiblage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE, oldConcerneObjectifCiblage, newConcerneObjectifCiblage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcerneObjectifCiblage(TypeAssociation newConcerneObjectifCiblage) {
		if (newConcerneObjectifCiblage != concerneObjectifCiblage) {
			NotificationChain msgs = null;
			if (concerneObjectifCiblage != null)
				msgs = ((InternalEObject)concerneObjectifCiblage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE, null, msgs);
			if (newConcerneObjectifCiblage != null)
				msgs = ((InternalEObject)newConcerneObjectifCiblage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE, null, msgs);
			msgs = basicSetConcerneObjectifCiblage(newConcerneObjectifCiblage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE, newConcerneObjectifCiblage, newConcerneObjectifCiblage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstPrevueParPlanFeux() {
		return estPrevueParPlanFeux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstPrevueParPlanFeux(TypeAssociation newEstPrevueParPlanFeux, NotificationChain msgs) {
		TypeAssociation oldEstPrevueParPlanFeux = estPrevueParPlanFeux;
		estPrevueParPlanFeux = newEstPrevueParPlanFeux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX, oldEstPrevueParPlanFeux, newEstPrevueParPlanFeux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstPrevueParPlanFeux(TypeAssociation newEstPrevueParPlanFeux) {
		if (newEstPrevueParPlanFeux != estPrevueParPlanFeux) {
			NotificationChain msgs = null;
			if (estPrevueParPlanFeux != null)
				msgs = ((InternalEObject)estPrevueParPlanFeux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX, null, msgs);
			if (newEstPrevueParPlanFeux != null)
				msgs = ((InternalEObject)newEstPrevueParPlanFeux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX, null, msgs);
			msgs = basicSetEstPrevueParPlanFeux(newEstPrevueParPlanFeux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX, newEstPrevueParPlanFeux, newEstPrevueParPlanFeux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME:
				return basicSetAPourTypeLanceurTypeArme(null, msgs);
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE:
				return basicSetAPourUniteReserveeOuAEngagerUnite(null, msgs);
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return basicSetAPourSecondesMunitionsParametresImposes(null, msgs);
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return basicSetAPourPremieresMunitionsParametresImposes(null, msgs);
			case SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION:
				return basicSetCommenceDatation(null, msgs);
			case SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION:
				return basicSetSeTermineDatation(null, msgs);
			case SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE:
				return basicSetConcerneObjectifCiblage(null, msgs);
			case SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX:
				return basicSetEstPrevueParPlanFeux(null, msgs);
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
			case SchemaPackage.TYPE_RESERVATION_UNITE__TRAJECTOIRE_TIR:
				return getTrajectoireTir();
			case SchemaPackage.TYPE_RESERVATION_UNITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_RESERVATION_UNITE__CE:
				return getCE();
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME:
				return getAPourTypeLanceurTypeArme();
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE:
				return getAPourUniteReserveeOuAEngagerUnite();
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return getAPourSecondesMunitionsParametresImposes();
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return getAPourPremieresMunitionsParametresImposes();
			case SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION:
				return getCommenceDatation();
			case SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION:
				return getSeTermineDatation();
			case SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE:
				return getConcerneObjectifCiblage();
			case SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX:
				return getEstPrevueParPlanFeux();
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
			case SchemaPackage.TYPE_RESERVATION_UNITE__TRAJECTOIRE_TIR:
				setTrajectoireTir((TypeDictionaryDicoTrajectoire)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME:
				setAPourTypeLanceurTypeArme((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE:
				setAPourUniteReserveeOuAEngagerUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourSecondesMunitionsParametresImposes((TypeParametresImposes)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourPremieresMunitionsParametresImposes((TypeParametresImposes)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION:
				setCommenceDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION:
				setSeTermineDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE:
				setConcerneObjectifCiblage((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX:
				setEstPrevueParPlanFeux((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_RESERVATION_UNITE__TRAJECTOIRE_TIR:
				unsetTrajectoireTir();
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME:
				setAPourTypeLanceurTypeArme((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE:
				setAPourUniteReserveeOuAEngagerUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourSecondesMunitionsParametresImposes((TypeParametresImposes)null);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				setAPourPremieresMunitionsParametresImposes((TypeParametresImposes)null);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION:
				setCommenceDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION:
				setSeTermineDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE:
				setConcerneObjectifCiblage((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX:
				setEstPrevueParPlanFeux((TypeAssociation)null);
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
			case SchemaPackage.TYPE_RESERVATION_UNITE__TRAJECTOIRE_TIR:
				return isSetTrajectoireTir();
			case SchemaPackage.TYPE_RESERVATION_UNITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_RESERVATION_UNITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_TYPE_LANCEUR_TYPE_ARME:
				return aPourTypeLanceurTypeArme != null;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_UNITE_RESERVEE_OU_AENGAGER_UNITE:
				return aPourUniteReserveeOuAEngagerUnite != null;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_SECONDES_MUNITIONS_PARAMETRES_IMPOSES:
				return aPourSecondesMunitionsParametresImposes != null;
			case SchemaPackage.TYPE_RESERVATION_UNITE__APOUR_PREMIERES_MUNITIONS_PARAMETRES_IMPOSES:
				return aPourPremieresMunitionsParametresImposes != null;
			case SchemaPackage.TYPE_RESERVATION_UNITE__COMMENCE_DATATION:
				return commenceDatation != null;
			case SchemaPackage.TYPE_RESERVATION_UNITE__SE_TERMINE_DATATION:
				return seTermineDatation != null;
			case SchemaPackage.TYPE_RESERVATION_UNITE__CONCERNE_OBJECTIF_CIBLAGE:
				return concerneObjectifCiblage != null;
			case SchemaPackage.TYPE_RESERVATION_UNITE__EST_PREVUE_PAR_PLAN_FEUX:
				return estPrevueParPlanFeux != null;
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
		result.append(" (trajectoireTir: ");
		if (trajectoireTirESet) result.append(trajectoireTir); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeReservationUniteImpl
