/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeLongueur;
import mpia.meta.TypeDataTypeMasse;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiquesMouvement;
import mpia.schema.TypeDictionaryDicoTypeEquipementSeuilCarburant;
import mpia.schema.TypeGabaritPortee;
import mpia.schema.TypeTypeEquipement;
import mpia.schema.TypeTypeEquipementASS;

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
 * An implementation of the model object '<em><b>Type Type Equipement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getIndiceEfficienceRDF <em>Indice Efficience RDF</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getCapaciteCarburant <em>Capacite Carburant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getSeuilCarburant <em>Seuil Carburant</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getLongueur <em>Longueur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getLargeur <em>Largeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getHauteur <em>Hauteur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getPoidsEnCharge <em>Poids En Charge</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getPoidsAVide <em>Poids AVide</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getEstEquipementMajeurAssociationEquipementlMajeur <em>Est Equipement Majeur Association Equipementl Majeur</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getEstSujetAssociationConsommation <em>Est Sujet Association Consommation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getAPourGabaritPorteeGabaritPortee <em>APour Gabarit Portee Gabarit Portee</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getCaracteristiquesMouvementCaracteristiquesMouvement <em>Caracteristiques Mouvement Caracteristiques Mouvement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getAPourCaracteristiqueTransportCaracteristiqueTransport <em>APour Caracteristique Transport Caracteristique Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeEquipementImpl#getAPourCaracteristiqueASSTypeEquipementASS <em>APour Caracteristique ASS Type Equipement ASS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeTypeEquipementImpl extends TypeTypeMaterielImpl implements TypeTypeEquipement {
	/**
	 * The default value of the '{@link #getIndiceEfficienceRDF() <em>Indice Efficience RDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiceEfficienceRDF()
	 * @generated
	 * @ordered
	 */
	protected static final double INDICE_EFFICIENCE_RDF_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIndiceEfficienceRDF() <em>Indice Efficience RDF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndiceEfficienceRDF()
	 * @generated
	 * @ordered
	 */
	protected double indiceEfficienceRDF = INDICE_EFFICIENCE_RDF_EDEFAULT;

	/**
	 * This is true if the Indice Efficience RDF attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean indiceEfficienceRDFESet;

	/**
	 * The default value of the '{@link #getCapaciteCarburant() <em>Capacite Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteCarburant()
	 * @generated
	 * @ordered
	 */
	protected static final double CAPACITE_CARBURANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCapaciteCarburant() <em>Capacite Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapaciteCarburant()
	 * @generated
	 * @ordered
	 */
	protected double capaciteCarburant = CAPACITE_CARBURANT_EDEFAULT;

	/**
	 * This is true if the Capacite Carburant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean capaciteCarburantESet;

	/**
	 * The default value of the '{@link #getSeuilCarburant() <em>Seuil Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeuilCarburant()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeEquipementSeuilCarburant SEUIL_CARBURANT_EDEFAULT = TypeDictionaryDicoTypeEquipementSeuilCarburant._0;

	/**
	 * The cached value of the '{@link #getSeuilCarburant() <em>Seuil Carburant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeuilCarburant()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeEquipementSeuilCarburant seuilCarburant = SEUIL_CARBURANT_EDEFAULT;

	/**
	 * This is true if the Seuil Carburant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean seuilCarburantESet;

	/**
	 * The cached value of the '{@link #getLongueur() <em>Longueur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueur;

	/**
	 * The cached value of the '{@link #getLargeur() <em>Largeur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeur;

	/**
	 * The cached value of the '{@link #getHauteur() <em>Hauteur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteur()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteur;

	/**
	 * The cached value of the '{@link #getPoidsEnCharge() <em>Poids En Charge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoidsEnCharge()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse poidsEnCharge;

	/**
	 * The cached value of the '{@link #getPoidsAVide() <em>Poids AVide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoidsAVide()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeMasse poidsAVide;

	/**
	 * The cached value of the '{@link #getEstEquipementMajeurAssociationEquipementlMajeur() <em>Est Equipement Majeur Association Equipementl Majeur</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEquipementMajeurAssociationEquipementlMajeur()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estEquipementMajeurAssociationEquipementlMajeur;

	/**
	 * The cached value of the '{@link #getEstSujetAssociationConsommation() <em>Est Sujet Association Consommation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstSujetAssociationConsommation()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estSujetAssociationConsommation;

	/**
	 * The cached value of the '{@link #getAPourGabaritPorteeGabaritPortee() <em>APour Gabarit Portee Gabarit Portee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourGabaritPorteeGabaritPortee()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeGabaritPortee> aPourGabaritPorteeGabaritPortee;

	/**
	 * The cached value of the '{@link #getCaracteristiquesMouvementCaracteristiquesMouvement() <em>Caracteristiques Mouvement Caracteristiques Mouvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaracteristiquesMouvementCaracteristiquesMouvement()
	 * @generated
	 * @ordered
	 */
	protected TypeCaracteristiquesMouvement caracteristiquesMouvementCaracteristiquesMouvement;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueTransportCaracteristiqueTransport() <em>APour Caracteristique Transport Caracteristique Transport</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueTransportCaracteristiqueTransport()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourCaracteristiqueTransportCaracteristiqueTransport;

	/**
	 * The cached value of the '{@link #getAPourCaracteristiqueASSTypeEquipementASS() <em>APour Caracteristique ASS Type Equipement ASS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCaracteristiqueASSTypeEquipementASS()
	 * @generated
	 * @ordered
	 */
	protected TypeTypeEquipementASS aPourCaracteristiqueASSTypeEquipementASS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeEquipementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeEquipement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIndiceEfficienceRDF() {
		return indiceEfficienceRDF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndiceEfficienceRDF(double newIndiceEfficienceRDF) {
		double oldIndiceEfficienceRDF = indiceEfficienceRDF;
		indiceEfficienceRDF = newIndiceEfficienceRDF;
		boolean oldIndiceEfficienceRDFESet = indiceEfficienceRDFESet;
		indiceEfficienceRDFESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__INDICE_EFFICIENCE_RDF, oldIndiceEfficienceRDF, indiceEfficienceRDF, !oldIndiceEfficienceRDFESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIndiceEfficienceRDF() {
		double oldIndiceEfficienceRDF = indiceEfficienceRDF;
		boolean oldIndiceEfficienceRDFESet = indiceEfficienceRDFESet;
		indiceEfficienceRDF = INDICE_EFFICIENCE_RDF_EDEFAULT;
		indiceEfficienceRDFESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__INDICE_EFFICIENCE_RDF, oldIndiceEfficienceRDF, INDICE_EFFICIENCE_RDF_EDEFAULT, oldIndiceEfficienceRDFESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIndiceEfficienceRDF() {
		return indiceEfficienceRDFESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCapaciteCarburant() {
		return capaciteCarburant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapaciteCarburant(double newCapaciteCarburant) {
		double oldCapaciteCarburant = capaciteCarburant;
		capaciteCarburant = newCapaciteCarburant;
		boolean oldCapaciteCarburantESet = capaciteCarburantESet;
		capaciteCarburantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__CAPACITE_CARBURANT, oldCapaciteCarburant, capaciteCarburant, !oldCapaciteCarburantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapaciteCarburant() {
		double oldCapaciteCarburant = capaciteCarburant;
		boolean oldCapaciteCarburantESet = capaciteCarburantESet;
		capaciteCarburant = CAPACITE_CARBURANT_EDEFAULT;
		capaciteCarburantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__CAPACITE_CARBURANT, oldCapaciteCarburant, CAPACITE_CARBURANT_EDEFAULT, oldCapaciteCarburantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapaciteCarburant() {
		return capaciteCarburantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeEquipementSeuilCarburant getSeuilCarburant() {
		return seuilCarburant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeuilCarburant(TypeDictionaryDicoTypeEquipementSeuilCarburant newSeuilCarburant) {
		TypeDictionaryDicoTypeEquipementSeuilCarburant oldSeuilCarburant = seuilCarburant;
		seuilCarburant = newSeuilCarburant == null ? SEUIL_CARBURANT_EDEFAULT : newSeuilCarburant;
		boolean oldSeuilCarburantESet = seuilCarburantESet;
		seuilCarburantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__SEUIL_CARBURANT, oldSeuilCarburant, seuilCarburant, !oldSeuilCarburantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSeuilCarburant() {
		TypeDictionaryDicoTypeEquipementSeuilCarburant oldSeuilCarburant = seuilCarburant;
		boolean oldSeuilCarburantESet = seuilCarburantESet;
		seuilCarburant = SEUIL_CARBURANT_EDEFAULT;
		seuilCarburantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__SEUIL_CARBURANT, oldSeuilCarburant, SEUIL_CARBURANT_EDEFAULT, oldSeuilCarburantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSeuilCarburant() {
		return seuilCarburantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueur() {
		return longueur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueur(TypeDataTypeLongueur newLongueur, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueur = longueur;
		longueur = newLongueur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR, oldLongueur, newLongueur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueur(TypeDataTypeLongueur newLongueur) {
		if (newLongueur != longueur) {
			NotificationChain msgs = null;
			if (longueur != null)
				msgs = ((InternalEObject)longueur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR, null, msgs);
			if (newLongueur != null)
				msgs = ((InternalEObject)newLongueur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR, null, msgs);
			msgs = basicSetLongueur(newLongueur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR, newLongueur, newLongueur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeur() {
		return largeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeur(TypeDataTypeLongueur newLargeur, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeur = largeur;
		largeur = newLargeur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR, oldLargeur, newLargeur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeur(TypeDataTypeLongueur newLargeur) {
		if (newLargeur != largeur) {
			NotificationChain msgs = null;
			if (largeur != null)
				msgs = ((InternalEObject)largeur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR, null, msgs);
			if (newLargeur != null)
				msgs = ((InternalEObject)newLargeur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR, null, msgs);
			msgs = basicSetLargeur(newLargeur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR, newLargeur, newLargeur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteur() {
		return hauteur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteur(TypeDataTypeLongueur newHauteur, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteur = hauteur;
		hauteur = newHauteur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR, oldHauteur, newHauteur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteur(TypeDataTypeLongueur newHauteur) {
		if (newHauteur != hauteur) {
			NotificationChain msgs = null;
			if (hauteur != null)
				msgs = ((InternalEObject)hauteur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR, null, msgs);
			if (newHauteur != null)
				msgs = ((InternalEObject)newHauteur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR, null, msgs);
			msgs = basicSetHauteur(newHauteur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR, newHauteur, newHauteur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPoidsEnCharge() {
		return poidsEnCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoidsEnCharge(TypeDataTypeMasse newPoidsEnCharge, NotificationChain msgs) {
		TypeDataTypeMasse oldPoidsEnCharge = poidsEnCharge;
		poidsEnCharge = newPoidsEnCharge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE, oldPoidsEnCharge, newPoidsEnCharge);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoidsEnCharge(TypeDataTypeMasse newPoidsEnCharge) {
		if (newPoidsEnCharge != poidsEnCharge) {
			NotificationChain msgs = null;
			if (poidsEnCharge != null)
				msgs = ((InternalEObject)poidsEnCharge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE, null, msgs);
			if (newPoidsEnCharge != null)
				msgs = ((InternalEObject)newPoidsEnCharge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE, null, msgs);
			msgs = basicSetPoidsEnCharge(newPoidsEnCharge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE, newPoidsEnCharge, newPoidsEnCharge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeMasse getPoidsAVide() {
		return poidsAVide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoidsAVide(TypeDataTypeMasse newPoidsAVide, NotificationChain msgs) {
		TypeDataTypeMasse oldPoidsAVide = poidsAVide;
		poidsAVide = newPoidsAVide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE, oldPoidsAVide, newPoidsAVide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoidsAVide(TypeDataTypeMasse newPoidsAVide) {
		if (newPoidsAVide != poidsAVide) {
			NotificationChain msgs = null;
			if (poidsAVide != null)
				msgs = ((InternalEObject)poidsAVide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE, null, msgs);
			if (newPoidsAVide != null)
				msgs = ((InternalEObject)newPoidsAVide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE, null, msgs);
			msgs = basicSetPoidsAVide(newPoidsAVide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE, newPoidsAVide, newPoidsAVide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstEquipementMajeurAssociationEquipementlMajeur() {
		if (estEquipementMajeurAssociationEquipementlMajeur == null) {
			estEquipementMajeurAssociationEquipementlMajeur = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR);
		}
		return estEquipementMajeurAssociationEquipementlMajeur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstSujetAssociationConsommation() {
		if (estSujetAssociationConsommation == null) {
			estSujetAssociationConsommation = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_SUJET_ASSOCIATION_CONSOMMATION);
		}
		return estSujetAssociationConsommation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeGabaritPortee> getAPourGabaritPorteeGabaritPortee() {
		if (aPourGabaritPorteeGabaritPortee == null) {
			aPourGabaritPorteeGabaritPortee = new EObjectContainmentEList<TypeGabaritPortee>(TypeGabaritPortee.class, this, SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_GABARIT_PORTEE_GABARIT_PORTEE);
		}
		return aPourGabaritPorteeGabaritPortee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCaracteristiquesMouvement getCaracteristiquesMouvementCaracteristiquesMouvement() {
		return caracteristiquesMouvementCaracteristiquesMouvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaracteristiquesMouvementCaracteristiquesMouvement(TypeCaracteristiquesMouvement newCaracteristiquesMouvementCaracteristiquesMouvement, NotificationChain msgs) {
		TypeCaracteristiquesMouvement oldCaracteristiquesMouvementCaracteristiquesMouvement = caracteristiquesMouvementCaracteristiquesMouvement;
		caracteristiquesMouvementCaracteristiquesMouvement = newCaracteristiquesMouvementCaracteristiquesMouvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT, oldCaracteristiquesMouvementCaracteristiquesMouvement, newCaracteristiquesMouvementCaracteristiquesMouvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaracteristiquesMouvementCaracteristiquesMouvement(TypeCaracteristiquesMouvement newCaracteristiquesMouvementCaracteristiquesMouvement) {
		if (newCaracteristiquesMouvementCaracteristiquesMouvement != caracteristiquesMouvementCaracteristiquesMouvement) {
			NotificationChain msgs = null;
			if (caracteristiquesMouvementCaracteristiquesMouvement != null)
				msgs = ((InternalEObject)caracteristiquesMouvementCaracteristiquesMouvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT, null, msgs);
			if (newCaracteristiquesMouvementCaracteristiquesMouvement != null)
				msgs = ((InternalEObject)newCaracteristiquesMouvementCaracteristiquesMouvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT, null, msgs);
			msgs = basicSetCaracteristiquesMouvementCaracteristiquesMouvement(newCaracteristiquesMouvementCaracteristiquesMouvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT, newCaracteristiquesMouvementCaracteristiquesMouvement, newCaracteristiquesMouvementCaracteristiquesMouvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourCaracteristiqueTransportCaracteristiqueTransport() {
		if (aPourCaracteristiqueTransportCaracteristiqueTransport == null) {
			aPourCaracteristiqueTransportCaracteristiqueTransport = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_TRANSPORT_CARACTERISTIQUE_TRANSPORT);
		}
		return aPourCaracteristiqueTransportCaracteristiqueTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeTypeEquipementASS getAPourCaracteristiqueASSTypeEquipementASS() {
		return aPourCaracteristiqueASSTypeEquipementASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCaracteristiqueASSTypeEquipementASS(TypeTypeEquipementASS newAPourCaracteristiqueASSTypeEquipementASS, NotificationChain msgs) {
		TypeTypeEquipementASS oldAPourCaracteristiqueASSTypeEquipementASS = aPourCaracteristiqueASSTypeEquipementASS;
		aPourCaracteristiqueASSTypeEquipementASS = newAPourCaracteristiqueASSTypeEquipementASS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS, oldAPourCaracteristiqueASSTypeEquipementASS, newAPourCaracteristiqueASSTypeEquipementASS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCaracteristiqueASSTypeEquipementASS(TypeTypeEquipementASS newAPourCaracteristiqueASSTypeEquipementASS) {
		if (newAPourCaracteristiqueASSTypeEquipementASS != aPourCaracteristiqueASSTypeEquipementASS) {
			NotificationChain msgs = null;
			if (aPourCaracteristiqueASSTypeEquipementASS != null)
				msgs = ((InternalEObject)aPourCaracteristiqueASSTypeEquipementASS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS, null, msgs);
			if (newAPourCaracteristiqueASSTypeEquipementASS != null)
				msgs = ((InternalEObject)newAPourCaracteristiqueASSTypeEquipementASS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS, null, msgs);
			msgs = basicSetAPourCaracteristiqueASSTypeEquipementASS(newAPourCaracteristiqueASSTypeEquipementASS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS, newAPourCaracteristiqueASSTypeEquipementASS, newAPourCaracteristiqueASSTypeEquipementASS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR:
				return basicSetLongueur(null, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR:
				return basicSetLargeur(null, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR:
				return basicSetHauteur(null, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE:
				return basicSetPoidsEnCharge(null, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE:
				return basicSetPoidsAVide(null, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return ((InternalEList<?>)getEstEquipementMajeurAssociationEquipementlMajeur()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_SUJET_ASSOCIATION_CONSOMMATION:
				return ((InternalEList<?>)getEstSujetAssociationConsommation()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_GABARIT_PORTEE_GABARIT_PORTEE:
				return ((InternalEList<?>)getAPourGabaritPorteeGabaritPortee()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT:
				return basicSetCaracteristiquesMouvementCaracteristiquesMouvement(null, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_TRANSPORT_CARACTERISTIQUE_TRANSPORT:
				return ((InternalEList<?>)getAPourCaracteristiqueTransportCaracteristiqueTransport()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS:
				return basicSetAPourCaracteristiqueASSTypeEquipementASS(null, msgs);
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
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__INDICE_EFFICIENCE_RDF:
				return new Double(getIndiceEfficienceRDF());
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CAPACITE_CARBURANT:
				return new Double(getCapaciteCarburant());
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__SEUIL_CARBURANT:
				return getSeuilCarburant();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR:
				return getLongueur();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR:
				return getLargeur();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR:
				return getHauteur();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE:
				return getPoidsEnCharge();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE:
				return getPoidsAVide();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return getEstEquipementMajeurAssociationEquipementlMajeur();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_SUJET_ASSOCIATION_CONSOMMATION:
				return getEstSujetAssociationConsommation();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_GABARIT_PORTEE_GABARIT_PORTEE:
				return getAPourGabaritPorteeGabaritPortee();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT:
				return getCaracteristiquesMouvementCaracteristiquesMouvement();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_TRANSPORT_CARACTERISTIQUE_TRANSPORT:
				return getAPourCaracteristiqueTransportCaracteristiqueTransport();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS:
				return getAPourCaracteristiqueASSTypeEquipementASS();
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
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__INDICE_EFFICIENCE_RDF:
				setIndiceEfficienceRDF(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CAPACITE_CARBURANT:
				setCapaciteCarburant(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__SEUIL_CARBURANT:
				setSeuilCarburant((TypeDictionaryDicoTypeEquipementSeuilCarburant)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR:
				setLongueur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR:
				setLargeur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR:
				setHauteur((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE:
				setPoidsEnCharge((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE:
				setPoidsAVide((TypeDataTypeMasse)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				getEstEquipementMajeurAssociationEquipementlMajeur().clear();
				getEstEquipementMajeurAssociationEquipementlMajeur().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_SUJET_ASSOCIATION_CONSOMMATION:
				getEstSujetAssociationConsommation().clear();
				getEstSujetAssociationConsommation().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_GABARIT_PORTEE_GABARIT_PORTEE:
				getAPourGabaritPorteeGabaritPortee().clear();
				getAPourGabaritPorteeGabaritPortee().addAll((Collection<? extends TypeGabaritPortee>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT:
				setCaracteristiquesMouvementCaracteristiquesMouvement((TypeCaracteristiquesMouvement)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_TRANSPORT_CARACTERISTIQUE_TRANSPORT:
				getAPourCaracteristiqueTransportCaracteristiqueTransport().clear();
				getAPourCaracteristiqueTransportCaracteristiqueTransport().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS:
				setAPourCaracteristiqueASSTypeEquipementASS((TypeTypeEquipementASS)newValue);
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
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__INDICE_EFFICIENCE_RDF:
				unsetIndiceEfficienceRDF();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CAPACITE_CARBURANT:
				unsetCapaciteCarburant();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__SEUIL_CARBURANT:
				unsetSeuilCarburant();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR:
				setLongueur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR:
				setLargeur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR:
				setHauteur((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE:
				setPoidsEnCharge((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE:
				setPoidsAVide((TypeDataTypeMasse)null);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				getEstEquipementMajeurAssociationEquipementlMajeur().clear();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_SUJET_ASSOCIATION_CONSOMMATION:
				getEstSujetAssociationConsommation().clear();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_GABARIT_PORTEE_GABARIT_PORTEE:
				getAPourGabaritPorteeGabaritPortee().clear();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT:
				setCaracteristiquesMouvementCaracteristiquesMouvement((TypeCaracteristiquesMouvement)null);
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_TRANSPORT_CARACTERISTIQUE_TRANSPORT:
				getAPourCaracteristiqueTransportCaracteristiqueTransport().clear();
				return;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS:
				setAPourCaracteristiqueASSTypeEquipementASS((TypeTypeEquipementASS)null);
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
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__INDICE_EFFICIENCE_RDF:
				return isSetIndiceEfficienceRDF();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CAPACITE_CARBURANT:
				return isSetCapaciteCarburant();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__SEUIL_CARBURANT:
				return isSetSeuilCarburant();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LONGUEUR:
				return longueur != null;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__LARGEUR:
				return largeur != null;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__HAUTEUR:
				return hauteur != null;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_EN_CHARGE:
				return poidsEnCharge != null;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__POIDS_AVIDE:
				return poidsAVide != null;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_EQUIPEMENT_MAJEUR_ASSOCIATION_EQUIPEMENTL_MAJEUR:
				return estEquipementMajeurAssociationEquipementlMajeur != null && !estEquipementMajeurAssociationEquipementlMajeur.isEmpty();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__EST_SUJET_ASSOCIATION_CONSOMMATION:
				return estSujetAssociationConsommation != null && !estSujetAssociationConsommation.isEmpty();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_GABARIT_PORTEE_GABARIT_PORTEE:
				return aPourGabaritPorteeGabaritPortee != null && !aPourGabaritPorteeGabaritPortee.isEmpty();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__CARACTERISTIQUES_MOUVEMENT_CARACTERISTIQUES_MOUVEMENT:
				return caracteristiquesMouvementCaracteristiquesMouvement != null;
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_TRANSPORT_CARACTERISTIQUE_TRANSPORT:
				return aPourCaracteristiqueTransportCaracteristiqueTransport != null && !aPourCaracteristiqueTransportCaracteristiqueTransport.isEmpty();
			case SchemaPackage.TYPE_TYPE_EQUIPEMENT__APOUR_CARACTERISTIQUE_ASS_TYPE_EQUIPEMENT_ASS:
				return aPourCaracteristiqueASSTypeEquipementASS != null;
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
		result.append(" (indiceEfficienceRDF: ");
		if (indiceEfficienceRDFESet) result.append(indiceEfficienceRDF); else result.append("<unset>");
		result.append(", capaciteCarburant: ");
		if (capaciteCarburantESet) result.append(capaciteCarburant); else result.append("<unset>");
		result.append(", seuilCarburant: ");
		if (seuilCarburantESet) result.append(seuilCarburant); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeTypeEquipementImpl
