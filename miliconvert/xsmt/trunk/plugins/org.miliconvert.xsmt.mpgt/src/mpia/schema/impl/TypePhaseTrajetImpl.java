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
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDatation;
import mpia.schema.TypePhaseTrajet;
import mpia.schema.TypeTypeMissionAerienne;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Phase Trajet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getDateDebutTrajetCalculee <em>Date Debut Trajet Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getDateFintTrajetCalculee <em>Date Fint Trajet Calculee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getEspacementTemporel <em>Espacement Temporel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getCommentaire <em>Commentaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getEstPourTypeMissionAerienne <em>Est Pour Type Mission Aerienne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getVautPourHoraireManoeuvre <em>Vaut Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getAPourDateDebutPrevisionnelleDatation <em>APour Date Debut Previsionnelle Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getAPourDateFinPrevisionnelleDatation <em>APour Date Fin Previsionnelle Datation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getACommePointEntreeConsigne <em>AComme Point Entree Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getACommePointSortieConsigne <em>AComme Point Sortie Consigne</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePhaseTrajetImpl#getACommeConsignesAppliqueesConsigne <em>AComme Consignes Appliquees Consigne</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePhaseTrajetImpl extends EObjectImpl implements TypePhaseTrajet {
	/**
	 * The default value of the '{@link #getDateDebutTrajetCalculee() <em>Date Debut Trajet Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutTrajetCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_DEBUT_TRAJET_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebutTrajetCalculee() <em>Date Debut Trajet Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebutTrajetCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateDebutTrajetCalculee = DATE_DEBUT_TRAJET_CALCULEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFintTrajetCalculee() <em>Date Fint Trajet Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFintTrajetCalculee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_FINT_TRAJET_CALCULEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFintTrajetCalculee() <em>Date Fint Trajet Calculee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFintTrajetCalculee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateFintTrajetCalculee = DATE_FINT_TRAJET_CALCULEE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEspacementTemporel() <em>Espacement Temporel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEspacementTemporel()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree espacementTemporel;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

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
	 * The cached value of the '{@link #getEstPourTypeMissionAerienne() <em>Est Pour Type Mission Aerienne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPourTypeMissionAerienne()
	 * @generated
	 * @ordered
	 */
	protected TypeTypeMissionAerienne estPourTypeMissionAerienne;

	/**
	 * The cached value of the '{@link #getVautPourHoraireManoeuvre() <em>Vaut Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation vautPourHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getAPourDateDebutPrevisionnelleDatation() <em>APour Date Debut Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDateDebutPrevisionnelleDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDateDebutPrevisionnelleDatation;

	/**
	 * The cached value of the '{@link #getAPourDateFinPrevisionnelleDatation() <em>APour Date Fin Previsionnelle Datation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDateFinPrevisionnelleDatation()
	 * @generated
	 * @ordered
	 */
	protected TypeDatation aPourDateFinPrevisionnelleDatation;

	/**
	 * The cached value of the '{@link #getACommePointEntreeConsigne() <em>AComme Point Entree Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointEntreeConsigne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePointEntreeConsigne;

	/**
	 * The cached value of the '{@link #getACommePointSortieConsigne() <em>AComme Point Sortie Consigne</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommePointSortieConsigne()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aCommePointSortieConsigne;

	/**
	 * The cached value of the '{@link #getACommeConsignesAppliqueesConsigne() <em>AComme Consignes Appliquees Consigne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACommeConsignesAppliqueesConsigne()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aCommeConsignesAppliqueesConsigne;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePhaseTrajetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePhaseTrajet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateDebutTrajetCalculee() {
		return dateDebutTrajetCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebutTrajetCalculee(XMLGregorianCalendar newDateDebutTrajetCalculee) {
		XMLGregorianCalendar oldDateDebutTrajetCalculee = dateDebutTrajetCalculee;
		dateDebutTrajetCalculee = newDateDebutTrajetCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__DATE_DEBUT_TRAJET_CALCULEE, oldDateDebutTrajetCalculee, dateDebutTrajetCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateFintTrajetCalculee() {
		return dateFintTrajetCalculee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFintTrajetCalculee(XMLGregorianCalendar newDateFintTrajetCalculee) {
		XMLGregorianCalendar oldDateFintTrajetCalculee = dateFintTrajetCalculee;
		dateFintTrajetCalculee = newDateFintTrajetCalculee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__DATE_FINT_TRAJET_CALCULEE, oldDateFintTrajetCalculee, dateFintTrajetCalculee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getEspacementTemporel() {
		return espacementTemporel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEspacementTemporel(TypeDataTypeDuree newEspacementTemporel, NotificationChain msgs) {
		TypeDataTypeDuree oldEspacementTemporel = espacementTemporel;
		espacementTemporel = newEspacementTemporel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL, oldEspacementTemporel, newEspacementTemporel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEspacementTemporel(TypeDataTypeDuree newEspacementTemporel) {
		if (newEspacementTemporel != espacementTemporel) {
			NotificationChain msgs = null;
			if (espacementTemporel != null)
				msgs = ((InternalEObject)espacementTemporel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL, null, msgs);
			if (newEspacementTemporel != null)
				msgs = ((InternalEObject)newEspacementTemporel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL, null, msgs);
			msgs = basicSetEspacementTemporel(newEspacementTemporel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL, newEspacementTemporel, newEspacementTemporel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__VITESSE, newVitesse, newVitesse));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__COMMENTAIRE, oldCommentaire, commentaire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeMissionAerienne getEstPourTypeMissionAerienne() {
		return estPourTypeMissionAerienne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstPourTypeMissionAerienne(TypeTypeMissionAerienne newEstPourTypeMissionAerienne, NotificationChain msgs) {
		TypeTypeMissionAerienne oldEstPourTypeMissionAerienne = estPourTypeMissionAerienne;
		estPourTypeMissionAerienne = newEstPourTypeMissionAerienne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE, oldEstPourTypeMissionAerienne, newEstPourTypeMissionAerienne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstPourTypeMissionAerienne(TypeTypeMissionAerienne newEstPourTypeMissionAerienne) {
		if (newEstPourTypeMissionAerienne != estPourTypeMissionAerienne) {
			NotificationChain msgs = null;
			if (estPourTypeMissionAerienne != null)
				msgs = ((InternalEObject)estPourTypeMissionAerienne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE, null, msgs);
			if (newEstPourTypeMissionAerienne != null)
				msgs = ((InternalEObject)newEstPourTypeMissionAerienne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE, null, msgs);
			msgs = basicSetEstPourTypeMissionAerienne(newEstPourTypeMissionAerienne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE, newEstPourTypeMissionAerienne, newEstPourTypeMissionAerienne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getVautPourHoraireManoeuvre() {
		return vautPourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPourHoraireManoeuvre(TypeAssociation newVautPourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldVautPourHoraireManoeuvre = vautPourHoraireManoeuvre;
		vautPourHoraireManoeuvre = newVautPourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE, oldVautPourHoraireManoeuvre, newVautPourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPourHoraireManoeuvre(TypeAssociation newVautPourHoraireManoeuvre) {
		if (newVautPourHoraireManoeuvre != vautPourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (vautPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)vautPourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newVautPourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newVautPourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetVautPourHoraireManoeuvre(newVautPourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE, newVautPourHoraireManoeuvre, newVautPourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDateDebutPrevisionnelleDatation() {
		return aPourDateDebutPrevisionnelleDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDateDebutPrevisionnelleDatation(TypeDatation newAPourDateDebutPrevisionnelleDatation, NotificationChain msgs) {
		TypeDatation oldAPourDateDebutPrevisionnelleDatation = aPourDateDebutPrevisionnelleDatation;
		aPourDateDebutPrevisionnelleDatation = newAPourDateDebutPrevisionnelleDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION, oldAPourDateDebutPrevisionnelleDatation, newAPourDateDebutPrevisionnelleDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDateDebutPrevisionnelleDatation(TypeDatation newAPourDateDebutPrevisionnelleDatation) {
		if (newAPourDateDebutPrevisionnelleDatation != aPourDateDebutPrevisionnelleDatation) {
			NotificationChain msgs = null;
			if (aPourDateDebutPrevisionnelleDatation != null)
				msgs = ((InternalEObject)aPourDateDebutPrevisionnelleDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION, null, msgs);
			if (newAPourDateDebutPrevisionnelleDatation != null)
				msgs = ((InternalEObject)newAPourDateDebutPrevisionnelleDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION, null, msgs);
			msgs = basicSetAPourDateDebutPrevisionnelleDatation(newAPourDateDebutPrevisionnelleDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION, newAPourDateDebutPrevisionnelleDatation, newAPourDateDebutPrevisionnelleDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDatation getAPourDateFinPrevisionnelleDatation() {
		return aPourDateFinPrevisionnelleDatation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourDateFinPrevisionnelleDatation(TypeDatation newAPourDateFinPrevisionnelleDatation, NotificationChain msgs) {
		TypeDatation oldAPourDateFinPrevisionnelleDatation = aPourDateFinPrevisionnelleDatation;
		aPourDateFinPrevisionnelleDatation = newAPourDateFinPrevisionnelleDatation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION, oldAPourDateFinPrevisionnelleDatation, newAPourDateFinPrevisionnelleDatation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourDateFinPrevisionnelleDatation(TypeDatation newAPourDateFinPrevisionnelleDatation) {
		if (newAPourDateFinPrevisionnelleDatation != aPourDateFinPrevisionnelleDatation) {
			NotificationChain msgs = null;
			if (aPourDateFinPrevisionnelleDatation != null)
				msgs = ((InternalEObject)aPourDateFinPrevisionnelleDatation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION, null, msgs);
			if (newAPourDateFinPrevisionnelleDatation != null)
				msgs = ((InternalEObject)newAPourDateFinPrevisionnelleDatation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION, null, msgs);
			msgs = basicSetAPourDateFinPrevisionnelleDatation(newAPourDateFinPrevisionnelleDatation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION, newAPourDateFinPrevisionnelleDatation, newAPourDateFinPrevisionnelleDatation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePointEntreeConsigne() {
		return aCommePointEntreeConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePointEntreeConsigne(TypeAssociation newACommePointEntreeConsigne, NotificationChain msgs) {
		TypeAssociation oldACommePointEntreeConsigne = aCommePointEntreeConsigne;
		aCommePointEntreeConsigne = newACommePointEntreeConsigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE, oldACommePointEntreeConsigne, newACommePointEntreeConsigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePointEntreeConsigne(TypeAssociation newACommePointEntreeConsigne) {
		if (newACommePointEntreeConsigne != aCommePointEntreeConsigne) {
			NotificationChain msgs = null;
			if (aCommePointEntreeConsigne != null)
				msgs = ((InternalEObject)aCommePointEntreeConsigne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE, null, msgs);
			if (newACommePointEntreeConsigne != null)
				msgs = ((InternalEObject)newACommePointEntreeConsigne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE, null, msgs);
			msgs = basicSetACommePointEntreeConsigne(newACommePointEntreeConsigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE, newACommePointEntreeConsigne, newACommePointEntreeConsigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getACommePointSortieConsigne() {
		return aCommePointSortieConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACommePointSortieConsigne(TypeAssociation newACommePointSortieConsigne, NotificationChain msgs) {
		TypeAssociation oldACommePointSortieConsigne = aCommePointSortieConsigne;
		aCommePointSortieConsigne = newACommePointSortieConsigne;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE, oldACommePointSortieConsigne, newACommePointSortieConsigne);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACommePointSortieConsigne(TypeAssociation newACommePointSortieConsigne) {
		if (newACommePointSortieConsigne != aCommePointSortieConsigne) {
			NotificationChain msgs = null;
			if (aCommePointSortieConsigne != null)
				msgs = ((InternalEObject)aCommePointSortieConsigne).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE, null, msgs);
			if (newACommePointSortieConsigne != null)
				msgs = ((InternalEObject)newACommePointSortieConsigne).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE, null, msgs);
			msgs = basicSetACommePointSortieConsigne(newACommePointSortieConsigne, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE, newACommePointSortieConsigne, newACommePointSortieConsigne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getACommeConsignesAppliqueesConsigne() {
		if (aCommeConsignesAppliqueesConsigne == null) {
			aCommeConsignesAppliqueesConsigne = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_CONSIGNES_APPLIQUEES_CONSIGNE);
		}
		return aCommeConsignesAppliqueesConsigne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL:
				return basicSetEspacementTemporel(null, msgs);
			case SchemaPackage.TYPE_PHASE_TRAJET__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE:
				return basicSetEstPourTypeMissionAerienne(null, msgs);
			case SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE:
				return basicSetVautPourHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				return basicSetAPourDateDebutPrevisionnelleDatation(null, msgs);
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				return basicSetAPourDateFinPrevisionnelleDatation(null, msgs);
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE:
				return basicSetACommePointEntreeConsigne(null, msgs);
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE:
				return basicSetACommePointSortieConsigne(null, msgs);
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_CONSIGNES_APPLIQUEES_CONSIGNE:
				return ((InternalEList<?>)getACommeConsignesAppliqueesConsigne()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_PHASE_TRAJET__DATE_DEBUT_TRAJET_CALCULEE:
				return getDateDebutTrajetCalculee();
			case SchemaPackage.TYPE_PHASE_TRAJET__DATE_FINT_TRAJET_CALCULEE:
				return getDateFintTrajetCalculee();
			case SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL:
				return getEspacementTemporel();
			case SchemaPackage.TYPE_PHASE_TRAJET__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_PHASE_TRAJET__COMMENTAIRE:
				return getCommentaire();
			case SchemaPackage.TYPE_PHASE_TRAJET__CTE:
				return getCTE();
			case SchemaPackage.TYPE_PHASE_TRAJET__CE:
				return getCE();
			case SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE:
				return getEstPourTypeMissionAerienne();
			case SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE:
				return getVautPourHoraireManoeuvre();
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				return getAPourDateDebutPrevisionnelleDatation();
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				return getAPourDateFinPrevisionnelleDatation();
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE:
				return getACommePointEntreeConsigne();
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE:
				return getACommePointSortieConsigne();
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_CONSIGNES_APPLIQUEES_CONSIGNE:
				return getACommeConsignesAppliqueesConsigne();
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
			case SchemaPackage.TYPE_PHASE_TRAJET__DATE_DEBUT_TRAJET_CALCULEE:
				setDateDebutTrajetCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__DATE_FINT_TRAJET_CALCULEE:
				setDateFintTrajetCalculee((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL:
				setEspacementTemporel((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__COMMENTAIRE:
				setCommentaire((String)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE:
				setEstPourTypeMissionAerienne((TypeTypeMissionAerienne)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE:
				setVautPourHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				setAPourDateDebutPrevisionnelleDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				setAPourDateFinPrevisionnelleDatation((TypeDatation)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE:
				setACommePointEntreeConsigne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE:
				setACommePointSortieConsigne((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_CONSIGNES_APPLIQUEES_CONSIGNE:
				getACommeConsignesAppliqueesConsigne().clear();
				getACommeConsignesAppliqueesConsigne().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_PHASE_TRAJET__DATE_DEBUT_TRAJET_CALCULEE:
				setDateDebutTrajetCalculee(DATE_DEBUT_TRAJET_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__DATE_FINT_TRAJET_CALCULEE:
				setDateFintTrajetCalculee(DATE_FINT_TRAJET_CALCULEE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL:
				setEspacementTemporel((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__COMMENTAIRE:
				setCommentaire(COMMENTAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE:
				setEstPourTypeMissionAerienne((TypeTypeMissionAerienne)null);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE:
				setVautPourHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				setAPourDateDebutPrevisionnelleDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				setAPourDateFinPrevisionnelleDatation((TypeDatation)null);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE:
				setACommePointEntreeConsigne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE:
				setACommePointSortieConsigne((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_CONSIGNES_APPLIQUEES_CONSIGNE:
				getACommeConsignesAppliqueesConsigne().clear();
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
			case SchemaPackage.TYPE_PHASE_TRAJET__DATE_DEBUT_TRAJET_CALCULEE:
				return DATE_DEBUT_TRAJET_CALCULEE_EDEFAULT == null ? dateDebutTrajetCalculee != null : !DATE_DEBUT_TRAJET_CALCULEE_EDEFAULT.equals(dateDebutTrajetCalculee);
			case SchemaPackage.TYPE_PHASE_TRAJET__DATE_FINT_TRAJET_CALCULEE:
				return DATE_FINT_TRAJET_CALCULEE_EDEFAULT == null ? dateFintTrajetCalculee != null : !DATE_FINT_TRAJET_CALCULEE_EDEFAULT.equals(dateFintTrajetCalculee);
			case SchemaPackage.TYPE_PHASE_TRAJET__ESPACEMENT_TEMPOREL:
				return espacementTemporel != null;
			case SchemaPackage.TYPE_PHASE_TRAJET__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_PHASE_TRAJET__COMMENTAIRE:
				return COMMENTAIRE_EDEFAULT == null ? commentaire != null : !COMMENTAIRE_EDEFAULT.equals(commentaire);
			case SchemaPackage.TYPE_PHASE_TRAJET__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_PHASE_TRAJET__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_PHASE_TRAJET__EST_POUR_TYPE_MISSION_AERIENNE:
				return estPourTypeMissionAerienne != null;
			case SchemaPackage.TYPE_PHASE_TRAJET__VAUT_POUR_HORAIRE_MANOEUVRE:
				return vautPourHoraireManoeuvre != null;
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_DEBUT_PREVISIONNELLE_DATATION:
				return aPourDateDebutPrevisionnelleDatation != null;
			case SchemaPackage.TYPE_PHASE_TRAJET__APOUR_DATE_FIN_PREVISIONNELLE_DATATION:
				return aPourDateFinPrevisionnelleDatation != null;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_ENTREE_CONSIGNE:
				return aCommePointEntreeConsigne != null;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_POINT_SORTIE_CONSIGNE:
				return aCommePointSortieConsigne != null;
			case SchemaPackage.TYPE_PHASE_TRAJET__ACOMME_CONSIGNES_APPLIQUEES_CONSIGNE:
				return aCommeConsignesAppliqueesConsigne != null && !aCommeConsignesAppliqueesConsigne.isEmpty();
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
		result.append(" (dateDebutTrajetCalculee: ");
		result.append(dateDebutTrajetCalculee);
		result.append(", dateFintTrajetCalculee: ");
		result.append(dateFintTrajetCalculee);
		result.append(", commentaire: ");
		result.append(commentaire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypePhaseTrajetImpl
