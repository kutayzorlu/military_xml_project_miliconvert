/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeChampMagnetique;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeVolume;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoTypeBatimentPropulsion;
import mpia.schema.TypeTypeBatiment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Type Batiment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getTirantEau <em>Tirant Eau</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getChargeEnLourd <em>Charge En Lourd</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getVitesseMaximale <em>Vitesse Maximale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getNombreHelices <em>Nombre Helices</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getPropulsion <em>Propulsion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getDeplacementOperationnel <em>Deplacement Operationnel</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getJaugeBrute <em>Jauge Brute</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getHauteurAuDessusLigneFlottaison <em>Hauteur Au Dessus Ligne Flottaison</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getNiveauAcoustique <em>Niveau Acoustique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getChampMagnetiqueVertical <em>Champ Magnetique Vertical</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getPrismaticCoefficient <em>Prismatic Coefficient</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeBatimentImpl#getComplements <em>Complements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeBatimentImpl extends TypeTypeEquipementImpl implements TypeTypeBatiment {
	/**
	 * The cached value of the '{@link #getTirantEau() <em>Tirant Eau</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTirantEau()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur tirantEau;

	/**
	 * The default value of the '{@link #getChargeEnLourd() <em>Charge En Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeEnLourd()
	 * @generated
	 * @ordered
	 */
	protected static final long CHARGE_EN_LOURD_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getChargeEnLourd() <em>Charge En Lourd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChargeEnLourd()
	 * @generated
	 * @ordered
	 */
	protected long chargeEnLourd = CHARGE_EN_LOURD_EDEFAULT;

	/**
	 * This is true if the Charge En Lourd attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean chargeEnLourdESet;

	/**
	 * The default value of the '{@link #getVitesseMaximale() <em>Vitesse Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMaximale()
	 * @generated
	 * @ordered
	 */
	protected static final double VITESSE_MAXIMALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVitesseMaximale() <em>Vitesse Maximale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesseMaximale()
	 * @generated
	 * @ordered
	 */
	protected double vitesseMaximale = VITESSE_MAXIMALE_EDEFAULT;

	/**
	 * This is true if the Vitesse Maximale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vitesseMaximaleESet;

	/**
	 * The default value of the '{@link #getNombreHelices() <em>Nombre Helices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreHelices()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_HELICES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreHelices() <em>Nombre Helices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreHelices()
	 * @generated
	 * @ordered
	 */
	protected long nombreHelices = NOMBRE_HELICES_EDEFAULT;

	/**
	 * This is true if the Nombre Helices attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreHelicesESet;

	/**
	 * The default value of the '{@link #getPropulsion() <em>Propulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropulsion()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeBatimentPropulsion PROPULSION_EDEFAULT = TypeDictionaryDicoTypeBatimentPropulsion.AIP;

	/**
	 * The cached value of the '{@link #getPropulsion() <em>Propulsion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropulsion()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeBatimentPropulsion propulsion = PROPULSION_EDEFAULT;

	/**
	 * This is true if the Propulsion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean propulsionESet;

	/**
	 * The default value of the '{@link #getDeplacementOperationnel() <em>Deplacement Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeplacementOperationnel()
	 * @generated
	 * @ordered
	 */
	protected static final long DEPLACEMENT_OPERATIONNEL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDeplacementOperationnel() <em>Deplacement Operationnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeplacementOperationnel()
	 * @generated
	 * @ordered
	 */
	protected long deplacementOperationnel = DEPLACEMENT_OPERATIONNEL_EDEFAULT;

	/**
	 * This is true if the Deplacement Operationnel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deplacementOperationnelESet;

	/**
	 * The cached value of the '{@link #getJaugeBrute() <em>Jauge Brute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJaugeBrute()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVolume jaugeBrute;

	/**
	 * The cached value of the '{@link #getHauteurAuDessusLigneFlottaison() <em>Hauteur Au Dessus Ligne Flottaison</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurAuDessusLigneFlottaison()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurAuDessusLigneFlottaison;

	/**
	 * The default value of the '{@link #getNiveauAcoustique() <em>Niveau Acoustique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauAcoustique()
	 * @generated
	 * @ordered
	 */
	protected static final long NIVEAU_ACOUSTIQUE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNiveauAcoustique() <em>Niveau Acoustique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauAcoustique()
	 * @generated
	 * @ordered
	 */
	protected long niveauAcoustique = NIVEAU_ACOUSTIQUE_EDEFAULT;

	/**
	 * This is true if the Niveau Acoustique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean niveauAcoustiqueESet;

	/**
	 * The cached value of the '{@link #getChampMagnetiqueVertical() <em>Champ Magnetique Vertical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChampMagnetiqueVertical()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeChampMagnetique champMagnetiqueVertical;

	/**
	 * The default value of the '{@link #getPrismaticCoefficient() <em>Prismatic Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrismaticCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final double PRISMATIC_COEFFICIENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrismaticCoefficient() <em>Prismatic Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrismaticCoefficient()
	 * @generated
	 * @ordered
	 */
	protected double prismaticCoefficient = PRISMATIC_COEFFICIENT_EDEFAULT;

	/**
	 * This is true if the Prismatic Coefficient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prismaticCoefficientESet;

	/**
	 * The default value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplements() <em>Complements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplements()
	 * @generated
	 * @ordered
	 */
	protected String complements = COMPLEMENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeBatimentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeBatiment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getTirantEau() {
		return tirantEau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTirantEau(TypeDataTypeLongueur newTirantEau, NotificationChain msgs) {
		TypeDataTypeLongueur oldTirantEau = tirantEau;
		tirantEau = newTirantEau;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU, oldTirantEau, newTirantEau);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTirantEau(TypeDataTypeLongueur newTirantEau) {
		if (newTirantEau != tirantEau) {
			NotificationChain msgs = null;
			if (tirantEau != null)
				msgs = ((InternalEObject)tirantEau).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU, null, msgs);
			if (newTirantEau != null)
				msgs = ((InternalEObject)newTirantEau).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU, null, msgs);
			msgs = basicSetTirantEau(newTirantEau, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU, newTirantEau, newTirantEau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getChargeEnLourd() {
		return chargeEnLourd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChargeEnLourd(long newChargeEnLourd) {
		long oldChargeEnLourd = chargeEnLourd;
		chargeEnLourd = newChargeEnLourd;
		boolean oldChargeEnLourdESet = chargeEnLourdESet;
		chargeEnLourdESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__CHARGE_EN_LOURD, oldChargeEnLourd, chargeEnLourd, !oldChargeEnLourdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChargeEnLourd() {
		long oldChargeEnLourd = chargeEnLourd;
		boolean oldChargeEnLourdESet = chargeEnLourdESet;
		chargeEnLourd = CHARGE_EN_LOURD_EDEFAULT;
		chargeEnLourdESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT__CHARGE_EN_LOURD, oldChargeEnLourd, CHARGE_EN_LOURD_EDEFAULT, oldChargeEnLourdESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChargeEnLourd() {
		return chargeEnLourdESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVitesseMaximale() {
		return vitesseMaximale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesseMaximale(double newVitesseMaximale) {
		double oldVitesseMaximale = vitesseMaximale;
		vitesseMaximale = newVitesseMaximale;
		boolean oldVitesseMaximaleESet = vitesseMaximaleESet;
		vitesseMaximaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__VITESSE_MAXIMALE, oldVitesseMaximale, vitesseMaximale, !oldVitesseMaximaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVitesseMaximale() {
		double oldVitesseMaximale = vitesseMaximale;
		boolean oldVitesseMaximaleESet = vitesseMaximaleESet;
		vitesseMaximale = VITESSE_MAXIMALE_EDEFAULT;
		vitesseMaximaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT__VITESSE_MAXIMALE, oldVitesseMaximale, VITESSE_MAXIMALE_EDEFAULT, oldVitesseMaximaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVitesseMaximale() {
		return vitesseMaximaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreHelices() {
		return nombreHelices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreHelices(long newNombreHelices) {
		long oldNombreHelices = nombreHelices;
		nombreHelices = newNombreHelices;
		boolean oldNombreHelicesESet = nombreHelicesESet;
		nombreHelicesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__NOMBRE_HELICES, oldNombreHelices, nombreHelices, !oldNombreHelicesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreHelices() {
		long oldNombreHelices = nombreHelices;
		boolean oldNombreHelicesESet = nombreHelicesESet;
		nombreHelices = NOMBRE_HELICES_EDEFAULT;
		nombreHelicesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT__NOMBRE_HELICES, oldNombreHelices, NOMBRE_HELICES_EDEFAULT, oldNombreHelicesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreHelices() {
		return nombreHelicesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeBatimentPropulsion getPropulsion() {
		return propulsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropulsion(TypeDictionaryDicoTypeBatimentPropulsion newPropulsion) {
		TypeDictionaryDicoTypeBatimentPropulsion oldPropulsion = propulsion;
		propulsion = newPropulsion == null ? PROPULSION_EDEFAULT : newPropulsion;
		boolean oldPropulsionESet = propulsionESet;
		propulsionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__PROPULSION, oldPropulsion, propulsion, !oldPropulsionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPropulsion() {
		TypeDictionaryDicoTypeBatimentPropulsion oldPropulsion = propulsion;
		boolean oldPropulsionESet = propulsionESet;
		propulsion = PROPULSION_EDEFAULT;
		propulsionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT__PROPULSION, oldPropulsion, PROPULSION_EDEFAULT, oldPropulsionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPropulsion() {
		return propulsionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDeplacementOperationnel() {
		return deplacementOperationnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeplacementOperationnel(long newDeplacementOperationnel) {
		long oldDeplacementOperationnel = deplacementOperationnel;
		deplacementOperationnel = newDeplacementOperationnel;
		boolean oldDeplacementOperationnelESet = deplacementOperationnelESet;
		deplacementOperationnelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__DEPLACEMENT_OPERATIONNEL, oldDeplacementOperationnel, deplacementOperationnel, !oldDeplacementOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeplacementOperationnel() {
		long oldDeplacementOperationnel = deplacementOperationnel;
		boolean oldDeplacementOperationnelESet = deplacementOperationnelESet;
		deplacementOperationnel = DEPLACEMENT_OPERATIONNEL_EDEFAULT;
		deplacementOperationnelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT__DEPLACEMENT_OPERATIONNEL, oldDeplacementOperationnel, DEPLACEMENT_OPERATIONNEL_EDEFAULT, oldDeplacementOperationnelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeplacementOperationnel() {
		return deplacementOperationnelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVolume getJaugeBrute() {
		return jaugeBrute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJaugeBrute(TypeDataTypeVolume newJaugeBrute, NotificationChain msgs) {
		TypeDataTypeVolume oldJaugeBrute = jaugeBrute;
		jaugeBrute = newJaugeBrute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE, oldJaugeBrute, newJaugeBrute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJaugeBrute(TypeDataTypeVolume newJaugeBrute) {
		if (newJaugeBrute != jaugeBrute) {
			NotificationChain msgs = null;
			if (jaugeBrute != null)
				msgs = ((InternalEObject)jaugeBrute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE, null, msgs);
			if (newJaugeBrute != null)
				msgs = ((InternalEObject)newJaugeBrute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE, null, msgs);
			msgs = basicSetJaugeBrute(newJaugeBrute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE, newJaugeBrute, newJaugeBrute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurAuDessusLigneFlottaison() {
		return hauteurAuDessusLigneFlottaison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurAuDessusLigneFlottaison(TypeDataTypeLongueur newHauteurAuDessusLigneFlottaison, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurAuDessusLigneFlottaison = hauteurAuDessusLigneFlottaison;
		hauteurAuDessusLigneFlottaison = newHauteurAuDessusLigneFlottaison;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON, oldHauteurAuDessusLigneFlottaison, newHauteurAuDessusLigneFlottaison);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurAuDessusLigneFlottaison(TypeDataTypeLongueur newHauteurAuDessusLigneFlottaison) {
		if (newHauteurAuDessusLigneFlottaison != hauteurAuDessusLigneFlottaison) {
			NotificationChain msgs = null;
			if (hauteurAuDessusLigneFlottaison != null)
				msgs = ((InternalEObject)hauteurAuDessusLigneFlottaison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON, null, msgs);
			if (newHauteurAuDessusLigneFlottaison != null)
				msgs = ((InternalEObject)newHauteurAuDessusLigneFlottaison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON, null, msgs);
			msgs = basicSetHauteurAuDessusLigneFlottaison(newHauteurAuDessusLigneFlottaison, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON, newHauteurAuDessusLigneFlottaison, newHauteurAuDessusLigneFlottaison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNiveauAcoustique() {
		return niveauAcoustique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauAcoustique(long newNiveauAcoustique) {
		long oldNiveauAcoustique = niveauAcoustique;
		niveauAcoustique = newNiveauAcoustique;
		boolean oldNiveauAcoustiqueESet = niveauAcoustiqueESet;
		niveauAcoustiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__NIVEAU_ACOUSTIQUE, oldNiveauAcoustique, niveauAcoustique, !oldNiveauAcoustiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNiveauAcoustique() {
		long oldNiveauAcoustique = niveauAcoustique;
		boolean oldNiveauAcoustiqueESet = niveauAcoustiqueESet;
		niveauAcoustique = NIVEAU_ACOUSTIQUE_EDEFAULT;
		niveauAcoustiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT__NIVEAU_ACOUSTIQUE, oldNiveauAcoustique, NIVEAU_ACOUSTIQUE_EDEFAULT, oldNiveauAcoustiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNiveauAcoustique() {
		return niveauAcoustiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeChampMagnetique getChampMagnetiqueVertical() {
		return champMagnetiqueVertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChampMagnetiqueVertical(TypeDataTypeChampMagnetique newChampMagnetiqueVertical, NotificationChain msgs) {
		TypeDataTypeChampMagnetique oldChampMagnetiqueVertical = champMagnetiqueVertical;
		champMagnetiqueVertical = newChampMagnetiqueVertical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL, oldChampMagnetiqueVertical, newChampMagnetiqueVertical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChampMagnetiqueVertical(TypeDataTypeChampMagnetique newChampMagnetiqueVertical) {
		if (newChampMagnetiqueVertical != champMagnetiqueVertical) {
			NotificationChain msgs = null;
			if (champMagnetiqueVertical != null)
				msgs = ((InternalEObject)champMagnetiqueVertical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL, null, msgs);
			if (newChampMagnetiqueVertical != null)
				msgs = ((InternalEObject)newChampMagnetiqueVertical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL, null, msgs);
			msgs = basicSetChampMagnetiqueVertical(newChampMagnetiqueVertical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL, newChampMagnetiqueVertical, newChampMagnetiqueVertical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrismaticCoefficient() {
		return prismaticCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrismaticCoefficient(double newPrismaticCoefficient) {
		double oldPrismaticCoefficient = prismaticCoefficient;
		prismaticCoefficient = newPrismaticCoefficient;
		boolean oldPrismaticCoefficientESet = prismaticCoefficientESet;
		prismaticCoefficientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__PRISMATIC_COEFFICIENT, oldPrismaticCoefficient, prismaticCoefficient, !oldPrismaticCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrismaticCoefficient() {
		double oldPrismaticCoefficient = prismaticCoefficient;
		boolean oldPrismaticCoefficientESet = prismaticCoefficientESet;
		prismaticCoefficient = PRISMATIC_COEFFICIENT_EDEFAULT;
		prismaticCoefficientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_BATIMENT__PRISMATIC_COEFFICIENT, oldPrismaticCoefficient, PRISMATIC_COEFFICIENT_EDEFAULT, oldPrismaticCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrismaticCoefficient() {
		return prismaticCoefficientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplements() {
		return complements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplements(String newComplements) {
		String oldComplements = complements;
		complements = newComplements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_BATIMENT__COMPLEMENTS, oldComplements, complements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU:
				return basicSetTirantEau(null, msgs);
			case SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE:
				return basicSetJaugeBrute(null, msgs);
			case SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON:
				return basicSetHauteurAuDessusLigneFlottaison(null, msgs);
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL:
				return basicSetChampMagnetiqueVertical(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU:
				return getTirantEau();
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHARGE_EN_LOURD:
				return new Long(getChargeEnLourd());
			case SchemaPackage.TYPE_TYPE_BATIMENT__VITESSE_MAXIMALE:
				return new Double(getVitesseMaximale());
			case SchemaPackage.TYPE_TYPE_BATIMENT__NOMBRE_HELICES:
				return new Long(getNombreHelices());
			case SchemaPackage.TYPE_TYPE_BATIMENT__PROPULSION:
				return getPropulsion();
			case SchemaPackage.TYPE_TYPE_BATIMENT__DEPLACEMENT_OPERATIONNEL:
				return new Long(getDeplacementOperationnel());
			case SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE:
				return getJaugeBrute();
			case SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON:
				return getHauteurAuDessusLigneFlottaison();
			case SchemaPackage.TYPE_TYPE_BATIMENT__NIVEAU_ACOUSTIQUE:
				return new Long(getNiveauAcoustique());
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL:
				return getChampMagnetiqueVertical();
			case SchemaPackage.TYPE_TYPE_BATIMENT__PRISMATIC_COEFFICIENT:
				return new Double(getPrismaticCoefficient());
			case SchemaPackage.TYPE_TYPE_BATIMENT__COMPLEMENTS:
				return getComplements();
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
			case SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU:
				setTirantEau((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHARGE_EN_LOURD:
				setChargeEnLourd(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__VITESSE_MAXIMALE:
				setVitesseMaximale(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__NOMBRE_HELICES:
				setNombreHelices(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__PROPULSION:
				setPropulsion((TypeDictionaryDicoTypeBatimentPropulsion)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__DEPLACEMENT_OPERATIONNEL:
				setDeplacementOperationnel(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE:
				setJaugeBrute((TypeDataTypeVolume)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON:
				setHauteurAuDessusLigneFlottaison((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__NIVEAU_ACOUSTIQUE:
				setNiveauAcoustique(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL:
				setChampMagnetiqueVertical((TypeDataTypeChampMagnetique)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__PRISMATIC_COEFFICIENT:
				setPrismaticCoefficient(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__COMPLEMENTS:
				setComplements((String)newValue);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU:
				setTirantEau((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHARGE_EN_LOURD:
				unsetChargeEnLourd();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__VITESSE_MAXIMALE:
				unsetVitesseMaximale();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__NOMBRE_HELICES:
				unsetNombreHelices();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__PROPULSION:
				unsetPropulsion();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__DEPLACEMENT_OPERATIONNEL:
				unsetDeplacementOperationnel();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE:
				setJaugeBrute((TypeDataTypeVolume)null);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON:
				setHauteurAuDessusLigneFlottaison((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__NIVEAU_ACOUSTIQUE:
				unsetNiveauAcoustique();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL:
				setChampMagnetiqueVertical((TypeDataTypeChampMagnetique)null);
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__PRISMATIC_COEFFICIENT:
				unsetPrismaticCoefficient();
				return;
			case SchemaPackage.TYPE_TYPE_BATIMENT__COMPLEMENTS:
				setComplements(COMPLEMENTS_EDEFAULT);
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
			case SchemaPackage.TYPE_TYPE_BATIMENT__TIRANT_EAU:
				return tirantEau != null;
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHARGE_EN_LOURD:
				return isSetChargeEnLourd();
			case SchemaPackage.TYPE_TYPE_BATIMENT__VITESSE_MAXIMALE:
				return isSetVitesseMaximale();
			case SchemaPackage.TYPE_TYPE_BATIMENT__NOMBRE_HELICES:
				return isSetNombreHelices();
			case SchemaPackage.TYPE_TYPE_BATIMENT__PROPULSION:
				return isSetPropulsion();
			case SchemaPackage.TYPE_TYPE_BATIMENT__DEPLACEMENT_OPERATIONNEL:
				return isSetDeplacementOperationnel();
			case SchemaPackage.TYPE_TYPE_BATIMENT__JAUGE_BRUTE:
				return jaugeBrute != null;
			case SchemaPackage.TYPE_TYPE_BATIMENT__HAUTEUR_AU_DESSUS_LIGNE_FLOTTAISON:
				return hauteurAuDessusLigneFlottaison != null;
			case SchemaPackage.TYPE_TYPE_BATIMENT__NIVEAU_ACOUSTIQUE:
				return isSetNiveauAcoustique();
			case SchemaPackage.TYPE_TYPE_BATIMENT__CHAMP_MAGNETIQUE_VERTICAL:
				return champMagnetiqueVertical != null;
			case SchemaPackage.TYPE_TYPE_BATIMENT__PRISMATIC_COEFFICIENT:
				return isSetPrismaticCoefficient();
			case SchemaPackage.TYPE_TYPE_BATIMENT__COMPLEMENTS:
				return COMPLEMENTS_EDEFAULT == null ? complements != null : !COMPLEMENTS_EDEFAULT.equals(complements);
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
		result.append(" (chargeEnLourd: ");
		if (chargeEnLourdESet) result.append(chargeEnLourd); else result.append("<unset>");
		result.append(", vitesseMaximale: ");
		if (vitesseMaximaleESet) result.append(vitesseMaximale); else result.append("<unset>");
		result.append(", nombreHelices: ");
		if (nombreHelicesESet) result.append(nombreHelices); else result.append("<unset>");
		result.append(", propulsion: ");
		if (propulsionESet) result.append(propulsion); else result.append("<unset>");
		result.append(", deplacementOperationnel: ");
		if (deplacementOperationnelESet) result.append(deplacementOperationnel); else result.append("<unset>");
		result.append(", niveauAcoustique: ");
		if (niveauAcoustiqueESet) result.append(niveauAcoustique); else result.append("<unset>");
		result.append(", prismaticCoefficient: ");
		if (prismaticCoefficientESet) result.append(prismaticCoefficient); else result.append("<unset>");
		result.append(", complements: ");
		result.append(complements);
		result.append(')');
		return result.toString();
	}

} //TypeTypeBatimentImpl
