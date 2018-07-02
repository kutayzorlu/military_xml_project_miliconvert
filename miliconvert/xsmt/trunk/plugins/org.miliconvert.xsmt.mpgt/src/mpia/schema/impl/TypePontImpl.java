/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPontUtilisation;
import mpia.schema.TypePont;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Pont</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypePontImpl#getClasseMilitaire <em>Classe Militaire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePontImpl#getHauteurMinimum <em>Hauteur Minimum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePontImpl#getLargeurMinimum <em>Largeur Minimum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePontImpl#getUtilisation <em>Utilisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePontImpl#getLongueurTraveePlusLongue <em>Longueur Travee Plus Longue</em>}</li>
 *   <li>{@link mpia.schema.impl.TypePontImpl#getNombreTravees <em>Nombre Travees</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypePontImpl extends TypeSiteImpl implements TypePont {
	/**
	 * The default value of the '{@link #getClasseMilitaire() <em>Classe Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMilitaire()
	 * @generated
	 * @ordered
	 */
	protected static final long CLASSE_MILITAIRE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getClasseMilitaire() <em>Classe Militaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasseMilitaire()
	 * @generated
	 * @ordered
	 */
	protected long classeMilitaire = CLASSE_MILITAIRE_EDEFAULT;

	/**
	 * This is true if the Classe Militaire attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classeMilitaireESet;

	/**
	 * The cached value of the '{@link #getHauteurMinimum() <em>Hauteur Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauteurMinimum()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur hauteurMinimum;

	/**
	 * The cached value of the '{@link #getLargeurMinimum() <em>Largeur Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLargeurMinimum()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur largeurMinimum;

	/**
	 * The default value of the '{@link #getUtilisation() <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPontUtilisation UTILISATION_EDEFAULT = TypeDictionaryDicoPontUtilisation.FOOT;

	/**
	 * The cached value of the '{@link #getUtilisation() <em>Utilisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPontUtilisation utilisation = UTILISATION_EDEFAULT;

	/**
	 * This is true if the Utilisation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean utilisationESet;

	/**
	 * The cached value of the '{@link #getLongueurTraveePlusLongue() <em>Longueur Travee Plus Longue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongueurTraveePlusLongue()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur longueurTraveePlusLongue;

	/**
	 * The default value of the '{@link #getNombreTravees() <em>Nombre Travees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTravees()
	 * @generated
	 * @ordered
	 */
	protected static final long NOMBRE_TRAVEES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getNombreTravees() <em>Nombre Travees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombreTravees()
	 * @generated
	 * @ordered
	 */
	protected long nombreTravees = NOMBRE_TRAVEES_EDEFAULT;

	/**
	 * This is true if the Nombre Travees attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nombreTraveesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypePontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypePont();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getClasseMilitaire() {
		return classeMilitaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClasseMilitaire(long newClasseMilitaire) {
		long oldClasseMilitaire = classeMilitaire;
		classeMilitaire = newClasseMilitaire;
		boolean oldClasseMilitaireESet = classeMilitaireESet;
		classeMilitaireESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__CLASSE_MILITAIRE, oldClasseMilitaire, classeMilitaire, !oldClasseMilitaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClasseMilitaire() {
		long oldClasseMilitaire = classeMilitaire;
		boolean oldClasseMilitaireESet = classeMilitaireESet;
		classeMilitaire = CLASSE_MILITAIRE_EDEFAULT;
		classeMilitaireESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PONT__CLASSE_MILITAIRE, oldClasseMilitaire, CLASSE_MILITAIRE_EDEFAULT, oldClasseMilitaireESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClasseMilitaire() {
		return classeMilitaireESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getHauteurMinimum() {
		return hauteurMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauteurMinimum(TypeDataTypeLongueur newHauteurMinimum, NotificationChain msgs) {
		TypeDataTypeLongueur oldHauteurMinimum = hauteurMinimum;
		hauteurMinimum = newHauteurMinimum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM, oldHauteurMinimum, newHauteurMinimum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHauteurMinimum(TypeDataTypeLongueur newHauteurMinimum) {
		if (newHauteurMinimum != hauteurMinimum) {
			NotificationChain msgs = null;
			if (hauteurMinimum != null)
				msgs = ((InternalEObject)hauteurMinimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM, null, msgs);
			if (newHauteurMinimum != null)
				msgs = ((InternalEObject)newHauteurMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM, null, msgs);
			msgs = basicSetHauteurMinimum(newHauteurMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM, newHauteurMinimum, newHauteurMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLargeurMinimum() {
		return largeurMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLargeurMinimum(TypeDataTypeLongueur newLargeurMinimum, NotificationChain msgs) {
		TypeDataTypeLongueur oldLargeurMinimum = largeurMinimum;
		largeurMinimum = newLargeurMinimum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM, oldLargeurMinimum, newLargeurMinimum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLargeurMinimum(TypeDataTypeLongueur newLargeurMinimum) {
		if (newLargeurMinimum != largeurMinimum) {
			NotificationChain msgs = null;
			if (largeurMinimum != null)
				msgs = ((InternalEObject)largeurMinimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM, null, msgs);
			if (newLargeurMinimum != null)
				msgs = ((InternalEObject)newLargeurMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM, null, msgs);
			msgs = basicSetLargeurMinimum(newLargeurMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM, newLargeurMinimum, newLargeurMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPontUtilisation getUtilisation() {
		return utilisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilisation(TypeDictionaryDicoPontUtilisation newUtilisation) {
		TypeDictionaryDicoPontUtilisation oldUtilisation = utilisation;
		utilisation = newUtilisation == null ? UTILISATION_EDEFAULT : newUtilisation;
		boolean oldUtilisationESet = utilisationESet;
		utilisationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__UTILISATION, oldUtilisation, utilisation, !oldUtilisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUtilisation() {
		TypeDictionaryDicoPontUtilisation oldUtilisation = utilisation;
		boolean oldUtilisationESet = utilisationESet;
		utilisation = UTILISATION_EDEFAULT;
		utilisationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PONT__UTILISATION, oldUtilisation, UTILISATION_EDEFAULT, oldUtilisationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUtilisation() {
		return utilisationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getLongueurTraveePlusLongue() {
		return longueurTraveePlusLongue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongueurTraveePlusLongue(TypeDataTypeLongueur newLongueurTraveePlusLongue, NotificationChain msgs) {
		TypeDataTypeLongueur oldLongueurTraveePlusLongue = longueurTraveePlusLongue;
		longueurTraveePlusLongue = newLongueurTraveePlusLongue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE, oldLongueurTraveePlusLongue, newLongueurTraveePlusLongue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongueurTraveePlusLongue(TypeDataTypeLongueur newLongueurTraveePlusLongue) {
		if (newLongueurTraveePlusLongue != longueurTraveePlusLongue) {
			NotificationChain msgs = null;
			if (longueurTraveePlusLongue != null)
				msgs = ((InternalEObject)longueurTraveePlusLongue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE, null, msgs);
			if (newLongueurTraveePlusLongue != null)
				msgs = ((InternalEObject)newLongueurTraveePlusLongue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE, null, msgs);
			msgs = basicSetLongueurTraveePlusLongue(newLongueurTraveePlusLongue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE, newLongueurTraveePlusLongue, newLongueurTraveePlusLongue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getNombreTravees() {
		return nombreTravees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombreTravees(long newNombreTravees) {
		long oldNombreTravees = nombreTravees;
		nombreTravees = newNombreTravees;
		boolean oldNombreTraveesESet = nombreTraveesESet;
		nombreTraveesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_PONT__NOMBRE_TRAVEES, oldNombreTravees, nombreTravees, !oldNombreTraveesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNombreTravees() {
		long oldNombreTravees = nombreTravees;
		boolean oldNombreTraveesESet = nombreTraveesESet;
		nombreTravees = NOMBRE_TRAVEES_EDEFAULT;
		nombreTraveesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_PONT__NOMBRE_TRAVEES, oldNombreTravees, NOMBRE_TRAVEES_EDEFAULT, oldNombreTraveesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNombreTravees() {
		return nombreTraveesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM:
				return basicSetHauteurMinimum(null, msgs);
			case SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM:
				return basicSetLargeurMinimum(null, msgs);
			case SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE:
				return basicSetLongueurTraveePlusLongue(null, msgs);
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
			case SchemaPackage.TYPE_PONT__CLASSE_MILITAIRE:
				return new Long(getClasseMilitaire());
			case SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM:
				return getHauteurMinimum();
			case SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM:
				return getLargeurMinimum();
			case SchemaPackage.TYPE_PONT__UTILISATION:
				return getUtilisation();
			case SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE:
				return getLongueurTraveePlusLongue();
			case SchemaPackage.TYPE_PONT__NOMBRE_TRAVEES:
				return new Long(getNombreTravees());
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
			case SchemaPackage.TYPE_PONT__CLASSE_MILITAIRE:
				setClasseMilitaire(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM:
				setHauteurMinimum((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM:
				setLargeurMinimum((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PONT__UTILISATION:
				setUtilisation((TypeDictionaryDicoPontUtilisation)newValue);
				return;
			case SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE:
				setLongueurTraveePlusLongue((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_PONT__NOMBRE_TRAVEES:
				setNombreTravees(((Long)newValue).longValue());
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
			case SchemaPackage.TYPE_PONT__CLASSE_MILITAIRE:
				unsetClasseMilitaire();
				return;
			case SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM:
				setHauteurMinimum((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM:
				setLargeurMinimum((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PONT__UTILISATION:
				unsetUtilisation();
				return;
			case SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE:
				setLongueurTraveePlusLongue((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_PONT__NOMBRE_TRAVEES:
				unsetNombreTravees();
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
			case SchemaPackage.TYPE_PONT__CLASSE_MILITAIRE:
				return isSetClasseMilitaire();
			case SchemaPackage.TYPE_PONT__HAUTEUR_MINIMUM:
				return hauteurMinimum != null;
			case SchemaPackage.TYPE_PONT__LARGEUR_MINIMUM:
				return largeurMinimum != null;
			case SchemaPackage.TYPE_PONT__UTILISATION:
				return isSetUtilisation();
			case SchemaPackage.TYPE_PONT__LONGUEUR_TRAVEE_PLUS_LONGUE:
				return longueurTraveePlusLongue != null;
			case SchemaPackage.TYPE_PONT__NOMBRE_TRAVEES:
				return isSetNombreTravees();
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
		result.append(" (classeMilitaire: ");
		if (classeMilitaireESet) result.append(classeMilitaire); else result.append("<unset>");
		result.append(", utilisation: ");
		if (utilisationESet) result.append(utilisation); else result.append("<unset>");
		result.append(", nombreTravees: ");
		if (nombreTraveesESet) result.append(nombreTravees); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypePontImpl
