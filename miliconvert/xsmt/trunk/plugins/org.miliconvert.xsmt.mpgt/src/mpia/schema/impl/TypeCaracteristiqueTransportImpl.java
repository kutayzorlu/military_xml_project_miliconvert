/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiqueTransport;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Caracteristique Transport</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#getClassePoidsMilitaire <em>Classe Poids Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#getCategorieMobilite <em>Categorie Mobilite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#isTransportableParRoute <em>Transportable Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#getLargeurTransport <em>Largeur Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#isTransportableParRail <em>Transportable Par Rail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#getHauteurTransport <em>Hauteur Transport</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#isTransportableParMer <em>Transportable Par Mer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#isTransportableParAir <em>Transportable Par Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#isTransportableParVoieFluviale <em>Transportable Par Voie Fluviale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueTransportImpl#getLongueurTransport <em>Longueur Transport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiqueTransportImpl extends TypeRacineOperationnelleImpl implements TypeCaracteristiqueTransport {
	/**
	 * The default value of the '{@link #getClassePoidsMilitaire() <em>Classe Poids Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassePoidsMilitaire()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSE_POIDS_MILITAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassePoidsMilitaire() <em>Classe Poids Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassePoidsMilitaire()
	 * @generated
	 * @ordered
	 */
	protected String classePoidsMilitaire = CLASSE_POIDS_MILITAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategorieMobilite() <em>Categorie Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieMobilite()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORIE_MOBILITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategorieMobilite() <em>Categorie Mobilite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorieMobilite()
	 * @generated
	 * @ordered
	 */
	protected String categorieMobilite = CATEGORIE_MOBILITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransportableParRoute() <em>Transportable Par Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParRoute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORTABLE_PAR_ROUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportableParRoute() <em>Transportable Par Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParRoute()
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParRoute = TRANSPORTABLE_PAR_ROUTE_EDEFAULT;

	/**
	 * This is true if the Transportable Par Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParRouteESet;

	/**
	 * The cached value of the '{@link #getLargeurTransport() <em>Largeur Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurTransport()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurTransport;

	/**
	 * The default value of the '{@link #isTransportableParRail() <em>Transportable Par Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParRail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORTABLE_PAR_RAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportableParRail() <em>Transportable Par Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParRail()
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParRail = TRANSPORTABLE_PAR_RAIL_EDEFAULT;

	/**
	 * This is true if the Transportable Par Rail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParRailESet;

	/**
	 * The cached value of the '{@link #getHauteurTransport() <em>Hauteur Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurTransport()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurTransport;

	/**
	 * The default value of the '{@link #isTransportableParMer() <em>Transportable Par Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParMer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORTABLE_PAR_MER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportableParMer() <em>Transportable Par Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParMer()
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParMer = TRANSPORTABLE_PAR_MER_EDEFAULT;

	/**
	 * This is true if the Transportable Par Mer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParMerESet;

	/**
	 * The default value of the '{@link #isTransportableParAir() <em>Transportable Par Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParAir()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORTABLE_PAR_AIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportableParAir() <em>Transportable Par Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParAir()
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParAir = TRANSPORTABLE_PAR_AIR_EDEFAULT;

	/**
	 * This is true if the Transportable Par Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParAirESet;

	/**
	 * The default value of the '{@link #isTransportableParVoieFluviale() <em>Transportable Par Voie Fluviale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParVoieFluviale()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORTABLE_PAR_VOIE_FLUVIALE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportableParVoieFluviale() <em>Transportable Par Voie Fluviale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportableParVoieFluviale()
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParVoieFluviale = TRANSPORTABLE_PAR_VOIE_FLUVIALE_EDEFAULT;

	/**
	 * This is true if the Transportable Par Voie Fluviale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportableParVoieFluvialeESet;

	/**
	 * The cached value of the '{@link #getLongueurTransport() <em>Longueur Transport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurTransport()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueurTransport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaracteristiqueTransportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiqueTransport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassePoidsMilitaire() {
		return classePoidsMilitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassePoidsMilitaire(String newClassePoidsMilitaire) {
		String oldClassePoidsMilitaire = classePoidsMilitaire;
		classePoidsMilitaire = newClassePoidsMilitaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CLASSE_POIDS_MILITAIRE, oldClassePoidsMilitaire, classePoidsMilitaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategorieMobilite() {
		return categorieMobilite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorieMobilite(String newCategorieMobilite) {
		String oldCategorieMobilite = categorieMobilite;
		categorieMobilite = newCategorieMobilite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CATEGORIE_MOBILITE, oldCategorieMobilite, categorieMobilite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportableParRoute() {
		return transportableParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportableParRoute(boolean newTransportableParRoute) {
		boolean oldTransportableParRoute = transportableParRoute;
		transportableParRoute = newTransportableParRoute;
		boolean oldTransportableParRouteESet = transportableParRouteESet;
		transportableParRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_ROUTE, oldTransportableParRoute, transportableParRoute, !oldTransportableParRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportableParRoute() {
		boolean oldTransportableParRoute = transportableParRoute;
		boolean oldTransportableParRouteESet = transportableParRouteESet;
		transportableParRoute = TRANSPORTABLE_PAR_ROUTE_EDEFAULT;
		transportableParRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_ROUTE, oldTransportableParRoute, TRANSPORTABLE_PAR_ROUTE_EDEFAULT, oldTransportableParRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportableParRoute() {
		return transportableParRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurTransport() {
		return largeurTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurTransport(TypeDataTypeLongueur newLargeurTransport, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurTransport = largeurTransport;
		largeurTransport = newLargeurTransport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT, oldLargeurTransport, newLargeurTransport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurTransport(TypeDataTypeLongueur newLargeurTransport) {
		if (newLargeurTransport != largeurTransport) {
			NotificationChain msgs = null;
			if (largeurTransport != null)
				msgs = ((InternalEObject)largeurTransport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT, null, msgs);
			if (newLargeurTransport != null)
				msgs = ((InternalEObject)newLargeurTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT, null, msgs);
			msgs = basicSetLargeurTransport(newLargeurTransport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT, newLargeurTransport, newLargeurTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportableParRail() {
		return transportableParRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportableParRail(boolean newTransportableParRail) {
		boolean oldTransportableParRail = transportableParRail;
		transportableParRail = newTransportableParRail;
		boolean oldTransportableParRailESet = transportableParRailESet;
		transportableParRailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_RAIL, oldTransportableParRail, transportableParRail, !oldTransportableParRailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportableParRail() {
		boolean oldTransportableParRail = transportableParRail;
		boolean oldTransportableParRailESet = transportableParRailESet;
		transportableParRail = TRANSPORTABLE_PAR_RAIL_EDEFAULT;
		transportableParRailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_RAIL, oldTransportableParRail, TRANSPORTABLE_PAR_RAIL_EDEFAULT, oldTransportableParRailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportableParRail() {
		return transportableParRailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurTransport() {
		return hauteurTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurTransport(TypeDataTypeLongueur newHauteurTransport, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurTransport = hauteurTransport;
		hauteurTransport = newHauteurTransport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT, oldHauteurTransport, newHauteurTransport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurTransport(TypeDataTypeLongueur newHauteurTransport) {
		if (newHauteurTransport != hauteurTransport) {
			NotificationChain msgs = null;
			if (hauteurTransport != null)
				msgs = ((InternalEObject)hauteurTransport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT, null, msgs);
			if (newHauteurTransport != null)
				msgs = ((InternalEObject)newHauteurTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT, null, msgs);
			msgs = basicSetHauteurTransport(newHauteurTransport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT, newHauteurTransport, newHauteurTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportableParMer() {
		return transportableParMer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportableParMer(boolean newTransportableParMer) {
		boolean oldTransportableParMer = transportableParMer;
		transportableParMer = newTransportableParMer;
		boolean oldTransportableParMerESet = transportableParMerESet;
		transportableParMerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_MER, oldTransportableParMer, transportableParMer, !oldTransportableParMerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportableParMer() {
		boolean oldTransportableParMer = transportableParMer;
		boolean oldTransportableParMerESet = transportableParMerESet;
		transportableParMer = TRANSPORTABLE_PAR_MER_EDEFAULT;
		transportableParMerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_MER, oldTransportableParMer, TRANSPORTABLE_PAR_MER_EDEFAULT, oldTransportableParMerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportableParMer() {
		return transportableParMerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportableParAir() {
		return transportableParAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportableParAir(boolean newTransportableParAir) {
		boolean oldTransportableParAir = transportableParAir;
		transportableParAir = newTransportableParAir;
		boolean oldTransportableParAirESet = transportableParAirESet;
		transportableParAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_AIR, oldTransportableParAir, transportableParAir, !oldTransportableParAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportableParAir() {
		boolean oldTransportableParAir = transportableParAir;
		boolean oldTransportableParAirESet = transportableParAirESet;
		transportableParAir = TRANSPORTABLE_PAR_AIR_EDEFAULT;
		transportableParAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_AIR, oldTransportableParAir, TRANSPORTABLE_PAR_AIR_EDEFAULT, oldTransportableParAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportableParAir() {
		return transportableParAirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportableParVoieFluviale() {
		return transportableParVoieFluviale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportableParVoieFluviale(boolean newTransportableParVoieFluviale) {
		boolean oldTransportableParVoieFluviale = transportableParVoieFluviale;
		transportableParVoieFluviale = newTransportableParVoieFluviale;
		boolean oldTransportableParVoieFluvialeESet = transportableParVoieFluvialeESet;
		transportableParVoieFluvialeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_VOIE_FLUVIALE, oldTransportableParVoieFluviale, transportableParVoieFluviale, !oldTransportableParVoieFluvialeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportableParVoieFluviale() {
		boolean oldTransportableParVoieFluviale = transportableParVoieFluviale;
		boolean oldTransportableParVoieFluvialeESet = transportableParVoieFluvialeESet;
		transportableParVoieFluviale = TRANSPORTABLE_PAR_VOIE_FLUVIALE_EDEFAULT;
		transportableParVoieFluvialeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_VOIE_FLUVIALE, oldTransportableParVoieFluviale, TRANSPORTABLE_PAR_VOIE_FLUVIALE_EDEFAULT, oldTransportableParVoieFluvialeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportableParVoieFluviale() {
		return transportableParVoieFluvialeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueurTransport() {
		return longueurTransport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueurTransport(TypeDataTypeLongueur newLongueurTransport, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueurTransport = longueurTransport;
		longueurTransport = newLongueurTransport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT, oldLongueurTransport, newLongueurTransport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurTransport(TypeDataTypeLongueur newLongueurTransport) {
		if (newLongueurTransport != longueurTransport) {
			NotificationChain msgs = null;
			if (longueurTransport != null)
				msgs = ((InternalEObject)longueurTransport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT, null, msgs);
			if (newLongueurTransport != null)
				msgs = ((InternalEObject)newLongueurTransport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT, null, msgs);
			msgs = basicSetLongueurTransport(newLongueurTransport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT, newLongueurTransport, newLongueurTransport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT:
				return basicSetLargeurTransport(null, msgs);
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT:
				return basicSetHauteurTransport(null, msgs);
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT:
				return basicSetLongueurTransport(null, msgs);
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CLASSE_POIDS_MILITAIRE:
				return getClassePoidsMilitaire();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CATEGORIE_MOBILITE:
				return getCategorieMobilite();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_ROUTE:
				return isTransportableParRoute() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT:
				return getLargeurTransport();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_RAIL:
				return isTransportableParRail() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT:
				return getHauteurTransport();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_MER:
				return isTransportableParMer() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_AIR:
				return isTransportableParAir() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_VOIE_FLUVIALE:
				return isTransportableParVoieFluviale() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT:
				return getLongueurTransport();
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CLASSE_POIDS_MILITAIRE:
				setClassePoidsMilitaire((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CATEGORIE_MOBILITE:
				setCategorieMobilite((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_ROUTE:
				setTransportableParRoute(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT:
				setLargeurTransport((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_RAIL:
				setTransportableParRail(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT:
				setHauteurTransport((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_MER:
				setTransportableParMer(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_AIR:
				setTransportableParAir(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_VOIE_FLUVIALE:
				setTransportableParVoieFluviale(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT:
				setLongueurTransport((TypeDataTypeLongueur)newValue);
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CLASSE_POIDS_MILITAIRE:
				setClassePoidsMilitaire(CLASSE_POIDS_MILITAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CATEGORIE_MOBILITE:
				setCategorieMobilite(CATEGORIE_MOBILITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_ROUTE:
				unsetTransportableParRoute();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT:
				setLargeurTransport((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_RAIL:
				unsetTransportableParRail();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT:
				setHauteurTransport((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_MER:
				unsetTransportableParMer();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_AIR:
				unsetTransportableParAir();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_VOIE_FLUVIALE:
				unsetTransportableParVoieFluviale();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT:
				setLongueurTransport((TypeDataTypeLongueur)null);
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CLASSE_POIDS_MILITAIRE:
				return CLASSE_POIDS_MILITAIRE_EDEFAULT == null ? classePoidsMilitaire != null : !CLASSE_POIDS_MILITAIRE_EDEFAULT.equals(classePoidsMilitaire);
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__CATEGORIE_MOBILITE:
				return CATEGORIE_MOBILITE_EDEFAULT == null ? categorieMobilite != null : !CATEGORIE_MOBILITE_EDEFAULT.equals(categorieMobilite);
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_ROUTE:
				return isSetTransportableParRoute();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LARGEUR_TRANSPORT:
				return largeurTransport != null;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_RAIL:
				return isSetTransportableParRail();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__HAUTEUR_TRANSPORT:
				return hauteurTransport != null;
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_MER:
				return isSetTransportableParMer();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_AIR:
				return isSetTransportableParAir();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__TRANSPORTABLE_PAR_VOIE_FLUVIALE:
				return isSetTransportableParVoieFluviale();
			case SchemaPackage.TYPE_CARACTERISTIQUE_TRANSPORT__LONGUEUR_TRANSPORT:
				return longueurTransport != null;
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
		result.append(" (classePoidsMilitaire: ");
		result.append(classePoidsMilitaire);
		result.append(", categorieMobilite: ");
		result.append(categorieMobilite);
		result.append(", transportableParRoute: ");
		if (transportableParRouteESet) result.append(transportableParRoute); else result.append("<unset>");
		result.append(", transportableParRail: ");
		if (transportableParRailESet) result.append(transportableParRail); else result.append("<unset>");
		result.append(", transportableParMer: ");
		if (transportableParMerESet) result.append(transportableParMer); else result.append("<unset>");
		result.append(", transportableParAir: ");
		if (transportableParAirESet) result.append(transportableParAir); else result.append("<unset>");
		result.append(", transportableParVoieFluviale: ");
		if (transportableParVoieFluvialeESet) result.append(transportableParVoieFluviale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiqueTransportImpl
