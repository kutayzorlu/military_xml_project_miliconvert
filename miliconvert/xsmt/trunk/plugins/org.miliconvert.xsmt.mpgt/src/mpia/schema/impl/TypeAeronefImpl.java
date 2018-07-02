/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAeronef;
import mpia.schema.TypePotentielAeronef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Aeronef</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAeronefImpl#getIdentifiantAppareilGenerique <em>Identifiant Appareil Generique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAeronefImpl#getNumeroSerieOACI <em>Numero Serie OACI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAeronefImpl#getIndicatifOACI <em>Indicatif OACI</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAeronefImpl#getNombrePersonnesEmbarquees <em>Nombre Personnes Embarquees</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAeronefImpl#getCommentaireSurPersonnelEmbarque <em>Commentaire Sur Personnel Embarque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAeronefImpl#getAutreEquipementEmbarque <em>Autre Equipement Embarque</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAeronefImpl#getAPourPotentielPotentielAeronef <em>APour Potentiel Potentiel Aeronef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAeronefImpl extends TypeMaterielImpl implements TypeAeronef {
	/**
	 * The default value of the '{@link #getIdentifiantAppareilGenerique() <em>Identifiant Appareil Generique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantAppareilGenerique()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIANT_APPAREIL_GENERIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifiantAppareilGenerique() <em>Identifiant Appareil Generique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiantAppareilGenerique()
	 * @generated
	 * @ordered
	 */
	protected String identifiantAppareilGenerique = IDENTIFIANT_APPAREIL_GENERIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumeroSerieOACI() <em>Numero Serie OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerieOACI()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_SERIE_OACI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroSerieOACI() <em>Numero Serie OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroSerieOACI()
	 * @generated
	 * @ordered
	 */
	protected String numeroSerieOACI = NUMERO_SERIE_OACI_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndicatifOACI() <em>Indicatif OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatifOACI()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICATIF_OACI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndicatifOACI() <em>Indicatif OACI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicatifOACI()
	 * @generated
	 * @ordered
	 */
	protected String indicatifOACI = INDICATIF_OACI_EDEFAULT;

	/**
	 * The default value of the '{@link #getNombrePersonnesEmbarquees() <em>Nombre Personnes Embarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonnesEmbarquees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_PERSONNES_EMBARQUEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombrePersonnesEmbarquees() <em>Nombre Personnes Embarquees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombrePersonnesEmbarquees()
	 * @generated
	 * @ordered
	 */
	protected long nombrePersonnesEmbarquees = NOMBRE_PERSONNES_EMBARQUEES_EDEFAULT;

	/**
	 * This is true if the Nombre Personnes Embarquees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombrePersonnesEmbarqueesESet;

	/**
	 * The default value of the '{@link #getCommentaireSurPersonnelEmbarque() <em>Commentaire Sur Personnel Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSurPersonnelEmbarque()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTAIRE_SUR_PERSONNEL_EMBARQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentaireSurPersonnelEmbarque() <em>Commentaire Sur Personnel Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentaireSurPersonnelEmbarque()
	 * @generated
	 * @ordered
	 */
	protected String commentaireSurPersonnelEmbarque = COMMENTAIRE_SUR_PERSONNEL_EMBARQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutreEquipementEmbarque() <em>Autre Equipement Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEquipementEmbarque()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTRE_EQUIPEMENT_EMBARQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutreEquipementEmbarque() <em>Autre Equipement Embarque</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutreEquipementEmbarque()
	 * @generated
	 * @ordered
	 */
	protected String autreEquipementEmbarque = AUTRE_EQUIPEMENT_EMBARQUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourPotentielPotentielAeronef() <em>APour Potentiel Potentiel Aeronef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourPotentielPotentielAeronef()
	 * @generated
	 * @ordered
	 */
	protected TypePotentielAeronef aPourPotentielPotentielAeronef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAeronefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAeronef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifiantAppareilGenerique() {
		return identifiantAppareilGenerique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiantAppareilGenerique(String newIdentifiantAppareilGenerique) {
		String oldIdentifiantAppareilGenerique = identifiantAppareilGenerique;
		identifiantAppareilGenerique = newIdentifiantAppareilGenerique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERONEF__IDENTIFIANT_APPAREIL_GENERIQUE, oldIdentifiantAppareilGenerique, identifiantAppareilGenerique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroSerieOACI() {
		return numeroSerieOACI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroSerieOACI(String newNumeroSerieOACI) {
		String oldNumeroSerieOACI = numeroSerieOACI;
		numeroSerieOACI = newNumeroSerieOACI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERONEF__NUMERO_SERIE_OACI, oldNumeroSerieOACI, numeroSerieOACI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndicatifOACI() {
		return indicatifOACI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicatifOACI(String newIndicatifOACI) {
		String oldIndicatifOACI = indicatifOACI;
		indicatifOACI = newIndicatifOACI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERONEF__INDICATIF_OACI, oldIndicatifOACI, indicatifOACI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombrePersonnesEmbarquees() {
		return nombrePersonnesEmbarquees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombrePersonnesEmbarquees(long newNombrePersonnesEmbarquees) {
		long oldNombrePersonnesEmbarquees = nombrePersonnesEmbarquees;
		nombrePersonnesEmbarquees = newNombrePersonnesEmbarquees;
		boolean oldNombrePersonnesEmbarqueesESet = nombrePersonnesEmbarqueesESet;
		nombrePersonnesEmbarqueesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERONEF__NOMBRE_PERSONNES_EMBARQUEES, oldNombrePersonnesEmbarquees, nombrePersonnesEmbarquees, !oldNombrePersonnesEmbarqueesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombrePersonnesEmbarquees() {
		long oldNombrePersonnesEmbarquees = nombrePersonnesEmbarquees;
		boolean oldNombrePersonnesEmbarqueesESet = nombrePersonnesEmbarqueesESet;
		nombrePersonnesEmbarquees = NOMBRE_PERSONNES_EMBARQUEES_EDEFAULT;
		nombrePersonnesEmbarqueesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AERONEF__NOMBRE_PERSONNES_EMBARQUEES, oldNombrePersonnesEmbarquees, NOMBRE_PERSONNES_EMBARQUEES_EDEFAULT, oldNombrePersonnesEmbarqueesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombrePersonnesEmbarquees() {
		return nombrePersonnesEmbarqueesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommentaireSurPersonnelEmbarque() {
		return commentaireSurPersonnelEmbarque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentaireSurPersonnelEmbarque(String newCommentaireSurPersonnelEmbarque) {
		String oldCommentaireSurPersonnelEmbarque = commentaireSurPersonnelEmbarque;
		commentaireSurPersonnelEmbarque = newCommentaireSurPersonnelEmbarque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERONEF__COMMENTAIRE_SUR_PERSONNEL_EMBARQUE, oldCommentaireSurPersonnelEmbarque, commentaireSurPersonnelEmbarque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutreEquipementEmbarque() {
		return autreEquipementEmbarque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutreEquipementEmbarque(String newAutreEquipementEmbarque) {
		String oldAutreEquipementEmbarque = autreEquipementEmbarque;
		autreEquipementEmbarque = newAutreEquipementEmbarque;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERONEF__AUTRE_EQUIPEMENT_EMBARQUE, oldAutreEquipementEmbarque, autreEquipementEmbarque));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePotentielAeronef getAPourPotentielPotentielAeronef() {
		return aPourPotentielPotentielAeronef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourPotentielPotentielAeronef(TypePotentielAeronef newAPourPotentielPotentielAeronef, NotificationChain msgs) {
		TypePotentielAeronef oldAPourPotentielPotentielAeronef = aPourPotentielPotentielAeronef;
		aPourPotentielPotentielAeronef = newAPourPotentielPotentielAeronef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF, oldAPourPotentielPotentielAeronef, newAPourPotentielPotentielAeronef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourPotentielPotentielAeronef(TypePotentielAeronef newAPourPotentielPotentielAeronef) {
		if (newAPourPotentielPotentielAeronef != aPourPotentielPotentielAeronef) {
			NotificationChain msgs = null;
			if (aPourPotentielPotentielAeronef != null)
				msgs = ((InternalEObject)aPourPotentielPotentielAeronef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF, null, msgs);
			if (newAPourPotentielPotentielAeronef != null)
				msgs = ((InternalEObject)newAPourPotentielPotentielAeronef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF, null, msgs);
			msgs = basicSetAPourPotentielPotentielAeronef(newAPourPotentielPotentielAeronef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF, newAPourPotentielPotentielAeronef, newAPourPotentielPotentielAeronef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF:
				return basicSetAPourPotentielPotentielAeronef(null, msgs);
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
			case SchemaPackage.TYPE_AERONEF__IDENTIFIANT_APPAREIL_GENERIQUE:
				return getIdentifiantAppareilGenerique();
			case SchemaPackage.TYPE_AERONEF__NUMERO_SERIE_OACI:
				return getNumeroSerieOACI();
			case SchemaPackage.TYPE_AERONEF__INDICATIF_OACI:
				return getIndicatifOACI();
			case SchemaPackage.TYPE_AERONEF__NOMBRE_PERSONNES_EMBARQUEES:
				return new Long(getNombrePersonnesEmbarquees());
			case SchemaPackage.TYPE_AERONEF__COMMENTAIRE_SUR_PERSONNEL_EMBARQUE:
				return getCommentaireSurPersonnelEmbarque();
			case SchemaPackage.TYPE_AERONEF__AUTRE_EQUIPEMENT_EMBARQUE:
				return getAutreEquipementEmbarque();
			case SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF:
				return getAPourPotentielPotentielAeronef();
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
			case SchemaPackage.TYPE_AERONEF__IDENTIFIANT_APPAREIL_GENERIQUE:
				setIdentifiantAppareilGenerique((String)newValue);
				return;
			case SchemaPackage.TYPE_AERONEF__NUMERO_SERIE_OACI:
				setNumeroSerieOACI((String)newValue);
				return;
			case SchemaPackage.TYPE_AERONEF__INDICATIF_OACI:
				setIndicatifOACI((String)newValue);
				return;
			case SchemaPackage.TYPE_AERONEF__NOMBRE_PERSONNES_EMBARQUEES:
				setNombrePersonnesEmbarquees(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_AERONEF__COMMENTAIRE_SUR_PERSONNEL_EMBARQUE:
				setCommentaireSurPersonnelEmbarque((String)newValue);
				return;
			case SchemaPackage.TYPE_AERONEF__AUTRE_EQUIPEMENT_EMBARQUE:
				setAutreEquipementEmbarque((String)newValue);
				return;
			case SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF:
				setAPourPotentielPotentielAeronef((TypePotentielAeronef)newValue);
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
			case SchemaPackage.TYPE_AERONEF__IDENTIFIANT_APPAREIL_GENERIQUE:
				setIdentifiantAppareilGenerique(IDENTIFIANT_APPAREIL_GENERIQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AERONEF__NUMERO_SERIE_OACI:
				setNumeroSerieOACI(NUMERO_SERIE_OACI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AERONEF__INDICATIF_OACI:
				setIndicatifOACI(INDICATIF_OACI_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AERONEF__NOMBRE_PERSONNES_EMBARQUEES:
				unsetNombrePersonnesEmbarquees();
				return;
			case SchemaPackage.TYPE_AERONEF__COMMENTAIRE_SUR_PERSONNEL_EMBARQUE:
				setCommentaireSurPersonnelEmbarque(COMMENTAIRE_SUR_PERSONNEL_EMBARQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AERONEF__AUTRE_EQUIPEMENT_EMBARQUE:
				setAutreEquipementEmbarque(AUTRE_EQUIPEMENT_EMBARQUE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF:
				setAPourPotentielPotentielAeronef((TypePotentielAeronef)null);
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
			case SchemaPackage.TYPE_AERONEF__IDENTIFIANT_APPAREIL_GENERIQUE:
				return IDENTIFIANT_APPAREIL_GENERIQUE_EDEFAULT == null ? identifiantAppareilGenerique != null : !IDENTIFIANT_APPAREIL_GENERIQUE_EDEFAULT.equals(identifiantAppareilGenerique);
			case SchemaPackage.TYPE_AERONEF__NUMERO_SERIE_OACI:
				return NUMERO_SERIE_OACI_EDEFAULT == null ? numeroSerieOACI != null : !NUMERO_SERIE_OACI_EDEFAULT.equals(numeroSerieOACI);
			case SchemaPackage.TYPE_AERONEF__INDICATIF_OACI:
				return INDICATIF_OACI_EDEFAULT == null ? indicatifOACI != null : !INDICATIF_OACI_EDEFAULT.equals(indicatifOACI);
			case SchemaPackage.TYPE_AERONEF__NOMBRE_PERSONNES_EMBARQUEES:
				return isSetNombrePersonnesEmbarquees();
			case SchemaPackage.TYPE_AERONEF__COMMENTAIRE_SUR_PERSONNEL_EMBARQUE:
				return COMMENTAIRE_SUR_PERSONNEL_EMBARQUE_EDEFAULT == null ? commentaireSurPersonnelEmbarque != null : !COMMENTAIRE_SUR_PERSONNEL_EMBARQUE_EDEFAULT.equals(commentaireSurPersonnelEmbarque);
			case SchemaPackage.TYPE_AERONEF__AUTRE_EQUIPEMENT_EMBARQUE:
				return AUTRE_EQUIPEMENT_EMBARQUE_EDEFAULT == null ? autreEquipementEmbarque != null : !AUTRE_EQUIPEMENT_EMBARQUE_EDEFAULT.equals(autreEquipementEmbarque);
			case SchemaPackage.TYPE_AERONEF__APOUR_POTENTIEL_POTENTIEL_AERONEF:
				return aPourPotentielPotentielAeronef != null;
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
		result.append(" (identifiantAppareilGenerique: ");
		result.append(identifiantAppareilGenerique);
		result.append(", numeroSerieOACI: ");
		result.append(numeroSerieOACI);
		result.append(", indicatifOACI: ");
		result.append(indicatifOACI);
		result.append(", nombrePersonnesEmbarquees: ");
		if (nombrePersonnesEmbarqueesESet) result.append(nombrePersonnesEmbarquees); else result.append("<unset>");
		result.append(", commentaireSurPersonnelEmbarque: ");
		result.append(commentaireSurPersonnelEmbarque);
		result.append(", autreEquipementEmbarque: ");
		result.append(autreEquipementEmbarque);
		result.append(')');
		return result.toString();
	}

} //TypeAeronefImpl
